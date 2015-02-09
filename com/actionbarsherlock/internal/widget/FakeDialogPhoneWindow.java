package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.LinearLayout;
import com.actionbarsherlock.R;

public class FakeDialogPhoneWindow extends LinearLayout {
    final TypedValue mMinWidthMajor;
    final TypedValue mMinWidthMinor;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r11, int r12) {
        /*
        r10_this = this;
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = 1;
        r2 = 0;
        r5 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r0 = r10.getContext();
        r0 = r0.getResources();
        r6 = r0.getDisplayMetrics();
        r0 = r6.widthPixels;
        r3 = r6.heightPixels;
        if (r0 >= r3) goto L_0x0058;
    L_0x0018:
        r0 = r1;
    L_0x0019:
        super.onMeasure(r11, r12);
        r7 = r10.getMeasuredWidth();
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9);
        if (r0 == 0) goto L_0x005a;
    L_0x0026:
        r0 = r10.mMinWidthMinor;
    L_0x0028:
        r4 = r0.type;
        if (r4 == 0) goto L_0x005d;
    L_0x002c:
        r4 = r0.type;
        r8 = 5;
        if (r4 != r8) goto L_0x0038;
    L_0x0031:
        r4 = r0.getDimension(r6);
        r4 = (int) r4;
        if (r5 == 0) goto L_0x005f;
    L_0x0038:
        r4 = r0.type;
        r8 = 6;
        if (r4 != r8) goto L_0x004a;
    L_0x003d:
        r4 = r6.widthPixels;
        r4 = (float) r4;
        r6 = r6.widthPixels;
        r6 = (float) r6;
        r0 = r0.getFraction(r4, r6);
        r0 = (int) r0;
        if (r5 == 0) goto L_0x004b;
    L_0x004a:
        r0 = r2;
    L_0x004b:
        if (r7 >= r0) goto L_0x005d;
    L_0x004d:
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9);
        r2 = r1;
    L_0x0052:
        if (r2 == 0) goto L_0x0057;
    L_0x0054:
        super.onMeasure(r0, r12);
    L_0x0057:
        return;
    L_0x0058:
        r0 = r2;
        goto L_0x0019;
    L_0x005a:
        r0 = r10.mMinWidthMajor;
        goto L_0x0028;
    L_0x005d:
        r0 = r3;
        goto L_0x0052;
    L_0x005f:
        r0 = r4;
        goto L_0x004b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.FakeDialogPhoneWindow.onMeasure(int, int):void");
    }

    public FakeDialogPhoneWindow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMinWidthMajor = new TypedValue();
        this.mMinWidthMinor = new TypedValue();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SherlockTheme);
        obtainStyledAttributes.getValue(R.styleable.SherlockTheme_windowMinWidthMajor, this.mMinWidthMajor);
        obtainStyledAttributes.getValue(R.styleable.SherlockTheme_windowMinWidthMinor, this.mMinWidthMinor);
        obtainStyledAttributes.recycle();
    }
}
