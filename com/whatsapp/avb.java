package com.whatsapp;

import android.widget.BaseAdapter;

class avb extends BaseAdapter {
    final MessageDetailsActivity a;

    avb(MessageDetailsActivity messageDetailsActivity, gm gmVar) {
        this(messageDetailsActivity);
    }

    public Object getItem(int i) {
        return null;
    }

    private avb(MessageDetailsActivity messageDetailsActivity) {
        this.a = messageDetailsActivity;
    }

    public int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
        r10_this = this;
        r4 = com.whatsapp.App.az;
        if (r12 != 0) goto L_0x0014;
    L_0x0004:
        r0 = r10.a;
        r0 = r0.getLayoutInflater();
        r1 = 2130903173; // 0x7f030085 float:1.7413157E38 double:1.0528060524E-314;
        r2 = 0;
        r0 = com.whatsapp.b7.a(r0, r1, r13, r2);
        if (r4 == 0) goto L_0x0103;
    L_0x0014:
        r0 = r10.a;
        r0 = com.whatsapp.MessageDetailsActivity.h(r0);
        r1 = 0;
        r0 = r0.get(r1);
        r0 = (com.whatsapp.xx) r0;
        r5 = r0.b;
        r0 = 2131427894; // 0x7f0b0236 float:1.8477417E38 double:1.053065299E-314;
        r0 = r12.findViewById(r0);
        r1 = r10.a;
        r1 = com.whatsapp.MessageDetailsActivity.d(r1);
        r1 = r1.j;
        r2 = 2;
        if (r1 != r2) goto L_0x0046;
    L_0x0035:
        r1 = r10.a;
        r1 = com.whatsapp.MessageDetailsActivity.d(r1);
        r1 = r1.w;
        r2 = 1;
        if (r1 != r2) goto L_0x0046;
    L_0x0040:
        r1 = 0;
        r0.setVisibility(r1);
        if (r4 == 0) goto L_0x004b;
    L_0x0046:
        r1 = 8;
        r0.setVisibility(r1);
    L_0x004b:
        r0 = 2131427896; // 0x7f0b0238 float:1.8477421E38 double:1.0530653E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = r10.a;
        r1 = com.whatsapp.MessageDetailsActivity.d(r1);
        r1 = r1.j;
        if (r1 != 0) goto L_0x00fe;
    L_0x005e:
        r1 = 2131624535; // 0x7f0e0257 float:1.8876252E38 double:1.0531624526E-314;
    L_0x0061:
        r0.setText(r1);
        r0 = 2131427899; // 0x7f0b023b float:1.8477427E38 double:1.0530653015E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131427898; // 0x7f0b023a float:1.8477425E38 double:1.053065301E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 2131427897; // 0x7f0b0239 float:1.8477423E38 double:1.0530653005E-314;
        r2 = r12.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r3 = 2131427895; // 0x7f0b0237 float:1.847742E38 double:1.0530652995E-314;
        r3 = r12.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r6 = r10.a;
        r7 = r10.a;
        r7 = com.whatsapp.MessageDetailsActivity.d(r7);
        r8 = r7.D;
        r6 = com.whatsapp.MessageDetailsActivity.a(r6, r8);
        r0.setText(r6);
        r0 = 5;
        r6 = r5.a(r0);
        r8 = 0;
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x00b4;
    L_0x00a4:
        r0 = r10.a;
        r6 = 5;
        r6 = r5.a(r6);
        r0 = com.whatsapp.MessageDetailsActivity.a(r0, r6);
        r1.setText(r0);
        if (r4 == 0) goto L_0x00b9;
    L_0x00b4:
        r0 = "\u2014";
        r1.setText(r0);
    L_0x00b9:
        r0 = 13;
        r0 = r5.a(r0);
        r6 = 0;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x00d6;
    L_0x00c5:
        r0 = r10.a;
        r1 = 13;
        r6 = r5.a(r1);
        r0 = com.whatsapp.MessageDetailsActivity.a(r0, r6);
        r2.setText(r0);
        if (r4 == 0) goto L_0x00db;
    L_0x00d6:
        r0 = "\u2014";
        r2.setText(r0);
    L_0x00db:
        r0 = 8;
        r0 = r5.a(r0);
        r6 = 0;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x00f8;
    L_0x00e7:
        r0 = r10.a;
        r1 = 8;
        r6 = r5.a(r1);
        r0 = com.whatsapp.MessageDetailsActivity.a(r0, r6);
        r3.setText(r0);
        if (r4 == 0) goto L_0x00fd;
    L_0x00f8:
        r0 = "\u2014";
        r3.setText(r0);
    L_0x00fd:
        return r12;
    L_0x00fe:
        r1 = 2131624537; // 0x7f0e0259 float:1.8876257E38 double:1.0531624536E-314;
        goto L_0x0061;
    L_0x0103:
        r12 = r0;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.avb.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        return 1;
    }
}
