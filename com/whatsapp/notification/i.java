package com.whatsapp.notification;

import android.view.MotionEvent;
import com.whatsapp.App;
import com.whatsapp.n9;

class i implements n9 {
    final PopupNotification a;
    boolean b;

    public void c() {
        App.T();
        if (PopupNotification.g(this.a) != null) {
            PopupNotification.f(this.a).add(PopupNotification.g(this.a).e);
        }
        if (PopupNotification.t(this.a) != null) {
            PopupNotification.b(this.a).add(PopupNotification.t(this.a).e);
        }
    }

    public void a() {
    }

    public void a(MotionEvent motionEvent) {
    }

    public void b(int i) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r6) {
        /*
        r5_this = this;
        r4 = 1;
        r3 = 0;
        r0 = com.whatsapp.notification.PopupNotification.H;
        r1 = r5.b;
        if (r1 == 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r5.b = r4;
        r1 = r5.a;
        r1 = com.whatsapp.notification.PopupNotification.k(r1);
        r1 = r1.size();
        if (r1 != r4) goto L_0x001e;
    L_0x0017:
        r1 = r5.a;
        r1.b(r3);
        if (r0 == 0) goto L_0x0089;
    L_0x001e:
        if (r6 != 0) goto L_0x005b;
    L_0x0020:
        r1 = r5.a;
        r1 = com.whatsapp.notification.PopupNotification.q(r1);
        r2 = r5.a;
        r2 = com.whatsapp.notification.PopupNotification.k(r2);
        r2 = r2.size();
        r2 = r2 + 1;
        r1.setCurrentScreen(r2);
        r1 = r5.a;
        r1 = com.whatsapp.notification.PopupNotification.q(r1);
        r2 = r5.a;
        r2 = com.whatsapp.notification.PopupNotification.k(r2);
        r2 = r2.size();
        r1.a(r2);
        r1 = r5.a;
        r2 = r5.a;
        r2 = com.whatsapp.notification.PopupNotification.k(r2);
        r2 = r2.size();
        r2 = r2 + -1;
        r1.b(r2);
        if (r0 == 0) goto L_0x0089;
    L_0x005b:
        r1 = r5.a;
        r1 = com.whatsapp.notification.PopupNotification.k(r1);
        r1 = r1.size();
        r1 = r1 + 1;
        if (r6 != r1) goto L_0x0082;
    L_0x0069:
        r1 = r5.a;
        r1 = com.whatsapp.notification.PopupNotification.q(r1);
        r1.setCurrentScreen(r3);
        r1 = r5.a;
        r1 = com.whatsapp.notification.PopupNotification.q(r1);
        r1.a(r4);
        r1 = r5.a;
        r1.b(r3);
        if (r0 == 0) goto L_0x0089;
    L_0x0082:
        r0 = r5.a;
        r1 = r6 + -1;
        r0.b(r1);
    L_0x0089:
        r5.b = r3;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.i.a(int):void");
    }

    i(PopupNotification popupNotification) {
        this.a = popupNotification;
    }

    public void b() {
    }
}
