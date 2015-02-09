package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.util.a5;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class hc extends ArrayAdapter {
    private static final String z;
    final GroupChatInfo a;
    public LayoutInflater b;

    static {
        char[] toCharArray = "\u000f%\u0017\u000bx.\"J\u001d`?xW\u0019d".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 79;
                    break;
                case ay.f /*1*/:
                    i2 = 86;
                    break;
                case ay.n /*2*/:
                    i2 = 57;
                    break;
                case ay.p /*3*/:
                    i2 = 124;
                    break;
                default:
                    i2 = 16;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private boolean a(int i) {
        return App.P.h(((m8) GroupChatInfo.l(this.a).get(i)).e);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
        /*
        r11_this = this;
        r6 = com.whatsapp.App.az;
        if (r13 != 0) goto L_0x0010;
    L_0x0004:
        r0 = r11.b;
        r1 = 2130903148; // 0x7f03006c float:1.7413106E38 double:1.05280604E-314;
        r2 = 0;
        r0 = com.whatsapp.b7.a(r0, r1, r14, r2);
        if (r6 == 0) goto L_0x01ab;
    L_0x0010:
        r0 = r11.getCount();
        r0 = r0 + -1;
        if (r12 != r0) goto L_0x0038;
    L_0x0018:
        r0 = r11.a;
        r0 = com.whatsapp.GroupChatInfo.b(r0);
        r0 = com.whatsapp.bd.e(r0);
        if (r0 != 0) goto L_0x0038;
    L_0x0024:
        r0 = 2130839001; // 0x7f0205d9 float:1.7283E38 double:1.052774347E-314;
        r13.setBackgroundResource(r0);
        r0 = 2131427543; // 0x7f0b00d7 float:1.8476705E38 double:1.0530651256E-314;
        r0 = r13.findViewById(r0);
        r1 = 8;
        r0.setVisibility(r1);
        if (r6 == 0) goto L_0x0049;
    L_0x0038:
        r0 = 2130839003; // 0x7f0205db float:1.7283004E38 double:1.052774348E-314;
        r13.setBackgroundResource(r0);
        r0 = 2131427543; // 0x7f0b00d7 float:1.8476705E38 double:1.0530651256E-314;
        r0 = r13.findViewById(r0);
        r1 = 0;
        r0.setVisibility(r1);
    L_0x0049:
        r0 = 2131427637; // 0x7f0b0135 float:1.8476896E38 double:1.053065172E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131427535; // 0x7f0b00cf float:1.847669E38 double:1.0530651216E-314;
        r1 = r13.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 2131427819; // 0x7f0b01eb float:1.8477265E38 double:1.053065262E-314;
        r2 = r13.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r3 = 2131427820; // 0x7f0b01ec float:1.8477267E38 double:1.0530652625E-314;
        r3 = r13.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r4 = 2131427821; // 0x7f0b01ed float:1.847727E38 double:1.053065263E-314;
        r4 = r13.findViewById(r4);
        r4 = (android.widget.TextView) r4;
        r5 = 0;
        r0.setText(r5);
        r5 = r11.a;
        r5 = r5.getResources();
        r7 = 2131296299; // 0x7f09002b float:1.821051E38 double:1.0530002824E-314;
        r5 = r5.getColor(r7);
        r0.setTextColor(r5);
        r5 = 0;
        r1.setText(r5);
        r5 = r11.a;
        r5 = r5.getResources();
        r7 = 2131296298; // 0x7f09002a float:1.8210509E38 double:1.053000282E-314;
        r5 = r5.getColor(r7);
        r1.setTextColor(r5);
        com.whatsapp.am1.b(r1);
        r5 = 8;
        r3.setVisibility(r5);
        r5 = 8;
        r4.setVisibility(r5);
        r5 = r11.a(r12);
        if (r5 == 0) goto L_0x0114;
    L_0x00b1:
        r5 = 0;
        r13.setTag(r5);
        r5 = r11.a;
        r7 = 2131625135; // 0x7f0e04af float:1.887747E38 double:1.053162749E-314;
        r5 = r5.getString(r7);
        r0.setText(r5);
        r5 = com.whatsapp.App.aY;
        if (r5 != 0) goto L_0x00ee;
    L_0x00c5:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r7 = com.whatsapp.App.af();
        r5 = r5.append(r7);
        r7 = z;
        r5 = r5.append(r7);
        r5 = r5.toString();
        r8 = 0;
        r7 = new android.os.Messenger;
        r10 = r11.a;
        r10 = com.whatsapp.GroupChatInfo.g(r10);
        r7.<init>(r10);
        com.whatsapp.App.a(r5, r8, r7);
        if (r6 == 0) goto L_0x00f3;
    L_0x00ee:
        r5 = com.whatsapp.App.as;
        r11.a(r1, r5);
    L_0x00f3:
        r5 = r11.a;
        r5 = com.whatsapp.GroupChatInfo.b(r5);
        r5 = com.whatsapp.bd.e(r5);
        if (r5 == 0) goto L_0x0103;
    L_0x00ff:
        r5 = 0;
        r3.setVisibility(r5);
    L_0x0103:
        r5 = r11.a;
        r5 = com.whatsapp.GroupChatInfo.s(r5);
        r7 = com.whatsapp.App.P;
        r7 = r7.d();
        r5.b(r7, r2);
        if (r6 == 0) goto L_0x01a8;
    L_0x0114:
        r5 = r11.getItem(r12);
        r5 = (com.whatsapp.m8) r5;
        r13.setTag(r5);
        r7 = r11.a;
        r7 = r5.a(r7);
        r0.setText(r7);
        r7 = r11.a;
        r7 = com.whatsapp.GroupChatInfo.p(r7);
        r8 = r5.e;
        r7 = r7.containsKey(r8);
        if (r7 == 0) goto L_0x0162;
    L_0x0134:
        r7 = 2130838846; // 0x7f02053e float:1.7282686E38 double:1.0527742706E-314;
        r2.setImageResource(r7);
        r7 = r11.a;
        r7 = r7.getResources();
        r8 = 2131296285; // 0x7f09001d float:1.8210482E38 double:1.0530002755E-314;
        r7 = r7.getColor(r8);
        r0.setTextColor(r7);
        r0 = r11.a;
        r0 = r0.getResources();
        r7 = 2131296285; // 0x7f09001d float:1.8210482E38 double:1.0530002755E-314;
        r0 = r0.getColor(r7);
        r1.setTextColor(r0);
        r0 = 2131625008; // 0x7f0e0430 float:1.8877212E38 double:1.0531626863E-314;
        r1.setText(r0);
        if (r6 == 0) goto L_0x01a8;
    L_0x0162:
        r0 = r11.a;
        r0 = com.whatsapp.GroupChatInfo.b(r0);
        r6 = r5.e;
        r0 = com.whatsapp.bd.c(r0, r6);
        if (r0 == 0) goto L_0x0174;
    L_0x0170:
        r0 = 0;
        r3.setVisibility(r0);
    L_0x0174:
        r0 = r11.a;
        r0 = com.whatsapp.GroupChatInfo.s(r0);
        r0.b(r5, r2);
        r0 = r5.h();
        if (r0 == 0) goto L_0x01a3;
    L_0x0183:
        r0 = 0;
        r4.setVisibility(r0);
        r0 = r5.t;
        if (r0 == 0) goto L_0x01a9;
    L_0x018b:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = "~";
        r0 = r0.append(r2);
        r2 = r5.t;
        r0 = r0.append(r2);
        r0 = r0.toString();
    L_0x01a0:
        r11.a(r4, r0);
    L_0x01a3:
        r0 = r5.b;
        r11.a(r1, r0);
    L_0x01a8:
        return r13;
    L_0x01a9:
        r0 = 0;
        goto L_0x01a0;
    L_0x01ab:
        r13 = r0;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.hc.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    private void a(TextView textView, String str) {
        textView.setText(a5.b(str, this.a.getBaseContext(), textView.getPaint()));
    }

    public hc(GroupChatInfo groupChatInfo, Context context, List list) {
        this.a = groupChatInfo;
        super(context, R.layout.group_chat_info_row, list);
        this.b = LayoutInflater.from(context);
    }

    public int getCount() {
        return GroupChatInfo.l(this.a).size();
    }
}
