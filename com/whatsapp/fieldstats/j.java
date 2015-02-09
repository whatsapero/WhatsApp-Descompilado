package com.whatsapp.fieldstats;

import android.content.Context;

public final class j extends c {
    public Double a;
    public Double b;
    public Double c;

    void updateFields(Context context) {
        al.a(context, y.EVENT, Integer.valueOf(ar.LOGIN.getCode()));
        al.a(context, y.LOGIN_RESULT, this.c);
        al.a(context, y.RETRY_COUNT, this.a);
        if (this.b != null) {
            al.a(context, b.LOGIN_T, this.b);
        }
        al.a(context, y.EVENT);
    }
}
