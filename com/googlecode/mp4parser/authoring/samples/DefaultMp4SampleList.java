package com.googlecode.mp4parser.authoring.samples;

import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleToChunkBox.Entry;
import com.coremedia.iso.boxes.TrackBox;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;

public class DefaultMp4SampleList extends AbstractList<Sample> {
    Container topLevel;
    TrackBox trackBox;

    public DefaultMp4SampleList(long track, Container topLevel) {
        this.trackBox = null;
        this.topLevel = topLevel;
        for (TrackBox tb : ((MovieBox) topLevel.getBoxes(MovieBox.class).get(0)).getBoxes(TrackBox.class)) {
            if (tb.getTrackHeaderBox().getTrackId() == track) {
                this.trackBox = tb;
            }
        }
        if (this.trackBox == null) {
            throw new RuntimeException("This MP4 does not contain track " + track);
        }
    }

    public Sample get(int index) {
        if (((long) index) >= this.trackBox.getSampleTableBox().getSampleSizeBox().getSampleCount()) {
            throw new IndexOutOfBoundsException();
        }
        Iterator<Entry> iterator = this.trackBox.getSampleTableBox().getSampleToChunkBox().getEntries().iterator();
        Entry next = (Entry) iterator.next();
        long currentChunkNo = 0;
        long currentSamplePerChunk = 0;
        long nextFirstChunk = next.getFirstChunk();
        long nextSamplePerChunk = next.getSamplesPerChunk();
        int currentSampleNo = 1;
        int targetSampleNo = index + 1;
        do {
            currentChunkNo++;
            if (currentChunkNo == nextFirstChunk) {
                currentSamplePerChunk = nextSamplePerChunk;
                if (iterator.hasNext()) {
                    next = (Entry) iterator.next();
                    nextSamplePerChunk = next.getSamplesPerChunk();
                    nextFirstChunk = next.getFirstChunk();
                } else {
                    nextSamplePerChunk = -1;
                    nextFirstChunk = Long.MAX_VALUE;
                }
            }
            currentSampleNo = (int) (((long) currentSampleNo) + currentSamplePerChunk);
        } while (currentSampleNo <= targetSampleNo);
        currentSampleNo = (int) (((long) currentSampleNo) - currentSamplePerChunk);
        long offset = this.trackBox.getSampleTableBox().getChunkOffsetBox().getChunkOffsets()[CastUtils.l2i(currentChunkNo - 1)];
        SampleSizeBox ssb = this.trackBox.getSampleTableBox().getSampleSizeBox();
        int currentSampleNo2 = currentSampleNo;
        while (currentSampleNo2 < targetSampleNo) {
            offset += ssb.getSampleSizeAtIndex(currentSampleNo2 - 1);
            currentSampleNo2++;
        }
        try {
            return new SampleImpl(this.topLevel.getByteBuffer(offset, ssb.getSampleSizeAtIndex(currentSampleNo2 - 1)));
        } catch (IOException e) {
            return null;
        }
    }

    public int size() {
        return CastUtils.l2i(this.trackBox.getSampleTableBox().getSampleSizeBox().getSampleCount());
    }
}
