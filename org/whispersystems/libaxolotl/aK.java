package org.whispersystems.libaxolotl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ecc.a;
import org.whispersystems.libaxolotl.ecc.d;
import org.whispersystems.libaxolotl.ecc.f;

public class ak {
    private static final String z;

    static {
        char[] toCharArray = "\u0019Ry\u0006;+HD\u00103:".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 58;
                    break;
                case ay.n /*2*/:
                    i2 = 16;
                    break;
                case ay.p /*3*/:
                    i2 = 117;
                    break;
                default:
                    i2 = 75;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public static void a(bn bnVar, int i, ac acVar) {
        int i2 = z.e;
        try {
            bnVar.d(i);
            bnVar.b(acVar.b());
            bnVar.a(acVar.a().b());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (i >= 3) {
                byteArrayOutputStream.write(a());
            }
            try {
                byteArrayOutputStream.write(d.a(acVar.b().a(), acVar.e().a()));
                byteArrayOutputStream.write(d.a(acVar.g(), acVar.a().a()));
                byteArrayOutputStream.write(d.a(acVar.g(), acVar.e().a()));
                if (i >= 3 && acVar.d().b()) {
                    byteArrayOutputStream.write(d.a(acVar.g(), ((a) acVar.d().c()).a()));
                }
                Y a = a(i, byteArrayOutputStream.toByteArray());
                bnVar.a(acVar.c(), a.a());
                bnVar.a(a.b());
                try {
                    if (bD.m) {
                        z.e = i2 + 1;
                    }
                } catch (IOException e) {
                    throw e;
                }
            } catch (IOException e2) {
                throw e2;
            } catch (IOException e22) {
                throw e22;
            }
        } catch (IOException e222) {
            throw e222;
        } catch (IOException e2222) {
            throw new AssertionError(e2222);
        }
    }

    private static byte[] a() {
        byte[] bArr = new byte[32];
        Arrays.fill(bArr, (byte) -1);
        return bArr;
    }

    public static void a(bn bnVar, int i, bN bNVar) {
        int i2 = z.e;
        try {
            int i3;
            bnVar.d(i);
            bnVar.b(bNVar.f());
            bnVar.a(bNVar.b().b());
            a a = d.a();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (i >= 3) {
                byteArrayOutputStream.write(a());
            }
            byteArrayOutputStream.write(d.a(bNVar.d(), bNVar.b().a()));
            byteArrayOutputStream.write(d.a(bNVar.f().a(), bNVar.e().a()));
            byteArrayOutputStream.write(d.a(bNVar.d(), bNVar.e().a()));
            if (i >= 3) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if ((i3 & bNVar.a().b()) != 0) {
                byteArrayOutputStream.write(d.a((f) bNVar.a().c(), bNVar.e().a()));
            }
            Y a2 = a(i, byteArrayOutputStream.toByteArray());
            am a3 = a2.b().a(bNVar.c(), a);
            bnVar.a(bNVar.c(), a2.a());
            bnVar.a(a, (z) a3.b());
            bnVar.a((aX) a3.a());
            if (i2 != 0) {
                try {
                    boolean z;
                    if (bD.m) {
                        z = false;
                    } else {
                        z = true;
                    }
                    bD.m = z;
                } catch (IOException e) {
                    throw e;
                }
            }
        } catch (IOException e2) {
            throw e2;
        } catch (IOException e22) {
            throw e22;
        } catch (IOException e222) {
            throw e222;
        } catch (IOException e2222) {
            throw new AssertionError(e2222);
        }
    }

    private static Y a(int i, byte[] bArr) {
        aZ a = aZ.a(i);
        byte[][] c = aE.c(a.a(bArr, z.getBytes(), 64), 32, 32);
        return new Y(new aX(a, c[0]), new z(a, c[1], 0), null);
    }
}
