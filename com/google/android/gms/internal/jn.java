package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.internal.jl.f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;

public final class jn implements Callback {
    private static final Object Nd;
    private static jn Ne;
    private final HashMap Nf;
    private final Handler mHandler;
    private final Context mO;

    final class a {
        private final String Ng;
        private final a Nh;
        private final HashSet Ni;
        private boolean Nj;
        private IBinder Nk;
        private ComponentName Nl;
        final jn Nm;
        private int mState;

        public class a implements ServiceConnection {
            final a Nn;

            public a(a aVar) {
                this.Nn = aVar;
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                boolean z = qw.a;
                synchronized (jn.a(this.Nn.Nm)) {
                    a.a(this.Nn, iBinder);
                    a.a(this.Nn, componentName);
                    Iterator it = a.a(this.Nn).iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).onServiceConnected(componentName, iBinder);
                        if (z) {
                            break;
                        }
                    }
                    a.a(this.Nn, 1);
                }
            }

            public void onServiceDisconnected(ComponentName componentName) {
                boolean z = qw.a;
                synchronized (jn.a(this.Nn.Nm)) {
                    a.a(this.Nn, null);
                    a.a(this.Nn, componentName);
                    Iterator it = a.a(this.Nn).iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).onServiceDisconnected(componentName);
                        if (z) {
                            break;
                        }
                    }
                    a.a(this.Nn, 2);
                }
            }
        }

        public a(jn jnVar, String str) {
            this.Nm = jnVar;
            this.Ng = str;
            this.Nh = new a(this);
            this.Ni = new HashSet();
            this.mState = 2;
        }

        static int a(a aVar, int i) {
            aVar.mState = i;
            return i;
        }

        static ComponentName a(a aVar, ComponentName componentName) {
            aVar.Nl = componentName;
            return componentName;
        }

        static IBinder a(a aVar, IBinder iBinder) {
            aVar.Nk = iBinder;
            return iBinder;
        }

        static HashSet a(a aVar) {
            return aVar.Ni;
        }

        public void a(f fVar) {
            this.Ni.add(fVar);
        }

        public void b(f fVar) {
            this.Ni.remove(fVar);
        }

        public boolean c(f fVar) {
            return this.Ni.contains(fVar);
        }

        public IBinder getBinder() {
            return this.Nk;
        }

        public ComponentName getComponentName() {
            return this.Nl;
        }

        public int getState() {
            return this.mState;
        }

        public void hA() {
            this.Nj = jn.b(this.Nm).bindService(new Intent(this.Ng).setPackage("com.google.android.gms"), this.Nh, 129);
            if (this.Nj) {
                this.mState = 3;
                if (!qw.a) {
                    return;
                }
            }
            jn.b(this.Nm).unbindService(this.Nh);
        }

        public void hB() {
            jn.b(this.Nm).unbindService(this.Nh);
            this.Nj = false;
            this.mState = 2;
        }

        public String hC() {
            return this.Ng;
        }

        public boolean hD() {
            return this.Ni.isEmpty();
        }

        public boolean isBound() {
            return this.Nj;
        }
    }

    static {
        Nd = new Object();
    }

    private jn(Context context) {
        this.mHandler = new Handler(context.getMainLooper(), this);
        this.Nf = new HashMap();
        this.mO = context.getApplicationContext();
    }

    public static jn J(Context context) {
        synchronized (Nd) {
            if (Ne == null) {
                Ne = new jn(context.getApplicationContext());
            }
        }
        return Ne;
    }

    static HashMap a(jn jnVar) {
        return jnVar.Nf;
    }

    static Context b(jn jnVar) {
        return jnVar.mO;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.String r6, com.google.android.gms.internal.jl.f r7) {
        /*
        r5_this = this;
        r1 = com.google.android.gms.internal.qw.a;
        r2 = r5.Nf;
        monitor-enter(r2);
        r0 = r5.Nf;	 Catch:{ all -> 0x0048 }
        r0 = r0.get(r6);	 Catch:{ all -> 0x0048 }
        r0 = (com.google.android.gms.internal.jn.a) r0;	 Catch:{ all -> 0x0048 }
        if (r0 != 0) goto L_0x0021;
    L_0x000f:
        r0 = new com.google.android.gms.internal.jn$a;	 Catch:{ all -> 0x0048 }
        r0.<init>(r5, r6);	 Catch:{ all -> 0x0048 }
        r0.a(r7);	 Catch:{ IllegalStateException -> 0x004b }
        r0.hA();	 Catch:{ IllegalStateException -> 0x004b }
        r3 = r5.Nf;	 Catch:{ IllegalStateException -> 0x004b }
        r3.put(r6, r0);	 Catch:{ IllegalStateException -> 0x004b }
        if (r1 == 0) goto L_0x0057;
    L_0x0021:
        r3 = r5.mHandler;	 Catch:{ IllegalStateException -> 0x004b }
        r4 = 0;
        r3.removeMessages(r4, r0);	 Catch:{ IllegalStateException -> 0x004b }
        r3 = r0.c(r7);	 Catch:{ IllegalStateException -> 0x004b }
        if (r3 == 0) goto L_0x004d;
    L_0x002d:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0046 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0046 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0046 }
        r3 = "Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=";
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x0046 }
        r1 = r1.append(r6);	 Catch:{ IllegalStateException -> 0x0046 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0046 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0046 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0048 }
        throw r0;
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0046 }
    L_0x004d:
        r0.a(r7);	 Catch:{ IllegalStateException -> 0x0070 }
        r3 = r0.getState();	 Catch:{ IllegalStateException -> 0x0070 }
        switch(r3) {
            case 1: goto L_0x005d;
            case 2: goto L_0x006a;
            default: goto L_0x0057;
        };
    L_0x0057:
        r0 = r0.isBound();	 Catch:{ all -> 0x0048 }
        monitor-exit(r2);	 Catch:{ all -> 0x0048 }
        return r0;
    L_0x005d:
        r3 = r0.getComponentName();	 Catch:{ IllegalStateException -> 0x0070 }
        r4 = r0.getBinder();	 Catch:{ IllegalStateException -> 0x0070 }
        r7.onServiceConnected(r3, r4);	 Catch:{ IllegalStateException -> 0x0070 }
        if (r1 == 0) goto L_0x0057;
    L_0x006a:
        r0.hA();	 Catch:{ IllegalStateException -> 0x006e }
        goto L_0x0057;
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0048 }
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006e }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jn.a(java.lang.String, com.google.android.gms.internal.jl$f):boolean");
    }

    public void b(String str, f fVar) {
        synchronized (this.Nf) {
            try {
                a aVar = (a) this.Nf.get(str);
                if (aVar == null) {
                    throw new IllegalStateException("Nonexistent connection status for service action: " + str);
                } else if (aVar.c(fVar)) {
                    aVar.b(fVar);
                    if (aVar.hD()) {
                        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(0, aVar), 5000);
                    }
                } else {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + str);
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (Throwable th) {
            }
        }
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case PBE.MD5 /*0*/:
                a aVar = (a) message.obj;
                synchronized (this.Nf) {
                    if (aVar.hD()) {
                        aVar.hB();
                        this.Nf.remove(aVar.hC());
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
