package com.google.android.gms.tagmanager;

import android.util.Log;

class x implements bi {
    private int yM;

    x() {
        this.yM = 5;
    }

    public void T(String str) {
        if (this.yM <= 6) {
            Log.e("GoogleTagManager", str);
        }
    }

    public void U(String str) {
        if (this.yM <= 4) {
            Log.i("GoogleTagManager", str);
        }
    }

    public void V(String str) {
        if (this.yM <= 2) {
            Log.v("GoogleTagManager", str);
        }
    }

    public void W(String str) {
        if (this.yM <= 5) {
            Log.w("GoogleTagManager", str);
        }
    }

    public void b(String str, Throwable th) {
        if (this.yM <= 6) {
            Log.e("GoogleTagManager", str, th);
        }
    }
}
