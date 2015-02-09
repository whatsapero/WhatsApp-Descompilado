package com.whatsapp;

import android.os.Handler;
import com.google.android.maps.MapView;

class a8a extends Handler {
    final MapView a;
    final e5 b;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r5) {
        /*
        r4_this = this;
        r0 = r4.b;
        r0 = com.whatsapp.e5.a(r0);
        r1 = r4.b;
        r1 = com.whatsapp.e5.b(r1);
        if (r0 != r1) goto L_0x001d;
    L_0x000e:
        r0 = r4.b;
        r1 = r4.b;
        r1 = com.whatsapp.e5.c(r1);
        com.whatsapp.e5.a(r0, r1);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0028;
    L_0x001d:
        r0 = r4.b;
        r1 = r4.b;
        r1 = com.whatsapp.e5.b(r1);
        com.whatsapp.e5.a(r0, r1);
    L_0x0028:
        r0 = r4.a;
        r1 = r4.b;
        r1 = com.whatsapp.e5.a(r1);
        r1 = r1.getBounds();
        r0.invalidate(r1);
        r0 = 0;
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r4.sendEmptyMessageDelayed(r0, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a8a.handleMessage(android.os.Message):void");
    }

    a8a(e5 e5Var, MapView mapView) {
        this.b = e5Var;
        this.a = mapView;
    }
}
