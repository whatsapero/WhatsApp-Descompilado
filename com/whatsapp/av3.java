package com.whatsapp;

import android.widget.AbsListView.OnScrollListener;

class av3 implements OnScrollListener {
    private int a;
    final Conversation b;

    av3(Conversation conversation) {
        this.b = conversation;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r12, int r13, int r14, int r15) {
        /*
        r11_this = this;
        r2 = 0;
        r1 = 1;
        r8 = 0;
        r10 = 8;
        r9 = com.whatsapp.App.az;
        r0 = r11.b;
        com.whatsapp.Conversation.b(r0, r13);
        r0 = r11.b;
        com.whatsapp.Conversation.b(r0, r8);
        r0 = r13 + r14;
        r3 = r11.b;
        r3 = r3.aS;
        r3 = r3.getCount();
        if (r0 < r3) goto L_0x0024;
    L_0x001d:
        r0 = r11.b;
        com.whatsapp.Conversation.b(r0, r1);
        if (r9 == 0) goto L_0x0030;
    L_0x0024:
        r0 = r11.b;
        com.whatsapp.Conversation.b(r0, r8);
        r0 = r11.b;
        r0 = r0.bd;
        r0.setTranscriptMode(r8);
    L_0x0030:
        r0 = r11.b;
        r0 = com.whatsapp.Conversation.d(r0);
        if (r0 == 0) goto L_0x0173;
    L_0x0038:
        r0 = r11.a;
        if (r0 == r13) goto L_0x0173;
    L_0x003c:
        if (r14 == 0) goto L_0x0173;
    L_0x003e:
        r0 = r11.b;
        r0 = com.whatsapp.Conversation.L(r0);
        r0 = r0.g;
        r3 = 1111490560; // 0x42400000 float:48.0 double:5.491493014E-315;
        r0 = r0 * r3;
        r0 = (int) r0;
        r3 = r11.a;
        if (r13 <= r3) goto L_0x009b;
    L_0x004e:
        r3 = r11.b;
        r3 = com.whatsapp.Conversation.M(r3);
        if (r3 == 0) goto L_0x009b;
    L_0x0056:
        r3 = r15 - r14;
        if (r3 != 0) goto L_0x0065;
    L_0x005a:
        r3 = r11.b;
        r3 = com.whatsapp.Conversation.M(r3);
        r3.setVisibility(r10);
        if (r9 == 0) goto L_0x009b;
    L_0x0065:
        r3 = r12.getHeight();
        r3 = r3 - r0;
        r3 = r3 * r13;
        r4 = r15 - r14;
        r3 = r3 / r4;
        r3 = r3 + r0;
        r4 = r12.getHeight();
        r4 = r4 - r0;
        if (r3 >= r4) goto L_0x0092;
    L_0x0076:
        r3 = r11.b;
        r3 = com.whatsapp.Conversation.M(r3);
        r3.setVisibility(r8);
        r3 = r11.b;
        r3 = com.whatsapp.Conversation.Q(r3);
        if (r3 == 0) goto L_0x009b;
    L_0x0087:
        r3 = r11.b;
        r3 = com.whatsapp.Conversation.Q(r3);
        r3.setVisibility(r10);
        if (r9 == 0) goto L_0x009b;
    L_0x0092:
        r3 = r11.b;
        r3 = com.whatsapp.Conversation.M(r3);
        r3.setVisibility(r10);
    L_0x009b:
        r3 = r11.a;
        if (r13 >= r3) goto L_0x00e6;
    L_0x009f:
        r3 = r11.b;
        r3 = com.whatsapp.Conversation.Q(r3);
        if (r3 == 0) goto L_0x00e6;
    L_0x00a7:
        r3 = r15 - r14;
        if (r3 != 0) goto L_0x00b6;
    L_0x00ab:
        r3 = r11.b;
        r3 = com.whatsapp.Conversation.Q(r3);
        r3.setVisibility(r10);
        if (r9 == 0) goto L_0x00e6;
    L_0x00b6:
        r3 = r12.getHeight();
        r3 = r3 - r0;
        r3 = r3 * r13;
        r4 = r15 - r14;
        r3 = r3 / r4;
        if (r3 <= r0) goto L_0x00dd;
    L_0x00c1:
        r0 = r11.b;
        r0 = com.whatsapp.Conversation.Q(r0);
        r0.setVisibility(r8);
        r0 = r11.b;
        r0 = com.whatsapp.Conversation.M(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x00d2:
        r0 = r11.b;
        r0 = com.whatsapp.Conversation.M(r0);
        r0.setVisibility(r10);
        if (r9 == 0) goto L_0x00e6;
    L_0x00dd:
        r0 = r11.b;
        r0 = com.whatsapp.Conversation.Q(r0);
        r0.setVisibility(r10);
    L_0x00e6:
        r0 = r11.b;
        r0 = r0.bd;
        r0 = r0.getHeaderViewsCount();
        r0 = r13 - r0;
        if (r0 < 0) goto L_0x016a;
    L_0x00f2:
        r3 = r11.b;
        r3 = r3.aS;
        r0 = r3.getItem(r0);
        r0 = (com.whatsapp.protocol.b) r0;
        if (r0 == 0) goto L_0x015f;
    L_0x00fe:
        r4 = r0.D;
        r6 = java.lang.System.currentTimeMillis();
        r3 = com.whatsapp.util.bm.a(r4, r6);
        if (r3 != 0) goto L_0x015f;
    L_0x010a:
        r3 = r11.b;
        r3 = com.whatsapp.Conversation.ai(r3);
        r4 = r11.b;
        r6 = r0.D;
        r0 = com.whatsapp.util.bm.b(r4, r6);
        r3.setText(r0);
        r0 = r11.b;
        r0 = com.whatsapp.Conversation.ai(r0);
        r3 = r11.b;
        r3 = r3.getResources();
        r3 = com.whatsapp.ConversationRow.a(r3);
        r0.setTextSize(r3);
        r0 = r11.b;
        r0 = com.whatsapp.Conversation.ai(r0);
        r0 = r0.getVisibility();
        if (r0 == 0) goto L_0x0168;
    L_0x013a:
        r0 = r11.b;
        r0 = com.whatsapp.Conversation.ai(r0);
        r0.setVisibility(r8);
        r0 = new android.view.animation.TranslateAnimation;
        r6 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r3 = r1;
        r4 = r2;
        r5 = r1;
        r7 = r1;
        r8 = r2;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r0.setDuration(r2);
        r2 = r11.b;
        r2 = com.whatsapp.Conversation.ai(r2);
        r2.startAnimation(r0);
        if (r9 == 0) goto L_0x0168;
    L_0x015f:
        r0 = r11.b;
        r0 = com.whatsapp.Conversation.ai(r0);
        r0.setVisibility(r10);
    L_0x0168:
        if (r9 == 0) goto L_0x0173;
    L_0x016a:
        r0 = r11.b;
        r0 = com.whatsapp.Conversation.ai(r0);
        r0.setVisibility(r10);
    L_0x0173:
        r0 = r11.a;
        if (r0 == r13) goto L_0x0182;
    L_0x0177:
        r0 = r11.b;
        r0 = com.whatsapp.Conversation.d(r0);
        if (r0 == 0) goto L_0x0182;
    L_0x017f:
        com.whatsapp.util.bo.a(r1);
    L_0x0182:
        r11.a = r13;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.av3.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(android.widget.AbsListView r7, int r8) {
        /*
        r6_this = this;
        r1 = 1;
        r2 = 0;
        if (r8 == 0) goto L_0x0025;
    L_0x0004:
        r0 = r6.b;
        r3 = r0.bd;
        r0 = android.os.Build.VERSION.SDK_INT;
        r4 = 11;
        if (r0 >= r4) goto L_0x0041;
    L_0x000e:
        r0 = r1;
    L_0x000f:
        r3.setFastScrollEnabled(r0);
        r0 = r6.b;
        r0 = com.whatsapp.Conversation.G(r0);
        r3 = r6.b;
        r3 = com.whatsapp.Conversation.s(r3);
        r0.removeCallbacks(r3);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0036;
    L_0x0025:
        r0 = r6.b;
        r0 = com.whatsapp.Conversation.G(r0);
        r3 = r6.b;
        r3 = com.whatsapp.Conversation.s(r3);
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.postDelayed(r3, r4);
    L_0x0036:
        r0 = r6.b;
        com.whatsapp.Conversation.a(r0, r8);
        if (r8 == 0) goto L_0x0043;
    L_0x003d:
        com.whatsapp.util.bo.a(r1);
        return;
    L_0x0041:
        r0 = r2;
        goto L_0x000f;
    L_0x0043:
        r1 = r2;
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.av3.onScrollStateChanged(android.widget.AbsListView, int):void");
    }
}
