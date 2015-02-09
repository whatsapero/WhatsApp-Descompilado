package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public interface IProjectionDelegate extends IInterface {

    public abstract class a extends Binder implements IProjectionDelegate {

        class a implements IProjectionDelegate {
            private IBinder le;

            a(IBinder iBinder) {
                this.le = iBinder;
            }

            public IBinder asBinder() {
                return this.le;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.maps.model.VisibleRegion getVisibleRegion() {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.IProjectionDelegate";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x002f }
                r0 = r5.le;	 Catch:{ all -> 0x002f }
                r3 = 3;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x002f }
                r2.readException();	 Catch:{ all -> 0x002f }
                r0 = r2.readInt();	 Catch:{ all -> 0x002f }
                if (r0 == 0) goto L_0x0027;
            L_0x001d:
                r0 = com.google.android.gms.maps.model.VisibleRegion.CREATOR;	 Catch:{ all -> 0x002f }
                r0 = r0.do(r2);	 Catch:{ all -> 0x002f }
                r3 = com.google.android.gms.maps.internal.m.a.a;	 Catch:{ all -> 0x002f }
                if (r3 == 0) goto L_0x0028;
            L_0x0027:
                r0 = 0;
            L_0x0028:
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x002f:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IProjectionDelegate.a.a.getVisibleRegion():com.google.android.gms.maps.model.VisibleRegion");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.dynamic.d toScreenLocation(com.google.android.gms.maps.model.LatLng r6) {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.IProjectionDelegate";
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
                r3 = 2;
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IProjectionDelegate.a.a.toScreenLocation(com.google.android.gms.maps.model.LatLng):com.google.android.gms.dynamic.d");
            }
        }

        public static IProjectionDelegate bp(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IProjectionDelegate)) ? new a(iBinder) : (IProjectionDelegate) queryLocalInterface;
        }
    }

    VisibleRegion getVisibleRegion();

    d toScreenLocation(LatLng latLng);
}
