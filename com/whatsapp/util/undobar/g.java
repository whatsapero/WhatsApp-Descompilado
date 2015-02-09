package com.whatsapp.util.undobar;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class g implements Creator {
    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public c a(Parcel parcel) {
        return new c(parcel);
    }

    g() {
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    public c[] a(int i) {
        return new c[i];
    }
}
