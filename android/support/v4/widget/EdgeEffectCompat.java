package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

public class EdgeEffectCompat {
    private static final EdgeEffectImpl IMPL;
    private Object mEdgeEffect;

    interface EdgeEffectImpl {
        boolean draw(Object obj, Canvas canvas);

        void finish(Object obj);

        boolean isFinished(Object obj);

        Object newEdgeEffect(Context context);

        boolean onPull(Object obj, float f);

        boolean onRelease(Object obj);

        void setSize(Object obj, int i, int i2);
    }

    class BaseEdgeEffectImpl implements EdgeEffectImpl {
        BaseEdgeEffectImpl() {
        }

        public boolean onRelease(Object obj) {
            return false;
        }

        public void finish(Object obj) {
        }

        public boolean draw(Object obj, Canvas canvas) {
            return false;
        }

        public void setSize(Object obj, int i, int i2) {
        }

        public boolean isFinished(Object obj) {
            return true;
        }

        public boolean onPull(Object obj, float f) {
            return false;
        }

        public Object newEdgeEffect(Context context) {
            return null;
        }
    }

    class EdgeEffectIcsImpl implements EdgeEffectImpl {
        public boolean isFinished(Object obj) {
            return EdgeEffectCompatIcs.isFinished(obj);
        }

        public boolean onPull(Object obj, float f) {
            return EdgeEffectCompatIcs.onPull(obj, f);
        }

        EdgeEffectIcsImpl() {
        }

        public void setSize(Object obj, int i, int i2) {
            EdgeEffectCompatIcs.setSize(obj, i, i2);
        }

        public boolean draw(Object obj, Canvas canvas) {
            return EdgeEffectCompatIcs.draw(obj, canvas);
        }

        public boolean onRelease(Object obj) {
            return EdgeEffectCompatIcs.onRelease(obj);
        }

        public void finish(Object obj) {
            EdgeEffectCompatIcs.finish(obj);
        }

        public Object newEdgeEffect(Context context) {
            return EdgeEffectCompatIcs.newEdgeEffect(context);
        }
    }

    public void finish() {
        IMPL.finish(this.mEdgeEffect);
    }

    public void setSize(int i, int i2) {
        IMPL.setSize(this.mEdgeEffect, i, i2);
    }

    static {
        if (VERSION.SDK_INT >= 14) {
            IMPL = new EdgeEffectIcsImpl();
        } else {
            IMPL = new BaseEdgeEffectImpl();
        }
    }

    public boolean isFinished() {
        return IMPL.isFinished(this.mEdgeEffect);
    }

    public boolean onRelease() {
        return IMPL.onRelease(this.mEdgeEffect);
    }

    public EdgeEffectCompat(Context context) {
        this.mEdgeEffect = IMPL.newEdgeEffect(context);
    }

    public boolean onPull(float f) {
        return IMPL.onPull(this.mEdgeEffect, f);
    }

    public boolean draw(Canvas canvas) {
        return IMPL.draw(this.mEdgeEffect, canvas);
    }
}
