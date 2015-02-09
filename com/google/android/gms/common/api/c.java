package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jm;
import com.google.android.gms.internal.jx;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.whispersystems.libaxolotl.ay;

final class c implements GoogleApiClient {
    private final Looper JF;
    private final Condition JR;
    private final jm JS;
    private final int JT;
    final Queue JU;
    private ConnectionResult JV;
    private int JW;
    private volatile int JX;
    private volatile boolean JY;
    private boolean JZ;
    private final b Jy;
    private int Ka;
    private long Kb;
    private long Kc;
    final Handler Kd;
    BroadcastReceiver Ke;
    private final Bundle Kf;
    private final Map Kg;
    private final List Kh;
    private boolean Ki;
    private final Set Kj;
    final Set Kk;
    private final ConnectionCallbacks Kl;
    private final com.google.android.gms.internal.jm.b Km;
    private final Context mContext;
    private final Lock zO;

    interface d {
        void a(b bVar);

        void b(com.google.android.gms.common.api.Api.a aVar);

        void cancel();

        int gF();

        com.google.android.gms.common.api.Api.c gz();

        void l(Status status);
    }

    interface b {
        void b(d dVar);
    }

    class AnonymousClass_4 implements OnConnectionFailedListener {
        final c Kn;
        final com.google.android.gms.common.api.Api.b Ko;

        AnonymousClass_4(c cVar, com.google.android.gms.common.api.Api.b bVar) {
            this.Kn = cVar;
            this.Ko = bVar;
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            c.a(this.Kn).lock();
            try {
                if (c.k(this.Kn) == null || this.Ko.getPriority() < c.l(this.Kn)) {
                    c.a(this.Kn, connectionResult);
                    c.b(this.Kn, this.Ko.getPriority());
                }
                c.d(this.Kn);
            } finally {
                c.a(this.Kn).unlock();
            }
        }
    }

    class a extends BroadcastReceiver {
        private WeakReference Ks;

        a(c cVar) {
            this.Ks = new WeakReference(cVar);
        }

        public void onReceive(Context context, Intent intent) {
            Uri data = intent.getData();
            String str = null;
            if (data != null) {
                str = data.getSchemeSpecificPart();
            }
            if (str != null && str.equals("com.google.android.gms")) {
                c cVar = (c) this.Ks.get();
                if (cVar != null && !cVar.isConnected() && !cVar.isConnecting() && cVar.gL()) {
                    cVar.connect();
                }
            }
        }
    }

    class c extends Handler {
        final c Kn;

        c(c cVar, Looper looper) {
            this.Kn = cVar;
            super(looper);
        }

        public void handleMessage(Message message) {
            boolean z = Api.a;
            switch (message.what) {
                case ay.f /*1*/:
                    c.i(this.Kn);
                    if (!z) {
                        return;
                    }
                    break;
                case ay.n /*2*/:
                    break;
            }
            c.j(this.Kn);
            if (z) {
                Log.w("GoogleApiClientImpl", "Unknown message id: " + message.what);
            }
        }
    }

    public c(Context context, Looper looper, jg jgVar, Map map, Set set, Set set2, int i) {
        boolean z = Api.a;
        this.zO = new ReentrantLock();
        this.JR = this.zO.newCondition();
        this.JU = new LinkedList();
        this.JX = 4;
        this.JZ = false;
        this.Kb = 120000;
        this.Kc = 5000;
        this.Kf = new Bundle();
        this.Kg = new HashMap();
        this.Kj = Collections.newSetFromMap(new WeakHashMap());
        this.Kk = Collections.newSetFromMap(new ConcurrentHashMap());
        this.Jy = new b() {
            final c Kn;

            {
                this.Kn = r1;
            }

            public void b(d dVar) {
                this.Kn.Kk.remove(dVar);
            }
        };
        this.Kl = new ConnectionCallbacks() {
            final c Kn;

            {
                this.Kn = r1;
            }

            public void onConnected(Bundle bundle) {
                c.a(this.Kn).lock();
                try {
                    if (c.b(this.Kn) == 1) {
                        if (bundle != null) {
                            c.c(this.Kn).putAll(bundle);
                        }
                        c.d(this.Kn);
                    }
                    c.a(this.Kn).unlock();
                } catch (Throwable th) {
                    c.a(this.Kn).unlock();
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onConnectionSuspended(int r5) {
                /*
                r4_this = this;
                r0 = r4.Kn;
                r0 = com.google.android.gms.common.api.c.a(r0);
                r0.lock();
                switch(r5) {
                    case 1: goto L_0x0024;
                    case 2: goto L_0x0016;
                    default: goto L_0x000c;
                };
            L_0x000c:
                r0 = r4.Kn;
                r0 = com.google.android.gms.common.api.c.a(r0);
                r0.unlock();
            L_0x0015:
                return;
            L_0x0016:
                r0 = r4.Kn;	 Catch:{ all -> 0x0093 }
                com.google.android.gms.common.api.c.a(r0, r5);	 Catch:{ all -> 0x0093 }
                r0 = r4.Kn;	 Catch:{ all -> 0x0093 }
                r0.connect();	 Catch:{ all -> 0x0093 }
                r0 = com.google.android.gms.common.api.Api.a;	 Catch:{ all -> 0x0093 }
                if (r0 == 0) goto L_0x000c;
            L_0x0024:
                r0 = r4.Kn;	 Catch:{ all -> 0x0093 }
                r0 = r0.gL();	 Catch:{ all -> 0x0093 }
                if (r0 == 0) goto L_0x0036;
            L_0x002c:
                r0 = r4.Kn;
                r0 = com.google.android.gms.common.api.c.a(r0);
                r0.unlock();
                goto L_0x0015;
            L_0x0036:
                r0 = r4.Kn;	 Catch:{ all -> 0x0093 }
                r1 = 1;
                com.google.android.gms.common.api.c.a(r0, r1);	 Catch:{ all -> 0x0093 }
                r0 = r4.Kn;	 Catch:{ all -> 0x0093 }
                r1 = new com.google.android.gms.common.api.c$a;	 Catch:{ all -> 0x0093 }
                r2 = r4.Kn;	 Catch:{ all -> 0x0093 }
                r1.<init>(r2);	 Catch:{ all -> 0x0093 }
                r0.Ke = r1;	 Catch:{ all -> 0x0093 }
                r0 = new android.content.IntentFilter;	 Catch:{ all -> 0x0093 }
                r1 = "android.intent.action.PACKAGE_ADDED";
                r0.<init>(r1);	 Catch:{ all -> 0x0093 }
                r1 = "package";
                r0.addDataScheme(r1);	 Catch:{ all -> 0x0093 }
                r1 = r4.Kn;	 Catch:{ all -> 0x0093 }
                r1 = com.google.android.gms.common.api.c.e(r1);	 Catch:{ all -> 0x0093 }
                r2 = r4.Kn;	 Catch:{ all -> 0x0093 }
                r2 = r2.Ke;	 Catch:{ all -> 0x0093 }
                r1.registerReceiver(r2, r0);	 Catch:{ all -> 0x0093 }
                r0 = r4.Kn;	 Catch:{ all -> 0x0093 }
                r0 = r0.Kd;	 Catch:{ all -> 0x0093 }
                r1 = r4.Kn;	 Catch:{ all -> 0x0093 }
                r1 = r1.Kd;	 Catch:{ all -> 0x0093 }
                r2 = 1;
                r1 = r1.obtainMessage(r2);	 Catch:{ all -> 0x0093 }
                r2 = r4.Kn;	 Catch:{ all -> 0x0093 }
                r2 = com.google.android.gms.common.api.c.f(r2);	 Catch:{ all -> 0x0093 }
                r0.sendMessageDelayed(r1, r2);	 Catch:{ all -> 0x0093 }
                r0 = r4.Kn;	 Catch:{ all -> 0x0093 }
                r0 = r0.Kd;	 Catch:{ all -> 0x0093 }
                r1 = r4.Kn;	 Catch:{ all -> 0x0093 }
                r1 = r1.Kd;	 Catch:{ all -> 0x0093 }
                r2 = 2;
                r1 = r1.obtainMessage(r2);	 Catch:{ all -> 0x0093 }
                r2 = r4.Kn;	 Catch:{ all -> 0x0093 }
                r2 = com.google.android.gms.common.api.c.g(r2);	 Catch:{ all -> 0x0093 }
                r0.sendMessageDelayed(r1, r2);	 Catch:{ all -> 0x0093 }
                r0 = r4.Kn;	 Catch:{ all -> 0x0093 }
                com.google.android.gms.common.api.c.a(r0, r5);	 Catch:{ all -> 0x0093 }
                goto L_0x000c;
            L_0x0093:
                r0 = move-exception;
                r1 = r4.Kn;
                r1 = com.google.android.gms.common.api.c.a(r1);
                r1.unlock();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.c.AnonymousClass_2.onConnectionSuspended(int):void");
            }
        };
        this.Km = new com.google.android.gms.internal.jm.b() {
            final c Kn;

            {
                this.Kn = r1;
            }

            public Bundle fX() {
                return null;
            }

            public boolean gN() {
                return c.h(this.Kn);
            }

            public boolean isConnected() {
                return this.Kn.isConnected();
            }
        };
        this.mContext = context;
        this.JS = new jm(context, looper, this.Km);
        this.JF = looper;
        this.Kd = new c(this, looper);
        this.JT = i;
        for (ConnectionCallbacks connectionCallbacks : set) {
            this.JS.registerConnectionCallbacks(connectionCallbacks);
            if (z) {
                jx.a++;
                break;
            }
        }
        for (OnConnectionFailedListener onConnectionFailedListener : set2) {
            this.JS.registerConnectionFailedListener(onConnectionFailedListener);
            if (z) {
                break;
            }
        }
        for (Api api : map.keySet()) {
            com.google.android.gms.common.api.Api.b gx = api.gx();
            Object obj = map.get(api);
            this.Kg.put(api.gz(), a(gx, obj, context, looper, jgVar, this.Kl, new AnonymousClass_4(this, gx)));
            if (z) {
                break;
            }
        }
        this.Kh = Collections.unmodifiableList(jgVar.ho());
    }

    static ConnectionResult a(c cVar, ConnectionResult connectionResult) {
        cVar.JV = connectionResult;
        return connectionResult;
    }

    private static com.google.android.gms.common.api.Api.a a(com.google.android.gms.common.api.Api.b bVar, Object obj, Context context, Looper looper, jg jgVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return bVar.a(context, looper, jgVar, obj, connectionCallbacks, onConnectionFailedListener);
    }

    static Lock a(c cVar) {
        return cVar.zO;
    }

    private void a(d dVar) {
        this.zO.lock();
        try {
            jx.b(dVar.gz() != null, (Object) "This task can not be executed or enqueued (it's probably a Batch or malformed)");
            this.Kk.add(dVar);
            dVar.a(this.Jy);
            if (gL()) {
                dVar.l(new Status(8));
                this.zO.unlock();
                return;
            }
            dVar.b(a(dVar.gz()));
        } finally {
            this.zO.unlock();
        }
    }

    static void a(c cVar, int i) {
        cVar.al(i);
    }

    static boolean a(c cVar, boolean z) {
        cVar.JY = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void al(int r7) {
        /*
        r6_this = this;
        r2 = 3;
        r4 = 1;
        r5 = -1;
        r1 = com.google.android.gms.common.api.Api.a;
        r0 = r6.zO;
        r0.lock();
        r0 = r6.JX;	 Catch:{ all -> 0x00dd }
        if (r0 == r2) goto L_0x00d7;
    L_0x000e:
        if (r7 != r5) goto L_0x008a;
    L_0x0010:
        r0 = r6.isConnecting();	 Catch:{ all -> 0x00dd }
        if (r0 == 0) goto L_0x0038;
    L_0x0016:
        r0 = r6.JU;	 Catch:{ all -> 0x00dd }
        r2 = r0.iterator();	 Catch:{ all -> 0x00dd }
    L_0x001c:
        r0 = r2.hasNext();	 Catch:{ all -> 0x00dd }
        if (r0 == 0) goto L_0x0036;
    L_0x0022:
        r0 = r2.next();	 Catch:{ all -> 0x00dd }
        r0 = (com.google.android.gms.common.api.c.d) r0;	 Catch:{ all -> 0x00dd }
        r3 = r0.gF();	 Catch:{ all -> 0x00dd }
        if (r3 == r4) goto L_0x0034;
    L_0x002e:
        r0.cancel();	 Catch:{ all -> 0x00dd }
        r2.remove();	 Catch:{ all -> 0x00dd }
    L_0x0034:
        if (r1 == 0) goto L_0x001c;
    L_0x0036:
        if (r1 == 0) goto L_0x003d;
    L_0x0038:
        r0 = r6.JU;	 Catch:{ all -> 0x00dd }
        r0.clear();	 Catch:{ all -> 0x00dd }
    L_0x003d:
        r0 = r6.Kk;	 Catch:{ all -> 0x00dd }
        r2 = r0.iterator();	 Catch:{ all -> 0x00dd }
    L_0x0043:
        r0 = r2.hasNext();	 Catch:{ all -> 0x00dd }
        if (r0 == 0) goto L_0x0054;
    L_0x0049:
        r0 = r2.next();	 Catch:{ all -> 0x00dd }
        r0 = (com.google.android.gms.common.api.c.d) r0;	 Catch:{ all -> 0x00dd }
        r0.cancel();	 Catch:{ all -> 0x00dd }
        if (r1 == 0) goto L_0x0043;
    L_0x0054:
        r0 = r6.Kk;	 Catch:{ all -> 0x00dd }
        r0.clear();	 Catch:{ all -> 0x00dd }
        r0 = r6.Kj;	 Catch:{ all -> 0x00dd }
        r2 = r0.iterator();	 Catch:{ all -> 0x00dd }
    L_0x005f:
        r0 = r2.hasNext();	 Catch:{ all -> 0x00dd }
        if (r0 == 0) goto L_0x0070;
    L_0x0065:
        r0 = r2.next();	 Catch:{ all -> 0x00dd }
        r0 = (com.google.android.gms.common.api.d) r0;	 Catch:{ all -> 0x00dd }
        r0.clear();	 Catch:{ all -> 0x00dd }
        if (r1 == 0) goto L_0x005f;
    L_0x0070:
        r0 = r6.Kj;	 Catch:{ all -> 0x00dd }
        r0.clear();	 Catch:{ all -> 0x00dd }
        r0 = r6.JV;	 Catch:{ all -> 0x00dd }
        if (r0 != 0) goto L_0x008a;
    L_0x0079:
        r0 = r6.JU;	 Catch:{ all -> 0x00dd }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00dd }
        if (r0 != 0) goto L_0x008a;
    L_0x0081:
        r0 = 1;
        r6.JZ = r0;	 Catch:{ all -> 0x00dd }
        r0 = r6.zO;
        r0.unlock();
    L_0x0089:
        return;
    L_0x008a:
        r0 = r6.isConnecting();	 Catch:{ all -> 0x00dd }
        r2 = r6.isConnected();	 Catch:{ all -> 0x00dd }
        r3 = 3;
        r6.JX = r3;	 Catch:{ all -> 0x00dd }
        if (r0 == 0) goto L_0x00a1;
    L_0x0097:
        if (r7 != r5) goto L_0x009c;
    L_0x0099:
        r0 = 0;
        r6.JV = r0;	 Catch:{ all -> 0x00dd }
    L_0x009c:
        r0 = r6.JR;	 Catch:{ all -> 0x00dd }
        r0.signalAll();	 Catch:{ all -> 0x00dd }
    L_0x00a1:
        r0 = 0;
        r6.Ki = r0;	 Catch:{ all -> 0x00dd }
        r0 = r6.Kg;	 Catch:{ all -> 0x00dd }
        r0 = r0.values();	 Catch:{ all -> 0x00dd }
        r3 = r0.iterator();	 Catch:{ all -> 0x00dd }
    L_0x00ae:
        r0 = r3.hasNext();	 Catch:{ all -> 0x00dd }
        if (r0 == 0) goto L_0x00c5;
    L_0x00b4:
        r0 = r3.next();	 Catch:{ all -> 0x00dd }
        r0 = (com.google.android.gms.common.api.Api.a) r0;	 Catch:{ all -> 0x00dd }
        r4 = r0.isConnected();	 Catch:{ all -> 0x00dd }
        if (r4 == 0) goto L_0x00c3;
    L_0x00c0:
        r0.disconnect();	 Catch:{ all -> 0x00dd }
    L_0x00c3:
        if (r1 == 0) goto L_0x00ae;
    L_0x00c5:
        r0 = 1;
        r6.Ki = r0;	 Catch:{ all -> 0x00dd }
        r0 = 4;
        r6.JX = r0;	 Catch:{ all -> 0x00dd }
        if (r2 == 0) goto L_0x00d7;
    L_0x00cd:
        if (r7 == r5) goto L_0x00d4;
    L_0x00cf:
        r0 = r6.JS;	 Catch:{ all -> 0x00dd }
        r0.aE(r7);	 Catch:{ all -> 0x00dd }
    L_0x00d4:
        r0 = 0;
        r6.Ki = r0;	 Catch:{ all -> 0x00dd }
    L_0x00d7:
        r0 = r6.zO;
        r0.unlock();
        goto L_0x0089;
    L_0x00dd:
        r0 = move-exception;
        r1 = r6.zO;
        r1.unlock();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.c.al(int):void");
    }

    static int b(c cVar) {
        return cVar.JX;
    }

    static int b(c cVar, int i) {
        cVar.JW = i;
        return i;
    }

    static Bundle c(c cVar) {
        return cVar.Kf;
    }

    static void d(c cVar) {
        cVar.gJ();
    }

    static Context e(c cVar) {
        return cVar.mContext;
    }

    static long f(c cVar) {
        return cVar.Kb;
    }

    static long g(c cVar) {
        return cVar.Kc;
    }

    private void gJ() {
        boolean z = Api.a;
        this.Ka--;
        if (this.Ka == 0) {
            if (this.JV != null) {
                this.JZ = false;
                al(3);
                if (!(gL() && GooglePlayServicesUtil.e(this.mContext, this.JV.getErrorCode()))) {
                    gM();
                    this.JS.b(this.JV);
                }
                this.Ki = false;
                if (!z) {
                    return;
                }
            }
            this.JX = 2;
            gM();
            this.JR.signalAll();
            gK();
            if (this.JZ) {
                this.JZ = false;
                al(-1);
                if (!z) {
                    return;
                }
            }
            this.JS.f(this.Kf.isEmpty() ? null : this.Kf);
        }
    }

    private void gK() {
        boolean z = Api.a;
        this.zO.lock();
        try {
            boolean z2;
            if (!isConnected()) {
                if (!gL()) {
                    z2 = false;
                    jx.a(z2, "GoogleApiClient is not connected yet.");
                    while (!this.JU.isEmpty()) {
                        a((d) this.JU.remove());
                    }
                    this.zO.unlock();
                }
            }
            z2 = true;
            jx.a(z2, "GoogleApiClient is not connected yet.");
            while (!this.JU.isEmpty()) {
                a((d) this.JU.remove());
            }
        } catch (DeadObjectException e) {
            throw e;
        } catch (Throwable e2) {
            Log.w("GoogleApiClientImpl", "Service died while flushing queue", e2);
            if (z) {
                break;
            }
        } catch (Throwable th) {
            this.zO.unlock();
        }
        this.zO.unlock();
    }

    private void gM() {
        Lock lock;
        this.zO.lock();
        try {
            if (this.JY) {
                this.JY = false;
                this.Kd.removeMessages(2);
                this.Kd.removeMessages(1);
                Lock lock2 = this.mContext;
                lock2.unregisterReceiver(this.Ke);
                lock = lock2;
                return;
            }
            this.zO.unlock();
        } finally {
            lock.unlock();
        }
    }

    static boolean h(c cVar) {
        return cVar.Ki;
    }

    static void i(c cVar) {
        cVar.gM();
    }

    static void j(c cVar) {
        cVar.resume();
    }

    static ConnectionResult k(c cVar) {
        return cVar.JV;
    }

    static int l(c cVar) {
        return cVar.JW;
    }

    private void resume() {
        this.zO.lock();
        try {
            if (gL()) {
                connect();
            }
            this.zO.unlock();
        } catch (Throwable th) {
            this.zO.unlock();
        }
    }

    public com.google.android.gms.common.api.Api.a a(com.google.android.gms.common.api.Api.c cVar) {
        Object obj = (com.google.android.gms.common.api.Api.a) this.Kg.get(cVar);
        jx.b(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    public com.google.android.gms.common.api.BaseImplementation.a b(com.google.android.gms.common.api.BaseImplementation.a aVar) {
        try {
            boolean z = isConnected() || gL();
            jx.a(z, "GoogleApiClient is not connected yet.");
            gK();
            try {
                a((d) aVar);
            } catch (DeadObjectException e) {
                al(1);
            }
            return aVar;
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (DeadObjectException e22) {
            throw e22;
        }
    }

    public void connect() {
        boolean z = Api.a;
        this.zO.lock();
        try {
            this.JZ = false;
            if (isConnected() || isConnecting()) {
                this.zO.unlock();
                return;
            }
            this.Ki = true;
            this.JV = null;
            this.JX = 1;
            this.Kf.clear();
            this.Ka = this.Kg.size();
            for (com.google.android.gms.common.api.Api.a aVar : this.Kg.values()) {
                aVar.connect();
                if (z) {
                    break;
                }
            }
            this.zO.unlock();
        } catch (Throwable th) {
            this.zO.unlock();
        }
    }

    public void disconnect() {
        gM();
        al(-1);
    }

    boolean gL() {
        return this.JY;
    }

    public Looper getLooper() {
        return this.JF;
    }

    public boolean isConnected() {
        return this.JX == 2;
    }

    public boolean isConnecting() {
        return this.JX == 1;
    }

    public void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
        this.JS.registerConnectionCallbacks(connectionCallbacks);
    }

    public void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        this.JS.registerConnectionFailedListener(onConnectionFailedListener);
    }

    public void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
        this.JS.unregisterConnectionCallbacks(connectionCallbacks);
    }

    public void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        this.JS.unregisterConnectionFailedListener(onConnectionFailedListener);
    }
}
