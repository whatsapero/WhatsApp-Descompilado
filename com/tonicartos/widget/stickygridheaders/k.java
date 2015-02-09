package com.tonicartos.widget.stickygridheaders;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class k implements Creator {
    k() {
    }

    public o[] a(int i) {
        return new o[i];
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    public o a(Parcel parcel) {
        return new o(parcel, null);
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}
