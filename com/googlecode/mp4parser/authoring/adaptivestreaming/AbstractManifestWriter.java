package com.googlecode.mp4parser.authoring.adaptivestreaming;

import com.coremedia.iso.boxes.OriginalFormatBox;
import com.coremedia.iso.boxes.TimeToSampleBox.Entry;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.FragmentIntersectionFinder;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

public abstract class AbstractManifestWriter implements ManifestWriter {
    private static final Logger LOG;
    protected long[] audioFragmentsDurations;
    private FragmentIntersectionFinder intersectionFinder;
    protected long[] videoFragmentsDurations;

    static {
        LOG = Logger.getLogger(AbstractManifestWriter.class.getName());
    }

    protected AbstractManifestWriter(FragmentIntersectionFinder intersectionFinder) {
        this.intersectionFinder = intersectionFinder;
    }

    public long[] calculateFragmentDurations(Track track, Movie movie) {
        long[] startSamples = this.intersectionFinder.sampleNumbers(track, movie);
        long[] durations = new long[startSamples.length];
        int currentFragment = 0;
        int currentSample = 1;
        for (Entry entry : track.getDecodingTimeEntries()) {
            int max = currentSample + CastUtils.l2i(entry.getCount());
            while (currentSample < max) {
                if (currentFragment != startSamples.length - 1 && ((long) currentSample) == startSamples[currentFragment + 1]) {
                    currentFragment++;
                }
                durations[currentFragment] = durations[currentFragment] + entry.getDelta();
                currentSample++;
            }
        }
        return durations;
    }

    public long getBitrate(Track track) {
        long bitrate = 0;
        for (Sample sample : track.getSamples()) {
            bitrate += sample.remaining();
        }
        return (long) (((double) (bitrate * 8)) / (((double) getDuration(track)) / ((double) track.getTrackMetaData().getTimescale())));
    }

    protected static long getDuration(Track track) {
        long duration = 0;
        for (Entry entry : track.getDecodingTimeEntries()) {
            duration += entry.getCount() * entry.getDelta();
        }
        return duration;
    }

    protected long[] checkFragmentsAlign(long[] referenceTimes, long[] checkTimes) throws IOException {
        if (!(referenceTimes == null || referenceTimes.length == 0)) {
            long[] referenceTimesMinusLast = new long[(referenceTimes.length - 1)];
            System.arraycopy(referenceTimes, 0, referenceTimesMinusLast, 0, referenceTimes.length - 1);
            long[] checkTimesMinusLast = new long[(checkTimes.length - 1)];
            System.arraycopy(checkTimes, 0, checkTimesMinusLast, 0, checkTimes.length - 1);
            if (!Arrays.equals(checkTimesMinusLast, referenceTimesMinusLast)) {
                String log = new StringBuilder(String.valueOf("" + referenceTimes.length)).append("Reference     :  [").toString();
                for (long l : referenceTimes) {
                    log = new StringBuilder(String.valueOf(log)).append(String.format("%10d,", new Object[]{Long.valueOf(l)})).toString();
                }
                LOG.warning(new StringBuilder(String.valueOf(log)).append("]").toString());
                log = new StringBuilder(String.valueOf("" + checkTimes.length)).append("Current       :  [").toString();
                for (long l2 : checkTimes) {
                    log = new StringBuilder(String.valueOf(log)).append(String.format("%10d,", new Object[]{Long.valueOf(l2)})).toString();
                }
                LOG.warning(new StringBuilder(String.valueOf(log)).append("]").toString());
                throw new IOException("Track does not have the same fragment borders as its predecessor.");
            }
        }
        return checkTimes;
    }

    protected String getFormat(AbstractSampleEntry se) {
        String type = se.getType();
        return (type.equals(VisualSampleEntry.TYPE_ENCRYPTED) || type.equals(AudioSampleEntry.TYPE_ENCRYPTED) || type.equals(VisualSampleEntry.TYPE_ENCRYPTED)) ? ((OriginalFormatBox) se.getBoxes(OriginalFormatBox.class, true).get(0)).getDataFormat() : type;
    }
}
