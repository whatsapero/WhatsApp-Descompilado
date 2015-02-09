package com.whatsapp;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.whatsapp.protocol.b;
import java.util.ArrayList;
import java.util.List;

class be extends ArrayAdapter {
    final CallLogActivity a;
    protected List b;

    public int getViewTypeCount() {
        return 1;
    }

    public be(CallLogActivity callLogActivity, Context context, int i) {
        this.a = callLogActivity;
        super(context, i, (List) null);
        this.b = new ArrayList();
    }

    public Object getItem(int i) {
        return a(i);
    }

    public void a(List list) {
        this.b = list;
        notifyDataSetChanged();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
        r10_this = this;
        r9 = 8;
        r8 = 0;
        r4 = com.whatsapp.App.az;
        if (r12 != 0) goto L_0x0016;
    L_0x0007:
        r0 = r10.a;
        r0 = r0.getLayoutInflater();
        r1 = 2130903079; // 0x7f030027 float:1.7412966E38 double:1.052806006E-314;
        r0 = com.whatsapp.b7.a(r0, r1, r13, r8);
        if (r4 == 0) goto L_0x00ac;
    L_0x0016:
        r0 = 2131427543; // 0x7f0b00d7 float:1.8476705E38 double:1.0530651256E-314;
        r0 = r12.findViewById(r0);
        r1 = r10.getCount();
        r1 = r1 + -1;
        if (r11 != r1) goto L_0x0030;
    L_0x0025:
        r1 = 2130839001; // 0x7f0205d9 float:1.7283E38 double:1.052774347E-314;
        r12.setBackgroundResource(r1);
        r0.setVisibility(r9);
        if (r4 == 0) goto L_0x0039;
    L_0x0030:
        r1 = 2130839003; // 0x7f0205db float:1.7283004E38 double:1.052774348E-314;
        r12.setBackgroundResource(r1);
        r0.setVisibility(r8);
    L_0x0039:
        r5 = r10.a(r11);
        r0 = 2131427539; // 0x7f0b00d3 float:1.8476697E38 double:1.0530651236E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = 2131427541; // 0x7f0b00d5 float:1.8476701E38 double:1.0530651246E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 2131427542; // 0x7f0b00d6 float:1.8476703E38 double:1.053065125E-314;
        r2 = r12.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r3 = 2131427540; // 0x7f0b00d4 float:1.84767E38 double:1.053065124E-314;
        r3 = r12.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r6 = com.whatsapp.CallLogActivity.a(r5);
        r0.setImageResource(r6);
        r0 = com.whatsapp.CallLogActivity.b(r5);
        r1.setText(r0);
        r0 = r10.a;
        r0 = r0.getBaseContext();
        r6 = com.whatsapp.App.f(r5);
        r1 = 1;
        r0 = android.text.format.DateUtils.formatDateTime(r0, r6, r1);
        r2.setText(r0);
        r0 = r5.p;
        if (r0 <= 0) goto L_0x0094;
    L_0x0085:
        r0 = r5.p;
        r0 = (long) r0;
        r0 = android.text.format.DateUtils.formatElapsedTime(r0);
        r3.setText(r0);
        r3.setVisibility(r8);
        if (r4 == 0) goto L_0x00a8;
    L_0x0094:
        r0 = r5.e;
        r0 = r0.b;
        if (r0 == 0) goto L_0x00a5;
    L_0x009a:
        r0 = 2131624045; // 0x7f0e006d float:1.8875259E38 double:1.0531622105E-314;
        r3.setText(r0);
        r3.setVisibility(r8);
        if (r4 == 0) goto L_0x00a8;
    L_0x00a5:
        r3.setVisibility(r9);
    L_0x00a8:
        com.whatsapp.am1.b(r3);
        return r12;
    L_0x00ac:
        r12 = r0;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.be.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public b a(int i) {
        return (b) this.b.get(i);
    }

    public int getCount() {
        return this.b == null ? 0 : this.b.size();
    }
}
