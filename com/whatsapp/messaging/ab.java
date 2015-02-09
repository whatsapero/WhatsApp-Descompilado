package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.Aec;

final class ab implements Parcelable {
    public static final Creator CREATOR;
    private final Aec a;

    ab(Aec aec, bk bkVar) {
        this(aec);
    }

    private ab(Parcel parcel) {
        this.a = new Aec(parcel.readString(), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Short) parcel.readValue(Short.class.getClassLoader()));
    }

    public int describeContents() {
        return 0;
    }

    private ab(Aec aec) {
        this.a = aec;
    }

    public Aec a() {
        return this.a;
    }

    static {
        CREATOR = new l();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.algorithm);
        parcel.writeValue(this.a.offset);
        parcel.writeValue(this.a.length);
        parcel.writeValue(this.a.mode);
    }

    ab(Parcel parcel, bk bkVar) {
        this(parcel);
    }
}
