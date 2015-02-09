package com.tonicartos.widget.stickygridheaders;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

public class StickyGridHeadersBaseAdapterWrapper$ReferenceView extends FrameLayout {
    private boolean a;
    private View[] b;
    private int c;
    final l d;
    private int e;

    public void setTag(int i, Object obj) {
        getChildAt(0).setTag(i, obj);
    }

    public StickyGridHeadersBaseAdapterWrapper$ReferenceView(l lVar, Context context, AttributeSet attributeSet) {
        this.d = lVar;
        super(context, attributeSet);
    }

    public Object getTag(int i) {
        return getChildAt(0).getTag(i);
    }

    @SuppressLint({"NewApi"})
    public void setRowSiblings(View[] viewArr) {
        this.b = viewArr;
    }

    public void setPosition(int i) {
        this.e = i;
    }

    private void a(int i, int i2) {
        boolean z = StickyGridHeadersGridView.i;
        if (!this.a) {
            this.a = true;
            View[] viewArr = this.b;
            int length = viewArr.length;
            int i3 = 0;
            while (i3 < length) {
                View view = viewArr[i3];
                if (view != null) {
                    view.measure(i, i2);
                }
                i3++;
                if (z) {
                    break;
                }
            }
            this.a = false;
        }
    }

    public StickyGridHeadersBaseAdapterWrapper$ReferenceView(l lVar, Context context) {
        this.d = lVar;
        super(context);
    }

    public void setTag(Object obj) {
        getChildAt(0).setTag(obj);
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    protected FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    @TargetApi(11)
    public StickyGridHeadersBaseAdapterWrapper$ReferenceView(l lVar, Context context, AttributeSet attributeSet, int i) {
        this.d = lVar;
        super(context, attributeSet, i);
    }

    protected void onMeasure(int i, int i2) {
        boolean z = StickyGridHeadersGridView.i;
        super.onMeasure(i, i2);
        if (this.c != 1 && l.a(this.d) != null) {
            if (this.e % this.c == this.c - 1) {
                a(i, i2);
            }
            int measuredHeight = getMeasuredHeight();
            View[] viewArr = this.b;
            int length = viewArr.length;
            int i3 = 0;
            int i4 = measuredHeight;
            while (i3 < length) {
                View view = viewArr[i3];
                if (view != null) {
                    i4 = Math.max(i4, view.getMeasuredHeight());
                }
                i3++;
                if (z) {
                    break;
                }
            }
            if (i4 != measuredHeight) {
                super.onMeasure(i, MeasureSpec.makeMeasureSpec(i4, 1073741824));
            }
        }
    }

    public void setNumColumns(int i) {
        this.c = i;
    }

    public Object getTag() {
        return getChildAt(0).getTag();
    }

    public View a() {
        return getChildAt(0);
    }
}
