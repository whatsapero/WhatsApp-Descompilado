package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.Decode;

final class b implements Parcelable {
    public static final Creator CREATOR;
    private final Decode a;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a.gain);
        parcel.writeValue(this.a.forwardErrorCorrection);
    }

    public Decode a() {
        return this.a;
    }

    private b(Parcel parcel) {
        this.a = new Decode((Short) parcel.readValue(Short.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()));
    }

    b(Decode decode, bk bkVar) {
        this(decode);
    }

    static {
        CREATOR = new ai();
    }

    private b(Decode decode) {
        this.a = decode;
    }

    public int describeContents() {
        return 0;
    }

    b(Parcel parcel, bk bkVar) {
        this(parcel);
    }
}
