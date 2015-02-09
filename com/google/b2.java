package com.google;

import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class b2 {
    private static final Object[][] a;
    private static final Object[][] b;
    private static final Object[][] c;
    private static final Object d;
    private static final Object[][] e;

    static {
        d = new Object();
        Object[][] objArr = new Object[24][];
        Object[] objArr2 = new Object[2];
        String str = "wB";
        int i = -1;
        int i2 = 0;
        Object[][] objArr3 = objArr;
        Object[][] objArr4 = objArr;
        Object[] objArr5 = objArr2;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 71;
                        break;
                    case ay.f /*1*/:
                        i4 = 114;
                        break;
                    case ay.n /*2*/:
                        i4 = 15;
                        break;
                    case ay.p /*3*/:
                        i4 = 53;
                        break;
                    default:
                        i4 = 33;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            Object[] objArr6;
            switch (i) {
                case PBE.MD5 /*0*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(14);
                    objArr3[i2] = objArr5;
                    objArr6 = new Object[2];
                    objArr2 = objArr6;
                    objArr5 = objArr6;
                    i2 = 2;
                    objArr3 = objArr4;
                    str = "w@";
                    i = 1;
                    break;
                case ay.f /*1*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(14);
                    objArr3[i2] = objArr5;
                    objArr6 = new Object[3];
                    objArr2 = objArr6;
                    objArr5 = objArr6;
                    i2 = 3;
                    objArr3 = objArr4;
                    str = "vB";
                    i = 2;
                    break;
                case ay.n /*2*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(20);
                    objArr3[i2] = objArr5;
                    objArr6 = new Object[2];
                    objArr5 = objArr6;
                    i2 = 4;
                    objArr3 = objArr4;
                    objArr2 = objArr6;
                    str = "vC";
                    i = 3;
                    break;
                case ay.p /*3*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "v@";
                    i = 4;
                    i2 = 5;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case aj.i /*4*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "vA";
                    i = 5;
                    objArr5 = objArr2;
                    i2 = 6;
                    objArr3 = objArr4;
                    break;
                case aV.r /*5*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr6 = new Object[2];
                    objArr5 = objArr6;
                    i2 = 7;
                    objArr3 = objArr4;
                    objArr2 = objArr6;
                    str = "vG";
                    i = 6;
                    break;
                case aV.i /*6*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "vE";
                    i = 7;
                    i2 = 8;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case a8.s /*7*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "uB";
                    i = 8;
                    i2 = 9;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case a8.n /*8*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(2);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "uC";
                    i = 9;
                    i2 = 10;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case a6.D /*9*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(20);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "u@";
                    i = 10;
                    i2 = 11;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case a6.h /*10*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(29);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "tB";
                    i = 11;
                    i2 = 12;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case a6.e /*11*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(8);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "tE";
                    i = 12;
                    i2 = 13;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case a6.s /*12*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(8);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "~B";
                    i = 13;
                    i2 = 14;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case a6.z /*13*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "~C";
                    i = 14;
                    i2 = 15;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "~@";
                    i = 15;
                    i2 = 16;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "~A";
                    i = 16;
                    i2 = 17;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "~F";
                    i = 17;
                    i2 = 18;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "~G";
                    i = 18;
                    i2 = 19;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "~D";
                    i = 19;
                    i2 = 20;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "~E";
                    i = 20;
                    i2 = 21;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "~J";
                    i = 21;
                    i2 = 22;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "~K";
                    i = 22;
                    i2 = 23;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    b = objArr4;
                    objArr = new Object[23][];
                    objArr2 = new Object[3];
                    str = "uF?";
                    i = 23;
                    i2 = 0;
                    objArr3 = objArr;
                    objArr4 = objArr;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "uF>";
                    i = 24;
                    objArr5 = objArr2;
                    i2 = 1;
                    objArr3 = objArr4;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "uF=";
                    i = 25;
                    objArr5 = objArr2;
                    i2 = 2;
                    objArr3 = objArr4;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "uG?";
                    i = 26;
                    objArr5 = objArr2;
                    i2 = 3;
                    objArr3 = objArr4;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "uG>";
                    i = 27;
                    i2 = 4;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "uG<";
                    i = 28;
                    i2 = 5;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(17);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "uG;";
                    i = 29;
                    objArr5 = objArr2;
                    i2 = 6;
                    objArr3 = objArr4;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(20);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "sB?";
                    i = 30;
                    i2 = 7;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "sB>";
                    i = 31;
                    i2 = 8;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "sB=";
                    i = 32;
                    i2 = 9;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(17);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "sB<";
                    i = 33;
                    i2 = 10;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "sC?";
                    i = 34;
                    i2 = 11;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(13);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "sC>";
                    i = 35;
                    i2 = 12;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(13);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "sC=";
                    i = 36;
                    i2 = 13;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(13);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "sC<";
                    i = 37;
                    i2 = 14;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(13);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "sC;";
                    i = 38;
                    i2 = 15;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(13);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "s@?";
                    i = 39;
                    i2 = 16;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(20);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "s@>";
                    i = 40;
                    i2 = 17;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(15);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "s@=";
                    i = 41;
                    i2 = 18;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(3);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "s@<";
                    i = 42;
                    i2 = 19;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(15);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "s@;";
                    i = 43;
                    i2 = 20;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(3);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "s@:";
                    i = 44;
                    i2 = 21;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(3);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "s@9";
                    i = 45;
                    i2 = 22;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(3);
                    objArr3[i2] = objArr5;
                    e = objArr4;
                    objArr = new Object[57][];
                    objArr2 = new Object[2];
                    str = "tC?";
                    i = 46;
                    i2 = 0;
                    objArr3 = objArr;
                    objArr4 = objArr;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tC>";
                    i = 47;
                    objArr5 = objArr2;
                    i2 = 1;
                    objArr3 = objArr4;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tC=";
                    i = 48;
                    objArr5 = objArr2;
                    i2 = 2;
                    objArr3 = objArr4;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tC<";
                    i = 49;
                    objArr5 = objArr2;
                    i2 = 3;
                    objArr3 = objArr4;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tC;";
                    i = 50;
                    i2 = 4;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tC:";
                    i = 51;
                    i2 = 5;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tC9";
                    i = 52;
                    objArr5 = objArr2;
                    i2 = 6;
                    objArr3 = objArr4;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "t@?";
                    i = 53;
                    i2 = 7;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "t@>";
                    i = 54;
                    i2 = 8;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "t@=";
                    i = 55;
                    i2 = 9;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "t@<";
                    i = 56;
                    i2 = 10;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "t@;";
                    i = 57;
                    i2 = 11;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "t@:";
                    i = 58;
                    i2 = 12;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "t@9";
                    i = 59;
                    i2 = 13;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "t@8";
                    i = 60;
                    i2 = 14;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "t@7";
                    i = 61;
                    i2 = 15;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "t@6";
                    i = 62;
                    i2 = 16;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tA?";
                    i = 63;
                    i2 = 17;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tA>";
                    i = 64;
                    i2 = 18;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tA=";
                    i = 65;
                    i2 = 19;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tA<";
                    i = 66;
                    i2 = 20;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tA;";
                    i = 67;
                    i2 = 21;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 67:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tA:";
                    i = 68;
                    i2 = 22;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 68:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tA9";
                    i = 69;
                    i2 = 23;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 69:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tF?";
                    i = 70;
                    i2 = 24;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 70:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tF>";
                    i = 71;
                    i2 = 25;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 71:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tF=";
                    i = 72;
                    i2 = 26;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 72:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tF<";
                    i = 73;
                    i2 = 27;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 73:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tF;";
                    i = 74;
                    i2 = 28;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 74:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tF:";
                    i = 75;
                    i2 = 29;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 75:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tF9";
                    i = 76;
                    i2 = 30;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 76:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tF8";
                    i = 77;
                    i2 = 31;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 77:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tF7";
                    i = 78;
                    i2 = 32;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 78:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tF6";
                    i = 79;
                    i2 = 33;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 79:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tG?";
                    i = 80;
                    i2 = 34;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 80:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tG>";
                    i = 81;
                    i2 = 35;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 81:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tG=";
                    i = 82;
                    i2 = 36;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 82:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tG<";
                    i = 83;
                    i2 = 37;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 83:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tG;";
                    i = 84;
                    i2 = 38;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 84:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tG:";
                    i = 85;
                    i2 = 39;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 85:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tG9";
                    i = 86;
                    i2 = 40;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 86:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tG8";
                    i = 87;
                    i2 = 41;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 87:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tD?";
                    i = 88;
                    i2 = 42;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 88:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tD>";
                    i = 89;
                    i2 = 43;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 89:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tD=";
                    i = 90;
                    i2 = 44;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 90:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tD<";
                    i = 91;
                    i2 = 45;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 91:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tD;";
                    i = 92;
                    i2 = 46;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 92:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tD:";
                    i = 93;
                    i2 = 47;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 93:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tD9";
                    i = 94;
                    i2 = 48;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 94:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tD8";
                    i = 95;
                    i2 = 49;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 95:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tD7";
                    i = 96;
                    i2 = 50;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 96:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "tD6";
                    i = 97;
                    i2 = 51;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 97:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "tK?";
                    i = 98;
                    i2 = 52;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 98:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(15);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "tK>";
                    i = 99;
                    i2 = 53;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 99:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(18);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "tK=";
                    i = 100;
                    i2 = 54;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 100:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(15);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "tK<";
                    i = 101;
                    i2 = 55;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 101:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(18);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "pB<";
                    i = 102;
                    i2 = 56;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 102:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    c = objArr4;
                    objArr = new Object[18][];
                    objArr2 = new Object[2];
                    str = "pB?\u0004";
                    i = 103;
                    i2 = 0;
                    objArr3 = objArr;
                    objArr4 = objArr;
                    objArr5 = objArr2;
                    break;
                case 103:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(13);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "pB?\u0007";
                    i = 104;
                    objArr5 = objArr2;
                    i2 = 1;
                    objArr3 = objArr4;
                    break;
                case 104:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "pB?\u0006";
                    i = 105;
                    objArr5 = objArr2;
                    i2 = 2;
                    objArr3 = objArr4;
                    break;
                case 105:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(10);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "\u007fB?\u0004";
                    i = 106;
                    objArr5 = objArr2;
                    i2 = 3;
                    objArr3 = objArr4;
                    break;
                case 106:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(14);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "\u007fB?\u0007";
                    i = 107;
                    i2 = 4;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 107:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(20);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "\u007fB?\u0006";
                    i = 108;
                    i2 = 5;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 108:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "\u007fB?\u0001";
                    i = 109;
                    objArr5 = objArr2;
                    i2 = 6;
                    objArr3 = objArr4;
                    break;
                case 109:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "\u007fB?\u0000";
                    i = 110;
                    i2 = 7;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 110:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "\u007fB?\u0003";
                    i = 111;
                    i2 = 8;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 111:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(18);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "\u007fB?\u0002";
                    i = 112;
                    i2 = 9;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 112:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(30);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "\u007fB?\r";
                    i = 113;
                    i2 = 10;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 113:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(12);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "\u007fB>\r";
                    i = 114;
                    i2 = 11;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 114:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(18);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "\u007fB=\u0005";
                    i = 115;
                    i2 = 12;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 115:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(25);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "\u007fC?\u0005";
                    i = 116;
                    i2 = 13;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 116:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(6);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "\u007fC?\u0004";
                    i = 117;
                    i2 = 14;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 117:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(10);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[2];
                    str = "\u007fC?\u0007";
                    i = 118;
                    i2 = 15;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 118:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(2);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "\u007fC>\u0005";
                    i = 119;
                    i2 = 16;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 119:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(70);
                    objArr3[i2] = objArr5;
                    objArr2 = new Object[3];
                    str = "\u007f@?\u0005";
                    i = 120;
                    i2 = 17;
                    objArr3 = objArr4;
                    objArr5 = objArr2;
                    break;
                case 120:
                    objArr2[0] = str;
                    objArr5[1] = d;
                    objArr5[2] = Integer.valueOf(70);
                    objArr3[i2] = objArr5;
                    a = objArr4;
                default:
                    objArr2[0] = str;
                    objArr5[1] = Integer.valueOf(18);
                    objArr3[i2] = objArr5;
                    objArr6 = new Object[2];
                    objArr2 = objArr6;
                    objArr5 = objArr6;
                    i2 = 1;
                    objArr3 = objArr4;
                    str = "wC";
                    i = 0;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(int r5, int r6, java.lang.String r7) {
        /*
        r0 = 0;
        r1 = r7.substring(r0, r5);
        r0 = r7.length();
        r2 = r5 + r6;
        if (r0 >= r2) goto L_0x0015;
    L_0x000d:
        r0 = r7.length();
        r2 = com.google.f4.a;
        if (r2 == 0) goto L_0x0017;
    L_0x0015:
        r0 = r5 + r6;
    L_0x0017:
        r2 = r7.substring(r5, r0);
        r3 = r7.substring(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = 40;
        r0 = r0.append(r4);
        r0 = r0.append(r1);
        r1 = 41;
        r0 = r0.append(r1);
        r0 = r0.append(r2);
        r0 = r0.toString();
        r1 = a(r3);
        if (r1 != 0) goto L_0x0043;
    L_0x0042:
        return r0;
    L_0x0043:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r2.append(r0);
        r0 = r0.append(r1);
        r0 = r0.toString();
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b2.a(int, int, java.lang.String):java.lang.String");
    }

    private static String b(int i, int i2, String str) {
        if (str.length() < i) {
            throw gv.a();
        }
        String substring = str.substring(0, i);
        if (str.length() < i + i2) {
            throw gv.a();
        }
        String substring2 = str.substring(i, i + i2);
        String substring3 = str.substring(i + i2);
        substring = '(' + substring + ')' + substring2;
        substring2 = a(substring3);
        return substring2 == null ? substring : substring + substring2;
    }

    static String a(String str) {
        int i = f4.a;
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw gv.a();
        }
        String substring = str.substring(0, 2);
        Object[][] objArr = b;
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object[] objArr2 = objArr[i2];
            if (!objArr2[0].equals(substring)) {
                i2++;
                if (i != 0) {
                    break;
                }
            }
            return objArr2[1] == d ? a(2, ((Integer) objArr2[2]).intValue(), str) : b(2, ((Integer) objArr2[1]).intValue(), str);
        }
        if (str.length() < 3) {
            throw gv.a();
        }
        substring = str.substring(0, 3);
        objArr = e;
        length = objArr.length;
        i2 = 0;
        while (i2 < length) {
            objArr2 = objArr[i2];
            if (!objArr2[0].equals(substring)) {
                i2++;
                if (i != 0) {
                    break;
                }
            }
            return objArr2[1] == d ? a(3, ((Integer) objArr2[2]).intValue(), str) : b(3, ((Integer) objArr2[1]).intValue(), str);
        }
        objArr = c;
        length = objArr.length;
        i2 = 0;
        while (i2 < length) {
            objArr2 = objArr[i2];
            if (!objArr2[0].equals(substring)) {
                i2++;
                if (i != 0) {
                    break;
                }
            }
            return objArr2[1] == d ? a(4, ((Integer) objArr2[2]).intValue(), str) : b(4, ((Integer) objArr2[1]).intValue(), str);
        }
        if (str.length() < 4) {
            throw gv.a();
        }
        substring = str.substring(0, 4);
        objArr = a;
        length = objArr.length;
        i2 = 0;
        while (i2 < length) {
            objArr2 = objArr[i2];
            if (!objArr2[0].equals(substring)) {
                i2++;
                if (i != 0) {
                    break;
                }
            }
            return objArr2[1] == d ? a(4, ((Integer) objArr2[2]).intValue(), str) : b(4, ((Integer) objArr2[1]).intValue(), str);
        }
        throw gv.a();
    }
}
