package com.whatsapp.notification;

import android.text.TextWatcher;
import com.whatsapp.b7;

class r implements TextWatcher {
    final PopupNotification a;

    r(PopupNotification popupNotification) {
        this.a = popupNotification;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r8) {
        /*
        r7_this = this;
        r6 = 8;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.notification.PopupNotification.H;
        com.whatsapp.App.T();
        r0 = r8.toString();
        r4 = r0.length();
        if (r4 <= 0) goto L_0x001c;
    L_0x0013:
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.h(r4);
        r4.setVisibility(r2);
    L_0x001c:
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.t(r4);
        if (r4 == 0) goto L_0x0042;
    L_0x0024:
        r4 = r0.length();
        if (r4 == 0) goto L_0x0037;
    L_0x002a:
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.t(r4);
        r4 = r4.e;
        com.whatsapp.App.c(r4, r2);
        if (r3 == 0) goto L_0x0042;
    L_0x0037:
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.t(r4);
        r4 = r4.e;
        com.whatsapp.App.h(r4);
    L_0x0042:
        r4 = r7.a;
        com.whatsapp.util.a5.a(r8, r4);
        r0 = r0.trim();
        r0 = r0.length();
        if (r0 <= 0) goto L_0x00d2;
    L_0x0051:
        r0 = r1;
    L_0x0052:
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.h(r4);
        r4.setEnabled(r0);
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.m(r4);
        r4 = r4.getVisibility();
        if (r4 != r6) goto L_0x0097;
    L_0x0067:
        if (r0 != 0) goto L_0x0097;
    L_0x0069:
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.m(r4);
        r5 = com.whatsapp.dz.a(r1);
        r4.startAnimation(r5);
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.m(r4);
        r4.setVisibility(r2);
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.h(r4);
        r5 = com.whatsapp.dz.a(r2);
        r4.startAnimation(r5);
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.h(r4);
        r4.setVisibility(r6);
        if (r3 == 0) goto L_0x00d1;
    L_0x0097:
        r3 = r7.a;
        r3 = com.whatsapp.notification.PopupNotification.m(r3);
        r3 = r3.getVisibility();
        if (r3 != 0) goto L_0x00d1;
    L_0x00a3:
        if (r0 == 0) goto L_0x00d1;
    L_0x00a5:
        r0 = r7.a;
        r0 = com.whatsapp.notification.PopupNotification.m(r0);
        r3 = com.whatsapp.dz.a(r2);
        r0.startAnimation(r3);
        r0 = r7.a;
        r0 = com.whatsapp.notification.PopupNotification.m(r0);
        r0.setVisibility(r6);
        r0 = r7.a;
        r0 = com.whatsapp.notification.PopupNotification.h(r0);
        r1 = com.whatsapp.dz.a(r1);
        r0.startAnimation(r1);
        r0 = r7.a;
        r0 = com.whatsapp.notification.PopupNotification.h(r0);
        r0.setVisibility(r2);
    L_0x00d1:
        return;
    L_0x00d2:
        r0 = r2;
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.r.afterTextChanged(android.text.Editable):void");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        b7.a(PopupNotification.j(this.a), charSequence);
    }
}
