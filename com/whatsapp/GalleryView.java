package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class GalleryView extends ViewGroup implements OnDoubleTapListener {
    private static final String[] G;
    private static Interpolator y;
    private float A;
    private boolean B;
    private int C;
    private boolean D;
    private int E;
    private boolean F;
    private Bitmap a;
    private Paint b;
    private int c;
    private int d;
    private int e;
    private float f;
    private float g;
    Bitmap h;
    private Canvas i;
    private int j;
    private Paint k;
    private int l;
    private RectF m;
    private RectF n;
    private VelocityTracker o;
    public Scroller p;
    private int q;
    private int r;
    private int s;
    private n9 t;
    private Paint u;
    private int v;
    boolean w;
    private d9 x;
    private GestureDetector z;

    public GalleryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = -1;
        this.r = -1;
        this.e = 0;
        this.l = 0;
        b();
        this.z = new GestureDetector(new _r(this));
        this.z.setOnDoubleTapListener(this);
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.t != null) {
            this.t.b();
        }
        return false;
    }

    public void setScreenWidth(int i) {
        if (i == 0) {
            i = getWidth();
        }
        this.C = i;
    }

    public void computeScroll() {
        if (this.p.computeScrollOffset()) {
            scrollTo(this.p.getCurrX(), this.p.getCurrY());
            postInvalidate();
            if (App.az == 0) {
                return;
            }
        }
        if (this.r != -1) {
            this.d = Math.max(0, Math.min(this.r, getChildCount() - 1));
            this.r = -1;
        }
    }

    protected void onMeasure(int i, int i2) {
        float f;
        int i3 = App.az;
        super.onMeasure(i, i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(MeasureSpec.getMode(i) == 1073741824 || i == 0)) {
            Log.e(G[7] + i);
        }
        int mode = MeasureSpec.getMode(i2);
        if (!(mode == 1073741824 || i2 == 0)) {
            Log.e(G[8] + i2);
        }
        int childCount = getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            int i5;
            if (this.D) {
                i5 = 98;
            } else {
                i5 = 100;
            }
            getChildAt(i4).measure(i, MeasureSpec.makeMeasureSpec((i5 * size2) / 100, mode));
            i5 = i4 + 1;
            if (i3 != 0) {
                break;
            }
            i4 = i5;
        }
        if (this.F) {
            this.F = false;
            this.a = a(this.a, size, size2, getContext());
            this.s = this.a.getWidth();
            this.j = this.a.getHeight();
        }
        if (this.s > size) {
            f = ((float) ((childCount * size) - this.s)) / (((float) (childCount - 1)) * ((float) size));
        } else {
            f = 1.0f;
        }
        this.f = f;
        if (this.v != size) {
            this.v = size;
            scrollTo(this.d * size, 0);
            setScreenWidth(size);
        }
        d();
        invalidate();
    }

    static int a(GalleryView galleryView) {
        return galleryView.e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void dispatchDraw(android.graphics.Canvas r8) {
        /*
        r7_this = this;
        r2 = 1;
        r1 = 0;
        r3 = com.whatsapp.App.az;
        r0 = r7.a;
        if (r0 == 0) goto L_0x0045;
    L_0x0008:
        r0 = r7.getScrollX();
        r0 = (float) r0;
        r4 = r7.f;
        r0 = r0 * r4;
        r4 = r7.s;
        r4 = (float) r4;
        r4 = r4 + r0;
        r5 = r7.getRight();
        r6 = r7.getLeft();
        r5 = r5 - r6;
        r5 = (float) r5;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 >= 0) goto L_0x002f;
    L_0x0022:
        r0 = r7.getRight();
        r4 = r7.getLeft();
        r0 = r0 - r4;
        r4 = r7.s;
        r0 = r0 - r4;
        r0 = (float) r0;
    L_0x002f:
        r4 = r7.a;
        r5 = r7.getBottom();
        r6 = r7.getTop();
        r5 = r5 - r6;
        r6 = r7.j;
        r5 = r5 - r6;
        r5 = r5 / 2;
        r5 = (float) r5;
        r6 = r7.u;
        r8.drawBitmap(r4, r0, r5, r6);
    L_0x0045:
        r0 = r7.e;
        if (r0 == r2) goto L_0x00e5;
    L_0x0049:
        r0 = r7.r;
        r4 = -1;
        if (r0 != r4) goto L_0x00e5;
    L_0x004e:
        r0 = r2;
    L_0x004f:
        if (r0 == 0) goto L_0x0087;
    L_0x0051:
        r0 = r7.d;
        r0 = r7.getChildAt(r0);
        if (r0 == 0) goto L_0x0062;
    L_0x0059:
        r4 = r7.getDrawingTime();
        r7.drawChild(r8, r0, r4);
        if (r3 == 0) goto L_0x0085;
    L_0x0062:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = G;
        r4 = r4[r1];
        r0 = r0.append(r4);
        r4 = r7.d;
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r7.t;
        if (r0 == 0) goto L_0x0085;
    L_0x0080:
        r0 = r7.t;
        r0.a();
    L_0x0085:
        if (r3 == 0) goto L_0x00c8;
    L_0x0087:
        r4 = r7.getDrawingTime();
        r0 = r7.r;
        if (r0 < 0) goto L_0x00b6;
    L_0x008f:
        r0 = r7.r;
        r6 = r7.getChildCount();
        if (r0 >= r6) goto L_0x00b6;
    L_0x0097:
        r0 = r7.d;
        r6 = r7.r;
        r0 = r0 - r6;
        r0 = java.lang.Math.abs(r0);
        if (r0 != r2) goto L_0x00b6;
    L_0x00a2:
        r0 = r7.d;
        r0 = r7.getChildAt(r0);
        r7.drawChild(r8, r0, r4);
        r0 = r7.r;
        r0 = r7.getChildAt(r0);
        r7.drawChild(r8, r0, r4);
        if (r3 == 0) goto L_0x00c8;
    L_0x00b6:
        r2 = r7.getChildCount();
        r0 = r1;
    L_0x00bb:
        if (r0 >= r2) goto L_0x00c8;
    L_0x00bd:
        r1 = r7.getChildAt(r0);
        r7.drawChild(r8, r1, r4);
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x00bb;
    L_0x00c8:
        r0 = r7.D;
        if (r0 == 0) goto L_0x00e4;
    L_0x00cc:
        r7.d();
        r0 = r7.h;
        r1 = r7.getScrollX();
        r1 = (float) r1;
        r2 = r7.getMeasuredHeight();
        r2 = r2 * 98;
        r2 = r2 / 100;
        r2 = (float) r2;
        r3 = r7.u;
        r8.drawBitmap(r0, r1, r2, r3);
    L_0x00e4:
        return;
    L_0x00e5:
        r0 = r1;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GalleryView.dispatchDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
        r5_this = this;
        r1 = 0;
        r2 = 1;
        r3 = com.whatsapp.App.az;
        r0 = r5.w;
        if (r0 == 0) goto L_0x0009;
    L_0x0008:
        return r2;
    L_0x0009:
        r4 = r6.getAction();
        r0 = 2;
        if (r4 != r0) goto L_0x0014;
    L_0x0010:
        r0 = r5.e;
        if (r0 != 0) goto L_0x0008;
    L_0x0014:
        r0 = r5.o;
        if (r0 != 0) goto L_0x001e;
    L_0x0018:
        r0 = android.view.VelocityTracker.obtain();
        r5.o = r0;
    L_0x001e:
        r0 = r5.o;
        r0.addMovement(r6);
        r0 = r5.d;
        r0 = r5.getChildAt(r0);
        r0 = r0 instanceof com.whatsapp.TouchImageView;
        if (r0 == 0) goto L_0x0059;
    L_0x002d:
        r0 = r6.getPointerCount();
        if (r0 <= r2) goto L_0x0059;
    L_0x0033:
        r0 = r5.d;
        r0 = r5.getChildAt(r0);
        r0 = (com.whatsapp.TouchImageView) r0;
        r0 = r0.q;
        if (r0 != 0) goto L_0x0059;
    L_0x003f:
        r0 = r5.d;
        r0 = r5.getChildAt(r0);
        r0 = (com.whatsapp.TouchImageView) r0;
        r0 = r0.B;
        if (r0 != 0) goto L_0x0059;
    L_0x004b:
        r0 = r5.d;
        r0 = r5.getChildAt(r0);
        r0 = (com.whatsapp.TouchImageView) r0;
        r0.n = r2;
        com.whatsapp.TouchImageView.s = r2;
        r5.w = r2;
    L_0x0059:
        switch(r4) {
            case 0: goto L_0x0076;
            case 1: goto L_0x0097;
            case 2: goto L_0x0062;
            case 3: goto L_0x0097;
            case 4: goto L_0x005c;
            case 5: goto L_0x00b9;
            case 6: goto L_0x00b4;
            default: goto L_0x005c;
        };
    L_0x005c:
        r0 = r5.e;
        if (r0 != 0) goto L_0x0008;
    L_0x0060:
        r2 = r1;
        goto L_0x0008;
    L_0x0062:
        r0 = com.whatsapp.TouchImageView.s;
        if (r0 != r2) goto L_0x0071;
    L_0x0066:
        r0 = r5.t;
        if (r0 == 0) goto L_0x005c;
    L_0x006a:
        r0 = r5.t;
        r0.a(r6);
        if (r3 == 0) goto L_0x005c;
    L_0x0071:
        r5.a(r6);
        if (r3 == 0) goto L_0x005c;
    L_0x0076:
        r0 = r6.getX();
        r4 = r6.getY();
        r5.A = r0;
        r5.g = r4;
        r5.B = r2;
        r0 = r6.getPointerId(r1);
        r5.q = r0;
        r0 = r5.p;
        r0 = r0.isFinished();
        if (r0 == 0) goto L_0x00c2;
    L_0x0092:
        r0 = r1;
    L_0x0093:
        r5.e = r0;
        if (r3 == 0) goto L_0x005c;
    L_0x0097:
        r0 = G;
        r4 = 5;
        r0 = r0[r4];
        com.whatsapp.util.Log.w(r0);
        r0 = -1;
        r5.q = r0;
        r5.B = r1;
        r0 = r5.o;
        if (r0 == 0) goto L_0x00b0;
    L_0x00a8:
        r0 = r5.o;
        r0.recycle();
        r0 = 0;
        r5.o = r0;
    L_0x00b0:
        r5.e = r1;
        if (r3 == 0) goto L_0x005c;
    L_0x00b4:
        r5.b(r6);
        if (r3 == 0) goto L_0x005c;
    L_0x00b9:
        r0 = G;
        r3 = 4;
        r0 = r0[r3];
        com.whatsapp.util.Log.e(r0);
        goto L_0x005c;
    L_0x00c2:
        r0 = r2;
        goto L_0x0093;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GalleryView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    private void a(MotionEvent motionEvent) {
        int findPointerIndex = motionEvent.findPointerIndex(this.q);
        if (findPointerIndex != -1) {
            float x = motionEvent.getX(findPointerIndex);
            int abs = (int) Math.abs(motionEvent.getY(findPointerIndex) - this.g);
            if (((int) Math.abs(x - this.A)) > this.c) {
                findPointerIndex = 1;
            } else {
                boolean z = false;
            }
            if (abs > this.c) {
                int i = 1;
            } else {
                boolean z2 = false;
            }
            if (findPointerIndex != 0 || r3 != 0) {
                if (findPointerIndex != 0 && r3 == 0) {
                    this.e = 1;
                    this.A = x;
                }
                if (this.B) {
                    this.B = false;
                    View childAt = getChildAt(this.d);
                    if (childAt != null) {
                        childAt.cancelLongPress();
                    }
                }
            }
        }
    }

    public void setEventCallback(n9 n9Var) {
        this.t = n9Var;
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        int i = App.az;
        int childCount = getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            getChildAt(i2).setOnLongClickListener(onLongClickListener);
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public boolean dispatchUnhandledMove(View view, int i) {
        if (i == 17) {
            if (c() > 0) {
                a(c() - 1);
                return true;
            }
        } else if (i == 66 && c() < getChildCount() - 1) {
            a(c() + 1);
            return true;
        }
        return super.dispatchUnhandledMove(view, i);
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.t != null) {
            this.t.b(0);
        }
        return false;
    }

    static {
        String[] strArr = new String[9];
        String str = "L\u001cE[wY\u0004vA{N\n\u0006Y}t\u001e\\E`N\u0013]hdB\u0018^\u0018";
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
                        i3 = 43;
                        break;
                    case ay.f /*1*/:
                        i3 = 125;
                        break;
                    case ay.n /*2*/:
                        i3 = 41;
                        break;
                    case ay.p /*3*/:
                        i3 = 55;
                        break;
                    default:
                        i3 = 18;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "J\u001e@C}E]YX`B\u0013]R`\u000b\u0019F@|";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "H\u001c\\Pz_]H\u0017qJ\u0013JR~\u000b\tFBqC]LAwE\t";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "J\u001e]^}E\"YX{E\tLEMO\u0012^Y";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "b\u0013]R`H\u0018YCwO]H\u0017fD\bJ_2N\u000bLYf\u000bP\tbB";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "m;\u0018\u000e#\u0012L\u0010";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "L\u001cE[wY\u0004_^w\\RFY\u007fN\u001cZB`NR\t@{O\tAzwJ\u000e\\Ewx\rLT(";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "L\u001cE[wY\u0004_^w\\RFY\u007fN\u001cZB`NR\t_wB\u001aAC_N\u001cZB`N.YRq\u0011";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    G = strArr3;
                    y = new a_i();
                default:
                    strArr2[i] = str;
                    str = "L\u001cE[wY\u0004\u0004A{N\n\u0006X}FG";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void a(int i, boolean z) {
        int i2;
        int i3;
        if (i != this.d) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        this.r = i;
        View focusedChild = getFocusedChild();
        if (!(focusedChild == null || r0 == 0 || focusedChild != getChildAt(this.d))) {
            focusedChild.clearFocus();
        }
        int width = (getWidth() * i) - getScrollX();
        Scroller scroller = this.p;
        int scrollX = getScrollX();
        if (z) {
            i2 = 0;
        } else {
            i2 = Math.abs(width) * 2;
        }
        scroller.startScroll(scrollX, 0, width, 0, i2);
        if (this.t != null) {
            this.t.a(i);
        }
        invalidate();
    }

    private void a() {
        int width = getWidth();
        a((getScrollX() + (width / 2)) / width);
    }

    private void b(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.q) {
            if (action == 0) {
                action = 1;
            } else {
                action = 0;
            }
            this.A = motionEvent.getX(action);
            this.g = motionEvent.getY(action);
            this.q = motionEvent.getPointerId(action);
            if (this.o != null) {
                this.o.clear();
            }
        }
    }

    public int c() {
        return this.d;
    }

    public GalleryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        r8_this = this;
        r7 = 2;
        r6 = -1;
        r5 = 0;
        r4 = 1;
        r0 = com.whatsapp.App.az;
        r1 = r8.z;
        r1.onTouchEvent(r9);
        r1 = r8.o;
        if (r1 != 0) goto L_0x0015;
    L_0x000f:
        r1 = android.view.VelocityTracker.obtain();
        r8.o = r1;
    L_0x0015:
        r1 = r8.o;
        r1.addMovement(r9);
        r1 = r9.getAction();
        r2 = r9.getX();
        switch(r1) {
            case 0: goto L_0x0026;
            case 1: goto L_0x0075;
            case 2: goto L_0x004f;
            case 3: goto L_0x00d0;
            case 4: goto L_0x0025;
            case 5: goto L_0x00f1;
            case 6: goto L_0x00e2;
            default: goto L_0x0025;
        };
    L_0x0025:
        return r4;
    L_0x0026:
        r1 = r8.w;
        if (r1 == 0) goto L_0x0034;
    L_0x002a:
        r0 = r8.t;
        if (r0 == 0) goto L_0x0025;
    L_0x002e:
        r0 = r8.t;
        r0.a(r9);
        goto L_0x0025;
    L_0x0034:
        r1 = r8.e;
        if (r1 == 0) goto L_0x0025;
    L_0x0038:
        r1 = r8.p;
        r1 = r1.isFinished();
        if (r1 != 0) goto L_0x0045;
    L_0x0040:
        r1 = r8.p;
        r1.abortAnimation();
    L_0x0045:
        r8.A = r2;
        r1 = r9.getPointerId(r5);
        r8.q = r1;
        if (r0 == 0) goto L_0x0025;
    L_0x004f:
        r1 = r8.w;
        if (r1 == 0) goto L_0x005d;
    L_0x0053:
        r0 = r8.t;
        if (r0 == 0) goto L_0x0025;
    L_0x0057:
        r0 = r8.t;
        r0.a(r9);
        goto L_0x0025;
    L_0x005d:
        r1 = r8.e;
        if (r1 != r4) goto L_0x0066;
    L_0x0061:
        r8.c(r9);
        if (r0 == 0) goto L_0x0025;
    L_0x0066:
        r1 = r8.onInterceptTouchEvent(r9);
        if (r1 == 0) goto L_0x0025;
    L_0x006c:
        r1 = r8.e;
        if (r1 != r4) goto L_0x0025;
    L_0x0070:
        r8.c(r9);
        if (r0 == 0) goto L_0x0025;
    L_0x0075:
        java.lang.System.currentTimeMillis();
        r1 = r8.t;
        if (r1 == 0) goto L_0x007c;
    L_0x007c:
        r1 = r8.o;
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r3 = r8.E;
        r3 = (float) r3;
        r1.computeCurrentVelocity(r2, r3);
        r1 = r1.getXVelocity();
        r1 = (int) r1;
        r2 = r8.e;
        if (r2 != r4) goto L_0x00ca;
    L_0x008f:
        r2 = r8.w;
        if (r2 != 0) goto L_0x00ca;
    L_0x0093:
        r2 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        if (r1 <= r2) goto L_0x00a4;
    L_0x0097:
        r2 = r8.d;
        if (r2 <= 0) goto L_0x00a4;
    L_0x009b:
        r2 = r8.d;
        r2 = r2 + -1;
        r8.a(r2);
        if (r0 == 0) goto L_0x00be;
    L_0x00a4:
        r2 = -250; // 0xffffffffffffff06 float:NaN double:NaN;
        if (r1 >= r2) goto L_0x00bb;
    L_0x00a8:
        r1 = r8.d;
        r2 = r8.getChildCount();
        r2 = r2 + -1;
        if (r1 >= r2) goto L_0x00bb;
    L_0x00b2:
        r1 = r8.d;
        r1 = r1 + 1;
        r8.a(r1);
        if (r0 == 0) goto L_0x00be;
    L_0x00bb:
        r8.a();
    L_0x00be:
        r1 = r8.o;
        if (r1 == 0) goto L_0x00ca;
    L_0x00c2:
        r1 = r8.o;
        r1.recycle();
        r1 = 0;
        r8.o = r1;
    L_0x00ca:
        r8.e = r5;
        r8.q = r6;
        if (r0 == 0) goto L_0x0025;
    L_0x00d0:
        r1 = r8.w;
        if (r1 != 0) goto L_0x0025;
    L_0x00d4:
        r1 = G;
        r2 = 3;
        r1 = r1[r2];
        com.whatsapp.util.Log.w(r1);
        r8.e = r5;
        r8.q = r6;
        if (r0 == 0) goto L_0x0025;
    L_0x00e2:
        r1 = r8.w;
        if (r1 != 0) goto L_0x0025;
    L_0x00e6:
        com.whatsapp.TouchImageView.s = r7;
        r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        com.whatsapp.TouchImageView.u = r1;
        r8.b(r9);
        if (r0 == 0) goto L_0x0025;
    L_0x00f1:
        r0 = G;
        r0 = r0[r7];
        com.whatsapp.util.Log.e(r0);
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GalleryView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void b() {
        this.p = new Scroller(getContext(), y);
        this.d = this.l;
        this.u = new Paint();
        this.u.setDither(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.c = viewConfiguration.getScaledTouchSlop();
        this.E = viewConfiguration.getScaledMaximumFlingVelocity();
        this.b = new Paint();
        this.b.setColor(-65536);
        this.b.setStyle(Style.FILL_AND_STROKE);
        this.k = new Paint();
        this.k.setColor(-7829368);
        this.k.setStyle(Style.FILL);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(android.view.MotionEvent r6) {
        /*
        r5_this = this;
        r4 = 0;
        r0 = com.whatsapp.App.az;
        r1 = r5.q;
        r1 = r6.findPointerIndex(r1);
        r2 = -1;
        if (r1 != r2) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r1 = r6.getX(r1);
        r2 = r5.A;
        r2 = r2 - r1;
        r2 = (int) r2;
        r5.A = r1;
        r1 = r5.t;
        if (r1 == 0) goto L_0x0020;
    L_0x001b:
        r1 = r5.t;
        r1.c();
    L_0x0020:
        if (r2 >= 0) goto L_0x003b;
    L_0x0022:
        r1 = r5.getScrollX();
        if (r1 <= 0) goto L_0x0036;
    L_0x0028:
        r1 = r5.getScrollX();
        r1 = -r1;
        r1 = java.lang.Math.max(r1, r2);
        r5.scrollBy(r1, r4);
        if (r0 == 0) goto L_0x000c;
    L_0x0036:
        r0 = r5.t;
        if (r0 == 0) goto L_0x000c;
    L_0x003a:
        goto L_0x000c;
    L_0x003b:
        if (r2 <= 0) goto L_0x0066;
    L_0x003d:
        r1 = r5.getChildCount();
        r1 = r1 + -1;
        r1 = r5.getChildAt(r1);
        r1 = r1.getRight();
        r3 = r5.getScrollX();
        r1 = r1 - r3;
        r3 = r5.getWidth();
        r1 = r1 - r3;
        if (r1 <= 0) goto L_0x0060;
    L_0x0057:
        r1 = java.lang.Math.min(r1, r2);
        r5.scrollBy(r1, r4);
        if (r0 == 0) goto L_0x0064;
    L_0x0060:
        r1 = r5.t;
        if (r1 == 0) goto L_0x0064;
    L_0x0064:
        if (r0 == 0) goto L_0x000c;
    L_0x0066:
        r5.awakenScrollBars();
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GalleryView.c(android.view.MotionEvent):void");
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = App.az;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                childAt.layout(i7, 0, i7 + measuredWidth, childAt.getMeasuredHeight());
                i7 += measuredWidth;
            }
            i6++;
            if (i5 != 0) {
                break;
            }
        }
        if (this.x != null) {
            this.x.a();
        }
    }

    private void d() {
        if (this.D) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            this.n = new RectF(0.0f, 0.0f, (float) measuredWidth, (float) ((measuredHeight * 2) / 100));
            int scrollX = getScrollX() / getChildCount();
            this.m = new RectF((float) scrollX, 0.0f, (float) (scrollX + (measuredWidth / getChildCount())), (float) ((measuredHeight * 2) / 100));
            try {
                this.h = Bitmap.createBitmap(measuredWidth, (measuredHeight * 2) / 100, Config.ARGB_8888);
                this.i = new Canvas(this.h);
                this.i.drawRoundRect(this.n, 0.0f, 0.0f, this.k);
                this.i.drawRoundRect(this.m, 5.0f, 5.0f, this.b);
            } catch (OutOfMemoryError e) {
                Log.e(G[1] + e);
            }
        }
    }

    static int b(GalleryView galleryView) {
        return galleryView.d;
    }

    public void setCurrentScreen(int i, int i2) {
        setScreenWidth(i2);
        if (!this.p.isFinished()) {
            this.p.abortAnimation();
        }
        this.d = Math.max(0, Math.min(i, getChildCount()));
        scrollTo(this.d * i2, 0);
        if (this.t != null) {
            this.t.a(i);
        }
        invalidate();
    }

    public void a(int i) {
        a(i, false);
    }

    static Bitmap a(Bitmap bitmap, int i, int i2, Context context) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width >= i && height >= i2) {
            return bitmap;
        }
        int i3;
        int i4;
        int intValue = Integer.valueOf(G[6], 16).intValue();
        if (width < i) {
            i3 = i;
        } else {
            i3 = width;
        }
        if (height < i2) {
            i4 = i2;
        } else {
            i4 = height;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(intValue);
        canvas.drawBitmap(bitmap, ((float) (i - width)) / 2.0f, ((float) (i2 - height)) / 2.0f, null);
        return createBitmap;
    }

    public void setCurrentScreen(int i) {
        setCurrentScreen(i, this.C);
    }
}
