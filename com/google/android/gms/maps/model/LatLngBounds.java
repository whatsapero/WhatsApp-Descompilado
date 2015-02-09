package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.aa;

public final class LatLngBounds implements SafeParcelable {
    public static final g CREATOR;
    private final int CK;
    public final LatLng northeast;
    public final LatLng southwest;

    static {
        CREATOR = new g();
    }

    LatLngBounds(int i, LatLng latLng, LatLng latLng2) {
        jx.b((Object) latLng, (Object) "null southwest");
        jx.b((Object) latLng2, (Object) "null northeast");
        jx.b(latLng2.latitude >= latLng.latitude, "southern latitude exceeds northern latitude (%s > %s)", new Object[]{Double.valueOf(latLng.latitude), Double.valueOf(latLng2.latitude)});
        this.CK = i;
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        this(1, latLng, latLng2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    int getVersionCode() {
        return this.CK;
    }

    public int hashCode() {
        return jv.hashCode(new Object[]{this.southwest, this.northeast});
    }

    public String toString() {
        return jv.h(this).a("southwest", this.southwest).a("northeast", this.northeast).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (aa.ob()) {
            h.a(this, parcel, i);
            if (!a) {
                return;
            }
        }
        g.a(this, parcel, i);
    }
}
