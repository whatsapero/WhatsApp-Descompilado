package com.whatsapp.notification;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class b implements Runnable {
    private static final String[] z;
    private final int a;
    private final Context b;

    static {
        String[] strArr = new String[4];
        String str = "B3\u0018o\u0019H3\u0005s\fF0\u0002\u007f\u0019[?\u0004rW_9\u001bi\bA9\u001fu\u001eF5\nh\u0011@8D~\u0019L=\fn\u0017Z8\u000f";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 47;
                        break;
                    case ay.f /*1*/:
                        i3 = 86;
                        break;
                    case ay.n /*2*/:
                        i3 = 107;
                        break;
                    case ay.p /*3*/:
                        i3 = 28;
                        break;
                    default:
                        i3 = 120;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "D3\u0012{\rN$\u000f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "_9\u001cy\n";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "B3\u0018o\u0019H3\u0005s\fF0\u0002\u007f\u0019[?\u0004rW_9\u001bi\bA9\u001fu\u001eF5\nh\u0011@8Dz\u0017]3\fn\u0017Z8\u000f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        KeyguardManager keyguardManager = (KeyguardManager) this.b.getSystemService(z[2]);
        PowerManager powerManager = (PowerManager) this.b.getSystemService(z[3]);
        if (!(App.at() && !keyguardManager.inKeyguardRestrictedInputMode() && powerManager.isScreenOn())) {
            Intent intent;
            Log.i(z[0]);
            if ((keyguardManager.inKeyguardRestrictedInputMode() || !powerManager.isScreenOn()) && (this.a == 2 || this.a == 3)) {
                if (!(PopupNotification.u == null || (PopupNotification.u instanceof PopupNotificationLocked))) {
                    PopupNotification.u.finish();
                    PopupNotification.u = null;
                }
                intent = new Intent(this.b, PopupNotificationLocked.class);
            } else if (App.at() || this.a == 3) {
                intent = null;
            } else {
                if (PopupNotification.u != null && (PopupNotification.u instanceof PopupNotificationLocked)) {
                    PopupNotification.u.finish();
                    PopupNotification.u = null;
                }
                intent = new Intent(this.b, PopupNotification.class);
            }
            if (intent != null) {
                intent.setFlags(268697600);
                this.b.startActivity(intent);
            }
            if (PopupNotification.u != null) {
                PopupNotification.u.e();
            }
            if (!PopupNotification.H) {
                return;
            }
        }
        if (PopupNotification.u != null && PopupNotification.u.c()) {
            Log.i(z[1]);
            PopupNotification.u.e();
        }
    }

    b(Context context, int i) {
        this.b = context;
        this.a = i;
    }
}
