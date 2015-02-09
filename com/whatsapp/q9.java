package com.whatsapp;

import com.whatsapp.util.ar;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class q9 extends ar {
    private static final String[] z;
    final RegisterPhone b;

    static {
        String[] strArr = new String[10];
        String str = "X2i;|^2|}\u007fB8`7 Y2z<zG5k |\u00054a?bC#.4nC;k6";
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
                        i3 = 42;
                        break;
                    case ay.f /*1*/:
                        i3 = 87;
                        break;
                    case ay.n /*2*/:
                        i3 = 14;
                        break;
                    case ay.p /*3*/:
                        i3 = 82;
                        break;
                    default:
                        i3 = 15;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "X2i;|^2|}\u007fB8`7 I?k1dL8| jC9}&nF;";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "X2i;|^2|}\u007fB8`7 I?k1dX2g<|^6b> D8#1`D9k1{C!g&v";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u00059{?mO%3";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "v\u0013";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "X2i;|^2|}\u007fB8`7 I43";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "v\u0013";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "I8c|xB6z!nZ' \u0000jM>}&jX\u0007f=aOy~:`D2Q<zG5k ";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "X2i;|^2|\"gE9k}lIwh3fF2jr{X>c\u001ejK3g<hp2|=/L%a?/i8{<{X.^:`D2G<iE";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "I8c|xB6z!nZ' \u0000jM>}&jX\u0007f=aOym=zD#|+PI8j7";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r9) {
        /*
        r8_this = this;
        r7 = 7;
        r4 = 1;
        r6 = 0;
        r1 = com.whatsapp.App.az;
        r0 = r8.b;	 Catch:{ IOException -> 0x000e }
        r0 = com.whatsapp.RegisterPhone.i(r0);	 Catch:{ IOException -> 0x000e }
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        return;
    L_0x000e:
        r0 = move-exception;
        throw r0;
    L_0x0010:
        r0 = r8.b;
        r0 = r0.r;
        r0 = r0.e;
        r0 = r0.getText();
        r0 = r0.toString();
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r3 = "";
        r2 = r0.replaceAll(r2, r3);
        r0 = r8.b;
        r0 = r0.r;
        r0 = r0.c;
        r0 = r0.getText();
        r0 = r0.toString();
        r3 = com.whatsapp.EnterPhoneNumber.a(r2, r0);
        switch(r3) {
            case 1: goto L_0x0103;
            case 2: goto L_0x0105;
            case 3: goto L_0x011a;
            case 4: goto L_0x0138;
            case 5: goto L_0x014b;
            case 6: goto L_0x0172;
            case 7: goto L_0x0199;
            default: goto L_0x003e;
        };
    L_0x003e:
        r3 = java.lang.Integer.parseInt(r2);
        r4 = z;
        r4 = r4[r7];
        r5 = "";
        r0 = r0.replaceAll(r4, r5);
        r0 = com.whatsapp.ats.a(r3, r0);	 Catch:{ IOException -> 0x01c0 }
    L_0x0050:
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01cc }
        r3.<init>();	 Catch:{ IOException -> 0x01cc }
        r4 = z;	 Catch:{ IOException -> 0x01cc }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ IOException -> 0x01cc }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x01cc }
        r3 = r3.append(r2);	 Catch:{ IOException -> 0x01cc }
        r4 = z;	 Catch:{ IOException -> 0x01cc }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ IOException -> 0x01cc }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x01cc }
        r3 = r3.append(r0);	 Catch:{ IOException -> 0x01cc }
        r3 = r3.toString();	 Catch:{ IOException -> 0x01cc }
        com.whatsapp.util.Log.i(r3);	 Catch:{ IOException -> 0x01cc }
        r3 = r8.b;	 Catch:{ IOException -> 0x01cc }
        r3 = com.whatsapp.RegisterPhone.d(r3);	 Catch:{ IOException -> 0x01cc }
        r3 = r2.equals(r3);	 Catch:{ IOException -> 0x01cc }
        if (r3 == 0) goto L_0x008e;
    L_0x0082:
        r3 = r8.b;	 Catch:{ IOException -> 0x01ce }
        r3 = com.whatsapp.RegisterPhone.e(r3);	 Catch:{ IOException -> 0x01ce }
        r3 = r0.equals(r3);	 Catch:{ IOException -> 0x01ce }
        if (r3 != 0) goto L_0x0099;
    L_0x008e:
        r3 = z;	 Catch:{ IOException -> 0x01ce }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ IOException -> 0x01ce }
        com.whatsapp.util.Log.i(r3);	 Catch:{ IOException -> 0x01ce }
        r3 = 7;
        com.whatsapp.EnterPhoneNumber.w = r3;	 Catch:{ IOException -> 0x01ce }
    L_0x0099:
        com.whatsapp.EnterPhoneNumber.u = r2;
        com.whatsapp.EnterPhoneNumber.x = r0;
        r0 = r8.b;
        com.whatsapp.RegisterPhone.b(r0);
        r0 = r8.b;
        com.whatsapp.RegisterPhone.g(r0);
        r0 = r8.b;
        r0 = r0.getPreferences(r6);
        r0 = r0.edit();
        r2 = z;	 Catch:{ IOException -> 0x01d0 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ IOException -> 0x01d0 }
        r3 = com.whatsapp.EnterPhoneNumber.u;	 Catch:{ IOException -> 0x01d0 }
        r0.putString(r2, r3);	 Catch:{ IOException -> 0x01d0 }
        r2 = z;	 Catch:{ IOException -> 0x01d0 }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ IOException -> 0x01d0 }
        r3 = com.whatsapp.EnterPhoneNumber.x;	 Catch:{ IOException -> 0x01d0 }
        r0.putString(r2, r3);	 Catch:{ IOException -> 0x01d0 }
        r0 = r0.commit();	 Catch:{ IOException -> 0x01d0 }
        if (r0 != 0) goto L_0x00d4;
    L_0x00cc:
        r0 = z;	 Catch:{ IOException -> 0x01d0 }
        r2 = 0;
        r0 = r0[r2];	 Catch:{ IOException -> 0x01d0 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x01d0 }
    L_0x00d4:
        r0 = com.whatsapp.App.a();	 Catch:{ IOException -> 0x0101 }
        if (r0 != 0) goto L_0x01d2;
    L_0x00da:
        r0 = z;	 Catch:{ IOException -> 0x0101 }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0101 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0101 }
        r0 = r8.b;	 Catch:{ IOException -> 0x0101 }
        r1 = r8.b;	 Catch:{ IOException -> 0x0101 }
        r2 = 2131624725; // 0x7f0e0315 float:1.8876638E38 double:1.0531625464E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IOException -> 0x0101 }
        r4 = 0;
        r5 = r8.b;	 Catch:{ IOException -> 0x0101 }
        r6 = 2131624132; // 0x7f0e00c4 float:1.8875435E38 double:1.0531622535E-314;
        r5 = r5.getString(r6);	 Catch:{ IOException -> 0x0101 }
        r3[r4] = r5;	 Catch:{ IOException -> 0x0101 }
        r1 = r1.getString(r2, r3);	 Catch:{ IOException -> 0x0101 }
        r0.g(r1);	 Catch:{ IOException -> 0x0101 }
        goto L_0x000d;
    L_0x0101:
        r0 = move-exception;
        throw r0;
    L_0x0103:
        if (r1 == 0) goto L_0x003e;
    L_0x0105:
        r0 = r8.b;	 Catch:{ IOException -> 0x0118 }
        r1 = 2131624718; // 0x7f0e030e float:1.8876624E38 double:1.053162543E-314;
        r0.f(r1);	 Catch:{ IOException -> 0x0118 }
        r0 = r8.b;	 Catch:{ IOException -> 0x0118 }
        r0 = r0.r;	 Catch:{ IOException -> 0x0118 }
        r0 = r0.e;	 Catch:{ IOException -> 0x0118 }
        r0.requestFocus();	 Catch:{ IOException -> 0x0118 }
        goto L_0x000d;
    L_0x0118:
        r0 = move-exception;
        throw r0;
    L_0x011a:
        r0 = r8.b;
        r1 = 2131624719; // 0x7f0e030f float:1.8876626E38 double:1.0531625435E-314;
        r0.f(r1);
        r0 = r8.b;
        r0 = r0.r;
        r0 = r0.e;
        r1 = "";
        r0.setText(r1);
        r0 = r8.b;
        r0 = r0.r;
        r0 = r0.e;
        r0.requestFocus();
        goto L_0x000d;
    L_0x0138:
        r0 = r8.b;
        r1 = 2131624731; // 0x7f0e031b float:1.887665E38 double:1.0531625494E-314;
        r0.f(r1);
        r0 = r8.b;
        r0 = r0.r;
        r0 = r0.c;
        r0.requestFocus();
        goto L_0x000d;
    L_0x014b:
        r0 = r8.b;
        r1 = r8.b;
        r2 = 2131624723; // 0x7f0e0313 float:1.8876634E38 double:1.0531625455E-314;
        r3 = new java.lang.Object[r4];
        r4 = r8.b;
        r4 = r4.r;
        r4 = r4.f;
        r4 = r4.getText();
        r3[r6] = r4;
        r1 = r1.getString(r2, r3);
        r0.g(r1);
        r0 = r8.b;
        r0 = r0.r;
        r0 = r0.c;
        r0.requestFocus();
        goto L_0x000d;
    L_0x0172:
        r0 = r8.b;
        r1 = r8.b;
        r2 = 2131624722; // 0x7f0e0312 float:1.8876632E38 double:1.053162545E-314;
        r3 = new java.lang.Object[r4];
        r4 = r8.b;
        r4 = r4.r;
        r4 = r4.f;
        r4 = r4.getText();
        r3[r6] = r4;
        r1 = r1.getString(r2, r3);
        r0.g(r1);
        r0 = r8.b;
        r0 = r0.r;
        r0 = r0.c;
        r0.requestFocus();
        goto L_0x000d;
    L_0x0199:
        r0 = r8.b;
        r1 = r8.b;
        r2 = 2131624721; // 0x7f0e0311 float:1.887663E38 double:1.0531625445E-314;
        r3 = new java.lang.Object[r4];
        r4 = r8.b;
        r4 = r4.r;
        r4 = r4.f;
        r4 = r4.getText();
        r3[r6] = r4;
        r1 = r1.getString(r2, r3);
        r0.g(r1);
        r0 = r8.b;
        r0 = r0.r;
        r0 = r0.c;
        r0.requestFocus();
        goto L_0x000d;
    L_0x01c0:
        r3 = move-exception;
        r4 = z;
        r5 = 9;
        r4 = r4[r5];
        com.whatsapp.util.Log.b(r4, r3);
        goto L_0x0050;
    L_0x01cc:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01ce }
    L_0x01ce:
        r0 = move-exception;
        throw r0;
    L_0x01d0:
        r0 = move-exception;
        throw r0;
    L_0x01d2:
        r0 = com.whatsapp.EnterPhoneNumber.w;
        if (r0 != r7) goto L_0x022c;
    L_0x01d6:
        r0 = r8.b;
        com.whatsapp.RegisterPhone.f(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = com.whatsapp.EnterPhoneNumber.u;
        r0 = r0.append(r2);
        r2 = com.whatsapp.EnterPhoneNumber.x;
        r0 = r0.append(r2);
        r0 = r0.toString();
        r2 = com.whatsapp.App.k(r0);
        r0 = com.whatsapp.a54.f(r2);
        if (r0 != 0) goto L_0x0201;
    L_0x01fa:
        r0 = com.whatsapp.a54.e();
        com.whatsapp.a54.c(r0, r2);
    L_0x0201:
        r2 = new com.whatsapp.vo;	 Catch:{ IOException -> 0x026a }
        r3 = r8.b;	 Catch:{ IOException -> 0x026a }
        r4 = 0;
        r5 = r8.b;	 Catch:{ IOException -> 0x026a }
        r5 = com.whatsapp.RegisterPhone.a(r5);	 Catch:{ IOException -> 0x026a }
        r2.<init>(r3, r4, r5);	 Catch:{ IOException -> 0x026a }
        r3 = 3;
        r3 = new byte[r3][];	 Catch:{ IOException -> 0x026a }
        r4 = 0;
        r5 = com.whatsapp.EnterPhoneNumber.u;	 Catch:{ IOException -> 0x026a }
        r5 = r5.getBytes();	 Catch:{ IOException -> 0x026a }
        r3[r4] = r5;	 Catch:{ IOException -> 0x026a }
        r4 = 1;
        r5 = com.whatsapp.EnterPhoneNumber.x;	 Catch:{ IOException -> 0x026a }
        r5 = r5.getBytes();	 Catch:{ IOException -> 0x026a }
        r3[r4] = r5;	 Catch:{ IOException -> 0x026a }
        r4 = 2;
        r3[r4] = r0;	 Catch:{ IOException -> 0x026a }
        com.whatsapp.a5w.a(r2, r3);	 Catch:{ IOException -> 0x026a }
        if (r1 == 0) goto L_0x000d;
    L_0x022c:
        r0 = com.whatsapp.EnterPhoneNumber.w;	 Catch:{ IOException -> 0x026c }
        r2 = 14;
        if (r0 != r2) goto L_0x0248;
    L_0x0232:
        r0 = new com.whatsapp.h_;	 Catch:{ IOException -> 0x026e }
        r2 = r8.b;	 Catch:{ IOException -> 0x026e }
        r3 = 0;
        r4 = r8.b;	 Catch:{ IOException -> 0x026e }
        r4 = com.whatsapp.RegisterPhone.a(r4);	 Catch:{ IOException -> 0x026e }
        r0.<init>(r2, r3, r4);	 Catch:{ IOException -> 0x026e }
        r2 = 0;
        r2 = new java.lang.String[r2];	 Catch:{ IOException -> 0x026e }
        com.whatsapp.a5w.a(r0, r2);	 Catch:{ IOException -> 0x026e }
        if (r1 == 0) goto L_0x000d;
    L_0x0248:
        r0 = 15;
        com.whatsapp.EnterPhoneNumber.w = r0;	 Catch:{ IOException -> 0x0270 }
        r0 = r8.b;	 Catch:{ IOException -> 0x0270 }
        r0.b();	 Catch:{ IOException -> 0x0270 }
        r0 = r8.b;	 Catch:{ IOException -> 0x0270 }
        r0 = r0.m;	 Catch:{ IOException -> 0x0270 }
        if (r0 != 0) goto L_0x000d;
    L_0x0257:
        r0 = r8.b;	 Catch:{ IOException -> 0x0268 }
        r0 = r0.isFinishing();	 Catch:{ IOException -> 0x0268 }
        if (r0 != 0) goto L_0x000d;
    L_0x025f:
        r0 = r8.b;	 Catch:{ IOException -> 0x0268 }
        r1 = 21;
        r0.showDialog(r1);	 Catch:{ IOException -> 0x0268 }
        goto L_0x000d;
    L_0x0268:
        r0 = move-exception;
        throw r0;
    L_0x026a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x026c }
    L_0x026c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x026e }
    L_0x026e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0270 }
    L_0x0270:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0268 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.q9.a(android.view.View):void");
    }

    q9(RegisterPhone registerPhone) {
        this.b = registerPhone;
    }
}
