package com.whatsapp;

import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class p5 implements OnClickListener {
    private static final String[] z;
    final RecordAudio a;

    static {
        String[] strArr = new String[3];
        String str = "'Xs[\u000e\bT6";
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
                        i3 = 105;
                        break;
                    case ay.f /*1*/:
                        i3 = 55;
                        break;
                    case ay.n /*2*/:
                        i3 = 83;
                        break;
                    case ay.p /*3*/:
                        i3 = 40;
                        break;
                    default:
                        i3 = 126;
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
                    str = "\u001bR0G\f\rV&L\u0017\u0006\u00180G\u0010\u001dE<DQ";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0001V w\u000e\u001bR%A\u001b\u001e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(android.view.View r1) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: com.whatsapp.p5.onClick(android.view.View):void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:113)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:223)
	at jadx.core.ProcessClass.process(ProcessClass.java:20)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
Caused by: java.lang.NullPointerException
*/
        /*
        r0_this = this;
        r7 = 2131624294; // 0x7f0e0166 float:1.8875764E38 double:1.0531623335E-314;
        r6 = 4;
        r5 = 1;
        r4 = 0;
        r1 = com.whatsapp.App.az;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r8.a;
        r2 = com.whatsapp.RecordAudio.a(r2);
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r8.a;
        r0 = com.whatsapp.RecordAudio.a(r0);
        switch(r0) {
            case 0: goto L_0x003c;
            case 1: goto L_0x0091;
            case 2: goto L_0x0030;
            case 3: goto L_0x009e;
            case 4: goto L_0x00b5;
            case 5: goto L_0x00b5;
            default: goto L_0x0030;
        };
        r0 = r8.a;
        r1 = r8.a;
        r1 = com.whatsapp.RecordAudio.a(r1);
        com.whatsapp.RecordAudio.b(r0, r1);
        return;
        r0 = r8.a;
        r0 = com.whatsapp.RecordAudio.n(r0);
        if (r0 == 0) goto L_0x0049;
        r8.a();
        if (r1 == 0) goto L_0x0030;
        r0 = r8.a;
        r0 = com.whatsapp.RecordAudio.d(r0);
        r2 = 0;
        r0.sendEmptyMessage(r2);
        r0 = r8.a;
        r0 = com.whatsapp.RecordAudio.m(r0);
        r2 = 120000; // 0x1d4c0 float:1.68156E-40 double:5.9288E-319;
        r0.setMax(r2);
        r0 = r8.a;
        r2 = java.lang.System.currentTimeMillis();
        com.whatsapp.RecordAudio.a(r0, r2);
        r0 = r8.a;
        r0 = com.whatsapp.RecordAudio.b(r0);
        r0.d();
        r0 = r8.a;
        r0 = com.whatsapp.RecordAudio.b(r0);
        r0.e();
        r0 = r8.a;
        r2 = 1;
        com.whatsapp.RecordAudio.a(r0, r2);
        r0 = r8.a;
        r2 = r8.a;
        r2 = com.whatsapp.RecordAudio.b(r2);
        r2 = r2.b();
        com.whatsapp.RecordAudio.a(r0, r2);
        if (r1 == 0) goto L_0x0030;
        r0 = r8.a;
        com.whatsapp.RecordAudio.i(r0);
        r0 = r8.a;
        r2 = 4;
        com.whatsapp.RecordAudio.a(r0, r2);
        if (r1 == 0) goto L_0x0030;
        r0 = r8.a;
        r0 = com.whatsapp.RecordAudio.j(r0);
        r0.g();
        r0 = r8.a;
        r0 = com.whatsapp.RecordAudio.j(r0);
        r0.h();
        r0 = r8.a;
        com.whatsapp.RecordAudio.a(r0, r6);
        r0 = r8.a;
        r0 = com.whatsapp.RecordAudio.n(r0);
        if (r0 == 0) goto L_0x00c2;
        r8.a();
        if (r1 == 0) goto L_0x0030;
        r0 = new com.whatsapp.MediaData;
        r0.<init>();
        r1 = r8.a;
        r1 = com.whatsapp.RecordAudio.l(r1);
        r0.file = r1;
        r0 = new android.content.Intent;
        r0.<init>();
        r1 = r8.a;
        r1 = com.whatsapp.RecordAudio.l(r1);
        r1 = android.net.Uri.fromFile(r1);
        r0.setData(r1);
        r1 = z;
        r1 = r1[r5];
        r0.putExtra(r1, r4);
        r1 = r8.a;
        r2 = -1;
        r1.setResult(r2, r0);
        r0 = r8.a;
        r0.finish();
        goto L_0x0030;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        goto L_0x0071;
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        r0 = r8.a;
        r2 = new com.whatsapp.a3j;
        r2.<init>(r8);
        r0.a(r7, r2);
        goto L_0x0080;
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        r0 = r8.a;
        r2 = new com.whatsapp.ie;
        r2.<init>(r8);
        r0.a(r7, r2);
        goto L_0x0080;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        goto L_0x00b0;
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        r0 = r8.a;
        r2 = 2131624340; // 0x7f0e0194 float:1.8875857E38 double:1.053162356E-314;
        r3 = new com.whatsapp.amf;
        r3.<init>(r8);
        r0.a(r2, r3);
        goto L_0x00b0;
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.p5.onClick(android.view.View):void");
    }

    p5(RecordAudio recordAudio) {
        this.a = recordAudio;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r8_this = this;
        r7 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r6 = 0;
        r0 = r8.a;	 Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x004f }
        r1 = r8.a;	 Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x004f }
        r2 = r8.a;	 Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x004f }
        r2 = com.whatsapp.RecordAudio.h(r2);	 Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x004f }
        r3 = r8.a;	 Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x004f }
        r3 = com.whatsapp.RecordAudio.l(r3);	 Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x004f }
        r4 = 2;
        r5 = r8.a;	 Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x004f }
        r5 = com.whatsapp.RecordAudio.n(r5);	 Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x004f }
        com.whatsapp.util.f.a(r0, r1, r2, r3, r4, r5);	 Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x004f }
    L_0x001e:
        r0 = r8.a;	 Catch:{ FileNotFoundException -> 0x008d }
        r0 = com.whatsapp.RecordAudio.j(r0);	 Catch:{ FileNotFoundException -> 0x008d }
        if (r0 == 0) goto L_0x003b;
    L_0x0026:
        r0 = r8.a;	 Catch:{ FileNotFoundException -> 0x008f }
        r0 = com.whatsapp.RecordAudio.j(r0);	 Catch:{ FileNotFoundException -> 0x008f }
        r0 = r0.c();	 Catch:{ FileNotFoundException -> 0x008f }
        if (r0 == 0) goto L_0x003b;
    L_0x0032:
        r0 = r8.a;	 Catch:{ FileNotFoundException -> 0x008f }
        r0 = com.whatsapp.RecordAudio.j(r0);	 Catch:{ FileNotFoundException -> 0x008f }
        r0.g();	 Catch:{ FileNotFoundException -> 0x008f }
    L_0x003b:
        r0 = r8.a;
        r0.finish();
        return;
    L_0x0041:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        r0 = r8.a;
        r0 = r0.getBaseContext();
        com.whatsapp.App.b(r0, r7, r6);
        goto L_0x001e;
    L_0x004f:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);	 Catch:{ FileNotFoundException -> 0x0089 }
        r1 = r0.getMessage();	 Catch:{ FileNotFoundException -> 0x0089 }
        if (r1 == 0) goto L_0x0079;
    L_0x0059:
        r0 = r0.getMessage();	 Catch:{ FileNotFoundException -> 0x008b }
        r1 = z;	 Catch:{ FileNotFoundException -> 0x008b }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ FileNotFoundException -> 0x008b }
        r0 = r0.contains(r1);	 Catch:{ FileNotFoundException -> 0x008b }
        if (r0 == 0) goto L_0x0079;
    L_0x0068:
        r0 = r8.a;	 Catch:{ FileNotFoundException -> 0x0087 }
        r0 = r0.getBaseContext();	 Catch:{ FileNotFoundException -> 0x0087 }
        r1 = 2131624285; // 0x7f0e015d float:1.8875745E38 double:1.053162329E-314;
        r2 = 1;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ FileNotFoundException -> 0x0087 }
        r0 = com.whatsapp.App.az;	 Catch:{ FileNotFoundException -> 0x0087 }
        if (r0 == 0) goto L_0x001e;
    L_0x0079:
        r0 = r8.a;	 Catch:{ FileNotFoundException -> 0x0087 }
        r0 = r0.getBaseContext();	 Catch:{ FileNotFoundException -> 0x0087 }
        r1 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r2 = 1;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ FileNotFoundException -> 0x0087 }
        goto L_0x001e;
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x008b }
    L_0x008b:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0087 }
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.p5.a():void");
    }
}
