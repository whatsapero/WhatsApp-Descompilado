package com.whatsapp;

import android.graphics.drawable.Drawable;

class cl implements Runnable {
    private static final String[] z;
    final ConversationRowVideo a;
    long b;
    MediaData c;
    Drawable d;
    long e;

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
        r2 = "\u001f*\u0001K~\u00191\u0000Xx\f4JIt\u001d5\fJt\u00067\r[|\u000b";
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
        if (r7 > r8) goto L_0x002f;
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
        r0 = "\u001f*\u0001K~\u00191\u0000Xx\f4JIt\u001d5\fJt\u00067\r[|\u000b";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x002f:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x0040;
            case 1: goto L_0x0043;
            case 2: goto L_0x0046;
            case 3: goto L_0x0049;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 17;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        goto L_0x0038;
    L_0x0043:
        r2 = 67;
        goto L_0x0038;
    L_0x0046:
        r2 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x0038;
    L_0x0049:
        r2 = 46;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.cl.<clinit>():void");
    }

    cl(ConversationRowVideo conversationRowVideo, MediaData mediaData) {
        this.a = conversationRowVideo;
        this.b = 1000000;
        this.c = mediaData;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(10)
    public void run() {
        /*
        r12_this = this;
        r8 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r0 = 1;
        r1 = 0;
        r3 = com.whatsapp.App.az;
        r2 = r12.c;	 Catch:{ Exception -> 0x0038 }
        if (r2 == 0) goto L_0x0034;
    L_0x000a:
        r2 = r12.c;	 Catch:{ Exception -> 0x0038 }
        r4 = r12.a;	 Catch:{ Exception -> 0x0038 }
        r4 = r4.h;	 Catch:{ Exception -> 0x0038 }
        r4 = r4.A;	 Catch:{ Exception -> 0x0038 }
        if (r2 != r4) goto L_0x0034;
    L_0x0014:
        r2 = r12.a;	 Catch:{ Exception -> 0x003a }
        r2 = r2.isShown();	 Catch:{ Exception -> 0x003a }
        if (r2 == 0) goto L_0x0034;
    L_0x001c:
        r2 = r12.a;	 Catch:{ Exception -> 0x003c }
        r2 = com.whatsapp.ConversationRowVideo.b(r2);	 Catch:{ Exception -> 0x003c }
        if (r2 != r12) goto L_0x0034;
    L_0x0024:
        r2 = r12.c;	 Catch:{ Exception -> 0x003e }
        r2 = r2.file;	 Catch:{ Exception -> 0x003e }
        if (r2 == 0) goto L_0x0034;
    L_0x002a:
        r2 = r12.c;	 Catch:{ Exception -> 0x0040 }
        r2 = r2.file;	 Catch:{ Exception -> 0x0040 }
        r2 = r2.exists();	 Catch:{ Exception -> 0x0040 }
        if (r2 != 0) goto L_0x0044;
    L_0x0034:
        r12.a();	 Catch:{ Exception -> 0x0042 }
    L_0x0037:
        return;
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r2 = r12.a;
        r4 = r2.getDrawingTime();
        r6 = r12.e;	 Catch:{ Exception -> 0x0054 }
        r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x0056;
    L_0x0050:
        r12.a();	 Catch:{ Exception -> 0x0054 }
        goto L_0x0037;
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        r12.e = r4;
        r4 = new android.media.MediaMetadataRetriever;
        r4.<init>();
        r2 = r12.c;	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f1 }
        r2 = r2.file;	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f1 }
        r2 = r2.getAbsolutePath();	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f1 }
        r4.setDataSource(r2);	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f1 }
        r6 = r12.b;	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f1 }
        r2 = r4.getFrameAtTime(r6);	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f1 }
        r5 = 9;
        r5 = r4.extractMetadata(r5);	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f1 }
        r6 = java.lang.Long.parseLong(r5);	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f1 }
        r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r5 <= 0) goto L_0x0117;
    L_0x007c:
        r8 = r12.b;	 Catch:{ Exception -> 0x00c8, NoSuchMethodError -> 0x00f1 }
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 * r10;
        r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x008b;
    L_0x0085:
        r6 = 0;
        r12.b = r6;	 Catch:{ Exception -> 0x00ca, NoSuchMethodError -> 0x00f1 }
        if (r3 == 0) goto L_0x0093;
    L_0x008b:
        r6 = r12.b;	 Catch:{ Exception -> 0x00cc, NoSuchMethodError -> 0x00f1 }
        r8 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r6 = r6 + r8;
        r12.b = r6;	 Catch:{ Exception -> 0x00cc, NoSuchMethodError -> 0x00f1 }
    L_0x0093:
        if (r2 == 0) goto L_0x0117;
    L_0x0095:
        r5 = r12.c;	 Catch:{ Exception -> 0x00ed, NoSuchMethodError -> 0x00f1 }
        r6 = r12.a;	 Catch:{ Exception -> 0x00ed, NoSuchMethodError -> 0x00f1 }
        r6 = r6.h;	 Catch:{ Exception -> 0x00ed, NoSuchMethodError -> 0x00f1 }
        r6 = r6.A;	 Catch:{ Exception -> 0x00ed, NoSuchMethodError -> 0x00f1 }
        if (r5 != r6) goto L_0x0117;
    L_0x009f:
        r5 = r12.a;	 Catch:{ Exception -> 0x00ef, NoSuchMethodError -> 0x00f1 }
        r5 = r5.isShown();	 Catch:{ Exception -> 0x00ef, NoSuchMethodError -> 0x00f1 }
        if (r5 == 0) goto L_0x0117;
    L_0x00a7:
        r5 = r12.a;	 Catch:{ Exception -> 0x0113, NoSuchMethodError -> 0x0111 }
        r6 = new com.whatsapp.avw;	 Catch:{ Exception -> 0x0113, NoSuchMethodError -> 0x0111 }
        r6.<init>(r12, r2);	 Catch:{ Exception -> 0x0113, NoSuchMethodError -> 0x0111 }
        r5.post(r6);	 Catch:{ Exception -> 0x0113, NoSuchMethodError -> 0x0111 }
    L_0x00b1:
        r4.release();
        if (r0 == 0) goto L_0x00c1;
    L_0x00b6:
        r0 = com.whatsapp.ConversationRowVideo.a();	 Catch:{ Exception -> 0x00c6 }
        r4 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r0.postDelayed(r12, r4);	 Catch:{ Exception -> 0x00c6 }
        if (r3 == 0) goto L_0x0037;
    L_0x00c1:
        r12.a();	 Catch:{ Exception -> 0x00c6 }
        goto L_0x0037;
    L_0x00c6:
        r0 = move-exception;
        throw r0;
    L_0x00c8:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x00ca, NoSuchMethodError -> 0x00f1 }
    L_0x00ca:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x00cc, NoSuchMethodError -> 0x00f1 }
    L_0x00cc:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f1 }
    L_0x00ce:
        r2 = move-exception;
    L_0x00cf:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r0 = r6[r0];
        r0 = r5.append(r0);
        r2 = r2.toString();
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r1;
        goto L_0x00b1;
    L_0x00ed:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x00ef, NoSuchMethodError -> 0x00f1 }
    L_0x00ef:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f1 }
    L_0x00f1:
        r0 = move-exception;
        r2 = r0;
        r0 = r1;
    L_0x00f4:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r1 = r6[r1];
        r1 = r5.append(r1);
        r2 = r2.toString();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x00b1;
    L_0x0111:
        r2 = move-exception;
        goto L_0x00f4;
    L_0x0113:
        r1 = move-exception;
        r2 = r1;
        r1 = r0;
        goto L_0x00cf;
    L_0x0117:
        r0 = r1;
        goto L_0x00b1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.cl.run():void");
    }

    void a() {
        ConversationRowVideo.a().post(new anp(this));
        this.a.post(new ane(this));
    }
}
