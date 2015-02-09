package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class UiSettings {
    private final IUiSettingsDelegate alH;

    UiSettings(IUiSettingsDelegate iUiSettingsDelegate) {
        this.alH = iUiSettingsDelegate;
    }

    public void setCompassEnabled(boolean z) {
        try {
            this.alH.setCompassEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setMyLocationButtonEnabled(boolean z) {
        try {
            this.alH.setMyLocationButtonEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setZoomControlsEnabled(boolean z) {
        try {
            this.alH.setZoomControlsEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
