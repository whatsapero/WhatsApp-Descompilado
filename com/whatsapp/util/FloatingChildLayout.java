package com.whatsapp.util;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class FloatingChildLayout extends FrameLayout {
    private static boolean i;
    private static final String z;
    private ValueAnimator a;
    private int b;
    private int c;
    private View d;
    private Rect e;
    private final int f;
    private OnTouchListener g;
    private int h;

    static int a(FloatingChildLayout floatingChildLayout, int i) {
        floatingChildLayout.h = i;
        return i;
    }

    static int d(FloatingChildLayout floatingChildLayout) {
        return floatingChildLayout.h;
    }

    private void a(boolean z, Runnable runnable) {
        float f;
        Interpolator accelerateInterpolator;
        float f2 = 0.5f;
        float f3 = 1.0f;
        if (z) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        if (z) {
            f2 = 1.0f;
        }
        if (i) {
            int i;
            if (z) {
                i = 17563652;
            } else {
                i = 17563653;
            }
            this.d.setPivotX((float) (this.e.centerX() - this.d.getLeft()));
            this.d.setPivotY((float) (this.e.centerY() - this.d.getTop()));
            ViewPropertyAnimator scaleY = this.d.animate().setDuration((long) this.f).setInterpolator(AnimationUtils.loadInterpolator(getContext(), i)).scaleX(f).scaleY(f);
            if (z) {
                f3 = 0.0f;
            }
            scaleY.alpha(f3).setListener(new q(this, z, runnable));
            if (Log.e == 0) {
                return;
            }
        }
        Animation scaleAnimation = new ScaleAnimation(f2, f, f2, f, 0, (float) (this.e.centerX() - this.d.getLeft()), 0, (float) (this.e.centerY() - this.d.getTop()));
        scaleAnimation.setDuration((long) this.f);
        scaleAnimation.setFillAfter(true);
        if (z) {
            accelerateInterpolator = new AccelerateInterpolator();
        } else {
            accelerateInterpolator = new DecelerateInterpolator();
        }
        scaleAnimation.setInterpolator(accelerateInterpolator);
        scaleAnimation.setAnimationListener(new h(this, z, runnable));
        this.d.startAnimation(scaleAnimation);
    }

    public boolean b() {
        return this.h == 2;
    }

    static View b(FloatingChildLayout floatingChildLayout) {
        return floatingChildLayout.d;
    }

    public void setOnOutsideTouchListener(OnTouchListener onTouchListener) {
        this.g = onTouchListener;
    }

    public void f() {
        int i = Log.e;
        if (this.b == 1) {
            this.b = 3;
            if (i) {
                if (this.a.isRunning()) {
                    this.a.reverse();
                    if (i == 0) {
                        return;
                    }
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{127, 0});
                ofInt.addUpdateListener(new s(this));
                ofInt.setDuration((long) this.f).start();
                if (i == 0) {
                    return;
                }
            }
            Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration((long) this.f);
            alphaAnimation.setFillAfter(true);
            startAnimation(alphaAnimation);
        }
    }

    private static void a(View view, int i, int i2) {
        view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }

    static int a(FloatingChildLayout floatingChildLayout) {
        return floatingChildLayout.f;
    }

    public static void b(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.getViewTreeObserver().addOnDrawListener(new w(view, runnable));
            if (Log.e == 0) {
                return;
            }
        }
        view.getViewTreeObserver().addOnPreDrawListener(new ag(view, runnable));
    }

    public void setChildTargetScreen(Rect rect) {
        this.e = rect;
        requestLayout();
    }

    private Rect e() {
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        Rect rect2 = new Rect(this.e);
        rect2.offset(-rect.left, -rect.top);
        return rect2;
    }

    public void d() {
        if (this.b == 0) {
            this.b = 1;
            a();
            b(this, new a3(this));
        }
    }

    public void setBackground(Drawable drawable) {
        Log.e(z);
    }

    public void setBackgroundColorAlpha(int i) {
        setBackgroundColor(i << 24);
    }

    static ValueAnimator c(FloatingChildLayout floatingChildLayout) {
        return floatingChildLayout.a;
    }

    public FloatingChildLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Rect();
        this.b = 0;
        this.a = null;
        this.h = 0;
        Resources resources = getResources();
        this.c = resources.getDimensionPixelOffset(R.dimen.quick_contact_top_position);
        this.f = resources.getInteger(17694720);
        if (i) {
            this.a = ValueAnimator.ofInt(new int[]{0, 127});
            this.a.addUpdateListener(new b_(this));
        }
        super.setBackgroundDrawable(new ColorDrawable(0));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.d;
        Rect e = e();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (this.c != -1) {
            a(view, a((getWidth() - measuredWidth) / 2, measuredWidth, getWidth()), a(this.c, measuredHeight, getHeight()));
            if (Log.e == 0) {
                return;
            }
        }
        a(view, a(e.centerX() - (measuredWidth / 2), measuredWidth, getWidth()), a(e.centerY() - Math.round(((float) measuredHeight) * 0.75f), measuredHeight, getHeight()));
    }

    static boolean c() {
        return i;
    }

    private void a() {
        this.d.invalidate();
    }

    protected void onFinishInflate() {
        this.d = findViewById(16908290);
        this.d.setDuplicateParentStateEnabled(true);
        if (i) {
            this.d.setScaleX(0.5f);
            this.d.setScaleY(0.5f);
            this.d.setAlpha(0.0f);
        }
    }

    public void b(Runnable runnable) {
        if (this.h == 0) {
            this.h = 1;
            a(false, runnable);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.g != null ? this.g.onTouch(this, motionEvent) : false;
    }

    static {
        boolean z;
        char[] toCharArray = "P=$N3\u0014!/\u001d\u0005U1!\u000e5['$\ro\u001d~j\u00003\u0014;9I*U<+\u000e\"Pr#\u00073Q $\b+X+".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 52;
                    break;
                case ay.f /*1*/:
                    i2 = 82;
                    break;
                case ay.n /*2*/:
                    i2 = 74;
                    break;
                case ay.p /*3*/:
                    i2 = 105;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        if (VERSION.SDK_INT >= 12) {
            z = true;
        } else {
            z = false;
        }
        i = z;
    }

    private static int a(int i, int i2, int i3) {
        return i2 > i3 ? (i3 - i2) / 2 : Math.min(Math.max(i, 0), i3 - i2);
    }

    public boolean a(Runnable runnable) {
        if (this.h != 1 && this.h != 2) {
            return false;
        }
        this.h = 3;
        a();
        a(true, runnable);
        return true;
    }

    public static void a(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new k(view, runnable));
    }
}
