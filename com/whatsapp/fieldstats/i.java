package com.whatsapp.fieldstats;

import android.content.Context;

public final class i extends c {
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;
    public Double h;

    void updateFields(Context context) {
        al.a(context, y.EVENT, Integer.valueOf(ar.LOCATION_PICKER.getCode()));
        al.a(context, y.LOCATION_PICKER_PLACES_SOURCE, this.e);
        al.a(context, y.LOCATION_PICKER_RESULT_TYPE, this.b);
        al.a(context, y.LOCATION_PICKER_PLACES_RESPONSE, this.c);
        al.a(context, y.LOCATION_PICKER_OUT_OF_QUOTA, this.g);
        al.a(context, y.LOCATION_PICKER_FULL_SCREEN, this.f);
        if (this.d != null) {
            al.a(context, b.LOCATION_PICKER_PLACES_COUNT, this.d);
        }
        if (this.a != null) {
            al.a(context, b.LOCATION_PICKER_SELECTED_PLACE_INDEX, this.a);
        }
        if (this.h != null) {
            al.a(context, b.LOCATION_PICKER_SPEND_T, this.h);
        }
        al.a(context, y.EVENT);
    }
}
