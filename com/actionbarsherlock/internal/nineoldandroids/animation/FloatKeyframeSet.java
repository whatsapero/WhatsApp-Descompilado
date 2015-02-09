package com.actionbarsherlock.internal.nineoldandroids.animation;

import java.util.ArrayList;

class FloatKeyframeSet extends KeyframeSet {
    private float deltaValue;
    private boolean firstTime;
    private float firstValue;
    private float lastValue;

    public FloatKeyframeSet(FloatKeyframe[] floatKeyframeArr) {
        super(floatKeyframeArr);
        this.firstTime = true;
    }

    public float getFloatValue(float f) {
        int i = 1;
        boolean z = Animator.a;
        if (this.mNumKeyframes == 2) {
            if (this.firstTime) {
                this.firstTime = false;
                this.firstValue = ((FloatKeyframe) this.mKeyframes.get(0)).getFloatValue();
                this.lastValue = ((FloatKeyframe) this.mKeyframes.get(1)).getFloatValue();
                this.deltaValue = this.lastValue - this.firstValue;
            }
            if (this.mInterpolator != null) {
                f = this.mInterpolator.getInterpolation(f);
            }
            return this.mEvaluator == null ? this.firstValue + (this.deltaValue * f) : ((Number) this.mEvaluator.evaluate(f, Float.valueOf(this.firstValue), Float.valueOf(this.lastValue))).floatValue();
        } else if (f <= 0.0f) {
            r0 = (FloatKeyframe) this.mKeyframes.get(0);
            r1 = (FloatKeyframe) this.mKeyframes.get(1);
            floatValue = r0.getFloatValue();
            floatValue = r1.getFloatValue();
            fraction = r0.getFraction();
            fraction = r1.getFraction();
            interpolator = r1.getInterpolator();
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            fraction = (f - fraction) / (fraction - fraction);
            return this.mEvaluator == null ? (fraction * (floatValue - floatValue)) + floatValue : ((Number) this.mEvaluator.evaluate(fraction, Float.valueOf(floatValue), Float.valueOf(floatValue))).floatValue();
        } else if (f >= 1.0f) {
            r0 = (FloatKeyframe) this.mKeyframes.get(this.mNumKeyframes - 2);
            r1 = (FloatKeyframe) this.mKeyframes.get(this.mNumKeyframes - 1);
            floatValue = r0.getFloatValue();
            floatValue = r1.getFloatValue();
            fraction = r0.getFraction();
            fraction = r1.getFraction();
            interpolator = r1.getInterpolator();
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            fraction = (f - fraction) / (fraction - fraction);
            return this.mEvaluator == null ? (fraction * (floatValue - floatValue)) + floatValue : ((Number) this.mEvaluator.evaluate(fraction, Float.valueOf(floatValue), Float.valueOf(floatValue))).floatValue();
        } else {
            FloatKeyframe floatKeyframe = (FloatKeyframe) this.mKeyframes.get(0);
            while (i < this.mNumKeyframes) {
                r0 = (FloatKeyframe) this.mKeyframes.get(i);
                if (f < r0.getFraction()) {
                    interpolator = r0.getInterpolator();
                    if (interpolator != null) {
                        f = interpolator.getInterpolation(f);
                    }
                    float fraction = (f - floatKeyframe.getFraction()) / (r0.getFraction() - floatKeyframe.getFraction());
                    floatValue = floatKeyframe.getFloatValue();
                    fraction = r0.getFloatValue();
                    return this.mEvaluator == null ? ((fraction - floatValue) * fraction) + floatValue : ((Number) this.mEvaluator.evaluate(fraction, Float.valueOf(floatValue), Float.valueOf(fraction))).floatValue();
                } else {
                    i++;
                    if (z) {
                        break;
                    }
                    floatKeyframe = r0;
                }
            }
            return ((Number) ((Keyframe) this.mKeyframes.get(this.mNumKeyframes - 1)).getValue()).floatValue();
        }
    }

    public KeyframeSet clone() {
        return clone();
    }

    public Object clone() {
        return clone();
    }

    public FloatKeyframeSet clone() {
        boolean z = Animator.a;
        ArrayList arrayList = this.mKeyframes;
        int size = this.mKeyframes.size();
        FloatKeyframe[] floatKeyframeArr = new FloatKeyframe[size];
        int i = 0;
        while (i < size) {
            floatKeyframeArr[i] = (FloatKeyframe) ((Keyframe) arrayList.get(i)).clone();
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return new FloatKeyframeSet(floatKeyframeArr);
    }

    public Object getValue(float f) {
        return Float.valueOf(getFloatValue(f));
    }
}
