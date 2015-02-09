package com.whatsapp.protocol;

import android.os.Build.VERSION;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.a54;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class u implements bx {
    private static final String[] z;
    private final Mac a;
    private final Cipher b;
    private int c;
    private final byte[] d;
    private final Mac e;
    private final Cipher f;
    private final byte[] g;
    private int h;

    static {
        String[] strArr = new String[6];
        String str = "}\u0011#\u000fel\f*\u001bt\\<4\u001et^\r%\u0012\u007f\u000e\u001d9\u000fx@\u001el\u0019tM\u000b5\reG\u0016\"G1";
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
                        i3 = 46;
                        break;
                    case ay.f /*1*/:
                        i3 = 121;
                        break;
                    case ay.n /*2*/:
                        i3 = 76;
                        break;
                    case ay.p /*3*/:
                        i3 = 125;
                        break;
                    default:
                        i3 = 17;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "f4\r>Bf8}";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "o+\u000fI";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "f4\r>Bf8}";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "}\u0011#\u000fel\f*\u001bt\\<4\u001et^\r%\u0012\u007f\u000e\u001d9\u000fx@\u001el\u0018\u007fM\u000b5\reG\u0016\"G1";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "o+\u000fI";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static void a(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    public OutputStream a(OutputStream outputStream) {
        return new DeflaterOutputStream(outputStream);
    }

    public byte[] a() {
        int i = this.c;
        this.c = i + 1;
        a(i, this.g);
        this.a.update(this.g, 0, this.g.length);
        return this.a.doFinal();
    }

    public u(byte[] bArr, byte[] bArr2) {
        Object e;
        boolean z = b.n;
        this.d = new byte[4];
        this.g = new byte[4];
        byte[] bArr3 = new byte[(bArr2.length + 1)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        bArr3[bArr2.length] = (byte) 1;
        Key a = a54.a(bArr, bArr3, 2, 160);
        bArr3[bArr2.length] = (byte) 2;
        Key a2 = a54.a(bArr, bArr3, 2, 160);
        bArr3[bArr2.length] = (byte) 3;
        Key a3 = a54.a(bArr, bArr3, 2, 160);
        bArr3[bArr2.length] = (byte) 4;
        Key a4 = a54.a(bArr, bArr3, 2, 160);
        try {
            this.b = Cipher.getInstance(z[1]);
            try {
                this.b.init(2, a3);
                byte[] bArr4 = new byte[768];
                try {
                    this.b.update(bArr4, 0, bArr4.length, bArr4, 0);
                    try {
                        this.a = Mac.getInstance(z[2]);
                        try {
                            this.a.init(a4);
                            try {
                                this.f = Cipher.getInstance(z[3]);
                                try {
                                    this.f.init(1, a);
                                    bArr4 = new byte[768];
                                    try {
                                        this.f.update(bArr4, 0, bArr4.length, bArr4, 0);
                                        try {
                                            this.e = Mac.getInstance(z[4]);
                                            try {
                                                this.e.init(a2);
                                                if (z) {
                                                    try {
                                                        boolean z2;
                                                        if (DialogToastActivity.i) {
                                                            z2 = false;
                                                        } else {
                                                            z2 = true;
                                                        }
                                                        DialogToastActivity.i = z2;
                                                    } catch (NoSuchAlgorithmException e2) {
                                                        throw e2;
                                                    }
                                                }
                                            } catch (InvalidKeyException e3) {
                                                throw new AssertionError(e3);
                                            }
                                        } catch (NoSuchAlgorithmException e22) {
                                            throw new AssertionError(e22);
                                        }
                                    } catch (ShortBufferException e4) {
                                        throw new AssertionError(e4);
                                    }
                                } catch (InvalidKeyException e32) {
                                    throw new AssertionError(e32);
                                }
                            } catch (NoSuchAlgorithmException e5) {
                                e = e5;
                                throw new AssertionError(e);
                            } catch (NoSuchPaddingException e6) {
                                e = e6;
                                throw new AssertionError(e);
                            }
                        } catch (InvalidKeyException e322) {
                            throw new AssertionError(e322);
                        }
                    } catch (NoSuchAlgorithmException e222) {
                        throw new AssertionError(e222);
                    }
                } catch (ShortBufferException e42) {
                    throw new AssertionError(e42);
                }
            } catch (InvalidKeyException e3222) {
                throw new AssertionError(e3222);
            }
        } catch (NoSuchAlgorithmException e7) {
            e = e7;
            throw new AssertionError(e);
        } catch (NoSuchPaddingException e8) {
            e = e8;
            throw new AssertionError(e);
        }
    }

    public byte[] b() {
        int i = this.h;
        this.h = i + 1;
        a(i, this.d);
        this.e.update(this.d, 0, this.d.length);
        return this.e.doFinal();
    }

    public void b(byte[] bArr, int i, int i2) {
        this.a.update(bArr, i, i2);
        try {
            this.b.update(bArr, i, i2, bArr, i);
        } catch (Throwable e) {
            if (VERSION.SDK_INT >= 9) {
                throw new IOException(e);
            }
            throw new IOException(z[0] + e.getMessage());
        } catch (ShortBufferException e2) {
            throw e2;
        }
    }

    public void a(byte[] bArr, int i, int i2) {
        try {
            this.f.update(bArr, i, i2, bArr, i);
            this.e.update(bArr, i, i2);
        } catch (Throwable e) {
            if (VERSION.SDK_INT >= 9) {
                throw new IOException(e);
            }
            throw new IOException(z[5] + e.getMessage());
        } catch (ShortBufferException e2) {
            throw e2;
        }
    }

    public InputStream a(InputStream inputStream) {
        return new InflaterInputStream(inputStream);
    }
}
