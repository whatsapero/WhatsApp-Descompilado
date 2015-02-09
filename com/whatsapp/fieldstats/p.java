package com.whatsapp.fieldstats;

import android.content.Context;

public final class p extends c {
    public Double a;
    public Double b;

    void updateFields(Context context) {
        al.a(context, y.EVENT, Integer.valueOf(ar.PTT.getCode()));
        al.a(context, y.PTT_RESULT, this.a);
        if (this.b != null) {
            al.a(context, b.PTT_SIZE, this.b);
        }
        al.a(context, y.EVENT);
    }
}
