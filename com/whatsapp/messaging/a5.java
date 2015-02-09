package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.AudioRestrict;

final class a5 implements Parcelable {
    public static final Creator CREATOR;
    private final AudioRestrict a;

    public AudioRestrict a() {
        return this.a;
    }

    public int describeContents() {
        return 0;
    }

    private a5(AudioRestrict audioRestrict) {
        this.a = audioRestrict;
    }

    private a5(Parcel parcel) {
        this.a = new AudioRestrict(parcel.readString(), (Integer) parcel.readValue(Integer.class.getClassLoader()));
    }

    a5(Parcel parcel, bk bkVar) {
        this(parcel);
    }

    a5(AudioRestrict audioRestrict, bk bkVar) {
        this(audioRestrict);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.encoding);
        parcel.writeValue(this.a.rate);
    }

    static {
        CREATOR = new e();
    }
}
