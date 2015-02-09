package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.widget.Scroller;

public class ScrollerCompat {
    ScrollerCompatImpl mImpl;
    Object mScroller;

    interface ScrollerCompatImpl {
        void abortAnimation(Object obj);

        boolean computeScrollOffset(Object obj);

        Object createScroller(Context context, Interpolator interpolator);

        int getCurrX(Object obj);

        int getCurrY(Object obj);

        int getFinalX(Object obj);

        int getFinalY(Object obj);

        void startScroll(Object obj, int i, int i2, int i3, int i4, int i5);
    }

    class ScrollerCompatImplBase implements ScrollerCompatImpl {
        public void startScroll(Object obj, int i, int i2, int i3, int i4, int i5) {
            ((Scroller) obj).startScroll(i, i2, i3, i4, i5);
        }

        public int getCurrX(Object obj) {
            return ((Scroller) obj).getCurrX();
        }

        ScrollerCompatImplBase() {
        }

        public void abortAnimation(Object obj) {
            ((Scroller) obj).abortAnimation();
        }

        public boolean computeScrollOffset(Object obj) {
            return ((Scroller) obj).computeScrollOffset();
        }

        public Object createScroller(Context context, Interpolator interpolator) {
            return interpolator != null ? new Scroller(context, interpolator) : new Scroller(context);
        }

        public int getFinalX(Object obj) {
            return ((Scroller) obj).getFinalX();
        }

        public int getCurrY(Object obj) {
            return ((Scroller) obj).getCurrY();
        }

        public int getFinalY(Object obj) {
            return ((Scroller) obj).getFinalY();
        }
    }

    class ScrollerCompatImplGingerbread implements ScrollerCompatImpl {
        public Object createScroller(Context context, Interpolator interpolator) {
            return ScrollerCompatGingerbread.createScroller(context, interpolator);
        }

        public void abortAnimation(Object obj) {
            ScrollerCompatGingerbread.abortAnimation(obj);
        }

        public void startScroll(Object obj, int i, int i2, int i3, int i4, int i5) {
            ScrollerCompatGingerbread.startScroll(obj, i, i2, i3, i4, i5);
        }

        public int getCurrY(Object obj) {
            return ScrollerCompatGingerbread.getCurrY(obj);
        }

        ScrollerCompatImplGingerbread() {
        }

        public int getFinalY(Object obj) {
            return ScrollerCompatGingerbread.getFinalY(obj);
        }

        public boolean computeScrollOffset(Object obj) {
            return ScrollerCompatGingerbread.computeScrollOffset(obj);
        }

        public int getCurrX(Object obj) {
            return ScrollerCompatGingerbread.getCurrX(obj);
        }

        public int getFinalX(Object obj) {
            return ScrollerCompatGingerbread.getFinalX(obj);
        }
    }

    class ScrollerCompatImplIcs extends ScrollerCompatImplGingerbread {
        ScrollerCompatImplIcs() {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ScrollerCompat(int r3, android.content.Context r4, android.view.animation.Interpolator r5) {
        /*
        r2_this = this;
        r0 = android.support.v4.widget.SlidingPaneLayout.a;
        r2.<init>();
        r1 = 14;
        if (r3 < r1) goto L_0x0012;
    L_0x0009:
        r1 = new android.support.v4.widget.ScrollerCompat$ScrollerCompatImplIcs;
        r1.<init>();
        r2.mImpl = r1;
        if (r0 == 0) goto L_0x0026;
    L_0x0012:
        r1 = 9;
        if (r3 < r1) goto L_0x001f;
    L_0x0016:
        r1 = new android.support.v4.widget.ScrollerCompat$ScrollerCompatImplGingerbread;
        r1.<init>();
        r2.mImpl = r1;
        if (r0 == 0) goto L_0x0026;
    L_0x001f:
        r0 = new android.support.v4.widget.ScrollerCompat$ScrollerCompatImplBase;
        r0.<init>();
        r2.mImpl = r0;
    L_0x0026:
        r0 = r2.mImpl;
        r0 = r0.createScroller(r4, r5);
        r2.mScroller = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.ScrollerCompat.<init>(int, android.content.Context, android.view.animation.Interpolator):void");
    }

    public int getCurrX() {
        return this.mImpl.getCurrX(this.mScroller);
    }

    public boolean computeScrollOffset() {
        return this.mImpl.computeScrollOffset(this.mScroller);
    }

    public int getFinalY() {
        return this.mImpl.getFinalY(this.mScroller);
    }

    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.mImpl.startScroll(this.mScroller, i, i2, i3, i4, i5);
    }

    ScrollerCompat(Context context, Interpolator interpolator) {
        this(VERSION.SDK_INT, context, interpolator);
    }

    public static ScrollerCompat create(Context context, Interpolator interpolator) {
        return new ScrollerCompat(context, interpolator);
    }

    public int getFinalX() {
        return this.mImpl.getFinalX(this.mScroller);
    }

    public void abortAnimation() {
        this.mImpl.abortAnimation(this.mScroller);
    }

    public int getCurrY() {
        return this.mImpl.getCurrY(this.mScroller);
    }
}
