package com.whatsapp.camera;

import android.hardware.Camera.ErrorCallback;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class j implements ErrorCallback {
    private static final String[] z;
    final CameraView a;

    static {
        String[] strArr = new String[5];
        String str = "\f N^\u0002B3_\\\bX!]PQ";
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
                        i3 = 44;
                        break;
                    case ay.f /*1*/:
                        i3 = 84;
                        break;
                    case ay.n /*2*/:
                        i3 = 47;
                        break;
                    case ay.p /*3*/:
                        i3 = 53;
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
                    str = "O5BP\u0019M\"FP\u001c\u0003'[T\u0019X7NX\u000e^5\u000f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\f&JV\u0004^0F[\f\u0016";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\f=AE\u0019I\"FP\u001c\u0016";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "O5BP\u0019M\"FP\u001c\u0003'[T\u0019X7NX\u000e^5\u000fV\nA1]TKI&]Z\u0019\u0016";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    j(CameraView cameraView) {
        this.a = cameraView;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(int r4, android.hardware.Camera r5) {
        /*
        r3_this = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r4);
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r3.a;
        r1 = com.whatsapp.camera.CameraView.a(r1);
        r0 = r0.append(r1);
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r3.a;
        r1 = com.whatsapp.camera.CameraView.b(r1);
        r0 = r0.append(r1);
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r3.a;
        r1 = com.whatsapp.camera.CameraView.f(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = 100;
        if (r4 != r0) goto L_0x0074;
    L_0x0056:
        r0 = r3.a;
        com.whatsapp.camera.CameraView.h(r0);
        r0 = r3.a;
        com.whatsapp.camera.CameraView.d(r0);
        r0 = r3.a;	 Catch:{ RuntimeException -> 0x0075, IOException -> 0x0093 }
        r0 = com.whatsapp.camera.CameraView.j(r0);	 Catch:{ RuntimeException -> 0x0075, IOException -> 0x0093 }
        r1 = r3.a;	 Catch:{ RuntimeException -> 0x0075, IOException -> 0x0093 }
        r1 = com.whatsapp.camera.CameraView.c(r1);	 Catch:{ RuntimeException -> 0x0075, IOException -> 0x0093 }
        r0.setPreviewDisplay(r1);	 Catch:{ RuntimeException -> 0x0075, IOException -> 0x0093 }
        r0 = r3.a;	 Catch:{ RuntimeException -> 0x0075, IOException -> 0x0093 }
        com.whatsapp.camera.CameraView.k(r0);	 Catch:{ RuntimeException -> 0x0075, IOException -> 0x0093 }
    L_0x0074:
        return;
    L_0x0075:
        r0 = move-exception;
    L_0x0076:
        r1 = r3.a;
        r1 = com.whatsapp.camera.CameraView.j(r1);
        r1.release();
        r1 = r3.a;
        r2 = 0;
        com.whatsapp.camera.CameraView.a(r1, r2);
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        r0 = r3.a;
        com.whatsapp.camera.CameraView.e(r0);
        goto L_0x0074;
    L_0x0093:
        r0 = move-exception;
        goto L_0x0076;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.j.onError(int, android.hardware.Camera):void");
    }
}
