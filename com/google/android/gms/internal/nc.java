package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.jl.e;
import com.google.android.gms.internal.ni.a;

public class nc extends jl {
    public static int a;
    protected final np Ee;
    private final String agD;

    public nc(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, new String[0]);
        this.Ee = new np() {
            final nc agE;

            {
                this.agE = r1;
            }

            public void dS() {
                nc.a(this.agE);
            }

            public IInterface hw() {
                return nh();
            }

            public ni nh() {
                return (ni) this.agE.hw();
            }
        };
        this.agD = str;
    }

    static void a(nc ncVar) {
        ncVar.dS();
    }

    protected void a(jt jtVar, e eVar) {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.agD);
        jtVar.e(eVar, 6587000, getContext().getPackageName(), bundle);
    }

    protected ni aM(IBinder iBinder) {
        return a.aO(iBinder);
    }

    protected String bK() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected String bL() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected IInterface l(IBinder iBinder) {
        return aM(iBinder);
    }
}
