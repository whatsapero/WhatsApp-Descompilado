package com.google.android.gms.tagmanager;

interface bg {

    public enum a {
        NOT_AVAILABLE,
        IO_ERROR,
        SERVER_ERROR;
        public static final com.google.android.gms.tagmanager.bg.a arV;
        public static final com.google.android.gms.tagmanager.bg.a arW;
        public static final com.google.android.gms.tagmanager.bg.a arX;
        private static final com.google.android.gms.tagmanager.bg.a[] arY;

        static {
            arV = new com.google.android.gms.tagmanager.bg.a("NOT_AVAILABLE", 0);
            arW = new com.google.android.gms.tagmanager.bg.a("IO_ERROR", 1);
            arX = new com.google.android.gms.tagmanager.bg.a("SERVER_ERROR", 2);
            arY = new com.google.android.gms.tagmanager.bg.a[]{arV, arW, arX};
        }
    }
}
