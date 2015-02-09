package com.actionbarsherlock.internal.nineoldandroids.widget;

import android.content.Context;
import android.widget.HorizontalScrollView;
import com.actionbarsherlock.internal.nineoldandroids.view.animation.AnimatorProxy;

public class NineHorizontalScrollView extends HorizontalScrollView {
    private final AnimatorProxy mProxy;

    public NineHorizontalScrollView(Context context) {
        AnimatorProxy wrap;
        super(context);
        if (AnimatorProxy.NEEDS_PROXY) {
            wrap = AnimatorProxy.wrap(this);
        } else {
            wrap = null;
        }
        this.mProxy = wrap;
    }

    public void setAlpha(float f) {
        if (AnimatorProxy.NEEDS_PROXY) {
            this.mProxy.setAlpha(f);
            if (!NineLinearLayout.a) {
                return;
            }
        }
        super.setAlpha(f);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setVisibility(int r2) {
        /*
        r1_this = this;
        r0 = r1.mProxy;
        if (r0 == 0) goto L_0x0016;
    L_0x0004:
        r0 = 8;
        if (r2 != r0) goto L_0x000f;
    L_0x0008:
        r1.clearAnimation();
        r0 = com.actionbarsherlock.internal.nineoldandroids.widget.NineLinearLayout.a;
        if (r0 == 0) goto L_0x0016;
    L_0x000f:
        if (r2 != 0) goto L_0x0016;
    L_0x0011:
        r0 = r1.mProxy;
        r1.setAnimation(r0);
    L_0x0016:
        super.setVisibility(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.nineoldandroids.widget.NineHorizontalScrollView.setVisibility(int):void");
    }

    public float getAlpha() {
        return AnimatorProxy.NEEDS_PROXY ? this.mProxy.getAlpha() : super.getAlpha();
    }
}
