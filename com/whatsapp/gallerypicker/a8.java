package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class a8 extends a3 implements aw {
    private static final String[] m;
    private static final String z;
    private int l;

    static {
        char[] toCharArray = "h#;I\fm?8B\u001al>8A(%-:Tx`26E(q#:N".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 5;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 85;
                    break;
                case ay.p /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        String[] strArr = new String[3];
        String str = "Z#1";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        length = 0;
        while (true) {
            cArr = str.toCharArray();
            int length2 = cArr.length;
            char[] cArr2 = cArr;
            for (int i3 = 0; length2 > i3; i3++) {
                int i4;
                char c2 = cArr2[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 5;
                        break;
                    case ay.f /*1*/:
                        i4 = 74;
                        break;
                    case ay.n /*2*/:
                        i4 = 85;
                        break;
                    case ay.p /*3*/:
                        i4 = 32;
                        break;
                    default:
                        i4 = 88;
                        break;
                }
                cArr2[i3] = (char) (i4 ^ c2);
            }
            str = new String(cArr2).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[length] = str;
                    length = 2;
                    strArr2 = strArr3;
                    str = "m/<G0q";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[length] = str;
                    m = strArr3;
                default:
                    strArr2[length] = str;
                    str = "r#1T0";
                    length = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public Bitmap a(int i) {
        Bitmap a;
        if (i < 144) {
            try {
                a = bw.a().a(this.c, this.b, 3, null, false);
            } catch (Throwable th) {
                Log.b(z, th);
                return null;
            }
        }
        Options options = new Options();
        options.inDither = false;
        options.inPreferredConfig = Config.ARGB_8888;
        Cursor queryMiniThumbnail = Thumbnails.queryMiniThumbnail(this.c, this.b, 1, m);
        if (queryMiniThumbnail != null) {
            if (queryMiniThumbnail.moveToFirst()) {
                options.outWidth = queryMiniThumbnail.getInt(1);
                options.outHeight = queryMiniThumbnail.getInt(2);
                options.inSampleSize = ax.b(options, i, (i * i) * 2);
            }
            queryMiniThumbnail.close();
        }
        a = bw.a().a(this.c, this.b, 1, options, false);
        return a != null ? ax.a(a, a()) : a;
    }

    public a8(aq aqVar, ContentResolver contentResolver, long j, int i, Uri uri, String str, String str2, long j2, String str3, int i2) {
        super(aqVar, contentResolver, j, i, uri, str, str2, j2, str3);
        this.l = i2;
    }

    public int a() {
        return this.l;
    }
}
