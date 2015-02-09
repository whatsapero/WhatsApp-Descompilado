package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class ViewCompatHC {
    public static void setScaleY(View view, float f) {
        view.setScaleY(f);
    }

    static long getFrameTime() {
        return ValueAnimator.getFrameDelay();
    }

    public static void setLayerType(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    public static int getLayerType(View view) {
        return view.getLayerType();
    }

    public static void setScaleX(View view, float f) {
        view.setScaleX(f);
    }

    public static float getScaleX(View view) {
        return view.getScaleX();
    }
}
