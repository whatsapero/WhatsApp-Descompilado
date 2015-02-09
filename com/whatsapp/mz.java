package com.whatsapp;

import com.whatsapp.protocol.b9;
import com.whatsapp.protocol.cd;
import com.whatsapp.protocol.cs;
import com.whatsapp.util.Log;
import java.util.Timer;
import java.util.Vector;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class mz implements cd, cs, Runnable {
    private static Timer g;
    private static final String[] z;
    public int a;
    public Vector b;
    public boolean c;
    public String d;
    public b9 e;
    private al2 f;
    private boolean h;
    public String i;

    static void a(mz mzVar) {
        mzVar.b();
    }

    static boolean b(mz mzVar) {
        return mzVar.h;
    }

    public mz(String str, String str2, Vector vector, int i, b9 b9Var) {
        this(str, str2, vector, i);
        this.e = b9Var;
    }

    public void run() {
        this.f.cancel();
        Log.i(z[4] + this.a);
        a();
    }

    public void a(String str) {
        this.f.cancel();
        this.h = true;
        Log.i(z[5] + str + z[6] + this.a);
        App.a(this.d, false);
        a();
    }

    public mz(String str, String str2, Vector vector, int i) {
        boolean z = false;
        this.c = false;
        this.h = false;
        if (str != null) {
            z = true;
        }
        Log.b(z);
        this.d = str;
        this.i = str2;
        this.b = vector;
        this.a = i;
        this.f = new al2(this);
        g.schedule(this.f, 20000);
    }

    static {
        String[] strArr = new String[7];
        String str = "\u0010]Fa.\u001aH[;9\u0005@\\d\u0001\u0005JXa;\u0004[\u0006`7\u001aJFa*X[Pd;M";
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
                        i3 = 119;
                        break;
                    case ay.f /*1*/:
                        i3 = 47;
                        break;
                    case ay.n /*2*/:
                        i3 = 41;
                        break;
                    case ay.p /*3*/:
                        i3 = 20;
                        break;
                    default:
                        i3 = 94;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "WS\t";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0010]Fa.\u001aH[;,\u0012^\\q-\u0003\u000fOu7\u001bJM4dW";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0010]Fa.\u001aH[;,\u0012^\\q-\u0003\u000fZa=\u0014JZgq";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0010]Fa.\u001aH[;,\u0012^\\q-\u0003\u000fZa=\u0014JZg~M\u000f";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "WS\t";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    g = new Timer();
                default:
                    strArr2[i] = str;
                    str = "WS\t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r8) {
        /*
        r7_this = this;
        r6 = 3;
        r5 = 0;
        r0 = com.whatsapp.App.az;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r6];
        r1 = r1.append(r2);
        r1 = r1.append(r8);
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r7.d;
        r1 = r1.append(r2);
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r7.a;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        r1 = r7.f;
        r1.cancel();
        r1 = r7.a;
        switch(r1) {
            case 12: goto L_0x004e;
            case 13: goto L_0x0073;
            case 14: goto L_0x0091;
            case 15: goto L_0x0069;
            case 28: goto L_0x007d;
            case 88: goto L_0x0087;
            case 89: goto L_0x0087;
            case 90: goto L_0x009b;
            default: goto L_0x0044;
        };
    L_0x0044:
        r0 = r7.d;
        r1 = 0;
        com.whatsapp.App.a(r0, r1);
        r7.a();
        return;
    L_0x004e:
        switch(r8) {
            case 406: goto L_0x00aa;
            case 500: goto L_0x00a1;
            default: goto L_0x0051;
        };
    L_0x0051:
        r1 = 11;
        r2 = r7.i;
        com.whatsapp.bd.a(r1, r2);
    L_0x0058:
        r1 = com.whatsapp.App.aJ;
        r2 = r7.d;
        r3 = r7.i;
        r4 = r7.b;
        r2 = com.whatsapp.bd.a(r2, r3, r4, r6);
        r1.f(r2);
        if (r0 == 0) goto L_0x0044;
    L_0x0069:
        switch(r8) {
            case 401: goto L_0x00b4;
            case 402: goto L_0x006c;
            case 403: goto L_0x00bb;
            case 404: goto L_0x00c2;
            case 405: goto L_0x006c;
            case 406: goto L_0x00c9;
            default: goto L_0x006c;
        };
    L_0x006c:
        r1 = 14;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x0073:
        switch(r8) {
            case 401: goto L_0x00d3;
            case 402: goto L_0x0076;
            case 403: goto L_0x00da;
            case 404: goto L_0x00e1;
            default: goto L_0x0076;
        };
    L_0x0076:
        r1 = 19;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x007d:
        switch(r8) {
            case 401: goto L_0x00e9;
            case 402: goto L_0x0080;
            case 403: goto L_0x00f0;
            case 404: goto L_0x00f7;
            default: goto L_0x0080;
        };
    L_0x0080:
        r1 = 23;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x0087:
        switch(r8) {
            case 401: goto L_0x00ff;
            case 402: goto L_0x008a;
            case 403: goto L_0x0106;
            case 404: goto L_0x010d;
            default: goto L_0x008a;
        };
    L_0x008a:
        r1 = 27;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x0091:
        switch(r8) {
            case 403: goto L_0x0116;
            case 404: goto L_0x011d;
            default: goto L_0x0094;
        };
    L_0x0094:
        r1 = 31;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x009b:
        r0 = 34;
        com.whatsapp.bd.a(r0, r5);
        goto L_0x0044;
    L_0x00a1:
        r1 = 12;
        r2 = r7.i;
        com.whatsapp.bd.a(r1, r2);
        if (r0 == 0) goto L_0x0058;
    L_0x00aa:
        r1 = 13;
        r2 = r7.i;
        com.whatsapp.bd.a(r1, r2);
        if (r0 == 0) goto L_0x0058;
    L_0x00b3:
        goto L_0x0051;
    L_0x00b4:
        r1 = 15;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x00bb:
        r1 = 16;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x00c2:
        r1 = 17;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x00c9:
        r1 = 18;
        r2 = r7.i;
        com.whatsapp.bd.a(r1, r2);
        if (r0 == 0) goto L_0x0044;
    L_0x00d2:
        goto L_0x006c;
    L_0x00d3:
        r1 = 20;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x00da:
        r1 = 21;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x00e1:
        r1 = 22;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x00e8:
        goto L_0x0076;
    L_0x00e9:
        r1 = 24;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x00f0:
        r1 = 25;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x00f7:
        r1 = 26;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x00fe:
        goto L_0x0080;
    L_0x00ff:
        r1 = 28;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x0106:
        r1 = 29;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x010d:
        r1 = 30;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x0114:
        goto L_0x008a;
    L_0x0116:
        r1 = 32;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x011d:
        r1 = 33;
        com.whatsapp.bd.a(r1, r5);
        if (r0 == 0) goto L_0x0044;
    L_0x0124:
        goto L_0x0094;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mz.a(int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r7_this = this;
        r6 = 0;
        r0 = com.whatsapp.App.az;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r6];
        r1 = r1.append(r2);
        r2 = r7.a;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = 1;
        r7.c = r1;
        r1 = r7.a;
        switch(r1) {
            case 12: goto L_0x002e;
            case 13: goto L_0x0040;
            case 14: goto L_0x0062;
            case 28: goto L_0x0048;
            case 88: goto L_0x0050;
            case 89: goto L_0x0059;
            case 90: goto L_0x006a;
            default: goto L_0x0025;
        };
    L_0x0025:
        r0 = r7.d;
        com.whatsapp.App.a(r0, r6);
        r7.a();
        return;
    L_0x002e:
        r1 = com.whatsapp.App.aJ;
        r2 = r7.d;
        r3 = r7.i;
        r4 = r7.b;
        r5 = 3;
        r2 = com.whatsapp.bd.a(r2, r3, r4, r5);
        r1.f(r2);
        if (r0 == 0) goto L_0x0025;
    L_0x0040:
        r1 = 6;
        r2 = r7.d;
        com.whatsapp.bd.a(r1, r2);
        if (r0 == 0) goto L_0x0025;
    L_0x0048:
        r1 = 7;
        r2 = r7.d;
        com.whatsapp.bd.a(r1, r2);
        if (r0 == 0) goto L_0x0025;
    L_0x0050:
        r1 = 9;
        r2 = r7.d;
        com.whatsapp.bd.a(r1, r2);
        if (r0 == 0) goto L_0x0025;
    L_0x0059:
        r1 = 10;
        r2 = r7.d;
        com.whatsapp.bd.a(r1, r2);
        if (r0 == 0) goto L_0x0025;
    L_0x0062:
        r1 = 5;
        r2 = r7.d;
        com.whatsapp.bd.a(r1, r2);
        if (r0 == 0) goto L_0x0025;
    L_0x006a:
        r0 = 8;
        r1 = r7.d;
        com.whatsapp.bd.a(r0, r1);
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mz.b():void");
    }

    public void a() {
    }
}
