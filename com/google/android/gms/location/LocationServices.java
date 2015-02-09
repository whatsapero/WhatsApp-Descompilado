package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.nf;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.nk;

public class LocationServices {
    public static final Api API;
    private static final c DQ;
    private static final b DR;
    public static FusedLocationProviderApi FusedLocationApi;
    public static GeofencingApi GeofencingApi;
    public static int a;

    public abstract class a extends com.google.android.gms.common.api.BaseImplementation.a {
        public static int a;

        public a(GoogleApiClient googleApiClient) {
            super(LocationServices.nf(), googleApiClient);
        }
    }

    static {
        DQ = new c();
        DR = new b() {
            public com.google.android.gms.common.api.Api.a a(Context context, Looper looper, jg jgVar, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
                return e(context, looper, jgVar, (NoOptions) obj, connectionCallbacks, onConnectionFailedListener);
            }

            public nk e(Context context, Looper looper, jg jgVar, NoOptions noOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
                return new nk(context, looper, context.getPackageName(), connectionCallbacks, onConnectionFailedListener, "locationServices", jgVar.getAccountName());
            }

            public int getPriority() {
                return Integer.MAX_VALUE;
            }
        };
        API = new Api(DR, DQ, new Scope[0]);
        FusedLocationApi = new nf();
        GeofencingApi = new ng();
    }

    public static nk f(GoogleApiClient googleApiClient) {
        boolean z = true;
        jx.b(googleApiClient != null, (Object) "GoogleApiClient parameter is required.");
        nk nkVar = (nk) googleApiClient.a(DQ);
        if (nkVar == null) {
            z = false;
        }
        jx.a(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return nkVar;
    }

    static c nf() {
        return DQ;
    }
}
