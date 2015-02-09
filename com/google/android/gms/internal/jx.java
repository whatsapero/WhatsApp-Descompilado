package com.google.android.gms.internal;

import android.os.Looper;
import android.text.TextUtils;

public final class jx {
    public static int a;

    public static void K(boolean z) {
        if (!z) {
            try {
                throw new IllegalStateException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public static void L(boolean z) {
        if (!z) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            try {
                throw new IllegalStateException(String.valueOf(obj));
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public static void a(boolean z, String str, Object[] objArr) {
        if (!z) {
            try {
                throw new IllegalStateException(String.format(str, objArr));
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public static void aU(String str) {
        try {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException(str);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static Object b(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        try {
            throw new NullPointerException(String.valueOf(obj2));
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static String b(String str, Object obj) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            throw new IllegalArgumentException(String.valueOf(obj));
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            try {
                throw new IllegalArgumentException(String.valueOf(obj));
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public static void b(boolean z, String str, Object[] objArr) {
        if (!z) {
            try {
                throw new IllegalArgumentException(String.format(str, objArr));
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public static Object i(Object obj) {
        if (obj != null) {
            return obj;
        }
        try {
            throw new NullPointerException("null reference");
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
