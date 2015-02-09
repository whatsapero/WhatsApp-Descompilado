package com.whatsapp.util;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan.LeadingMarginSpan2;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;

public class aj implements LeadingMarginSpan2 {
    private View a;
    private int b;
    private int c;

    public aj(int i, int i2, View view) {
        this.b = i2;
        this.c = i;
        this.a = view;
    }

    public int getLeadingMarginLineCount() {
        return this.c;
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        LayoutParams layoutParams;
        int[] rules;
        if (i2 < 0) {
            layoutParams = (LayoutParams) this.a.getLayoutParams();
            rules = layoutParams.getRules();
            if (!(rules[11] == -1 && rules[9] == 0)) {
                layoutParams.addRule(11);
                layoutParams.addRule(9, 0);
                this.a.requestLayout();
            }
            if (Log.e == 0) {
                return;
            }
        }
        layoutParams = (LayoutParams) this.a.getLayoutParams();
        rules = layoutParams.getRules();
        if (rules[9] != -1 || rules[11] != 0) {
            layoutParams.addRule(9);
            layoutParams.addRule(11, 0);
            this.a.requestLayout();
        }
    }

    public int getLeadingMargin(boolean z) {
        return z ? this.b : 0;
    }
}
