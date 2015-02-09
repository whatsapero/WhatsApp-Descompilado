package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class KeyframeSet {
    private static final String z;
    TypeEvaluator mEvaluator;
    Keyframe mFirstKeyframe;
    Interpolator mInterpolator;
    ArrayList mKeyframes;
    Keyframe mLastKeyframe;
    int mNumKeyframes;

    static {
        char[] toCharArray = "JX".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 106;
                    break;
                case ay.f /*1*/:
                    i2 = 120;
                    break;
                case ay.n /*2*/:
                    i2 = 2;
                    break;
                case ay.p /*3*/:
                    i2 = 98;
                    break;
                default:
                    i2 = 90;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.actionbarsherlock.internal.nineoldandroids.animation.KeyframeSet ofFloat(float[] r8) {
        /*
        r7 = 0;
        r1 = 1;
        r6 = 0;
        r2 = com.actionbarsherlock.internal.nineoldandroids.animation.Animator.a;
        r3 = r8.length;
        r0 = 2;
        r0 = java.lang.Math.max(r3, r0);
        r4 = new com.actionbarsherlock.internal.nineoldandroids.animation.Keyframe.FloatKeyframe[r0];
        if (r3 != r1) goto L_0x0025;
    L_0x000f:
        r0 = com.actionbarsherlock.internal.nineoldandroids.animation.Keyframe.ofFloat(r7);
        r0 = (com.actionbarsherlock.internal.nineoldandroids.animation.Keyframe.FloatKeyframe) r0;
        r4[r6] = r0;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = r8[r6];
        r0 = com.actionbarsherlock.internal.nineoldandroids.animation.Keyframe.ofFloat(r0, r5);
        r0 = (com.actionbarsherlock.internal.nineoldandroids.animation.Keyframe.FloatKeyframe) r0;
        r4[r1] = r0;
        if (r2 == 0) goto L_0x0044;
    L_0x0025:
        r0 = r8[r6];
        r0 = com.actionbarsherlock.internal.nineoldandroids.animation.Keyframe.ofFloat(r7, r0);
        r0 = (com.actionbarsherlock.internal.nineoldandroids.animation.Keyframe.FloatKeyframe) r0;
        r4[r6] = r0;
    L_0x002f:
        if (r1 >= r3) goto L_0x0044;
    L_0x0031:
        r0 = (float) r1;
        r5 = r3 + -1;
        r5 = (float) r5;
        r0 = r0 / r5;
        r5 = r8[r1];
        r0 = com.actionbarsherlock.internal.nineoldandroids.animation.Keyframe.ofFloat(r0, r5);
        r0 = (com.actionbarsherlock.internal.nineoldandroids.animation.Keyframe.FloatKeyframe) r0;
        r4[r1] = r0;
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x004a;
    L_0x0044:
        r0 = new com.actionbarsherlock.internal.nineoldandroids.animation.FloatKeyframeSet;
        r0.<init>(r4);
        return r0;
    L_0x004a:
        r1 = r0;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.nineoldandroids.animation.KeyframeSet.ofFloat(float[]):com.actionbarsherlock.internal.nineoldandroids.animation.KeyframeSet");
    }

    public KeyframeSet(Keyframe[] keyframeArr) {
        this.mNumKeyframes = keyframeArr.length;
        this.mKeyframes = new ArrayList();
        this.mKeyframes.addAll(Arrays.asList(keyframeArr));
        this.mFirstKeyframe = (Keyframe) this.mKeyframes.get(0);
        this.mLastKeyframe = (Keyframe) this.mKeyframes.get(this.mNumKeyframes - 1);
        this.mInterpolator = this.mLastKeyframe.getInterpolator();
    }

    public KeyframeSet clone() {
        boolean z = Animator.a;
        ArrayList arrayList = this.mKeyframes;
        int size = this.mKeyframes.size();
        Keyframe[] keyframeArr = new Keyframe[size];
        int i = 0;
        while (i < size) {
            keyframeArr[i] = ((Keyframe) arrayList.get(i)).clone();
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return new KeyframeSet(keyframeArr);
    }

    public Object getValue(float f) {
        boolean z = Animator.a;
        if (this.mNumKeyframes == 2) {
            if (this.mInterpolator != null) {
                f = this.mInterpolator.getInterpolation(f);
            }
            return this.mEvaluator.evaluate(f, this.mFirstKeyframe.getValue(), this.mLastKeyframe.getValue());
        } else if (f <= 0.0f) {
            r0 = (Keyframe) this.mKeyframes.get(1);
            interpolator = r0.getInterpolator();
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            fraction = this.mFirstKeyframe.getFraction();
            return this.mEvaluator.evaluate((f - fraction) / (r0.getFraction() - fraction), this.mFirstKeyframe.getValue(), r0.getValue());
        } else if (f >= 1.0f) {
            r0 = (Keyframe) this.mKeyframes.get(this.mNumKeyframes - 2);
            interpolator = this.mLastKeyframe.getInterpolator();
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            fraction = r0.getFraction();
            return this.mEvaluator.evaluate((f - fraction) / (this.mLastKeyframe.getFraction() - fraction), r0.getValue(), this.mLastKeyframe.getValue());
        } else {
            Keyframe keyframe = this.mFirstKeyframe;
            int i = 1;
            while (i < this.mNumKeyframes) {
                r0 = (Keyframe) this.mKeyframes.get(i);
                if (f < r0.getFraction()) {
                    interpolator = r0.getInterpolator();
                    if (interpolator != null) {
                        f = interpolator.getInterpolation(f);
                    }
                    fraction = keyframe.getFraction();
                    return this.mEvaluator.evaluate((f - fraction) / (r0.getFraction() - fraction), keyframe.getValue(), r0.getValue());
                }
                i++;
                if (z) {
                    break;
                }
                keyframe = r0;
            }
            return this.mLastKeyframe.getValue();
        }
    }

    public void setEvaluator(TypeEvaluator typeEvaluator) {
        this.mEvaluator = typeEvaluator;
    }

    public Object clone() {
        return clone();
    }

    public String toString() {
        boolean z = Animator.a;
        String str = " ";
        int i = 0;
        while (i < this.mNumKeyframes) {
            String str2 = str + ((Keyframe) this.mKeyframes.get(i)).getValue() + z;
            int i2 = i + 1;
            if (z) {
                return str2;
            }
            i = i2;
            str = str2;
        }
        return str;
    }
}
