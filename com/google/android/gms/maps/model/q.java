package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class q implements Creator {
    static void a(StreetViewPanoramaCamera streetViewPanoramaCamera, Parcel parcel, int i) {
        int H = b.H(parcel);
        b.c(parcel, 1, streetViewPanoramaCamera.getVersionCode());
        b.a(parcel, 2, streetViewPanoramaCamera.zoom);
        b.a(parcel, 3, streetViewPanoramaCamera.tilt);
        b.a(parcel, 4, streetViewPanoramaCamera.bearing);
        b.H(parcel, H);
    }

    public Object createFromParcel(Parcel parcel) {
        return di(parcel);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.model.StreetViewPanoramaCamera di(android.os.Parcel r9) {
        /*
        r8_this = this;
        r0 = 0;
        r4 = com.google.android.gms.maps.model.LatLng.a;
        r5 = com.google.android.gms.common.internal.safeparcel.a.G(r9);
        r1 = 0;
        r2 = r0;
        r3 = r1;
        r1 = r0;
    L_0x000b:
        r6 = r9.dataPosition();
        if (r6 >= r5) goto L_0x0021;
    L_0x0011:
        r6 = com.google.android.gms.common.internal.safeparcel.a.F(r9);
        r7 = com.google.android.gms.common.internal.safeparcel.a.aH(r6);
        switch(r7) {
            case 1: goto L_0x0042;
            case 2: goto L_0x0048;
            case 3: goto L_0x004e;
            case 4: goto L_0x0054;
            default: goto L_0x001c;
        };
    L_0x001c:
        com.google.android.gms.common.internal.safeparcel.a.b(r9, r6);	 Catch:{ a -> 0x005b }
    L_0x001f:
        if (r4 == 0) goto L_0x000b;
    L_0x0021:
        r4 = r9.dataPosition();	 Catch:{ a -> 0x0040 }
        if (r4 == r5) goto L_0x005d;
    L_0x0027:
        r0 = new com.google.android.gms.common.internal.safeparcel.a$a;	 Catch:{ a -> 0x0040 }
        r1 = new java.lang.StringBuilder;	 Catch:{ a -> 0x0040 }
        r1.<init>();	 Catch:{ a -> 0x0040 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ a -> 0x0040 }
        r1 = r1.append(r5);	 Catch:{ a -> 0x0040 }
        r1 = r1.toString();	 Catch:{ a -> 0x0040 }
        r0.<init>(r1, r9);	 Catch:{ a -> 0x0040 }
        throw r0;	 Catch:{ a -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r3 = com.google.android.gms.common.internal.safeparcel.a.g(r9, r6);
        if (r4 == 0) goto L_0x001f;
    L_0x0048:
        r2 = com.google.android.gms.common.internal.safeparcel.a.l(r9, r6);
        if (r4 == 0) goto L_0x001f;
    L_0x004e:
        r1 = com.google.android.gms.common.internal.safeparcel.a.l(r9, r6);
        if (r4 == 0) goto L_0x001f;
    L_0x0054:
        r0 = com.google.android.gms.common.internal.safeparcel.a.l(r9, r6);
        if (r4 == 0) goto L_0x001f;
    L_0x005a:
        goto L_0x001c;
    L_0x005b:
        r0 = move-exception;
        throw r0;
    L_0x005d:
        r4 = new com.google.android.gms.maps.model.StreetViewPanoramaCamera;
        r4.<init>(r3, r2, r1, r0);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.q.di(android.os.Parcel):com.google.android.gms.maps.model.StreetViewPanoramaCamera");
    }

    public StreetViewPanoramaCamera[] fe(int i) {
        return new StreetViewPanoramaCamera[i];
    }

    public Object[] newArray(int i) {
        return fe(i);
    }
}
