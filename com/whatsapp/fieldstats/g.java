package com.whatsapp.fieldstats;

import android.content.Context;

public final class g extends c {
    public Double a;
    public Double b;
    public Double c;
    public Double d;

    void updateFields(Context context) {
        al.a(context, y.EVENT, Integer.valueOf(ar.E2E_MESSAGE_SEND.getCode()));
        al.a(context, y.E2E_SUCCESSFUL, this.d);
        al.a(context, y.E2E_FAILURE_REASON, this.a);
        al.a(context, y.RETRY_COUNT, this.b);
        al.a(context, y.MESSAGE_IS_SELF_SEND, this.c);
        al.a(context, y.EVENT);
    }
}
