package com.whatsapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Hashtable;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ge {
    public static int a;
    public static int b;
    public static boolean c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    public static gw l;
    public static boolean m;
    public static boolean n;
    public static String o;
    public static long p;
    public static boolean q;
    public static boolean r;
    public static int s;
    private static final String[] z;

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 105;
                    break;
                case ay.f /*1*/:
                    i2 = 114;
                    break;
                case ay.n /*2*/:
                    i2 = 110;
                    break;
                case ay.p /*3*/:
                    i2 = 109;
                    break;
                default:
                    i2 = 12;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 12);
        }
        return toCharArray;
    }

    private static gw a() {
        if (z[39].equals(o)) {
            return new atx();
        }
        return z[40].equals(o) ? new xi() : new ih(o.split(","));
    }

    static {
        String[] strArr = new String[41];
        String str = "\b\u001e\u0002\u0002{";
        boolean z = true;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            str = z(z(str));
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u000e\u0000\u0001\u0018|6\u001c\u001b\u0000n\f\u00001\u0001e\u0004\u001b\u001a";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0004\u0001\u001e\b\u007f";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\n\u0013\u0002\u0001";
                    z = true;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\n\u0013\u0002\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0004\u0013\u00162k\u001b\u001d\u001b\u001d\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u000b\u0000\u0001\fh\n\u0013\u001d\u0019S\u0005\u001b\u001d\u0019S\u001a\u001b\u0014\bS\u0005\u001b\u0003\u0004x";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0000\u001f\u000f\ni6\u001f\u000f\u0015S\f\u0016\t\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0004\u0013\u00162`\u0000\u0001\u001a2~\f\u0011\u0007\u001de\f\u001c\u001a\u001e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u000e\u0000\u0001\u0018|\u001a-\u001d\b~\u001f\u0017\u001c2|\u001b\u001d\u001e\u001eS\u0005\u0013\u001d\u0019S\u001b\u0017\b\u001fi\u001a\u001a1\u0019e\u0004\u0017";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u001b\u0017\u000f\tS\u001b\u0017\r\be\u0019\u0006\u001d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0005\u001d\r\fx\u0000\u001d\u00002i\u0007\u0013\f\u0001i\r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\n\u001d\u0003C{\u0001\u0013\u001a\u001em\u0019\u00021\u001d~\f\u0014\u000b\u001fi\u0007\u0011\u000b\u001e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0019\u0013\u001c\u0019e\n\u001b\u001e\fb\u001d\u00011\u001ee\u0013\u00171\u0001e\u0004\u001b\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u000e\u0000\u0001\u0018|\u001a-\u0018_";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    str = "\n\u0013\u0002\u0001S\b\u001e\u0002\u0002{\f\u0016";
                    z = true;
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    strArr2 = strArr3;
                    str = "\u0000\u001f\u000f\ni6\u001f\u000f\u0015S\f\u0016\t\b";
                    z = true;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0019\u001e\u000f\u0004b\u001d\u0017\u0016\u0019S\r\u001b\u001d\fn\u0005\u0017\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0004\u0013\u00162|\b\u0000\u001a\u0004o\u0000\u0002\u000f\u0003x\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u001a\u0007\f\u0007i\n\u00061\u0001i\u0007\u0015\u001a\u0005S\u0005\u001b\u0003\u0004x";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0019\u001e\u000f\u0004b\u001d\u0017\u0016\u0019S\u001b\u0017\u000b\u0003m\u000b\u001e\u000b2x\u0001\u0000\u000b\u001ed\u0006\u001e\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u0004\u0017\u001d\u001em\u000e\u0017\u001d2\u007f\u001d\u0013\u001c\u0019S\u0019\u0017\u0000\te\u0007\u00151\b>\f-\u001d\b\u007f\u001a\u001b\u0001\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0004\u0013\u00162\u007f\u001c\u0010\u0004\bo\u001d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0004\u0017\n\u0004m";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0019\u001e\u000f\u0004b\u001d\u0017\u0016\u0019S\r\u001b\u001d\fn\u0005\u0017\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0018\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0004\u0017\n\u0004m6\u001e\u0007\u0000e\u001d-\u0003\u000f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0000\u001f\u000f\ni6\u001f\u000f\u0015S\u0002\u0010\u0017\u0019i\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0000\u001f\u000f\ni6\u001f\u000f\u0015S\u0002\u0010\u0017\u0019i\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u001a\u0017\u001c\u001bi\u001b\u0002\u001c\u0002|\u001a]\u0001\u0003_\f\u0000\u0018\b~9\u0000\u0001\u001di\u001b\u0006\u0007\b\u007fF\u0014\u000f\u0004`\f\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0018\u00001\bb\b\u0010\u0002\bh";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0007\u001d\u0000\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u001b\u0017\u000f\t~\f\u0011\u000b\u0004|\u001d\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u000e\u0000\u0001\u0018|\u001a-\u0018_S\f\u001c\u000f\u000f`\f\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u001a\u0017\u001c\u001bi\u001b-\u001e\u001fc\u0019\u0001T\u0001m\u001a\u00061\u001bi\u001b\u0001\u0007\u0002b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0005\u001d\r\fx\u0000\u001d\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0000\u001f\u000f\ni6\u0003\u001b\f`\u0000\u0006\u0017";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0019\u001e\u000f\u0004b\u001d\u0017\u0016\u0019S\u001b\u0017\u000b\u0003m\u000b\u001e\u000b2x\u0001\u0000\u000b\u001ed\u0006\u001e\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u0007\u001d\u0000\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\b\u001e\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = 9999;
                    e = 50;
                    s = 25;
                    f = 256;
                    k = 16;
                    g = 0;
                    n = false;
                    o = z(z("\u0007\u001d\u0000\b"));
                    m = false;
                    j = 5120;
                    i = 80;
                    h = 1280;
                    p = 0;
                    c = false;
                    b = 1;
                    r = false;
                    q = false;
                    SharedPreferences sharedPreferences = App.p.getSharedPreferences(z(z("\n\u001d\u0003C{\u0001\u0013\u001a\u001em\u0019\u00021\u001d~\f\u0014\u000b\u001fi\u0007\u0011\u000b\u001e")), 0);
                    str = "\u001a\u0017\u001c\u001bi\u001b-\u001e\u001fc\u0019\u0001T\u0001m\u001a\u00061\u001bi\u001b\u0001\u0007\u0002b";
                    z = true;
                    SharedPreferences sharedPreferences2 = sharedPreferences;
                    while (true) {
                        str = z(z(str));
                        switch (z) {
                            case PBE.MD5 /*0*/:
                                a = sharedPreferences2.getInt(str, a);
                                str = "\u0019\u0013\u001c\u0019e\n\u001b\u001e\fb\u001d\u00011\u001ee\u0013\u00171\u0001e\u0004\u001b\u001a";
                                sharedPreferences2 = sharedPreferences;
                                z = true;
                                break;
                            case ay.f /*1*/:
                                e = sharedPreferences2.getInt(str, e);
                                str = "\u001a\u0007\f\u0007i\n\u00061\u0001i\u0007\u0015\u001a\u0005S\u0005\u001b\u0003\u0004x";
                                sharedPreferences2 = sharedPreferences;
                                z = true;
                                break;
                            case ay.n /*2*/:
                                s = sharedPreferences2.getInt(str, s);
                                str = "\u0004\u0017\n\u0004m6\u001e\u0007\u0000e\u001d-\u0003\u000f";
                                sharedPreferences2 = sharedPreferences;
                                z = true;
                                break;
                            case ay.p /*3*/:
                                k = sharedPreferences2.getInt(str, k);
                                str = "\u0018\u00001\bb\b\u0010\u0002\bh";
                                z = true;
                                sharedPreferences2 = sharedPreferences;
                                break;
                            case aj.i /*4*/:
                                g = sharedPreferences2.getInt(str, g);
                                str = "\u000b\u0000\u0001\fh\n\u0013\u001d\u0019S\u0005\u001b\u001d\u0019S\u001a\u001b\u0014\bS\u0005\u001b\u0003\u0004x";
                                z = true;
                                sharedPreferences2 = sharedPreferences;
                                break;
                            case aV.r /*5*/:
                                f = sharedPreferences2.getInt(str, f);
                                str = "\n\u0013\u0002\u0001";
                                z = true;
                                sharedPreferences2 = sharedPreferences;
                                break;
                            case aV.i /*6*/:
                                n = sharedPreferences2.getBoolean(str, n);
                                str = "\n\u0013\u0002\u0001S\b\u001e\u0002\u0002{\f\u0016";
                                z = true;
                                sharedPreferences2 = sharedPreferences;
                                break;
                            case a8.s /*7*/:
                                o = sharedPreferences2.getString(str, o);
                                l = a();
                                str = "\u0005\u001d\r\fx\u0000\u001d\u00002i\u0007\u0013\f\u0001i\r";
                                z = true;
                                sharedPreferences2 = sharedPreferences;
                                break;
                            case a8.n /*8*/:
                                m = sharedPreferences2.getBoolean(str, m);
                                str = "\u0000\u001f\u000f\ni6\u001f\u000f\u0015S\u0002\u0010\u0017\u0019i\u001a";
                                z = true;
                                sharedPreferences2 = sharedPreferences;
                                break;
                            case a6.D /*9*/:
                                j = sharedPreferences2.getInt(str, j);
                                str = "\u0000\u001f\u000f\ni6\u0003\u001b\f`\u0000\u0006\u0017";
                                z = true;
                                sharedPreferences2 = sharedPreferences;
                                break;
                            case a6.h /*10*/:
                                i = sharedPreferences2.getInt(str, i);
                                str = "\u0000\u001f\u000f\ni6\u001f\u000f\u0015S\f\u0016\t\b";
                                z = true;
                                sharedPreferences2 = sharedPreferences;
                                break;
                            case a6.e /*11*/:
                                h = sharedPreferences2.getInt(str, h);
                                str = "\u001b\u0017\u000f\tS\u001b\u0017\r\be\u0019\u0006\u001d";
                                z = true;
                                sharedPreferences2 = sharedPreferences;
                                break;
                            case a6.s /*12*/:
                                p = sharedPreferences2.getLong(str, p);
                                str = "\u0019\u001e\u000f\u0004b\u001d\u0017\u0016\u0019S\r\u001b\u001d\fn\u0005\u0017\n";
                                z = true;
                                sharedPreferences2 = sharedPreferences;
                                break;
                            case a6.z /*13*/:
                                c = sharedPreferences2.getBoolean(str, c);
                                str = "\u0019\u001e\u000f\u0004b\u001d\u0017\u0016\u0019S\u001b\u0017\u000b\u0003m\u000b\u001e\u000b2x\u0001\u0000\u000b\u001ed\u0006\u001e\n";
                                z = true;
                                sharedPreferences2 = sharedPreferences;
                                break;
                            case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                                b = sharedPreferences2.getInt(str, b);
                                str = "\u0004\u0017\u001d\u001em\u000e\u0017\u001d2\u007f\u001d\u0013\u001c\u0019S\u0019\u0017\u0000\te\u0007\u00151\b>\f-\u001d\b\u007f\u001a\u001b\u0001\u0003";
                                z = true;
                                sharedPreferences2 = sharedPreferences;
                                break;
                            case vk.SherlockTheme_actionModeBackground /*15*/:
                                r = sharedPreferences2.getBoolean(str, r);
                                str = "\u000e\u0000\u0001\u0018|\u001a-\u0018_S\f\u001c\u000f\u000f`\f\u0016";
                                sharedPreferences2 = sharedPreferences;
                                z = true;
                                break;
                            case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                                q = sharedPreferences2.getBoolean(str, q);
                                sharedPreferences.edit().remove(z(z("\u0019\u0000\u0007\u001bm\n\u000b1\bb\b\u0010\u0002\bh"))).commit();
                            default:
                                d = sharedPreferences2.getInt(str, 0);
                                str = "\u000e\u0000\u0001\u0018|6\u001c\u001b\u0000n\f\u00001\u0001e\u0004\u001b\u001a";
                                sharedPreferences2 = sharedPreferences;
                                z = false;
                                break;
                        }
                    }
                default:
                    strArr2[i] = str;
                    str = "\u0000\u001f\u000f\ni6\u0003\u001b\f`\u0000\u0006\u0017";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    public static void a(int i, Hashtable hashtable) {
        int parseInt;
        boolean z;
        boolean z2 = true;
        Editor edit = App.p.getSharedPreferences(z[13], 0).edit();
        d = i;
        edit.putInt(z[35], i);
        String str = (String) hashtable.get(z[19]);
        if (!TextUtils.isEmpty(str)) {
            e = Integer.parseInt(str) - 1;
            edit.putInt(z[14], e);
        }
        str = (String) hashtable.get(z[23]);
        if (!TextUtils.isEmpty(str)) {
            s = Integer.parseInt(str);
            edit.putInt(z[20], s);
        }
        str = (String) hashtable.get(z[6]);
        if (!TextUtils.isEmpty(str)) {
            a = Integer.parseInt(str);
            edit.putInt(z[2], a);
        }
        str = (String) hashtable.get(z[24]);
        if (!TextUtils.isEmpty(str)) {
            k = Integer.parseInt(str);
            edit.putInt(z[27], k);
        }
        str = (String) hashtable.get(z[26]);
        if (!TextUtils.isEmpty(str)) {
            parseInt = Integer.parseInt(str);
            if (parseInt != g) {
                g = parseInt;
                edit.putInt(z[31], g);
            }
        }
        str = (String) hashtable.get(z[9]);
        if (!TextUtils.isEmpty(str)) {
            parseInt = Integer.parseInt(str);
            if (parseInt != f) {
                f = parseInt;
                edit.putInt(z[7], f);
            }
        }
        str = (String) hashtable.get(z[4]);
        if (TextUtils.isEmpty(str)) {
            z = false;
        } else if (Integer.parseInt(str) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z != n) {
            n = z;
            edit.putBoolean(z[5], n);
        }
        str = (String) hashtable.get(z[0]);
        if (TextUtils.isEmpty(str)) {
            str = z[32];
        }
        if (!str.equals(o)) {
            o = str;
            l = a();
            edit.putString(z[16], o);
        }
        str = (String) hashtable.get(z[36]);
        if (!TextUtils.isEmpty(str)) {
            if (Integer.parseInt(str) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z != m) {
                m = z;
                edit.putBoolean(z[12], m);
            }
        }
        str = (String) hashtable.get(z[29]);
        if (!TextUtils.isEmpty(str)) {
            j = Integer.parseInt(str);
            edit.putInt(z[28], j);
        }
        str = (String) hashtable.get(z[37]);
        if (!TextUtils.isEmpty(str)) {
            i = Integer.parseInt(str);
            edit.putInt(z[1], i);
        }
        str = (String) hashtable.get(z[17]);
        if (!TextUtils.isEmpty(str)) {
            h = Integer.parseInt(str);
            edit.putInt(z[8], h);
        }
        str = (String) hashtable.get(z[33]);
        if (!TextUtils.isEmpty(str)) {
            p = Long.parseLong(str) * 1000;
            edit.putLong(z[11], p);
        }
        str = (String) hashtable.get(z[18]);
        if (TextUtils.isEmpty(str)) {
            z = false;
        } else if (Integer.parseInt(str) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z != c) {
            c = z;
            edit.putBoolean(z[25], c);
        }
        str = (String) hashtable.get(z[21]);
        if (!TextUtils.isEmpty(str)) {
            b = Integer.parseInt(str);
            edit.putInt(z[38], b);
        }
        str = (String) hashtable.get(z[3]);
        if (TextUtils.isEmpty(str)) {
            z = false;
        } else if (Integer.parseInt(str) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z != r) {
            r = z;
            edit.putBoolean(z[22], r);
        }
        str = (String) hashtable.get(z[15]);
        if (!TextUtils.isEmpty(str)) {
            if (Integer.parseInt(str) == 0) {
                z2 = false;
            }
            if (z2 != q) {
                q = z2;
                edit.putBoolean(z[34], q);
            }
        }
        edit.putLong(z[10], System.currentTimeMillis());
        if (!edit.commit()) {
            Log.e(z[30]);
        }
    }
}
