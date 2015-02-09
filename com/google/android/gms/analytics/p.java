package com.google.android.gms.analytics;

import android.util.Log;

class p implements Logger {
    private int yM;

    p() {
        this.yM = 2;
    }

    private String af(String str) {
        return Thread.currentThread().toString() + ": " + str;
    }

    public void error(String str) {
        if (this.yM <= 3) {
            Log.e("GAV4", af(str));
        }
    }

    public void verbose(String str) {
        if (this.yM <= 0) {
            Log.v("GAV4", af(str));
        }
    }
}
