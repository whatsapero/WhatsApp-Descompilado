package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import java.util.HashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ar extends aq {
    private static final String[] i;
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "u\u0003$nYc).a\u001c*V`";
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
                        i4 = 23;
                        break;
                    case ay.f /*1*/:
                        i4 = 118;
                        break;
                    case ay.n /*2*/:
                        i4 = 71;
                        break;
                    case ay.p /*3*/:
                        i4 = 5;
                        break;
                    default:
                        i4 = 60;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "u\u0003$nYc).a";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "u\u0003$nYc)#lOg\u001a&|cy\u0017*`";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "c\u00042`";
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    strArr = new String[7];
                    str = "H\u001f#";
                    i = 4;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    str = "H\u0012&q]";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 5;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    str = "s\u00173`Hv\u001d\"k";
                    i = 6;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    str = "c\u001f3iY";
                    i = 7;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "z\u001f)lcc\u001e2h^H\u001b&bUt";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    str = "z\u001f*`cc\u000f7`";
                    i = 9;
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "s\u00173`cz\u0019#lZ~\u0013#";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i = strArr3;
                default:
                    strArr2[i2] = str;
                    str = "s\u001f4qUy\u00153";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public ar(ContentResolver contentResolver, Uri uri, int i, String str) {
        super(contentResolver, uri, i, str);
    }

    protected String[] c() {
        return null;
    }

    protected Cursor c() {
        return Media.query(this.b, this.d, i, b(), c(), a());
    }

    protected aw a(Cursor cursor) {
        return a(cursor);
    }

    public HashMap c() {
        int i = ImagePreview.y;
        Uri build = this.d.buildUpon().appendQueryParameter(z[1], z[4]).build();
        Cursor query = Media.query(this.b, build, new String[]{z[3], z[2]}, b(), c(), a());
        try {
            HashMap hashMap = new HashMap();
            while (query.moveToNext()) {
                hashMap.put(query.getString(1), query.getString(0));
                if (i != 0) {
                    break;
                }
            }
            query.close();
            return hashMap;
        } catch (Throwable th) {
            query.close();
        }
    }

    protected String b() {
        return this.f != null ? z[0] + this.f + "'" : null;
    }

    protected a3 a(Cursor cursor) {
        long j = cursor.getLong(0);
        String string = cursor.getString(1);
        long j2 = cursor.getLong(2);
        if (j2 == 0) {
            j2 = cursor.getLong(6) * 1000;
        }
        String string2 = cursor.getString(3);
        String string3 = cursor.getString(5);
        if (string2 == null || string2.length() == 0) {
            string2 = string;
        }
        return new am(this, this.b, j, cursor.getPosition(), a(j), string, string3, j2, string2);
    }
}
