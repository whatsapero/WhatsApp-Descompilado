package com.google.android.gms.analytics;

import com.google.android.gms.analytics.y.a;
import com.google.android.gms.internal.jx;

public class ae {
    private static GoogleAnalytics BL;
    private static volatile boolean BM;
    private static Logger BN;

    static {
        BM = false;
    }

    private ae() {
    }

    public static void T(String str) {
        Logger logger = getLogger();
        if (logger != null) {
            logger.error(str);
        }
    }

    public static void V(String str) {
        Logger logger = getLogger();
        if (logger != null) {
            logger.verbose(str);
        }
    }

    static Logger getLogger() {
        boolean z = a.a;
        synchronized (ae.class) {
            if (BM) {
                if (BN == null) {
                    BN = new p();
                }
                Logger logger = BN;
                return logger;
            }
            if (BL == null) {
                BL = GoogleAnalytics.eY();
            }
            if (BL != null) {
                logger = BL.getLogger();
                return logger;
            }
            if (jx.a != 0) {
                a.a = !z;
            }
            return null;
        }
    }
}
