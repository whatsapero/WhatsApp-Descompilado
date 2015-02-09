package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

public class nf implements FusedLocationProviderApi {

    abstract class a extends com.google.android.gms.location.LocationServices.a {
        public a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public Status b(Status status) {
            return status;
        }

        public Result c(Status status) {
            return b(status);
        }
    }

    class AnonymousClass_1 extends a {
        final LocationRequest agF;
        final LocationListener agG;
        final nf agH;

        AnonymousClass_1(nf nfVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
            this.agH = nfVar;
            this.agF = locationRequest;
            this.agG = locationListener;
            super(googleApiClient);
        }

        protected void a(com.google.android.gms.common.api.Api.a aVar) {
            a((nk) aVar);
        }

        protected void a(nk nkVar) {
            nkVar.a(this.agF, this.agG, null);
            b(Status.Kw);
        }
    }

    class AnonymousClass_5 extends a {
        final LocationListener agG;
        final nf agH;

        AnonymousClass_5(nf nfVar, GoogleApiClient googleApiClient, LocationListener locationListener) {
            this.agH = nfVar;
            this.agG = locationListener;
            super(googleApiClient);
        }

        protected void a(com.google.android.gms.common.api.Api.a aVar) {
            a((nk) aVar);
        }

        protected void a(nk nkVar) {
            nkVar.a(this.agG);
            b(Status.Kw);
        }
    }

    public Location getLastLocation(GoogleApiClient googleApiClient) {
        try {
            return LocationServices.f(googleApiClient).nl();
        } catch (Exception e) {
            return null;
        }
    }

    public PendingResult removeLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
        return googleApiClient.b(new AnonymousClass_5(this, googleApiClient, locationListener));
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        return googleApiClient.b(new AnonymousClass_1(this, googleApiClient, locationRequest, locationListener));
    }
}
