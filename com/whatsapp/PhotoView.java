package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.support.v4.view.GestureDetectorCompat;
import android.util.AttributeSet;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import org.whispersystems.libaxolotl.ay;

public class PhotoView extends View implements OnGestureListener, OnDoubleTapListener, OnScaleGestureListener {
    private static Paint b;
    private static int e;
    private static Paint h;
    private static boolean t;
    public static Bitmap w;
    private RectF A;
    private boolean B;
    private GestureDetectorCompat C;
    private int D;
    private boolean E;
    private int F;
    private int G;
    private RectF H;
    private int I;
    private float J;
    private boolean K;
    private Matrix L;
    private float M;
    private Rect N;
    private OnClickListener O;
    private float P;
    private l_ a;
    private int c;
    private boolean d;
    private _4 f;
    private float g;
    private RectF i;
    private Matrix j;
    private boolean k;
    private float l;
    private boolean m;
    private d4 n;
    private BitmapDrawable o;
    private o2 p;
    private float q;
    private nk r;
    private boolean s;
    private float[] u;
    private boolean v;
    private Matrix x;
    private boolean y;
    private ScaleGestureDetector z;

    private void a(boolean z) {
        if (this.o != null && this.B) {
            int intrinsicWidth = this.o.getIntrinsicWidth();
            int intrinsicHeight = this.o.getIntrinsicHeight();
            this.o.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            if (Math.abs(this.P % 180.0f) != 90.0f) {
                int i = intrinsicHeight;
                intrinsicHeight = intrinsicWidth;
                intrinsicWidth = i;
            }
            int width = getWidth();
            int height = getHeight();
            if ((intrinsicHeight < 0 || width == intrinsicHeight) && (r0 < 0 || height == r0)) {
                intrinsicWidth = 1;
            } else {
                intrinsicWidth = 0;
            }
            if (z || (this.M == 0.0f && this.o != null && this.B)) {
                g();
            }
            if (intrinsicWidth != 0 || this.L.isIdentity()) {
                this.j = null;
                if (App.az == 0) {
                    return;
                }
            }
            this.j = this.L;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(float r10, float r11) {
        /*
        r9_this = this;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = 0;
        r4 = com.whatsapp.App.az;
        r0 = r9.i;
        r2 = r9.A;
        r0.set(r2);
        r0 = r9.L;
        r2 = r9.i;
        r0.mapRect(r2);
        r0 = r9.k;
        if (r0 == 0) goto L_0x00c3;
    L_0x0017:
        r0 = r9.N;
        r0 = r0.left;
        r0 = (float) r0;
    L_0x001c:
        r2 = r9.k;
        if (r2 == 0) goto L_0x00c6;
    L_0x0020:
        r2 = r9.N;
        r2 = r2.right;
        r2 = (float) r2;
    L_0x0025:
        r3 = r9.i;
        r5 = r3.left;
        r3 = r9.i;
        r6 = r3.right;
        r3 = r9.k;
        if (r3 == 0) goto L_0x0047;
    L_0x0031:
        r3 = r9.i;
        r3 = r3.right;
        r3 = r0 - r3;
        r7 = r9.i;
        r7 = r7.left;
        r7 = r2 - r7;
        r7 = java.lang.Math.min(r7, r10);
        r3 = java.lang.Math.max(r3, r7);
        if (r4 == 0) goto L_0x00d7;
    L_0x0047:
        r3 = r6 - r5;
        r7 = r2 - r0;
        r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r3 >= 0) goto L_0x0058;
    L_0x004f:
        r3 = r2 - r0;
        r7 = r6 + r5;
        r3 = r3 - r7;
        r3 = r3 / r8;
        r3 = r3 + r0;
        if (r4 == 0) goto L_0x00d7;
    L_0x0058:
        r2 = r2 - r6;
        r0 = r0 - r5;
        r0 = java.lang.Math.min(r0, r10);
        r0 = java.lang.Math.max(r2, r0);
    L_0x0062:
        r2 = r9.k;
        if (r2 == 0) goto L_0x006b;
    L_0x0066:
        r1 = r9.N;
        r1 = r1.top;
        r1 = (float) r1;
    L_0x006b:
        r2 = r9.k;
        if (r2 == 0) goto L_0x00cd;
    L_0x006f:
        r2 = r9.N;
        r2 = r2.bottom;
        r2 = (float) r2;
    L_0x0074:
        r3 = r9.i;
        r5 = r3.top;
        r3 = r9.i;
        r6 = r3.bottom;
        r3 = r9.k;
        if (r3 == 0) goto L_0x0096;
    L_0x0080:
        r3 = r9.i;
        r3 = r3.bottom;
        r3 = r1 - r3;
        r7 = r9.i;
        r7 = r7.top;
        r7 = r2 - r7;
        r7 = java.lang.Math.min(r7, r11);
        r3 = java.lang.Math.max(r3, r7);
        if (r4 == 0) goto L_0x00d5;
    L_0x0096:
        r3 = r6 - r5;
        r7 = r2 - r1;
        r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r3 >= 0) goto L_0x00a7;
    L_0x009e:
        r3 = r2 - r1;
        r7 = r6 + r5;
        r3 = r3 - r7;
        r3 = r3 / r8;
        r3 = r3 + r1;
        if (r4 == 0) goto L_0x00d5;
    L_0x00a7:
        r2 = r2 - r6;
        r1 = r1 - r5;
        r1 = java.lang.Math.min(r1, r11);
        r1 = java.lang.Math.max(r2, r1);
    L_0x00b1:
        r2 = r9.L;
        r2.postTranslate(r0, r1);
        r9.invalidate();
        r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r0 != 0) goto L_0x00d3;
    L_0x00bd:
        r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1));
        if (r0 != 0) goto L_0x00d3;
    L_0x00c1:
        r0 = 1;
    L_0x00c2:
        return r0;
    L_0x00c3:
        r0 = r1;
        goto L_0x001c;
    L_0x00c6:
        r2 = r9.getWidth();
        r2 = (float) r2;
        goto L_0x0025;
    L_0x00cd:
        r2 = r9.getHeight();
        r2 = (float) r2;
        goto L_0x0074;
    L_0x00d3:
        r0 = 0;
        goto L_0x00c2;
    L_0x00d5:
        r1 = r3;
        goto L_0x00b1;
    L_0x00d7:
        r0 = r3;
        goto L_0x0062;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.PhotoView.a(float, float):boolean");
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = new Matrix();
        this.x = new Matrix();
        this.G = -1;
        this.N = new Rect();
        this.v = true;
        this.p = o2.FIT_CENTER;
        this.A = new RectF();
        this.H = new RectF();
        this.i = new RectF();
        this.u = new float[9];
        a();
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.O = onClickListener;
    }

    public boolean c(float f, float f2) {
        if (!this.E) {
            return false;
        }
        if (nk.a(this.r)) {
            return true;
        }
        return this.g == 0.0f ? h() != this.M : h() > this.g;
    }

    public boolean b(float f, float f2) {
        if (!this.E) {
            return false;
        }
        if (nk.a(this.r)) {
            return true;
        }
        return this.g == 0.0f ? h() != this.M : h() > this.g;
    }

    public void a(float f, boolean z) {
        if (z) {
            this.a.a(f);
            if (App.az == 0) {
                return;
            }
        }
        this.P += f;
        this.L.postRotate(f, (float) (getWidth() / 2), (float) (getHeight() / 2));
        invalidate();
    }

    static void b(PhotoView photoView, boolean z) {
        photoView.a(z);
    }

    private void a(float f, float f2, float f3, boolean z) {
        float min = Math.min(Math.max(f, this.M), this.l);
        float h = min / h();
        this.L.postRotate(-this.P, (float) (getWidth() / 2), (float) (getHeight() / 2));
        this.L.postScale(h, h, f2, f3);
        this.q = min;
        this.L.postRotate(this.P, (float) (getWidth() / 2), (float) (getHeight() / 2));
        c(z);
        invalidate();
    }

    public void setIsVideo(boolean z) {
        this.K = z;
    }

    static boolean a(PhotoView photoView, float f, float f2) {
        return photoView.a(f, f2);
    }

    public void setRotation(float f, boolean z) {
        this.P = 0.0f;
        a(f, z);
    }

    public PhotoView(Context context) {
        super(context);
        this.L = new Matrix();
        this.x = new Matrix();
        this.G = -1;
        this.N = new Rect();
        this.v = true;
        this.p = o2.FIT_CENTER;
        this.A = new RectF();
        this.H = new RectF();
        this.i = new RectF();
        this.u = new float[9];
        a();
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        if (this.E && this.m) {
            this.y = true;
            e();
        }
    }

    static void a(PhotoView photoView, float f, float f2, float f3, boolean z) {
        photoView.a(f, f2, f3, z);
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!(this.O == null || this.m)) {
            this.O.onClick(this);
        }
        this.m = false;
        return true;
    }

    public void a(Bitmap bitmap) {
        boolean z;
        if (this.o == null) {
            z = false;
        } else if (bitmap != this.o.getBitmap()) {
            if (bitmap == null || (this.o.getIntrinsicWidth() == bitmap.getWidth() && this.o.getIntrinsicHeight() == bitmap.getHeight())) {
                z = false;
            } else {
                z = true;
            }
            this.M = 0.0f;
            this.o = null;
        } else {
            return;
        }
        if (this.o == null && bitmap != null) {
            this.o = new BitmapDrawable(getResources(), bitmap);
        }
        if (z) {
            this.F = 0;
            this.c = 0;
        }
        a(z);
        invalidate();
    }

    public void b(boolean z) {
        this.E = z;
        if (!this.E) {
            e();
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.E) {
            a(-f, -f2);
        }
        return true;
    }

    public void setInitialFitTolerance(float f) {
        this.J = f;
    }

    public void c() {
        a(-90.0f, true);
    }

    private void a() {
        Context context = getContext();
        if (!t) {
            t = true;
            h = new Paint();
            h.setAntiAlias(true);
            h.setStyle(Style.FILL);
            b = new Paint();
            b.setAntiAlias(true);
            b.setStyle(Style.STROKE);
        }
        this.C = new GestureDetectorCompat(context, this, null);
        this.z = new ScaleGestureDetector(context, this);
        if (VERSION.SDK_INT >= 19) {
            this.z.setQuickScaleEnabled(false);
        }
        this.f = new _4(this);
        this.r = new nk(this);
        this.n = new d4(this);
        this.a = new l_(this);
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    protected float b() {
        return this.M;
    }

    public void setHeightForInitialScaleCalculation(int i) {
        this.I = i;
    }

    static float a(PhotoView photoView) {
        return photoView.P;
    }

    public void f() {
        this.C = null;
        this.z = null;
        this.o = null;
        if (this.f != null) {
            this.f.a();
        }
        this.f = null;
        if (this.r != null) {
            this.r.a();
        }
        this.r = null;
        if (this.n != null) {
            this.n.a();
        }
        this.n = null;
        if (this.a != null) {
            this.a.a();
        }
        this.a = null;
        setOnClickListener(null);
        this.O = null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!(this.z == null || this.C == null)) {
            this.z.onTouchEvent(motionEvent);
            this.C.onTouchEvent(motionEvent);
            switch (motionEvent.getAction()) {
                case ay.f /*1*/:
                case ay.p /*3*/:
                    if (!nk.a(this.r)) {
                        c(false);
                        break;
                    }
                    break;
                default:
                    break;
            }
        }
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    static float a(PhotoView photoView, float f) {
        photoView.P = f;
        return f;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onDoubleTap(android.view.MotionEvent r6) {
        /*
        r5_this = this;
        r0 = r5.v;
        if (r0 == 0) goto L_0x0051;
    L_0x0004:
        r0 = r5.E;
        if (r0 == 0) goto L_0x0051;
    L_0x0008:
        r0 = r5.y;
        if (r0 != 0) goto L_0x004e;
    L_0x000c:
        r1 = r5.h();
        r0 = r5.M;
        r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x0053;
    L_0x0016:
        r0 = 1075838976; // 0x40200000 float:2.5 double:5.315350785E-315;
    L_0x0018:
        r2 = r5.M;
        r0 = java.lang.Math.max(r2, r0);
        r2 = r5.l;
        r0 = java.lang.Math.min(r2, r0);
        r2 = r5.M;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x0041;
    L_0x002a:
        r2 = r5.f;
        r3 = r5.getWidth();
        r3 = r3 / 2;
        r3 = (float) r3;
        r4 = r5.getHeight();
        r4 = r4 / 2;
        r4 = (float) r4;
        r2.a(r1, r0, r3, r4);
        r2 = com.whatsapp.App.az;
        if (r2 == 0) goto L_0x004e;
    L_0x0041:
        r2 = r5.f;
        r3 = r6.getX();
        r4 = r6.getY();
        r2.a(r1, r0, r3, r4);
    L_0x004e:
        r0 = 0;
        r5.y = r0;
    L_0x0051:
        r0 = 1;
        return r0;
    L_0x0053:
        r0 = r5.M;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.PhotoView.onDoubleTap(android.view.MotionEvent):boolean");
    }

    protected void onMeasure(int i, int i2) {
        if (this.G != -1) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(this.G, Integer.MIN_VALUE));
            setMeasuredDimension(getMeasuredWidth(), this.G);
            if (App.az == 0) {
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public void e() {
        this.L.set(this.x);
        this.L.getValues(this.u);
        this.q = this.u[0];
        invalidate();
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.L = new Matrix();
        this.x = new Matrix();
        this.G = -1;
        this.N = new Rect();
        this.v = true;
        this.p = o2.FIT_CENTER;
        this.A = new RectF();
        this.H = new RectF();
        this.i = new RectF();
        this.u = new float[9];
        a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(boolean r12) {
        /*
        r11_this = this;
        r10 = 1101004800; // 0x41a00000 float:20.0 double:5.439686476E-315;
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = 0;
        r5 = com.whatsapp.App.az;
        r0 = r11.i;
        r2 = r11.A;
        r0.set(r2);
        r0 = r11.L;
        r2 = r11.i;
        r0.mapRect(r2);
        r0 = r11.k;
        if (r0 == 0) goto L_0x00ac;
    L_0x0019:
        r0 = r11.N;
        r0 = r0.left;
        r0 = (float) r0;
    L_0x001e:
        r2 = r11.k;
        if (r2 == 0) goto L_0x00af;
    L_0x0022:
        r2 = r11.N;
        r2 = r2.right;
        r2 = (float) r2;
    L_0x0027:
        r3 = r11.i;
        r4 = r3.left;
        r3 = r11.i;
        r6 = r3.right;
        r3 = r6 - r4;
        r7 = r2 - r0;
        r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r3 >= 0) goto L_0x0040;
    L_0x0037:
        r3 = r2 - r0;
        r7 = r6 + r4;
        r3 = r3 - r7;
        r3 = r3 / r9;
        r3 = r3 + r0;
        if (r5 == 0) goto L_0x00c2;
    L_0x0040:
        r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r3 <= 0) goto L_0x0047;
    L_0x0044:
        r0 = r0 - r4;
        if (r5 == 0) goto L_0x0050;
    L_0x0047:
        r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x004f;
    L_0x004b:
        r0 = r2 - r6;
        if (r5 == 0) goto L_0x0050;
    L_0x004f:
        r0 = r1;
    L_0x0050:
        r2 = r11.k;
        if (r2 == 0) goto L_0x00b6;
    L_0x0054:
        r2 = r11.N;
        r2 = r2.top;
        r2 = (float) r2;
    L_0x0059:
        r3 = r11.k;
        if (r3 == 0) goto L_0x00b8;
    L_0x005d:
        r3 = r11.N;
        r3 = r3.bottom;
        r3 = (float) r3;
    L_0x0062:
        r4 = r11.i;
        r6 = r4.top;
        r4 = r11.i;
        r7 = r4.bottom;
        r4 = r7 - r6;
        r8 = r3 - r2;
        r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r4 >= 0) goto L_0x007b;
    L_0x0072:
        r4 = r3 - r2;
        r8 = r7 + r6;
        r4 = r4 - r8;
        r4 = r4 / r9;
        r4 = r4 + r2;
        if (r5 == 0) goto L_0x00c0;
    L_0x007b:
        r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r4 <= 0) goto L_0x0082;
    L_0x007f:
        r2 = r2 - r6;
        if (r5 == 0) goto L_0x00be;
    L_0x0082:
        r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r2 >= 0) goto L_0x008a;
    L_0x0086:
        r2 = r3 - r7;
        if (r5 == 0) goto L_0x00be;
    L_0x008a:
        r2 = java.lang.Math.abs(r0);
        r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r2 > 0) goto L_0x009a;
    L_0x0092:
        r2 = java.lang.Math.abs(r1);
        r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r2 <= 0) goto L_0x00a3;
    L_0x009a:
        if (r12 != 0) goto L_0x00a3;
    L_0x009c:
        r2 = r11.n;
        r2.a(r0, r1);
        if (r5 == 0) goto L_0x00ab;
    L_0x00a3:
        r2 = r11.L;
        r2.postTranslate(r0, r1);
        r11.invalidate();
    L_0x00ab:
        return;
    L_0x00ac:
        r0 = r1;
        goto L_0x001e;
    L_0x00af:
        r2 = r11.getWidth();
        r2 = (float) r2;
        goto L_0x0027;
    L_0x00b6:
        r2 = r1;
        goto L_0x0059;
    L_0x00b8:
        r3 = r11.getHeight();
        r3 = (float) r3;
        goto L_0x0062;
    L_0x00be:
        r1 = r2;
        goto L_0x008a;
    L_0x00c0:
        r1 = r4;
        goto L_0x008a;
    L_0x00c2:
        r0 = r3;
        goto L_0x0050;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.PhotoView.c(boolean):void");
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.o != null) {
            int saveCount = canvas.getSaveCount();
            canvas.save();
            if (this.j != null) {
                canvas.concat(this.j);
            }
            this.o.draw(canvas);
            canvas.restoreToCount(saveCount);
            if (this.K) {
                Bitmap bitmap = w;
                canvas.drawBitmap(bitmap, (float) ((getWidth() - bitmap.getWidth()) / 2), (float) ((getHeight() - bitmap.getHeight()) / 2), null);
            }
            this.i.set(this.o.getBounds());
            if (Math.abs(this.P % 180.0f) == 90.0f) {
                float f = this.i.right;
                this.i.right = this.i.bottom;
                this.i.bottom = f;
            }
            if (this.j != null) {
                this.j.mapRect(this.i);
            }
            if (this.k) {
                int saveCount2 = canvas.getSaveCount();
                canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), h);
                canvas.save();
                canvas.clipRect(this.N);
                if (this.j != null) {
                    canvas.concat(this.j);
                }
                this.o.draw(canvas);
                canvas.restoreToCount(saveCount2);
                canvas.drawRect(this.N, b);
            }
        }
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.E) {
            this.m = false;
            a(h() * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), false);
        }
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.B = true;
        int width = getWidth();
        int height = getHeight();
        if (this.k) {
            this.D = Math.min(e, Math.min(width, height));
            width = (width - this.D) / 2;
            height = (height - this.D) / 2;
            this.N.set(width, height, this.D + width, this.D + height);
        }
        a(z);
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (this.E) {
            this.r.a();
            this.n.a();
        }
        return true;
    }

    public void d() {
        a(90.0f, true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
        r14_this = this;
        r13 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r12 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        r9 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r11 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
        r10 = 0;
        r3 = com.whatsapp.App.az;
        r0 = r14.o;
        r4 = r0.getIntrinsicWidth();
        r0 = r14.o;
        r5 = r0.getIntrinsicHeight();
        r0 = r14.k;
        if (r0 == 0) goto L_0x0177;
    L_0x001b:
        r0 = e;
    L_0x001d:
        r1 = r14.k;
        if (r1 == 0) goto L_0x017d;
    L_0x0021:
        r2 = e;
    L_0x0023:
        if (r4 < 0) goto L_0x0027;
    L_0x0025:
        if (r0 != r4) goto L_0x0183;
    L_0x0027:
        if (r5 < 0) goto L_0x002b;
    L_0x0029:
        if (r2 != r5) goto L_0x0183;
    L_0x002b:
        r1 = 1;
    L_0x002c:
        r14.g = r10;
        if (r1 == 0) goto L_0x003f;
    L_0x0030:
        r1 = r14.k;
        if (r1 != 0) goto L_0x003f;
    L_0x0034:
        r1 = r14.L;
        r1.reset();
        r14.M = r13;
        r14.q = r13;
        if (r3 == 0) goto L_0x014d;
    L_0x003f:
        r1 = r14.A;
        r6 = (float) r4;
        r7 = (float) r5;
        r1.set(r10, r10, r6, r7);
        r1 = r14.k;
        if (r1 == 0) goto L_0x0053;
    L_0x004a:
        r1 = r14.H;
        r6 = r14.N;
        r1.set(r6);
        if (r3 == 0) goto L_0x005a;
    L_0x0053:
        r1 = r14.H;
        r6 = (float) r0;
        r7 = (float) r2;
        r1.set(r10, r10, r6, r7);
    L_0x005a:
        r1 = r14.L;
        r6 = r0 / 2;
        r7 = r4 / 2;
        r6 = r6 - r7;
        r6 = (float) r6;
        r7 = r2 / 2;
        r8 = r5 / 2;
        r7 = r7 - r8;
        r7 = (float) r7;
        r1.setTranslate(r6, r7);
        r1 = r14.I;
        if (r1 == 0) goto L_0x01d0;
    L_0x006f:
        r1 = r14.I;
    L_0x0071:
        r2 = r14.P;
        r2 = r2 % r12;
        r2 = java.lang.Math.abs(r2);
        r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));
        if (r2 != 0) goto L_0x0186;
    L_0x007c:
        r2 = (float) r0;
        r6 = (float) r5;
        r2 = r2 / r6;
        r6 = (float) r1;
        r7 = (float) r4;
        r6 = r6 / r7;
        r2 = java.lang.Math.min(r2, r6);
    L_0x0086:
        r14.M = r2;
        r2 = r14.M;
        r2 = java.lang.Math.min(r2, r11);
        r14.M = r2;
        r2 = r14.p;
        r6 = com.whatsapp.o2.CENTER_CROP;
        if (r2 != r6) goto L_0x00ad;
    L_0x0096:
        r2 = r14.P;
        r2 = r2 % r12;
        r2 = java.lang.Math.abs(r2);
        r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));
        if (r2 != 0) goto L_0x0192;
    L_0x00a1:
        r2 = (float) r0;
        r6 = (float) r5;
        r2 = r2 / r6;
        r6 = (float) r1;
        r7 = (float) r4;
        r6 = r6 / r7;
        r2 = java.lang.Math.max(r2, r6);
    L_0x00ab:
        if (r3 == 0) goto L_0x00db;
    L_0x00ad:
        r2 = r14.p;
        r6 = com.whatsapp.o2.FIT_WIDTH;
        if (r2 != r6) goto L_0x00c3;
    L_0x00b3:
        r2 = r14.P;
        r2 = r2 % r12;
        r2 = java.lang.Math.abs(r2);
        r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));
        if (r2 != 0) goto L_0x019e;
    L_0x00be:
        r2 = (float) r0;
        r6 = (float) r5;
        r2 = r2 / r6;
    L_0x00c1:
        if (r3 == 0) goto L_0x00db;
    L_0x00c3:
        r2 = r14.p;
        r6 = com.whatsapp.o2.FIT_HEIGHT;
        if (r2 != r6) goto L_0x00d9;
    L_0x00c9:
        r2 = r14.P;
        r2 = r2 % r12;
        r2 = java.lang.Math.abs(r2);
        r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));
        if (r2 != 0) goto L_0x01a3;
    L_0x00d4:
        r2 = (float) r1;
        r6 = (float) r4;
        r2 = r2 / r6;
    L_0x00d7:
        if (r3 == 0) goto L_0x00db;
    L_0x00d9:
        r2 = r14.M;
    L_0x00db:
        r6 = r14.P;
        r6 = r6 % r12;
        r6 = java.lang.Math.abs(r6);
        r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1));
        if (r6 != 0) goto L_0x0103;
    L_0x00e6:
        r6 = (float) r0;
        r7 = (float) r5;
        r6 = r6 / r7;
        r7 = (float) r1;
        r8 = (float) r4;
        r7 = r7 / r8;
        r8 = r6 / r7;
        r8 = r8 - r13;
        r8 = java.lang.Math.abs(r8);
        r9 = r14.J;
        r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
        if (r8 >= 0) goto L_0x0101;
    L_0x00f9:
        r2 = java.lang.Math.max(r6, r7);
        r14.g = r2;
        r2 = r14.g;
    L_0x0101:
        if (r3 == 0) goto L_0x011e;
    L_0x0103:
        r6 = (float) r0;
        r7 = (float) r4;
        r6 = r6 / r7;
        r7 = (float) r1;
        r8 = (float) r5;
        r7 = r7 / r8;
        r8 = r6 / r7;
        r8 = r8 - r13;
        r8 = java.lang.Math.abs(r8);
        r9 = r14.J;
        r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
        if (r8 >= 0) goto L_0x011e;
    L_0x0116:
        r2 = java.lang.Math.max(r6, r7);
        r14.g = r2;
        r2 = r14.g;
    L_0x011e:
        r6 = r14.q;
        r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r6 != 0) goto L_0x012a;
    L_0x0124:
        r6 = java.lang.Math.min(r2, r11);
        r14.q = r6;
    L_0x012a:
        r6 = r14.d;
        if (r6 == 0) goto L_0x01a8;
    L_0x012e:
        r6 = r14.s;
        if (r6 == 0) goto L_0x01a8;
    L_0x0132:
        r14.F = r0;
        r14.c = r1;
        r0 = r14.g;
        r0 = java.lang.Math.min(r0, r11);
        r14.g = r0;
        r0 = r14.L;
        r1 = r14.q;
        r2 = r14.q;
        r3 = r4 / 2;
        r3 = (float) r3;
        r4 = r5 / 2;
        r4 = (float) r4;
        r0.preScale(r1, r2, r3, r4);
    L_0x014d:
        r0 = r14.M;
        r1 = 1090519040; // 0x41000000 float:8.0 double:5.38787994E-315;
        r0 = r0 * r1;
        r1 = 1090519040; // 0x41000000 float:8.0 double:5.38787994E-315;
        r0 = java.lang.Math.max(r0, r1);
        r14.l = r0;
        r0 = r14.L;
        r1 = r14.P;
        r2 = r14.getWidth();
        r2 = r2 / 2;
        r2 = (float) r2;
        r3 = r14.getHeight();
        r3 = r3 / 2;
        r3 = (float) r3;
        r0.postRotate(r1, r2, r3);
        r0 = r14.x;
        r1 = r14.L;
        r0.set(r1);
        return;
    L_0x0177:
        r0 = r14.getWidth();
        goto L_0x001d;
    L_0x017d:
        r2 = r14.getHeight();
        goto L_0x0023;
    L_0x0183:
        r1 = 0;
        goto L_0x002c;
    L_0x0186:
        r2 = (float) r0;
        r6 = (float) r4;
        r2 = r2 / r6;
        r6 = (float) r1;
        r7 = (float) r5;
        r6 = r6 / r7;
        r2 = java.lang.Math.min(r2, r6);
        goto L_0x0086;
    L_0x0192:
        r2 = (float) r0;
        r6 = (float) r4;
        r2 = r2 / r6;
        r6 = (float) r1;
        r7 = (float) r5;
        r6 = r6 / r7;
        r2 = java.lang.Math.max(r2, r6);
        goto L_0x00ab;
    L_0x019e:
        r2 = (float) r0;
        r6 = (float) r4;
        r2 = r2 / r6;
        goto L_0x00c1;
    L_0x01a3:
        r2 = (float) r1;
        r6 = (float) r5;
        r2 = r2 / r6;
        goto L_0x00d7;
    L_0x01a8:
        r6 = r14.s;
        if (r6 == 0) goto L_0x01b8;
    L_0x01ac:
        r6 = r14.F;
        if (r6 == r0) goto L_0x0132;
    L_0x01b0:
        r6 = java.lang.Math.min(r2, r11);
        r14.q = r6;
        if (r3 == 0) goto L_0x0132;
    L_0x01b8:
        r6 = r14.d;
        if (r6 == 0) goto L_0x01c8;
    L_0x01bc:
        r6 = r14.c;
        if (r6 == r1) goto L_0x0132;
    L_0x01c0:
        r6 = java.lang.Math.min(r2, r11);
        r14.q = r6;
        if (r3 == 0) goto L_0x0132;
    L_0x01c8:
        r2 = java.lang.Math.min(r2, r11);
        r14.q = r2;
        goto L_0x0132;
    L_0x01d0:
        r1 = r2;
        goto L_0x0071;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.PhotoView.g():void");
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.E) {
            this.r.a(f, f2);
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.E) {
            this.f.a();
            this.m = true;
        }
        return true;
    }

    static void a(PhotoView photoView, boolean z) {
        photoView.c(z);
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    protected float h() {
        return this.q;
    }
}
