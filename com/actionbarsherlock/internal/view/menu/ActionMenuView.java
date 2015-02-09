package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityEvent;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.internal.view.menu.MenuBuilder.ItemInvoker;
import com.actionbarsherlock.internal.widget.IcsLinearLayout;

public class ActionMenuView extends IcsLinearLayout implements ItemInvoker, MenuView {
    private static final boolean IS_FROYO;
    private boolean mFirst;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private MenuBuilder mMenu;
    private int mMinCellSize;
    private ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    public class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        public int cellsUsed;
        public boolean expandable;
        public boolean expanded;
        public int extraPixels;
        public boolean isOverflowButton;
        public boolean preventEdgeOffset;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.isOverflowButton = false;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(com.actionbarsherlock.internal.view.menu.ActionMenuView.LayoutParams layoutParams) {
            super(layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof LayoutParams);
    }

    protected boolean hasDividerBeforeChildAt(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            z = 0 | ((ActionMenuChildView) childAt).needsDividerAfter();
        }
        return (i <= 0 || !(childAt2 instanceof ActionMenuChildView)) ? z : ((ActionMenuChildView) childAt2).needsDividerBefore() | z;
    }

    protected static boolean isLayoutRtl() {
        return ActionBarSherlock.isRtl;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public void initialize(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    protected android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams)) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
        if (layoutParams2.gravity > 0) {
            return layoutParams2;
        }
        layoutParams2.gravity = 16;
        return layoutParams2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onMeasureExactFormat(int r31, int r32) {
        /*
        r30_this = this;
        r22 = com.actionbarsherlock.internal.view.menu.MenuBuilder.a;
        r23 = android.view.View.MeasureSpec.getMode(r32);
        r4 = android.view.View.MeasureSpec.getSize(r31);
        r11 = android.view.View.MeasureSpec.getSize(r32);
        r5 = r30.getPaddingLeft();
        r6 = r30.getPaddingRight();
        r5 = r5 + r6;
        r6 = r30.getPaddingTop();
        r7 = r30.getPaddingBottom();
        r24 = r6 + r7;
        r25 = r4 - r5;
        r0 = r30;
        r4 = r0.mMinCellSize;
        r7 = r25 / r4;
        r0 = r30;
        r4 = r0.mMinCellSize;
        r4 = r25 % r4;
        if (r7 != 0) goto L_0x003a;
    L_0x0031:
        r4 = 0;
        r0 = r30;
        r1 = r25;
        r0.setMeasuredDimension(r1, r4);
    L_0x0039:
        return;
    L_0x003a:
        r0 = r30;
        r5 = r0.mMinCellSize;
        r4 = r4 / r7;
        r26 = r5 + r4;
        r12 = 0;
        r10 = 0;
        r8 = 0;
        r5 = 0;
        r9 = 0;
        r14 = 0;
        r27 = r30.getChildCount();
        r4 = 0;
        r16 = r4;
        r4 = r5;
    L_0x0050:
        r0 = r16;
        r1 = r27;
        if (r0 >= r1) goto L_0x0318;
    L_0x0056:
        r0 = r30;
        r1 = r16;
        r6 = r0.getChildAt(r1);
        r5 = r6.getVisibility();
        r13 = 8;
        if (r5 != r13) goto L_0x016a;
    L_0x0066:
        r5 = r10;
        r13 = r7;
        r10 = r12;
    L_0x0069:
        r6 = r16 + 1;
        if (r22 == 0) goto L_0x0303;
    L_0x006d:
        r18 = r9;
        r19 = r4;
        r20 = r8;
        r21 = r5;
    L_0x0075:
        if (r18 == 0) goto L_0x01ff;
    L_0x0077:
        r4 = 2;
        r0 = r19;
        if (r0 != r4) goto L_0x01ff;
    L_0x007c:
        r4 = 1;
        r5 = r4;
    L_0x007e:
        r12 = 0;
    L_0x007f:
        if (r20 <= 0) goto L_0x02fe;
    L_0x0081:
        if (r13 <= 0) goto L_0x02fe;
    L_0x0083:
        r7 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r8 = 0;
        r6 = 0;
        r4 = 0;
        r16 = r4;
    L_0x008c:
        r0 = r16;
        r1 = r27;
        if (r0 >= r1) goto L_0x00aa;
    L_0x0092:
        r0 = r30;
        r1 = r16;
        r4 = r0.getChildAt(r1);
        r4 = r4.getLayoutParams();
        r4 = (com.actionbarsherlock.internal.view.menu.ActionMenuView.LayoutParams) r4;
        r0 = r4.expandable;
        r17 = r0;
        if (r17 != 0) goto L_0x0203;
    L_0x00a6:
        r4 = r16 + 1;
        if (r22 == 0) goto L_0x02fa;
    L_0x00aa:
        r4 = r6;
        r16 = r8;
        r8 = r7;
        r6 = r14 | r16;
        if (r4 <= r13) goto L_0x0224;
    L_0x00b2:
        r8 = r6;
        r6 = r12;
        r7 = r13;
    L_0x00b5:
        if (r18 != 0) goto L_0x0284;
    L_0x00b7:
        r4 = 1;
        r0 = r19;
        if (r0 != r4) goto L_0x0284;
    L_0x00bc:
        r4 = 1;
    L_0x00bd:
        if (r7 <= 0) goto L_0x0136;
    L_0x00bf:
        r12 = 0;
        r5 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r5 == 0) goto L_0x0136;
    L_0x00c5:
        r5 = r19 + -1;
        if (r7 < r5) goto L_0x00d0;
    L_0x00c9:
        if (r4 != 0) goto L_0x00d0;
    L_0x00cb:
        r5 = 1;
        r0 = r21;
        if (r0 <= r5) goto L_0x0136;
    L_0x00d0:
        r5 = java.lang.Long.bitCount(r8);
        r5 = (float) r5;
        if (r4 != 0) goto L_0x02ea;
    L_0x00d7:
        r12 = 1;
        r12 = r12 & r8;
        r14 = 0;
        r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r4 == 0) goto L_0x00f4;
    L_0x00e0:
        r4 = 0;
        r0 = r30;
        r4 = r0.getChildAt(r4);
        r4 = r4.getLayoutParams();
        r4 = (com.actionbarsherlock.internal.view.menu.ActionMenuView.LayoutParams) r4;
        r4 = r4.preventEdgeOffset;
        if (r4 != 0) goto L_0x00f4;
    L_0x00f1:
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r5 = r5 - r4;
    L_0x00f4:
        r4 = 1;
        r12 = r27 + -1;
        r4 = r4 << r12;
        r12 = (long) r4;
        r12 = r12 & r8;
        r14 = 0;
        r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r4 == 0) goto L_0x02ea;
    L_0x0100:
        r4 = r27 + -1;
        r0 = r30;
        r4 = r0.getChildAt(r4);
        r4 = r4.getLayoutParams();
        r4 = (com.actionbarsherlock.internal.view.menu.ActionMenuView.LayoutParams) r4;
        r4 = r4.preventEdgeOffset;
        if (r4 != 0) goto L_0x02ea;
    L_0x0112:
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r4 = r5 - r4;
    L_0x0116:
        r5 = 0;
        r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r5 <= 0) goto L_0x0287;
    L_0x011b:
        r5 = r7 * r26;
        r5 = (float) r5;
        r4 = r5 / r4;
        r4 = (int) r4;
        r5 = r4;
    L_0x0122:
        r4 = 0;
        r7 = r4;
    L_0x0124:
        r0 = r27;
        if (r7 >= r0) goto L_0x0136;
    L_0x0128:
        r4 = 1;
        r4 = r4 << r7;
        r12 = (long) r4;
        r12 = r12 & r8;
        r14 = 0;
        r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r4 != 0) goto L_0x028b;
    L_0x0132:
        r4 = r7 + 1;
        if (r22 == 0) goto L_0x02e7;
    L_0x0136:
        if (r6 == 0) goto L_0x015a;
    L_0x0138:
        r4 = r11 - r24;
        r0 = r23;
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0);
        r4 = 0;
        r5 = r4;
    L_0x0142:
        r0 = r27;
        if (r5 >= r0) goto L_0x015a;
    L_0x0146:
        r0 = r30;
        r7 = r0.getChildAt(r5);
        r4 = r7.getLayoutParams();
        r4 = (com.actionbarsherlock.internal.view.menu.ActionMenuView.LayoutParams) r4;
        r8 = r4.expanded;
        if (r8 != 0) goto L_0x02cf;
    L_0x0156:
        r4 = r5 + 1;
        if (r22 == 0) goto L_0x02e4;
    L_0x015a:
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r23;
        if (r0 == r4) goto L_0x02e1;
    L_0x0160:
        r4 = r10;
    L_0x0161:
        r0 = r30;
        r1 = r25;
        r0.setMeasuredDimension(r1, r4);
        goto L_0x0039;
    L_0x016a:
        r5 = r6 instanceof com.actionbarsherlock.internal.view.menu.ActionMenuItemView;
        r13 = r4 + 1;
        if (r5 == 0) goto L_0x0187;
    L_0x0170:
        r0 = r30;
        r4 = r0.mGeneratedItemPadding;
        r17 = 0;
        r0 = r30;
        r0 = r0.mGeneratedItemPadding;
        r18 = r0;
        r19 = 0;
        r0 = r17;
        r1 = r18;
        r2 = r19;
        r6.setPadding(r4, r0, r1, r2);
    L_0x0187:
        r4 = r6.getLayoutParams();
        r4 = (com.actionbarsherlock.internal.view.menu.ActionMenuView.LayoutParams) r4;
        r17 = 0;
        r0 = r17;
        r4.expanded = r0;
        r17 = 0;
        r0 = r17;
        r4.extraPixels = r0;
        r17 = 0;
        r0 = r17;
        r4.cellsUsed = r0;
        r17 = 0;
        r0 = r17;
        r4.expandable = r0;
        r17 = 0;
        r0 = r17;
        r4.leftMargin = r0;
        r17 = 0;
        r0 = r17;
        r4.rightMargin = r0;
        if (r5 == 0) goto L_0x01fb;
    L_0x01b3:
        r5 = r6;
        r5 = (com.actionbarsherlock.internal.view.menu.ActionMenuItemView) r5;
        r5 = r5.hasText();
        if (r5 == 0) goto L_0x01fb;
    L_0x01bc:
        r5 = 1;
    L_0x01bd:
        r4.preventEdgeOffset = r5;
        r5 = r4.isOverflowButton;
        if (r5 == 0) goto L_0x01fd;
    L_0x01c3:
        r5 = 1;
    L_0x01c4:
        r0 = r26;
        r1 = r32;
        r2 = r24;
        r17 = measureChildForCells(r6, r0, r5, r1, r2);
        r0 = r17;
        r10 = java.lang.Math.max(r10, r0);
        r5 = r4.expandable;
        if (r5 == 0) goto L_0x0315;
    L_0x01d8:
        r5 = r8 + 1;
    L_0x01da:
        r4 = r4.isOverflowButton;
        if (r4 == 0) goto L_0x0312;
    L_0x01de:
        r4 = 1;
    L_0x01df:
        r7 = r7 - r17;
        r6 = r6.getMeasuredHeight();
        r12 = java.lang.Math.max(r12, r6);
        r6 = 1;
        r0 = r17;
        if (r0 != r6) goto L_0x030a;
    L_0x01ee:
        r6 = 1;
        r6 = r6 << r16;
        r8 = (long) r6;
        r14 = r14 | r8;
        r9 = r4;
        r8 = r5;
        r4 = r13;
        r5 = r10;
        r10 = r12;
        r13 = r7;
        goto L_0x0069;
    L_0x01fb:
        r5 = 0;
        goto L_0x01bd;
    L_0x01fd:
        r5 = r7;
        goto L_0x01c4;
    L_0x01ff:
        r4 = 0;
        r5 = r4;
        goto L_0x007e;
    L_0x0203:
        r0 = r4.cellsUsed;
        r17 = r0;
        r0 = r17;
        if (r0 >= r7) goto L_0x0214;
    L_0x020b:
        r7 = r4.cellsUsed;
        r6 = 1;
        r6 = r6 << r16;
        r8 = (long) r6;
        r6 = 1;
        if (r22 == 0) goto L_0x00a6;
    L_0x0214:
        r4 = r4.cellsUsed;
        if (r4 != r7) goto L_0x00a6;
    L_0x0218:
        r4 = 1;
        r4 = r4 << r16;
        r0 = (long) r4;
        r28 = r0;
        r8 = r8 | r28;
        r6 = r6 + 1;
        goto L_0x00a6;
    L_0x0224:
        r12 = r8 + 1;
        r4 = 0;
        r8 = r6;
        r7 = r4;
        r6 = r13;
    L_0x022a:
        r0 = r27;
        if (r7 >= r0) goto L_0x02f8;
    L_0x022e:
        r0 = r30;
        r13 = r0.getChildAt(r7);
        r4 = r13.getLayoutParams();
        r4 = (com.actionbarsherlock.internal.view.menu.ActionMenuView.LayoutParams) r4;
        r14 = 1;
        r14 = r14 << r7;
        r14 = (long) r14;
        r14 = r14 & r16;
        r28 = 0;
        r14 = (r14 > r28 ? 1 : (r14 == r28 ? 0 : -1));
        if (r14 != 0) goto L_0x024f;
    L_0x0245:
        r14 = r4.cellsUsed;
        if (r14 != r12) goto L_0x02f6;
    L_0x0249:
        r14 = 1;
        r14 = r14 << r7;
        r14 = (long) r14;
        r8 = r8 | r14;
        if (r22 == 0) goto L_0x02f6;
    L_0x024f:
        if (r5 == 0) goto L_0x026e;
    L_0x0251:
        r14 = r4.preventEdgeOffset;
        if (r14 == 0) goto L_0x026e;
    L_0x0255:
        r14 = 1;
        if (r6 != r14) goto L_0x026e;
    L_0x0258:
        r0 = r30;
        r14 = r0.mGeneratedItemPadding;
        r14 = r14 + r26;
        r15 = 0;
        r0 = r30;
        r0 = r0.mGeneratedItemPadding;
        r28 = r0;
        r29 = 0;
        r0 = r28;
        r1 = r29;
        r13.setPadding(r14, r15, r0, r1);
    L_0x026e:
        r13 = r4.cellsUsed;
        r13 = r13 + 1;
        r4.cellsUsed = r13;
        r13 = 1;
        r4.expanded = r13;
        r6 = r6 + -1;
        r4 = r6;
    L_0x027a:
        r6 = r7 + 1;
        if (r22 == 0) goto L_0x02f2;
    L_0x027e:
        r6 = 1;
        if (r22 == 0) goto L_0x02ed;
    L_0x0281:
        r7 = r4;
        goto L_0x00b5;
    L_0x0284:
        r4 = 0;
        goto L_0x00bd;
    L_0x0287:
        r4 = 0;
        r5 = r4;
        goto L_0x0122;
    L_0x028b:
        r0 = r30;
        r12 = r0.getChildAt(r7);
        r4 = r12.getLayoutParams();
        r4 = (com.actionbarsherlock.internal.view.menu.ActionMenuView.LayoutParams) r4;
        r12 = r12 instanceof com.actionbarsherlock.internal.view.menu.ActionMenuItemView;
        if (r12 == 0) goto L_0x02ae;
    L_0x029b:
        r4.extraPixels = r5;
        r6 = 1;
        r4.expanded = r6;
        if (r7 != 0) goto L_0x02ab;
    L_0x02a2:
        r6 = r4.preventEdgeOffset;
        if (r6 != 0) goto L_0x02ab;
    L_0x02a6:
        r6 = -r5;
        r6 = r6 / 2;
        r4.leftMargin = r6;
    L_0x02ab:
        r6 = 1;
        if (r22 == 0) goto L_0x0132;
    L_0x02ae:
        r12 = r4.isOverflowButton;
        if (r12 == 0) goto L_0x02bf;
    L_0x02b2:
        r4.extraPixels = r5;
        r6 = 1;
        r4.expanded = r6;
        r6 = -r5;
        r6 = r6 / 2;
        r4.rightMargin = r6;
        r6 = 1;
        if (r22 == 0) goto L_0x0132;
    L_0x02bf:
        if (r7 == 0) goto L_0x02c5;
    L_0x02c1:
        r12 = r5 / 2;
        r4.leftMargin = r12;
    L_0x02c5:
        r12 = r27 + -1;
        if (r7 == r12) goto L_0x0132;
    L_0x02c9:
        r12 = r5 / 2;
        r4.rightMargin = r12;
        goto L_0x0132;
    L_0x02cf:
        r8 = r4.cellsUsed;
        r8 = r8 * r26;
        r4 = r4.extraPixels;
        r4 = r4 + r8;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r8);
        r7.measure(r4, r6);
        goto L_0x0156;
    L_0x02e1:
        r4 = r11;
        goto L_0x0161;
    L_0x02e4:
        r5 = r4;
        goto L_0x0142;
    L_0x02e7:
        r7 = r4;
        goto L_0x0124;
    L_0x02ea:
        r4 = r5;
        goto L_0x0116;
    L_0x02ed:
        r12 = r6;
        r14 = r8;
        r13 = r4;
        goto L_0x007f;
    L_0x02f2:
        r7 = r6;
        r6 = r4;
        goto L_0x022a;
    L_0x02f6:
        r4 = r6;
        goto L_0x027a;
    L_0x02f8:
        r4 = r6;
        goto L_0x027e;
    L_0x02fa:
        r16 = r4;
        goto L_0x008c;
    L_0x02fe:
        r6 = r12;
        r8 = r14;
        r7 = r13;
        goto L_0x00b5;
    L_0x0303:
        r16 = r6;
        r12 = r10;
        r7 = r13;
        r10 = r5;
        goto L_0x0050;
    L_0x030a:
        r9 = r4;
        r8 = r5;
        r4 = r13;
        r5 = r10;
        r10 = r12;
        r13 = r7;
        goto L_0x0069;
    L_0x0312:
        r4 = r9;
        goto L_0x01df;
    L_0x0315:
        r5 = r8;
        goto L_0x01da;
    L_0x0318:
        r18 = r9;
        r19 = r4;
        r20 = r8;
        r21 = r10;
        r13 = r7;
        r10 = r12;
        goto L_0x0075;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.ActionMenuView.onMeasureExactFormat(int, int):void");
    }

    protected android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (IS_FROYO) {
            super.onConfigurationChanged(configuration);
        }
        this.mPresenter.updateMenuView(false);
        if (this.mPresenter != null && this.mPresenter.isOverflowMenuShowing()) {
            this.mPresenter.hideOverflowMenu();
            this.mPresenter.showOverflowMenu();
        }
    }

    static {
        IS_FROYO = VERSION.SDK_INT >= 8;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onLayout(boolean r15, int r16, int r17, int r18, int r19) {
        /*
        r14_this = this;
        r7 = com.actionbarsherlock.internal.view.menu.MenuBuilder.a;
        r0 = r14.mFormatItems;
        if (r0 != 0) goto L_0x000a;
    L_0x0006:
        super.onLayout(r15, r16, r17, r18, r19);
    L_0x0009:
        return;
    L_0x000a:
        r8 = r14.getChildCount();
        r0 = r17 + r19;
        r9 = r0 / 2;
        r5 = 0;
        r0 = r18 - r16;
        r1 = r14.getPaddingRight();
        r0 = r0 - r1;
        r1 = r14.getPaddingLeft();
        r4 = r0 - r1;
        r1 = 0;
        r10 = isLayoutRtl();
        r0 = 0;
        r6 = r0;
    L_0x0027:
        if (r6 >= r8) goto L_0x0166;
    L_0x0029:
        r11 = r14.getChildAt(r6);
        r0 = r11.getVisibility();
        r2 = 8;
        if (r0 != r2) goto L_0x0037;
    L_0x0035:
        if (r7 == 0) goto L_0x0163;
    L_0x0037:
        r0 = r11.getLayoutParams();
        r0 = (com.actionbarsherlock.internal.view.menu.ActionMenuView.LayoutParams) r0;
        r2 = r0.isOverflowButton;
        if (r2 == 0) goto L_0x0160;
    L_0x0041:
        r1 = r11.getMeasuredWidth();
        r2 = r14.hasDividerBeforeChildAt(r6);
        if (r2 == 0) goto L_0x004d;
    L_0x004b:
        r1 = r1 + 0;
    L_0x004d:
        r12 = r11.getMeasuredHeight();
        if (r10 == 0) goto L_0x005e;
    L_0x0053:
        r2 = r14.getPaddingLeft();
        r3 = r0.leftMargin;
        r2 = r2 + r3;
        r3 = r2 + r1;
        if (r7 == 0) goto L_0x006d;
    L_0x005e:
        r2 = r14.getWidth();
        r3 = r14.getPaddingRight();
        r2 = r2 - r3;
        r3 = r0.rightMargin;
        r3 = r2 - r3;
        r2 = r3 - r1;
    L_0x006d:
        r13 = r12 / 2;
        r13 = r9 - r13;
        r12 = r12 + r13;
        r11.layout(r2, r13, r3, r12);
        r2 = r4 - r1;
        r1 = 1;
        if (r7 == 0) goto L_0x015c;
    L_0x007a:
        r3 = r11.getMeasuredWidth();
        r4 = r0.leftMargin;
        r3 = r3 + r4;
        r0 = r0.rightMargin;
        r0 = r0 + r3;
        r4 = r2 - r0;
        r5 = r5 + 1;
        r0 = r5;
    L_0x0089:
        r2 = r6 + 1;
        if (r7 == 0) goto L_0x0158;
    L_0x008d:
        r2 = r0;
    L_0x008e:
        r0 = 1;
        if (r8 != r0) goto L_0x00b2;
    L_0x0091:
        if (r1 != 0) goto L_0x00b2;
    L_0x0093:
        r0 = 0;
        r0 = r14.getChildAt(r0);
        r1 = r0.getMeasuredWidth();
        r2 = r0.getMeasuredHeight();
        r3 = r18 - r16;
        r3 = r3 / 2;
        r4 = r1 / 2;
        r3 = r3 - r4;
        r4 = r2 / 2;
        r4 = r9 - r4;
        r1 = r1 + r3;
        r2 = r2 + r4;
        r0.layout(r3, r4, r1, r2);
        goto L_0x0009;
    L_0x00b2:
        if (r1 == 0) goto L_0x014a;
    L_0x00b4:
        r0 = 0;
    L_0x00b5:
        r0 = r2 - r0;
        r1 = 0;
        if (r0 <= 0) goto L_0x014d;
    L_0x00ba:
        r0 = r4 / r0;
    L_0x00bc:
        r3 = java.lang.Math.max(r1, r0);
        if (r10 == 0) goto L_0x0109;
    L_0x00c2:
        r0 = r14.getWidth();
        r1 = r14.getPaddingRight();
        r1 = r0 - r1;
        r0 = 0;
        r2 = r0;
    L_0x00ce:
        if (r2 >= r8) goto L_0x0107;
    L_0x00d0:
        r4 = r14.getChildAt(r2);
        r0 = r4.getLayoutParams();
        r0 = (com.actionbarsherlock.internal.view.menu.ActionMenuView.LayoutParams) r0;
        r5 = r4.getVisibility();
        r6 = 8;
        if (r5 == r6) goto L_0x0156;
    L_0x00e2:
        r5 = r0.isOverflowButton;
        if (r5 == 0) goto L_0x00e8;
    L_0x00e6:
        if (r7 == 0) goto L_0x0156;
    L_0x00e8:
        r5 = r0.rightMargin;
        r1 = r1 - r5;
        r5 = r4.getMeasuredWidth();
        r6 = r4.getMeasuredHeight();
        r10 = r6 / 2;
        r10 = r9 - r10;
        r11 = r1 - r5;
        r6 = r6 + r10;
        r4.layout(r11, r10, r1, r6);
        r0 = r0.leftMargin;
        r0 = r0 + r5;
        r0 = r0 + r3;
        r0 = r1 - r0;
    L_0x0103:
        r1 = r2 + 1;
        if (r7 == 0) goto L_0x0152;
    L_0x0107:
        if (r7 == 0) goto L_0x0009;
    L_0x0109:
        r1 = r14.getPaddingLeft();
        r0 = 0;
        r2 = r0;
    L_0x010f:
        if (r2 >= r8) goto L_0x0009;
    L_0x0111:
        r4 = r14.getChildAt(r2);
        r0 = r4.getLayoutParams();
        r0 = (com.actionbarsherlock.internal.view.menu.ActionMenuView.LayoutParams) r0;
        r5 = r4.getVisibility();
        r6 = 8;
        if (r5 == r6) goto L_0x0150;
    L_0x0123:
        r5 = r0.isOverflowButton;
        if (r5 == 0) goto L_0x0129;
    L_0x0127:
        if (r7 == 0) goto L_0x0150;
    L_0x0129:
        r5 = r0.leftMargin;
        r1 = r1 + r5;
        r5 = r4.getMeasuredWidth();
        r6 = r4.getMeasuredHeight();
        r10 = r6 / 2;
        r10 = r9 - r10;
        r11 = r1 + r5;
        r6 = r6 + r10;
        r4.layout(r1, r10, r11, r6);
        r0 = r0.rightMargin;
        r0 = r0 + r5;
        r0 = r0 + r3;
        r0 = r0 + r1;
    L_0x0143:
        r1 = r2 + 1;
        if (r7 != 0) goto L_0x0009;
    L_0x0147:
        r2 = r1;
        r1 = r0;
        goto L_0x010f;
    L_0x014a:
        r0 = 1;
        goto L_0x00b5;
    L_0x014d:
        r0 = 0;
        goto L_0x00bc;
    L_0x0150:
        r0 = r1;
        goto L_0x0143;
    L_0x0152:
        r2 = r1;
        r1 = r0;
        goto L_0x00ce;
    L_0x0156:
        r0 = r1;
        goto L_0x0103;
    L_0x0158:
        r6 = r2;
        r5 = r0;
        goto L_0x0027;
    L_0x015c:
        r4 = r2;
        r0 = r5;
        goto L_0x0089;
    L_0x0160:
        r2 = r4;
        goto L_0x007a;
    L_0x0163:
        r0 = r5;
        goto L_0x0089;
    L_0x0166:
        r2 = r5;
        goto L_0x008e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.ActionMenuView.onLayout(boolean, int, int, int, int):void");
    }

    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction(menuItemImpl, 0);
    }

    protected void onDraw(Canvas canvas) {
        if (IS_FROYO || !this.mFirst) {
            super.onDraw(canvas);
            return;
        }
        this.mFirst = false;
        requestLayout();
    }

    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.isOverflowButton = true;
        return generateDefaultLayoutParams;
    }

    protected void onMeasure(int i, int i2) {
        boolean z;
        int i3 = MenuBuilder.a;
        boolean z2 = this.mFormatItems;
        if (MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.mFormatItems = z;
        if (z2 != this.mFormatItems) {
            this.mFormatItemsWidth = 0;
        }
        int mode = MeasureSpec.getMode(i);
        if (!(!this.mFormatItems || this.mMenu == null || mode == this.mFormatItemsWidth)) {
            this.mFormatItemsWidth = mode;
            this.mMenu.onItemsChanged(true);
        }
        if (this.mFormatItems) {
            onMeasureExactFormat(i, i2);
            if (i3 == 0) {
                return;
            }
        }
        int childCount = getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
            layoutParams.rightMargin = 0;
            layoutParams.leftMargin = 0;
            mode = i4 + 1;
            if (i3 != 0) {
                break;
            }
            i4 = mode;
        }
        super.onMeasure(i, i2);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.mPresenter = actionMenuPresenter;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFirst = true;
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int) (56.0f * f);
        this.mGeneratedItemPadding = (int) (f * 4.0f);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mPresenter.dismissPopupMenus();
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setOverflowReserved(boolean z) {
        this.mReserveOverflow = z;
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    public android.widget.LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    static int measureChildForCells(View view, int i, int i2, int i3, int i4) {
        int measuredWidth;
        boolean z = false;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        if (i2 > 0) {
            view.measure(MeasureSpec.makeMeasureSpec(i * i2, Integer.MIN_VALUE), makeMeasureSpec);
            measuredWidth = view.getMeasuredWidth();
            int i5 = measuredWidth / i;
            measuredWidth = measuredWidth % i != 0 ? i5 + 1 : i5;
        } else {
            measuredWidth = 0;
        }
        ActionMenuItemView actionMenuItemView;
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        if (!(layoutParams.isOverflowButton || r1 == null || !r1.hasText())) {
            z = true;
        }
        layoutParams.expandable = z;
        layoutParams.cellsUsed = measuredWidth;
        view.measure(MeasureSpec.makeMeasureSpec(measuredWidth * i, 1073741824), makeMeasureSpec);
        return measuredWidth;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        return layoutParams;
    }
}
