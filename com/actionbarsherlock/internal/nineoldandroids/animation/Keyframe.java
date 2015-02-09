package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.view.animation.Interpolator;

public abstract class Keyframe implements Cloneable {
    float mFraction;
    boolean mHasValue;
    private Interpolator mInterpolator;
    Class mValueType;

    class FloatKeyframe extends Keyframe {
        float mValue;

        FloatKeyframe(float f, float f2) {
            this.mFraction = f;
            this.mValue = f2;
            this.mValueType = Float.TYPE;
            this.mHasValue = true;
        }

        public Object getValue() {
            return Float.valueOf(this.mValue);
        }

        public float getFloatValue() {
            return this.mValue;
        }

        public FloatKeyframe clone() {
            FloatKeyframe floatKeyframe = new FloatKeyframe(getFraction(), this.mValue);
            floatKeyframe.setInterpolator(getInterpolator());
            return floatKeyframe;
        }

        public Object clone() {
            return clone();
        }

        public void setValue(Object obj) {
            if (obj != null && obj.getClass() == Float.class) {
                this.mValue = ((Float) obj).floatValue();
                this.mHasValue = true;
            }
        }

        FloatKeyframe(float f) {
            this.mFraction = f;
            this.mValueType = Float.TYPE;
        }

        public Keyframe clone() {
            return clone();
        }
    }

    public static Keyframe ofFloat(float f, float f2) {
        return new FloatKeyframe(f, f2);
    }

    public abstract Keyframe clone();

    public abstract Object getValue();

    public abstract void setValue(Object obj);

    public static Keyframe ofFloat(float f) {
        return new FloatKeyframe(f);
    }

    public void setInterpolator(Interpolator interpolator) {
        this.mInterpolator = interpolator;
    }

    public boolean hasValue() {
        return this.mHasValue;
    }

    public float getFraction() {
        return this.mFraction;
    }

    public Keyframe() {
        this.mInterpolator = null;
        this.mHasValue = false;
    }

    public Object clone() {
        return clone();
    }

    public Interpolator getInterpolator() {
        return this.mInterpolator;
    }
}
