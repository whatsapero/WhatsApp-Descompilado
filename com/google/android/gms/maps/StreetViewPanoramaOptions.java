package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public final class StreetViewPanoramaOptions implements SafeParcelable {
    public static final c CREATOR;
    private final int CK;
    private Boolean akG;
    private Boolean akM;
    private StreetViewPanoramaCamera alr;
    private String als;
    private LatLng alt;
    private Integer alu;
    private Boolean alv;
    private Boolean alw;
    private Boolean alx;

    static {
        CREATOR = new c();
    }

    public StreetViewPanoramaOptions() {
        this.alv = Boolean.valueOf(true);
        this.akM = Boolean.valueOf(true);
        this.alw = Boolean.valueOf(true);
        this.alx = Boolean.valueOf(true);
        this.CK = 1;
    }

    StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5) {
        this.alv = Boolean.valueOf(true);
        this.akM = Boolean.valueOf(true);
        this.alw = Boolean.valueOf(true);
        this.alx = Boolean.valueOf(true);
        this.CK = i;
        this.alr = streetViewPanoramaCamera;
        this.alt = latLng;
        this.alu = num;
        this.als = str;
        this.alv = a.a(b);
        this.akM = a.a(b2);
        this.alw = a.a(b3);
        this.alx = a.a(b4);
        this.akG = a.a(b5);
    }

    public int describeContents() {
        return 0;
    }

    public String getPanoramaId() {
        return this.als;
    }

    public LatLng getPosition() {
        return this.alt;
    }

    public Integer getRadius() {
        return this.alu;
    }

    public StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.alr;
    }

    int getVersionCode() {
        return this.CK;
    }

    byte nE() {
        return a.c(this.akG);
    }

    byte nI() {
        return a.c(this.akM);
    }

    byte nS() {
        return a.c(this.alv);
    }

    byte nT() {
        return a.c(this.alw);
    }

    byte nU() {
        return a.c(this.alx);
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
