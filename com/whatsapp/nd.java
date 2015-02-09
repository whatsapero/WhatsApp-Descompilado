package com.whatsapp;

import android.content.Intent;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class nd {
    private static final String[] z;
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    static {
        String[] strArr = new String[19];
        String str = " \\c\nF`\u0019-";
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
                        i3 = 12;
                        break;
                    case ay.f /*1*/:
                        i3 = 124;
                        break;
                    case ay.n /*2*/:
                        i3 = 16;
                        break;
                    case ay.p /*3*/:
                        i3 = 105;
                        break;
                    default:
                        i3 = 39;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = " \\`\fUo\u0019~\u001d\u001a";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = " \\|\fQi\u0010-";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = " \\`\u0005Rk\u001bu\r\u001a";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "o\u0013|\r";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "y\u0012c\u0019Bo\u0015v\u0000Bh#v\bN`\tb\f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "c\nu\u001bOi\u001dd";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "k\u0013\u007f\r";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "c\nu\u001bxz\u0013|\u001dFk\u0019";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "c\bx\fU$";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "y\u0012{\u0007H{\u0012";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    str = "h\u0019q\r";
                    obj = 11;
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    strArr2 = strArr3;
                    str = "\u007f\u001fq\u0005B";
                    obj = 12;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "m\u0012t\u001bHe\u0018>\u0000Ix\u0019~\u001d\tm\u001fd\u0000HbRR(sX9B0xO4Q'`I8";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "|\u0010e\u000e@i\u0018";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    str = "`\u0019f\fK";
                    obj = 15;
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    strArr2 = strArr3;
                    str = "E\u0012d\fIx\\}\u001cTx\\r\f\u0007m\u0012t\u001bHe\u0018>\u0000Ix\u0019~\u001d\tm\u001fd\u0000HbRR(sX9B0xO4Q'`I8";
                    obj = 16;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "d\u0019q\u0005Sd";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "N\u001dd\u001dB~\u0005S\u0001Fb\u001bu\u0012Oi\u001d|\u001dO1";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean a() {
        double d = d();
        try {
            return b() || (d != Double.NaN && d > 20.0d);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            try {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
    }

    public double d() {
        try {
            if (this.b >= 0) {
                if (this.a > 0) {
                    return (((double) this.b) * 100.0d) / ((double) this.a);
                }
            }
            try {
                return Double.NaN;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String c() {
        /*
        r3_this = this;
        r1 = com.whatsapp.bz.a;
        r0 = r3.d;
        switch(r0) {
            case 1: goto L_0x0027;
            case 2: goto L_0x002f;
            case 3: goto L_0x0037;
            case 4: goto L_0x003e;
            case 5: goto L_0x0046;
            case 6: goto L_0x004e;
            case 7: goto L_0x0055;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 10;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r3.d;
        r0 = r0.append(r1);
        r1 = 41;
        r0 = r0.append(r1);
        r0 = r0.toString();
    L_0x0026:
        return r0;
    L_0x0027:
        r0 = z;
        r2 = 11;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0026;
    L_0x002f:
        r0 = z;
        r2 = 8;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0026;
    L_0x0037:
        r0 = z;
        r2 = 7;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0026;
    L_0x003e:
        r0 = z;
        r2 = 12;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0026;
    L_0x0046:
        r0 = z;
        r2 = 9;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0026;
    L_0x004e:
        r0 = z;
        r2 = 6;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0026;
    L_0x0055:
        r0 = z;
        r2 = 5;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0026;
    L_0x005c:
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.nd.c():java.lang.String");
    }

    public nd(Intent intent) {
        boolean z = false;
        boolean z2 = bz.a;
        if (z[14].equals(intent.getAction())) {
            try {
                this.d = intent.getIntExtra(z[18], 1);
                this.b = intent.getIntExtra(z[16], -1);
                this.c = intent.getIntExtra(z[15], 0);
                this.a = intent.getIntExtra(z[13], -1);
                if (z2) {
                    if (!DialogToastActivity.i) {
                        z = true;
                    }
                    DialogToastActivity.i = z;
                    return;
                }
                return;
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        throw new IllegalArgumentException(z[17]);
    }

    public String toString() {
        boolean z = false;
        boolean z2 = bz.a;
        try {
            String str = z[1] + c() + z[3] + this.b + z[4] + this.c + z[0] + this.a + z[2] + d() + '}';
            if (DialogToastActivity.i) {
                if (!z2) {
                    z = true;
                }
                bz.a = z;
            }
            return str;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public boolean b() {
        try {
            return this.c != 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
