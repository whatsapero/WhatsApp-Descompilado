package com.whatsapp.util;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v4.app.NotificationManagerCompat;
import android.text.format.Formatter;
import com.actionbarsherlock.R;
import com.whatsapp.App;
import com.whatsapp.Main;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class aq {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "!K\u0014\u001b\u001d6\\\u0016\u001b\u001d0\\\u0014[\u000b-J\r\u001d\u0000k]\u000f\u0007\u00047I\u0007\u0017\nd";
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
                        i3 = 68;
                        break;
                    case ay.f /*1*/:
                        i3 = 57;
                        break;
                    case ay.n /*2*/:
                        i3 = 102;
                        break;
                    case ay.p /*3*/:
                        i3 = 116;
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
                    i = 2;
                    strArr2 = strArr3;
                    str = "!K\u0014\u001b\u001d6\\\u0016\u001b\u001d0\\\u0014[\u001d!I\t\u0006\u001b!K\u0014\u001b\u001d";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "!K\u0014";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void a(Context context, String str) {
        Log.i(z[2]);
        Builder builder = new Builder(context);
        builder.setCategory(z[1]);
        builder.setPriority(1);
        CharSequence string = context.getString(R.string.error_notification_headline);
        CharSequence string2 = context.getString(R.string.error_notification_title);
        builder.setSmallIcon(R.drawable.notifybar_error);
        builder.setTicker(string);
        builder.setContentTitle(string2);
        builder.setContentText(str);
        builder.setContentIntent(PendingIntent.getActivity(context, 0, new Intent(context, Main.class), 268435456));
        NotificationManagerCompat.from(context).notify(2, builder.getNotification());
    }

    public static void a(Context context) {
        a(context, context.getString(R.string.error_report_db_or_disk_is_full, new Object[]{Formatter.formatFileSize(context, App.B())}));
    }

    public static void a(Context context, int i) {
        long B = App.B();
        String str = null;
        if (B < 10485760) {
            str = Formatter.formatFileSize(context, B);
            Log.i(z[0] + str);
        }
        if (str != null) {
            a(context, context.getString(i) + " " + context.getString(R.string.error_possible_cause_is_low_disk_space, new Object[]{str}));
            if (Log.e == 0) {
                return;
            }
        }
        a(context, context.getString(i));
    }
}
