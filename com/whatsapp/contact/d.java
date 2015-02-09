package com.whatsapp.contact;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.bh;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class d implements Parcelable {
    public static final Creator CREATOR;
    private static final String z;
    private final bh a;

    public bh a() {
        return this.a;
    }

    public int describeContents() {
        return 0;
    }

    static {
        char[] toCharArray = "AeN\niAyRIQGoTIR]h\u0000\u000bY\u0012rU\u0005P".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 50;
                    break;
                case ay.f /*1*/:
                    i2 = 28;
                    break;
                case ay.n /*2*/:
                    i2 = 32;
                    break;
                case ay.p /*3*/:
                    i2 = 105;
                    break;
                default:
                    i2 = 60;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        CREATOR = new b();
    }

    public d(bh bhVar) {
        if (bhVar == null) {
            throw new NullPointerException(z);
        }
        this.a = bhVar;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.a);
        parcel.writeString(this.a.c);
        parcel.writeInt(this.a.b);
    }
}
