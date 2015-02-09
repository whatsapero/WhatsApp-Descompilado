package com.whatsapp;

import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;

class gt extends fc {
    private static final String[] z;
    final Conversation a;

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "4CYr}%_Vpq8B\u0018hq$XTly9KR`7;CV`}6^[m}%\u0003Ykl!EDmz;I\u0018v}:CAaz\"XCkv";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000a:
        r2 = r2.toCharArray();
        r6 = r2.length;
        r7 = r6;
        r8 = r1;
        r6 = r2;
    L_0x0012:
        if (r7 > r8) goto L_0x002f;
    L_0x0014:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0020;
        };
    L_0x0020:
        r4[r3] = r2;
        r2 = 1;
        r0 = "4CYr}%_Vpq8B\u0018hq$XTly9KR`7;CV`}6^[m}%\u0003_ay3IEgv#\f";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x002f:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x0040;
            case 1: goto L_0x0043;
            case 2: goto L_0x0046;
            case 3: goto L_0x0049;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 24;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 87;
        goto L_0x0038;
    L_0x0043:
        r2 = 44;
        goto L_0x0038;
    L_0x0046:
        r2 = 55;
        goto L_0x0038;
    L_0x0049:
        r2 = 4;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gt.<clinit>():void");
    }

    public void b(b bVar, int i) {
        if (bVar != null && bVar.e.c.equals(this.a.u)) {
            Conversation.c(this.a, bVar);
            if (i == 3 && bVar.j == 1 && this.a.bd.getLastVisiblePosition() >= this.a.bd.getCount() - 2 && this.a.bd.getChildCount() > 0 && bVar.equals(this.a.bd.getChildAt(this.a.bd.getChildCount() - 1).getTag())) {
                Conversation.J(this.a);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.b r4, int r5) {
        /*
        r3_this = this;
        r0 = com.whatsapp.App.az;
        if (r4 == 0) goto L_0x0057;
    L_0x0004:
        r1 = r4.e;
        r1 = r1.c;
        r2 = r3.a;
        r2 = r2.u;
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0057;
    L_0x0012:
        r1 = r3.a;
        r1 = com.whatsapp.Conversation.d(r1);
        if (r1 == 0) goto L_0x0025;
    L_0x001a:
        r1 = r3.a;
        r1 = com.whatsapp.Conversation.W(r1);
        r1.add(r4);
        if (r0 == 0) goto L_0x0057;
    L_0x0025:
        r1 = r3.a;
        r1 = com.whatsapp.Conversation.x(r1);
        if (r1 == 0) goto L_0x0040;
    L_0x002d:
        r1 = r3.a;
        r1 = r1.aS;
        r1 = r1.getCursor();
        r1.requery();
        r1 = r3.a;
        r2 = 0;
        com.whatsapp.Conversation.d(r1, r2);
        if (r0 == 0) goto L_0x004b;
    L_0x0040:
        r0 = r4.e;
        r0 = r0.b;
        if (r0 != 0) goto L_0x004b;
    L_0x0046:
        r0 = r3.a;
        com.whatsapp.Conversation.f(r0, r4);
    L_0x004b:
        r0 = r3.a;
        r0 = r0.aS;
        r0.notifyDataSetChanged();
        r0 = r3.a;
        com.whatsapp.Conversation.T(r0);
    L_0x0057:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gt.a(com.whatsapp.protocol.b, int):void");
    }

    public void a(String str) {
        if (str != null && str.equals(this.a.u)) {
            this.a.aS.getCursor().requery();
            if (!App.aJ.h(this.a.u) && Conversation.S(this.a) != null) {
                Conversation.S(this.a).setVisibility(8);
                this.a.bd.removeHeaderView(Conversation.S(this.a));
                Log.i(z[1] + this.a.bd.getHeaderViewsCount());
                Conversation.a(this.a, null);
                Log.i(z[0]);
                this.a.aS.notifyDataSetChanged();
            }
        }
    }

    public void c(b bVar) {
        if (bVar != null && bVar.e.c.equals(this.a.u) && bVar.e.b) {
            if (this.a.aS.getCursor() != null) {
                Conversation.e(this.a).add(bVar);
            }
            if (Conversation.H(this.a) && bVar.a == 6 && (bVar.k == 1 || bVar.k == 4 || bVar.k == 5 || bVar.k == 7 || bVar.k == 12 || bVar.k == 13 || bVar.k == 14 || bVar.k == 17)) {
                Conversation.ah(this.a);
            }
            if (Conversation.H(this.a) && Conversation.p(this.a) != 0) {
                a35.a(this.a.aS, a35.a(this.a.aS));
                Conversation.c(this.a, 0);
            }
            this.a.aS.notifyDataSetChanged();
            Conversation.J(this.a);
        }
    }

    gt(Conversation conversation) {
        this.a = conversation;
    }
}
