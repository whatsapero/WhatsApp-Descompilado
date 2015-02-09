package com.whatsapp.fieldstats;

import android.content.Context;

public final class m extends c {
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;

    void updateFields(Context context) {
        al.a(context, y.EVENT, Integer.valueOf(ar.MESSAGE_RECEIVE.getCode()));
        al.a(context, y.MESSAGE_TYPE, this.b);
        al.a(context, y.MESSAGE_MEDIA_TYPE, this.f);
        al.a(context, y.NUM_OF_WEB_URLS_IN_TEXT_MESSAGE, this.a);
        al.a(context, y.MESSAGE_IS_INTERNATIONAL, this.g);
        al.a(context, y.MESSAGE_IS_OFFLINE, this.d);
        if (this.e != null) {
            al.a(context, b.MESSAGE_RECEIVE_T0, this.e);
        }
        if (this.c != null) {
            al.a(context, b.MESSAGE_RECEIVE_T1, this.c);
        }
        al.a(context, y.EVENT);
    }
}
