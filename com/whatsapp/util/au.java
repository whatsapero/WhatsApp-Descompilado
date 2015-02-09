package com.whatsapp.util;

import android.os.Bundle;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.List;

public class au {
    public static byte[][] a(Bundle bundle, String str) {
        return (bundle == null || str == null) ? (byte[][]) null : a((Object[]) bundle.getSerializable(str));
    }

    public static Object[] a(Collection collection, Object[] objArr) {
        int i = 0;
        int i2 = Log.e;
        if (collection instanceof List) {
            return ((List) collection).toArray(objArr);
        }
        if (objArr.length >= collection.size()) {
            int i3 = 0;
            for (Object obj : collection) {
                i = i3 + 1;
                objArr[i3] = obj;
                if (i2 != 0) {
                    return objArr;
                }
                i3 = i;
            }
            return objArr;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), collection.size());
        for (Object obj2 : collection) {
            int i4 = i + 1;
            objArr2[i] = obj2;
            if (i2 != 0) {
                break;
            }
            i = i4;
        }
        return objArr2;
    }

    public static byte[][] a(Object[] objArr) {
        int i = Log.e;
        if (objArr == null) {
            return (byte[][]) null;
        }
        byte[][] bArr = new byte[objArr.length][];
        int i2 = 0;
        while (i2 < objArr.length) {
            bArr[i2] = (byte[]) objArr[i2];
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        return bArr;
    }

    public static boolean a(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (obj2 == obj || (obj != null && obj2 != null && obj.equals(obj2))) {
                return true;
            }
        }
        return false;
    }
}
