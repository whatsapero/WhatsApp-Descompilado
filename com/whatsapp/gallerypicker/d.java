package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class d implements aw {
    private static final String[] z;
    private final ContentResolver a;
    private final Uri b;
    private final v c;

    static {
        String[] strArr = new String[3];
        String str = "\u001fE\u000f\u0016C\u0000I\u001eFR\u0011E\u0015\u0016B\u001dI\u0014RO\u0016M[TO\fG\u001aF\u0006";
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
                        i3 = 120;
                        break;
                    case ay.f /*1*/:
                        i3 = 42;
                        break;
                    case ay.n /*2*/:
                        i3 = 123;
                        break;
                    case ay.p /*3*/:
                        i3 = 54;
                        break;
                    default:
                        i3 = 38;
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
                    str = "\u001eC\u0017S";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "-X\u0012\u007fK\u0019M\u001e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    d(v vVar, ContentResolver contentResolver, Uri uri) {
        this.c = vVar;
        this.a = contentResolver;
        this.b = uri;
    }

    public String b() {
        return this.b.getPath();
    }

    public Bitmap a(int i, int i2) {
        try {
            return ax.a(i, i2, b());
        } catch (Throwable e) {
            Log.e(z[1], z[0], e);
            return null;
        }
    }

    public Uri a() {
        return this.b;
    }

    public long c() {
        return 0;
    }

    public Bitmap a(int i) {
        return a(i, (i * i) * 2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.BitmapFactory.Options a() {
        /*
        r4_this = this;
        r1 = r4.b();
        if (r1 != 0) goto L_0x0008;
    L_0x0006:
        r0 = 0;
    L_0x0007:
        return r0;
    L_0x0008:
        r0 = new android.graphics.BitmapFactory$Options;	 Catch:{ all -> 0x001f }
        r0.<init>();	 Catch:{ all -> 0x001f }
        r2 = 1;
        r0.inJustDecodeBounds = r2;	 Catch:{ all -> 0x001f }
        r2 = com.whatsapp.gallerypicker.bw.a();	 Catch:{ all -> 0x001f }
        r3 = r1.getFileDescriptor();	 Catch:{ all -> 0x001f }
        r2.a(r3, r0);	 Catch:{ all -> 0x001f }
        com.whatsapp.gallerypicker.ax.a(r1);
        goto L_0x0007;
    L_0x001f:
        r0 = move-exception;
        com.whatsapp.gallerypicker.ax.a(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.d.a():android.graphics.BitmapFactory$Options");
    }

    public String d() {
        Options a = a();
        return (a == null || a.outMimeType == null) ? "" : a.outMimeType;
    }

    private ParcelFileDescriptor b() {
        try {
            return this.b.getScheme().equals(z[2]) ? ParcelFileDescriptor.open(new File(this.b.getPath()), 268435456) : this.a.openFileDescriptor(this.b, "r");
        } catch (FileNotFoundException e) {
            return null;
        }
    }
}
