package com.whatsapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ThumbnailButton extends ImageView {
    private static int i;
    int a;
    int b;
    boolean c;
    final RectF d;
    Paint e;
    float f;
    final Rect g;
    float h;
    float j;

    protected void a(Canvas canvas) {
        if (this.h > 0.0f && this.b != 0) {
            this.e.setColor(this.b);
            this.e.setStrokeWidth(this.h);
            this.e.setStyle(Style.STROKE);
            if (this.f >= 0.0f) {
                canvas.drawRoundRect(this.d, this.f, this.f, this.e);
                if (App.az == 0) {
                    return;
                }
            }
            canvas.drawArc(this.d, 0.0f, 360.0f, true, this.e);
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        setBackgroundDrawable(new ut(null));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vk.ThumbnailButton);
            this.f = obtainStyledAttributes.getDimension(1, this.f);
            this.j = obtainStyledAttributes.getFloat(4, this.j);
            this.a = obtainStyledAttributes.getInteger(0, this.a);
            this.h = obtainStyledAttributes.getDimension(2, this.h);
            this.b = obtainStyledAttributes.getInteger(3, this.b);
            this.c = obtainStyledAttributes.getBoolean(5, this.c);
            obtainStyledAttributes.recycle();
        }
        this.e = new Paint();
        this.e.setAntiAlias(true);
        this.e.setDither(true);
        this.e.setFilterBitmap(true);
        this.e.setColor(-1);
    }

    protected void c(Canvas canvas) {
        if (!isEnabled()) {
            return;
        }
        if (isSelected() || isPressed()) {
            this.e.setStyle(Style.FILL);
            this.e.setColor(this.a);
            if (this.f >= 0.0f) {
                canvas.drawRoundRect(this.d, this.f, this.f, this.e);
                if (App.az == 0) {
                    return;
                }
            }
            canvas.drawArc(this.d, 0.0f, 360.0f, true, this.e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void b(android.graphics.Canvas r13) {
        /*
        r12_this = this;
        r11 = 0;
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = 0;
        r1 = 0;
        r3 = com.whatsapp.App.az;
        r0 = r12.getDrawable();
        if (r0 == 0) goto L_0x0102;
    L_0x000d:
        r0 = r12.getDrawable();
        r0 = (android.graphics.drawable.BitmapDrawable) r0;
        r7 = r0.getBitmap();
        r0 = r7.getWidth();
        r4 = r7.getHeight();
        r5 = r12.getScaleType();
        r6 = android.widget.ImageView.ScaleType.FIT_CENTER;
        if (r5 != r6) goto L_0x008c;
    L_0x0027:
        r5 = r12.g;
        r5.set(r1, r1, r0, r4);
        r5 = r0 / r4;
        r5 = (float) r5;
        r6 = r12.d;
        r6 = r6.width();
        r8 = r12.d;
        r8 = r8.height();
        r6 = r6 / r8;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x0066;
    L_0x0040:
        r5 = r12.d;
        r5 = r5.width();
        r6 = (float) r4;
        r5 = r5 * r6;
        r6 = (float) r0;
        r5 = r5 / r6;
        r6 = r12.d;
        r6 = r6.top;
        r8 = r12.d;
        r8 = r8.bottom;
        r6 = r6 + r8;
        r6 = r6 / r10;
        r8 = r12.d;
        r9 = r5 / r10;
        r6 = r6 - r9;
        r8.top = r6;
        r6 = r12.d;
        r8 = r12.d;
        r8 = r8.top;
        r5 = r5 + r8;
        r6.bottom = r5;
        if (r3 == 0) goto L_0x00a2;
    L_0x0066:
        r5 = r12.d;
        r5 = r5.height();
        r6 = (float) r0;
        r5 = r5 * r6;
        r6 = (float) r4;
        r5 = r5 / r6;
        r6 = r12.d;
        r6 = r6.left;
        r8 = r12.d;
        r8 = r8.right;
        r6 = r6 + r8;
        r6 = r6 / r10;
        r8 = r12.d;
        r9 = r5 / r10;
        r6 = r6 - r9;
        r8.left = r6;
        r6 = r12.d;
        r8 = r12.d;
        r8 = r8.left;
        r5 = r5 + r8;
        r6.right = r5;
        if (r3 == 0) goto L_0x00a2;
    L_0x008c:
        r5 = r0 - r4;
        r5 = r5 / 2;
        if (r5 <= 0) goto L_0x009b;
    L_0x0092:
        r6 = r12.g;
        r8 = r0 - r5;
        r6.set(r5, r1, r8, r4);
        if (r3 == 0) goto L_0x00a2;
    L_0x009b:
        r6 = r12.g;
        r8 = -r5;
        r4 = r4 + r5;
        r6.set(r1, r8, r0, r4);
    L_0x00a2:
        r0 = r12.f;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x0103;
    L_0x00a8:
        r0 = r12.d;
        r4 = 31;
        r6 = r13.saveLayer(r0, r11, r4);
        r0 = r12.e;
        r4 = -1;
        r0.setColor(r4);
        r0 = r12.e;
        r4 = android.graphics.Paint.Style.FILL;
        r0.setStyle(r4);
        r13.drawARGB(r1, r1, r1, r1);
        r0 = r12.f;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 < 0) goto L_0x00d3;
    L_0x00c6:
        r0 = r12.d;
        r1 = r12.f;
        r4 = r12.f;
        r5 = r12.e;
        r13.drawRoundRect(r0, r1, r4, r5);
        if (r3 == 0) goto L_0x00de;
    L_0x00d3:
        r1 = r12.d;
        r3 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r4 = 1;
        r5 = r12.e;
        r0 = r13;
        r0.drawArc(r1, r2, r3, r4, r5);
    L_0x00de:
        r0 = r12.e;
        r1 = new android.graphics.PorterDuffXfermode;
        r3 = android.graphics.PorterDuff.Mode.SRC_IN;
        r1.<init>(r3);
        r0.setXfermode(r1);
        r0 = r6;
    L_0x00eb:
        r1 = r12.g;
        r3 = r12.d;
        r4 = r12.e;
        r13.drawBitmap(r7, r1, r3, r4);
        r1 = r12.f;
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 == 0) goto L_0x0102;
    L_0x00fa:
        r1 = r12.e;
        r1.setXfermode(r11);
        r13.restoreToCount(r0);
    L_0x0102:
        return;
    L_0x0103:
        r0 = r1;
        goto L_0x00eb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ThumbnailButton.b(android.graphics.Canvas):void");
    }

    public void setBorderColor(int i) {
        this.b = i;
    }

    protected void onMeasure(int i, int i2) {
        if (this.j == 1.0f) {
            int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
            setMeasuredDimension(defaultSize, defaultSize);
            if (App.az == 0) {
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setRadius(float f) {
        this.f = f;
    }

    public ThumbnailButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = 0.0f;
        this.a = i;
        this.d = new RectF();
        this.g = new Rect();
        a(context, attributeSet);
    }

    public ThumbnailButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = 0.0f;
        this.a = i;
        this.d = new RectF();
        this.g = new Rect();
        a(context, attributeSet);
    }

    static {
        int i;
        if (VERSION.SDK_INT >= 19) {
            char[] toCharArray = "\n@H8a\u0017F".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i = 121;
                        break;
                    case ay.f /*1*/:
                        i = 33;
                        break;
                    case ay.n /*2*/:
                        i = 37;
                        break;
                    case ay.p /*3*/:
                        i = 75;
                        break;
                    default:
                        i = 20;
                        break;
                }
                cArr[i2] = (char) (i ^ c);
            }
            if (!new String(cArr).intern().equalsIgnoreCase(Build.MANUFACTURER)) {
                i = 419430400;
                i = i;
            }
        }
        i = 1711315455;
        i = i;
    }

    public void setBorderSize(float f) {
        this.h = f;
    }

    public ThumbnailButton(Context context) {
        super(context);
        this.f = 0.0f;
        this.a = i;
        this.d = new RectF();
        this.g = new Rect();
        a(context, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r4) {
        /*
        r3_this = this;
        r0 = r3.d;
        r1 = r3.getPaddingLeft();
        r1 = (float) r1;
        r0.left = r1;
        r0 = r3.d;
        r1 = r3.getWidth();
        r2 = r3.getPaddingLeft();
        r1 = r1 - r2;
        r1 = (float) r1;
        r0.right = r1;
        r0 = r3.d;
        r1 = r3.getPaddingTop();
        r1 = (float) r1;
        r0.top = r1;
        r0 = r3.d;
        r1 = r3.getHeight();
        r2 = r3.getPaddingBottom();
        r1 = r1 - r2;
        r1 = (float) r1;
        r0.bottom = r1;
        r0 = r3.c;
        if (r0 != 0) goto L_0x003a;
    L_0x0032:
        r0 = r3.getDrawable();
        r0 = r0 instanceof android.graphics.drawable.BitmapDrawable;
        if (r0 != 0) goto L_0x0041;
    L_0x003a:
        super.onDraw(r4);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0044;
    L_0x0041:
        r3.b(r4);
    L_0x0044:
        r3.a(r4);
        r3.c(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ThumbnailButton.onDraw(android.graphics.Canvas):void");
    }
}
