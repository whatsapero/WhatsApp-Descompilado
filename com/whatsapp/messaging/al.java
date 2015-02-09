package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.Encode;

final class al implements Parcelable {
    public static final Creator CREATOR;
    private final Encode a;

    public int describeContents() {
        return 0;
    }

    al(Encode encode, bk bkVar) {
        this(encode);
    }

    private al(Encode encode) {
        this.a = encode;
    }

    public Encode a() {
        return this.a;
    }

    al(Parcel parcel, bk bkVar) {
        this(parcel);
    }

    private al(Parcel parcel) {
        this.a = new Encode((Short) parcel.readValue(Short.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a.complexity);
        parcel.writeValue(this.a.enableConstantBitrate);
        parcel.writeValue(this.a.enableDiscontinuousTransmission);
        parcel.writeValue(this.a.targetBitrate);
        parcel.writeValue(this.a.forwardErrorCorrection);
    }

    static {
        CREATOR = new z();
    }
}
