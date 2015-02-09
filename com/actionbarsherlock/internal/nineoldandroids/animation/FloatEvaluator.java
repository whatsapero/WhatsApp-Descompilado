package com.actionbarsherlock.internal.nineoldandroids.animation;

public class FloatEvaluator implements TypeEvaluator {
    public Float evaluate(float f, Number number, Number number2) {
        float floatValue = number.floatValue();
        return Float.valueOf(floatValue + ((number2.floatValue() - floatValue) * f));
    }

    public Object evaluate(float f, Object obj, Object obj2) {
        return evaluate(f, (Number) obj, (Number) obj2);
    }
}
