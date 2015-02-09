package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class c implements Creator {
    static void a(StreetViewPanoramaOptions streetViewPanoramaOptions, Parcel parcel, int i) {
        int H = b.H(parcel);
        b.c(parcel, 1, streetViewPanoramaOptions.getVersionCode());
        b.a(parcel, 2, streetViewPanoramaOptions.getStreetViewPanoramaCamera(), i, false);
        b.a(parcel, 3, streetViewPanoramaOptions.getPanoramaId(), false);
        b.a(parcel, 4, streetViewPanoramaOptions.getPosition(), i, false);
        b.a(parcel, 5, streetViewPanoramaOptions.getRadius(), false);
        b.a(parcel, 6, streetViewPanoramaOptions.nS());
        b.a(parcel, 7, streetViewPanoramaOptions.nI());
        b.a(parcel, 8, streetViewPanoramaOptions.nT());
        b.a(parcel, 9, streetViewPanoramaOptions.nU());
        b.a(parcel, 10, streetViewPanoramaOptions.nE());
        b.H(parcel, H);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.StreetViewPanoramaOptions cY(android.os.Parcel r18) {
        /*
        r17_this = this;
        r11 = com.google.android.gms.maps.MapView.a;
        r12 = com.google.android.gms.common.internal.safeparcel.a.G(r18);
        r10 = 0;
        r5 = 0;
        r4 = 0;
        r3 = 0;
        r2 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r1 = 0;
        r15 = r1;
        r1 = r5;
        r5 = r10;
        r10 = r15;
    L_0x0014:
        r13 = r18.dataPosition();
        if (r13 >= r12) goto L_0x0114;
    L_0x001a:
        r13 = com.google.android.gms.common.internal.safeparcel.a.F(r18);
        r14 = com.google.android.gms.common.internal.safeparcel.a.aH(r13);
        switch(r14) {
            case 1: goto L_0x0062;
            case 2: goto L_0x006a;
            case 3: goto L_0x0076;
            case 4: goto L_0x007e;
            case 5: goto L_0x010f;
            case 6: goto L_0x00f5;
            case 7: goto L_0x00fb;
            case 8: goto L_0x0100;
            case 9: goto L_0x0105;
            case 10: goto L_0x010a;
            default: goto L_0x0025;
        };
    L_0x0025:
        r15 = r1;
        r1 = r5;
        r5 = r15;
    L_0x0028:
        r0 = r18;
        com.google.android.gms.common.internal.safeparcel.a.b(r0, r13);	 Catch:{ a -> 0x00d7 }
        r15 = r10;
        r10 = r1;
        r1 = r15;
    L_0x0030:
        if (r11 == 0) goto L_0x011f;
    L_0x0032:
        r11 = r1;
        r15 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r2;
        r2 = r10;
        r10 = r15;
        r16 = r5;
        r5 = r3;
        r3 = r16;
    L_0x003f:
        r1 = r18.dataPosition();	 Catch:{ a -> 0x0060 }
        if (r1 == r12) goto L_0x00d9;
    L_0x0045:
        r1 = new com.google.android.gms.common.internal.safeparcel.a$a;	 Catch:{ a -> 0x0060 }
        r2 = new java.lang.StringBuilder;	 Catch:{ a -> 0x0060 }
        r2.<init>();	 Catch:{ a -> 0x0060 }
        r3 = "Overread allowed size end=";
        r2 = r2.append(r3);	 Catch:{ a -> 0x0060 }
        r2 = r2.append(r12);	 Catch:{ a -> 0x0060 }
        r2 = r2.toString();	 Catch:{ a -> 0x0060 }
        r0 = r18;
        r1.<init>(r2, r0);	 Catch:{ a -> 0x0060 }
        throw r1;	 Catch:{ a -> 0x0060 }
    L_0x0060:
        r1 = move-exception;
        throw r1;
    L_0x0062:
        r0 = r18;
        r5 = com.google.android.gms.common.internal.safeparcel.a.g(r0, r13);
        if (r11 == 0) goto L_0x00ef;
    L_0x006a:
        r1 = com.google.android.gms.maps.model.StreetViewPanoramaCamera.CREATOR;
        r0 = r18;
        r1 = com.google.android.gms.common.internal.safeparcel.a.a(r0, r13, r1);
        r1 = (com.google.android.gms.maps.model.StreetViewPanoramaCamera) r1;
        if (r11 == 0) goto L_0x00ef;
    L_0x0076:
        r0 = r18;
        r4 = com.google.android.gms.common.internal.safeparcel.a.o(r0, r13);
        if (r11 == 0) goto L_0x00ef;
    L_0x007e:
        r3 = r1;
        r1 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = r18;
        r1 = com.google.android.gms.common.internal.safeparcel.a.a(r0, r13, r1);
        r1 = (com.google.android.gms.maps.model.LatLng) r1;
        if (r11 == 0) goto L_0x00e8;
    L_0x008b:
        r2 = r1;
        r15 = r4;
        r4 = r3;
        r3 = r15;
    L_0x008f:
        r0 = r18;
        r1 = com.google.android.gms.common.internal.safeparcel.a.h(r0, r13);
        if (r11 == 0) goto L_0x00df;
    L_0x0097:
        r0 = r18;
        r6 = com.google.android.gms.common.internal.safeparcel.a.e(r0, r13);
        if (r11 == 0) goto L_0x00df;
    L_0x009f:
        r15 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r15;
    L_0x00a6:
        r0 = r18;
        r7 = com.google.android.gms.common.internal.safeparcel.a.e(r0, r13);
        if (r11 == 0) goto L_0x0137;
    L_0x00ae:
        r15 = r7;
        r7 = r6;
        r6 = r1;
        r1 = r15;
    L_0x00b2:
        r0 = r18;
        r8 = com.google.android.gms.common.internal.safeparcel.a.e(r0, r13);
        if (r11 == 0) goto L_0x0131;
    L_0x00ba:
        r15 = r8;
        r8 = r7;
        r7 = r1;
        r1 = r15;
    L_0x00be:
        r0 = r18;
        r9 = com.google.android.gms.common.internal.safeparcel.a.e(r0, r13);
        if (r11 == 0) goto L_0x012b;
    L_0x00c6:
        r15 = r9;
        r9 = r8;
        r8 = r1;
        r1 = r15;
    L_0x00ca:
        r0 = r18;
        r10 = com.google.android.gms.common.internal.safeparcel.a.e(r0, r13);
        if (r11 == 0) goto L_0x0125;
    L_0x00d2:
        r15 = r1;
        r1 = r9;
        r9 = r15;
        goto L_0x0028;
    L_0x00d7:
        r1 = move-exception;
        throw r1;
    L_0x00d9:
        r1 = new com.google.android.gms.maps.StreetViewPanoramaOptions;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        return r1;
    L_0x00df:
        r15 = r10;
        r10 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r15;
        goto L_0x0030;
    L_0x00e8:
        r15 = r10;
        r10 = r5;
        r5 = r3;
        r3 = r1;
        r1 = r15;
        goto L_0x0030;
    L_0x00ef:
        r15 = r10;
        r10 = r5;
        r5 = r1;
        r1 = r15;
        goto L_0x0030;
    L_0x00f5:
        r15 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r1;
        r1 = r15;
        goto L_0x0097;
    L_0x00fb:
        r15 = r6;
        r6 = r5;
        r5 = r1;
        r1 = r15;
        goto L_0x00a6;
    L_0x0100:
        r15 = r7;
        r7 = r5;
        r5 = r1;
        r1 = r15;
        goto L_0x00b2;
    L_0x0105:
        r15 = r8;
        r8 = r5;
        r5 = r1;
        r1 = r15;
        goto L_0x00be;
    L_0x010a:
        r15 = r9;
        r9 = r5;
        r5 = r1;
        r1 = r15;
        goto L_0x00ca;
    L_0x010f:
        r2 = r3;
        r3 = r4;
        r4 = r1;
        goto L_0x008f;
    L_0x0114:
        r11 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r2;
        r2 = r5;
        r5 = r3;
        r3 = r1;
        goto L_0x003f;
    L_0x011f:
        r15 = r1;
        r1 = r5;
        r5 = r10;
        r10 = r15;
        goto L_0x0014;
    L_0x0125:
        r15 = r10;
        r10 = r9;
        r9 = r1;
        r1 = r15;
        goto L_0x0030;
    L_0x012b:
        r15 = r10;
        r10 = r8;
        r8 = r1;
        r1 = r15;
        goto L_0x0030;
    L_0x0131:
        r15 = r10;
        r10 = r7;
        r7 = r1;
        r1 = r15;
        goto L_0x0030;
    L_0x0137:
        r15 = r10;
        r10 = r6;
        r6 = r1;
        r1 = r15;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.c.cY(android.os.Parcel):com.google.android.gms.maps.StreetViewPanoramaOptions");
    }

    public Object createFromParcel(Parcel parcel) {
        return cY(parcel);
    }

    public StreetViewPanoramaOptions[] eU(int i) {
        return new StreetViewPanoramaOptions[i];
    }

    public Object[] newArray(int i) {
        return eU(i);
    }
}
