package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class f implements Creator {
    f() {
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public bn[] a(int i) {
        return new bn[i];
    }

    public bn a(Parcel parcel) {
        return new bn(parcel, null);
    }

    public Object[] newArray(int i) {
        return a(i);
    }
}
