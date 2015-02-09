package com.whatsapp;

import android.os.Handler;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class _u extends Handler {
    private static final String[] z;

    static {
        String[] strArr = new String[8];
        String str = "T{\"\b\u0001^n?R\u0019Rg)\u0011\u0014ln?\u0012\u0004Cj%\u001c\u0005lz8\u001f\u001bVj9\"\u0012[h#\u001a\u0014";
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
                        i3 = 51;
                        break;
                    case ay.f /*1*/:
                        i3 = 9;
                        break;
                    case ay.n /*2*/:
                        i3 = 77;
                        break;
                    case ay.p /*3*/:
                        i3 = 125;
                        break;
                    default:
                        i3 = 113;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "T{\"\b\u0001^n?R\u0019Rg)\u0011\u0014lh)\u0019.T{\"\b\u0001Pa,\t.^z*";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "T{\"\b\u0001^n?R\u0010Wm`\r\u0010A}$\u001e\u0018Ch#\t^V{?\u0012\u0003\u001c";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "T{\"\b\u0001^n?R\u0019Rg)\u0011\u0014\u001e`#\u0014\u0005\u001en?\u0012\u0004C$.\u0015\u0010G";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "T{\"\b\u0001^n?R\u0003Vd\"\u000b\u0014\u001ey,\u000f\u0005Zj$\r\u0010]}b\u0018\u0003Af?R";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "T{\"\b\u0001^n?R\u0010Wm`\u001c\u0015^`#\u000e^V{?\u0012\u0003\u001c";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "T{\"\b\u0001^n?R\u0003Vd\"\u000b\u0014\u001eh)\u0010\u0018]zb\u0018\u0003Af?R";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "T{\"\b\u0001^n?R\u0012\\g;\u0018\u0003@h9\u0014\u001e]zb\u0011\u0014R\u007f(]\u0016Af8\r";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    _u() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r14) {
        /*
        r13_this = this;
        r7 = 2131624319; // 0x7f0e017f float:1.8875814E38 double:1.053162346E-314;
        r12 = 2131624292; // 0x7f0e0164 float:1.887576E38 double:1.0531623325E-314;
        r11 = 2131624272; // 0x7f0e0150 float:1.887572E38 double:1.0531623226E-314;
        r10 = 1;
        r9 = 0;
        r1 = com.whatsapp.App.az;
        r0 = r14.what;
        switch(r0) {
            case 0: goto L_0x0013;
            case 1: goto L_0x0026;
            case 2: goto L_0x0040;
            case 3: goto L_0x0050;
            case 4: goto L_0x0069;
            case 5: goto L_0x0072;
            case 6: goto L_0x00ba;
            case 7: goto L_0x00d2;
            case 8: goto L_0x0096;
            case 9: goto L_0x00ed;
            case 10: goto L_0x0105;
            case 11: goto L_0x0120;
            case 12: goto L_0x0140;
            case 13: goto L_0x0160;
            case 14: goto L_0x0180;
            case 15: goto L_0x0198;
            case 16: goto L_0x01b0;
            case 17: goto L_0x01c8;
            case 18: goto L_0x01e0;
            case 19: goto L_0x0200;
            case 20: goto L_0x0218;
            case 21: goto L_0x0230;
            case 22: goto L_0x0248;
            case 23: goto L_0x0260;
            case 24: goto L_0x0278;
            case 25: goto L_0x0290;
            case 26: goto L_0x02a8;
            case 27: goto L_0x02c0;
            case 28: goto L_0x02d8;
            case 29: goto L_0x02f0;
            case 30: goto L_0x0308;
            case 31: goto L_0x0320;
            case 32: goto L_0x0338;
            case 33: goto L_0x0350;
            case 34: goto L_0x0368;
            case 35: goto L_0x0380;
            case 36: goto L_0x0401;
            case 37: goto L_0x0482;
            case 38: goto L_0x0503;
            default: goto L_0x0012;
        };
    L_0x0012:
        return;
    L_0x0013:
        r0 = z;
        r2 = 4;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r2 = com.whatsapp.App.aJ;
        r0 = r14.obj;
        r0 = (com.whatsapp.protocol.b) r0;
        r2.f(r0);
        if (r1 == 0) goto L_0x0012;
    L_0x0026:
        r0 = z;
        r2 = 2;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r14.obj;
        r0 = (com.whatsapp.protocol.b) r0;
        r2 = com.whatsapp.App.aJ;
        r2.f(r0);
        r0 = r0.e;
        r0 = r0.c;
        com.whatsapp.GroupChatInfo.e(r0);
        if (r1 == 0) goto L_0x0012;
    L_0x0040:
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        com.whatsapp.GroupChatInfo.e(r0);
        r0 = z;
        r0 = r0[r10];
        com.whatsapp.util.Log.i(r0);
        if (r1 == 0) goto L_0x0012;
    L_0x0050:
        r0 = z;
        r0 = r0[r9];
        com.whatsapp.util.Log.i(r0);
        r0 = r14.obj;
        r0 = (com.whatsapp.protocol.b) r0;
        r2 = com.whatsapp.App.aJ;
        r2.f(r0);
        r0 = r0.e;
        r0 = r0.c;
        com.whatsapp.GroupChatInfo.e(r0);
        if (r1 == 0) goto L_0x0012;
    L_0x0069:
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        com.whatsapp.GroupChatInfo.e(r0);
        if (r1 == 0) goto L_0x0012;
    L_0x0072:
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        r2 = com.whatsapp.App.p;
        r2 = r2.getApplicationContext();
        r3 = com.whatsapp.App.p;
        r4 = 2131624322; // 0x7f0e0182 float:1.887582E38 double:1.0531623473E-314;
        r5 = new java.lang.Object[r10];
        r6 = com.whatsapp.App.P;
        r0 = r6.f(r0);
        r0 = r0.N;
        r5[r9] = r0;
        r0 = r3.getString(r4, r5);
        com.whatsapp.App.a(r2, r0, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0096:
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        r2 = com.whatsapp.App.p;
        r2 = r2.getApplicationContext();
        r3 = com.whatsapp.App.p;
        r4 = 2131624322; // 0x7f0e0182 float:1.887582E38 double:1.0531623473E-314;
        r5 = new java.lang.Object[r10];
        r6 = com.whatsapp.App.P;
        r0 = r6.f(r0);
        r0 = r0.N;
        r5[r9] = r0;
        r0 = r3.getString(r4, r5);
        com.whatsapp.App.a(r2, r0, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x00ba:
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        com.whatsapp.GroupChatInfo.e(r0);
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getString(r7);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x00d2:
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        com.whatsapp.GroupChatInfo.e(r0);
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r3 = 2131624324; // 0x7f0e0184 float:1.8875824E38 double:1.0531623483E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x00ed:
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        com.whatsapp.GroupChatInfo.e(r0);
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getString(r7);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0105:
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        com.whatsapp.GroupChatInfo.e(r0);
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r3 = 2131624324; // 0x7f0e0184 float:1.8875824E38 double:1.0531623483E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0120:
        r0 = com.whatsapp.App.p;
        r2 = r0.getApplicationContext();
        r0 = com.whatsapp.App.p;
        r3 = r0.getResources();
        r4 = 2131624393; // 0x7f0e01c9 float:1.8875964E38 double:1.0531623824E-314;
        r5 = new java.lang.Object[r10];
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        r5[r9] = r0;
        r0 = r3.getString(r4, r5);
        com.whatsapp.App.b(r2, r0, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0140:
        r0 = com.whatsapp.App.p;
        r2 = r0.getApplicationContext();
        r0 = com.whatsapp.App.p;
        r3 = r0.getResources();
        r4 = 2131624395; // 0x7f0e01cb float:1.8875969E38 double:1.0531623834E-314;
        r5 = new java.lang.Object[r10];
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        r5[r9] = r0;
        r0 = r3.getString(r4, r5);
        com.whatsapp.App.b(r2, r0, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0160:
        r0 = com.whatsapp.App.p;
        r2 = r0.getApplicationContext();
        r0 = com.whatsapp.App.p;
        r3 = r0.getResources();
        r4 = 2131624394; // 0x7f0e01ca float:1.8875966E38 double:1.053162383E-314;
        r5 = new java.lang.Object[r10];
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        r5[r9] = r0;
        r0 = r3.getString(r4, r5);
        com.whatsapp.App.b(r2, r0, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0180:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624404; // 0x7f0e01d4 float:1.8875987E38 double:1.053162388E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0198:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624406; // 0x7f0e01d6 float:1.887599E38 double:1.053162389E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x01b0:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624407; // 0x7f0e01d7 float:1.8875993E38 double:1.0531623893E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x01c8:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624405; // 0x7f0e01d5 float:1.8875989E38 double:1.0531623883E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x01e0:
        r0 = com.whatsapp.App.p;
        r2 = r0.getApplicationContext();
        r0 = com.whatsapp.App.p;
        r3 = r0.getResources();
        r4 = 2131624408; // 0x7f0e01d8 float:1.8875995E38 double:1.05316239E-314;
        r5 = new java.lang.Object[r10];
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        r5[r9] = r0;
        r0 = r3.getString(r4, r5);
        com.whatsapp.App.b(r2, r0, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0200:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624385; // 0x7f0e01c1 float:1.8875948E38 double:1.0531623785E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0218:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624387; // 0x7f0e01c3 float:1.8875952E38 double:1.0531623795E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0230:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624388; // 0x7f0e01c4 float:1.8875954E38 double:1.05316238E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0248:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624386; // 0x7f0e01c2 float:1.887595E38 double:1.053162379E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0260:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624400; // 0x7f0e01d0 float:1.8875979E38 double:1.053162386E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0278:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624402; // 0x7f0e01d2 float:1.8875983E38 double:1.053162387E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0290:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624403; // 0x7f0e01d3 float:1.8875985E38 double:1.0531623874E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x02a8:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624401; // 0x7f0e01d1 float:1.887598E38 double:1.0531623864E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x02c0:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624389; // 0x7f0e01c5 float:1.8875956E38 double:1.0531623804E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x02d8:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624391; // 0x7f0e01c7 float:1.887596E38 double:1.0531623814E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x02f0:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624392; // 0x7f0e01c8 float:1.8875962E38 double:1.053162382E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0308:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624390; // 0x7f0e01c6 float:1.8875958E38 double:1.053162381E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0320:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624397; // 0x7f0e01cd float:1.8875973E38 double:1.0531623844E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0338:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624399; // 0x7f0e01cf float:1.8875977E38 double:1.0531623854E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0350:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624398; // 0x7f0e01ce float:1.8875975E38 double:1.053162385E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0368:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r3 = 2131624396; // 0x7f0e01cc float:1.887597E38 double:1.053162384E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0380:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r14.obj;
        r0 = (java.util.Hashtable) r0;
        r3 = r0.keySet();
        r3 = r3.iterator();
    L_0x0391:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x03f6;
    L_0x0397:
        r4 = r3.next();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 3;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r4);
        r6 = "/";
        r5 = r5.append(r6);
        r6 = r0.get(r4);
        r5 = r5.append(r6);
        r5 = r5.toString();
        com.whatsapp.util.Log.e(r5);
        r5 = r0.get(r4);
        r5 = r5.toString();
        r5 = java.lang.Integer.parseInt(r5);
        r6 = com.whatsapp.App.P;
        r4 = r4.toString();
        r4 = r6.a(r4);
        switch(r5) {
            case 401: goto L_0x0584;
            case 409: goto L_0x05a2;
            case 500: goto L_0x05a4;
            default: goto L_0x03db;
        };
    L_0x03db:
        r5 = com.whatsapp.App.p;
        r6 = new java.lang.Object[r10];
        r7 = com.whatsapp.App.p;
        r4 = r4.a(r7);
        r6[r9] = r4;
        r4 = r5.getString(r11, r6);
        r4 = r2.append(r4);
        r5 = "\n";
        r4.append(r5);
    L_0x03f4:
        if (r1 == 0) goto L_0x0391;
    L_0x03f6:
        r0 = com.whatsapp.App.p;
        r2 = r2.toString();
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0401:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r14.obj;
        r0 = (java.util.Hashtable) r0;
        r3 = r0.keySet();
        r3 = r3.iterator();
    L_0x0412:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0477;
    L_0x0418:
        r4 = r3.next();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 5;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r4);
        r6 = "/";
        r5 = r5.append(r6);
        r6 = r0.get(r4);
        r5 = r5.append(r6);
        r5 = r5.toString();
        com.whatsapp.util.Log.e(r5);
        r5 = r0.get(r4);
        r5 = r5.toString();
        r5 = java.lang.Integer.parseInt(r5);
        r6 = com.whatsapp.App.P;
        r4 = r4.toString();
        r4 = r6.a(r4);
        switch(r5) {
            case 404: goto L_0x05c4;
            default: goto L_0x045c;
        };
    L_0x045c:
        r5 = com.whatsapp.App.p;
        r6 = new java.lang.Object[r10];
        r7 = com.whatsapp.App.p;
        r4 = r4.a(r7);
        r6[r9] = r4;
        r4 = r5.getString(r12, r6);
        r4 = r2.append(r4);
        r5 = "\n";
        r4.append(r5);
    L_0x0475:
        if (r1 == 0) goto L_0x0412;
    L_0x0477:
        r0 = com.whatsapp.App.p;
        r2 = r2.toString();
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0482:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r14.obj;
        r0 = (java.util.Hashtable) r0;
        r3 = r0.keySet();
        r3 = r3.iterator();
    L_0x0493:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x04f8;
    L_0x0499:
        r4 = r3.next();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 6;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r4);
        r6 = "/";
        r5 = r5.append(r6);
        r6 = r0.get(r4);
        r5 = r5.append(r6);
        r5 = r5.toString();
        com.whatsapp.util.Log.e(r5);
        r5 = r0.get(r4);
        r5 = r5.toString();
        r5 = java.lang.Integer.parseInt(r5);
        r6 = com.whatsapp.App.P;
        r4 = r4.toString();
        r4 = r6.a(r4);
        switch(r5) {
            case 404: goto L_0x05c8;
            default: goto L_0x04dd;
        };
    L_0x04dd:
        r5 = com.whatsapp.App.p;
        r6 = new java.lang.Object[r10];
        r7 = com.whatsapp.App.p;
        r4 = r4.a(r7);
        r6[r9] = r4;
        r4 = r5.getString(r11, r6);
        r4 = r2.append(r4);
        r5 = "\n";
        r4.append(r5);
    L_0x04f6:
        if (r1 == 0) goto L_0x0493;
    L_0x04f8:
        r0 = com.whatsapp.App.p;
        r2 = r2.toString();
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0503:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r14.obj;
        r0 = (java.util.Hashtable) r0;
        r3 = r0.keySet();
        r3 = r3.iterator();
    L_0x0514:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0579;
    L_0x051a:
        r4 = r3.next();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 7;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r4);
        r6 = "/";
        r5 = r5.append(r6);
        r6 = r0.get(r4);
        r5 = r5.append(r6);
        r5 = r5.toString();
        com.whatsapp.util.Log.e(r5);
        r5 = r0.get(r4);
        r5 = r5.toString();
        r5 = java.lang.Integer.parseInt(r5);
        r6 = com.whatsapp.App.P;
        r4 = r4.toString();
        r4 = r6.a(r4);
        switch(r5) {
            case 404: goto L_0x05e5;
            default: goto L_0x055e;
        };
    L_0x055e:
        r5 = com.whatsapp.App.p;
        r6 = new java.lang.Object[r10];
        r7 = com.whatsapp.App.p;
        r4 = r4.a(r7);
        r6[r9] = r4;
        r4 = r5.getString(r12, r6);
        r4 = r2.append(r4);
        r5 = "\n";
        r4.append(r5);
    L_0x0577:
        if (r1 == 0) goto L_0x0514;
    L_0x0579:
        r0 = com.whatsapp.App.p;
        r1 = r2.toString();
        com.whatsapp.App.b(r0, r1, r9);
        goto L_0x0012;
    L_0x0584:
        r5 = com.whatsapp.App.p;
        r6 = 2131624273; // 0x7f0e0151 float:1.8875721E38 double:1.053162323E-314;
        r7 = new java.lang.Object[r10];
        r8 = com.whatsapp.App.p;
        r8 = r4.a(r8);
        r7[r9] = r8;
        r5 = r5.getString(r6, r7);
        r5 = r2.append(r5);
        r6 = "\n";
        r5.append(r6);
        if (r1 == 0) goto L_0x03f4;
    L_0x05a2:
        if (r1 == 0) goto L_0x03f4;
    L_0x05a4:
        r5 = com.whatsapp.App.p;
        r6 = 2131624274; // 0x7f0e0152 float:1.8875723E38 double:1.0531623236E-314;
        r7 = new java.lang.Object[r10];
        r8 = com.whatsapp.App.p;
        r8 = r4.a(r8);
        r7[r9] = r8;
        r5 = r5.getString(r6, r7);
        r5 = r2.append(r5);
        r6 = "\n";
        r5.append(r6);
        if (r1 == 0) goto L_0x03f4;
    L_0x05c2:
        goto L_0x03db;
    L_0x05c4:
        if (r1 == 0) goto L_0x0475;
    L_0x05c6:
        goto L_0x045c;
    L_0x05c8:
        r5 = com.whatsapp.App.p;
        r6 = new java.lang.Object[r10];
        r7 = com.whatsapp.App.p;
        r7 = r4.a(r7);
        r6[r9] = r7;
        r5 = r5.getString(r11, r6);
        r5 = r2.append(r5);
        r6 = "\n";
        r5.append(r6);
        if (r1 == 0) goto L_0x04f6;
    L_0x05e3:
        goto L_0x04dd;
    L_0x05e5:
        r5 = com.whatsapp.App.p;
        r6 = new java.lang.Object[r10];
        r7 = com.whatsapp.App.p;
        r7 = r4.a(r7);
        r6[r9] = r7;
        r5 = r5.getString(r12, r6);
        r5 = r2.append(r5);
        r6 = "\n";
        r5.append(r6);
        if (r1 == 0) goto L_0x0577;
    L_0x0600:
        goto L_0x055e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp._u.handleMessage(android.os.Message):void");
    }
}
