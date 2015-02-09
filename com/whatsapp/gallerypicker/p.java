package com.whatsapp.gallerypicker;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Locale;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class p implements Parcelable {
    public static final Creator CREATOR;
    private static final String z;
    public boolean a;
    public bq b;
    public int c;
    public int d;
    public String e;
    public Uri f;

    private p(Parcel parcel) {
        this.b = bq.values()[parcel.readInt()];
        this.d = parcel.readInt();
        this.c = parcel.readInt();
        this.e = parcel.readString();
        this.f = (Uri) parcel.readParcelable(null);
        this.a = parcel.readInt() != 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.b.ordinal());
        parcel.writeInt(this.d);
        parcel.writeInt(this.c);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        if (this.a) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }

    static {
        char[] toCharArray = "M\r6c~H\t$pKe\u00126i`h\u000f49>wL>jx9E3(hk\u0012#9>`L5qxo\u0005#9>wL2ikp\u0019j!y(\u0013>j|h\u0005j!hy".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 4;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 87;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 27;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        CREATOR = new bv();
    }

    public int describeContents() {
        return 0;
    }

    p(Parcel parcel, a1 a1Var) {
        this(parcel);
    }

    public String toString() {
        return String.format(Locale.US, z, new Object[]{this.b, Integer.valueOf(this.d), Integer.valueOf(this.c), this.e, Boolean.valueOf(this.a), this.f});
    }
}
