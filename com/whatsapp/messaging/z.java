package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class z implements Creator {
    z() {
    }

    public al[] a(int i) {
        return new al[i];
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    public al a(Parcel parcel) {
        return new al(parcel, null);
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}
