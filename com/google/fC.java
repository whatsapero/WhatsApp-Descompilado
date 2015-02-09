package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class fc extends Exception {
    private static final long serialVersionUID = 5750205775490483148L;
    private static final String[] z;
    private final String a;
    private final eb b;
    private final String c;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "1x".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 11;
                    break;
                case ay.f /*1*/:
                    i2 = 88;
                    break;
                case ay.n /*2*/:
                    i2 = 22;
                    break;
                case ay.p /*3*/:
                    i2 = 38;
                    break;
                default:
                    i2 = 121;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "1x".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 11;
                    break;
                case ay.f /*1*/:
                    i2 = 88;
                    break;
                case ay.n /*2*/:
                    i2 = 22;
                    break;
                case ay.p /*3*/:
                    i2 = 38;
                    break;
                default:
                    i2 = 121;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    private fc(cn cnVar, String str) {
        super(cnVar.a() + z[1] + str);
        this.a = cnVar.a();
        this.b = cnVar.d();
        this.c = str;
    }

    public String a() {
        return this.a;
    }

    private fc(dh dhVar, String str, Throwable th) {
        this(dhVar, str);
        initCause(th);
    }

    fc(cn cnVar, String str, bA bAVar) {
        this(cnVar, str);
    }

    private fc(dh dhVar, String str) {
        super(dhVar.b() + z[0] + str);
        this.a = dhVar.b();
        this.b = dhVar.d();
        this.c = str;
    }

    public eb c() {
        return this.b;
    }

    fc(dh dhVar, String str, bA bAVar) {
        this(dhVar, str);
    }

    fc(dh dhVar, String str, Throwable th, bA bAVar) {
        this(dhVar, str, th);
    }

    public String b() {
        return this.c;
    }
}
