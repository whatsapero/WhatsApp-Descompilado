package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;

public class ViewCompat {
    static final ViewCompatImpl IMPL;

    interface ViewCompatImpl {
        boolean canScrollHorizontally(View view, int i);

        boolean canScrollVertically(View view, int i);

        boolean getFitsSystemWindows(View view);

        int getImportantForAccessibility(View view);

        int getLayerType(View view);

        int getLayoutDirection(View view);

        int getOverScrollMode(View view);

        ViewParent getParentForAccessibility(View view);

        float getScaleX(View view);

        boolean isOpaque(View view);

        void postInvalidateOnAnimation(View view);

        void postInvalidateOnAnimation(View view, int i, int i2, int i3, int i4);

        void postOnAnimation(View view, Runnable runnable);

        void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilityDelegateCompat);

        void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean z);

        void setElevation(View view, float f);

        void setImportantForAccessibility(View view, int i);

        void setLayerPaint(View view, Paint paint);

        void setLayerType(View view, int i, Paint paint);

        void setScaleX(View view, float f);

        void setScaleY(View view, float f);
    }

    class BaseViewCompatImpl implements ViewCompatImpl {
        WeakHashMap mViewPropertyAnimatorCompatMap;

        public void setScaleY(View view, float f) {
        }

        public void setElevation(View view, float f) {
        }

        public int getLayoutDirection(View view) {
            return 0;
        }

        public ViewParent getParentForAccessibility(View view) {
            return view.getParent();
        }

        public boolean isOpaque(View view) {
            Drawable background = view.getBackground();
            return background != null && background.getOpacity() == -1;
        }

        public int getLayerType(View view) {
            return 0;
        }

        public void postInvalidateOnAnimation(View view, int i, int i2, int i3, int i4) {
            view.invalidate(i, i2, i3, i4);
        }

        public void postInvalidateOnAnimation(View view) {
            view.invalidate();
        }

        public void setLayerPaint(View view, Paint paint) {
        }

        public void setLayerType(View view, int i, Paint paint) {
        }

        public void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        }

        public void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean z) {
        }

        BaseViewCompatImpl() {
            this.mViewPropertyAnimatorCompatMap = null;
        }

        long getFrameTime() {
            return 10;
        }

        public int getOverScrollMode(View view) {
            return 2;
        }

        public boolean getFitsSystemWindows(View view) {
            return false;
        }

        public boolean canScrollVertically(View view, int i) {
            return false;
        }

        public int getImportantForAccessibility(View view) {
            return 0;
        }

        public boolean canScrollHorizontally(View view, int i) {
            return false;
        }

        public void setImportantForAccessibility(View view, int i) {
        }

        public float getScaleX(View view) {
            return 0.0f;
        }

        public void setScaleX(View view, float f) {
        }

        public void postOnAnimation(View view, Runnable runnable) {
            view.postDelayed(runnable, getFrameTime());
        }
    }

    class EclairMr1ViewCompatImpl extends BaseViewCompatImpl {
        public boolean isOpaque(View view) {
            return ViewCompatEclairMr1.isOpaque(view);
        }

        EclairMr1ViewCompatImpl() {
        }

        public void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean z) {
            ViewCompatEclairMr1.setChildrenDrawingOrderEnabled(viewGroup, z);
        }
    }

    class GBViewCompatImpl extends EclairMr1ViewCompatImpl {
        public int getOverScrollMode(View view) {
            return ViewCompatGingerbread.getOverScrollMode(view);
        }

        GBViewCompatImpl() {
        }
    }

    class HCViewCompatImpl extends GBViewCompatImpl {
        long getFrameTime() {
            return ViewCompatHC.getFrameTime();
        }

        public float getScaleX(View view) {
            return ViewCompatHC.getScaleX(view);
        }

        public void setLayerPaint(View view, Paint paint) {
            setLayerType(view, getLayerType(view), paint);
            view.invalidate();
        }

        public void setLayerType(View view, int i, Paint paint) {
            ViewCompatHC.setLayerType(view, i, paint);
        }

        HCViewCompatImpl() {
        }

        public void setScaleY(View view, float f) {
            ViewCompatHC.setScaleY(view, f);
        }

        public void setScaleX(View view, float f) {
            ViewCompatHC.setScaleX(view, f);
        }

        public int getLayerType(View view) {
            return ViewCompatHC.getLayerType(view);
        }
    }

    class ICSViewCompatImpl extends HCViewCompatImpl {
        static boolean accessibilityDelegateCheckFailed;

        static {
            accessibilityDelegateCheckFailed = false;
        }

        public boolean canScrollHorizontally(View view, int i) {
            return ViewCompatICS.canScrollHorizontally(view, i);
        }

        public void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
            ViewCompatICS.setAccessibilityDelegate(view, accessibilityDelegateCompat.getBridge());
        }

        ICSViewCompatImpl() {
        }

        public boolean canScrollVertically(View view, int i) {
            return ViewCompatICS.canScrollVertically(view, i);
        }
    }

    class JBViewCompatImpl extends ICSViewCompatImpl {
        public ViewParent getParentForAccessibility(View view) {
            return ViewCompatJB.getParentForAccessibility(view);
        }

        public void setImportantForAccessibility(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            ViewCompatJB.setImportantForAccessibility(view, i);
        }

        public void postOnAnimation(View view, Runnable runnable) {
            ViewCompatJB.postOnAnimation(view, runnable);
        }

        public void postInvalidateOnAnimation(View view) {
            ViewCompatJB.postInvalidateOnAnimation(view);
        }

        public boolean getFitsSystemWindows(View view) {
            return ViewCompatJB.getFitsSystemWindows(view);
        }

        JBViewCompatImpl() {
        }

        public int getImportantForAccessibility(View view) {
            return ViewCompatJB.getImportantForAccessibility(view);
        }

        public void postInvalidateOnAnimation(View view, int i, int i2, int i3, int i4) {
            ViewCompatJB.postInvalidateOnAnimation(view, i, i2, i3, i4);
        }
    }

    class JbMr1ViewCompatImpl extends JBViewCompatImpl {
        public int getLayoutDirection(View view) {
            return ViewCompatJellybeanMr1.getLayoutDirection(view);
        }

        JbMr1ViewCompatImpl() {
        }

        public void setLayerPaint(View view, Paint paint) {
            ViewCompatJellybeanMr1.setLayerPaint(view, paint);
        }
    }

    class KitKatViewCompatImpl extends JbMr1ViewCompatImpl {
        public void setImportantForAccessibility(View view, int i) {
            ViewCompatJB.setImportantForAccessibility(view, i);
        }

        KitKatViewCompatImpl() {
        }
    }

    class Api21ViewCompatImpl extends KitKatViewCompatImpl {
        Api21ViewCompatImpl() {
        }

        public void setElevation(View view, float f) {
            ViewCompatApi21.setElevation(view, f);
        }
    }

    public static int getOverScrollMode(View view) {
        return IMPL.getOverScrollMode(view);
    }

    public static void setScaleY(View view, float f) {
        IMPL.setScaleY(view, f);
    }

    public static void postInvalidateOnAnimation(View view) {
        IMPL.postInvalidateOnAnimation(view);
    }

    public static int getLayoutDirection(View view) {
        return IMPL.getLayoutDirection(view);
    }

    public static void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean z) {
        IMPL.setChildrenDrawingOrderEnabled(viewGroup, z);
    }

    public static void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        IMPL.setAccessibilityDelegate(view, accessibilityDelegateCompat);
    }

    public static void setScaleX(View view, float f) {
        IMPL.setScaleX(view, f);
    }

    public static void setImportantForAccessibility(View view, int i) {
        IMPL.setImportantForAccessibility(view, i);
    }

    public static void setLayerPaint(View view, Paint paint) {
        IMPL.setLayerPaint(view, paint);
    }

    public static boolean getFitsSystemWindows(View view) {
        return IMPL.getFitsSystemWindows(view);
    }

    public static ViewParent getParentForAccessibility(View view) {
        return IMPL.getParentForAccessibility(view);
    }

    public static void postInvalidateOnAnimation(View view, int i, int i2, int i3, int i4) {
        IMPL.postInvalidateOnAnimation(view, i, i2, i3, i4);
    }

    public static boolean canScrollHorizontally(View view, int i) {
        return IMPL.canScrollHorizontally(view, i);
    }

    public static void postOnAnimation(View view, Runnable runnable) {
        IMPL.postOnAnimation(view, runnable);
    }

    public static boolean isOpaque(View view) {
        return IMPL.isOpaque(view);
    }

    public static void setElevation(View view, float f) {
        IMPL.setElevation(view, f);
    }

    public static int getLayerType(View view) {
        return IMPL.getLayerType(view);
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            IMPL = new Api21ViewCompatImpl();
        } else if (i >= 19) {
            IMPL = new KitKatViewCompatImpl();
        } else if (i >= 17) {
            IMPL = new JbMr1ViewCompatImpl();
        } else if (i >= 16) {
            IMPL = new JBViewCompatImpl();
        } else if (i >= 14) {
            IMPL = new ICSViewCompatImpl();
        } else if (i >= 11) {
            IMPL = new HCViewCompatImpl();
        } else if (i >= 9) {
            IMPL = new GBViewCompatImpl();
        } else if (i >= 7) {
            IMPL = new EclairMr1ViewCompatImpl();
        } else {
            IMPL = new BaseViewCompatImpl();
        }
    }

    public static void setLayerType(View view, int i, Paint paint) {
        IMPL.setLayerType(view, i, paint);
    }

    public static boolean canScrollVertically(View view, int i) {
        return IMPL.canScrollVertically(view, i);
    }

    public static int getImportantForAccessibility(View view) {
        return IMPL.getImportantForAccessibility(view);
    }

    public static float getScaleX(View view) {
        return IMPL.getScaleX(view);
    }
}
