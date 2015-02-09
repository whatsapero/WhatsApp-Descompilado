package com.google;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class c implements eR {
    private static final aC a;
    private static final String[] z;

    public Object a(byte[] bArr, aC aCVar) {
        return a(bArr, aCVar);
    }

    public a1 b(InputStream inputStream, aC aCVar) {
        return a(c(inputStream, aCVar));
    }

    public Object b(InputStream inputStream, aC aCVar) {
        return b(inputStream, aCVar);
    }

    public Object a(g2 g2Var, aC aCVar) {
        return a(g2Var, aCVar);
    }

    public a1 a(g2 g2Var) {
        return b(g2Var, a);
    }

    public a1 c(InputStream inputStream, aC aCVar) {
        I a = I.a(inputStream);
        a1 a1Var = (a1) a(a, aCVar);
        try {
            a.b(0);
            return a1Var;
        } catch (gc e) {
            throw e.a(a1Var);
        }
    }

    public Object a(InputStream inputStream) {
        return b(inputStream);
    }

    public a1 a(I i, aC aCVar) {
        return a((a1) a(i, aCVar));
    }

    public Object a(I i) {
        return a(i);
    }

    public Object b(InputStream inputStream) {
        return a(inputStream);
    }

    public a1 b(g2 g2Var, aC aCVar) {
        return a(a(g2Var, aCVar));
    }

    public Object a(InputStream inputStream, aC aCVar) {
        return a(inputStream, aCVar);
    }

    public Object a(byte[] bArr) {
        return a(bArr);
    }

    private a2 b(a1 a1Var) {
        try {
            return a1Var instanceof dP ? ((dP) a1Var).a() : new a2(a1Var);
        } catch (a2 e) {
            throw e;
        }
    }

    public Object b(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public a1 d(InputStream inputStream, aC aCVar) {
        try {
            int read = inputStream.read();
            return read == -1 ? null : c(new ew(inputStream, I.a(read, inputStream)), aCVar);
        } catch (IOException e) {
            throw new gc(e.getMessage());
        }
    }

    public a1 b(InputStream inputStream) {
        return b(inputStream, a);
    }

    public Object b(g2 g2Var, aC aCVar) {
        return b(g2Var, aCVar);
    }

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "kKz?\bWI;=\u0013VC;:A{Wo>2M\\r5\u0006\u0019Zs)\u0004N\u000ez5Apa^#\u0002\\^o2\u000eW\u000e3(\tV[w?AWKm>\u0013\u0019Fz+\u0011\\@2u".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 57;
                    break;
                case ay.f /*1*/:
                    i2 = 46;
                    break;
                case ay.n /*2*/:
                    i2 = 27;
                    break;
                case ay.p /*3*/:
                    i2 = 91;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "kKz?\bWI;=\u0013VC;:A[Wo>AX\\i:\u0018\u0019Zs)\u0004N\u000ez5Apa^#\u0002\\^o2\u000eW\u000e3(\tV[w?AWKm>\u0013\u0019Fz+\u0011\\@2u".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 57;
                    break;
                case ay.f /*1*/:
                    i2 = 46;
                    break;
                case ay.n /*2*/:
                    i2 = 27;
                    break;
                case ay.p /*3*/:
                    i2 = 91;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
        a = aC.a();
    }

    public a1 a(g2 g2Var, aC aCVar) {
        a1 a1Var;
        try {
            I a = g2Var.a();
            a1Var = (a1) a(a, aCVar);
            a.b(0);
            return a1Var;
        } catch (gc e) {
            throw e.a(a1Var);
        } catch (Throwable e2) {
            throw new RuntimeException(z[0], e2);
        } catch (gc e3) {
            throw e3;
        }
    }

    public a1 a(byte[] bArr, int i, int i2, aC aCVar) {
        a1 a1Var;
        try {
            I a = I.a(bArr, i, i2);
            a1Var = (a1) a(a, aCVar);
            a.b(0);
            return a1Var;
        } catch (gc e) {
            throw e.a(a1Var);
        } catch (Throwable e2) {
            throw new RuntimeException(z[1], e2);
        } catch (gc e3) {
            throw e3;
        }
    }

    public a1 b(byte[] bArr, int i, int i2, aC aCVar) {
        return a(a(bArr, i, i2, aCVar));
    }

    public a1 a(byte[] bArr, aC aCVar) {
        return b(bArr, 0, bArr.length, aCVar);
    }

    public Object a(g2 g2Var) {
        return a(g2Var);
    }

    public a1 a(InputStream inputStream, aC aCVar) {
        return a(d(inputStream, aCVar));
    }

    public a1 a(InputStream inputStream) {
        return a(inputStream, a);
    }

    private a1 a(a1 a1Var) {
        if (a1Var != null) {
            try {
                if (!a1Var.a()) {
                    throw b(a1Var).b().a(a1Var);
                }
            } catch (a2 e) {
                throw e;
            }
        }
        return a1Var;
    }

    public a1 a(I i) {
        return a(i, a);
    }

    public a1 a(byte[] bArr) {
        return a(bArr, a);
    }
}
