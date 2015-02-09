package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.jx;

public class f implements Creator {
    static void a(DataHolder dataHolder, Parcel parcel, int i) {
        boolean z = false;
        boolean z2 = a.a;
        int H = b.H(parcel);
        try {
            b.a(parcel, 1, dataHolder.gY(), false);
            b.c(parcel, 1000, dataHolder.getVersionCode());
            b.a(parcel, 2, dataHolder.gZ(), i, false);
            b.c(parcel, 3, dataHolder.getStatusCode());
            b.a(parcel, 4, dataHolder.gV(), false);
            b.H(parcel, H);
            if (jx.a != 0) {
                if (!z2) {
                    z = true;
                }
                a.a = z;
            }
        } catch (com.google.android.gms.common.internal.safeparcel.a.a e) {
            throw e;
        } catch (com.google.android.gms.common.internal.safeparcel.a.a e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.common.data.DataHolder B(android.os.Parcel r12) {
        /*
        r11_this = this;
        r1 = 0;
        r0 = 0;
        r5 = com.google.android.gms.common.data.DataHolder.a.a;
        r6 = com.google.android.gms.common.internal.safeparcel.a.G(r12);
        r2 = r1;
        r3 = r0;
        r4 = r1;
        r1 = r0;
    L_0x000c:
        r7 = r12.dataPosition();
        if (r7 >= r6) goto L_0x0086;
    L_0x0012:
        r7 = com.google.android.gms.common.internal.safeparcel.a.F(r12);
        r8 = com.google.android.gms.common.internal.safeparcel.a.aH(r7);
        switch(r8) {
            case 1: goto L_0x004e;
            case 2: goto L_0x0060;
            case 3: goto L_0x006a;
            case 4: goto L_0x0070;
            case 1000: goto L_0x005a;
            default: goto L_0x001d;
        };
    L_0x001d:
        com.google.android.gms.common.internal.safeparcel.a.b(r12, r7);	 Catch:{ a -> 0x007b }
        r9 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r9;
    L_0x0024:
        if (r5 == 0) goto L_0x008c;
    L_0x0026:
        r5 = r0;
        r9 = r1;
        r1 = r4;
        r4 = r9;
        r10 = r3;
        r3 = r2;
        r2 = r10;
    L_0x002d:
        r0 = r12.dataPosition();	 Catch:{ a -> 0x004c }
        if (r0 == r6) goto L_0x007d;
    L_0x0033:
        r0 = new com.google.android.gms.common.internal.safeparcel.a$a;	 Catch:{ a -> 0x004c }
        r1 = new java.lang.StringBuilder;	 Catch:{ a -> 0x004c }
        r1.<init>();	 Catch:{ a -> 0x004c }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ a -> 0x004c }
        r1 = r1.append(r6);	 Catch:{ a -> 0x004c }
        r1 = r1.toString();	 Catch:{ a -> 0x004c }
        r0.<init>(r1, r12);	 Catch:{ a -> 0x004c }
        throw r0;	 Catch:{ a -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;
    L_0x004e:
        r3 = com.google.android.gms.common.internal.safeparcel.a.A(r12, r7);
        if (r5 == 0) goto L_0x0076;
    L_0x0054:
        r4 = com.google.android.gms.internal.jx.a;
        r4 = r4 + 1;
        com.google.android.gms.internal.jx.a = r4;
    L_0x005a:
        r4 = com.google.android.gms.common.internal.safeparcel.a.g(r12, r7);
        if (r5 == 0) goto L_0x0076;
    L_0x0060:
        r0 = android.database.CursorWindow.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.a.b(r12, r7, r0);
        r0 = (android.database.CursorWindow[]) r0;
        if (r5 == 0) goto L_0x0076;
    L_0x006a:
        r2 = com.google.android.gms.common.internal.safeparcel.a.g(r12, r7);
        if (r5 == 0) goto L_0x0076;
    L_0x0070:
        r1 = com.google.android.gms.common.internal.safeparcel.a.q(r12, r7);
        if (r5 != 0) goto L_0x001d;
    L_0x0076:
        r9 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r9;
        goto L_0x0024;
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r0 = new com.google.android.gms.common.data.DataHolder;
        r0.<init>(r1, r2, r3, r4, r5);
        r0.gX();
        return r0;
    L_0x0086:
        r5 = r1;
        r1 = r4;
        r4 = r2;
        r2 = r3;
        r3 = r0;
        goto L_0x002d;
    L_0x008c:
        r9 = r0;
        r0 = r2;
        r2 = r1;
        r1 = r9;
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.f.B(android.os.Parcel):com.google.android.gms.common.data.DataHolder");
    }

    public DataHolder[] aw(int i) {
        return new DataHolder[i];
    }

    public Object createFromParcel(Parcel parcel) {
        return B(parcel);
    }

    public Object[] newArray(int i) {
        return aw(i);
    }
}
