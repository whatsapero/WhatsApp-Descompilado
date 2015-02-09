package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator {
    static void a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        boolean z = false;
        boolean z2 = MapView.a;
        int H = b.H(parcel);
        try {
            b.c(parcel, 1, googleMapOptions.getVersionCode());
            b.a(parcel, 2, googleMapOptions.nD());
            b.a(parcel, 3, googleMapOptions.nE());
            b.c(parcel, 4, googleMapOptions.getMapType());
            b.a(parcel, 5, googleMapOptions.getCamera(), i, false);
            b.a(parcel, 6, googleMapOptions.nF());
            b.a(parcel, 7, googleMapOptions.nG());
            b.a(parcel, 8, googleMapOptions.nH());
            b.a(parcel, 9, googleMapOptions.nI());
            b.a(parcel, 10, googleMapOptions.nJ());
            b.a(parcel, 11, googleMapOptions.nK());
            b.a(parcel, 12, googleMapOptions.nL());
            b.a(parcel, 14, googleMapOptions.nM());
            b.H(parcel, H);
            if (z2) {
                if (!GoogleMap.a) {
                    z = true;
                }
                GoogleMap.a = z;
            }
        } catch (com.google.android.gms.common.internal.safeparcel.a.a e) {
            throw e;
        } catch (com.google.android.gms.common.internal.safeparcel.a.a e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.GoogleMapOptions cX(android.os.Parcel r22) {
        /*
        r21_this = this;
        r15 = com.google.android.gms.maps.MapView.a;
        r16 = com.google.android.gms.common.internal.safeparcel.a.G(r22);
        r14 = 0;
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
        r13 = 0;
        r2 = 0;
        r19 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r14;
        r14 = r19;
    L_0x001c:
        r17 = r22.dataPosition();
        r0 = r17;
        r1 = r16;
        if (r0 >= r1) goto L_0x01b0;
    L_0x0026:
        r17 = com.google.android.gms.common.internal.safeparcel.a.F(r22);
        r18 = com.google.android.gms.common.internal.safeparcel.a.aH(r17);
        switch(r18) {
            case 1: goto L_0x0080;
            case 2: goto L_0x008a;
            case 3: goto L_0x0094;
            case 4: goto L_0x009e;
            case 5: goto L_0x00a8;
            case 6: goto L_0x00b6;
            case 7: goto L_0x0163;
            case 8: goto L_0x016e;
            case 9: goto L_0x0179;
            case 10: goto L_0x0184;
            case 11: goto L_0x018f;
            case 12: goto L_0x019a;
            case 13: goto L_0x0031;
            case 14: goto L_0x01a5;
            default: goto L_0x0031;
        };
    L_0x0031:
        r19 = r2;
        r2 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r19;
    L_0x0039:
        r0 = r22;
        r1 = r17;
        com.google.android.gms.common.internal.safeparcel.a.b(r0, r1);	 Catch:{ a -> 0x013a }
        r19 = r14;
        r14 = r2;
        r2 = r19;
    L_0x0045:
        if (r15 == 0) goto L_0x01c5;
    L_0x0047:
        r15 = r2;
        r19 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r3;
        r3 = r14;
        r14 = r19;
        r20 = r6;
        r6 = r4;
        r4 = r20;
    L_0x0059:
        r2 = r22.dataPosition();	 Catch:{ a -> 0x007e }
        r0 = r16;
        if (r2 == r0) goto L_0x013c;
    L_0x0061:
        r2 = new com.google.android.gms.common.internal.safeparcel.a$a;	 Catch:{ a -> 0x007e }
        r3 = new java.lang.StringBuilder;	 Catch:{ a -> 0x007e }
        r3.<init>();	 Catch:{ a -> 0x007e }
        r4 = "Overread allowed size end=";
        r3 = r3.append(r4);	 Catch:{ a -> 0x007e }
        r0 = r16;
        r3 = r3.append(r0);	 Catch:{ a -> 0x007e }
        r3 = r3.toString();	 Catch:{ a -> 0x007e }
        r0 = r22;
        r2.<init>(r3, r0);	 Catch:{ a -> 0x007e }
        throw r2;	 Catch:{ a -> 0x007e }
    L_0x007e:
        r2 = move-exception;
        throw r2;
    L_0x0080:
        r0 = r22;
        r1 = r17;
        r6 = com.google.android.gms.common.internal.safeparcel.a.g(r0, r1);
        if (r15 == 0) goto L_0x0142;
    L_0x008a:
        r0 = r22;
        r1 = r17;
        r5 = com.google.android.gms.common.internal.safeparcel.a.e(r0, r1);
        if (r15 == 0) goto L_0x0158;
    L_0x0094:
        r0 = r22;
        r1 = r17;
        r4 = com.google.android.gms.common.internal.safeparcel.a.e(r0, r1);
        if (r15 == 0) goto L_0x014d;
    L_0x009e:
        r0 = r22;
        r1 = r17;
        r3 = com.google.android.gms.common.internal.safeparcel.a.g(r0, r1);
        if (r15 == 0) goto L_0x0142;
    L_0x00a8:
        r2 = com.google.android.gms.maps.model.CameraPosition.CREATOR;
        r0 = r22;
        r1 = r17;
        r2 = com.google.android.gms.common.internal.safeparcel.a.a(r0, r1, r2);
        r2 = (com.google.android.gms.maps.model.CameraPosition) r2;
        if (r15 == 0) goto L_0x0142;
    L_0x00b6:
        r0 = r22;
        r1 = r17;
        r7 = com.google.android.gms.common.internal.safeparcel.a.e(r0, r1);
        if (r15 == 0) goto L_0x0142;
    L_0x00c0:
        r19 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
    L_0x00c9:
        r0 = r22;
        r1 = r17;
        r8 = com.google.android.gms.common.internal.safeparcel.a.e(r0, r1);
        if (r15 == 0) goto L_0x0200;
    L_0x00d3:
        r19 = r8;
        r8 = r7;
        r7 = r2;
        r2 = r19;
    L_0x00d9:
        r0 = r22;
        r1 = r17;
        r9 = com.google.android.gms.common.internal.safeparcel.a.e(r0, r1);
        if (r15 == 0) goto L_0x01f8;
    L_0x00e3:
        r19 = r9;
        r9 = r8;
        r8 = r2;
        r2 = r19;
    L_0x00e9:
        r0 = r22;
        r1 = r17;
        r10 = com.google.android.gms.common.internal.safeparcel.a.e(r0, r1);
        if (r15 == 0) goto L_0x01f0;
    L_0x00f3:
        r19 = r10;
        r10 = r9;
        r9 = r2;
        r2 = r19;
    L_0x00f9:
        r0 = r22;
        r1 = r17;
        r11 = com.google.android.gms.common.internal.safeparcel.a.e(r0, r1);
        if (r15 == 0) goto L_0x01e8;
    L_0x0103:
        r19 = r11;
        r11 = r10;
        r10 = r2;
        r2 = r19;
    L_0x0109:
        r0 = r22;
        r1 = r17;
        r12 = com.google.android.gms.common.internal.safeparcel.a.e(r0, r1);
        if (r15 == 0) goto L_0x01e0;
    L_0x0113:
        r19 = r12;
        r12 = r11;
        r11 = r2;
        r2 = r19;
    L_0x0119:
        r0 = r22;
        r1 = r17;
        r13 = com.google.android.gms.common.internal.safeparcel.a.e(r0, r1);
        if (r15 == 0) goto L_0x01d8;
    L_0x0123:
        r19 = r13;
        r13 = r12;
        r12 = r2;
        r2 = r19;
    L_0x0129:
        r0 = r22;
        r1 = r17;
        r14 = com.google.android.gms.common.internal.safeparcel.a.e(r0, r1);
        if (r15 == 0) goto L_0x01d0;
    L_0x0133:
        r19 = r2;
        r2 = r13;
        r13 = r19;
        goto L_0x0039;
    L_0x013a:
        r2 = move-exception;
        throw r2;
    L_0x013c:
        r2 = new com.google.android.gms.maps.GoogleMapOptions;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
        return r2;
    L_0x0142:
        r19 = r14;
        r14 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x014d:
        r19 = r14;
        r14 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x0158:
        r19 = r14;
        r14 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x0163:
        r19 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x00c9;
    L_0x016e:
        r19 = r8;
        r8 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x00d9;
    L_0x0179:
        r19 = r9;
        r9 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x00e9;
    L_0x0184:
        r19 = r10;
        r10 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x00f9;
    L_0x018f:
        r19 = r11;
        r11 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x0109;
    L_0x019a:
        r19 = r12;
        r12 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x0119;
    L_0x01a5:
        r19 = r13;
        r13 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x0129;
    L_0x01b0:
        r15 = r14;
        r14 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r2;
        r19 = r3;
        r3 = r6;
        r6 = r19;
        r20 = r5;
        r5 = r4;
        r4 = r20;
        goto L_0x0059;
    L_0x01c5:
        r19 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r14;
        r14 = r19;
        goto L_0x001c;
    L_0x01d0:
        r19 = r14;
        r14 = r13;
        r13 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x01d8:
        r19 = r14;
        r14 = r12;
        r12 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x01e0:
        r19 = r14;
        r14 = r11;
        r11 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x01e8:
        r19 = r14;
        r14 = r10;
        r10 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x01f0:
        r19 = r14;
        r14 = r9;
        r9 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x01f8:
        r19 = r14;
        r14 = r8;
        r8 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x0200:
        r19 = r14;
        r14 = r7;
        r7 = r2;
        r2 = r19;
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.a.cX(android.os.Parcel):com.google.android.gms.maps.GoogleMapOptions");
    }

    public Object createFromParcel(Parcel parcel) {
        return cX(parcel);
    }

    public GoogleMapOptions[] eT(int i) {
        return new GoogleMapOptions[i];
    }

    public Object[] newArray(int i) {
        return eT(i);
    }
}
