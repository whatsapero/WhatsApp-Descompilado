package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.Miscellaneous;

final class b1 implements Parcelable {
    public static final Creator CREATOR;
    private final Miscellaneous a;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a.enableComfortNoiseGeneration);
        parcel.writeValue(this.a.enableHighPassFiltering);
    }

    b1(Parcel parcel, bk bkVar) {
        this(parcel);
    }

    private b1(Parcel parcel) {
        this.a = new Miscellaneous((Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()));
    }

    private b1(Miscellaneous miscellaneous) {
        this.a = miscellaneous;
    }

    static {
        CREATOR = new t();
    }

    public int describeContents() {
        return 0;
    }

    b1(Miscellaneous miscellaneous, bk bkVar) {
        this(miscellaneous);
    }

    public Miscellaneous a() {
        return this.a;
    }
}
