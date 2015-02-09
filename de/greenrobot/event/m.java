package de.greenrobot.event;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

final class m extends Handler {
    private static final String[] z;
    private boolean a;
    private final a b;
    private final int c;
    private final g d;

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
        r2 = "/DVg4LEL\u007fp\u001fNMop\u0004JMo<\tY\u0003f5\u001fXBl5";
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
        r0 = "/DVg4LEL\u007fp\u001fNMop\u0004JMo<\tY\u0003f5\u001fXBl5";
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
        r2 = 80;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        goto L_0x0038;
    L_0x0043:
        r2 = 43;
        goto L_0x0038;
    L_0x0046:
        r2 = 35;
        goto L_0x0038;
    L_0x0049:
        r2 = 11;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: de.greenrobot.event.m.<clinit>():void");
    }

    public void handleMessage(Message message) {
        boolean z = p.a;
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                i a = this.b.a();
                if (a == null) {
                    synchronized (this) {
                        a = this.b.a();
                        if (a == null) {
                            this.a = false;
                            this.a = false;
                            return;
                        }
                    }
                }
                this.d.a(a);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.c));
            if (sendMessage(obtainMessage())) {
                this.a = true;
                if (z) {
                    g.o++;
                    return;
                }
                return;
            }
            throw new e(z[1]);
        } catch (e e) {
            throw e;
        } catch (e e2) {
            throw e2;
        } catch (Throwable th) {
            this.a = false;
        }
    }

    void a(h hVar, Object obj) {
        i a = i.a(hVar, obj);
        synchronized (this) {
            try {
                this.b.a(a);
                if (!this.a) {
                    this.a = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new e(z[0]);
                    }
                }
            } catch (e e) {
                throw e;
            } catch (Throwable th) {
            }
        }
    }

    m(g gVar, Looper looper, int i) {
        super(looper);
        this.d = gVar;
        this.c = i;
        this.b = new a();
    }
}
