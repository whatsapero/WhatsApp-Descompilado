package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.maps.model.LatLng;

public interface j extends IInterface {

    public abstract class a extends Binder implements j {
        public a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMapClickListener");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            /*
            r3_this = this;
            r1 = 1;
            switch(r4) {
                case 1: goto L_0x0010;
                case 1598968902: goto L_0x0009;
                default: goto L_0x0004;
            };
        L_0x0004:
            r0 = super.onTransact(r4, r5, r6, r7);
        L_0x0008:
            return r0;
        L_0x0009:
            r0 = "com.google.android.gms.maps.internal.IOnMapClickListener";
            r6.writeString(r0);
            r0 = r1;
            goto L_0x0008;
        L_0x0010:
            r0 = "com.google.android.gms.maps.internal.IOnMapClickListener";
            r5.enforceInterface(r0);
            r0 = r5.readInt();
            if (r0 == 0) goto L_0x0025;
        L_0x001b:
            r0 = com.google.android.gms.maps.model.LatLng.CREATOR;
            r0 = r0.de(r5);
            r2 = com.google.android.gms.maps.internal.m.a.a;
            if (r2 == 0) goto L_0x0026;
        L_0x0025:
            r0 = 0;
        L_0x0026:
            r3.onMapClick(r0);
            r6.writeNoException();
            r0 = r1;
            goto L_0x0008;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.j.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void onMapClick(LatLng latLng);
}
