package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

public interface js extends IInterface {

    public abstract class a extends Binder implements js {
        public a() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) {
            /*
            r5_this = this;
            r1 = 1;
            switch(r6) {
                case 1: goto L_0x0010;
                case 1598968902: goto L_0x0009;
                default: goto L_0x0004;
            };
        L_0x0004:
            r0 = super.onTransact(r6, r7, r8, r9);
        L_0x0008:
            return r0;
        L_0x0009:
            r0 = "com.google.android.gms.common.internal.IGmsCallbacks";
            r8.writeString(r0);
            r0 = r1;
            goto L_0x0008;
        L_0x0010:
            r0 = "com.google.android.gms.common.internal.IGmsCallbacks";
            r7.enforceInterface(r0);
            r2 = r7.readInt();
            r3 = r7.readStrongBinder();
            r0 = r7.readInt();
            if (r0 == 0) goto L_0x002f;
        L_0x0023:
            r0 = android.os.Bundle.CREATOR;
            r0 = r0.createFromParcel(r7);
            r0 = (android.os.Bundle) r0;
            r4 = com.google.android.gms.internal.qw.a;
            if (r4 == 0) goto L_0x0030;
        L_0x002f:
            r0 = 0;
        L_0x0030:
            r5.b(r2, r3, r0);
            r8.writeNoException();
            r0 = r1;
            goto L_0x0008;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.js.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void b(int i, IBinder iBinder, Bundle bundle);
}
