package com.whatsapp.util;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.widget.ImageView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread.State;
import java.net.URL;
import java.util.HashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class bw {
    private static final String z;
    aa a;
    private final int b;
    private final int c;
    private final int d;
    private b8 e;
    private HashMap f;
    private final File g;

    static {
        char[] toCharArray = "FT~".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 99;
                    break;
                case ay.f /*1*/:
                    i2 = 102;
                    break;
                case ay.n /*2*/:
                    i2 = 78;
                    break;
                case ay.p /*3*/:
                    i2 = 63;
                    break;
                default:
                    i2 = 11;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public bw(int i, int i2, int i3, File file) {
        this.f = new u(60);
        this.e = new b8(this);
        this.a = new aa(this);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.g = file;
        this.e.setPriority(4);
    }

    static Bitmap a(bw bwVar, i iVar) {
        return bwVar.a(iVar);
    }

    private void b(String str, String str2, Activity activity, ImageView imageView, e eVar) {
        synchronized (aa.a(this.a)) {
            this.a.a(imageView);
        }
        i iVar = new i(this, str, str2, imageView, eVar);
        synchronized (aa.a(this.a)) {
            aa.a(this.a).add(0, iVar);
            aa.a(this.a).notifyAll();
        }
        if (this.e.getState() == State.NEW) {
            this.e.start();
        }
    }

    public void b() {
        int i = Log.e;
        synchronized (this.f) {
            this.f.clear();
            File[] listFiles = this.g.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i2 = 0;
                while (i2 < length) {
                    listFiles[i2].delete();
                    i2++;
                    if (i != 0) {
                        break;
                    }
                }
            }
        }
    }

    static HashMap b(bw bwVar) {
        return bwVar.f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r7, java.lang.String r8, android.app.Activity r9, android.widget.ImageView r10, com.whatsapp.util.e r11) {
        /*
        r6_this = this;
        r1 = com.whatsapp.util.Log.e;
        r10.setTag(r7);
        if (r8 != 0) goto L_0x000d;
    L_0x0007:
        r0 = r6.b;
        r10.setImageResource(r0);
    L_0x000c:
        return;
    L_0x000d:
        r0 = new java.io.File;
        r2 = r6.g;
        r0.<init>(r2, r8);
        r2 = r0.getAbsolutePath();
        if (r7 != 0) goto L_0x0022;
    L_0x001a:
        r0 = android.graphics.drawable.Drawable.createFromPath(r2);
        r10.setImageDrawable(r0);
        goto L_0x000c;
    L_0x0022:
        r0 = r6.f;
        r0 = r0.containsKey(r7);
        if (r0 == 0) goto L_0x0050;
    L_0x002a:
        r0 = r6.f;
        r0 = r0.get(r7);
        r0 = (android.graphics.Bitmap) r0;
        if (r0 == 0) goto L_0x0039;
    L_0x0034:
        r10.setImageBitmap(r0);
        if (r1 == 0) goto L_0x0049;
    L_0x0039:
        r3 = r6.b;
        if (r3 == 0) goto L_0x0044;
    L_0x003d:
        r3 = r6.b;
        r10.setImageResource(r3);
        if (r1 == 0) goto L_0x0049;
    L_0x0044:
        r3 = 8;
        r10.setVisibility(r3);
    L_0x0049:
        if (r11 == 0) goto L_0x004e;
    L_0x004b:
        r11.a(r0);
    L_0x004e:
        if (r1 == 0) goto L_0x000c;
    L_0x0050:
        r0 = r6.c;
        r10.setImageResource(r0);
        r0 = r6;
        r1 = r7;
        r3 = r9;
        r4 = r10;
        r5 = r11;
        r0.b(r1, r2, r3, r4, r5);
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.bw.a(java.lang.String, java.lang.String, android.app.Activity, android.widget.ImageView, com.whatsapp.util.e):void");
    }

    public void a() {
        this.e.interrupt();
    }

    private Bitmap a(i iVar) {
        int i = Log.e;
        File file = new File(iVar.c);
        Bitmap a = a(file, iVar.a);
        if (a != null) {
            return a;
        }
        try {
            if (file.exists()) {
                return null;
            }
            try {
                InputStream openStream = new URL(iVar.e.replace(" ", z)).openStream();
                OutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[1024];
                do {
                    int read = openStream.read(bArr, 0, 1024);
                    if (read == -1 && i == 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                } while (i == 0);
                break;
                fileOutputStream.close();
                return a(file, iVar.a);
            } catch (Exception e) {
                throw e;
            } catch (Throwable e2) {
                Log.c(e2);
                return null;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public Bitmap a(File file, ImageView imageView) {
        int i = Log.e;
        try {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(new FileInputStream(file), null, options);
            if (options.outWidth < 0 || options.outHeight < 0) {
                return null;
            }
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            options.inSampleSize = 1;
            do {
                if (i2 / 2 < this.d) {
                    if (i3 / 2 < this.d && i == 0) {
                        break;
                    }
                }
                i2 /= 2;
                i3 /= 2;
                options.inSampleSize++;
            } while (i == 0);
            options.inJustDecodeBounds = false;
            options.inInputShareable = true;
            options.inPurgeable = true;
            return BitmapFactory.decodeStream(new FileInputStream(file), null, options);
        } catch (FileNotFoundException e) {
            throw e;
        } catch (FileNotFoundException e2) {
            throw e2;
        } catch (FileNotFoundException e3) {
            return null;
        }
    }

    public void a(String str, String str2, Activity activity, ImageView imageView) {
        a(str, str2, activity, imageView, null);
    }

    static int a(bw bwVar) {
        return bwVar.b;
    }
}
