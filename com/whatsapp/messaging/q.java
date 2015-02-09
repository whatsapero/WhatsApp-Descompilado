package com.whatsapp.messaging;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.UnsupportedCharsetException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class q extends FilterOutputStream {
    private static final String[] z;
    private final ByteBuffer a;
    private boolean b;

    static {
        String[] strArr = new String[6];
        String str = "pIClR~E\u0017\"Pk\u001cU)\u001fqI[ ";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 31;
                        break;
                    case ay.f /*1*/:
                        i3 = 60;
                        break;
                    case ay.n /*2*/:
                        i3 = 55;
                        break;
                    case ay.p /*3*/:
                        i3 = 76;
                        break;
                    default:
                        i3 = 63;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "Jhqa\u0007";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "Osd\u0018\u001f0__-K?tc\u0018o0\r\u0019}2\u0015tX?K%\u001cTbHw]C?^oL\u0019\"Zk1=\u0019LzN\u001a\rXzRCv\u001fRSM%Ss]\u0018y\u0011/\u001c\u001f/PrLV8V}PRw\u001fH}t$^k\u0013\u0006b\r$\u001c\u001c$KkL\rc\u0010hK@bHw]C?^oL\u0019/Pr\u0013T#Qk]T8\u0016\u00126c>^qOQ)M2yY/P{UY+\u0005?__9QtYSA5\u00126";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "/1=A5";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "Jhqa\u0007";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "Jhqa\u0007";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public synchronized void close() {
        Throwable th = null;
        try {
            flush();
            this.out.write(z[4].getBytes(z[5]));
        } catch (UnsupportedCharsetException e) {
            throw e;
        } catch (Throwable th2) {
            throw new Error(th2);
        } catch (Throwable th3) {
        }
        try {
            super.close();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        if (th2 != null) {
            Thread.currentThread().stop(th2);
        }
    }

    private void a() {
        this.out.write(z[3].getBytes(z[2]));
        this.b = true;
    }

    public synchronized void flush() {
        try {
            if (!this.b) {
                a();
            }
            if (this.a.position() > 0) {
                this.out.write(Integer.toHexString(this.a.position()).getBytes(z[1]));
                this.out.write(13);
                this.out.write(10);
                this.out.write(this.a.array(), 0, this.a.position());
                this.out.write(13);
                this.out.write(10);
                this.a.clear();
            }
            super.flush();
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
        }
    }

    public q(OutputStream outputStream) {
        super(outputStream);
        if (outputStream == null) {
            throw new NullPointerException(z[0]);
        }
        this.a = ByteBuffer.allocate(8192);
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        boolean z = au.a;
        int i3 = i2;
        int i4 = i;
        while (i3 > this.a.remaining()) {
            int remaining = this.a.remaining();
            this.a.put(bArr, i4, remaining);
            flush();
            i4 += remaining;
            i3 -= remaining;
            if (z) {
                break;
            }
        }
        this.a.put(bArr, i4, i3);
    }

    public synchronized void write(int i) {
        try {
            if (!this.a.hasRemaining()) {
                flush();
            }
            this.a.put((byte) i);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
        }
    }
}
