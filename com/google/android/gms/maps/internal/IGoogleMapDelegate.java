package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.internal.l;

public interface IGoogleMapDelegate extends IInterface {

    public abstract class a extends Binder implements IGoogleMapDelegate {

        class a implements IGoogleMapDelegate {
            private IBinder le;

            a(IBinder iBinder) {
                this.le = iBinder;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.maps.model.internal.l addMarker(com.google.android.gms.maps.model.MarkerOptions r6) {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
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
                r3 = 11;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0039 }
                r2.readException();	 Catch:{ all -> 0x0039 }
                r0 = r2.readStrongBinder();	 Catch:{ all -> 0x0039 }
                r0 = com.google.android.gms.maps.model.internal.l.a.bA(r0);	 Catch:{ all -> 0x0039 }
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x0039:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IGoogleMapDelegate.a.a.addMarker(com.google.android.gms.maps.model.MarkerOptions):com.google.android.gms.maps.model.internal.l");
            }

            public void animateCamera(d dVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.le;
            }

            public void clear() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.le.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.maps.model.CameraPosition getCameraPosition() {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x002f }
                r0 = r5.le;	 Catch:{ all -> 0x002f }
                r3 = 1;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x002f }
                r2.readException();	 Catch:{ all -> 0x002f }
                r0 = r2.readInt();	 Catch:{ all -> 0x002f }
                if (r0 == 0) goto L_0x0027;
            L_0x001d:
                r0 = com.google.android.gms.maps.model.CameraPosition.CREATOR;	 Catch:{ all -> 0x002f }
                r0 = r0.da(r2);	 Catch:{ all -> 0x002f }
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IGoogleMapDelegate.a.a.getCameraPosition():com.google.android.gms.maps.model.CameraPosition");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.location.Location getMyLocation() {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0032 }
                r0 = r5.le;	 Catch:{ all -> 0x0032 }
                r3 = 23;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0032 }
                r2.readException();	 Catch:{ all -> 0x0032 }
                r0 = r2.readInt();	 Catch:{ all -> 0x0032 }
                if (r0 == 0) goto L_0x002a;
            L_0x001e:
                r0 = android.location.Location.CREATOR;	 Catch:{ all -> 0x0032 }
                r0 = r0.createFromParcel(r2);	 Catch:{ all -> 0x0032 }
                r0 = (android.location.Location) r0;	 Catch:{ all -> 0x0032 }
                r3 = com.google.android.gms.maps.internal.m.a.a;	 Catch:{ all -> 0x0032 }
                if (r3 == 0) goto L_0x002b;
            L_0x002a:
                r0 = 0;
            L_0x002b:
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x0032:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IGoogleMapDelegate.a.a.getMyLocation():android.location.Location");
            }

            public IProjectionDelegate getProjection() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.le.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    IProjectionDelegate bp = com.google.android.gms.maps.internal.IProjectionDelegate.a.bp(obtain2.readStrongBinder());
                    return bp;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IUiSettingsDelegate getUiSettings() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.le.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    IUiSettingsDelegate bu = com.google.android.gms.maps.internal.IUiSettingsDelegate.a.bu(obtain2.readStrongBinder());
                    return bu;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isTrafficEnabled() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.le.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void moveCamera(d dVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean setIndoorEnabled(boolean z) {
                boolean z2 = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.le.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z2;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setMapType(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(i);
                    this.le.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setMyLocationEnabled(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.le.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnCameraChangeListener(f fVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    this.le.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnInfoWindowClickListener(h hVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    this.le.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnMapClickListener(j jVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.le.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnMarkerClickListener(n nVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(nVar != null ? nVar.asBinder() : null);
                    this.le.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setTrafficEnabled(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.le.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void stopAnimation() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IGoogleMapDelegate aT(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IGoogleMapDelegate)) ? new a(iBinder) : (IGoogleMapDelegate) queryLocalInterface;
        }
    }

    l addMarker(MarkerOptions markerOptions);

    void animateCamera(d dVar);

    void clear();

    CameraPosition getCameraPosition();

    Location getMyLocation();

    IProjectionDelegate getProjection();

    IUiSettingsDelegate getUiSettings();

    boolean isTrafficEnabled();

    void moveCamera(d dVar);

    boolean setIndoorEnabled(boolean z);

    void setMapType(int i);

    void setMyLocationEnabled(boolean z);

    void setOnCameraChangeListener(f fVar);

    void setOnInfoWindowClickListener(h hVar);

    void setOnMapClickListener(j jVar);

    void setOnMarkerClickListener(n nVar);

    void setTrafficEnabled(boolean z);

    void stopAnimation();
}
