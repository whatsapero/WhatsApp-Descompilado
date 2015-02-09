package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ts extends ArrayAdapter {
    private static final String[] z;
    final ContactPicker a;
    private Filter b;
    private LayoutInflater c;
    protected ArrayList d;

    static {
        String[] strArr = new String[5];
        String str = "sp\u001c>2sk\u0002#0{z\u0000e=\u007f@\u0011%=d~\u0011> ?}\u0013.\f`p\u0001#'yp\u001cj";
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
                        i3 = 16;
                        break;
                    case ay.f /*1*/:
                        i3 = 31;
                        break;
                    case ay.n /*2*/:
                        i3 = 114;
                        break;
                    case ay.p /*3*/:
                        i3 = 74;
                        break;
                    default:
                        i3 = 83;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "0?";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "sp\u001c>2sk\u0002#0{z\u0000e:ck\u0017&?qy\u0000#6~{\u0000%$?}\u0013.\f`p\u0001#'yp\u001cj";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "sp\u001c>2sk\u0002#0{z\u0000e:cw\u0017&#bp\u0005e1q{-:<cv\u0006#<~?";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "0?";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private boolean a(int i) {
        if (i < this.d.size() && i >= 0) {
            return ContactPicker.n() == this.d.get(i);
        } else {
            Log.e(z[4] + i);
            return false;
        }
    }

    public m8 c(int i) {
        return (m8) this.d.get(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
        r12_this = this;
        r6 = com.whatsapp.App.az;
        r7 = r12.c(r13);
        r0 = com.whatsapp.ContactPicker.b(r7);
        if (r0 == 0) goto L_0x0032;
    L_0x000c:
        r0 = new android.widget.LinearLayout;
        r1 = r12.getContext();
        r0.<init>(r1);
        r1 = r12.c;
        r2 = 2130903178; // 0x7f03008a float:1.7413167E38 double:1.052806055E-314;
        r3 = 1;
        com.whatsapp.b7.a(r1, r2, r0, r3);
        r1 = 3;
        r1 = java.lang.Integer.valueOf(r1);
        r0.setTag(r1);
        r1 = 2131427915; // 0x7f0b024b float:1.847746E38 double:1.0530653094E-314;
        r1 = r0.findViewById(r1);
        r2 = 1;
        r1.setClickable(r2);
    L_0x0031:
        return r0;
    L_0x0032:
        r2 = r12.d(r13);
        r3 = r12.b(r13);
        r4 = r12.a(r13);
        if (r14 != 0) goto L_0x012c;
    L_0x0040:
        if (r2 != 0) goto L_0x0044;
    L_0x0042:
        if (r4 == 0) goto L_0x008e;
    L_0x0044:
        r0 = r12.c;
        r1 = 2130903098; // 0x7f03003a float:1.7413004E38 double:1.0528060153E-314;
        r5 = 0;
        r1 = com.whatsapp.b7.a(r0, r1, r5);
        if (r2 == 0) goto L_0x005a;
    L_0x0050:
        r0 = 2;
        r0 = java.lang.Integer.valueOf(r0);
        r1.setTag(r0);
        if (r6 == 0) goto L_0x0236;
    L_0x005a:
        r0 = 2131427648; // 0x7f0b0140 float:1.8476918E38 double:1.0530651775E-314;
        r0 = r1.findViewById(r0);
        r5 = 8;
        r0.setVisibility(r5);
        r0 = 2131427650; // 0x7f0b0142 float:1.8476922E38 double:1.0530651785E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r5 = 2131624152; // 0x7f0e00d8 float:1.8875476E38 double:1.0531622633E-314;
        r0.setText(r5);
        r0 = 2131427649; // 0x7f0b0141 float:1.847692E38 double:1.053065178E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r5 = 2130838829; // 0x7f02052d float:1.7282651E38 double:1.052774262E-314;
        r0.setImageResource(r5);
        r0 = 4;
        r0 = java.lang.Integer.valueOf(r0);
        r1.setTag(r0);
        if (r6 == 0) goto L_0x0236;
    L_0x008e:
        if (r3 == 0) goto L_0x0118;
    L_0x0090:
        r0 = r12.c;
        r1 = 2130903096; // 0x7f030038 float:1.7413E38 double:1.0528060144E-314;
        r5 = 0;
        r1 = com.whatsapp.b7.a(r0, r1, r5);
        r0 = new android.widget.AbsListView$LayoutParams;
        r5 = -2;
        r8 = r12.a;
        r8 = r8.getResources();
        r9 = 2131361847; // 0x7f0a0037 float:1.8343458E38 double:1.0530326675E-314;
        r8 = r8.getDimension(r9);
        r8 = (int) r8;
        r0.<init>(r5, r8);
        r5 = 2131427641; // 0x7f0b0139 float:1.8476904E38 double:1.053065174E-314;
        r5 = r1.findViewById(r5);
        r5.setLayoutParams(r0);
        r0 = 2131427643; // 0x7f0b013b float:1.8476908E38 double:1.053065175E-314;
        r0 = r1.findViewById(r0);
        r5 = 1;
        r0.setClickable(r5);
        r0 = r12.d;
        r5 = r12.a;
        r5 = com.whatsapp.ContactPicker.f(r5);
        if (r0 != r5) goto L_0x00e0;
    L_0x00cd:
        r0 = 2131427643; // 0x7f0b013b float:1.8476908E38 double:1.053065175E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r0 = (android.widget.TextView) r0;
        r5 = 2131624145; // 0x7f0e00d1 float:1.8875461E38 double:1.05316226E-314;
        r0.setText(r5);
        if (r6 == 0) goto L_0x010e;
    L_0x00e0:
        r0 = r12.d;
        r5 = r12.a;
        r5 = com.whatsapp.ContactPicker.u(r5);
        if (r0 != r5) goto L_0x00fd;
    L_0x00ea:
        r0 = 2131427643; // 0x7f0b013b float:1.8476908E38 double:1.053065175E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r0 = (android.widget.TextView) r0;
        r5 = 2131624146; // 0x7f0e00d2 float:1.8875463E38 double:1.0531622604E-314;
        r0.setText(r5);
        if (r6 == 0) goto L_0x010e;
    L_0x00fd:
        r0 = 2131427643; // 0x7f0b013b float:1.8476908E38 double:1.053065175E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r0 = (android.widget.TextView) r0;
        r5 = 2131624147; // 0x7f0e00d3 float:1.8875465E38 double:1.053162261E-314;
        r0.setText(r5);
    L_0x010e:
        r0 = 5;
        r0 = java.lang.Integer.valueOf(r0);
        r1.setTag(r0);
        if (r6 == 0) goto L_0x0236;
    L_0x0118:
        r0 = r12.c;
        r1 = 2130903097; // 0x7f030039 float:1.7413002E38 double:1.052806015E-314;
        r5 = 0;
        r14 = com.whatsapp.b7.a(r0, r1, r15, r5);
        r0 = 1;
        r0 = java.lang.Integer.valueOf(r0);
        r14.setTag(r0);
        if (r6 == 0) goto L_0x03de;
    L_0x012c:
        r0 = r14.getTag();
        r0 = (java.lang.Integer) r0;
        r5 = r0.intValue();
        if (r2 == 0) goto L_0x03e1;
    L_0x0138:
        r0 = 2;
        if (r5 == r0) goto L_0x03de;
    L_0x013b:
        r0 = r12.c;
        r1 = 2130903098; // 0x7f03003a float:1.7413004E38 double:1.0528060153E-314;
        r8 = 0;
        r1 = com.whatsapp.b7.a(r0, r1, r8);
        r0 = 2;
        r0 = java.lang.Integer.valueOf(r0);
        r1.setTag(r0);
        if (r6 == 0) goto L_0x0236;
    L_0x014f:
        if (r4 == 0) goto L_0x0192;
    L_0x0151:
        r0 = 4;
        if (r5 == r0) goto L_0x0236;
    L_0x0154:
        r0 = r12.c;
        r1 = 2130903098; // 0x7f03003a float:1.7413004E38 double:1.0528060153E-314;
        r8 = 0;
        r1 = com.whatsapp.b7.a(r0, r1, r8);
        r0 = 2131427649; // 0x7f0b0141 float:1.847692E38 double:1.053065178E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r8 = 2130838829; // 0x7f02052d float:1.7282651E38 double:1.052774262E-314;
        r0.setImageResource(r8);
        r0 = 2131427648; // 0x7f0b0140 float:1.8476918E38 double:1.0530651775E-314;
        r0 = r1.findViewById(r0);
        r8 = 8;
        r0.setVisibility(r8);
        r0 = 2131427650; // 0x7f0b0142 float:1.8476922E38 double:1.0530651785E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r8 = 2131624152; // 0x7f0e00d8 float:1.8875476E38 double:1.0531622633E-314;
        r0.setText(r8);
        r0 = 4;
        r0 = java.lang.Integer.valueOf(r0);
        r1.setTag(r0);
        if (r6 == 0) goto L_0x0236;
    L_0x0192:
        r0 = r1;
        if (r3 == 0) goto L_0x03db;
    L_0x0195:
        r1 = 5;
        if (r5 == r1) goto L_0x01d3;
    L_0x0198:
        r0 = r12.c;
        r1 = 2130903096; // 0x7f030038 float:1.7413E38 double:1.0528060144E-314;
        r8 = 0;
        r0 = com.whatsapp.b7.a(r0, r1, r8);
        r1 = new android.widget.AbsListView$LayoutParams;
        r8 = -2;
        r9 = r12.a;
        r9 = r9.getResources();
        r10 = 2131361847; // 0x7f0a0037 float:1.8343458E38 double:1.0530326675E-314;
        r9 = r9.getDimension(r10);
        r9 = (int) r9;
        r1.<init>(r8, r9);
        r8 = 2131427641; // 0x7f0b0139 float:1.8476904E38 double:1.053065174E-314;
        r8 = r0.findViewById(r8);
        r8.setLayoutParams(r1);
        r1 = 2131427643; // 0x7f0b013b float:1.8476908E38 double:1.053065175E-314;
        r1 = r0.findViewById(r1);
        r8 = 1;
        r1.setClickable(r8);
        r1 = 5;
        r1 = java.lang.Integer.valueOf(r1);
        r0.setTag(r1);
    L_0x01d3:
        r1 = r0;
        r0 = r12.d;
        r8 = r12.a;
        r8 = com.whatsapp.ContactPicker.f(r8);
        if (r0 != r8) goto L_0x01f1;
    L_0x01de:
        r0 = 2131427643; // 0x7f0b013b float:1.8476908E38 double:1.053065175E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r0 = (android.widget.TextView) r0;
        r8 = 2131624145; // 0x7f0e00d1 float:1.8875461E38 double:1.05316226E-314;
        r0.setText(r8);
        if (r6 == 0) goto L_0x0236;
    L_0x01f1:
        r0 = r12.d;
        r8 = r12.a;
        r8 = com.whatsapp.ContactPicker.u(r8);
        if (r0 != r8) goto L_0x020e;
    L_0x01fb:
        r0 = 2131427643; // 0x7f0b013b float:1.8476908E38 double:1.053065175E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r0 = (android.widget.TextView) r0;
        r8 = 2131624146; // 0x7f0e00d2 float:1.8875463E38 double:1.0531622604E-314;
        r0.setText(r8);
        if (r6 == 0) goto L_0x0236;
    L_0x020e:
        r0 = 2131427643; // 0x7f0b013b float:1.8476908E38 double:1.053065175E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r0 = (android.widget.TextView) r0;
        r8 = 2131624147; // 0x7f0e00d3 float:1.8875465E38 double:1.053162261E-314;
        r0.setText(r8);
        if (r6 == 0) goto L_0x0236;
    L_0x0221:
        r0 = 1;
        if (r5 == r0) goto L_0x0236;
    L_0x0224:
        r0 = r12.c;
        r1 = 2130903097; // 0x7f030039 float:1.7413002E38 double:1.052806015E-314;
        r5 = 0;
        r1 = com.whatsapp.b7.a(r0, r1, r15, r5);
        r0 = 1;
        r0 = java.lang.Integer.valueOf(r0);
        r1.setTag(r0);
    L_0x0236:
        r5 = r1;
    L_0x0237:
        if (r2 != 0) goto L_0x023d;
    L_0x0239:
        if (r4 != 0) goto L_0x023d;
    L_0x023b:
        if (r3 == 0) goto L_0x0240;
    L_0x023d:
        r0 = r5;
        goto L_0x0031;
    L_0x0240:
        r0 = 2131427508; // 0x7f0b00b4 float:1.8476634E38 double:1.0530651083E-314;
        r0 = r5.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = r12.a;
        r1 = com.whatsapp.ContactPicker.c(r1);
        r1.b(r7, r0);
        r0 = 2131427645; // 0x7f0b013d float:1.8476912E38 double:1.053065176E-314;
        r0 = r5.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        com.whatsapp.am1.a(r0);
        r1 = 2131427647; // 0x7f0b013f float:1.8476916E38 double:1.053065177E-314;
        r1 = r5.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        com.whatsapp.am1.b(r1);
        r2 = 2131427646; // 0x7f0b013e float:1.8476914E38 double:1.0530651765E-314;
        r2 = r5.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r3 = r12.a;
        r4 = r7.a(r3);
        r3 = 0;
        r8 = r7.w();
        if (r8 != 0) goto L_0x0286;
    L_0x0280:
        r8 = r7.l();
        if (r8 == 0) goto L_0x028c;
    L_0x0286:
        r3 = r12.a;
        r3 = com.whatsapp.util.a5.b(r4, r3);
    L_0x028c:
        r8 = r12.a;
        r8 = com.whatsapp.ContactPicker.v(r8);
        r8 = android.text.TextUtils.isEmpty(r8);
        if (r8 != 0) goto L_0x032b;
    L_0x0298:
        r8 = r4.toLowerCase();
        r9 = r12.a;
        r9 = com.whatsapp.ContactPicker.v(r9);
        r9 = r9.toLowerCase();
        r8 = r8.startsWith(r9);
        if (r8 == 0) goto L_0x02d7;
    L_0x02ac:
        if (r3 != 0) goto L_0x02b3;
    L_0x02ae:
        r3 = new android.text.SpannableStringBuilder;
        r3.<init>(r4);
    L_0x02b3:
        r8 = new android.text.style.ForegroundColorSpan;
        r9 = r12.a;
        r9 = r9.getResources();
        r10 = 2131296306; // 0x7f090032 float:1.8210525E38 double:1.053000286E-314;
        r9 = r9.getColor(r10);
        r8.<init>(r9);
        r9 = 0;
        r10 = r12.a;
        r10 = com.whatsapp.ContactPicker.v(r10);
        r10 = r10.length();
        r11 = 33;
        r3.setSpan(r8, r9, r10, r11);
        if (r6 == 0) goto L_0x032b;
    L_0x02d7:
        r8 = r4.toLowerCase();
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r10 = " ";
        r9 = r9.append(r10);
        r10 = r12.a;
        r10 = com.whatsapp.ContactPicker.v(r10);
        r10 = r10.toLowerCase();
        r9 = r9.append(r10);
        r9 = r9.toString();
        r8 = r8.indexOf(r9);
        if (r8 <= 0) goto L_0x032b;
    L_0x02fe:
        if (r3 != 0) goto L_0x0305;
    L_0x0300:
        r3 = new android.text.SpannableStringBuilder;
        r3.<init>(r4);
    L_0x0305:
        r9 = new android.text.style.ForegroundColorSpan;
        r10 = r12.a;
        r10 = r10.getResources();
        r11 = 2131296306; // 0x7f090032 float:1.8210525E38 double:1.053000286E-314;
        r10 = r10.getColor(r11);
        r9.<init>(r10);
        r10 = r8 + 1;
        r8 = r8 + 1;
        r11 = r12.a;
        r11 = com.whatsapp.ContactPicker.v(r11);
        r11 = r11.length();
        r8 = r8 + r11;
        r11 = 33;
        r3.setSpan(r9, r10, r8, r11);
    L_0x032b:
        if (r3 != 0) goto L_0x032e;
    L_0x032d:
        r3 = r4;
    L_0x032e:
        r0.setText(r3);
        r3 = r7.w();
        if (r3 != 0) goto L_0x033d;
    L_0x0337:
        r3 = r7.l();
        if (r3 == 0) goto L_0x0356;
    L_0x033d:
        r3 = r7.e;
        r3 = com.whatsapp.bd.h(r3);
        r1.setText(r3);
        r3 = "";
        r2.setText(r3);
        r3 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r0.setTextColor(r3);
        r3 = 0;
        r5.setLongClickable(r3);
        if (r6 == 0) goto L_0x03b1;
    L_0x0356:
        r3 = r7.e;
        r3 = com.whatsapp.App.c(r3);
        if (r3 == 0) goto L_0x0370;
    L_0x035e:
        r3 = 2131625010; // 0x7f0e0432 float:1.8877216E38 double:1.0531626873E-314;
        r1.setText(r3);
        r3 = -7829368; // 0xffffffffff888888 float:NaN double:NaN;
        r0.setTextColor(r3);
        r3 = 1;
        r5.setLongClickable(r3);
        if (r6 == 0) goto L_0x03a2;
    L_0x0370:
        r3 = r7.b;
        if (r3 == 0) goto L_0x03d5;
    L_0x0374:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = r7.b;
        r3 = r3.append(r4);
        r4 = z;
        r8 = 2;
        r4 = r4[r8];
        r3 = r3.append(r4);
        r3 = r3.toString();
    L_0x038c:
        r4 = r12.a;
        r4 = r4.getBaseContext();
        r3 = com.whatsapp.util.a5.c(r3, r4);
        r1.setText(r3);
        r1 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r0.setTextColor(r1);
        r0 = 0;
        r5.setLongClickable(r0);
    L_0x03a2:
        r0 = r12.a;
        r0 = r0.getResources();
        r0 = r7.a(r0);
        if (r0 == 0) goto L_0x03b1;
    L_0x03ae:
        r2.setText(r0);
    L_0x03b1:
        r0 = r12.a;
        r0 = com.whatsapp.ContactPicker.e(r0);
        if (r0 == 0) goto L_0x03cf;
    L_0x03b9:
        r0 = r12.a;
        r0 = com.whatsapp.ContactPicker.e(r0);
        r1 = r7.e;
        r0 = r0.containsKey(r1);
        if (r0 == 0) goto L_0x03cf;
    L_0x03c7:
        r0 = 2130837815; // 0x7f020137 float:1.7280595E38 double:1.0527737613E-314;
        r5.setBackgroundResource(r0);
        if (r6 == 0) goto L_0x023d;
    L_0x03cf:
        r0 = 0;
        r5.setBackgroundResource(r0);
        goto L_0x023d;
    L_0x03d5:
        r3 = z;
        r4 = 1;
        r3 = r3[r4];
        goto L_0x038c;
    L_0x03db:
        r1 = r0;
        goto L_0x0221;
    L_0x03de:
        r5 = r14;
        goto L_0x0237;
    L_0x03e1:
        r1 = r14;
        goto L_0x014f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ts.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getCount() {
        return this.d.size();
    }

    public ts(ContactPicker contactPicker, Context context, ArrayList arrayList) {
        this.a = contactPicker;
        super(context, R.layout.contact_picker_row, arrayList);
        this.b = new kb(this, null);
        this.d = arrayList;
        this.c = LayoutInflater.from(context);
    }

    private boolean d(int i) {
        if (i < this.d.size() && i >= 0) {
            return ContactPicker.g() == this.d.get(i);
        } else {
            Log.e(z[3] + i);
            return false;
        }
    }

    public boolean hasStableIds() {
        return true;
    }

    private boolean b(int i) {
        if (i < this.d.size() && i >= 0) {
            return ContactPicker.i() == this.d.get(i);
        } else {
            Log.e(z[0] + i);
            return false;
        }
    }

    static boolean c(ts tsVar, int i) {
        return tsVar.d(i);
    }

    static boolean b(ts tsVar, int i) {
        return tsVar.b(i);
    }

    public Object getItem(int i) {
        return c(i);
    }

    public Filter getFilter() {
        return this.b;
    }

    public long getItemId(int i) {
        return (long) (i * 1024);
    }

    static boolean a(ts tsVar, int i) {
        return tsVar.a(i);
    }
}
