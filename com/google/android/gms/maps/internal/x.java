package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.c.a;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;

public class x {
    private static Context alI;
    private static c alJ;

    public static c S(Context context) {
        try {
            jx.i(context);
            if (alJ != null) {
                return alJ;
            }
            T(context);
            alJ = U(context);
            try {
                alJ.a(e.k(getRemoteContext(context).getResources()), 6587000);
                return alJ;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } catch (RemoteException e2) {
            throw e2;
        }
    }

    private static void T(Context context) {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        switch (isGooglePlayServicesAvailable) {
            case PBE.MD5 /*0*/:
            default:
                throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
    }

    private static c U(Context context) {
        if (nY()) {
            Log.i(x.class.getSimpleName(), "Making Creator statically");
            return (c) c(nZ());
        }
        Log.i(x.class.getSimpleName(), "Making Creator dynamically");
        return a.aS((IBinder) a(getRemoteContext(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
    }

    private static Object a(ClassLoader classLoader, String str) {
        try {
            return c(((ClassLoader) jx.i(classLoader)).loadClass(str));
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class " + str);
        }
    }

    private static Object c(Class cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException("Unable to instantiate the dynamic class " + cls.getName());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unable to call the default constructor of " + cls.getName());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Context getRemoteContext(android.content.Context r1) {
        /*
        r0 = alI;	 Catch:{ RuntimeRemoteException -> 0x001d }
        if (r0 != 0) goto L_0x001a;
    L_0x0004:
        r0 = nY();	 Catch:{ RuntimeRemoteException -> 0x001f }
        if (r0 == 0) goto L_0x0014;
    L_0x000a:
        r0 = r1.getApplicationContext();	 Catch:{ RuntimeRemoteException -> 0x0021 }
        alI = r0;	 Catch:{ RuntimeRemoteException -> 0x0021 }
        r0 = com.google.android.gms.maps.internal.m.a.a;	 Catch:{ RuntimeRemoteException -> 0x0021 }
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r0 = com.google.android.gms.common.GooglePlayServicesUtil.getRemoteContext(r1);	 Catch:{ RuntimeRemoteException -> 0x0021 }
        alI = r0;	 Catch:{ RuntimeRemoteException -> 0x0021 }
    L_0x001a:
        r0 = alI;
        return r0;
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeRemoteException -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeRemoteException -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.x.getRemoteContext(android.content.Context):android.content.Context");
    }

    public static boolean nY() {
        return false;
    }

    private static Class nZ() {
        try {
            Class forName;
            if (VERSION.SDK_INT < 15) {
                forName = Class.forName("com.google.android.gms.maps.internal.CreatorImplGmm6");
            } else {
                try {
                    forName = Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
            return forName;
        } catch (RuntimeRemoteException e2) {
            throw e2;
        }
    }
}
