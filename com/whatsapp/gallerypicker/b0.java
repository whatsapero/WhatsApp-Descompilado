package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.util.f;
import java.io.File;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class b0 implements aw {
    private static final String z;
    private final Uri a;
    private long b;
    private final v c;
    private final ContentResolver d;

    static {
        char[] toCharArray = "56{\u000b\u0019lu".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 67;
                    break;
                case ay.f /*1*/:
                    i2 = 95;
                    break;
                case ay.n /*2*/:
                    i2 = 31;
                    break;
                case ay.p /*3*/:
                    i2 = 110;
                    break;
                default:
                    i2 = 118;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Uri a() {
        return this.a;
    }

    public Bitmap a(int i, int i2) {
        return f.b(b());
    }

    b0(v vVar, ContentResolver contentResolver, String str, long j) {
        this.c = vVar;
        this.d = contentResolver;
        this.a = Uri.fromFile(new File(str));
        this.b = j;
    }

    public Bitmap a(int i) {
        return a(i, (i * i) * 2);
    }

    public long c() {
        return this.b;
    }

    public String d() {
        return z;
    }

    public String b() {
        return this.a.getPath();
    }
}
