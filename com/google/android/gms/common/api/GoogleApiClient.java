package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.a;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jx;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface GoogleApiClient {

    public final class Builder {
        private String DZ;
        private Looper JF;
        private final Set JH;
        private int JI;
        private View JJ;
        private String JK;
        private final Map JL;
        private FragmentActivity JM;
        private int JN;
        private OnConnectionFailedListener JO;
        private final Set JP;
        private final Set JQ;
        private final Context mContext;

        public Builder(Context context) {
            boolean z = Api.a;
            this.JH = new HashSet();
            this.JL = new HashMap();
            this.JN = -1;
            this.JP = new HashSet();
            this.JQ = new HashSet();
            this.mContext = context;
            this.JF = context.getMainLooper();
            this.JK = context.getPackageName();
            if (jx.a != 0) {
                Api.a = !z;
            }
        }

        private GoogleApiClient gI() {
            g a = g.a(this.JM);
            GoogleApiClient an = a.an(this.JN);
            if (an == null) {
                an = new c(this.mContext.getApplicationContext(), this.JF, gH(), this.JL, this.JP, this.JQ, this.JN);
            }
            a.a(this.JN, an, this.JO);
            return an;
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder addApi(Api api) {
            boolean z = Api.a;
            this.JL.put(api, null);
            List gy = api.gy();
            int size = gy.size();
            int i = 0;
            while (i < size) {
                this.JH.add(((Scope) gy.get(i)).gO());
                int i2 = i + 1;
                if (z) {
                    break;
                }
                i = i2;
            }
            return this;
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder addConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
            this.JP.add(connectionCallbacks);
            return this;
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder addOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
            this.JQ.add(onConnectionFailedListener);
            return this;
        }

        public GoogleApiClient build() {
            jx.b(!this.JL.isEmpty(), (Object) "must call addApi() to add at least one API");
            return this.JN >= 0 ? gI() : new c(this.mContext, this.JF, gH(), this.JL, this.JP, this.JQ, -1);
        }

        public jg gH() {
            return new jg(this.DZ, this.JH, this.JI, this.JJ, this.JK);
        }
    }

    public interface ConnectionCallbacks {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface OnConnectionFailedListener extends com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    a a(c cVar);

    BaseImplementation.a b(BaseImplementation.a aVar);

    void connect();

    void disconnect();

    Looper getLooper();

    boolean isConnected();

    boolean isConnecting();

    void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);
}
