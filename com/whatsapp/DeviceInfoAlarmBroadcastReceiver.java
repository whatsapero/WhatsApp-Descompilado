package com.whatsapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.whatsapp.util.Log;
import com.whatsapp.util.br;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class DeviceInfoAlarmBroadcastReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[18];
        String str = "=\u00028W7<H,_72\u0000<Q!7\u0003cZ5-\u0006a[:8\u0005\"[0y";
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
                        i3 = 89;
                        break;
                    case ay.f /*1*/:
                        i3 = 103;
                        break;
                    case ay.n /*2*/:
                        i3 = 78;
                        break;
                    case ay.p /*3*/:
                        i3 = 62;
                        break;
                    default:
                        i3 = 84;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ":\b#\u0010#1\u0006:M5)\u0017`N1+\n'M'0\b \u0010\u0016\u000b(\u000fz\u0017\u00184\u001a";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u001d\"\u0018w\u0017\u001c8\u0007p\u0012\u00168\u000fr\u0015\u000b*\u0011\u007f\u0017\r.\u0001p";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "=\u00028W7<H>L;:\u0002=M1*H Q:<";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "y\u0013!J55Z";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "=\u00028W7<H#[96\u00157\u001e$+\u000e8_ <8*W&-\u001es";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "y\u0017=Mi";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "2%";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "2%";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "y\u0014&_&<\u0003\u0011Z=+\u00137\u0003";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "2%";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "=\u00028W7<H#[96\u00157\u001e$+\b-['*\u0002=\u0003";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "=\u00028W7<H>L;:\u0002=M1*H+L&6\u0015n";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "=\u00028W7<H,_ -\u0002<Gt";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u001d\"\u0018w\u0017\u001c8\u0007p\u0012\u00168\u000fr\u0015\u000b*\u0011\u007f\u0017\r.\u0001p";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = ":\b#\u0010#1\u0006:M5)\u0017";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "8\u000b/L9";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ":\b#\u001036\b)R1w\u0017<Q7<\u0014=\u001038\u0017>M";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r6_this = this;
        r1 = 0;
        r3 = com.whatsapp.App.az;
        r0 = new android.os.Debug$MemoryInfo;
        r0.<init>();
        android.os.Debug.getMemoryInfo(r0);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 6;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r0.getTotalPrivateDirty();
        r2 = r2.append(r4);
        r4 = z;
        r5 = 8;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = z;
        r5 = 7;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r0.getTotalPss();
        r2 = r2.append(r4);
        r4 = z;
        r5 = 11;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = z;
        r5 = 10;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r0 = r0.getTotalSharedDirty();
        r0 = r2.append(r0);
        r2 = z;
        r4 = 9;
        r2 = r2[r4];
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.w;
        r4 = r0.getRunningAppProcesses();
        if (r4 != 0) goto L_0x007b;
    L_0x0071:
        r0 = z;	 Catch:{ Exception -> 0x00ff }
        r2 = 4;
        r0 = r0[r2];	 Catch:{ Exception -> 0x00ff }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x00ff }
        if (r3 == 0) goto L_0x00d5;
    L_0x007b:
        r0 = r4.size();	 Catch:{ Exception -> 0x0101 }
        r5 = new int[r0];	 Catch:{ Exception -> 0x0101 }
        r2 = r1;
    L_0x0082:
        r0 = r4.size();	 Catch:{ Exception -> 0x0101 }
        if (r2 >= r0) goto L_0x0096;
    L_0x0088:
        r0 = r4.get(r2);	 Catch:{ Exception -> 0x0101 }
        r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0;	 Catch:{ Exception -> 0x0101 }
        r0 = r0.pid;	 Catch:{ Exception -> 0x0101 }
        r5[r2] = r0;	 Catch:{ Exception -> 0x0101 }
        r0 = r2 + 1;
        if (r3 == 0) goto L_0x0121;
    L_0x0096:
        r0 = com.whatsapp.App.w;	 Catch:{ Exception -> 0x0101 }
        r2 = r0.getProcessMemoryInfo(r5);	 Catch:{ Exception -> 0x0101 }
        if (r2 == 0) goto L_0x00d5;
    L_0x009e:
        r4 = r2.length;	 Catch:{ Exception -> 0x0101 }
        r0 = r1;
    L_0x00a0:
        if (r1 >= r4) goto L_0x00ad;
    L_0x00a2:
        r5 = r2[r1];	 Catch:{ Exception -> 0x0101 }
        r5 = r5.getTotalPss();	 Catch:{ Exception -> 0x0101 }
        r0 = r0 + r5;
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x00a0;
    L_0x00ad:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0101 }
        r1.<init>();	 Catch:{ Exception -> 0x0101 }
        r3 = z;	 Catch:{ Exception -> 0x0101 }
        r4 = 12;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0101 }
        r1 = r1.append(r3);	 Catch:{ Exception -> 0x0101 }
        r2 = r2.length;	 Catch:{ Exception -> 0x0101 }
        r1 = r1.append(r2);	 Catch:{ Exception -> 0x0101 }
        r2 = z;	 Catch:{ Exception -> 0x0101 }
        r3 = 5;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0101 }
        r1 = r1.append(r2);	 Catch:{ Exception -> 0x0101 }
        r0 = r1.append(r0);	 Catch:{ Exception -> 0x0101 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0101 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0101 }
    L_0x00d5:
        r0 = de.greenrobot.event.g.b();
        r1 = com.whatsapp.nd.class;
        r0 = r0.b(r1);
        r0 = (com.whatsapp.nd) r0;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 14;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        com.whatsapp.App.a5();
        return;
    L_0x00ff:
        r0 = move-exception;
        throw r0;
    L_0x0101:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 13;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x00d5;
    L_0x0121:
        r2 = r0;
        goto L_0x0082;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DeviceInfoAlarmBroadcastReceiver.a():void");
    }

    public void onReceive(Context context, Intent intent) {
        br.a(new dx(this));
        if (App.p()) {
            a5w.a(new jw(false), new Void[0]);
        }
        boolean backgroundDataSetting = App.ah.getBackgroundDataSetting();
        Log.i(z[0] + backgroundDataSetting);
        if (!backgroundDataSetting) {
            App.c(context, true);
            App.s(context);
            App.B(z[1]);
        }
        App.V();
    }

    public void b(Context context) {
        ((AlarmManager) context.getSystemService(z[17])).setInexactRepeating(3, 0, 3600000, PendingIntent.getBroadcast(context, 0, new Intent(z[15]).setPackage(z[16]), 0));
    }

    DeviceInfoAlarmBroadcastReceiver() {
    }

    public void a(Context context) {
        context.registerReceiver(this, new IntentFilter(z[3]), z[2], null);
    }

    static void a(DeviceInfoAlarmBroadcastReceiver deviceInfoAlarmBroadcastReceiver) {
        deviceInfoAlarmBroadcastReceiver.a();
    }
}
