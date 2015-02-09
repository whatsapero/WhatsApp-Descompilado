package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

public interface jt extends IInterface {

    public abstract class a extends Binder implements jt {

        class a implements jt {
            private IBinder le;

            a(IBinder iBinder) {
                this.le = iBinder;
            }

            public IBinder asBinder() {
                return this.le;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void e(com.google.android.gms.internal.js r6, int r7, java.lang.String r8, android.os.Bundle r9) {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.common.internal.IGmsServiceBroker";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0042 }
                if (r6 == 0) goto L_0x0040;
            L_0x000f:
                r0 = r6.asBinder();	 Catch:{ all -> 0x0042 }
            L_0x0013:
                r1.writeStrongBinder(r0);	 Catch:{ all -> 0x0042 }
                r1.writeInt(r7);	 Catch:{ all -> 0x0042 }
                r1.writeString(r8);	 Catch:{ all -> 0x0042 }
                if (r9 == 0) goto L_0x002a;
            L_0x001e:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0042 }
                r0 = 0;
                r9.writeToParcel(r1, r0);	 Catch:{ all -> 0x0042 }
                r0 = com.google.android.gms.internal.qw.a;	 Catch:{ all -> 0x0042 }
                if (r0 == 0) goto L_0x002e;
            L_0x002a:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0042 }
            L_0x002e:
                r0 = r5.le;	 Catch:{ all -> 0x0042 }
                r3 = 8;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0042 }
                r2.readException();	 Catch:{ all -> 0x0042 }
                r2.recycle();
                r1.recycle();
                return;
            L_0x0040:
                r0 = 0;
                goto L_0x0013;
            L_0x0042:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jt.a.a.e(com.google.android.gms.internal.js, int, java.lang.String, android.os.Bundle):void");
            }
        }

        public static jt Q(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof jt)) ? new a(iBinder) : (jt) queryLocalInterface;
        }
    }

    void e(js jsVar, int i, String str, Bundle bundle);
}
