package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.BaseImplementation.AbstractPendingResult;
import com.google.android.gms.common.api.BaseImplementation.CallbackHandler;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.internal.jr;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.whispersystems.libaxolotl.ay;

public class BaseImplementation {

    public interface b {
    }

    public abstract class AbstractPendingResult implements b, PendingResult {
        private final Object Jp;
        private final ArrayList Jq;
        private ResultCallback Jr;
        private volatile Result Js;
        private volatile boolean Jt;
        private boolean Ju;
        private boolean Jv;
        private jr Jw;
        protected final CallbackHandler mHandler;
        private final CountDownLatch mr;

        protected AbstractPendingResult(Looper looper) {
            this.Jp = new Object();
            this.mr = new CountDownLatch(1);
            this.Jq = new ArrayList();
            this.mHandler = new CallbackHandler(looper);
        }

        static void a(com.google.android.gms.common.api.BaseImplementation.AbstractPendingResult abstractPendingResult) {
            abstractPendingResult.gD();
        }

        private void c(Result result) {
            boolean z = Api.a;
            this.Js = result;
            this.Jw = null;
            this.mr.countDown();
            Status status = this.Js.getStatus();
            if (this.Jr != null) {
                this.mHandler.removeTimeoutMessages();
                if (!this.Ju) {
                    this.mHandler.sendResultCallback(this.Jr, gA());
                }
            }
            Iterator it = this.Jq.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.common.api.PendingResult.a) it.next()).m(status);
                if (z) {
                    break;
                }
            }
            this.Jq.clear();
        }

        private Result gA() {
            Result result;
            synchronized (this.Jp) {
                jx.a(!this.Jt, "Result has already been consumed.");
                jx.a(isReady(), "Result is not ready.");
                result = this.Js;
                gB();
            }
            return result;
        }

        private void gD() {
            synchronized (this.Jp) {
                if (!isReady()) {
                    b(c(Status.Kz));
                    this.Jv = true;
                }
            }
        }

        public final void b(Result result) {
            boolean z = true;
            synchronized (this.Jp) {
                if (this.Jv || this.Ju) {
                    BaseImplementation.a(result);
                    return;
                }
                jx.a(!isReady(), "Results have already been set");
                if (this.Jt) {
                    z = false;
                }
                jx.a(z, "Result has already been consumed");
                c(result);
            }
        }

        protected abstract Result c(Status status);

        public void cancel() {
            synchronized (this.Jp) {
                if (this.Ju || this.Jt) {
                    return;
                }
                if (this.Jw != null) {
                    try {
                        this.Jw.cancel();
                    } catch (RemoteException e) {
                    }
                }
                BaseImplementation.a(this.Js);
                this.Jr = null;
                this.Ju = true;
                c(c(Status.KA));
            }
        }

        protected void gB() {
            this.Jt = true;
            this.Js = null;
            this.Jr = null;
        }

        public final boolean isReady() {
            return this.mr.getCount() == 0;
        }
    }

    public class CallbackHandler extends Handler {
        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }

        protected void deliverResultCallback(ResultCallback resultCallback, Result result) {
            try {
                resultCallback.onResult(result);
            } catch (RuntimeException e) {
                BaseImplementation.a(result);
                throw e;
            }
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case ay.f /*1*/:
                    Pair pair = (Pair) message.obj;
                    deliverResultCallback((ResultCallback) pair.first, (Result) pair.second);
                case ay.n /*2*/:
                    AbstractPendingResult.a((AbstractPendingResult) message.obj);
                default:
                    Log.wtf("GoogleApi", "Don't know how to handle this message.");
            }
        }

        public void removeTimeoutMessages() {
            removeMessages(2);
        }

        public void sendResultCallback(ResultCallback resultCallback, Result result) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, result)));
        }
    }

    public abstract class a extends AbstractPendingResult implements d {
        private final c Jn;
        private final GoogleApiClient Jx;
        private b Jy;

        protected a(c cVar, GoogleApiClient googleApiClient) {
            super(googleApiClient.getLooper());
            this.Jn = (c) jx.i(cVar);
            this.Jx = googleApiClient;
        }

        private void a(RemoteException remoteException) {
            l(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        protected abstract void a(com.google.android.gms.common.api.Api.a aVar);

        public void a(b bVar) {
            this.Jy = bVar;
        }

        public final void b(com.google.android.gms.common.api.Api.a aVar) {
            try {
                a(aVar);
            } catch (RemoteException e) {
                a(e);
                throw e;
            } catch (RemoteException e2) {
                a(e2);
            }
        }

        protected void gB() {
            super.gB();
            if (this.Jy != null) {
                this.Jy.b(this);
                this.Jy = null;
            }
        }

        public int gF() {
            return 0;
        }

        public final c gz() {
            return this.Jn;
        }

        public final void l(Status status) {
            jx.b(!status.isSuccess(), (Object) "Failed result must not be success");
            b(c(status));
        }
    }

    static void a(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (Throwable e) {
                Log.w("GoogleApi", "Unable to release " + result, e);
            }
        }
    }
}
