package com.whatsapp;

import android.text.TextWatcher;

class lp implements TextWatcher {
    final Conversation a;

    lp(Conversation conversation) {
        this.a = conversation;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r9) {
        /*
        r8_this = this;
        r7 = 8;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.App.az;
        r4 = r9.toString();
        r0 = r4.trim();
        r0 = r0.length();
        if (r0 <= 0) goto L_0x00f4;
    L_0x0014:
        r0 = r1;
    L_0x0015:
        r5 = r8.a;
        r5 = com.whatsapp.Conversation.k(r5);
        r5.setEnabled(r0);
        r5 = r8.a;
        r5 = com.whatsapp.Conversation.Y(r5);
        r5 = r5.getVisibility();
        if (r5 != r7) goto L_0x0076;
    L_0x002a:
        if (r0 != 0) goto L_0x0076;
    L_0x002c:
        r5 = r8.a;
        r5 = com.whatsapp.Conversation.Y(r5);
        r6 = com.whatsapp.dz.a(r1);
        r5.startAnimation(r6);
        r5 = r8.a;
        r5 = com.whatsapp.Conversation.Y(r5);
        r5.setVisibility(r2);
        r5 = com.whatsapp.App.G();
        if (r5 == 0) goto L_0x005e;
    L_0x0048:
        r5 = r8.a;
        r5 = com.whatsapp.Conversation.O(r5);
        r6 = com.whatsapp.Conversation.e(r1);
        r5.startAnimation(r6);
        r5 = r8.a;
        r5 = com.whatsapp.Conversation.O(r5);
        r5.setVisibility(r2);
    L_0x005e:
        r5 = r8.a;
        r5 = com.whatsapp.Conversation.k(r5);
        r6 = com.whatsapp.dz.a(r2);
        r5.startAnimation(r6);
        r5 = r8.a;
        r5 = com.whatsapp.Conversation.k(r5);
        r5.setVisibility(r7);
        if (r3 == 0) goto L_0x00cc;
    L_0x0076:
        r5 = r8.a;
        r5 = com.whatsapp.Conversation.Y(r5);
        r5 = r5.getVisibility();
        if (r5 != 0) goto L_0x00cc;
    L_0x0082:
        if (r0 == 0) goto L_0x00cc;
    L_0x0084:
        r0 = r8.a;
        r0 = com.whatsapp.Conversation.Y(r0);
        r5 = com.whatsapp.dz.a(r2);
        r0.startAnimation(r5);
        r0 = r8.a;
        r0 = com.whatsapp.Conversation.Y(r0);
        r0.setVisibility(r7);
        r0 = com.whatsapp.App.G();
        if (r0 == 0) goto L_0x00b6;
    L_0x00a0:
        r0 = r8.a;
        r0 = com.whatsapp.Conversation.O(r0);
        r5 = com.whatsapp.Conversation.e(r2);
        r0.startAnimation(r5);
        r0 = r8.a;
        r0 = com.whatsapp.Conversation.O(r0);
        r0.setVisibility(r7);
    L_0x00b6:
        r0 = r8.a;
        r0 = com.whatsapp.Conversation.k(r0);
        r1 = com.whatsapp.dz.a(r1);
        r0.startAnimation(r1);
        r0 = r8.a;
        r0 = com.whatsapp.Conversation.k(r0);
        r0.setVisibility(r2);
    L_0x00cc:
        r0 = r8.a;
        r0 = com.whatsapp.Conversation.m(r0);
        if (r0 != 0) goto L_0x00ee;
    L_0x00d4:
        r0 = r4.length();
        if (r0 == 0) goto L_0x00e5;
    L_0x00da:
        r0 = r8.a;
        r0 = r0.r;
        r0 = r0.e;
        com.whatsapp.App.c(r0, r2);
        if (r3 == 0) goto L_0x00ee;
    L_0x00e5:
        r0 = r8.a;
        r0 = r0.r;
        r0 = r0.e;
        com.whatsapp.App.h(r0);
    L_0x00ee:
        r0 = r8.a;
        com.whatsapp.util.a5.a(r9, r0);
        return;
    L_0x00f4:
        r0 = r2;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lp.afterTextChanged(android.text.Editable):void");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        b7.a(Conversation.A(this.a), charSequence);
    }
}
