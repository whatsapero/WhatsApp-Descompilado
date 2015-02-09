package com.whatsapp;

import android.view.GestureDetector.SimpleOnGestureListener;

class _r extends SimpleOnGestureListener {
    final GalleryView a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onFling(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        /*
        r6_this = this;
        r1 = 0;
        r5 = 1128792064; // 0x43480000 float:200.0 double:5.5769738E-315;
        r4 = 1123024896; // 0x42f00000 float:120.0 double:5.548480205E-315;
        r2 = 1;
        r0 = r7.getY();	 Catch:{ Exception -> 0x0071 }
        r3 = r8.getY();	 Catch:{ Exception -> 0x0071 }
        r0 = r0 - r3;
        r0 = java.lang.Math.abs(r0);	 Catch:{ Exception -> 0x0071 }
        r3 = 1132068864; // 0x437a0000 float:250.0 double:5.593163344E-315;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x001b;
    L_0x0019:
        r0 = r1;
    L_0x001a:
        return r0;
    L_0x001b:
        r0 = r7.getX();	 Catch:{ Exception -> 0x0069 }
        r3 = r8.getX();	 Catch:{ Exception -> 0x0069 }
        r0 = r0 - r3;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x0074;
    L_0x0028:
        r0 = java.lang.Math.abs(r9);	 Catch:{ Exception -> 0x0069 }
        r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
        if (r0 <= 0) goto L_0x0074;
    L_0x0030:
        r0 = r6.a;	 Catch:{ Exception -> 0x006b }
        r0 = com.whatsapp.GalleryView.a(r0);	 Catch:{ Exception -> 0x006b }
        if (r0 == r2) goto L_0x0072;
    L_0x0038:
        r0 = r6.a;	 Catch:{ Exception -> 0x006d }
        r3 = r6.a;	 Catch:{ Exception -> 0x006d }
        r3 = com.whatsapp.GalleryView.b(r3);	 Catch:{ Exception -> 0x006d }
        r0 = r0.getChildAt(r3);	 Catch:{ Exception -> 0x006d }
        r0 = (com.whatsapp.TouchImageView) r0;	 Catch:{ Exception -> 0x006d }
        r0 = r0.n;	 Catch:{ Exception -> 0x006d }
        if (r0 != 0) goto L_0x0072;
    L_0x004a:
        r0 = r6.a;	 Catch:{ Exception -> 0x006f }
        r0 = com.whatsapp.GalleryView.b(r0);	 Catch:{ Exception -> 0x006f }
        r3 = r6.a;	 Catch:{ Exception -> 0x006f }
        r3 = r3.getChildCount();	 Catch:{ Exception -> 0x006f }
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0072;
    L_0x005a:
        r0 = r6.a;	 Catch:{ Exception -> 0x0071 }
        r3 = r6.a;	 Catch:{ Exception -> 0x0071 }
        r3 = com.whatsapp.GalleryView.b(r3);	 Catch:{ Exception -> 0x0071 }
        r3 = r3 + 1;
        r0.a(r3);	 Catch:{ Exception -> 0x0071 }
        r0 = r2;
        goto L_0x001a;
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
    L_0x0072:
        r0 = r1;
        goto L_0x001a;
    L_0x0074:
        r0 = r8.getX();	 Catch:{ Exception -> 0x00bb }
        r3 = r7.getX();	 Catch:{ Exception -> 0x00bb }
        r0 = r0 - r3;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x0072;
    L_0x0081:
        r0 = java.lang.Math.abs(r9);	 Catch:{ Exception -> 0x00bb }
        r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
        if (r0 <= 0) goto L_0x0072;
    L_0x0089:
        r0 = r6.a;	 Catch:{ Exception -> 0x00bd }
        r0 = com.whatsapp.GalleryView.a(r0);	 Catch:{ Exception -> 0x00bd }
        if (r0 == r2) goto L_0x0072;
    L_0x0091:
        r0 = r6.a;	 Catch:{ Exception -> 0x00bf }
        r3 = r6.a;	 Catch:{ Exception -> 0x00bf }
        r3 = com.whatsapp.GalleryView.b(r3);	 Catch:{ Exception -> 0x00bf }
        r0 = r0.getChildAt(r3);	 Catch:{ Exception -> 0x00bf }
        r0 = (com.whatsapp.TouchImageView) r0;	 Catch:{ Exception -> 0x00bf }
        r0 = r0.n;	 Catch:{ Exception -> 0x00bf }
        if (r0 != 0) goto L_0x0072;
    L_0x00a3:
        r0 = r6.a;	 Catch:{ Exception -> 0x00c1 }
        r0 = com.whatsapp.GalleryView.b(r0);	 Catch:{ Exception -> 0x00c1 }
        if (r0 <= 0) goto L_0x0072;
    L_0x00ab:
        r0 = r6.a;	 Catch:{ Exception -> 0x0071 }
        r3 = r6.a;	 Catch:{ Exception -> 0x0071 }
        r3 = com.whatsapp.GalleryView.b(r3);	 Catch:{ Exception -> 0x0071 }
        r3 = r3 + -1;
        r0.a(r3);	 Catch:{ Exception -> 0x0071 }
        r0 = r2;
        goto L_0x001a;
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0071 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp._r.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    _r(GalleryView galleryView) {
        this.a = galleryView;
    }
}
