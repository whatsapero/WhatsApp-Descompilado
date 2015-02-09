package com.whatsapp.camera;

import android.net.Uri;
import com.whatsapp.util.ar;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class m extends ar {
    private static final String[] z;
    final Uri b;
    final CameraActivity c;

    static {
        String[] strArr = new String[8];
        String str = "Dp\u001e-fF";
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
                        i3 = 39;
                        break;
                    case ay.f /*1*/:
                        i3 = 17;
                        break;
                    case ay.n /*2*/:
                        i3 = 115;
                        break;
                    case ay.p /*3*/:
                        i3 = 72;
                        break;
                    default:
                        i3 = 20;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "A}\u001a89O";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "F\u007f\u0017:{Nu]!zSt\u001d<:Bi\u0007:u\tB'\u001aQf\\";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "U~\u0007)`N~\u001d";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "A}\u001a89O";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Tz\u001a8KWc\u0016>}Bf";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "N|\u0012/q\b;";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "Dp\u0003<}H\u007f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r8) {
        /*
        r7_this = this;
        r6 = 1;
        r4 = 8;
        r5 = 0;
        r1 = com.whatsapp.camera.CameraActivity.l;
        r0 = r7.c;
        r2 = 2131427569; // 0x7f0b00f1 float:1.8476758E38 double:1.0530651384E-314;
        r0 = r0.findViewById(r2);
        r0.setVisibility(r4);
        r0 = r7.c;
        r2 = 2131427570; // 0x7f0b00f2 float:1.847676E38 double:1.053065139E-314;
        r0 = r0.findViewById(r2);
        r0.setVisibility(r4);
        r0 = r7.c;
        r0 = com.whatsapp.camera.CameraActivity.a(r0);
        r0 = r0.getText();
        r0 = r0.toString();
        r2 = com.whatsapp.util.a5.a(r0);
        r0 = r7.c;
        r0 = com.whatsapp.camera.CameraActivity.c(r0);
        if (r0 != 0) goto L_0x00ee;
    L_0x0038:
        r0 = r7.b;
    L_0x003a:
        r0 = r0.buildUpon();
        r3 = android.text.TextUtils.isEmpty(r2);
        if (r3 != 0) goto L_0x0056;
    L_0x0044:
        r3 = z;
        r3 = r3[r6];
        r0.appendQueryParameter(r3, r2);
        r2 = r7.c;
        r2 = com.whatsapp.camera.CameraActivity.a(r2);
        r2.setEnabled(r5);
        if (r1 == 0) goto L_0x0062;
    L_0x0056:
        r2 = r7.c;
        r3 = 2131427567; // 0x7f0b00ef float:1.8476754E38 double:1.0530651375E-314;
        r2 = r2.findViewById(r3);
        r2.setVisibility(r4);
    L_0x0062:
        r2 = r7.c;
        r2 = com.whatsapp.camera.CameraActivity.i(r2);
        if (r2 == 0) goto L_0x007c;
    L_0x006a:
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r3 = r7.c;
        r3 = com.whatsapp.camera.CameraActivity.i(r3);
        r3 = java.lang.Integer.toString(r3);
        r0.appendQueryParameter(r2, r3);
    L_0x007c:
        r2 = r7.b;
        r3 = z;
        r4 = 5;
        r3 = r3[r4];
        r2 = r2.getQueryParameter(r3);
        if (r2 == 0) goto L_0x0093;
    L_0x0089:
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r3 = "1";
        r0.appendQueryParameter(r2, r3);
    L_0x0093:
        r0 = r0.build();
        r2 = r7.c;
        r2 = com.whatsapp.camera.CameraActivity.w(r2);
        if (r2 == 0) goto L_0x00b7;
    L_0x009f:
        r2 = r7.c;
        r3 = 2131427577; // 0x7f0b00f9 float:1.8476774E38 double:1.0530651424E-314;
        r2 = r2.findViewById(r3);
        r2.setVisibility(r5);
        r2 = new com.whatsapp.camera.a3;
        r2.<init>(r7, r0);
        r3 = new java.lang.Void[r5];
        com.whatsapp.a5w.a(r2, r3);
        if (r1 == 0) goto L_0x00e6;
    L_0x00b7:
        r1 = new android.content.Intent;
        r2 = r7.c;
        r2 = r2.getBaseContext();
        r3 = com.whatsapp.ContactPicker.class;
        r1.<init>(r2, r3);
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        r1.setType(r2);
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1.putExtra(r2, r0);
        r0 = z;
        r2 = 6;
        r0 = r0[r2];
        r1.putExtra(r0, r6);
        r0 = r7.c;
        r0.startActivity(r1);
        r0 = r7.c;
        r0.finish();
    L_0x00e6:
        r0 = r7.c;
        r1 = r7.b;
        com.whatsapp.util.f.a(r0, r1);
        return;
    L_0x00ee:
        r0 = z;
        r0 = r0[r5];
        r0 = com.whatsapp.App.t(r0);
        r0 = android.net.Uri.fromFile(r0);
        goto L_0x003a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.m.a(android.view.View):void");
    }

    m(CameraActivity cameraActivity, Uri uri) {
        this.c = cameraActivity;
        this.b = uri;
    }
}
