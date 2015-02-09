package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;

public class a {

    public class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            boolean z = b.a;
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
            if (jx.a != 0) {
                b.a = !z;
            }
        }
    }

    public static String[] A(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(a + dataPosition);
        return createStringArray;
    }

    public static ArrayList C(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a + dataPosition);
        return createStringArrayList;
    }

    public static int F(Parcel parcel) {
        return parcel.readInt();
    }

    public static int G(Parcel parcel) {
        boolean z = b.a;
        int F = F(parcel);
        int a = a(parcel, F);
        int dataPosition = parcel.dataPosition();
        try {
            if (aH(F) != 20293) {
                throw new a("Expected object header. Got 0x" + Integer.toHexString(F), parcel);
            }
            F = dataPosition + a;
            try {
                if (F >= dataPosition) {
                    if (F <= parcel.dataSize()) {
                        if (z) {
                            jx.a++;
                        }
                        return F;
                    }
                }
                throw new a("Size read is invalid start=" + dataPosition + " end=" + F, parcel);
            } catch (a e) {
                throw e;
            }
        } catch (a e2) {
            throw e2;
        }
    }

    public static int a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static Parcelable a(Parcel parcel, int i, Creator creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(a + dataPosition);
        return parcelable;
    }

    private static void a(Parcel parcel, int i, int i2) {
        int a = a(parcel, i);
        if (a != i2) {
            try {
                throw new a("Expected size " + i2 + " got " + a + " (0x" + Integer.toHexString(a) + ")", parcel);
            } catch (a e) {
                throw e;
            }
        }
    }

    private static void a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            try {
                throw new a("Expected size " + i3 + " got " + i2 + " (0x" + Integer.toHexString(i2) + ")", parcel);
            } catch (a e) {
                throw e;
            }
        }
    }

    public static int aH(int i) {
        return 65535 & i;
    }

    public static void b(Parcel parcel, int i) {
        parcel.setDataPosition(a(parcel, i) + parcel.dataPosition());
    }

    public static Object[] b(Parcel parcel, int i, Creator creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArray;
    }

    public static boolean c(Parcel parcel, int i) {
        try {
            a(parcel, i, 4);
            return parcel.readInt() != 0;
        } catch (a e) {
            throw e;
        }
    }

    public static byte e(Parcel parcel, int i) {
        a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static int g(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer h(Parcel parcel, int i) {
        int a = a(parcel, i);
        if (a == 0) {
            return null;
        }
        a(parcel, i, a, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long i(Parcel parcel, int i) {
        a(parcel, i, 8);
        return parcel.readLong();
    }

    public static float l(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readFloat();
    }

    public static double m(Parcel parcel, int i) {
        a(parcel, i, 8);
        return parcel.readDouble();
    }

    public static String o(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(a + dataPosition);
        return readString;
    }

    public static IBinder p(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a + dataPosition);
        return readStrongBinder;
    }

    public static Bundle q(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(a + dataPosition);
        return readBundle;
    }
}
