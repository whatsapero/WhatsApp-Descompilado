package com.whatsapp;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class oe extends ArrayAdapter {
    private static final String[] z;
    final MultipleContactPicker a;

    static {
        String[] strArr = new String[4];
        String str = "\u0000i";
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
                        i3 = 32;
                        break;
                    case ay.f /*1*/:
                        i3 = 73;
                        break;
                    case ay.n /*2*/:
                        i3 = 44;
                        break;
                    case ay.p /*3*/:
                        i3 = 112;
                        break;
                    default:
                        i3 = 31;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0000i";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0000i";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0000i";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public oe(MultipleContactPicker multipleContactPicker, Context context, int i, List list) {
        this.a = multipleContactPicker;
        super(context, i, list);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
        r10_this = this;
        r4 = com.whatsapp.App.az;
        r0 = r10.getItem(r11);
        r0 = (com.whatsapp.m8) r0;
        r1 = com.whatsapp.MultipleContactPicker.a(r0);
        if (r1 == 0) goto L_0x0025;
    L_0x000e:
        r0 = r10.a;
        r0 = r0.getLayoutInflater();
        r1 = 2130903178; // 0x7f03008a float:1.7413167E38 double:1.052806055E-314;
        r2 = 0;
        r12 = com.whatsapp.b7.a(r0, r1, r13, r2);
        r0 = 2;
        r0 = java.lang.Integer.valueOf(r0);
        r12.setTag(r0);
    L_0x0024:
        return r12;
    L_0x0025:
        if (r12 == 0) goto L_0x0036;
    L_0x0027:
        r1 = r12.getTag();
        r1 = (java.lang.Integer) r1;
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
        r2 = 1;
        if (r1 == r2) goto L_0x0046;
    L_0x0036:
        r1 = r10.a;
        r1 = r1.getLayoutInflater();
        r2 = 2130903177; // 0x7f030089 float:1.7413165E38 double:1.0528060544E-314;
        r3 = 0;
        r1 = com.whatsapp.b7.a(r1, r2, r13, r3);
        if (r4 == 0) goto L_0x01b9;
    L_0x0046:
        r1 = 1;
        r1 = java.lang.Integer.valueOf(r1);
        r12.setTag(r1);
        r1 = 2131427534; // 0x7f0b00ce float:1.8476687E38 double:1.053065121E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r2 = r10.a;
        r2 = com.whatsapp.MultipleContactPicker.g(r2);
        r2.b(r0, r1);
        r1 = 2131427913; // 0x7f0b0249 float:1.8477456E38 double:1.0530653084E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        com.whatsapp.am1.a(r1);
        r2 = r10.getContext();
        r2 = r0.a(r2);
        r3 = r10.a;
        r3 = com.whatsapp.MultipleContactPicker.c(r3);
        r3 = r3.getText();
        r3 = r3.toString();
        r3 = r3.toLowerCase();
        r5 = android.text.TextUtils.isEmpty(r3);
        if (r5 == 0) goto L_0x0091;
    L_0x008c:
        r1.setText(r2);
        if (r4 == 0) goto L_0x00fe;
    L_0x0091:
        r5 = new android.text.SpannableStringBuilder;
        r5.<init>(r2);
        r6 = r2.toLowerCase();
        r6 = r6.startsWith(r3);
        if (r6 == 0) goto L_0x00be;
    L_0x00a0:
        r6 = new android.text.style.ForegroundColorSpan;
        r7 = r10.a;
        r7 = r7.getResources();
        r8 = 2131296306; // 0x7f090032 float:1.8210525E38 double:1.053000286E-314;
        r7 = r7.getColor(r8);
        r6.<init>(r7);
        r7 = 0;
        r8 = r3.length();
        r9 = 33;
        r5.setSpan(r6, r7, r8, r9);
        if (r4 == 0) goto L_0x00fb;
    L_0x00be:
        r2 = r2.toLowerCase();
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = " ";
        r6 = r6.append(r7);
        r6 = r6.append(r3);
        r6 = r6.toString();
        r2 = r2.indexOf(r6);
        if (r2 <= 0) goto L_0x00fb;
    L_0x00db:
        r6 = new android.text.style.ForegroundColorSpan;
        r7 = r10.a;
        r7 = r7.getResources();
        r8 = 2131296306; // 0x7f090032 float:1.8210525E38 double:1.053000286E-314;
        r7 = r7.getColor(r8);
        r6.<init>(r7);
        r7 = r2 + 1;
        r2 = r2 + 1;
        r3 = r3.length();
        r2 = r2 + r3;
        r3 = 33;
        r5.setSpan(r6, r7, r2, r3);
    L_0x00fb:
        r1.setText(r5);
    L_0x00fe:
        r2 = 2131427914; // 0x7f0b024a float:1.8477458E38 double:1.053065309E-314;
        r2 = r12.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r3 = r0.b;
        if (r3 == 0) goto L_0x01ac;
    L_0x010b:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r5 = r0.b;
        r3 = r3.append(r5);
        r5 = z;
        r6 = 0;
        r5 = r5[r6];
        r3 = r3.append(r5);
        r3 = r3.toString();
    L_0x0123:
        r2.setText(r3);
        r3 = r0.e;
        r3 = com.whatsapp.App.c(r3);
        if (r3 == 0) goto L_0x014c;
    L_0x012e:
        r3 = 2131625010; // 0x7f0e0432 float:1.8877216E38 double:1.0531626873E-314;
        r2.setText(r3);
        r3 = -7829368; // 0xffffffffff888888 float:NaN double:NaN;
        r1.setTextColor(r3);
        r3 = 1;
        r12.setLongClickable(r3);
        r3 = 2131427912; // 0x7f0b0248 float:1.8477454E38 double:1.053065308E-314;
        r3 = r12.findViewById(r3);
        r5 = 8;
        r3.setVisibility(r5);
        if (r4 == 0) goto L_0x0189;
    L_0x014c:
        r3 = r0.b;
        if (r3 == 0) goto L_0x01b3;
    L_0x0150:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = r0.b;
        r3 = r3.append(r4);
        r4 = z;
        r5 = 1;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.toString();
    L_0x0168:
        r4 = r10.a;
        r4 = r4.getBaseContext();
        r3 = com.whatsapp.util.a5.c(r3, r4);
        r2.setText(r3);
        r2 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r1.setTextColor(r2);
        r1 = 0;
        r12.setLongClickable(r1);
        r1 = 2131427912; // 0x7f0b0248 float:1.8477454E38 double:1.053065308E-314;
        r1 = r12.findViewById(r1);
        r2 = 0;
        r1.setVisibility(r2);
    L_0x0189:
        r1 = 2131427912; // 0x7f0b0248 float:1.8477454E38 double:1.053065308E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.CheckBox) r1;
        r2 = new com.whatsapp.lq;
        r2.<init>(r10);
        r1.setOnClickListener(r2);
        r2 = r0.k;
        r1.setChecked(r2);
        r1.setTag(r0);
        r0 = new com.whatsapp.p;
        r0.<init>(r10);
        r12.setOnClickListener(r0);
        goto L_0x0024;
    L_0x01ac:
        r3 = z;
        r5 = 3;
        r3 = r3[r5];
        goto L_0x0123;
    L_0x01b3:
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        goto L_0x0168;
    L_0x01b9:
        r12 = r1;
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.oe.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
