package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.cz;

final class n implements Parcelable {
    public static final Creator CREATOR;
    private final cz a;

    public static cz[] a(n[] nVarArr) {
        boolean z = au.a;
        cz[] czVarArr = new cz[nVarArr.length];
        int i = 0;
        while (i < nVarArr.length) {
            czVarArr[i] = nVarArr[i].a();
            i++;
            if (z) {
                break;
            }
        }
        return czVarArr;
    }

    public n(cz czVar) {
        this.a = czVar;
    }

    public cz a() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.c);
        parcel.writeByteArray(this.a.a);
        parcel.writeByteArray(this.a.b);
    }

    public static n[] a(cz[] czVarArr) {
        boolean z = au.a;
        n[] nVarArr = new n[czVarArr.length];
        int i = 0;
        while (i < czVarArr.length) {
            nVarArr[i] = new n(czVarArr[i]);
            i++;
            if (z) {
                break;
            }
        }
        return nVarArr;
    }

    static {
        CREATOR = new br();
    }

    public n(Parcel parcel) {
        this.a = new cz(parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray());
    }

    public int describeContents() {
        return 0;
    }
}
