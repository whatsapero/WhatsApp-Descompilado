package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bk implements Creator {
    public Object[] newArray(int i) {
        return a(i);
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public am[] a(int i) {
        return new am[i];
    }

    public am a(Parcel parcel) {
        return new am(parcel, null);
    }

    bk() {
    }
}
