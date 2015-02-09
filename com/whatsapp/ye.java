package com.whatsapp;

import com.whatsapp.protocol.b;
import java.util.Stack;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ye extends Thread {
    private static final String[] z;
    private Stack a;
    final MediaView b;

    static {
        String[] strArr = new String[4];
        String str = "\tz\u0000R-\t";
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
                        i3 = 126;
                        break;
                    case ay.f /*1*/:
                        i3 = 19;
                        break;
                    case ay.n /*2*/:
                        i3 = 110;
                        break;
                    case ay.p /*3*/:
                        i3 = 54;
                        break;
                    default:
                        i3 = 66;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0013v\n_#\bz\u000bAm\u0018z\u0002Z4\u0017v\u0019\u0019 \u0017g\u0003W2Q}\u001bZ.";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0013v\n_#\bz\u000bAm";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "1a\u0007S,\nr\u001a_-\u0010";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(b bVar, PhotoView photoView) {
        i3 i3Var = new i3(this, bVar, photoView);
        synchronized (this.a) {
            this.a.add(0, i3Var);
            this.a.notifyAll();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r11_this = this;
        r10 = 3;
        r3 = 1;
        r6 = com.whatsapp.App.az;
    L_0x0004:
        r0 = r11.a;	 Catch:{ InterruptedException -> 0x00e5 }
        r0 = r0.size();	 Catch:{ InterruptedException -> 0x00e5 }
        if (r0 != 0) goto L_0x0015;
    L_0x000c:
        r1 = r11.a;	 Catch:{ InterruptedException -> 0x00e5 }
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x00e5 }
        r0 = r11.a;	 Catch:{ all -> 0x00e2 }
        r0.wait();	 Catch:{ all -> 0x00e2 }
        monitor-exit(r1);	 Catch:{ all -> 0x00e2 }
    L_0x0015:
        r0 = r11.a;	 Catch:{ InterruptedException -> 0x00e5 }
        r0 = r0.size();	 Catch:{ InterruptedException -> 0x00e5 }
        if (r0 == 0) goto L_0x00d6;
    L_0x001d:
        r1 = r11.a;	 Catch:{ InterruptedException -> 0x00e5 }
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x00e5 }
        r0 = r11.a;	 Catch:{ all -> 0x00e7 }
        r0 = r0.pop();	 Catch:{ all -> 0x00e7 }
        r0 = (com.whatsapp.i3) r0;	 Catch:{ all -> 0x00e7 }
        monitor-exit(r1);	 Catch:{ all -> 0x00e7 }
        r4 = 0;
        r1 = r0.b;	 Catch:{ InterruptedException -> 0x00e5 }
        r1 = r1.A;	 Catch:{ InterruptedException -> 0x00e5 }
        r1 = (com.whatsapp.MediaData) r1;	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = r1.file;	 Catch:{ OutOfMemoryError -> 0x00ea }
        if (r2 == 0) goto L_0x0152;
    L_0x0034:
        r2 = r0.b;	 Catch:{ OutOfMemoryError -> 0x00ea }
        r2 = r2.j;	 Catch:{ OutOfMemoryError -> 0x00ea }
        if (r2 != r3) goto L_0x0126;
    L_0x003a:
        r7 = new android.graphics.BitmapFactory$Options;	 Catch:{ InterruptedException -> 0x00e5 }
        r7.<init>();	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = 1;
        r7.inJustDecodeBounds = r2;	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = r1.file;	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = r2.getAbsolutePath();	 Catch:{ InterruptedException -> 0x00e5 }
        android.graphics.BitmapFactory.decodeFile(r2, r7);	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = 0;
        r7.inJustDecodeBounds = r2;	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = r0.a;	 Catch:{ InterruptedException -> 0x00e5 }
        r5 = r2.getWidth();	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = r0.a;	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = r2.getHeight();	 Catch:{ InterruptedException -> 0x00e5 }
        if (r5 == 0) goto L_0x005e;
    L_0x005c:
        if (r2 != 0) goto L_0x008b;
    L_0x005e:
        r2 = com.whatsapp.App.p;	 Catch:{ InterruptedException -> 0x00e5 }
        r5 = z;	 Catch:{ InterruptedException -> 0x00e5 }
        r8 = 0;
        r5 = r5[r8];	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = r2.getSystemService(r5);	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = (android.view.WindowManager) r2;	 Catch:{ InterruptedException -> 0x00e5 }
        r8 = r2.getDefaultDisplay();	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ InterruptedException -> 0x00e5 }
        r5 = 13;
        if (r2 < r5) goto L_0x0083;
    L_0x0075:
        r2 = new android.graphics.Point;	 Catch:{ InterruptedException -> 0x00e5 }
        r2.<init>();	 Catch:{ InterruptedException -> 0x00e5 }
        r8.getSize(r2);	 Catch:{ InterruptedException -> 0x00e5 }
        r5 = r2.x;	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = r2.y;	 Catch:{ InterruptedException -> 0x00e5 }
        if (r6 == 0) goto L_0x008b;
    L_0x0083:
        r5 = r8.getWidth();	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = r8.getHeight();	 Catch:{ InterruptedException -> 0x00e5 }
    L_0x008b:
        r8 = 1;
        r7.inSampleSize = r8;	 Catch:{ OutOfMemoryError -> 0x00ec }
        if (r5 <= 0) goto L_0x00a9;
    L_0x0090:
        if (r2 <= 0) goto L_0x00a9;
    L_0x0092:
        r8 = r7.outWidth;	 Catch:{ OutOfMemoryError -> 0x00ee }
        r9 = r7.outHeight;	 Catch:{ OutOfMemoryError -> 0x00ee }
        r8 = r8 * r9;
        r9 = r5 * r2;
        r9 = r9 * 4;
        if (r8 <= r9) goto L_0x00a9;
    L_0x009d:
        r8 = r7.inSampleSize;	 Catch:{ InterruptedException -> 0x00e5 }
        r8 = r8 * 2;
        r7.inSampleSize = r8;	 Catch:{ InterruptedException -> 0x00e5 }
        r5 = r5 * 2;
        r2 = r2 * 2;
        if (r6 == 0) goto L_0x0092;
    L_0x00a9:
        r2 = r1.file;	 Catch:{ OutOfMemoryError -> 0x00f0 }
        r2 = r2.getAbsolutePath();	 Catch:{ OutOfMemoryError -> 0x00f0 }
        r2 = android.graphics.BitmapFactory.decodeFile(r2, r7);	 Catch:{ OutOfMemoryError -> 0x00f0 }
    L_0x00b3:
        r4 = new android.media.ExifInterface;	 Catch:{ IOException -> 0x0123 }
        r1 = r1.file;	 Catch:{ IOException -> 0x0123 }
        r1 = r1.getAbsolutePath();	 Catch:{ IOException -> 0x0123 }
        r4.<init>(r1);	 Catch:{ IOException -> 0x0123 }
        r1 = z;	 Catch:{ IOException -> 0x0123 }
        r5 = 1;
        r1 = r1[r5];	 Catch:{ IOException -> 0x0123 }
        r5 = 1;
        r1 = r4.getAttributeInt(r1, r5);	 Catch:{ IOException -> 0x0123 }
    L_0x00c8:
        if (r2 == 0) goto L_0x00d6;
    L_0x00ca:
        r0 = r0.a;	 Catch:{ InterruptedException -> 0x00e5 }
        r4 = r11.b;	 Catch:{ InterruptedException -> 0x00e5 }
        r5 = new com.whatsapp.n7;	 Catch:{ InterruptedException -> 0x00e5 }
        r5.<init>(r11, r1, r0, r2);	 Catch:{ InterruptedException -> 0x00e5 }
        r4.runOnUiThread(r5);	 Catch:{ InterruptedException -> 0x00e5 }
    L_0x00d6:
        r0 = java.lang.Thread.interrupted();	 Catch:{ InterruptedException -> 0x00e5 }
        if (r0 == 0) goto L_0x0004;
    L_0x00dc:
        r0 = r11.a;
        r0.clear();
        return;
    L_0x00e2:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00e2 }
        throw r0;	 Catch:{ InterruptedException -> 0x00e5 }
    L_0x00e5:
        r0 = move-exception;
        goto L_0x00dc;
    L_0x00e7:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00e7 }
        throw r0;	 Catch:{ InterruptedException -> 0x00e5 }
    L_0x00ea:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00e5 }
    L_0x00ec:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x00ee }
    L_0x00ee:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00e5 }
    L_0x00f0:
        r2 = move-exception;
        r5 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x00e5 }
        r5.<init>();	 Catch:{ InterruptedException -> 0x00e5 }
        r8 = z;	 Catch:{ InterruptedException -> 0x00e5 }
        r9 = 3;
        r8 = r8[r9];	 Catch:{ InterruptedException -> 0x00e5 }
        r5 = r5.append(r8);	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = r5.append(r2);	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = r2.toString();	 Catch:{ InterruptedException -> 0x00e5 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = r11.b;	 Catch:{ InterruptedException -> 0x00e5 }
        r2.a();	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = r7.inSampleSize;	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = r2 * 2;
        r7.inSampleSize = r2;	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = r1.file;	 Catch:{ OutOfMemoryError -> 0x0120 }
        r2 = r2.getPath();	 Catch:{ OutOfMemoryError -> 0x0120 }
        r2 = android.graphics.BitmapFactory.decodeFile(r2, r7);	 Catch:{ OutOfMemoryError -> 0x0120 }
        goto L_0x00b3;
    L_0x0120:
        r2 = move-exception;
        r2 = r4;
        goto L_0x00b3;
    L_0x0123:
        r1 = move-exception;
        r1 = r3;
        goto L_0x00c8;
    L_0x0126:
        r2 = r0.b;	 Catch:{ InterruptedException -> 0x00e5 }
        r2 = r2.j;	 Catch:{ InterruptedException -> 0x00e5 }
        if (r2 != r10) goto L_0x0152;
    L_0x012c:
        r1 = r1.file;	 Catch:{ OutOfMemoryError -> 0x014f }
        r1 = r1.getAbsolutePath();	 Catch:{ OutOfMemoryError -> 0x014f }
        r2 = com.whatsapp.util.f.b(r1);	 Catch:{ OutOfMemoryError -> 0x014f }
        if (r2 == 0) goto L_0x013a;
    L_0x0138:
        r1 = r3;
        goto L_0x00c8;
    L_0x013a:
        r1 = z;	 Catch:{ OutOfMemoryError -> 0x0143 }
        r4 = 2;
        r1 = r1[r4];	 Catch:{ OutOfMemoryError -> 0x0143 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ OutOfMemoryError -> 0x0143 }
        goto L_0x0138;
    L_0x0143:
        r1 = move-exception;
    L_0x0144:
        com.whatsapp.util.Log.c(r1);	 Catch:{ InterruptedException -> 0x00e5 }
        r1 = r11.b;	 Catch:{ InterruptedException -> 0x00e5 }
        r1.a();	 Catch:{ InterruptedException -> 0x00e5 }
        r1 = r3;
        goto L_0x00c8;
    L_0x014f:
        r1 = move-exception;
        r2 = r4;
        goto L_0x0144;
    L_0x0152:
        r1 = r3;
        r2 = r4;
        goto L_0x00c8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ye.run():void");
    }

    private ye(MediaView mediaView) {
        this.b = mediaView;
        this.a = new Stack();
    }

    ye(MediaView mediaView, a_c com_whatsapp_a_c) {
        this(mediaView);
    }
}
