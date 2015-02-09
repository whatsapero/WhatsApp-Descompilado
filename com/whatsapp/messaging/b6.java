package com.whatsapp.messaging;

import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class b6 implements OnClickListener {
    private static final String[] z;
    final String a;
    final CaptivePortalActivity b;
    final int c;

    static {
        String[] strArr = new String[9];
        String str = "DG\t&]\u0000\t";
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
                        i3 = 100;
                        break;
                    case ay.f /*1*/:
                        i3 = 41;
                        break;
                    case ay.n /*2*/:
                        i3 = 104;
                        break;
                    case ay.p /*3*/:
                        i3 = 75;
                        break;
                    default:
                        i3 = 56;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0016L\u0005$N\u0001\t\u0006.L\u0013F\u001a \u0018\u0002H\u0001']\u0000\t\u000e$JD^\u0001-QDG\r?O\u000b[\u0003k";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "DG\t&]\u0000\t";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0017H\u001e.\u0018\u0007F\u0006-Q\u0003\\\u001a*L\rF\u0006k^\u0005@\u0004.\\DO\u00079\u0018\u0013@\u000e\"\u0018\nL\u001c<W\u0016BH";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0013@\u000e\"";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0002F\u001a,]\u0010]\u0001%_D^\u0001-QDG\r?O\u000b[\u0003k";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "DG\t&]\u0000\t";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0002H\u0001']\u0000\t\u001c$\u0018\u0000@\u001b(W\nG\r(LDO\u001a$UD^\u0001-QDG\r?O\u000b[\u0003k";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "DG\t&]\u0000\t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    b6(CaptivePortalActivity captivePortalActivity, int i, String str) {
        this.b = captivePortalActivity;
        this.c = i;
        this.a = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r5) {
        /*
        r4_this = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r4.c;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r4.a;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r4.b;
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r0 = r0.getSystemService(r1);
        r0 = (android.net.wifi.WifiManager) r0;
        r1 = r4.c;
        r1 = r0.removeNetwork(r1);
        if (r1 != 0) goto L_0x006d;
    L_0x003f:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r4.c;
        r1 = r1.append(r2);
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r4.a;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        r1 = com.whatsapp.messaging.au.a;
        if (r1 == 0) goto L_0x009d;
    L_0x006d:
        r1 = r0.saveConfiguration();
        if (r1 != 0) goto L_0x009d;
    L_0x0073:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r4.c;
        r1 = r1.append(r2);
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r4.a;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
    L_0x009d:
        r0 = r0.disconnect();
        if (r0 != 0) goto L_0x00ce;
    L_0x00a3:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r4.c;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r4.a;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
    L_0x00ce:
        r0 = r4.b;
        r0.finish();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.b6.onClick(android.view.View):void");
    }
}
