package com.coremedia.iso.boxes;

import com.coremedia.iso.BoxParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public interface Box {
    void getBox(WritableByteChannel writableByteChannel) throws IOException;

    long getOffset();

    Container getParent();

    long getSize();

    String getType();

    void parse(FileChannel fileChannel, ByteBuffer byteBuffer, long j, BoxParser boxParser) throws IOException;

    void setParent(Container container);
}
