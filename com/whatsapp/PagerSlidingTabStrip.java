package com.whatsapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.actionbarsherlock.R;
import java.util.Locale;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class PagerSlidingTabStrip extends HorizontalScrollView {
    private static final String E;
    private static final int[] o;
    private Paint A;
    private int B;
    private int C;
    private int D;
    private int a;
    private Typeface b;
    private boolean c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private ViewPager h;
    private final ko i;
    private int j;
    private float k;
    private int l;
    private LayoutParams m;
    private int n;
    private int p;
    private int q;
    private Locale r;
    private int s;
    private int t;
    private LinearLayout u;
    private int v;
    public OnPageChangeListener w;
    private LayoutParams x;
    private int y;
    private Paint z;

    private void a(int i, View view) {
        try {
            ViewGroup.LayoutParams layoutParams;
            view.setFocusable(true);
            view.setOnClickListener(new amo(this, i));
            view.setPadding(this.t, 0, this.t, 0);
            LinearLayout linearLayout = this.u;
            if (this.c) {
                layoutParams = this.m;
            } else {
                layoutParams = this.x;
            }
            linearLayout.addView(view, i, layoutParams);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable diVar = new di(super.onSaveInstanceState());
        diVar.a = this.g;
        return diVar;
    }

    static int a(PagerSlidingTabStrip pagerSlidingTabStrip, int i) {
        pagerSlidingTabStrip.g = i;
        return i;
    }

    static ViewPager b(PagerSlidingTabStrip pagerSlidingTabStrip) {
        return pagerSlidingTabStrip.h;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        di diVar = (di) parcelable;
        super.onRestoreInstanceState(diVar.getSuperState());
        this.g = diVar.a;
        requestLayout();
    }

    static float a(PagerSlidingTabStrip pagerSlidingTabStrip, float f) {
        pagerSlidingTabStrip.k = f;
        return f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
        r3_this = this;
        r2 = com.whatsapp.App.az;
        r0 = r3.u;
        r0.removeAllViews();
        r0 = r3.h;
        r0 = r0.getAdapter();
        r0 = r0.getCount();
        r3.y = r0;
        r0 = 0;
        r1 = r0;
    L_0x0015:
        r0 = r3.y;
        if (r1 >= r0) goto L_0x0064;
    L_0x0019:
        r0 = r3.h;	 Catch:{ IllegalStateException -> 0x0074 }
        r0 = r0.getAdapter();	 Catch:{ IllegalStateException -> 0x0074 }
        r0 = r0 instanceof com.whatsapp.qt;	 Catch:{ IllegalStateException -> 0x0074 }
        if (r0 == 0) goto L_0x0034;
    L_0x0023:
        r0 = r3.h;	 Catch:{ IllegalStateException -> 0x0076 }
        r0 = r0.getAdapter();	 Catch:{ IllegalStateException -> 0x0076 }
        r0 = (com.whatsapp.qt) r0;	 Catch:{ IllegalStateException -> 0x0076 }
        r0 = r0.a(r1);	 Catch:{ IllegalStateException -> 0x0076 }
        r3.a(r1, r0);	 Catch:{ IllegalStateException -> 0x0076 }
        if (r2 == 0) goto L_0x0060;
    L_0x0034:
        r0 = r3.h;	 Catch:{ IllegalStateException -> 0x0078 }
        r0 = r0.getAdapter();	 Catch:{ IllegalStateException -> 0x0078 }
        r0 = r0 instanceof com.whatsapp.a_k;	 Catch:{ IllegalStateException -> 0x0078 }
        if (r0 == 0) goto L_0x004f;
    L_0x003e:
        r0 = r3.h;	 Catch:{ IllegalStateException -> 0x007a }
        r0 = r0.getAdapter();	 Catch:{ IllegalStateException -> 0x007a }
        r0 = (com.whatsapp.a_k) r0;	 Catch:{ IllegalStateException -> 0x007a }
        r0 = r0.a(r1);	 Catch:{ IllegalStateException -> 0x007a }
        r3.a(r1, r0);	 Catch:{ IllegalStateException -> 0x007a }
        if (r2 == 0) goto L_0x0060;
    L_0x004f:
        r0 = r3.h;	 Catch:{ IllegalStateException -> 0x007a }
        r0 = r0.getAdapter();	 Catch:{ IllegalStateException -> 0x007a }
        r0 = r0.getPageTitle(r1);	 Catch:{ IllegalStateException -> 0x007a }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x007a }
        r3.a(r1, r0);	 Catch:{ IllegalStateException -> 0x007a }
    L_0x0060:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x007c;
    L_0x0064:
        r3.a();
        r0 = r3.getViewTreeObserver();
        r1 = new com.whatsapp.tt;
        r1.<init>(r3);
        r0.addOnGlobalLayoutListener(r1);
        return;
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0078 }
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;
    L_0x007c:
        r1 = r0;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.PagerSlidingTabStrip.b():void");
    }

    public PagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    private void a(int i, int i2) {
        View imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i2);
        a(i, imageButton);
    }

    public void setViewPager(ViewPager viewPager) {
        try {
            this.h = viewPager;
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException(E);
            }
            viewPager.setOnPageChangeListener(this.i);
            b();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        int i2 = App.az;
        super(context, attributeSet, i);
        this.i = new ko(this, null);
        this.g = 0;
        this.k = 0.0f;
        this.v = -10066330;
        this.p = 436207616;
        this.s = 436207616;
        this.c = false;
        this.e = true;
        this.q = 52;
        this.C = 8;
        this.j = 2;
        this.f = 12;
        this.t = 24;
        this.D = 1;
        this.a = 12;
        this.B = -10066330;
        this.b = null;
        this.l = 1;
        this.n = 0;
        this.d = R.drawable.background_tab;
        setFillViewport(true);
        setWillNotDraw(false);
        this.u = new LinearLayout(context);
        this.u.setOrientation(0);
        this.u.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.u);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.q = (int) TypedValue.applyDimension(1, (float) this.q, displayMetrics);
        this.C = (int) TypedValue.applyDimension(1, (float) this.C, displayMetrics);
        this.j = (int) TypedValue.applyDimension(1, (float) this.j, displayMetrics);
        this.f = (int) TypedValue.applyDimension(1, (float) this.f, displayMetrics);
        this.t = (int) TypedValue.applyDimension(1, (float) this.t, displayMetrics);
        this.D = (int) TypedValue.applyDimension(1, (float) this.D, displayMetrics);
        this.a = (int) TypedValue.applyDimension(2, (float) this.a, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, this.a);
        this.B = obtainStyledAttributes.getColor(1, this.B);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vk.PagerSlidingTabStrip);
        try {
            this.v = obtainStyledAttributes.getColor(0, this.v);
            this.p = obtainStyledAttributes.getColor(1, this.p);
            this.s = obtainStyledAttributes.getColor(2, this.s);
            this.C = obtainStyledAttributes.getDimensionPixelSize(3, this.C);
            this.j = obtainStyledAttributes.getDimensionPixelSize(4, this.j);
            this.f = obtainStyledAttributes.getDimensionPixelSize(5, this.f);
            this.t = obtainStyledAttributes.getDimensionPixelSize(6, this.t);
            this.d = obtainStyledAttributes.getResourceId(8, this.d);
            this.c = obtainStyledAttributes.getBoolean(9, this.c);
            this.q = obtainStyledAttributes.getDimensionPixelSize(7, this.q);
            this.e = obtainStyledAttributes.getBoolean(10, this.e);
            obtainStyledAttributes.recycle();
            this.A = new Paint();
            this.A.setAntiAlias(true);
            this.A.setStyle(Style.FILL);
            this.z = new Paint();
            this.z.setAntiAlias(true);
            this.z.setStrokeWidth((float) this.D);
            this.x = new LayoutParams(-2, -1);
            this.m = new LayoutParams(0, -1, 1.0f);
            if (this.r == null) {
                this.r = getResources().getConfiguration().locale;
            }
            try {
                if (DialogToastActivity.i) {
                    App.az = i2 + 1;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static LinearLayout a(PagerSlidingTabStrip pagerSlidingTabStrip) {
        return pagerSlidingTabStrip.u;
    }

    protected void onDraw(Canvas canvas) {
        int i = App.az;
        try {
            super.onDraw(canvas);
            if (!isInEditMode()) {
                try {
                    if (this.y != 0) {
                        int height = getHeight();
                        this.A.setColor(this.v);
                        View childAt = this.u.getChildAt(this.g);
                        float left = (float) childAt.getLeft();
                        float right = (float) childAt.getRight();
                        try {
                            if (this.k > 0.0f && this.g < this.y - 1) {
                                childAt = this.u.getChildAt(this.g + 1);
                                float left2 = (float) childAt.getLeft();
                                left = (left * (1.0f - this.k)) + (left2 * this.k);
                                right = (((float) childAt.getRight()) * this.k) + ((1.0f - this.k) * right);
                            }
                            canvas.drawRect(left, (float) (height - this.C), right, (float) height, this.A);
                            this.A.setColor(this.p);
                            canvas.drawRect(0.0f, (float) (height - this.j), (float) this.u.getWidth(), (float) height, this.A);
                            this.z.setColor(this.s);
                            int i2 = 0;
                            while (i2 < this.y - 1) {
                                childAt = this.u.getChildAt(i2);
                                canvas.drawLine((float) childAt.getRight(), (float) this.f, (float) childAt.getRight(), (float) (height - this.f), this.z);
                                int i3 = i2 + 1;
                                if (i == 0) {
                                    i2 = i3;
                                } else {
                                    return;
                                }
                            }
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private void b(int i, int i2) {
        try {
            if (this.y != 0) {
                int left = this.u.getChildAt(i).getLeft() + i2;
                if (i > 0 || i2 > 0) {
                    left -= this.q;
                }
                try {
                    if (left != this.n) {
                        this.n = left;
                        scrollTo(left, 0);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static {
        char[] toCharArray = "J\b\u0019zv}\u0006\u0019\u007f\u0006x\u000e\u0019~\u0006r\u000e\b-N}\u0017\u0019-Gx\u0000\fyCnA\u0015cUh\u0000\u0012nC2".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 28;
                    break;
                case ay.f /*1*/:
                    i2 = 97;
                    break;
                case ay.n /*2*/:
                    i2 = 124;
                    break;
                case ay.p /*3*/:
                    i2 = 13;
                    break;
                default:
                    i2 = 38;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        E = new String(cArr).intern();
        o = new int[]{16842901, 16842904};
    }

    private void a(int i, String str) {
        View textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(17);
        textView.setSingleLine();
        a(i, textView);
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.w = onPageChangeListener;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r5_this = this;
        r0 = 0;
        r2 = com.whatsapp.App.az;
        r1 = r0;
    L_0x0004:
        r0 = r5.y;
        if (r1 >= r0) goto L_0x0051;
    L_0x0008:
        r0 = r5.u;
        r0 = r0.getChildAt(r1);
        r3 = r5.d;
        r0.setBackgroundResource(r3);
        r3 = r0 instanceof android.widget.TextView;
        if (r3 == 0) goto L_0x004d;
    L_0x0017:
        r0 = (android.widget.TextView) r0;
        r3 = 0;
        r4 = r5.a;	 Catch:{ IllegalStateException -> 0x0052 }
        r4 = (float) r4;	 Catch:{ IllegalStateException -> 0x0052 }
        r0.setTextSize(r3, r4);	 Catch:{ IllegalStateException -> 0x0052 }
        r3 = r5.b;	 Catch:{ IllegalStateException -> 0x0052 }
        r4 = r5.l;	 Catch:{ IllegalStateException -> 0x0052 }
        r0.setTypeface(r3, r4);	 Catch:{ IllegalStateException -> 0x0052 }
        r3 = r5.B;	 Catch:{ IllegalStateException -> 0x0052 }
        r0.setTextColor(r3);	 Catch:{ IllegalStateException -> 0x0052 }
        r3 = r5.e;	 Catch:{ IllegalStateException -> 0x0052 }
        if (r3 == 0) goto L_0x004d;
    L_0x0030:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0054 }
        r4 = 14;
        if (r3 < r4) goto L_0x003c;
    L_0x0036:
        r3 = 1;
        r0.setAllCaps(r3);	 Catch:{ IllegalStateException -> 0x0056 }
        if (r2 == 0) goto L_0x004d;
    L_0x003c:
        r3 = r0.getText();	 Catch:{ IllegalStateException -> 0x0056 }
        r3 = r3.toString();	 Catch:{ IllegalStateException -> 0x0056 }
        r4 = r5.r;	 Catch:{ IllegalStateException -> 0x0056 }
        r3 = r3.toUpperCase(r4);	 Catch:{ IllegalStateException -> 0x0056 }
        r0.setText(r3);	 Catch:{ IllegalStateException -> 0x0056 }
    L_0x004d:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x0058;
    L_0x0051:
        return;
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0056 }
    L_0x0056:
        r0 = move-exception;
        throw r0;
    L_0x0058:
        r1 = r0;
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.PagerSlidingTabStrip.a():void");
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static void a(PagerSlidingTabStrip pagerSlidingTabStrip, int i, int i2) {
        pagerSlidingTabStrip.b(i, i2);
    }

    static int c(PagerSlidingTabStrip pagerSlidingTabStrip) {
        return pagerSlidingTabStrip.g;
    }
}
