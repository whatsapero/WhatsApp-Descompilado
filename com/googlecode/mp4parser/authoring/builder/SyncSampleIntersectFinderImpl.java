package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.TimeToSampleBox.Entry;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.util.Math;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

public class SyncSampleIntersectFinderImpl implements FragmentIntersectionFinder {
    private static Logger LOG;
    private static Map<CacheTuple, long[]> getSampleNumbersCache;
    private static Map<CacheTuple, long[]> getTimesCache;
    private final int minFragmentDurationSeconds;

    public static class CacheTuple {
        Movie movie;
        Track track;

        public CacheTuple(Track track, Movie movie) {
            this.track = track;
            this.movie = movie;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            com.googlecode.mp4parser.authoring.builder.SyncSampleIntersectFinderImpl.CacheTuple that = (com.googlecode.mp4parser.authoring.builder.SyncSampleIntersectFinderImpl.CacheTuple) o;
            if (this.movie == null ? that.movie != null : !this.movie.equals(that.movie)) {
                return false;
            }
            if (this.track != null) {
                if (this.track.equals(that.track)) {
                    return true;
                }
            } else if (that.track == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int result;
            int i = 0;
            if (this.track != null) {
                result = this.track.hashCode();
            } else {
                result = 0;
            }
            int i2 = result * 31;
            if (this.movie != null) {
                i = this.movie.hashCode();
            }
            return i2 + i;
        }
    }

    static {
        LOG = Logger.getLogger(SyncSampleIntersectFinderImpl.class.getName());
        getTimesCache = new ConcurrentHashMap();
        getSampleNumbersCache = new ConcurrentHashMap();
    }

    public SyncSampleIntersectFinderImpl() {
        this.minFragmentDurationSeconds = 0;
    }

    public SyncSampleIntersectFinderImpl(int minFragmentDurationSeconds) {
        this.minFragmentDurationSeconds = minFragmentDurationSeconds;
    }

    public long[] sampleNumbers(Track track, Movie movie) {
        CacheTuple cacheTuple = new CacheTuple(track, movie);
        long[] result = (long[]) getSampleNumbersCache.get(cacheTuple);
        if (result != null) {
            return result;
        }
        if ("vide".equals(track.getHandler())) {
            if (track.getSyncSamples() == null || track.getSyncSamples().length <= 0) {
                throw new RuntimeException("Video Tracks need sync samples. Only tracks other than video may have no sync samples.");
            }
            List<long[]> times = getSyncSamplesTimestamps(movie, track);
            long[] commonIndices = getCommonIndices(track.getSyncSamples(), getTimes(track, movie), track.getTrackMetaData().getTimescale(), (long[][]) times.toArray(new Object[times.size()]));
            getSampleNumbersCache.put(cacheTuple, commonIndices);
            return commonIndices;
        } else if ("soun".equals(track.getHandler())) {
            Track referenceTrack = null;
            for (Track candidate : movie.getTracks()) {
                if (candidate.getSyncSamples() != null && "vide".equals(candidate.getHandler()) && candidate.getSyncSamples().length > 0) {
                    referenceTrack = candidate;
                }
            }
            if (referenceTrack != null) {
                AudioSampleEntry ase;
                long samplesPerFrame;
                double factor;
                refSyncSamples = sampleNumbers(referenceTrack, movie);
                int refSampleCount = referenceTrack.getSamples().size();
                syncSamples = new Object[refSyncSamples.length];
                long minSampleRate = 192000;
                for (Track testTrack : movie.getTracks()) {
                    if ("soun".equals(testTrack.getHandler())) {
                        ase = (AudioSampleEntry) testTrack.getSampleDescriptionBox().getSampleEntry();
                        if (ase.getSampleRate() < 192000) {
                            minSampleRate = ase.getSampleRate();
                            stretch = ((double) ((long) testTrack.getSamples().size())) / ((double) refSampleCount);
                            samplesPerFrame = ((Entry) testTrack.getDecodingTimeEntries().get(0)).getDelta();
                            for (i = 0; i < syncSamples.length; i++) {
                                syncSamples[i] = (long) Math.ceil((((double) (refSyncSamples[i] - 1)) * stretch) * ((double) samplesPerFrame));
                            }
                            ase = (AudioSampleEntry) track.getSampleDescriptionBox().getSampleEntry();
                            samplesPerFrame = ((Entry) track.getDecodingTimeEntries().get(0)).getDelta();
                            factor = ((double) ase.getSampleRate()) / ((double) minSampleRate);
                            if (factor == Math.rint(factor)) {
                                throw new RuntimeException("Sample rates must be a multiple of the lowest sample rate to create a correct file!");
                            }
                            for (i = 0; i < syncSamples.length; i++) {
                                syncSamples[i] = (long) (1.0d + ((((double) syncSamples[i]) * factor) / ((double) samplesPerFrame)));
                            }
                            getSampleNumbersCache.put(cacheTuple, syncSamples);
                            return syncSamples;
                        }
                    }
                }
                ase = (AudioSampleEntry) track.getSampleDescriptionBox().getSampleEntry();
                samplesPerFrame = ((Entry) track.getDecodingTimeEntries().get(0)).getDelta();
                factor = ((double) ase.getSampleRate()) / ((double) minSampleRate);
                if (factor == Math.rint(factor)) {
                    for (i = 0; i < syncSamples.length; i++) {
                        syncSamples[i] = (long) (1.0d + ((((double) syncSamples[i]) * factor) / ((double) samplesPerFrame)));
                    }
                    getSampleNumbersCache.put(cacheTuple, syncSamples);
                    return syncSamples;
                }
                throw new RuntimeException("Sample rates must be a multiple of the lowest sample rate to create a correct file!");
            }
            throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
        } else {
            for (Track candidate2 : movie.getTracks()) {
                if (candidate2.getSyncSamples() != null && candidate2.getSyncSamples().length > 0) {
                    refSyncSamples = sampleNumbers(candidate2, movie);
                    syncSamples = new Object[refSyncSamples.length];
                    long sc = (long) track.getSamples().size();
                    stretch = ((double) sc) / ((double) candidate2.getSamples().size());
                    for (i = 0; i < syncSamples.length; i++) {
                        syncSamples[i] = ((long) Math.ceil(((double) (refSyncSamples[i] - 1)) * stretch)) + 1;
                    }
                    getSampleNumbersCache.put(cacheTuple, syncSamples);
                    return syncSamples;
                }
            }
            throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
        }
    }

    public static List<long[]> getSyncSamplesTimestamps(Movie movie, Track track) {
        List<long[]> times = new LinkedList();
        for (Track currentTrack : movie.getTracks()) {
            if (currentTrack.getHandler().equals(track.getHandler())) {
                long[] currentTrackSyncSamples = currentTrack.getSyncSamples();
                if (currentTrackSyncSamples != null && currentTrackSyncSamples.length > 0) {
                    times.add(getTimes(currentTrack, movie));
                }
            }
        }
        return times;
    }

    public long[] getCommonIndices(long[] syncSamples, long[] syncSampleTimes, long timeScale, long[]... otherTracksTimes) {
        List<Long> nuSyncSamples = new LinkedList();
        List<Long> nuSyncSampleTimes = new LinkedList();
        int i = 0;
        while (true) {
            int length = syncSampleTimes.length;
            if (i >= r0) {
                break;
            }
            boolean foundInEveryRef = true;
            for (long[] times : otherTracksTimes) {
                foundInEveryRef &= Arrays.binarySearch(times, syncSampleTimes[i]) >= 0 ? 1 : 0;
            }
            if (foundInEveryRef) {
                nuSyncSamples.add(Long.valueOf(syncSamples[i]));
                nuSyncSampleTimes.add(Long.valueOf(syncSampleTimes[i]));
            }
            i++;
        }
        if (((double) nuSyncSamples.size()) < ((double) syncSamples.length) * 0.25d) {
            long l;
            String log = "" + String.format("%5d - Common:  [", new Object[]{Integer.valueOf(nuSyncSamples.size())});
            for (Long l2 : nuSyncSamples) {
                l = l2.longValue();
                log = new StringBuilder(String.valueOf(log)).append(String.format("%10d,", new Object[]{Long.valueOf(l)})).toString();
            }
            LOG.warning(new StringBuilder(String.valueOf(log)).append("]").toString());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(""));
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(syncSamples.length);
            log = stringBuilder.append(String.format("%5d - In    :  [", objArr)).toString();
            for (long l3 : syncSamples) {
                log = new StringBuilder(String.valueOf(log)).append(String.format("%10d,", new Object[]{Long.valueOf(l3)})).toString();
            }
            LOG.warning(new StringBuilder(String.valueOf(log)).append("]").toString());
            LOG.warning("There are less than 25% of common sync samples in the given track.");
            throw new RuntimeException("There are less than 25% of common sync samples in the given track.");
        }
        if (((double) nuSyncSamples.size()) < ((double) syncSamples.length) * 0.5d) {
            LOG.fine("There are less than 50% of common sync samples in the given track. This is implausible but I'm ok to continue.");
        } else {
            if (nuSyncSamples.size() < syncSamples.length) {
                LOG.finest("Common SyncSample positions vs. this tracks SyncSample positions: " + nuSyncSamples.size() + " vs. " + syncSamples.length);
            }
        }
        List<Long> finalSampleList = new LinkedList();
        if (this.minFragmentDurationSeconds > 0) {
            long lastSyncSampleTime = -1;
            Iterator<Long> nuSyncSamplesIterator = nuSyncSamples.iterator();
            Iterator<Long> nuSyncSampleTimesIterator = nuSyncSampleTimes.iterator();
            while (nuSyncSamplesIterator.hasNext() && nuSyncSampleTimesIterator.hasNext()) {
                long curSyncSample = ((Long) nuSyncSamplesIterator.next()).longValue();
                long curSyncSampleTime = ((Long) nuSyncSampleTimesIterator.next()).longValue();
                if (lastSyncSampleTime != -1) {
                    if ((curSyncSampleTime - lastSyncSampleTime) / timeScale < ((long) this.minFragmentDurationSeconds)) {
                    }
                }
                finalSampleList.add(Long.valueOf(curSyncSample));
                lastSyncSampleTime = curSyncSampleTime;
            }
        } else {
            finalSampleList = nuSyncSamples;
        }
        long[] finalSampleArray = new long[finalSampleList.size()];
        i = 0;
        while (true) {
            length = finalSampleArray.length;
            if (i >= r0) {
                return finalSampleArray;
            }
            finalSampleArray[i] = ((Long) finalSampleList.get(i)).longValue();
            i++;
        }
    }

    private static long[] getTimes(Track track, Movie m) {
        CacheTuple key = new CacheTuple(track, m);
        long[] result = (long[]) getTimesCache.get(key);
        if (result != null) {
            return result;
        }
        long[] syncSamples = track.getSyncSamples();
        Object syncSampleTimes = new Object[syncSamples.length];
        Queue<Entry> timeQueue = new LinkedList(track.getDecodingTimeEntries());
        int currentSample = 1;
        long currentDuration = 0;
        long currentDelta = 0;
        int currentSyncSampleIndex = 0;
        long left = 0;
        long scalingFactor = calculateTracktimesScalingFactor(m, track);
        while (true) {
            if (((long) currentSample) > syncSamples[syncSamples.length - 1]) {
                getTimesCache.put(key, syncSampleTimes);
                return syncSampleTimes;
            }
            int currentSample2 = currentSample + 1;
            if (((long) currentSample) == syncSamples[currentSyncSampleIndex]) {
                int currentSyncSampleIndex2 = currentSyncSampleIndex + 1;
                syncSampleTimes[currentSyncSampleIndex] = currentDuration * scalingFactor;
                currentSyncSampleIndex = currentSyncSampleIndex2;
            }
            long left2 = left - 1;
            if (left == 0) {
                Entry entry = (Entry) timeQueue.poll();
                left = entry.getCount() - 1;
                currentDelta = entry.getDelta();
            } else {
                left = left2;
            }
            currentDuration += currentDelta;
            currentSample = currentSample2;
        }
    }

    private static long calculateTracktimesScalingFactor(Movie m, Track track) {
        long timeScale = 1;
        for (Track track1 : m.getTracks()) {
            if (track1.getHandler().equals(track.getHandler()) && track1.getTrackMetaData().getTimescale() != track.getTrackMetaData().getTimescale()) {
                timeScale = Math.lcm(timeScale, track1.getTrackMetaData().getTimescale());
            }
        }
        return timeScale;
    }
}
