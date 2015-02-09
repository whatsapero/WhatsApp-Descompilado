package com.whatsapp.fieldstats;

import android.content.Context;

public final class h extends c {
    public Double a;
    public Double b;

    void updateFields(Context context) {
        al.a(context, y.EVENT, Integer.valueOf(ar.GROUP_MUTE.getCode()));
        al.a(context, y.GROUP_SIZE, this.b);
        if (this.a != null) {
            al.a(context, b.GROUP_MUTE_T, this.a);
        }
        al.a(context, y.EVENT);
    }
}
