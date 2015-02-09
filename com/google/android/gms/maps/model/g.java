package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class g implements Creator {
    static void a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int H = b.H(parcel);
        b.c(parcel, 1, latLngBounds.getVersionCode());
        b.a(parcel, 2, latLngBounds.southwest, i, false);
        b.a(parcel, 3, latLngBounds.northeast, i, false);
        b.H(parcel, H);
    }

    public Object createFromParcel(Parcel parcel) {
        return dd(parcel);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.model.LatLngBounds dd(android.os.Parcel r9) {
        /*
        r8_this = this;
        r0 = 0;
        r3 = com.google.android.gms.maps.model.LatLng.a;
        r4 = com.google.android.gms.common.internal.safeparcel.a.G(r9);
        r1 = 0;
        r2 = r1;
        r1 = r0;
    L_0x000a:
        r5 = r9.dataPosition();
        if (r5 >= r4) goto L_0x006c;
    L_0x0010:
        r5 = com.google.android.gms.common.internal.safeparcel.a.F(r9);
        r6 = com.google.android.gms.common.internal.safeparcel.a.aH(r5);
        switch(r6) {
            case 1: goto L_0x0044;
            case 2: goto L_0x004a;
            case 3: goto L_0x0054;
            default: goto L_0x001b;
        };
    L_0x001b:
        r7 = r1;
        r1 = r0;
        r0 = r7;
    L_0x001e:
        com.google.android.gms.common.internal.safeparcel.a.b(r9, r5);	 Catch:{ a -> 0x0060 }
    L_0x0021:
        if (r3 == 0) goto L_0x0070;
    L_0x0023:
        r3 = r9.dataPosition();	 Catch:{ a -> 0x0042 }
        if (r3 == r4) goto L_0x0062;
    L_0x0029:
        r0 = new com.google.android.gms.common.internal.safeparcel.a$a;	 Catch:{ a -> 0x0042 }
        r1 = new java.lang.StringBuilder;	 Catch:{ a -> 0x0042 }
        r1.<init>();	 Catch:{ a -> 0x0042 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ a -> 0x0042 }
        r1 = r1.append(r4);	 Catch:{ a -> 0x0042 }
        r1 = r1.toString();	 Catch:{ a -> 0x0042 }
        r0.<init>(r1, r9);	 Catch:{ a -> 0x0042 }
        throw r0;	 Catch:{ a -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r2 = com.google.android.gms.common.internal.safeparcel.a.g(r9, r5);
        if (r3 == 0) goto L_0x0068;
    L_0x004a:
        r0 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.a.a(r9, r5, r0);
        r0 = (com.google.android.gms.maps.model.LatLng) r0;
        if (r3 == 0) goto L_0x0068;
    L_0x0054:
        r1 = r0;
        r0 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.a.a(r9, r5, r0);
        r0 = (com.google.android.gms.maps.model.LatLng) r0;
        if (r3 == 0) goto L_0x0021;
    L_0x005f:
        goto L_0x001e;
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r3 = new com.google.android.gms.maps.model.LatLngBounds;
        r3.<init>(r2, r1, r0);
        return r3;
    L_0x0068:
        r7 = r1;
        r1 = r0;
        r0 = r7;
        goto L_0x0021;
    L_0x006c:
        r7 = r1;
        r1 = r0;
        r0 = r7;
        goto L_0x0023;
    L_0x0070:
        r7 = r0;
        r0 = r1;
        r1 = r7;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.g.dd(android.os.Parcel):com.google.android.gms.maps.model.LatLngBounds");
    }

    public LatLngBounds[] eZ(int i) {
        return new LatLngBounds[i];
    }

    public Object[] newArray(int i) {
        return eZ(i);
    }
}
