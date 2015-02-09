package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class l implements Creator {
    l() {
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    public ab[] a(int i) {
        return new ab[i];
    }

    public ab a(Parcel parcel) {
        return new ab(parcel, null);
    }
}
