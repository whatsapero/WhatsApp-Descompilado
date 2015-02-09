package com.whatsapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.whatsapp.util.Log;
import com.whatsapp.util.br;
import java.util.Calendar;
import java.util.Date;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class LogRotationBroadcastReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[6];
        String str = "(FuY\u0002";
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
                        i3 = 73;
                        break;
                    case ay.f /*1*/:
                        i3 = 42;
                        break;
                    case ay.n /*2*/:
                        i3 = 20;
                        break;
                    case ay.p /*3*/:
                        i3 = 43;
                        break;
                    default:
                        i3 = 111;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "(Zd\u0004\u000e%KfF@;E`J\u001b,\u0007xD\b:\u0005g_\u000e;^4";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "*Ey\u0005\u0018!K`X\u000e9Z";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "*Ey\u0005\u0018!K`X\u000e9Z:J\u0003(Xy\u0005=\u0006~U\u007f*\u0016f[l<";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "*Ey\u0005\u0018!K`X\u000e9Z:[\n;G}X\u001c Ez\u0005-\u001beUo,\by@";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "*Ey\u0005\u0018!K`X\u000e9Z:J\u0003(Xy\u0005=\u0006~U\u007f*\u0016f[l<";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        br.a(new mv(this));
        br.a(new _x(this));
        b(context);
    }

    public void b(Context context) {
        Calendar instance = Calendar.getInstance();
        instance.add(5, 1);
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 0);
        long timeInMillis = instance.getTimeInMillis();
        Log.i(z[2] + new Date(timeInMillis).toString());
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(z[1]).setPackage(z[3]), 0);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(z[0]);
        alarmManager.cancel(broadcast);
        if (VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, timeInMillis, broadcast);
            if (App.az == 0) {
                return;
            }
        }
        alarmManager.set(0, timeInMillis, broadcast);
    }

    LogRotationBroadcastReceiver() {
    }

    public void a(Context context) {
        context.registerReceiver(this, new IntentFilter(z[4]), z[5], null);
    }
}
