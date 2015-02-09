package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.jx;

public class g extends Fragment implements OnCancelListener, LoaderCallbacks {
    private boolean KC;
    private int KD;
    private ConnectionResult KE;
    private final Handler KF;
    private final SparseArray KG;

    class a extends Loader implements ConnectionCallbacks, OnConnectionFailedListener {
        public final GoogleApiClient KH;
        private boolean KI;
        private ConnectionResult KJ;

        public a(Context context, GoogleApiClient googleApiClient) {
            super(context);
            this.KH = googleApiClient;
        }

        private void a(ConnectionResult connectionResult) {
            this.KJ = connectionResult;
            if (isStarted() && !isAbandoned()) {
                deliverResult(connectionResult);
            }
        }

        public void gS() {
            if (this.KI) {
                this.KI = false;
                if (isStarted() && !isAbandoned()) {
                    this.KH.connect();
                }
            }
        }

        public void onConnected(Bundle bundle) {
            this.KI = false;
            a(ConnectionResult.Iu);
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            this.KI = true;
            a(connectionResult);
        }

        public void onConnectionSuspended(int i) {
        }

        protected void onReset() {
            this.KJ = null;
            this.KI = false;
            this.KH.unregisterConnectionCallbacks(this);
            this.KH.unregisterConnectionFailedListener(this);
            this.KH.disconnect();
        }

        protected void onStartLoading() {
            super.onStartLoading();
            this.KH.registerConnectionCallbacks(this);
            this.KH.registerConnectionFailedListener(this);
            if (this.KJ != null) {
                deliverResult(this.KJ);
            }
            if (!this.KH.isConnected() && !this.KH.isConnecting() && !this.KI) {
                this.KH.connect();
            }
        }

        protected void onStopLoading() {
            this.KH.disconnect();
        }
    }

    class b {
        public final GoogleApiClient KH;
        public final OnConnectionFailedListener KK;

        private b(GoogleApiClient googleApiClient, OnConnectionFailedListener onConnectionFailedListener) {
            this.KH = googleApiClient;
            this.KK = onConnectionFailedListener;
        }

        b(GoogleApiClient googleApiClient, OnConnectionFailedListener onConnectionFailedListener, AnonymousClass_1 anonymousClass_1) {
            this(googleApiClient, onConnectionFailedListener);
        }
    }

    class c implements Runnable {
        private final int KL;
        private final ConnectionResult KM;
        final g KN;

        public c(g gVar, int i, ConnectionResult connectionResult) {
            this.KN = gVar;
            this.KL = i;
            this.KM = connectionResult;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            r6_this = this;
            r0 = com.google.android.gms.common.api.Api.a;
            r1 = r6.KM;
            r1 = r1.hasResolution();
            if (r1 == 0) goto L_0x0038;
        L_0x000a:
            r1 = r6.KN;	 Catch:{ SendIntentException -> 0x0030 }
            r1 = r1.getActivity();	 Catch:{ SendIntentException -> 0x0030 }
            r1 = r1.getSupportFragmentManager();	 Catch:{ SendIntentException -> 0x0030 }
            r1 = r1.getFragments();	 Catch:{ SendIntentException -> 0x0030 }
            r2 = r6.KN;	 Catch:{ SendIntentException -> 0x0030 }
            r1 = r1.indexOf(r2);	 Catch:{ SendIntentException -> 0x0030 }
            r1 = r1 + 1;
            r1 = r1 << 16;
            r1 = r1 + 1;
            r2 = r6.KM;	 Catch:{ SendIntentException -> 0x0030 }
            r3 = r6.KN;	 Catch:{ SendIntentException -> 0x0030 }
            r3 = r3.getActivity();	 Catch:{ SendIntentException -> 0x0030 }
            r2.startResolutionForResult(r3, r1);	 Catch:{ SendIntentException -> 0x0030 }
        L_0x002f:
            return;
        L_0x0030:
            r1 = move-exception;
            r1 = r6.KN;	 Catch:{ SendIntentException -> 0x0066 }
            com.google.android.gms.common.api.g.a(r1);	 Catch:{ SendIntentException -> 0x0066 }
            if (r0 == 0) goto L_0x002f;
        L_0x0038:
            r1 = r6.KM;	 Catch:{ SendIntentException -> 0x0068 }
            r1 = r1.getErrorCode();	 Catch:{ SendIntentException -> 0x0068 }
            r1 = com.google.android.gms.common.GooglePlayServicesUtil.isUserRecoverableError(r1);	 Catch:{ SendIntentException -> 0x0068 }
            if (r1 == 0) goto L_0x005a;
        L_0x0044:
            r1 = r6.KM;	 Catch:{ SendIntentException -> 0x0064 }
            r1 = r1.getErrorCode();	 Catch:{ SendIntentException -> 0x0064 }
            r2 = r6.KN;	 Catch:{ SendIntentException -> 0x0064 }
            r2 = r2.getActivity();	 Catch:{ SendIntentException -> 0x0064 }
            r3 = r6.KN;	 Catch:{ SendIntentException -> 0x0064 }
            r4 = 2;
            r5 = r6.KN;	 Catch:{ SendIntentException -> 0x0064 }
            com.google.android.gms.common.GooglePlayServicesUtil.showErrorDialogFragment(r1, r2, r3, r4, r5);	 Catch:{ SendIntentException -> 0x0064 }
            if (r0 == 0) goto L_0x002f;
        L_0x005a:
            r0 = r6.KN;	 Catch:{ SendIntentException -> 0x0064 }
            r1 = r6.KL;	 Catch:{ SendIntentException -> 0x0064 }
            r2 = r6.KM;	 Catch:{ SendIntentException -> 0x0064 }
            com.google.android.gms.common.api.g.a(r0, r1, r2);	 Catch:{ SendIntentException -> 0x0064 }
            goto L_0x002f;
        L_0x0064:
            r0 = move-exception;
            throw r0;
        L_0x0066:
            r0 = move-exception;
            throw r0;	 Catch:{ SendIntentException -> 0x0068 }
        L_0x0068:
            r0 = move-exception;
            throw r0;	 Catch:{ SendIntentException -> 0x0064 }
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.g.c.run():void");
        }
    }

    public g() {
        this.KD = -1;
        this.KF = new Handler(Looper.getMainLooper());
        this.KG = new SparseArray();
    }

    public static g a(FragmentActivity fragmentActivity) {
        jx.aU("Must be called from main thread of process");
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        try {
            g gVar = (g) supportFragmentManager.findFragmentByTag("GmsSupportLifecycleFragment");
            if (gVar != null) {
                try {
                    if (!gVar.isRemoving()) {
                        return gVar;
                    }
                } catch (ClassCastException e) {
                    throw e;
                }
            }
            Fragment gVar2 = new g();
            supportFragmentManager.beginTransaction().add(gVar2, "GmsSupportLifecycleFragment").commit();
            supportFragmentManager.executePendingTransactions();
            return gVar2;
        } catch (Throwable e2) {
            throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", e2);
        }
    }

    private void a(int i, ConnectionResult connectionResult) {
        try {
            if (!this.KC) {
                this.KC = true;
                this.KD = i;
                this.KE = connectionResult;
                this.KF.post(new c(this, i, connectionResult));
            }
        } catch (ClassCastException e) {
            throw e;
        }
    }

    static void a(g gVar) {
        gVar.gR();
    }

    static void a(g gVar, int i, ConnectionResult connectionResult) {
        gVar.b(i, connectionResult);
    }

    private void aq(int i) {
        try {
            if (i == this.KD) {
                gR();
            }
        } catch (ClassCastException e) {
            throw e;
        }
    }

    private void b(int i, ConnectionResult connectionResult) {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        b bVar = (b) this.KG.get(i);
        if (bVar != null) {
            ao(i);
            OnConnectionFailedListener onConnectionFailedListener = bVar.KK;
            if (onConnectionFailedListener != null) {
                try {
                    onConnectionFailedListener.onConnectionFailed(connectionResult);
                } catch (ClassCastException e) {
                    throw e;
                }
            }
        }
        gR();
    }

    private void gR() {
        int i = 0;
        boolean z = Api.a;
        this.KC = false;
        this.KD = -1;
        this.KE = null;
        LoaderManager loaderManager = getLoaderManager();
        while (i < this.KG.size()) {
            int keyAt = this.KG.keyAt(i);
            a ap = ap(keyAt);
            if (ap != null) {
                try {
                    ap.gS();
                } catch (ClassCastException e) {
                    throw e;
                }
            }
            loaderManager.initLoader(keyAt, null, this);
            i++;
            if (z) {
                return;
            }
        }
    }

    public void a(int i, GoogleApiClient googleApiClient, OnConnectionFailedListener onConnectionFailedListener) {
        try {
            jx.b((Object) googleApiClient, (Object) "GoogleApiClient instance cannot be null");
            jx.a(this.KG.indexOfKey(i) < 0, "Already managing a GoogleApiClient with id " + i);
            try {
                this.KG.put(i, new b(googleApiClient, onConnectionFailedListener, null));
                if (getActivity() != null) {
                    getLoaderManager().initLoader(i, null, this);
                }
            } catch (ClassCastException e) {
                throw e;
            }
        } catch (ClassCastException e2) {
            throw e2;
        }
    }

    public void a(Loader loader, ConnectionResult connectionResult) {
        try {
            if (connectionResult.isSuccess()) {
                aq(loader.getId());
                try {
                    if (!Api.a) {
                        return;
                    }
                }
            }
            a(loader.getId(), connectionResult);
        } catch (ClassCastException e) {
            throw e;
        } catch (ClassCastException e2) {
            throw e2;
        }
    }

    public GoogleApiClient an(int i) {
        if (getActivity() != null) {
            a ap = ap(i);
            if (ap != null) {
                try {
                    return ap.KH;
                } catch (ClassCastException e) {
                    throw e;
                }
            }
        }
        return null;
    }

    public void ao(int i) {
        getLoaderManager().destroyLoader(i);
        this.KG.remove(i);
    }

    a ap(int i) {
        try {
            return (a) getLoaderManager().getLoader(i);
        } catch (Throwable e) {
            throw new IllegalStateException("Unknown loader in SupportLifecycleFragment", e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
        r4_this = this;
        r0 = 1;
        r2 = com.google.android.gms.common.api.Api.a;
        r1 = 0;
        switch(r5) {
            case 1: goto L_0x0024;
            case 2: goto L_0x0017;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = r1;
    L_0x0008:
        if (r0 == 0) goto L_0x000f;
    L_0x000a:
        r4.gR();	 Catch:{ ClassCastException -> 0x002a }
        if (r2 == 0) goto L_0x0016;
    L_0x000f:
        r0 = r4.KD;	 Catch:{ ClassCastException -> 0x002a }
        r1 = r4.KE;	 Catch:{ ClassCastException -> 0x002a }
        r4.b(r0, r1);	 Catch:{ ClassCastException -> 0x002a }
    L_0x0016:
        return;
    L_0x0017:
        r3 = r4.getActivity();	 Catch:{ ClassCastException -> 0x0028 }
        r3 = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(r3);	 Catch:{ ClassCastException -> 0x0028 }
        if (r3 != 0) goto L_0x0007;
    L_0x0021:
        if (r2 == 0) goto L_0x0008;
    L_0x0023:
        r1 = r0;
    L_0x0024:
        r3 = -1;
        if (r6 != r3) goto L_0x0007;
    L_0x0027:
        goto L_0x0008;
    L_0x0028:
        r0 = move-exception;
        throw r0;
    L_0x002a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.g.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttach(android.app.Activity r6) {
        /*
        r5_this = this;
        r2 = com.google.android.gms.common.api.Api.a;
        super.onAttach(r6);
        r0 = 0;
        r1 = r0;
    L_0x0007:
        r0 = r5.KG;
        r0 = r0.size();
        if (r1 >= r0) goto L_0x003f;
    L_0x000f:
        r0 = r5.KG;
        r3 = r0.keyAt(r1);
        r4 = r5.ap(r3);
        if (r4 == 0) goto L_0x0033;
    L_0x001b:
        r0 = r5.KG;
        r0 = r0.valueAt(r1);
        r0 = (com.google.android.gms.common.api.g.b) r0;
        r0 = r0.KH;	 Catch:{ ClassCastException -> 0x0040 }
        r4 = r4.KH;	 Catch:{ ClassCastException -> 0x0040 }
        if (r0 == r4) goto L_0x0033;
    L_0x0029:
        r0 = r5.getLoaderManager();	 Catch:{ ClassCastException -> 0x0042 }
        r4 = 0;
        r0.restartLoader(r3, r4, r5);	 Catch:{ ClassCastException -> 0x0042 }
        if (r2 == 0) goto L_0x003b;
    L_0x0033:
        r0 = r5.getLoaderManager();	 Catch:{ ClassCastException -> 0x0042 }
        r4 = 0;
        r0.initLoader(r3, r4, r5);	 Catch:{ ClassCastException -> 0x0042 }
    L_0x003b:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x0044;
    L_0x003f:
        return;
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassCastException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r1 = r0;
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.g.onAttach(android.app.Activity):void");
    }

    public void onCancel(DialogInterface dialogInterface) {
        b(this.KD, this.KE);
    }

    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            try {
                if (bundle != null) {
                    this.KC = bundle.getBoolean("resolving_error", false);
                    this.KD = bundle.getInt("failed_client_id", -1);
                    if (this.KD >= 0) {
                        this.KE = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"));
                    }
                }
            }
        } catch (ClassCastException e) {
            throw e;
        } catch (ClassCastException e2) {
            throw e2;
        }
    }

    public Loader onCreateLoader(int i, Bundle bundle) {
        return new a(getActivity(), ((b) this.KG.get(i)).KH);
    }

    public void onLoadFinished(Loader loader, Object obj) {
        a(loader, (ConnectionResult) obj);
    }

    public void onLoaderReset(Loader loader) {
        try {
            if (loader.getId() == this.KD) {
                gR();
            }
        } catch (ClassCastException e) {
            throw e;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("resolving_error", this.KC);
            if (this.KD >= 0) {
                bundle.putInt("failed_client_id", this.KD);
                bundle.putInt("failed_status", this.KE.getErrorCode());
                bundle.putParcelable("failed_resolution", this.KE.getResolution());
            }
        } catch (ClassCastException e) {
            throw e;
        }
    }

    public void onStart() {
        boolean z = Api.a;
        super.onStart();
        if (!this.KC) {
            int i = 0;
            while (i < this.KG.size()) {
                getLoaderManager().initLoader(this.KG.keyAt(i), null, this);
                i++;
                if (z) {
                    return;
                }
            }
        }
    }
}
