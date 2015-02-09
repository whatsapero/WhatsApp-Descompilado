package com.googlecode.mp4parser;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.util.LazyList;
import com.googlecode.mp4parser.util.Logger;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BasicContainer implements Container, Iterator<Box> {
    private static final Box EOF;
    private static Logger LOG;
    protected BoxParser boxParser;
    private List<Box> boxes;
    long endPosition;
    protected FileChannel fileChannel;
    Box lookahead;
    long parsePosition;
    long startPosition;

    class AnonymousClass_1 extends AbstractBox {
        AnonymousClass_1(String $anonymous0) {
            super($anonymous0);
        }

        protected long getContentSize() {
            return 0;
        }

        protected void getContent(ByteBuffer byteBuffer) {
        }

        protected void _parseDetails(ByteBuffer content) {
        }
    }

    static {
        LOG = Logger.getLogger(AbstractContainerBox.class);
        EOF = new AnonymousClass_1("eof ");
    }

    public List<Box> getBoxes() {
        return (this.fileChannel == null || this.lookahead == EOF) ? this.boxes : new LazyList(this.boxes, this);
    }

    protected long getContainerSize() {
        long contentSize = 0;
        for (int i = 0; i < getBoxes().size(); i++) {
            contentSize += ((Box) this.boxes.get(i)).getSize();
        }
        return contentSize;
    }

    public BasicContainer() {
        this.boxes = new ArrayList();
        this.lookahead = null;
        this.parsePosition = 0;
        this.startPosition = 0;
        this.endPosition = 0;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = new ArrayList(boxes);
        this.lookahead = EOF;
        this.fileChannel = null;
    }

    public <T extends Box> List<T> getBoxes(Class<T> clazz) {
        return getBoxes(clazz, false);
    }

    public <T extends Box> List<T> getBoxes(Class<T> clazz, boolean recursive) {
        List<T> boxesToBeReturned = new ArrayList(2);
        for (Box boxe : getBoxes()) {
            if (clazz.isInstance(boxe)) {
                boxesToBeReturned.add(boxe);
            }
            if (recursive && (boxe instanceof Container)) {
                boxesToBeReturned.addAll(((Container) boxe).getBoxes(clazz, recursive));
            }
        }
        return boxesToBeReturned;
    }

    public void addBox(Box b) {
        this.boxes = new ArrayList(getBoxes());
        b.setParent(this);
        this.boxes.add(b);
    }

    public void parseContainer(FileChannel fileChannel, long containerSize, BoxParser boxParser) throws IOException {
        this.fileChannel = fileChannel;
        long position = fileChannel.position();
        this.startPosition = position;
        this.parsePosition = position;
        fileChannel.position(fileChannel.position() + containerSize);
        this.endPosition = fileChannel.position();
        this.boxParser = boxParser;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        if (this.lookahead == EOF) {
            return false;
        }
        if (this.lookahead != null) {
            return true;
        }
        try {
            this.lookahead = next();
            return true;
        } catch (NoSuchElementException e) {
            this.lookahead = EOF;
            return false;
        }
    }

    public Box next() {
        Box b;
        if (this.lookahead == null || this.lookahead == EOF) {
            LOG.logDebug("Parsing next() box");
            if (this.fileChannel == null || this.parsePosition >= this.endPosition) {
                this.lookahead = EOF;
                throw new NoSuchElementException();
            }
            try {
                synchronized (this.fileChannel) {
                    this.fileChannel.position(this.parsePosition);
                    b = this.boxParser.parseBox(this.fileChannel, this);
                    this.parsePosition = this.fileChannel.position();
                }
                return b;
            } catch (EOFException e) {
                throw new NoSuchElementException();
            } catch (IOException e2) {
                throw new NoSuchElementException();
            }
        }
        b = this.lookahead;
        this.lookahead = null;
        return b;
    }

    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(getClass().getSimpleName()).append("[");
        for (int i = 0; i < this.boxes.size(); i++) {
            if (i > 0) {
                buffer.append(";");
            }
            buffer.append(((Box) this.boxes.get(i)).toString());
        }
        buffer.append("]");
        return buffer.toString();
    }

    public final void writeContainer(WritableByteChannel bb) throws IOException {
        for (Box box : getBoxes()) {
            box.getBox(bb);
        }
    }

    public ByteBuffer getByteBuffer(long start, long size) throws IOException {
        ByteBuffer map;
        synchronized (this.fileChannel) {
            map = this.fileChannel.map(MapMode.READ_ONLY, this.startPosition + start, size);
        }
        return map;
    }
}
