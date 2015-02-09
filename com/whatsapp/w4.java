package com.whatsapp;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.m;

public class w4 implements Parcelable {
    public static final Creator CREATOR;
    m a;

    static {
        CREATOR = new d();
    }

    public w4(m mVar) {
        this.a = mVar;
    }

    public w4(Parcel parcel) {
        boolean z = true;
        String readString = parcel.readString();
        if (parcel.readByte() != (byte) 1) {
            z = false;
        }
        this.a = new m(readString, z, parcel.readString());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.c);
        parcel.writeByte((byte) (this.a.b ? 1 : 0));
        parcel.writeString(this.a.a);
    }
}
