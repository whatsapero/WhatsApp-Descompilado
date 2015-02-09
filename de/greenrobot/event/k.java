package de.greenrobot.event;

/* synthetic */ class k {
    static final int[] a;

    static {
        a = new int[p.values().length];
        try {
            a[p.PostThread.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[p.MainThread.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[p.BackgroundThread.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[p.Async.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
