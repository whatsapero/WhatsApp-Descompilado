package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class j7 implements Runnable {
    private static final String[] z;
    final ChangeNumber a;

    static {
        String[] strArr = new String[10];
        String str = "A\u000b\u007f\u0016{G\rk\u0015~G\u00111\u000byV\u0000}\btM\r{\u0016iOLx\u0019uN\u0006z";
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
                        i3 = 34;
                        break;
                    case ay.f /*1*/:
                        i3 = 99;
                        break;
                    case ay.n /*2*/:
                        i3 = 30;
                        break;
                    case ay.p /*3*/:
                        i3 = 120;
                        break;
                    default:
                        i3 = 28;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "A\fsVkJ\u0002j\u000b}R\u00130.yP\nx\u0001OO\u00100\u001btC\ry\u001drW\u000e|\u001dn";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "A\fsVkJ\u0002j\u000b}R\u00130.yP\nx\u0001OO\u00100\u000byP\u0015{\noG\rz";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "A\u0000";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "O\u0006";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "A\fsVkJ\u0002j\u000b}R\u00130.yP\nx\u0001OO\u00100\nsC\u000ew\u0016{";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "A\fsVkJ\u0002j\u000b}R\u00130.yP\nx\u0001OO\u00100\u000byP\u0015{\noG\rz";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "R\u000b";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "A\fsVkJ\u0002j\u000b}R\u0013A\bnG\u0005{\nyL\u0000{\u000b";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "A\u000b\u007f\u0016{G\rk\u0015~G\u00111\u000esK\u0000{";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r8_this = this;
        r7 = 0;
        r6 = 4;
        r5 = 1;
        r4 = 0;
        com.whatsapp.App.i();
        com.whatsapp.App.ah();
        com.whatsapp.App.an = r7;
        r0 = new java.io.File;
        r1 = com.whatsapp.App.p;
        r1 = r1.getFilesDir();
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r0.<init>(r1, r2);
        r0.delete();
        com.whatsapp.a54.E();
        r0 = com.whatsapp.App.p;
        com.whatsapp.App.f(r0, r7);
        r0 = r8.a;
        com.whatsapp.App.d(r0, r6);
        r0 = r8.a;
        r1 = z;
        r2 = 9;
        r1 = r1[r2];
        r0 = r0.getSharedPreferences(r1, r4);
        r0 = r0.edit();
        r1 = z;
        r1 = r1[r6];
        r2 = com.whatsapp.EnterPhoneNumber.u;
        r0.putString(r1, r2);
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        r2 = com.whatsapp.EnterPhoneNumber.x;
        r0.putString(r1, r2);
        r0 = r0.commit();
        if (r0 != 0) goto L_0x005d;
    L_0x0056:
        r0 = z;
        r0 = r0[r4];
        com.whatsapp.util.Log.e(r0);
    L_0x005d:
        r0 = new android.content.Intent;
        r1 = r8.a;
        r2 = com.whatsapp.VerifySms.class;
        r0.<init>(r1, r2);
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        r2 = r8.a;
        r2 = r2.v;
        r0.putExtra(r1, r2);
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r2 = r8.a;
        r2 = r2.n;
        r0.putExtra(r1, r2);
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0.putExtra(r1, r5);
        r1 = r8.a;
        r1 = r1.f();
        if (r1 == 0) goto L_0x009e;
    L_0x008e:
        r1 = z;
        r2 = 7;
        r1 = r1[r2];
        r2 = r8.a;
        r2 = r2.v;
        r0.putExtra(r1, r2);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x00a5;
    L_0x009e:
        r1 = z;
        r1 = r1[r5];
        com.whatsapp.util.Log.i(r1);
    L_0x00a5:
        r1 = r8.a;
        r1.startActivity(r0);
        r0 = r8.a;
        r0.finish();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.j7.run():void");
    }

    j7(ChangeNumber changeNumber) {
        this.a = changeNumber;
    }
}
