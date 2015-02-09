package com.google.android.gms.analytics;

public class GoogleAnalytics extends TrackerHandler {
    private static GoogleAnalytics Bs;
    private Logger Bp;

    static GoogleAnalytics eY() {
        GoogleAnalytics googleAnalytics;
        synchronized (GoogleAnalytics.class) {
            googleAnalytics = Bs;
        }
        return googleAnalytics;
    }

    public Logger getLogger() {
        return this.Bp;
    }
}
