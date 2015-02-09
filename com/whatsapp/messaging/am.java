package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions;
import com.whatsapp.protocol.VoipOptions.Aec;
import com.whatsapp.protocol.VoipOptions.Agc;
import com.whatsapp.protocol.VoipOptions.AudioRestrict;
import com.whatsapp.protocol.VoipOptions.Decode;
import com.whatsapp.protocol.VoipOptions.Encode;
import com.whatsapp.protocol.VoipOptions.Miscellaneous;
import com.whatsapp.protocol.VoipOptions.NoiseSuppression;

final class am implements Parcelable {
    public static final Creator CREATOR;
    private final ab a;
    private final b1 b;
    private final VoipOptions c;
    private final al d;
    private final bn e;
    private final b f;
    private final a5 g;
    private final b0 h;

    private am(Parcel parcel) {
        Miscellaneous a;
        AudioRestrict a2;
        NoiseSuppression noiseSuppression = null;
        this.a = (ab) parcel.readValue(ab.class.getClassLoader());
        this.e = (bn) parcel.readValue(bn.class.getClassLoader());
        this.g = (a5) parcel.readValue(a5.class.getClassLoader());
        this.f = (b) parcel.readValue(b.class.getClassLoader());
        this.d = (al) parcel.readValue(al.class.getClassLoader());
        this.b = (b1) parcel.readValue(b1.class.getClassLoader());
        this.h = (b0) parcel.readValue(b0.class.getClassLoader());
        Aec a3 = this.a != null ? this.a.a() : null;
        Encode a4 = this.d != null ? this.d.a() : null;
        Decode a5 = this.f != null ? this.f.a() : null;
        if (this.b != null) {
            a = this.b.a();
        } else {
            a = null;
        }
        Agc a6 = this.e != null ? this.e.a() : null;
        if (this.g != null) {
            a2 = this.g.a();
        } else {
            a2 = null;
        }
        if (this.h != null) {
            noiseSuppression = this.h.a();
        }
        this.c = new VoipOptions(a3, a4, a5, a, a6, a2, noiseSuppression);
    }

    public int describeContents() {
        return 0;
    }

    static {
        CREATOR = new bk();
    }

    public VoipOptions a() {
        return this.c;
    }

    am(VoipOptions voipOptions) {
        ab abVar;
        a5 a5Var;
        b bVar;
        al alVar;
        b0 b0Var = null;
        this.c = voipOptions;
        if (voipOptions.aec != null) {
            abVar = new ab(voipOptions.aec, null);
        } else {
            abVar = null;
        }
        this.a = abVar;
        this.e = voipOptions.agc != null ? new bn(voipOptions.agc, null) : null;
        if (voipOptions.audioRestrict != null) {
            a5Var = new a5(voipOptions.audioRestrict, null);
        } else {
            a5Var = null;
        }
        this.g = a5Var;
        if (voipOptions.decode != null) {
            bVar = new b(voipOptions.decode, null);
        } else {
            bVar = null;
        }
        this.f = bVar;
        if (voipOptions.encode != null) {
            alVar = new al(voipOptions.encode, null);
        } else {
            alVar = null;
        }
        this.d = alVar;
        this.b = voipOptions.miscellaneous != null ? new b1(voipOptions.miscellaneous, null) : null;
        if (voipOptions.noiseSuppression != null) {
            b0Var = new b0(voipOptions.noiseSuppression, null);
        }
        this.h = b0Var;
    }

    am(Parcel parcel, bk bkVar) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a);
        parcel.writeValue(this.e);
        parcel.writeValue(this.g);
        parcel.writeValue(this.f);
        parcel.writeValue(this.d);
        parcel.writeValue(this.b);
        parcel.writeValue(this.h);
    }
}
