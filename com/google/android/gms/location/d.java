package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.LocationServices.a;

public class d implements Creator {
    static void a(LocationRequest locationRequest, Parcel parcel, int i) {
        int i2 = LocationServices.a;
        int H = b.H(parcel);
        b.c(parcel, 1, locationRequest.mPriority);
        b.c(parcel, 1000, locationRequest.getVersionCode());
        b.a(parcel, 2, locationRequest.agr);
        b.a(parcel, 3, locationRequest.ags);
        b.a(parcel, 4, locationRequest.Wg);
        b.a(parcel, 5, locationRequest.age);
        b.c(parcel, 6, locationRequest.agt);
        b.a(parcel, 7, locationRequest.agu);
        b.a(parcel, 8, locationRequest.agv);
        b.H(parcel, H);
        if (i2 != 0) {
            a.a++;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.location.LocationRequest cJ(android.os.Parcel r25) {
        /*
        r24_this = this;
        r15 = com.google.android.gms.location.LocationServices.a;
        r16 = com.google.android.gms.common.internal.safeparcel.a.G(r25);
        r14 = 0;
        r9 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r12 = 3600000; // 0x36ee80 float:5.044674E-39 double:1.7786363E-317;
        r10 = 600000; // 0x927c0 float:8.40779E-40 double:2.964394E-318;
        r8 = 0;
        r6 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r4 = 0;
        r2 = 0;
    L_0x001b:
        r17 = r25.dataPosition();
        r0 = r17;
        r1 = r16;
        if (r0 >= r1) goto L_0x0039;
    L_0x0025:
        r17 = com.google.android.gms.common.internal.safeparcel.a.F(r25);
        r18 = com.google.android.gms.common.internal.safeparcel.a.aH(r17);
        switch(r18) {
            case 1: goto L_0x0072;
            case 2: goto L_0x0086;
            case 3: goto L_0x0090;
            case 4: goto L_0x009a;
            case 5: goto L_0x00a4;
            case 6: goto L_0x00ae;
            case 7: goto L_0x00b8;
            case 8: goto L_0x00c2;
            case 1000: goto L_0x007c;
            default: goto L_0x0030;
        };
    L_0x0030:
        r0 = r25;
        r1 = r17;
        com.google.android.gms.common.internal.safeparcel.a.b(r0, r1);	 Catch:{ a -> 0x00ce }
    L_0x0037:
        if (r15 == 0) goto L_0x001b;
    L_0x0039:
        r19 = r2;
        r3 = r14;
        r14 = r19;
        r21 = r5;
        r22 = r6;
        r5 = r12;
        r12 = r21;
        r13 = r4;
        r4 = r9;
        r9 = r8;
        r7 = r10;
        r10 = r22;
        r2 = r25.dataPosition();	 Catch:{ a -> 0x0070 }
        r0 = r16;
        if (r2 == r0) goto L_0x00d0;
    L_0x0053:
        r2 = new com.google.android.gms.common.internal.safeparcel.a$a;	 Catch:{ a -> 0x0070 }
        r3 = new java.lang.StringBuilder;	 Catch:{ a -> 0x0070 }
        r3.<init>();	 Catch:{ a -> 0x0070 }
        r4 = "Overread allowed size end=";
        r3 = r3.append(r4);	 Catch:{ a -> 0x0070 }
        r0 = r16;
        r3 = r3.append(r0);	 Catch:{ a -> 0x0070 }
        r3 = r3.toString();	 Catch:{ a -> 0x0070 }
        r0 = r25;
        r2.<init>(r3, r0);	 Catch:{ a -> 0x0070 }
        throw r2;	 Catch:{ a -> 0x0070 }
    L_0x0070:
        r2 = move-exception;
        throw r2;
    L_0x0072:
        r0 = r25;
        r1 = r17;
        r9 = com.google.android.gms.common.internal.safeparcel.a.g(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x007c:
        r0 = r25;
        r1 = r17;
        r14 = com.google.android.gms.common.internal.safeparcel.a.g(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x0086:
        r0 = r25;
        r1 = r17;
        r12 = com.google.android.gms.common.internal.safeparcel.a.i(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x0090:
        r0 = r25;
        r1 = r17;
        r10 = com.google.android.gms.common.internal.safeparcel.a.i(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x009a:
        r0 = r25;
        r1 = r17;
        r8 = com.google.android.gms.common.internal.safeparcel.a.c(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x00a4:
        r0 = r25;
        r1 = r17;
        r6 = com.google.android.gms.common.internal.safeparcel.a.i(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x00ae:
        r0 = r25;
        r1 = r17;
        r5 = com.google.android.gms.common.internal.safeparcel.a.g(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x00b8:
        r0 = r25;
        r1 = r17;
        r4 = com.google.android.gms.common.internal.safeparcel.a.l(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x00c2:
        r0 = r25;
        r1 = r17;
        r2 = com.google.android.gms.common.internal.safeparcel.a.i(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x00cc:
        goto L_0x0030;
    L_0x00ce:
        r2 = move-exception;
        throw r2;
    L_0x00d0:
        r2 = new com.google.android.gms.location.LocationRequest;
        r2.<init>(r3, r4, r5, r7, r9, r10, r12, r13, r14);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.d.cJ(android.os.Parcel):com.google.android.gms.location.LocationRequest");
    }

    public Object createFromParcel(Parcel parcel) {
        return cJ(parcel);
    }

    public LocationRequest[] eA(int i) {
        return new LocationRequest[i];
    }

    public Object[] newArray(int i) {
        return eA(i);
    }
}
