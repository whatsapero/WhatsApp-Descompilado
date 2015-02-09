package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class s3 {
    private static s3 f;
    private static final String[] z;
    private Handler a;
    private Runnable b;
    private Stack c;
    private uo d;
    private boolean e;

    static {
        String[] strArr = new String[4];
        String str = "\u0011/J7@\u001d?Z1E\u0013=@2N\u001d.\u0001/T\u0019?K~";
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
                        i3 = 124;
                        break;
                    case ay.f /*1*/:
                        i3 = 74;
                        break;
                    case ay.n /*2*/:
                        i3 = 46;
                        break;
                    case ay.p /*3*/:
                        i3 = 94;
                        break;
                    default:
                        i3 = 33;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0011/J7@\u001d?Z1E\u0013=@2N\u001d.\u0001=@\u0012)K2\u0001";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0011/J7@\u001d?Z1E\u0013=@2N\u001d.\u0001+Q\u0018+Z;P\t/[;\u0001";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0011/J7@\u001d?Z1E\u0013=@2N\u001d.\u0001+Q\u0018+Z;R\b+Z;\u0001";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private s3() {
        this.d = new uo(this, null);
        this.c = new Stack();
        this.a = new Handler();
        this.b = new wx(this);
        this.d.setPriority(1);
        this.d.start();
    }

    public void b() {
        int i = App.az;
        synchronized (this.c) {
            Log.i(z[3] + this.c.size());
            int aY = App.aY();
            Collection arrayList = new ArrayList();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!App.a(aY, bVar)) {
                    arrayList.add(bVar);
                    continue;
                }
                if (i != 0) {
                    break;
                }
            }
            this.c.removeAll(arrayList);
        }
    }

    public void b(b bVar) {
        int i = App.az;
        synchronized (this.c) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                b bVar2 = (b) it.next();
                if (bVar.e.equals(bVar2.e)) {
                    Log.i(z[2] + bVar.t);
                    this.c.remove(bVar2);
                    if (i == 0) {
                        break;
                    }
                }
                if (i != 0) {
                    break;
                }
            }
        }
    }

    public static synchronized s3 a() {
        s3 s3Var;
        synchronized (s3.class) {
            if (f == null) {
                f = new s3();
            }
            s3Var = f;
        }
        return s3Var;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r7) {
        /*
        r6_this = this;
        r1 = r6.c;
        monitor-enter(r1);
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x003f }
        r0.<init>();	 Catch:{ all -> 0x003f }
        r2 = z;	 Catch:{ all -> 0x003f }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ all -> 0x003f }
        r0 = r0.append(r2);	 Catch:{ all -> 0x003f }
        r0 = r0.append(r7);	 Catch:{ all -> 0x003f }
        r0 = r0.toString();	 Catch:{ all -> 0x003f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x003f }
        if (r7 == 0) goto L_0x0032;
    L_0x001e:
        r0 = r6.a;	 Catch:{ all -> 0x003f }
        r2 = r6.b;	 Catch:{ all -> 0x003f }
        r0.removeCallbacks(r2);	 Catch:{ all -> 0x003f }
        r0 = r6.a;	 Catch:{ all -> 0x003f }
        r2 = r6.b;	 Catch:{ all -> 0x003f }
        r4 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        r0.postDelayed(r2, r4);	 Catch:{ all -> 0x003f }
        r0 = com.whatsapp.App.az;	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x003b;
    L_0x0032:
        r0 = r6.e;	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x003b;
    L_0x0036:
        r0 = r6.c;	 Catch:{ all -> 0x003f }
        r0.notifyAll();	 Catch:{ all -> 0x003f }
    L_0x003b:
        r6.e = r7;	 Catch:{ all -> 0x003f }
        monitor-exit(r1);	 Catch:{ all -> 0x003f }
        return;
    L_0x003f:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003f }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.s3.a(boolean):void");
    }

    public void a(b bVar) {
        if (bVar.j == null || t7.a(bVar, true, null) != null) {
            synchronized (this.c) {
                Log.i(z[0] + bVar.t);
                this.c.add(bVar);
                if (!this.e) {
                    this.c.notifyAll();
                }
            }
        }
    }

    static Stack a(s3 s3Var) {
        return s3Var.c;
    }
}
