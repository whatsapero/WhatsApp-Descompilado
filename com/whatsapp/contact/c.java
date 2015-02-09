package com.whatsapp.contact;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum c {
    ;
    public static final c BACKGROUND_DELTA;
    public static final c BACKGROUND_FULL;
    public static final c INTERACTIVE_DELTA;
    public static final c INTERACTIVE_FULL;
    public static final c REGISTRATION_FULL;
    private static final String[] z;
    private final l a;
    private final n b;

    public String getSyncMode() {
        return this.a.getModeString();
    }

    public String getSyncContext() {
        return this.b.getContextString();
    }

    private static c a(n nVar, l lVar) {
        boolean z = i.a;
        c[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            c cVar = values[i];
            try {
                if (cVar.b == nVar) {
                    if (cVar.a == lVar) {
                        return cVar;
                    }
                }
                i++;
                if (z) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        throw new IllegalArgumentException(z[0] + nVar + "/" + lVar + z[1]);
    }

    public boolean isFullSync() {
        try {
            return this.a == l.FULL;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static {
        String[] strArr = new String[7];
        String str = "Z\\O\u0005$aG\u000e<.}V\u0001Y";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 25;
                        break;
                    case ay.f /*1*/:
                        i4 = 51;
                        break;
                    case ay.n /*2*/:
                        i4 = 33;
                        break;
                    case ay.p /*3*/:
                        i4 = 113;
                        break;
                    default:
                        i4 = 65;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "Kvf8\u0012Ma`%\bV}~7\u0014U\u007f";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "P}u4\u0013Xpu8\u0017\\le4\rMr";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "[rb:\u0006K|t?\u0005Fwd=\u0015X";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "P}u4\u0013Xpu8\u0017\\lg$\rU";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "[rb:\u0006K|t?\u0005Fut=\r";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    REGISTRATION_FULL = new c(z[2], 0, n.REGISTRATION, l.FULL);
                    INTERACTIVE_FULL = new c(z[5], 1, n.INTERACTIVE, l.FULL);
                    INTERACTIVE_DELTA = new c(z[3], 2, n.INTERACTIVE, l.DELTA);
                    BACKGROUND_FULL = new c(z[6], 3, n.BACKGROUND, l.FULL);
                    BACKGROUND_DELTA = new c(z[4], 4, n.BACKGROUND, l.DELTA);
                    c = new c[]{REGISTRATION_FULL, INTERACTIVE_FULL, INTERACTIVE_DELTA, BACKGROUND_FULL, BACKGROUND_DELTA};
                default:
                    strArr2[i2] = str;
                    str = "0\u0013E\u001eaw\\UQ3|CS\u00142|]UQ 9AD\u0012.~]H\u000b$}\u0013r\b/zgX\u0001$";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private c(n nVar, l lVar) {
        this.b = nVar;
        this.a = lVar;
    }

    public static c combine(c cVar, c cVar2) {
        if (cVar == cVar2 || cVar2 == null) {
            return cVar;
        }
        if (cVar == null) {
            return cVar2;
        }
        n nVar = cVar.b;
        Enum enumR = cVar2.b;
        try {
            if (nVar.compareTo(enumR) >= 0) {
                Enum enumR2 = enumR;
            }
            l lVar = cVar.a;
            Enum enumR3 = cVar2.a;
            try {
                if (lVar.compareTo(enumR3) >= 0) {
                    enumR = enumR3;
                }
                return a(nVar, lVar);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }
}
