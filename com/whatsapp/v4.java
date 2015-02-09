package com.whatsapp;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class v4 implements Creator {
    v4() {
    }

    public di[] a(int i) {
        return new di[i];
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public di a(Parcel parcel) {
        return new di(parcel, null);
    }
}
