package com.whatsapp.fieldstats;

import android.content.Context;

public final class q extends c {
    public Double a;
    public Double b;

    void updateFields(Context context) {
        al.a(context, y.EVENT, Integer.valueOf(ar.UI_USAGE.getCode()));
        al.a(context, y.UI_USAGE_TYPE, this.b);
        al.a(context, y.ENTRY_POINT, this.a);
        al.a(context, y.EVENT);
    }
}
