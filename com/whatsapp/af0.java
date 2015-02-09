package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

class af0 extends BaseAdapter {
    public LayoutInflater a;
    final BroadcastDetails b;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        return BroadcastDetails.d(this.b).length;
    }

    public int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
        r10_this = this;
        r1 = 2130838975; // 0x7f0205bf float:1.7282947E38 double:1.0527743344E-314;
        r9 = 5;
        r3 = com.whatsapp.App.az;
        if (r12 != 0) goto L_0x0014;
    L_0x0008:
        r0 = r10.a;
        r2 = 2130903077; // 0x7f030025 float:1.7412962E38 double:1.052806005E-314;
        r4 = 0;
        r0 = com.whatsapp.b7.a(r0, r2, r13, r4);
        if (r3 == 0) goto L_0x00e1;
    L_0x0014:
        r0 = 2131427535; // 0x7f0b00cf float:1.847669E38 double:1.0530651216E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r2 = r10.b;
        r2 = com.whatsapp.BroadcastDetails.e(r2);
        r2 = r2.a;
        r2 = com.whatsapp.protocol.f.a(r2, r9);
        if (r2 < 0) goto L_0x002d;
    L_0x002b:
        if (r3 == 0) goto L_0x0068;
    L_0x002d:
        r2 = r10.b;
        r2 = com.whatsapp.BroadcastDetails.e(r2);
        r2 = r2.a;
        r4 = 4;
        if (r2 != r4) goto L_0x0065;
    L_0x0038:
        r2 = 2130838979; // 0x7f0205c3 float:1.7282956E38 double:1.0527743363E-314;
        r4 = com.whatsapp.App.aJ;
        r5 = new com.whatsapp.protocol.m;
        r6 = r10.b;
        r6 = com.whatsapp.BroadcastDetails.d(r6);
        r6 = r6[r11];
        r7 = 1;
        r8 = r10.b;
        r8 = com.whatsapp.BroadcastDetails.e(r8);
        r8 = r8.e;
        r8 = r8.a;
        r5.<init>(r6, r7, r8);
        r4 = r4.b(r5);
        if (r4 == 0) goto L_0x00df;
    L_0x005b:
        r4 = r4.a;
        r4 = com.whatsapp.protocol.f.a(r4, r9);
        if (r4 < 0) goto L_0x00df;
    L_0x0063:
        if (r3 == 0) goto L_0x0068;
    L_0x0065:
        r1 = 2130838976; // 0x7f0205c0 float:1.728295E38 double:1.052774335E-314;
    L_0x0068:
        r0.setImageResource(r1);
        r0 = com.whatsapp.App.P;
        r1 = r10.b;
        r1 = com.whatsapp.BroadcastDetails.d(r1);
        r1 = r1[r11];
        r1 = r0.a(r1);
        r0 = 2131427534; // 0x7f0b00ce float:1.8476687E38 double:1.053065121E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r2 = r10.b;
        r2 = com.whatsapp.BroadcastDetails.b(r2);
        r2.b(r1, r0);
        r0 = 2131427536; // 0x7f0b00d0 float:1.8476691E38 double:1.053065122E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r2 = r10.b;
        r2 = r1.a(r2);
        r0.setText(r2);
        r2 = r10.b;
        r2 = r2.getResources();
        r3 = 2131296268; // 0x7f09000c float:1.8210448E38 double:1.053000267E-314;
        r2 = r2.getColor(r3);
        r0.setTextColor(r2);
        r0 = 2131427537; // 0x7f0b00d1 float:1.8476693E38 double:1.0530651226E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        if (r0 == 0) goto L_0x00db;
    L_0x00b8:
        r2 = r10.b;
        r2 = r2.getResources();
        r3 = 2131296286; // 0x7f09001e float:1.8210484E38 double:1.053000276E-314;
        r2 = r2.getColor(r3);
        r0.setTextColor(r2);
        r2 = r1.b;
        r3 = r10.b;
        r3 = r3.getBaseContext();
        r4 = r0.getPaint();
        r2 = com.whatsapp.util.a5.b(r2, r3, r4);
        r0.setText(r2);
    L_0x00db:
        r12.setTag(r1);
        return r12;
    L_0x00df:
        r1 = r2;
        goto L_0x0063;
    L_0x00e1:
        r12 = r0;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.af0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public Object getItem(int i) {
        return BroadcastDetails.d(this.b)[i];
    }

    public af0(BroadcastDetails broadcastDetails, Context context) {
        this.b = broadcastDetails;
        this.a = LayoutInflater.from(context);
    }
}
