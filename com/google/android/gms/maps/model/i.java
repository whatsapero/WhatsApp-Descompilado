package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class i implements Creator {
    static void a(LatLng latLng, Parcel parcel, int i) {
        int H = b.H(parcel);
        b.c(parcel, 1, latLng.getVersionCode());
        b.a(parcel, 2, latLng.latitude);
        b.a(parcel, 3, latLng.longitude);
        b.H(parcel, H);
    }

    public Object createFromParcel(Parcel parcel) {
        return de(parcel);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.model.LatLng de(android.os.Parcel r12) {
        /*
        r11_this = this;
        r0 = 0;
        r5 = com.google.android.gms.maps.model.LatLng.a;
        r6 = com.google.android.gms.common.internal.safeparcel.a.G(r12);
        r2 = 0;
        r4 = r2;
        r2 = r0;
    L_0x000b:
        r7 = r12.dataPosition();
        if (r7 >= r6) goto L_0x0021;
    L_0x0011:
        r7 = com.google.android.gms.common.internal.safeparcel.a.F(r12);
        r8 = com.google.android.gms.common.internal.safeparcel.a.aH(r7);
        switch(r8) {
            case 1: goto L_0x0045;
            case 2: goto L_0x004b;
            case 3: goto L_0x0051;
            default: goto L_0x001c;
        };
    L_0x001c:
        com.google.android.gms.common.internal.safeparcel.a.b(r12, r7);	 Catch:{ a -> 0x0058 }
    L_0x001f:
        if (r5 == 0) goto L_0x000b;
    L_0x0021:
        r9 = r0;
        r1 = r4;
        r4 = r9;
        r0 = r12.dataPosition();	 Catch:{ a -> 0x0043 }
        if (r0 == r6) goto L_0x005a;
    L_0x002a:
        r0 = new com.google.android.gms.common.internal.safeparcel.a$a;	 Catch:{ a -> 0x0043 }
        r1 = new java.lang.StringBuilder;	 Catch:{ a -> 0x0043 }
        r1.<init>();	 Catch:{ a -> 0x0043 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ a -> 0x0043 }
        r1 = r1.append(r6);	 Catch:{ a -> 0x0043 }
        r1 = r1.toString();	 Catch:{ a -> 0x0043 }
        r0.<init>(r1, r12);	 Catch:{ a -> 0x0043 }
        throw r0;	 Catch:{ a -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r4 = com.google.android.gms.common.internal.safeparcel.a.g(r12, r7);
        if (r5 == 0) goto L_0x001f;
    L_0x004b:
        r2 = com.google.android.gms.common.internal.safeparcel.a.m(r12, r7);
        if (r5 == 0) goto L_0x001f;
    L_0x0051:
        r0 = com.google.android.gms.common.internal.safeparcel.a.m(r12, r7);
        if (r5 == 0) goto L_0x001f;
    L_0x0057:
        goto L_0x001c;
    L_0x0058:
        r0 = move-exception;
        throw r0;
    L_0x005a:
        r0 = new com.google.android.gms.maps.model.LatLng;
        r0.<init>(r1, r2, r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.i.de(android.os.Parcel):com.google.android.gms.maps.model.LatLng");
    }

    public LatLng[] fa(int i) {
        return new LatLng[i];
    }

    public Object[] newArray(int i) {
        return fa(i);
    }
}
