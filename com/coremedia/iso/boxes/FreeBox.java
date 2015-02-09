package com.coremedia.iso.boxes;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.ChannelHelper;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.LinkedList;
import java.util.List;

public class FreeBox implements Box {
    static final /* synthetic */ boolean $assertionsDisabled;
    public static final String TYPE = "free";
    ByteBuffer data;
    private long offset;
    private Container parent;
    List<Box> replacers;

    static {
        $assertionsDisabled = !FreeBox.class.desiredAssertionStatus() ? true : $assertionsDisabled;
    }

    public FreeBox() {
        this.replacers = new LinkedList();
    }

    public FreeBox(int size) {
        this.replacers = new LinkedList();
        this.data = ByteBuffer.allocate(size);
    }

    public long getOffset() {
        return this.offset;
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public void setData(ByteBuffer data) {
        this.data = data;
    }

    public void getBox(WritableByteChannel os) throws IOException {
        for (Box replacer : this.replacers) {
            replacer.getBox(os);
        }
        ByteBuffer header = ByteBuffer.allocate(8);
        IsoTypeWriter.writeUInt32(header, (long) (this.data.limit() + 8));
        header.put(TYPE.getBytes());
        header.rewind();
        os.write(header);
        header.rewind();
        this.data.rewind();
        os.write(this.data);
        this.data.rewind();
    }

    public Container getParent() {
        return this.parent;
    }

    public void setParent(Container parent) {
        this.parent = parent;
    }

    public long getSize() {
        long size = 8;
        for (Box replacer : this.replacers) {
            size += replacer.getSize();
        }
        return size + ((long) this.data.limit());
    }

    public String getType() {
        return TYPE;
    }

    public void parse(FileChannel fileChannel, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {
        this.offset = fileChannel.position() - ((long) header.remaining());
        if (contentSize > 1048576) {
            this.data = fileChannel.map(MapMode.READ_ONLY, fileChannel.position(), contentSize);
            fileChannel.position(fileChannel.position() + contentSize);
        } else if ($assertionsDisabled || contentSize < 2147483647L) {
            this.data = ChannelHelper.readFully((ReadableByteChannel) fileChannel, contentSize);
        } else {
            throw new AssertionError();
        }
    }

    public void addAndReplace(Box box) {
        this.data.position(CastUtils.l2i(box.getSize()));
        this.data = this.data.slice();
        this.replacers.add(box);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return $assertionsDisabled;
        }
        FreeBox freeBox = (FreeBox) o;
        if (this.data != null) {
            if (this.data.equals(freeBox.data)) {
                return true;
            }
        } else if (freeBox.data == null) {
            return true;
        }
        return $assertionsDisabled;
    }

    public int hashCode() {
        return this.data != null ? this.data.hashCode() : 0;
    }
}
