package com.actionbarsherlock.internal.nineoldandroids.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.nineoldandroids.view.animation.AnimatorProxy;

public class NineLinearLayout extends LinearLayout {
    public static boolean a;
    private final AnimatorProxy mProxy;

    public float getAlpha() {
        return AnimatorProxy.NEEDS_PROXY ? this.mProxy.getAlpha() : super.getAlpha();
    }

    public NineLinearLayout(Context context, AttributeSet attributeSet) {
        AnimatorProxy wrap;
        boolean z = a;
        super(context, attributeSet);
        if (AnimatorProxy.NEEDS_PROXY) {
            wrap = AnimatorProxy.wrap(this);
        } else {
            wrap = null;
        }
        this.mProxy = wrap;
        if (SherlockActivity.a) {
            boolean z2;
            if (z) {
                z2 = false;
            } else {
                z2 = true;
            }
            a = z2;
        }
    }

    public float getTranslationX() {
        return AnimatorProxy.NEEDS_PROXY ? this.mProxy.getTranslationX() : super.getTranslationX();
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
        r0 = a;
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
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.nineoldandroids.widget.NineLinearLayout.setVisibility(int):void");
    }

    public void setTranslationX(float f) {
        if (AnimatorProxy.NEEDS_PROXY) {
            this.mProxy.setTranslationX(f);
            if (!a) {
                return;
            }
        }
        super.setTranslationX(f);
    }

    public void setAlpha(float f) {
        if (AnimatorProxy.NEEDS_PROXY) {
            this.mProxy.setAlpha(f);
            if (!a) {
                return;
            }
        }
        super.setAlpha(f);
    }
}
