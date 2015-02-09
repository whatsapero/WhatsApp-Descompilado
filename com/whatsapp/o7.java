package com.whatsapp;

import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class o7 implements OnClickListener {
    private static final String[] z;
    final DeleteAccount a;

    static {
        String[] strArr = new String[7];
        String str = "jpQQ^k8\\WIa`S@\u0005}`_YCz:^W\n";
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
                        i3 = 14;
                        break;
                    case ay.f /*1*/:
                        i3 = 21;
                        break;
                    case ay.n /*2*/:
                        i3 = 61;
                        break;
                    case ay.p /*3*/:
                        i3 = 52;
                        break;
                    default:
                        i3 = 42;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "jpQQ^k8\\WIa`S@\u0005~}RZO.s\\]Fkq\u001d@XgxqQKj|SSpkgR\u0014L|zP\u0014ia`S@XwEU[Dk\\SRE";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = ".eU\t";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = ".\u007fTP\u0017";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "jpQQ^k8\\WIa`S@\u0005~}RZO!v^\t";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "RQ";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "!{HYHkg\u0000";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r8) {
        /*
        r7_this = this;
        r5 = 0;
        r3 = 1;
        r0 = r7.a;
        r0 = r0.j;
        r0 = r0.getText();
        r0 = r0.toString();
        r1 = r0.trim();
        r0 = r7.a;
        r0 = r0.o;
        r0 = r0.getText();
        r0 = r0.toString();
        r2 = com.whatsapp.RegisterPhone.a(r1, r0);
        switch(r2) {
            case 1: goto L_0x00fd;
            case 2: goto L_0x0101;
            case 3: goto L_0x0115;
            case 4: goto L_0x012e;
            case 5: goto L_0x013e;
            case 6: goto L_0x0160;
            case 7: goto L_0x0183;
            default: goto L_0x0025;
        };
    L_0x0025:
        r2 = java.lang.Integer.parseInt(r1);
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r4 = "";
        r0 = r0.replaceAll(r3, r4);
        r0 = com.whatsapp.ats.a(r2, r0);	 Catch:{ IOException -> 0x01a6 }
    L_0x0038:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01b1 }
        r2.<init>();	 Catch:{ IOException -> 0x01b1 }
        r3 = z;	 Catch:{ IOException -> 0x01b1 }
        r4 = 5;
        r3 = r3[r4];	 Catch:{ IOException -> 0x01b1 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x01b1 }
        r2 = r2.append(r1);	 Catch:{ IOException -> 0x01b1 }
        r3 = z;	 Catch:{ IOException -> 0x01b1 }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ IOException -> 0x01b1 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x01b1 }
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x01b1 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x01b1 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IOException -> 0x01b1 }
        com.whatsapp.DeleteAccount.a(r1);	 Catch:{ IOException -> 0x01b1 }
        com.whatsapp.DeleteAccount.b(r0);	 Catch:{ IOException -> 0x01b1 }
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01b1 }
        r0.<init>();	 Catch:{ IOException -> 0x01b1 }
        r1 = z;	 Catch:{ IOException -> 0x01b1 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ IOException -> 0x01b1 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x01b1 }
        r1 = com.whatsapp.DeleteAccount.a();	 Catch:{ IOException -> 0x01b1 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x01b1 }
        r1 = z;	 Catch:{ IOException -> 0x01b1 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ IOException -> 0x01b1 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x01b1 }
        r1 = com.whatsapp.DeleteAccount.b();	 Catch:{ IOException -> 0x01b1 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x01b1 }
        r1 = z;	 Catch:{ IOException -> 0x01b1 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ IOException -> 0x01b1 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x01b1 }
        r1 = com.whatsapp.App.an;	 Catch:{ IOException -> 0x01b1 }
        r1 = r1.jabber_id;	 Catch:{ IOException -> 0x01b1 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x01b1 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x01b1 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x01b1 }
        r0 = r7.a;	 Catch:{ IOException -> 0x01b1 }
        r1 = 1;
        r0.showDialog(r1);	 Catch:{ IOException -> 0x01b1 }
        r0 = r7.a;	 Catch:{ IOException -> 0x01b1 }
        r0 = com.whatsapp.DeleteAccount.e(r0);	 Catch:{ IOException -> 0x01b1 }
        r1 = 4;
        r2 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0.sendEmptyMessageDelayed(r1, r2);	 Catch:{ IOException -> 0x01b1 }
        r0 = com.whatsapp.DeleteAccount.a();	 Catch:{ IOException -> 0x01b1 }
        r1 = com.whatsapp.DeleteAccount.b();	 Catch:{ IOException -> 0x01b1 }
        r2 = r7.a;	 Catch:{ IOException -> 0x01b1 }
        r2 = com.whatsapp.DeleteAccount.b(r2);	 Catch:{ IOException -> 0x01b1 }
        r3 = r7.a;	 Catch:{ IOException -> 0x01b1 }
        r3 = com.whatsapp.DeleteAccount.d(r3);	 Catch:{ IOException -> 0x01b1 }
        r0 = com.whatsapp.App.a(r0, r1, r2, r3);	 Catch:{ IOException -> 0x01b1 }
        if (r0 != 0) goto L_0x00fc;
    L_0x00cf:
        r0 = r7.a;	 Catch:{ IOException -> 0x01b1 }
        r0 = com.whatsapp.DeleteAccount.e(r0);	 Catch:{ IOException -> 0x01b1 }
        r1 = 4;
        r0.removeMessages(r1);	 Catch:{ IOException -> 0x01b1 }
        r0 = r7.a;	 Catch:{ IOException -> 0x01b1 }
        r1 = 1;
        r0.removeDialog(r1);	 Catch:{ IOException -> 0x01b1 }
        r0 = r7.a;	 Catch:{ IOException -> 0x01b1 }
        r1 = r7.a;	 Catch:{ IOException -> 0x01b1 }
        r2 = 2131624725; // 0x7f0e0315 float:1.8876638E38 double:1.0531625464E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IOException -> 0x01b1 }
        r4 = 0;
        r5 = r7.a;	 Catch:{ IOException -> 0x01b1 }
        r6 = 2131624132; // 0x7f0e00c4 float:1.8875435E38 double:1.0531622535E-314;
        r5 = r5.getString(r6);	 Catch:{ IOException -> 0x01b1 }
        r3[r4] = r5;	 Catch:{ IOException -> 0x01b1 }
        r1 = r1.getString(r2, r3);	 Catch:{ IOException -> 0x01b1 }
        r0.f(r1);	 Catch:{ IOException -> 0x01b1 }
    L_0x00fc:
        return;
    L_0x00fd:
        r2 = com.whatsapp.App.az;	 Catch:{ IOException -> 0x0113 }
        if (r2 == 0) goto L_0x0025;
    L_0x0101:
        r0 = r7.a;	 Catch:{ IOException -> 0x0111 }
        r1 = 2131624718; // 0x7f0e030e float:1.8876624E38 double:1.053162543E-314;
        r0.a(r1);	 Catch:{ IOException -> 0x0111 }
        r0 = r7.a;	 Catch:{ IOException -> 0x0111 }
        r0 = r0.j;	 Catch:{ IOException -> 0x0111 }
        r0.requestFocus();	 Catch:{ IOException -> 0x0111 }
        goto L_0x00fc;
    L_0x0111:
        r0 = move-exception;
        throw r0;
    L_0x0113:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0111 }
    L_0x0115:
        r0 = r7.a;
        r1 = 2131624719; // 0x7f0e030f float:1.8876626E38 double:1.0531625435E-314;
        r0.a(r1);
        r0 = r7.a;
        r0 = r0.j;
        r1 = "";
        r0.setText(r1);
        r0 = r7.a;
        r0 = r0.j;
        r0.requestFocus();
        goto L_0x00fc;
    L_0x012e:
        r0 = r7.a;
        r1 = 2131624731; // 0x7f0e031b float:1.887665E38 double:1.0531625494E-314;
        r0.a(r1);
        r0 = r7.a;
        r0 = r0.o;
        r0.requestFocus();
        goto L_0x00fc;
    L_0x013e:
        r0 = r7.a;
        r1 = r7.a;
        r2 = 2131624723; // 0x7f0e0313 float:1.8876634E38 double:1.0531625455E-314;
        r3 = new java.lang.Object[r3];
        r4 = r7.a;
        r4 = r4.r;
        r4 = r4.getText();
        r3[r5] = r4;
        r1 = r1.getString(r2, r3);
        r0.f(r1);
        r0 = r7.a;
        r0 = r0.o;
        r0.requestFocus();
        goto L_0x00fc;
    L_0x0160:
        r0 = r7.a;
        r1 = r7.a;
        r2 = 2131624722; // 0x7f0e0312 float:1.8876632E38 double:1.053162545E-314;
        r3 = new java.lang.Object[r3];
        r4 = r7.a;
        r4 = r4.r;
        r4 = r4.getText();
        r3[r5] = r4;
        r1 = r1.getString(r2, r3);
        r0.f(r1);
        r0 = r7.a;
        r0 = r0.o;
        r0.requestFocus();
        goto L_0x00fc;
    L_0x0183:
        r0 = r7.a;
        r1 = r7.a;
        r2 = 2131624721; // 0x7f0e0311 float:1.887663E38 double:1.0531625445E-314;
        r3 = new java.lang.Object[r3];
        r4 = r7.a;
        r4 = r4.r;
        r4 = r4.getText();
        r3[r5] = r4;
        r1 = r1.getString(r2, r3);
        r0.f(r1);
        r0 = r7.a;
        r0 = r0.o;
        r0.requestFocus();
        goto L_0x00fc;
    L_0x01a6:
        r2 = move-exception;
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        goto L_0x0038;
    L_0x01b1:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.o7.onClick(android.view.View):void");
    }

    o7(DeleteAccount deleteAccount) {
        this.a = deleteAccount;
    }
}
