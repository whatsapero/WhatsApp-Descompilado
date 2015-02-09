package com.whatsapp.fieldstats;

import android.content.Context;

public final class l extends c {
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;

    void updateFields(Context context) {
        al.a(context, y.EVENT, Integer.valueOf(ar.MEDIA_UPLOAD.getCode()));
        al.a(context, y.MEDIA_TYPE, this.c);
        al.a(context, y.MEDIA_UPLOAD_RESULT, this.e);
        al.a(context, y.MESSAGE_IS_FORWARD, this.d);
        al.a(context, y.RETRY_COUNT, this.a);
        if (this.b != null) {
            al.a(context, b.MEDIA_UPLOAD_T, this.b);
        }
        if (this.f != null) {
            al.a(context, b.MEDIA_SIZE, this.f);
        }
        al.a(context, y.EVENT);
    }
}
