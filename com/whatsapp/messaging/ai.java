package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ai implements Creator {
    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public b a(Parcel parcel) {
        return new b(parcel, null);
    }

    public b[] a(int i) {
        return new b[i];
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    ai() {
    }
}
