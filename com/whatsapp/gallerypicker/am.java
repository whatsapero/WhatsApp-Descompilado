package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import com.whatsapp.util.f;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class am extends a3 implements aw {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\u0003Q\n:k\u001aZ\u0004:g!";
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
                        i3 = 85;
                        break;
                    case ay.f /*1*/:
                        i3 = 56;
                        break;
                    case ay.n /*2*/:
                        i3 = 110;
                        break;
                    case ay.p /*3*/:
                        i3 = 95;
                        break;
                    default:
                        i3 = 4;
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
                    str = "\u0003Q\n:k\u001aZ\u0004:g!";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "8Q\u00006P=M\u0003=F<L\u0003>tu_\u0001+$0@\r:t!Q\u00011";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected am(aq aqVar, ContentResolver contentResolver, long j, int i, Uri uri, String str, String str2, long j2, String str3) {
        super(aqVar, contentResolver, j, i, uri, str, str2, j2, str3);
    }

    public boolean equals(Object obj) {
        return (obj == null || !(obj instanceof am)) ? false : a().equals(((am) obj).a());
    }

    public Bitmap a(int i, int i2) {
        return VERSION.SDK_INT >= 8 ? ThumbnailUtils.createVideoThumbnail(this.h, 1) : f.b(this.h);
    }

    public int hashCode() {
        return a().toString().hashCode();
    }

    public String toString() {
        return new StringBuilder(z[0]).append(this.b).toString();
    }

    public Bitmap a(int i) {
        if (i >= 144) {
            return a(i, (i * i) * 2);
        }
        try {
            return bw.a().a(this.c, this.b, 3, null, true);
        } catch (Throwable th) {
            Log.e(z[2], z[1], th);
            return null;
        }
    }
}
