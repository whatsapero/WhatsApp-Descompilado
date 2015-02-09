package com.google.android.gms.internal;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;

public class jh implements OnClickListener {
    private final Fragment Mx;
    private final int My;
    private final Intent mIntent;
    private final Activity nB;

    public jh(Activity activity, Intent intent, int i) {
        this.nB = activity;
        this.Mx = null;
        this.mIntent = intent;
        this.My = i;
    }

    public jh(Fragment fragment, Intent intent, int i) {
        this.nB = null;
        this.Mx = fragment;
        this.mIntent = intent;
        this.My = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.content.DialogInterface r4, int r5) {
        /*
        r3_this = this;
        r0 = r3.mIntent;	 Catch:{ ActivityNotFoundException -> 0x0026 }
        if (r0 == 0) goto L_0x0015;
    L_0x0004:
        r0 = r3.Mx;	 Catch:{ ActivityNotFoundException -> 0x0026 }
        if (r0 == 0) goto L_0x0015;
    L_0x0008:
        r0 = r3.Mx;	 Catch:{ ActivityNotFoundException -> 0x0028 }
        r1 = r3.mIntent;	 Catch:{ ActivityNotFoundException -> 0x0028 }
        r2 = r3.My;	 Catch:{ ActivityNotFoundException -> 0x0028 }
        r0.startActivityForResult(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x0028 }
        r0 = com.google.android.gms.internal.qw.a;	 Catch:{ ActivityNotFoundException -> 0x0028 }
        if (r0 == 0) goto L_0x0022;
    L_0x0015:
        r0 = r3.mIntent;	 Catch:{ ActivityNotFoundException -> 0x002a }
        if (r0 == 0) goto L_0x0022;
    L_0x0019:
        r0 = r3.nB;	 Catch:{ ActivityNotFoundException -> 0x002c }
        r1 = r3.mIntent;	 Catch:{ ActivityNotFoundException -> 0x002c }
        r2 = r3.My;	 Catch:{ ActivityNotFoundException -> 0x002c }
        r0.startActivityForResult(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x002c }
    L_0x0022:
        r4.dismiss();	 Catch:{ ActivityNotFoundException -> 0x002e }
    L_0x0025:
        return;
    L_0x0026:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0028 }
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        r0 = "SettingsRedirect";
        r1 = "Can't redirect to app settings for Google Play services";
        android.util.Log.e(r0, r1);
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jh.onClick(android.content.DialogInterface, int):void");
    }
}
