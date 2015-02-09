package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.actionbarsherlock.internal.nineoldandroids.widget.NineLinearLayout;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class IcsLinearLayout extends NineLinearLayout {
    private static final int[] R_styleable_LinearLayout;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mShowDividers;
    private boolean mUseLargestChild;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void drawDividersVertical(android.graphics.Canvas r7) {
        /*
        r6_this = this;
        r2 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r3 = r6.getChildCount();
        r0 = 0;
        r1 = r0;
    L_0x0008:
        if (r1 >= r3) goto L_0x0033;
    L_0x000a:
        r4 = r6.getChildAt(r1);
        if (r4 == 0) goto L_0x002f;
    L_0x0010:
        r0 = r4.getVisibility();
        r5 = 8;
        if (r0 == r5) goto L_0x002f;
    L_0x0018:
        r0 = r6.hasDividerBeforeChildAt(r1);
        if (r0 == 0) goto L_0x002f;
    L_0x001e:
        r0 = r4.getLayoutParams();
        r0 = (android.widget.LinearLayout.LayoutParams) r0;
        r4 = r4.getTop();
        r0 = r0.topMargin;
        r0 = r4 - r0;
        r6.drawHorizontalDivider(r7, r0);
    L_0x002f:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x0057;
    L_0x0033:
        r0 = r6.hasDividerBeforeChildAt(r3);
        if (r0 == 0) goto L_0x0056;
    L_0x0039:
        r0 = r3 + -1;
        r1 = r6.getChildAt(r0);
        if (r1 != 0) goto L_0x004f;
    L_0x0041:
        r0 = r6.getHeight();
        r3 = r6.getPaddingBottom();
        r0 = r0 - r3;
        r3 = r6.mDividerHeight;
        r0 = r0 - r3;
        if (r2 == 0) goto L_0x0053;
    L_0x004f:
        r0 = r1.getBottom();
    L_0x0053:
        r6.drawHorizontalDivider(r7, r0);
    L_0x0056:
        return;
    L_0x0057:
        r1 = r0;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsLinearLayout.drawDividersVertical(android.graphics.Canvas):void");
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void useLargestChildHorizontal() {
        /*
        r10_this = this;
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = 0;
        r4 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r5 = r10.getChildCount();
        r1 = r2;
        r0 = r2;
    L_0x000b:
        if (r1 >= r5) goto L_0x001d;
    L_0x000d:
        r3 = r10.getChildAt(r1);
        r3 = r3.getMeasuredWidth();
        r0 = java.lang.Math.max(r3, r0);
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x000b;
    L_0x001d:
        r1 = r0;
        r3 = r2;
    L_0x001f:
        if (r3 >= r5) goto L_0x005f;
    L_0x0021:
        r6 = r10.getChildAt(r3);
        if (r6 == 0) goto L_0x005b;
    L_0x0027:
        r0 = r6.getVisibility();
        r7 = 8;
        if (r0 != r7) goto L_0x0031;
    L_0x002f:
        if (r4 == 0) goto L_0x005b;
    L_0x0031:
        r0 = r6.getLayoutParams();
        r0 = (android.widget.LinearLayout.LayoutParams) r0;
        r7 = r0.weight;
        r8 = 0;
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 <= 0) goto L_0x0050;
    L_0x003e:
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9);
        r8 = r6.getMeasuredHeight();
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9);
        r6.measure(r7, r8);
        r2 = r2 + r1;
        if (r4 == 0) goto L_0x0055;
    L_0x0050:
        r6 = r6.getMeasuredWidth();
        r2 = r2 + r6;
    L_0x0055:
        r6 = r0.leftMargin;
        r0 = r0.rightMargin;
        r0 = r0 + r6;
        r2 = r2 + r0;
    L_0x005b:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x0071;
    L_0x005f:
        r0 = r10.getPaddingLeft();
        r1 = r10.getPaddingRight();
        r0 = r0 + r1;
        r0 = r0 + r2;
        r1 = r10.getMeasuredHeight();
        r10.setMeasuredDimension(r0, r1);
        return;
    L_0x0071:
        r3 = r0;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsLinearLayout.useLargestChildHorizontal():void");
    }

    protected boolean hasDividerBeforeChildAt(int i) {
        boolean z = false;
        boolean z2 = AbsActionBarView.b;
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        } else {
            if (i == getChildCount()) {
                return (this.mShowDividers & 4) != 0;
            } else {
                if ((this.mShowDividers & 2) == 0) {
                    return false;
                }
                int i2 = i - 1;
                while (i2 >= 0) {
                    if (getChildAt(i2).getVisibility() != 8) {
                        if (!z2) {
                            return true;
                        }
                        z = true;
                    }
                    i2--;
                    if (z2) {
                        break;
                    }
                }
                return z;
            }
        }
    }

    static {
        R_styleable_LinearLayout = new int[]{16843049, 16843476, 16843561, 16843562};
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onDraw(android.graphics.Canvas r3) {
        /*
        r2_this = this;
        r0 = r2.mDivider;
        if (r0 == 0) goto L_0x0015;
    L_0x0004:
        r0 = r2.getOrientation();
        r1 = 1;
        if (r0 != r1) goto L_0x0012;
    L_0x000b:
        r2.drawDividersVertical(r3);
        r0 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        if (r0 == 0) goto L_0x0015;
    L_0x0012:
        r2.drawDividersHorizontal(r3);
    L_0x0015:
        super.onDraw(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsLinearLayout.onDraw(android.graphics.Canvas):void");
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void drawDividersHorizontal(android.graphics.Canvas r7) {
        /*
        r6_this = this;
        r2 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r3 = r6.getChildCount();
        r0 = 0;
        r1 = r0;
    L_0x0008:
        if (r1 >= r3) goto L_0x0033;
    L_0x000a:
        r4 = r6.getChildAt(r1);
        if (r4 == 0) goto L_0x002f;
    L_0x0010:
        r0 = r4.getVisibility();
        r5 = 8;
        if (r0 == r5) goto L_0x002f;
    L_0x0018:
        r0 = r6.hasDividerBeforeChildAt(r1);
        if (r0 == 0) goto L_0x002f;
    L_0x001e:
        r0 = r4.getLayoutParams();
        r0 = (android.widget.LinearLayout.LayoutParams) r0;
        r4 = r4.getLeft();
        r0 = r0.leftMargin;
        r0 = r4 - r0;
        r6.drawVerticalDivider(r7, r0);
    L_0x002f:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x0057;
    L_0x0033:
        r0 = r6.hasDividerBeforeChildAt(r3);
        if (r0 == 0) goto L_0x0056;
    L_0x0039:
        r0 = r3 + -1;
        r1 = r6.getChildAt(r0);
        if (r1 != 0) goto L_0x004f;
    L_0x0041:
        r0 = r6.getWidth();
        r3 = r6.getPaddingRight();
        r0 = r0 - r3;
        r3 = r6.mDividerWidth;
        r0 = r0 - r3;
        if (r2 == 0) goto L_0x0053;
    L_0x004f:
        r0 = r1.getRight();
    L_0x0053:
        r6.drawVerticalDivider(r7, r0);
    L_0x0056:
        return;
    L_0x0057:
        r1 = r0;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsLinearLayout.drawDividersHorizontal(android.graphics.Canvas):void");
    }

    void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public IcsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R_styleable_LinearLayout);
        setDividerDrawable(obtainStyledAttributes.getDrawable(0));
        this.mShowDividers = obtainStyledAttributes.getInt(2, 0);
        this.mDividerPadding = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.mUseLargestChild = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
            invalidate();
        }
        this.mShowDividers = i;
    }

    void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void measureChildWithMargins(android.view.View r8, int r9, int r10, int r11, int r12) {
        /*
        r7_this = this;
        r6 = 1;
        r1 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r2 = r7.indexOfChild(r8);
        r3 = r7.getOrientation();
        r0 = r8.getLayoutParams();
        r0 = (android.widget.LinearLayout.LayoutParams) r0;
        r4 = r7.hasDividerBeforeChildAt(r2);
        if (r4 == 0) goto L_0x0023;
    L_0x0017:
        if (r3 != r6) goto L_0x001f;
    L_0x0019:
        r4 = r7.mDividerHeight;
        r0.topMargin = r4;
        if (r1 == 0) goto L_0x0023;
    L_0x001f:
        r4 = r7.mDividerWidth;
        r0.leftMargin = r4;
    L_0x0023:
        r4 = r7.getChildCount();
        r5 = r4 + -1;
        if (r2 != r5) goto L_0x003d;
    L_0x002b:
        r2 = r7.hasDividerBeforeChildAt(r4);
        if (r2 == 0) goto L_0x003d;
    L_0x0031:
        if (r3 != r6) goto L_0x0039;
    L_0x0033:
        r2 = r7.mDividerHeight;
        r0.bottomMargin = r2;
        if (r1 == 0) goto L_0x003d;
    L_0x0039:
        r1 = r7.mDividerWidth;
        r0.rightMargin = r1;
    L_0x003d:
        super.measureChildWithMargins(r8, r9, r10, r11, r12);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsLinearLayout.measureChildWithMargins(android.view.View, int, int, int, int):void");
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mUseLargestChild) {
            switch (getOrientation()) {
                case PBE.MD5 /*0*/:
                    useLargestChildHorizontal();
                    if (!AbsActionBarView.b) {
                        return;
                    }
                    break;
                case ay.f /*1*/:
                    break;
                default:
                    return;
            }
            useLargestChildVertical();
        }
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void useLargestChildVertical() {
        /*
        r10_this = this;
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = 0;
        r4 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r5 = r10.getChildCount();
        r1 = r2;
        r0 = r2;
    L_0x000b:
        if (r1 >= r5) goto L_0x001d;
    L_0x000d:
        r3 = r10.getChildAt(r1);
        r3 = r3.getMeasuredHeight();
        r0 = java.lang.Math.max(r3, r0);
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x000b;
    L_0x001d:
        r1 = r0;
        r3 = r2;
    L_0x001f:
        if (r3 >= r5) goto L_0x005f;
    L_0x0021:
        r6 = r10.getChildAt(r3);
        if (r6 == 0) goto L_0x005b;
    L_0x0027:
        r0 = r6.getVisibility();
        r7 = 8;
        if (r0 != r7) goto L_0x0031;
    L_0x002f:
        if (r4 == 0) goto L_0x005b;
    L_0x0031:
        r0 = r6.getLayoutParams();
        r0 = (android.widget.LinearLayout.LayoutParams) r0;
        r7 = r0.weight;
        r8 = 0;
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 <= 0) goto L_0x0050;
    L_0x003e:
        r7 = r6.getMeasuredWidth();
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9);
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9);
        r6.measure(r7, r8);
        r2 = r2 + r1;
        if (r4 == 0) goto L_0x0055;
    L_0x0050:
        r6 = r6.getMeasuredHeight();
        r2 = r2 + r6;
    L_0x0055:
        r6 = r0.leftMargin;
        r0 = r0.rightMargin;
        r0 = r0 + r6;
        r2 = r2 + r0;
    L_0x005b:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x0071;
    L_0x005f:
        r0 = r10.getPaddingLeft();
        r1 = r10.getPaddingRight();
        r0 = r0 + r1;
        r0 = r0 + r2;
        r1 = r10.getMeasuredWidth();
        r10.setMeasuredDimension(r1, r0);
        return;
    L_0x0071:
        r3 = r0;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsLinearLayout.useLargestChildVertical():void");
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDividerDrawable(android.graphics.drawable.Drawable r3) {
        /*
        r2_this = this;
        r0 = 0;
        r1 = r2.mDivider;
        if (r3 != r1) goto L_0x0006;
    L_0x0005:
        return;
    L_0x0006:
        r2.mDivider = r3;
        if (r3 == 0) goto L_0x001a;
    L_0x000a:
        r1 = r3.getIntrinsicWidth();
        r2.mDividerWidth = r1;
        r1 = r3.getIntrinsicHeight();
        r2.mDividerHeight = r1;
        r1 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        if (r1 == 0) goto L_0x001e;
    L_0x001a:
        r2.mDividerWidth = r0;
        r2.mDividerHeight = r0;
    L_0x001e:
        if (r3 != 0) goto L_0x0021;
    L_0x0020:
        r0 = 1;
    L_0x0021:
        r2.setWillNotDraw(r0);
        r2.requestLayout();
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsLinearLayout.setDividerDrawable(android.graphics.drawable.Drawable):void");
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }
}
