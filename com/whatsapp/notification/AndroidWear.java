package com.whatsapp.notification;

import android.app.IntentService;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat.Action;
import android.support.v4.app.NotificationCompat.BigTextStyle;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v4.app.NotificationCompat.WearableExtender;
import android.support.v4.app.RemoteInput;
import android.text.TextUtils;
import com.actionbarsherlock.R;
import com.whatsapp.App;
import com.whatsapp.fieldstats.al;
import com.whatsapp.fieldstats.b;
import com.whatsapp.m8;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class AndroidWear extends IntentService {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "[\u007f";
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
                        i3 = 81;
                        break;
                    case ay.f /*1*/:
                        i3 = 117;
                        break;
                    case ay.n /*2*/:
                        i3 = 113;
                        break;
                    case ay.p /*3*/:
                        i3 = 5;
                        break;
                    default:
                        i3 = 81;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "0\u001b\u0015w>8\u0011.r40\u0007.s>8\u0016\u0014Z8?\u0005\u0004q";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "0\u001b\u0015w>8\u0011.r40\u0007.s>8\u0016\u0014Z8?\u0005\u0004q";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0010\u001b\u0015w>8\u0011&`0#";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
            if (resultsFromIntent != null) {
                m8 a = App.P.a(intent.getData());
                String toString = resultsFromIntent.getCharSequence(z[3]).toString();
                App.p.U().post(new k(this, a, toString));
                a(toString);
            }
        }
    }

    private static void a(String str) {
        boolean z = PopupNotification.H;
        String[] stringArray = App.p.getResources().getStringArray(R.array.android_wear_voice_input_choices);
        if (str.equals(stringArray[0])) {
            al.a(App.p, b.ANDROID_WEAR_RESPONSE_SMILEEMOJI, Integer.valueOf(1));
            if (!z) {
                return;
            }
        }
        if (str.equals(stringArray[1])) {
            al.a(App.p, b.ANDROID_WEAR_RESPONSE_YES, Integer.valueOf(1));
            if (!z) {
                return;
            }
        }
        if (str.equals(stringArray[2])) {
            al.a(App.p, b.ANDROID_WEAR_RESPONSE_NO, Integer.valueOf(1));
            if (!z) {
                return;
            }
        }
        if (str.equals(stringArray[3])) {
            al.a(App.p, b.ANDROID_WEAR_RESPONSE_ONMYWAY, Integer.valueOf(1));
            if (!z) {
                return;
            }
        }
        if (str.equals(stringArray[4])) {
            al.a(App.p, b.ANDROID_WEAR_RESPONSE_OK, Integer.valueOf(1));
            if (!z) {
                return;
            }
        }
        if (str.equals(stringArray[5])) {
            al.a(App.p, b.ANDROID_WEAR_RESPONSE_SEEYOUSOON, Integer.valueOf(1));
            if (!z) {
                return;
            }
        }
        if (str.equals(stringArray[6])) {
            al.a(App.p, b.ANDROID_WEAR_RESPONSE_HAHA, Integer.valueOf(1));
            if (!z) {
                return;
            }
        }
        if (str.equals(stringArray[7])) {
            al.a(App.p, b.ANDROID_WEAR_RESPONSE_LOL, Integer.valueOf(1));
            if (!z) {
                return;
            }
        }
        if (str.equals(stringArray[8])) {
            al.a(App.p, b.ANDROID_WEAR_RESPONSE_NICE, Integer.valueOf(1));
            if (!z) {
                return;
            }
        }
        if (str.equals(stringArray[9])) {
            al.a(App.p, b.ANDROID_WEAR_RESPONSE_SORRYCANTTALK, Integer.valueOf(1));
            if (!z) {
                return;
            }
        }
        if (str.equals(stringArray[10])) {
            al.a(App.p, b.ANDROID_WEAR_RESPONSE_SADEMOJI, Integer.valueOf(1));
            if (!z) {
                return;
            }
        }
        if (str.equals(stringArray[11])) {
            al.a(App.p, b.ANDROID_WEAR_RESPONSE_THANKS, Integer.valueOf(1));
            if (!z) {
                return;
            }
        }
        al.a(App.p, b.ANDROID_WEAR_RESPONSE_VOICE, Integer.valueOf(1));
    }

    public static WearableExtender a(Context context, m8 m8Var, boolean z, com.whatsapp.protocol.b bVar, boolean z2, Bitmap bitmap) {
        WearableExtender wearableExtender = new WearableExtender();
        if (z && bVar != null && bVar.j == 1 && bVar.A != null) {
            wearableExtender.addPage(a());
        }
        if (!App.ag()) {
            wearableExtender.addPage(b(context, m8Var));
        }
        wearableExtender.addAction(a(context, m8Var));
        if (z2) {
            wearableExtender.setBackground(bitmap);
        }
        return wearableExtender;
    }

    public static boolean b() {
        return VERSION.SDK_INT >= 18;
    }

    public AndroidWear() {
        super(z[1]);
    }

    private static Notification a() {
        return new WearableExtender().setHintShowBackgroundOnly(true).extend(new Builder(App.p)).build();
    }

    private static Action a(Context context, m8 m8Var) {
        CharSequence string = context.getString(R.string.reply_to_label, new Object[]{m8Var.a(context)});
        return new Action.Builder(R.drawable.ic_full_reply, string, PendingIntent.getService(context, 0, new Intent(null, m8Var.n(), context, AndroidWear.class), 134217728)).addRemoteInput(new RemoteInput.Builder(z[2]).setLabel(string).setChoices(context.getResources().getStringArray(R.array.android_wear_voice_input_choices)).build()).build();
    }

    private static Notification b(Context context, m8 m8Var) {
        CharSequence charSequence = "";
        Cursor a = App.aJ.a(m8Var.e, 20, null);
        if (a != null) {
            try {
                if (a.moveToLast()) {
                    if (App.aJ.h(m8Var.e)) {
                        charSequence = TextUtils.concat(new CharSequence[]{charSequence, "\u2026"});
                    }
                    do {
                        if (t.a(context, App.aJ.a(a, m8Var.e), m8Var, false, true) != "") {
                            if (charSequence != "") {
                                charSequence = TextUtils.concat(new CharSequence[]{charSequence, z[0]});
                            }
                            charSequence = TextUtils.concat(new CharSequence[]{charSequence, r2});
                        }
                    } while (a.moveToPrevious());
                } else {
                    a.close();
                }
                a.close();
            } catch (Throwable th) {
                a.close();
            }
        }
        return new Builder(App.p).setStyle(new BigTextStyle().bigText(charSequence)).extend(new WearableExtender().setStartScrollBottom(true)).build();
    }
}
