package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.MovieBox;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.googlecode.mp4parser.util.Logger;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

@DoNotParseDetail
public class IsoFile extends BasicContainer implements Closeable {
    private static Logger LOG;

    static {
        LOG = Logger.getLogger(IsoFile.class);
    }

    public IsoFile(String filename) throws IOException {
        this(new FileInputStream(filename).getChannel());
    }

    public IsoFile(FileChannel fileChannel) throws IOException {
        parseContainer(fileChannel, fileChannel.size(), new PropertyBoxParserImpl(new String[0]));
    }

    public IsoFile(FileChannel fileChannel, BoxParser boxParser) throws IOException {
        this.fileChannel = fileChannel;
        this.boxParser = boxParser;
    }

    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("IsoFile[").append(this.fileChannel.toString()).append("]");
        return buffer.toString();
    }

    public static byte[] fourCCtoBytes(String fourCC) {
        byte[] result = new byte[4];
        if (fourCC != null) {
            for (int i = 0; i < Math.min(4, fourCC.length()); i++) {
                result[i] = (byte) fourCC.charAt(i);
            }
        }
        return result;
    }

    public static String bytesToFourCC(byte[] type) {
        byte[] result = new byte[4];
        if (type != null) {
            System.arraycopy(type, 0, result, 0, Math.min(type.length, 4));
        }
        try {
            return new String(result, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new Error("Required character encoding is missing", e);
        }
    }

    public long getSize() {
        return getContainerSize();
    }

    public MovieBox getMovieBox() {
        for (Box box : getBoxes()) {
            if (box instanceof MovieBox) {
                return (MovieBox) box;
            }
        }
        return null;
    }

    public void getBox(WritableByteChannel os) throws IOException {
        writeContainer(os);
    }

    public void close() throws IOException {
        this.fileChannel.close();
    }
}
