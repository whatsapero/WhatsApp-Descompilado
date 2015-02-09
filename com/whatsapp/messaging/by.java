package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.bj;

final class by implements Parcelable {
    public static final Creator CREATOR;
    private final bj a;

    private by(Parcel parcel) {
        this.a = new bj();
        this.a.a = parcel.readString();
        this.a.c = parcel.readString();
        this.a.b = parcel.readString();
        this.a.e = parcel.readString();
        this.a.d = parcel.readString();
    }

    public by(bj bjVar) {
        this.a = bjVar;
    }

    public bj a() {
        return this.a;
    }

    by(Parcel parcel, b5 b5Var) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    static {
        CREATOR = new b5();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.a);
        parcel.writeString(this.a.c);
        parcel.writeString(this.a.b);
        parcel.writeString(this.a.e);
        parcel.writeString(this.a.d);
    }
}
