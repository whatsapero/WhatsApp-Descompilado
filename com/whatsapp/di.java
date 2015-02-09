package com.whatsapp;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class di extends BaseSavedState {
    public static final Creator CREATOR;
    int a;

    public di(Parcelable parcelable) {
        super(parcelable);
    }

    di(Parcel parcel, tt ttVar) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    static {
        CREATOR = new v4();
    }

    private di(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }
}
