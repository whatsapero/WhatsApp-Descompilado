package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class y implements Creator {
    static void a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int H = b.H(parcel);
        b.c(parcel, 1, visibleRegion.getVersionCode());
        b.a(parcel, 2, visibleRegion.nearLeft, i, false);
        b.a(parcel, 3, visibleRegion.nearRight, i, false);
        b.a(parcel, 4, visibleRegion.farLeft, i, false);
        b.a(parcel, 5, visibleRegion.farRight, i, false);
        b.a(parcel, 6, visibleRegion.latLngBounds, i, false);
        b.H(parcel, H);
    }

    public Object createFromParcel(Parcel parcel) {
        return do(parcel);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.model.VisibleRegion do(android.os.Parcel r13) {
        /*
        r12_this = this;
        r0 = 0;
        r6 = com.google.android.gms.maps.model.LatLng.a;
        r7 = com.google.android.gms.common.internal.safeparcel.a.G(r13);
        r1 = 0;
        r2 = r0;
        r3 = r0;
        r4 = r0;
        r5 = r1;
        r1 = r0;
    L_0x000d:
        r8 = r13.dataPosition();
        if (r8 >= r7) goto L_0x00c2;
    L_0x0013:
        r8 = com.google.android.gms.common.internal.safeparcel.a.F(r13);
        r9 = com.google.android.gms.common.internal.safeparcel.a.aH(r8);
        switch(r9) {
            case 1: goto L_0x0051;
            case 2: goto L_0x0057;
            case 3: goto L_0x0061;
            case 4: goto L_0x00bc;
            case 5: goto L_0x00be;
            case 6: goto L_0x00c0;
            default: goto L_0x001e;
        };
    L_0x001e:
        com.google.android.gms.common.internal.safeparcel.a.b(r13, r8);	 Catch:{ a -> 0x0094 }
        r10 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r0;
        r0 = r10;
    L_0x0027:
        if (r6 == 0) goto L_0x00cb;
    L_0x0029:
        r6 = r0;
        r10 = r1;
        r1 = r5;
        r5 = r10;
        r11 = r4;
        r4 = r2;
        r2 = r11;
    L_0x0030:
        r0 = r13.dataPosition();	 Catch:{ a -> 0x004f }
        if (r0 == r7) goto L_0x0096;
    L_0x0036:
        r0 = new com.google.android.gms.common.internal.safeparcel.a$a;	 Catch:{ a -> 0x004f }
        r1 = new java.lang.StringBuilder;	 Catch:{ a -> 0x004f }
        r1.<init>();	 Catch:{ a -> 0x004f }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ a -> 0x004f }
        r1 = r1.append(r7);	 Catch:{ a -> 0x004f }
        r1 = r1.toString();	 Catch:{ a -> 0x004f }
        r0.<init>(r1, r13);	 Catch:{ a -> 0x004f }
        throw r0;	 Catch:{ a -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        r5 = com.google.android.gms.common.internal.safeparcel.a.g(r13, r8);
        if (r6 == 0) goto L_0x00b4;
    L_0x0057:
        r0 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.a.a(r13, r8, r0);
        r0 = (com.google.android.gms.maps.model.LatLng) r0;
        if (r6 == 0) goto L_0x00b4;
    L_0x0061:
        r4 = r0;
        r0 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.a.a(r13, r8, r0);
        r0 = (com.google.android.gms.maps.model.LatLng) r0;
        if (r6 == 0) goto L_0x00ad;
    L_0x006c:
        r3 = r4;
        r4 = r0;
    L_0x006e:
        r0 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.a.a(r13, r8, r0);
        r0 = (com.google.android.gms.maps.model.LatLng) r0;
        if (r6 == 0) goto L_0x00a4;
    L_0x0078:
        r2 = r3;
        r3 = r0;
    L_0x007a:
        r0 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.a.a(r13, r8, r0);
        r0 = (com.google.android.gms.maps.model.LatLng) r0;
        if (r6 == 0) goto L_0x009c;
    L_0x0084:
        r1 = r2;
        r2 = r0;
    L_0x0086:
        r0 = com.google.android.gms.maps.model.LatLngBounds.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.a.a(r13, r8, r0);
        r0 = (com.google.android.gms.maps.model.LatLngBounds) r0;
        if (r6 == 0) goto L_0x00d3;
    L_0x0090:
        r10 = r0;
        r0 = r1;
        r1 = r10;
        goto L_0x001e;
    L_0x0094:
        r0 = move-exception;
        throw r0;
    L_0x0096:
        r0 = new com.google.android.gms.maps.model.VisibleRegion;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        return r0;
    L_0x009c:
        r10 = r1;
        r1 = r0;
        r0 = r10;
        r11 = r3;
        r3 = r4;
        r4 = r2;
        r2 = r11;
        goto L_0x0027;
    L_0x00a4:
        r10 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r10;
        r11 = r4;
        r4 = r3;
        r3 = r11;
        goto L_0x0027;
    L_0x00ad:
        r10 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r0;
        r0 = r10;
        goto L_0x0027;
    L_0x00b4:
        r10 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r0;
        r0 = r10;
        goto L_0x0027;
    L_0x00bc:
        r3 = r0;
        goto L_0x006e;
    L_0x00be:
        r2 = r0;
        goto L_0x007a;
    L_0x00c0:
        r1 = r0;
        goto L_0x0086;
    L_0x00c2:
        r6 = r1;
        r1 = r5;
        r5 = r2;
        r2 = r0;
        r10 = r4;
        r4 = r3;
        r3 = r10;
        goto L_0x0030;
    L_0x00cb:
        r10 = r0;
        r0 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r10;
        goto L_0x000d;
    L_0x00d3:
        r10 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r1;
        r1 = r10;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.y.do(android.os.Parcel):com.google.android.gms.maps.model.VisibleRegion");
    }

    public VisibleRegion[] fk(int i) {
        return new VisibleRegion[i];
    }

    public Object[] newArray(int i) {
        return fk(i);
    }
}
