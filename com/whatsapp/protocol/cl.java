package com.whatsapp.protocol;

import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public interface cl {
    public static final String[] a;

    static {
        String[] strArr = new String[106];
        strArr[0] = null;
        strArr[1] = null;
        strArr[2] = null;
        int i = 3;
        String str = "OQ\\";
        int i2 = -1;
        String[] strArr2 = strArr;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 125;
                        break;
                    case ay.f /*1*/:
                        i4 = 97;
                        break;
                    case ay.n /*2*/:
                        i4 = 108;
                        break;
                    case ay.p /*3*/:
                        i4 = 91;
                        break;
                    default:
                        i4 = 50;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case PBE.MD5 /*0*/:
                    strArr[i] = str;
                    i = 5;
                    str = "IQX";
                    i2 = 1;
                    strArr = strArr2;
                    break;
                case ay.f /*1*/:
                    strArr[i] = str;
                    i = 6;
                    str = "HQ\\";
                    i2 = 2;
                    strArr = strArr2;
                    break;
                case ay.n /*2*/:
                    strArr[i] = str;
                    i = 7;
                    str = "HQ]";
                    i2 = 3;
                    strArr = strArr2;
                    break;
                case ay.p /*3*/:
                    strArr[i] = str;
                    i = 8;
                    str = "HQ^";
                    i2 = 4;
                    strArr = strArr2;
                    break;
                case aj.i /*4*/:
                    strArr[i] = str;
                    i = 9;
                    str = "\u001c\u0002\u00182]\u0013";
                    i2 = 5;
                    strArr = strArr2;
                    break;
                case aV.r /*5*/:
                    strArr[i] = str;
                    i = 10;
                    str = "\u001c\u0005\b";
                    i2 = 6;
                    strArr = strArr2;
                    break;
                case aV.i /*6*/:
                    strArr[i] = str;
                    i = 11;
                    str = "\u001c\u0007\u0018>@";
                    i2 = 7;
                    strArr = strArr2;
                    break;
                case a8.s /*7*/:
                    strArr[i] = str;
                    i = 12;
                    str = "\u001c\u0013\u000f3[\u000b\u0004";
                    i2 = 8;
                    strArr = strArr2;
                    break;
                case a8.n /*8*/:
                    strArr[i] = str;
                    i = 13;
                    str = "\u001c\u0014\u00183]\u000f";
                    i2 = 9;
                    strArr = strArr2;
                    break;
                case a6.D /*9*/:
                    strArr[i] = str;
                    i = 14;
                    str = "\u001c\u0017\r2^\u001c\u0003\u0000>";
                    i2 = 10;
                    strArr = strArr2;
                    break;
                case a6.h /*10*/:
                    strArr[i] = str;
                    i = 15;
                    str = "\u001f\u0000\u0018/W\u000f\u0018";
                    i2 = 11;
                    strArr = strArr2;
                    break;
                case a6.e /*11*/:
                    strArr[i] = str;
                    i = 16;
                    str = "\u001f\u0004\n4@\u0018";
                    i2 = 12;
                    strArr = strArr2;
                    break;
                case a6.s /*12*/:
                    strArr[i] = str;
                    i = 17;
                    str = "\u001f\u000e\b\"";
                    i2 = 13;
                    strArr = strArr2;
                    break;
                case a6.z /*13*/:
                    strArr[i] = str;
                    i = 18;
                    str = "\u001f\u0013\u0003:V\u001e\u0000\u001f/";
                    i2 = 14;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr[i] = str;
                    i = 19;
                    str = "\u001e\t\r/";
                    i2 = 15;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr[i] = str;
                    i = 20;
                    str = "\u001e\r\t:@";
                    i2 = 16;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr[i] = str;
                    i = 21;
                    str = "\u001e\u000e\b>";
                    i2 = 17;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr[i] = str;
                    i = 22;
                    str = "\u001e\u000e\u0001+]\u000e\b\u0002<";
                    i2 = 18;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr[i] = str;
                    i = 23;
                    str = "\u001e\u000e\u0002/S\u001e\u0015\u001f";
                    i2 = 19;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr[i] = str;
                    i = 24;
                    str = "\u001e\u000e\u00195F";
                    i2 = 20;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr[i] = str;
                    i = 25;
                    str = "\u001e\u0013\t:F\u0018";
                    i2 = 21;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr[i] = str;
                    i = 26;
                    str = "\u0019\u0004\u000e.U";
                    i2 = 22;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr[i] = str;
                    i = 27;
                    str = "\u0019\u0004\u0000>F\u0018";
                    i2 = 23;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr[i] = str;
                    i = 28;
                    str = "\u0019\u0004\u00014F\u0018";
                    i2 = 24;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr[i] = str;
                    i = 29;
                    str = "\u0019\u0014\u001c7[\u001e\u0000\u0018>";
                    i2 = 25;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr[i] = str;
                    i = 30;
                    str = "\u0018\u000f\u000f4V\u0014\u000f\u000b";
                    i2 = 26;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr[i] = str;
                    i = 31;
                    str = "\u0018\u0013\u001e4@";
                    i2 = 27;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr[i] = str;
                    i = 32;
                    str = "\u001b\u0000\u0000(W";
                    i2 = 28;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr[i] = str;
                    i = 33;
                    str = "\u001b\b\u0000>Z\u001c\u0012\u0004";
                    i2 = 29;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr[i] = str;
                    i = 34;
                    str = "\u001b\u0013\u00036";
                    i2 = 30;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr[i] = str;
                    i = 35;
                    str = "\u001aO\u0019(";
                    i2 = 31;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr[i] = str;
                    i = 36;
                    str = "\u001a\u0013\u0003.B";
                    i2 = 32;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr[i] = str;
                    i = 37;
                    str = "\u001a\u0013\u0003.B\u000e>\u001ai";
                    i2 = 33;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr[i] = str;
                    i = 38;
                    str = "\u0015\u0004\u0005<Z\t";
                    i2 = 34;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr[i] = str;
                    i = 39;
                    str = "\u0014\u0005";
                    i2 = 35;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr[i] = str;
                    i = 40;
                    str = "\u0014\f\r<W";
                    i2 = 36;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr[i] = str;
                    i = 41;
                    str = "\u0014\u000f";
                    i2 = 37;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr[i] = str;
                    i = 42;
                    str = "\u0014\u000f\b>J";
                    i2 = 38;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr[i] = str;
                    i = 43;
                    str = "\u0014\u000f\u001a2A";
                    i2 = 39;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr[i] = str;
                    i = 44;
                    str = "\u0014\u0015\t6";
                    i2 = 40;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr[i] = str;
                    i = 45;
                    str = "\u0017\b\b";
                    i2 = 41;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr[i] = str;
                    i = 46;
                    str = "\u0016\b\u0002?";
                    i2 = 42;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr[i] = str;
                    i = 47;
                    str = "\u0011\u0000\u001f/";
                    i2 = 43;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr[i] = str;
                    i = 48;
                    str = "\u0011\u0004\r-W";
                    i2 = 44;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr[i] = str;
                    i = 49;
                    str = "\u0011\b\u001a>";
                    i2 = 45;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr[i] = str;
                    str = "\u0011\u000e\u000b";
                    i2 = 46;
                    i = 50;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr[i] = str;
                    i = 51;
                    str = "\u0010\u0004\b2S";
                    i2 = 47;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr[i] = str;
                    i = 52;
                    str = "\u0010\u0004\u001f(S\u001a\u0004";
                    i2 = 48;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr[i] = str;
                    i = 53;
                    str = "\u0010\b\u0001>F\u0004\u0011\t";
                    i2 = 49;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr[i] = str;
                    i = 54;
                    strArr = strArr2;
                    str = "\u0010\b\u001f([\u0013\u0006";
                    i2 = 50;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr[i] = str;
                    i = 55;
                    str = "\u0010\u000e\b2T\u0004";
                    i2 = 51;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr[i] = str;
                    i = 56;
                    str = "\u0013\u0000\u0001>";
                    i2 = 52;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr[i] = str;
                    i = 57;
                    str = "\u0013\u000e\u00182T\u0014\u0002\r/[\u0012\u000f";
                    i2 = 53;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr[i] = str;
                    i = 58;
                    str = "\u0013\u000e\u00182T\u0004";
                    i2 = 54;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr[i] = str;
                    i = 59;
                    str = "\u0012\u0014\u0018";
                    i2 = 55;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr[i] = str;
                    i = 60;
                    str = "\u0012\u0016\u0002>@";
                    i2 = 56;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr[i] = str;
                    i = 61;
                    str = "\r\u0000\u001e/[\u001e\b\u001c:\\\t";
                    i2 = 57;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr[i] = str;
                    i = 62;
                    str = "\r\u0000\u0019(W\u0019";
                    i2 = 58;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr[i] = str;
                    i = 63;
                    str = "\r\b\u000f/G\u000f\u0004";
                    i2 = 59;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr[i] = str;
                    i = 64;
                    str = "\r\r\r\"W\u0019";
                    i2 = 60;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr[i] = str;
                    i = 65;
                    str = "\r\u0013\t(W\u0013\u0002\t";
                    i2 = 61;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr[i] = str;
                    i = 66;
                    str = "\r\u0013\t-[\u0018\u0016";
                    i2 = 62;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr[i] = str;
                    i = 67;
                    str = "\r\u0013\u00036]\t\u0004";
                    i2 = 63;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr[i] = str;
                    i = 68;
                    str = "\f\u0014\t)K";
                    i2 = 64;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr[i] = str;
                    i = 69;
                    str = "\u000f\u0000\u001b";
                    i2 = 65;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr[i] = str;
                    i = 70;
                    str = "\u000f\u0004\r?";
                    i2 = 66;
                    strArr = strArr2;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr[i] = str;
                    i = 71;
                    str = "\u000f\u0004\u000f>[\r\u0015";
                    i2 = 67;
                    strArr = strArr2;
                    break;
                case 67:
                    strArr[i] = str;
                    i = 72;
                    str = "\u000f\u0004\u000f>[\u000b\u0004\b";
                    i2 = 68;
                    strArr = strArr2;
                    break;
                case 68:
                    strArr[i] = str;
                    i = 73;
                    str = "\u000f\u0004\u000f2B\u0014\u0004\u0002/";
                    i2 = 69;
                    strArr = strArr2;
                    break;
                case 69:
                    strArr[i] = str;
                    i = 74;
                    str = "\u000f\u0004\u000f4@\u0019\b\u0002<";
                    i2 = 70;
                    strArr = strArr2;
                    break;
                case 70:
                    strArr[i] = str;
                    i = 75;
                    str = "\u000f\u0004\u0000:K";
                    i2 = 71;
                    strArr = strArr2;
                    break;
                case 71:
                    strArr[i] = str;
                    i = 76;
                    str = "\u000f\u0004\u00014D\u0018";
                    i2 = 72;
                    strArr = strArr2;
                    break;
                case 72:
                    strArr[i] = str;
                    i = 77;
                    str = "\u000f\u0004\u001f+]\u0013\u0012\t";
                    i2 = 73;
                    strArr = strArr2;
                    break;
                case 73:
                    strArr[i] = str;
                    i = 78;
                    str = "\u000f\u0004\u001f._\u0018";
                    i2 = 74;
                    strArr = strArr2;
                    break;
                case 74:
                    strArr[i] = str;
                    i = 79;
                    str = "\u000f\u0004\u0018)K";
                    i2 = 75;
                    strArr = strArr2;
                    break;
                case 75:
                    strArr[i] = str;
                    i = 80;
                    str = "\u000eO\u001b3S\t\u0012\r+BS\u000f\t/";
                    i2 = 76;
                    strArr = strArr2;
                    break;
                case 76:
                    strArr[i] = str;
                    i = 81;
                    str = "\u000e\u0004\u000f4\\\u0019\u0012";
                    i2 = 77;
                    strArr = strArr2;
                    break;
                case 77:
                    strArr[i] = str;
                    i = 82;
                    str = "\u000e\u0004\u0018";
                    i2 = 78;
                    strArr = strArr2;
                    break;
                case 78:
                    strArr[i] = str;
                    i = 83;
                    str = "\u000e\b\u0016>";
                    i2 = 79;
                    strArr = strArr2;
                    break;
                case 79:
                    strArr[i] = str;
                    i = 84;
                    str = "\u000e\u0015\r/G\u000e";
                    i2 = 80;
                    strArr = strArr2;
                    break;
                case 80:
                    strArr[i] = str;
                    i = 85;
                    str = "\u000e\u0014\u000e1W\u001e\u0015";
                    i2 = 81;
                    strArr = strArr2;
                    break;
                case 81:
                    strArr[i] = str;
                    i = 86;
                    str = "\u000e\u0014\u000e(Q\u000f\b\u000e>";
                    i2 = 82;
                    strArr = strArr2;
                    break;
                case 82:
                    strArr[i] = str;
                    strArr2[87] = "t";
                    i = 88;
                    str = "\t\u0004\u0014/";
                    i2 = 83;
                    strArr = strArr2;
                    break;
                case 83:
                    strArr[i] = str;
                    i = 89;
                    str = "\t\u000e";
                    i2 = 84;
                    strArr = strArr2;
                    break;
                case 84:
                    strArr[i] = str;
                    i = 90;
                    str = "\t\u0013\u0019>";
                    i2 = 85;
                    strArr = strArr2;
                    break;
                case 85:
                    strArr[i] = str;
                    str = "\t\u0018\u001c>";
                    i2 = 86;
                    i = 91;
                    strArr = strArr2;
                    break;
                case 86:
                    strArr[i] = str;
                    i = 92;
                    str = "\b\u000f\r)Q\u0015\b\u001a>";
                    i2 = 87;
                    strArr = strArr2;
                    break;
                case 87:
                    strArr[i] = str;
                    i = 93;
                    str = "\b\u000f\r-S\u0014\r\r9^\u0018";
                    i2 = 88;
                    strArr = strArr2;
                    break;
                case 88:
                    strArr[i] = str;
                    i = 94;
                    str = "\b\u0013\u0000";
                    i2 = 89;
                    strArr = strArr2;
                    break;
                case 89:
                    strArr[i] = str;
                    i = 95;
                    str = "\b\u0012\t)";
                    i2 = 90;
                    strArr = strArr2;
                    break;
                case 90:
                    strArr[i] = str;
                    i = 96;
                    strArr = strArr2;
                    str = "\u000b\u0000\u0000.W";
                    i2 = 91;
                    break;
                case 91:
                    strArr[i] = str;
                    str = "\n\u0004\u000e";
                    i2 = 92;
                    i = 97;
                    strArr = strArr2;
                    break;
                case 92:
                    strArr[i] = str;
                    i = 98;
                    str = "\n\b\b/Z";
                    i2 = 93;
                    strArr = strArr2;
                    break;
                case 93:
                    strArr[i] = str;
                    i = 99;
                    str = "\u0010\u0014\u0018>";
                    i2 = 94;
                    strArr = strArr2;
                    break;
                case 94:
                    strArr[i] = str;
                    i = 100;
                    str = "\u000f\u0004\r?m\u0012\u000f\u0000\"";
                    i2 = 95;
                    strArr = strArr2;
                    break;
                case 95:
                    strArr[i] = str;
                    i = 101;
                    str = "\u001c\u0005\u00012\\";
                    i2 = 96;
                    strArr = strArr2;
                    break;
                case 96:
                    strArr[i] = str;
                    i = 102;
                    strArr = strArr2;
                    str = "\u001e\u0013\t:F\u0012\u0013";
                    i2 = 97;
                    break;
                case 97:
                    strArr[i] = str;
                    i = 103;
                    str = "\u000e\t\u0003)F";
                    i2 = 98;
                    strArr = strArr2;
                    break;
                case 98:
                    strArr[i] = str;
                    i = 104;
                    str = "\b\u0011\b:F\u0018";
                    i2 = 99;
                    strArr = strArr2;
                    break;
                case 99:
                    strArr[i] = str;
                    i = 105;
                    str = "\r\u000e\u001b>@\u000e\u0000\u001a>";
                    i2 = 100;
                    strArr = strArr2;
                    break;
                case 100:
                    strArr[i] = str;
                    a = strArr2;
                default:
                    strArr[i] = str;
                    i = 4;
                    strArr = strArr2;
                    str = "IQ\\";
                    i2 = 0;
                    break;
            }
        }
    }
}
