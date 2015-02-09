package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.NullMediaHeaderBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TimeToSampleBox.Entry;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.adobe.ActionMessageFormat0SampleEntryBox;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Amf0Track extends AbstractTrack {
    SortedMap<Long, byte[]> rawSamples;
    private TrackMetaData trackMetaData;

    public Amf0Track(Map<Long, byte[]> rawSamples) {
        this.rawSamples = new TreeMap<Long, byte[]>() {
        };
        this.trackMetaData = new TrackMetaData();
        this.rawSamples = new TreeMap(rawSamples);
        this.trackMetaData.setCreationTime(new Date());
        this.trackMetaData.setModificationTime(new Date());
        this.trackMetaData.setTimescale(1000);
        this.trackMetaData.setLanguage("eng");
    }

    public List<Sample> getSamples() {
        LinkedList<Sample> samples = new LinkedList();
        for (byte[] bytes : this.rawSamples.values()) {
            samples.add(new SampleImpl(ByteBuffer.wrap(bytes)));
        }
        return samples;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        SampleDescriptionBox stsd = new SampleDescriptionBox();
        ActionMessageFormat0SampleEntryBox amf0 = new ActionMessageFormat0SampleEntryBox();
        amf0.setDataReferenceIndex(1);
        stsd.addBox(amf0);
        return stsd;
    }

    public List<Entry> getDecodingTimeEntries() {
        LinkedList<Entry> timesToSample = new LinkedList();
        LinkedList<Long> keys = new LinkedList(this.rawSamples.keySet());
        Collections.sort(keys);
        long lastTimeStamp = 0;
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            Long key = (Long) it.next();
            long delta = key.longValue() - lastTimeStamp;
            if (timesToSample.size() <= 0 || ((Entry) timesToSample.peek()).getDelta() != delta) {
                timesToSample.add(new Entry(1, delta));
            } else {
                ((Entry) timesToSample.peek()).setCount(((Entry) timesToSample.peek()).getCount() + 1);
            }
            lastTimeStamp = key.longValue();
        }
        return timesToSample;
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

    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }

    public String getHandler() {
        return "data";
    }

    public Box getMediaHeaderBox() {
        return new NullMediaHeaderBox();
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return null;
    }
}
