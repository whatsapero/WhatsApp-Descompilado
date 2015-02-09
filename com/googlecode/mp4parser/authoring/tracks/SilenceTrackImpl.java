package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TimeToSampleBox.Entry;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SilenceTrackImpl implements Track {
    Entry entry;
    List<Sample> samples;
    Track source;

    public SilenceTrackImpl(Track ofType, long ms) {
        this.samples = new LinkedList();
        this.source = ofType;
        if (AudioSampleEntry.TYPE3.equals(ofType.getSampleDescriptionBox().getSampleEntry().getType())) {
            long numFrames = ((getTrackMetaData().getTimescale() * ms) / 1000) / 1024;
            this.entry = new Entry(numFrames, ((getTrackMetaData().getTimescale() * ms) / numFrames) / 1000);
            long numFrames2 = numFrames;
            while (true) {
                numFrames = numFrames2 - 1;
                if (numFrames2 > 0) {
                    this.samples.add(new SampleImpl((ByteBuffer) ByteBuffer.wrap(new byte[]{(byte) 33, (byte) 16, (byte) 4, (byte) 96, (byte) -116, (byte) 28}).rewind()));
                    numFrames2 = numFrames;
                } else {
                    return;
                }
            }
        }
        throw new RuntimeException("Tracks of type " + ofType.getClass().getSimpleName() + " are not supported");
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.source.getSampleDescriptionBox();
    }

    public List<Entry> getDecodingTimeEntries() {
        return Collections.singletonList(this.entry);
    }

    public TrackMetaData getTrackMetaData() {
        return this.source.getTrackMetaData();
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
        return this.samples;
    }

    public Box getMediaHeaderBox() {
        return this.source.getMediaHeaderBox();
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return null;
    }

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return null;
    }

    public long[] getSyncSamples() {
        return null;
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return null;
    }
}
