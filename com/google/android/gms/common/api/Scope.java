package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jx;

public final class Scope implements SafeParcelable {
    public static final Creator CREATOR;
    final int CK;
    private final String Kv;

    static {
        CREATOR = new e();
    }

    Scope(int i, String str) {
        jx.b(str, (Object) "scopeUri must not be null or empty");
        this.CK = i;
        this.Kv = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj ? true : !(obj instanceof Scope) ? false : this.Kv.equals(((Scope) obj).Kv);
    }

    public String gO() {
        return this.Kv;
    }

    public int hashCode() {
        return this.Kv.hashCode();
    }

    public String toString() {
        return this.Kv;
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
