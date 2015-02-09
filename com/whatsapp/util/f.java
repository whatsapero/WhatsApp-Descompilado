package com.whatsapp.util;

import android.app.Activity;
import android.backport.util.Base64;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore.Images.Media;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.actionbarsherlock.R;
import com.whatsapp.App;
import com.whatsapp.MediaData;
import com.whatsapp.MediaGallery;
import com.whatsapp.a54;
import com.whatsapp.gallerypicker.GalleryPicker;
import com.whatsapp.ge;
import com.whatsapp.ho;
import com.whatsapp.protocol.b;
import com.whatsapp.vk;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class f {
    private static String a;
    private static int b;
    public static Options c;
    public static u d;
    private static File e;
    private static final DecimalFormat f;
    private static final String[] z;

    public static void a(File file, File file2) {
        Throwable th;
        InputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                a(fileInputStream, new FileOutputStream(file2));
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public static synchronized void b(Context context) {
        synchronized (f.class) {
            try {
                if (b > 0) {
                    Editor edit = context.getSharedPreferences(z[136], 0).edit();
                    b--;
                    edit.putInt(z[135], b);
                    if (!edit.commit()) {
                        Log.e(z[134]);
                    }
                }
            } catch (NumberFormatException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
    }

    public static String a(File file) {
        MessageDigest instance;
        IOException e;
        Throwable th;
        int i = Log.e;
        try {
            instance = MessageDigest.getInstance(z[29]);
        } catch (NoSuchAlgorithmException e2) {
            Log.e(z[30] + e2.toString());
            instance = null;
        }
        if (instance == null) {
            try {
                Log.e(z[27]);
                return null;
            } catch (NoSuchAlgorithmException e3) {
                throw e3;
            }
        }
        byte[] bArr = new byte[8192];
        InputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            do {
                try {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    instance.update(bArr, 0, read);
                } catch (IOException e4) {
                    e = e4;
                }
            } while (i == 0);
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e5) {
                    Log.e(z[25] + e5.toString());
                } catch (NoSuchAlgorithmException e32) {
                    throw e32;
                }
            }
            return Base64.encodeToString(instance.digest(), 2);
        } catch (IOException e6) {
            e = e6;
            fileInputStream = null;
            try {
                Log.e(z[28] + e.toString());
                if (fileInputStream == null) {
                    return null;
                }
                try {
                    fileInputStream.close();
                    return null;
                } catch (IOException e7) {
                    Log.e(z[31] + e7.toString());
                    return null;
                } catch (NoSuchAlgorithmException e322) {
                    throw e322;
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e72) {
                        Log.e(z[26] + e72.toString());
                    } catch (NoSuchAlgorithmException e3222) {
                        throw e3222;
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public static float a(int i, int i2, long j) {
        if (i == 0 || i2 == 0) {
            return 3.0f;
        }
        float f = (8000.0f * ((float) ((ge.k * 1024) * 1024))) / ((float) (((i * i2) * 3) + 96000));
        f = Math.max(0.0f, f - ((float) j)) / f;
        return 3.0f + (f * (6.0f * f));
    }

    public static byte[] a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            Log.i(z[40] + bitmap.getWidth() + z[39] + bitmap.getHeight());
            if (!(bitmap.getWidth() == 100 && bitmap.getHeight() == 100)) {
                Bitmap createBitmap;
                Log.i(z[38]);
                float height;
                if (bitmap.getWidth() > bitmap.getHeight()) {
                    Matrix matrix = new Matrix();
                    height = 100.0f / ((float) bitmap.getHeight());
                    matrix.setScale(height, height);
                    createBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - bitmap.getHeight()) / 2, 0, bitmap.getHeight(), bitmap.getHeight(), matrix, true);
                } else {
                    Matrix matrix2 = new Matrix();
                    height = 100.0f / ((float) bitmap.getWidth());
                    matrix2.setScale(height, height);
                    createBitmap = Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() - bitmap.getWidth()) / 2, bitmap.getWidth(), bitmap.getWidth(), matrix2, true);
                }
                bitmap.recycle();
                bitmap = createBitmap;
            }
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(CompressFormat.JPEG, 80, byteArrayOutputStream);
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            bitmap.recycle();
            return toByteArray;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap b(java.lang.String r8) {
        /*
        r1 = 0;
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0244, RuntimeException -> 0x023b, InstantiationException -> 0x0137, InvocationTargetException -> 0x0155, ClassNotFoundException -> 0x0173, NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x01b3, LinkageError -> 0x01d3, all -> 0x01f3 }
        r2 = 55;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x0244, RuntimeException -> 0x023b, InstantiationException -> 0x0137, InvocationTargetException -> 0x0155, ClassNotFoundException -> 0x0173, NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x01b3, LinkageError -> 0x01d3, all -> 0x01f3 }
        r4 = java.lang.Class.forName(r0);	 Catch:{ IllegalArgumentException -> 0x0244, RuntimeException -> 0x023b, InstantiationException -> 0x0137, InvocationTargetException -> 0x0155, ClassNotFoundException -> 0x0173, NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x01b3, LinkageError -> 0x01d3, all -> 0x01f3 }
        r3 = r4.newInstance();	 Catch:{ IllegalArgumentException -> 0x0249, RuntimeException -> 0x0240, InstantiationException -> 0x0234, InvocationTargetException -> 0x022d, ClassNotFoundException -> 0x0226, NoSuchMethodException -> 0x021f, IllegalAccessException -> 0x021a, LinkageError -> 0x0215, all -> 0x0210 }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r2 = 41;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r2 = 1;
        r2 = new java.lang.Class[r2];	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r5 = 0;
        r6 = java.lang.String.class;
        r2[r5] = r6;	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r0 = r4.getMethod(r0, r2);	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r5 = 0;
        r2[r5] = r8;	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r0.invoke(r3, r2);	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r2 = 9;
        if (r0 > r2) goto L_0x00b3;
    L_0x0030:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r2 = 45;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r2 = 0;
        r2 = new java.lang.Class[r2];	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r0 = r4.getMethod(r0, r2);	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r0 = r0.invoke(r3, r2);	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
    L_0x0046:
        if (r0 == 0) goto L_0x009d;
    L_0x0048:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x00ed }
        r5 = 11;
        if (r2 >= r5) goto L_0x009d;
    L_0x004e:
        r2 = r0.getWidth();	 Catch:{ IOException -> 0x00ef }
        r5 = r0.getHeight();	 Catch:{ IOException -> 0x00ef }
        if (r2 <= r5) goto L_0x009d;
    L_0x0058:
        r2 = new com.whatsapp.util.r;	 Catch:{ IOException -> 0x010f }
        r2.<init>();	 Catch:{ IOException -> 0x010f }
        r5 = new java.io.File;	 Catch:{ IOException -> 0x010f }
        r5.<init>(r8);	 Catch:{ IOException -> 0x010f }
        r2.a(r5);	 Catch:{ IOException -> 0x010f }
        r2 = r2.a();	 Catch:{ IOException -> 0x010f }
        if (r2 == 0) goto L_0x009d;
    L_0x006b:
        r5 = r2.a();	 Catch:{ IOException -> 0x010b }
        if (r5 <= 0) goto L_0x009d;
    L_0x0071:
        r5 = r2.b();	 Catch:{ IOException -> 0x010d }
        if (r5 == 0) goto L_0x009d;
    L_0x0077:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x010f }
        r5.<init>();	 Catch:{ IOException -> 0x010f }
        r6 = z;	 Catch:{ IOException -> 0x010f }
        r7 = 49;
        r6 = r6[r7];	 Catch:{ IOException -> 0x010f }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x010f }
        r6 = r2.a();	 Catch:{ IOException -> 0x010f }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x010f }
        r5 = r5.toString();	 Catch:{ IOException -> 0x010f }
        com.whatsapp.util.Log.i(r5);	 Catch:{ IOException -> 0x010f }
        r2 = r2.a();	 Catch:{ IOException -> 0x010f }
        r0 = com.whatsapp.util.b0.a(r0, r2);	 Catch:{ IOException -> 0x010f }
    L_0x009d:
        if (r3 == 0) goto L_0x00b2;
    L_0x009f:
        r1 = z;	 Catch:{ LinkageError -> 0x012f }
        r2 = 54;
        r1 = r1[r2];	 Catch:{ LinkageError -> 0x012f }
        r2 = 0;
        r2 = new java.lang.Class[r2];	 Catch:{ LinkageError -> 0x012f }
        r1 = r4.getMethod(r1, r2);	 Catch:{ LinkageError -> 0x012f }
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ LinkageError -> 0x012f }
        r1.invoke(r3, r2);	 Catch:{ LinkageError -> 0x012f }
    L_0x00b2:
        return r0;
    L_0x00b3:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r2 = 43;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r2 = 0;
        r2 = new java.lang.Class[r2];	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r0 = r4.getMethod(r0, r2);	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r0 = r0.invoke(r3, r2);	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r0 = (byte[]) r0;	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r0 = (byte[]) r0;	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        if (r0 == 0) goto L_0x024e;
    L_0x00cd:
        r2 = 0;
        r5 = r0.length;	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r2, r5);	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
    L_0x00d3:
        if (r0 != 0) goto L_0x0046;
    L_0x00d5:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r2 = 50;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r2 = 0;
        r2 = new java.lang.Class[r2];	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r0 = r4.getMethod(r0, r2);	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r0 = r0.invoke(r3, r2);	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        goto L_0x0046;
    L_0x00ed:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00ef }
    L_0x00ef:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
    L_0x00f1:
        r0 = move-exception;
        r0 = r3;
        r2 = r4;
    L_0x00f4:
        if (r0 == 0) goto L_0x0109;
    L_0x00f6:
        r3 = z;	 Catch:{ LinkageError -> 0x0133 }
        r4 = 42;
        r3 = r3[r4];	 Catch:{ LinkageError -> 0x0133 }
        r4 = 0;
        r4 = new java.lang.Class[r4];	 Catch:{ LinkageError -> 0x0133 }
        r2 = r2.getMethod(r3, r4);	 Catch:{ LinkageError -> 0x0133 }
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ LinkageError -> 0x0133 }
        r2.invoke(r0, r3);	 Catch:{ LinkageError -> 0x0133 }
    L_0x0109:
        r0 = r1;
        goto L_0x00b2;
    L_0x010b:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x010d }
    L_0x010d:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x010f }
    L_0x010f:
        r2 = move-exception;
        com.whatsapp.util.Log.c(r2);	 Catch:{ IllegalArgumentException -> 0x00f1, RuntimeException -> 0x0114, InstantiationException -> 0x0238, InvocationTargetException -> 0x0231, ClassNotFoundException -> 0x022a, NoSuchMethodException -> 0x0223, IllegalAccessException -> 0x021d, LinkageError -> 0x0218 }
        goto L_0x009d;
    L_0x0114:
        r0 = move-exception;
    L_0x0115:
        if (r3 == 0) goto L_0x0109;
    L_0x0117:
        r0 = z;	 Catch:{ LinkageError -> 0x012b }
        r2 = 51;
        r0 = r0[r2];	 Catch:{ LinkageError -> 0x012b }
        r2 = 0;
        r2 = new java.lang.Class[r2];	 Catch:{ LinkageError -> 0x012b }
        r0 = r4.getMethod(r0, r2);	 Catch:{ LinkageError -> 0x012b }
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ LinkageError -> 0x012b }
        r0.invoke(r3, r2);	 Catch:{ LinkageError -> 0x012b }
        goto L_0x0109;
    L_0x012b:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x012d }
    L_0x012d:
        r0 = move-exception;
        goto L_0x0109;
    L_0x012f:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x0131 }
    L_0x0131:
        r1 = move-exception;
        goto L_0x00b2;
    L_0x0133:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0135 }
    L_0x0135:
        r0 = move-exception;
        goto L_0x0109;
    L_0x0137:
        r0 = move-exception;
        r3 = r1;
        r4 = r1;
    L_0x013a:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x0213 }
        if (r3 == 0) goto L_0x0109;
    L_0x013f:
        r0 = z;	 Catch:{ Exception -> 0x0153 }
        r2 = 52;
        r0 = r0[r2];	 Catch:{ Exception -> 0x0153 }
        r2 = 0;
        r2 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0153 }
        r0 = r4.getMethod(r0, r2);	 Catch:{ Exception -> 0x0153 }
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0153 }
        r0.invoke(r3, r2);	 Catch:{ Exception -> 0x0153 }
        goto L_0x0109;
    L_0x0153:
        r0 = move-exception;
        goto L_0x0109;
    L_0x0155:
        r0 = move-exception;
        r3 = r1;
        r4 = r1;
    L_0x0158:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x0213 }
        if (r3 == 0) goto L_0x0109;
    L_0x015d:
        r0 = z;	 Catch:{ Exception -> 0x0171 }
        r2 = 48;
        r0 = r0[r2];	 Catch:{ Exception -> 0x0171 }
        r2 = 0;
        r2 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0171 }
        r0 = r4.getMethod(r0, r2);	 Catch:{ Exception -> 0x0171 }
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0171 }
        r0.invoke(r3, r2);	 Catch:{ Exception -> 0x0171 }
        goto L_0x0109;
    L_0x0171:
        r0 = move-exception;
        goto L_0x0109;
    L_0x0173:
        r0 = move-exception;
        r3 = r1;
        r4 = r1;
    L_0x0176:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x0213 }
        if (r3 == 0) goto L_0x0109;
    L_0x017b:
        r0 = z;	 Catch:{ Exception -> 0x0190 }
        r2 = 53;
        r0 = r0[r2];	 Catch:{ Exception -> 0x0190 }
        r2 = 0;
        r2 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0190 }
        r0 = r4.getMethod(r0, r2);	 Catch:{ Exception -> 0x0190 }
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0190 }
        r0.invoke(r3, r2);	 Catch:{ Exception -> 0x0190 }
        goto L_0x0109;
    L_0x0190:
        r0 = move-exception;
        goto L_0x0109;
    L_0x0193:
        r0 = move-exception;
        r3 = r1;
        r4 = r1;
    L_0x0196:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x0213 }
        if (r3 == 0) goto L_0x0109;
    L_0x019b:
        r0 = z;	 Catch:{ Exception -> 0x01b0 }
        r2 = 47;
        r0 = r0[r2];	 Catch:{ Exception -> 0x01b0 }
        r2 = 0;
        r2 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x01b0 }
        r0 = r4.getMethod(r0, r2);	 Catch:{ Exception -> 0x01b0 }
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x01b0 }
        r0.invoke(r3, r2);	 Catch:{ Exception -> 0x01b0 }
        goto L_0x0109;
    L_0x01b0:
        r0 = move-exception;
        goto L_0x0109;
    L_0x01b3:
        r0 = move-exception;
        r3 = r1;
        r4 = r1;
    L_0x01b6:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x0213 }
        if (r3 == 0) goto L_0x0109;
    L_0x01bb:
        r0 = z;	 Catch:{ Exception -> 0x01d0 }
        r2 = 44;
        r0 = r0[r2];	 Catch:{ Exception -> 0x01d0 }
        r2 = 0;
        r2 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x01d0 }
        r0 = r4.getMethod(r0, r2);	 Catch:{ Exception -> 0x01d0 }
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x01d0 }
        r0.invoke(r3, r2);	 Catch:{ Exception -> 0x01d0 }
        goto L_0x0109;
    L_0x01d0:
        r0 = move-exception;
        goto L_0x0109;
    L_0x01d3:
        r0 = move-exception;
        r3 = r1;
        r4 = r1;
    L_0x01d6:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x0213 }
        if (r3 == 0) goto L_0x0109;
    L_0x01db:
        r0 = z;	 Catch:{ Exception -> 0x01f0 }
        r2 = 46;
        r0 = r0[r2];	 Catch:{ Exception -> 0x01f0 }
        r2 = 0;
        r2 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x01f0 }
        r0 = r4.getMethod(r0, r2);	 Catch:{ Exception -> 0x01f0 }
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x01f0 }
        r0.invoke(r3, r2);	 Catch:{ Exception -> 0x01f0 }
        goto L_0x0109;
    L_0x01f0:
        r0 = move-exception;
        goto L_0x0109;
    L_0x01f3:
        r0 = move-exception;
        r3 = r1;
        r4 = r1;
    L_0x01f6:
        if (r3 == 0) goto L_0x020b;
    L_0x01f8:
        r1 = z;	 Catch:{ LinkageError -> 0x020c }
        r2 = 56;
        r1 = r1[r2];	 Catch:{ LinkageError -> 0x020c }
        r2 = 0;
        r2 = new java.lang.Class[r2];	 Catch:{ LinkageError -> 0x020c }
        r1 = r4.getMethod(r1, r2);	 Catch:{ LinkageError -> 0x020c }
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ LinkageError -> 0x020c }
        r1.invoke(r3, r2);	 Catch:{ LinkageError -> 0x020c }
    L_0x020b:
        throw r0;
    L_0x020c:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x020e }
    L_0x020e:
        r1 = move-exception;
        goto L_0x020b;
    L_0x0210:
        r0 = move-exception;
        r3 = r1;
        goto L_0x01f6;
    L_0x0213:
        r0 = move-exception;
        goto L_0x01f6;
    L_0x0215:
        r0 = move-exception;
        r3 = r1;
        goto L_0x01d6;
    L_0x0218:
        r0 = move-exception;
        goto L_0x01d6;
    L_0x021a:
        r0 = move-exception;
        r3 = r1;
        goto L_0x01b6;
    L_0x021d:
        r0 = move-exception;
        goto L_0x01b6;
    L_0x021f:
        r0 = move-exception;
        r3 = r1;
        goto L_0x0196;
    L_0x0223:
        r0 = move-exception;
        goto L_0x0196;
    L_0x0226:
        r0 = move-exception;
        r3 = r1;
        goto L_0x0176;
    L_0x022a:
        r0 = move-exception;
        goto L_0x0176;
    L_0x022d:
        r0 = move-exception;
        r3 = r1;
        goto L_0x0158;
    L_0x0231:
        r0 = move-exception;
        goto L_0x0158;
    L_0x0234:
        r0 = move-exception;
        r3 = r1;
        goto L_0x013a;
    L_0x0238:
        r0 = move-exception;
        goto L_0x013a;
    L_0x023b:
        r0 = move-exception;
        r3 = r1;
        r4 = r1;
        goto L_0x0115;
    L_0x0240:
        r0 = move-exception;
        r3 = r1;
        goto L_0x0115;
    L_0x0244:
        r0 = move-exception;
        r0 = r1;
        r2 = r1;
        goto L_0x00f4;
    L_0x0249:
        r0 = move-exception;
        r0 = r1;
        r2 = r4;
        goto L_0x00f4;
    L_0x024e:
        r0 = r1;
        goto L_0x00d3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.f.b(java.lang.String):android.graphics.Bitmap");
    }

    public static String b(int i) {
        return a54.b(App.an.jabber_id + Long.toString(System.currentTimeMillis()));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r13, android.app.Activity r14) {
        /*
        r8 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r2 = 0;
        r12 = 0;
        r3 = com.whatsapp.util.Log.e;
        r4 = new java.util.ArrayList;
        r4.<init>();
        switch(r13) {
            case 4: goto L_0x008b;
            case 5: goto L_0x00dd;
            case 21: goto L_0x0030;
            case 22: goto L_0x0030;
            case 23: goto L_0x0066;
            default: goto L_0x000f;
        };
    L_0x000f:
        r0 = r2;
    L_0x0010:
        r1 = android.content.Intent.createChooser(r0, r2);
        r0 = r4.isEmpty();	 Catch:{ NumberFormatException -> 0x01f9 }
        if (r0 != 0) goto L_0x002c;
    L_0x001a:
        r0 = z;	 Catch:{ NumberFormatException -> 0x01f9 }
        r2 = 97;
        r2 = r0[r2];	 Catch:{ NumberFormatException -> 0x01f9 }
        r0 = 0;
        r0 = new android.content.Intent[r0];	 Catch:{ NumberFormatException -> 0x01f9 }
        r0 = r4.toArray(r0);	 Catch:{ NumberFormatException -> 0x01f9 }
        r0 = (android.os.Parcelable[]) r0;	 Catch:{ NumberFormatException -> 0x01f9 }
        r1.putExtra(r2, r0);	 Catch:{ NumberFormatException -> 0x01f9 }
    L_0x002c:
        r14.startActivityForResult(r1, r13);
        return;
    L_0x0030:
        r0 = 22;
        if (r13 != r0) goto L_0x0058;
    L_0x0034:
        r0 = new android.content.Intent;
        r1 = z;
        r3 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r1 = r1[r3];
        r3 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI;
        r5 = com.whatsapp.gallerypicker.GalleryPicker.class;
        r0.<init>(r1, r3, r14, r5);
        r1 = z;
        r3 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r1 = r1[r3];
        r3 = 10;
        r0.putExtra(r1, r3);
    L_0x004e:
        r1 = z;
        r3 = 98;
        r1 = r1[r3];
        r0.setType(r1);
        goto L_0x0010;
    L_0x0058:
        r0 = new android.content.Intent;
        r1 = z;
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r1 = r1[r3];
        r3 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI;
        r0.<init>(r1, r3);
        goto L_0x004e;
    L_0x0066:
        r0 = new android.content.Intent;
        r1 = z;
        r3 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r1 = r1[r3];
        r0.<init>(r1);
        r1 = z;
        r3 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r1 = r1[r3];
        r3 = 1;
        r5 = z;
        r6 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r5 = r5[r6];
        r3 = a(r14, r3, r5);
        r3 = android.net.Uri.fromFile(r3);
        r0 = r0.putExtra(r1, r3);
        goto L_0x0010;
    L_0x008b:
        r0 = new android.content.Intent;
        r1 = z;
        r3 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r1 = r1[r3];
        r0.<init>(r1);
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x00d9 }
        r3 = 18;
        if (r1 != r3) goto L_0x00c2;
    L_0x009c:
        r1 = android.os.Build.MODEL;	 Catch:{ NumberFormatException -> 0x00db }
        r3 = z;	 Catch:{ NumberFormatException -> 0x00db }
        r5 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r3 = r3[r5];	 Catch:{ NumberFormatException -> 0x00db }
        r1 = r1.contains(r3);	 Catch:{ NumberFormatException -> 0x00db }
        if (r1 == 0) goto L_0x00c2;
    L_0x00aa:
        r1 = z;	 Catch:{ NumberFormatException -> 0x00db }
        r3 = 99;
        r1 = r1[r3];	 Catch:{ NumberFormatException -> 0x00db }
        r3 = 3;
        r5 = z;	 Catch:{ NumberFormatException -> 0x00db }
        r6 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x00db }
        r3 = a(r14, r3, r5);	 Catch:{ NumberFormatException -> 0x00db }
        r3 = android.net.Uri.fromFile(r3);	 Catch:{ NumberFormatException -> 0x00db }
        r0.putExtra(r1, r3);	 Catch:{ NumberFormatException -> 0x00db }
    L_0x00c2:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x00d7 }
        r3 = 9;
        if (r1 >= r3) goto L_0x0010;
    L_0x00c8:
        r1 = z;	 Catch:{ NumberFormatException -> 0x00d7 }
        r3 = 95;
        r1 = r1[r3];	 Catch:{ NumberFormatException -> 0x00d7 }
        r3 = com.whatsapp.ge.k;	 Catch:{ NumberFormatException -> 0x00d7 }
        r6 = (long) r3;	 Catch:{ NumberFormatException -> 0x00d7 }
        r6 = r6 * r8;
        r0.putExtra(r1, r6);	 Catch:{ NumberFormatException -> 0x00d7 }
        goto L_0x0010;
    L_0x00d7:
        r0 = move-exception;
        throw r0;
    L_0x00d9:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00db }
    L_0x00db:
        r0 = move-exception;
        throw r0;
    L_0x00dd:
        r0 = com.whatsapp.Voip.f();
        if (r0 == 0) goto L_0x00f2;
    L_0x00e3:
        r0 = new android.content.Intent;
        r1 = z;
        r3 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r1 = r1[r3];
        r3 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        r0.<init>(r1, r3);
        goto L_0x0010;
    L_0x00f2:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = new android.content.Intent;
        r5 = z;
        r6 = 100;
        r5 = r5[r6];
        r1.<init>(r5);
        r5 = z;
        r6 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r5 = r5[r6];
        r1 = r1.setType(r5);
        r5 = z;
        r6 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r5 = r5[r6];
        r6 = com.whatsapp.ge.k;
        r6 = (long) r6;
        r6 = r6 * r8;
        r1 = r1.putExtra(r5, r6);
        r0.add(r1);
        r1 = new android.content.Intent;
        r5 = z;
        r6 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r5 = r5[r6];
        r6 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        r1.<init>(r5, r6);
        r0.add(r1);
        r5 = new java.util.HashSet;
        r5.<init>();
        r6 = r0.iterator();
    L_0x0136:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x01da;
    L_0x013c:
        r0 = r6.next();
        r0 = (android.content.Intent) r0;
        r1 = r14.getPackageManager();
        r1 = r1.queryIntentActivities(r0, r12);
        if (r1 == 0) goto L_0x01d8;
    L_0x014c:
        r7 = r1.iterator();
    L_0x0150:
        r1 = r7.hasNext();
        if (r1 == 0) goto L_0x01d8;
    L_0x0156:
        r1 = r7.next();
        r1 = (android.content.pm.ResolveInfo) r1;
        r8 = r1.activityInfo;
        r1 = r8.applicationInfo;
        r9 = r1.packageName;
        r1 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x01f1 }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x01f1 }
        r10 = z;	 Catch:{ NumberFormatException -> 0x01f1 }
        r11 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r10 = r10[r11];	 Catch:{ NumberFormatException -> 0x01f1 }
        r1 = r1.append(r10);	 Catch:{ NumberFormatException -> 0x01f1 }
        r1 = r1.append(r9);	 Catch:{ NumberFormatException -> 0x01f1 }
        r10 = z;	 Catch:{ NumberFormatException -> 0x01f1 }
        r11 = 94;
        r10 = r10[r11];	 Catch:{ NumberFormatException -> 0x01f1 }
        r1 = r1.append(r10);	 Catch:{ NumberFormatException -> 0x01f1 }
        r10 = r8.name;	 Catch:{ NumberFormatException -> 0x01f1 }
        r1 = r1.append(r10);	 Catch:{ NumberFormatException -> 0x01f1 }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x01f1 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x01f1 }
        r1 = z;	 Catch:{ NumberFormatException -> 0x01f1 }
        r10 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r1 = r1[r10];	 Catch:{ NumberFormatException -> 0x01f1 }
        r1 = r9.contains(r1);	 Catch:{ NumberFormatException -> 0x01f1 }
        if (r1 != 0) goto L_0x01bc;
    L_0x0198:
        r1 = z;	 Catch:{ NumberFormatException -> 0x01f3 }
        r10 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r1 = r1[r10];	 Catch:{ NumberFormatException -> 0x01f3 }
        r1 = r9.contains(r1);	 Catch:{ NumberFormatException -> 0x01f3 }
        if (r1 != 0) goto L_0x01bc;
    L_0x01a4:
        r1 = z;	 Catch:{ NumberFormatException -> 0x01f5 }
        r10 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r1 = r1[r10];	 Catch:{ NumberFormatException -> 0x01f5 }
        r1 = r9.contains(r1);	 Catch:{ NumberFormatException -> 0x01f5 }
        if (r1 != 0) goto L_0x01bc;
    L_0x01b0:
        r1 = z;	 Catch:{ NumberFormatException -> 0x01f7 }
        r10 = 96;
        r1 = r1[r10];	 Catch:{ NumberFormatException -> 0x01f7 }
        r1 = r9.contains(r1);	 Catch:{ NumberFormatException -> 0x01f7 }
        if (r1 == 0) goto L_0x01d6;
    L_0x01bc:
        r1 = r5.contains(r9);	 Catch:{ NumberFormatException -> 0x01f7 }
        if (r1 != 0) goto L_0x01d6;
    L_0x01c2:
        r1 = r0.clone();
        r1 = (android.content.Intent) r1;
        r8 = r8.name;
        r1.setClassName(r9, r8);
        r1.setPackage(r9);
        r4.add(r1);
        r5.add(r9);
    L_0x01d6:
        if (r3 == 0) goto L_0x0150;
    L_0x01d8:
        if (r3 == 0) goto L_0x0136;
    L_0x01da:
        r0 = new android.content.Intent;
        r1 = z;
        r3 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r1 = r1[r3];
        r0.<init>(r1);
        r1 = z;
        r3 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r1 = r1[r3];
        r0 = r0.setType(r1);
        goto L_0x0010;
    L_0x01f1:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01f3 }
    L_0x01f3:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01f5 }
    L_0x01f5:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01f7 }
    L_0x01f7:
        r0 = move-exception;
        throw r0;
    L_0x01f9:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.f.a(int, android.app.Activity):void");
    }

    public static byte[] a(String str, long j) {
        if (j == 0) {
            try {
                return a(str);
            } catch (Exception e) {
                throw e;
            }
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            return a(mediaMetadataRetriever.getFrameAtTime(j));
        } catch (Exception e2) {
            mediaMetadataRetriever.release();
            return null;
        } catch (NoSuchMethodError e3) {
            mediaMetadataRetriever.release();
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r8, java.lang.String r9, java.io.File r10, byte r11, int r12, boolean r13, java.lang.String r14) {
        /*
        r7 = 1;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 16;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r10.getAbsolutePath();
        r0 = r0.append(r1);
        r1 = " ";
        r0 = r0.append(r1);
        r2 = r10.length();
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r13 != 0) goto L_0x0059;
    L_0x002f:
        r2 = new com.whatsapp.MediaData;
        r2.<init>();
        r2.file = r10;	 Catch:{ NumberFormatException -> 0x0080 }
        r0 = 3;
        if (r11 != r0) goto L_0x004f;
    L_0x0039:
        r0 = r2.file;	 Catch:{ NumberFormatException -> 0x0082 }
        r0 = r0.getAbsolutePath();	 Catch:{ NumberFormatException -> 0x0082 }
        r1 = a(r0);	 Catch:{ NumberFormatException -> 0x0082 }
        r6 = 0;
        r0 = r9;
        r3 = r11;
        r4 = r12;
        r5 = r14;
        com.whatsapp.App.a(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ NumberFormatException -> 0x0082 }
        r0 = com.whatsapp.util.Log.e;	 Catch:{ NumberFormatException -> 0x0082 }
        if (r0 == 0) goto L_0x0058;
    L_0x004f:
        r1 = 0;
        r6 = 0;
        r0 = r9;
        r3 = r11;
        r4 = r12;
        r5 = r14;
        com.whatsapp.App.a(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ NumberFormatException -> 0x0082 }
    L_0x0058:
        return r7;
    L_0x0059:
        r0 = a(r8, r10, r11, r12, r7);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 17;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r0.getAbsolutePath();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        a(r10, r0);
        r10 = r0;
        goto L_0x002f;
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0082 }
    L_0x0082:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.f.a(android.content.Context, java.lang.String, java.io.File, byte, int, boolean, java.lang.String):boolean");
    }

    public static void a(String str, Uri uri) {
        byte[] bArr = null;
        MediaData mediaData = new MediaData();
        ByteBuffer byteBuffer = (ByteBuffer) d.get(uri.buildUpon().query(null).build());
        Bitmap decodeByteArray;
        if (byteBuffer != null) {
            byte[] toByteArray;
            byte[] array = byteBuffer.array();
            String queryParameter = uri.getQueryParameter(z[57]);
            if (queryParameter != null) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) Integer.parseInt(queryParameter));
                decodeByteArray = BitmapFactory.decodeByteArray(array, 0, array.length);
                Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                if (createBitmap != decodeByteArray) {
                    decodeByteArray.recycle();
                } else {
                    createBitmap = decodeByteArray;
                }
                if (createBitmap != null) {
                    OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    createBitmap.compress(CompressFormat.JPEG, 80, byteArrayOutputStream);
                    toByteArray = byteArrayOutputStream.toByteArray();
                    createBitmap.recycle();
                    bArr = toByteArray;
                }
            }
            toByteArray = array;
            bArr = toByteArray;
        } else {
            decodeByteArray = a(uri, 100, 100);
            if (decodeByteArray != null) {
                OutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                decodeByteArray.compress(CompressFormat.JPEG, 80, byteArrayOutputStream2);
                bArr = byteArrayOutputStream2.toByteArray();
                decodeByteArray.recycle();
            }
        }
        App.a(str, bArr, mediaData, (byte) 1, 0, uri.getQueryParameter(z[58]), uri);
    }

    private static boolean c(Uri uri) {
        Throwable th;
        boolean z = false;
        DataInputStream dataInputStream = null;
        DataInputStream dataInputStream2;
        try {
            dataInputStream2 = new DataInputStream(d(uri));
            try {
                if (dataInputStream2.readInt() == -2555936) {
                    dataInputStream2.readShort();
                    if (dataInputStream2.readInt() == 1246120262) {
                        z = true;
                    }
                    if (dataInputStream2 != null) {
                        try {
                            dataInputStream2.close();
                        } catch (IOException e) {
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    }
                } else if (dataInputStream2 != null) {
                    try {
                        dataInputStream2.close();
                    } catch (IOException e3) {
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
                }
            } catch (IOException e4) {
                throw e4;
            } catch (IOException e5) {
                dataInputStream = dataInputStream2;
            } catch (Throwable th2) {
                th = th2;
                if (dataInputStream2 != null) {
                    try {
                        dataInputStream2.close();
                    } catch (IOException e6) {
                    } catch (NumberFormatException e222) {
                        throw e222;
                    }
                }
                throw th;
            }
        } catch (IOException e7) {
            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (IOException e8) {
                } catch (NumberFormatException e2222) {
                    throw e2222;
                }
            }
            return z;
        } catch (Throwable th3) {
            th = th3;
            dataInputStream2 = null;
            if (dataInputStream2 != null) {
                dataInputStream2.close();
            }
            throw th;
        }
        return z;
    }

    public static void a(Uri uri, Bitmap bitmap) {
        if (bitmap != null) {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(CompressFormat.JPEG, 80, byteArrayOutputStream);
            d.put(uri, ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
        }
    }

    public static boolean a(Context context, String str, File file, byte b, int i, boolean z) {
        return a(context, str, file, b, i, z, null);
    }

    public static byte[] a(String str) {
        return a(b(str));
    }

    public static synchronized void b() {
        synchronized (f.class) {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int f(android.net.Uri r10) {
        /*
        r7 = 6;
        r9 = 2;
        r1 = 0;
        r3 = 0;
        r5 = 1;
        r8 = com.whatsapp.util.Log.e;
        r0 = r10.getScheme();	 Catch:{ NumberFormatException -> 0x00dc }
        if (r0 == 0) goto L_0x001d;
    L_0x000d:
        r0 = z;	 Catch:{ NumberFormatException -> 0x00dc }
        r2 = 10;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x00dc }
        r2 = r10.getScheme();	 Catch:{ NumberFormatException -> 0x00dc }
        r0 = r0.equals(r2);	 Catch:{ NumberFormatException -> 0x00dc }
        if (r0 == 0) goto L_0x0109;
    L_0x001d:
        r0 = new android.media.ExifInterface;
        r2 = r10.getPath();
        r0.<init>(r2);
        r2 = z;
        r4 = 14;
        r2 = r2[r4];
        r0 = r0.getAttributeInt(r2, r5);
        if (r8 == 0) goto L_0x00c1;
    L_0x0032:
        r6 = r0;
    L_0x0033:
        r0 = z;	 Catch:{ NumberFormatException -> 0x00de }
        r2 = 12;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x00de }
        r2 = r10.getScheme();	 Catch:{ NumberFormatException -> 0x00de }
        r0 = r0.equals(r2);	 Catch:{ NumberFormatException -> 0x00de }
        if (r0 == 0) goto L_0x0107;
    L_0x0043:
        r0 = z;	 Catch:{ NumberFormatException -> 0x00e0 }
        r2 = 8;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x00e0 }
        r2 = r10.getAuthority();	 Catch:{ NumberFormatException -> 0x00e0 }
        r0 = r0.equals(r2);	 Catch:{ NumberFormatException -> 0x00e0 }
        if (r0 == 0) goto L_0x0107;
    L_0x0053:
        r2 = new java.lang.String[r9];
        r0 = z;
        r4 = 7;
        r0 = r0[r4];
        r2[r1] = r0;
        r0 = z;
        r1 = 11;
        r0 = r0[r1];
        r2[r5] = r0;
        r0 = r10.buildUpon();
        r0 = r0.query(r3);
        r1 = r0.build();
        r0 = com.whatsapp.App.e;
        r4 = r3;
        r5 = r3;
        r1 = r0.query(r1, r2, r3, r4, r5);
        if (r1 == 0) goto L_0x0105;
    L_0x007a:
        r0 = r1.moveToFirst();	 Catch:{ NumberFormatException -> 0x00e2 }
        if (r0 == 0) goto L_0x0103;
    L_0x0080:
        r0 = r1.getColumnCount();	 Catch:{ NumberFormatException -> 0x00e4 }
        if (r0 != r9) goto L_0x0101;
    L_0x0086:
        r0 = 0;
        r0 = r1.getString(r0);	 Catch:{ all -> 0x00e6 }
        if (r0 == 0) goto L_0x00ff;
    L_0x008d:
        r2 = new android.media.ExifInterface;	 Catch:{ all -> 0x00e6 }
        r2.<init>(r0);	 Catch:{ all -> 0x00e6 }
        r0 = z;	 Catch:{ all -> 0x00e6 }
        r3 = 15;
        r0 = r0[r3];	 Catch:{ all -> 0x00e6 }
        r3 = 1;
        r0 = r2.getAttributeInt(r0, r3);	 Catch:{ all -> 0x00e6 }
        if (r8 == 0) goto L_0x00a7;
    L_0x009f:
        r2 = 1;
        r2 = r1.getInt(r2);	 Catch:{ all -> 0x00e6 }
        switch(r2) {
            case 90: goto L_0x00ed;
            case 180: goto L_0x00ef;
            case 270: goto L_0x00f2;
            default: goto L_0x00a7;
        };
    L_0x00a7:
        if (r8 == 0) goto L_0x00bc;
    L_0x00a9:
        r2 = z;	 Catch:{ NumberFormatException -> 0x00f5 }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x00f5 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ NumberFormatException -> 0x00f5 }
        if (r8 == 0) goto L_0x00bc;
    L_0x00b3:
        r2 = z;	 Catch:{ NumberFormatException -> 0x00f7 }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x00f7 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ NumberFormatException -> 0x00f7 }
    L_0x00bc:
        if (r1 == 0) goto L_0x00c1;
    L_0x00be:
        r1.close();	 Catch:{ NumberFormatException -> 0x00f9 }
    L_0x00c1:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 9;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r0);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        return r0;
    L_0x00dc:
        r0 = move-exception;
        throw r0;
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        throw r0;
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00e6 }
    L_0x00e6:
        r0 = move-exception;
        if (r1 == 0) goto L_0x00ec;
    L_0x00e9:
        r1.close();	 Catch:{ NumberFormatException -> 0x00fb }
    L_0x00ec:
        throw r0;
    L_0x00ed:
        if (r8 == 0) goto L_0x00fd;
    L_0x00ef:
        r0 = 3;
        if (r8 == 0) goto L_0x00a7;
    L_0x00f2:
        r0 = 8;
        goto L_0x00a7;
    L_0x00f5:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00f7 }
    L_0x00f7:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00e6 }
    L_0x00f9:
        r0 = move-exception;
        throw r0;
    L_0x00fb:
        r0 = move-exception;
        throw r0;
    L_0x00fd:
        r0 = r7;
        goto L_0x00a7;
    L_0x00ff:
        r0 = r6;
        goto L_0x009f;
    L_0x0101:
        r0 = r6;
        goto L_0x00a9;
    L_0x0103:
        r0 = r6;
        goto L_0x00b3;
    L_0x0105:
        r0 = r6;
        goto L_0x00bc;
    L_0x0107:
        r0 = r6;
        goto L_0x00c1;
    L_0x0109:
        r6 = r1;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.f.f(android.net.Uri):int");
    }

    public static Bitmap g(Uri uri) {
        return a(uri, ge.h, ge.h);
    }

    public static File e(Uri uri) {
        InputStream openInputStream;
        Throwable th;
        InputStream inputStream;
        String str = null;
        int i = Log.e;
        try {
            if (uri.getScheme() == null || uri.getScheme().equals(z[75])) {
                return new File(uri.getPath());
            }
            Cursor query = App.e.query(uri, new String[]{z[76]}, null, null, null);
            if (query == null) {
                try {
                    throw new IOException(z[74]);
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            try {
                String string;
                File file;
                OutputStream fileOutputStream;
                byte[] bArr;
                int read;
                if (query.getColumnCount() > 0) {
                    if (query.moveToFirst()) {
                        string = query.getString(0);
                        if (string != null) {
                            file = new File(string);
                            if (!file.exists()) {
                                throw new FileNotFoundException(string);
                            }
                        }
                        file = null;
                        query.close();
                        if (string == null) {
                            return file;
                        }
                        try {
                            file = App.t(b(0));
                            openInputStream = App.e.openInputStream(uri);
                            try {
                                fileOutputStream = new FileOutputStream(file);
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = openInputStream;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (NumberFormatException e2) {
                                        throw e2;
                                    }
                                }
                                if (str != null) {
                                    try {
                                        inputStream.close();
                                    } catch (NumberFormatException e22) {
                                        throw e22;
                                    }
                                }
                                throw th;
                            }
                            try {
                                bArr = new byte[4096];
                                do {
                                    read = openInputStream.read(bArr, 0, bArr.length);
                                    if (read >= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                } while (i == 0);
                                if (openInputStream != null) {
                                    try {
                                        openInputStream.close();
                                    } catch (NumberFormatException e222) {
                                        throw e222;
                                    }
                                }
                                if (fileOutputStream != null) {
                                    return file;
                                }
                                try {
                                    openInputStream.close();
                                    return file;
                                } catch (NumberFormatException e2222) {
                                    throw e2222;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                Object obj = fileOutputStream;
                                inputStream = openInputStream;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (str != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = null;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (str != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    }
                }
                string = null;
                file = null;
                query.close();
                if (string == null) {
                    return file;
                }
                file = App.t(b(0));
                openInputStream = App.e.openInputStream(uri);
                fileOutputStream = new FileOutputStream(file);
                bArr = new byte[4096];
                do {
                    read = openInputStream.read(bArr, 0, bArr.length);
                    if (read >= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        return file;
                    }
                    openInputStream.close();
                    return file;
                } while (i == 0);
                if (openInputStream != null) {
                    openInputStream.close();
                }
                if (fileOutputStream != null) {
                    return file;
                }
                openInputStream.close();
                return file;
            } catch (NumberFormatException e22222) {
                throw e22222;
            } catch (NumberFormatException e222222) {
                throw e222222;
            } catch (Throwable th5) {
                query.close();
            }
        } catch (NumberFormatException e2222222) {
            throw e2222222;
        }
    }

    public static File a(Context context, File file, byte b, int i, boolean z) {
        String absolutePath = file.getAbsolutePath();
        int lastIndexOf = absolutePath.lastIndexOf(".");
        if (lastIndexOf >= 0) {
            try {
                absolutePath = absolutePath.substring(lastIndexOf);
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        absolutePath = "";
        return a(context, absolutePath, b, i, z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.lang.String r12, byte r13, int r14, boolean r15) {
        /*
        r11 = 19;
        r0 = 0;
        r4 = com.whatsapp.util.Log.e;
        r1 = -1;
        r2 = com.whatsapp.yf.a(r13, r14, r15);
        r3 = r2.exists();
        if (r3 == 0) goto L_0x008e;
    L_0x0010:
        r5 = r2.listFiles();
        if (r5 == 0) goto L_0x0066;
    L_0x0016:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = a(r13, r14);
        r2 = r2.append(r3);
        r3 = "-";
        r2 = r2.append(r3);
        r2 = r2.append(r12);
        r3 = z;
        r6 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r3 = r3[r6];
        r2 = r2.append(r3);
        r6 = r2.toString();
        r2 = r5.length;
        r7 = r5.length;
        r3 = r0;
    L_0x003e:
        if (r3 >= r7) goto L_0x00fc;
    L_0x0040:
        r0 = r5[r3];
        r0 = r0.getName();
        r8 = r0.startsWith(r6);	 Catch:{ NumberFormatException -> 0x00d3 }
        if (r8 == 0) goto L_0x00f0;
    L_0x004c:
        r8 = r0.length();	 Catch:{ NumberFormatException -> 0x00d3 }
        if (r8 <= r11) goto L_0x00f0;
    L_0x0052:
        r8 = 15;
        r8 = r0.substring(r8, r11);
        r0 = java.lang.Integer.parseInt(r8);	 Catch:{ NumberFormatException -> 0x00d5 }
        if (r0 <= r1) goto L_0x00f0;
    L_0x005e:
        r1 = r3 + 1;
        if (r4 == 0) goto L_0x00f8;
    L_0x0062:
        if (r4 == 0) goto L_0x00f5;
    L_0x0064:
        r1 = r0;
        r0 = r2;
    L_0x0066:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00f3 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x00f3 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x00f3 }
        r4 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00f3 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x00f3 }
        r2 = r2.append(r13);	 Catch:{ NumberFormatException -> 0x00f3 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x00f3 }
        r4 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00f3 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x00f3 }
        r2 = r2.append(r14);	 Catch:{ NumberFormatException -> 0x00f3 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x00f3 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NumberFormatException -> 0x00f3 }
    L_0x008e:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r13);
        r3 = z;
        r4 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r14);
        r3 = z;
        r4 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r1);
        r3 = z;
        r4 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        return r1;
    L_0x00d3:
        r0 = move-exception;
        throw r0;
    L_0x00d5:
        r8 = move-exception;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = z;
        r10 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r9 = r9[r10];
        r8 = r8.append(r9);
        r0 = r8.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
    L_0x00f0:
        r0 = r1;
        goto L_0x005e;
    L_0x00f3:
        r0 = move-exception;
        throw r0;
    L_0x00f5:
        r1 = r0;
        r0 = r2;
        goto L_0x008e;
    L_0x00f8:
        r3 = r1;
        r1 = r0;
        goto L_0x003e;
    L_0x00fc:
        r0 = r1;
        goto L_0x0062;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.f.a(java.lang.String, byte, int, boolean):int");
    }

    static {
        String[] strArr = new String[157];
        String str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018Q\u0019,LQQ\u001b [XM\u00191]E\u0017\u0004$NRg\u00077]QK(#Y^T\u0012!";
        boolean z = true;
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
                        i3 = 56;
                        break;
                    case ay.f /*1*/:
                        i3 = 119;
                        break;
                    case ay.n /*2*/:
                        i3 = 69;
                        break;
                    case ay.p /*3*/:
                        i3 = 56;
                        break;
                    default:
                        i3 = 55;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "^\u001e)]hQ\u0019!]O";
                    z = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "[\u0018(\u0016@P\u00161KVH\u0007\u001aHE]\u0011 JRV\u0014 K";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "^\u001e)]h\\\u00161]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018J\u0012$\\VZ\u001b ^^T\u0012+YZ]X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "K\u0016(H[](7WCY\u0003 g^U\u0016\"]\u0018V\u0018\u001aWEQ\u0012+LVL\u001e*VhQ\u0019#W";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "g\u0013$LV";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "U\u0012!QV";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "K\u0016(H[](7WCY\u0003 g^U\u0016\"]\u0018W\u0005,]YL\u00161QXVW";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    str = "^\u001e)]";
                    z = true;
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    strArr2 = strArr3;
                    str = "W\u0005,]YL\u00161QXV";
                    z = true;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "[\u0018+LRV\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "K\u0016(H[](7WCY\u0003 g^U\u0016\"]\u0018[\u00027KXJ(,Kh]\u001a5LN";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "w\u0005,]YL\u00161QXV";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "w\u0005,]YL\u00161QXV";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018K\u0012+\\Z]\u0013,YQQ\u001b \u0018DJ\u0014\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018K\u0012+\\Z]\u0013,YQQ\u001b \u0018D]\u0019!\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "q:\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "h#\u0011";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "y\"\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "n>\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "[\u00165L^W\u0019";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "Y\u0019!JXQ\u0013kQYL\u0012+L\u0019Y\u00141QXVY\b}sq6\u001akty9\u000b}eg$\u0006yyg1\ftr";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "_\u00121UR\\\u001e$\\BJ\u00161QXV\u0004 [XV\u00136";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018[\u0016)[BT\u00161]Z]\u0013,Y_Y\u0004-\u0017TT\u00186]\u0017";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018[\u0016)[BT\u00161]Z]\u0013,Y_Y\u0004-\u0017TT\u00186]\u0017";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018[\u0016)[BT\u00161]Z]\u0013,Y_Y\u0004-\u0017SQ\u0010 KC]\u0005eQD\u0018\u00190T[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018[\u0016)[BT\u00161]Z]\u0013,Y_Y\u0004-\u0018";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "k?\u0004\u0015\u0005\rA";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018[\u0016)[BT\u00161]Z]\u0013,Y_Y\u0004-\u0017SQ\u0010 KC]\u0005e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018[\u0016)[BT\u00161]Z]\u0013,Y_Y\u0004-\u0017TT\u00186]\u0017";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0016\u001d5_";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018_\u00121QZY\u0010 YY\\\u0004 VS\u0017\u0003-MZZ('QCU\u00165\u0018^KW+M[T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018_\u00121QZY\u0010 YY\\\u0004 VS\u0017\u0004 [BJ\u001e1AR@\u0014 HCQ\u0018+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "[\u0018(\u0016@P\u00161KVH\u0007\u001aHE]\u0011 JRV\u0014 K";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "]\u000f1]EV\u0016)gQQ\u001b g^U\u0016\"]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "U\u0012!QVM\u0003,TD\u0017\u0010 VRJ\u00161]R@\u0003 JYY\u001b,UV_\u0012#Q[]X6YA](5JR^\u0004\u001a^VQ\u001b \\";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "J\u00126[VT\u0012eL_M\u001a'\u0018CWWt\b\u0007@Fu\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u0017\u001f QPP\u0003\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "W\u0005,_hL\u001f0UUV\u0016,T\u0018O\u001e!L_\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "K\u00121|VL\u0016\u0016WBJ\u0014 ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "J\u0012)]VK\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "_\u00121}ZZ\u0012!\\R\\',[CM\u0005 ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "J\u0012)]VK\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "[\u00165LBJ\u0012\u0003JVU\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "J\u0012)]VK\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "J\u0012)]VK\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "J\u0012)]VK\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018J\u00181YC]W3QS]\u0018eL_M\u001a'\u0018";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "_\u00121~EY\u001a yCl\u001e(]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "J\u0012)]VK\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "J\u0012)]VK\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "J\u0012)]VK\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "J\u0012)]VK\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    str = "Y\u0019!JXQ\u0013kUR\\\u001e$\u0016z]\u0013,Yz]\u0003$\\VL\u0016\u0017]CJ\u001e NRJ";
                    z = true;
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    str = "J\u0012)]VK\u0012";
                    i = 56;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    strArr2 = strArr3;
                    str = "J\u00181YCQ\u0018+";
                    z = true;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "[\u00165L^W\u0019";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "K\u0016(H[](7WCY\u0003 g^U\u0016\"]\u0018K\u0014$TR\u0017";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u0018\u000be";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "K\u0016(H[](7WCY\u0003 g^U\u0016\"]\u0018V\u00181gVg\u001e(YP]M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "K\u0016(H[](7WCY\u0003 g^U\u0016\"]\u0018J\u00181YC]X*MC\u0015\u0018#\u0015Z]\u001a*JN";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "K\u0016(H[](7WCY\u0003 g^U\u0016\"]\u0018J\u00181YC]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "K\u0016(H[](7WCY\u0003 g^U\u0016\"]\u0018K\u0014$TR\u0017\u00180L\u001aW\u0011hURU\u00187A";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "K\u0016(H[](7WCY\u0003 g^U\u0016\"]\u0018\\\u0012&WS]X*MC\u0015\u0018#\u0015Z]\u001a*JN";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\u0018\u000beKVU\u0007)]hK\u001e?]\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u0018\u000bePRQ\u0010-L\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "K\u0016(H[](7WCY\u0003 g^U\u0016\"]\u0018H\u0005 ^RJ\u00060Y[Q\u0003<\u0017RJ\u0005*J\u0017K\u0013.QYLJ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 69;
                    str = "K\u0016(H[](7WCY\u0003 g^U\u0016\"]\u0018[\u0016+\u001fC\u0018\u001b*YS\u0018\u001e+HBL\u00041JRY\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 70;
                    str = "K\u0016(H[](7WCY\u0003 g^U\u0016\"]\u0018V\u00181gVg\u001e(YP]M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 71;
                    str = "{\u0016+VXLW)WV\\W'QCU\u00165\u0018DL\u0005 YZ\u0018";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 72;
                    str = "K\u0016(H[](7WCY\u0003 g^U\u0016\"]\u0018O\u001e!L_\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 73;
                    str = "v\u0018e^^T\u0012e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 74;
                    str = "V\u0002)T\u0017[\u00027KXJ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 75;
                    str = "^\u001e)]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 76;
                    str = "g\u0013$LV";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 77;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018[\u001f [\\U\u0012!QV^\u001e)]DQ\r \u0018DJ\u0014\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 78;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018[\u001f [\\U\u0012!QV^\u001e)]DQ\r \u0017CW\u0018eTVJ\u0010 \u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 79;
                    str = "\u0018\u000be^^T\u0012\u001a\\VL\u0012\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 80;
                    str = "^\u001e)]h\\\u00161]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 81;
                    str = "^\u001e)]h\\\u00161]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 82;
                    str = "^\u001e)]hQ\u0019!]O";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 83;
                    str = "^\u001e)]hQ\u0019!]O";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 84;
                    str = "\u0018\u000be\u0018CQ\u001a \u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 85;
                    str = "\u0018\u000be^^T\u0012\u001a\\VL\u0012\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 86;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018Q\u0019,LQQ\u001b [XM\u00191]E\u0018\u0011,TRg\u001e+\\R@M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 87;
                    str = "[\u0018(\u0016@P\u00161KVH\u0007\u001aHE]\u0011 JRV\u0014 K";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 88;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018Q\u0019,LQQ\u001b [XM\u00191]E\u0017\u0004$NRg\u00077]QK(#Y^T\u0012!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 89;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018Q\u0019,LQQ\u001b [XM\u00191]E\u0018\u0011,TRg\u001e+\\R@M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 90;
                    str = "^\u001b,H\u001aN";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 91;
                    str = "J\u00181YCQ\u0018+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 92;
                    str = "v\u0018e^^T\u0012e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 93;
                    str = "^\u001b,H\u001aP";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 94;
                    str = "\u0018\u000be";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 95;
                    str = "Y\u0019!JXQ\u0013kQYL\u0012+L\u0019]\u000f1JV\u0016\u0004,BRt\u001e(QC";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 96;
                    str = "U\u00181WEW\u001b$\u0016TU\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 97;
                    str = "Y\u0019!JXQ\u0013kQYL\u0012+L\u0019]\u000f1JV\u0016>\u000bqcq6\tg~v#\u0000vck";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 98;
                    str = "Q\u001a$_R\u0017]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 99;
                    str = "W\u00021HBL";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 100;
                    str = "Y\u0019!JXQ\u0013kQYL\u0012+L\u0019Y\u00141QXVY\u0002}cg4\nvc}9\u0011";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 101;
                    str = "Y\u0019!JXQ\u0013kQYL\u0012+L\u0019Y\u00141QXVY\u0015qts";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 102;
                    str = "U\u0012!QV\u0015\u0011,TR\u0015\u00021Q[KX$HG\u0018";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 103;
                    str = "Y\u0019!JXQ\u0013kHEW\u0001,\\RJY\b]SQ\u0016\u0016LXJ\u0012k]OL\u0005$\u0016zy/\u001aznl2\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 104;
                    str = "Y\u0019!JXQ\u0013kUR\\\u001e$\u0016V[\u0003,WY\u0016!\f|rw(\u0006ygl\"\u0017}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 105;
                    str = "W\u00021HBL";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 106;
                    str = "\u0016\u001d5_";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 107;
                    str = "U\u00026QT";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 108;
                    str = "Y\u0019!JXQ\u0013kUR\\\u001e$\u0016V[\u0003,WY\u0016>\byp}(\u0006ygl\"\u0017}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 109;
                    str = "Y\u0002!QX\u0017]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 110;
                    str = "v\u0012=MD";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 111;
                    str = "N\u0018,[RJ\u0012&WE\\\u00127";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 112;
                    str = "\u0016\u001a5\f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 113;
                    str = "U\u0016=g^L\u0012(K";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 114;
                    str = "K\u00180VSJ\u0012&WE\\\u00127";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 115;
                    str = "Y\u0019!JXQ\u0013kQYL\u0012+L\u0019Y\u00141QXVY\u0015qts";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 116;
                    str = "Y\u0019!JXQ\u0013kQYL\u0012+L\u0019Y\u00141QXVY\u0015qts";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 117;
                    str = "Y\u0002!QX\u0017]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 118;
                    str = "[\u0018(\u0016@P\u00161KVH\u0007kYTL\u001e*V\u0019o?\u0004ldy'\u0015ge}4\njsq9\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 119;
                    str = "Y\u0019!JXQ\u0013kQYL\u0012+L\u0019Y\u00141QXVY\u0015qts";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 120;
                    str = "\u0018\u0005 [XU\u00077]DKM";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 121;
                    str = "H\u0005 HVJ\u0012\u001aQZY\u0010 gQW\u0005\u001aKRV\u0013j[XH\u000eeK^B\u0012\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 122;
                    str = "H\u0005 HVJ\u0012\u001aQZY\u0010 gQW\u0005\u001aKRV\u0013j[XH\u000ee";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 123;
                    str = "v\u0018eKGY\u0014 \u0018[]\u00111\u0018XVW!]AQ\u0014 ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 124;
                    str = "\u0018\u001a$@\r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 125;
                    str = "H\u0005 HVJ\u0012\u001aQZY\u0010 gQW\u0005\u001aKRV\u0013jWXUW";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 126;
                    str = "\u0015 \u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 127;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018^\u001e+\\[Y\u0005\"]DL\u0011,TRQ\u0019!]O\u0018\u0003<HR\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 128;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018^\u001e+\\[Y\u0005\"]DL\u0011,TRQ\u0019!]O\u0017\u0019#]\r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 129;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018^\u001e+\\[Y\u0005\"]DL\u0011,TRQ\u0019!]O\u0017\u0019*\u0018QQ\u001b K\u0017^\u00187\u0018CA\u0007 \u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 130;
                    str = "\u0018\u00187QPQ\u0019\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 131;
                    str = "^\u001e)]hQ\u0019!]O\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 132;
                    str = "\u0018\u00187QPQ\u0019\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 133;
                    str = "\u0018\u0003*LVTM";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 134;
                    str = "U\u0012!QV^\u001e)]BL\u001e)K\u0018Q\u0019,LQQ\u001b [XM\u00191]E\u0017\u0004$NRg\u00077]QK(#Y^T\u0012!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 135;
                    str = "^\u001e)]hQ\u0019!]O";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 136;
                    str = "[\u0018(\u0016@P\u00161KVH\u0007\u001aHE]\u0011 JRV\u0014 K";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 137;
                    str = "K\u0016(H[](7WCY\u0003 g^U\u0016\"]\u0018^\u0005*U\u0017M\u0005,\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 138;
                    str = "v\u0018e^^T\u0012e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 139;
                    str = "K\u0016(H[](7WCY\u0003 g^U\u0016\"]\u0018W\u0018(\u0018";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 140;
                    str = "K\u0016(H[](7WCY\u0003 g^U\u0016\"]\u0018^\u001e+Y[g\u0004,BR\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 141;
                    str = "\u0018\u000be";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 142;
                    str = "Q\u001a$_R";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 143;
                    str = "L\u0012=L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 144;
                    str = "L\u0012=L\u0018@Z3[VJ\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 145;
                    str = "Y\u0002!QX";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 146;
                    str = "N\u001e!]X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 147;
                    str = "^\u001e)]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 148;
                    str = "V\u00161QA]W-]VHW6QM]M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 149;
                    str = "\u0018\u001c\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 150;
                    str = "[\u0018(\u0016@P\u00161KVH\u0007\u001aHE]\u0011 JRV\u0014 K";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 151;
                    str = "]\u000f1]EV\u0016)gQQ\u001b g^U\u0016\"]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 152;
                    str = "J\u0012&QGQ\u0012+L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 153;
                    str = "Q\u001a$_R\u0017]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 154;
                    str = "Y\u0019!JXQ\u0013kQYL\u0012+L\u0019Y\u00141QXVY\u0015qts";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 155;
                    str = "U\u0016=g^L\u0012(K";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 156;
                    str = "\bGu\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    z = strArr3;
                    f = new DecimalFormat(z[156], new DecimalFormatSymbols(Locale.US));
                    b = -1;
                    c = new Options();
                    c.inDither = true;
                    d = new u(10);
                default:
                    strArr2[i] = str;
                    str = "\u0015 \u0004";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    private static String a(int i, int i2) {
        switch (i) {
            case ay.f /*1*/:
                return z[18];
            case ay.n /*2*/:
                if (i2 != 1) {
                    return z[20];
                }
                try {
                    return z[19];
                } catch (NumberFormatException e) {
                    throw e;
                }
            case ay.p /*3*/:
                return z[21];
            default:
                return null;
        }
    }

    public static File a(Context context, byte b, String str) {
        e = a(context, str, b, 0, false);
        Editor edit = context.getSharedPreferences(z[35], 0).edit();
        try {
            edit.putString(z[36], e.getAbsolutePath());
            if (!edit.commit()) {
                Log.e(z[37]);
            }
            return e;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(Activity activity, String str) {
        Intent intent = new Intent(z[154], Media.INTERNAL_CONTENT_URI, activity, GalleryPicker.class);
        intent.putExtra(z[155], 10);
        intent.putExtra(z[152], str);
        intent.setType(z[153]);
        activity.startActivityForResult(intent, 22);
    }

    public static int b(File file) {
        int i = 0;
        try {
            if (VERSION.SDK_INT >= 10 && file != null) {
                if (file.exists()) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                        long parseLong = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                        i = (int) (parseLong / 1000);
                        if (i == 0 && parseLong != 0) {
                            i = 1;
                        }
                    } catch (Throwable e) {
                        Log.b(z[24], e);
                    }
                    mediaMetadataRetriever.release();
                }
            }
            return i;
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        }
    }

    public static void a(Context context, b bVar) {
        try {
            if (bVar.j == 2) {
                if (bVar.w == 1) {
                    return;
                }
            }
            File file = ((MediaData) bVar.A).file;
            try {
                if (file != null) {
                    try {
                        if (file.exists()) {
                            a(context, Uri.fromFile(file));
                        }
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public static byte[] a(Context context, Uri uri, MediaData mediaData) {
        File a = a(context, z[32], (byte) 1, 0, true);
        try {
            Bitmap a2 = a(uri, a);
            if (a2 == null) {
                try {
                    Log.e(z[33]);
                    throw new bx();
                } catch (SecurityException e) {
                    throw e;
                }
            }
            mediaData.file = a;
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            a2.compress(CompressFormat.JPEG, 80, byteArrayOutputStream);
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            try {
                if (a2.getHeight() > a2.getWidth()) {
                    a(mediaData);
                }
            } catch (Exception e2) {
            }
            a2.recycle();
            return toByteArray;
        } catch (SecurityException e3) {
            Log.e(z[34] + e3.getMessage());
            throw e3;
        }
    }

    public static Matrix a(int i) {
        Matrix matrix;
        switch (i) {
            case ay.n /*2*/:
                matrix = new Matrix();
                matrix.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                return matrix;
            case ay.p /*3*/:
                matrix = new Matrix();
                matrix.setRotate(180.0f);
                return matrix;
            case aj.i /*4*/:
                matrix = new Matrix();
                matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                return matrix;
            case aV.r /*5*/:
                matrix = new Matrix();
                matrix.setValues(new float[]{0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                return matrix;
            case aV.i /*6*/:
                matrix = new Matrix();
                matrix.setRotate(90.0f);
                return matrix;
            case a8.s /*7*/:
                matrix = new Matrix();
                matrix.setValues(new float[]{0.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                return matrix;
            case a8.n /*8*/:
                matrix = new Matrix();
                matrix.setRotate(270.0f);
                return matrix;
            default:
                return null;
        }
    }

    public static boolean a(Activity activity, ho hoVar, String str, File file, byte b, boolean z) {
        return a(activity, hoVar, str, file, b, 0, z);
    }

    private static synchronized String a(Context context, int i, int i2) {
        String a;
        synchronized (f.class) {
            try {
                a(context);
                Editor edit = context.getSharedPreferences(z[3], 0).edit();
                a = bm.a();
                if (!a.equals(a)) {
                    b = 0;
                    a = a;
                    edit.putString(z[4], a);
                }
                a = a(i, i2) + "-" + a + z[1] + f.format((long) b);
                b++;
                edit.putInt(z[2], b);
                if (!edit.commit()) {
                    Log.e(z[0]);
                }
                Log.i(z[5] + a);
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            } catch (Throwable th) {
            }
        }
        return a;
    }

    private static Bitmap a(Uri uri, int i, int i2, Options options, Matrix matrix) {
        InputStream d = d(uri);
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(d, null, options);
            d.close();
            try {
                if (decodeStream != null) {
                    try {
                        if (decodeStream.getWidth() != 0) {
                            if (decodeStream.getHeight() != 0) {
                                Bitmap createBitmap;
                                if (matrix != null) {
                                    Log.i(z[63]);
                                    try {
                                        createBitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, true);
                                        if (decodeStream != createBitmap) {
                                            try {
                                                decodeStream.recycle();
                                            } catch (OutOfMemoryError e) {
                                                throw e;
                                            }
                                        }
                                        decodeStream = createBitmap;
                                    } catch (OutOfMemoryError e2) {
                                        Log.e(z[62]);
                                        decodeStream.recycle();
                                        throw e2;
                                    }
                                }
                                if (i2 <= 0) {
                                    return decodeStream;
                                }
                                try {
                                    if (decodeStream.getWidth() <= i2) {
                                        if (decodeStream.getHeight() <= i2) {
                                            return decodeStream;
                                        }
                                    }
                                    Log.i(z[59] + decodeStream.getWidth() + z[60] + decodeStream.getHeight());
                                    float max = Math.max(((float) decodeStream.getWidth()) / ((float) i), ((float) decodeStream.getHeight()) / ((float) i));
                                    Rect rect = new Rect(0, 0, (int) (((float) decodeStream.getWidth()) / max), (int) (((float) decodeStream.getHeight()) / max));
                                    rect.right = Math.max(rect.right, 1);
                                    rect.bottom = Math.max(rect.bottom, 1);
                                    Rect rect2 = new Rect(0, 0, decodeStream.getWidth(), decodeStream.getHeight());
                                    Config config = decodeStream.getConfig();
                                    try {
                                        int width = rect.width();
                                        int height = rect.height();
                                        if (config == null) {
                                            config = Config.ARGB_8888;
                                        }
                                        createBitmap = Bitmap.createBitmap(width, height, config);
                                        Canvas canvas = new Canvas(createBitmap);
                                        Paint paint = new Paint();
                                        paint.setAntiAlias(true);
                                        paint.setFilterBitmap(true);
                                        paint.setDither(true);
                                        canvas.drawBitmap(decodeStream, rect2, rect, paint);
                                        decodeStream.recycle();
                                        return createBitmap;
                                    } catch (OutOfMemoryError e22) {
                                        throw e22;
                                    } catch (OutOfMemoryError e222) {
                                        Log.e(z[64]);
                                        decodeStream.recycle();
                                        throw e222;
                                    }
                                } catch (OutOfMemoryError e3) {
                                    throw e3;
                                } catch (OutOfMemoryError e32) {
                                    throw e32;
                                }
                            }
                        }
                    } catch (OutOfMemoryError e322) {
                        throw e322;
                    } catch (OutOfMemoryError e3222) {
                        throw e3222;
                    }
                }
                Log.i(z[61] + uri);
                throw new bx();
            } catch (OutOfMemoryError e32222) {
                throw e32222;
            }
        } catch (OutOfMemoryError e322222) {
            Log.e(z[65]);
            d.close();
            throw e322222;
        }
    }

    public static InputStream d(Uri uri) {
        Uri build = uri.buildUpon().query(null).build();
        try {
            if (build.getScheme() != null) {
                if (!build.getScheme().equals(z[147])) {
                    try {
                        return App.e.openInputStream(build);
                    }
                }
            }
            return new FileInputStream(new File(build.getPath()));
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static boolean a(Activity activity, ho hoVar, File file, byte b) {
        try {
            Log.i(z[77] + file.getAbsolutePath());
            try {
                if (file.length() <= ((long) ge.k) * 1048576) {
                    return true;
                }
                Log.w(z[78] + file.length());
                if (hoVar == null) {
                    return false;
                }
                hoVar.f(activity.getString(R.string.file_too_large, new Object[]{Integer.valueOf(ge.k)}));
                return false;
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static byte a(Uri uri) {
        String type = App.e.getType(uri);
        if (type == null) {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.getPath());
            if (fileExtensionFromUrl != null) {
                type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            }
        }
        if (type != null) {
            try {
                if (type.startsWith(z[145])) {
                    return (byte) 2;
                }
                try {
                    if (type.startsWith(z[146])) {
                        return (byte) 3;
                    }
                    try {
                        if (type.startsWith(z[142])) {
                            return (byte) 1;
                        }
                        try {
                            if (type.startsWith(z[144])) {
                                return (byte) 4;
                            }
                            try {
                                if (type.startsWith(z[143])) {
                                    return (byte) 0;
                                }
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
                } catch (NumberFormatException e222) {
                    throw e222;
                }
            } catch (NumberFormatException e2222) {
                throw e2222;
            }
        }
        return (byte) -1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(android.graphics.Bitmap r11, int r12, float r13) {
        /*
        r6 = 0;
        r10 = 1;
        r9 = 0;
        if (r11 == 0) goto L_0x000b;
    L_0x0005:
        r0 = r11.isRecycled();	 Catch:{ NumberFormatException -> 0x000d }
        if (r0 == 0) goto L_0x000f;
    L_0x000b:
        r0 = 0;
    L_0x000c:
        return r0;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r0 = android.graphics.Bitmap.Config.ARGB_8888;
        r1 = android.graphics.Bitmap.createBitmap(r12, r12, r0);
        r2 = new android.graphics.Canvas;
        r2.<init>(r1);
        r3 = new android.graphics.Paint;
        r3.<init>();
        r4 = new android.graphics.RectF;
        r0 = (float) r12;
        r5 = (float) r12;
        r4.<init>(r6, r6, r0, r5);
        r0 = r11.getWidth();
        r5 = r11.getHeight();
        r0 = r0 - r5;
        r5 = r0 / 2;
        if (r5 <= 0) goto L_0x0045;
    L_0x0033:
        r0 = new android.graphics.Rect;
        r6 = r11.getWidth();
        r6 = r6 - r5;
        r7 = r11.getHeight();
        r0.<init>(r5, r9, r6, r7);
        r6 = com.whatsapp.util.Log.e;
        if (r6 == 0) goto L_0x0054;
    L_0x0045:
        r0 = new android.graphics.Rect;
        r6 = -r5;
        r7 = r11.getWidth();
        r8 = r11.getHeight();
        r5 = r5 + r8;
        r0.<init>(r9, r6, r7, r5);
    L_0x0054:
        r3.setAntiAlias(r10);
        r3.setDither(r10);
        r3.setFilterBitmap(r10);
        r2.drawARGB(r9, r9, r9, r9);
        r5 = -1;
        r3.setColor(r5);
        r2.drawRoundRect(r4, r13, r13, r3);
        r5 = new android.graphics.PorterDuffXfermode;
        r6 = android.graphics.PorterDuff.Mode.SRC_IN;
        r5.<init>(r6);
        r3.setXfermode(r5);
        r2.drawBitmap(r11, r0, r4, r3);
        r0 = r1;
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.f.a(android.graphics.Bitmap, int, float):android.graphics.Bitmap");
    }

    public static synchronized void a(Context context) {
        synchronized (f.class) {
            try {
                if (b < 0) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(z[87], 0);
                    b = sharedPreferences.getInt(z[83], -1);
                    a = sharedPreferences.getString(z[81], null);
                    if (b >= 0) {
                        if (!TextUtils.isEmpty(a)) {
                            Log.i(z[89] + b + z[85] + a);
                        }
                    }
                    a = bm.a();
                    long currentTimeMillis = System.currentTimeMillis();
                    b = -1;
                    b = Math.max(b, a(a, (byte) 2, 0, true));
                    b = Math.max(b, a(a, (byte) 2, 0, false));
                    b = Math.max(b, a(a, (byte) 2, 1, true));
                    b = Math.max(b, a(a, (byte) 2, 1, false));
                    b = Math.max(b, a(a, (byte) 3, 0, true));
                    b = Math.max(b, a(a, (byte) 3, 0, false));
                    b = Math.max(b, a(a, (byte) 1, 0, true));
                    b = Math.max(b, a(a, (byte) 1, 0, false));
                    b++;
                    Editor edit = sharedPreferences.edit();
                    edit.putInt(z[82], b);
                    edit.putString(z[80], a);
                    if (!edit.commit()) {
                        Log.e(z[88]);
                    }
                    Log.i(z[86] + b + z[79] + a + z[84] + (System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            } catch (NumberFormatException e22) {
                throw e22;
            } catch (NumberFormatException e222) {
                throw e222;
            } catch (Throwable th) {
            }
        }
    }

    public static File a(Context context, String str, byte b, int i, boolean z) {
        int i2 = Log.e;
        File file = null;
        int i3 = 0;
        while (i3 < 100) {
            file = App.a(a(context, (int) b, i) + str, b, i, z);
            try {
                if (!file.exists() && i2 == 0) {
                    break;
                }
                i3++;
                if (i2 != 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        return file;
    }

    public static File c(Context context) {
        if (e == null) {
            String string = context.getSharedPreferences(z[150], 0).getString(z[151], null);
            if (string != null) {
                try {
                    e = new File(string);
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        }
        return e;
    }

    public static void a() {
        try {
            Log.e(z[148] + (Debug.getNativeHeapAllocatedSize() / 1024) + z[149]);
            if (MediaGallery.A != null) {
                MediaGallery.A.f();
                MediaGallery.A.finish();
            }
            App.R.trimToSize(0);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static Matrix b(Uri uri) {
        int i = Log.e;
        try {
            if (uri != null) {
                if (!TextUtils.isEmpty(uri.toString())) {
                    Matrix matrix;
                    Matrix a = a(f(uri));
                    if (uri.getQueryParameter(z[93]) != null) {
                        matrix = new Matrix();
                        matrix.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                        if (a == null) {
                            if (i != 0) {
                                a = matrix;
                            }
                        }
                        try {
                            a.postConcat(matrix);
                            matrix = a;
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    }
                    matrix = a;
                    if (uri.getQueryParameter(z[90]) != null) {
                        a = new Matrix();
                        a.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                        if (matrix == null) {
                            if (i != 0) {
                                matrix = a;
                            } else {
                                matrix = a;
                            }
                        }
                        try {
                            matrix.postConcat(a);
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    }
                    String queryParameter = uri.getQueryParameter(z[91]);
                    if (queryParameter != null) {
                        if (matrix == null) {
                            matrix = new Matrix();
                        }
                        matrix.postRotate((float) Integer.parseInt(queryParameter));
                    }
                    return matrix;
                }
            }
            throw new FileNotFoundException(z[92] + uri);
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public static boolean a(Activity activity, ho hoVar, String str, File file, byte b, int i, boolean z) {
        return a(activity, hoVar, str, file, b, 0, z, null);
    }

    public static void a(byte[] bArr, File file) {
        Throwable th;
        if (bArr != null) {
            OutputStream bufferedOutputStream;
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    bufferedOutputStream.write(bArr);
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e2) {
                        } catch (NumberFormatException e3) {
                            throw e3;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                throw th;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(android.net.Uri r13, java.io.File r14) {
        /*
        r1 = 0;
        r12 = 100;
        r0 = 1;
        r2 = r14.getParentFile();
        if (r2 == 0) goto L_0x000d;
    L_0x000a:
        r2.mkdirs();
    L_0x000d:
        r3 = b(r13);
        r2 = com.whatsapp.ge.h;
        r4 = a(r13, r2);
        if (r3 != 0) goto L_0x00b9;
    L_0x0019:
        r2 = r4.outWidth;	 Catch:{ OutOfMemoryError -> 0x00f3 }
        r5 = com.whatsapp.ge.h;	 Catch:{ OutOfMemoryError -> 0x00f3 }
        if (r2 > r5) goto L_0x00b9;
    L_0x001f:
        r2 = r4.outHeight;	 Catch:{ OutOfMemoryError -> 0x00f5 }
        r5 = com.whatsapp.ge.h;	 Catch:{ OutOfMemoryError -> 0x00f5 }
        if (r2 > r5) goto L_0x00b9;
    L_0x0025:
        r2 = c(r13);	 Catch:{ OutOfMemoryError -> 0x00f7 }
        if (r2 == 0) goto L_0x00b9;
    L_0x002b:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r5 = z;
        r6 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r5 = r5[r6];
        r2 = r2.append(r5);
        r2 = r2.append(r13);
        r5 = " ";
        r2 = r2.append(r5);
        r5 = r4.outWidth;
        r2 = r2.append(r5);
        r5 = "x";
        r2 = r2.append(r5);
        r5 = r4.outHeight;
        r2 = r2.append(r5);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = new java.io.FileOutputStream;	 Catch:{ all -> 0x0149 }
        r2.<init>(r14);	 Catch:{ all -> 0x0149 }
        r1 = d(r13);	 Catch:{ all -> 0x00fd }
        r5 = a(r1, r2);	 Catch:{ all -> 0x00fd }
        if (r5 == 0) goto L_0x0077;
    L_0x006c:
        r6 = (long) r5;
        r8 = com.whatsapp.ge.j;	 Catch:{ OutOfMemoryError -> 0x00f9 }
        r8 = (long) r8;
        r10 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r8 = r8 * r10;
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 <= 0) goto L_0x0109;
    L_0x0077:
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00fd }
        r6.<init>();	 Catch:{ all -> 0x00fd }
        r7 = z;	 Catch:{ all -> 0x00fd }
        r8 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r7 = r7[r8];	 Catch:{ all -> 0x00fd }
        r6 = r6.append(r7);	 Catch:{ all -> 0x00fd }
        r5 = r6.append(r5);	 Catch:{ all -> 0x00fd }
        r6 = z;	 Catch:{ all -> 0x00fd }
        r7 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r6 = r6[r7];	 Catch:{ all -> 0x00fd }
        r5 = r5.append(r6);	 Catch:{ all -> 0x00fd }
        r6 = com.whatsapp.ge.j;	 Catch:{ all -> 0x00fd }
        r5 = r5.append(r6);	 Catch:{ all -> 0x00fd }
        r6 = z;	 Catch:{ all -> 0x00fd }
        r7 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r6 = r6[r7];	 Catch:{ all -> 0x00fd }
        r5 = r5.append(r6);	 Catch:{ all -> 0x00fd }
        r5 = r5.append(r0);	 Catch:{ all -> 0x00fd }
        r5 = r5.toString();	 Catch:{ all -> 0x00fd }
        com.whatsapp.util.Log.i(r5);	 Catch:{ all -> 0x00fd }
        if (r1 == 0) goto L_0x00b4;
    L_0x00b1:
        r1.close();
    L_0x00b4:
        if (r2 == 0) goto L_0x00b9;
    L_0x00b6:
        r2.close();	 Catch:{ OutOfMemoryError -> 0x010c }
    L_0x00b9:
        if (r0 == 0) goto L_0x0144;
    L_0x00bb:
        r0 = com.whatsapp.ge.h;	 Catch:{ OutOfMemoryError -> 0x0112 }
        r1 = com.whatsapp.ge.h;	 Catch:{ OutOfMemoryError -> 0x0112 }
        r0 = a(r13, r0, r1, r4, r3);	 Catch:{ OutOfMemoryError -> 0x0112 }
    L_0x00c3:
        r1 = new java.io.FileOutputStream;
        r1.<init>(r14);
        r2 = android.graphics.Bitmap.CompressFormat.JPEG;
        r3 = com.whatsapp.ge.i;
        r2 = r0.compress(r2, r3, r1);
        r1.close();
        r0.recycle();
        if (r2 != 0) goto L_0x0144;
    L_0x00d8:
        r0 = com.whatsapp.App.aP();	 Catch:{ OutOfMemoryError -> 0x00f1 }
        r2 = com.whatsapp.ge.j;	 Catch:{ OutOfMemoryError -> 0x00f1 }
        r2 = r2 * 1024;
        r2 = (long) r2;	 Catch:{ OutOfMemoryError -> 0x00f1 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x013e;
    L_0x00e5:
        r0 = new java.io.IOException;	 Catch:{ OutOfMemoryError -> 0x00f1 }
        r1 = z;	 Catch:{ OutOfMemoryError -> 0x00f1 }
        r2 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x00f1 }
        r0.<init>(r1);	 Catch:{ OutOfMemoryError -> 0x00f1 }
        throw r0;	 Catch:{ OutOfMemoryError -> 0x00f1 }
    L_0x00f1:
        r0 = move-exception;
        throw r0;
    L_0x00f3:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x00f5 }
    L_0x00f5:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x00f7 }
    L_0x00f7:
        r0 = move-exception;
        throw r0;
    L_0x00f9:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x00fb }
    L_0x00fb:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00fd }
    L_0x00fd:
        r0 = move-exception;
    L_0x00fe:
        if (r1 == 0) goto L_0x0103;
    L_0x0100:
        r1.close();	 Catch:{ OutOfMemoryError -> 0x010e }
    L_0x0103:
        if (r2 == 0) goto L_0x0108;
    L_0x0105:
        r2.close();	 Catch:{ OutOfMemoryError -> 0x0110 }
    L_0x0108:
        throw r0;
    L_0x0109:
        r0 = 0;
        goto L_0x0077;
    L_0x010c:
        r0 = move-exception;
        throw r0;
    L_0x010e:
        r0 = move-exception;
        throw r0;
    L_0x0110:
        r0 = move-exception;
        throw r0;
    L_0x0112:
        r0 = move-exception;
        r0 = r4.inSampleSize;
        r0 = r0 * 2;
        r4.inSampleSize = r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r4.inSampleSize;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.ge.h;
        r1 = com.whatsapp.ge.h;
        r0 = a(r13, r0, r1, r4, r3);
        goto L_0x00c3;
    L_0x013e:
        r0 = new java.io.IOException;
        r0.<init>();
        throw r0;
    L_0x0144:
        r0 = a(r13, r12, r12);
        return r0;
    L_0x0149:
        r0 = move-exception;
        r2 = r1;
        goto L_0x00fe;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.f.a(android.net.Uri, java.io.File):android.graphics.Bitmap");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.whatsapp.MediaData r8) {
        /*
        r3 = 1;
        r2 = 0;
        r0 = new android.graphics.BitmapFactory$Options;
        r0.<init>();
        r0.inJustDecodeBounds = r3;
        r1 = r8.file;
        r1 = r1.getAbsolutePath();
        android.graphics.BitmapFactory.decodeFile(r1, r0);
        r4 = r0.outWidth;
        r5 = r0.outHeight;
        r1 = r0.outWidth;
        r1 = r1 / 400;
        r6 = r0.outHeight;
        r6 = r6 / 400;
        r1 = java.lang.Math.max(r1, r6);
        r0.inSampleSize = r1;
        r0.inJustDecodeBounds = r2;
        r0.inInputShareable = r3;
        r0.inPurgeable = r3;
        r1 = android.graphics.Bitmap.Config.RGB_565;
        r0.inPreferredConfig = r1;
        r1 = r8.file;
        r1 = r1.getAbsolutePath();
        r1 = android.graphics.BitmapFactory.decodeFile(r1, r0);
        if (r1 != 0) goto L_0x003b;
    L_0x003a:
        return r2;
    L_0x003b:
        r0 = r1.getWidth();
        r0 = r0 & 1;
        if (r0 != r3) goto L_0x00c2;
    L_0x0043:
        r0 = r1.getWidth();
        r0 = r0 + -1;
        r6 = r1.getHeight();
        r0 = android.graphics.Bitmap.createBitmap(r1, r2, r2, r0, r6);
        if (r1 == r0) goto L_0x0056;
    L_0x0053:
        r1.recycle();	 Catch:{ NumberFormatException -> 0x00b6 }
    L_0x0056:
        r1 = new android.media.FaceDetector;
        r6 = r0.getWidth();
        r7 = r0.getHeight();
        r1.<init>(r6, r7, r3);
        r6 = new android.media.FaceDetector.Face[r3];
        r1 = r1.findFaces(r0, r6);
        if (r1 <= 0) goto L_0x00a2;
    L_0x006b:
        r1 = 0;
        r1 = r6[r1];	 Catch:{ NumberFormatException -> 0x00b8 }
        r1 = r1.confidence();	 Catch:{ NumberFormatException -> 0x00b8 }
        r7 = 1050253722; // 0x3e99999a float:0.3 double:5.188942835E-315;
        r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r1 <= 0) goto L_0x00a2;
    L_0x0079:
        r1 = new android.graphics.PointF;
        r1.<init>();
        r7 = 0;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x00ba }
        r6.getMidPoint(r1);	 Catch:{ NumberFormatException -> 0x00ba }
        r6 = r1.x;	 Catch:{ NumberFormatException -> 0x00ba }
        r4 = (float) r4;	 Catch:{ NumberFormatException -> 0x00ba }
        r4 = r4 * r6;
        r6 = r0.getWidth();	 Catch:{ NumberFormatException -> 0x00ba }
        r6 = (float) r6;	 Catch:{ NumberFormatException -> 0x00ba }
        r4 = r4 / r6;
        r4 = (int) r4;	 Catch:{ NumberFormatException -> 0x00ba }
        r8.faceX = r4;	 Catch:{ NumberFormatException -> 0x00ba }
        r1 = r1.y;	 Catch:{ NumberFormatException -> 0x00ba }
        r4 = (float) r5;	 Catch:{ NumberFormatException -> 0x00ba }
        r1 = r1 * r4;
        r4 = r0.getHeight();	 Catch:{ NumberFormatException -> 0x00ba }
        r4 = (float) r4;	 Catch:{ NumberFormatException -> 0x00ba }
        r1 = r1 / r4;
        r1 = (int) r1;	 Catch:{ NumberFormatException -> 0x00ba }
        r8.faceY = r1;	 Catch:{ NumberFormatException -> 0x00ba }
        r1 = com.whatsapp.util.Log.e;	 Catch:{ NumberFormatException -> 0x00ba }
        if (r1 == 0) goto L_0x00a8;
    L_0x00a2:
        r1 = -1;
        r8.faceX = r1;	 Catch:{ NumberFormatException -> 0x00ba }
        r1 = -1;
        r8.faceY = r1;	 Catch:{ NumberFormatException -> 0x00ba }
    L_0x00a8:
        r0.recycle();	 Catch:{ NumberFormatException -> 0x00bc }
        r0 = r8.faceX;	 Catch:{ NumberFormatException -> 0x00bc }
        if (r0 > 0) goto L_0x00b3;
    L_0x00af:
        r0 = r8.faceY;	 Catch:{ NumberFormatException -> 0x00be }
        if (r0 <= 0) goto L_0x00c0;
    L_0x00b3:
        r0 = r3;
    L_0x00b4:
        r2 = r0;
        goto L_0x003a;
    L_0x00b6:
        r0 = move-exception;
        throw r0;
    L_0x00b8:
        r0 = move-exception;
        throw r0;
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00be }
    L_0x00be:
        r0 = move-exception;
        throw r0;
    L_0x00c0:
        r0 = r2;
        goto L_0x00b4;
    L_0x00c2:
        r0 = r1;
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.f.a(com.whatsapp.MediaData):boolean");
    }

    private static Options a(Uri uri, int i) {
        int i2 = Log.e;
        try {
            if (uri != null) {
                if (!TextUtils.isEmpty(uri.toString())) {
                    InputStream d = d(uri);
                    if (d == null) {
                        try {
                            Log.e(z[69]);
                            throw new FileNotFoundException(z[71] + uri);
                        } catch (NoSuchFieldError e) {
                            throw e;
                        }
                    }
                    Options options = new Options();
                    try {
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(d, null, options);
                        d.close();
                        if (options.outWidth <= 0 || options.outHeight <= 0) {
                            Log.i(z[70] + uri);
                            throw new bx();
                        }
                        options.inSampleSize = 1;
                        int max = Math.max(options.outWidth, options.outHeight);
                        while (max / 2 > (i * 8) / 10) {
                            max /= 2;
                            options.inSampleSize *= 2;
                            if (i2 != 0) {
                                break;
                            }
                        }
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        options.inScaled = false;
                        Log.i(z[72] + options.outWidth + z[67] + options.outHeight + z[66] + options.inSampleSize);
                        try {
                            if (VERSION.SDK_INT >= 10) {
                                options.inPreferQualityOverSpeed = true;
                            }
                        } catch (NoSuchFieldError e2) {
                            Log.w(z[68] + VERSION.SDK_INT);
                        }
                        return options;
                    } catch (NoSuchFieldError e3) {
                        throw e3;
                    } catch (NoSuchFieldError e32) {
                        throw e32;
                    }
                }
            }
            throw new FileNotFoundException(z[73] + uri);
        } catch (NoSuchFieldError e322) {
            throw e322;
        } catch (NoSuchFieldError e3222) {
            throw e3222;
        }
    }

    public static Bitmap a(Uri uri, int i, int i2) {
        try {
            if (uri != null) {
                if (!TextUtils.isEmpty(uri.toString())) {
                    Bitmap a;
                    Log.i(z[137] + uri.toString());
                    Matrix b = b(uri);
                    Options a2 = a(uri, i);
                    try {
                        a = a(uri, i, i2, a2, b);
                    } catch (OutOfMemoryError e) {
                        a2.inSampleSize *= 2;
                        Log.i(z[139] + a2.inSampleSize);
                        a = a(uri, i, i2, a2, b);
                    }
                    Log.i(z[140] + a.getWidth() + z[141] + a.getHeight());
                    return a;
                }
            }
            throw new FileNotFoundException(z[138] + uri);
        } catch (OutOfMemoryError e2) {
            throw e2;
        } catch (OutOfMemoryError e22) {
            throw e22;
        }
    }

    public static boolean a(Context context, String str, File file, byte b, boolean z) {
        return a(context, str, file, b, 0, z, null);
    }

    public static boolean a(Activity activity, ho hoVar, String str, File file, byte b, int i, boolean z, String str2) {
        try {
            return !a(activity, hoVar, file, b) ? false : a((Context) activity, str, file, b, i, z, str2);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(Context context, String str, Uri uri) {
        MediaData mediaData = new MediaData();
        byte[] a = a(context, uri, mediaData);
        String queryParameter = uri.getQueryParameter(z[22]);
        try {
            if (Looper.myLooper() == context.getMainLooper()) {
                App.a(str, a, mediaData, (byte) 1, 0, queryParameter, null);
                try {
                    if (Log.e == 0) {
                        return;
                    }
                }
            }
            new Handler(context.getMainLooper()).post(new aw(str, a, mediaData, queryParameter));
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        int i = Log.e;
        byte[] bArr = new byte[4096];
        int i2 = 0;
        do {
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read < 0) {
                break;
            }
            outputStream.write(bArr, 0, read);
            i2 += read;
        } while (i == 0);
        return i2;
    }

    public static void a(Context context, Uri uri) {
        context.sendBroadcast(new Intent(z[23]).setData(uri));
    }
}
