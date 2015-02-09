package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;

public class ax {
    private static final String[] z;

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
        r2 = "tpYv$\\r\r33Pz]\"\"\\q\r";
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
        r0 = "fkD:";
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
        r2 = 75;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 51;
        goto L_0x0038;
    L_0x0043:
        r2 = 31;
        goto L_0x0038;
    L_0x0046:
        r2 = 45;
        goto L_0x0038;
    L_0x0049:
        r2 = 86;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ax.<clinit>():void");
    }

    public static Bitmap a(int i, int i2, Uri uri, ContentResolver contentResolver, ParcelFileDescriptor parcelFileDescriptor, Options options) {
        Bitmap bitmap = null;
        try {
            if (parcelFileDescriptor == null) {
                parcelFileDescriptor = a(uri, contentResolver);
            }
            if (parcelFileDescriptor == null) {
                a(parcelFileDescriptor);
            } else {
                if (options == null) {
                    options = new Options();
                }
                FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                try {
                    options.inJustDecodeBounds = true;
                    bw.a().a(fileDescriptor, options);
                    if (!(options.mCancel || options.outWidth == -1)) {
                        if (options.outHeight != -1) {
                            options.inSampleSize = b(options, i, i2);
                            options.inJustDecodeBounds = false;
                            options.inDither = false;
                            options.inPreferredConfig = Config.ARGB_8888;
                            bitmap = bw.a().a(fileDescriptor, options);
                            a(parcelFileDescriptor);
                        }
                    }
                    a(parcelFileDescriptor);
                } catch (OutOfMemoryError e) {
                    throw e;
                } catch (OutOfMemoryError e2) {
                    throw e2;
                }
            }
        } catch (Throwable e3) {
            try {
                Log.e(z[1], z[0], e3);
            } finally {
                a(parcelFileDescriptor);
            }
        }
        return bitmap;
    }

    private static ParcelFileDescriptor a(Uri uri, ContentResolver contentResolver) {
        try {
            return contentResolver.openFileDescriptor(uri, "r");
        } catch (IOException e) {
            return null;
        }
    }

    public static int b(Options options, int i, int i2) {
        int i3 = ImagePreview.y;
        int a = a(options, i, i2);
        if (a <= 8) {
            int i4 = 1;
            while (i4 < a) {
                i4 <<= 1;
                if (i3 != 0) {
                }
            }
            return i4;
        }
        return ((a + 7) / 8) * 8;
    }

    public static Bitmap a(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        return a(i, i2, null, null, parcelFileDescriptor, null);
    }

    public static void a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (Throwable th) {
            }
        }
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
            return bitmap;
        }
    }

    private static int a(Options options, int i, int i2) {
        int i3;
        double d = (double) options.outWidth;
        double d2 = (double) options.outHeight;
        int ceil = i2 == -1 ? 1 : (int) Math.ceil(Math.sqrt((d * d2) / ((double) i2)));
        if (i == -1) {
            i3 = 128;
        } else {
            i3 = (int) Math.min(Math.floor(d / ((double) i)), Math.floor(d2 / ((double) i)));
        }
        if (i3 < ceil) {
            return ceil;
        }
        if (i2 == -1 && i == -1) {
            return 1;
        }
        return i != -1 ? i3 : ceil;
    }
}
