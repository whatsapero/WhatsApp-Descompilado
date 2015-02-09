package com.whatsapp;

import android.widget.AdapterView.OnItemClickListener;

class xk implements OnItemClickListener {
    final ContactsFragment a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView r8, android.view.View r9, int r10, long r11) {
        /*
        r7_this = this;
        r6 = 0;
        r1 = com.whatsapp.App.az;
        r0 = r7.a;
        r0 = com.whatsapp.ContactsFragment.k(r0);
        if (r0 != 0) goto L_0x0069;
    L_0x000b:
        r0 = r7.a;
        r0 = com.whatsapp.ContactsFragment.c(r0);
        r0 = com.whatsapp.vf.b(r0, r10);
        if (r0 == 0) goto L_0x0029;
    L_0x0017:
        r0 = com.whatsapp.fieldstats.au.TELL_A_FRIEND;
        r2 = com.whatsapp.fieldstats.a7.CONTACTS_LIST;
        com.whatsapp.ak4.a(r0, r2);
        r0 = r7.a;
        r0 = r0.getActivity();
        com.whatsapp.App.c(r0);
        if (r1 == 0) goto L_0x0048;
    L_0x0029:
        r0 = r7.a;
        r0 = com.whatsapp.ContactsFragment.c(r0);
        r0 = com.whatsapp.vf.c(r0, r10);
        if (r0 == 0) goto L_0x003c;
    L_0x0035:
        r0 = r7.a;
        com.whatsapp.ContactsFragment.b(r0);
        if (r1 == 0) goto L_0x0048;
    L_0x003c:
        r0 = r7.a;
        r0 = com.whatsapp.ContactsFragment.c(r0);
        r0 = com.whatsapp.vf.a(r0, r10);
        if (r0 == 0) goto L_0x0049;
    L_0x0048:
        return;
    L_0x0049:
        r0 = r7.a;
        r0 = com.whatsapp.ContactsFragment.c(r0);
        r0 = r0.a(r10);
        r2 = r0.q;
        if (r2 == 0) goto L_0x0062;
    L_0x0057:
        r2 = r7.a;
        r3 = com.whatsapp.Conversation.a(r0);
        r2.startActivity(r3);
        if (r1 == 0) goto L_0x0067;
    L_0x0062:
        r2 = r7.a;
        com.whatsapp.ContactsFragment.a(r2, r0);
    L_0x0067:
        if (r1 == 0) goto L_0x0048;
    L_0x0069:
        r0 = r7.a;
        r0 = com.whatsapp.ContactsFragment.c(r0);
        r0 = com.whatsapp.vf.b(r0, r10);
        if (r0 != 0) goto L_0x0048;
    L_0x0075:
        r0 = r7.a;
        r0 = com.whatsapp.ContactsFragment.c(r0);
        r0 = com.whatsapp.vf.c(r0, r10);
        if (r0 != 0) goto L_0x0048;
    L_0x0081:
        r0 = r7.a;
        r0 = com.whatsapp.ContactsFragment.c(r0);
        r0 = com.whatsapp.vf.a(r0, r10);
        if (r0 != 0) goto L_0x0048;
    L_0x008d:
        r0 = r7.a;
        r0 = com.whatsapp.ContactsFragment.c(r0);
        r2 = r0.a(r10);
        r0 = r2.q;
        if (r0 == 0) goto L_0x0048;
    L_0x009b:
        r0 = r7.a;
        r0 = com.whatsapp.ContactsFragment.k(r0);
        r3 = r2.e;
        r0 = r0.containsKey(r3);
        if (r0 == 0) goto L_0x00b9;
    L_0x00a9:
        r0 = r7.a;
        r0 = com.whatsapp.ContactsFragment.k(r0);
        r3 = r2.e;
        r0.remove(r3);
        r9.setBackgroundResource(r6);
        if (r1 == 0) goto L_0x0101;
    L_0x00b9:
        r0 = com.whatsapp.ge.f;
        if (r0 <= 0) goto L_0x00f0;
    L_0x00bd:
        r0 = r7.a;
        r0 = com.whatsapp.ContactsFragment.k(r0);
        r0 = r0.size();
        r3 = com.whatsapp.ge.f;
        if (r0 < r3) goto L_0x00f0;
    L_0x00cb:
        r0 = r7.a;
        r0 = r0.getActivity();
        r0 = (com.whatsapp.ho) r0;
        r3 = r7.a;
        r4 = 2131624034; // 0x7f0e0062 float:1.8875236E38 double:1.053162205E-314;
        r3 = r3.getString(r4);
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = com.whatsapp.ge.f;
        r5 = java.lang.Integer.valueOf(r5);
        r4[r6] = r5;
        r3 = java.lang.String.format(r3, r4);
        r0.f(r3);
        if (r1 == 0) goto L_0x0101;
    L_0x00f0:
        r0 = r7.a;
        r0 = com.whatsapp.ContactsFragment.k(r0);
        r1 = r2.e;
        r0.put(r1, r2);
        r0 = 2130837815; // 0x7f020137 float:1.7280595E38 double:1.0527737613E-314;
        r9.setBackgroundResource(r0);
    L_0x0101:
        r0 = r7.a;
        com.whatsapp.ContactsFragment.j(r0);
        goto L_0x0048;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.xk.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    xk(ContactsFragment contactsFragment) {
        this.a = contactsFragment;
    }
}
