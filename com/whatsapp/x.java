package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.io.IOException;

public class x extends AsyncTask {
    private static final String[] z;
    boolean a;
    boolean b;
    final ata c;
    boolean d;

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
        r2 = "l1H\u0000:c9I\u000e/n;H\fsi!Y\n9i'";
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
        r0 = "l1H\u0000:c9I\u000e/n;H\fs|5S\u00059~";
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
        r2 = 92;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 26;
        goto L_0x0038;
    L_0x0043:
        r2 = 84;
        goto L_0x0038;
    L_0x0046:
        r2 = 58;
        goto L_0x0038;
    L_0x0049:
        r2 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.x.<clinit>():void");
    }

    protected Object doInBackground(Object[] objArr) {
        return a(objArr);
    }

    protected void onPostExecute(Object obj) {
        a((ed) obj);
    }

    static void a(x xVar, Object[] objArr) {
        xVar.publishProgress(objArr);
    }

    public void a(Integer[] numArr) {
        if (ata.a != null) {
            ata.a.setProgress(numArr[0].intValue());
        }
    }

    public x(ata com_whatsapp_ata, boolean z, boolean z2, boolean z3) {
        this.c = com_whatsapp_ata;
        this.b = false;
        this.d = z;
        this.a = z3;
    }

    protected ed a(Object[] objArr) {
        ed a;
        Throwable e;
        ed edVar = ed.FAILED;
        b3 ynVar = new yn(this);
        try {
            long currentTimeMillis = System.currentTimeMillis();
            a = App.aJ.a(this.d, ynVar);
            try {
                publishProgress(new Integer[]{Integer.valueOf(100)});
                currentTimeMillis = 3000 - (System.currentTimeMillis() - currentTimeMillis);
                try {
                    if (this.d && currentTimeMillis > 0) {
                        try {
                            Thread.sleep(currentTimeMillis);
                        } catch (InterruptedException e2) {
                        }
                    }
                } catch (InterruptedException e3) {
                    throw e3;
                } catch (IOException e4) {
                    throw e4;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable e6) {
            Throwable th = e6;
            a = edVar;
            e = th;
            Log.c(e);
            this.b = true;
            return a;
        }
        return a;
    }

    public void onProgressUpdate(Object[] objArr) {
        a((Integer[]) objArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(com.whatsapp.ed r3) {
        /*
        r2_this = this;
        r0 = com.whatsapp.ata.a;
        if (r0 == 0) goto L_0x0012;
    L_0x0004:
        r0 = r2.c;
        r0 = com.whatsapp.ata.b(r0);
        r1 = 100;
        r0.removeDialog(r1);
        r0 = 0;
        com.whatsapp.ata.a = r0;
    L_0x0012:
        r0 = com.whatsapp.App.aJ;
        r0.j();
        r0 = com.whatsapp.ed.FAILED;
        if (r3 == r0) goto L_0x0058;
    L_0x001b:
        r0 = z;
        r1 = 0;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r2.d;
        if (r0 == 0) goto L_0x0036;
    L_0x0027:
        r0 = com.whatsapp.ed.SUCCESS_CREATED;
        if (r3 != r0) goto L_0x0036;
    L_0x002b:
        r0 = r2.c;
        r0 = com.whatsapp.ata.b(r0);
        r1 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r0.showDialog(r1);
    L_0x0036:
        r0 = com.whatsapp.App.aJ;
        r0.I();
        com.whatsapp.App.an();
        com.whatsapp.App.ae();
        r0 = r2.c;
        r0 = r0.d;
        if (r0 != 0) goto L_0x004c;
    L_0x0047:
        r0 = com.whatsapp.App.p;
        com.whatsapp.App.l(r0);
    L_0x004c:
        com.whatsapp.App.D();
        r0 = com.whatsapp.App.p;
        r0.O();
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0060;
    L_0x0058:
        r0 = z;
        r1 = 1;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
    L_0x0060:
        r0 = r2.c;
        r0 = r0.d;
        if (r0 != 0) goto L_0x006b;
    L_0x0066:
        r0 = com.whatsapp.App.p;
        com.whatsapp.messaging.MessageService.a(r0);
    L_0x006b:
        r0 = r2.c;
        r0 = r0.d;
        if (r0 == 0) goto L_0x007e;
    L_0x0071:
        r0 = r2.d;
        if (r0 == 0) goto L_0x007e;
    L_0x0075:
        r0 = r2.c;
        r0 = com.whatsapp.ata.b(r0);
        com.whatsapp.wallpaper.p.d(r0);
    L_0x007e:
        r0 = r2.c;
        r0.a();
        r0 = r2.c;
        r0.c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.x.a(com.whatsapp.ed):void");
    }
}
