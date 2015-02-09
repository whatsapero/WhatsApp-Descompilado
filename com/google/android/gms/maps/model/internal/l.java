package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

public interface l extends IInterface {

    public abstract class a extends Binder implements l {
        public static int a;

        class a implements l {
            private IBinder le;

            a(IBinder iBinder) {
                this.le = iBinder;
            }

            public IBinder asBinder() {
                return this.le;
            }

            public String getId() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.maps.model.LatLng getPosition() {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x002f }
                r0 = r5.le;	 Catch:{ all -> 0x002f }
                r3 = 4;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x002f }
                r2.readException();	 Catch:{ all -> 0x002f }
                r0 = r2.readInt();	 Catch:{ all -> 0x002f }
                if (r0 == 0) goto L_0x0027;
            L_0x001d:
                r0 = com.google.android.gms.maps.model.LatLng.CREATOR;	 Catch:{ all -> 0x002f }
                r0 = r0.de(r2);	 Catch:{ all -> 0x002f }
                r3 = a;	 Catch:{ all -> 0x002f }
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.internal.l.a.a.getPosition():com.google.android.gms.maps.model.LatLng");
            }

            public boolean h(l lVar) {
                boolean z = false;
                int i = a;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    this.le.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    boolean z2 = obtain2.readInt() != 0;
                    obtain2.recycle();
                    obtain.recycle();
                    if (i != 0) {
                        if (!GoogleMap.a) {
                            z = true;
                        }
                        GoogleMap.a = z;
                    }
                    return z2;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int hashCodeRemote() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.le.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void hideInfoWindow() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.le.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void n(d dVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.le.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void setPosition(com.google.android.gms.maps.model.LatLng r6) {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0030 }
                if (r6 == 0) goto L_0x001b;
            L_0x000f:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0030 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0030 }
                r0 = a;	 Catch:{ all -> 0x0030 }
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.internal.l.a.a.setPosition(com.google.android.gms.maps.model.LatLng):void");
            }

            public void setVisible(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.le.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void showInfoWindow() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.le.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static l bA(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof l)) ? new a(iBinder) : (l) queryLocalInterface;
        }
    }

    String getId();

    LatLng getPosition();

    boolean h(l lVar);

    int hashCodeRemote();

    void hideInfoWindow();

    void n(d dVar);

    void setPosition(LatLng latLng);

    void setVisible(boolean z);

    void showInfoWindow();
}
