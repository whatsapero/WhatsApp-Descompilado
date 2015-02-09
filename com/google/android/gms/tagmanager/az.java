package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.b;

class az extends aj {
    private static final String ID;
    private static final String arJ;
    private static final String arK;
    private static final String arL;
    private static final String arp;

    enum a {
        NONE,
        URL,
        BACKSLASH;
        public static final a arN;
        public static final a arO;
        public static final a arP;
        private static final a[] arQ;

        static {
            arN = new a("NONE", 0);
            arO = new a("URL", 1);
            arP = new a("BACKSLASH", 2);
            arQ = new a[]{arN, arO, arP};
        }
    }

    static {
        ID = com.google.android.gms.internal.a.ae.toString();
        arp = b.bw.toString();
        arJ = b.di.toString();
        arK = b.dm.toString();
        arL = b.cH.toString();
    }
}
