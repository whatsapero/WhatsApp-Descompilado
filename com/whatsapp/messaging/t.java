package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class t implements Creator {
    public Object[] newArray(int i) {
        return a(i);
    }

    public b1 a(Parcel parcel) {
        return new b1(parcel, null);
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public b1[] a(int i) {
        return new b1[i];
    }

    t() {
    }
}
