package com.whatsapp.camera;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class e implements OnGlobalLayoutListener {
    private static final String z;
    boolean a;
    final CameraActivity b;

    static {
        char[] toCharArray = "]+|5Z_+r$AH#e)\u0007U(u\u000f[V%f>\b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 62;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 17;
                    break;
                case ay.p /*3*/:
                    i2 = 80;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    e(CameraActivity cameraActivity) {
        this.b = cameraActivity;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
        r10_this = this;
        r9 = 2131427570; // 0x7f0b00f2 float:1.847676E38 double:1.053065139E-314;
        r8 = 2131427569; // 0x7f0b00f1 float:1.8476758E38 double:1.0530651384E-314;
        r7 = 2131427563; // 0x7f0b00eb float:1.8476746E38 double:1.0530651355E-314;
        r6 = 8;
        r1 = 0;
        r0 = r10.b;
        r0 = com.whatsapp.camera.CameraActivity.h(r0);
        if (r0 == 0) goto L_0x0157;
    L_0x0014:
        r0 = r10.b;
        r0 = r0.getWindowManager();
        r0 = r0.getDefaultDisplay();
        r2 = com.whatsapp.am1.a();
        r0 = r0.getHeight();
        r3 = r10.b;
        r3 = com.whatsapp.camera.CameraActivity.h(r3);
        r3 = r3.getRootView();
        r3 = r3.getHeight();
        r0 = r0 - r3;
        r0 = (float) r0;
        r3 = 1124073472; // 0x43000000 float:128.0 double:5.55366086E-315;
        r2 = r2.g;
        r2 = r2 * r3;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0158;
    L_0x003f:
        r0 = 1;
    L_0x0040:
        r2 = r10.a;
        if (r2 == r0) goto L_0x013a;
    L_0x0044:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r10.a = r0;
        r2 = new android.view.animation.AlphaAnimation;
        r3 = 0;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2.<init>(r3, r4);
        r3 = r10.b;
        r3 = r3.getResources();
        r4 = 17694721; // 0x10e0001 float:2.6081284E-38 double:8.742354E-317;
        r3 = r3.getInteger(r4);
        r4 = (long) r3;
        r2.setDuration(r4);
        if (r0 == 0) goto L_0x00ce;
    L_0x0077:
        r3 = new android.view.animation.DecelerateInterpolator;
        r3.<init>();
        r2.setInterpolator(r3);
        r3 = r10.b;
        r4 = 2131427883; // 0x7f0b022b float:1.8477395E38 double:1.0530652936E-314;
        r3 = r3.findViewById(r4);
        r3.setVisibility(r1);
        r3 = r10.b;
        r3 = r3.findViewById(r8);
        r3.setVisibility(r6);
        r3 = r10.b;
        r3 = r3.findViewById(r9);
        r3.setVisibility(r6);
        r3 = r10.b;
        r4 = 2131427568; // 0x7f0b00f0 float:1.8476756E38 double:1.053065138E-314;
        r3 = r3.findViewById(r4);
        r3.setVisibility(r6);
        r3 = r10.b;
        r3 = r3.findViewById(r7);
        r3.setVisibility(r6);
        r3 = r10.b;
        r4 = 2131427559; // 0x7f0b00e7 float:1.8476738E38 double:1.0530651335E-314;
        r3 = r3.findViewById(r4);
        r3.startAnimation(r2);
        r3 = r10.b;
        r4 = 2131427567; // 0x7f0b00ef float:1.8476754E38 double:1.0530651375E-314;
        r3 = r3.findViewById(r4);
        r3.startAnimation(r2);
        r3 = com.whatsapp.camera.CameraActivity.l;
        if (r3 == 0) goto L_0x013a;
    L_0x00ce:
        r3 = r10.b;
        r4 = 2131427559; // 0x7f0b00e7 float:1.8476738E38 double:1.0530651335E-314;
        r3 = r3.findViewById(r4);
        r3.startAnimation(r2);
        r3 = r10.b;
        r4 = 2131427883; // 0x7f0b022b float:1.8477395E38 double:1.0530652936E-314;
        r3 = r3.findViewById(r4);
        r3.setVisibility(r6);
        r3 = r10.b;
        r3 = r3.findViewById(r8);
        r3.setVisibility(r1);
        r3 = r10.b;
        r3 = r3.findViewById(r9);
        r3.setVisibility(r1);
        r3 = r10.b;
        r3 = r3.findViewById(r8);
        r3.startAnimation(r2);
        r3 = r10.b;
        r3 = r3.findViewById(r9);
        r3.startAnimation(r2);
        r3 = r10.b;
        r4 = 2131427568; // 0x7f0b00f0 float:1.8476756E38 double:1.053065138E-314;
        r3 = r3.findViewById(r4);
        r3.setVisibility(r1);
        r3 = r10.b;
        r3 = r3.findViewById(r7);
        r3.setVisibility(r1);
        r1 = r10.b;
        r1 = r1.findViewById(r7);
        r1.startAnimation(r2);
        r1 = r10.b;
        r1 = com.whatsapp.camera.CameraActivity.k(r1);
        r1.dismiss();
        r1 = r10.b;
        r1 = com.whatsapp.camera.CameraActivity.a(r1);
        r1.clearFocus();
    L_0x013a:
        if (r0 != 0) goto L_0x0157;
    L_0x013c:
        r0 = r10.b;
        r0 = com.whatsapp.camera.CameraActivity.l(r0);
        if (r0 == 0) goto L_0x0157;
    L_0x0144:
        r0 = r10.b;
        r0 = com.whatsapp.camera.CameraActivity.l(r0);
        r1 = r10.b;
        r1 = com.whatsapp.camera.CameraActivity.h(r1);
        r1 = r1.getHeight();
        r0.setHeightForInitialScaleCalculation(r1);
    L_0x0157:
        return;
    L_0x0158:
        r0 = r1;
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.e.onGlobalLayout():void");
    }
}
