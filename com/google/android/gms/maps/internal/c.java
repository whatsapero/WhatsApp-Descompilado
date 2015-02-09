package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.internal.g;

public interface c extends IInterface {

    public abstract class a extends Binder implements c {

        class a implements c {
            private IBinder le;

            a(IBinder iBinder) {
                this.le = iBinder;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.maps.internal.IMapViewDelegate a(com.google.android.gms.dynamic.d r6, com.google.android.gms.maps.GoogleMapOptions r7) {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.ICreator";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0043 }
                if (r6 == 0) goto L_0x0041;
            L_0x000f:
                r0 = r6.asBinder();	 Catch:{ all -> 0x0043 }
            L_0x0013:
                r1.writeStrongBinder(r0);	 Catch:{ all -> 0x0043 }
                if (r7 == 0) goto L_0x0024;
            L_0x0018:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0043 }
                r0 = 0;
                r7.writeToParcel(r1, r0);	 Catch:{ all -> 0x0043 }
                r0 = com.google.android.gms.maps.internal.m.a.a;	 Catch:{ all -> 0x0043 }
                if (r0 == 0) goto L_0x0028;
            L_0x0024:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0043 }
            L_0x0028:
                r0 = r5.le;	 Catch:{ all -> 0x0043 }
                r3 = 3;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0043 }
                r2.readException();	 Catch:{ all -> 0x0043 }
                r0 = r2.readStrongBinder();	 Catch:{ all -> 0x0043 }
                r0 = com.google.android.gms.maps.internal.IMapViewDelegate.a.aY(r0);	 Catch:{ all -> 0x0043 }
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x0041:
                r0 = 0;
                goto L_0x0013;
            L_0x0043:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.c.a.a.a(com.google.android.gms.dynamic.d, com.google.android.gms.maps.GoogleMapOptions):com.google.android.gms.maps.internal.IMapViewDelegate");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate a(com.google.android.gms.dynamic.d r6, com.google.android.gms.maps.StreetViewPanoramaOptions r7) {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.ICreator";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0043 }
                if (r6 == 0) goto L_0x0041;
            L_0x000f:
                r0 = r6.asBinder();	 Catch:{ all -> 0x0043 }
            L_0x0013:
                r1.writeStrongBinder(r0);	 Catch:{ all -> 0x0043 }
                if (r7 == 0) goto L_0x0024;
            L_0x0018:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0043 }
                r0 = 0;
                r7.writeToParcel(r1, r0);	 Catch:{ all -> 0x0043 }
                r0 = com.google.android.gms.maps.internal.m.a.a;	 Catch:{ all -> 0x0043 }
                if (r0 == 0) goto L_0x0028;
            L_0x0024:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0043 }
            L_0x0028:
                r0 = r5.le;	 Catch:{ all -> 0x0043 }
                r3 = 7;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0043 }
                r2.readException();	 Catch:{ all -> 0x0043 }
                r0 = r2.readStrongBinder();	 Catch:{ all -> 0x0043 }
                r0 = com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate.a.bt(r0);	 Catch:{ all -> 0x0043 }
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x0041:
                r0 = 0;
                goto L_0x0013;
            L_0x0043:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.c.a.a.a(com.google.android.gms.dynamic.d, com.google.android.gms.maps.StreetViewPanoramaOptions):com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            }

            public void a(d dVar, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    obtain.writeInt(i);
                    this.le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.le;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.maps.internal.IMapFragmentDelegate j(com.google.android.gms.dynamic.d r6) {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.ICreator";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0031 }
                if (r6 == 0) goto L_0x002f;
            L_0x000f:
                r0 = r6.asBinder();	 Catch:{ all -> 0x0031 }
            L_0x0013:
                r1.writeStrongBinder(r0);	 Catch:{ all -> 0x0031 }
                r0 = r5.le;	 Catch:{ all -> 0x0031 }
                r3 = 2;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0031 }
                r2.readException();	 Catch:{ all -> 0x0031 }
                r0 = r2.readStrongBinder();	 Catch:{ all -> 0x0031 }
                r0 = com.google.android.gms.maps.internal.IMapFragmentDelegate.a.aX(r0);	 Catch:{ all -> 0x0031 }
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x002f:
                r0 = 0;
                goto L_0x0013;
            L_0x0031:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.c.a.a.j(com.google.android.gms.dynamic.d):com.google.android.gms.maps.internal.IMapFragmentDelegate");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate k(com.google.android.gms.dynamic.d r6) {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.ICreator";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0032 }
                if (r6 == 0) goto L_0x0030;
            L_0x000f:
                r0 = r6.asBinder();	 Catch:{ all -> 0x0032 }
            L_0x0013:
                r1.writeStrongBinder(r0);	 Catch:{ all -> 0x0032 }
                r0 = r5.le;	 Catch:{ all -> 0x0032 }
                r3 = 8;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0032 }
                r2.readException();	 Catch:{ all -> 0x0032 }
                r0 = r2.readStrongBinder();	 Catch:{ all -> 0x0032 }
                r0 = com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate.a.bs(r0);	 Catch:{ all -> 0x0032 }
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x0030:
                r0 = 0;
                goto L_0x0013;
            L_0x0032:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.c.a.a.k(com.google.android.gms.dynamic.d):com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            }

            public ICameraUpdateFactoryDelegate nW() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    this.le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    ICameraUpdateFactoryDelegate aQ = com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate.a.aQ(obtain2.readStrongBinder());
                    return aQ;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public g nX() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    this.le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    g bv = com.google.android.gms.maps.model.internal.g.a.bv(obtain2.readStrongBinder());
                    return bv;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static c aS(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof c)) ? new a(iBinder) : (c) queryLocalInterface;
        }
    }

    IMapViewDelegate a(d dVar, GoogleMapOptions googleMapOptions);

    IStreetViewPanoramaViewDelegate a(d dVar, StreetViewPanoramaOptions streetViewPanoramaOptions);

    void a(d dVar, int i);

    IMapFragmentDelegate j(d dVar);

    IStreetViewPanoramaFragmentDelegate k(d dVar);

    ICameraUpdateFactoryDelegate nW();

    g nX();
}
