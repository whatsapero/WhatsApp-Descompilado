package com.whatsapp;

import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.SpannableString;

final class sr extends Factory {
    public Spannable newSpannable(CharSequence charSequence) {
        return new al5(new SpannableString(charSequence));
    }

    sr() {
    }
}
