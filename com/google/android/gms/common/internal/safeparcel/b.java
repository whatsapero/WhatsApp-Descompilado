package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class b {
    public static boolean a;

    private static int F(Parcel parcel, int i) {
        parcel.writeInt(-65536 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void G(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    public static int H(Parcel parcel) {
        return F(parcel, 20293);
    }

    public static void H(Parcel parcel, int i) {
        G(parcel, i);
    }

    public static void a(Parcel parcel, int i, byte b) {
        b(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void a(Parcel parcel, int i, double d) {
        b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void a(Parcel parcel, int i, float f) {
        b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void a(Parcel parcel, int i, long j) {
        b(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int F = F(parcel, i);
            parcel.writeBundle(bundle);
            G(parcel, F);
        } else if (z) {
            b(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int F = F(parcel, i);
            parcel.writeStrongBinder(iBinder);
            G(parcel, F);
        } else if (z) {
            b(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int F = F(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            G(parcel, F);
        } else if (z) {
            b(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            b(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            b(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int F = F(parcel, i);
            parcel.writeString(str);
            G(parcel, F);
        } else if (z) {
            b(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, boolean z) {
        b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.os.Parcel r6, int r7, android.os.Parcelable[] r8, int r9, boolean r10) {
        /*
        r1 = 0;
        r2 = a;
        if (r8 != 0) goto L_0x000b;
    L_0x0005:
        if (r10 == 0) goto L_0x000a;
    L_0x0007:
        b(r6, r7, r1);
    L_0x000a:
        return;
    L_0x000b:
        r3 = F(r6, r7);
        r4 = r8.length;
        r6.writeInt(r4);
        r0 = r1;
    L_0x0014:
        if (r0 >= r4) goto L_0x0026;
    L_0x0016:
        r5 = r8[r0];
        if (r5 != 0) goto L_0x001f;
    L_0x001a:
        r6.writeInt(r1);
        if (r2 == 0) goto L_0x0022;
    L_0x001f:
        a(r6, r5, r9);
    L_0x0022:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0014;
    L_0x0026:
        G(r6, r3);
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.b.a(android.os.Parcel, int, android.os.Parcelable[], int, boolean):void");
    }

    public static void a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int F = F(parcel, i);
            parcel.writeStringArray(strArr);
            G(parcel, F);
        } else if (z) {
            b(parcel, i, 0);
        }
    }

    private static void a(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    private static void b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(-65536 | i);
            parcel.writeInt(i2);
            if (!a) {
                return;
            }
        }
        parcel.writeInt((i2 << 16) | i);
    }

    public static void b(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int F = F(parcel, i);
            parcel.writeStringList(list);
            G(parcel, F);
        } else if (z) {
            b(parcel, i, 0);
        }
    }

    public static void c(Parcel parcel, int i, int i2) {
        b(parcel, i, 4);
        parcel.writeInt(i2);
    }
}
