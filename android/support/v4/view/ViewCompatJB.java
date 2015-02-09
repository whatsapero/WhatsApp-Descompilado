package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class ViewCompatJB {
    public static void postOnAnimation(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void postInvalidateOnAnimation(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void postInvalidateOnAnimation(View view, int i, int i2, int i3, int i4) {
        view.postInvalidate(i, i2, i3, i4);
    }

    public static int getImportantForAccessibility(View view) {
        return view.getImportantForAccessibility();
    }

    public static boolean getFitsSystemWindows(View view) {
        return view.getFitsSystemWindows();
    }

    public static void setImportantForAccessibility(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static ViewParent getParentForAccessibility(View view) {
        return view.getParentForAccessibility();
    }
}
