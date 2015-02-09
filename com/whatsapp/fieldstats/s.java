package com.whatsapp.fieldstats;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class s {
    private static final String[] z;

    static {
        String[] strArr = new String[7];
        String str = "+^OWd";
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
                        i3 = 126;
                        break;
                    case ay.f /*1*/:
                        i3 = 10;
                        break;
                    case ay.n /*2*/:
                        i3 = 9;
                        break;
                    case ay.p /*3*/:
                        i3 = 122;
                        break;
                    default:
                        i3 = 92;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\ncd\u001f\u0011\u0017fe\u0013/^e|\u000e|\u0011l)\b=\u0010ml";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "-~{\u00132\u0019*h\u00148^Nf\u000f>\u0012o)\u001b.\u001b*}\u00129^eg\u0016%^y|\n,\u0011x}\u001f8^|h\u0016)\u001b*}\u0003,\u001by";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0017n)\u0015)\n*f\u001c|\fkg\u001d9";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\bke\u000f9^ih\u00142\u0011~)\u00189^d|\u00160";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "+^OWd";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "-~{\u00132\u0019*e\u001f2\u0019~aZ5\r*e\u00131\u0017~l\u001e|\ne)KlL>)/\b8'1Z>\u0007~l\t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static ByteBuffer a() {
        return ByteBuffer.allocate(16);
    }

    public static void a(byte b, int i, long j, String str, ByteBuffer byteBuffer) {
        a(b, i, j, (Object) str, byteBuffer);
    }

    public static void a(byte b, int i, long j, Double d, ByteBuffer byteBuffer) {
        a(b, i, j, (Object) d, byteBuffer);
    }

    public static ByteBuffer b() {
        return ByteBuffer.allocate(1034);
    }

    private static void a(byte b, int i, long j, Object obj, ByteBuffer byteBuffer) {
        if (obj == null) {
            try {
                throw new NullPointerException(z[5]);
            } catch (UnsupportedEncodingException e) {
                throw e;
            }
        }
        try {
            if ((obj instanceof Double) || (obj instanceof String)) {
                if (obj instanceof String) {
                    try {
                        if (((String) obj).getBytes(z[0]).length > 1024) {
                            throw new IllegalArgumentException(z[1]);
                        }
                    } catch (NullPointerException e2) {
                        throw e2;
                    } catch (Throwable e3) {
                        throw new Error(e3);
                    }
                }
                if (i < 0 || i >= 16777216) {
                    try {
                        throw new IllegalArgumentException(z[4]);
                    } catch (UnsupportedEncodingException e4) {
                        throw e4;
                    }
                }
                try {
                    if (j / 1000 < 0 || j / 1000 >= 4294967296L) {
                        throw new IllegalArgumentException(z[2]);
                    }
                    byteBuffer.put(b);
                    byteBuffer.put((byte) i);
                    byteBuffer.put((byte) (i >> 8));
                    byteBuffer.put((byte) (i >> 16));
                    int i2 = (int) (j / 1000);
                    byteBuffer.put((byte) i2);
                    byteBuffer.put((byte) (i2 >> 8));
                    byteBuffer.put((byte) (i2 >> 16));
                    byteBuffer.put((byte) (i2 >> 24));
                    try {
                        if (obj instanceof String) {
                            try {
                                byte[] bytes = ((String) obj).getBytes(z[6]);
                                byteBuffer.put((byte) bytes.length);
                                byteBuffer.put((byte) (bytes.length >> 8));
                                byteBuffer.put(bytes);
                                if (a1.a == 0) {
                                    return;
                                }
                            } catch (Throwable e32) {
                                throw new Error(e32);
                            }
                        }
                        if (obj instanceof Double) {
                            long doubleToRawLongBits = Double.doubleToRawLongBits(((Double) obj).doubleValue());
                            byteBuffer.put((byte) ((int) doubleToRawLongBits));
                            byteBuffer.put((byte) ((int) (doubleToRawLongBits >> 8)));
                            byteBuffer.put((byte) ((int) (doubleToRawLongBits >> 16)));
                            byteBuffer.put((byte) ((int) (doubleToRawLongBits >> 24)));
                            byteBuffer.put((byte) ((int) (doubleToRawLongBits >> 32)));
                            byteBuffer.put((byte) ((int) (doubleToRawLongBits >> 40)));
                            byteBuffer.put((byte) ((int) (doubleToRawLongBits >> 48)));
                            byteBuffer.put((byte) ((int) (doubleToRawLongBits >> 56)));
                            return;
                        }
                        return;
                    } catch (UnsupportedEncodingException e42) {
                        throw e42;
                    }
                } catch (UnsupportedEncodingException e422) {
                    throw e422;
                } catch (UnsupportedEncodingException e4222) {
                    throw e4222;
                }
            }
            throw new IllegalArgumentException(z[3]);
        } catch (UnsupportedEncodingException e42222) {
            throw e42222;
        } catch (UnsupportedEncodingException e422222) {
            throw e422222;
        }
    }
}
