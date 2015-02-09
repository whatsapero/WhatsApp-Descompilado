package com.whatsapp;

import android.text.InputFilter;
import android.text.Spanned;

public final class alk implements InputFilter {
    private final int a;

    public alk(int i) {
        this.a = i;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String toString = spanned.toString();
        int codePointCount = toString.codePointCount(0, toString.length());
        int codePointCount2 = toString.codePointCount(i3, i4);
        int codePointCount3 = charSequence.toString().codePointCount(i, i2);
        codePointCount2 += this.a - codePointCount;
        if (codePointCount2 <= 0) {
            return "";
        }
        if (codePointCount2 >= codePointCount3) {
            return null;
        }
        codePointCount2 += i;
        if (Character.isHighSurrogate(charSequence.charAt(codePointCount2 - 1))) {
            codePointCount2--;
            if (codePointCount2 == i) {
                return "";
            }
        }
        return charSequence.subSequence(i, codePointCount2);
    }
}
