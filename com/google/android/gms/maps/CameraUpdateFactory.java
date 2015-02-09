package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class CameraUpdateFactory {
    private static ICameraUpdateFactoryDelegate akl;

    public static void a(ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate) {
        akl = (ICameraUpdateFactoryDelegate) jx.i(iCameraUpdateFactoryDelegate);
    }

    private static ICameraUpdateFactoryDelegate nB() {
        return (ICameraUpdateFactoryDelegate) jx.b(akl, (Object) "CameraUpdateFactory is not initialized");
    }

    public static CameraUpdate newCameraPosition(CameraPosition cameraPosition) {
        try {
            return new CameraUpdate(nB().newCameraPosition(cameraPosition));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static CameraUpdate newLatLng(LatLng latLng) {
        try {
            return new CameraUpdate(nB().newLatLng(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i) {
        try {
            return new CameraUpdate(nB().newLatLngBounds(latLngBounds, i));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static CameraUpdate zoomBy(float f) {
        try {
            return new CameraUpdate(nB().zoomBy(f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static CameraUpdate zoomTo(float f) {
        try {
            return new CameraUpdate(nB().zoomTo(f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
