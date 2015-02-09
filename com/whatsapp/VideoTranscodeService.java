package com.whatsapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;

public class VideoTranscodeService extends Service {
    private static final HashMap d;
    private static final String[] z;
    private String a;
    private int b;
    private boolean c;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r11, int r12, int r13) {
        /*
        r10_this = this;
        r4 = com.whatsapp.App.az;
        r0 = d;	 Catch:{ SecurityException -> 0x0154 }
        r0 = r0.isEmpty();	 Catch:{ SecurityException -> 0x0154 }
        if (r0 == 0) goto L_0x000f;
    L_0x000a:
        r10.stopSelf();	 Catch:{ SecurityException -> 0x0154 }
        if (r4 == 0) goto L_0x0152;
    L_0x000f:
        r5 = r10.c;
        r0 = 1;
        r10.c = r0;
        r6 = new android.support.v4.app.NotificationCompat$Builder;
        r0 = com.whatsapp.App.p;
        r6.<init>(r0);
        r0 = z;
        r1 = 1;
        r0 = r0[r1];
        r6.setCategory(r0);
        r0 = 17301640; // 0x1080088 float:2.4979636E-38 double:8.548146E-317;
        r6.setSmallIcon(r0);
        r0 = java.lang.System.currentTimeMillis();
        r6.setWhen(r0);
        r0 = 2131624007; // 0x7f0e0047 float:1.8875182E38 double:1.0531621917E-314;
        r0 = r10.getString(r0);
        r6.setContentTitle(r0);
        r1 = -1;
        r0 = d;
        r0 = r0.size();
        r2 = 1;
        if (r0 != r2) goto L_0x00a0;
    L_0x0044:
        r0 = d;
        r0 = r0.values();
        r0 = r0.iterator();
        r0 = r0.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r2 = com.whatsapp.App.P;
        r3 = r0.e;
        r3 = r3.c;
        r3 = r2.a(r3);
        r2 = 2131624825; // 0x7f0e0379 float:1.887684E38 double:1.053162596E-314;
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r9 = r3.a(r10);
        r9 = com.whatsapp.util.a5.a(r9);
        r7[r8] = r9;
        r2 = r10.getString(r2, r7);
        r7 = android.os.Build.VERSION.SDK_INT;
        r8 = 11;
        if (r7 < r8) goto L_0x009a;
    L_0x0079:
        r0 = r0.A;
        r0 = (com.whatsapp.MediaData) r0;
        if (r0 == 0) goto L_0x009a;
    L_0x007f:
        r8 = r0.progress;
        r1 = (int) r8;
        r7 = r0.transcoder;	 Catch:{ SecurityException -> 0x0156 }
        if (r7 == 0) goto L_0x009a;
    L_0x0086:
        r7 = r0.transcoder;	 Catch:{ SecurityException -> 0x0156 }
        r7 = r7.b();	 Catch:{ SecurityException -> 0x0156 }
        if (r7 == 0) goto L_0x009a;
    L_0x008e:
        r0 = r0.uploader;	 Catch:{ SecurityException -> 0x0158 }
        if (r0 != 0) goto L_0x01ac;
    L_0x0092:
        r0 = r1 / 2;
        if (r4 == 0) goto L_0x01a9;
    L_0x0096:
        r0 = r0 / 2;
        r1 = r0 + 50;
    L_0x009a:
        r0 = com.whatsapp.Conversation.a(r3);
        if (r4 == 0) goto L_0x01a6;
    L_0x00a0:
        r2 = new java.util.HashSet;
        r2.<init>();
        r0 = d;
        r0 = r0.values();
        r3 = r0.iterator();
    L_0x00af:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x00c4;
    L_0x00b5:
        r0 = r3.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r0 = r0.e;
        r0 = r0.c;
        r2.add(r0);
        if (r4 == 0) goto L_0x00af;
    L_0x00c4:
        r0 = r2.size();
        r3 = 1;
        if (r0 != r3) goto L_0x015a;
    L_0x00cb:
        r3 = com.whatsapp.App.P;
        r0 = r2.iterator();
        r0 = r0.next();
        r0 = (java.lang.String) r0;
        r2 = r3.a(r0);
        r0 = com.whatsapp.App.aX;
        r3 = 2131558440; // 0x7f0d0028 float:1.8742196E38 double:1.0531297973E-314;
        r7 = d;
        r7 = r7.size();
        r0 = r0.a(r3, r7);
        r3 = 2;
        r3 = new java.lang.Object[r3];
        r7 = 0;
        r8 = d;
        r8 = r8.size();
        r8 = java.lang.Integer.valueOf(r8);
        r3[r7] = r8;
        r7 = 1;
        r8 = r2.a(r10);
        r8 = com.whatsapp.util.a5.a(r8);
        r3[r7] = r8;
        r0 = java.lang.String.format(r0, r3);
        r2 = com.whatsapp.Conversation.a(r2);
        r3 = r2;
        r2 = r0;
    L_0x010f:
        if (r1 < 0) goto L_0x0119;
    L_0x0111:
        r7 = 100;
        if (r1 != 0) goto L_0x0189;
    L_0x0115:
        r0 = 1;
    L_0x0116:
        r6.setProgress(r7, r1, r0);
    L_0x0119:
        r6.setContentText(r2);	 Catch:{ SecurityException -> 0x018b }
        if (r5 != 0) goto L_0x0121;
    L_0x011e:
        r6.setTicker(r2);	 Catch:{ SecurityException -> 0x018b }
    L_0x0121:
        r0 = 0;
        r7 = 0;
        r0 = android.app.PendingIntent.getActivity(r10, r0, r3, r7);
        r6.setContentIntent(r0);	 Catch:{ SecurityException -> 0x018d }
        if (r5 != 0) goto L_0x0136;
    L_0x012c:
        r0 = 4;
        r3 = r6.build();	 Catch:{ SecurityException -> 0x018d }
        r10.startForeground(r0, r3);	 Catch:{ SecurityException -> 0x018d }
        if (r4 == 0) goto L_0x014e;
    L_0x0136:
        r0 = r10.b;	 Catch:{ SecurityException -> 0x018f }
        if (r0 != r1) goto L_0x0142;
    L_0x013a:
        r0 = r10.a;	 Catch:{ SecurityException -> 0x0191 }
        r0 = android.text.TextUtils.equals(r2, r0);	 Catch:{ SecurityException -> 0x0191 }
        if (r0 != 0) goto L_0x014e;
    L_0x0142:
        r0 = android.support.v4.app.NotificationManagerCompat.from(r10);	 Catch:{ SecurityException -> 0x0193 }
        r3 = 4;
        r4 = r6.build();	 Catch:{ SecurityException -> 0x0193 }
        r0.notify(r3, r4);	 Catch:{ SecurityException -> 0x0193 }
    L_0x014e:
        r10.b = r1;
        r10.a = r2;
    L_0x0152:
        r0 = 2;
        return r0;
    L_0x0154:
        r0 = move-exception;
        throw r0;
    L_0x0156:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0158 }
    L_0x0158:
        r0 = move-exception;
        throw r0;
    L_0x015a:
        r2 = new android.content.Intent;
        r0 = com.whatsapp.Main.b();
        r2.<init>(r10, r0);
        r0 = com.whatsapp.App.aX;
        r3 = 2131558441; // 0x7f0d0029 float:1.8742198E38 double:1.053129798E-314;
        r7 = d;
        r7 = r7.size();
        r0 = r0.a(r3, r7);
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r7 = 0;
        r8 = d;
        r8 = r8.size();
        r8 = java.lang.Integer.valueOf(r8);
        r3[r7] = r8;
        r0 = java.lang.String.format(r0, r3);
        r3 = r2;
        r2 = r0;
        goto L_0x010f;
    L_0x0189:
        r0 = 0;
        goto L_0x0116;
    L_0x018b:
        r0 = move-exception;
        throw r0;
    L_0x018d:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x018f }
    L_0x018f:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0191 }
    L_0x0191:
        r0 = move-exception;
        throw r0;
    L_0x0193:
        r0 = move-exception;
        r3 = r0.toString();	 Catch:{ SecurityException -> 0x01a4 }
        r4 = z;	 Catch:{ SecurityException -> 0x01a4 }
        r5 = 0;
        r4 = r4[r5];	 Catch:{ SecurityException -> 0x01a4 }
        r3 = r3.contains(r4);	 Catch:{ SecurityException -> 0x01a4 }
        if (r3 != 0) goto L_0x014e;
    L_0x01a3:
        throw r0;	 Catch:{ SecurityException -> 0x01a4 }
    L_0x01a4:
        r0 = move-exception;
        throw r0;
    L_0x01a6:
        r3 = r0;
        goto L_0x010f;
    L_0x01a9:
        r1 = r0;
        goto L_0x009a;
    L_0x01ac:
        r0 = r1;
        goto L_0x0096;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VideoTranscodeService.onStartCommand(android.content.Intent, int, int):int");
    }

    public VideoTranscodeService() {
        this.c = false;
        this.b = -1;
    }

    public void onDestroy() {
        try {
            if (this.c) {
                this.c = false;
                stopForeground(true);
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    static HashMap b() {
        return d;
    }

    public static void a() {
        App.aJ.b(new gf());
    }

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
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
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "u\f(\u000b\n}\u0006b\t\u0000f\u000f%\n\u0016}\r\"W0D&\r- K#\u001c):[2\u001f&6@#\u0018*";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000a:
        r2 = r2.toCharArray();
        r6 = r2.length;
        r7 = r6;
        r8 = r1;
        r6 = r2;
    L_0x0012:
        if (r7 > r8) goto L_0x0036;
    L_0x0014:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0020;
        };
    L_0x0020:
        r4[r3] = r2;
        r2 = 1;
        r0 = "d\u0010#\u001e\u0017q\u0011?";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        r0 = new java.util.HashMap;
        r0.<init>();
        d = r0;
        return;
    L_0x0036:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x0047;
            case 1: goto L_0x004a;
            case 2: goto L_0x004d;
            case 3: goto L_0x0050;
            default: goto L_0x003d;
        };
    L_0x003d:
        r2 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
    L_0x003f:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0047:
        r2 = 20;
        goto L_0x003f;
    L_0x004a:
        r2 = 98;
        goto L_0x003f;
    L_0x004d:
        r2 = 76;
        goto L_0x003f;
    L_0x0050:
        r2 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VideoTranscodeService.<clinit>():void");
    }

    public IBinder onBind(Intent intent) {
        return null;
    }
}
