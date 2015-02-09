package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class b5 implements Creator {
    b5() {
    }

    public by a(Parcel parcel) {
        return new by(parcel, null);
    }

    public by[] a(int i) {
        return new by[i];
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}
