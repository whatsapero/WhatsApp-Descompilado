package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class br implements Creator {
    br() {
    }

    public n a(Parcel parcel) {
        return new n(parcel);
    }

    public n[] a(int i) {
        return new n[i];
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}
