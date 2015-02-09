package com.whatsapp.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class CameraLayout extends FrameLayout {
    private static final String z;

    static {
        char[] toCharArray = "\u0012G/E\u0015\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 101;
                    break;
                case ay.f /*1*/:
                    i2 = 46;
                    break;
                case ay.n /*2*/:
                    i2 = 65;
                    break;
                case ay.p /*3*/:
                    i2 = 33;
                    break;
                default:
                    i2 = 122;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
        r18_this = this;
        r2 = com.whatsapp.camera.CameraActivity.l;
        super.onLayout(r19, r20, r21, r22, r23);
        r1 = 2131427555; // 0x7f0b00e3 float:1.847673E38 double:1.0530651315E-314;
        r0 = r18;
        r3 = r0.findViewById(r1);
        r1 = 2131427557; // 0x7f0b00e5 float:1.8476734E38 double:1.0530651325E-314;
        r0 = r18;
        r4 = r0.findViewById(r1);
        r1 = 2131427556; // 0x7f0b00e4 float:1.8476732E38 double:1.053065132E-314;
        r0 = r18;
        r5 = r0.findViewById(r1);
        r6 = r3.getMeasuredWidth();
        r7 = r3.getMeasuredHeight();
        r8 = r4.getMeasuredWidth();
        r9 = r4.getMeasuredHeight();
        r10 = r5.getMeasuredWidth();
        r11 = r5.getMeasuredHeight();
        r1 = r23 - r21;
        r12 = r22 - r20;
        if (r1 <= r12) goto L_0x008d;
    L_0x003e:
        r1 = r20 + r22;
        r1 = r1 - r6;
        r1 = r1 / 2;
        r12 = r23 - r7;
        r13 = r20 + r22;
        r13 = r13 + r6;
        r13 = r13 / 2;
        r0 = r23;
        r3.layout(r1, r12, r13, r0);
        r1 = r22 - r20;
        r1 = r1 - r6;
        r1 = r1 / 4;
        r12 = r22 - r1;
        r13 = r10 / 2;
        r12 = r12 - r13;
        r13 = r7 / 2;
        r13 = r23 - r13;
        r14 = r11 / 2;
        r13 = r13 - r14;
        r14 = r22 - r1;
        r15 = r10 / 2;
        r14 = r14 + r15;
        r15 = r7 / 2;
        r15 = r23 - r15;
        r16 = r11 / 2;
        r15 = r15 + r16;
        r5.layout(r12, r13, r14, r15);
        r12 = r20 + r1;
        r13 = r8 / 2;
        r12 = r12 - r13;
        r13 = r7 / 2;
        r13 = r23 - r13;
        r14 = r9 / 2;
        r13 = r13 - r14;
        r1 = r1 + r20;
        r14 = r8 / 2;
        r1 = r1 + r14;
        r14 = r7 / 2;
        r14 = r23 - r14;
        r15 = r9 / 2;
        r14 = r14 + r15;
        r4.layout(r12, r13, r1, r14);
        if (r2 == 0) goto L_0x0154;
    L_0x008d:
        r1 = r18.getContext();
        r12 = z;
        r1 = r1.getSystemService(r12);
        r1 = (android.view.WindowManager) r1;
        r1 = r1.getDefaultDisplay();
        r1 = r1.getOrientation();
        r12 = 2131427571; // 0x7f0b00f3 float:1.8476762E38 double:1.0530651394E-314;
        r0 = r18;
        r12 = r0.findViewById(r12);
        r12 = r12.getMeasuredHeight();
        r12 = r12 + r21;
        if (r1 == 0) goto L_0x00b5;
    L_0x00b2:
        r13 = 1;
        if (r1 != r13) goto L_0x0109;
    L_0x00b5:
        r1 = r22 - r6;
        r13 = r12 + r23;
        r13 = r13 - r7;
        r13 = r13 / 2;
        r14 = r12 + r23;
        r14 = r14 + r7;
        r14 = r14 / 2;
        r0 = r22;
        r3.layout(r1, r13, r0, r14);
        r1 = r23 - r12;
        r1 = r1 - r7;
        r1 = r1 / 4;
        r13 = r6 / 2;
        r13 = r22 - r13;
        r14 = r10 / 2;
        r13 = r13 - r14;
        r14 = r12 + r1;
        r15 = r11 / 2;
        r14 = r14 - r15;
        r15 = r6 / 2;
        r15 = r22 - r15;
        r16 = r10 / 2;
        r15 = r15 + r16;
        r16 = r12 + r1;
        r17 = r11 / 2;
        r16 = r16 + r17;
        r0 = r16;
        r5.layout(r13, r14, r15, r0);
        r13 = r6 / 2;
        r13 = r22 - r13;
        r14 = r8 / 2;
        r13 = r13 - r14;
        r14 = r23 - r1;
        r15 = r9 / 2;
        r14 = r14 - r15;
        r15 = r6 / 2;
        r15 = r22 - r15;
        r16 = r8 / 2;
        r15 = r15 + r16;
        r1 = r23 - r1;
        r16 = r9 / 2;
        r1 = r1 + r16;
        r4.layout(r13, r14, r15, r1);
        if (r2 == 0) goto L_0x0154;
    L_0x0109:
        r1 = r12 + r23;
        r1 = r1 - r7;
        r1 = r1 / 2;
        r13 = r20 + r6;
        r14 = r12 + r23;
        r14 = r14 + r7;
        r14 = r14 / 2;
        r0 = r20;
        r3.layout(r0, r1, r13, r14);
        r1 = r23 - r12;
        r1 = r1 - r7;
        r1 = r1 / 4;
        r3 = r6 / 2;
        r3 = r3 + r20;
        r7 = r10 / 2;
        r3 = r3 - r7;
        r7 = r12 + r1;
        r13 = r11 / 2;
        r7 = r7 - r13;
        r13 = r6 / 2;
        r13 = r13 + r20;
        r10 = r10 / 2;
        r10 = r10 + r13;
        r12 = r12 + r1;
        r11 = r11 / 2;
        r11 = r11 + r12;
        r5.layout(r3, r7, r10, r11);
        r3 = r6 / 2;
        r3 = r3 + r20;
        r5 = r8 / 2;
        r3 = r3 - r5;
        r5 = r23 - r1;
        r7 = r9 / 2;
        r5 = r5 - r7;
        r6 = r6 / 2;
        r6 = r6 + r20;
        r7 = r8 / 2;
        r6 = r6 + r7;
        r1 = r23 - r1;
        r7 = r9 / 2;
        r1 = r1 + r7;
        r4.layout(r3, r5, r6, r1);
    L_0x0154:
        r1 = com.whatsapp.DialogToastActivity.i;
        if (r1 == 0) goto L_0x015c;
    L_0x0158:
        r1 = r2 + 1;
        com.whatsapp.camera.CameraActivity.l = r1;
    L_0x015c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraLayout.onLayout(boolean, int, int, int, int):void");
    }

    public CameraLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CameraLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CameraLayout(Context context) {
        super(context);
    }
}
