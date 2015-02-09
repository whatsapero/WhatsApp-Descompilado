package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

class ScrollerCompatGingerbread {
    public static void startScroll(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((OverScroller) obj).startScroll(i, i2, i3, i4, i5);
    }

    public static boolean computeScrollOffset(Object obj) {
        return ((OverScroller) obj).computeScrollOffset();
    }

    public static int getFinalY(Object obj) {
        return ((OverScroller) obj).getFinalY();
    }

    public static void abortAnimation(Object obj) {
        ((OverScroller) obj).abortAnimation();
    }

    public static Object createScroller(Context context, Interpolator interpolator) {
        return interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    public static int getFinalX(Object obj) {
        return ((OverScroller) obj).getFinalX();
    }

    public static int getCurrY(Object obj) {
        return ((OverScroller) obj).getCurrY();
    }

    public static int getCurrX(Object obj) {
        return ((OverScroller) obj).getCurrX();
    }
}
