package com.whatsapp.fieldstats;

import android.content.Context;

public final class f extends c {
    public Double a;
    public Double b;
    public Double c;
    public String d;
    public Double e;

    void updateFields(Context context) {
        al.a(context, y.EVENT, Integer.valueOf(ar.E2E_MESSAGE_RECV.getCode()));
        al.a(context, y.E2E_SUCCESSFUL, this.e);
        al.a(context, y.E2E_FAILURE_REASON, this.a);
        al.a(context, y.RETRY_COUNT, this.c);
        al.a(context, y.MESSAGE_IS_SELF_SEND, this.b);
        al.a(context, y.MESSAGE_ORIGINATING_APPLICATION_VERSION, this.d);
        al.a(context, y.EVENT);
    }
}
