package com.whatsapp.gallerypicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bv implements Creator {
    public p a(Parcel parcel) {
        return new p(parcel, null);
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    public p[] a(int i) {
        return new p[i];
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    bv() {
    }
}
