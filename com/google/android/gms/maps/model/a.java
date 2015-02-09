package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator {
    static void a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int H = b.H(parcel);
        b.c(parcel, 1, cameraPosition.getVersionCode());
        b.a(parcel, 2, cameraPosition.target, i, false);
        b.a(parcel, 3, cameraPosition.zoom);
        b.a(parcel, 4, cameraPosition.tilt);
        b.a(parcel, 5, cameraPosition.bearing);
        b.H(parcel, H);
    }

    public Object createFromParcel(Parcel parcel) {
        return da(parcel);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.model.CameraPosition da(android.os.Parcel r11) {
        /*
        r10_this = this;
        r0 = 0;
        r5 = com.google.android.gms.maps.model.LatLng.a;
        r6 = com.google.android.gms.common.internal.safeparcel.a.G(r11);
        r2 = 0;
        r1 = 0;
        r4 = r0;
        r3 = r0;
        r9 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r9;
    L_0x000f:
        r7 = r11.dataPosition();
        if (r7 >= r6) goto L_0x0092;
    L_0x0015:
        r7 = com.google.android.gms.common.internal.safeparcel.a.F(r11);
        r8 = com.google.android.gms.common.internal.safeparcel.a.aH(r7);
        switch(r8) {
            case 1: goto L_0x0052;
            case 2: goto L_0x0058;
            case 3: goto L_0x0062;
            case 4: goto L_0x0068;
            case 5: goto L_0x008d;
            default: goto L_0x0020;
        };
    L_0x0020:
        r9 = r0;
        r0 = r1;
        r1 = r9;
    L_0x0023:
        com.google.android.gms.common.internal.safeparcel.a.b(r11, r7);	 Catch:{ a -> 0x0080 }
        r9 = r4;
        r4 = r0;
        r0 = r9;
    L_0x0029:
        if (r5 == 0) goto L_0x0097;
    L_0x002b:
        r5 = r0;
        r9 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r4;
        r4 = r9;
    L_0x0031:
        r0 = r11.dataPosition();	 Catch:{ a -> 0x0050 }
        if (r0 == r6) goto L_0x0082;
    L_0x0037:
        r0 = new com.google.android.gms.common.internal.safeparcel.a$a;	 Catch:{ a -> 0x0050 }
        r1 = new java.lang.StringBuilder;	 Catch:{ a -> 0x0050 }
        r1.<init>();	 Catch:{ a -> 0x0050 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ a -> 0x0050 }
        r1 = r1.append(r6);	 Catch:{ a -> 0x0050 }
        r1 = r1.toString();	 Catch:{ a -> 0x0050 }
        r0.<init>(r1, r11);	 Catch:{ a -> 0x0050 }
        throw r0;	 Catch:{ a -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r1 = com.google.android.gms.common.internal.safeparcel.a.g(r11, r7);
        if (r5 == 0) goto L_0x0088;
    L_0x0058:
        r0 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.a.a(r11, r7, r0);
        r0 = (com.google.android.gms.maps.model.LatLng) r0;
        if (r5 == 0) goto L_0x0088;
    L_0x0062:
        r2 = com.google.android.gms.common.internal.safeparcel.a.l(r11, r7);
        if (r5 == 0) goto L_0x0088;
    L_0x0068:
        r9 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r9;
        r3 = com.google.android.gms.common.internal.safeparcel.a.l(r11, r7);
        if (r5 == 0) goto L_0x00a2;
    L_0x0072:
        r9 = r3;
        r3 = r2;
        r2 = r0;
        r0 = r9;
    L_0x0076:
        r4 = com.google.android.gms.common.internal.safeparcel.a.l(r11, r7);
        if (r5 == 0) goto L_0x009d;
    L_0x007c:
        r9 = r0;
        r0 = r3;
        r3 = r9;
        goto L_0x0023;
    L_0x0080:
        r0 = move-exception;
        throw r0;
    L_0x0082:
        r0 = new com.google.android.gms.maps.model.CameraPosition;
        r0.<init>(r1, r2, r3, r4, r5);
        return r0;
    L_0x0088:
        r9 = r4;
        r4 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0029;
    L_0x008d:
        r9 = r3;
        r3 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0076;
    L_0x0092:
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r0;
        goto L_0x0031;
    L_0x0097:
        r9 = r0;
        r0 = r1;
        r1 = r4;
        r4 = r9;
        goto L_0x000f;
    L_0x009d:
        r9 = r4;
        r4 = r3;
        r3 = r0;
        r0 = r9;
        goto L_0x0029;
    L_0x00a2:
        r9 = r4;
        r4 = r2;
        r2 = r0;
        r0 = r9;
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.a.da(android.os.Parcel):com.google.android.gms.maps.model.CameraPosition");
    }

    public CameraPosition[] eW(int i) {
        return new CameraPosition[i];
    }

    public Object[] newArray(int i) {
        return eW(i);
    }
}
