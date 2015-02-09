package com.whatsapp;

import android.os.Handler.Callback;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class e0 implements Callback {
    private static final String[] z;
    final VoiceService a;

    static {
        String[] strArr = new String[4];
        String str = "\u0000\u0012ez\u0000\u0015\u001c`f\u0000\u0017\u001eoo_\u0002\u0018h'M\u0003\t!d@\u0002Pmi[\u001f\u000bi'[\u001f\u0010ieZ\u0002";
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
                        i3 = 118;
                        break;
                    case ay.f /*1*/:
                        i3 = 125;
                        break;
                    case ay.n /*2*/:
                        i3 = 12;
                        break;
                    case ay.p /*3*/:
                        i3 = 10;
                        break;
                    default:
                        i3 = 47;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0000\u0012ez\u0000\u0015\u001c`f{\u001f\u0010ieZ\u00025mdK\u001a\u0018~*X\u0013]mxJV\u0013c~\u000f\u001f\u0013,kAV\u001co~F\u0000\u0018,iN\u001a\u0011";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0000\u0012ez\u0000\u0015\u001c`f\u0000\u0017\u001eoo_\u0002\u0018h'M\u0003\t!d@\u0002Pmi[\u001f\u000bi'[\u001f\u0010ieZ\u0002";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0000\u0012ez\u0000\u0015\u001c`f\u0000\u0018\u0012x'N\u0015\u001eiz[[\tegJ\u0019\bx";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r5) {
        /*
        r4_this = this;
        r0 = 0;
        r1 = 1;
        r2 = com.whatsapp.Voip.f();
        if (r2 != 0) goto L_0x0011;
    L_0x0008:
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        com.whatsapp.util.Log.e(r1);
    L_0x0010:
        return r0;
    L_0x0011:
        r2 = r5.what;
        switch(r2) {
            case 0: goto L_0x0017;
            case 1: goto L_0x0036;
            case 2: goto L_0x0045;
            default: goto L_0x0016;
        };
    L_0x0016:
        goto L_0x0010;
    L_0x0017:
        r0 = z;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.Voip.getCurrentCallState();
        r2 = com.whatsapp.Voip.CallState.RECEIVED_CALL;
        if (r0 != r2) goto L_0x002f;
    L_0x0026:
        r0 = r4.a;
        r0.a();
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r0 = r4.a;
        r0.v();
    L_0x0034:
        r0 = r1;
        goto L_0x0010;
    L_0x0036:
        r0 = z;
        r2 = 3;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r4.a;
        r0.v();
        r0 = r1;
        goto L_0x0010;
    L_0x0045:
        r2 = z;
        r0 = r2[r0];
        com.whatsapp.util.Log.i(r0);
        r0 = r4.a;
        r2 = r4.a;
        r3 = 2131625086; // 0x7f0e047e float:1.887737E38 double:1.053162725E-314;
        r2 = r2.getString(r3);
        r0.b(r2);
        r0 = r1;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.e0.handleMessage(android.os.Message):boolean");
    }

    e0(VoiceService voiceService) {
        this.a = voiceService;
    }
}
