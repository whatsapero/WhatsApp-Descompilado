package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class a0 extends aq {
    static final String[] i;
    public static final Uri j;
    private static final String[] z;

    public a0(ContentResolver contentResolver, int i, String str) {
        super(contentResolver, j, i, str);
    }

    public void d() {
        b();
    }

    static {
        String[] strArr = new String[3];
        String str = ",[\u0006[L:g\u0001";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 78;
                        break;
                    case ay.f /*1*/:
                        i4 = 46;
                        break;
                    case ay.n /*2*/:
                        i4 = 101;
                        break;
                    case ay.p /*3*/:
                        i4 = 48;
                        break;
                    default:
                        i4 = 41;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "'@\u0006\\\\*K";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    char[] toCharArray2 = "-A\u000bDL Z_\u001f\u0006-A\b\u001e^&O\u0011CH>^K@[!X\fTL<\u0000\bUM'OJY]+C\u0016".toCharArray();
                    i2 = toCharArray2.length;
                    toCharArray = toCharArray2;
                    for (int i5 = 0; i2 > i5; i5++) {
                        char c2 = toCharArray[i5];
                        switch (i5 % 5) {
                            case PBE.MD5 /*0*/:
                                i = 78;
                                break;
                            case ay.f /*1*/:
                                i = 46;
                                break;
                            case ay.n /*2*/:
                                i = 101;
                                break;
                            case ay.p /*3*/:
                                i = 48;
                                break;
                            default:
                                i = 41;
                                break;
                        }
                        toCharArray[i5] = (char) (i ^ c2);
                    }
                    j = Uri.parse(new String(toCharArray).intern());
                    String[] strArr4 = new String[5];
                    i2 = 0;
                    strArr2 = strArr4;
                    strArr3 = strArr4;
                    str = "\u0011G\u0001";
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\u0011J\u0004DH";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    str = "*O\u0011U]/E\u0000^";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    str = ":G\u0011\\L";
                    i = 5;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    str = "#G\bUv:W\u0015U";
                    i = 6;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i = strArr3;
                default:
                    strArr2[i2] = str;
                    str = "8G\u0001UF";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public HashMap c() {
        return new HashMap();
    }

    protected aw a(Cursor cursor) {
        return new b0(this, this.b, cursor.getString(1), cursor.getLong(2));
    }

    public void a(ContentObserver contentObserver) {
        if (this.e != null) {
            this.e.registerContentObserver(contentObserver);
        }
    }

    protected Cursor c() {
        return this.b.query(this.d.buildUpon().appendQueryParameter(z[0], this.f).appendQueryParameter(z[2], z[1]).build(), i, null, null, a());
    }

    public void b(ContentObserver contentObserver) {
        if (this.e != null) {
            this.e.unregisterContentObserver(contentObserver);
        }
    }
}
