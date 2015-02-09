package com.google.android.gms.analytics;

import com.google.android.gms.analytics.c.b;
import com.google.android.gms.analytics.c.c;

class w implements ak, b, c {

    enum a {
        CONNECTING,
        CONNECTED_SERVICE,
        CONNECTED_LOCAL,
        BLOCKED,
        PENDING_CONNECTION,
        PENDING_DISCONNECT,
        DISCONNECTED;
        public static final a zA;
        public static final a zB;
        public static final a zC;
        public static final a zD;
        private static final a[] zE;
        public static final a zx;
        public static final a zy;
        public static final a zz;

        static {
            zx = new a("CONNECTING", 0);
            zy = new a("CONNECTED_SERVICE", 1);
            zz = new a("CONNECTED_LOCAL", 2);
            zA = new a("BLOCKED", 3);
            zB = new a("PENDING_CONNECTION", 4);
            zC = new a("PENDING_DISCONNECT", 5);
            zD = new a("DISCONNECTED", 6);
            zE = new a[]{zx, zy, zz, zA, zB, zC, zD};
        }
    }
}
