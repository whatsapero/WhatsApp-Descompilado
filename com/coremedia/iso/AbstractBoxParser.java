package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.UserBox;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.logging.Logger;

public abstract class AbstractBoxParser implements BoxParser {
    private static Logger LOG;
    ThreadLocal<ByteBuffer> header;

    public abstract Box createBox(String str, byte[] bArr, String str2);

    public AbstractBoxParser() {
        this.header = new ThreadLocal<ByteBuffer>() {
            protected ByteBuffer initialValue() {
                return ByteBuffer.allocate(32);
            }
        };
    }

    static {
        LOG = Logger.getLogger(AbstractBoxParser.class.getName());
    }

    public Box parseBox(FileChannel byteChannel, Container parent) throws IOException {
        ((ByteBuffer) this.header.get()).rewind().limit(8);
        int bytesRead = 0;
        do {
            bytesRead += byteChannel.read((ByteBuffer) this.header.get());
            if (bytesRead == 8) {
                ((ByteBuffer) this.header.get()).rewind();
                long size = IsoTypeReader.readUInt32((ByteBuffer) this.header.get());
                if (size >= 8 || size <= 1) {
                    long contentSize;
                    String type = IsoTypeReader.read4cc((ByteBuffer) this.header.get());
                    byte[] usertype = null;
                    if (size == 1) {
                        ((ByteBuffer) this.header.get()).limit(16);
                        byteChannel.read((ByteBuffer) this.header.get());
                        ((ByteBuffer) this.header.get()).position(8);
                        contentSize = IsoTypeReader.readUInt64((ByteBuffer) this.header.get()) - 16;
                    } else if (size == 0) {
                        contentSize = ((byteChannel.size() - byteChannel.position()) - 8) - 8;
                        throw new RuntimeException("'" + type + "' with '" + (parent instanceof Box ? ((Box) parent).getType() : "IsoFile") + "' as parent has length == 0. That's not supported");
                    } else {
                        contentSize = size - 8;
                    }
                    if (UserBox.TYPE.equals(type)) {
                        ((ByteBuffer) this.header.get()).limit(((ByteBuffer) this.header.get()).limit() + 16);
                        byteChannel.read((ByteBuffer) this.header.get());
                        usertype = new byte[16];
                        for (int i = ((ByteBuffer) this.header.get()).position() - 16; i < ((ByteBuffer) this.header.get()).position(); i++) {
                            usertype[i - (((ByteBuffer) this.header.get()).position() - 16)] = ((ByteBuffer) this.header.get()).get(i);
                        }
                        contentSize -= 16;
                    }
                    Box box = createBox(type, usertype, parent instanceof Box ? ((Box) parent).getType() : "");
                    box.setParent(parent);
                    ((ByteBuffer) this.header.get()).rewind();
                    box.parse(byteChannel, (ByteBuffer) this.header.get(), contentSize, this);
                    return box;
                }
                LOG.severe("Plausibility check failed: size < 8 (size = " + size + "). Stop parsing!");
                return null;
            }
        } while (bytesRead >= 0);
        throw new EOFException();
    }
}
