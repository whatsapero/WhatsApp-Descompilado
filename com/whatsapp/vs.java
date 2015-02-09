package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.b;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class vs implements Runnable {
    private static final String[] z;
    final Handler a;
    final b b;
    int d;
    final Conversation e;

    static {
        String[] strArr = new String[3];
        String str = "'r\u00125";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 9;
                        break;
                    case ay.f /*1*/:
                        i3 = 24;
                        break;
                    case ay.n /*2*/:
                        i3 = 98;
                        break;
                    case ay.p /*3*/:
                        i3 = 82;
                        break;
                    default:
                        i3 = 35;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = ")0";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "}}\u0011&\u000ejt\r<F$";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    vs(Conversation conversation, b bVar, Handler handler) {
        this.e = conversation;
        this.b = bVar;
        this.a = handler;
        this.d = 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r10_this = this;
        r9 = 0;
        r8 = 1;
        r1 = com.whatsapp.App.az;
        r2 = new com.whatsapp.protocol.b;
        r0 = new com.whatsapp.protocol.m;
        r3 = r10.b;
        r3 = r3.e;
        r3 = r3.c;
        r4 = r10.b;
        r4 = r4.e;
        r4 = r4.b;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r6 = r6[r8];
        r5 = r5.append(r6);
        r6 = java.lang.System.currentTimeMillis();
        r6 = java.lang.Long.toString(r6);
        r5 = r5.append(r6);
        r5 = r5.toString();
        r0.<init>(r3, r4, r5);
        r2.<init>(r0);
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01ad }
        r0 = r0.F;	 Catch:{ FileNotFoundException -> 0x01ad }
        r2.F = r0;	 Catch:{ FileNotFoundException -> 0x01ad }
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01ad }
        r0 = r0.O;	 Catch:{ FileNotFoundException -> 0x01ad }
        if (r0 != 0) goto L_0x004e;
    L_0x0043:
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01ad }
        r0 = r0.f();	 Catch:{ FileNotFoundException -> 0x01ad }
        r2.b(r0);	 Catch:{ FileNotFoundException -> 0x01ad }
        if (r1 == 0) goto L_0x0057;
    L_0x004e:
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01af }
        r0 = r0.c();	 Catch:{ FileNotFoundException -> 0x01af }
        r2.b(r0);	 Catch:{ FileNotFoundException -> 0x01af }
    L_0x0057:
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r4 = r0.D;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r2.D = r4;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r0.a;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r2.a = r0;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r4 = r0.K;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r2.K = r4;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r4 = r0.G;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r2.G = r4;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r0.t;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r2.t = r0;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r0.j;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r2.j = r0;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r0.s;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r2.s = r0;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r4 = r0.k;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r2.k = r4;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r0.p;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r2.p = r0;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r0.w;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r2.w = r0;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r0.H;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r2.H = r0;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r0.A;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r2.A = r0;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r0.j;	 Catch:{ FileNotFoundException -> 0x01b1 }
        if (r0 != 0) goto L_0x00ce;
    L_0x00a5:
        r0 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0.<init>();	 Catch:{ FileNotFoundException -> 0x01b1 }
        r3 = r2.f();	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r0.append(r3);	 Catch:{ FileNotFoundException -> 0x01b1 }
        r3 = z;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r0.append(r3);	 Catch:{ FileNotFoundException -> 0x01b1 }
        r3 = r10.d;	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r0.append(r3);	 Catch:{ FileNotFoundException -> 0x01b1 }
        r3 = ")";
        r0 = r0.append(r3);	 Catch:{ FileNotFoundException -> 0x01b1 }
        r0 = r0.toString();	 Catch:{ FileNotFoundException -> 0x01b1 }
        r2.b(r0);	 Catch:{ FileNotFoundException -> 0x01b1 }
    L_0x00ce:
        r0 = r10.b;
        r0 = r0.j;
        if (r0 != r8) goto L_0x0197;
    L_0x00d4:
        r0 = r10.b;
        r0 = com.whatsapp.util.bo.b(r0);
        r3 = r0.getWidth();
        r4 = r0.getHeight();
        r5 = r0.getConfig();
        r3 = android.graphics.Bitmap.createBitmap(r3, r4, r5);
        r4 = new android.graphics.Canvas;
        r4.<init>(r3);
        r5 = new android.graphics.Paint;
        r5.<init>();
        r5.setAntiAlias(r8);
        r5.setFilterBitmap(r8);
        r5.setDither(r8);
        r4.drawBitmap(r0, r9, r9, r5);
        r5 = new android.text.TextPaint;
        r5.<init>();
        r5.setAntiAlias(r8);
        r6 = -1;
        r5.setColor(r6);
        r6 = 1108344832; // 0x42100000 float:36.0 double:5.47595105E-315;
        r5.setTextSize(r6);
        r6 = android.graphics.Typeface.DEFAULT_BOLD;
        r5.setTypeface(r6);
        r6 = android.graphics.Paint.Align.CENTER;
        r5.setTextAlign(r6);
        r6 = r10.d;
        r6 = java.lang.Integer.toString(r6);
        r7 = r0.getWidth();
        r7 = r7 / 2;
        r7 = (float) r7;
        r0 = r0.getHeight();
        r0 = r0 / 2;
        r0 = (float) r0;
        r4.drawText(r6, r7, r0, r5);
        r0 = new java.io.ByteArrayOutputStream;
        r0.<init>();
        r4 = android.graphics.Bitmap.CompressFormat.JPEG;
        r5 = 80;
        r3.compress(r4, r5, r0);
        r0 = r0.toByteArray();
        r2.O = r8;
        r2.b(r0);
        r0 = r2.e;
        r0 = r0.b;
        if (r0 == 0) goto L_0x0190;
    L_0x014d:
        r3 = new com.whatsapp.MediaData;
        r3.<init>();
        r0 = com.whatsapp.util.f.b(r8);
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r4.append(r0);
        r4 = z;
        r5 = 0;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r0 = r0.toString();
        r0 = com.whatsapp.App.a(r0, r8, r8);
        r3.file = r0;
        r0 = r2.A;	 Catch:{ FileNotFoundException -> 0x01b3, IOException -> 0x01b8 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ FileNotFoundException -> 0x01b3, IOException -> 0x01b8 }
        r0 = r0.file;	 Catch:{ FileNotFoundException -> 0x01b3, IOException -> 0x01b8 }
        r4 = r3.file;	 Catch:{ FileNotFoundException -> 0x01b3, IOException -> 0x01b8 }
        com.whatsapp.util.f.a(r0, r4);	 Catch:{ FileNotFoundException -> 0x01b3, IOException -> 0x01b8 }
    L_0x017d:
        r0 = r10.b;	 Catch:{ FileNotFoundException -> 0x01bd }
        r0 = r0.e;	 Catch:{ FileNotFoundException -> 0x01bd }
        r0 = r0.c;	 Catch:{ FileNotFoundException -> 0x01bd }
        r4 = r2.c();	 Catch:{ FileNotFoundException -> 0x01bd }
        r5 = r2.j;	 Catch:{ FileNotFoundException -> 0x01bd }
        r6 = r2.w;	 Catch:{ FileNotFoundException -> 0x01bd }
        com.whatsapp.App.a(r0, r4, r3, r5, r6);	 Catch:{ FileNotFoundException -> 0x01bd }
        if (r1 == 0) goto L_0x0195;
    L_0x0190:
        r0 = com.whatsapp.App.aJ;	 Catch:{ FileNotFoundException -> 0x01bd }
        r0.f(r2);	 Catch:{ FileNotFoundException -> 0x01bd }
    L_0x0195:
        if (r1 == 0) goto L_0x019c;
    L_0x0197:
        r0 = com.whatsapp.App.aJ;	 Catch:{ FileNotFoundException -> 0x01bf }
        r0.f(r2);	 Catch:{ FileNotFoundException -> 0x01bf }
    L_0x019c:
        r0 = r10.d;	 Catch:{ FileNotFoundException -> 0x01c1 }
        r0 = r0 + 1;
        r10.d = r0;	 Catch:{ FileNotFoundException -> 0x01c1 }
        r1 = 5;
        if (r0 >= r1) goto L_0x01ac;
    L_0x01a5:
        r0 = r10.a;	 Catch:{ FileNotFoundException -> 0x01c1 }
        r2 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r0.postDelayed(r10, r2);	 Catch:{ FileNotFoundException -> 0x01c1 }
    L_0x01ac:
        return;
    L_0x01ad:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x01af }
    L_0x01af:
        r0 = move-exception;
        throw r0;
    L_0x01b1:
        r0 = move-exception;
        throw r0;
    L_0x01b3:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        goto L_0x017d;
    L_0x01b8:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        goto L_0x017d;
    L_0x01bd:
        r0 = move-exception;
        throw r0;
    L_0x01bf:
        r0 = move-exception;
        throw r0;
    L_0x01c1:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.vs.run():void");
    }
}
