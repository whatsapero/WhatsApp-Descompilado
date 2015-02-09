package com.google.android.gms.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import org.whispersystems.libaxolotl.ay;

public class nj {
    private final np Ee;
    private ContentProviderClient agS;
    private boolean agT;
    private HashMap agU;
    private final Context mContext;

    class a extends Handler {
        private final LocationListener agV;

        public a(LocationListener locationListener) {
            this.agV = locationListener;
        }

        public a(LocationListener locationListener, Looper looper) {
            super(looper);
            this.agV = locationListener;
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case ay.f /*1*/:
                    this.agV.onLocationChanged(new Location((Location) message.obj));
                    if (nc.a != 0) {
                        break;
                    }
                    return;
            }
            Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
        }
    }

    class b extends com.google.android.gms.location.b.a {
        private Handler agW;

        b(LocationListener locationListener, Looper looper) {
            this.agW = looper == null ? new a(locationListener) : new a(locationListener, looper);
        }

        public void onLocationChanged(Location location) {
            if (this.agW == null) {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = location;
            this.agW.sendMessage(obtain);
        }

        public void release() {
            this.agW = null;
        }
    }

    public nj(Context context, np npVar) {
        this.agS = null;
        this.agT = false;
        this.agU = new HashMap();
        this.mContext = context;
        this.Ee = npVar;
    }

    private b a(LocationListener locationListener, Looper looper) {
        b bVar;
        if (looper == null) {
            try {
                jx.b(Looper.myLooper(), (Object) "Can't create handler inside thread that has not called Looper.prepare()");
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        synchronized (this.agU) {
            bVar = (b) this.agU.get(locationListener);
            if (bVar == null) {
                bVar = new b(locationListener, looper);
            }
            this.agU.put(locationListener, bVar);
        }
        return bVar;
    }

    public void S(boolean z) {
        this.Ee.dS();
        ((ni) this.Ee.hw()).S(z);
        this.agT = z;
    }

    public void a(LocationListener locationListener) {
        this.Ee.dS();
        jx.b((Object) locationListener, (Object) "Invalid null listener");
        synchronized (this.agU) {
            try {
                b bVar = (b) this.agU.remove(locationListener);
                try {
                    if (this.agS != null && this.agU.isEmpty()) {
                        this.agS.release();
                        this.agS = null;
                    }
                    if (bVar != null) {
                        bVar.release();
                        ((ni) this.Ee.hw()).a(bVar);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (IllegalStateException e22) {
                throw e22;
            } catch (Throwable th) {
            }
        }
    }

    public void a(LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        this.Ee.dS();
        ((ni) this.Ee.hw()).a(locationRequest, a(locationListener, looper));
    }

    public Location nl() {
        this.Ee.dS();
        try {
            return ((ni) this.Ee.hw()).bZ(this.mContext.getPackageName());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public void nm() {
        try {
            if (this.agT) {
                try {
                    S(false);
                } catch (Throwable e) {
                    throw new IllegalStateException(e);
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void removeAllListeners() {
        /*
        r5_this = this;
        r2 = com.google.android.gms.internal.nc.a;
        r3 = r5.agU;	 Catch:{ RemoteException -> 0x0036 }
        monitor-enter(r3);	 Catch:{ RemoteException -> 0x0036 }
        r0 = r5.agU;	 Catch:{ all -> 0x0033 }
        r0 = r0.values();	 Catch:{ all -> 0x0033 }
        r4 = r0.iterator();	 Catch:{ all -> 0x0033 }
    L_0x000f:
        r0 = r4.hasNext();	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x002a;
    L_0x0015:
        r0 = r4.next();	 Catch:{ all -> 0x0033 }
        r0 = (com.google.android.gms.internal.nj.b) r0;	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0028;
    L_0x001d:
        r1 = r5.Ee;	 Catch:{ RemoteException -> 0x0031 }
        r1 = r1.hw();	 Catch:{ RemoteException -> 0x0031 }
        r1 = (com.google.android.gms.internal.ni) r1;	 Catch:{ RemoteException -> 0x0031 }
        r1.a(r0);	 Catch:{ RemoteException -> 0x0031 }
    L_0x0028:
        if (r2 == 0) goto L_0x000f;
    L_0x002a:
        r0 = r5.agU;	 Catch:{ all -> 0x0033 }
        r0.clear();	 Catch:{ all -> 0x0033 }
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
        return;
    L_0x0031:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0033 }
    L_0x0033:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
        throw r0;	 Catch:{ RemoteException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nj.removeAllListeners():void");
    }
}
