package com.google.android.gms.internal;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.b;

public interface ni extends IInterface {

    public abstract class a extends Binder implements ni {

        class a implements ni {
            private IBinder le;

            a(IBinder iBinder) {
                this.le = iBinder;
            }

            public void S(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.le.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(LocationRequest locationRequest, b bVar) {
                int i = nc.a;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequest != null) {
                        obtain.writeInt(1);
                        locationRequest.writeToParcel(obtain, 0);
                        if (i != 0) {
                            com.google.android.gms.location.LocationServices.a.a++;
                        }
                        obtain.writeStrongBinder(bVar == null ? bVar.asBinder() : null);
                        this.le.transact(8, obtain, obtain2, 0);
                        obtain2.readException();
                    }
                    obtain.writeInt(0);
                    if (bVar == null) {
                    }
                    obtain.writeStrongBinder(bVar == null ? bVar.asBinder() : null);
                    this.le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.le.transact(10, obtain, obtain2, 0);
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
            public android.location.Location bZ(java.lang.String r7) {
                /*
                r6_this = this;
                r1 = com.google.android.gms.internal.nc.a;
                r2 = android.os.Parcel.obtain();
                r3 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
                r2.writeInterfaceToken(r0);	 Catch:{ all -> 0x003d }
                r2.writeString(r7);	 Catch:{ all -> 0x003d }
                r0 = r6.le;	 Catch:{ all -> 0x003d }
                r4 = 21;
                r5 = 0;
                r0.transact(r4, r2, r3, r5);	 Catch:{ all -> 0x003d }
                r3.readException();	 Catch:{ all -> 0x003d }
                r0 = r3.readInt();	 Catch:{ all -> 0x003d }
                if (r0 == 0) goto L_0x002d;
            L_0x0023:
                r0 = android.location.Location.CREATOR;	 Catch:{ all -> 0x003d }
                r0 = r0.createFromParcel(r3);	 Catch:{ all -> 0x003d }
                r0 = (android.location.Location) r0;	 Catch:{ all -> 0x003d }
                if (r1 == 0) goto L_0x002e;
            L_0x002d:
                r0 = 0;
            L_0x002e:
                r3.recycle();
                r2.recycle();
                r2 = com.google.android.gms.location.LocationServices.a.a;
                if (r2 == 0) goto L_0x003c;
            L_0x0038:
                r1 = r1 + 1;
                com.google.android.gms.internal.nc.a = r1;
            L_0x003c:
                return r0;
            L_0x003d:
                r0 = move-exception;
                r3.recycle();
                r2.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ni.a.a.bZ(java.lang.String):android.location.Location");
            }
        }

        public static ni aO(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ni)) ? new a(iBinder) : (ni) queryLocalInterface;
        }
    }

    void S(boolean z);

    void a(LocationRequest locationRequest, b bVar);

    void a(b bVar);

    Location bZ(String str);
}
