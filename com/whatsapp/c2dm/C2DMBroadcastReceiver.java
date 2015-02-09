package com.whatsapp.c2dm;

import android.content.BroadcastReceiver;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class C2DMBroadcastReceiver extends BroadcastReceiver {
    private static final String z;

    static {
        char[] toCharArray = "h|9#kd|3ai%r:i~dz0#o9w9#eeg1cx%A\u0011NIBE\u0011".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 11;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 84;
                    break;
                case ay.p /*3*/:
                    i2 = 13;
                    break;
                default:
                    i2 = 12;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r4, android.content.Intent r5) {
        /*
        r3_this = this;
        r2 = 0;
        r0 = r5.getAction();
        r1 = z;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0014;
    L_0x000d:
        com.whatsapp.c2dm.b.a(r4, r5);
        r0 = com.whatsapp.c2dm.C2DMRegistrar.c;
        if (r0 == 0) goto L_0x0017;
    L_0x0014:
        com.whatsapp.c2dm.C2DMRegistrar.a(r4, r5);
    L_0x0017:
        r0 = -1;
        r3.setResult(r0, r2, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.c2dm.C2DMBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
