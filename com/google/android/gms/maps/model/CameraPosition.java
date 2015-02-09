package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.aa;

public final class CameraPosition implements SafeParcelable {
    public static final a CREATOR;
    private final int CK;
    public final float bearing;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    public final class Builder {
        private LatLng alN;
        private float alO;
        private float alP;
        private float alQ;

        public com.google.android.gms.maps.model.CameraPosition.Builder bearing(float f) {
            this.alQ = f;
            return this;
        }

        public CameraPosition build() {
            return new CameraPosition(this.alN, this.alO, this.alP, this.alQ);
        }

        public com.google.android.gms.maps.model.CameraPosition.Builder target(LatLng latLng) {
            this.alN = latLng;
            return this;
        }

        public com.google.android.gms.maps.model.CameraPosition.Builder tilt(float f) {
            this.alP = f;
            return this;
        }

        public com.google.android.gms.maps.model.CameraPosition.Builder zoom(float f) {
            this.alO = f;
            return this;
        }
    }

    static {
        CREATOR = new a();
    }

    CameraPosition(int i, LatLng latLng, float f, float f2, float f3) {
        jx.b((Object) latLng, (Object) "null camera target");
        boolean z = 0.0f <= f2 && f2 <= 90.0f;
        jx.b(z, (Object) "Tilt needs to be between 0 and 90 inclusive");
        this.CK = i;
        this.target = latLng;
        this.zoom = f;
        this.tilt = f2 + 0.0f;
        if (((double) f3) <= 0.0d) {
            f3 = (f3 % 360.0f) + 360.0f;
        }
        this.bearing = f3 % 360.0f;
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this(1, latLng, f, f2, f3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CameraPosition createFromAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, a.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(a.MapAttrs_cameraTargetLat) ? obtainAttributes.getFloat(a.MapAttrs_cameraTargetLat, 0.0f) : 0.0f), (double) (obtainAttributes.hasValue(a.MapAttrs_cameraTargetLng) ? obtainAttributes.getFloat(a.MapAttrs_cameraTargetLng, 0.0f) : 0.0f));
        Builder builder = builder();
        builder.target(latLng);
        if (obtainAttributes.hasValue(a.MapAttrs_cameraZoom)) {
            builder.zoom(obtainAttributes.getFloat(a.MapAttrs_cameraZoom, 0.0f));
        }
        if (obtainAttributes.hasValue(a.MapAttrs_cameraBearing)) {
            builder.bearing(obtainAttributes.getFloat(a.MapAttrs_cameraBearing, 0.0f));
        }
        if (obtainAttributes.hasValue(a.MapAttrs_cameraTilt)) {
            builder.tilt(obtainAttributes.getFloat(a.MapAttrs_cameraTilt, 0.0f));
        }
        return builder.build();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    int getVersionCode() {
        return this.CK;
    }

    public int hashCode() {
        return jv.hashCode(new Object[]{this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    public String toString() {
        return jv.h(this).a("target", this.target).a("zoom", Float.valueOf(this.zoom)).a("tilt", Float.valueOf(this.tilt)).a("bearing", Float.valueOf(this.bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (aa.ob()) {
            b.a(this, parcel, i);
            if (!LatLng.a) {
                return;
            }
        }
        a.a(this, parcel, i);
    }
}
