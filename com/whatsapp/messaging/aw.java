package com.whatsapp.messaging;

import com.whatsapp.util.Log;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

final class aw extends a7 {
    private static final TrustManager[] c;
    private static aw d;

    protected SSLSocketFactory a(SSLContext sSLContext) {
        try {
            sSLContext.init(null, c, null);
            return sSLContext.getSocketFactory();
        } catch (Throwable e) {
            Log.c(e);
            throw new RuntimeException(e);
        }
    }

    public static aw a() {
        return d;
    }

    static {
        c = new TrustManager[]{new a4()};
        d = new aw();
    }

    aw() {
    }
}
