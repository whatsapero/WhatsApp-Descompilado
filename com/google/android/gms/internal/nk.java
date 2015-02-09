package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

public class nk extends nc {
    private final nj agX;
    private final mz agY;
    private final ie agZ;

    public nk(Context context, Looper looper, String str, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str2, String str3) {
        this(context, looper, str, connectionCallbacks, onConnectionFailedListener, str2, str3, null);
    }

    public nk(Context context, Looper looper, String str, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str2, String str3, String str4) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str2);
        this.agX = new nj(context, this.Ee);
        this.agY = mz.a(context, str3, str4, this.Ee);
        this.agZ = ie.a(context, this.Ee);
    }

    public void a(LocationListener locationListener) {
        this.agX.a(locationListener);
    }

    public void a(LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        synchronized (this.agX) {
            this.agX.a(locationRequest, locationListener, looper);
        }
    }

    public void disconnect() {
        synchronized (this.agX) {
            try {
                if (isConnected()) {
                    this.agX.removeAllListeners();
                    this.agX.nm();
                }
            } catch (Throwable e) {
                Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
            } catch (Throwable th) {
            }
            super.disconnect();
        }
    }

    public Location nl() {
        return this.agX.nl();
    }
}
