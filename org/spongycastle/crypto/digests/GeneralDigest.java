package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

public abstract class GeneralDigest implements ExtendedDigest, Memoable {
    private static final int BYTE_LENGTH = 64;
    public static boolean a;
    private long byteCount;
    private final byte[] xBuf;
    private int xBufOff;

    protected abstract void processBlock();

    protected abstract void processLength(long j);

    protected abstract void processWord(byte[] bArr, int i);

    public void update(byte b) {
        byte[] bArr = this.xBuf;
        int i = this.xBufOff;
        this.xBufOff = i + 1;
        bArr[i] = b;
        if (this.xBufOff == this.xBuf.length) {
            processWord(this.xBuf, 0);
            this.xBufOff = 0;
        }
        this.byteCount++;
    }

    public void update(byte[] bArr, int i, int i2) {
        boolean z = a;
        while (this.xBufOff != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
            if (z) {
                break;
            }
        }
        while (i2 > this.xBuf.length) {
            processWord(bArr, i);
            i += this.xBuf.length;
            i2 -= this.xBuf.length;
            this.byteCount += (long) this.xBuf.length;
            if (z) {
                break;
            }
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
            if (z) {
                return;
            }
        }
    }

    protected GeneralDigest(GeneralDigest generalDigest) {
        this.xBuf = new byte[4];
        copyIn(generalDigest);
    }

    public void finish() {
        boolean z = a;
        long j = this.byteCount << 3;
        update(Byte.MIN_VALUE);
        while (this.xBufOff != 0) {
            update((byte) 0);
            if (z) {
                break;
            }
        }
        processLength(j);
        processBlock();
    }

    public void reset() {
        boolean z = a;
        this.byteCount = 0;
        this.xBufOff = 0;
        int i = 0;
        while (i < this.xBuf.length) {
            this.xBuf[i] = (byte) 0;
            i++;
            if (z) {
                return;
            }
        }
    }

    protected void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, bArr, 4);
        Pack.longToBigEndian(this.byteCount, bArr, 8);
    }

    protected GeneralDigest() {
        this.xBuf = new byte[4];
        this.xBufOff = 0;
    }

    public int getByteLength() {
        return BYTE_LENGTH;
    }

    protected void copyIn(GeneralDigest generalDigest) {
        System.arraycopy(generalDigest.xBuf, 0, this.xBuf, 0, generalDigest.xBuf.length);
        this.xBufOff = generalDigest.xBufOff;
        this.byteCount = generalDigest.byteCount;
    }

    protected GeneralDigest(byte[] bArr) {
        this.xBuf = new byte[4];
        System.arraycopy(bArr, 0, this.xBuf, 0, this.xBuf.length);
        this.xBufOff = Pack.bigEndianToInt(bArr, 4);
        this.byteCount = Pack.bigEndianToLong(bArr, 8);
    }
}
