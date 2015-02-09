package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TimeToSampleBox.Entry;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.List;

public class ReplaceSampleTrack extends AbstractTrack {
    Track origTrack;
    private Sample sampleContent;
    private long sampleNumber;
    private List<Sample> samples;

    private class ReplaceASingleEntryList extends AbstractList<Sample> {
        private ReplaceASingleEntryList() {
        }

        public Sample get(int index) {
            return ReplaceSampleTrack.this.sampleNumber == ((long) index) ? ReplaceSampleTrack.this.sampleContent : (Sample) ReplaceSampleTrack.this.origTrack.getSamples().get(index);
        }

        public int size() {
            return ReplaceSampleTrack.this.origTrack.getSamples().size();
        }
    }

    public ReplaceSampleTrack(Track origTrack, long sampleNumber, ByteBuffer content) {
        this.origTrack = origTrack;
        this.sampleNumber = sampleNumber;
        this.sampleContent = new SampleImpl(content);
        this.samples = new ReplaceASingleEntryList();
    }

    public List<Sample> getSamples() {
        return this.samples;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.origTrack.getSampleDescriptionBox();
    }

    public List<Entry> getDecodingTimeEntries() {
        return this.origTrack.getDecodingTimeEntries();
    }

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return this.origTrack.getCompositionTimeEntries();
    }

    public synchronized long[] getSyncSamples() {
        return this.origTrack.getSyncSamples();
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.origTrack.getSampleDependencies();
    }

    public TrackMetaData getTrackMetaData() {
        return this.origTrack.getTrackMetaData();
    }

    public String getHandler() {
        return this.origTrack.getHandler();
    }

    public Box getMediaHeaderBox() {
        return this.origTrack.getMediaHeaderBox();
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.origTrack.getSubsampleInformationBox();
    }
}
