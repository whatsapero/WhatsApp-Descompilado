package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import java.util.List;

public class MpegSampleEntry extends AbstractSampleEntry {
    public MpegSampleEntry() {
        super("mp4s");
    }

    public MpegSampleEntry(String type) {
        super(type);
    }

    public void parse(FileChannel fileChannel, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {
        ByteBuffer bb = ByteBuffer.allocate(8);
        fileChannel.read(bb);
        bb.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(bb);
        parseContainer(fileChannel, contentSize, boxParser);
    }

    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer bb = ByteBuffer.allocate(8);
        bb.position(6);
        IsoTypeWriter.writeUInt16(bb, this.dataReferenceIndex);
        writableByteChannel.write((ByteBuffer) bb.rewind());
        writeContainer(writableByteChannel);
    }

    public String toString() {
        return "MpegSampleEntry" + Arrays.asList(new List[]{getBoxes()});
    }

    public long getSize() {
        long s = getContainerSize();
        long j = s + 8;
        int i = (this.largeBox || s + 8 >= 4294967296L) ? 16 : 8;
        return ((long) i) + j;
    }
}
