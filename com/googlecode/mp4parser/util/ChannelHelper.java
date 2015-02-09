package com.googlecode.mp4parser.util;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.WritableByteChannel;

public class ChannelHelper {
    static final /* synthetic */ boolean $assertionsDisabled;
    private static ByteBuffer empty;

    static {
        boolean z;
        if (ChannelHelper.class.desiredAssertionStatus()) {
            z = false;
        } else {
            z = true;
        }
        $assertionsDisabled = z;
        empty = ByteBuffer.allocate(0).asReadOnlyBuffer();
    }

    public static ByteBuffer readFully(ReadableByteChannel channel, long size) throws IOException {
        if (size == 0) {
            return empty;
        }
        if (channel instanceof ByteBufferByteChannel) {
            if (((long) ((ByteBufferByteChannel) channel).byteBuffer.remaining()) < size) {
                throw new IOException("Trying to read more data than available. The file might be corrupt");
            }
            ByteBuffer rbb = (ByteBuffer) ((ByteBufferByteChannel) channel).byteBuffer.slice().limit((int) size);
            ((ByteBufferByteChannel) channel).byteBuffer.position((int) (((long) ((ByteBufferByteChannel) channel).byteBuffer.position()) + size));
            return rbb;
        } else if (!(channel instanceof FileChannel) || size <= 1048576) {
            ByteBuffer buf = ByteBuffer.allocateDirect(CastUtils.l2i(size));
            readFully(channel, buf, buf.limit());
            buf.rewind();
            if ($assertionsDisabled || ((long) buf.limit()) == size) {
                return buf;
            }
            throw new AssertionError();
        } else {
            ByteBuffer bb = ((FileChannel) channel).map(MapMode.READ_ONLY, ((FileChannel) channel).position(), size);
            ((FileChannel) channel).position(((FileChannel) channel).position() + size);
            return bb;
        }
    }

    public static void readFully(ReadableByteChannel channel, ByteBuffer buf) throws IOException {
        readFully(channel, buf, buf.remaining());
    }

    public static int readFully(ReadableByteChannel channel, ByteBuffer buf, int length) throws IOException {
        int count = 0;
        do {
            int n = channel.read(buf);
            if (-1 == n) {
                break;
            }
            count += n;
        } while (count != length);
        if (n != -1) {
            return count;
        }
        throw new EOFException("End of file. No more boxes.");
    }

    public static void writeFully(WritableByteChannel channel, ByteBuffer buf) throws IOException {
        while (channel.write(buf) >= 0) {
            if (!buf.hasRemaining()) {
                return;
            }
        }
        throw new EOFException();
    }

    public static void close(SelectionKey key) {
        try {
            key.channel().close();
        } catch (IOException e) {
        }
    }
}
