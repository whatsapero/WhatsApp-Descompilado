package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public interface IStreetViewPanoramaFragmentDelegate extends IInterface {

    public abstract class a extends Binder implements IStreetViewPanoramaFragmentDelegate {

        class a implements IStreetViewPanoramaFragmentDelegate {
            private IBinder le;

            a(IBinder iBinder) {
                this.le = iBinder;
            }

            public IBinder asBinder() {
                return this.le;
            }

            public void getStreetViewPanoramaAsync(u uVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    obtain.writeStrongBinder(uVar != null ? uVar.asBinder() : null);
                    this.le.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCreate(android.os.Bundle r6) {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0030 }
                if (r6 == 0) goto L_0x001b;
            L_0x000f:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0030 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0030 }
                r0 = com.google.android.gms.maps.internal.m.a.a;	 Catch:{ all -> 0x0030 }
                if (r0 == 0) goto L_0x001f;
            L_0x001b:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0030 }
            L_0x001f:
                r0 = r5.le;	 Catch:{ all -> 0x0030 }
                r3 = 3;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0030 }
                r2.readException();	 Catch:{ all -> 0x0030 }
                r2.recycle();
                r1.recycle();
                return;
            L_0x0030:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate.a.a.onCreate(android.os.Bundle):void");
            }

            public d onCreateView(d dVar, d dVar2, Bundle bundle) {
                IBinder iBinder = null;
                d dVar3 = false;
                int i = com.google.android.gms.maps.internal.m.a.a;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (dVar2 != null) {
                        iBinder = dVar2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                        if (i != 0) {
                            boolean z;
                            if (!GoogleMap.a) {
                                z = true;
                            }
                            GoogleMap.a = z;
                        }
                        this.le.transact(4, obtain, obtain2, 0);
                        obtain2.readException();
                        dVar3 = com.google.android.gms.dynamic.d.a.ap(obtain2.readStrongBinder());
                        return dVar3;
                    }
                    obtain.writeInt(0);
                    this.le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    dVar3 = com.google.android.gms.dynamic.d.a.ap(obtain2.readStrongBinder());
                    return dVar3;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onDestroy() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onDestroyView() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.le.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onInflate(com.google.android.gms.dynamic.d r6, com.google.android.gms.maps.StreetViewPanoramaOptions r7, android.os.Bundle r8) {
                /*
                r5_this = this;
                r1 = com.google.android.gms.maps.internal.m.a.a;
                r2 = android.os.Parcel.obtain();
                r3 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
                r2.writeInterfaceToken(r0);	 Catch:{ all -> 0x004b }
                if (r6 == 0) goto L_0x0049;
            L_0x0011:
                r0 = r6.asBinder();	 Catch:{ all -> 0x004b }
            L_0x0015:
                r2.writeStrongBinder(r0);	 Catch:{ all -> 0x004b }
                if (r7 == 0) goto L_0x0024;
            L_0x001a:
                r0 = 1;
                r2.writeInt(r0);	 Catch:{ all -> 0x004b }
                r0 = 0;
                r7.writeToParcel(r2, r0);	 Catch:{ all -> 0x004b }
                if (r1 == 0) goto L_0x0028;
            L_0x0024:
                r0 = 0;
                r2.writeInt(r0);	 Catch:{ all -> 0x004b }
            L_0x0028:
                if (r8 == 0) goto L_0x0034;
            L_0x002a:
                r0 = 1;
                r2.writeInt(r0);	 Catch:{ all -> 0x004b }
                r0 = 0;
                r8.writeToParcel(r2, r0);	 Catch:{ all -> 0x004b }
                if (r1 == 0) goto L_0x0038;
            L_0x0034:
                r0 = 0;
                r2.writeInt(r0);	 Catch:{ all -> 0x004b }
            L_0x0038:
                r0 = r5.le;	 Catch:{ all -> 0x004b }
                r1 = 2;
                r4 = 0;
                r0.transact(r1, r2, r3, r4);	 Catch:{ all -> 0x004b }
                r3.readException();	 Catch:{ all -> 0x004b }
                r3.recycle();
                r2.recycle();
                return;
            L_0x0049:
                r0 = 0;
                goto L_0x0015;
            L_0x004b:
                r0 = move-exception;
                r3.recycle();
                r2.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate.a.a.onInflate(com.google.android.gms.dynamic.d, com.google.android.gms.maps.StreetViewPanoramaOptions, android.os.Bundle):void");
            }

            public void onLowMemory() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.le.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onPause() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onResume() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onSaveInstanceState(android.os.Bundle r6) {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x003a }
                if (r6 == 0) goto L_0x001b;
            L_0x000f:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x003a }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x003a }
                r0 = com.google.android.gms.maps.internal.m.a.a;	 Catch:{ all -> 0x003a }
                if (r0 == 0) goto L_0x001f;
            L_0x001b:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x003a }
            L_0x001f:
                r0 = r5.le;	 Catch:{ all -> 0x003a }
                r3 = 10;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x003a }
                r2.readException();	 Catch:{ all -> 0x003a }
                r0 = r2.readInt();	 Catch:{ all -> 0x003a }
                if (r0 == 0) goto L_0x0033;
            L_0x0030:
                r6.readFromParcel(r2);	 Catch:{ all -> 0x003a }
            L_0x0033:
                r2.recycle();
                r1.recycle();
                return;
            L_0x003a:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate.a.a.onSaveInstanceState(android.os.Bundle):void");
            }
        }

        public static IStreetViewPanoramaFragmentDelegate bs(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IStreetViewPanoramaFragmentDelegate)) ? new a(iBinder) : (IStreetViewPanoramaFragmentDelegate) queryLocalInterface;
        }
    }

    void getStreetViewPanoramaAsync(u uVar);

    void onCreate(Bundle bundle);

    d onCreateView(d dVar, d dVar2, Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onInflate(d dVar, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle);

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);
}
