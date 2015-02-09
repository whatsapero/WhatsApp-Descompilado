package com.tonicartos.widget.stickygridheaders;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class StickyGridHeadersBaseAdapterWrapper$HeaderFillerView extends FrameLayout {
    private int a;
    final l b;
    private int c;

    public int a() {
        return this.c;
    }

    protected void onMeasure(int i, int i2) {
        View view = (View) getTag();
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(generateDefaultLayoutParams());
        }
        if (view.getVisibility() != 8 && view.getMeasuredHeight() == 0) {
            view.measure(MeasureSpec.makeMeasureSpec(this.a, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
        }
        setMeasuredDimension(MeasureSpec.getSize(i), view.getMeasuredHeight());
    }

    public StickyGridHeadersBaseAdapterWrapper$HeaderFillerView(l lVar, Context context) {
        this.b = lVar;
        super(context);
    }

    public void setHeaderId(int i) {
        this.c = i;
    }

    public void setHeaderWidth(int i) {
        this.a = i;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public StickyGridHeadersBaseAdapterWrapper$HeaderFillerView(l lVar, Context context, AttributeSet attributeSet, int i) {
        this.b = lVar;
        super(context, attributeSet, i);
    }

    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    public StickyGridHeadersBaseAdapterWrapper$HeaderFillerView(l lVar, Context context, AttributeSet attributeSet) {
        this.b = lVar;
        super(context, attributeSet);
    }
}
