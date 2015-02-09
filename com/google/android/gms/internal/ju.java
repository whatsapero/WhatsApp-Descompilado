package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.d;

public interface ju extends IInterface {

    public abstract class a extends Binder implements ju {

        class a implements ju {
            private IBinder le;

            a(IBinder iBinder) {
                this.le = iBinder;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.dynamic.d a(com.google.android.gms.dynamic.d r6, int r7, int r8) {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.common.internal.ISignInButtonCreator";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0037 }
                if (r6 == 0) goto L_0x0035;
            L_0x000f:
                r0 = r6.asBinder();	 Catch:{ all -> 0x0037 }
            L_0x0013:
                r1.writeStrongBinder(r0);	 Catch:{ all -> 0x0037 }
                r1.writeInt(r7);	 Catch:{ all -> 0x0037 }
                r1.writeInt(r8);	 Catch:{ all -> 0x0037 }
                r0 = r5.le;	 Catch:{ all -> 0x0037 }
                r3 = 1;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0037 }
                r2.readException();	 Catch:{ all -> 0x0037 }
                r0 = r2.readStrongBinder();	 Catch:{ all -> 0x0037 }
                r0 = com.google.android.gms.dynamic.d.a.ap(r0);	 Catch:{ all -> 0x0037 }
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x0035:
                r0 = 0;
                goto L_0x0013;
            L_0x0037:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ju.a.a.a(com.google.android.gms.dynamic.d, int, int):com.google.android.gms.dynamic.d");
            }

            public IBinder asBinder() {
                return this.le;
            }
        }

        public static ju R(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ju)) ? new a(iBinder) : (ju) queryLocalInterface;
        }
    }

    d a(d dVar, int i, int i2);
}
