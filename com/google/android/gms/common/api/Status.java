package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;

public final class Status implements Result, SafeParcelable {
    public static final StatusCreator CREATOR;
    public static final Status KA;
    public static final Status Kw;
    public static final Status Kx;
    public static final Status Ky;
    public static final Status Kz;
    private final int CK;
    private final int Iv;
    private final String KB;
    private final PendingIntent mPendingIntent;

    static {
        Kw = new Status(0);
        Kx = new Status(14);
        Ky = new Status(8);
        Kz = new Status(15);
        KA = new Status(16);
        CREATOR = new StatusCreator();
    }

    public Status(int i) {
        this(i, null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.CK = i;
        this.Iv = i2;
        this.KB = str;
        this.mPendingIntent = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    private String gt() {
        return this.KB != null ? this.KB : CommonStatusCodes.getStatusCodeString(this.Iv);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.CK == status.CK && this.Iv == status.Iv && jv.equal(this.KB, status.KB) && jv.equal(this.mPendingIntent, status.mPendingIntent);
    }

    PendingIntent gP() {
        return this.mPendingIntent;
    }

    public Status getStatus() {
        return this;
    }

    public int getStatusCode() {
        return this.Iv;
    }

    public String getStatusMessage() {
        return this.KB;
    }

    int getVersionCode() {
        return this.CK;
    }

    public int hashCode() {
        return jv.hashCode(new Object[]{Integer.valueOf(this.CK), Integer.valueOf(this.Iv), this.KB, this.mPendingIntent});
    }

    public boolean isSuccess() {
        return this.Iv <= 0;
    }

    public String toString() {
        return jv.h(this).a("statusCode", gt()).a("resolution", this.mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        StatusCreator.a(this, parcel, i);
    }
}
