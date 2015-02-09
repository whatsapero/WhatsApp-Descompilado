package com.whatsapp;

import android.view.View.OnTouchListener;

class anh implements OnTouchListener {
    final Conversation a;

    anh(Conversation conversation) {
        this.a = conversation;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
        r5_this = this;
        r4 = 0;
        r1 = com.whatsapp.App.az;
        r0 = r7.getAction();
        r2 = 1;
        if (r0 != r2) goto L_0x0068;
    L_0x000a:
        r0 = r5.a;
        r0 = com.whatsapp.Conversation.W(r0);
        r0 = r0.size();
        if (r0 <= 0) goto L_0x0068;
    L_0x0016:
        r0 = r5.a;
        r0 = com.whatsapp.Conversation.x(r0);
        if (r0 == 0) goto L_0x0030;
    L_0x001e:
        r0 = r5.a;
        r0 = r0.aS;
        r0 = r0.getCursor();
        r0.requery();
        r0 = r5.a;
        com.whatsapp.Conversation.d(r0, r4);
        if (r1 == 0) goto L_0x005f;
    L_0x0030:
        r0 = r5.a;
        r0 = com.whatsapp.Conversation.W(r0);
        r2 = r0.iterator();
    L_0x003a:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0053;
    L_0x0040:
        r0 = r2.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r3 = r0.e;
        r3 = r3.b;
        if (r3 != 0) goto L_0x0051;
    L_0x004c:
        r3 = r5.a;
        com.whatsapp.Conversation.f(r3, r0);
    L_0x0051:
        if (r1 == 0) goto L_0x003a;
    L_0x0053:
        r0 = r5.a;
        r0 = r0.aS;
        r0.notifyDataSetChanged();
        r0 = r5.a;
        com.whatsapp.Conversation.T(r0);
    L_0x005f:
        r0 = r5.a;
        r0 = com.whatsapp.Conversation.W(r0);
        r0.clear();
    L_0x0068:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.anh.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
