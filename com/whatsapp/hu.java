package com.whatsapp;

import android.widget.BaseAdapter;
import java.util.List;

class hu extends BaseAdapter {
    final WebSessionsActivity a;
    protected List b;

    private hu(WebSessionsActivity webSessionsActivity) {
        this.a = webSessionsActivity;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
        r9_this = this;
        r8 = 0;
        r2 = com.whatsapp.App.az;
        if (r11 != 0) goto L_0x0014;
    L_0x0005:
        r0 = r9.a;
        r0 = r0.getLayoutInflater();
        r1 = 2130903220; // 0x7f0300b4 float:1.7413252E38 double:1.0528060756E-314;
        r0 = com.whatsapp.b7.a(r0, r1, r12, r8);
        if (r2 == 0) goto L_0x0095;
    L_0x0014:
        r3 = r9.a(r10);
        r0 = 2131427637; // 0x7f0b0135 float:1.8476896E38 double:1.053065172E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131427535; // 0x7f0b00cf float:1.847669E38 double:1.0530651216E-314;
        r1 = r11.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        com.whatsapp.am1.b(r1);
        r4 = r3.b;
        r4 = com.whatsapp.a12.d(r4);
        r5 = r9.a;
        r5 = r5.getBaseContext();
        r6 = r3.i;
        r4 = com.whatsapp.util.bm.a(r5, r6, r4);
        r0.setText(r4);
        r0 = r3.a;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0068;
    L_0x004a:
        r0 = r9.a;
        r0 = r0.getResources();
        r4 = 2131625115; // 0x7f0e049b float:1.8877429E38 double:1.053162739E-314;
        r5 = 2;
        r5 = new java.lang.Object[r5];
        r6 = r3.a;
        r5[r8] = r6;
        r6 = 1;
        r7 = r3.c;
        r5[r6] = r7;
        r0 = r0.getString(r4, r5);
        r1.setText(r0);
        if (r2 == 0) goto L_0x006d;
    L_0x0068:
        r0 = r3.c;
        r1.setText(r0);
    L_0x006d:
        r0 = r3.e;
        if (r0 == 0) goto L_0x008d;
    L_0x0071:
        r0 = r3.d;
        r4 = 0;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x0082;
    L_0x0079:
        r0 = r9.a;
        r1 = r3.b;
        com.whatsapp.WebSessionsActivity.a(r0, r1);
        if (r2 == 0) goto L_0x0094;
    L_0x0082:
        r0 = r9.a;
        r1 = r3.b;
        r4 = r3.d;
        com.whatsapp.WebSessionsActivity.a(r0, r1, r4);
        if (r2 == 0) goto L_0x0094;
    L_0x008d:
        r0 = r9.a;
        r1 = r3.b;
        com.whatsapp.WebSessionsActivity.a(r0, r1);
    L_0x0094:
        return r11;
    L_0x0095:
        r11 = r0;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.hu.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public void a(List list) {
        this.b = list;
        notifyDataSetChanged();
    }

    public avu a(int i) {
        return (avu) this.b.get(i);
    }

    hu(WebSessionsActivity webSessionsActivity, amp com_whatsapp_amp) {
        this(webSessionsActivity);
    }

    public int getCount() {
        return this.b == null ? 0 : this.b.size();
    }

    public int getViewTypeCount() {
        return 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public Object getItem(int i) {
        return a(i);
    }
}
