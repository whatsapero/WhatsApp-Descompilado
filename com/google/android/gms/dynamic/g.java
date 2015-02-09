package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.jx;

public abstract class g {
    private final String TI;
    private Object TJ;

    public class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected g(String str) {
        this.TI = str;
    }

    protected final Object L(Context context) {
        if (this.TJ == null) {
            jx.i(context);
            Context remoteContext = GooglePlayServicesUtil.getRemoteContext(context);
            if (remoteContext == null) {
                try {
                    throw new a("Could not get remote context.");
                } catch (ClassNotFoundException e) {
                    throw e;
                }
            }
            try {
                this.TJ = d((IBinder) remoteContext.getClassLoader().loadClass(this.TI).newInstance());
            } catch (Throwable e2) {
                throw new a("Could not load creator class.", e2);
            } catch (Throwable e22) {
                throw new a("Could not instantiate creator.", e22);
            } catch (Throwable e222) {
                throw new a("Could not access creator.", e222);
            }
        }
        return this.TJ;
    }

    protected abstract Object d(IBinder iBinder);
}
