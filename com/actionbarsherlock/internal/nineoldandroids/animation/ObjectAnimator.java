package com.actionbarsherlock.internal.nineoldandroids.animation;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class ObjectAnimator extends ValueAnimator {
    private static final String[] z;
    private String mPropertyName;
    private Object mTarget;

    static {
        String[] strArr = new String[3];
        String str = "wW\u001bif<\u0012\u001b(";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 91;
                        break;
                    case ay.f /*1*/:
                        i3 = 119;
                        break;
                    case ay.n /*2*/:
                        i3 = 111;
                        break;
                    case ay.p /*3*/:
                        i3 = 8;
                        break;
                    default:
                        i3 = 20;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u0014\u0015\u0005mw/6\u0001ay:\u0003\u0000zT";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "QWO(4";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private ObjectAnimator(Object obj, String str) {
        this.mTarget = obj;
        setPropertyName(str);
    }

    public void start() {
        super.start();
    }

    public ObjectAnimator setDuration(long j) {
        super.setDuration(j);
        return this;
    }

    public Object clone() {
        return clone();
    }

    public void setFloatValues(float[] fArr) {
        if (this.mValues == null || this.mValues.length == 0) {
            setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(this.mPropertyName, fArr)});
            if (!Animator.a) {
                return;
            }
        }
        super.setFloatValues(fArr);
    }

    public ObjectAnimator clone() {
        return (ObjectAnimator) super.clone();
    }

    public static ObjectAnimator ofFloat(Object obj, String str, float[] fArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator(obj, str);
        objectAnimator.setFloatValues(fArr);
        return objectAnimator;
    }

    public ValueAnimator setDuration(long j) {
        return setDuration(j);
    }

    public void setPropertyName(String str) {
        if (this.mValues != null) {
            PropertyValuesHolder propertyValuesHolder = this.mValues[0];
            String propertyName = propertyValuesHolder.getPropertyName();
            propertyValuesHolder.setPropertyName(str);
            this.mValuesMap.remove(propertyName);
            this.mValuesMap.put(str, propertyValuesHolder);
        }
        this.mPropertyName = str;
        this.mInitialized = false;
    }

    void animateValue(float f) {
        boolean z = Animator.a;
        super.animateValue(f);
        int length = this.mValues.length;
        int i = 0;
        while (i < length) {
            this.mValues[i].setAnimatedValue(this.mTarget);
            i++;
            if (z) {
                return;
            }
        }
    }

    public ValueAnimator clone() {
        return clone();
    }

    public Animator clone() {
        return clone();
    }

    void initAnimation() {
        boolean z = Animator.a;
        if (!this.mInitialized) {
            int length = this.mValues.length;
            int i = 0;
            while (i < length) {
                this.mValues[i].setupSetterAndGetter(this.mTarget);
                i++;
                if (z) {
                    break;
                }
            }
            super.initAnimation();
        }
    }

    public String toString() {
        int i = 0;
        boolean z = Animator.a;
        String str = z[2] + Integer.toHexString(hashCode()) + z[0] + this.mTarget;
        if (this.mValues != null) {
            while (i < this.mValues.length) {
                str = str + z[1] + this.mValues[i].toString();
                i++;
                if (z) {
                    break;
                }
            }
        }
        return str;
    }
}
