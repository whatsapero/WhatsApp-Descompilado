package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class e implements Creator {
    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public a5[] a(int i) {
        return new a5[i];
    }

    e() {
    }

    public a5 a(Parcel parcel) {
        return new a5(parcel, null);
    }

    public Object[] newArray(int i) {
        return a(i);
    }
}
