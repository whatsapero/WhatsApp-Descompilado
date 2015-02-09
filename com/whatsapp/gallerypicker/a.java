package com.whatsapp.gallerypicker;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a implements OnGlobalLayoutListener {
    private static final String z;
    final ImagePreview a;

    static {
        char[] toCharArray = "[E{\u0001rBZ\u007f\u0010~W_5\ruVwi\u000exEF:".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 50;
                    break;
                case ay.f /*1*/:
                    i2 = 40;
                    break;
                case ay.n /*2*/:
                    i2 = 26;
                    break;
                case ay.p /*3*/:
                    i2 = 102;
                    break;
                default:
                    i2 = 23;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
        r11_this = this;
        r10 = 2131427861; // 0x7f0b0215 float:1.847735E38 double:1.0530652827E-314;
        r9 = 2131427682; // 0x7f0b0162 float:1.8476987E38 double:1.0530651943E-314;
        r3 = 8;
        r2 = 0;
        r6 = com.whatsapp.gallerypicker.ImagePreview.y;
        r0 = r11.a;
        r0 = com.whatsapp.gallerypicker.ImagePreview.i(r0);
        if (r0 == 0) goto L_0x0128;
    L_0x0013:
        r0 = new android.graphics.Rect;
        r0.<init>();
        r1 = r11.a;
        r1 = com.whatsapp.gallerypicker.ImagePreview.i(r1);
        r1.getWindowVisibleDisplayFrame(r0);
        r1 = com.whatsapp.am1.a();
        r4 = r11.a;
        r4 = com.whatsapp.gallerypicker.ImagePreview.i(r4);
        r4 = r4.getRootView();
        r4 = r4.getHeight();
        r5 = r0.bottom;
        r0 = r0.top;
        r0 = r5 - r0;
        r0 = r4 - r0;
        r0 = (float) r0;
        r4 = 1124073472; // 0x43000000 float:128.0 double:5.55366086E-315;
        r1 = r1.g;
        r1 = r1 * r4;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x0129;
    L_0x0045:
        r0 = 1;
        r1 = r0;
    L_0x0047:
        r0 = r11.a;
        r0 = com.whatsapp.gallerypicker.ImagePreview.o(r0);
        if (r1 == r0) goto L_0x0117;
    L_0x004f:
        r0 = r11.a;
        com.whatsapp.gallerypicker.ImagePreview.a(r0, r1);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r0 = r0.append(r4);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r11.a;
        r0 = com.whatsapp.gallerypicker.ImagePreview.l(r0);
        r7 = r0.getChildCount();
        r5 = r2;
    L_0x0075:
        if (r5 >= r7) goto L_0x00aa;
    L_0x0077:
        r0 = r11.a;
        r0 = com.whatsapp.gallerypicker.ImagePreview.l(r0);
        r4 = r0.getChildAt(r5);
        r0 = 2131427883; // 0x7f0b022b float:1.8477395E38 double:1.0530652936E-314;
        r8 = r4.findViewById(r0);
        if (r8 == 0) goto L_0x0090;
    L_0x008a:
        if (r1 == 0) goto L_0x012c;
    L_0x008c:
        r0 = r2;
    L_0x008d:
        r8.setVisibility(r0);
    L_0x0090:
        r0 = 2131427559; // 0x7f0b00e7 float:1.8476738E38 double:1.0530651335E-314;
        r0 = r4.findViewById(r0);
        r0 = (com.whatsapp.PhotoView) r0;
        if (r0 == 0) goto L_0x00a6;
    L_0x009b:
        if (r1 == 0) goto L_0x012f;
    L_0x009d:
        r4 = r11.a;
        r4 = com.whatsapp.gallerypicker.ImagePreview.x(r4);
    L_0x00a3:
        r0.setHeightForInitialScaleCalculation(r4);
    L_0x00a6:
        r0 = r5 + 1;
        if (r6 == 0) goto L_0x0132;
    L_0x00aa:
        r0 = new android.view.animation.AlphaAnimation;
        r4 = 0;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.<init>(r4, r5);
        r4 = new android.view.animation.DecelerateInterpolator;
        r4.<init>();
        r0.setInterpolator(r4);
        r4 = r11.a;
        r4 = r4.getResources();
        r5 = 17694721; // 0x10e0001 float:2.6081284E-38 double:8.742354E-317;
        r4 = r4.getInteger(r5);
        r4 = (long) r4;
        r0.setDuration(r4);
        if (r1 == 0) goto L_0x00e1;
    L_0x00cd:
        r4 = r11.a;
        r4 = r4.findViewById(r10);
        r4.setVisibility(r3);
        r4 = r11.a;
        r4 = r4.findViewById(r9);
        r4.setVisibility(r3);
        if (r6 == 0) goto L_0x010e;
    L_0x00e1:
        r3 = r11.a;
        r3 = r3.findViewById(r10);
        r3.setVisibility(r2);
        r3 = r11.a;
        r3 = r3.findViewById(r9);
        r3.setVisibility(r2);
        r2 = r11.a;
        r2 = com.whatsapp.gallerypicker.ImagePreview.u(r2);
        r2.dismiss();
        r2 = r11.a;
        r2 = r2.findViewById(r10);
        r2.startAnimation(r0);
        r2 = r11.a;
        r2 = r2.findViewById(r9);
        r2.startAnimation(r0);
    L_0x010e:
        r2 = r11.a;
        r2 = com.whatsapp.gallerypicker.ImagePreview.l(r2);
        r2.startAnimation(r0);
    L_0x0117:
        if (r1 != 0) goto L_0x0128;
    L_0x0119:
        r0 = r11.a;
        r1 = r11.a;
        r1 = com.whatsapp.gallerypicker.ImagePreview.l(r1);
        r1 = r1.getHeight();
        com.whatsapp.gallerypicker.ImagePreview.b(r0, r1);
    L_0x0128:
        return;
    L_0x0129:
        r1 = r2;
        goto L_0x0047;
    L_0x012c:
        r0 = r3;
        goto L_0x008d;
    L_0x012f:
        r4 = r2;
        goto L_0x00a3;
    L_0x0132:
        r5 = r0;
        goto L_0x0075;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.a.onGlobalLayout():void");
    }

    a(ImagePreview imagePreview) {
        this.a = imagePreview;
    }
}
