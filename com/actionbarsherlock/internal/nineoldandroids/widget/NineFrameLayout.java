package com.actionbarsherlock.internal.nineoldandroids.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.nineoldandroids.view.animation.AnimatorProxy;

public class NineFrameLayout extends FrameLayout {
    private final AnimatorProxy mProxy;

    public void setAlpha(float f) {
        if (AnimatorProxy.NEEDS_PROXY) {
            this.mProxy.setAlpha(f);
            if (!NineLinearLayout.a) {
                return;
            }
        }
        super.setAlpha(f);
    }

    public float getAlpha() {
        return AnimatorProxy.NEEDS_PROXY ? this.mProxy.getAlpha() : super.getAlpha();
    }

    public float getTranslationY() {
        return AnimatorProxy.NEEDS_PROXY ? this.mProxy.getTranslationY() : super.getTranslationY();
    }

    public NineFrameLayout(Context context, AttributeSet attributeSet) {
        AnimatorProxy wrap;
        boolean z = NineLinearLayout.a;
        super(context, attributeSet);
        if (AnimatorProxy.NEEDS_PROXY) {
            wrap = AnimatorProxy.wrap(this);
        } else {
            wrap = null;
        }
        this.mProxy = wrap;
        if (z) {
            boolean z2;
            if (SherlockActivity.a) {
                z2 = false;
            } else {
                z2 = true;
            }
            SherlockActivity.a = z2;
        }
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
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.nineoldandroids.widget.NineFrameLayout.setVisibility(int):void");
    }

    public void setTranslationY(float f) {
        if (AnimatorProxy.NEEDS_PROXY) {
            this.mProxy.setTranslationY(f);
            if (!NineLinearLayout.a) {
                return;
            }
        }
        super.setTranslationY(f);
    }
}
