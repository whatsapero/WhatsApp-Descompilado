package com.whatsapp;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.BaseAdapter;
import com.actionbarsherlock.R;

class asj extends BaseAdapter {
    private int a;
    private View b;
    private final int c;
    final MessageDetailsActivity d;
    private String e;

    static View a(asj com_whatsapp_asj, View view) {
        com_whatsapp_asj.b = view;
        return view;
    }

    static View c(asj com_whatsapp_asj) {
        return com_whatsapp_asj.b;
    }

    public boolean hasStableIds() {
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r22, android.view.View r23) {
        /*
        r21_this = this;
        r11 = com.whatsapp.App.az;
        r0 = r21;
        r2 = r0.d;
        r2 = com.whatsapp.MessageDetailsActivity.h(r2);
        r0 = r22;
        r2 = r2.get(r0);
        r2 = (com.whatsapp.xx) r2;
        r3 = 2131427900; // 0x7f0b023c float:1.847743E38 double:1.053065302E-314;
        r0 = r23;
        r6 = r0.findViewById(r3);
        if (r22 == 0) goto L_0x0037;
    L_0x001d:
        r4 = r2.a();
        r0 = r21;
        r3 = r0.d;
        r3 = com.whatsapp.MessageDetailsActivity.h(r3);
        r5 = r22 + -1;
        r3 = r3.get(r5);
        r3 = (com.whatsapp.xx) r3;
        r3 = r3.a();
        if (r4 == r3) goto L_0x005d;
    L_0x0037:
        r3 = 0;
        r6.setVisibility(r3);
        r3 = 2131427901; // 0x7f0b023d float:1.8477431E38 double:1.0530653025E-314;
        r0 = r23;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r4 = 2131427902; // 0x7f0b023e float:1.8477433E38 double:1.053065303E-314;
        r0 = r23;
        r4 = r0.findViewById(r4);
        r4 = (android.widget.TextView) r4;
        com.whatsapp.am1.b(r3);
        r5 = r2.a();
        switch(r5) {
            case 5: goto L_0x029c;
            case 8: goto L_0x02ca;
            case 13: goto L_0x02ad;
            default: goto L_0x005b;
        };
    L_0x005b:
        if (r11 == 0) goto L_0x0062;
    L_0x005d:
        r3 = 8;
        r6.setVisibility(r3);
    L_0x0062:
        r3 = 2131427543; // 0x7f0b00d7 float:1.8476705E38 double:1.0530651256E-314;
        r0 = r23;
        r4 = r0.findViewById(r3);
        r3 = 2131427605; // 0x7f0b0115 float:1.847683E38 double:1.053065156E-314;
        r0 = r23;
        r5 = r0.findViewById(r3);
        r0 = r21;
        r3 = r0.d;
        r3 = com.whatsapp.MessageDetailsActivity.h(r3);
        r3 = r3.size();
        r3 = r3 + -1;
        r0 = r22;
        if (r0 == r3) goto L_0x00a0;
    L_0x0086:
        r6 = r2.a();
        r0 = r21;
        r3 = r0.d;
        r3 = com.whatsapp.MessageDetailsActivity.h(r3);
        r7 = r22 + 1;
        r3 = r3.get(r7);
        r3 = (com.whatsapp.xx) r3;
        r3 = r3.a();
        if (r6 == r3) goto L_0x00ad;
    L_0x00a0:
        r3 = 2130839001; // 0x7f0205d9 float:1.7283E38 double:1.052774347E-314;
        r5.setBackgroundResource(r3);
        r3 = 8;
        r4.setVisibility(r3);
        if (r11 == 0) goto L_0x00b7;
    L_0x00ad:
        r3 = 2130839003; // 0x7f0205db float:1.7283004E38 double:1.052774348E-314;
        r5.setBackgroundResource(r3);
        r3 = 0;
        r4.setVisibility(r3);
    L_0x00b7:
        r3 = 2131427534; // 0x7f0b00ce float:1.8476687E38 double:1.053065121E-314;
        r0 = r23;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.ImageView) r3;
        r4 = 2131427510; // 0x7f0b00b6 float:1.8476638E38 double:1.0530651093E-314;
        r0 = r23;
        r4 = r0.findViewById(r4);
        r4 = (android.widget.TextView) r4;
        r5 = 2131427821; // 0x7f0b01ed float:1.847727E38 double:1.053065263E-314;
        r0 = r23;
        r5 = r0.findViewById(r5);
        r5 = (android.widget.TextView) r5;
        r6 = 2131427903; // 0x7f0b023f float:1.8477435E38 double:1.0530653035E-314;
        r0 = r23;
        r6 = r0.findViewById(r6);
        r6 = (android.widget.TextView) r6;
        r7 = 2131427909; // 0x7f0b0245 float:1.8477448E38 double:1.0530653064E-314;
        r0 = r23;
        r12 = r0.findViewById(r7);
        r7 = 2131427907; // 0x7f0b0243 float:1.8477443E38 double:1.0530653054E-314;
        r0 = r23;
        r13 = r0.findViewById(r7);
        r7 = 2131427905; // 0x7f0b0241 float:1.847744E38 double:1.0530653044E-314;
        r0 = r23;
        r14 = r0.findViewById(r7);
        r7 = 2131427898; // 0x7f0b023a float:1.8477425E38 double:1.053065301E-314;
        r0 = r23;
        r7 = r0.findViewById(r7);
        r7 = (android.widget.TextView) r7;
        r8 = 2131427897; // 0x7f0b0239 float:1.8477423E38 double:1.0530653005E-314;
        r0 = r23;
        r8 = r0.findViewById(r8);
        r8 = (android.widget.TextView) r8;
        r9 = 2131427895; // 0x7f0b0237 float:1.847742E38 double:1.0530652995E-314;
        r0 = r23;
        r9 = r0.findViewById(r9);
        r9 = (android.widget.TextView) r9;
        r10 = 2131427910; // 0x7f0b0246 float:1.847745E38 double:1.053065307E-314;
        r0 = r23;
        r15 = r0.findViewById(r10);
        r10 = 2131427908; // 0x7f0b0244 float:1.8477446E38 double:1.053065306E-314;
        r0 = r23;
        r16 = r0.findViewById(r10);
        r10 = 2131427906; // 0x7f0b0242 float:1.8477441E38 double:1.053065305E-314;
        r0 = r23;
        r17 = r0.findViewById(r10);
        r10 = 8;
        r12.setVisibility(r10);
        r10 = 8;
        r13.setVisibility(r10);
        r10 = 8;
        r14.setVisibility(r10);
        r10 = 8;
        r15.setVisibility(r10);
        r10 = 8;
        r0 = r16;
        r0.setVisibility(r10);
        r10 = 8;
        r0 = r17;
        r0.setVisibility(r10);
        r10 = r2 instanceof com.whatsapp.xj;
        if (r10 == 0) goto L_0x019e;
    L_0x0160:
        r10 = 0;
        r6.setVisibility(r10);
        r10 = 8;
        r3.setVisibility(r10);
        r10 = 8;
        r4.setVisibility(r10);
        r10 = 8;
        r5.setVisibility(r10);
        r10 = r2;
        r10 = (com.whatsapp.xj) r10;
        r18 = com.whatsapp.App.aX;
        r19 = 2131558438; // 0x7f0d0026 float:1.8742192E38 double:1.0531297963E-314;
        r0 = r10.d;
        r20 = r0;
        r18 = r18.a(r19, r20);
        r19 = 1;
        r0 = r19;
        r0 = new java.lang.Object[r0];
        r19 = r0;
        r20 = 0;
        r10 = r10.d;
        r10 = java.lang.Integer.valueOf(r10);
        r19[r20] = r10;
        r10 = java.lang.String.format(r18, r19);
        r6.setText(r10);
        if (r11 == 0) goto L_0x029b;
    L_0x019e:
        r10 = com.whatsapp.App.P;
        r0 = r2.a;
        r18 = r0;
        r0 = r18;
        r10 = r10.a(r0);
        r18 = 8;
        r0 = r18;
        r6.setVisibility(r0);
        r6 = 0;
        r3.setVisibility(r6);
        r0 = r21;
        r6 = r0.d;
        r6 = com.whatsapp.MessageDetailsActivity.a(r6);
        r6.b(r10, r3);
        r3 = 0;
        r4.setVisibility(r3);
        r0 = r21;
        r3 = r0.d;
        r3 = r10.a(r3);
        r4.setText(r3);
        r3 = r10.h();
        if (r3 == 0) goto L_0x020b;
    L_0x01d5:
        r3 = r10.t;
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 != 0) goto L_0x020b;
    L_0x01dd:
        r3 = 0;
        r5.setVisibility(r3);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "~";
        r3 = r3.append(r4);
        r4 = r10.t;
        r3 = r3.append(r4);
        r3 = r3.toString();
        r0 = r21;
        r4 = r0.d;
        r4 = r4.getBaseContext();
        r6 = r5.getPaint();
        r3 = com.whatsapp.util.a5.b(r3, r4, r6);
        r5.setText(r3);
        if (r11 == 0) goto L_0x0210;
    L_0x020b:
        r3 = 8;
        r5.setVisibility(r3);
    L_0x0210:
        r3 = r10.e;
        r0 = r21;
        r4 = r0.e;
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x028f;
    L_0x021c:
        r3 = 5;
        r4 = r2.a(r3);
        r18 = 0;
        r3 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1));
        if (r3 <= 0) goto L_0x023f;
    L_0x0227:
        r0 = r21;
        r3 = r0.d;
        r4 = 5;
        r4 = r2.a(r4);
        r3 = com.whatsapp.MessageDetailsActivity.a(r3, r4);
        r7.setText(r3);
        r3 = 0;
        r12.setVisibility(r3);
        r3 = 0;
        r15.setVisibility(r3);
    L_0x023f:
        r3 = 13;
        r4 = r2.a(r3);
        r18 = 0;
        r3 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1));
        if (r3 <= 0) goto L_0x0266;
    L_0x024b:
        r0 = r21;
        r3 = r0.d;
        r4 = 13;
        r4 = r2.a(r4);
        r3 = com.whatsapp.MessageDetailsActivity.a(r3, r4);
        r8.setText(r3);
        r3 = 0;
        r13.setVisibility(r3);
        r3 = 0;
        r0 = r16;
        r0.setVisibility(r3);
    L_0x0266:
        r3 = 8;
        r4 = r2.a(r3);
        r18 = 0;
        r3 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1));
        if (r3 <= 0) goto L_0x0296;
    L_0x0272:
        r0 = r21;
        r3 = r0.d;
        r4 = 8;
        r4 = r2.a(r4);
        r3 = com.whatsapp.MessageDetailsActivity.a(r3, r4);
        r9.setText(r3);
        r3 = 0;
        r14.setVisibility(r3);
        r3 = 0;
        r0 = r17;
        r0.setVisibility(r3);
        if (r11 == 0) goto L_0x0296;
    L_0x028f:
        r3 = r2.a();
        switch(r3) {
            case 5: goto L_0x02df;
            case 8: goto L_0x030c;
            case 13: goto L_0x02f5;
            default: goto L_0x0296;
        };
    L_0x0296:
        r0 = r23;
        r0.setTag(r10);
    L_0x029b:
        return;
    L_0x029c:
        r5 = 2131624529; // 0x7f0e0251 float:1.887624E38 double:1.0531624496E-314;
        r3.setText(r5);
        r5 = 2130838975; // 0x7f0205bf float:1.7282947E38 double:1.0527743344E-314;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r4.setCompoundDrawablesWithIntrinsicBounds(r5, r7, r8, r9);
        if (r11 == 0) goto L_0x005b;
    L_0x02ad:
        r0 = r21;
        r5 = r0.d;
        r5 = com.whatsapp.MessageDetailsActivity.d(r5);
        r5 = r5.j;
        if (r5 != 0) goto L_0x02db;
    L_0x02b9:
        r5 = 2131624536; // 0x7f0e0258 float:1.8876254E38 double:1.053162453E-314;
    L_0x02bc:
        r3.setText(r5);
        r5 = 2130838974; // 0x7f0205be float:1.7282945E38 double:1.052774334E-314;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r4.setCompoundDrawablesWithIntrinsicBounds(r5, r7, r8, r9);
        if (r11 == 0) goto L_0x005b;
    L_0x02ca:
        r5 = 2131624534; // 0x7f0e0256 float:1.887625E38 double:1.053162452E-314;
        r3.setText(r5);
        r3 = 2130837780; // 0x7f020114 float:1.7280524E38 double:1.052773744E-314;
        r5 = 0;
        r7 = 0;
        r8 = 0;
        r4.setCompoundDrawablesWithIntrinsicBounds(r3, r5, r7, r8);
        goto L_0x005b;
    L_0x02db:
        r5 = 2131624538; // 0x7f0e025a float:1.8876259E38 double:1.053162454E-314;
        goto L_0x02bc;
    L_0x02df:
        r0 = r21;
        r3 = r0.d;
        r4 = 5;
        r4 = r2.a(r4);
        r3 = com.whatsapp.MessageDetailsActivity.a(r3, r4);
        r7.setText(r3);
        r3 = 0;
        r12.setVisibility(r3);
        if (r11 == 0) goto L_0x0296;
    L_0x02f5:
        r0 = r21;
        r3 = r0.d;
        r4 = 13;
        r4 = r2.a(r4);
        r3 = com.whatsapp.MessageDetailsActivity.a(r3, r4);
        r8.setText(r3);
        r3 = 0;
        r13.setVisibility(r3);
        if (r11 == 0) goto L_0x0296;
    L_0x030c:
        r0 = r21;
        r3 = r0.d;
        r4 = 8;
        r4 = r2.a(r4);
        r2 = com.whatsapp.MessageDetailsActivity.a(r3, r4);
        r9.setText(r2);
        r2 = 0;
        r14.setVisibility(r2);
        goto L_0x0296;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.asj.a(int, android.view.View):void");
    }

    public long getItemId(int i) {
        return (long) i;
    }

    static String a(asj com_whatsapp_asj, String str) {
        com_whatsapp_asj.e = str;
        return str;
    }

    static void a(asj com_whatsapp_asj, int i, View view, boolean z) {
        com_whatsapp_asj.a(i, view, z);
    }

    public int getCount() {
        return MessageDetailsActivity.h(this.d).size();
    }

    private Animation b(float f) {
        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration((long) this.c);
        alphaAnimation.setStartOffset((long) (((float) this.c) * f));
        return alphaAnimation;
    }

    public asj(MessageDetailsActivity messageDetailsActivity) {
        this.d = messageDetailsActivity;
        this.c = messageDetailsActivity.getResources().getInteger(17694721);
    }

    static String b(asj com_whatsapp_asj) {
        return com_whatsapp_asj.e;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            View a = b7.a(this.d.getLayoutInflater(), R.layout.message_details_row, viewGroup, false);
            if (App.az == 0) {
                view = a;
            }
        }
        a(i, view);
        view.setOnClickListener(new to(this, i));
        return view;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r19, android.view.View r20, boolean r21) {
        /*
        r18_this = this;
        r6 = com.whatsapp.App.az;
        r0 = r18;
        r2 = r0.d;
        r2 = com.whatsapp.MessageDetailsActivity.h(r2);
        r0 = r19;
        r2 = r2.get(r0);
        r2 = (com.whatsapp.xx) r2;
        r3 = 2131427898; // 0x7f0b023a float:1.8477425E38 double:1.053065301E-314;
        r0 = r20;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r4 = 2131427897; // 0x7f0b0239 float:1.8477423E38 double:1.0530653005E-314;
        r0 = r20;
        r4 = r0.findViewById(r4);
        r4 = (android.widget.TextView) r4;
        r5 = 2131427895; // 0x7f0b0237 float:1.847742E38 double:1.0530652995E-314;
        r0 = r20;
        r5 = r0.findViewById(r5);
        r5 = (android.widget.TextView) r5;
        r7 = 2131427910; // 0x7f0b0246 float:1.847745E38 double:1.053065307E-314;
        r0 = r20;
        r7 = r0.findViewById(r7);
        r8 = 2131427908; // 0x7f0b0244 float:1.8477446E38 double:1.053065306E-314;
        r0 = r20;
        r8 = r0.findViewById(r8);
        r9 = 2131427906; // 0x7f0b0242 float:1.8477441E38 double:1.053065305E-314;
        r0 = r20;
        r9 = r0.findViewById(r9);
        r10 = 2131427909; // 0x7f0b0245 float:1.8477448E38 double:1.0530653064E-314;
        r0 = r20;
        r10 = r0.findViewById(r10);
        r11 = 2131427907; // 0x7f0b0243 float:1.8477443E38 double:1.0530653054E-314;
        r0 = r20;
        r11 = r0.findViewById(r11);
        r12 = 2131427905; // 0x7f0b0241 float:1.847744E38 double:1.0530653044E-314;
        r0 = r20;
        r12 = r0.findViewById(r12);
        r13 = new java.util.ArrayList;
        r14 = 6;
        r13.<init>(r14);
        r2 = r2.a();
        switch(r2) {
            case 5: goto L_0x00d4;
            case 8: goto L_0x0147;
            case 13: goto L_0x010c;
            default: goto L_0x0076;
        };
    L_0x0076:
        r4 = r13.iterator();
    L_0x007a:
        r2 = r4.hasNext();
        if (r2 == 0) goto L_0x0094;
    L_0x0080:
        r2 = r4.next();
        r2 = (android.view.View) r2;
        if (r21 == 0) goto L_0x01b9;
    L_0x0088:
        r3 = 0;
        r0 = r18;
        r3 = r0.a(r3);
    L_0x008f:
        r2.startAnimation(r3);
        if (r6 == 0) goto L_0x007a;
    L_0x0094:
        r2 = 2131427904; // 0x7f0b0240 float:1.8477437E38 double:1.053065304E-314;
        r0 = r20;
        r2 = r0.findViewById(r2);
        r3 = r2.getHeight();
        r18.a(r19, r20);
        r4 = r2.getWidth();
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5);
        r5 = 0;
        r6 = 0;
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r6);
        r2.measure(r4, r5);
        r4 = r2.getMeasuredHeight();
        r5 = r2.getLayoutParams();
        r5.height = r3;
        r5 = new com.whatsapp.hg;
        r0 = r18;
        r5.<init>(r0, r2, r3, r4);
        r0 = r18;
        r3 = r0.c;
        r6 = (long) r3;
        r5.setDuration(r6);
        r2.startAnimation(r5);
        return;
    L_0x00d4:
        r13.add(r7);
        r2 = com.whatsapp.App.as();
        if (r2 == 0) goto L_0x0076;
    L_0x00dd:
        if (r21 == 0) goto L_0x0185;
    L_0x00df:
        r2 = new android.view.animation.TranslateAnimation;
        r14 = r3.getWidth();
        r15 = r10.getWidth();
        r14 = r14 - r15;
        r14 = (float) r14;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r0 = r16;
        r1 = r17;
        r2.<init>(r14, r15, r0, r1);
    L_0x00f7:
        r0 = r18;
        r14 = r0.c;
        r14 = (long) r14;
        r2.setDuration(r14);
        r14 = new android.view.animation.DecelerateInterpolator;
        r14.<init>();
        r2.setInterpolator(r14);
        r3.startAnimation(r2);
        if (r6 == 0) goto L_0x0076;
    L_0x010c:
        r13.add(r8);
        r13.add(r10);
        r13.add(r7);
        r2 = com.whatsapp.App.as();
        if (r2 == 0) goto L_0x0076;
    L_0x011b:
        if (r21 == 0) goto L_0x019a;
    L_0x011d:
        r2 = new android.view.animation.TranslateAnimation;
        r3 = r4.getWidth();
        r14 = r11.getWidth();
        r3 = r3 - r14;
        r3 = (float) r3;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r0 = r16;
        r2.<init>(r3, r14, r15, r0);
    L_0x0132:
        r0 = r18;
        r3 = r0.c;
        r14 = (long) r3;
        r2.setDuration(r14);
        r3 = new android.view.animation.DecelerateInterpolator;
        r3.<init>();
        r2.setInterpolator(r3);
        r4.startAnimation(r2);
        if (r6 == 0) goto L_0x0076;
    L_0x0147:
        r13.add(r9);
        r13.add(r11);
        r13.add(r8);
        r13.add(r10);
        r13.add(r7);
        r2 = com.whatsapp.App.as();
        if (r2 == 0) goto L_0x0076;
    L_0x015c:
        if (r21 == 0) goto L_0x01ab;
    L_0x015e:
        r2 = new android.view.animation.TranslateAnimation;
        r3 = r5.getWidth();
        r4 = r12.getWidth();
        r3 = r3 - r4;
        r3 = (float) r3;
        r4 = 0;
        r7 = 0;
        r8 = 0;
        r2.<init>(r3, r4, r7, r8);
    L_0x0170:
        r0 = r18;
        r3 = r0.c;
        r8 = (long) r3;
        r2.setDuration(r8);
        r3 = new android.view.animation.DecelerateInterpolator;
        r3.<init>();
        r2.setInterpolator(r3);
        r5.startAnimation(r2);
        goto L_0x0076;
    L_0x0185:
        r2 = new android.view.animation.TranslateAnimation;
        r14 = r7.getWidth();
        r14 = (float) r14;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r0 = r16;
        r1 = r17;
        r2.<init>(r14, r15, r0, r1);
        goto L_0x00f7;
    L_0x019a:
        r2 = new android.view.animation.TranslateAnimation;
        r3 = r8.getWidth();
        r3 = (float) r3;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r0 = r16;
        r2.<init>(r3, r14, r15, r0);
        goto L_0x0132;
    L_0x01ab:
        r2 = new android.view.animation.TranslateAnimation;
        r3 = r9.getWidth();
        r3 = (float) r3;
        r4 = 0;
        r7 = 0;
        r8 = 0;
        r2.<init>(r3, r4, r7, r8);
        goto L_0x0170;
    L_0x01b9:
        r3 = 0;
        r0 = r18;
        r3 = r0.b(r3);
        goto L_0x008f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.asj.a(int, android.view.View, boolean):void");
    }

    public int getViewTypeCount() {
        return 1;
    }

    static int a(asj com_whatsapp_asj) {
        return com_whatsapp_asj.a;
    }

    public Object getItem(int i) {
        return MessageDetailsActivity.h(this.d).get(i);
    }

    private Animation a(float f) {
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration((long) this.c);
        alphaAnimation.setStartOffset((long) (((float) this.c) * f));
        return alphaAnimation;
    }

    static int a(asj com_whatsapp_asj, int i) {
        com_whatsapp_asj.a = i;
        return i;
    }
}
