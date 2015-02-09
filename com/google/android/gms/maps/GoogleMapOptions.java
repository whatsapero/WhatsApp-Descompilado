package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.a;
import com.google.android.gms.maps.internal.aa;
import com.google.android.gms.maps.model.CameraPosition;

public final class GoogleMapOptions implements SafeParcelable {
    public static final a CREATOR;
    private final int CK;
    private Boolean akF;
    private Boolean akG;
    private int akH;
    private CameraPosition akI;
    private Boolean akJ;
    private Boolean akK;
    private Boolean akL;
    private Boolean akM;
    private Boolean akN;
    private Boolean akO;
    private Boolean akP;
    private Boolean akQ;

    static {
        CREATOR = new a();
    }

    public GoogleMapOptions() {
        this.akH = -1;
        this.CK = 1;
    }

    GoogleMapOptions(int i, byte b, byte b2, int i2, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10) {
        this.akH = -1;
        this.CK = i;
        this.akF = a.a(b);
        this.akG = a.a(b2);
        this.akH = i2;
        this.akI = cameraPosition;
        this.akJ = a.a(b3);
        this.akK = a.a(b4);
        this.akL = a.a(b5);
        this.akM = a.a(b6);
        this.akN = a.a(b7);
        this.akO = a.a(b8);
        this.akP = a.a(b9);
        this.akQ = a.a(b10);
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, com.google.android.gms.a.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(com.google.android.gms.a.MapAttrs_mapType)) {
            googleMapOptions.mapType(obtainAttributes.getInt(com.google.android.gms.a.MapAttrs_mapType, -1));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.a.MapAttrs_zOrderOnTop)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(com.google.android.gms.a.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.a.MapAttrs_useViewLifecycle)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(com.google.android.gms.a.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.a.MapAttrs_uiCompass)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(com.google.android.gms.a.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.a.MapAttrs_uiRotateGestures)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(com.google.android.gms.a.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.a.MapAttrs_uiScrollGestures)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(com.google.android.gms.a.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.a.MapAttrs_uiTiltGestures)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(com.google.android.gms.a.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.a.MapAttrs_uiZoomGestures)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(com.google.android.gms.a.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.a.MapAttrs_uiZoomControls)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(com.google.android.gms.a.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.a.MapAttrs_liteMode)) {
            googleMapOptions.liteMode(obtainAttributes.getBoolean(com.google.android.gms.a.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.a.MapAttrs_uiMapToolbar)) {
            googleMapOptions.mapToolbarEnabled(obtainAttributes.getBoolean(com.google.android.gms.a.MapAttrs_uiMapToolbar, true));
        }
        googleMapOptions.camera(CameraPosition.createFromAttributes(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.akI = cameraPosition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean z) {
        this.akK = Boolean.valueOf(z);
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public CameraPosition getCamera() {
        return this.akI;
    }

    public int getMapType() {
        return this.akH;
    }

    int getVersionCode() {
        return this.CK;
    }

    public GoogleMapOptions liteMode(boolean z) {
        this.akP = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.akQ = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapType(int i) {
        this.akH = i;
        return this;
    }

    byte nD() {
        return a.c(this.akF);
    }

    byte nE() {
        return a.c(this.akG);
    }

    byte nF() {
        return a.c(this.akJ);
    }

    byte nG() {
        return a.c(this.akK);
    }

    byte nH() {
        return a.c(this.akL);
    }

    byte nI() {
        return a.c(this.akM);
    }

    byte nJ() {
        return a.c(this.akN);
    }

    byte nK() {
        return a.c(this.akO);
    }

    byte nL() {
        return a.c(this.akP);
    }

    byte nM() {
        return a.c(this.akQ);
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.akO = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.akL = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.akN = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.akG = Boolean.valueOf(z);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (aa.ob()) {
            b.a(this, parcel, i);
            if (!MapView.a) {
                return;
            }
        }
        a.a(this, parcel, i);
    }

    public GoogleMapOptions zOrderOnTop(boolean z) {
        this.akF = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.akJ = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.akM = Boolean.valueOf(z);
        return this;
    }
}
