package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class t implements Creator {
    static void a(StreetViewPanoramaOrientation streetViewPanoramaOrientation, Parcel parcel, int i) {
        int H = b.H(parcel);
        b.c(parcel, 1, streetViewPanoramaOrientation.getVersionCode());
        b.a(parcel, 2, streetViewPanoramaOrientation.tilt);
        b.a(parcel, 3, streetViewPanoramaOrientation.bearing);
        b.H(parcel, H);
    }

    public Object createFromParcel(Parcel parcel) {
        return dl(parcel);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.model.StreetViewPanoramaOrientation dl(android.os.Parcel r8) {
        /*
        r7_this = this;
        r0 = 0;
        r3 = com.google.android.gms.maps.model.LatLng.a;
        r4 = com.google.android.gms.common.internal.safeparcel.a.G(r8);
        r1 = 0;
        r2 = r1;
        r1 = r0;
    L_0x000a:
        r5 = r8.dataPosition();
        if (r5 >= r4) goto L_0x0020;
    L_0x0010:
        r5 = com.google.android.gms.common.internal.safeparcel.a.F(r8);
        r6 = com.google.android.gms.common.internal.safeparcel.a.aH(r5);
        switch(r6) {
            case 1: goto L_0x0041;
            case 2: goto L_0x0047;
            case 3: goto L_0x004d;
            default: goto L_0x001b;
        };
    L_0x001b:
        com.google.android.gms.common.internal.safeparcel.a.b(r8, r5);	 Catch:{ a -> 0x0054 }
    L_0x001e:
        if (r3 == 0) goto L_0x000a;
    L_0x0020:
        r3 = r8.dataPosition();	 Catch:{ a -> 0x003f }
        if (r3 == r4) goto L_0x0056;
    L_0x0026:
        r0 = new com.google.android.gms.common.internal.safeparcel.a$a;	 Catch:{ a -> 0x003f }
        r1 = new java.lang.StringBuilder;	 Catch:{ a -> 0x003f }
        r1.<init>();	 Catch:{ a -> 0x003f }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ a -> 0x003f }
        r1 = r1.append(r4);	 Catch:{ a -> 0x003f }
        r1 = r1.toString();	 Catch:{ a -> 0x003f }
        r0.<init>(r1, r8);	 Catch:{ a -> 0x003f }
        throw r0;	 Catch:{ a -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;
    L_0x0041:
        r2 = com.google.android.gms.common.internal.safeparcel.a.g(r8, r5);
        if (r3 == 0) goto L_0x001e;
    L_0x0047:
        r1 = com.google.android.gms.common.internal.safeparcel.a.l(r8, r5);
        if (r3 == 0) goto L_0x001e;
    L_0x004d:
        r0 = com.google.android.gms.common.internal.safeparcel.a.l(r8, r5);
        if (r3 == 0) goto L_0x001e;
    L_0x0053:
        goto L_0x001b;
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        r3 = new com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
        r3.<init>(r2, r1, r0);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.t.dl(android.os.Parcel):com.google.android.gms.maps.model.StreetViewPanoramaOrientation");
    }

    public StreetViewPanoramaOrientation[] fh(int i) {
        return new StreetViewPanoramaOrientation[i];
    }

    public Object[] newArray(int i) {
        return fh(i);
    }
}
