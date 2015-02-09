package com.whatsapp.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.widget.RemoteViews;
import com.actionbarsherlock.R;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class WidgetProvider extends AppWidgetProvider {
    private static Handler a;
    public static boolean b;
    private static ArrayList c;
    private static Runnable e;
    private static final String[] z;
    private e d;

    static {
        String[] strArr = new String[12];
        String str = "U!\rN\fV8\u001bF\u001fK,\f[FM&\bY\u0019U!\rN\fV'\u0019]\u0000M&\u001aJ\u0001C&\u000eL\r\u0002";
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
                        i3 = 34;
                        break;
                    case ay.f /*1*/:
                        i3 = 72;
                        break;
                    case ay.n /*2*/:
                        i3 = 105;
                        break;
                    case ay.p /*3*/:
                        i3 = 41;
                        break;
                    default:
                        i3 = 105;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "C8\u0019~\u0000F/\f]$K&!L\u0000E \u001d";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "C8\u0019~\u0000F/\f] F";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "Q-\u001d}\fZ<:@\u0013G";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "C&\r[\u0006K,G@\u0007V-\u0007]GC+\u001d@\u0006Lf?`,u";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "U!\rN\fV8\u001bF\u001fK,\f[FW8\rH\u001dGh";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "W8\rH\u001dG\u0017\u001e@\rE-\u001d";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "C8\u0019~\u0000F/\f] F;";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "Q)\u0004Z\u001cL/";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "C&\r[\u0006K,GH\u0019R?\u0000M\u000eG<GH\nV!\u0006GGc\u00189~ f\u000f,}6w\u0018-h=g";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "U!\rN\fV8\u001bF\u001fK,\f[FE-\u001dh\u0019R\u001f\u0000M\u000eG< M\u001a\u0002.\b@\u0005G,";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "C8\u0019~\u0000F/\f]$K&>@\rV ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        int i2 = Integer.MAX_VALUE;
        if (VERSION.SDK_INT >= 16) {
            int i3;
            if (bundle != null) {
                int i4 = bundle.getInt(z[1]);
                i3 = bundle.getInt(z[2]);
                try {
                    Log.i(z[0] + i4 + "x" + i3);
                    if (i4 == 0 || i3 == 0) {
                        i3 = Integer.MAX_VALUE;
                    } else {
                        i2 = i4;
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            i3 = Integer.MAX_VALUE;
            appWidgetManager.updateAppWidget(i, a(context, i, i2, i3));
        }
    }

    public static ArrayList b() {
        return c;
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        boolean z = b;
        try {
            Log.i(z[6] + iArr.length);
            if (this.d != null) {
                this.d.c();
                a().removeCallbacks(this.d);
            }
            try {
                this.d = new e(context, appWidgetManager, iArr);
                a().post(this.d);
                super.onUpdate(context, appWidgetManager, iArr);
                if (z) {
                    if (DialogToastActivity.i) {
                        z = false;
                    } else {
                        z = true;
                    }
                    DialogToastActivity.i = z;
                }
            } catch (RuntimeException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    private static Handler a() {
        if (a == null) {
            HandlerThread handlerThread = new HandlerThread(z[7], 10);
            handlerThread.start();
            a = new Handler(handlerThread.getLooper());
        }
        return a;
    }

    static RemoteViews b(Context context, int i, int i2, int i3) {
        return a(context, i, i2, i3);
    }

    static boolean b(int i, int i2) {
        return a(i, i2);
    }

    public static void a(Context context) {
        if (context.getResources().getBoolean(R.bool.has_widget)) {
            int[] appWidgetIds;
            try {
                appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, WidgetProvider.class));
            } catch (RuntimeException e) {
                Log.e(z[11] + e.toString());
                appWidgetIds = null;
            }
            if (appWidgetIds != null) {
                try {
                    if (appWidgetIds.length > 0) {
                        Intent intent = new Intent(context, WidgetProvider.class);
                        intent.setAction(z[10]);
                        intent.putExtra(z[8], appWidgetIds);
                        context.sendBroadcast(intent);
                    }
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
        }
        try {
            if (z[9].equals(Build.MANUFACTURER)) {
                if (e == null) {
                    e = new c(context.getPackageName(), null);
                }
                a().removeCallbacks(e);
                a().post(e);
            }
        } catch (RuntimeException e22) {
            throw e22;
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    static ArrayList a(ArrayList arrayList) {
        c = arrayList;
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.widget.RemoteViews a(android.content.Context r10, int r11, int r12, int r13) {
        /*
        r9 = 1;
        r8 = 2131428074; // 0x7f0b02ea float:1.8477782E38 double:1.053065388E-314;
        r7 = 2131428073; // 0x7f0b02e9 float:1.847778E38 double:1.0530653875E-314;
        r6 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r5 = 0;
        r2 = b;
        r0 = a(r12, r13);
        if (r0 == 0) goto L_0x00af;
    L_0x0012:
        r1 = new android.widget.RemoteViews;
        r0 = r10.getPackageName();
        r3 = 2130903224; // 0x7f0300b8 float:1.741326E38 double:1.0528060776E-314;
        r1.<init>(r0, r3);
        r0 = "";
        r3 = c;	 Catch:{ RuntimeException -> 0x0103 }
        if (r3 == 0) goto L_0x005e;
    L_0x0024:
        r0 = c;	 Catch:{ RuntimeException -> 0x0103 }
        r0 = r0.size();	 Catch:{ RuntimeException -> 0x0103 }
        if (r0 <= 0) goto L_0x0052;
    L_0x002c:
        r0 = com.whatsapp.App.aX;
        r3 = 2131558444; // 0x7f0d002c float:1.8742204E38 double:1.0531297993E-314;
        r4 = c;
        r4 = r4.size();
        r0 = r0.a(r3, r4);
        r3 = new java.lang.Object[r9];
        r4 = c;
        r4 = r4.size();
        r4 = java.lang.Integer.valueOf(r4);
        r3[r5] = r4;
        r0 = java.lang.String.format(r0, r3);
        r1.setViewVisibility(r7, r5);
        if (r2 == 0) goto L_0x005e;
    L_0x0052:
        r0 = 2131624625; // 0x7f0e02b1 float:1.8876435E38 double:1.053162497E-314;
        r0 = r10.getString(r0);
        r3 = 8;
        r1.setViewVisibility(r7, r3);
    L_0x005e:
        r1.setTextViewText(r7, r0);
        r0 = new android.content.Intent;
        r3 = com.whatsapp.appwidget.WidgetService.class;
        r0.<init>(r10, r3);
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r0.putExtra(r3, r11);
        r3 = r0.toUri(r9);
        r3 = android.net.Uri.parse(r3);
        r0.setData(r3);
        r1.setRemoteAdapter(r11, r8, r0);
        r0 = new android.content.Intent;
        r3 = com.whatsapp.Conversation.class;
        r0.<init>(r10, r3);
        r3 = z;
        r4 = 5;
        r3 = r3[r4];
        r0.setAction(r3);
        r0 = android.app.PendingIntent.getActivity(r10, r5, r0, r6);
        r1.setPendingIntentTemplate(r8, r0);
        r0 = new android.content.Intent;
        r3 = com.whatsapp.Main.b();
        r0.<init>(r10, r3);
        r0 = android.app.PendingIntent.getActivity(r10, r5, r0, r6);
        r3 = 2131427513; // 0x7f0b00b9 float:1.8476644E38 double:1.053065111E-314;
        r1.setOnClickPendingIntent(r3, r0);
        r0 = 2131428075; // 0x7f0b02eb float:1.8477784E38 double:1.0530653884E-314;
        r1.setEmptyView(r8, r0);
        if (r2 == 0) goto L_0x0105;
    L_0x00af:
        r1 = new android.widget.RemoteViews;
        r0 = r10.getPackageName();
        r3 = 2130903226; // 0x7f0300ba float:1.7413264E38 double:1.0528060786E-314;
        r1.<init>(r0, r3);
        r0 = c;
        if (r0 == 0) goto L_0x00ee;
    L_0x00bf:
        r0 = c;
        r3 = r0.size();
        r0 = 2131427550; // 0x7f0b00de float:1.847672E38 double:1.053065129E-314;
        r4 = java.lang.Integer.toString(r3);
        r1.setTextViewText(r0, r4);
        r0 = 1106247680; // 0x41f00000 float:30.0 double:5.465589745E-315;
        r4 = 100;
        if (r12 >= r4) goto L_0x00e3;
    L_0x00d5:
        r4 = 99;
        if (r3 <= r4) goto L_0x00dd;
    L_0x00d9:
        r0 = 1096810496; // 0x41600000 float:14.0 double:5.41896386E-315;
        if (r2 == 0) goto L_0x00e3;
    L_0x00dd:
        r2 = 9;
        if (r3 <= r2) goto L_0x00e3;
    L_0x00e1:
        r0 = 1101004800; // 0x41a00000 float:20.0 double:5.439686476E-315;
    L_0x00e3:
        r2 = 2131427550; // 0x7f0b00de float:1.847672E38 double:1.053065129E-314;
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r1.setFloat(r2, r3, r0);
    L_0x00ee:
        r0 = new android.content.Intent;
        r2 = com.whatsapp.Main.b();
        r0.<init>(r10, r2);
        r0 = android.app.PendingIntent.getActivity(r10, r5, r0, r6);
        r2 = 2131427513; // 0x7f0b00b9 float:1.8476644E38 double:1.053065111E-314;
        r1.setOnClickPendingIntent(r2, r0);
        r0 = r1;
    L_0x0102:
        return r0;
    L_0x0103:
        r0 = move-exception;
        throw r0;
    L_0x0105:
        r0 = r1;
        goto L_0x0102;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.appwidget.WidgetProvider.a(android.content.Context, int, int, int):android.widget.RemoteViews");
    }

    private static boolean a(int i, int i2) {
        return i > 100 && i2 > 100;
    }
}
