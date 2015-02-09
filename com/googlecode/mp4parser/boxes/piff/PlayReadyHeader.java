package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.whispersystems.libaxolotl.ay;

public class PlayReadyHeader extends ProtectionSpecificHeader {
    private long length;
    private List<PlayReadyRecord> records;

    public static abstract class PlayReadyRecord {
        int type;

        public static class DefaulPlayReadyRecord extends com.googlecode.mp4parser.boxes.piff.PlayReadyHeader.PlayReadyRecord {
            ByteBuffer value;

            public DefaulPlayReadyRecord(int type) {
                super(type);
            }

            public void parse(ByteBuffer bytes) {
                this.value = bytes.duplicate();
            }

            public ByteBuffer getValue() {
                return this.value;
            }
        }

        public static class EmeddedLicenseStore extends com.googlecode.mp4parser.boxes.piff.PlayReadyHeader.PlayReadyRecord {
            ByteBuffer value;

            public EmeddedLicenseStore() {
                super(3);
            }

            public void parse(ByteBuffer bytes) {
                this.value = bytes.duplicate();
            }

            public ByteBuffer getValue() {
                return this.value;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("EmeddedLicenseStore");
                sb.append("{length=").append(getValue().limit());
                sb.append('}');
                return sb.toString();
            }
        }

        public static class RMHeader extends com.googlecode.mp4parser.boxes.piff.PlayReadyHeader.PlayReadyRecord {
            String header;

            public RMHeader() {
                super(1);
            }

            public void parse(ByteBuffer bytes) {
                try {
                    byte[] str = new byte[bytes.slice().limit()];
                    bytes.get(str);
                    this.header = new String(str, "UTF-16LE");
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }

            public ByteBuffer getValue() {
                try {
                    return ByteBuffer.wrap(this.header.getBytes("UTF-16LE"));
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }

            public void setHeader(String header) {
                this.header = header;
            }

            public String getHeader() {
                return this.header;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("RMHeader");
                sb.append("{length=").append(getValue().limit());
                sb.append(", header='").append(this.header).append('\'');
                sb.append('}');
                return sb.toString();
            }
        }

        public abstract ByteBuffer getValue();

        public abstract void parse(ByteBuffer byteBuffer);

        public PlayReadyRecord(int type) {
            this.type = type;
        }

        public static List<com.googlecode.mp4parser.boxes.piff.PlayReadyHeader.PlayReadyRecord> createFor(ByteBuffer byteBuffer, int recordCount) {
            List<com.googlecode.mp4parser.boxes.piff.PlayReadyHeader.PlayReadyRecord> records = new ArrayList(recordCount);
            for (int i = 0; i < recordCount; i++) {
                com.googlecode.mp4parser.boxes.piff.PlayReadyHeader.PlayReadyRecord record;
                int type = IsoTypeReader.readUInt16BE(byteBuffer);
                int length = IsoTypeReader.readUInt16BE(byteBuffer);
                switch (type) {
                    case ay.f /*1*/:
                        record = new RMHeader();
                        break;
                    case ay.n /*2*/:
                        record = new DefaulPlayReadyRecord(2);
                        break;
                    case ay.p /*3*/:
                        record = new EmeddedLicenseStore();
                        break;
                    default:
                        record = new DefaulPlayReadyRecord(type);
                        break;
                }
                record.parse((ByteBuffer) byteBuffer.slice().limit(length));
                byteBuffer.position(byteBuffer.position() + length);
                records.add(record);
            }
            return records;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlayReadyRecord");
            sb.append("{type=").append(this.type);
            sb.append(", length=").append(getValue().limit());
            sb.append('}');
            return sb.toString();
        }
    }

    public void parse(ByteBuffer byteBuffer) {
        this.length = IsoTypeReader.readUInt32BE(byteBuffer);
        this.records = PlayReadyRecord.createFor(byteBuffer, IsoTypeReader.readUInt16BE(byteBuffer));
    }

    public ByteBuffer getData() {
        int size = 6;
        for (PlayReadyRecord record : this.records) {
            size = (size + 4) + record.getValue().rewind().limit();
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(size);
        IsoTypeWriter.writeUInt32BE(byteBuffer, (long) size);
        IsoTypeWriter.writeUInt16BE(byteBuffer, this.records.size());
        for (PlayReadyRecord record2 : this.records) {
            IsoTypeWriter.writeUInt16BE(byteBuffer, record2.type);
            IsoTypeWriter.writeUInt16BE(byteBuffer, record2.getValue().limit());
            byteBuffer.put(record2.getValue());
        }
        return byteBuffer;
    }

    public void setRecords(List<PlayReadyRecord> records) {
        this.records = records;
    }

    public List<PlayReadyRecord> getRecords() {
        return Collections.unmodifiableList(this.records);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayReadyHeader");
        sb.append("{length=").append(this.length);
        sb.append(", recordCount=").append(this.records.size());
        sb.append(", records=").append(this.records);
        sb.append('}');
        return sb.toString();
    }
}
