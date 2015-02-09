package com.whatsapp.fieldstats;

import android.content.Context;

public final class n extends c {
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;
    public Double h;

    void updateFields(Context context) {
        al.a(context, y.EVENT, Integer.valueOf(ar.MESSAGE_SEND.getCode()));
        al.a(context, y.MESSAGE_SEND_RESULT, this.c);
        al.a(context, y.MESSAGE_TYPE, this.g);
        al.a(context, y.MESSAGE_MEDIA_TYPE, this.b);
        al.a(context, y.MESSAGE_IS_FORWARD, this.f);
        al.a(context, y.RETRY_COUNT, this.e);
        al.a(context, y.MESSAGE_IS_INTERNATIONAL, this.a);
        al.a(context, y.MEDIA_CAPTION_PRESENT, this.h);
        if (this.d != null) {
            al.a(context, b.MESSAGE_SEND_T, this.d);
        }
        al.a(context, y.EVENT);
    }
}
