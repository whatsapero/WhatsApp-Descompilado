package com.whatsapp;

import android.os.Bundle;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class lv extends k4 {
    private static final String[] z;
    private OnClickListener c;
    private int d;
    private long e;
    private boolean f;
    final RegisterName g;

    static {
        String[] strArr = new String[4];
        String str = "6{\u0017ri2w\u000etu\fg\u0006o~";
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
                        i3 = 83;
                        break;
                    case ay.f /*1*/:
                        i3 = 3;
                        break;
                    case ay.n /*2*/:
                        i3 = 103;
                        break;
                    case ay.p /*3*/:
                        i3 = 27;
                        break;
                    default:
                        i3 = 27;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "!f\u0000rh'f\u0015uz>fHhb=`H}r=j\u0014s~7";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = " w\u0006o~";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = " w\u0006o~";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void b() {
        RegisterName.a(this.g, findViewById(R.id.pay_ed_contact_support));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(int r14) {
        /*
        r13_this = this;
        r12 = com.whatsapp.App.az;
        r13.d = r14;
        r0 = 1;
        if (r14 == r0) goto L_0x0012;
    L_0x0007:
        r0 = r13.getContext();
        r0 = com.whatsapp.App.e(r0);
        r1 = 3;
        if (r0 != r1) goto L_0x0101;
    L_0x0012:
        r0 = 2131427941; // 0x7f0b0265 float:1.8477512E38 double:1.053065322E-314;
        r0 = r13.findViewById(r0);
        r1 = 0;
        r0.setVisibility(r1);
        r0 = 2131427942; // 0x7f0b0266 float:1.8477514E38 double:1.0530653227E-314;
        r0 = r13.findViewById(r0);
        r1 = 8;
        r0.setVisibility(r1);
        r0 = r13.g;
        com.whatsapp.RegisterName.i(r0);
        r0 = r13.g;
        r0 = com.whatsapp.RegisterName.j(r0);
        if (r0 == 0) goto L_0x0041;
    L_0x0036:
        r0 = r13.g;
        r0 = com.whatsapp.RegisterName.j(r0);
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0041:
        r0 = r13.g;
        r0 = com.whatsapp.RegisterName.g(r0);
        r1 = 0;
        r0.removeMessages(r1);
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = new com.whatsapp.t_;
        r0.<init>(r13);
        r1 = 2131427941; // 0x7f0b0265 float:1.8477512E38 double:1.053065322E-314;
        r1 = r13.findViewById(r1);
        r1.setOnClickListener(r0);
        r1 = 2131427945; // 0x7f0b0269 float:1.847752E38 double:1.053065324E-314;
        r1 = r13.findViewById(r1);
        r1.setOnClickListener(r0);
        r0 = new com.whatsapp.a34;
        r0.<init>(r13);
        r1 = 2131427944; // 0x7f0b0268 float:1.8477519E38 double:1.0530653237E-314;
        r1 = r13.findViewById(r1);
        r1.setOnClickListener(r0);
        r0 = new com.whatsapp.td;
        r0.<init>(r13);
        r1 = 2131427946; // 0x7f0b026a float:1.8477523E38 double:1.0530653247E-314;
        r1 = r13.findViewById(r1);
        r1.setOnClickListener(r0);
        r0 = 2131427933; // 0x7f0b025d float:1.8477496E38 double:1.0530653183E-314;
        r2 = r13.findViewById(r0);
        r0 = 2131427935; // 0x7f0b025f float:1.84775E38 double:1.0530653193E-314;
        r3 = r13.findViewById(r0);
        r0 = 2131427450; // 0x7f0b007a float:1.8476517E38 double:1.0530650796E-314;
        r13.findViewById(r0);
        r0 = 2131427939; // 0x7f0b0263 float:1.8477508E38 double:1.053065321E-314;
        r4 = r13.findViewById(r0);
        r5 = r4.isShown();
        r0 = r13.f;
        if (r0 != 0) goto L_0x00b9;
    L_0x00ad:
        r0 = 1;
        r13.f = r0;
        r0 = new com.whatsapp.ai;
        r1 = r13;
        r0.<init>(r1, r2, r3, r4, r5);
        r2.startAnimation(r0);
    L_0x00b9:
        r6 = new com.whatsapp.jx;
        r7 = r13;
        r8 = r2;
        r9 = r5;
        r10 = r4;
        r11 = r3;
        r6.<init>(r7, r8, r9, r10, r11);
        r2.setOnClickListener(r6);
        r0 = r13.e;
        r2 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x00e8;
    L_0x00cf:
        r0 = 2131427943; // 0x7f0b0267 float:1.8477517E38 double:1.053065323E-314;
        r0 = r13.findViewById(r0);
        r1 = 0;
        r0.setVisibility(r1);
        r0 = 2131427940; // 0x7f0b0264 float:1.847751E38 double:1.0530653217E-314;
        r0 = r13.findViewById(r0);
        r1 = 8;
        r0.setVisibility(r1);
        if (r12 == 0) goto L_0x00ff;
    L_0x00e8:
        r0 = 2131427943; // 0x7f0b0267 float:1.8477517E38 double:1.053065323E-314;
        r0 = r13.findViewById(r0);
        r1 = 8;
        r0.setVisibility(r1);
        r0 = 2131427940; // 0x7f0b0264 float:1.847751E38 double:1.0530653217E-314;
        r0 = r13.findViewById(r0);
        r1 = 0;
        r0.setVisibility(r1);
    L_0x00ff:
        if (r12 == 0) goto L_0x0118;
    L_0x0101:
        r0 = 2131427941; // 0x7f0b0265 float:1.8477512E38 double:1.053065322E-314;
        r0 = r13.findViewById(r0);
        r1 = 8;
        r0.setVisibility(r1);
        r0 = 2131427942; // 0x7f0b0266 float:1.8477514E38 double:1.0530653227E-314;
        r0 = r13.findViewById(r0);
        r1 = 0;
        r0.setVisibility(r1);
    L_0x0118:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lv.a(int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r11) {
        /*
        r10_this = this;
        r8 = com.whatsapp.App.az;
        super.onCreate(r11);
        r0 = r10.getWindow();
        r1 = 1;
        r0.setFormat(r1);
        r0 = r10.getWindow();
        r1 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r0.addFlags(r1);
        r0 = r10.getWindow();
        r1 = 3;
        r0.setSoftInputMode(r1);
        r0 = 2131427450; // 0x7f0b007a float:1.8476517E38 double:1.0530650796E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = r0.getPaintFlags();
        r1 = r1 | 8;
        r0.setPaintFlags(r1);
        r1 = r10.c;
        r0.setOnClickListener(r1);
        r1 = r10.g;
        r1 = com.whatsapp.RegisterName.e(r1);
        r0.setOnTouchListener(r1);
        r0 = 2131427939; // 0x7f0b0263 float:1.8477508E38 double:1.053065321E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r2 = com.whatsapp.ac.b(r1);
        r4 = 0;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 != 0) goto L_0x0060;
    L_0x0056:
        r2 = java.lang.System.currentTimeMillis();
        r4 = 31536000000; // 0x757b12c00 float:3.89605073E14 double:1.55808542072E-313;
        r2 = r2 + r4;
    L_0x0060:
        r4 = java.lang.System.currentTimeMillis();
        r4 = r2 - r4;
        r10.e = r4;
        r1 = r10.g;
        r4 = com.whatsapp.App.v(r1);
        r1 = "";
        r6 = 4444444444000; // 0x40acd884560 float:-2.85780992E8 double:2.1958473146304E-311;
        r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r1 < 0) goto L_0x0088;
    L_0x0079:
        r1 = r10.g;
        r2 = 2131624472; // 0x7f0e0218 float:1.8876125E38 double:1.0531624214E-314;
        r1 = r1.getString(r2);
        r2 = 4;
        r0.setVisibility(r2);
        if (r8 == 0) goto L_0x0278;
    L_0x0088:
        r2 = r10.e;
        r6 = 31104000000; // 0x73df16000 float:0.11785889 double:1.5367417848E-313;
        r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r1 < 0) goto L_0x00bb;
    L_0x0093:
        r2 = r10.e;
        r6 = 31536000000; // 0x757b12c00 float:3.89605073E14 double:1.55808542072E-313;
        r2 = r2 / r6;
        r1 = (int) r2;
        if (r1 != 0) goto L_0x027b;
    L_0x009e:
        r1 = 1;
        r2 = r1;
    L_0x00a0:
        if (r4 != 0) goto L_0x024c;
    L_0x00a2:
        r1 = 2131558446; // 0x7f0d002e float:1.8742208E38 double:1.0531298003E-314;
    L_0x00a5:
        r3 = com.whatsapp.App.aX;
        r1 = r3.a(r1, r2);
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r5 = 0;
        r2 = java.lang.Integer.valueOf(r2);
        r3[r5] = r2;
        r1 = java.lang.String.format(r1, r3);
        if (r8 == 0) goto L_0x0278;
    L_0x00bb:
        r2 = r10.e;
        r6 = 2592000000; // 0x9a7ec800 float:-5.2687528E-23 double:1.280618154E-314;
        r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r1 < 0) goto L_0x00ea;
    L_0x00c6:
        r2 = r10.e;
        r6 = 2592000000; // 0x9a7ec800 float:-5.2687528E-23 double:1.280618154E-314;
        r2 = r2 / r6;
        r2 = (int) r2;
        if (r4 != 0) goto L_0x0251;
    L_0x00d1:
        r1 = 2131558426; // 0x7f0d001a float:1.8742167E38 double:1.0531297904E-314;
    L_0x00d4:
        r3 = com.whatsapp.App.aX;
        r1 = r3.a(r1, r2);
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r5 = 0;
        r2 = java.lang.Integer.valueOf(r2);
        r3[r5] = r2;
        r1 = java.lang.String.format(r1, r3);
        if (r8 == 0) goto L_0x0278;
    L_0x00ea:
        r2 = r10.e;
        r6 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r1 < 0) goto L_0x0115;
    L_0x00f3:
        r2 = r10.e;
        r6 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r2 = r2 / r6;
        r2 = (int) r2;
        if (r4 != 0) goto L_0x0256;
    L_0x00fc:
        r1 = 2131558410; // 0x7f0d000a float:1.8742135E38 double:1.0531297825E-314;
    L_0x00ff:
        r3 = com.whatsapp.App.aX;
        r1 = r3.a(r1, r2);
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r4 = 0;
        r2 = java.lang.Integer.valueOf(r2);
        r3[r4] = r2;
        r1 = java.lang.String.format(r1, r3);
        if (r8 == 0) goto L_0x0278;
    L_0x0115:
        r2 = r10.e;
        r4 = 0;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x0128;
    L_0x011d:
        r1 = r10.g;
        r2 = 2131624832; // 0x7f0e0380 float:1.8876855E38 double:1.0531625993E-314;
        r1 = r1.getString(r2);
        if (r8 == 0) goto L_0x0278;
    L_0x0128:
        r1 = r10.g;
        r2 = 2131624831; // 0x7f0e037f float:1.8876853E38 double:1.053162599E-314;
        r1 = r1.getString(r2);
        r4 = r1;
    L_0x0132:
        r1 = 2131427937; // 0x7f0b0261 float:1.8477504E38 double:1.0530653203E-314;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        if (r1 == 0) goto L_0x01d8;
    L_0x013d:
        r2 = 10;
        r3 = 0;
        r3 = r4.indexOf(r2, r3);
        r2 = 10;
        r5 = r3 + 1;
        r5 = r4.indexOf(r2, r5);
        if (r3 <= 0) goto L_0x025b;
    L_0x014e:
        r2 = 0;
        r2 = r4.substring(r2, r3);
        r7 = r2;
    L_0x0154:
        if (r5 <= r3) goto L_0x0260;
    L_0x0156:
        r2 = r3 + 1;
        r2 = r4.substring(r2, r5);
        r6 = r2;
    L_0x015d:
        if (r5 <= 0) goto L_0x0269;
    L_0x015f:
        r2 = r5 + 1;
        r2 = r4.substring(r2);
        r5 = r2;
    L_0x0166:
        r2 = 2131427936; // 0x7f0b0260 float:1.8477502E38 double:1.05306532E-314;
        r2 = r10.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r3 = 2131427938; // 0x7f0b0262 float:1.8477506E38 double:1.0530653208E-314;
        r3 = r10.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r9 = android.text.TextUtils.isEmpty(r7);
        if (r9 != 0) goto L_0x0183;
    L_0x017e:
        r2.setText(r7);
        if (r8 == 0) goto L_0x0188;
    L_0x0183:
        r7 = 8;
        r2.setVisibility(r7);
    L_0x0188:
        r2 = android.text.TextUtils.isEmpty(r6);
        if (r2 != 0) goto L_0x0193;
    L_0x018e:
        r1.setText(r6);
        if (r8 == 0) goto L_0x0198;
    L_0x0193:
        r2 = 8;
        r1.setVisibility(r2);
    L_0x0198:
        r1 = android.text.TextUtils.isEmpty(r5);
        if (r1 != 0) goto L_0x01a3;
    L_0x019e:
        r3.setText(r5);
        if (r8 == 0) goto L_0x01a8;
    L_0x01a3:
        r1 = 8;
        r3.setVisibility(r1);
    L_0x01a8:
        r2 = r10.e;
        r6 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r1 >= 0) goto L_0x01d3;
    L_0x01b1:
        r1 = 2131427934; // 0x7f0b025e float:1.8477498E38 double:1.053065319E-314;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r2 = 2130838752; // 0x7f0204e0 float:1.7282495E38 double:1.052774224E-314;
        r1.setImageResource(r2);
        r1 = 2131624828; // 0x7f0e037c float:1.8876847E38 double:1.0531625973E-314;
        r2 = 0;
        r3 = 0;
        r5 = 0;
        r6 = r0.getTextSize();
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = r6 / r7;
        r6 = (int) r6;
        r0.setPadding(r2, r3, r5, r6);
        if (r8 == 0) goto L_0x01d6;
    L_0x01d3:
        r1 = 2131624829; // 0x7f0e037d float:1.8876849E38 double:1.053162598E-314;
    L_0x01d6:
        if (r8 == 0) goto L_0x020c;
    L_0x01d8:
        r1 = 2131427936; // 0x7f0b0260 float:1.8477502E38 double:1.05306532E-314;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 10;
        r3 = 32;
        r2 = r4.replace(r2, r3);
        r1.setText(r2);
        r2 = r10.e;
        r4 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x0209;
    L_0x01f5:
        r1 = 2131427934; // 0x7f0b025e float:1.8477498E38 double:1.053065319E-314;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r2 = 2130838753; // 0x7f0204e1 float:1.7282497E38 double:1.0527742247E-314;
        r1.setImageResource(r2);
        r1 = 2131624828; // 0x7f0e037c float:1.8876847E38 double:1.0531625973E-314;
        if (r8 == 0) goto L_0x020c;
    L_0x0209:
        r1 = 2131624829; // 0x7f0e037d float:1.8876849E38 double:1.053162598E-314;
    L_0x020c:
        r2 = r10.g;
        r2 = com.whatsapp.App.t(r2);
        if (r2 == 0) goto L_0x0223;
    L_0x0214:
        r3 = r10.g;
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r4[r5] = r2;
        r1 = r3.getString(r1, r4);
        r0.setText(r1);
    L_0x0223:
        if (r11 != 0) goto L_0x026e;
    L_0x0225:
        r0 = 0;
    L_0x0226:
        r10.a(r0);
        r0 = r10.g;
        r1 = 2131427932; // 0x7f0b025c float:1.8477494E38 double:1.053065318E-314;
        r1 = r10.findViewById(r1);
        com.whatsapp.RegisterName.a(r0, r1);
        r0 = r10.g;
        r0 = com.whatsapp.RegisterName.j(r0);
        if (r0 == 0) goto L_0x024b;
    L_0x023d:
        r0 = r10.g;
        r0 = com.whatsapp.RegisterName.j(r0);
        r1 = new com.whatsapp.anf;
        r1.<init>(r10);
        r0.setOnClickListener(r1);
    L_0x024b:
        return;
    L_0x024c:
        r1 = 2131558447; // 0x7f0d002f float:1.874221E38 double:1.053129801E-314;
        goto L_0x00a5;
    L_0x0251:
        r1 = 2131558427; // 0x7f0d001b float:1.874217E38 double:1.053129791E-314;
        goto L_0x00d4;
    L_0x0256:
        r1 = 2131558411; // 0x7f0d000b float:1.8742137E38 double:1.053129783E-314;
        goto L_0x00ff;
    L_0x025b:
        r2 = "";
        r7 = r2;
        goto L_0x0154;
    L_0x0260:
        r2 = r3 + 1;
        r2 = r4.substring(r2);
        r6 = r2;
        goto L_0x015d;
    L_0x0269:
        r2 = "";
        r5 = r2;
        goto L_0x0166;
    L_0x026e:
        r0 = z;
        r1 = 1;
        r0 = r0[r1];
        r0 = r11.getInt(r0);
        goto L_0x0226;
    L_0x0278:
        r4 = r1;
        goto L_0x0132;
    L_0x027b:
        r2 = r1;
        goto L_0x00a0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lv.onCreate(android.os.Bundle):void");
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            onSaveInstanceState.putInt(z[3], this.d);
        }
        return onSaveInstanceState;
    }

    public lv(RegisterName registerName) {
        this.g = registerName;
        super(registerName, R.layout.payment_education);
        this.d = 0;
        this.c = new atq(this);
    }
}
