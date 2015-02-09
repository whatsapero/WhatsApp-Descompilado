package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import com.whatsapp.contact.e;
import com.whatsapp.contact.m;
import com.whatsapp.fieldstats.al;
import com.whatsapp.fieldstats.y;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class DbBackupAlarmBroadcastReceiver extends BroadcastReceiver {
    private static final String[] z;
    private final App a;

    static {
        String[] strArr = new String[7];
        String str = "7\b/S5>M(S5/\u0001?\u001b4?\u001b>Iz8\b{I/4M=I57M/S?z8\u0012\u001b.2\u001f>Z>";
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
                        i3 = 90;
                        break;
                    case ay.f /*1*/:
                        i3 = 109;
                        break;
                    case ay.n /*2*/:
                        i3 = 91;
                        break;
                    case ay.p /*3*/:
                        i3 = 59;
                        break;
                    default:
                        i3 = 90;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ";\u001d+\u0014;6\f)Vu7\u001e<H>8B9Z91\u0018+\u0014)1\u0004+\u001b45\u0019{K6/\n<^>z\u00045\u001b;4\t{W5-M9Z..\b)B";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = ";\u001d+\u0014;6\f)Vu7\u001e<H>8B9Z91\u0018+\u0014)1\u0004+\u001b(?\f?\u001654\u0001\"\u001b7?\t2Z";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = ";\u001d+\u0014;6\f)Vu7\u001e<H>8B9Z91\u0018+\u0014)1\u0004+\u001b45M6^>3\f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "9\u00026\u0015-2\f/H;*\u001duZ6;\u001f6\u0015\u0017\u001f>\bz\u001d\u001f>\u0004\u007f\u0018\u0005/\u001ax\u0011\u000f=";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "9\u00026\u0015-2\f/H;*\u001duK?(\u00002H)3\u00025\u0015\u0018\b\"\u001a\u007f\u0019\u001b>\u000f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ";\u001d+\u0014;6\f)Vu7\u001e<H>8B9Z91\u0018+";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void a(DbBackupAlarmBroadcastReceiver dbBackupAlarmBroadcastReceiver, Context context) {
        dbBackupAlarmBroadcastReceiver.b(context);
    }

    private void b(Context context) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalThreadStateException(z[0]);
            }
            try {
                al.a(context, y.CLASS_COUNT, Integer.valueOf(a54.l()));
                if (a54.l() <= 10) {
                    al.a(context, y.CLASS_NAMES, a54.a().substring(0, 1000));
                }
                try {
                    al.a(context, y.IS_BLUESTACKS, Boolean.valueOf(a54.d()));
                    al.a(context, y.IS_GENYMOTION, Boolean.valueOf(a54.y()));
                    al.a(context, y.SIGNATURE_HASH, a54.b(context));
                    if (a54.g()) {
                        al.a(App.p, y.IS_MONKEYRUNNER_RUNNING, Boolean.valueOf(true));
                    }
                    al.a(context, y.IS_WHATSAPP_PLUS_USER, Boolean.valueOf(a54.w()));
                    al.a(context, y.GOOGLE_ACCOUNT_COUNT, Integer.valueOf(a54.H()));
                    al.a(context, y.ANDROID_HAS_SD_CARD, a54.o());
                    Integer a = e.a(m.BOTH);
                    if (a != null) {
                        try {
                            al.a(context, y.ADDRESSBOOK_SIZE, a);
                        } catch (IllegalThreadStateException e) {
                            throw e;
                        }
                    }
                    int c = App.P.c();
                    if (c != -1) {
                        try {
                            al.a(context, y.ADDRESSBOOK_WHATSAPP_SIZE, Integer.valueOf(c));
                        } catch (IllegalThreadStateException e2) {
                            throw e2;
                        }
                    }
                    ak4.a();
                    Long C = l7.C();
                    if (C != null) {
                        try {
                            al.a(context, y.CHAT_DATABASE_SIZE, Double.valueOf((double) C.longValue()));
                        } catch (IllegalThreadStateException e22) {
                            throw e22;
                        }
                    }
                    ak4.b();
                } catch (IllegalThreadStateException e222) {
                    throw e222;
                }
            } catch (IllegalThreadStateException e2222) {
                throw e2222;
            }
        } catch (IllegalThreadStateException e22222) {
            throw e22222;
        }
    }

    static App a(DbBackupAlarmBroadcastReceiver dbBackupAlarmBroadcastReceiver) {
        return dbBackupAlarmBroadcastReceiver.a;
    }

    public void onReceive(android.content.Context r4, android.content.Intent r5) {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIncludingExcHandlers(DepthRegionTraversal.java:36)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:53)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r3_this = this;
        r1 = com.whatsapp.App.az;
        r0 = com.whatsapp.App.aF;	 Catch:{ IllegalThreadStateException -> 0x006a }
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r0 = z;	 Catch:{ IllegalThreadStateException -> 0x006c }
        r2 = 4;	 Catch:{ IllegalThreadStateException -> 0x006c }
        r0 = r0[r2];	 Catch:{ IllegalThreadStateException -> 0x006c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalThreadStateException -> 0x006c }
        r0 = 1;	 Catch:{ IllegalThreadStateException -> 0x006c }
        com.whatsapp.App.J = r0;	 Catch:{ IllegalThreadStateException -> 0x006c }
        if (r1 == 0) goto L_0x0064;
    L_0x0013:
        r0 = com.whatsapp.App.d;	 Catch:{ IllegalThreadStateException -> 0x006e }
        if (r0 == 0) goto L_0x0024;	 Catch:{ IllegalThreadStateException -> 0x006e }
    L_0x0017:
        r0 = z;	 Catch:{ IllegalThreadStateException -> 0x006e }
        r2 = 3;	 Catch:{ IllegalThreadStateException -> 0x006e }
        r0 = r0[r2];	 Catch:{ IllegalThreadStateException -> 0x006e }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalThreadStateException -> 0x006e }
        r0 = 0;	 Catch:{ IllegalThreadStateException -> 0x006e }
        com.whatsapp.App.J = r0;	 Catch:{ IllegalThreadStateException -> 0x006e }
        if (r1 == 0) goto L_0x0064;
    L_0x0024:
        r0 = de.greenrobot.event.g.b();
        r2 = com.whatsapp.nd.class;
        r0 = r0.b(r2);
        r0 = (com.whatsapp.nd) r0;
        if (r0 == 0) goto L_0x0045;
    L_0x0032:
        r0 = r0.a();	 Catch:{ IllegalThreadStateException -> 0x0070 }
        if (r0 != 0) goto L_0x0045;
    L_0x0038:
        r0 = z;	 Catch:{ IllegalThreadStateException -> 0x0072 }
        r2 = 2;	 Catch:{ IllegalThreadStateException -> 0x0072 }
        r0 = r0[r2];	 Catch:{ IllegalThreadStateException -> 0x0072 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalThreadStateException -> 0x0072 }
        r0 = 1;	 Catch:{ IllegalThreadStateException -> 0x0072 }
        com.whatsapp.App.J = r0;	 Catch:{ IllegalThreadStateException -> 0x0072 }
        if (r1 == 0) goto L_0x0064;	 Catch:{ IllegalThreadStateException -> 0x0072 }
    L_0x0045:
        r0 = z;	 Catch:{ IllegalThreadStateException -> 0x0072 }
        r1 = 1;	 Catch:{ IllegalThreadStateException -> 0x0072 }
        r0 = r0[r1];	 Catch:{ IllegalThreadStateException -> 0x0072 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalThreadStateException -> 0x0072 }
        r0 = 0;	 Catch:{ IllegalThreadStateException -> 0x0072 }
        com.whatsapp.App.J = r0;	 Catch:{ IllegalThreadStateException -> 0x0072 }
        r0 = new com.whatsapp.jw;	 Catch:{ IllegalThreadStateException -> 0x0072 }
        r1 = 1;	 Catch:{ IllegalThreadStateException -> 0x0072 }
        r0.<init>(r1);	 Catch:{ IllegalThreadStateException -> 0x0072 }
        r1 = 0;	 Catch:{ IllegalThreadStateException -> 0x0072 }
        r1 = new java.lang.Void[r1];	 Catch:{ IllegalThreadStateException -> 0x0072 }
        com.whatsapp.a5w.a(r0, r1);	 Catch:{ IllegalThreadStateException -> 0x0072 }
        r0 = new com.whatsapp.ki;	 Catch:{ IllegalThreadStateException -> 0x0072 }
        r0.<init>(r3);	 Catch:{ IllegalThreadStateException -> 0x0072 }
        com.whatsapp.util.br.a(r0);	 Catch:{ IllegalThreadStateException -> 0x0072 }
    L_0x0064:
        r0 = r3.a;
        r0.O();
        return;
    L_0x006a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalThreadStateException -> 0x006c }
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalThreadStateException -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        throw r0;
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalThreadStateException -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DbBackupAlarmBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public void a(Context context) {
        context.registerReceiver(this, new IntentFilter(z[5]), z[6], null);
    }

    DbBackupAlarmBroadcastReceiver(App app) {
        this.a = app;
    }
}
