package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public abstract class AbstractSampleEntry extends AbstractContainerBox implements SampleEntry {
    protected int dataReferenceIndex;

    public abstract void getBox(WritableByteChannel writableByteChannel) throws IOException;

    public abstract void parse(FileChannel fileChannel, ByteBuffer byteBuffer, long j, BoxParser boxParser) throws IOException;

    protected AbstractSampleEntry(String type) {
        super(type);
        this.dataReferenceIndex = 1;
    }

    public int getDataReferenceIndex() {
        return this.dataReferenceIndex;
    }

    public void setDataReferenceIndex(int dataReferenceIndex) {
        this.dataReferenceIndex = dataReferenceIndex;
    }
}
