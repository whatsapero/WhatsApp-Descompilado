package com.whatsapp;

import android.graphics.Bitmap;

class avw implements Runnable {
    final cl a;
    final Bitmap b;

    avw(cl clVar, Bitmap bitmap) {
        this.a = clVar;
        this.b = bitmap;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r4_this = this;
        r3 = 0;
        r0 = r4.a;
        r0 = r0.c;
        r1 = r4.a;
        r1 = r1.a;
        r1 = r1.h;
        r1 = r1.A;
        if (r0 != r1) goto L_0x007b;
    L_0x000f:
        r0 = r4.a;
        r0 = r0.a;
        r0 = r0.isShown();
        if (r0 == 0) goto L_0x007b;
    L_0x0019:
        r0 = r4.a;
        r0 = r0.d;
        if (r0 != 0) goto L_0x002f;
    L_0x001f:
        r0 = r4.a;
        r1 = r4.a;
        r1 = r1.a;
        r1 = com.whatsapp.ConversationRowVideo.a(r1);
        r1 = r1.getDrawable();
        r0.d = r1;
    L_0x002f:
        r0 = new android.graphics.drawable.BitmapDrawable;
        r1 = r4.a;
        r1 = r1.a;
        r1 = r1.getResources();
        r2 = r4.b;
        r0.<init>(r1, r2);
        r1 = r4.a;
        r1 = r1.d;
        if (r1 == 0) goto L_0x006c;
    L_0x0044:
        r1 = 2;
        r1 = new android.graphics.drawable.Drawable[r1];
        r2 = r4.a;
        r2 = r2.d;
        r1[r3] = r2;
        r2 = 1;
        r1[r2] = r0;
        r2 = new android.graphics.drawable.TransitionDrawable;
        r2.<init>(r1);
        r2.setCrossFadeEnabled(r3);
        r1 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r2.startTransition(r1);
        r1 = r4.a;
        r1 = r1.a;
        r1 = com.whatsapp.ConversationRowVideo.a(r1);
        r1.setImageDrawable(r2);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0077;
    L_0x006c:
        r1 = r4.a;
        r1 = r1.a;
        r1 = com.whatsapp.ConversationRowVideo.a(r1);
        r1.setImageDrawable(r0);
    L_0x0077:
        r1 = r4.a;
        r1.d = r0;
    L_0x007b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.avw.run():void");
    }
}
