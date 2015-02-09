package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import com.whatsapp.vk;
import java.util.HashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class a6 extends aq implements v {
    static final String[] i;
    private static final String[] j;
    private static final String[] z;

    static {
        String[] strArr = new String[6];
        String str = "D'3\u000eSN-4";
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
                        i4 = 32;
                        break;
                    case ay.f /*1*/:
                        i4 = 78;
                        break;
                    case ay.n /*2*/:
                        i4 = 64;
                        break;
                    case ay.p /*3*/:
                        i4 = 122;
                        break;
                    default:
                        i4 = 58;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "B;#\u0011_T\u0011)\u001e";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "T<5\u001f";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\b#)\u0017_\u007f:9\n_\u0000'.Z\u0012\u001fb`E\u0016\u0000qiS\u001aa\u0000\u0004ZXU-+\u001fN\u007f'$Z\u0007\u0000q";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\b#)\u0017_\u007f:9\n_\u0000'.Z\u0012\u001fb`E\u0016\u0000qiS";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    strArr = new String[3];
                    str = "I#!\u001d_\u000f$0\u001f]";
                    i = 5;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    str = "I#!\u001d_\u000f>.\u001d";
                    i = 6;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    str = "I#!\u001d_\u000f))\u001c";
                    i = 7;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    j = strArr3;
                    strArr = new String[8];
                    str = "\u007f'$";
                    i = 8;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    str = "\u007f*!\u000e[";
                    i = 9;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case org.whispersystems.libaxolotl.a6.D /*9*/:
                    strArr2[i2] = str;
                    str = "D/4\u001fNA%%\u0014";
                    i = 10;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case org.whispersystems.libaxolotl.a6.h /*10*/:
                    strArr2[i2] = str;
                    str = "M'.\u0013eT&5\u0017X\u007f#!\u001dSC";
                    i = 11;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case org.whispersystems.libaxolotl.a6.e /*11*/:
                    strArr2[i2] = str;
                    str = "O<)\u001fTT/4\u0013UN";
                    i = 12;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case org.whispersystems.libaxolotl.a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "T'4\u0016_";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case org.whispersystems.libaxolotl.a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "M'-\u001feT70\u001f";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "D/4\u001feM!$\u0013\\I+$";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i = strArr3;
                default:
                    strArr2[i2] = str;
                    str = "B;#\u0011_T\u0011$\u0013IP\"!\u0003eN/-\u001f";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    protected a3 a(Cursor cursor) {
        long j = cursor.getLong(0);
        String string = cursor.getString(1);
        long j2 = cursor.getLong(2);
        if (j2 == 0) {
            j2 = cursor.getLong(7) * 1000;
        }
        int i = cursor.getInt(4);
        String string2 = cursor.getString(5);
        String string3 = cursor.getString(6);
        if (string2 == null || string2.length() == 0) {
            string2 = string;
        }
        return new a8(this, this.b, j, cursor.getPosition(), a(j), string, string3, j2, string2, i);
    }

    protected aw a(Cursor cursor) {
        return a(cursor);
    }

    protected String b() {
        return this.f == null ? z[5] : z[4];
    }

    public HashMap c() {
        int i = ImagePreview.y;
        Uri build = this.d.buildUpon().appendQueryParameter(z[0], z[3]).build();
        Cursor query = Media.query(this.b, build, new String[]{z[1], z[2]}, b(), a(), null);
        try {
            HashMap hashMap = new HashMap();
            while (query.moveToNext()) {
                Object string = query.getString(0);
                String string2 = query.getString(1);
                if (string == null) {
                    string = "";
                }
                hashMap.put(string2, string);
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

    protected Cursor c() {
        return Media.query(this.b, this.d, i, b(), a(), a());
    }

    protected String[] a() {
        if (this.f == null) {
            return j;
        }
        int length = j.length;
        Object obj = new Object[(length + 1)];
        System.arraycopy(j, 0, obj, 0, length);
        obj[length] = this.f;
        return obj;
    }

    public a6(ContentResolver contentResolver, Uri uri, int i, String str) {
        super(contentResolver, uri, i, str);
    }
}
