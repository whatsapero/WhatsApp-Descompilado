package com.whatsapp;

import com.whatsapp.protocol.b2;
import com.whatsapp.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class b6 implements b2 {
    private static final String[] z;
    public String a;
    public long b;
    final avq c;
    public String d;
    public String e;
    public String f;

    static {
        String[] strArr = new String[8];
        String str = "[#'^xC6/XxRi,Y|D4,E9";
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
                        i3 = 54;
                        break;
                    case ay.f /*1*/:
                        i3 = 70;
                        break;
                    case ay.n /*2*/:
                        i3 = 67;
                        break;
                    case ay.p /*3*/:
                        i3 = 55;
                        break;
                    default:
                        i3 = 25;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "[#'^xC6/XxRi,Y}C6/^zW2&\u0017wC*/\u0017";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "P4,Z";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "B)";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "[#'^xC6/XxRi.VuP)1Z|R31[|N%&Gm_)-\u0017";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "v5m@qW20ViFh-Rm";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "[#'^xC6/XxRi,YlF*,V}\u0016";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "[#'^xC6/XxRi,Y}C6/^zW2&\u0017";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.cm r5) {
        /*
        r4_this = this;
        r0 = 1;
        if (r5 == 0) goto L_0x0049;
    L_0x0003:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r0];
        r1 = r1.append(r2);
        r2 = r5.a;
        r1 = r1.append(r2);
        r2 = " ";
        r1 = r1.append(r2);
        r2 = r5.b;
        r1 = r1.append(r2);
        r2 = " ";
        r1 = r1.append(r2);
        r2 = r5.d;
        r1 = r1.append(r2);
        r2 = " ";
        r1 = r1.append(r2);
        r2 = r4.c;
        r2 = r2.k;
        r2 = r2.e;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0068;
    L_0x0049:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r4.c;
        r2 = r2.k;
        r2 = r2.e;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
    L_0x0068:
        r1 = r4.c;
        r1 = com.whatsapp.avq.b(r1);
        r1.cancel();
        r1 = r4.c;
        r1.n = r5;
        r1 = r4.c;
        com.whatsapp.avq.a(r1, r0);
        r1 = r4.c;
        if (r5 == 0) goto L_0x0084;
    L_0x007e:
        r1.d = r0;
        r4.b();
        return;
    L_0x0084:
        r0 = 0;
        goto L_0x007e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.b6.a(com.whatsapp.protocol.cm):void");
    }

    public void a(String str, String str2, int i) {
        Log.i(z[7] + str + " " + str2 + " " + i + " " + this.c.k.e);
        avq.b(this.c).cancel();
        try {
            avq.a(this.c, new va(new URL(App.w(str)), this.c.i(), i, this.c.e(), new zl(this)));
            avq.a(this.c).a(z[3], App.an.jabber_id + z[6]);
            avq.a(this.c).a(z[4], this.c.k.e.c);
            b();
        } catch (MalformedURLException e) {
            Log.e(z[5] + e.toString());
            a();
        }
    }

    private void b() {
        App.p.U().post(new akf(this));
    }

    public b6(avq com_whatsapp_avq) {
        this.c = com_whatsapp_avq;
    }

    public void a(int i) {
        Log.w(z[0] + i + " " + this.c.k.e);
        avq.b(this.c).cancel();
        a();
    }

    private void a() {
        App.p.U().post(new c1(this));
    }
}
