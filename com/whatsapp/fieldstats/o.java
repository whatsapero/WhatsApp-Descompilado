package com.whatsapp.fieldstats;

import android.content.Context;

public final class o extends c {
    public Double a;
    public Double b;
    public Double c;
    public Double d;

    void updateFields(Context context) {
        al.a(context, y.EVENT, Integer.valueOf(ar.PROFILE_PIC_UPLOAD.getCode()));
        al.a(context, y.PROFILE_PIC_UPLOAD_RESULT, this.c);
        al.a(context, y.RETRY_COUNT, this.d);
        if (this.b != null) {
            al.a(context, b.PROFILE_PIC_UPLOAD_T, this.b);
        }
        if (this.a != null) {
            al.a(context, b.PROFILE_PIC_SIZE, this.a);
        }
        al.a(context, y.EVENT);
    }
}
