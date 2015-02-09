package com.google.android.gms.auth;

import android.content.Intent;
import com.google.android.gms.internal.jx;

public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {
    private final int Eo;

    GooglePlayServicesAvailabilityException(int i, String str, Intent intent) {
        int i2 = GoogleAuthException.a;
        super(str, intent);
        this.Eo = i;
        if (i2 != 0) {
            jx.a++;
        }
    }

    public int getConnectionStatusCode() {
        return this.Eo;
    }
}
