package com.whatsapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class AvailabilityTimeoutAlarmBroadcastReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[7];
        String str = "$&\u0004\u0019\u001a";
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
                        i3 = 69;
                        break;
                    case ay.f /*1*/:
                        i3 = 74;
                        break;
                    case ay.n /*2*/:
                        i3 = 101;
                        break;
                    case ay.p /*3*/:
                        i3 = 107;
                        break;
                    default:
                        i3 = 119;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "&%\bE\u0000-+\u0011\u0018\u00165:K\u001b\u00127'\f\u0018\u0004,%\u000bE5\u0017\u0005$/4\u0004\u00191";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "&%\bE\u0000-+\u0011\u0018\u00165:K\n\u001b$8\bE6\u0013\u000b,'6\u0007\u0006 4#\f\u0007 $\"\u0011";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "$:\u0015D\u00077/\u0016\u000e\u0019&/\u0004\u001d\u0016,&\u0004\t\u001b e\u0011\u0002\u001a %\u0010\u001f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "&%\bE\u0000-+\u0011\u0018\u00165:";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "&%\bE\u0000-+\u0011\u0018\u00165:K\n\u001b$8\bE6\u0013\u000b,'6\u0007\u0006 4#\f\u0007 $\"\u0011";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "$&\u0004\u0019\u001a";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        Log.i(z[4]);
        if (App.aE != 1) {
            App.aE = 3;
            App.ak();
        }
    }

    private Intent a() {
        return new Intent(z[6]).setPackage(z[5]);
    }

    void c(Context context) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, a(), 536870912);
        if (broadcast != null) {
            ((AlarmManager) context.getSystemService(z[0])).cancel(broadcast);
        }
    }

    void b(Context context) {
        long currentTimeMillis = 15000 + System.currentTimeMillis();
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, a(), 0);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(z[1]);
        if (VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
            if (App.az == 0) {
                return;
            }
        }
        alarmManager.set(0, currentTimeMillis, broadcast);
    }

    AvailabilityTimeoutAlarmBroadcastReceiver() {
    }

    public void a(Context context) {
        context.registerReceiver(this, new IntentFilter(z[3]), z[2], null);
    }
}
