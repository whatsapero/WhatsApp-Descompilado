package com.whatsapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import com.whatsapp.util.Log;
import java.util.Calendar;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class DelayedRegistrationBroadcastReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[26];
        String str = "`J\u0019.|f]\u001f3f}A!4{s]\n\u0018{{B\u001b";
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
                        i3 = 18;
                        break;
                    case ay.f /*1*/:
                        i3 = 47;
                        break;
                    case ay.n /*2*/:
                        i3 = 126;
                        break;
                    case ay.p /*3*/:
                        i3 = 71;
                        break;
                    default:
                        i3 = 15;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "q@\u0013ixzN\n4nb_!7}wI\u001b5j|L\u001b4";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "sC\u001f5b";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "q@\u0013ixzN\n4nb_P&cs]\u0013i]Wh7\u0014[@n*\u000e@\\p*\u0006D[a9\u0018[]`!\u000b@\\h!\u0013F_j1\u0012[";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "q@\u0013ixzN\n4nb_";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "s_\u000ehn~N\f* `J\u00193`}C\u0011)h=\\\u001b3 sC\f\"nvVS\"w{\\\n4 aD\u00177";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "q@\u0013ixzN\n4nb_!7}wI\u001b5j|L\u001b4";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "`J\u0019.|f]\u001f3f}A!4{s]\n\u0018{{B\u001b";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "q@\u0013ixzN\n4nb_P&cs]\u0013i]Wh7\u0014[@n*\u000e@\\p*\u0006D[a9\u0018[]`!\u000b@\\h!\u0013F_j1\u0012[";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "q@\u0013ixzN\n4nb_";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "qL";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "`J\u0019.|f]\u001f3f}A^y22\u001eLgg`\\";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "s_\u000eh}wH\u00174{`N\n.`|[\u001f,f|H\n(`~@\u0010  fF\u0013\"`g[";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "q@\u0013ixzN\n4nb_!7}wI\u001b5j|L\u001b4";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    str = "bG";
                    obj = 14;
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    strArr2 = strArr3;
                    str = "s_\u000eh}wH\u00174{`N\n.`|[\u001f,f|H\n(`~@\u0010  qL^";
                    obj = 15;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "`J\u0019.|f]\u001f3f}A!4{s]\n\u0018{{B\u001b";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    str = "2A\u000b*2";
                    obj = 17;
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    strArr2 = strArr3;
                    str = "2\\\u0017*2";
                    obj = 18;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "q@\u0013ixzN\n4nb_!7}wI\u001b5j|L\u001b4";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "s_\u000ehn~N\f* `J\u00193`}C\u0011)h=L\u001f)lwCQ5j\u007f@\b\"\"fF\u0013\" w]\f(}";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "sC\u001f5b";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "`J\u0019.|f]\u001f3f}A!4{s]\n\u0018{{B\u001b";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "q@\u0013ixzN\n4nb_P&cs]\u0013i]Wh7\u0014[@n*\u000e@\\p*\u0006D[a9\u0018[]`!\u000b@\\h!\u0013F_j1\u0012[";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "q@\u0013ixzN\n4nb_";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "s_\u000eh|w[\f\"h{\\\n5nfF\u0011)|fN\f3{{B\u001bhj`]\u00115";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void b(Context context, long j) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(z[4]).setPackage(z[5]), 134217728);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(z[3]);
        if (VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, j, broadcast);
            if (App.az == 0) {
                return;
            }
        }
        alarmManager.set(0, j, broadcast);
    }

    DelayedRegistrationBroadcastReceiver() {
    }

    public void b(Context context) {
        int i = App.az;
        long j = context.getSharedPreferences(z[7], 0).getLong(z[8], -1);
        if (j != -2) {
            long currentTimeMillis = System.currentTimeMillis();
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(currentTimeMillis);
            instance.add(12, 720);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(z[9]).setPackage(z[10]), 536870912);
            if (broadcast != null && j == -1) {
                a(context, currentTimeMillis);
                b(context, instance.getTimeInMillis());
                if (i == 0) {
                    return;
                }
            }
            if (broadcast != null) {
                Log.i(z[6]);
                if (i == 0) {
                    return;
                }
            }
            a(context, currentTimeMillis);
            b(context, instance.getTimeInMillis());
        }
    }

    private void a(Context context, long j) {
        Editor edit = context.getSharedPreferences(z[2], 0).edit();
        edit.putLong(z[0], j);
        if (!edit.commit()) {
            Log.w(z[1]);
        }
    }

    public void a(Context context) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(z[24]).setPackage(z[25]), 536870912);
        if (broadcast != null) {
            ((AlarmManager) context.getSystemService(z[22])).cancel(broadcast);
            Editor edit = context.getSharedPreferences(z[20], 0).edit();
            edit.remove(z[23]);
            if (!edit.commit()) {
                Log.w(z[21]);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        Log.i(z[13]);
        SharedPreferences sharedPreferences = context.getSharedPreferences(z[14], 0);
        long j = sharedPreferences.getLong(z[17], -1);
        if (j > 0 && System.currentTimeMillis() - j > 43200000) {
            a(context);
            if (App.G == 1 && App.e(App.p) != 3) {
                String string = sharedPreferences.getString(z[11], "");
                Log.i(z[16] + string + z[18] + sharedPreferences.getString(z[15], "") + z[19] + App.a3.getSimState() + " " + App.a3.getLine1Number());
                App.o(z[12]);
            }
            a(context, -2);
            if (App.az == 0) {
                return;
            }
        }
        b(context, j + 43200000);
    }
}
