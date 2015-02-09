package com.whatsapp;

import android.app.Activity;
import com.whatsapp.protocol.cd;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Timer;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class hm implements cd, Runnable {
    private static Timer e;
    public static HashMap k;
    private static final String[] z;
    private Runnable a;
    public Activity b;
    public boolean c;
    public boolean d;
    public boolean f;
    public String g;
    public Long h;
    private a1r i;
    public Hashtable j;
    private Runnable l;
    public int m;

    static {
        String[] strArr = new String[4];
        String str = "{\u001dxsn}\u0014Idym\rsehC\u000bcu\u007fy\u000be9";
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
                        i3 = 28;
                        break;
                    case ay.f /*1*/:
                        i3 = 120;
                        break;
                    case ay.n /*2*/:
                        i3 = 22;
                        break;
                    case ay.p /*3*/:
                        i3 = 22;
                        break;
                    default:
                        i3 = 28;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "{\u001dxsn}\u0014Idym\rsehC\u001ew\u007fpy\u001c6,<";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "<\u00046";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    k = new HashMap();
                    e = new Timer();
                default:
                    strArr2[i] = str;
                    str = "<\u00046";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void a() {
        hm hmVar;
        if (this.g == null) {
            hmVar = (hm) k.remove(this.h);
        } else {
            hmVar = (hm) k.remove(this.g);
        }
        if (hmVar != null) {
            hmVar.i.cancel();
        }
    }

    public void a(int i) {
        Log.i(z[2] + i + z[3] + this.g + z[1] + this.m);
        switch (this.m) {
        }
        a();
        App.p.U().post(this.a);
    }

    static Runnable a(hm hmVar) {
        return hmVar.l;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hm(android.app.Activity r5, java.lang.String r6, int r7, java.util.Hashtable r8, boolean r9) {
        /*
        r4_this = this;
        r0 = 0;
        r4.<init>();
        r4.d = r0;
        r4.c = r0;
        r4.f = r0;
        r0 = new com.whatsapp.wm;
        r0.<init>(r4);
        r4.l = r0;
        r0 = new com.whatsapp.ph;
        r0.<init>(r4);
        r4.a = r0;
        r4.g = r6;
        r4.b = r5;
        r4.m = r7;
        r4.d = r9;
        r4.j = r8;
        if (r6 != 0) goto L_0x004c;
    L_0x0024:
        r0 = java.lang.System.currentTimeMillis();
        r0 = java.lang.Long.valueOf(r0);
        r4.h = r0;
        r0 = k;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "";
        r1 = r1.append(r2);
        r2 = r4.h;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.put(r1, r4);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0051;
    L_0x004c:
        r0 = k;
        r0.put(r6, r4);
    L_0x0051:
        r0 = 2;
        if (r7 != r0) goto L_0x0064;
    L_0x0054:
        r0 = new com.whatsapp.a1r;
        r0.<init>(r4);
        r4.i = r0;
        r0 = e;
        r1 = r4.i;
        r2 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r0.schedule(r1, r2);
    L_0x0064:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.hm.<init>(android.app.Activity, java.lang.String, int, java.util.Hashtable, boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r3_this = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r3.m;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = 1;
        r3.f = r0;
        r0 = r3.m;
        r1 = 2;
        if (r0 != r1) goto L_0x003b;
    L_0x0023:
        r0 = r3.d;
        if (r0 == 0) goto L_0x0034;
    L_0x0027:
        r0 = com.whatsapp.App.at;
        r1 = r3.g;
        r2 = r3.g;
        r0.put(r1, r2);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x003b;
    L_0x0034:
        r0 = com.whatsapp.App.at;
        r1 = r3.g;
        r0.remove(r1);
    L_0x003b:
        r3.a();
        r0 = com.whatsapp.App.p;
        r0 = r0.U();
        r1 = r3.a;
        r0.post(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.hm.run():void");
    }
}
