package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.whispersystems.libaxolotl.ay;

public interface m extends IInterface {

    public abstract class a extends Binder implements m {
        public static int a;

        public a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMapReadyCallback");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case ay.f /*1*/:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                    a(com.google.android.gms.maps.internal.IGoogleMapDelegate.a.aT(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(IGoogleMapDelegate iGoogleMapDelegate);
}
