package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.Agc;

final class bn implements Parcelable {
    public static final Creator CREATOR;
    private final Agc a;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a.targetLevel);
        parcel.writeValue(this.a.compressionGain);
        parcel.writeValue(this.a.enableLimiter);
        parcel.writeValue(this.a.mode);
    }

    public int describeContents() {
        return 0;
    }

    private bn(Parcel parcel) {
        this.a = new Agc((Short) parcel.readValue(Short.class.getClassLoader()), (Short) parcel.readValue(Short.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Short) parcel.readValue(Short.class.getClassLoader()));
    }

    public Agc a() {
        return this.a;
    }

    static {
        CREATOR = new f();
    }

    bn(Parcel parcel, bk bkVar) {
        this(parcel);
    }

    private bn(Agc agc) {
        this.a = agc;
    }

    bn(Agc agc, bk bkVar) {
        this(agc);
    }
}
