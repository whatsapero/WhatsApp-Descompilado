package com.whatsapp.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.am1;

final class as implements ax {
    as() {
    }

    public Drawable a(Drawable drawable, Context context) {
        drawable.setBounds(0, 0, (int) am1.a().b((float) drawable.getIntrinsicWidth()), (int) am1.a().b((float) drawable.getIntrinsicWidth()));
        return drawable;
    }
}
