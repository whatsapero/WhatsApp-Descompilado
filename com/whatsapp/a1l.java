package com.whatsapp;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class a1l extends Drawable {
    private float a;
    private Paint b;
    private int c;
    private int d;

    public void a(int i) {
        this.c = i;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public a1l() {
        this.c = 18;
        this.d = 16842921;
        this.a = 3.0f;
        this.b = new Paint(1);
        this.a = 2.0f * am1.a().g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r7) {
        /*
        r6_this = this;
        r5 = -13388315; // 0xffffffffff33b5e5 float:-2.3887626E38 double:NaN;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = 1069547520; // 0x3fc00000 float:1.5 double:5.28426686E-315;
        r2 = 0;
        r0 = r6.b;
        r1 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0.setARGB(r1, r2, r2, r2);
        r0 = r6.getBounds();
        r1 = r0.width();
        r0 = r0.height();
        r1 = (float) r1;
        r2 = r6.a;
        r2 = r2 * r3;
        r1 = r1 - r2;
        r0 = (float) r0;
        r2 = r6.a;
        r2 = r2 * r3;
        r0 = r0 - r2;
        r0 = r6.a(r1, r0);
        r1 = new android.graphics.BlurMaskFilter;
        r2 = r6.a;
        r3 = android.graphics.BlurMaskFilter.Blur.NORMAL;
        r1.<init>(r2, r3);
        r2 = r6.b;
        r3 = -1724697805; // 0xffffffff99333333 float:-9.264423E-24 double:NaN;
        r2.setColor(r3);
        r2 = r6.b;
        r3 = android.graphics.Paint.Style.FILL;
        r2.setStyle(r3);
        r2 = r6.b;
        r2.setMaskFilter(r1);
        r1 = r6.a;
        r2 = r6.a;
        r2 = r2 * r4;
        r7.translate(r1, r2);
        r1 = r6.b;
        r7.drawPath(r0, r1);
        r1 = r6.a;
        r1 = -r1;
        r2 = r6.a;
        r2 = -r2;
        r2 = r2 * r4;
        r7.translate(r1, r2);
        r1 = r6.a;
        r2 = r6.a;
        r7.translate(r1, r2);
        r1 = r6.d;
        r2 = 16842919; // 0x10100a7 float:2.3694026E-38 double:8.3215077E-317;
        if (r1 != r2) goto L_0x0074;
    L_0x006b:
        r1 = r6.b;
        r1.setColor(r5);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x007a;
    L_0x0074:
        r1 = r6.b;
        r2 = -1;
        r1.setColor(r2);
    L_0x007a:
        r1 = r6.b;
        r2 = 0;
        r1.setMaskFilter(r2);
        r1 = r6.b;
        r7.drawPath(r0, r1);
        r1 = r6.d;
        r2 = 16842913; // 0x10100a1 float:2.369401E-38 double:8.3215047E-317;
        if (r1 != r2) goto L_0x00a4;
    L_0x008c:
        r1 = r6.b;
        r2 = r6.a;
        r1.setStrokeWidth(r2);
        r1 = r6.b;
        r2 = android.graphics.Paint.Style.STROKE;
        r1.setStyle(r2);
        r1 = r6.b;
        r1.setColor(r5);
        r1 = r6.b;
        r7.drawPath(r0, r1);
    L_0x00a4:
        r0 = r6.a;
        r0 = -r0;
        r1 = r6.a;
        r1 = -r1;
        r7.translate(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a1l.draw(android.graphics.Canvas):void");
    }

    public int getOpacity() {
        return 0;
    }

    private Path a(float f, float f2) {
        Path path = new Path();
        int i = (int) (am1.a().g * 2.0f);
        path.moveTo((f / 2.0f) - ((float) ((this.c * 2) / 3)), f2 - ((float) this.c));
        path.lineTo(f / 2.0f, f2);
        path.lineTo((f / 2.0f) + ((float) ((this.c * 2) / 3)), f2 - ((float) this.c));
        path.lineTo(f - ((float) i), f2 - ((float) this.c));
        path.arcTo(new RectF(f - ((float) (i * 2)), (f2 - ((float) this.c)) - ((float) (i * 2)), f, f2 - ((float) this.c)), 90.0f, -90.0f);
        path.lineTo(f, (float) i);
        path.arcTo(new RectF(f - ((float) (i * 2)), 0.0f, f, (float) (i * 2)), 0.0f, -90.0f);
        path.lineTo((float) i, 0.0f);
        path.arcTo(new RectF(0.0f, 0.0f, (float) (i * 2), (float) (i * 2)), -90.0f, -90.0f);
        path.lineTo(0.0f, (f2 - ((float) this.c)) - ((float) i));
        path.arcTo(new RectF(0.0f, (f2 - ((float) this.c)) - ((float) (i * 2)), (float) (i * 2), f2 - ((float) this.c)), -180.0f, -90.0f);
        path.close();
        path.setFillType(FillType.WINDING);
        return path;
    }

    public void setAlpha(int i) {
    }

    public boolean setState(int[] iArr) {
        int i = App.az;
        int i2 = this.d;
        this.d = 16842921;
        int length = iArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = iArr[i3];
            if (i4 == 16842919) {
                this.d = 16842919;
                if (i == 0) {
                    break;
                }
            }
            if (i4 == 16842913) {
                this.d = 16842913;
                if (i == 0) {
                    break;
                }
            }
            if (i4 == 16842908) {
                this.d = 16842908;
            }
            i3++;
            if (i != 0) {
                break;
            }
        }
        if (i2 == this.d) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public boolean getPadding(Rect rect) {
        rect.top = (int) this.a;
        rect.bottom = this.c + ((int) this.a);
        rect.left = (int) this.a;
        rect.right = (int) this.a;
        return true;
    }

    public boolean isStateful() {
        return true;
    }
}
