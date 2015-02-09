package com.whatsapp.util;

import android.os.Build.VERSION;
import android.text.SpannableString;
import android.view.Display;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class a7 {
    public static void a(CharSequence charSequence, View view, TextView textView, Display display) {
        if (VERSION.SDK_INT >= 8) {
            view.measure(display.getWidth(), display.getHeight());
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            measuredHeight = Math.round(((float) measuredHeight) / textView.getPaint().getFontSpacing());
            CharSequence spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new aj(measuredHeight, measuredWidth, view), 0, spannableString.length(), 33);
            textView.setText(spannableString);
            int[] rules = ((LayoutParams) textView.getLayoutParams()).getRules();
            rules[1] = 0;
            rules[0] = 0;
        }
    }
}
