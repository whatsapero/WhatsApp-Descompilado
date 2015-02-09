package com.googlecode.mp4parser.authoring;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class SampleImpl implements Sample {
    private final ByteBuffer[] data;

    public SampleImpl(ByteBuffer buf) {
        this.data = new ByteBuffer[]{buf};
    }

    public SampleImpl(ByteBuffer[] data) {
        this.data = data;
    }

    public void writeTo(WritableByteChannel channel) throws IOException {
        for (ByteBuffer b : this.data) {
            channel.write(b);
        }
    }

    public long remaining() {
        long r = 0;
        for (ByteBuffer b : this.data) {
            r += (long) b.remaining();
        }
        return r;
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer copy = ByteBuffer.wrap(new byte[((int) remaining())]);
        for (ByteBuffer b : this.data) {
            copy.put(b.duplicate());
        }
        return copy;
    }
}
