package com.whatsapp;

import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

class m2 extends BaseAdapter implements Filterable {
    final CallsFragment a;
    private Filter b;

    public boolean hasStableIds() {
        return true;
    }

    public long getItemId(int i) {
        return (long) ((lz) CallsFragment.h(this.a).get(i)).hashCode();
    }

    public int getCount() {
        return CallsFragment.h(this.a).size();
    }

    m2(CallsFragment callsFragment, co coVar) {
        this(callsFragment);
    }

    private m2(CallsFragment callsFragment) {
        this.a = callsFragment;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
        r10_this = this;
        r2 = 0;
        r7 = 2131296306; // 0x7f090032 float:1.8210525E38 double:1.053000286E-314;
        r9 = 33;
        r8 = 0;
        r3 = r10.a(r11);
        if (r12 != 0) goto L_0x001a;
    L_0x000d:
        r0 = r10.a;
        r0 = r0.getLayoutInflater(r2);
        r1 = 2130903081; // 0x7f030029 float:1.741297E38 double:1.052806007E-314;
        r12 = com.whatsapp.b7.a(r0, r1, r13, r8);
    L_0x001a:
        r1 = r3.d();
        r0 = 2131427534; // 0x7f0b00ce float:1.8476687E38 double:1.053065121E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r4 = 2131427548; // 0x7f0b00dc float:1.8476715E38 double:1.053065128E-314;
        r4 = r12.findViewById(r4);
        r5 = new com.whatsapp.q1;
        r5.<init>(r10, r1);
        r0.setOnClickListener(r5);
        r4.setOnClickListener(r5);
        r4 = r10.a;
        r4 = com.whatsapp.CallsFragment.d(r4);
        r4.b(r1, r0);
        r0 = 2131427510; // 0x7f0b00b6 float:1.8476638E38 double:1.0530651093E-314;
        r0 = r12.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        com.whatsapp.am1.a(r0);
        r4 = r10.a;
        r4 = r4.getActivity();
        r1 = r1.a(r4);
        r4 = r10.a;
        r4 = com.whatsapp.CallsFragment.b(r4);
        r4 = android.text.TextUtils.isEmpty(r4);
        if (r4 != 0) goto L_0x009d;
    L_0x0064:
        r4 = r1.toLowerCase();
        r5 = r10.a;
        r5 = com.whatsapp.CallsFragment.b(r5);
        r5 = r5.toString();
        r5 = r5.toLowerCase();
        r4 = r4.startsWith(r5);
        if (r4 == 0) goto L_0x0120;
    L_0x007c:
        r2 = new android.text.SpannableStringBuilder;
        r2.<init>(r1);
        r4 = new android.text.style.ForegroundColorSpan;
        r5 = r10.a;
        r5 = r5.getResources();
        r5 = r5.getColor(r7);
        r4.<init>(r5);
        r5 = r10.a;
        r5 = com.whatsapp.CallsFragment.b(r5);
        r5 = r5.length();
        r2.setSpan(r4, r8, r5, r9);
    L_0x009d:
        if (r2 != 0) goto L_0x0173;
    L_0x009f:
        r0.setText(r1);
        r0 = 2131427551; // 0x7f0b00df float:1.8476721E38 double:1.0530651295E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        com.whatsapp.am1.b(r0);
        r1 = r10.a;
        r1 = r1.getActivity();
        r4 = r3.b();
        r1 = com.whatsapp.util.bm.a(r1, r4);
        r0.setText(r1);
        r0 = 2131427550; // 0x7f0b00de float:1.847672E38 double:1.053065129E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        com.whatsapp.am1.b(r0);
        r1 = r3.c();
        r2 = 1;
        if (r1 <= r2) goto L_0x00f9;
    L_0x00d2:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = "(";
        r2 = r2.append(r4);
        r1 = java.lang.Integer.toString(r1);
        r1 = r2.append(r1);
        r2 = ")";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.setText(r1);
        r0.setVisibility(r8);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x00fe;
    L_0x00f9:
        r1 = 8;
        r0.setVisibility(r1);
    L_0x00fe:
        r0 = 2131427539; // 0x7f0b00d3 float:1.8476697E38 double:1.0530651236E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = r3.a();
        r0.setImageResource(r1);
        r0 = 2131427549; // 0x7f0b00dd float:1.8476717E38 double:1.0530651286E-314;
        r0 = r12.findViewById(r0);
        r1 = r10.a;
        r1 = r1.h;
        r0.setOnClickListener(r1);
        r0.setTag(r3);
        return r12;
    L_0x0120:
        r4 = r1.toLowerCase();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = " ";
        r5 = r5.append(r6);
        r6 = r10.a;
        r6 = com.whatsapp.CallsFragment.b(r6);
        r6 = r6.toString();
        r6 = r6.toLowerCase();
        r5 = r5.append(r6);
        r5 = r5.toString();
        r4 = r4.indexOf(r5);
        if (r4 <= 0) goto L_0x009d;
    L_0x014b:
        r2 = new android.text.SpannableStringBuilder;
        r2.<init>(r1);
        r5 = new android.text.style.ForegroundColorSpan;
        r6 = r10.a;
        r6 = r6.getResources();
        r6 = r6.getColor(r7);
        r5.<init>(r6);
        r6 = r4 + 1;
        r4 = r4 + 1;
        r7 = r10.a;
        r7 = com.whatsapp.CallsFragment.b(r7);
        r7 = r7.length();
        r4 = r4 + r7;
        r2.setSpan(r5, r6, r4, r9);
        goto L_0x009d;
    L_0x0173:
        r1 = r2;
        goto L_0x009f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m2.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public Filter getFilter() {
        if (this.b == null) {
            this.b = new cg(this.a, null);
        }
        return this.b;
    }

    public Object getItem(int i) {
        return a(i);
    }

    public lz a(int i) {
        return (lz) CallsFragment.h(this.a).get(i);
    }
}
