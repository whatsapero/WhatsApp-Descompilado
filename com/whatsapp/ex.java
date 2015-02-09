package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;

public class ex extends BitmapDrawable {
    private float a;
    private int b;
    private Path c;
    private Rect d;
    private int e;
    private Paint f;

    public boolean setState(int[] iArr) {
        int i = App.az;
        int i2 = this.b;
        this.b = 16842921;
        int length = iArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = iArr[i3];
            if (i4 == 16842919) {
                this.b = 16842919;
                if (i == 0) {
                    break;
                }
            }
            if (i4 == 16842908) {
                this.b = 16842908;
            }
            i3++;
            if (i != 0) {
                break;
            }
        }
        if (i2 == this.b) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public boolean isStateful() {
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ex(android.content.Context r12, android.graphics.Bitmap r13, boolean r14) {
        /*
        r11_this = this;
        r6 = 0;
        r10 = 1;
        r9 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = 0;
        r0 = com.whatsapp.App.az;
        r1 = r12.getResources();
        r11.<init>(r1, r13);
        r1 = com.whatsapp.am1.a();
        r1 = r1.c;
        r11.a = r1;
        r1 = r12.getResources();
        r2 = 2131361862; // 0x7f0a0046 float:1.8343488E38 double:1.053032675E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r11.e = r1;
        r1 = r13.getWidth();
        r2 = r13.getHeight();
        if (r1 >= r2) goto L_0x0040;
    L_0x002f:
        r3 = new android.graphics.Rect;
        r4 = r2 - r1;
        r4 = r4 / 2;
        r5 = r2 + r1;
        r5 = r5 / 2;
        r3.<init>(r6, r4, r1, r5);
        r11.d = r3;
        if (r0 == 0) goto L_0x004e;
    L_0x0040:
        r3 = new android.graphics.Rect;
        r4 = r1 - r2;
        r4 = r4 / 2;
        r1 = r1 + r2;
        r1 = r1 / 2;
        r3.<init>(r4, r6, r1, r2);
        r11.d = r3;
    L_0x004e:
        r1 = new android.graphics.Path;
        r1.<init>();
        r11.c = r1;
        if (r14 != 0) goto L_0x00bb;
    L_0x0057:
        r1 = r11.c;
        r1.moveTo(r7, r7);
        r1 = r11.c;
        r2 = r11.e;
        r2 = (float) r2;
        r3 = r11.a;
        r2 = r2 - r3;
        r1.lineTo(r2, r7);
        r1 = r11.c;
        r2 = new android.graphics.RectF;
        r3 = r11.e;
        r3 = (float) r3;
        r4 = r11.a;
        r4 = r4 * r8;
        r3 = r3 - r4;
        r4 = r11.e;
        r4 = (float) r4;
        r5 = r11.a;
        r5 = r5 * r8;
        r2.<init>(r3, r7, r4, r5);
        r3 = -1028390912; // 0xffffffffc2b40000 float:-90.0 double:NaN;
        r1.arcTo(r2, r3, r9);
        r1 = r11.c;
        r2 = r11.e;
        r2 = (float) r2;
        r3 = r11.e;
        r3 = (float) r3;
        r4 = r11.a;
        r3 = r3 - r4;
        r1.lineTo(r2, r3);
        r1 = r11.c;
        r2 = new android.graphics.RectF;
        r3 = r11.e;
        r3 = (float) r3;
        r4 = r11.a;
        r4 = r4 * r8;
        r3 = r3 - r4;
        r4 = r11.e;
        r4 = (float) r4;
        r5 = r11.a;
        r5 = r5 * r8;
        r4 = r4 - r5;
        r5 = r11.e;
        r5 = (float) r5;
        r6 = r11.e;
        r6 = (float) r6;
        r2.<init>(r3, r4, r5, r6);
        r1.arcTo(r2, r7, r9);
        r1 = r11.c;
        r2 = r11.e;
        r2 = (float) r2;
        r1.lineTo(r7, r2);
        r1 = r11.c;
        r1.lineTo(r7, r7);
        if (r0 == 0) goto L_0x0113;
    L_0x00bb:
        r0 = r11.c;
        r1 = r11.e;
        r1 = (float) r1;
        r2 = r11.e;
        r2 = (float) r2;
        r0.moveTo(r1, r2);
        r0 = r11.c;
        r1 = r11.a;
        r2 = r11.e;
        r2 = (float) r2;
        r0.lineTo(r1, r2);
        r0 = r11.c;
        r1 = new android.graphics.RectF;
        r2 = r11.e;
        r2 = (float) r2;
        r3 = r11.a;
        r3 = r3 * r8;
        r2 = r2 - r3;
        r3 = r11.a;
        r3 = r3 * r8;
        r4 = r11.e;
        r4 = (float) r4;
        r1.<init>(r7, r2, r3, r4);
        r0.arcTo(r1, r9, r9);
        r0 = r11.c;
        r1 = r11.a;
        r0.lineTo(r7, r1);
        r0 = r11.c;
        r1 = new android.graphics.RectF;
        r2 = r11.a;
        r2 = r2 * r8;
        r3 = r11.a;
        r3 = r3 * r8;
        r1.<init>(r7, r7, r2, r3);
        r2 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        r0.arcTo(r1, r2, r9);
        r0 = r11.c;
        r1 = r11.e;
        r1 = (float) r1;
        r0.lineTo(r1, r7);
        r0 = r11.c;
        r1 = r11.e;
        r1 = (float) r1;
        r2 = r11.e;
        r2 = (float) r2;
        r0.lineTo(r1, r2);
    L_0x0113:
        r0 = new android.graphics.Paint;
        r0.<init>();
        r11.f = r0;
        r0 = r11.f;
        r0.setAntiAlias(r10);
        r0 = r11.f;
        r0.setDither(r10);
        r0 = r11.f;
        r0.setFilterBitmap(r10);
        r0 = r11.f;
        r1 = -1;
        r0.setColor(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ex.<init>(android.content.Context, android.graphics.Bitmap, boolean):void");
    }

    public int getIntrinsicHeight() {
        return this.e;
    }

    public int getIntrinsicWidth() {
        return this.e;
    }

    public void draw(Canvas canvas) {
        if (!getBitmap().isRecycled()) {
            if (this.a == 0.0f) {
                super.draw(canvas);
                return;
            }
            RectF rectF = new RectF(getBounds());
            int saveLayer = canvas.saveLayer(rectF, null, 31);
            canvas.drawARGB(0, 0, 0, 0);
            canvas.drawPath(this.c, this.f);
            this.f.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
            canvas.drawBitmap(getBitmap(), this.d, rectF, this.f);
            this.f.setXfermode(null);
            canvas.restoreToCount(saveLayer);
        }
    }
}
