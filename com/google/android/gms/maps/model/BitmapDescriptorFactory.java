package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.model.internal.g;

public final class BitmapDescriptorFactory {
    private static g alM;

    public static void a(g gVar) {
        try {
            if (alM == null) {
                alM = (g) jx.i(gVar);
            }
        } catch (RuntimeRemoteException e) {
            throw e;
        }
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap) {
        try {
            return new BitmapDescriptor(oc().b(bitmap));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    private static g oc() {
        return (g) jx.b(alM, (Object) "IBitmapDescriptorFactory is not initialized");
    }
}
