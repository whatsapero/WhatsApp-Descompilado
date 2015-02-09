package com.google.android.gms.internal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class qp {
    private final int ayV;
    private final byte[] buffer;
    private int position;

    public class a extends IOException {
        a(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    private qp(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.position = i;
        this.ayV = i + i2;
    }

    public static int D(long j) {
        return G(j);
    }

    public static int G(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    public static int X(boolean z) {
        return 1;
    }

    public static int b(int i, qw qwVar) {
        return (hc(i) * 2) + d(qwVar);
    }

    public static qp b(byte[] bArr, int i, int i2) {
        return new qp(bArr, i, i2);
    }

    public static int c(int i, qw qwVar) {
        return hc(i) + e(qwVar);
    }

    public static int c(int i, boolean z) {
        return hc(i) + X(z);
    }

    public static int d(int i, long j) {
        return hc(i) + D(j);
    }

    public static int d(qw qwVar) {
        return qwVar.rZ();
    }

    public static int dk(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return bytes.length + he(bytes.length);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static int e(qw qwVar) {
        int rZ = qwVar.rZ();
        return rZ + he(rZ);
    }

    public static int gZ(int i) {
        if (i < 0) {
            return 10;
        }
        try {
            return he(i);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public static int hc(int i) {
        return he(qz.y(i, 0));
    }

    public static int he(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (-268435456 & i) == 0 ? 4 : 5;
    }

    public static int j(int i, String str) {
        return hc(i) + dk(str);
    }

    public static qp q(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static int v(int i, int i2) {
        return hc(i) + gZ(i2);
    }

    public void B(long j) {
        F(j);
    }

    public void F(long j) {
        while ((-128 & j) != 0) {
            hb((((int) j) & 127) | 128);
            j >>>= 7;
        }
        try {
            hb((int) j);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public void W(boolean z) {
        hb(z ? 1 : 0);
    }

    public void a(int i, qw qwVar) {
        x(i, 2);
        c(qwVar);
    }

    public void b(byte b) {
        try {
            if (this.position == this.ayV) {
                throw new a(this.position, this.ayV);
            }
            byte[] bArr = this.buffer;
            int i = this.position;
            this.position = i + 1;
            bArr[i] = b;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public void b(int i, long j) {
        x(i, 0);
        B(j);
    }

    public void b(int i, String str) {
        x(i, 2);
        dj(str);
    }

    public void b(int i, boolean z) {
        x(i, 0);
        W(z);
    }

    public void b(qw qwVar) {
        qwVar.a(this);
    }

    public void c(qw qwVar) {
        hd(qwVar.rY());
        qwVar.a(this);
    }

    public void c(byte[] bArr, int i, int i2) {
        try {
            if (this.ayV - this.position >= i2) {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
                if (!qw.a) {
                    return;
                }
            }
            throw new a(this.position, this.ayV);
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    public void dj(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        hd(bytes.length);
        t(bytes);
    }

    public void gX(int i) {
        try {
            if (i >= 0) {
                hd(i);
                if (!qw.a) {
                    return;
                }
            }
            F((long) i);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public void hb(int i) {
        b((byte) i);
    }

    public void hd(int i) {
        while ((i & -128) != 0) {
            hb((i & 127) | 128);
            i >>>= 7;
        }
        try {
            hb(i);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public void t(int i, int i2) {
        x(i, 0);
        gX(i2);
    }

    public void t(byte[] bArr) {
        c(bArr, 0, bArr.length);
    }

    public void x(int i, int i2) {
        hd(qz.y(i, i2));
    }
}
