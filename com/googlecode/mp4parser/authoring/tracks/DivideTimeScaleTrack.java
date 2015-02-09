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

public class DivideTimeScaleTrack implements Track {
    Track source;
    private int timeScaleDivisor;

    public DivideTimeScaleTrack(Track source, int timeScaleDivisor) {
        this.source = source;
        this.timeScaleDivisor = timeScaleDivisor;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.source.getSampleDescriptionBox();
    }

    public List<Entry> getDecodingTimeEntries() {
        return adjustTts();
    }

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return adjustCtts();
    }

    public long[] getSyncSamples() {
        return this.source.getSyncSamples();
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.source.getSampleDependencies();
    }

    public TrackMetaData getTrackMetaData() {
        TrackMetaData trackMetaData = (TrackMetaData) this.source.getTrackMetaData().clone();
        trackMetaData.setTimescale(this.source.getTrackMetaData().getTimescale() / ((long) this.timeScaleDivisor));
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

    List<CompositionTimeToSample.Entry> adjustCtts() {
        List<CompositionTimeToSample.Entry> origCtts = this.source.getCompositionTimeEntries();
        if (origCtts == null) {
            return null;
        }
        List<CompositionTimeToSample.Entry> entries2 = new ArrayList(origCtts.size());
        for (CompositionTimeToSample.Entry entry : origCtts) {
            entries2.add(new CompositionTimeToSample.Entry(entry.getCount(), entry.getOffset() / this.timeScaleDivisor));
        }
        return entries2;
    }

    List<Entry> adjustTts() {
        List<Entry> origTts = this.source.getDecodingTimeEntries();
        LinkedList<Entry> entries2 = new LinkedList();
        for (Entry e : origTts) {
            entries2.add(new Entry(e.getCount(), e.getDelta() / ((long) this.timeScaleDivisor)));
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
