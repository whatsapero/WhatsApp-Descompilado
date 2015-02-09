package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.jl.b;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;

public abstract class jl implements com.google.android.gms.common.api.Api.a, com.google.android.gms.internal.jm.b {
    public static final String[] MP;
    private final Looper JF;
    private final jm JS;
    private IInterface MJ;
    private final ArrayList MK;
    private f ML;
    private int MM;
    private final String[] MN;
    boolean MO;
    private final Context mContext;
    private final Object mH;
    final Handler mHandler;

    final class a extends Handler {
        final jl MQ;

        public a(jl jlVar, Looper looper) {
            this.MQ = jlVar;
            super(looper);
        }

        public void handleMessage(Message message) {
            b bVar;
            if (message.what == 1 && !this.MQ.isConnecting()) {
                bVar = (b) message.obj;
                bVar.hx();
                bVar.unregister();
            } else if (message.what == 3) {
                jl.a(this.MQ).b(new ConnectionResult(((Integer) message.obj).intValue(), null));
            } else if (message.what == 4) {
                jl.a(this.MQ, 4, null);
                jl.a(this.MQ).aE(((Integer) message.obj).intValue());
                jl.a(this.MQ, 4, 1, null);
            } else if (message.what == 2 && !this.MQ.isConnected()) {
                bVar = (b) message.obj;
                bVar.hx();
                bVar.unregister();
            } else if (message.what == 2 || message.what == 1) {
                ((b) message.obj).hy();
            } else {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
            }
        }
    }

    public abstract class b {
        final jl MQ;
        private boolean MR;
        private Object mListener;

        public b(jl jlVar, Object obj) {
            this.MQ = jlVar;
            this.mListener = obj;
            this.MR = false;
        }

        protected abstract void g(Object obj);

        protected abstract void hx();

        public void hy() {
            synchronized (this) {
                try {
                    Object obj = this.mListener;
                    if (this.MR) {
                        Log.w("GmsClient", "Callback proxy " + this + " being reused. This is not safe.");
                    }
                } catch (RuntimeException e) {
                    throw e;
                } catch (Throwable th) {
                }
            }
            if (obj != null) {
                try {
                    g(obj);
                } catch (RuntimeException e2) {
                    hx();
                    throw e2;
                }
            }
            hx();
            synchronized (this) {
                this.MR = true;
            }
            unregister();
        }

        public void hz() {
            synchronized (this) {
                this.mListener = null;
            }
        }

        public void unregister() {
            hz();
            synchronized (jl.b(this.MQ)) {
                jl.b(this.MQ).remove(this);
            }
        }
    }

    public final class e extends com.google.android.gms.internal.js.a {
        private jl MT;

        public e(jl jlVar) {
            this.MT = jlVar;
        }

        public void b(int i, IBinder iBinder, Bundle bundle) {
            jx.b((Object) "onPostInitComplete can be called only once per call to getServiceFromBroker", this.MT);
            this.MT.a(i, iBinder, bundle);
            this.MT = null;
        }
    }

    public final class f implements ServiceConnection {
        final jl MQ;

        public f(jl jlVar) {
            this.MQ = jlVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.MQ.N(iBinder);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.MQ.mHandler.sendMessage(this.MQ.mHandler.obtainMessage(4, Integer.valueOf(1)));
        }
    }

    public final class h extends b {
        final jl MQ;
        public final Bundle MV;
        public final IBinder MW;
        public final int statusCode;

        public h(jl jlVar, int i, IBinder iBinder, Bundle bundle) {
            this.MQ = jlVar;
            super(jlVar, Boolean.valueOf(true));
            this.statusCode = i;
            this.MW = iBinder;
            this.MV = bundle;
        }

        protected void b(Boolean bool) {
            if (bool == null) {
                try {
                    jl.a(this.MQ, 1, null);
                    return;
                } catch (RemoteException e) {
                    throw e;
                }
            }
            try {
                switch (this.statusCode) {
                    case PBE.MD5 /*0*/:
                        try {
                            if (this.MQ.bL().equals(this.MW.getInterfaceDescriptor())) {
                                IInterface l = this.MQ.l(this.MW);
                                if (l != null) {
                                    jl.a(this.MQ, 3, l);
                                    jl.a(this.MQ).dU();
                                    return;
                                }
                            }
                        } catch (RemoteException e2) {
                        }
                        jn.J(jl.d(this.MQ)).b(this.MQ.bK(), jl.c(this.MQ));
                        jl.a(this.MQ, null);
                        jl.a(this.MQ, 1, null);
                        jl.a(this.MQ).b(new ConnectionResult(8, null));
                        if (!qw.a) {
                            return;
                        }
                        break;
                    case a6.h /*10*/:
                        break;
                    default:
                        PendingIntent pendingIntent = this.MV != null ? (PendingIntent) this.MV.getParcelable("pendingIntent") : null;
                        try {
                            if (jl.c(this.MQ) != null) {
                                jn.J(jl.d(this.MQ)).b(this.MQ.bK(), jl.c(this.MQ));
                                jl.a(this.MQ, null);
                            }
                            jl.a(this.MQ, 1, null);
                            jl.a(this.MQ).b(new ConnectionResult(this.statusCode, pendingIntent));
                            return;
                        } catch (RemoteException e3) {
                            throw e3;
                        }
                }
                jl.a(this.MQ, 1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            } catch (RemoteException e32) {
                throw e32;
            }
        }

        protected void g(Object obj) {
            b((Boolean) obj);
        }

        protected void hx() {
        }
    }

    static {
        MP = new String[]{"service_esmobile", "service_googleme"};
    }

    protected jl(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String[] strArr) {
        this.mH = new Object();
        this.MK = new ArrayList();
        this.MM = 1;
        this.MO = false;
        this.mContext = (Context) jx.i(context);
        this.JF = (Looper) jx.b((Object) looper, (Object) "Looper must not be null");
        this.JS = new jm(context, looper, this);
        this.mHandler = new a(this, looper);
        c(strArr);
        this.MN = strArr;
        registerConnectionCallbacks((ConnectionCallbacks) jx.i(connectionCallbacks));
        registerConnectionFailedListener((OnConnectionFailedListener) jx.i(onConnectionFailedListener));
    }

    static f a(jl jlVar, f fVar) {
        jlVar.ML = fVar;
        return fVar;
    }

    static jm a(jl jlVar) {
        return jlVar.JS;
    }

    private void a(int i, IInterface iInterface) {
        boolean z = true;
        if ((i == 3) != (iInterface != null)) {
            z = false;
        }
        jx.L(z);
        synchronized (this.mH) {
            this.MM = i;
            this.MJ = iInterface;
        }
    }

    static void a(jl jlVar, int i, IInterface iInterface) {
        jlVar.a(i, iInterface);
    }

    private boolean a(int i, int i2, IInterface iInterface) {
        boolean z;
        synchronized (this.mH) {
            if (this.MM != i) {
                z = false;
            } else {
                a(i2, iInterface);
                z = true;
            }
        }
        return z;
    }

    static boolean a(jl jlVar, int i, int i2, IInterface iInterface) {
        return jlVar.a(i, i2, iInterface);
    }

    static ArrayList b(jl jlVar) {
        return jlVar.MK;
    }

    static f c(jl jlVar) {
        return jlVar.ML;
    }

    static Context d(jl jlVar) {
        return jlVar.mContext;
    }

    protected final void N(IBinder iBinder) {
        try {
            a(com.google.android.gms.internal.jt.a.Q(iBinder), new e(this));
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "service died");
            aD(1);
        } catch (Throwable e2) {
            Log.w("GmsClient", "Remote exception occurred", e2);
        }
    }

    protected void a(int i, IBinder iBinder, Bundle bundle) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, new h(this, i, iBinder, bundle)));
    }

    protected abstract void a(jt jtVar, e eVar);

    public void aD(int i) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(4, Integer.valueOf(i)));
    }

    protected abstract String bK();

    protected abstract String bL();

    protected void c(String[] strArr) {
    }

    public void connect() {
        this.MO = true;
        a(2, null);
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.mContext);
        if (isGooglePlayServicesAvailable != 0) {
            try {
                a(1, null);
                this.mHandler.sendMessage(this.mHandler.obtainMessage(3, Integer.valueOf(isGooglePlayServicesAvailable)));
                return;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        try {
            if (this.ML != null) {
                Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + bK());
                jn.J(this.mContext).b(bK(), this.ML);
            }
            this.ML = new f(this);
            if (!jn.J(this.mContext).a(bK(), this.ML)) {
                try {
                    Log.e("GmsClient", "unable to connect to service: " + bK());
                    this.mHandler.sendMessage(this.mHandler.obtainMessage(3, Integer.valueOf(9)));
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    protected final void dS() {
        try {
            if (!isConnected()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void disconnect() {
        boolean z = qw.a;
        this.MO = false;
        synchronized (this.MK) {
            int size = this.MK.size();
            int i = 0;
            while (i < size) {
                ((b) this.MK.get(i)).hz();
                int i2 = i + 1;
                if (z) {
                    break;
                }
                i = i2;
            }
            this.MK.clear();
        }
        try {
            a(1, null);
            if (this.ML != null) {
                jn.J(this.mContext).b(bK(), this.ML);
                this.ML = null;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public Bundle fX() {
        return null;
    }

    public boolean gN() {
        return this.MO;
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final IInterface hw() {
        IInterface iInterface;
        synchronized (this.mH) {
            try {
                if (this.MM == 4) {
                    throw new DeadObjectException();
                }
                dS();
                jx.a(this.MJ != null, "Client is connected but service is null");
                iInterface = this.MJ;
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
        return iInterface;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.mH) {
            z = this.MM == 3;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.mH) {
            z = this.MM == 2;
        }
        return z;
    }

    protected abstract IInterface l(IBinder iBinder);

    public void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
        this.JS.registerConnectionCallbacks(connectionCallbacks);
    }

    public void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        this.JS.registerConnectionFailedListener(onConnectionFailedListener);
    }
}
