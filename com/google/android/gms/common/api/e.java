package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator {
    static void a(Scope scope, Parcel parcel, int i) {
        int H = b.H(parcel);
        b.c(parcel, 1, scope.CK);
        b.a(parcel, 2, scope.gO(), false);
        b.H(parcel, H);
    }

    public Scope[] am(int i) {
        return new Scope[i];
    }

    public Object createFromParcel(Parcel parcel) {
        return z(parcel);
    }

    public Object[] newArray(int i) {
        return am(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.common.api.Scope z(android.os.Parcel r7) {
        /*
        r6_this = this;
        r2 = com.google.android.gms.common.api.Api.a;
        r3 = com.google.android.gms.common.internal.safeparcel.a.G(r7);
        r1 = 0;
        r0 = 0;
    L_0x0008:
        r4 = r7.dataPosition();
        if (r4 >= r3) goto L_0x001e;
    L_0x000e:
        r4 = com.google.android.gms.common.internal.safeparcel.a.F(r7);
        r5 = com.google.android.gms.common.internal.safeparcel.a.aH(r4);
        switch(r5) {
            case 1: goto L_0x003f;
            case 2: goto L_0x0045;
            default: goto L_0x0019;
        };
    L_0x0019:
        com.google.android.gms.common.internal.safeparcel.a.b(r7, r4);	 Catch:{ a -> 0x004c }
    L_0x001c:
        if (r2 == 0) goto L_0x0008;
    L_0x001e:
        r2 = r7.dataPosition();	 Catch:{ a -> 0x003d }
        if (r2 == r3) goto L_0x004e;
    L_0x0024:
        r0 = new com.google.android.gms.common.internal.safeparcel.a$a;	 Catch:{ a -> 0x003d }
        r1 = new java.lang.StringBuilder;	 Catch:{ a -> 0x003d }
        r1.<init>();	 Catch:{ a -> 0x003d }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ a -> 0x003d }
        r1 = r1.append(r3);	 Catch:{ a -> 0x003d }
        r1 = r1.toString();	 Catch:{ a -> 0x003d }
        r0.<init>(r1, r7);	 Catch:{ a -> 0x003d }
        throw r0;	 Catch:{ a -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r1 = com.google.android.gms.common.internal.safeparcel.a.g(r7, r4);
        if (r2 == 0) goto L_0x001c;
    L_0x0045:
        r0 = com.google.android.gms.common.internal.safeparcel.a.o(r7, r4);
        if (r2 == 0) goto L_0x001c;
    L_0x004b:
        goto L_0x0019;
    L_0x004c:
        r0 = move-exception;
        throw r0;
    L_0x004e:
        r2 = new com.google.android.gms.common.api.Scope;
        r2.<init>(r1, r0);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.e.z(android.os.Parcel):com.google.android.gms.common.api.Scope");
    }
}
