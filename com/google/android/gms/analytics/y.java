package com.google.android.gms.analytics;

import java.util.SortedSet;
import java.util.TreeSet;

class y {
    private static final y zV;
    private SortedSet zS;
    private StringBuilder zT;
    private boolean zU;

    public enum a {
        MAP_BUILDER_SET,
        MAP_BUILDER_SET_ALL,
        MAP_BUILDER_GET,
        MAP_BUILDER_SET_CAMPAIGN_PARAMS,
        BLANK_04,
        BLANK_05,
        BLANK_06,
        BLANK_07,
        BLANK_08,
        GET,
        SET,
        SEND,
        BLANK_12,
        BLANK_13,
        BLANK_14,
        BLANK_15,
        BLANK_16,
        BLANK_17,
        BLANK_18,
        BLANK_19,
        BLANK_20,
        BLANK_21,
        BLANK_22,
        BLANK_23,
        BLANK_24,
        BLANK_25,
        BLANK_26,
        BLANK_27,
        BLANK_28,
        BLANK_29,
        SET_EXCEPTION_PARSER,
        GET_EXCEPTION_PARSER,
        CONSTRUCT_TRANSACTION,
        CONSTRUCT_EXCEPTION,
        CONSTRUCT_RAW_EXCEPTION,
        CONSTRUCT_TIMING,
        CONSTRUCT_SOCIAL,
        BLANK_37,
        BLANK_38,
        GET_TRACKER,
        GET_DEFAULT_TRACKER,
        SET_DEFAULT_TRACKER,
        SET_APP_OPT_OUT,
        GET_APP_OPT_OUT,
        DISPATCH,
        SET_DISPATCH_PERIOD,
        BLANK_46,
        REPORT_UNCAUGHT_EXCEPTIONS,
        SET_AUTO_ACTIVITY_TRACKING,
        SET_SESSION_TIMEOUT,
        CONSTRUCT_EVENT,
        CONSTRUCT_ITEM,
        BLANK_52,
        BLANK_53,
        SET_DRY_RUN,
        GET_DRY_RUN,
        SET_LOGGER,
        SET_FORCE_LOCAL_DISPATCH,
        GET_TRACKER_NAME,
        CLOSE_TRACKER,
        EASY_TRACKER_ACTIVITY_START,
        EASY_TRACKER_ACTIVITY_STOP,
        CONSTRUCT_APP_VIEW;
        public static final com.google.android.gms.analytics.y.a AA;
        public static final com.google.android.gms.analytics.y.a AB;
        public static final com.google.android.gms.analytics.y.a AC;
        public static final com.google.android.gms.analytics.y.a AD;
        public static final com.google.android.gms.analytics.y.a AE;
        public static final com.google.android.gms.analytics.y.a AF;
        public static final com.google.android.gms.analytics.y.a AG;
        public static final com.google.android.gms.analytics.y.a AH;
        public static final com.google.android.gms.analytics.y.a AI;
        public static final com.google.android.gms.analytics.y.a AJ;
        public static final com.google.android.gms.analytics.y.a AK;
        public static final com.google.android.gms.analytics.y.a AL;
        public static final com.google.android.gms.analytics.y.a AM;
        public static final com.google.android.gms.analytics.y.a AN;
        public static final com.google.android.gms.analytics.y.a AO;
        public static final com.google.android.gms.analytics.y.a AP;
        public static final com.google.android.gms.analytics.y.a AQ;
        public static final com.google.android.gms.analytics.y.a AR;
        public static final com.google.android.gms.analytics.y.a AS;
        public static final com.google.android.gms.analytics.y.a AT;
        public static final com.google.android.gms.analytics.y.a AU;
        public static final com.google.android.gms.analytics.y.a AV;
        public static final com.google.android.gms.analytics.y.a AW;
        public static final com.google.android.gms.analytics.y.a AX;
        public static final com.google.android.gms.analytics.y.a AY;
        public static final com.google.android.gms.analytics.y.a AZ;
        public static final com.google.android.gms.analytics.y.a Aa;
        public static final com.google.android.gms.analytics.y.a Ab;
        public static final com.google.android.gms.analytics.y.a Ac;
        public static final com.google.android.gms.analytics.y.a Ad;
        public static final com.google.android.gms.analytics.y.a Ae;
        public static final com.google.android.gms.analytics.y.a Af;
        public static final com.google.android.gms.analytics.y.a Ag;
        public static final com.google.android.gms.analytics.y.a Ah;
        public static final com.google.android.gms.analytics.y.a Ai;
        public static final com.google.android.gms.analytics.y.a Aj;
        public static final com.google.android.gms.analytics.y.a Ak;
        public static final com.google.android.gms.analytics.y.a Al;
        public static final com.google.android.gms.analytics.y.a Am;
        public static final com.google.android.gms.analytics.y.a An;
        public static final com.google.android.gms.analytics.y.a Ao;
        public static final com.google.android.gms.analytics.y.a Ap;
        public static final com.google.android.gms.analytics.y.a Aq;
        public static final com.google.android.gms.analytics.y.a Ar;
        public static final com.google.android.gms.analytics.y.a As;
        public static final com.google.android.gms.analytics.y.a At;
        public static final com.google.android.gms.analytics.y.a Au;
        public static final com.google.android.gms.analytics.y.a Av;
        public static final com.google.android.gms.analytics.y.a Aw;
        public static final com.google.android.gms.analytics.y.a Ax;
        public static final com.google.android.gms.analytics.y.a Ay;
        public static final com.google.android.gms.analytics.y.a Az;
        public static final com.google.android.gms.analytics.y.a Ba;
        public static final com.google.android.gms.analytics.y.a Bb;
        public static final com.google.android.gms.analytics.y.a Bc;
        public static final com.google.android.gms.analytics.y.a Bd;
        public static final com.google.android.gms.analytics.y.a Be;
        public static final com.google.android.gms.analytics.y.a Bf;
        public static final com.google.android.gms.analytics.y.a Bg;
        private static final com.google.android.gms.analytics.y.a[] Bh;
        public static boolean a;
        public static final com.google.android.gms.analytics.y.a zW;
        public static final com.google.android.gms.analytics.y.a zX;
        public static final com.google.android.gms.analytics.y.a zY;
        public static final com.google.android.gms.analytics.y.a zZ;

        static {
            zW = new com.google.android.gms.analytics.y.a("MAP_BUILDER_SET", 0);
            zX = new com.google.android.gms.analytics.y.a("MAP_BUILDER_SET_ALL", 1);
            zY = new com.google.android.gms.analytics.y.a("MAP_BUILDER_GET", 2);
            zZ = new com.google.android.gms.analytics.y.a("MAP_BUILDER_SET_CAMPAIGN_PARAMS", 3);
            Aa = new com.google.android.gms.analytics.y.a("BLANK_04", 4);
            Ab = new com.google.android.gms.analytics.y.a("BLANK_05", 5);
            Ac = new com.google.android.gms.analytics.y.a("BLANK_06", 6);
            Ad = new com.google.android.gms.analytics.y.a("BLANK_07", 7);
            Ae = new com.google.android.gms.analytics.y.a("BLANK_08", 8);
            Af = new com.google.android.gms.analytics.y.a("GET", 9);
            Ag = new com.google.android.gms.analytics.y.a("SET", 10);
            Ah = new com.google.android.gms.analytics.y.a("SEND", 11);
            Ai = new com.google.android.gms.analytics.y.a("BLANK_12", 12);
            Aj = new com.google.android.gms.analytics.y.a("BLANK_13", 13);
            Ak = new com.google.android.gms.analytics.y.a("BLANK_14", 14);
            Al = new com.google.android.gms.analytics.y.a("BLANK_15", 15);
            Am = new com.google.android.gms.analytics.y.a("BLANK_16", 16);
            An = new com.google.android.gms.analytics.y.a("BLANK_17", 17);
            Ao = new com.google.android.gms.analytics.y.a("BLANK_18", 18);
            Ap = new com.google.android.gms.analytics.y.a("BLANK_19", 19);
            Aq = new com.google.android.gms.analytics.y.a("BLANK_20", 20);
            Ar = new com.google.android.gms.analytics.y.a("BLANK_21", 21);
            As = new com.google.android.gms.analytics.y.a("BLANK_22", 22);
            At = new com.google.android.gms.analytics.y.a("BLANK_23", 23);
            Au = new com.google.android.gms.analytics.y.a("BLANK_24", 24);
            Av = new com.google.android.gms.analytics.y.a("BLANK_25", 25);
            Aw = new com.google.android.gms.analytics.y.a("BLANK_26", 26);
            Ax = new com.google.android.gms.analytics.y.a("BLANK_27", 27);
            Ay = new com.google.android.gms.analytics.y.a("BLANK_28", 28);
            Az = new com.google.android.gms.analytics.y.a("BLANK_29", 29);
            AA = new com.google.android.gms.analytics.y.a("SET_EXCEPTION_PARSER", 30);
            AB = new com.google.android.gms.analytics.y.a("GET_EXCEPTION_PARSER", 31);
            AC = new com.google.android.gms.analytics.y.a("CONSTRUCT_TRANSACTION", 32);
            AD = new com.google.android.gms.analytics.y.a("CONSTRUCT_EXCEPTION", 33);
            AE = new com.google.android.gms.analytics.y.a("CONSTRUCT_RAW_EXCEPTION", 34);
            AF = new com.google.android.gms.analytics.y.a("CONSTRUCT_TIMING", 35);
            AG = new com.google.android.gms.analytics.y.a("CONSTRUCT_SOCIAL", 36);
            AH = new com.google.android.gms.analytics.y.a("BLANK_37", 37);
            AI = new com.google.android.gms.analytics.y.a("BLANK_38", 38);
            AJ = new com.google.android.gms.analytics.y.a("GET_TRACKER", 39);
            AK = new com.google.android.gms.analytics.y.a("GET_DEFAULT_TRACKER", 40);
            AL = new com.google.android.gms.analytics.y.a("SET_DEFAULT_TRACKER", 41);
            AM = new com.google.android.gms.analytics.y.a("SET_APP_OPT_OUT", 42);
            AN = new com.google.android.gms.analytics.y.a("GET_APP_OPT_OUT", 43);
            AO = new com.google.android.gms.analytics.y.a("DISPATCH", 44);
            AP = new com.google.android.gms.analytics.y.a("SET_DISPATCH_PERIOD", 45);
            AQ = new com.google.android.gms.analytics.y.a("BLANK_46", 46);
            AR = new com.google.android.gms.analytics.y.a("REPORT_UNCAUGHT_EXCEPTIONS", 47);
            AS = new com.google.android.gms.analytics.y.a("SET_AUTO_ACTIVITY_TRACKING", 48);
            AT = new com.google.android.gms.analytics.y.a("SET_SESSION_TIMEOUT", 49);
            AU = new com.google.android.gms.analytics.y.a("CONSTRUCT_EVENT", 50);
            AV = new com.google.android.gms.analytics.y.a("CONSTRUCT_ITEM", 51);
            AW = new com.google.android.gms.analytics.y.a("BLANK_52", 52);
            AX = new com.google.android.gms.analytics.y.a("BLANK_53", 53);
            AY = new com.google.android.gms.analytics.y.a("SET_DRY_RUN", 54);
            AZ = new com.google.android.gms.analytics.y.a("GET_DRY_RUN", 55);
            Ba = new com.google.android.gms.analytics.y.a("SET_LOGGER", 56);
            Bb = new com.google.android.gms.analytics.y.a("SET_FORCE_LOCAL_DISPATCH", 57);
            Bc = new com.google.android.gms.analytics.y.a("GET_TRACKER_NAME", 58);
            Bd = new com.google.android.gms.analytics.y.a("CLOSE_TRACKER", 59);
            Be = new com.google.android.gms.analytics.y.a("EASY_TRACKER_ACTIVITY_START", 60);
            Bf = new com.google.android.gms.analytics.y.a("EASY_TRACKER_ACTIVITY_STOP", 61);
            Bg = new com.google.android.gms.analytics.y.a("CONSTRUCT_APP_VIEW", 62);
            Bh = new com.google.android.gms.analytics.y.a[]{zW, zX, zY, zZ, Aa, Ab, Ac, Ad, Ae, Af, Ag, Ah, Ai, Aj, Ak, Al, Am, An, Ao, Ap, Aq, Ar, As, At, Au, Av, Aw, Ax, Ay, Az, AA, AB, AC, AD, AE, AF, AG, AH, AI, AJ, AK, AL, AM, AN, AO, AP, AQ, AR, AS, AT, AU, AV, AW, AX, AY, AZ, Ba, Bb, Bc, Bd, Be, Bf, Bg};
        }
    }

    static {
        zV = new y();
    }

    private y() {
        this.zS = new TreeSet();
        this.zT = new StringBuilder();
        this.zU = false;
    }
}
