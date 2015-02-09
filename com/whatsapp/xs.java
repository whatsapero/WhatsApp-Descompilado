package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;

class xs extends ArrayAdapter {
    private LayoutInflater a;
    protected List b;
    final ContactInfo c;

    public xs(ContactInfo contactInfo, Context context, int i) {
        this.c = contactInfo;
        super(context, i, (List) null);
        this.a = LayoutInflater.from(context);
        this.b = new ArrayList();
    }

    public int getViewTypeCount() {
        return 1;
    }

    public Object getItem(int i) {
        return a(i);
    }

    public int getCount() {
        return this.b == null ? 0 : this.b.size();
    }

    public m8 a(int i) {
        return (m8) this.b.get(i);
    }

    public void a(List list) {
        this.b = list;
        notifyDataSetChanged();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
        r5_this = this;
        r4 = 2131427543; // 0x7f0b00d7 float:1.8476705E38 double:1.0530651256E-314;
        r3 = 0;
        r1 = com.whatsapp.App.az;
        if (r7 != 0) goto L_0x0013;
    L_0x0008:
        r0 = r5.a;
        r2 = 2130903186; // 0x7f030092 float:1.7413183E38 double:1.052806059E-314;
        r0 = com.whatsapp.b7.a(r0, r2, r8, r3);
        if (r1 == 0) goto L_0x0080;
    L_0x0013:
        r0 = r5.getCount();
        r0 = r0 + -1;
        if (r6 != r0) goto L_0x002c;
    L_0x001b:
        r0 = 2130839001; // 0x7f0205d9 float:1.7283E38 double:1.052774347E-314;
        r7.setBackgroundResource(r0);
        r0 = r7.findViewById(r4);
        r2 = 8;
        r0.setVisibility(r2);
        if (r1 == 0) goto L_0x0039;
    L_0x002c:
        r0 = 2130839003; // 0x7f0205db float:1.7283004E38 double:1.052774348E-314;
        r7.setBackgroundResource(r0);
        r0 = r7.findViewById(r4);
        r0.setVisibility(r3);
    L_0x0039:
        r2 = r5.a(r6);
        r0 = 2131427637; // 0x7f0b0135 float:1.8476896E38 double:1.053065172E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131427535; // 0x7f0b00cf float:1.847669E38 double:1.0530651216E-314;
        r1 = r7.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        com.whatsapp.am1.b(r1);
        r3 = r5.c;
        r3 = r2.a(r3);
        r4 = r5.c;
        r3 = com.whatsapp.util.a5.d(r3, r4);
        r0.setText(r3);
        r0 = r2.e;
        r0 = com.whatsapp.bd.h(r0);
        r1.setText(r0);
        r0 = 2131427819; // 0x7f0b01eb float:1.8477265E38 double:1.053065262E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = r5.c;
        r1 = com.whatsapp.ContactInfo.f(r1);
        r1.b(r2, r0);
        r7.setTag(r2);
        return r7;
    L_0x0080:
        r7 = r0;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.xs.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
