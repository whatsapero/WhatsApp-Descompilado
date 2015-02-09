package com.whatsapp;

import android.os.Handler.Callback;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class v1 implements Callback {
    private static final String z;
    final VoiceService a;

    static {
        char[] toCharArray = "/.t+\u0015)$o2U=(~:V\f1y:N<\t|5^5$o{M<a|)_y/r/\u001a0/=:Ty ~/S/$=8[5-".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 89;
                    break;
                case ay.f /*1*/:
                    i2 = 65;
                    break;
                case ay.n /*2*/:
                    i2 = 29;
                    break;
                case ay.p /*3*/:
                    i2 = 91;
                    break;
                default:
                    i2 = 58;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r9) {
        /*
        r8_this = this;
        r3 = 1;
        r4 = 0;
        r5 = com.whatsapp.Voip.getCallInfo();
        if (r5 == 0) goto L_0x0043;
    L_0x0008:
        r0 = r5.getCallState();
        r1 = com.whatsapp.Voip.CallState.ACTIVE;
        if (r0 != r1) goto L_0x0054;
    L_0x0010:
        r2 = r3;
    L_0x0011:
        r0 = 0;
        if (r2 == 0) goto L_0x0028;
    L_0x0015:
        com.whatsapp.Voip.checkStreamStatistics();
        r0 = java.lang.System.currentTimeMillis();
        r6 = r5.getCallActiveTime();
        r0 = r0 - r6;
        r5 = r5.getPeerId();
        com.whatsapp.App.a(r5, r0);
    L_0x0028:
        r5 = r8.a;
        r5 = com.whatsapp.VoiceService.m(r5);
        if (r5 == 0) goto L_0x003f;
    L_0x0030:
        r5 = r8.a;
        r5 = com.whatsapp.VoiceService.m(r5);
        r6 = r8.a;
        r6 = com.whatsapp.VoiceService.k(r6);
        r5.a(r2, r0, r6);
    L_0x003f:
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0048;
    L_0x0043:
        r0 = z;
        com.whatsapp.util.Log.e(r0);
    L_0x0048:
        r0 = r8.a;
        r0 = com.whatsapp.VoiceService.l(r0);
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.sendEmptyMessageDelayed(r4, r6);
        return r3;
    L_0x0054:
        r2 = r4;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.v1.handleMessage(android.os.Message):boolean");
    }

    v1(VoiceService voiceService) {
        this.a = voiceService;
    }
}
