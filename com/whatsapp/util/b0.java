package com.whatsapp.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Debug;
import com.actionbarsherlock.R;
import java.io.Closeable;

public class b0 {
    private static Bitmap a;
    private static Bitmap b;
    private static Bitmap c;
    private static Bitmap d;
    private static Bitmap e;
    private static Bitmap f;
    private static Bitmap g;
    private static final String[] z;

    public static Bitmap g(Context context) {
        if (d == null) {
            d = BitmapFactory.decodeResource(context.getResources(), R.drawable.media_location);
        }
        return d;
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        if (i == 0 || bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (bitmap == createBitmap) {
                return bitmap;
            }
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError e) {
            Log.e(z[0] + (Debug.getNativeHeapAllocatedSize() / 1024) + z[1]);
            return bitmap;
        }
    }

    public static int a(Bitmap bitmap) {
        return VERSION.SDK_INT < 12 ? bitmap.getRowBytes() * bitmap.getHeight() : bitmap.getByteCount();
    }

    public static Bitmap d(Context context) {
        if (a == null) {
            a = BitmapFactory.decodeResource(context.getResources(), R.drawable.media_video);
        }
        return a;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                Log.e(th.toString());
            }
        }
    }

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
        r10 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "}BipXa[a{\u0012{Z|:Rr\u0002erP{]q-";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000b:
        r2 = r2.toCharArray();
        r6 = r2.length;
        r7 = r6;
        r8 = r1;
        r6 = r2;
    L_0x0013:
        if (r7 > r8) goto L_0x003e;
    L_0x0015:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002b;
            default: goto L_0x0021;
        };
    L_0x0021:
        r4[r3] = r2;
        r2 = 1;
        r0 = "4DJ";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000b;
    L_0x002b:
        r4[r3] = r2;
        z = r5;
        d = r10;
        b = r10;
        a = r10;
        e = r10;
        g = r10;
        f = r10;
        c = r10;
        return;
    L_0x003e:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x004f;
            case 1: goto L_0x0052;
            case 2: goto L_0x0055;
            case 3: goto L_0x0058;
            default: goto L_0x0045;
        };
    L_0x0045:
        r2 = 61;
    L_0x0047:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0013;
    L_0x004f:
        r2 = 20;
        goto L_0x0047;
    L_0x0052:
        r2 = 47;
        goto L_0x0047;
    L_0x0055:
        r2 = 8;
        goto L_0x0047;
    L_0x0058:
        r2 = 23;
        goto L_0x0047;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.b0.<clinit>():void");
    }

    public static Bitmap e(Context context) {
        if (f == null) {
            f = BitmapFactory.decodeResource(context.getResources(), R.drawable.media_contact_under);
        }
        return f;
    }

    public static Bitmap a(Context context) {
        if (b == null) {
            b = BitmapFactory.decodeResource(context.getResources(), R.drawable.media_image);
        }
        return b;
    }

    public static Bitmap c(Context context) {
        if (e == null) {
            e = BitmapFactory.decodeResource(context.getResources(), R.drawable.media_audio);
        }
        return e;
    }

    public static Bitmap f(Context context) {
        if (c != null) {
            return c;
        }
        Drawable drawable = context.getResources().getDrawable(R.drawable.attach_location_square);
        c = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(c);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return c;
    }

    public static Bitmap b(Context context) {
        if (g == null) {
            g = BitmapFactory.decodeResource(context.getResources(), R.drawable.media_contact);
        }
        return g;
    }
}
