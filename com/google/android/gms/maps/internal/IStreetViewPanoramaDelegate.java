package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface IStreetViewPanoramaDelegate extends IInterface {

    public abstract class a extends Binder implements IStreetViewPanoramaDelegate {

        class a implements IStreetViewPanoramaDelegate {
            private IBinder le;

            a(IBinder iBinder) {
                this.le = iBinder;
            }

            public IBinder asBinder() {
                return this.le;
            }
        }

        public static IStreetViewPanoramaDelegate br(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IStreetViewPanoramaDelegate)) ? new a(iBinder) : (IStreetViewPanoramaDelegate) queryLocalInterface;
        }
    }
}
