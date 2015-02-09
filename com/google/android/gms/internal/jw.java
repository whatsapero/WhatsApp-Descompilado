package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.jg.a;

public class jw implements Creator {
    static void a(a aVar, Parcel parcel, int i) {
        int H = b.H(parcel);
        b.a(parcel, 1, aVar.getAccountName(), false);
        b.c(parcel, 1000, aVar.getVersionCode());
        b.b(parcel, 2, aVar.ho(), false);
        b.c(parcel, 3, aVar.hn());
        b.a(parcel, 4, aVar.hq(), false);
        b.H(parcel, H);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.jg.a E(android.os.Parcel r12) {
        /*
        r11_this = this;
        r1 = 0;
        r0 = 0;
        r5 = com.google.android.gms.internal.qw.a;
        r6 = com.google.android.gms.common.internal.safeparcel.a.G(r12);
        r2 = r0;
        r3 = r0;
        r4 = r1;
    L_0x000b:
        r7 = r12.dataPosition();
        if (r7 >= r6) goto L_0x0021;
    L_0x0011:
        r7 = com.google.android.gms.common.internal.safeparcel.a.F(r12);
        r8 = com.google.android.gms.common.internal.safeparcel.a.aH(r7);
        switch(r8) {
            case 1: goto L_0x0049;
            case 2: goto L_0x0055;
            case 3: goto L_0x005b;
            case 4: goto L_0x0061;
            case 1000: goto L_0x004f;
            default: goto L_0x001c;
        };
    L_0x001c:
        com.google.android.gms.common.internal.safeparcel.a.b(r12, r7);	 Catch:{ a -> 0x0068 }
    L_0x001f:
        if (r5 == 0) goto L_0x000b;
    L_0x0021:
        r5 = r0;
        r9 = r1;
        r1 = r4;
        r4 = r9;
        r10 = r3;
        r3 = r2;
        r2 = r10;
        r0 = r12.dataPosition();	 Catch:{ a -> 0x0047 }
        if (r0 == r6) goto L_0x006a;
    L_0x002e:
        r0 = new com.google.android.gms.common.internal.safeparcel.a$a;	 Catch:{ a -> 0x0047 }
        r1 = new java.lang.StringBuilder;	 Catch:{ a -> 0x0047 }
        r1.<init>();	 Catch:{ a -> 0x0047 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ a -> 0x0047 }
        r1 = r1.append(r6);	 Catch:{ a -> 0x0047 }
        r1 = r1.toString();	 Catch:{ a -> 0x0047 }
        r0.<init>(r1, r12);	 Catch:{ a -> 0x0047 }
        throw r0;	 Catch:{ a -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;
    L_0x0049:
        r3 = com.google.android.gms.common.internal.safeparcel.a.o(r12, r7);
        if (r5 == 0) goto L_0x001f;
    L_0x004f:
        r4 = com.google.android.gms.common.internal.safeparcel.a.g(r12, r7);
        if (r5 == 0) goto L_0x001f;
    L_0x0055:
        r2 = com.google.android.gms.common.internal.safeparcel.a.C(r12, r7);
        if (r5 == 0) goto L_0x001f;
    L_0x005b:
        r1 = com.google.android.gms.common.internal.safeparcel.a.g(r12, r7);
        if (r5 == 0) goto L_0x001f;
    L_0x0061:
        r0 = com.google.android.gms.common.internal.safeparcel.a.o(r12, r7);
        if (r5 == 0) goto L_0x001f;
    L_0x0067:
        goto L_0x001c;
    L_0x0068:
        r0 = move-exception;
        throw r0;
    L_0x006a:
        r0 = new com.google.android.gms.internal.jg$a;
        r0.<init>(r1, r2, r3, r4, r5);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jw.E(android.os.Parcel):com.google.android.gms.internal.jg$a");
    }

    public a[] aG(int i) {
        return new a[i];
    }

    public Object createFromParcel(Parcel parcel) {
        return E(parcel);
    }

    public Object[] newArray(int i) {
        return aG(i);
    }
}
