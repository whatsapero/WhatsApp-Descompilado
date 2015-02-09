package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.GoogleMap.OnCameraChangeListener;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.f;
import com.google.android.gms.maps.internal.h;
import com.google.android.gms.maps.internal.j;
import com.google.android.gms.maps.internal.n.a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.internal.l;

public final class GoogleMap {
    public static boolean a;
    private final IGoogleMapDelegate akm;
    private UiSettings akn;

    class AnonymousClass_10 extends a {
        final OnMarkerClickListener akA;
        final GoogleMap akp;

        AnonymousClass_10(GoogleMap googleMap, OnMarkerClickListener onMarkerClickListener) {
            this.akp = googleMap;
            this.akA = onMarkerClickListener;
        }

        public boolean a(l lVar) {
            return this.akA.onMarkerClick(new Marker(lVar));
        }
    }

    class AnonymousClass_12 extends h.a {
        final OnInfoWindowClickListener akC;
        final GoogleMap akp;

        AnonymousClass_12(GoogleMap googleMap, OnInfoWindowClickListener onInfoWindowClickListener) {
            this.akp = googleMap;
            this.akC = onInfoWindowClickListener;
        }

        public void e(l lVar) {
            this.akC.onInfoWindowClick(new Marker(lVar));
        }
    }

    class AnonymousClass_7 extends f.a {
        final GoogleMap akp;
        final OnCameraChangeListener akx;

        AnonymousClass_7(GoogleMap googleMap, OnCameraChangeListener onCameraChangeListener) {
            this.akp = googleMap;
            this.akx = onCameraChangeListener;
        }

        public void onCameraChange(CameraPosition cameraPosition) {
            this.akx.onCameraChange(cameraPosition);
        }
    }

    class AnonymousClass_8 extends j.a {
        final GoogleMap akp;
        final OnMapClickListener aky;

        AnonymousClass_8(GoogleMap googleMap, OnMapClickListener onMapClickListener) {
            this.akp = googleMap;
            this.aky = onMapClickListener;
        }

        public void onMapClick(LatLng latLng) {
            this.aky.onMapClick(latLng);
        }
    }

    public interface OnCameraChangeListener {
        void onCameraChange(CameraPosition cameraPosition);
    }

    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(Marker marker);
    }

    public interface OnMapClickListener {
        void onMapClick(LatLng latLng);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    protected GoogleMap(IGoogleMapDelegate iGoogleMapDelegate) {
        this.akm = (IGoogleMapDelegate) jx.i(iGoogleMapDelegate);
    }

    public final Marker addMarker(MarkerOptions markerOptions) {
        try {
            l addMarker = this.akm.addMarker(markerOptions);
            return addMarker != null ? new Marker(addMarker) : null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(CameraUpdate cameraUpdate) {
        try {
            this.akm.animateCamera(cameraUpdate.nA());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void clear() {
        try {
            this.akm.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final CameraPosition getCameraPosition() {
        try {
            return this.akm.getCameraPosition();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Deprecated
    public final Location getMyLocation() {
        try {
            return this.akm.getMyLocation();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Projection getProjection() {
        try {
            return new Projection(this.akm.getProjection());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final UiSettings getUiSettings() {
        try {
            if (this.akn == null) {
                this.akn = new UiSettings(this.akm.getUiSettings());
            }
            return this.akn;
        } catch (RemoteException e) {
            throw e;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final boolean isTrafficEnabled() {
        try {
            return this.akm.isTrafficEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void moveCamera(CameraUpdate cameraUpdate) {
        try {
            this.akm.moveCamera(cameraUpdate.nA());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean setIndoorEnabled(boolean z) {
        try {
            return this.akm.setIndoorEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setMapType(int i) {
        try {
            this.akm.setMapType(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setMyLocationEnabled(boolean z) {
        try {
            this.akm.setMyLocationEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setOnCameraChangeListener(com.google.android.gms.maps.GoogleMap.OnCameraChangeListener r3) {
        /*
        r2_this = this;
        if (r3 != 0) goto L_0x000c;
    L_0x0002:
        r0 = r2.akm;	 Catch:{ RemoteException -> 0x0017 }
        r1 = 0;
        r0.setOnCameraChangeListener(r1);	 Catch:{ RemoteException -> 0x0017 }
        r0 = com.google.android.gms.maps.MapView.a;	 Catch:{ RemoteException -> 0x0017 }
        if (r0 == 0) goto L_0x0016;
    L_0x000c:
        r0 = r2.akm;	 Catch:{ RemoteException -> 0x0019 }
        r1 = new com.google.android.gms.maps.GoogleMap$7;	 Catch:{ RemoteException -> 0x0019 }
        r1.<init>(r2, r3);	 Catch:{ RemoteException -> 0x0019 }
        r0.setOnCameraChangeListener(r1);	 Catch:{ RemoteException -> 0x0019 }
    L_0x0016:
        return;
    L_0x0017:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x0019 }
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        r1 = new com.google.android.gms.maps.model.RuntimeRemoteException;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.GoogleMap.setOnCameraChangeListener(com.google.android.gms.maps.GoogleMap$OnCameraChangeListener):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setOnInfoWindowClickListener(com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener r3) {
        /*
        r2_this = this;
        if (r3 != 0) goto L_0x000c;
    L_0x0002:
        r0 = r2.akm;	 Catch:{ RemoteException -> 0x0017 }
        r1 = 0;
        r0.setOnInfoWindowClickListener(r1);	 Catch:{ RemoteException -> 0x0017 }
        r0 = com.google.android.gms.maps.MapView.a;	 Catch:{ RemoteException -> 0x0017 }
        if (r0 == 0) goto L_0x0016;
    L_0x000c:
        r0 = r2.akm;	 Catch:{ RemoteException -> 0x0019 }
        r1 = new com.google.android.gms.maps.GoogleMap$12;	 Catch:{ RemoteException -> 0x0019 }
        r1.<init>(r2, r3);	 Catch:{ RemoteException -> 0x0019 }
        r0.setOnInfoWindowClickListener(r1);	 Catch:{ RemoteException -> 0x0019 }
    L_0x0016:
        return;
    L_0x0017:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x0019 }
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        r1 = new com.google.android.gms.maps.model.RuntimeRemoteException;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.GoogleMap.setOnInfoWindowClickListener(com.google.android.gms.maps.GoogleMap$OnInfoWindowClickListener):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setOnMapClickListener(com.google.android.gms.maps.GoogleMap.OnMapClickListener r3) {
        /*
        r2_this = this;
        if (r3 != 0) goto L_0x000c;
    L_0x0002:
        r0 = r2.akm;	 Catch:{ RemoteException -> 0x0017 }
        r1 = 0;
        r0.setOnMapClickListener(r1);	 Catch:{ RemoteException -> 0x0017 }
        r0 = com.google.android.gms.maps.MapView.a;	 Catch:{ RemoteException -> 0x0017 }
        if (r0 == 0) goto L_0x0016;
    L_0x000c:
        r0 = r2.akm;	 Catch:{ RemoteException -> 0x0019 }
        r1 = new com.google.android.gms.maps.GoogleMap$8;	 Catch:{ RemoteException -> 0x0019 }
        r1.<init>(r2, r3);	 Catch:{ RemoteException -> 0x0019 }
        r0.setOnMapClickListener(r1);	 Catch:{ RemoteException -> 0x0019 }
    L_0x0016:
        return;
    L_0x0017:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x0019 }
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        r1 = new com.google.android.gms.maps.model.RuntimeRemoteException;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.GoogleMap.setOnMapClickListener(com.google.android.gms.maps.GoogleMap$OnMapClickListener):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setOnMarkerClickListener(com.google.android.gms.maps.GoogleMap.OnMarkerClickListener r3) {
        /*
        r2_this = this;
        if (r3 != 0) goto L_0x000c;
    L_0x0002:
        r0 = r2.akm;	 Catch:{ RemoteException -> 0x0017 }
        r1 = 0;
        r0.setOnMarkerClickListener(r1);	 Catch:{ RemoteException -> 0x0017 }
        r0 = com.google.android.gms.maps.MapView.a;	 Catch:{ RemoteException -> 0x0017 }
        if (r0 == 0) goto L_0x0016;
    L_0x000c:
        r0 = r2.akm;	 Catch:{ RemoteException -> 0x0019 }
        r1 = new com.google.android.gms.maps.GoogleMap$10;	 Catch:{ RemoteException -> 0x0019 }
        r1.<init>(r2, r3);	 Catch:{ RemoteException -> 0x0019 }
        r0.setOnMarkerClickListener(r1);	 Catch:{ RemoteException -> 0x0019 }
    L_0x0016:
        return;
    L_0x0017:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x0019 }
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        r1 = new com.google.android.gms.maps.model.RuntimeRemoteException;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.GoogleMap.setOnMarkerClickListener(com.google.android.gms.maps.GoogleMap$OnMarkerClickListener):void");
    }

    public final void setTrafficEnabled(boolean z) {
        try {
            this.akm.setTrafficEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void stopAnimation() {
        try {
            this.akm.stopAnimation();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
