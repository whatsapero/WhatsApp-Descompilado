package com.whatsapp;

import android.os.Handler;

class iu extends Handler {
    final SetStatus a;

    iu(SetStatus setStatus) {
        this.a = setStatus;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r8) {
        /*
        r7_this = this;
        r3 = 1;
        r2 = 0;
        r4 = com.whatsapp.App.az;
        r0 = r8.what;
        if (r0 != r3) goto L_0x0052;
    L_0x0008:
        r0 = r7.a;
        r0 = r0.o;
        r1 = com.whatsapp.App.as;
        r5 = r7.a;
        r5 = r5.getBaseContext();
        r1 = com.whatsapp.util.a5.d(r1, r5);
        r0.setText(r1);
        r0 = com.whatsapp.SetStatus.q;
        r5 = r0.iterator();
        r1 = r2;
    L_0x0022:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0075;
    L_0x0028:
        r0 = r5.next();
        r0 = (java.lang.String) r0;
        r6 = com.whatsapp.App.as;
        r0 = r0.equals(r6);
        if (r0 == 0) goto L_0x0073;
    L_0x0036:
        if (r4 == 0) goto L_0x0071;
    L_0x0038:
        r0 = r3;
    L_0x0039:
        if (r4 == 0) goto L_0x006f;
    L_0x003b:
        if (r0 != 0) goto L_0x0044;
    L_0x003d:
        r0 = com.whatsapp.SetStatus.q;
        r1 = com.whatsapp.App.as;
        r0.add(r2, r1);
    L_0x0044:
        r0 = r7.a;
        r0 = r0.s;
        r0.notifyDataSetInvalidated();
        r0 = r7.a;
        com.whatsapp.SetStatus.d(r0);
        if (r4 == 0) goto L_0x005a;
    L_0x0052:
        r0 = com.whatsapp.App.p;
        r1 = 2131624959; // 0x7f0e03ff float:1.8877112E38 double:1.053162662E-314;
        com.whatsapp.App.b(r0, r1, r2);
    L_0x005a:
        r0 = r7.a;
        r1 = 2;
        r0.removeDialog(r1);
        r0 = r7.a;
        r0 = com.whatsapp.SetStatus.c(r0);
        r1 = new com.whatsapp.as_;
        r1.<init>(r7);
        r0.setOnClickListener(r1);
        return;
    L_0x006f:
        r1 = r0;
        goto L_0x0022;
    L_0x0071:
        r0 = r3;
        goto L_0x003b;
    L_0x0073:
        r0 = r1;
        goto L_0x0039;
    L_0x0075:
        r0 = r1;
        goto L_0x003b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.iu.handleMessage(android.os.Message):void");
    }
}
