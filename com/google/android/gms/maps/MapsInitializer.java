package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.x;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class MapsInitializer {
    public static void a(c cVar) {
        try {
            CameraUpdateFactory.a(cVar.nW());
            BitmapDescriptorFactory.a(cVar.nX());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static int initialize(Context context) {
        jx.i(context);
        try {
            a(x.S(context));
            return 0;
        } catch (GooglePlayServicesNotAvailableException e) {
            return e.errorCode;
        }
    }
}
