package com.whatsapp;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class d implements Creator {
    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public w4[] a(int i) {
        return new w4[i];
    }

    public w4 a(Parcel parcel) {
        return new w4(parcel);
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    d() {
    }
}
