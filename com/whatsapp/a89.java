package com.whatsapp;

import android.os.Handler;
import com.whatsapp.fieldstats.al;
import com.whatsapp.fieldstats.o;
import com.whatsapp.fieldstats.t;
import com.whatsapp.protocol.b9;
import com.whatsapp.protocol.cd;
import com.whatsapp.protocol.cs;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Timer;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class a89 extends a8o implements cd, cs {
    private static HashMap h;
    public static Handler n;
    private static final String[] z;
    private long f;
    public boolean g;
    public boolean i;
    private Long j;
    public b9 k;
    private a_f l;
    private boolean m;

    public void a(int i) {
        Log.i(z[2] + i + z[3] + this.c);
        this.m = true;
        this.l.cancel();
        h.remove(this.j.toString());
        a(t.ERROR_UNKNOWN);
        if (!this.i) {
            m8 a = App.P.a(this.c);
            try {
                if (i == 401 && a != null) {
                    try {
                        if (a.w()) {
                            if (!bd.f(a.e)) {
                                n.obtainMessage(3, i, 0, this.c).sendToTarget();
                                if (App.az == 0) {
                                    return;
                                }
                            }
                        }
                    } catch (NumberFormatException e) {
                        throw e;
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
                n.obtainMessage(2, i, 0, this.c).sendToTarget();
            } catch (NumberFormatException e22) {
                throw e22;
            }
        }
    }

    public void a(java.lang.String r5) {
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
        r4_this = this;
        r3 = 1;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r5);
        r1 = z;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r4.c;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r4.m = r3;
        r0 = r4.l;
        r0.cancel();
        r0 = h;
        r1 = r4.j;
        r1 = r1.toString();
        r0.remove(r1);
        r0 = com.whatsapp.fieldstats.t.OK;
        r4.a(r0);
        r0 = com.whatsapp.App.P;
        r1 = r4.c;
        r1 = r0.a(r1);
        if (r1 == 0) goto L_0x0077;
    L_0x0049:
        if (r5 != 0) goto L_0x0078;
    L_0x004b:
        r0 = -1;
    L_0x004c:
        r1.a(r0, r0);	 Catch:{ NumberFormatException -> 0x0085 }
    L_0x004f:
        r0 = r4.i;	 Catch:{ NumberFormatException -> 0x007d }
        if (r0 != 0) goto L_0x0077;
    L_0x0053:
        r0 = r4.e;	 Catch:{ NumberFormatException -> 0x007f }
        if (r0 != 0) goto L_0x0062;
    L_0x0057:
        r0 = r4.d;	 Catch:{ NumberFormatException -> 0x0081 }
        if (r0 != 0) goto L_0x0062;
    L_0x005b:
        r1.v();	 Catch:{ NumberFormatException -> 0x0083 }
        r0 = com.whatsapp.App.az;	 Catch:{ NumberFormatException -> 0x0083 }
        if (r0 == 0) goto L_0x0069;	 Catch:{ NumberFormatException -> 0x0083 }
    L_0x0062:
        r0 = r4.e;	 Catch:{ NumberFormatException -> 0x0083 }
        r2 = r4.d;	 Catch:{ NumberFormatException -> 0x0083 }
        r1.a(r0, r2);	 Catch:{ NumberFormatException -> 0x0083 }
    L_0x0069:
        r1.c();
        r0 = n;
        r1 = r4.c;
        r0 = r0.obtainMessage(r3, r1);
        r0.sendToTarget();
    L_0x0077:
        return;
    L_0x0078:
        r0 = java.lang.Integer.parseInt(r5);	 Catch:{ NumberFormatException -> 0x0085 }
        goto L_0x004c;
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        throw r0;
    L_0x0085:
        r0 = move-exception;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a89.a(java.lang.String):void");
    }

    public static boolean a(String str) {
        int i = App.az;
        if (str == null) {
            return false;
        }
        for (a89 com_whatsapp_a89 : h.values()) {
            try {
                if (!str.equals(com_whatsapp_a89.c)) {
                    if (i != 0) {
                        break;
                    }
                }
                return true;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return false;
    }

    public a89(String str, byte[] bArr, byte[] bArr2) {
        super(str, bArr, bArr2, 0);
        this.g = false;
        this.m = false;
        this.j = Long.valueOf(System.currentTimeMillis());
        h.put(this.j.toString(), this);
        this.f = System.currentTimeMillis();
        this.l = new a_f(this);
        new Timer().schedule(this.l, 32000);
    }

    static Long b(a89 com_whatsapp_a89) {
        return com_whatsapp_a89.j;
    }

    static void a(a89 com_whatsapp_a89, t tVar) {
        com_whatsapp_a89.a(tVar);
    }

    public a89(String str, byte[] bArr, byte[] bArr2, b9 b9Var) {
        this(str, bArr, bArr2);
        this.k = b9Var;
    }

    static {
        String[] strArr = new String[4];
        String str = "n\u0017mj\u0017r\u0000rd\u0011j\njm\u0010z\tg~Ql\u0000sy\u001bm\u0011\"\u007f\u000b}\u0006g\u007f\r>_\"";
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
                        i3 = 30;
                        break;
                    case ay.f /*1*/:
                        i3 = 101;
                        break;
                    case ay.n /*2*/:
                        i3 = 2;
                        break;
                    case ay.p /*3*/:
                        i3 = 12;
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
                    str = "n\u0017mj\u0017r\u0000rd\u0011j\njm\u0010z\tg~Ql\u0000sy\u001bm\u0011\"j\u001fw\tgh^$E";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = ">\u0019\"";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    h = new HashMap();
                    n = new zq();
                default:
                    strArr2[i] = str;
                    str = ">\u0019\"";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void a(t tVar) {
        int i = 0;
        c oVar = new o();
        try {
            int i2;
            if (this.e == null) {
                i2 = 0;
            } else {
                i2 = this.e.length;
            }
            try {
                if (this.d != null) {
                    i = this.d.length;
                }
                oVar.a = Double.valueOf((double) (i + i2));
                oVar.b = Double.valueOf((double) (System.currentTimeMillis() - this.f));
                oVar.c = Double.valueOf((double) tVar.getCode());
                al.a(App.p, oVar);
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static boolean a(a89 com_whatsapp_a89) {
        return com_whatsapp_a89.m;
    }

    static HashMap a() {
        return h;
    }
}
