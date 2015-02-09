package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.GoogleMap;

public class k implements Creator {
    static void a(MarkerOptions markerOptions, Parcel parcel, int i) {
        boolean z = false;
        boolean z2 = LatLng.a;
        int H = b.H(parcel);
        try {
            b.c(parcel, 1, markerOptions.getVersionCode());
            b.a(parcel, 2, markerOptions.getPosition(), i, false);
            b.a(parcel, 3, markerOptions.getTitle(), false);
            b.a(parcel, 4, markerOptions.getSnippet(), false);
            b.a(parcel, 5, markerOptions.oe(), false);
            b.a(parcel, 6, markerOptions.getAnchorU());
            b.a(parcel, 7, markerOptions.getAnchorV());
            b.a(parcel, 8, markerOptions.isDraggable());
            b.a(parcel, 9, markerOptions.isVisible());
            b.a(parcel, 10, markerOptions.isFlat());
            b.a(parcel, 11, markerOptions.getRotation());
            b.a(parcel, 12, markerOptions.getInfoWindowAnchorU());
            b.a(parcel, 13, markerOptions.getInfoWindowAnchorV());
            b.a(parcel, 14, markerOptions.getAlpha());
            b.H(parcel, H);
            if (z2) {
                if (!GoogleMap.a) {
                    z = true;
                }
                GoogleMap.a = z;
            }
        } catch (a e) {
            throw e;
        } catch (a e2) {
            throw e2;
        }
    }

    public Object createFromParcel(Parcel parcel) {
        return df(parcel);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.model.MarkerOptions df(android.os.Parcel r23) {
        /*
        r22_this = this;
        r16 = com.google.android.gms.maps.model.LatLng.a;
        r17 = com.google.android.gms.common.internal.safeparcel.a.G(r23);
        r15 = 0;
        r6 = 0;
        r5 = 0;
        r4 = 0;
        r3 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r13 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r14 = 0;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r20 = r2;
        r2 = r6;
        r6 = r15;
        r15 = r20;
    L_0x001c:
        r18 = r23.dataPosition();
        r0 = r18;
        r1 = r17;
        if (r0 >= r1) goto L_0x01ae;
    L_0x0026:
        r18 = com.google.android.gms.common.internal.safeparcel.a.F(r23);
        r19 = com.google.android.gms.common.internal.safeparcel.a.aH(r18);
        switch(r19) {
            case 1: goto L_0x007f;
            case 2: goto L_0x0089;
            case 3: goto L_0x0097;
            case 4: goto L_0x00a1;
            case 5: goto L_0x00ab;
            case 6: goto L_0x0167;
            case 7: goto L_0x0170;
            case 8: goto L_0x0178;
            case 9: goto L_0x0180;
            case 10: goto L_0x0188;
            case 11: goto L_0x0190;
            case 12: goto L_0x0198;
            case 13: goto L_0x01a0;
            case 14: goto L_0x01a7;
            default: goto L_0x0031;
        };
    L_0x0031:
        r20 = r2;
        r2 = r6;
        r6 = r20;
    L_0x0036:
        r0 = r23;
        r1 = r18;
        com.google.android.gms.common.internal.safeparcel.a.b(r0, r1);	 Catch:{ a -> 0x014c }
        r20 = r15;
        r15 = r2;
        r2 = r20;
    L_0x0042:
        if (r16 == 0) goto L_0x01be;
    L_0x0044:
        r16 = r2;
        r20 = r14;
        r14 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r3;
        r3 = r15;
        r15 = r20;
        r21 = r6;
        r6 = r4;
        r4 = r21;
    L_0x0058:
        r2 = r23.dataPosition();	 Catch:{ a -> 0x007d }
        r0 = r17;
        if (r2 == r0) goto L_0x014e;
    L_0x0060:
        r2 = new com.google.android.gms.common.internal.safeparcel.a$a;	 Catch:{ a -> 0x007d }
        r3 = new java.lang.StringBuilder;	 Catch:{ a -> 0x007d }
        r3.<init>();	 Catch:{ a -> 0x007d }
        r4 = "Overread allowed size end=";
        r3 = r3.append(r4);	 Catch:{ a -> 0x007d }
        r0 = r17;
        r3 = r3.append(r0);	 Catch:{ a -> 0x007d }
        r3 = r3.toString();	 Catch:{ a -> 0x007d }
        r0 = r23;
        r2.<init>(r3, r0);	 Catch:{ a -> 0x007d }
        throw r2;	 Catch:{ a -> 0x007d }
    L_0x007d:
        r2 = move-exception;
        throw r2;
    L_0x007f:
        r0 = r23;
        r1 = r18;
        r6 = com.google.android.gms.common.internal.safeparcel.a.g(r0, r1);
        if (r16 == 0) goto L_0x015f;
    L_0x0089:
        r2 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = r23;
        r1 = r18;
        r2 = com.google.android.gms.common.internal.safeparcel.a.a(r0, r1, r2);
        r2 = (com.google.android.gms.maps.model.LatLng) r2;
        if (r16 == 0) goto L_0x015f;
    L_0x0097:
        r0 = r23;
        r1 = r18;
        r5 = com.google.android.gms.common.internal.safeparcel.a.o(r0, r1);
        if (r16 == 0) goto L_0x015f;
    L_0x00a1:
        r0 = r23;
        r1 = r18;
        r4 = com.google.android.gms.common.internal.safeparcel.a.o(r0, r1);
        if (r16 == 0) goto L_0x015f;
    L_0x00ab:
        r3 = r4;
        r4 = r5;
        r5 = r2;
        r0 = r23;
        r1 = r18;
        r2 = com.google.android.gms.common.internal.safeparcel.a.p(r0, r1);
        if (r16 == 0) goto L_0x0154;
    L_0x00b8:
        r0 = r23;
        r1 = r18;
        r7 = com.google.android.gms.common.internal.safeparcel.a.l(r0, r1);
        if (r16 == 0) goto L_0x0154;
    L_0x00c2:
        r20 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r20;
    L_0x00cb:
        r0 = r23;
        r1 = r18;
        r8 = com.google.android.gms.common.internal.safeparcel.a.l(r0, r1);
        if (r16 == 0) goto L_0x01fe;
    L_0x00d5:
        r20 = r8;
        r8 = r7;
        r7 = r2;
        r2 = r20;
    L_0x00db:
        r0 = r23;
        r1 = r18;
        r9 = com.google.android.gms.common.internal.safeparcel.a.c(r0, r1);
        if (r16 == 0) goto L_0x01f6;
    L_0x00e5:
        r20 = r9;
        r9 = r8;
        r8 = r2;
        r2 = r20;
    L_0x00eb:
        r0 = r23;
        r1 = r18;
        r10 = com.google.android.gms.common.internal.safeparcel.a.c(r0, r1);
        if (r16 == 0) goto L_0x01ee;
    L_0x00f5:
        r20 = r10;
        r10 = r9;
        r9 = r2;
        r2 = r20;
    L_0x00fb:
        r0 = r23;
        r1 = r18;
        r11 = com.google.android.gms.common.internal.safeparcel.a.c(r0, r1);
        if (r16 == 0) goto L_0x01e6;
    L_0x0105:
        r20 = r11;
        r11 = r10;
        r10 = r2;
        r2 = r20;
    L_0x010b:
        r0 = r23;
        r1 = r18;
        r12 = com.google.android.gms.common.internal.safeparcel.a.l(r0, r1);
        if (r16 == 0) goto L_0x01de;
    L_0x0115:
        r20 = r12;
        r12 = r11;
        r11 = r2;
        r2 = r20;
    L_0x011b:
        r0 = r23;
        r1 = r18;
        r13 = com.google.android.gms.common.internal.safeparcel.a.l(r0, r1);
        if (r16 == 0) goto L_0x01d6;
    L_0x0125:
        r20 = r13;
        r13 = r12;
        r12 = r2;
        r2 = r20;
    L_0x012b:
        r0 = r23;
        r1 = r18;
        r14 = com.google.android.gms.common.internal.safeparcel.a.l(r0, r1);
        if (r16 == 0) goto L_0x01ce;
    L_0x0135:
        r20 = r14;
        r14 = r13;
        r13 = r2;
        r2 = r20;
    L_0x013b:
        r0 = r23;
        r1 = r18;
        r15 = com.google.android.gms.common.internal.safeparcel.a.l(r0, r1);
        if (r16 == 0) goto L_0x01c6;
    L_0x0145:
        r20 = r2;
        r2 = r14;
        r14 = r20;
        goto L_0x0036;
    L_0x014c:
        r2 = move-exception;
        throw r2;
    L_0x014e:
        r2 = new com.google.android.gms.maps.model.MarkerOptions;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
        return r2;
    L_0x0154:
        r20 = r15;
        r15 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x015f:
        r20 = r15;
        r15 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x0167:
        r20 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r2;
        r2 = r20;
        goto L_0x00b8;
    L_0x0170:
        r20 = r7;
        r7 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x00cb;
    L_0x0178:
        r20 = r8;
        r8 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x00db;
    L_0x0180:
        r20 = r9;
        r9 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x00eb;
    L_0x0188:
        r20 = r10;
        r10 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x00fb;
    L_0x0190:
        r20 = r11;
        r11 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x010b;
    L_0x0198:
        r20 = r12;
        r12 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x011b;
    L_0x01a0:
        r20 = r13;
        r13 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x012b;
    L_0x01a7:
        r20 = r14;
        r14 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x013b;
    L_0x01ae:
        r16 = r15;
        r15 = r14;
        r14 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r3;
        r3 = r6;
        r6 = r4;
        r4 = r2;
        goto L_0x0058;
    L_0x01be:
        r20 = r2;
        r2 = r6;
        r6 = r15;
        r15 = r20;
        goto L_0x001c;
    L_0x01c6:
        r20 = r15;
        r15 = r14;
        r14 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x01ce:
        r20 = r15;
        r15 = r13;
        r13 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x01d6:
        r20 = r15;
        r15 = r12;
        r12 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x01de:
        r20 = r15;
        r15 = r11;
        r11 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x01e6:
        r20 = r15;
        r15 = r10;
        r10 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x01ee:
        r20 = r15;
        r15 = r9;
        r9 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x01f6:
        r20 = r15;
        r15 = r8;
        r8 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x01fe:
        r20 = r15;
        r15 = r7;
        r7 = r2;
        r2 = r20;
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.k.df(android.os.Parcel):com.google.android.gms.maps.model.MarkerOptions");
    }

    public MarkerOptions[] fb(int i) {
        return new MarkerOptions[i];
    }

    public Object[] newArray(int i) {
        return fb(i);
    }
}
