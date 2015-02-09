package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener;
import com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet;
import com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Builder;
import com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator;
import com.actionbarsherlock.internal.nineoldandroids.view.animation.AnimatorProxy;
import com.actionbarsherlock.internal.nineoldandroids.widget.NineLinearLayout;
import com.actionbarsherlock.view.ActionMode;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ActionBarContextView extends AbsActionBarView implements AnimatorListener {
    private static final String[] z;
    private boolean mAnimateInOnLayout;
    private int mAnimationMode;
    private NineLinearLayout mClose;
    private Animator mCurrentAnimation;
    private View mCustomView;
    private Drawable mSplitBackground;
    private CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private TextView mSubtitleView;
    private CharSequence mTitle;
    private LinearLayout mTitleLayout;
    private int mTitleStyleRes;
    private TextView mTitleView;

    class AnonymousClass_1 implements OnClickListener {
        final ActionBarContextView this$0;
        final ActionMode val$mode;

        AnonymousClass_1(ActionBarContextView actionBarContextView, ActionMode actionMode) {
            this.this$0 = actionBarContextView;
            this.val$mode = actionMode;
        }

        public void onClick(View view) {
            this.val$mode.finish();
        }
    }

    static {
        String[] strArr = new String[8];
        String str = "eI\f'v*D\u00010v'OM<% NM";
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
                        i3 = 69;
                        break;
                    case ay.f /*1*/:
                        i3 = 42;
                        break;
                    case ay.n /*2*/:
                        i3 = 109;
                        break;
                    case ay.p /*3*/:
                        i3 = 73;
                        break;
                    default:
                        i3 = 86;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "eI\f'v*D\u00010v'OM<% NM";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "2C\u0019!v$D\t;9,NW%7<E\u0018=\t-O\u0004.>1\u0017O>$$Z2*9+^\b'\"g";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "6I\f%3\u001c";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "1X\f'%)K\u0019 9+r";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "6I\f%3\u001c";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "1X\f'%)K\u0019 9+r";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "2C\u0019!v$D\t;9,NW%7<E\u0018=\t2C\t=>x\b\u0000(\"&B2977O\u0003=te\u0002\u0002;v#C\u0001%\t5K\u001f,81\u0003";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean showOverflowMenu() {
        try {
            return this.mActionMenuPresenter != null ? this.mActionMenuPresenter.showOverflowMenu() : false;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void finishAnimation() {
        Animator animator = this.mCurrentAnimation;
        if (animator != null) {
            try {
                this.mCurrentAnimation = null;
                animator.end();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean isLayoutRtl = isLayoutRtl();
        if (isLayoutRtl) {
            try {
                int paddingRight = (i3 - i) - getPaddingRight();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        paddingRight = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        try {
            int i5;
            int positionChild;
            View view;
            if (!(this.mClose == null || this.mClose.getVisibility() == 8)) {
                int i6;
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mClose.getLayoutParams();
                if (isLayoutRtl) {
                    try {
                        i5 = marginLayoutParams.rightMargin;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
                i5 = marginLayoutParams.leftMargin;
                if (isLayoutRtl) {
                    try {
                        i6 = marginLayoutParams.leftMargin;
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                }
                i6 = marginLayoutParams.rightMargin;
                i5 = next(paddingRight, i5, isLayoutRtl);
                paddingRight = next(positionChild(this.mClose, i5, paddingTop, paddingTop2, isLayoutRtl) + i5, i6, isLayoutRtl);
                try {
                } catch (IllegalStateException e222) {
                    throw e222;
                }
                if (this.mAnimateInOnLayout) {
                    this.mAnimationMode = 1;
                    this.mCurrentAnimation = makeInAnimation();
                    this.mCurrentAnimation.start();
                    this.mAnimateInOnLayout = false;
                    i5 = paddingRight;
                    if (this.mTitleLayout != null) {
                        if (this.mCustomView == null && this.mTitleLayout.getVisibility() != 8) {
                            i5 += positionChild(this.mTitleLayout, i5, paddingTop, paddingTop2, isLayoutRtl);
                        }
                    }
                    if (this.mCustomView != null) {
                        positionChild = positionChild(this.mCustomView, i5, paddingTop, paddingTop2, isLayoutRtl) + i5;
                    }
                    if (isLayoutRtl) {
                        i5 = (i3 - i) - getPaddingRight();
                    } else {
                        try {
                            i5 = getPaddingLeft();
                        } catch (IllegalStateException e2222) {
                            throw e2222;
                        }
                    }
                    if (this.mMenuView != null) {
                        view = this.mMenuView;
                        if (isLayoutRtl) {
                            isLayoutRtl = true;
                        } else {
                            isLayoutRtl = false;
                        }
                        positionChild = positionChild(view, i5, paddingTop, paddingTop2, isLayoutRtl) + i5;
                    }
                }
            }
            i5 = paddingRight;
            try {
                if (this.mTitleLayout != null) {
                    i5 += positionChild(this.mTitleLayout, i5, paddingTop, paddingTop2, isLayoutRtl);
                }
                if (this.mCustomView != null) {
                    positionChild = positionChild(this.mCustomView, i5, paddingTop, paddingTop2, isLayoutRtl) + i5;
                }
                if (isLayoutRtl) {
                    i5 = (i3 - i) - getPaddingRight();
                } else {
                    i5 = getPaddingLeft();
                }
                try {
                    if (this.mMenuView != null) {
                        view = this.mMenuView;
                        if (isLayoutRtl) {
                            isLayoutRtl = false;
                        } else {
                            isLayoutRtl = true;
                        }
                        positionChild = positionChild(view, i5, paddingTop, paddingTop2, isLayoutRtl) + i5;
                    }
                } catch (IllegalStateException e22222) {
                    throw e22222;
                } catch (IllegalStateException e222222) {
                    throw e222222;
                }
            } catch (IllegalStateException e2222222) {
                throw e2222222;
            } catch (IllegalStateException e22222222) {
                throw e22222222;
            }
        } catch (IllegalStateException e222222222) {
            throw e222222222;
        }
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SherlockActionMode, i, 0);
        setBackgroundDrawable(obtainStyledAttributes.getDrawable(R.styleable.SherlockActionMode_background));
        this.mTitleStyleRes = obtainStyledAttributes.getResourceId(R.styleable.SherlockActionMode_titleTextStyle, 0);
        this.mSubtitleStyleRes = obtainStyledAttributes.getResourceId(R.styleable.SherlockActionMode_subtitleTextStyle, 0);
        this.mContentHeight = obtainStyledAttributes.getLayoutDimension(R.styleable.SherlockActionMode_height, 0);
        this.mSplitBackground = obtainStyledAttributes.getDrawable(R.styleable.SherlockActionMode_backgroundSplit);
        obtainStyledAttributes.recycle();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        try {
            if (this.mAnimationMode == 2) {
                killMode();
            }
            this.mAnimationMode = 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void onAnimationStart(Animator animator) {
    }

    public void killMode() {
        try {
            finishAnimation();
            removeAllViews();
            if (this.mSplitView != null) {
                this.mSplitView.removeView(this.mMenuView);
            }
            this.mCustomView = null;
            this.mMenuView = null;
            this.mAnimateInOnLayout = false;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initForMode(com.actionbarsherlock.view.ActionMode r8) {
        /*
        r7_this = this;
        r6 = -1;
        r5 = 1;
        r2 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r0 = r7.mClose;
        if (r0 != 0) goto L_0x0020;
    L_0x0008:
        r0 = r7.mContext;
        r0 = android.view.LayoutInflater.from(r0);
        r1 = com.actionbarsherlock.R.layout.abs__action_mode_close_item;	 Catch:{ IllegalStateException -> 0x00de }
        r3 = 0;
        r0 = r0.inflate(r1, r7, r3);	 Catch:{ IllegalStateException -> 0x00de }
        r0 = (com.actionbarsherlock.internal.nineoldandroids.widget.NineLinearLayout) r0;	 Catch:{ IllegalStateException -> 0x00de }
        r7.mClose = r0;	 Catch:{ IllegalStateException -> 0x00de }
        r0 = r7.mClose;	 Catch:{ IllegalStateException -> 0x00de }
        r7.addView(r0);	 Catch:{ IllegalStateException -> 0x00de }
        if (r2 == 0) goto L_0x002d;
    L_0x0020:
        r0 = r7.mClose;	 Catch:{ IllegalStateException -> 0x00e0 }
        r0 = r0.getParent();	 Catch:{ IllegalStateException -> 0x00e0 }
        if (r0 != 0) goto L_0x002d;
    L_0x0028:
        r0 = r7.mClose;	 Catch:{ IllegalStateException -> 0x00e0 }
        r7.addView(r0);	 Catch:{ IllegalStateException -> 0x00e0 }
    L_0x002d:
        r0 = r7.mClose;
        r1 = com.actionbarsherlock.R.id.abs__action_mode_close_button;
        r0 = r0.findViewById(r1);
        r1 = new com.actionbarsherlock.internal.widget.ActionBarContextView$1;
        r1.<init>(r7, r8);
        r0.setOnClickListener(r1);
        r1 = com.actionbarsherlock.ActionBarSherlock.isRtl;
        if (r1 == 0) goto L_0x0058;
    L_0x0041:
        r1 = new android.util.TypedValue;
        r1.<init>();
        r3 = r7.getContext();
        r3 = r3.getTheme();
        r4 = com.actionbarsherlock.R.attr.actionBarItemBackground;
        r3.resolveAttribute(r4, r1, r5);
        r1 = r1.resourceId;
        r0.setBackgroundResource(r1);
    L_0x0058:
        r0 = r8.getMenu();
        r0 = (com.actionbarsherlock.internal.view.menu.MenuBuilder) r0;
        r1 = r7.mActionMenuPresenter;	 Catch:{ IllegalStateException -> 0x00e2 }
        if (r1 == 0) goto L_0x0067;
    L_0x0062:
        r1 = r7.mActionMenuPresenter;	 Catch:{ IllegalStateException -> 0x00e2 }
        r1.dismissPopupMenus();	 Catch:{ IllegalStateException -> 0x00e2 }
    L_0x0067:
        r1 = new com.actionbarsherlock.internal.view.menu.ActionMenuPresenter;
        r3 = r7.mContext;
        r1.<init>(r3);
        r7.mActionMenuPresenter = r1;
        r1 = r7.mActionMenuPresenter;
        r1.setReserveOverflow(r5);
        r3 = new android.view.ViewGroup$LayoutParams;
        r1 = -2;
        r3.<init>(r1, r6);
        r1 = r7.mSplitActionBar;	 Catch:{ IllegalStateException -> 0x00e4 }
        if (r1 != 0) goto L_0x009b;
    L_0x007f:
        r1 = r7.mActionMenuPresenter;	 Catch:{ IllegalStateException -> 0x00e6 }
        r0.addMenuPresenter(r1);	 Catch:{ IllegalStateException -> 0x00e6 }
        r1 = r7.mActionMenuPresenter;	 Catch:{ IllegalStateException -> 0x00e6 }
        r1 = r1.getMenuView(r7);	 Catch:{ IllegalStateException -> 0x00e6 }
        r1 = (com.actionbarsherlock.internal.view.menu.ActionMenuView) r1;	 Catch:{ IllegalStateException -> 0x00e6 }
        r7.mMenuView = r1;	 Catch:{ IllegalStateException -> 0x00e6 }
        r1 = r7.mMenuView;	 Catch:{ IllegalStateException -> 0x00e6 }
        r4 = 0;
        r1.setBackgroundDrawable(r4);	 Catch:{ IllegalStateException -> 0x00e6 }
        r1 = r7.mMenuView;	 Catch:{ IllegalStateException -> 0x00e6 }
        r7.addView(r1, r3);	 Catch:{ IllegalStateException -> 0x00e6 }
        if (r2 == 0) goto L_0x00db;
    L_0x009b:
        r1 = r7.mActionMenuPresenter;	 Catch:{ IllegalStateException -> 0x00e6 }
        r2 = r7.getContext();	 Catch:{ IllegalStateException -> 0x00e6 }
        r2 = r2.getResources();	 Catch:{ IllegalStateException -> 0x00e6 }
        r2 = r2.getDisplayMetrics();	 Catch:{ IllegalStateException -> 0x00e6 }
        r2 = r2.widthPixels;	 Catch:{ IllegalStateException -> 0x00e6 }
        r4 = 1;
        r1.setWidthLimit(r2, r4);	 Catch:{ IllegalStateException -> 0x00e6 }
        r1 = r7.mActionMenuPresenter;	 Catch:{ IllegalStateException -> 0x00e6 }
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r1.setItemLimit(r2);	 Catch:{ IllegalStateException -> 0x00e6 }
        r1 = -1;
        r3.width = r1;	 Catch:{ IllegalStateException -> 0x00e6 }
        r1 = r7.mContentHeight;	 Catch:{ IllegalStateException -> 0x00e6 }
        r3.height = r1;	 Catch:{ IllegalStateException -> 0x00e6 }
        r1 = r7.mActionMenuPresenter;	 Catch:{ IllegalStateException -> 0x00e6 }
        r0.addMenuPresenter(r1);	 Catch:{ IllegalStateException -> 0x00e6 }
        r0 = r7.mActionMenuPresenter;	 Catch:{ IllegalStateException -> 0x00e6 }
        r0 = r0.getMenuView(r7);	 Catch:{ IllegalStateException -> 0x00e6 }
        r0 = (com.actionbarsherlock.internal.view.menu.ActionMenuView) r0;	 Catch:{ IllegalStateException -> 0x00e6 }
        r7.mMenuView = r0;	 Catch:{ IllegalStateException -> 0x00e6 }
        r0 = r7.mMenuView;	 Catch:{ IllegalStateException -> 0x00e6 }
        r1 = r7.mSplitBackground;	 Catch:{ IllegalStateException -> 0x00e6 }
        r0.setBackgroundDrawable(r1);	 Catch:{ IllegalStateException -> 0x00e6 }
        r0 = r7.mSplitView;	 Catch:{ IllegalStateException -> 0x00e6 }
        r1 = r7.mMenuView;	 Catch:{ IllegalStateException -> 0x00e6 }
        r0.addView(r1, r3);	 Catch:{ IllegalStateException -> 0x00e6 }
    L_0x00db:
        r7.mAnimateInOnLayout = r5;
        return;
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        throw r0;
    L_0x00e2:
        r0 = move-exception;
        throw r0;
    L_0x00e4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00e6 }
    L_0x00e6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarContextView.initForMode(com.actionbarsherlock.view.ActionMode):void");
    }

    public void closeMode() {
        try {
            if (this.mAnimationMode != 2) {
                try {
                    if (this.mClose == null) {
                        killMode();
                        return;
                    }
                    finishAnimation();
                    this.mAnimationMode = 2;
                    this.mCurrentAnimation = makeOutAnimation();
                    this.mCurrentAnimation.start();
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public boolean hideOverflowMenu() {
        try {
            return this.mActionMenuPresenter != null ? this.mActionMenuPresenter.hideOverflowMenu() : false;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        boolean z = AbsActionBarView.b;
        if (MeasureSpec.getMode(i) != 1073741824) {
            try {
                throw new IllegalStateException(getClass().getSimpleName() + z[0] + z[1]);
            } catch (IllegalStateException e) {
                throw e;
            }
        } else if (MeasureSpec.getMode(i2) == 0) {
            try {
                throw new IllegalStateException(getClass().getSimpleName() + z[2] + z[3]);
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } else {
            int size = MeasureSpec.getSize(i);
            try {
                int i4;
                if (this.mContentHeight > 0) {
                    i4 = this.mContentHeight;
                } else {
                    i4 = MeasureSpec.getSize(i2);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i5 = i4 - paddingTop;
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
                if (this.mClose != null) {
                    int measureChildView = measureChildView(this.mClose, paddingLeft, makeMeasureSpec, 0);
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mClose.getLayoutParams();
                    paddingLeft = measureChildView - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
                }
                try {
                    if (this.mMenuView != null && this.mMenuView.getParent() == this) {
                        paddingLeft = measureChildView(this.mMenuView, paddingLeft, makeMeasureSpec, 0);
                    }
                    try {
                        int min;
                        if (this.mTitleLayout != null && this.mCustomView == null) {
                            paddingLeft = measureChildView(this.mTitleLayout, paddingLeft, makeMeasureSpec, 0);
                        }
                        if (this.mCustomView != null) {
                            LayoutParams layoutParams = this.mCustomView.getLayoutParams();
                            try {
                                if (layoutParams.width != -2) {
                                    makeMeasureSpec = 1073741824;
                                } else {
                                    makeMeasureSpec = Integer.MIN_VALUE;
                                }
                                try {
                                    if (layoutParams.width >= 0) {
                                        paddingLeft = Math.min(layoutParams.width, paddingLeft);
                                    }
                                    try {
                                        if (layoutParams.height == -2) {
                                            i3 = Integer.MIN_VALUE;
                                        }
                                        try {
                                            if (layoutParams.height >= 0) {
                                                min = Math.min(layoutParams.height, i5);
                                            } else {
                                                min = i5;
                                            }
                                            this.mCustomView.measure(MeasureSpec.makeMeasureSpec(paddingLeft, makeMeasureSpec), MeasureSpec.makeMeasureSpec(min, i3));
                                        } catch (IllegalStateException e22) {
                                            throw e22;
                                        }
                                    } catch (IllegalStateException e222) {
                                        throw e222;
                                    }
                                } catch (IllegalStateException e2222) {
                                    throw e2222;
                                }
                            } catch (IllegalStateException e22222) {
                                throw e22222;
                            }
                        }
                        try {
                            if (this.mContentHeight <= 0) {
                                min = getChildCount();
                                i3 = 0;
                                paddingLeft = 0;
                                while (i3 < min) {
                                    makeMeasureSpec = getChildAt(i3).getMeasuredHeight() + paddingTop;
                                    if (makeMeasureSpec > paddingLeft) {
                                        paddingLeft = makeMeasureSpec;
                                    }
                                    makeMeasureSpec = i3 + 1;
                                    if (!z) {
                                        i3 = makeMeasureSpec;
                                    }
                                }
                                break;
                                setMeasuredDimension(size, paddingLeft);
                                if (!z) {
                                    return;
                                }
                            }
                            setMeasuredDimension(size, i4);
                        } catch (IllegalStateException e222222) {
                            throw e222222;
                        }
                    } catch (IllegalStateException e2222222) {
                        throw e2222222;
                    }
                } catch (IllegalStateException e22222222) {
                    throw e22222222;
                }
            } catch (IllegalStateException e222222222) {
                throw e222222222;
            }
        }
    }

    private Animator makeOutAnimation() {
        boolean z = AbsActionBarView.b;
        Animator ofFloat = ObjectAnimator.ofFloat(this.mClose, z[7], new float[]{(float) ((-this.mClose.getWidth()) - ((MarginLayoutParams) this.mClose.getLayoutParams()).leftMargin)});
        ofFloat.setDuration(200);
        ofFloat.addListener(this);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        Animator animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        return (this.mMenuView == null || this.mMenuView.getChildCount() > 0) ? animatorSet : animatorSet;
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public boolean isOverflowMenuShowing() {
        try {
            return this.mActionMenuPresenter != null ? this.mActionMenuPresenter.isOverflowMenuShowing() : false;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSplitActionBar(boolean r6) {
        /*
        r5_this = this;
        r4 = -1;
        r0 = r5.mSplitActionBar;	 Catch:{ IllegalStateException -> 0x0086 }
        if (r0 == r6) goto L_0x0085;
    L_0x0005:
        r0 = r5.mActionMenuPresenter;	 Catch:{ IllegalStateException -> 0x0086 }
        if (r0 == 0) goto L_0x0082;
    L_0x0009:
        r1 = new android.view.ViewGroup$LayoutParams;
        r0 = -2;
        r1.<init>(r0, r4);
        if (r6 != 0) goto L_0x0039;
    L_0x0011:
        r0 = r5.mActionMenuPresenter;
        r0 = r0.getMenuView(r5);
        r0 = (com.actionbarsherlock.internal.view.menu.ActionMenuView) r0;
        r5.mMenuView = r0;
        r0 = r5.mMenuView;
        r2 = 0;
        r0.setBackgroundDrawable(r2);
        r0 = r5.mMenuView;
        r0 = r0.getParent();
        r0 = (android.view.ViewGroup) r0;
        if (r0 == 0) goto L_0x0030;
    L_0x002b:
        r2 = r5.mMenuView;	 Catch:{ IllegalStateException -> 0x0088 }
        r0.removeView(r2);	 Catch:{ IllegalStateException -> 0x0088 }
    L_0x0030:
        r0 = r5.mMenuView;
        r5.addView(r0, r1);
        r0 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        if (r0 == 0) goto L_0x0082;
    L_0x0039:
        r0 = r5.mActionMenuPresenter;
        r2 = r5.getContext();
        r2 = r2.getResources();
        r2 = r2.getDisplayMetrics();
        r2 = r2.widthPixels;
        r3 = 1;
        r0.setWidthLimit(r2, r3);
        r0 = r5.mActionMenuPresenter;
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0.setItemLimit(r2);
        r1.width = r4;
        r0 = r5.mContentHeight;
        r1.height = r0;
        r0 = r5.mActionMenuPresenter;
        r0 = r0.getMenuView(r5);
        r0 = (com.actionbarsherlock.internal.view.menu.ActionMenuView) r0;
        r5.mMenuView = r0;
        r0 = r5.mMenuView;
        r2 = r5.mSplitBackground;
        r0.setBackgroundDrawable(r2);
        r0 = r5.mMenuView;
        r0 = r0.getParent();
        r0 = (android.view.ViewGroup) r0;
        if (r0 == 0) goto L_0x007b;
    L_0x0076:
        r2 = r5.mMenuView;	 Catch:{ IllegalStateException -> 0x008a }
        r0.removeView(r2);	 Catch:{ IllegalStateException -> 0x008a }
    L_0x007b:
        r0 = r5.mSplitView;
        r2 = r5.mMenuView;
        r0.addView(r2, r1);
    L_0x0082:
        super.setSplitActionBar(r6);
    L_0x0085:
        return;
    L_0x0086:
        r0 = move-exception;
        throw r0;
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarContextView.setSplitActionBar(boolean):void");
    }

    private void initTitle() {
        int i = 1;
        int i2 = 0;
        if (this.mTitleLayout == null) {
            try {
                LayoutInflater.from(getContext()).inflate(R.layout.abs__action_bar_title_item, this);
                this.mTitleLayout = (LinearLayout) getChildAt(getChildCount() - 1);
                this.mTitleView = (TextView) this.mTitleLayout.findViewById(R.id.abs__action_bar_title);
                this.mSubtitleView = (TextView) this.mTitleLayout.findViewById(R.id.abs__action_bar_subtitle);
                if (this.mTitleStyleRes != 0) {
                    this.mTitleView.setTextAppearance(this.mContext, this.mTitleStyleRes);
                }
                try {
                    if (this.mSubtitleStyleRes != 0) {
                        this.mSubtitleView.setTextAppearance(this.mContext, this.mSubtitleStyleRes);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        try {
            this.mTitleView.setText(this.mTitle);
            this.mSubtitleView.setText(this.mSubtitle);
            int i3 = !TextUtils.isEmpty(this.mTitle) ? 1 : 0;
            try {
                if (TextUtils.isEmpty(this.mSubtitle)) {
                    i = 0;
                }
                try {
                    try {
                        this.mSubtitleView.setVisibility(i != 0 ? 0 : 8);
                        LinearLayout linearLayout = this.mTitleLayout;
                        if (i3 == 0 && i == 0) {
                            i2 = 8;
                        }
                        try {
                            linearLayout.setVisibility(i2);
                            if (this.mTitleLayout.getParent() == null) {
                                addView(this.mTitleLayout);
                            }
                        } catch (IllegalStateException e22) {
                            throw e22;
                        }
                    } catch (IllegalStateException e222) {
                        throw e222;
                    } catch (IllegalStateException e2222) {
                        throw e2222;
                    }
                } catch (IllegalStateException e22222) {
                    throw e22222;
                }
            } catch (IllegalStateException e222222) {
                throw e222222;
            }
        } catch (IllegalStateException e2222222) {
            throw e2222222;
        }
    }

    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            if (this.mActionMenuPresenter != null) {
                this.mActionMenuPresenter.hideOverflowMenu();
                this.mActionMenuPresenter.hideSubMenus();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void setCustomView(View view) {
        try {
            if (this.mCustomView != null) {
                removeView(this.mCustomView);
            }
            try {
                this.mCustomView = view;
                if (this.mTitleLayout != null) {
                    removeView(this.mTitleLayout);
                    this.mTitleLayout = null;
                }
                if (view != null) {
                    try {
                        addView(view);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                requestLayout();
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public void onAnimationCancel(Animator animator) {
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    private Animator makeInAnimation() {
        boolean z = AbsActionBarView.b;
        this.mClose.setTranslationX((float) ((-this.mClose.getWidth()) - ((MarginLayoutParams) this.mClose.getLayoutParams()).leftMargin));
        Animator ofFloat = ObjectAnimator.ofFloat(this.mClose, z[5], new float[]{0.0f});
        ofFloat.setDuration(200);
        ofFloat.addListener(this);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        Animator animatorSet = new AnimatorSet();
        Builder play = animatorSet.play(ofFloat);
        if (this.mMenuView != null) {
            int childCount = this.mMenuView.getChildCount();
            if (childCount > 0) {
                int i = childCount - 1;
                childCount = 0;
                while (i >= 0) {
                    AnimatorProxy wrap = AnimatorProxy.wrap(this.mMenuView.getChildAt(i));
                    wrap.setScaleY(0.0f);
                    Animator ofFloat2 = ObjectAnimator.ofFloat(wrap, z[4], new float[]{0.0f, 1.0f});
                    ofFloat2.setDuration(100);
                    ofFloat2.setStartDelay((long) (childCount * 70));
                    play.with(ofFloat2);
                    i--;
                    childCount++;
                    if (z) {
                        break;
                    }
                }
            }
        }
        return animatorSet;
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        initTitle();
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        try {
            if (accessibilityEvent.getEventType() == 32) {
                accessibilityEvent.setClassName(getClass().getName());
                accessibilityEvent.setPackageName(getContext().getPackageName());
                accessibilityEvent.setContentDescription(this.mTitle);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
