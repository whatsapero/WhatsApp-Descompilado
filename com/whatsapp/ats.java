package com.whatsapp;

import android.net.NetworkInfo;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ats {
    private static ArrayList a;
    private static String[][] b;
    private static final Map c;
    private static String[][] d;
    private static String[][] e;
    private static boolean f;
    private static final String[] z;

    public static boolean b(String str, String str2) {
        int i = App.az;
        if (str == null || str2 == null) {
            return false;
        }
        int i2 = 0;
        while (i2 < b.length) {
            try {
                if (str.equals(b[i2][0])) {
                    if (str2.equals(b[i2][1])) {
                        return true;
                    }
                }
                i2++;
                if (i != 0) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        return false;
    }

    public static ArrayList a() {
        b();
        return a;
    }

    private static int[] g(String str) {
        int[] iArr = null;
        int i = App.az;
        String[] split = TextUtils.split(str, ",");
        if (split != null) {
            int length = split.length;
            if (length != 0) {
                iArr = new int[length];
                int i2 = 0;
                while (i2 < length) {
                    iArr[i2] = Integer.parseInt(split[i2]);
                    i2++;
                    if (i != 0) {
                        break;
                    }
                }
            }
        }
        return iArr;
    }

    public static String b(String str) {
        int i = App.az;
        b();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            vt vtVar = (vt) it.next();
            try {
                if (!vtVar.b.startsWith(str)) {
                    if (i != 0) {
                        break;
                    }
                }
                return vtVar.f;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return "";
    }

    public static vt a(String str) {
        int i = App.az;
        b();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            vt vtVar = (vt) it.next();
            try {
                if (!str.equals(vtVar.f)) {
                    if (i != 0) {
                        break;
                    }
                }
                return vtVar;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return null;
    }

    public static String d(String str) {
        int i = App.az;
        b();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            vt vtVar = (vt) it.next();
            try {
                if (!vtVar.b.equals(str)) {
                    if (i != 0) {
                        break;
                    }
                }
                return Integer.toString(vtVar.c);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return null;
    }

    public static boolean a(String str, String str2) {
        int i = App.az;
        if (str == null || str2 == null) {
            return false;
        }
        int i2 = 0;
        while (i2 < e.length) {
            try {
                if (str.equals(e[i2][0])) {
                    if (str2.equals(e[i2][1])) {
                        return true;
                    }
                }
                i2++;
                if (i != 0) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        return false;
    }

    static {
        String[] strArr = new String[6];
        int i = 0;
        String str = "\u001c\"p\u0004q\r$`\u0019*\u0010=`\u0004";
        Object obj = -1;
        String[] strArr2 = strArr;
        while (true) {
            int i2;
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 127;
                        break;
                    case ay.f /*1*/:
                        i2 = 77;
                        break;
                    case ay.n /*2*/:
                        i2 = 5;
                        break;
                    case ay.p /*3*/:
                        i2 = 106;
                        break;
                    default:
                        i2 = 5;
                        break;
                }
                cArr[i3] = (char) (i2 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr[i] = str;
                    i = 2;
                    str = "\u001c\"p\u0004q\r$`\u0019*\u0013\"d\u000e*\n#v\u001fu\u000f\"w\u001e`\u001b``\u0004f\u0010)l\u0004bEmP>CRu";
                    obj = 1;
                    strArr = strArr2;
                    break;
                case ay.f /*1*/:
                    strArr[i] = str;
                    i = 3;
                    str = "\u001c\"p\u0004q\r$`\u0019*\u0013\"d\u000e*\u001d,aGk\n g\u000fwEm";
                    obj = 2;
                    strArr = strArr2;
                    break;
                case ay.n /*2*/:
                    strArr[i] = str;
                    i = 4;
                    str = "*\u0019CG=";
                    obj = 3;
                    strArr = strArr2;
                    break;
                case ay.p /*3*/:
                    strArr[i] = str;
                    i = 5;
                    str = "Ft<";
                    obj = 4;
                    strArr = strArr2;
                    break;
                case aj.i /*4*/:
                    strArr[i] = str;
                    z = strArr2;
                    f = false;
                    c = new HashMap();
                    for (Locale locale : Locale.getAvailableLocales()) {
                        String country = locale.getCountry();
                        if (country != null) {
                            try {
                                if (!c.containsKey(country)) {
                                    c.put(country, locale);
                                }
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                    }
                    String[][] strArr3 = new String[18][];
                    strArr = new String[2];
                    strArr[0] = "1";
                    i = 1;
                    str = ",=w\u0003k\u000b";
                    obj = -1;
                    String[][] strArr4 = strArr3;
                    String[][] strArr5 = strArr3;
                    int i4 = 0;
                    strArr2 = strArr;
                    while (true) {
                        toCharArray = str.toCharArray();
                        int length2 = toCharArray.length;
                        char[] cArr2 = toCharArray;
                        for (int i5 = 0; length2 > i5; i5++) {
                            char c2 = cArr2[i5];
                            switch (i5 % 5) {
                                case PBE.MD5 /*0*/:
                                    i2 = 127;
                                    break;
                                case ay.f /*1*/:
                                    i2 = 77;
                                    break;
                                case ay.n /*2*/:
                                    i2 = 5;
                                    break;
                                case ay.p /*3*/:
                                    i2 = 106;
                                    break;
                                default:
                                    i2 = 5;
                                    break;
                            }
                            cArr2[i5] = (char) (i2 ^ c2);
                        }
                        str = new String(cArr2).intern();
                        switch (obj) {
                            case PBE.MD5 /*0*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "2(q\u0018j/\u000eV";
                                obj = 1;
                                i4 = 2;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case ay.f /*1*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = ")(w\u0003\u007f\u0010#%=l\r(i\u000fv\f";
                                obj = 2;
                                i4 = 3;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case ay.n /*2*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "<(i\u0006p\u0013,wJV\u00108q\u0002";
                                obj = 3;
                                i4 = 4;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case ay.p /*3*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "*cVDF\u001a!i\u001fi\u001e?";
                                obj = 4;
                                i4 = 5;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case aj.i /*4*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "*cVD%<(i\u0006p\u0013,w";
                                obj = 5;
                                i4 = 6;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case aV.r /*5*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = ":5q\u000fk\u001b(aJK\u001a9r\u0005w\u0014";
                                obj = 6;
                                i4 = 7;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case aV.i /*6*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "Lu";
                                obj = 7;
                                i4 = 8;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case a8.s /*7*/:
                                strArr[i] = str;
                                i = 1;
                                str = ",=w\u0003k\u000b";
                                obj = 8;
                                strArr = strArr2;
                                break;
                            case a8.n /*8*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "Lu";
                                obj = 9;
                                i4 = 9;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case a6.D /*9*/:
                                strArr[i] = str;
                                i = 1;
                                str = ")(w\u0003\u007f\u0010#";
                                obj = 10;
                                strArr = strArr2;
                                break;
                            case a6.h /*10*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "Lu";
                                obj = 11;
                                i4 = 10;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case a6.e /*11*/:
                                strArr[i] = str;
                                i = 1;
                                str = ")(w\u0003\u007f\u0010#%=l\r(i\u000fv\f";
                                obj = 12;
                                strArr = strArr2;
                                break;
                            case a6.s /*12*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "J\u007f";
                                obj = 13;
                                i4 = 11;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case a6.z /*13*/:
                                strArr[i] = str;
                                i = 1;
                                str = ",=w\u0003k\u000b";
                                obj = 14;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "Gx5";
                                obj = 15;
                                i4 = 12;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_actionModeBackground /*15*/:
                                strArr[i] = str;
                                i = 1;
                                str = "3\n%?.";
                                obj = 16;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "Gx6";
                                obj = 17;
                                i4 = 13;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                                strArr[i] = str;
                                i = 1;
                                str = "<\u0019F";
                                obj = 18;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "I{";
                                obj = 19;
                                i4 = 14;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                                strArr[i] = str;
                                i = 1;
                                str = "3\n%?.";
                                obj = 20;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_buttonStyleSmall /*20*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "G{";
                                obj = 21;
                                i4 = 15;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_selectableItemBackground /*21*/:
                                strArr[i] = str;
                                i = 1;
                                str = "<\u0019F";
                                obj = 22;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_windowContentOverlay /*22*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "Gu3";
                                obj = 23;
                                i4 = 16;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                                strArr[i] = str;
                                i = 1;
                                str = ">\u001dG=";
                                obj = 24;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "Gu3";
                                obj = 25;
                                i4 = 17;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_textAppearanceSmall /*25*/:
                                strArr[i] = str;
                                i = 1;
                                str = ">\u001dQ";
                                obj = 26;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_textColorPrimary /*26*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                d = strArr5;
                                strArr3 = new String[30][];
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = ",=w\u0003k\u000b";
                                obj = 27;
                                strArr4 = strArr3;
                                strArr5 = strArr3;
                                i4 = 0;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = ")(w\u0003\u007f\u0010#";
                                obj = 28;
                                i4 = 1;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = ")(w\u0003\u007f\u0010#%=l\r(i\u000fv\f";
                                obj = 29;
                                i4 = 2;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_spinnerItemStyle /*29*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "*\u001eF)";
                                obj = 30;
                                i4 = 3;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "*cVDF\u001a!i\u001fi\u001e?";
                                obj = 31;
                                i4 = 4;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = ":5q\u000fk\u001b(aJK\u001a9r\u0005w\u0014";
                                obj = 32;
                                i4 = 5;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_searchDropdownBackground /*32*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "2(q\u0018j/\u000eV";
                                obj = 33;
                                i4 = 6;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "Lu";
                                obj = 34;
                                i4 = 7;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_searchViewGoIcon /*34*/:
                                strArr[i] = str;
                                i = 1;
                                str = ",=w\u0003k\u000b";
                                obj = 35;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "Lu";
                                obj = 36;
                                i4 = 8;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                                strArr[i] = str;
                                i = 1;
                                str = ")(w\u0003\u007f\u0010#";
                                obj = 37;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_searchViewEditQuery /*37*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "Lu";
                                obj = 38;
                                i4 = 9;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                                strArr[i] = str;
                                i = 1;
                                str = ")(w\u0003\u007f\u0010#%=l\r(i\u000fv\f";
                                obj = 39;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_searchViewTextField /*39*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "J\u007f";
                                obj = 40;
                                i4 = 10;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                                strArr[i] = str;
                                i = 1;
                                str = ",=w\u0003k\u000b";
                                obj = 41;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_textColorSearchUrl /*41*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "I\u007f";
                                obj = 42;
                                i4 = 11;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                                strArr[i] = str;
                                i = 1;
                                str = "\u001a>l\u000b+\u001c\"+\u0003a";
                                obj = 43;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "I\u007f";
                                obj = 44;
                                i4 = 12;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                                strArr[i] = str;
                                i = 1;
                                str = "+(i\u0001j\u0012mC\u0006`\u0007$";
                                obj = 45;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "I\u007f";
                                obj = 46;
                                i4 = 13;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                                strArr[i] = str;
                                i = 1;
                                str = ",=w\u0003k\u000b";
                                obj = 47;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "I\u007f";
                                obj = 48;
                                i4 = 14;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                                strArr[i] = str;
                                i = 1;
                                str = ")(w\u0003\u007f\u0010#";
                                obj = 49;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "I\u007f";
                                obj = 50;
                                i4 = 15;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                                strArr[i] = str;
                                i = 1;
                                str = ")(w\u0003\u007f\u0010#%=l\r(i\u000fv\f";
                                obj = 51;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_dividerVertical /*51*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "I{";
                                obj = 52;
                                i4 = 16;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_actionDropDownStyle /*52*/:
                                strArr[i] = str;
                                i = 1;
                                str = "3\n%?.";
                                obj = 53;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_actionButtonStyle /*53*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "G|";
                                obj = 54;
                                i4 = 17;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                                strArr[i] = str;
                                i = 1;
                                str = "4\tA#";
                                obj = 55;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "Gx5";
                                obj = 56;
                                i4 = 18;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_popupMenuStyle /*56*/:
                                strArr[i] = str;
                                i = 1;
                                str = "3\n%?.";
                                obj = 57;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "Gx6";
                                obj = 58;
                                i4 = 19;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                                strArr[i] = str;
                                i = 1;
                                str = "<\u0019F";
                                obj = 59;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_windowNoTitle /*59*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "G{";
                                obj = 60;
                                i4 = 20;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_windowActionBar /*60*/:
                                strArr[i] = str;
                                i = 1;
                                str = "<\u0019F";
                                obj = 61;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "Gu3";
                                obj = 62;
                                i4 = 21;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                                strArr[i] = str;
                                i = 1;
                                str = ">\u001dG=";
                                obj = 63;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_windowSplitActionBar /*63*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "Gu3";
                                obj = 64;
                                i4 = 22;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                                strArr[i] = str;
                                i = 1;
                                str = ">\u001dQ";
                                obj = 65;
                                strArr = strArr2;
                                break;
                            case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "F|";
                                obj = 66;
                                i4 = 23;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                                strArr[i] = str;
                                i = 1;
                                str = ",=w\u0003k\u000b";
                                obj = 67;
                                strArr = strArr2;
                                break;
                            case 67:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "F|";
                                obj = 68;
                                i4 = 24;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 68:
                                strArr[i] = str;
                                i = 1;
                                str = ",=w\u0003k\u000bm%J%_m";
                                obj = 69;
                                strArr = strArr2;
                                break;
                            case 69:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "F|";
                                obj = 70;
                                i4 = 25;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 70:
                                strArr[i] = str;
                                i = 1;
                                str = ")(w\u0003\u007f\u0010#";
                                obj = 71;
                                strArr = strArr2;
                                break;
                            case 71:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "F|";
                                obj = 72;
                                i4 = 26;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 72:
                                strArr[i] = str;
                                i = 1;
                                str = ")(w\u0003\u007f\u0010#%=l\r(i\u000fv\f";
                                obj = 73;
                                strArr = strArr2;
                                break;
                            case 73:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "F|";
                                obj = 74;
                                i4 = 27;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 74:
                                strArr[i] = str;
                                i = 1;
                                str = "-(i\u0003d\u0011.`J%_m";
                                obj = 75;
                                strArr = strArr2;
                                break;
                            case 75:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "F|";
                                obj = 76;
                                i4 = 28;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 76:
                                strArr[i] = str;
                                i = 1;
                                str = "-\bI#D1\u000e@J%_m";
                                obj = 77;
                                strArr = strArr2;
                                break;
                            case 77:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "F|";
                                obj = 78;
                                i4 = 29;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 78:
                                strArr[i] = str;
                                i = 1;
                                str = "-(i\u0003d\u0011.`";
                                obj = 79;
                                strArr = strArr2;
                                break;
                            case 79:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                b = strArr5;
                                strArr3 = new String[45][];
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L|5Z";
                                obj = 80;
                                strArr4 = strArr3;
                                strArr5 = strArr3;
                                i4 = 0;
                                strArr2 = strArr;
                                break;
                            case 80:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L|5^";
                                obj = 81;
                                i4 = 1;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 81:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L|5Z5";
                                obj = 82;
                                i4 = 2;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 82:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L|5Z1";
                                obj = 83;
                                i4 = 3;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 83:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L|5[7";
                                obj = 84;
                                i4 = 4;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 84:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L|5X=";
                                obj = 85;
                                i4 = 5;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 85:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L|4X6";
                                obj = 86;
                                i4 = 6;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 86:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L|4]7";
                                obj = 87;
                                i4 = 7;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 87:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L|5Z5O";
                                obj = 88;
                                i4 = 8;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 88:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L|5Z5K";
                                obj = 89;
                                i4 = 9;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 89:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L|5Z4M";
                                obj = 90;
                                i4 = 10;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 90:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L|5Z7G";
                                obj = 91;
                                i4 = 11;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 91:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L|5Z6G";
                                obj = 92;
                                i4 = 12;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 92:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L|5[7O";
                                obj = 93;
                                i4 = 13;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 93:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L|5S<J";
                                obj = 94;
                                i4 = 14;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 94:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L~1Z";
                                obj = 95;
                                i4 = 15;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 95:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L~1Z5";
                                obj = 96;
                                i4 = 16;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 96:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "L~1Z5O";
                                obj = 97;
                                i4 = 17;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 97:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "Lu";
                                obj = 98;
                                i4 = 18;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 98:
                                strArr[i] = str;
                                i = 1;
                                str = "Mx0Z1";
                                obj = 99;
                                strArr = strArr2;
                                break;
                            case 99:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "J\u007f";
                                obj = 100;
                                i4 = 19;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 100:
                                strArr[i] = str;
                                i = 1;
                                str = "L|5Z5";
                                obj = 101;
                                strArr = strArr2;
                                break;
                            case 101:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "J\u007f";
                                obj = 102;
                                i4 = 20;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 102:
                                strArr[i] = str;
                                i = 1;
                                str = "L~1Z";
                                obj = 103;
                                strArr = strArr2;
                                break;
                            case 103:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "J\u007f";
                                obj = 104;
                                i4 = 21;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 104:
                                strArr[i] = str;
                                i = 1;
                                str = "L~1Z5";
                                obj = 105;
                                strArr = strArr2;
                                break;
                            case 105:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "J\u007f";
                                obj = 106;
                                i4 = 22;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 106:
                                strArr[i] = str;
                                i = 1;
                                str = "L~1Z5O";
                                obj = 107;
                                strArr = strArr2;
                                break;
                            case 107:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "I\u007f";
                                obj = 108;
                                i4 = 23;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 108:
                                strArr[i] = str;
                                i = 1;
                                str = "L|5[7O";
                                obj = 109;
                                strArr = strArr2;
                                break;
                            case 109:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "I\u007f";
                                obj = 110;
                                i4 = 24;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 110:
                                strArr[i] = str;
                                i = 1;
                                str = "J|5Z5";
                                obj = 111;
                                strArr = strArr2;
                                break;
                            case 111:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "I\u007f";
                                obj = 112;
                                i4 = 25;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 112:
                                strArr[i] = str;
                                i = 1;
                                str = "J|5Z5O";
                                obj = 113;
                                strArr = strArr2;
                                break;
                            case 113:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "I\u007f";
                                obj = 114;
                                i4 = 26;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 114:
                                strArr[i] = str;
                                i = 1;
                                str = "J|5S<";
                                obj = 115;
                                strArr = strArr2;
                                break;
                            case 115:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "I\u007f";
                                obj = 116;
                                i4 = 27;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 116:
                                strArr[i] = str;
                                i = 1;
                                str = "J|5Z<";
                                obj = 117;
                                strArr = strArr2;
                                break;
                            case 117:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "I{";
                                obj = 118;
                                i4 = 28;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 118:
                                strArr[i] = str;
                                i = 1;
                                str = "Kx5Z3";
                                obj = 119;
                                strArr = strArr2;
                                break;
                            case 119:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "G|";
                                obj = 120;
                                i4 = 29;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 120:
                                strArr[i] = str;
                                i = 1;
                                str = "Ky5[7H";
                                obj = 121;
                                strArr = strArr2;
                                break;
                            case 121:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "G\u007f";
                                obj = 122;
                                i4 = 30;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 122:
                                strArr[i] = str;
                                i = 1;
                                str = "Kx5Z";
                                obj = 123;
                                strArr = strArr2;
                                break;
                            case 123:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "G\u007f";
                                obj = 124;
                                i4 = 31;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 124:
                                strArr[i] = str;
                                i = 1;
                                str = "Kx5\\";
                                obj = 125;
                                strArr = strArr2;
                                break;
                            case 125:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "G\u007f";
                                obj = 126;
                                i4 = 32;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 126:
                                strArr[i] = str;
                                i = 1;
                                str = "Kx5Z5";
                                obj = 127;
                                strArr = strArr2;
                                break;
                            case 127:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "G\u007f";
                                obj = 128;
                                i4 = 33;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 128:
                                strArr[i] = str;
                                i = 1;
                                str = "Kx5Z3";
                                obj = 129;
                                strArr = strArr2;
                                break;
                            case 129:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "G\u007f";
                                obj = 130;
                                i4 = 34;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 130:
                                strArr[i] = str;
                                i = 1;
                                str = "Kx5Z5O";
                                obj = 131;
                                strArr = strArr2;
                                break;
                            case 131:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "G\u007f";
                                obj = 132;
                                i4 = 35;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 132:
                                strArr[i] = str;
                                i = 1;
                                str = "Kx5Z5I";
                                obj = 133;
                                strArr = strArr2;
                                break;
                            case 133:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "Gx5";
                                obj = 134;
                                i4 = 36;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 134:
                                strArr[i] = str;
                                i = 1;
                                str = "Kx5Z5";
                                obj = 135;
                                strArr = strArr2;
                                break;
                            case 135:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "G{";
                                obj = 136;
                                i4 = 37;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 136:
                                strArr[i] = str;
                                i = 1;
                                str = "K{5Z5L";
                                obj = 137;
                                strArr = strArr2;
                                break;
                            case 137:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "G{";
                                obj = 138;
                                i4 = 38;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 138:
                                strArr[i] = str;
                                i = 1;
                                str = "K{5Z6";
                                obj = 139;
                                strArr = strArr2;
                                break;
                            case 139:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "Gu3";
                                obj = 140;
                                i4 = 39;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 140:
                                strArr[i] = str;
                                i = 1;
                                str = "K{3Z0";
                                obj = 141;
                                strArr = strArr2;
                                break;
                            case 141:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "F|";
                                obj = 142;
                                i4 = 40;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 142:
                                strArr[i] = str;
                                i = 1;
                                str = "K}1Z";
                                obj = 143;
                                strArr = strArr2;
                                break;
                            case 143:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "F|";
                                obj = 144;
                                i4 = 41;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 144:
                                strArr[i] = str;
                                i = 1;
                                str = "K}1Z5";
                                obj = 145;
                                strArr = strArr2;
                                break;
                            case 145:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "F|";
                                obj = 146;
                                i4 = 42;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 146:
                                strArr[i] = str;
                                i = 1;
                                str = "K}1Z5O";
                                obj = 147;
                                strArr = strArr2;
                                break;
                            case 147:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "F|";
                                obj = 148;
                                i4 = 43;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 148:
                                strArr[i] = str;
                                i = 1;
                                str = "L|5[7O";
                                obj = 149;
                                strArr = strArr2;
                                break;
                            case 149:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "F|";
                                obj = 150;
                                i4 = 44;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 150:
                                strArr[i] = str;
                                i = 1;
                                str = "N}7Y4Mz";
                                obj = 151;
                                strArr = strArr2;
                                break;
                            case 151:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                e = strArr5;
                            default:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = ")(w\u0003\u007f\u0010#";
                                obj = null;
                                i4 = 1;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                        }
                    }
                default:
                    strArr[i] = str;
                    i = 1;
                    str = "\u001c\"p\u0004q\r$`\u0019*\u0013\"d\u000e*\u001d,aGi\u0016#`P%";
                    obj = null;
                    strArr = strArr2;
                    break;
            }
        }
    }

    static int[] h(String str) {
        return g(str);
    }

    public static String c(String str) {
        int i = App.az;
        b();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            vt vtVar = (vt) it.next();
            try {
                if (!("" + vtVar.c).equals(str)) {
                    if (i != 0) {
                        break;
                    }
                }
                return vtVar.f;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return "";
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b() {
        /*
        r7 = 1;
        r2 = com.whatsapp.App.az;
        r0 = f;	 Catch:{ UnsupportedEncodingException -> 0x0008 }
        if (r0 == 0) goto L_0x000a;
    L_0x0007:
        return;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        r0 = new java.util.ArrayList;
        r0.<init>();
        a = r0;
        r0 = com.whatsapp.App.p;
        r0 = r0.getResources();
        r1 = 2131099648; // 0x7f060000 float:1.7811655E38 double:1.052903124E-314;
        r1 = r0.openRawResource(r1);
        if (r1 != 0) goto L_0x002c;
    L_0x001f:
        r0 = new java.io.IOException;	 Catch:{ UnsupportedEncodingException -> 0x002a }
        r1 = z;	 Catch:{ UnsupportedEncodingException -> 0x002a }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ UnsupportedEncodingException -> 0x002a }
        r0.<init>(r1);	 Catch:{ UnsupportedEncodingException -> 0x002a }
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r0 = new java.io.BufferedReader;	 Catch:{ UnsupportedEncodingException -> 0x0071 }
        r3 = new java.io.InputStreamReader;	 Catch:{ UnsupportedEncodingException -> 0x0071 }
        r4 = z;	 Catch:{ UnsupportedEncodingException -> 0x0071 }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ UnsupportedEncodingException -> 0x0071 }
        r3.<init>(r1, r4);	 Catch:{ UnsupportedEncodingException -> 0x0071 }
        r0.<init>(r3);	 Catch:{ UnsupportedEncodingException -> 0x0071 }
    L_0x003b:
        r3 = r0.readLine();
        if (r3 == 0) goto L_0x00a2;
    L_0x0041:
        r1 = "\t";
        r1 = android.text.TextUtils.split(r3, r1);	 Catch:{ NumberFormatException -> 0x0056, IllegalArgumentException -> 0x0087 }
        if (r1 == 0) goto L_0x004e;
    L_0x0049:
        r4 = r1.length;	 Catch:{ UnsupportedEncodingException -> 0x0085 }
        r5 = 12;
        if (r4 >= r5) goto L_0x00a6;
    L_0x004e:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ UnsupportedEncodingException -> 0x0054 }
        r1.<init>();	 Catch:{ UnsupportedEncodingException -> 0x0054 }
        throw r1;	 Catch:{ UnsupportedEncodingException -> 0x0054 }
    L_0x0054:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0056, IllegalArgumentException -> 0x0087 }
    L_0x0056:
        r1 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = z;
        r5 = 3;
        r4 = r4[r5];
        r1 = r1.append(r4);
        r1 = r1.append(r3);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x003b;
    L_0x0071:
        r0 = move-exception;
        r0 = z;
        r3 = 2;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        r0 = new java.io.BufferedReader;
        r3 = new java.io.InputStreamReader;
        r3.<init>(r1);
        r0.<init>(r3);
        goto L_0x003b;
    L_0x0085:
        r1 = move-exception;
        throw r1;	 Catch:{ UnsupportedEncodingException -> 0x0054 }
    L_0x0087:
        r1 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = z;
        r4 = r4[r7];
        r1 = r1.append(r4);
        r1 = r1.append(r3);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        if (r2 == 0) goto L_0x003b;
    L_0x00a2:
        f = r7;
        goto L_0x0007;
    L_0x00a6:
        r4 = a;	 Catch:{ NumberFormatException -> 0x0056, IllegalArgumentException -> 0x0087 }
        r5 = new com.whatsapp.vt;	 Catch:{ NumberFormatException -> 0x0056, IllegalArgumentException -> 0x0087 }
        r6 = 0;
        r5.<init>(r1, r6);	 Catch:{ NumberFormatException -> 0x0056, IllegalArgumentException -> 0x0087 }
        r4.add(r5);	 Catch:{ NumberFormatException -> 0x0056, IllegalArgumentException -> 0x0087 }
        goto L_0x003b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ats.b():void");
    }

    public static boolean a(String str, NetworkInfo networkInfo) {
        int i = App.az;
        if (str == null || networkInfo == null) {
            return false;
        }
        String extraInfo = networkInfo.getExtraInfo();
        if (extraInfo == null) {
            return false;
        }
        int i2 = 0;
        while (i2 < d.length) {
            try {
                if (str.equals(d[i2][0])) {
                    if (extraInfo.equals(d[i2][1])) {
                        return true;
                    }
                }
                i2++;
                if (i != 0) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        return false;
    }

    public static String a(int i, String str) {
        int i2 = App.az;
        b();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            vt vtVar = (vt) it.next();
            try {
                if (vtVar.c != i) {
                    if (i2 != 0) {
                        break;
                    }
                }
                str = vtVar.a(str);
                break;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String e(java.lang.String r7) {
        /*
        r2 = 0;
        r3 = com.whatsapp.App.az;
        b();	 Catch:{ IllegalArgumentException -> 0x000a }
        if (r7 != 0) goto L_0x000c;
    L_0x0008:
        r0 = r2;
    L_0x0009:
        return r0;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r0 = r7.length();
        switch(r0) {
            case 2: goto L_0x0015;
            case 3: goto L_0x0042;
            default: goto L_0x0013;
        };
    L_0x0013:
        r0 = r2;
        goto L_0x0009;
    L_0x0015:
        r0 = java.util.Locale.US;
        r1 = r7.toUpperCase(r0);
        r0 = a;
        r4 = r0.iterator();
    L_0x0021:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0040;
    L_0x0027:
        r0 = r4.next();
        r0 = (com.whatsapp.vt) r0;
        r5 = r0.f;	 Catch:{ IllegalArgumentException -> 0x003c }
        r5 = r5.equals(r1);	 Catch:{ IllegalArgumentException -> 0x003c }
        if (r5 == 0) goto L_0x003e;
    L_0x0035:
        r0 = r0.c;	 Catch:{ IllegalArgumentException -> 0x003c }
        r0 = java.lang.Integer.toString(r0);	 Catch:{ IllegalArgumentException -> 0x003c }
        goto L_0x0009;
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        if (r3 == 0) goto L_0x0021;
    L_0x0040:
        if (r3 == 0) goto L_0x0013;
    L_0x0042:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x004f }
        r1 = 5;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x004f }
        r0 = r7.equals(r0);	 Catch:{ IllegalArgumentException -> 0x004f }
        if (r0 == 0) goto L_0x0051;
    L_0x004d:
        r0 = r2;
        goto L_0x0009;
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        r0 = a;
        r4 = r0.iterator();
    L_0x0057:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0013;
    L_0x005d:
        r0 = r4.next();
        r0 = (com.whatsapp.vt) r0;
        r1 = 0;
    L_0x0064:
        r5 = r0.l;
        r5 = r5.length;
        if (r1 >= r5) goto L_0x0094;
    L_0x0069:
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x008e }
        r5.<init>();	 Catch:{ IllegalArgumentException -> 0x008e }
        r6 = r0.l;	 Catch:{ IllegalArgumentException -> 0x008e }
        r6 = r6[r1];	 Catch:{ IllegalArgumentException -> 0x008e }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x008e }
        r6 = "";
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x008e }
        r5 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x008e }
        r5 = r7.equals(r5);	 Catch:{ IllegalArgumentException -> 0x008e }
        if (r5 == 0) goto L_0x0090;
    L_0x0086:
        r0 = r0.c;	 Catch:{ IllegalArgumentException -> 0x008e }
        r0 = java.lang.Integer.toString(r0);	 Catch:{ IllegalArgumentException -> 0x008e }
        goto L_0x0009;
    L_0x008e:
        r0 = move-exception;
        throw r0;
    L_0x0090:
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x0064;
    L_0x0094:
        if (r3 == 0) goto L_0x0057;
    L_0x0096:
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ats.e(java.lang.String):java.lang.String");
    }

    public static int a(int i, int i2) {
        int i3 = App.az;
        b();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            vt vtVar = (vt) it.next();
            try {
                if (vtVar.c != i) {
                    if (i3 != 0) {
                        break;
                    }
                }
                return vtVar.a(i2);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return 0;
    }

    public static String f(String str) {
        int i = App.az;
        b();
        Iterator it = a.iterator();
        String str2 = null;
        while (it.hasNext()) {
            vt vtVar = (vt) it.next();
            try {
                String str3;
                if (Integer.toString(vtVar.c).equals(str)) {
                    if (vtVar.g) {
                        str2 = vtVar.b;
                        if (i == 0) {
                            break;
                        }
                    }
                    if (str2 == null) {
                        str3 = vtVar.b;
                        if (i != 0) {
                            return str3;
                        }
                        str2 = str3;
                    }
                }
                str3 = str2;
                if (i != 0) {
                    return str3;
                }
                str2 = str3;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return str2;
    }
}
