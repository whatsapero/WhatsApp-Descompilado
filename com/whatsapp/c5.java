package com.whatsapp;

import android.os.Handler;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class c5 extends Handler {
    private static final String[] z;
    final AccountInfoActivity a;

    static {
        String[] strArr = new String[11];
        String str = "D\u0007gb?e\u0000:t'tZ'p#";
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
                        i3 = 4;
                        break;
                    case ay.f /*1*/:
                        i3 = 116;
                        break;
                    case ay.n /*2*/:
                        i3 = 73;
                        break;
                    case ay.p /*3*/:
                        i3 = 21;
                        break;
                    default:
                        i3 = 87;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "e\u0017*z\"j\u0000d|9b\u001bfy6q\u001a*}zb\u0015 y2`[*t9g\u0011%y2`";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "e\u0017*z\"j\u0000d|9b\u001bf}6j\u0010%pzh\u0015<{4lY/t>h\u0011-5%a\u00079z9w\u0011t";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "e\u0017*z\"j\u0000d|9b\u001bfq>e\u0018&rxc\u001d/aw";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "e\u0017*z\"j\u0000d|9b\u001bfq>e\u0018&rxc\u0015?pzw\u0011;c>g\u0011i";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "e\u0017*z\"j\u0000d|9b\u001bf}6j\u0010%pzh\u0015<{4lY:`4g\u0011:fxa\f*p'p\u001d&{";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "e\u0017*z\"j\u0000d|9b\u001bfy6q\u001a*}zb\u0015 y2`[(y%a\u0015-lzk\u0003'p3";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "e\u0017*z\"j\u0000d|9b\u001bf}6j\u0010%pzg\u001c({0aY-`2)\u0000&80m\u0012=59kT$p$w\u0015.p";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "e\u0017*z\"j\u0000d|9b\u001bfa>i\u0011&`#+\u0011%|0m\u0016 y>p\r";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "e\u0017*z\"j\u0000d|9b\u001bfy6q\u001a*}zb\u0015 y2`[,m'm\u0006,q";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "e\u0017*z\"j\u0000d|9b\u001bfa>i\u0011&`#+\u00111e>v\u0011-";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r14) {
        /*
        r13_this = this;
        r12 = 2;
        r11 = 1;
        r10 = 0;
        r9 = com.whatsapp.App.az;
        r2 = r14.what;	 Catch:{ SendIntentException -> 0x01fb }
        switch(r2) {
            case 0: goto L_0x000b;
            case 1: goto L_0x000a;
            case 2: goto L_0x000a;
            case 3: goto L_0x00a9;
            case 4: goto L_0x00bf;
            case 5: goto L_0x015e;
            case 6: goto L_0x0036;
            case 7: goto L_0x0071;
            case 8: goto L_0x0020;
            case 9: goto L_0x0146;
            case 10: goto L_0x01c1;
            case 11: goto L_0x0175;
            default: goto L_0x000a;
        };	 Catch:{ SendIntentException -> 0x01fb }
    L_0x000a:
        return;
    L_0x000b:
        r2 = z;	 Catch:{ SendIntentException -> 0x01fb }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ SendIntentException -> 0x01fb }
        com.whatsapp.util.Log.e(r2);	 Catch:{ SendIntentException -> 0x01fb }
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x01fb }
        r2.c();	 Catch:{ SendIntentException -> 0x01fb }
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x01fb }
        r3 = 2;
        r2.showDialog(r3);	 Catch:{ SendIntentException -> 0x01fb }
        if (r9 == 0) goto L_0x000a;
    L_0x0020:
        r2 = z;	 Catch:{ SendIntentException -> 0x01fd }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ SendIntentException -> 0x01fd }
        com.whatsapp.util.Log.e(r2);	 Catch:{ SendIntentException -> 0x01fd }
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x01fd }
        r2.c();	 Catch:{ SendIntentException -> 0x01fd }
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x01fd }
        r3 = 4;
        r2.showDialog(r3);	 Catch:{ SendIntentException -> 0x01fd }
        if (r9 == 0) goto L_0x000a;
    L_0x0036:
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x0060 }
        r2 = com.whatsapp.AccountInfoActivity.h(r2);	 Catch:{ SendIntentException -> 0x0060 }
        r3 = 8;
        r2.removeMessages(r3);	 Catch:{ SendIntentException -> 0x0060 }
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x0060 }
        r2.c();	 Catch:{ SendIntentException -> 0x0060 }
        r2 = r14.obj;	 Catch:{ SendIntentException -> 0x0060 }
        r0 = r2;
        r0 = (android.app.PendingIntent) r0;	 Catch:{ SendIntentException -> 0x0060 }
        r3 = r0;
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x0060 }
        r3 = r3.getIntentSender();	 Catch:{ SendIntentException -> 0x0060 }
        r4 = 10001; // 0x2711 float:1.4014E-41 double:4.941E-320;
        r5 = new android.content.Intent;	 Catch:{ SendIntentException -> 0x0060 }
        r5.<init>();	 Catch:{ SendIntentException -> 0x0060 }
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r2.startIntentSenderForResult(r3, r4, r5, r6, r7, r8);	 Catch:{ SendIntentException -> 0x0060 }
        goto L_0x000a;
    L_0x0060:
        r2 = move-exception;
        r3 = z;	 Catch:{ SendIntentException -> 0x01ff }
        r4 = 6;
        r3 = r3[r4];	 Catch:{ SendIntentException -> 0x01ff }
        com.whatsapp.util.Log.b(r3, r2);	 Catch:{ SendIntentException -> 0x01ff }
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x01ff }
        r3 = 4;
        r2.showDialog(r3);	 Catch:{ SendIntentException -> 0x01ff }
        if (r9 == 0) goto L_0x000a;
    L_0x0071:
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x0201 }
        r2 = com.whatsapp.AccountInfoActivity.h(r2);	 Catch:{ SendIntentException -> 0x0201 }
        r3 = 8;
        r2.removeMessages(r3);	 Catch:{ SendIntentException -> 0x0201 }
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x0201 }
        r2.c();	 Catch:{ SendIntentException -> 0x0201 }
        r2 = r14.arg1;	 Catch:{ SendIntentException -> 0x0201 }
        switch(r2) {
            case 1: goto L_0x0219;
            case 7: goto L_0x0209;
            default: goto L_0x0086;
        };
    L_0x0086:
        r2 = new java.lang.StringBuilder;	 Catch:{ SendIntentException -> 0x0207 }
        r2.<init>();	 Catch:{ SendIntentException -> 0x0207 }
        r3 = z;	 Catch:{ SendIntentException -> 0x0207 }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ SendIntentException -> 0x0207 }
        r2 = r2.append(r3);	 Catch:{ SendIntentException -> 0x0207 }
        r3 = r14.arg1;	 Catch:{ SendIntentException -> 0x0207 }
        r2 = r2.append(r3);	 Catch:{ SendIntentException -> 0x0207 }
        r2 = r2.toString();	 Catch:{ SendIntentException -> 0x0207 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ SendIntentException -> 0x0207 }
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x0207 }
        r3 = 4;
        r2.showDialog(r3);	 Catch:{ SendIntentException -> 0x0207 }
        if (r9 == 0) goto L_0x000a;
    L_0x00a9:
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x0207 }
        r3 = 2131624716; // 0x7f0e030c float:1.887662E38 double:1.053162542E-314;
        r2.b(r3);	 Catch:{ SendIntentException -> 0x0207 }
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x0207 }
        r2 = com.whatsapp.AccountInfoActivity.h(r2);	 Catch:{ SendIntentException -> 0x0207 }
        r3 = 0;
        r4 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        r2.sendEmptyMessageDelayed(r3, r4);	 Catch:{ SendIntentException -> 0x0207 }
        if (r9 == 0) goto L_0x000a;
    L_0x00bf:
        r2 = r14.obj;
        r2 = (java.lang.String) r2;
        r5 = r14.arg1;
        r3 = r13.a;
        r3 = com.whatsapp.AccountInfoActivity.h(r3);
        r3.removeMessages(r10);
        r3 = r13.a;
        r3.c();
        r3 = com.whatsapp.App.an;
        r3 = r3.jabber_id;
        r3 = r3.equals(r2);
        if (r3 != 0) goto L_0x000a;
    L_0x00dd:
        r3 = com.whatsapp.App.P;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r4 = r4.append(r2);
        r6 = z;
        r6 = r6[r10];
        r4 = r4.append(r6);
        r4 = r4.toString();
        r3 = r3.a(r4);
        if (r3 != 0) goto L_0x0227;
    L_0x00fa:
        r3 = com.whatsapp.m3.a(r2);	 Catch:{ SendIntentException -> 0x0225 }
        r4 = r3;
    L_0x00ff:
        if (r5 <= 0) goto L_0x0119;
    L_0x0101:
        r3 = com.whatsapp.App.aX;
        r6 = 2131558400; // 0x7f0d0000 float:1.8742115E38 double:1.0531297775E-314;
        r3 = r3.a(r6, r5);
        r6 = new java.lang.Object[r12];
        r5 = java.lang.Integer.valueOf(r5);
        r6[r10] = r5;
        r6[r11] = r4;
        r3 = java.lang.String.format(r3, r6);
        if (r9 == 0) goto L_0x0126;
    L_0x0119:
        r3 = r13.a;
        r5 = 2131623958; // 0x7f0e0016 float:1.8875082E38 double:1.0531621675E-314;
        r6 = new java.lang.Object[r11];
        r6[r10] = r4;
        r3 = r3.getString(r5, r6);
    L_0x0126:
        r4 = r13.a;	 Catch:{ SendIntentException -> 0x0230 }
        r4.f(r3);	 Catch:{ SendIntentException -> 0x0230 }
        r3 = new java.lang.StringBuilder;	 Catch:{ SendIntentException -> 0x0230 }
        r3.<init>();	 Catch:{ SendIntentException -> 0x0230 }
        r4 = z;	 Catch:{ SendIntentException -> 0x0230 }
        r5 = 5;
        r4 = r4[r5];	 Catch:{ SendIntentException -> 0x0230 }
        r3 = r3.append(r4);	 Catch:{ SendIntentException -> 0x0230 }
        r2 = r3.append(r2);	 Catch:{ SendIntentException -> 0x0230 }
        r2 = r2.toString();	 Catch:{ SendIntentException -> 0x0230 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ SendIntentException -> 0x0230 }
        if (r9 == 0) goto L_0x000a;
    L_0x0146:
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x0232 }
        r2 = com.whatsapp.AccountInfoActivity.h(r2);	 Catch:{ SendIntentException -> 0x0232 }
        r3 = 0;
        r2.removeMessages(r3);	 Catch:{ SendIntentException -> 0x0232 }
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x0232 }
        r2.c();	 Catch:{ SendIntentException -> 0x0232 }
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x0232 }
        r3 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r2.showDialog(r3);	 Catch:{ SendIntentException -> 0x0232 }
        if (r9 == 0) goto L_0x000a;
    L_0x015e:
        r2 = com.whatsapp.App.an;	 Catch:{ SendIntentException -> 0x0234 }
        r2 = r2.jabber_id;	 Catch:{ SendIntentException -> 0x0234 }
        r3 = r13.a;	 Catch:{ SendIntentException -> 0x0234 }
        r3 = com.whatsapp.AccountInfoActivity.l(r3);	 Catch:{ SendIntentException -> 0x0234 }
        r2 = r2.equals(r3);	 Catch:{ SendIntentException -> 0x0234 }
        if (r2 == 0) goto L_0x000a;
    L_0x016e:
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x0236 }
        com.whatsapp.AccountInfoActivity.p(r2);	 Catch:{ SendIntentException -> 0x0236 }
        if (r9 == 0) goto L_0x000a;
    L_0x0175:
        r2 = com.whatsapp.App.an;	 Catch:{ SendIntentException -> 0x0238 }
        r2 = r2.jabber_id;	 Catch:{ SendIntentException -> 0x0238 }
        r3 = r13.a;	 Catch:{ SendIntentException -> 0x0238 }
        r3 = com.whatsapp.AccountInfoActivity.l(r3);	 Catch:{ SendIntentException -> 0x0238 }
        r2 = r2.equals(r3);	 Catch:{ SendIntentException -> 0x0238 }
        if (r2 == 0) goto L_0x018a;
    L_0x0185:
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x0238 }
        com.whatsapp.AccountInfoActivity.p(r2);	 Catch:{ SendIntentException -> 0x0238 }
    L_0x018a:
        r2 = r14.obj;	 Catch:{ SendIntentException -> 0x023a }
        if (r2 == 0) goto L_0x01b6;
    L_0x018e:
        r3 = r13.a;	 Catch:{ SendIntentException -> 0x023c }
        r2 = r14.obj;	 Catch:{ SendIntentException -> 0x023c }
        r2 = (java.lang.String) r2;	 Catch:{ SendIntentException -> 0x023c }
        r2 = (java.lang.String) r2;	 Catch:{ SendIntentException -> 0x023c }
        r3.f(r2);	 Catch:{ SendIntentException -> 0x023c }
        r2 = new java.lang.StringBuilder;	 Catch:{ SendIntentException -> 0x023c }
        r2.<init>();	 Catch:{ SendIntentException -> 0x023c }
        r3 = z;	 Catch:{ SendIntentException -> 0x023c }
        r4 = 4;
        r3 = r3[r4];	 Catch:{ SendIntentException -> 0x023c }
        r2 = r2.append(r3);	 Catch:{ SendIntentException -> 0x023c }
        r3 = r14.obj;	 Catch:{ SendIntentException -> 0x023c }
        r2 = r2.append(r3);	 Catch:{ SendIntentException -> 0x023c }
        r2 = r2.toString();	 Catch:{ SendIntentException -> 0x023c }
        com.whatsapp.util.Log.i(r2);	 Catch:{ SendIntentException -> 0x023c }
        if (r9 == 0) goto L_0x000a;
    L_0x01b6:
        r2 = z;	 Catch:{ SendIntentException -> 0x01f9 }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ SendIntentException -> 0x01f9 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ SendIntentException -> 0x01f9 }
        if (r9 == 0) goto L_0x000a;
    L_0x01c1:
        r2 = z;	 Catch:{ SendIntentException -> 0x01f9 }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ SendIntentException -> 0x01f9 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ SendIntentException -> 0x01f9 }
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x01f9 }
        r2 = com.whatsapp.AccountInfoActivity.h(r2);	 Catch:{ SendIntentException -> 0x01f9 }
        r3 = 10;
        r2.removeMessages(r3);	 Catch:{ SendIntentException -> 0x01f9 }
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x01f9 }
        r2.c();	 Catch:{ SendIntentException -> 0x01f9 }
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x01f9 }
        r3 = r13.a;	 Catch:{ SendIntentException -> 0x01f9 }
        r4 = 2131624725; // 0x7f0e0315 float:1.8876638E38 double:1.0531625464E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ SendIntentException -> 0x01f9 }
        r6 = 0;
        r7 = r13.a;	 Catch:{ SendIntentException -> 0x01f9 }
        r8 = 2131624132; // 0x7f0e00c4 float:1.8875435E38 double:1.0531622535E-314;
        r7 = r7.getString(r8);	 Catch:{ SendIntentException -> 0x01f9 }
        r5[r6] = r7;	 Catch:{ SendIntentException -> 0x01f9 }
        r3 = r3.getString(r4, r5);	 Catch:{ SendIntentException -> 0x01f9 }
        r2.f(r3);	 Catch:{ SendIntentException -> 0x01f9 }
        goto L_0x000a;
    L_0x01f9:
        r2 = move-exception;
        throw r2;
    L_0x01fb:
        r2 = move-exception;
        throw r2;	 Catch:{ SendIntentException -> 0x01fd }
    L_0x01fd:
        r2 = move-exception;
        throw r2;
    L_0x01ff:
        r2 = move-exception;
        throw r2;	 Catch:{ SendIntentException -> 0x0201 }
    L_0x0201:
        r2 = move-exception;
        throw r2;	 Catch:{ SendIntentException -> 0x0203 }
    L_0x0203:
        r2 = move-exception;
        throw r2;	 Catch:{ SendIntentException -> 0x0205 }
    L_0x0205:
        r2 = move-exception;
        throw r2;	 Catch:{ SendIntentException -> 0x0207 }
    L_0x0207:
        r2 = move-exception;
        throw r2;
    L_0x0209:
        r2 = z;	 Catch:{ SendIntentException -> 0x0203 }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ SendIntentException -> 0x0203 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ SendIntentException -> 0x0203 }
        r2 = r13.a;	 Catch:{ SendIntentException -> 0x0203 }
        r3 = 5;
        r2.showDialog(r3);	 Catch:{ SendIntentException -> 0x0203 }
        if (r9 == 0) goto L_0x000a;
    L_0x0219:
        r2 = z;	 Catch:{ SendIntentException -> 0x0205 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ SendIntentException -> 0x0205 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ SendIntentException -> 0x0205 }
        if (r9 == 0) goto L_0x000a;
    L_0x0223:
        goto L_0x0086;
    L_0x0225:
        r2 = move-exception;
        throw r2;
    L_0x0227:
        r4 = r13.a;
        r3 = r3.a(r4);
        r4 = r3;
        goto L_0x00ff;
    L_0x0230:
        r2 = move-exception;
        throw r2;	 Catch:{ SendIntentException -> 0x0232 }
    L_0x0232:
        r2 = move-exception;
        throw r2;	 Catch:{ SendIntentException -> 0x0234 }
    L_0x0234:
        r2 = move-exception;
        throw r2;	 Catch:{ SendIntentException -> 0x0236 }
    L_0x0236:
        r2 = move-exception;
        throw r2;	 Catch:{ SendIntentException -> 0x0238 }
    L_0x0238:
        r2 = move-exception;
        throw r2;
    L_0x023a:
        r2 = move-exception;
        throw r2;	 Catch:{ SendIntentException -> 0x023c }
    L_0x023c:
        r2 = move-exception;
        throw r2;	 Catch:{ SendIntentException -> 0x01f9 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.c5.handleMessage(android.os.Message):void");
    }

    c5(AccountInfoActivity accountInfoActivity) {
        this.a = accountInfoActivity;
    }
}
