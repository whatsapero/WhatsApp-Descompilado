package com.whatsapp.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public abstract class ImageViewTouchBase extends ImageView {
    public static int e;
    private Runnable a;
    public Matrix b;
    int c;
    protected final f d;
    private a f;
    int g;
    protected Matrix h;
    protected Matrix i;
    protected Handler j;
    private float k;
    protected float l;
    private final float[] m;

    protected float a(Matrix matrix) {
        return a(matrix, 0);
    }

    protected void b(float f, float f2) {
        this.i.postTranslate(f, f2);
    }

    public void a(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            b(f, f2);
            setImageMatrix(d());
        }
    }

    private void a(Bitmap bitmap, Matrix matrix) {
        super.setImageBitmap(bitmap);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
            drawable.setFilterBitmap(true);
        }
        Bitmap c = this.d.c();
        this.d.a(bitmap);
        this.d.a(matrix);
        if (c != null && c != bitmap && this.f != null) {
            this.f.a(c);
        }
    }

    public void setImageBitmapResetBase(Bitmap bitmap, boolean z) {
        setImageRotateBitmapResetBase(new f(bitmap), z);
    }

    public void b() {
        setImageBitmapResetBase(null, true);
    }

    public ImageViewTouchBase(Context context) {
        super(context);
        this.h = new Matrix();
        this.i = new Matrix();
        this.b = new Matrix();
        this.m = new float[9];
        this.d = new f(null);
        this.c = -1;
        this.g = -1;
        this.k = 3.0f;
        this.j = new Handler();
        this.a = null;
        a();
    }

    private void a() {
        setScaleType(ScaleType.MATRIX);
    }

    private void a(f fVar, Matrix matrix) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float e = (float) fVar.e();
        float b = (float) fVar.b();
        matrix.reset();
        float min = Math.min(Math.min(width / e, this.k), Math.min(height / b, this.k));
        matrix.postConcat(fVar.d());
        matrix.postScale(min, min);
        matrix.postTranslate((width - (e * min)) / 2.0f, (height - (b * min)) / 2.0f);
    }

    public void setMaxProperScale(float f) {
        this.k = f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setImageRotateBitmapResetBase(com.whatsapp.wallpaper.f r3, boolean r4) {
        /*
        r2_this = this;
        r0 = r2.getWidth();
        if (r0 > 0) goto L_0x000e;
    L_0x0006:
        r0 = new com.whatsapp.wallpaper.m;
        r0.<init>(r2, r3, r4);
        r2.a = r0;
    L_0x000d:
        return;
    L_0x000e:
        r0 = r3.c();
        if (r0 == 0) goto L_0x0028;
    L_0x0014:
        r0 = r2.h;
        r2.a(r3, r0);
        r0 = r3.c();
        r1 = r3.f();
        r2.a(r0, r1);
        r0 = e;
        if (r0 == 0) goto L_0x0031;
    L_0x0028:
        r0 = r2.h;
        r0.reset();
        r0 = 0;
        super.setImageBitmap(r0);
    L_0x0031:
        if (r4 == 0) goto L_0x0038;
    L_0x0033:
        r0 = r2.i;
        r0.reset();
    L_0x0038:
        r0 = r2.d();
        r2.setImageMatrix(r0);
        r0 = r2.e();
        r2.l = r0;
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.ImageViewTouchBase.setImageRotateBitmapResetBase(com.whatsapp.wallpaper.f, boolean):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || c() <= 1.0f) {
            return super.onKeyDown(i, keyEvent);
        }
        a(1.0f);
        return true;
    }

    public float c() {
        return a(this.i);
    }

    protected void a(float f, float f2, float f3) {
        if (f > this.l) {
            f = this.l;
        }
        float c = f / c();
        this.i.postScale(c, c, f2, f3);
        setImageMatrix(d());
        a(true, true);
    }

    protected void a(float f, float f2, float f3, float f4, Runnable runnable) {
        float c = (f - c()) / f4;
        float c2 = c();
        this.j.post(new g(this, f4, System.currentTimeMillis(), c2, c, f2, f3, runnable));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(boolean r9, boolean r10) {
        /*
        r8_this = this;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = 0;
        r3 = e;
        r0 = r8.d;
        r0 = r0.c();
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        return;
    L_0x000e:
        r0 = r8.d();
        r4 = new android.graphics.RectF;
        r2 = r8.d;
        r2 = r2.c();
        r2 = r2.getWidth();
        r2 = (float) r2;
        r5 = r8.d;
        r5 = r5.c();
        r5 = r5.getHeight();
        r5 = (float) r5;
        r4.<init>(r1, r1, r2, r5);
        r0.mapRect(r4);
        r0 = r4.height();
        r5 = r4.width();
        if (r10 == 0) goto L_0x00a4;
    L_0x003a:
        r2 = r8.getHeight();
        r6 = (float) r2;
        r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r6 >= 0) goto L_0x00a2;
    L_0x0043:
        r6 = (float) r2;
        r0 = r6 - r0;
        r0 = r0 / r7;
        r6 = r4.top;
        r0 = r0 - r6;
        if (r3 == 0) goto L_0x00a0;
    L_0x004c:
        r6 = r4.top;
        r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r6 <= 0) goto L_0x0057;
    L_0x0052:
        r0 = r4.top;
        r0 = -r0;
        if (r3 == 0) goto L_0x00a0;
    L_0x0057:
        r6 = r4.bottom;
        r2 = (float) r2;
        r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x00a0;
    L_0x005e:
        r0 = r8.getHeight();
        r0 = (float) r0;
        r2 = r4.bottom;
        r0 = r0 - r2;
        r2 = r0;
    L_0x0067:
        if (r9 == 0) goto L_0x009e;
    L_0x0069:
        r6 = r8.getWidth();
        r0 = (float) r6;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x009c;
    L_0x0072:
        r0 = (float) r6;
        r0 = r0 - r5;
        r0 = r0 / r7;
        r5 = r4.left;
        r0 = r0 - r5;
        if (r3 == 0) goto L_0x0090;
    L_0x007a:
        r5 = r4.left;
        r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x0085;
    L_0x0080:
        r0 = r4.left;
        r0 = -r0;
        if (r3 == 0) goto L_0x0090;
    L_0x0085:
        r1 = r4.right;
        r3 = (float) r6;
        r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r1 >= 0) goto L_0x0090;
    L_0x008c:
        r0 = (float) r6;
        r1 = r4.right;
        r0 = r0 - r1;
    L_0x0090:
        r8.b(r0, r2);
        r0 = r8.d();
        r8.setImageMatrix(r0);
        goto L_0x000d;
    L_0x009c:
        r0 = r1;
        goto L_0x007a;
    L_0x009e:
        r0 = r1;
        goto L_0x0090;
    L_0x00a0:
        r2 = r0;
        goto L_0x0067;
    L_0x00a2:
        r0 = r1;
        goto L_0x004c;
    L_0x00a4:
        r2 = r1;
        goto L_0x0067;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.ImageViewTouchBase.a(boolean, boolean):void");
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new Matrix();
        this.i = new Matrix();
        this.b = new Matrix();
        this.m = new float[9];
        this.d = new f(null);
        this.c = -1;
        this.g = -1;
        this.k = 3.0f;
        this.j = new Handler();
        this.a = null;
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            super.setImageBitmap(bitmap);
            if (e == 0) {
                return;
            }
        }
        setImageBitmapResetBase(bitmap, true);
    }

    public Matrix d() {
        this.b.set(this.h);
        this.b.postConcat(this.i);
        return this.b;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.c = i3 - i;
        this.g = i4 - i2;
        Runnable runnable = this.a;
        if (runnable != null) {
            this.a = null;
            runnable.run();
        }
        if (this.d.c() != null) {
            a(this.d, this.h);
            setImageMatrix(d());
        }
    }

    public void setRecycler(a aVar) {
        this.f = aVar;
    }

    protected float a(Matrix matrix, int i) {
        matrix.getValues(this.m);
        return this.m[i];
    }

    protected void a(float f) {
        a(f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
    }

    protected float e() {
        return this.d.c() == null ? 1.0f : Math.max(1.0f, Math.max(((float) this.d.e()) / ((float) this.c), ((float) this.d.b()) / ((float) this.g)) * 4.0f);
    }
}
