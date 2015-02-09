package com.whatsapp.fieldstats;

import android.content.Context;

public final class d extends c {
    public Double a;
    public Double b;
    public Double c;
    public Double d;

    void updateFields(Context context) {
        al.a(context, y.EVENT, Integer.valueOf(ar.ADDRESSBOOK_SYNC.getCode()));
        al.a(context, y.ADDRESSBOOK_SYNC_IS_REG, this.c);
        al.a(context, y.ADDRESSBOOK_SYNC_ERROR_CODE, this.d);
        al.a(context, y.ADDRESSBOOK_SYNC_RESULT_TYPE, this.b);
        if (this.a != null) {
            al.a(context, b.ADDRESSBOOK_SYNC_T, this.a);
        }
        al.a(context, y.EVENT);
    }
}
