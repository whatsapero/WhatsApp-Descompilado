package com.whatsapp;

import android.text.SpannableStringBuilder;

public final class uj extends SpannableStringBuilder {
    public uj(CharSequence charSequence) {
        super(charSequence);
    }

    public void getChars(int i, int i2, char[] cArr, int i3) {
        if (i2 >= i) {
            int length = length();
            if (i <= length && i2 <= length && i >= 0 && i2 >= 0) {
                super.getChars(i, i2, cArr, i3);
            }
        }
    }

    public char charAt(int i) {
        return (i >= 0 && i < length()) ? super.charAt(i) : ' ';
    }
}
