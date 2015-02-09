package com.whatsapp.camera;

import com.whatsapp.util.ar;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class o extends ar {
    private static final String[] z;
    final CameraActivity b;

    static {
        String[] strArr = new String[6];
        String str = "tY4\t\u0004-\u001a";
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
                        i3 = 2;
                        break;
                    case ay.f /*1*/:
                        i3 = 48;
                        break;
                    case ay.n /*2*/:
                        i3 = 80;
                        break;
                    case ay.p /*3*/:
                        i3 = 108;
                        break;
                    default:
                        i3 = 107;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "c^4\u001e\u0004kT~\u0005\u0005vU>\u0018EgH$\u001e\n,c\u0004>.C}";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "q[9\u001c4rB5\u001a\u0002gG";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "aQ \u0018\u0002m^";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "L_p\u001f\u001bcS5";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "aQ=\t\u0019cQ3\u0018\u0002tY$\u0015DqD?\u001c\u001dkT5\u0003\bc@$\u0019\u0019g\u0010";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    o(CameraActivity cameraActivity) {
        this.b = cameraActivity;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r12) {
        /*
        r11_this = this;
        r10 = 3;
        r9 = 1;
        r8 = 0;
        r7 = com.whatsapp.camera.CameraActivity.l;
        r0 = r11.b;
        r0 = com.whatsapp.camera.CameraActivity.a(r0);
        r0 = r0.getText();
        r6 = r0.toString();
        r0 = r11.b;
        r0 = com.whatsapp.camera.CameraActivity.w(r0);
        if (r0 == 0) goto L_0x0097;
    L_0x001b:
        r0 = r11.b;	 Catch:{ IOException -> 0x0046 }
        r1 = r11.b;	 Catch:{ IOException -> 0x0046 }
        r1 = com.whatsapp.camera.CameraActivity.w(r1);	 Catch:{ IOException -> 0x0046 }
        r1 = r1.e;	 Catch:{ IOException -> 0x0046 }
        r2 = r11.b;	 Catch:{ IOException -> 0x0046 }
        r2 = com.whatsapp.camera.CameraActivity.t(r2);	 Catch:{ IOException -> 0x0046 }
        r3 = 3;
        r4 = 0;
        r5 = 0;
        com.whatsapp.util.f.a(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ IOException -> 0x0046 }
    L_0x0031:
        r0 = r11.b;
        r1 = r11.b;
        r1 = com.whatsapp.camera.CameraActivity.t(r1);
        r1 = android.net.Uri.fromFile(r1);
        com.whatsapp.util.f.a(r0, r1);
        r0 = r11.b;
        r0.finish();
        return;
    L_0x0046:
        r0 = move-exception;
        r1 = r0.getMessage();	 Catch:{ IOException -> 0x00e2 }
        if (r1 == 0) goto L_0x006c;
    L_0x004d:
        r1 = r0.getMessage();	 Catch:{ IOException -> 0x00e4 }
        r2 = z;	 Catch:{ IOException -> 0x00e4 }
        r3 = 5;
        r2 = r2[r3];	 Catch:{ IOException -> 0x00e4 }
        r1 = r1.contains(r2);	 Catch:{ IOException -> 0x00e4 }
        if (r1 == 0) goto L_0x006c;
    L_0x005c:
        r1 = r11.b;	 Catch:{ IOException -> 0x00e6 }
        r2 = r11.b;	 Catch:{ IOException -> 0x00e6 }
        r3 = 2131624285; // 0x7f0e015d float:1.8875745E38 double:1.053162329E-314;
        r2 = r2.getString(r3);	 Catch:{ IOException -> 0x00e6 }
        com.whatsapp.App.a(r1, r2);	 Catch:{ IOException -> 0x00e6 }
        if (r7 == 0) goto L_0x0079;
    L_0x006c:
        r1 = r11.b;	 Catch:{ IOException -> 0x00e6 }
        r1 = r1.getBaseContext();	 Catch:{ IOException -> 0x00e6 }
        r2 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r3 = 0;
        com.whatsapp.App.b(r1, r2, r3);	 Catch:{ IOException -> 0x00e6 }
    L_0x0079:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r9];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        if (r7 == 0) goto L_0x0031;
    L_0x0097:
        r1 = new android.content.Intent;
        r0 = r11.b;
        r0 = r0.getBaseContext();
        r2 = com.whatsapp.ContactPicker.class;
        r1.<init>(r0, r2);
        r0 = z;
        r0 = r0[r8];
        r1.setType(r0);
        r0 = r11.b;
        r0 = com.whatsapp.camera.CameraActivity.t(r0);
        r0 = android.net.Uri.fromFile(r0);
        r2 = android.text.TextUtils.isEmpty(r6);
        if (r2 != 0) goto L_0x00cc;
    L_0x00bb:
        r0 = r0.buildUpon();
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r0 = r0.appendQueryParameter(r2, r6);
        r0 = r0.build();
    L_0x00cc:
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r1.putExtra(r2, r0);
        r0 = z;
        r0 = r0[r10];
        r1.putExtra(r0, r9);
        r0 = r11.b;
        r0.startActivity(r1);
        goto L_0x0031;
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e6 }
    L_0x00e6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.o.a(android.view.View):void");
    }
}
