package com.whatsapp.contact;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.bh;

final class b implements Creator {
    public Object[] newArray(int i) {
        return a(i);
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public d[] a(int i) {
        return new d[i];
    }

    public d a(Parcel parcel) {
        bh bhVar = new bh();
        bhVar.a = parcel.readString();
        bhVar.c = parcel.readString();
        bhVar.b = parcel.readInt();
        return new d(bhVar);
    }

    b() {
    }
}
