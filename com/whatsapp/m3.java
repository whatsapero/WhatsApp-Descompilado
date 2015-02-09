package com.whatsapp;

import com.google.c5;
import com.google.c8;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public abstract class m3 {
    public static int d;
    private static final String[] z;
    public int a;
    public String b;
    public long c;
    public String e;

    static {
        String[] strArr = new String[6];
        String str = "VD|}rV_=y{ZEwgfXIw{<_Bv&}@G~";
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
                        i3 = 53;
                        break;
                    case ay.f /*1*/:
                        i3 = 43;
                        break;
                    case ay.n /*2*/:
                        i3 = 18;
                        break;
                    case ay.p /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 19;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0015^|zvPEMd`Rtqff[_/";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "oq";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "VD|}rV_=o|GFs}gPY?lkVNb}zZE2gfX\u0011";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "VD|}rV_=o|GFs}gPY?`}\\_?lkVNb}zZE2gfX\u0011";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "_Bv4";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String a() {
        return b(this.e);
    }

    public static String a(String str) {
        String str2 = '+' + str;
        try {
            c8 a = c8.a();
            str2 = a.a(a.c(str2, z[3]), c5.INTERNATIONAL);
        } catch (Exception e) {
            Log.e(z[4] + str2 + " " + e.getMessage());
        } catch (ExceptionInInitializerError e2) {
            Log.e(z[5] + str2 + " " + e2.getMessage());
        }
        return str2;
    }

    protected m3() {
        this.b = null;
        this.e = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(java.lang.String r3) {
        /*
        r2 = 0;
        if (r3 != 0) goto L_0x000c;
    L_0x0003:
        r0 = z;
        r0 = r0[r2];
        com.whatsapp.util.Log.w(r0);
        r3 = 0;
    L_0x000b:
        return r3;
    L_0x000c:
        r0 = 64;
        r0 = r3.indexOf(r0);
        r1 = -1;
        if (r0 == r1) goto L_0x000b;
    L_0x0015:
        r1 = com.whatsapp.m8.e(r3);
        if (r1 == 0) goto L_0x002e;
    L_0x001b:
        r0 = "-";
        r0 = r3.indexOf(r0);
        r0 = r0 + 1;
        r1 = "@";
        r1 = r3.lastIndexOf(r1);
        r3 = r3.substring(r0, r1);
        goto L_0x000b;
    L_0x002e:
        r0 = r3.substring(r2, r0);
        r1 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r0);
        if (r1 == 0) goto L_0x0059;
    L_0x0038:
        r1 = com.whatsapp.bd.b(r3);
        if (r1 != 0) goto L_0x0046;
    L_0x003e:
        r0 = a(r0);
        r1 = d;
        if (r1 == 0) goto L_0x0059;
    L_0x0046:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "+";
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
    L_0x0059:
        r3 = r0;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m3.b(java.lang.String):java.lang.String");
    }

    public String toString() {
        return z[1] + this.e + z[2] + this.a;
    }

    protected m3(String str) {
        this.b = null;
        this.e = str;
    }

    protected m3(String str, String str2, long j) {
        this.b = null;
        this.e = str;
        this.b = str2;
        this.c = j;
    }
}
