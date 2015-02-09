package com.whatsapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class zd {
    private static final Object a;
    private static zd c;
    private static final String[] z;
    private _t b;

    private zd(Context context) {
        this.b = new _t(context);
    }

    public void a(String str) {
        this.b.getWritableDatabase().delete(z[35], z[34], new String[]{str});
    }

    public void a(String str, String str2, String str3, String str4, String str5, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[19], str);
        contentValues.put(z[20], str2);
        contentValues.put(z[18], str3);
        contentValues.put(z[14], str4);
        contentValues.put(z[17], str5);
        contentValues.put(z[15], Long.valueOf(System.currentTimeMillis()));
        contentValues.put(z[13], Boolean.valueOf(z));
        this.b.getWritableDatabase().replaceOrThrow(z[16], null, contentValues);
    }

    public void a(String str, double d, double d2, double d3, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[31], Double.valueOf(d));
        contentValues.put(z[28], Double.valueOf(d2));
        contentValues.put(z[29], Double.valueOf(d3));
        contentValues.put(z[30], str2);
        this.b.getWritableDatabase().update(z[32], contentValues, z[33], new String[]{str});
    }

    public void a() {
        this.b.getWritableDatabase().delete(z[27], null, null);
    }

    public static zd a(Context context) {
        if (c == null) {
            synchronized (a) {
                if (c == null) {
                    c = new zd(context);
                }
            }
        }
        return c;
    }

    static {
        String[] strArr = new String[36];
        String str = "D3vS+E.";
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
                        i3 = 48;
                        break;
                    case ay.f /*1*/:
                        i3 = 90;
                        break;
                    case ay.n /*2*/:
                        i3 = 27;
                        break;
                    case ay.p /*3*/:
                        i3 = 54;
                        break;
                    default:
                        i3 = 68;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\\;hB\u001bQ9o_2U";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "C?hE-_4h";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "D5pS*";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "Q9xC6Q9b";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "U\"k_6Q.rY*";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "R(tA7U(D_ ";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "C?xD!D";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "_)";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\\5u";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "R(tA7U(DB=@?";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "@6zU!o4z[!";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "D3vS+E.";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "_)";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\\;hB\u001bQ9o_2U";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "C?hE-_4h";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "R(tA7U(DB=@?";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "D5pS*";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "R(tA7U(D_ ";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "C?xD!D";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "R(tA7U(D_ \u0010g;\t";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "C?hE-_4h";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\\;hB\u001bQ9o_2U";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "C?hE-_4h";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "U\"k_6Q.rY*";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "R(tA7U(D_ \u0010g;\t";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    str = "C?hE-_4h";
                    obj = 26;
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    strArr2 = strArr3;
                    str = "\\5u";
                    obj = 27;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "Q9xC6Q9b";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "@6zU!o4z[!";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\\;o";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "C?hE-_4h";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "R(tA7U(D_ \u0010g;\t";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "R(tA7U(D_ \u0010g;\t";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "C?hE-_4h";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new Object();
                default:
                    strArr2[i] = str;
                    str = "\\;o";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public List b() {
        int i = App.az;
        List arrayList = new ArrayList();
        Cursor query = this.b.getReadableDatabase().query(z[3], new String[]{z[7], z[8], z[4], z[9], z[11], z[1], z[10], z[5], z[12], z[2], z[0], z[6]}, null, null, null, null, null);
        while (query != null && query.moveToNext()) {
            boolean z;
            avu com_whatsapp_avu = new avu();
            com_whatsapp_avu.b = query.getString(0);
            com_whatsapp_avu.g = query.getString(1);
            com_whatsapp_avu.f = query.getString(2);
            com_whatsapp_avu.c = query.getString(3);
            com_whatsapp_avu.j = query.getString(4);
            com_whatsapp_avu.h = query.getDouble(5);
            com_whatsapp_avu.l = query.getDouble(6);
            com_whatsapp_avu.k = query.getDouble(7);
            com_whatsapp_avu.a = query.getString(8);
            com_whatsapp_avu.i = query.getLong(9);
            if (query.getInt(10) > 0) {
                z = true;
            } else {
                z = false;
            }
            com_whatsapp_avu.e = z;
            com_whatsapp_avu.d = query.getLong(11);
            arrayList.add(com_whatsapp_avu);
            if (i != 0) {
                break;
            }
        }
        return arrayList;
    }

    public void b(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[23], Long.valueOf(j));
        this.b.getWritableDatabase().update(z[22], contentValues, z[21], new String[]{str});
    }

    public void a(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[25], Long.valueOf(j));
        this.b.getWritableDatabase().update(z[24], contentValues, z[26], new String[]{str});
    }
}
