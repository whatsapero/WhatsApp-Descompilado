package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TimeToSampleBox.Entry;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MultiplyTimeScaleTrack implements Track {
    Track source;
    private int timeScaleFactor;

    public MultiplyTimeScaleTrack(Track source, int timeScaleFactor) {
        this.source = source;
        this.timeScaleFactor = timeScaleFactor;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.source.getSampleDescriptionBox();
    }

    public List<Entry> getDecodingTimeEntries() {
        return adjustTts(this.source.getDecodingTimeEntries(), this.timeScaleFactor);
    }

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return adjustCtts(this.source.getCompositionTimeEntries(), this.timeScaleFactor);
    }

    public long[] getSyncSamples() {
        return this.source.getSyncSamples();
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.source.getSampleDependencies();
    }

    public TrackMetaData getTrackMetaData() {
        TrackMetaData trackMetaData = (TrackMetaData) this.source.getTrackMetaData().clone();
        trackMetaData.setTimescale(this.source.getTrackMetaData().getTimescale() * ((long) this.timeScaleFactor));
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

    static List<CompositionTimeToSample.Entry> adjustCtts(List<CompositionTimeToSample.Entry> source, int timeScaleFactor) {
        if (source == null) {
            return null;
        }
        List<CompositionTimeToSample.Entry> entries2 = new ArrayList(source.size());
        for (CompositionTimeToSample.Entry entry : source) {
            entries2.add(new CompositionTimeToSample.Entry(entry.getCount(), entry.getOffset() * timeScaleFactor));
        }
        return entries2;
    }

    static List<Entry> adjustTts(List<Entry> source, int timeScaleFactor) {
        LinkedList<Entry> entries2 = new LinkedList();
        for (Entry e : source) {
            entries2.add(new Entry(e.getCount(), ((long) timeScaleFactor) * e.getDelta()));
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
        return "MultiplyTimeScaleTrack{source=" + this.source + '}';
    }
}
