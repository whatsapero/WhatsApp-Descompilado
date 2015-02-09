package com.whatsapp.fieldstats;

import android.content.Context;

public final class k extends c {
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;

    void updateFields(Context context) {
        al.a(context, y.EVENT, Integer.valueOf(ar.MEDIA_DOWNLOAD.getCode()));
        al.a(context, y.MEDIA_TYPE, this.c);
        al.a(context, y.MEDIA_DOWNLOAD_RESULT, this.e);
        al.a(context, y.RETRY_COUNT, this.b);
        if (this.d != null) {
            al.a(context, b.MEDIA_DOWNLOAD_T, this.d);
        }
        if (this.a != null) {
            al.a(context, b.MEDIA_SIZE, this.a);
        }
        al.a(context, y.EVENT);
    }
}
