package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.d.a;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.aa;

public final class MarkerOptions implements SafeParcelable {
    public static final k CREATOR;
    private final int CK;
    private String OH;
    private boolean alY;
    private LatLng alt;
    private float amg;
    private float amh;
    private String amp;
    private BitmapDescriptor amq;
    private boolean amr;
    private boolean ams;
    private float amt;
    private float amu;
    private float amv;
    private float mAlpha;

    static {
        CREATOR = new k();
    }

    public MarkerOptions() {
        this.amg = 0.5f;
        this.amh = 1.0f;
        this.alY = true;
        this.ams = false;
        this.amt = 0.0f;
        this.amu = 0.5f;
        this.amv = 0.0f;
        this.mAlpha = 1.0f;
        this.CK = 1;
    }

    MarkerOptions(int i, LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6) {
        boolean z4 = LatLng.a;
        this.amg = 0.5f;
        this.amh = 1.0f;
        this.alY = true;
        this.ams = false;
        this.amt = 0.0f;
        this.amu = 0.5f;
        this.amv = 0.0f;
        this.mAlpha = 1.0f;
        this.CK = i;
        this.alt = latLng;
        this.OH = str;
        this.amp = str2;
        this.amq = iBinder == null ? null : new BitmapDescriptor(a.ap(iBinder));
        this.amg = f;
        this.amh = f2;
        this.amr = z;
        this.alY = z2;
        this.ams = z3;
        this.amt = f3;
        this.amu = f4;
        this.amv = f5;
        this.mAlpha = f6;
        if (GoogleMap.a) {
            LatLng.a = !z4;
        }
    }

    public MarkerOptions anchor(float f, float f2) {
        this.amg = f;
        this.amh = f2;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public float getAnchorU() {
        return this.amg;
    }

    public float getAnchorV() {
        return this.amh;
    }

    public float getInfoWindowAnchorU() {
        return this.amu;
    }

    public float getInfoWindowAnchorV() {
        return this.amv;
    }

    public LatLng getPosition() {
        return this.alt;
    }

    public float getRotation() {
        return this.amt;
    }

    public String getSnippet() {
        return this.amp;
    }

    public String getTitle() {
        return this.OH;
    }

    int getVersionCode() {
        return this.CK;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        this.amq = bitmapDescriptor;
        return this;
    }

    public boolean isDraggable() {
        return this.amr;
    }

    public boolean isFlat() {
        return this.ams;
    }

    public boolean isVisible() {
        return this.alY;
    }

    IBinder oe() {
        return this.amq == null ? null : this.amq.nA().asBinder();
    }

    public MarkerOptions position(LatLng latLng) {
        this.alt = latLng;
        return this;
    }

    public MarkerOptions snippet(String str) {
        this.amp = str;
        return this;
    }

    public MarkerOptions title(String str) {
        this.OH = str;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (aa.ob()) {
            l.a(this, parcel, i);
            if (!LatLng.a) {
                return;
            }
        }
        k.a(this, parcel, i);
    }
}
