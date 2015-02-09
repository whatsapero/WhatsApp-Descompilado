package com.coremedia.iso.boxes.mdat;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.logging.Logger;

public final class MediaDataBox implements Box {
    private static Logger LOG = null;
    public static final String TYPE = "mdat";
    private FileChannel fileChannel;
    boolean largeBox;
    private long offset;
    Container parent;
    private long size;

    public MediaDataBox() {
        this.largeBox = false;
    }

    static {
        LOG = Logger.getLogger(MediaDataBox.class.getName());
    }

    public Container getParent() {
        return this.parent;
    }

    public void setParent(Container parent) {
        this.parent = parent;
    }

    public String getType() {
        return TYPE;
    }

    private static void transfer(FileChannel from, long position, long count, WritableByteChannel to) throws IOException {
        long offset = 0;
        while (offset < count) {
            offset += from.transferTo(position + offset, Math.min(67076096, count - offset), to);
        }
    }

    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        transfer(this.fileChannel, this.offset, this.size, writableByteChannel);
    }

    public long getSize() {
        return this.size;
    }

    public long getOffset() {
        return this.offset;
    }

    public void parse(FileChannel fileChannel, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {
        this.offset = fileChannel.position() - ((long) header.remaining());
        this.fileChannel = fileChannel;
        this.size = ((long) header.remaining()) + contentSize;
        fileChannel.position(fileChannel.position() + contentSize);
    }

    public String toString() {
        return "MediaDataBox{size=" + this.size + '}';
    }
}
