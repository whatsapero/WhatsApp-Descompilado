package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions;
import com.google.android.gms.common.api.Api.a;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.jg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Api {
    public static boolean a;
    private final b Jm;
    private final c Jn;
    private final ArrayList Jo;

    public interface ApiOptions {

        public interface NotRequiredOptions extends com.google.android.gms.common.api.Api.ApiOptions {
        }

        public final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
            }
        }
    }

    public interface a {
        void connect();

        void disconnect();

        boolean isConnected();
    }

    public interface b {
        a a(Context context, Looper looper, jg jgVar, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener);

        int getPriority();
    }

    public final class c {
    }

    public Api(b bVar, c cVar, Scope[] scopeArr) {
        this.Jm = bVar;
        this.Jn = cVar;
        this.Jo = new ArrayList(Arrays.asList(scopeArr));
    }

    public b gx() {
        return this.Jm;
    }

    public List gy() {
        return this.Jo;
    }

    public c gz() {
        return this.Jn;
    }
}
