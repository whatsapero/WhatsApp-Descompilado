package com.actionbarsherlock.internal.nineoldandroids.animation;

public class IntEvaluator implements TypeEvaluator {
    public Object evaluate(float f, Object obj, Object obj2) {
        return evaluate(f, (Integer) obj, (Integer) obj2);
    }

    public Integer evaluate(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        return Integer.valueOf((int) ((((float) (num2.intValue() - intValue)) * f) + ((float) intValue)));
    }
}
