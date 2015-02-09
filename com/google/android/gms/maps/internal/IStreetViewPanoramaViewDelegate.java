package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;

public interface IStreetViewPanoramaViewDelegate extends IInterface {

    public abstract class a extends Binder implements IStreetViewPanoramaViewDelegate {

        class a implements IStreetViewPanoramaViewDelegate {
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    obtain.writeStrongBinder(uVar != null ? uVar.asBinder() : null);
                    this.le.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public d getView() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    d ap = com.google.android.gms.dynamic.d.a.ap(obtain2.readStrongBinder());
                    return ap;
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
                r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate";
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
                r3 = 2;
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate.a.a.onCreate(android.os.Bundle):void");
            }

            public void onDestroy() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onLowMemory() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.le.transact(6, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.le.transact(4, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.le.transact(3, obtain, obtain2, 0);
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
                r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate";
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
                r3 = 7;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0039 }
                r2.readException();	 Catch:{ all -> 0x0039 }
                r0 = r2.readInt();	 Catch:{ all -> 0x0039 }
                if (r0 == 0) goto L_0x0032;
            L_0x002f:
                r6.readFromParcel(r2);	 Catch:{ all -> 0x0039 }
            L_0x0032:
                r2.recycle();
                r1.recycle();
                return;
            L_0x0039:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate.a.a.onSaveInstanceState(android.os.Bundle):void");
            }
        }

        public static IStreetViewPanoramaViewDelegate bt(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IStreetViewPanoramaViewDelegate)) ? new a(iBinder) : (IStreetViewPanoramaViewDelegate) queryLocalInterface;
        }
    }

    void getStreetViewPanoramaAsync(u uVar);

    d getView();

    void onCreate(Bundle bundle);

    void onDestroy();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);
}
