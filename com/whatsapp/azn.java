package com.whatsapp;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public abstract class azn {
    public static boolean a;
    private static Map b;
    private static final String[] z;

    abstract int c(int i);

    public static void a(String[] strArr, azn com_whatsapp_azn) {
        for (Object obj : strArr) {
            b.put(obj, com_whatsapp_azn);
        }
    }

    static final String a(int i) {
        switch (i) {
            case ay.f /*1*/:
                return z[5];
            case ay.n /*2*/:
                return z[1];
            case aj.i /*4*/:
                return z[0];
            case a8.n /*8*/:
                return z[3];
            case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                return z[4];
            default:
                return z[2];
        }
    }

    static final azn a(Locale locale) {
        return (azn) b.get(locale.getLanguage());
    }

    static {
        String[] strArr = new String[6];
        String str = "2'@";
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
                        i4 = 70;
                        break;
                    case ay.f /*1*/:
                        i4 = 80;
                        break;
                    case ay.n /*2*/:
                        i4 = 47;
                        break;
                    case ay.p /*3*/:
                        i4 = 41;
                        break;
                    default:
                        i4 = 122;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = ")$GL\b";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = " 5X";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "+1AP";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "<5]F";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    b = new HashMap();
                    strArr = new String[54];
                    str = "$5B";
                    i = 5;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    str = "$\"W";
                    i = 6;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    str = "\"1";
                    i = 7;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    str = "\"5";
                    i = 8;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    str = "#<";
                    i = 9;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "#>";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "#?";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "##";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "#$";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = " 9";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = " ?";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "!<";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = ".5";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "/'";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "/$";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "(2";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "(<";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "(>";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "(?";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "5&";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "'6";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "$7";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "$>";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "%1";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "#%";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = " %]";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = " )";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "!%";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = ".1";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "/#";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "-%";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "*2";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "+<";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "+\"";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "(1G";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "(5";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = ")=";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = ")\"";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "61";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "61_";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "6#";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "5?";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "5!";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "5'";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "21";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "25";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "2;";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "3\"";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "<%";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "+>";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "!#X";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "%8]";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "4=";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "6$";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i2] = str;
                    a(strArr3, new azw());
                    strArr = new String[2];
                    str = "%#";
                    i = 59;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i2] = str;
                    str = "5;";
                    i = 60;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i2] = str;
                    a(strArr3, new azz());
                    strArr = new String[3];
                    str = " 6";
                    i = 61;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i2] = str;
                    str = " \"";
                    i = 62;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i2] = str;
                    str = "-1M";
                    i = 63;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i2] = str;
                    a(strArr3, new azq());
                    strArr = new String[7];
                    str = ".\"";
                    i = 64;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i2] = str;
                    str = "4%";
                    i = 65;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i2] = str;
                    str = "5\"";
                    i = 66;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i2] = str;
                    str = "3;";
                    i = 67;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i2] = str;
                    str = "$5";
                    i = 68;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "$#";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "58";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i2] = str;
                    a(strArr3, new az_());
                    strArr = new String[1];
                    str = "*&";
                    i = 71;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 71:
                    strArr2[i2] = str;
                    a(strArr3, new azr());
                    strArr = new String[1];
                    str = "*$";
                    i = 72;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 72:
                    strArr2[i2] = str;
                    a(strArr3, new azg());
                    strArr = new String[1];
                    str = "6<";
                    i = 73;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 73:
                    strArr2[i2] = str;
                    a(strArr3, new azd());
                    strArr = new String[2];
                    str = "4?";
                    i = 74;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 74:
                    strArr2[i2] = str;
                    str = "+?";
                    i = 75;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case 75:
                    strArr2[i2] = str;
                    a(strArr3, new azy());
                    strArr = new String[1];
                    str = "5<";
                    i = 76;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 76:
                    strArr2[i2] = str;
                    a(strArr3, new aza());
                    strArr = new String[1];
                    str = "'\"";
                    i = 77;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 77:
                    strArr2[i2] = str;
                    a(strArr3, new azf());
                    strArr = new String[1];
                    str = "+;";
                    i = 78;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 78:
                    strArr2[i2] = str;
                    a(strArr3, new az0());
                    strArr = new String[1];
                    str = "%)";
                    i = 79;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 79:
                    strArr2[i2] = str;
                    a(strArr3, new azo());
                    strArr = new String[1];
                    str = "$\"";
                    i = 80;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 80:
                    strArr2[i2] = str;
                    a(strArr3, new az1());
                    strArr = new String[1];
                    str = "*1H";
                    i = 81;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 81:
                    strArr2[i2] = str;
                    a(strArr3, new az6());
                    strArr = new String[1];
                    str = "58F";
                    i = 82;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 82:
                    strArr2[i2] = str;
                    a(strArr3, new azp());
                    strArr = new String[1];
                    str = "+$";
                    i = 83;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 83:
                    strArr2[i2] = str;
                    a(strArr3, new azu());
                    strArr = new String[7];
                    str = "!1";
                    i = 84;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 84:
                    strArr2[i2] = str;
                    str = "55";
                    i = 85;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case 85:
                    strArr2[i2] = str;
                    str = "5=N";
                    i = 86;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case 86:
                    strArr2[i2] = str;
                    str = "5=F";
                    i = 87;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case 87:
                    strArr2[i2] = str;
                    str = "5=E";
                    i = 88;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case 88:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "5=A";
                    i = 89;
                    strArr2 = strArr3;
                    break;
                case 89:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "5=\\";
                    i = 90;
                    strArr2 = strArr3;
                    break;
                case 90:
                    strArr2[i2] = str;
                    a(strArr3, new aze());
                    strArr = new String[12];
                    str = "';";
                    i = 91;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 91:
                    strArr2[i2] = str;
                    str = "'=";
                    i = 92;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case 92:
                    strArr2[i2] = str;
                    str = "$8";
                    i = 93;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case 93:
                    strArr2[i2] = str;
                    str = " 9C";
                    i = 94;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case 94:
                    strArr2[i2] = str;
                    str = "2<";
                    i = 95;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case 95:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "!%X";
                    i = 96;
                    strArr2 = strArr3;
                    break;
                case 96:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = ".9";
                    i = 97;
                    strArr2 = strArr3;
                    break;
                case 97:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "*>";
                    i = 98;
                    strArr2 = strArr3;
                    break;
                case 98:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "+7";
                    i = 99;
                    strArr2 = strArr3;
                    break;
                case 99:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "(#@";
                    i = 100;
                    strArr2 = strArr3;
                    break;
                case 100:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "29";
                    i = 101;
                    strArr2 = strArr3;
                    break;
                case 101:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "11";
                    i = 102;
                    strArr2 = strArr3;
                    break;
                case 102:
                    strArr2[i2] = str;
                    a(strArr3, new az9());
                    strArr = new String[27];
                    str = "'*";
                    i = 103;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 103:
                    strArr2[i2] = str;
                    str = "$=";
                    i = 104;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case 104:
                    strArr2[i2] = str;
                    str = " 1";
                    i = 105;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case 105:
                    strArr2[i2] = str;
                    str = "/7";
                    i = 106;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case 106:
                    strArr2[i2] = str;
                    str = ".%";
                    i = 107;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case 107:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = ",1";
                    i = 108;
                    strArr2 = strArr3;
                    break;
                case 108:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "-4J";
                    i = 109;
                    strArr2 = strArr3;
                    break;
                case 109:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "-5N";
                    i = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "-?";
                    i = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "+)";
                    i = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "55\\";
                    i = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "57";
                    i = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "2?";
                    i = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "2\"";
                    i = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "09";
                    i = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "1?";
                    i = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "??";
                    i = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "<8";
                    i = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "$?";
                    i = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "\"*";
                    i = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "/4";
                    i = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = ",&";
                    i = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "-1";
                    i = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "-=";
                    i = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "->";
                    i = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "+#";
                    i = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "28";
                    i = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i2] = str;
                    a(strArr3, new az7());
                default:
                    strArr2[i2] = str;
                    str = ")>J";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    static final int b(int i) {
        switch (i) {
            case ay.f /*1*/:
                return 16777221;
            case ay.n /*2*/:
                return 16777222;
            case aj.i /*4*/:
                return 16777223;
            case a8.n /*8*/:
                return 16777224;
            case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                return 16777225;
            default:
                return 16777220;
        }
    }
}
