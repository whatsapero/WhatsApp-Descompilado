package android.support.v4.util;

class ContainerHelpers {
    static final int[] EMPTY_INTS;
    static final long[] EMPTY_LONGS;
    static final Object[] EMPTY_OBJECTS;

    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static int binarySearch(int[] iArr, int i, int i2) {
        int i3 = LruCache.a;
        int i4 = 0;
        int i5 = i - 1;
        while (i4 <= i5) {
            int i6 = (i4 + i5) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i2) {
                i4 = i6 + 1;
                if (i3 == 0) {
                    i6 = i5;
                    if (i3 != 0) {
                        break;
                    }
                    i5 = i6;
                }
            }
            i5 = i4;
            if (i7 > i2) {
                i4 = i6 - 1;
                if (i3 == 0) {
                    i6 = i4;
                    i4 = i5;
                    if (i3 != 0) {
                        break;
                    }
                    i5 = i6;
                }
            }
            return i6;
        }
        return i4 ^ -1;
    }

    static {
        EMPTY_INTS = new int[0];
        EMPTY_LONGS = new long[0];
        EMPTY_OBJECTS = new Object[0];
    }

    public static int idealIntArraySize(int i) {
        return idealByteArraySize(i * 4) / 4;
    }

    public static int idealByteArraySize(int i) {
        int i2 = LruCache.a;
        int i3 = 4;
        while (i3 < 32) {
            if (i <= (1 << i3) - 12) {
                return (1 << i3) - 12;
            }
            i3++;
            if (i2 != 0) {
                return i;
            }
        }
        return i;
    }
}
