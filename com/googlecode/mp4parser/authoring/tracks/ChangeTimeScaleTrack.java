package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample.Entry;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Logger;

public class ChangeTimeScaleTrack implements Track {
    private static final Logger LOG;
    List<Entry> ctts;
    Track source;
    long timeScale;
    List<TimeToSampleBox.Entry> tts;

    static {
        LOG = Logger.getLogger(ChangeTimeScaleTrack.class.getName());
    }

    public ChangeTimeScaleTrack(Track source, long targetTimeScale, long[] syncSamples) {
        this.source = source;
        this.timeScale = targetTimeScale;
        double timeScaleFactor = ((double) targetTimeScale) / ((double) source.getTrackMetaData().getTimescale());
        this.ctts = adjustCtts(source.getCompositionTimeEntries(), timeScaleFactor);
        this.tts = adjustTts(source.getDecodingTimeEntries(), timeScaleFactor, syncSamples, getTimes(source, syncSamples, targetTimeScale));
    }

    private static long[] getTimes(Track track, long[] syncSamples, long targetTimeScale) {
        long[] syncSampleTimes = new long[syncSamples.length];
        Queue<TimeToSampleBox.Entry> timeQueue = new LinkedList(track.getDecodingTimeEntries());
        int currentSample = 1;
        long currentDuration = 0;
        long currentDelta = 0;
        int currentSyncSampleIndex = 0;
        long left = 0;
        while (true) {
            if (((long) currentSample) > syncSamples[syncSamples.length - 1]) {
                return syncSampleTimes;
            }
            int currentSample2 = currentSample + 1;
            if (((long) currentSample) == syncSamples[currentSyncSampleIndex]) {
                int currentSyncSampleIndex2 = currentSyncSampleIndex + 1;
                syncSampleTimes[currentSyncSampleIndex] = (currentDuration * targetTimeScale) / track.getTrackMetaData().getTimescale();
                currentSyncSampleIndex = currentSyncSampleIndex2;
            }
            long left2 = left - 1;
            if (left == 0) {
                TimeToSampleBox.Entry entry = (TimeToSampleBox.Entry) timeQueue.poll();
                left = entry.getCount() - 1;
                currentDelta = entry.getDelta();
            } else {
                left = left2;
            }
            currentDuration += currentDelta;
            currentSample = currentSample2;
        }
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.source.getSampleDescriptionBox();
    }

    public List<TimeToSampleBox.Entry> getDecodingTimeEntries() {
        return this.tts;
    }

    public List<Entry> getCompositionTimeEntries() {
        return this.ctts;
    }

    public long[] getSyncSamples() {
        return this.source.getSyncSamples();
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.source.getSampleDependencies();
    }

    public TrackMetaData getTrackMetaData() {
        TrackMetaData trackMetaData = (TrackMetaData) this.source.getTrackMetaData().clone();
        trackMetaData.setTimescale(this.timeScale);
        return trackMetaData;
    }

    public String getHandler() {
        return this.source.getHandler();
    }

    public boolean isEnabled() {
        return this.source.isEnabled();
    }

    public boolean isInMovie() {
        return this.source.isInMovie();
    }

    public boolean isInPreview() {
        return this.source.isInPreview();
    }

    public boolean isInPoster() {
        return this.source.isInPoster();
    }

    public List<Sample> getSamples() {
        return this.source.getSamples();
    }

    static List<Entry> adjustCtts(List<Entry> source, double timeScaleFactor) {
        if (source == null) {
            return null;
        }
        List<Entry> entries2 = new ArrayList(source.size());
        for (Entry entry : source) {
            entries2.add(new Entry(entry.getCount(), (int) Math.round(((double) entry.getOffset()) * timeScaleFactor)));
        }
        return entries2;
    }

    static List<TimeToSampleBox.Entry> adjustTts(List<TimeToSampleBox.Entry> source, double timeScaleFactor, long[] syncSample, long[] syncSampleTimes) {
        long[] sourceArray = TimeToSampleBox.blowupTimeToSamples(source);
        long summedDurations = 0;
        LinkedList<TimeToSampleBox.Entry> entries2 = new LinkedList();
        for (int i = 1; i <= sourceArray.length; i++) {
            long x = Math.round(((double) sourceArray[i - 1]) * timeScaleFactor);
            TimeToSampleBox.Entry last = (TimeToSampleBox.Entry) entries2.peekLast();
            int ssIndex = Arrays.binarySearch(syncSample, (long) (i + 1));
            if (ssIndex >= 0 && syncSampleTimes[ssIndex] != summedDurations) {
                long correction = syncSampleTimes[ssIndex] - (summedDurations + x);
                LOG.finest(String.format("Sample %d %d / %d - correct by %d", new Object[]{Integer.valueOf(i), Long.valueOf(summedDurations), Long.valueOf(syncSampleTimes[ssIndex]), Long.valueOf(correction)}));
                x += correction;
            }
            summedDurations += x;
            if (last == null) {
                entries2.add(new TimeToSampleBox.Entry(1, x));
            } else if (last.getDelta() != x) {
                entries2.add(new TimeToSampleBox.Entry(1, x));
            } else {
                last.setCount(last.getCount() + 1);
            }
        }
        return entries2;
    }

    public Box getMediaHeaderBox() {
        return this.source.getMediaHeaderBox();
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.source.getSubsampleInformationBox();
    }

    public String toString() {
        return "ChangeTimeScaleTrack{source=" + this.source + '}';
    }
}
