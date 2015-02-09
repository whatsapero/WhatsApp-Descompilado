package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class x_ extends AsyncTask {
    private static final String z;

    static {
        char[] toCharArray = "$\u0013~)d+\u0010khe(\u0006}up\"\u0006})r*\u0016`r1".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 69;
                    break;
                case ay.f /*1*/:
                    i2 = 99;
                    break;
                case ay.n /*2*/:
                    i2 = 14;
                    break;
                case ay.p /*3*/:
                    i2 = 6;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    x_() {
    }

    protected ArrayList a(Void[] voidArr) {
        boolean z = true;
        l7 l7Var = App.aJ;
        if (App.aY() != 1) {
            z = false;
        }
        ArrayList c = l7Var.c(z);
        Log.i(z + c.size());
        return c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(java.util.ArrayList r7) {
        /*
        r6_this = this;
        r5 = 2;
        r2 = com.whatsapp.App.az;
        r3 = r7.iterator();
    L_0x0007:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x004b;
    L_0x000d:
        r0 = r3.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r1 = r0.j;
        r4 = 1;
        if (r1 == r4) goto L_0x0021;
    L_0x0018:
        r1 = r0.j;
        if (r1 == r5) goto L_0x0021;
    L_0x001c:
        r1 = r0.j;
        r4 = 3;
        if (r1 != r4) goto L_0x0046;
    L_0x0021:
        r1 = r0.A;
        r1 = (com.whatsapp.MediaData) r1;
        r4 = r0.t;
        if (r4 == 0) goto L_0x0034;
    L_0x0029:
        if (r1 == 0) goto L_0x002f;
    L_0x002b:
        r1 = r1.file;
        if (r1 != 0) goto L_0x0034;
    L_0x002f:
        com.whatsapp.App.j(r0);
        if (r2 == 0) goto L_0x0044;
    L_0x0034:
        r1 = r0.a;
        r1 = com.whatsapp.protocol.f.a(r1, r5);
        if (r1 >= 0) goto L_0x0041;
    L_0x003c:
        com.whatsapp.App.e(r0);
        if (r2 == 0) goto L_0x0044;
    L_0x0041:
        com.whatsapp.App.j(r0);
    L_0x0044:
        if (r2 == 0) goto L_0x0049;
    L_0x0046:
        com.whatsapp.App.j(r0);
    L_0x0049:
        if (r2 == 0) goto L_0x0007;
    L_0x004b:
        com.whatsapp.App.aL();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.x_.a(java.util.ArrayList):void");
    }

    protected void onPostExecute(Object obj) {
        a((ArrayList) obj);
    }
}
