package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class at implements Creator {
    public Object[] newArray(int i) {
        return a(i);
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    at() {
    }

    public b0 a(Parcel parcel) {
        return new b0(parcel, null);
    }

    public b0[] a(int i) {
        return new b0[i];
    }
}
