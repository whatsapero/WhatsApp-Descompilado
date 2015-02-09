package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public interface ICameraUpdateFactoryDelegate extends IInterface {

    public abstract class a extends Binder implements ICameraUpdateFactoryDelegate {

        class a implements ICameraUpdateFactoryDelegate {
            private IBinder le;

            a(IBinder iBinder) {
                this.le = iBinder;
            }

            public IBinder asBinder() {
                return this.le;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.dynamic.d newCameraPosition(com.google.android.gms.maps.model.CameraPosition r6) {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0038 }
                if (r6 == 0) goto L_0x001b;
            L_0x000f:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0038 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0038 }
                r0 = com.google.android.gms.maps.internal.m.a.a;	 Catch:{ all -> 0x0038 }
                if (r0 == 0) goto L_0x001f;
            L_0x001b:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0038 }
            L_0x001f:
                r0 = r5.le;	 Catch:{ all -> 0x0038 }
                r3 = 7;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0038 }
                r2.readException();	 Catch:{ all -> 0x0038 }
                r0 = r2.readStrongBinder();	 Catch:{ all -> 0x0038 }
                r0 = com.google.android.gms.dynamic.d.a.ap(r0);	 Catch:{ all -> 0x0038 }
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x0038:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate.a.a.newCameraPosition(com.google.android.gms.maps.model.CameraPosition):com.google.android.gms.dynamic.d");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.dynamic.d newLatLng(com.google.android.gms.maps.model.LatLng r6) {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0039 }
                if (r6 == 0) goto L_0x001b;
            L_0x000f:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0039 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0039 }
                r0 = com.google.android.gms.maps.internal.m.a.a;	 Catch:{ all -> 0x0039 }
                if (r0 == 0) goto L_0x001f;
            L_0x001b:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0039 }
            L_0x001f:
                r0 = r5.le;	 Catch:{ all -> 0x0039 }
                r3 = 8;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0039 }
                r2.readException();	 Catch:{ all -> 0x0039 }
                r0 = r2.readStrongBinder();	 Catch:{ all -> 0x0039 }
                r0 = com.google.android.gms.dynamic.d.a.ap(r0);	 Catch:{ all -> 0x0039 }
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x0039:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate.a.a.newLatLng(com.google.android.gms.maps.model.LatLng):com.google.android.gms.dynamic.d");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.dynamic.d newLatLngBounds(com.google.android.gms.maps.model.LatLngBounds r6, int r7) {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x003c }
                if (r6 == 0) goto L_0x001b;
            L_0x000f:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x003c }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x003c }
                r0 = com.google.android.gms.maps.internal.m.a.a;	 Catch:{ all -> 0x003c }
                if (r0 == 0) goto L_0x001f;
            L_0x001b:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x003c }
            L_0x001f:
                r1.writeInt(r7);	 Catch:{ all -> 0x003c }
                r0 = r5.le;	 Catch:{ all -> 0x003c }
                r3 = 10;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x003c }
                r2.readException();	 Catch:{ all -> 0x003c }
                r0 = r2.readStrongBinder();	 Catch:{ all -> 0x003c }
                r0 = com.google.android.gms.dynamic.d.a.ap(r0);	 Catch:{ all -> 0x003c }
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x003c:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate.a.a.newLatLngBounds(com.google.android.gms.maps.model.LatLngBounds, int):com.google.android.gms.dynamic.d");
            }

            public d zoomBy(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    obtain.writeFloat(f);
                    this.le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    d ap = com.google.android.gms.dynamic.d.a.ap(obtain2.readStrongBinder());
                    return ap;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public d zoomTo(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    obtain.writeFloat(f);
                    this.le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    d ap = com.google.android.gms.dynamic.d.a.ap(obtain2.readStrongBinder());
                    return ap;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static ICameraUpdateFactoryDelegate aQ(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICameraUpdateFactoryDelegate)) ? new a(iBinder) : (ICameraUpdateFactoryDelegate) queryLocalInterface;
        }
    }

    d newCameraPosition(CameraPosition cameraPosition);

    d newLatLng(LatLng latLng);

    d newLatLngBounds(LatLngBounds latLngBounds, int i);

    d zoomBy(float f);

    d zoomTo(float f);
}
