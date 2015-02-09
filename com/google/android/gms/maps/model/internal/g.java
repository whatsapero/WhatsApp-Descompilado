package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.d;

public interface g extends IInterface {

    public abstract class a extends Binder implements g {

        class a implements g {
            private IBinder le;

            a(IBinder iBinder) {
                this.le = iBinder;
            }

            public IBinder asBinder() {
                return this.le;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.dynamic.d b(android.graphics.Bitmap r7) {
                /*
                r6_this = this;
                r0 = com.google.android.gms.maps.model.internal.l.a.a;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r3 = "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate";
                r1.writeInterfaceToken(r3);	 Catch:{ all -> 0x0040 }
                if (r7 == 0) goto L_0x001b;
            L_0x0011:
                r3 = 1;
                r1.writeInt(r3);	 Catch:{ all -> 0x0040 }
                r3 = 0;
                r7.writeToParcel(r1, r3);	 Catch:{ all -> 0x0040 }
                if (r0 == 0) goto L_0x001f;
            L_0x001b:
                r3 = 0;
                r1.writeInt(r3);	 Catch:{ all -> 0x0040 }
            L_0x001f:
                r3 = r6.le;	 Catch:{ all -> 0x0040 }
                r4 = 6;
                r5 = 0;
                r3.transact(r4, r1, r2, r5);	 Catch:{ all -> 0x0040 }
                r2.readException();	 Catch:{ all -> 0x0040 }
                r3 = r2.readStrongBinder();	 Catch:{ all -> 0x0040 }
                r3 = com.google.android.gms.dynamic.d.a.ap(r3);	 Catch:{ all -> 0x0040 }
                r2.recycle();
                r1.recycle();
                r1 = com.google.android.gms.maps.GoogleMap.a;
                if (r1 == 0) goto L_0x003f;
            L_0x003b:
                r0 = r0 + 1;
                com.google.android.gms.maps.model.internal.l.a.a = r0;
            L_0x003f:
                return r3;
            L_0x0040:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.internal.g.a.a.b(android.graphics.Bitmap):com.google.android.gms.dynamic.d");
            }
        }

        public static g bv(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof g)) ? new a(iBinder) : (g) queryLocalInterface;
        }
    }

    d b(Bitmap bitmap);
}
