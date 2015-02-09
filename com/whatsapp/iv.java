package com.whatsapp;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

class iv extends PagerAdapter {
    final ContactPicker a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object instantiateItem(android.view.View r7, int r8) {
        /*
        r6_this = this;
        r5 = 1;
        r1 = com.whatsapp.App.az;
        r0 = r6.a;
        r0 = r0.getLayoutInflater();
        r2 = 2130903095; // 0x7f030037 float:1.7412998E38 double:1.052806014E-314;
        r3 = 0;
        r2 = r0.inflate(r2, r3);
        r0 = 16908298; // 0x102000a float:2.3877257E-38 double:8.353809E-317;
        r0 = r2.findViewById(r0);
        r0 = (android.widget.ListView) r0;
        r0.setFastScrollEnabled(r5);
        r0.setScrollbarFadingEnabled(r5);
        r3 = 2131427639; // 0x7f0b0137 float:1.84769E38 double:1.053065173E-314;
        r3 = r2.findViewById(r3);
        r0.setEmptyView(r3);
        r0.setTextFilterEnabled(r5);
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 11;
        if (r3 < r4) goto L_0x003d;
    L_0x0033:
        r0.setFastScrollAlwaysVisible(r5);
        r3 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r0.setScrollBarStyle(r3);
        if (r1 == 0) goto L_0x0043;
    L_0x003d:
        r3 = 2130839096; // 0x7f020638 float:1.7283193E38 double:1.052774394E-314;
        r0.setSelector(r3);
    L_0x0043:
        r3 = new com.whatsapp.a5h;
        r3.<init>(r6, r0);
        r0.setOnItemClickListener(r3);
        r3 = r6.a;
        r3 = com.whatsapp.ContactPicker.j(r3);
        if (r3 != 0) goto L_0x0083;
    L_0x0053:
        r3 = r6.a;
        r3 = com.whatsapp.ContactPicker.h(r3);
        if (r3 != 0) goto L_0x0083;
    L_0x005b:
        r3 = r6.a;
        r3 = com.whatsapp.ContactPicker.i(r3);
        if (r3 != 0) goto L_0x0083;
    L_0x0063:
        r3 = r6.a;
        r3 = com.whatsapp.ContactPicker.x(r3);
        if (r3 != 0) goto L_0x0083;
    L_0x006b:
        r3 = r6.a;
        r3 = com.whatsapp.ContactPicker.n(r3);
        if (r3 != 0) goto L_0x0083;
    L_0x0073:
        r3 = r6.a;
        r3 = com.whatsapp.ContactPicker.k(r3);
        if (r3 != 0) goto L_0x0083;
    L_0x007b:
        r3 = new com.whatsapp.fy;
        r3.<init>(r6, r0);
        r0.setOnItemLongClickListener(r3);
    L_0x0083:
        r3 = new com.whatsapp.an6;
        r3.<init>(r6);
        r4 = 2131427804; // 0x7f0b01dc float:1.8477235E38 double:1.0530652545E-314;
        r4 = r2.findViewById(r4);
        r4.setOnClickListener(r3);
        r3 = r6.a;
        r3.registerForContextMenu(r0);
        switch(r8) {
            case 0: goto L_0x00a8;
            case 1: goto L_0x00f1;
            case 2: goto L_0x00fc;
            default: goto L_0x009a;
        };
    L_0x009a:
        r1 = java.lang.Integer.valueOf(r8);
        r0.setTag(r1);
        r7 = (android.support.v4.view.ViewPager) r7;
        r0 = 0;
        r7.addView(r2, r0);
        return r2;
    L_0x00a8:
        r3 = r6.a;
        r3 = com.whatsapp.ContactPicker.j(r3);
        if (r3 != 0) goto L_0x00c8;
    L_0x00b0:
        r3 = r6.a;
        r3 = com.whatsapp.ContactPicker.x(r3);
        if (r3 != 0) goto L_0x00c8;
    L_0x00b8:
        r3 = r6.a;
        r3 = com.whatsapp.ContactPicker.n(r3);
        if (r3 != 0) goto L_0x00c8;
    L_0x00c0:
        r3 = r6.a;
        r3 = com.whatsapp.ContactPicker.k(r3);
        if (r3 == 0) goto L_0x00d3;
    L_0x00c8:
        r3 = r6.a;
        r3 = com.whatsapp.ContactPicker.w(r3);
        r0.setAdapter(r3);
        if (r1 == 0) goto L_0x009a;
    L_0x00d3:
        r3 = r6.a;
        r3 = com.whatsapp.ContactPicker.p(r3);
        if (r3 == 0) goto L_0x00e6;
    L_0x00db:
        r3 = r6.a;
        r3 = com.whatsapp.ContactPicker.o(r3);
        r0.setAdapter(r3);
        if (r1 == 0) goto L_0x009a;
    L_0x00e6:
        r3 = r6.a;
        r3 = com.whatsapp.ContactPicker.m(r3);
        r0.setAdapter(r3);
        if (r1 == 0) goto L_0x009a;
    L_0x00f1:
        r3 = r6.a;
        r3 = com.whatsapp.ContactPicker.o(r3);
        r0.setAdapter(r3);
        if (r1 == 0) goto L_0x009a;
    L_0x00fc:
        r1 = r6.a;
        r1 = com.whatsapp.ContactPicker.m(r1);
        r0.setAdapter(r1);
        goto L_0x009a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.iv.instantiateItem(android.view.View, int):java.lang.Object");
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void startUpdate(View view) {
    }

    iv(ContactPicker contactPicker, r9 r9Var) {
        this(contactPicker);
    }

    private iv(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    public Parcelable saveState() {
        return null;
    }

    public int getCount() {
        return (ContactPicker.x(this.a) || ContactPicker.n(this.a) || ContactPicker.k(this.a)) ? 3 : 1;
    }

    public void finishUpdate(View view) {
    }

    public void destroyItem(View view, int i, Object obj) {
        ((ViewPager) view).removeView((View) obj);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public CharSequence getPageTitle(int i) {
        return "";
    }
}
