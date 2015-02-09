package com.whatsapp;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

class y6 implements ConnectionCallbacks, OnConnectionFailedListener {
    final b8 a;

    public void onConnectionSuspended(int i) {
    }

    public void onConnected(Bundle bundle) {
        int i = App.az;
        for (xq xqVar : b8.a(this.a).values()) {
            LocationRequest create = LocationRequest.create();
            create.setPriority(xq.c(xqVar) ? 100 : 102);
            create.setInterval(xq.a(xqVar));
            create.setFastestInterval(1000);
            create.setSmallestDisplacement(xq.b(xqVar));
            LocationServices.FusedLocationApi.requestLocationUpdates(b8.b(this.a), create, xqVar);
            if (i != 0) {
                break;
            }
        }
        if (b8.a(this.a).isEmpty()) {
            b8.b(this.a).disconnect();
        }
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
    }

    y6(b8 b8Var) {
        this.a = b8Var;
    }
}
