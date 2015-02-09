package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.actionbarsherlock.R;
import com.actionbarsherlock.internal.nineoldandroids.widget.NineFrameLayout;

public class ActionBarContainer extends NineFrameLayout {
    private ActionBarView mActionBarView;
    private Drawable mBackground;
    private boolean mIsSplit;
    private boolean mIsStacked;
    private boolean mIsTransitioning;
    private Drawable mSplitBackground;
    private Drawable mStackedBackground;
    private View mTabContainer;

    public void setPrimaryBackground(Drawable drawable) {
        this.mBackground = drawable;
        invalidate();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mIsTransitioning || super.onInterceptTouchEvent(motionEvent);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        if (this.mTabContainer != null) {
            removeView(this.mTabContainer);
        }
        this.mTabContainer = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mActionBarView != null) {
            int i3;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mActionBarView.getLayoutParams();
            if (this.mActionBarView.isCollapsed()) {
                i3 = 0;
            } else {
                i3 = layoutParams.bottomMargin + (this.mActionBarView.getMeasuredHeight() + layoutParams.topMargin);
            }
            if (this.mTabContainer != null && this.mTabContainer.getVisibility() != 8 && MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + this.mTabContainer.getMeasuredHeight(), MeasureSpec.getSize(i2)));
            }
        }
    }

    public void setTransitioning(boolean z) {
        int i;
        this.mIsTransitioning = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
        r10_this = this;
        r5 = 8;
        r1 = 1;
        r2 = 0;
        r4 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        super.onLayout(r11, r12, r13, r14, r15);
        r0 = r10.mTabContainer;
        if (r0 == 0) goto L_0x00bf;
    L_0x000d:
        r0 = r10.mTabContainer;
        r0 = r0.getVisibility();
        if (r0 == r5) goto L_0x00bf;
    L_0x0015:
        r0 = r1;
    L_0x0016:
        r3 = r10.mTabContainer;
        if (r3 == 0) goto L_0x0057;
    L_0x001a:
        r3 = r10.mTabContainer;
        r3 = r3.getVisibility();
        if (r3 == r5) goto L_0x0057;
    L_0x0022:
        r5 = r10.getMeasuredHeight();
        r3 = r10.mTabContainer;
        r6 = r3.getMeasuredHeight();
        r3 = r10.mActionBarView;
        r3 = r3.getDisplayOptions();
        r3 = r3 & 2;
        if (r3 != 0) goto L_0x0050;
    L_0x0036:
        r7 = r10.getChildCount();
        r3 = r2;
    L_0x003b:
        if (r3 >= r7) goto L_0x0049;
    L_0x003d:
        r8 = r10.getChildAt(r3);
        r9 = r10.mTabContainer;
        if (r8 != r9) goto L_0x00c2;
    L_0x0045:
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x003b;
    L_0x0049:
        r3 = r10.mTabContainer;
        r3.layout(r12, r2, r14, r6);
        if (r4 == 0) goto L_0x0057;
    L_0x0050:
        r3 = r10.mTabContainer;
        r6 = r5 - r6;
        r3.layout(r12, r6, r14, r5);
    L_0x0057:
        r3 = r10.mIsSplit;
        if (r3 == 0) goto L_0x00d3;
    L_0x005b:
        r3 = r10.mSplitBackground;
        if (r3 == 0) goto L_0x00d1;
    L_0x005f:
        r3 = r10.mSplitBackground;
        r5 = r10.getMeasuredWidth();
        r6 = r10.getMeasuredHeight();
        r3.setBounds(r2, r2, r5, r6);
        if (r4 == 0) goto L_0x00b9;
    L_0x006e:
        r3 = r1;
    L_0x006f:
        r4 = r10.mBackground;
        if (r4 == 0) goto L_0x0091;
    L_0x0073:
        r3 = r10.mBackground;
        r4 = r10.mActionBarView;
        r4 = r4.getLeft();
        r5 = r10.mActionBarView;
        r5 = r5.getTop();
        r6 = r10.mActionBarView;
        r6 = r6.getRight();
        r7 = r10.mActionBarView;
        r7 = r7.getBottom();
        r3.setBounds(r4, r5, r6, r7);
        r3 = r1;
    L_0x0091:
        if (r0 == 0) goto L_0x0098;
    L_0x0093:
        r0 = r10.mStackedBackground;
        if (r0 == 0) goto L_0x0098;
    L_0x0097:
        r2 = r1;
    L_0x0098:
        r10.mIsStacked = r2;
        if (r2 == 0) goto L_0x00cf;
    L_0x009c:
        r0 = r10.mStackedBackground;
        r2 = r10.mTabContainer;
        r2 = r2.getLeft();
        r3 = r10.mTabContainer;
        r3 = r3.getTop();
        r4 = r10.mTabContainer;
        r4 = r4.getRight();
        r5 = r10.mTabContainer;
        r5 = r5.getBottom();
        r0.setBounds(r2, r3, r4, r5);
    L_0x00b9:
        if (r1 == 0) goto L_0x00be;
    L_0x00bb:
        r10.invalidate();
    L_0x00be:
        return;
    L_0x00bf:
        r0 = r2;
        goto L_0x0016;
    L_0x00c2:
        r9 = r10.mActionBarView;
        r9 = r9.isCollapsed();
        if (r9 != 0) goto L_0x0045;
    L_0x00ca:
        r8.offsetTopAndBottom(r6);
        goto L_0x0045;
    L_0x00cf:
        r1 = r3;
        goto L_0x00b9;
    L_0x00d1:
        r1 = r2;
        goto L_0x00b9;
    L_0x00d3:
        r3 = r2;
        goto L_0x006f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.mActionBarView = (ActionBarView) findViewById(R.id.abs__action_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        boolean z = true;
        super(context, attributeSet);
        setBackgroundDrawable(null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SherlockActionBar);
        this.mBackground = obtainStyledAttributes.getDrawable(R.styleable.SherlockActionBar_background);
        this.mStackedBackground = obtainStyledAttributes.getDrawable(R.styleable.SherlockActionBar_backgroundStacked);
        if ((this.mStackedBackground instanceof ColorDrawable) && VERSION.SDK_INT < 11) {
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Config.ARGB_8888);
            this.mStackedBackground.draw(new Canvas(createBitmap));
            int pixel = createBitmap.getPixel(0, 0);
            createBitmap.recycle();
            this.mStackedBackground = new IcsColorDrawable(pixel);
        }
        if (getId() == R.id.abs__split_action_bar) {
            this.mIsSplit = true;
            this.mSplitBackground = obtainStyledAttributes.getDrawable(R.styleable.SherlockActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (this.mIsSplit) {
            if (this.mSplitBackground != null) {
                z = false;
            }
        } else if (!(this.mBackground == null && this.mStackedBackground == null)) {
            z = false;
        }
        setWillNotDraw(z);
    }

    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && getHeight() != 0) {
            if (this.mIsSplit) {
                if (this.mSplitBackground != null) {
                    this.mSplitBackground.draw(canvas);
                    if (!AbsActionBarView.b) {
                        return;
                    }
                }
                return;
            }
            if (this.mBackground != null) {
                this.mBackground.draw(canvas);
            }
            if (this.mStackedBackground != null && this.mIsStacked) {
                this.mStackedBackground.draw(canvas);
            }
        }
    }
}
