package com.google;

import com.whatsapp.vk;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class bM {
    private static final String[] z;
    private final List a;
    private final List b;

    static {
        String[] strArr = new String[106];
        String str = "\u0010m";
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
                        i3 = 83;
                        break;
                    case ay.f /*1*/:
                        i3 = 36;
                        break;
                    case ay.n /*2*/:
                        i3 = 74;
                        break;
                    case ay.p /*3*/:
                        i3 = 75;
                        break;
                    default:
                        i3 = 56;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "\u0012~";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u001fr";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u0014a";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u001bv";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001ej";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0003h";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0018v";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0005a";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0003p";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0014p";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0018a";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0003a";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u001ep";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0016w";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0012q";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0010e";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0012~";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0000a";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u001dm";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u001ap";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u0017~";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0007j";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0005j";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0014v";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0010}";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u001aw";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u001eq";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u001dh";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u001ek";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0010h";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0011e";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0003a";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u001aj";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0003e";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    str = "\u0003o";
                    obj = 35;
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    strArr2 = strArr3;
                    str = "\u0016a";
                    obj = 36;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0011k";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u0016g";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0017k";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\nq";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u0012a";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u001a`";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u001eo";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0006w";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u0001k";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\te";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u0019t";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u0014f";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u0014l";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "\u0000m";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\u0007v";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u0003}";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0017o";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u001aa";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    str = "\u0018t";
                    obj = 55;
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    strArr2 = strArr3;
                    str = "\u001bq";
                    obj = 56;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u0011ae\u0007m";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "\u0003l";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u0001q";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\u001ff";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "\u0017a";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u0015v";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "\u0011v";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "\u001ah";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\u0010~";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u0012i";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "\u0011l";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i] = str;
                    i = 69;
                    str = "\u0000e";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i] = str;
                    i = 70;
                    str = "\u001fo";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i] = str;
                    i = 71;
                    str = "\u0000}";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i] = str;
                    i = 72;
                    str = "\u0006we\by";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i] = str;
                    i = 73;
                    str = "\u0016c";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case 72:
                    strArr2[i] = str;
                    str = "\u0011c";
                    obj = 73;
                    i = 74;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i] = str;
                    str = "\u0011}";
                    i = 75;
                    strArr2 = strArr3;
                    obj = 74;
                    break;
                case 74:
                    strArr2[i] = str;
                    i = 76;
                    strArr2 = strArr3;
                    str = "\u001bj";
                    obj = 75;
                    break;
                case 75:
                    strArr2[i] = str;
                    i = 77;
                    str = "\u0006we\by";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case 76:
                    strArr2[i] = str;
                    i = 78;
                    str = "\u001f}";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case 77:
                    strArr2[i] = str;
                    i = 79;
                    str = "\u0010l";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case 78:
                    strArr2[i] = str;
                    i = 80;
                    str = "\u0000o";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case 79:
                    strArr2[i] = str;
                    i = 81;
                    str = "\u0000r";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case 80:
                    strArr2[i] = str;
                    i = 82;
                    str = "\u001dk";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case 81:
                    strArr2[i] = str;
                    i = 83;
                    str = "\u0010k";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case 82:
                    strArr2[i] = str;
                    i = 84;
                    str = "\u001e`";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case 83:
                    strArr2[i] = str;
                    i = 85;
                    str = "\u0006}";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case 84:
                    strArr2[i] = str;
                    i = 86;
                    str = "\u001fp";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case 85:
                    strArr2[i] = str;
                    i = 87;
                    str = "\u0000c";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case 86:
                    strArr2[i] = str;
                    i = 88;
                    str = "\u0018~";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case 87:
                    strArr2[i] = str;
                    i = 89;
                    str = "\u0007s";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case 88:
                    strArr2[i] = str;
                    i = 90;
                    str = "\u0006~";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case 89:
                    strArr2[i] = str;
                    i = 91;
                    str = "\u0018s";
                    obj = 90;
                    strArr2 = strArr3;
                    break;
                case 90:
                    strArr2[i] = str;
                    i = 92;
                    str = "\u001bo";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case 91:
                    strArr2[i] = str;
                    i = 93;
                    str = "\u001ee";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case 92:
                    strArr2[i] = str;
                    i = 94;
                    str = "\u001av";
                    obj = 93;
                    strArr2 = strArr3;
                    break;
                case 93:
                    strArr2[i] = str;
                    i = 95;
                    str = "\u0010q";
                    obj = 94;
                    strArr2 = strArr3;
                    break;
                case 94:
                    strArr2[i] = str;
                    i = 96;
                    str = "\u0015m";
                    obj = 95;
                    strArr2 = strArr3;
                    break;
                case 95:
                    strArr2[i] = str;
                    i = 97;
                    str = "\u0010j";
                    obj = 96;
                    strArr2 = strArr3;
                    break;
                case 96:
                    strArr2[i] = str;
                    i = 98;
                    str = "\u0019t";
                    obj = 97;
                    strArr2 = strArr3;
                    break;
                case 97:
                    strArr2[i] = str;
                    i = 99;
                    str = "\u0007l";
                    obj = 98;
                    strArr2 = strArr3;
                    break;
                case 98:
                    strArr2[i] = str;
                    i = 100;
                    str = "\u0012v";
                    obj = 99;
                    strArr2 = strArr3;
                    break;
                case 99:
                    strArr2[i] = str;
                    i = 101;
                    str = "\u001e|";
                    obj = 100;
                    strArr2 = strArr3;
                    break;
                case 100:
                    strArr2[i] = str;
                    i = 102;
                    str = "\u0012p";
                    obj = 101;
                    strArr2 = strArr3;
                    break;
                case 101:
                    strArr2[i] = str;
                    i = 103;
                    str = "\u0019k";
                    obj = 102;
                    strArr2 = strArr3;
                    break;
                case 102:
                    strArr2[i] = str;
                    i = 104;
                    str = "\u0006e";
                    obj = 103;
                    strArr2 = strArr3;
                    break;
                case 103:
                    strArr2[i] = str;
                    i = 105;
                    str = "\u0010v";
                    obj = 104;
                    strArr2 = strArr3;
                    break;
                case 104:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u001e}";
                    obj = null;
                    break;
            }
        }
    }

    String a(String str) {
        int i = bT.a;
        a();
        int parseInt = Integer.parseInt(str.substring(0, 3));
        int size = this.a.size();
        int i2 = 0;
        while (i2 < size) {
            int[] iArr = (int[]) this.a.get(i2);
            int i3 = iArr[0];
            if (parseInt < i3) {
                return null;
            }
            int i4;
            if (iArr.length == 1) {
                i4 = i3;
            } else {
                i4 = iArr[1];
            }
            if (parseInt <= i4) {
                return (String) this.b.get(i2);
            }
            i4 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i4;
        }
        return null;
    }

    bM() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    private void a(int[] iArr, String str) {
        this.a.add(iArr);
        this.b.add(str);
    }

    private synchronized void a() {
        if (this.a.isEmpty()) {
            a(new int[]{0, 19}, z[77]);
            a(new int[]{30, 39}, z[45]);
            a(new int[]{60, 139}, z[72]);
            a(new int[]{300, 379}, z[63]);
            a(new int[]{380}, z[74]);
            a(new int[]{383}, z[51]);
            a(new int[]{385}, z[5]);
            a(new int[]{387}, z[32]);
            a(new int[]{400, 440}, z[62]);
            a(new int[]{450, 459}, z[48]);
            a(new int[]{460, 469}, z[60]);
            a(new int[]{471}, z[89]);
            a(new int[]{474}, z[37]);
            a(new int[]{475}, z[3]);
            a(new int[]{476}, z[2]);
            a(new int[]{477}, z[86]);
            a(new int[]{478}, z[90]);
            a(new int[]{479}, z[70]);
            a(new int[]{480}, z[59]);
            a(new int[]{481}, z[75]);
            a(new int[]{482}, z[104]);
            a(new int[]{484}, z[84]);
            a(new int[]{485}, z[67]);
            a(new int[]{486}, z[4]);
            a(new int[]{487}, z[88]);
            a(new int[]{489}, z[92]);
            a(new int[]{490, 499}, z[98]);
            a(new int[]{500, 509}, z[49]);
            a(new int[]{520}, z[25]);
            a(new int[]{528}, z[61]);
            a(new int[]{529}, z[26]);
            a(new int[]{531}, z[44]);
            a(new int[]{535}, z[14]);
            a(new int[]{539}, z[55]);
            a(new int[]{540, 549}, z[58]);
            a(new int[]{560}, z[10]);
            a(new int[]{569}, z[27]);
            a(new int[]{570, 579}, z[54]);
            a(new int[]{590}, z[7]);
            a(new int[]{594}, z[46]);
            a(new int[]{599}, z[57]);
            a(new int[]{600, 601}, z[47]);
            a(new int[]{603}, z[50]);
            a(new int[]{608}, z[68]);
            a(new int[]{609}, z[28]);
            a(new int[]{611}, z[93]);
            a(new int[]{613}, z[22]);
            a(new int[]{616}, z[12]);
            a(new int[]{618}, z[0]);
            a(new int[]{619}, z[23]);
            a(new int[]{621}, z[71]);
            a(new int[]{622}, z[73]);
            a(new int[]{624}, z[78]);
            a(new int[]{625}, z[103]);
            a(new int[]{626}, z[94]);
            a(new int[]{627}, z[91]);
            a(new int[]{628}, z[69]);
            a(new int[]{629}, z[42]);
            a(new int[]{640, 649}, z[96]);
            a(new int[]{690, 695}, z[97]);
            a(new int[]{700, 709}, z[82]);
            a(new int[]{729}, z[65]);
            a(new int[]{730, 739}, z[19]);
            a(new int[]{740}, z[11]);
            a(new int[]{741}, z[81]);
            a(new int[]{742}, z[76]);
            a(new int[]{743}, z[20]);
            a(new int[]{744}, z[105]);
            a(new int[]{745}, z[35]);
            a(new int[]{746}, z[40]);
            a(new int[]{750}, z[101]);
            a(new int[]{754, 755}, z[17]);
            a(new int[]{759}, z[9]);
            a(new int[]{760, 769}, z[79]);
            a(new int[]{770}, z[83]);
            a(new int[]{773}, z[85]);
            a(new int[]{775}, z[13]);
            a(new int[]{777}, z[38]);
            a(new int[]{779}, z[100]);
            a(new int[]{780}, z[31]);
            a(new int[]{784}, z[53]);
            a(new int[]{785}, z[33]);
            a(new int[]{786}, z[39]);
            a(new int[]{789, 790}, z[64]);
            a(new int[]{800, 839}, z[21]);
            a(new int[]{840, 849}, z[15]);
            a(new int[]{850}, z[95]);
            a(new int[]{858}, z[80]);
            a(new int[]{859}, z[66]);
            a(new int[]{860}, z[41]);
            a(new int[]{865}, z[6]);
            a(new int[]{867}, z[56]);
            a(new int[]{868, 869}, z[52]);
            a(new int[]{870, 879}, z[29]);
            a(new int[]{880}, z[8]);
            a(new int[]{885}, z[99]);
            a(new int[]{888}, z[87]);
            a(new int[]{890}, z[34]);
            a(new int[]{893}, z[24]);
            a(new int[]{896}, z[36]);
            a(new int[]{899}, z[43]);
            a(new int[]{900, 919}, z[102]);
            a(new int[]{930, 939}, z[16]);
            a(new int[]{940, 949}, z[18]);
            a(new int[]{955}, z[1]);
            a(new int[]{958}, z[30]);
        }
    }
}
