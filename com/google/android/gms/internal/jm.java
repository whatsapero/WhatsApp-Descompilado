package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import java.util.ArrayList;
import java.util.Iterator;

public final class jm {
    private final b MX;
    private final ArrayList MY;
    final ArrayList MZ;
    private boolean Na;
    private final ArrayList Nb;
    private final Handler mHandler;

    public interface b {
        Bundle fX();

        boolean gN();

        boolean isConnected();
    }

    final class a extends Handler {
        final jm Nc;

        public a(jm jmVar, Looper looper) {
            this.Nc = jmVar;
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                synchronized (jm.a(this.Nc)) {
                    if (jm.b(this.Nc).gN() && jm.b(this.Nc).isConnected() && jm.a(this.Nc).contains(message.obj)) {
                        ((ConnectionCallbacks) message.obj).onConnected(jm.b(this.Nc).fX());
                    }
                }
                return;
            }
            Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
        }
    }

    public jm(Context context, Looper looper, b bVar) {
        this.MY = new ArrayList();
        this.MZ = new ArrayList();
        this.Na = false;
        this.Nb = new ArrayList();
        this.MX = bVar;
        this.mHandler = new a(this, looper);
    }

    static ArrayList a(jm jmVar) {
        return jmVar.MY;
    }

    static b b(jm jmVar) {
        return jmVar.MX;
    }

    public void aE(int i) {
        boolean z = qw.a;
        this.mHandler.removeMessages(1);
        synchronized (this.MY) {
            this.Na = true;
            Iterator it = new ArrayList(this.MY).iterator();
            while (it.hasNext()) {
                ConnectionCallbacks connectionCallbacks = (ConnectionCallbacks) it.next();
                if (!this.MX.gN()) {
                    break;
                }
                if (this.MY.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnectionSuspended(i);
                    continue;
                }
                if (z) {
                    break;
                }
            }
            this.Na = false;
        }
    }

    public void b(ConnectionResult connectionResult) {
        boolean z = qw.a;
        this.mHandler.removeMessages(1);
        synchronized (this.Nb) {
            Iterator it = new ArrayList(this.Nb).iterator();
            while (it.hasNext()) {
                OnConnectionFailedListener onConnectionFailedListener = (OnConnectionFailedListener) it.next();
                if (this.MX.gN()) {
                    if (this.Nb.contains(onConnectionFailedListener)) {
                        onConnectionFailedListener.onConnectionFailed(connectionResult);
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                return;
            }
        }
    }

    protected void dU() {
        synchronized (this.MY) {
            f(this.MX.fX());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(android.os.Bundle r7) {
        /*
        r6_this = this;
        r1 = 0;
        r0 = 1;
        r3 = com.google.android.gms.internal.qw.a;
        r4 = r6.MY;
        monitor-enter(r4);
        r2 = r6.Na;	 Catch:{ all -> 0x0066 }
        if (r2 != 0) goto L_0x0054;
    L_0x000b:
        r2 = r0;
    L_0x000c:
        com.google.android.gms.internal.jx.K(r2);	 Catch:{ all -> 0x0066 }
        r2 = r6.mHandler;	 Catch:{ all -> 0x0066 }
        r5 = 1;
        r2.removeMessages(r5);	 Catch:{ all -> 0x0066 }
        r2 = 1;
        r6.Na = r2;	 Catch:{ all -> 0x0066 }
        r2 = r6.MZ;	 Catch:{ all -> 0x0066 }
        r2 = r2.size();	 Catch:{ all -> 0x0066 }
        if (r2 != 0) goto L_0x0056;
    L_0x0020:
        com.google.android.gms.internal.jx.K(r0);	 Catch:{ all -> 0x0066 }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0066 }
        r1 = r6.MY;	 Catch:{ all -> 0x0066 }
        r0.<init>(r1);	 Catch:{ all -> 0x0066 }
        r1 = r0.iterator();	 Catch:{ all -> 0x0066 }
    L_0x002e:
        r0 = r1.hasNext();	 Catch:{ all -> 0x0066 }
        if (r0 == 0) goto L_0x004a;
    L_0x0034:
        r0 = r1.next();	 Catch:{ all -> 0x0066 }
        r0 = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r0;	 Catch:{ all -> 0x0066 }
        r2 = r6.MX;	 Catch:{ all -> 0x0066 }
        r2 = r2.gN();	 Catch:{ all -> 0x0066 }
        if (r2 == 0) goto L_0x004a;
    L_0x0042:
        r2 = r6.MX;	 Catch:{ all -> 0x0066 }
        r2 = r2.isConnected();	 Catch:{ all -> 0x0066 }
        if (r2 != 0) goto L_0x0058;
    L_0x004a:
        r0 = r6.MZ;	 Catch:{ all -> 0x0066 }
        r0.clear();	 Catch:{ all -> 0x0066 }
        r0 = 0;
        r6.Na = r0;	 Catch:{ all -> 0x0066 }
        monitor-exit(r4);	 Catch:{ all -> 0x0066 }
        return;
    L_0x0054:
        r2 = r1;
        goto L_0x000c;
    L_0x0056:
        r0 = r1;
        goto L_0x0020;
    L_0x0058:
        r2 = r6.MZ;	 Catch:{ all -> 0x0066 }
        r2 = r2.contains(r0);	 Catch:{ all -> 0x0066 }
        if (r2 != 0) goto L_0x0063;
    L_0x0060:
        r0.onConnected(r7);	 Catch:{ all -> 0x0066 }
    L_0x0063:
        if (r3 == 0) goto L_0x002e;
    L_0x0065:
        goto L_0x004a;
    L_0x0066:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0066 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jm.f(android.os.Bundle):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r5) {
        /*
        r4_this = this;
        com.google.android.gms.internal.jx.i(r5);
        r1 = r4.MY;
        monitor-enter(r1);
        r0 = r4.MY;	 Catch:{ all -> 0x004b }
        r0 = r0.contains(r5);	 Catch:{ all -> 0x004b }
        if (r0 == 0) goto L_0x0030;
    L_0x000e:
        r0 = "GmsClientEvents";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004b }
        r2.<init>();	 Catch:{ all -> 0x004b }
        r3 = "registerConnectionCallbacks(): listener ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x004b }
        r2 = r2.append(r5);	 Catch:{ all -> 0x004b }
        r3 = " is already registered";
        r2 = r2.append(r3);	 Catch:{ all -> 0x004b }
        r2 = r2.toString();	 Catch:{ all -> 0x004b }
        android.util.Log.w(r0, r2);	 Catch:{ all -> 0x004b }
        r0 = com.google.android.gms.internal.qw.a;	 Catch:{ all -> 0x004b }
        if (r0 == 0) goto L_0x0035;
    L_0x0030:
        r0 = r4.MY;	 Catch:{ all -> 0x004b }
        r0.add(r5);	 Catch:{ all -> 0x004b }
    L_0x0035:
        monitor-exit(r1);	 Catch:{ all -> 0x004b }
        r0 = r4.MX;
        r0 = r0.isConnected();
        if (r0 == 0) goto L_0x004a;
    L_0x003e:
        r0 = r4.mHandler;
        r1 = r4.mHandler;
        r2 = 1;
        r1 = r1.obtainMessage(r2, r5);
        r0.sendMessage(r1);
    L_0x004a:
        return;
    L_0x004b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x004b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jm.registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener r5) {
        /*
        r4_this = this;
        com.google.android.gms.internal.jx.i(r5);
        r1 = r4.Nb;
        monitor-enter(r1);
        r0 = r4.Nb;	 Catch:{ all -> 0x0037 }
        r0 = r0.contains(r5);	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x0030;
    L_0x000e:
        r0 = "GmsClientEvents";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0037 }
        r2.<init>();	 Catch:{ all -> 0x0037 }
        r3 = "registerConnectionFailedListener(): listener ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x0037 }
        r2 = r2.append(r5);	 Catch:{ all -> 0x0037 }
        r3 = " is already registered";
        r2 = r2.append(r3);	 Catch:{ all -> 0x0037 }
        r2 = r2.toString();	 Catch:{ all -> 0x0037 }
        android.util.Log.w(r0, r2);	 Catch:{ all -> 0x0037 }
        r0 = com.google.android.gms.internal.qw.a;	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x0035;
    L_0x0030:
        r0 = r4.Nb;	 Catch:{ all -> 0x0037 }
        r0.add(r5);	 Catch:{ all -> 0x0037 }
    L_0x0035:
        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
        return;
    L_0x0037:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jm.registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient$OnConnectionFailedListener):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r5) {
        /*
        r4_this = this;
        com.google.android.gms.internal.jx.i(r5);
        r1 = r4.MY;
        monitor-enter(r1);
        r0 = r4.MY;	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x003d;
    L_0x000a:
        r0 = r4.MY;	 Catch:{ all -> 0x003f }
        r0 = r0.remove(r5);	 Catch:{ all -> 0x003f }
        if (r0 != 0) goto L_0x0034;
    L_0x0012:
        r0 = "GmsClientEvents";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x003f }
        r2.<init>();	 Catch:{ all -> 0x003f }
        r3 = "unregisterConnectionCallbacks(): listener ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x003f }
        r2 = r2.append(r5);	 Catch:{ all -> 0x003f }
        r3 = " not found";
        r2 = r2.append(r3);	 Catch:{ all -> 0x003f }
        r2 = r2.toString();	 Catch:{ all -> 0x003f }
        android.util.Log.w(r0, r2);	 Catch:{ all -> 0x003f }
        r0 = com.google.android.gms.internal.qw.a;	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x003d;
    L_0x0034:
        r0 = r4.Na;	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x003d;
    L_0x0038:
        r0 = r4.MZ;	 Catch:{ all -> 0x003f }
        r0.add(r5);	 Catch:{ all -> 0x003f }
    L_0x003d:
        monitor-exit(r1);	 Catch:{ all -> 0x003f }
        return;
    L_0x003f:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003f }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jm.unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks):void");
    }

    public void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        jx.i(onConnectionFailedListener);
        synchronized (this.Nb) {
            if (!(this.Nb == null || this.Nb.remove(onConnectionFailedListener))) {
                Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + onConnectionFailedListener + " not found");
            }
        }
    }
}
