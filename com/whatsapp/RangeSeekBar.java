package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class RangeSeekBar extends ImageView {
    private static final String[] C;
    public static final int f;
    public static final int l;
    private boolean A;
    private double B;
    private final double a;
    private RectF b;
    private d3 c;
    private Bitmap d;
    private bw e;
    private boolean g;
    private Number h;
    private final double i;
    private double j;
    private float k;
    private int m;
    private Bitmap n;
    private Bitmap o;
    private final p2 p;
    private float q;
    private Bitmap r;
    private float s;
    private final Paint t;
    private int u;
    private final Number v;
    private final Number w;
    private float x;
    private float y;
    private int z;

    public void setNormalizedMinValue(double d) {
        this.B = Math.max(0.0d, Math.min(1.0d, Math.min(d, this.j)));
        invalidate();
    }

    void e() {
        this.g = true;
    }

    public void setThumbResources(int i, int i2, int i3, int i4) {
        this.d = BitmapFactory.decodeResource(getResources(), i);
        this.o = BitmapFactory.decodeResource(getResources(), i2);
        this.n = BitmapFactory.decodeResource(getResources(), i3);
        this.r = BitmapFactory.decodeResource(getResources(), i4);
        this.y = 0.15f * ((float) this.d.getHeight());
        this.q = 0.5f * ((float) this.d.getWidth());
    }

    public void setSlowScrubStep(float f) {
        this.s = f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        r6_this = this;
        r1 = 1;
        r0 = 0;
        r2 = com.whatsapp.App.az;
        r3 = r6.isEnabled();
        if (r3 != 0) goto L_0x000b;
    L_0x000a:
        return r0;
    L_0x000b:
        r3 = r7.getAction();
        r3 = r3 & 255;
        switch(r3) {
            case 0: goto L_0x0016;
            case 1: goto L_0x009f;
            case 2: goto L_0x0054;
            case 3: goto L_0x00ef;
            case 4: goto L_0x0014;
            case 5: goto L_0x00d0;
            case 6: goto L_0x00e7;
            default: goto L_0x0014;
        };
    L_0x0014:
        r0 = r1;
        goto L_0x000a;
    L_0x0016:
        r3 = r7.getPointerCount();
        r3 = r3 + -1;
        r3 = r7.getPointerId(r3);
        r6.u = r3;
        r3 = r6.u;
        r3 = r7.findPointerIndex(r3);
        r3 = r7.getX(r3);
        r6.x = r3;
        r3 = r6.x;
        r6.k = r3;
        r3 = r6.x;
        r3 = r6.a(r3);
        r6.c = r3;
        r3 = r6.c;
        if (r3 != 0) goto L_0x0043;
    L_0x003e:
        r0 = super.onTouchEvent(r7);
        goto L_0x000a;
    L_0x0043:
        r6.setPressed(r1);
        r6.invalidate();
        r6.e();
        r6.b(r7);
        r6.c();
        if (r2 == 0) goto L_0x0014;
    L_0x0054:
        r3 = r6.c;
        if (r3 == 0) goto L_0x0014;
    L_0x0058:
        r3 = r6.g;
        if (r3 == 0) goto L_0x0061;
    L_0x005c:
        r6.b(r7);
        if (r2 == 0) goto L_0x0088;
    L_0x0061:
        r3 = r6.u;
        r3 = r7.findPointerIndex(r3);
        r3 = r7.getX(r3);
        r4 = r6.x;
        r3 = r3 - r4;
        r3 = java.lang.Math.abs(r3);
        r4 = r6.z;
        r4 = (float) r4;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 <= 0) goto L_0x0088;
    L_0x0079:
        r6.setPressed(r1);
        r6.invalidate();
        r6.e();
        r6.b(r7);
        r6.c();
    L_0x0088:
        r3 = r6.A;
        if (r3 == 0) goto L_0x0014;
    L_0x008c:
        r3 = r6.e;
        if (r3 == 0) goto L_0x0014;
    L_0x0090:
        r3 = r6.e;
        r4 = r6.f();
        r5 = r6.b();
        r3.a(r6, r4, r5, r1);
        if (r2 == 0) goto L_0x0014;
    L_0x009f:
        r3 = r6.g;
        if (r3 == 0) goto L_0x00ae;
    L_0x00a3:
        r6.b(r7);
        r6.a();
        r6.setPressed(r0);
        if (r2 == 0) goto L_0x00b7;
    L_0x00ae:
        r6.e();
        r6.b(r7);
        r6.a();
    L_0x00b7:
        r3 = 0;
        r6.c = r3;
        r6.invalidate();
        r3 = r6.e;
        if (r3 == 0) goto L_0x0014;
    L_0x00c1:
        r3 = r6.e;
        r4 = r6.f();
        r5 = r6.b();
        r3.a(r6, r4, r5, r0);
        if (r2 == 0) goto L_0x0014;
    L_0x00d0:
        r3 = r7.getPointerCount();
        r3 = r3 + -1;
        r4 = r7.getX(r3);
        r6.x = r4;
        r3 = r7.getPointerId(r3);
        r6.u = r3;
        r6.invalidate();
        if (r2 == 0) goto L_0x0014;
    L_0x00e7:
        r6.a(r7);
        r6.invalidate();
        if (r2 == 0) goto L_0x0014;
    L_0x00ef:
        r2 = r6.g;
        if (r2 == 0) goto L_0x00f9;
    L_0x00f3:
        r6.a();
        r6.setPressed(r0);
    L_0x00f9:
        r6.invalidate();
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RangeSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private d3 a(float f) {
        boolean b = b(f, this.B);
        boolean a = a(f, this.j);
        if (b && a) {
            return f / ((float) getWidth()) > 0.5f ? d3.MIN : d3.MAX;
        } else {
            if (b) {
                return d3.MIN;
            }
            if (a) {
                return d3.MAX;
            }
            return (f <= b(this.B) || f >= b(this.j)) ? null : d3.MID;
        }
    }

    private void a(float f, boolean z, Canvas canvas) {
        Bitmap bitmap;
        if (this.m > 0) {
            this.t.setColor(l);
            this.t.setStrokeWidth(this.y / 2.0f);
            canvas.drawLine(f, 0.0f, f, ((float) this.m) + (0.5f * (((float) (getHeight() - this.m)) - this.y)), this.t);
        }
        if (z) {
            bitmap = this.o;
        } else {
            bitmap = this.d;
        }
        canvas.drawBitmap(bitmap, f - ((float) (this.d.getWidth() / 2)), (float) this.m, this.t);
    }

    void a() {
        this.g = false;
    }

    public void setNotifyWhileDragging(boolean z) {
        this.A = z;
    }

    public RangeSeekBar(Number number, Number number2, Number number3, Context context) {
        super(context);
        this.t = new Paint(1);
        this.B = 0.0d;
        this.j = 1.0d;
        this.c = null;
        this.A = false;
        this.u = 255;
        this.b = new RectF();
        this.w = number;
        this.v = number2;
        this.h = number3;
        this.i = number.doubleValue();
        this.a = number2.doubleValue();
        this.p = p2.fromNumber(number);
        setThumbResources(R.drawable.seek_thumb_min_normal, R.drawable.seek_thumb_min_normal, R.drawable.seek_thumb_max_normal, R.drawable.seek_thumb_max_normal);
        setFocusable(true);
        setFocusableInTouchMode(true);
        d();
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable(C[1]));
        this.B = bundle.getDouble(C[2]);
        this.j = bundle.getDouble(C[0]);
    }

    public void setNormalizedMaxValue(double d) {
        this.j = Math.max(0.0d, Math.min(1.0d, Math.max(d, this.B)));
        invalidate();
    }

    private final void a(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.u) {
            if (action == 0) {
                action = 1;
            } else {
                action = 0;
            }
            this.x = motionEvent.getX(action);
            this.u = motionEvent.getPointerId(action);
        }
    }

    public boolean d(double d) {
        return this.j != Math.max(0.0d, Math.min(1.0d, Math.max(d, this.B)));
    }

    private void c() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    private final void d() {
        this.z = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private Number a(double d) {
        return this.p.toNumber(this.i + ((this.a - this.i) * d));
    }

    private void b(float f, boolean z, Canvas canvas) {
        Bitmap bitmap;
        if (this.m > 0) {
            this.t.setColor(l);
            this.t.setStrokeWidth(this.y / 2.0f);
            canvas.drawLine(f, 0.0f, f, ((float) this.m) + (0.5f * (((float) (getHeight() - this.m)) - this.y)), this.t);
        }
        if (z) {
            bitmap = this.r;
        } else {
            bitmap = this.n;
        }
        canvas.drawBitmap(bitmap, f - ((float) (this.n.getWidth() / 2)), (float) this.m, this.t);
    }

    public void setTopExtension(int i) {
        this.m = i;
    }

    private float b(double d) {
        return (float) (((double) this.q) + (((double) (((float) getWidth()) - (2.0f * this.q))) * d));
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable(C[3], super.onSaveInstanceState());
        bundle.putDouble(C[4], this.B);
        bundle.putDouble(C[5], this.j);
        return bundle;
    }

    public Number b() {
        return a(this.j);
    }

    private boolean b(float f, double d) {
        return Math.abs(f - b(d)) <= ((float) (this.d.getWidth() / 2));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(android.view.MotionEvent r14) {
        /*
        r13_this = this;
        r1 = 4;
        r2 = 2;
        r12 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r10 = 0;
        r3 = com.whatsapp.App.az;
        r0 = r13.u;
        r0 = r14.findPointerIndex(r0);
        r4 = r14.getX(r0);
        r5 = r14.getY(r0);
        r0 = com.whatsapp.d3.MIN;
        r6 = r13.c;
        r0 = r0.equals(r6);
        if (r0 == 0) goto L_0x0072;
    L_0x0020:
        r0 = r13.s;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0044;
    L_0x0026:
        r0 = r13.k;
        r6 = r13.b(r0);
        r8 = r13.b(r4);
        r6 = r6 - r8;
        r0 = r13.s;
        r0 = r0 * r12;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0107;
    L_0x0038:
        r0 = r1;
    L_0x0039:
        r8 = (double) r0;
        r6 = r6 / r8;
        r8 = r13.B;
        r6 = r8 - r6;
        r13.setNormalizedMinValue(r6);
        if (r3 == 0) goto L_0x004b;
    L_0x0044:
        r6 = r13.b(r4);
        r13.setNormalizedMinValue(r6);
    L_0x004b:
        r0 = r13.h;
        r6 = r13.a(r0);
        r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r0 <= 0) goto L_0x0104;
    L_0x0055:
        r6 = r13.j;
        r8 = r13.B;
        r6 = r6 - r8;
        r0 = r13.h;
        r8 = r13.a(r0);
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x0104;
    L_0x0064:
        r6 = r13.B;
        r0 = r13.h;
        r8 = r13.a(r0);
        r6 = r6 + r8;
        r13.setNormalizedMaxValue(r6);
        if (r3 == 0) goto L_0x0104;
    L_0x0072:
        r0 = com.whatsapp.d3.MAX;
        r6 = r13.c;
        r0 = r0.equals(r6);
        if (r0 == 0) goto L_0x00ce;
    L_0x007c:
        r0 = r13.s;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x00a0;
    L_0x0082:
        r0 = r13.k;
        r6 = r13.b(r0);
        r8 = r13.b(r4);
        r6 = r6 - r8;
        r0 = r13.s;
        r0 = r0 * r12;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x010a;
    L_0x0094:
        r0 = (double) r1;
        r0 = r6 / r0;
        r6 = r13.j;
        r0 = r6 - r0;
        r13.setNormalizedMaxValue(r0);
        if (r3 == 0) goto L_0x00a7;
    L_0x00a0:
        r0 = r13.b(r4);
        r13.setNormalizedMaxValue(r0);
    L_0x00a7:
        r0 = r13.h;
        r0 = r13.a(r0);
        r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r0 <= 0) goto L_0x0104;
    L_0x00b1:
        r0 = r13.j;
        r6 = r13.B;
        r0 = r0 - r6;
        r2 = r13.h;
        r6 = r13.a(r2);
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x0104;
    L_0x00c0:
        r0 = r13.j;
        r2 = r13.h;
        r6 = r13.a(r2);
        r0 = r0 - r6;
        r13.setNormalizedMinValue(r0);
        if (r3 == 0) goto L_0x0104;
    L_0x00ce:
        r0 = com.whatsapp.d3.MID;
        r1 = r13.c;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0104;
    L_0x00d8:
        r0 = r13.B;
        r0 = r13.b(r0);
        r2 = r13.j;
        r1 = r13.b(r2);
        r2 = r13.k;
        r2 = r2 - r4;
        r0 = r0 - r2;
        r6 = r13.b(r0);
        r0 = r1 - r2;
        r0 = r13.b(r0);
        r2 = r13.c(r6);
        if (r2 == 0) goto L_0x0104;
    L_0x00f8:
        r2 = r13.d(r0);
        if (r2 == 0) goto L_0x0104;
    L_0x00fe:
        r13.setNormalizedMinValue(r6);
        r13.setNormalizedMaxValue(r0);
    L_0x0104:
        r13.k = r4;
        return;
    L_0x0107:
        r0 = r2;
        goto L_0x0039;
    L_0x010a:
        r1 = r2;
        goto L_0x0094;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RangeSeekBar.b(android.view.MotionEvent):void");
    }

    public boolean c(double d) {
        return this.B != Math.max(0.0d, Math.min(1.0d, Math.min(d, this.j)));
    }

    static {
        String[] strArr = new String[6];
        String str = "*I5";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 103;
                        break;
                    case ay.f /*1*/:
                        i4 = 8;
                        break;
                    case ay.n /*2*/:
                        i4 = 109;
                        break;
                    case ay.p /*3*/:
                        i4 = 5;
                        break;
                    default:
                        i4 = 120;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "*A#";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "4]=@*";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "*A#";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "*I5";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    C = strArr3;
                    l = Color.argb(255, 51, 181, 229);
                    f = Color.argb(102, 0, 0, 0);
                default:
                    strArr2[i2] = str;
                    str = "4]=@*";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private double a(Number number) {
        return 0.0d == this.a - this.i ? 0.0d : (number.doubleValue() - this.i) / (this.a - this.i);
    }

    private double b(float f) {
        int width = getWidth();
        return ((float) width) <= this.q * 2.0f ? 0.0d : Math.min(1.0d, Math.max(0.0d, (double) ((f - this.q) / (((float) width) - (this.q * 2.0f)))));
    }

    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.t.setStyle(Style.FILL);
        this.t.setColor(f);
        this.b.set(this.q, 0.0f, b(this.B), (float) getHeight());
        canvas.drawRect(this.b, this.t);
        this.b.set(b(this.j), 0.0f, ((float) getWidth()) - this.q, ((float) this.m) + ((((float) (getHeight() - this.m)) + this.y) * 0.5f));
        canvas.drawRect(this.b, this.t);
        this.b.set(this.q, ((float) this.m) + ((((float) (getHeight() - this.m)) - this.y) * 0.5f), ((float) getWidth()) - this.q, ((float) this.m) + ((((float) (getHeight() - this.m)) + this.y) * 0.5f));
        this.t.setColor(-7829368);
        this.t.setAntiAlias(true);
        canvas.drawRect(this.b, this.t);
        this.b.left = b(this.B);
        this.b.right = b(this.j);
        this.t.setColor(l);
        canvas.drawRect(this.b, this.t);
        a(b(this.B), d3.MIN.equals(this.c), canvas);
        b(b(this.j), d3.MAX.equals(this.c), canvas);
    }

    protected synchronized void onMeasure(int i, int i2) {
        int size;
        if (MeasureSpec.getMode(i) != 0) {
            size = MeasureSpec.getSize(i);
        } else {
            size = 200;
        }
        int max = Math.max(this.d.getHeight(), this.n.getHeight()) + this.m;
        if (MeasureSpec.getMode(i2) != 0) {
            max = Math.min(max, MeasureSpec.getSize(i2));
        }
        setMeasuredDimension(size, max);
    }

    public void setSelectedMaxValue(Number number) {
        if (0.0d == this.a - this.i) {
            setNormalizedMaxValue(1.0d);
            if (App.az == 0) {
                return;
            }
        }
        setNormalizedMaxValue(a(number));
    }

    private boolean a(float f, double d) {
        return Math.abs(f - b(d)) <= ((float) (this.n.getWidth() / 2));
    }

    public void setOnRangeSeekBarChangeListener(bw bwVar) {
        this.e = bwVar;
    }

    public Number f() {
        return a(this.B);
    }
}
