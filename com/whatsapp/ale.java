package com.whatsapp;

import android.text.TextUtils;
import com.whatsapp.messaging.bq;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.b9;
import com.whatsapp.protocol.c5;
import com.whatsapp.protocol.m;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class ale implements bq {
    private static final String[] z;
    private final App a;

    static {
        String[] strArr = new String[78];
        String str = "\u0016>,V\"\u0012/\u0012G/\b\"";
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
                        i3 = 103;
                        break;
                    case ay.f /*1*/:
                        i3 = 76;
                        break;
                    case ay.n /*2*/:
                        i3 = 115;
                        break;
                    case ay.p /*3*/:
                        i3 = 51;
                        break;
                    default:
                        i3 = 70;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u0016>S@3\u0004/\u0016@5";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u0004#\u001e\u001d1\u000f-\u0007@'\u0017<,C4\u0002*\u0016A#\t/\u0016@";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0012P2\u000e#\u001dl/\t%\u0007Z'\u0013)S\u00165G/\u001bR*\u000b)\u001dT#G*\u0012Z*\u0002(SP3\u0015>1\tfB?SA#\u0016\u000eI\u0013c\u0014";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0004$\u0012_*\u0002\"\u0014V";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0015)\u0000F+\u0002";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0012P2\u000e#\u001dl/\t%\u0007Z'\u0013)SP.\u0006 \u001fV(\u0000)SC'\u0014?\u0016W";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0010)\u0011";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0012P2\u000e#\u001dl/\t%\u0007Z'\u0013)S\u00165";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0012P2\u000e#\u001d\u0013/\t%\u0007Z'\u0013)SP.\u0006 \u001fV(\u0000)SP)\t*\u001fZ%\u0013l\u0010F4\u0015\u000eI\u0013c\u0014l\u0001V7%vS\u00165";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0012P2\u000e#\u001dl/\t%\u0007Z'\u0013)S\u00165G8\u001cX#\tl\u0005V4\u000e*\u001aP'\u0013%\u001c]f\u0001-\u001a_#\u0003`S@#\t(\u001a]!G/\u001bR*\u000b)\u001dT#Gi\u0000\u001df\u0005\u0005\u0017\tfB?S_)\u0004-\u001f\tfB?SA#\u0004:I\u0013c\u0014l\u001bR54)\u0010A#\u0013vS\u0016$";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0015)\u0002F/\u0015)\u0017";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0015)\u0002F/\u0015)\u0017";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0015)\u0000F+\u0002";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0012P2\u000e#\u001dl/\t%\u0007Z'\u0013)S@#\u0014?\u001a\\(Zi\u0011\u001ff\u0012\"\u0018])\u0010\"SQ4\b;\u0000V4Gi\u0000";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0015)\u0002F/\u0015)\u0017";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0010)\u0011";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0014)\u0007";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0014)\u0007";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0003)\u001fV2\u0002";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0014)\u0007";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0012P2\u000e#\u001dl5\u00028,T4\b9\u0003\u0013+\u0006 \u0015\\4\n)\u0017\u0013'\u00048\u001a\\(";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0012P2\u000e#\u001dl5\u00028,T4\b9\u0003\u0013%\u0015)\u0012G#G+\u0001\\3\u0017v";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0010)\u0011";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0012P2\u000e#\u001dl5\u00028,T4\b9\u0003\u0013(\bl\u001dV2\u0010#\u0001Xf\u0006/\u0010V5\u0014`SU'\u000e SG)G/\u0001V'\u0013)ST4\b9\u0003";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0006(\u0017";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0015)\u001e\\0\u0002";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0015)\u001e\\0\u0002";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u000b)\u0012E#";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u00149\u0011Y#\u00048";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0012P2\u000e#\u001dl5\u00028,T4\b9\u0003\u0013+\u0006 \u0015\\4\n)\u0017\u0013'\u00048\u001a\\(";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0004>\u0016R2\u0002";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0006(\u0017";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u0014)\u0007";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0015)\u001e\\0\u0002";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0010)\u0011";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0010)\u0011";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0002F#\u00155\\^#\u0003%\u0012\u0013#\u0015>\u001cAf\u0012\"\u0018])\u0010\"";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u0010)\u0011";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0010)\u0011";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u0010)\u0011";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "G9\u001dX(\b;\u001d\u00132\u001e<\u0016\tf";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0002F#\u00155\\^#\u0003%\u0012\u00134\u00029\u0003_)\u0006(\u001a]!G";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0002F#\u00155\\^#\u0003%\u0012\u0013(\bl\u0015Z*\u0002";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0002F#\u00155\\^#\u0003%\u0012\u0013#\u0015>\u001cAf\t#S^#\u0014?\u0012T#";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0002F#\u00155\\^#\u0003%\u0012\u0013#\u0015>\u001cAf\t#\u0007\u00133\u0017 \u001cR\"\u0002(";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0002F#\u00155S";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u0010)\u0011";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "4)\u0001E#\u0015\f\u0000\u001d1\u000f-\u0007@'\u0017<]]#\u0013";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u0010)\u0011";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    str = "\u0014)\u0007";
                    obj = 50;
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    strArr2 = strArr3;
                    str = "\u0015)\u0012W";
                    obj = 51;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u0010)\u0011";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0017 \u0012J#\u0003";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u0010)\u0011";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0012P2\u000e#\u001dl5\u00028,A#\u0006(S]3\u000b ";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0012P2\u000e#\u001dl5\u00028,A#\u0006(S^'\u000b*\u001cA+\u0002(SR%\u0013%\u001c]";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u0014)\u0007";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "\u0010)\u0011";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0000J(\u0004l\u0016A4\b>S\u00165Gi\u0017";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\u0016>SV4\u0015#\u0001\u0013";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0012P2\u000e#\u001dl%\u000f-\u0007\u00133\t'\u001d\\1\tl\u0007J6\u0002vS\u0016\"G*\u001cAfB?";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u0010)\u0011";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0003Z(\u0000lV@fB?";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "\u0010)\u0011";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\u0006:\u0012Z*\u0006.\u001fV";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u0015)\u0010\\4\u0003%\u001dT";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "\u0015)\u0010\\4\u0003%\u001dT";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i] = str;
                    i = 69;
                    str = "\u00149\u0011@%\u0015%\u0011V";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i] = str;
                    str = "\u0010)\u0011";
                    obj = 69;
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i] = str;
                    i = 71;
                    strArr2 = strArr3;
                    str = "\u0004#\u001eC)\u0014%\u001dT";
                    obj = 70;
                    break;
                case 70:
                    strArr2[i] = str;
                    i = 72;
                    str = "\u0012\"\u0012E'\u000e \u0012Q*\u0002";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i] = str;
                    i = 73;
                    str = "\u0017-\u0006@#\u0003";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case 72:
                    strArr2[i] = str;
                    i = 74;
                    str = "\u0017-\u0006@#\u0003";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i] = str;
                    i = 75;
                    str = "4)\u0001E#\u0015\f\u0000\u001d1\u000f-\u0007@'\u0017<]]#\u0013";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case 74:
                    strArr2[i] = str;
                    str = "\u0004#\u001eC)\u0014%\u001dT";
                    obj = 75;
                    i = 76;
                    strArr2 = strArr3;
                    break;
                case 75:
                    strArr2[i] = str;
                    i = 77;
                    strArr2 = strArr3;
                    str = "\u0010)\u0011";
                    obj = 76;
                    break;
                case 76:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0006<\u0003\u001c>\n<\u0003\u001c4\u0002/\u0005\u001c7\u0015\u0013\u0000J(\u0004l\u0000F%\u0004)\u0000@fB?S\u00165Gi\u0000\u0013c\u0014";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r8, java.lang.String r9, int r10, java.lang.String r11, long r12) {
        /*
        r7_this = this;
        r4 = 1;
        r5 = 0;
        r6 = com.whatsapp.App.az;
        r0 = com.whatsapp.a12.n();
        if (r0 == 0) goto L_0x0022;
    L_0x000a:
        switch(r10) {
            case 2: goto L_0x002f;
            case 3: goto L_0x0034;
            case 4: goto L_0x003b;
            case 5: goto L_0x0042;
            case 6: goto L_0x004b;
            default: goto L_0x000d;
        };
    L_0x000d:
        r0 = z;
        r1 = 62;
        r0 = r0[r1];
        r1 = 0;
        r2 = 2;
        r2 = new java.lang.Object[r2];
        r3 = java.lang.Integer.valueOf(r10);
        r2[r5] = r3;
        r2[r4] = r11;
        com.whatsapp.util.Log.b(r0, r1, r2);
    L_0x0022:
        r0 = z;
        r1 = 63;
        r0 = r0[r1];
        com.whatsapp.App.a(r9, r8, r0);
        com.whatsapp.a12.h();
        return;
    L_0x002f:
        com.whatsapp.App.c(r11, r5);
        if (r6 == 0) goto L_0x0022;
    L_0x0034:
        r0 = com.whatsapp.App.aJ;
        r0.a(r11, r4, r5);
        if (r6 == 0) goto L_0x0022;
    L_0x003b:
        r0 = com.whatsapp.App.aJ;
        r0.a(r11, r5, r5);
        if (r6 == 0) goto L_0x0022;
    L_0x0042:
        r0 = com.whatsapp.App.p;
        r1 = r11;
        r2 = r12;
        com.whatsapp.notification.t.a(r0, r1, r2, r4, r5);
        if (r6 == 0) goto L_0x0022;
    L_0x004b:
        r0 = com.whatsapp.App.p;
        com.whatsapp.notification.t.a(r0, r11, r5);
        if (r6 == 0) goto L_0x0022;
    L_0x0052:
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ale.a(java.lang.String, java.lang.String, int, java.lang.String, long):void");
    }

    public void a(String str, int i) {
        Log.a(z[60], null, new Object[]{str, Integer.valueOf(i)});
        App.v(z[61] + i);
        a12.a(str, i);
    }

    static int b(long j, boolean z) {
        return a(j, z);
    }

    static c5 a(String str, int i) {
        return b(str, i);
    }

    private static c5 b(String str, int i) {
        c5 c5Var = new c5();
        c5Var.k = i;
        c5Var.l = App.aJ.i(str);
        c5Var.p = App.aJ.y(str);
        c5Var.b = str;
        m8 b = v.b(str);
        if (b != null) {
            String str2;
            c5Var.e = b.a;
            if (TextUtils.isEmpty(b.N)) {
                str2 = null;
            } else {
                str2 = b.N;
            }
            c5Var.s = str2;
        }
        return c5Var;
    }

    public void b(String str, String str2, String str3) {
        Log.a(z[64], null, new Object[]{str2, str3});
        a12.a(str2, str3);
        App.a(str2, str, z[65]);
    }

    public ale(App app) {
        this.a = app;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r8, java.lang.String r9, com.whatsapp.protocol.r r10) {
        /*
        r7_this = this;
        r4 = 28;
        r6 = com.whatsapp.App.az;
        r0 = com.whatsapp.a12.n();
        if (r0 == 0) goto L_0x0158;
    L_0x000a:
        r0 = r10.a;
        if (r0 == 0) goto L_0x0158;
    L_0x000e:
        r0 = r10.d;
        if (r0 == 0) goto L_0x0158;
    L_0x0012:
        r0 = r10.b;
        if (r0 == 0) goto L_0x0158;
    L_0x0016:
        r0 = r10.b;
        r1 = com.whatsapp.App.af();
        r0 = r0.startsWith(r1);
        if (r0 == 0) goto L_0x0158;
    L_0x0022:
        r5 = new com.whatsapp.protocol.b9;
        r5.<init>();
        r0 = r10.a;
        r5.b = r0;
        r0 = z;
        r1 = 34;
        r0 = r0[r1];
        r5.a = r0;
        r0 = z;
        r0 = r0[r4];
        r1 = r10.d;
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x004d;
    L_0x003f:
        r0 = z;
        r1 = 33;
        r0 = r0[r1];
        r1 = r10.d;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009b;
    L_0x004d:
        r0 = r10.e;
        if (r0 == 0) goto L_0x009b;
    L_0x0051:
        r0 = r10.e;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x009b;
    L_0x0059:
        r0 = r10.f;
        if (r0 == 0) goto L_0x009b;
    L_0x005d:
        r0 = z;
        r1 = 27;
        r0 = r0[r1];
        r1 = r10.d;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x016e;
    L_0x006b:
        r0 = new com.whatsapp.mz;
        r1 = r10.f;
        r2 = 0;
        r3 = r10.e;
        r0.<init>(r1, r2, r3, r4, r5);
        r1 = z;
        r2 = 35;
        r1 = r1[r2];
        r2 = r10.d;
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0088;
    L_0x0083:
        com.whatsapp.App.a(r0);
        if (r6 == 0) goto L_0x0099;
    L_0x0088:
        r1 = z;
        r2 = 26;
        r1 = r1[r2];
        r2 = r10.d;
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0099;
    L_0x0096:
        com.whatsapp.App.b(r0);
    L_0x0099:
        if (r6 == 0) goto L_0x0156;
    L_0x009b:
        r0 = z;
        r1 = 29;
        r0 = r0[r1];
        r1 = r10.d;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00b4;
    L_0x00a9:
        r0 = r10.f;
        if (r0 == 0) goto L_0x00b4;
    L_0x00ad:
        r0 = r10.f;
        com.whatsapp.App.a(r0, r5);
        if (r6 == 0) goto L_0x0156;
    L_0x00b4:
        r0 = z;
        r1 = 30;
        r0 = r0[r1];
        r1 = r10.d;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00d3;
    L_0x00c2:
        r0 = r10.c;
        if (r0 == 0) goto L_0x00d3;
    L_0x00c6:
        r0 = r10.f;
        if (r0 == 0) goto L_0x00d3;
    L_0x00ca:
        r0 = r10.f;
        r1 = r10.c;
        com.whatsapp.App.a(r0, r1, r5);
        if (r6 == 0) goto L_0x0156;
    L_0x00d3:
        r0 = z;
        r1 = 32;
        r0 = r0[r1];
        r1 = r10.d;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x014d;
    L_0x00e1:
        r0 = r10.c;
        if (r0 == 0) goto L_0x014d;
    L_0x00e5:
        r0 = r10.e;
        if (r0 == 0) goto L_0x014d;
    L_0x00e9:
        r0 = r10.e;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x014d;
    L_0x00f1:
        r0 = r10.c;
        r0 = com.whatsapp.bd.c(r0);
        r1 = r10.e;
        com.whatsapp.bd.a(r0, r1);
        r1 = com.whatsapp.App.a();
        if (r1 == 0) goto L_0x0134;
    L_0x0102:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 23;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r0);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = com.whatsapp.App.aJ;
        r2 = r10.c;
        r3 = r10.e;
        r4 = 2;
        r2 = com.whatsapp.bd.a(r0, r2, r3, r4);
        r1.f(r2);
        r1 = new com.whatsapp.le;
        r1.<init>(r7, r0, r10, r5);
        com.whatsapp.util.br.a(r1);
        if (r6 == 0) goto L_0x014b;
    L_0x0134:
        r1 = z;
        r2 = 25;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r1 = com.whatsapp.App.aJ;
        r2 = r10.c;
        r3 = r10.e;
        r4 = 3;
        r0 = com.whatsapp.bd.a(r0, r2, r3, r4);
        r1.f(r0);
    L_0x014b:
        if (r6 == 0) goto L_0x0156;
    L_0x014d:
        r0 = z;
        r1 = 31;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
    L_0x0156:
        if (r6 == 0) goto L_0x0161;
    L_0x0158:
        r0 = z;
        r1 = 22;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
    L_0x0161:
        r0 = z;
        r1 = 24;
        r0 = r0[r1];
        com.whatsapp.App.a(r9, r8, r0);
        com.whatsapp.a12.h();
        return;
    L_0x016e:
        r4 = 13;
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ale.a(java.lang.String, java.lang.String, com.whatsapp.protocol.r):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r11, java.lang.String r12, int r13, com.whatsapp.protocol.c5 r14) {
        /*
        r10_this = this;
        r6 = com.whatsapp.App.az;
        switch(r13) {
            case 0: goto L_0x003d;
            case 1: goto L_0x0050;
            case 2: goto L_0x005e;
            case 3: goto L_0x0071;
            case 4: goto L_0x007f;
            case 5: goto L_0x0089;
            case 6: goto L_0x00e3;
            case 7: goto L_0x0005;
            case 8: goto L_0x0005;
            case 9: goto L_0x0005;
            case 10: goto L_0x0005;
            case 11: goto L_0x00f2;
            case 12: goto L_0x0110;
            case 13: goto L_0x0101;
            default: goto L_0x0005;
        };
    L_0x0005:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 47;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r12);
        r1 = z;
        r2 = 42;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r13);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = z;
        r1 = 36;
        r0 = r0[r1];
        com.whatsapp.App.a(r12, r11, r0);
        com.whatsapp.App.C(r12);
    L_0x0039:
        com.whatsapp.a12.h();
        return;
    L_0x003d:
        r0 = 0;
        r0 = (java.util.List) r0;
        r1 = 9;
        com.whatsapp.App.a(r12, r0, r1);
        r0 = z;
        r1 = 40;
        r0 = r0[r1];
        com.whatsapp.App.a(r12, r11, r0);
        if (r6 == 0) goto L_0x0039;
    L_0x0050:
        com.whatsapp.App.y(r12);
        r0 = z;
        r1 = 48;
        r0 = r0[r1];
        com.whatsapp.App.a(r12, r11, r0);
        if (r6 == 0) goto L_0x0039;
    L_0x005e:
        r0 = 0;
        r0 = (java.util.List) r0;
        r1 = 10;
        com.whatsapp.App.a(r12, r0, r1);
        r0 = z;
        r1 = 41;
        r0 = r0[r1];
        com.whatsapp.App.a(r12, r11, r0);
        if (r6 == 0) goto L_0x0039;
    L_0x0071:
        com.whatsapp.App.b(r12);
        r0 = z;
        r1 = 37;
        r0 = r0[r1];
        com.whatsapp.App.a(r12, r11, r0);
        if (r6 == 0) goto L_0x0039;
    L_0x007f:
        r0 = new com.whatsapp.ma;
        r0.<init>(r10, r14, r12, r11);
        com.whatsapp.util.br.a(r0);
        if (r6 == 0) goto L_0x0039;
    L_0x0089:
        r1 = new com.whatsapp.protocol.m;
        r0 = r14.b;
        r2 = r14.g;
        r3 = r14.h;
        r1.<init>(r0, r2, r3);
        r0 = com.whatsapp.App.aJ;
        r2 = r0.b(r1);
        r3 = new com.whatsapp.protocol.c5;
        r3.<init>();
        if (r2 != 0) goto L_0x00b3;
    L_0x00a1:
        r0 = z;
        r4 = 45;
        r0 = r0[r4];
        com.whatsapp.util.Log.e(r0);
        r0 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        r3.k = r0;
        com.whatsapp.App.a(r12, r3, r13);
        if (r6 == 0) goto L_0x00d8;
    L_0x00b3:
        r0 = r1.b;
        if (r0 == 0) goto L_0x00d2;
    L_0x00b7:
        r0 = r2.a;
        r4 = 2;
        r0 = com.whatsapp.protocol.f.a(r0, r4);
        if (r0 >= 0) goto L_0x00d2;
    L_0x00c0:
        r0 = z;
        r4 = 46;
        r0 = r0[r4];
        com.whatsapp.util.Log.e(r0);
        r0 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r3.k = r0;
        com.whatsapp.App.a(r12, r3, r13);
        if (r6 == 0) goto L_0x00d8;
    L_0x00d2:
        r0 = com.whatsapp.avq.a(r2);
        if (r0 == 0) goto L_0x0121;
    L_0x00d8:
        r0 = z;
        r1 = 39;
        r0 = r0[r1];
        com.whatsapp.App.a(r12, r11, r0);
        if (r6 == 0) goto L_0x0039;
    L_0x00e3:
        r0 = new com.whatsapp.dm;
        r1 = r10;
        r2 = r14;
        r3 = r12;
        r4 = r13;
        r5 = r11;
        r0.<init>(r1, r2, r3, r4, r5);
        com.whatsapp.util.br.a(r0);
        if (r6 == 0) goto L_0x0039;
    L_0x00f2:
        r0 = new com.whatsapp.amg;
        r1 = r10;
        r2 = r14;
        r3 = r12;
        r4 = r11;
        r5 = r13;
        r0.<init>(r1, r2, r3, r4, r5);
        com.whatsapp.util.br.a(r0);
        if (r6 == 0) goto L_0x0039;
    L_0x0101:
        r0 = new com.whatsapp.a84;
        r1 = r10;
        r2 = r14;
        r3 = r12;
        r4 = r13;
        r5 = r11;
        r0.<init>(r1, r2, r3, r4, r5);
        com.whatsapp.util.br.a(r0);
        if (r6 == 0) goto L_0x0039;
    L_0x0110:
        r0 = new com.whatsapp.dt;
        r1 = r10;
        r2 = r14;
        r3 = r12;
        r4 = r13;
        r5 = r11;
        r0.<init>(r1, r2, r3, r4, r5);
        com.whatsapp.util.br.a(r0);
        if (r6 == 0) goto L_0x0039;
    L_0x011f:
        goto L_0x0005;
    L_0x0121:
        r0 = r2.j;
        r4 = 1;
        if (r0 == r4) goto L_0x0130;
    L_0x0126:
        r0 = r2.j;
        r4 = 2;
        if (r0 == r4) goto L_0x0130;
    L_0x012b:
        r0 = r2.j;
        r4 = 3;
        if (r0 != r4) goto L_0x01c2;
    L_0x0130:
        r0 = r2.A;
        r0 = (com.whatsapp.MediaData) r0;
        r4 = r0.file;
        if (r4 == 0) goto L_0x019f;
    L_0x0138:
        r4 = r0.file;
        r4 = r4.exists();
        if (r4 == 0) goto L_0x019f;
    L_0x0140:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r7 = 43;
        r5 = r5[r7];
        r4 = r4.append(r5);
        r4 = r4.append(r1);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r4 = new com.whatsapp.MediaData;
        r4.<init>(r0);
        r0 = new com.whatsapp.protocol.b;
        r0.<init>(r1);
        r5 = r2.c();
        r0.b(r5);
        r0.A = r4;
        r5 = r2.O;
        r0.O = r5;
        r5 = r2.t;
        r0.t = r5;
        r5 = r2.j;
        r0.j = r5;
        r5 = r2.s;
        r0.s = r5;
        r8 = r2.k;
        r0.k = r8;
        r5 = r2.H;
        r0.H = r5;
        r5 = r2.z;
        r0.z = r5;
        r8 = r2.K;
        r0.K = r8;
        r8 = r2.G;
        r0.G = r8;
        r5 = new com.whatsapp.avg;
        r5.<init>(r2, r0, r12);
        r4.uploader = r5;
        r0 = r4.uploader;
        r0.b();
        if (r6 == 0) goto L_0x01c0;
    L_0x019f:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r4 = 44;
        r2 = r2[r4];
        r0 = r0.append(r2);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        r3.k = r0;
        com.whatsapp.App.a(r12, r3, r13);
    L_0x01c0:
        if (r6 == 0) goto L_0x00d8;
    L_0x01c2:
        r0 = z;
        r1 = 38;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        r0 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r3.k = r0;
        com.whatsapp.App.a(r12, r3, r13);
        goto L_0x00d8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ale.a(java.lang.String, java.lang.String, int, com.whatsapp.protocol.c5):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r5, java.lang.String r6, java.lang.String r7, com.whatsapp.protocol.m r8, int r9) {
        /*
        r4_this = this;
        r3 = 1;
        r2 = 0;
        r0 = com.whatsapp.App.az;
        r1 = com.whatsapp.a12.n();
        if (r1 == 0) goto L_0x0028;
    L_0x000a:
        if (r7 == 0) goto L_0x0028;
    L_0x000c:
        r1 = com.whatsapp.v.b(r7);
        if (r1 == 0) goto L_0x001d;
    L_0x0012:
        com.whatsapp.App.a(r1, r2, r2, r8, r9);
        com.whatsapp.App.a(r3, r3, r3, r2);
        com.whatsapp.notification.PopupNotification.e(r7);
        if (r0 == 0) goto L_0x0026;
    L_0x001d:
        r1 = z;
        r2 = 56;
        r1 = r1[r2];
        com.whatsapp.util.Log.e(r1);
    L_0x0026:
        if (r0 == 0) goto L_0x0031;
    L_0x0028:
        r0 = z;
        r1 = 57;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
    L_0x0031:
        r0 = z;
        r1 = 55;
        r0 = r0[r1];
        com.whatsapp.App.a(r6, r5, r0);
        com.whatsapp.a12.h();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ale.a(java.lang.String, java.lang.String, java.lang.String, com.whatsapp.protocol.m, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r9, java.lang.String r10, com.whatsapp.protocol.e r11) {
        /*
        r8_this = this;
        r2 = 1;
        r1 = 0;
        r3 = com.whatsapp.App.az;
        r0 = com.whatsapp.a12.n();
        if (r0 == 0) goto L_0x00b2;
    L_0x000a:
        r0 = z;
        r4 = 66;
        r0 = r0[r4];
        r4 = r11.d;
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0020;
    L_0x0018:
        com.whatsapp.a12.i();
        com.whatsapp.App.aG();
        if (r3 == 0) goto L_0x00b2;
    L_0x0020:
        r0 = z;
        r4 = 72;
        r0 = r0[r4];
        r4 = r11.d;
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0038;
    L_0x002e:
        r4 = r11.b;
        com.whatsapp.a12.a(r4);
        com.whatsapp.App.J();
        if (r3 == 0) goto L_0x00b2;
    L_0x0038:
        r0 = z;
        r4 = 69;
        r0 = r0[r4];
        r4 = r11.d;
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0055;
    L_0x0046:
        r0 = r11.c;
        if (r0 == 0) goto L_0x0055;
    L_0x004a:
        r0 = r11.c;
        r0 = com.whatsapp.v.b(r0);
        com.whatsapp.App.b(r0);
        if (r3 == 0) goto L_0x00b2;
    L_0x0055:
        r0 = z;
        r4 = 76;
        r0 = r0[r4];
        r4 = r11.d;
        r0 = r0.equals(r4);
        if (r0 != 0) goto L_0x007f;
    L_0x0063:
        r0 = z;
        r4 = 73;
        r0 = r0[r4];
        r4 = r11.d;
        r0 = r0.equals(r4);
        if (r0 != 0) goto L_0x007f;
    L_0x0071:
        r0 = z;
        r4 = 67;
        r0 = r0[r4];
        r4 = r11.d;
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x00b2;
    L_0x007f:
        r0 = r11.c;
        if (r0 == 0) goto L_0x00b2;
    L_0x0083:
        r0 = r11.c;
        r4 = com.whatsapp.v.b(r0);
        if (r4 == 0) goto L_0x00b2;
    L_0x008b:
        r0 = r11.c;
        r0 = com.whatsapp.m8.d(r0);
        if (r0 != 0) goto L_0x00b2;
    L_0x0093:
        r0 = r4.e;
        r5 = z;
        r6 = 75;
        r5 = r5[r6];
        r0 = r0.equals(r5);
        if (r0 != 0) goto L_0x00b2;
    L_0x00a1:
        r0 = r11.d;
        if (r0 == 0) goto L_0x00b2;
    L_0x00a5:
        r5 = r11.d;
        r0 = -1;
        r6 = r5.hashCode();
        switch(r6) {
            case -1399754289: goto L_0x00ce;
            case -995321554: goto L_0x00dd;
            case 993558001: goto L_0x00bf;
            default: goto L_0x00af;
        };
    L_0x00af:
        switch(r0) {
            case 0: goto L_0x00eb;
            case 1: goto L_0x00f4;
            case 2: goto L_0x00fd;
            default: goto L_0x00b2;
        };
    L_0x00b2:
        r0 = z;
        r1 = 70;
        r0 = r0[r1];
        com.whatsapp.App.a(r10, r9, r0);
        com.whatsapp.a12.h();
        return;
    L_0x00bf:
        r6 = z;
        r7 = 68;
        r6 = r6[r7];
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x00af;
    L_0x00cb:
        if (r3 == 0) goto L_0x0107;
    L_0x00cd:
        r0 = r1;
    L_0x00ce:
        r6 = z;
        r7 = 71;
        r6 = r6[r7];
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x00af;
    L_0x00da:
        if (r3 == 0) goto L_0x0105;
    L_0x00dc:
        r0 = r2;
    L_0x00dd:
        r6 = z;
        r7 = 74;
        r6 = r6[r7];
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00af;
    L_0x00e9:
        r0 = 2;
        goto L_0x00af;
    L_0x00eb:
        r0 = r8.a;
        r5 = r4.e;
        r0.b(r5, r2);
        if (r3 == 0) goto L_0x00b2;
    L_0x00f4:
        r0 = r8.a;
        r2 = r4.e;
        r0.b(r2, r1);
        if (r3 == 0) goto L_0x00b2;
    L_0x00fd:
        r0 = r8.a;
        r1 = r4.e;
        r0.f(r1);
        goto L_0x00b2;
    L_0x0105:
        r0 = r2;
        goto L_0x00af;
    L_0x0107:
        r0 = r1;
        goto L_0x00af;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ale.a(java.lang.String, java.lang.String, com.whatsapp.protocol.e):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
        r7_this = this;
        r1 = com.whatsapp.App.az;
        r0 = z;
        r2 = 5;
        r0 = r0[r2];
        r0 = r0.equals(r13);
        if (r0 == 0) goto L_0x00b6;
    L_0x000d:
        r0 = com.whatsapp.a12.c();
        if (r0 == 0) goto L_0x00b4;
    L_0x0013:
        r2 = r0.a;
        r2 = com.whatsapp.a12.b(r11, r12, r2);
        if (r2 == 0) goto L_0x0094;
    L_0x001b:
        r3 = z;
        r4 = 7;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r4 = r0.b;
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0045;
    L_0x0030:
        r3 = com.whatsapp.a12.c(r11);
        if (r3 == 0) goto L_0x0045;
    L_0x0036:
        r3 = com.whatsapp.a12.n();
        if (r3 == 0) goto L_0x003f;
    L_0x003c:
        com.whatsapp.a12.p();
    L_0x003f:
        r3 = 2;
        com.whatsapp.App.a(r10, r2, r11, r3);
        if (r1 == 0) goto L_0x00b4;
    L_0x0045:
        r3 = z;
        r4 = 16;
        r3 = r3[r4];
        r4 = r0.b;
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x005d;
    L_0x0053:
        r3 = 0;
        com.whatsapp.App.a(r3);
        r3 = 1;
        com.whatsapp.App.a(r10, r2, r11, r3);
        if (r1 == 0) goto L_0x00b4;
    L_0x005d:
        r3 = com.whatsapp.a12.n();
        if (r3 != 0) goto L_0x0069;
    L_0x0063:
        r3 = 1;
        com.whatsapp.App.a(r10, r2, r11, r3);
        if (r1 == 0) goto L_0x00b4;
    L_0x0069:
        r3 = com.whatsapp.a12.c(r11);
        if (r3 == 0) goto L_0x0079;
    L_0x006f:
        r3 = 0;
        com.whatsapp.App.a(r3);
        r3 = 1;
        com.whatsapp.App.a(r10, r2, r11, r3);
        if (r1 == 0) goto L_0x00b4;
    L_0x0079:
        r2 = z;
        r3 = 10;
        r2 = r2[r3];
        r3 = 0;
        r4 = 2;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r6 = com.whatsapp.a12.g;
        r4[r5] = r6;
        r5 = 1;
        r4[r5] = r11;
        com.whatsapp.util.Log.b(r2, r3, r4);
        r2 = 0;
        com.whatsapp.App.b(r2, r10);
        if (r1 == 0) goto L_0x00b4;
    L_0x0094:
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r3 = 0;
        r4 = 3;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r0 = r0.b;
        r4[r5] = r0;
        r0 = 1;
        r5 = com.whatsapp.a12.g;
        r4[r0] = r5;
        r0 = 2;
        r4[r0] = r11;
        com.whatsapp.util.Log.b(r2, r3, r4);
        com.whatsapp.a12.r();
        r0 = 1;
        com.whatsapp.App.b(r0, r10);
    L_0x00b4:
        if (r1 == 0) goto L_0x0190;
    L_0x00b6:
        r0 = com.whatsapp.a12.n();
        if (r0 == 0) goto L_0x00ce;
    L_0x00bc:
        r0 = com.whatsapp.a12.c(r11);
        if (r0 != 0) goto L_0x00ce;
    L_0x00c2:
        r0 = z;
        r2 = 12;
        r0 = r0[r2];
        r0 = r0.equals(r13);
        if (r0 == 0) goto L_0x0170;
    L_0x00ce:
        r0 = com.whatsapp.a12.b(r11, r12);
        if (r0 == 0) goto L_0x0115;
    L_0x00d4:
        r2 = z;
        r3 = 14;
        r2 = r2[r3];
        r2 = r2.equals(r13);
        if (r2 == 0) goto L_0x00ef;
    L_0x00e0:
        r2 = com.whatsapp.a12.n();
        if (r2 == 0) goto L_0x00e9;
    L_0x00e6:
        com.whatsapp.a12.p();
    L_0x00e9:
        r2 = 2;
        com.whatsapp.App.a(r10, r0, r11, r2);
        if (r1 == 0) goto L_0x016e;
    L_0x00ef:
        r2 = z;
        r3 = 13;
        r2 = r2[r3];
        r2 = r2.equals(r13);
        if (r2 == 0) goto L_0x0105;
    L_0x00fb:
        r2 = 0;
        com.whatsapp.App.a(r2);
        r2 = 1;
        com.whatsapp.App.a(r10, r0, r11, r2);
        if (r1 == 0) goto L_0x016e;
    L_0x0105:
        r2 = com.whatsapp.a12.n();
        if (r2 == 0) goto L_0x010f;
    L_0x010b:
        r2 = 0;
        com.whatsapp.App.a(r2);
    L_0x010f:
        r2 = 1;
        com.whatsapp.App.a(r10, r0, r11, r2);
        if (r1 == 0) goto L_0x016e;
    L_0x0115:
        r0 = com.whatsapp.a12.i(r11);
        if (r0 == 0) goto L_0x014f;
    L_0x011b:
        r0 = com.whatsapp.a12.k(r13);
        r2 = 2;
        com.whatsapp.App.a(r2, r10, r0);
        r2 = z;
        r3 = 11;
        r2 = r2[r3];
        r3 = 0;
        r4 = 6;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r4[r5] = r13;
        r5 = 1;
        r4[r5] = r0;
        r0 = 2;
        r4[r0] = r11;
        r0 = 3;
        r5 = com.whatsapp.a12.c;
        r4[r0] = r5;
        r0 = 4;
        r4[r0] = r12;
        r5 = 5;
        r0 = com.whatsapp.a12.d;
        if (r0 == 0) goto L_0x019a;
    L_0x0143:
        r0 = 1;
    L_0x0144:
        r0 = java.lang.Boolean.valueOf(r0);
        r4[r5] = r0;
        com.whatsapp.util.Log.a(r2, r3, r4);
        if (r1 == 0) goto L_0x016e;
    L_0x014f:
        r0 = z;
        r2 = 15;
        r0 = r0[r2];
        r2 = 0;
        r3 = 2;
        r3 = new java.lang.Object[r3];
        r4 = 0;
        r5 = com.whatsapp.a12.n();
        r5 = java.lang.Boolean.valueOf(r5);
        r3[r4] = r5;
        r4 = 1;
        r3[r4] = r11;
        com.whatsapp.util.Log.b(r0, r2, r3);
        r0 = 1;
        com.whatsapp.App.b(r0, r10);
    L_0x016e:
        if (r1 == 0) goto L_0x0190;
    L_0x0170:
        r0 = z;
        r2 = 9;
        r0 = r0[r2];
        r2 = 0;
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r4 = 0;
        r3[r4] = r13;
        com.whatsapp.util.Log.b(r0, r2, r3);
        r0 = com.whatsapp.a12.i(r11);
        if (r0 == 0) goto L_0x018c;
    L_0x0186:
        r0 = 0;
        com.whatsapp.App.b(r0, r10);
        if (r1 == 0) goto L_0x0190;
    L_0x018c:
        r0 = 1;
        com.whatsapp.App.b(r0, r10);
    L_0x0190:
        r0 = z;
        r1 = 8;
        r0 = r0[r1];
        com.whatsapp.App.a(r9, r8, r0);
        return;
    L_0x019a:
        r0 = 0;
        goto L_0x0144;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ale.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private static int a(long j, boolean z) {
        return (z || System.currentTimeMillis() > 86400000 + j) ? 20 : 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r5, java.lang.String r6, com.whatsapp.protocol.b r7) {
        /*
        r4_this = this;
        r1 = 0;
        r0 = com.whatsapp.a12.n();
        if (r0 == 0) goto L_0x0088;
    L_0x0007:
        com.whatsapp.App.a(r7);
        r0 = r7.e;
        r0 = r0.c;
        r0 = com.whatsapp.m8.d(r0);
        if (r0 == 0) goto L_0x0027;
    L_0x0014:
        r0 = r7.e;
        r0 = r0.c;
        r0 = com.whatsapp.v.b(r0);
        if (r0 == 0) goto L_0x0025;
    L_0x001e:
        com.whatsapp.App.a(r7, r0);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0027;
    L_0x0025:
        r7.F = r1;
    L_0x0027:
        r0 = com.whatsapp.App.aJ;
        r0.f(r7);
        r2 = com.whatsapp.s3.a();
        r0 = r7.r;
        if (r0 == 0) goto L_0x0095;
    L_0x0034:
        r0 = 1;
    L_0x0035:
        r2.a(r0);
        r0 = r7.e;
        r0 = r0.b;
        if (r0 == 0) goto L_0x0097;
    L_0x003e:
        r0 = r7.e;
        r0 = r0.c;
        r0 = com.whatsapp.v.b(r0);
    L_0x0046:
        if (r0 == 0) goto L_0x0088;
    L_0x0048:
        r1 = r0.e;
        r1 = com.whatsapp.m8.d(r1);
        if (r1 != 0) goto L_0x0088;
    L_0x0050:
        r1 = r0.w();
        if (r1 != 0) goto L_0x0088;
    L_0x0056:
        r1 = r0.e;
        r2 = z;
        r3 = 49;
        r2 = r2[r3];
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x0088;
    L_0x0064:
        r1 = com.whatsapp.App.ab;
        r2 = 5;
        r3 = r0.e;
        r3 = com.whatsapp.App.e(r3);
        r1.removeMessages(r2, r3);
        r1 = com.whatsapp.App.ab;
        r2 = 3;
        r3 = r0.e;
        r3 = com.whatsapp.App.e(r3);
        r1.removeMessages(r2, r3);
        r1 = com.whatsapp.App.ab;
        r2 = 4;
        r0 = r0.e;
        r0 = com.whatsapp.App.e(r0);
        r1.removeMessages(r2, r0);
    L_0x0088:
        r0 = z;
        r1 = 50;
        r0 = r0[r1];
        com.whatsapp.App.a(r6, r5, r0);
        com.whatsapp.a12.h();
        return;
    L_0x0095:
        r0 = 0;
        goto L_0x0035;
    L_0x0097:
        r0 = r1;
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ale.a(java.lang.String, java.lang.String, com.whatsapp.protocol.b):void");
    }

    public void a(String str, String str2, String str3, m mVar) {
        if (a12.n() && mVar != null && ((z[54].equals(str3) || z[52].equals(str3)) && App.aJ.b(mVar, 9))) {
            b b = App.aJ.b(mVar);
            b.u = z[51];
            App.l(b);
        }
        App.a(str2, str, z[53]);
        a12.h();
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        Log.a(z[1], null, new Object[]{str, str4, str5, str6});
        App.v(z[2]);
        a12.a(str, str2, str3, str4, str5, str6, z);
        App.p.getSharedPreferences(z[3], 0).edit().putBoolean(z[0], false).commit();
    }

    public void a(String str, String str2) {
        if (a12.n()) {
            App.a(this.a, true, true, false);
        }
        App.a(str2, str, z[77]);
        a12.h();
    }

    public void a(String str, String str2, String str3) {
        if (a12.n() && str3 != null) {
            b9 b9Var = new b9();
            b9Var.b = str2;
            b9Var.a = z[58];
            App.a(str3, new a_s(this, str3), new amn(this), new kq(this), b9Var);
        }
        App.a(str2, str, z[59]);
        a12.h();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r7, java.lang.String r8, com.whatsapp.protocol.ba r9) {
        /*
        r6_this = this;
        r5 = 0;
        r0 = com.whatsapp.a12.n();
        if (r0 == 0) goto L_0x0089;
    L_0x0007:
        r0 = r9.e;
        if (r0 == 0) goto L_0x0089;
    L_0x000b:
        r0 = r9.c;
        if (r0 == 0) goto L_0x0089;
    L_0x000f:
        r0 = r9.b;
        if (r0 == 0) goto L_0x0089;
    L_0x0013:
        r0 = z;
        r1 = 19;
        r0 = r0[r1];
        r1 = r9.c;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0060;
    L_0x0021:
        r0 = r9.d;
        if (r0 == 0) goto L_0x0060;
    L_0x0025:
        r0 = r9.a;
        if (r0 == 0) goto L_0x0060;
    L_0x0029:
        r0 = r9.b;
        r1 = com.whatsapp.App.af();
        r0 = r0.startsWith(r1);
        if (r0 != 0) goto L_0x003d;
    L_0x0035:
        r0 = r9.b;
        r0 = com.whatsapp.bd.b(r0);
        if (r0 == 0) goto L_0x0089;
    L_0x003d:
        r0 = new com.whatsapp.protocol.b9;
        r0.<init>();
        r1 = r9.e;
        r0.b = r1;
        r1 = z;
        r2 = 21;
        r1 = r1[r2];
        r0.a = r1;
        r1 = new com.whatsapp.a89;
        r2 = r9.b;
        r3 = r9.a;
        r4 = r9.d;
        r1.<init>(r2, r3, r4, r0);
        com.whatsapp.App.a(r1);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0089;
    L_0x0060:
        r0 = z;
        r1 = 20;
        r0 = r0[r1];
        r1 = r9.c;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0089;
    L_0x006e:
        r0 = new com.whatsapp.protocol.b9;
        r0.<init>();
        r1 = r9.e;
        r0.b = r1;
        r1 = z;
        r2 = 18;
        r1 = r1[r2];
        r0.a = r1;
        r1 = new com.whatsapp.a89;
        r2 = r9.b;
        r1.<init>(r2, r5, r5, r0);
        com.whatsapp.App.a(r1);
    L_0x0089:
        r0 = z;
        r1 = 17;
        r0 = r0[r1];
        com.whatsapp.App.a(r8, r7, r0);
        com.whatsapp.a12.h();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ale.a(java.lang.String, java.lang.String, com.whatsapp.protocol.ba):void");
    }

    public void a(String str, String str2, boolean z, String str3, String str4, long j, String str5) {
        App.a(str, str2, z, str3, str4, j, str5);
    }
}
