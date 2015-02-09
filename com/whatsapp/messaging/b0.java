package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.NoiseSuppression;

final class b0 implements Parcelable {
    public static final Creator CREATOR;
    private final NoiseSuppression a;

    private b0(Parcel parcel) {
        this.a = new NoiseSuppression((Short) parcel.readValue(Short.class.getClassLoader()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a.mode);
    }

    private b0(NoiseSuppression noiseSuppression) {
        this.a = noiseSuppression;
    }

    b0(Parcel parcel, bk bkVar) {
        this(parcel);
    }

    b0(NoiseSuppression noiseSuppression, bk bkVar) {
        this(noiseSuppression);
    }

    public int describeContents() {
        return 0;
    }

    public NoiseSuppression a() {
        return this.a;
    }

    static {
        CREATOR = new at();
    }
}
