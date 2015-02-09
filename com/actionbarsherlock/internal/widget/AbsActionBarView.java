package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener;
import com.actionbarsherlock.internal.nineoldandroids.view.NineViewGroup;
import com.actionbarsherlock.internal.view.menu.ActionMenuPresenter;
import com.actionbarsherlock.internal.view.menu.ActionMenuView;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class AbsActionBarView extends NineViewGroup {
    public static boolean b;
    private static final Interpolator sAlphaInterpolator;
    private static final String[] z;
    protected ActionMenuPresenter mActionMenuPresenter;
    protected int mContentHeight;
    final Context mContext;
    protected ActionMenuView mMenuView;
    protected boolean mSplitActionBar;
    protected ActionBarContainer mSplitView;
    protected boolean mSplitWhenNarrow;
    protected final VisibilityAnimListener mVisAnimListener;
    protected Animator mVisibilityAnim;

    public class VisibilityAnimListener implements AnimatorListener {
        private boolean mCanceled;
        int mFinalVisibility;
        final AbsActionBarView this$0;

        public void onAnimationStart(Animator animator) {
            this.this$0.setVisibility(0);
            this.this$0.mVisibilityAnim = animator;
            this.mCanceled = false;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.mCanceled) {
                this.this$0.mVisibilityAnim = null;
                this.this$0.setVisibility(this.mFinalVisibility);
                if (this.this$0.mSplitView != null && this.this$0.mMenuView != null) {
                    this.this$0.mMenuView.setVisibility(this.mFinalVisibility);
                }
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationCancel(Animator animator) {
            this.mCanceled = true;
        }

        protected VisibilityAnimListener(AbsActionBarView absActionBarView) {
            this.this$0 = absActionBarView;
            this.mCanceled = false;
        }

        public com.actionbarsherlock.internal.widget.AbsActionBarView.VisibilityAnimListener withFinalVisibility(int i) {
            this.mFinalVisibility = i;
            return this;
        }
    }

    public void postShowOverflowMenu() {
        post(new Runnable() {
            final AbsActionBarView this$0;

            {
                this.this$0 = r1;
            }

            public void run() {
                this.this$0.showOverflowMenu();
            }
        });
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
        requestLayout();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r6) {
        /*
        r5_this = this;
        r4 = 0;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 8;
        if (r0 < r1) goto L_0x000e;
    L_0x0007:
        super.onConfigurationChanged(r6);
        r0 = b;
        if (r0 == 0) goto L_0x0017;
    L_0x000e:
        r0 = r5.mMenuView;
        if (r0 == 0) goto L_0x0017;
    L_0x0012:
        r0 = r5.mMenuView;
        r0.onConfigurationChanged(r6);
    L_0x0017:
        r0 = r5.getContext();
        r1 = 0;
        r2 = com.actionbarsherlock.R.styleable.SherlockActionBar;
        r3 = com.actionbarsherlock.R.attr.actionBarStyle;
        r0 = r0.obtainStyledAttributes(r1, r2, r3, r4);
        r1 = com.actionbarsherlock.R.styleable.SherlockActionBar_height;
        r1 = r0.getLayoutDimension(r1, r4);
        r5.setContentHeight(r1);
        r0.recycle();
        r0 = r5.mSplitWhenNarrow;
        if (r0 == 0) goto L_0x0041;
    L_0x0034:
        r0 = r5.getContext();
        r1 = com.actionbarsherlock.R.bool.abs__split_action_bar_is_narrow;
        r0 = com.actionbarsherlock.internal.ResourcesCompat.getResources_getBoolean(r0, r1);
        r5.setSplitActionBar(r0);
    L_0x0041:
        r0 = r5.mActionMenuPresenter;
        if (r0 == 0) goto L_0x004a;
    L_0x0045:
        r0 = r5.mActionMenuPresenter;
        r0.onConfigurationChanged(r6);
    L_0x004a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.AbsActionBarView.onConfigurationChanged(android.content.res.Configuration):void");
    }

    public boolean hideOverflowMenu() {
        return this.mActionMenuPresenter != null ? this.mActionMenuPresenter.hideOverflowMenu() : false;
    }

    public AbsActionBarView(Context context) {
        super(context);
        this.mVisAnimListener = new VisibilityAnimListener(this);
        this.mContext = context;
    }

    public AbsActionBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mVisAnimListener = new VisibilityAnimListener(this);
        this.mContext = context;
    }

    public void dismissPopupMenus() {
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.dismissPopupMenus();
        }
    }

    public boolean showOverflowMenu() {
        return this.mActionMenuPresenter != null ? this.mActionMenuPresenter.showOverflowMenu() : false;
    }

    public boolean isOverflowReserved() {
        return this.mActionMenuPresenter != null && this.mActionMenuPresenter.isOverflowReserved();
    }

    protected static int next(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public void setSplitWhenNarrow(boolean z) {
        this.mSplitWhenNarrow = z;
    }

    public void setSplitActionBar(boolean z) {
        this.mSplitActionBar = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void animateToVisibility(int r13) {
        /*
        r12_this = this;
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r10 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r8 = 0;
        r7 = 1;
        r6 = 0;
        r0 = b;
        r1 = r12.mVisibilityAnim;
        if (r1 == 0) goto L_0x0012;
    L_0x000d:
        r1 = r12.mVisibilityAnim;
        r1.cancel();
    L_0x0012:
        if (r13 != 0) goto L_0x0080;
    L_0x0014:
        r1 = r12.getVisibility();
        if (r1 == 0) goto L_0x002a;
    L_0x001a:
        r12.setAlpha(r8);
        r1 = r12.mSplitView;
        if (r1 == 0) goto L_0x002a;
    L_0x0021:
        r1 = r12.mMenuView;
        if (r1 == 0) goto L_0x002a;
    L_0x0025:
        r1 = r12.mMenuView;
        r1.setAlpha(r8);
    L_0x002a:
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r2 = new float[r7];
        r2[r6] = r9;
        r1 = com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator.ofFloat(r12, r1, r2);
        r1.setDuration(r10);
        r2 = sAlphaInterpolator;
        r1.setInterpolator(r2);
        r2 = r12.mSplitView;
        if (r2 == 0) goto L_0x0072;
    L_0x0043:
        r2 = r12.mMenuView;
        if (r2 == 0) goto L_0x0072;
    L_0x0047:
        r2 = new com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet;
        r2.<init>();
        r3 = r12.mMenuView;
        r4 = z;
        r4 = r4[r7];
        r5 = new float[r7];
        r5[r6] = r9;
        r3 = com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator.ofFloat(r3, r4, r5);
        r3.setDuration(r10);
        r4 = r12.mVisAnimListener;
        r4 = r4.withFinalVisibility(r13);
        r2.addListener(r4);
        r4 = r2.play(r1);
        r4.with(r3);
        r2.start();
        if (r0 == 0) goto L_0x007e;
    L_0x0072:
        r2 = r12.mVisAnimListener;
        r2 = r2.withFinalVisibility(r13);
        r1.addListener(r2);
        r1.start();
    L_0x007e:
        if (r0 == 0) goto L_0x00d4;
    L_0x0080:
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        r2 = new float[r7];
        r2[r6] = r8;
        r1 = com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator.ofFloat(r12, r1, r2);
        r1.setDuration(r10);
        r2 = sAlphaInterpolator;
        r1.setInterpolator(r2);
        r2 = r12.mSplitView;
        if (r2 == 0) goto L_0x00c8;
    L_0x0099:
        r2 = r12.mMenuView;
        if (r2 == 0) goto L_0x00c8;
    L_0x009d:
        r2 = new com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet;
        r2.<init>();
        r3 = r12.mMenuView;
        r4 = z;
        r4 = r4[r6];
        r5 = new float[r7];
        r5[r6] = r8;
        r3 = com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator.ofFloat(r3, r4, r5);
        r3.setDuration(r10);
        r4 = r12.mVisAnimListener;
        r4 = r4.withFinalVisibility(r13);
        r2.addListener(r4);
        r4 = r2.play(r1);
        r4.with(r3);
        r2.start();
        if (r0 == 0) goto L_0x00d4;
    L_0x00c8:
        r0 = r12.mVisAnimListener;
        r0 = r0.withFinalVisibility(r13);
        r1.addListener(r0);
        r1.start();
    L_0x00d4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.AbsActionBarView.animateToVisibility(int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected int positionChild(android.view.View r6, int r7, int r8, int r9, boolean r10) {
        /*
        r5_this = this;
        r0 = r6.getMeasuredWidth();
        r1 = r6.getMeasuredHeight();
        r2 = r9 - r1;
        r2 = r2 / 2;
        r2 = r2 + r8;
        if (r10 == 0) goto L_0x001a;
    L_0x000f:
        r3 = r7 - r0;
        r4 = r2 + r1;
        r6.layout(r3, r2, r7, r4);
        r3 = b;
        if (r3 == 0) goto L_0x0020;
    L_0x001a:
        r3 = r7 + r0;
        r1 = r1 + r2;
        r6.layout(r7, r2, r3, r1);
    L_0x0020:
        if (r10 == 0) goto L_0x0023;
    L_0x0022:
        r0 = -r0;
    L_0x0023:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.AbsActionBarView.positionChild(android.view.View, int, int, int, boolean):int");
    }

    protected static boolean isLayoutRtl() {
        return ActionBarSherlock.isRtl;
    }

    static {
        String[] strArr = new String[4];
        String str = "v.I\u0010\u0014";
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
                        i3 = 23;
                        break;
                    case ay.f /*1*/:
                        i3 = 66;
                        break;
                    case ay.n /*2*/:
                        i3 = 57;
                        break;
                    case ay.p /*3*/:
                        i3 = 120;
                        break;
                    default:
                        i3 = 117;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "v.I\u0010\u0014";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "v.I\u0010\u0014";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    sAlphaInterpolator = new DecelerateInterpolator();
                default:
                    strArr2[i] = str;
                    str = "v.I\u0010\u0014";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int getAnimatedVisibility() {
        return this.mVisibilityAnim != null ? this.mVisAnimListener.mFinalVisibility : getVisibility();
    }

    public void setSplitView(ActionBarContainer actionBarContainer) {
        this.mSplitView = actionBarContainer;
    }

    protected int measureChildView(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public void setVisibility(int i) {
        if (this.mVisibilityAnim != null) {
            this.mVisibilityAnim.end();
        }
        super.setVisibility(i);
    }

    public AbsActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mVisAnimListener = new VisibilityAnimListener(this);
        this.mContext = context;
    }

    public boolean isOverflowMenuShowing() {
        return this.mActionMenuPresenter != null ? this.mActionMenuPresenter.isOverflowMenuShowing() : false;
    }
}
