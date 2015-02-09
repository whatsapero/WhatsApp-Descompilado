package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class fm {
    private static final String[] z;

    static {
        String[] strArr = new String[181];
        String str = "\u007fD\u0013WS{H\nQO";
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
                        i3 = 26;
                        break;
                    case ay.f /*1*/:
                        i3 = 60;
                        break;
                    case ay.n /*2*/:
                        i3 = 99;
                        break;
                    case ay.p /*3*/:
                        i3 = 62;
                        break;
                    default:
                        i3 = 33;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "sR";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "v_";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "hY\u0017LXE]\u0005JDh";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "iH\u0002RD";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "}I\u0006MR\u007fX<JNuc\u0005_Rn";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "v[";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "iH\u0002JTi";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "uWCMU{H\u0016M\u0001xI\u0017\u001eMu[\nP\r:L\u0014\u0012\u0001uNC[YjU\u0011_UsS\r\u001eHi\u001c\rKMv";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "tSCLDiL\fPR\u007f";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "sX";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "jK";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "|]\nR";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "yS\u0007[";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "uW";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u007fR\u0017[S\u007fX";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "uWCMU{H\u0016M\u0001xI\u0017\u001eMu[\nP\r:L\u0014\u0012\u0001uNC[YjU\u0011_UsS\r\u001eHi\u001c\rKMv";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "jN\n]DEY\u001bNHh]\u0017WNt";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u007fD\u0013WS\u007fX";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "vS\u0004WO";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "jN\n]D";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "vS\u0004WO";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "wU\u0010S@n_\u000b";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "rH\u0017N\u000elY\u0011WGc_\fZD5N\u0006MTvHL[ShS\u0011\u0011TtW\rQVt\u0011\u0010J@nI\u0010\u001e";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "nS\faL{R\u001aaFoY\u0010MDi";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    str = "rH\u0017N\u000elY\u0011WGc_\fZD5O\u0017_UoOL[ShS\u0011\u0013Ou\u0011\u0010J@nI\u0010";
                    obj = 25;
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    strArr2 = strArr3;
                    str = "rH\u0017N\u000elY\u0011WGc_\fZD5O\u0017_UoOL[ShS\u0011\u0013Rn]\u0017KR7Y\u001bNHhY\u0007\u0013Ou\u0011\u000fQFsRNQS7L\u0014\u0013Nh\u0011\u0006FQsN\u0002JHuR";
                    obj = 26;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "y]\rPNn\u001c\u0013_SiYCtrUrCXSuQCMDhJ\u0006L";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "iU\u000ePTw";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "hY\u0017LXE]\u0005JDh";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "yI\u0011LDt_\u001a";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "tY\u0017INhW<L@~U\faUcL\u0006";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    str = "xP\f]J\u007fX";
                    obj = 32;
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    strArr2 = strArr3;
                    str = "\u007fD\u0013WS{H\nQO";
                    obj = 33;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "jN\n]DEY\u001bNHh]\u0017WNt";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "jK";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "hY\u0002MNt";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "rH\u0017N\u000elY\u0011WGc_\fZD5Y\u0011LNh\u001c\u0010J@nI\u0010\u0003";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "wU\u0010MHt[";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "rH\u0017N\u000elY\u0011WGc_\fZD5T\u0017JQ\u007fN\u0011QS";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "y_";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "yS\u0010J";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "nY\u000eNNh]\u0011WMcc\u0016P@l]\nR@xP\u0006";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "{J\u0002WM{^\u000f[";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "nN\u0016[";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u007fN\u0011QS:L\u0002LRsR\u0004\u001eKiS\r";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "|]\u000fMD";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "rH\u0017N\u000eiY\u0011HDhO\u0017_UoOL[ShS\u0011\u001e";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "Oh%\u0013\u0019";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "rH\u0017N\u000eiY\u0011HDhO\u0017_UoOL[ShS\u0011\u001eRn]\u0017KR'";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "\u007fN\u0011QS:L\u0002LRsR\u0004\u001eKiS\r\u0004\u0001";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "jK";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "hY\u0017LXE]\u0005JDh";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u007fD\u0013WS\u007fXCMU{H\u0016M\u0001xI\u0017\u001eLsO\u0010WO}\u001c\u0007_U{";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "yI\u0011LDt_\u001a";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "vS\u0004WO";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "hY\u0002MNt";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "jN\n]DEY\u001bNHh]\u0017WNt";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "y]\rPNn\u001c\u0013_SiYCtrUrCXSuQCMDhJ\u0006L";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    str = "nS\b[O";
                    obj = 59;
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    strArr2 = strArr3;
                    str = "lS\n]DEP\u0006PFnT";
                    obj = 60;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    str = "uW";
                    obj = 61;
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    strArr2 = strArr3;
                    str = "vS\u0004WO";
                    obj = 62;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "rH\u0017N\u000eyT\u0006]JhY\nPRn]\u000fR\u000eiH\u0002JTi\u0013\u0006LSuNNMU{H\u0016M\f\u007fD\u0013WS\u007fXNSHiO\nPF7X\u0002J@";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "y_";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "yS\u0010J";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "iU\u000ePTw";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "x]\u0007\u001eInH\u0013\u001eRn]\u0017KR:_\fZD \u001c";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i] = str;
                    i = 69;
                    str = "sR\u0000QShY\u0000J";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i] = str;
                    i = 70;
                    str = "\u007fD\u0013WS{H\nQO";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i] = str;
                    i = 71;
                    str = "rH\u0017N\u000eyT\u0006]JhY\nPRn]\u000fR\u000e|]\nR\u000ehY\u0002MNt\u0006CKOqR\fIO:N\u0006_RuRY\u001e";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i] = str;
                    i = 72;
                    str = "|]\nR\r:I\rUOuK\r\u001eS\u007f]\u0010QO";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i] = str;
                    i = 73;
                    str = "v[";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case 72:
                    strArr2[i] = str;
                    i = 74;
                    str = "vY\rYUrc\u0010VNhH";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i] = str;
                    i = 75;
                    str = "tSCMU{H\u0016M";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case 74:
                    strArr2[i] = str;
                    i = 76;
                    str = "jN\n]DEY\u001bNHh]\u0017WNt";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case 75:
                    strArr2[i] = str;
                    i = 77;
                    str = "v_";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case 76:
                    strArr2[i] = str;
                    i = 78;
                    str = "yS\u0010J";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case 77:
                    strArr2[i] = str;
                    i = 79;
                    str = "x]\u0007aUuW\u0006P";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case 78:
                    strArr2[i] = str;
                    i = 80;
                    str = "nY\u000eNNh]\u0011WMcc\u0016P@l]\nR@xP\u0006";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case 79:
                    strArr2[i] = str;
                    i = 81;
                    str = "rH\u0017N\u000eyT\u0006]JhY\nPRn]\u000fR\u000eiH\u0002JTi\u0013\u0006LSuNNMU{H\u0016M\fuWNSHiO\nPF7X\u0002J@";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case 80:
                    strArr2[i] = str;
                    i = 82;
                    str = "jN\n]DEY\u001bNHh]\u0017WNt";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case 81:
                    strArr2[i] = str;
                    i = 83;
                    str = "vY\rYUrc\u000fQO}";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case 82:
                    strArr2[i] = str;
                    i = 84;
                    str = "rH\u0017N\u000eyT\u0006]JhY\nPRn]\u000fR\u000e\u007fN\u0011QS:O\u0017_UoO^";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case 83:
                    strArr2[i] = str;
                    i = 85;
                    str = "iQ\u0010aM\u007fR\u0004JI";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case 84:
                    strArr2[i] = str;
                    i = 86;
                    str = "jN\n]D";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case 85:
                    strArr2[i] = str;
                    i = 87;
                    str = "|]\nR";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case 86:
                    strArr2[i] = str;
                    i = 88;
                    str = "\u007fD\u0013WS\u007fX";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case 87:
                    strArr2[i] = str;
                    i = 89;
                    str = "jN\n]D";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case 88:
                    strArr2[i] = str;
                    i = 90;
                    str = "sR";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case 89:
                    strArr2[i] = str;
                    i = 91;
                    str = "yI\u0011LDt_\u001a";
                    obj = 90;
                    strArr2 = strArr3;
                    break;
                case 90:
                    strArr2[i] = str;
                    i = 92;
                    str = "iH\u0002JTi";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case 91:
                    strArr2[i] = str;
                    i = 93;
                    str = "sX";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case 92:
                    strArr2[i] = str;
                    i = 94;
                    str = "hY\u0017LXE]\u0005JDh";
                    obj = 93;
                    strArr2 = strArr3;
                    break;
                case 93:
                    strArr2[i] = str;
                    i = 95;
                    str = "tY\u0017INhW<L@~U\faUcL\u0006";
                    obj = 94;
                    strArr2 = strArr3;
                    break;
                case 94:
                    strArr2[i] = str;
                    i = 96;
                    str = "xP\f]J\u007fX";
                    obj = 95;
                    strArr2 = strArr3;
                    break;
                case 95:
                    strArr2[i] = str;
                    i = 97;
                    str = "oR\bPNmRCMU{H\u0016M";
                    obj = 96;
                    strArr2 = strArr3;
                    break;
                case 96:
                    strArr2[i] = str;
                    i = 98;
                    str = "jK";
                    obj = 97;
                    strArr2 = strArr3;
                    break;
                case 97:
                    strArr2[i] = str;
                    i = 99;
                    str = "uP\u0007aW\u007fN\u0010WNt";
                    obj = 98;
                    strArr2 = strArr3;
                    break;
                case 98:
                    strArr2[i] = str;
                    i = 100;
                    str = "\u007fD\u0013WS{H\nQO";
                    obj = 99;
                    strArr2 = strArr3;
                    break;
                case 99:
                    strArr2[i] = str;
                    i = 101;
                    str = "rH\u0017N\u000eyT\u0006]JhY\nPRn]\u000fR\u000eiH\u0002JTi\u0013\u0006LSuNNPN7O\u0017_UoO";
                    obj = 100;
                    strArr2 = strArr3;
                    break;
                case 100:
                    strArr2[i] = str;
                    i = 102;
                    str = "|S\u0011S@nc\u0014LNt[";
                    obj = 101;
                    strArr2 = strArr3;
                    break;
                case 101:
                    strArr2[i] = str;
                    i = 103;
                    str = "rH\u0017N\u000eyT\u0006]JhY\nPRn]\u000fR\u000ehY\u0010KMn\u0013\u0006LSuNLKOqR\fIO7O\u0017_UoOC";
                    obj = 102;
                    strArr2 = strArr3;
                    break;
                case 102:
                    strArr2[i] = str;
                    i = 104;
                    str = "uWCMU{H\u0016M\u0001xI\u0017\u001eLsO\u0010WO}\u001c\u0007_U{";
                    obj = 103;
                    strArr2 = strArr3;
                    break;
                case 103:
                    strArr2[i] = str;
                    i = 105;
                    str = "jN\n]DEY\u001bNHh]\u0017WNt";
                    obj = 104;
                    strArr2 = strArr3;
                    break;
                case 104:
                    strArr2[i] = str;
                    i = 106;
                    str = "tSCLDiL\fPR\u007f";
                    obj = 105;
                    strArr2 = strArr3;
                    break;
                case 105:
                    strArr2[i] = str;
                    i = 107;
                    str = "nS\faL{R\u001aaFoY\u0010MDi";
                    obj = 106;
                    strArr2 = strArr3;
                    break;
                case 106:
                    strArr2[i] = str;
                    i = 108;
                    str = "iQ\u0010";
                    obj = 107;
                    strArr2 = strArr3;
                    break;
                case 107:
                    strArr2[i] = str;
                    i = 109;
                    str = "rH\u0017N\u000ehY\u0012KDiH\u0000QE\u007f\u0013\u0011[RoP\u0017\u0011DhN\fL\u000ejN\fHH~Y\u0011\u0013TtN\fKU{^\u000f[";
                    obj = 108;
                    strArr2 = strArr3;
                    break;
                case 108:
                    strArr2[i] = str;
                    i = 110;
                    str = "rH\u0017N\u000eyT\u0006]JhY\nPRn]\u000fR\u000eiH\u0002JTi\u0013\u0006LSuNNMU{H\u0016M\fuWNPN7P\fYHt\u0011\fL\fjKNQS7Y\u001bNHh]\u0017WNt";
                    obj = 109;
                    strArr2 = strArr3;
                    break;
                case 109:
                    strArr2[i] = str;
                    i = 111;
                    str = "rH\u0017N\u000eyT\u0006]JhY\nPRn]\u000fR\u000eiH\u0002JTi\u0013\u0006FQsN\u0006Z\fxI\u0017\u0013Ou\u0011\u0006FQsN\u0002JHuR";
                    obj = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i] = str;
                    i = 112;
                    str = "rH\u0017N\u000ehY\u0012KDiH\u0000QE\u007f\u0013\u0010J@nI\u0010\u0011DhN\fL\ftSNMU{H\u0016M";
                    obj = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i] = str;
                    i = 113;
                    str = "vS\u0004WO";
                    obj = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i] = str;
                    i = 114;
                    str = "x]\u0007aQ{N\u0002S";
                    obj = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i] = str;
                    i = 115;
                    str = "tSCLDiL\fPR\u007f";
                    obj = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i] = str;
                    i = 116;
                    str = "iU\u000eaLt_";
                    obj = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i] = str;
                    i = 117;
                    str = "rH\u0017N\u000ehY\u0012KDiH\u0000QE\u007f\u0013\u0011[RoP\u0017\u0011DhN\fL\u000ejN\fHH~Y\u0011\u0013UsQ\u0006QTn";
                    obj = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i] = str;
                    i = 118;
                    str = "sX";
                    obj = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i] = str;
                    i = 119;
                    str = "jN\fHH~Y\u0011aTtN\fKU{^\u000f[";
                    obj = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i] = str;
                    i = 120;
                    str = "y]\rPNn\u001c\u0013_SiYCtrUrCXSuQCMDhJ\u0006L";
                    obj = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i] = str;
                    i = 121;
                    str = "rH\u0017N\u000ehY\u0012KDiH\u0000QE\u007f\u0013\u0011[RoP\u0017\u0011DhN\fL\u000ex]\u0007N@h]\u000e";
                    obj = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i] = str;
                    i = 122;
                    str = "\u007fD\u0013WS{H\nQO";
                    obj = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i] = str;
                    i = 123;
                    str = "vY\rYUr";
                    obj = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i] = str;
                    i = 124;
                    str = "rH\u0017N\u000ehY\u0012KDiH\u0000QE\u007f\u0013\u0011[RoP\u0017\u0011DhN\fL\u000eoR\bPNmRNMU{H\u0016M\u0001";
                    obj = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i] = str;
                    i = 125;
                    str = "lS\n]D";
                    obj = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i] = str;
                    i = 126;
                    str = "iY\u000fX";
                    obj = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i] = str;
                    i = 127;
                    str = "rH\u0017N\u000ehY\u0012KDiH\u0000QE\u007f\u0013\u0010KByY\u0010M\u000evY\rYUr\u0011\fL\fnU\u000e[\ftS\u0017\u0013GuI\rZ";
                    obj = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i] = str;
                    i = 128;
                    str = "rH\u0017N\u000ehY\u0012KDiH\u0000QE\u007f\u0013\u0006LSuNCMU{H\u0016M\u001c";
                    obj = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i] = str;
                    i = 129;
                    str = "v_";
                    obj = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i] = str;
                    i = 130;
                    str = "yS\u0007[";
                    obj = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i] = str;
                    i = 131;
                    str = "hY\u0017LXE]\u0005JDh";
                    obj = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i] = str;
                    i = 132;
                    str = "x]\u0007aUuW\u0006P";
                    obj = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i] = str;
                    i = 133;
                    str = "iY\rJ";
                    obj = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i] = str;
                    i = 134;
                    str = "rH\u0017N\u000ehY\u0012KDiH\u0000QE\u007f\u0013\u0011[RoP\u0017\u0011DhN\fL\u000etSNLNoH\u0006M";
                    obj = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i] = str;
                    i = 135;
                    str = "\u007fD\u0013WS\u007fXC\\Tn\u001c\u0006FQsN\u0002JHuRCWR:F\u0006LN";
                    obj = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i] = str;
                    i = 136;
                    str = "\u007fD\u0013WS{H\nQO";
                    obj = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i] = str;
                    i = 137;
                    str = "hY\u0017LXE]\u0005JDh";
                    obj = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i] = str;
                    i = 138;
                    str = "tS<LNoH\u0006M";
                    obj = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i] = str;
                    i = 139;
                    str = "sR";
                    obj = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i] = str;
                    i = 140;
                    str = "\u007fD\u0013WS\u007fX";
                    obj = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i] = str;
                    i = 141;
                    str = "w_\u0000";
                    obj = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i] = str;
                    i = 142;
                    str = "nS\faS\u007f_\u0006PU";
                    obj = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i] = str;
                    i = 143;
                    str = "v[";
                    obj = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i] = str;
                    i = 144;
                    str = "nY\u000eNNh]\u0011WMcc\u0016P@l]\nR@xP\u0006";
                    obj = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i] = str;
                    i = 145;
                    str = "hY\u0017LXE]\u0005JDh";
                    obj = 144;
                    strArr2 = strArr3;
                    break;
                case 144:
                    strArr2[i] = str;
                    i = 146;
                    str = "rH\u0017N\u000ehY\u0012KDiH\u0000QE\u007f\u0013\u0005_Hv\u0013\rQ\fhY\u0002MNt\u0011\u0004WW\u007fR";
                    obj = 145;
                    strArr2 = strArr3;
                    break;
                case 145:
                    strArr2[i] = str;
                    i = 147;
                    str = "hY\u0002MNt";
                    obj = 146;
                    strArr2 = strArr3;
                    break;
                case 146:
                    strArr2[i] = str;
                    i = 148;
                    str = "wR\u0000";
                    obj = 147;
                    strArr2 = strArr3;
                    break;
                case 147:
                    strArr2[i] = str;
                    i = 149;
                    str = "nS\faL{R\u001a";
                    obj = 148;
                    strArr2 = strArr3;
                    break;
                case 148:
                    strArr2[i] = str;
                    i = 150;
                    str = "rH\u0017N\u000ehY\u0012KDiH\u0000QE\u007f\u0013\u0011[RoP\u0017\u0011DhN\fL\u000exP\f]J\u007fX";
                    obj = 149;
                    strArr2 = strArr3;
                    break;
                case 149:
                    strArr2[i] = str;
                    i = 151;
                    str = "xP\f]J\u007fX";
                    obj = 150;
                    strArr2 = strArr3;
                    break;
                case 150:
                    strArr2[i] = str;
                    i = 152;
                    str = "jN\fHH~Y\u0011aUsQ\u0006QTn";
                    obj = 151;
                    strArr2 = strArr3;
                    break;
                case 151:
                    strArr2[i] = str;
                    i = 153;
                    str = "rH\u0017N\u000ehY\u0012KDiH\u0000QE\u007f\u0013\u0011[RoP\u0017\u0011DhN\fL\u000enS\f\u0013L{R\u001a\u0013@vPNSDnT\fZR";
                    obj = 152;
                    strArr2 = strArr3;
                    break;
                case 152:
                    strArr2[i] = str;
                    i = 154;
                    str = "hY\u0017LXE]\u0005JDh";
                    obj = 153;
                    strArr2 = strArr3;
                    break;
                case 153:
                    strArr2[i] = str;
                    i = 155;
                    str = "wU\u0010MHt[<N@h]\u000e";
                    obj = 154;
                    strArr2 = strArr3;
                    break;
                case 154:
                    strArr2[i] = str;
                    i = 156;
                    str = "rH\u0017N\u000ehY\u0012KDiH\u0000QE\u007f\u0013\u0011[RoP\u0017\u0011DhN\fL\u000ewU\u0010MHt[NN@h]\u000e";
                    obj = 155;
                    strArr2 = strArr3;
                    break;
                case 155:
                    strArr2[i] = str;
                    i = 157;
                    str = "wY\u0017VN~";
                    obj = 156;
                    strArr2 = strArr3;
                    break;
                case 156:
                    strArr2[i] = str;
                    i = 158;
                    str = "hY\u0002MNt";
                    obj = 157;
                    strArr2 = strArr3;
                    break;
                case 157:
                    strArr2[i] = str;
                    i = 159;
                    str = "nS\b[O";
                    obj = 158;
                    strArr2 = strArr3;
                    break;
                case 158:
                    strArr2[i] = str;
                    i = 160;
                    str = "iU\u000eaLy_";
                    obj = 159;
                    strArr2 = strArr3;
                    break;
                case 159:
                    strArr2[i] = str;
                    i = 161;
                    str = "rH\u0017N\u000ehY\u0012KDiH\u0000QE\u007f\u0013\u0011[RoP\u0017\u0011DhN\fL\u000ex]\u0007\u0013UuW\u0006P";
                    obj = 160;
                    strArr2 = strArr3;
                    break;
                case 160:
                    strArr2[i] = str;
                    i = 162;
                    str = "iH\u0002JTi";
                    obj = 161;
                    strArr2 = strArr3;
                    break;
                case 161:
                    strArr2[i] = str;
                    i = 163;
                    str = "uWCMU{H\u0016M\u0001xI\u0017\u001eMu[\nP\r:L\u0014\u0012\u0001uNC[YjU\u0011_UsS\r\u001eHi\u001c\rKMv";
                    obj = 162;
                    strArr2 = strArr3;
                    break;
                case 162:
                    strArr2[i] = str;
                    i = 164;
                    str = "hY\u0017LXE]\u0005JDh";
                    obj = 163;
                    strArr2 = strArr3;
                    break;
                case 163:
                    strArr2[i] = str;
                    i = 165;
                    str = "hY\u0017LXE]\u0005JDh";
                    obj = 164;
                    strArr2 = strArr3;
                    break;
                case 164:
                    strArr2[i] = str;
                    i = 166;
                    str = "y_";
                    obj = 165;
                    strArr2 = strArr3;
                    break;
                case 165:
                    strArr2[i] = str;
                    i = 167;
                    str = "wY\u0017VN~";
                    obj = 166;
                    strArr2 = strArr3;
                    break;
                case 166:
                    strArr2[i] = str;
                    i = 168;
                    str = "rH\u0017N\u000ehY\u0012KDiHL]N~YL_Un]\u0000VD~\u0013\rQ\fyS\u0007[\f|S\u0016PE";
                    obj = 167;
                    strArr2 = strArr3;
                    break;
                case 167:
                    strArr2[i] = str;
                    i = 169;
                    str = "tY\u001bJ~wY\u0017VN~";
                    obj = 168;
                    strArr2 = strArr3;
                    break;
                case 168:
                    strArr2[i] = str;
                    i = 170;
                    str = "rH\u0017N\u000ehY\u0012KDiH\u0000QE\u007f\u0013\u000e[UrS\u0007\u0011HvP\u0006Y@v\u001c";
                    obj = 169;
                    strArr2 = strArr3;
                    break;
                case 169:
                    strArr2[i] = str;
                    i = 171;
                    str = "{H\u0017_BrY\u0007";
                    obj = 170;
                    strArr2 = strArr3;
                    break;
                case 170:
                    strArr2[i] = str;
                    i = 172;
                    str = "|]\nR";
                    obj = 171;
                    strArr2 = strArr3;
                    break;
                case 171:
                    strArr2[i] = str;
                    i = 173;
                    str = "iU\u000ePTw";
                    obj = 172;
                    strArr2 = strArr3;
                    break;
                case 172:
                    strArr2[i] = str;
                    i = 174;
                    str = "uW";
                    obj = 173;
                    strArr2 = strArr3;
                    break;
                case 173:
                    strArr2[i] = str;
                    i = 175;
                    str = "tY\u0017INhW<L@~U\faUcL\u0006";
                    obj = 174;
                    strArr2 = strArr3;
                    break;
                case 174:
                    strArr2[i] = str;
                    i = 176;
                    str = "jK";
                    obj = 175;
                    strArr2 = strArr3;
                    break;
                case 175:
                    strArr2[i] = str;
                    i = 177;
                    str = "nS\faL{R\u001aa@vP<SDnT\fZR";
                    obj = 176;
                    strArr2 = strArr3;
                    break;
                case 176:
                    strArr2[i] = str;
                    i = 178;
                    str = "uP\u0007aW\u007fN\u0010WNt";
                    obj = 177;
                    strArr2 = strArr3;
                    break;
                case 177:
                    strArr2[i] = str;
                    i = 179;
                    str = "rH\u0017N\u000e\u007fR\u0017LXwY\u0017VN~\u0013\u0016PJtS\u0014P";
                    obj = 178;
                    strArr2 = strArr3;
                    break;
                case 178:
                    strArr2[i] = str;
                    i = 180;
                    str = "Oh%\u0013\u0019";
                    obj = 179;
                    strArr2 = strArr3;
                    break;
                case 179:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "rH\u0017N\u000elY\u0011WGc_\fZD5O\u0017_UoOL[ShS\u0011\u0013Rn]\u0017KR7S\b\u0013Ou\u0011\u000fQFsRNQS7L\u0014\u0013Nh\u0011\u0006FQsN\u0002JHuR";
                    obj = null;
                    break;
            }
        }
    }

    private static JSONObject a(InputStream inputStream) {
        Throwable e;
        int i = m3.d;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, z[180]));
            StringBuilder stringBuilder = new StringBuilder();
            String readLine = bufferedReader.readLine();
            while (readLine != null) {
                stringBuilder.append(readLine);
                readLine = bufferedReader.readLine();
                if (i != 0) {
                    break;
                }
            }
            return new JSONObject(stringBuilder.toString());
        } catch (IOException e2) {
            e = e2;
            Log.c(e);
            return null;
        } catch (JSONException e3) {
            e = e3;
            Log.c(e);
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.util.List r11) {
        /*
        r10 = 48;
        r2 = 0;
        r5 = com.whatsapp.m3.d;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = r11.iterator();
        r1 = r2;
    L_0x000f:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x00ab;
    L_0x0015:
        r0 = r7.next();
        r0 = (android.util.Pair) r0;
        r3 = r1 + 1;
        if (r1 != 0) goto L_0x0026;
    L_0x001f:
        r1 = 63;
        r6.append(r1);	 Catch:{ IllegalArgumentException -> 0x00b0 }
        if (r5 == 0) goto L_0x002b;
    L_0x0026:
        r1 = 38;
        r6.append(r1);	 Catch:{ IllegalArgumentException -> 0x00b0 }
    L_0x002b:
        r1 = r0.first;
        r1 = (java.lang.String) r1;
        r6.append(r1);
        r1 = 61;
        r6.append(r1);
        r4 = r2;
    L_0x0038:
        r1 = r0.second;
        r1 = (byte[]) r1;
        r1 = r1.length;
        if (r4 >= r1) goto L_0x00a9;
    L_0x003f:
        r1 = r0.second;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r1 = (byte[]) r1;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x00b2 }
        if (r1 < r10) goto L_0x0051;
    L_0x0047:
        r1 = r0.second;	 Catch:{ IllegalArgumentException -> 0x00b4 }
        r1 = (byte[]) r1;	 Catch:{ IllegalArgumentException -> 0x00b4 }
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x00b4 }
        r8 = 57;
        if (r1 <= r8) goto L_0x0079;
    L_0x0051:
        r1 = r0.second;	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r1 = (byte[]) r1;	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r8 = 65;
        if (r1 < r8) goto L_0x0065;
    L_0x005b:
        r1 = r0.second;	 Catch:{ IllegalArgumentException -> 0x00b8 }
        r1 = (byte[]) r1;	 Catch:{ IllegalArgumentException -> 0x00b8 }
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x00b8 }
        r8 = 90;
        if (r1 <= r8) goto L_0x0079;
    L_0x0065:
        r1 = r0.second;	 Catch:{ IllegalArgumentException -> 0x00ba }
        r1 = (byte[]) r1;	 Catch:{ IllegalArgumentException -> 0x00ba }
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x00ba }
        r8 = 97;
        if (r1 < r8) goto L_0x0085;
    L_0x006f:
        r1 = r0.second;	 Catch:{ IllegalArgumentException -> 0x00bc }
        r1 = (byte[]) r1;	 Catch:{ IllegalArgumentException -> 0x00bc }
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x00bc }
        r8 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r1 > r8) goto L_0x0085;
    L_0x0079:
        r1 = r0.second;	 Catch:{ IllegalArgumentException -> 0x00bc }
        r1 = (byte[]) r1;	 Catch:{ IllegalArgumentException -> 0x00bc }
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x00bc }
        r1 = (char) r1;	 Catch:{ IllegalArgumentException -> 0x00bc }
        r6.append(r1);	 Catch:{ IllegalArgumentException -> 0x00bc }
        if (r5 == 0) goto L_0x00a5;
    L_0x0085:
        r1 = 37;
        r6.append(r1);
        r1 = r0.second;
        r1 = (byte[]) r1;
        r1 = r1[r4];
        r1 = r1 & 255;
        r1 = java.lang.Integer.toHexString(r1);
        r8 = r1.length();	 Catch:{ IllegalArgumentException -> 0x00be }
        r9 = 1;
        if (r8 != r9) goto L_0x00a2;
    L_0x009d:
        r8 = 48;
        r6.append(r8);	 Catch:{ IllegalArgumentException -> 0x00be }
    L_0x00a2:
        r6.append(r1);
    L_0x00a5:
        r1 = r4 + 1;
        if (r5 == 0) goto L_0x00c3;
    L_0x00a9:
        if (r5 == 0) goto L_0x00c0;
    L_0x00ab:
        r0 = r6.toString();
        return r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b8 }
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ba }
    L_0x00ba:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00bc }
    L_0x00bc:
        r0 = move-exception;
        throw r0;
    L_0x00be:
        r0 = move-exception;
        throw r0;
    L_0x00c0:
        r1 = r3;
        goto L_0x000f;
    L_0x00c3:
        r4 = r1;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fm.a(java.util.List):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashMap a() {
        /*
        r2 = com.whatsapp.m3.d;
        r1 = new java.util.HashMap;
        r1.<init>();
        r0 = new org.apache.http.client.methods.HttpGet;
        r3 = com.whatsapp.ce.c;
        r0.<init>(r3);
        r3 = new org.apache.http.params.BasicHttpParams;
        r3.<init>();
        r4 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r3, r4);
        r4 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        org.apache.http.params.HttpConnectionParams.setSoTimeout(r3, r4);
        r4 = com.whatsapp.ak9.a();
        org.apache.http.params.HttpProtocolParams.setUserAgent(r3, r4);
        r4 = new org.apache.http.impl.client.DefaultHttpClient;
        r4.<init>(r3);
        r3 = org.apache.http.protocol.RequestExpectContinue.class;
        r4.removeRequestInterceptorByClass(r3);
        r0 = r4.execute(r0);
        r3 = r0.getStatusLine();
        r3 = r3.getStatusCode();
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r3 == r4) goto L_0x005c;
    L_0x003e:
        r0 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x005a }
        r0.<init>();	 Catch:{ JSONException -> 0x005a }
        r2 = z;	 Catch:{ JSONException -> 0x005a }
        r4 = 50;
        r2 = r2[r4];	 Catch:{ JSONException -> 0x005a }
        r0 = r0.append(r2);	 Catch:{ JSONException -> 0x005a }
        r0 = r0.append(r3);	 Catch:{ JSONException -> 0x005a }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x005a }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x005a }
        r0 = r1;
    L_0x0059:
        return r0;
    L_0x005a:
        r0 = move-exception;
        throw r0;
    L_0x005c:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = new java.io.InputStreamReader;
        r0 = r0.getEntity();
        r0 = r0.getContent();
        r5 = z;
        r6 = 49;
        r5 = r5[r6];
        r4.<init>(r0, r5);
        r0 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r0 = new char[r0];
    L_0x0078:
        r5 = r4.read(r0);
        if (r5 < 0) goto L_0x0084;
    L_0x007e:
        r6 = 0;
        r3.append(r0, r6, r5);
        if (r2 == 0) goto L_0x0078;
    L_0x0084:
        r4.close();
        r0 = r3.toString();
        r3 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0105 }
        r3.<init>(r0);	 Catch:{ JSONException -> 0x0105 }
        r4 = r3.keys();	 Catch:{ JSONException -> 0x0105 }
    L_0x0094:
        r0 = r4.hasNext();	 Catch:{ JSONException -> 0x0105 }
        if (r0 == 0) goto L_0x00fa;
    L_0x009a:
        r0 = r4.next();	 Catch:{ JSONException -> 0x0105 }
        r0 = (java.lang.String) r0;	 Catch:{ JSONException -> 0x0105 }
        r5 = r3.getJSONObject(r0);	 Catch:{ JSONException -> 0x0105 }
        r6 = z;	 Catch:{ JSONException -> 0x0105 }
        r7 = 44;
        r6 = r6[r7];	 Catch:{ JSONException -> 0x0105 }
        r5 = r5.getString(r6);	 Catch:{ JSONException -> 0x0105 }
        r6 = z;	 Catch:{ JSONException -> 0x00fd }
        r7 = 47;
        r6 = r6[r7];	 Catch:{ JSONException -> 0x00fd }
        r6 = r6.equals(r5);	 Catch:{ JSONException -> 0x00fd }
        if (r6 == 0) goto L_0x00c1;
    L_0x00ba:
        r6 = java.lang.Boolean.FALSE;	 Catch:{ JSONException -> 0x00fd }
        r1.put(r0, r6);	 Catch:{ JSONException -> 0x00fd }
        if (r2 == 0) goto L_0x00f8;
    L_0x00c1:
        r6 = z;	 Catch:{ JSONException -> 0x00ff }
        r7 = 45;
        r6 = r6[r7];	 Catch:{ JSONException -> 0x00ff }
        r6 = r6.equals(r5);	 Catch:{ JSONException -> 0x00ff }
        if (r6 == 0) goto L_0x00d4;
    L_0x00cd:
        r6 = java.lang.Boolean.TRUE;	 Catch:{ JSONException -> 0x0101 }
        r1.put(r0, r6);	 Catch:{ JSONException -> 0x0101 }
        if (r2 == 0) goto L_0x00f8;
    L_0x00d4:
        r6 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0103 }
        r6.<init>();	 Catch:{ JSONException -> 0x0103 }
        r7 = z;	 Catch:{ JSONException -> 0x0103 }
        r8 = 48;
        r7 = r7[r8];	 Catch:{ JSONException -> 0x0103 }
        r6 = r6.append(r7);	 Catch:{ JSONException -> 0x0103 }
        r0 = r6.append(r0);	 Catch:{ JSONException -> 0x0103 }
        r6 = "=";
        r0 = r0.append(r6);	 Catch:{ JSONException -> 0x0103 }
        r0 = r0.append(r5);	 Catch:{ JSONException -> 0x0103 }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x0103 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x0103 }
    L_0x00f8:
        if (r2 == 0) goto L_0x0094;
    L_0x00fa:
        r0 = r1;
        goto L_0x0059;
    L_0x00fd:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x00ff }
    L_0x00ff:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0101 }
    L_0x0101:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0103 }
    L_0x0103:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0105 }
    L_0x0105:
        r0 = move-exception;
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ JSONException -> 0x0118 }
        r2 = 9;
        if (r1 < r2) goto L_0x011a;
    L_0x010c:
        r1 = new java.io.IOException;	 Catch:{ JSONException -> 0x0118 }
        r2 = z;	 Catch:{ JSONException -> 0x0118 }
        r3 = 46;
        r2 = r2[r3];	 Catch:{ JSONException -> 0x0118 }
        r1.<init>(r2, r0);	 Catch:{ JSONException -> 0x0118 }
        throw r1;	 Catch:{ JSONException -> 0x0118 }
    L_0x0118:
        r0 = move-exception;
        throw r0;
    L_0x011a:
        r1 = new java.io.IOException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 51;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fm.a():java.util.HashMap");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.de a(java.lang.String r10, java.lang.String r11, java.lang.String r12, com.whatsapp.util.a0 r13, com.whatsapp.util.a0 r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
        /*
        r2 = com.whatsapp.m3.d;
        r1 = com.whatsapp.azl.b();
        r3 = com.whatsapp.azl.a();
        if (r10 == 0) goto L_0x00a8;
    L_0x000c:
        r0 = 1;
    L_0x000d:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00ab }
        if (r11 == 0) goto L_0x00ad;
    L_0x0012:
        r0 = 1;
    L_0x0013:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00b0 }
        if (r12 == 0) goto L_0x00b2;
    L_0x0018:
        r0 = 1;
    L_0x0019:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00b5 }
        if (r3 == 0) goto L_0x00b7;
    L_0x001e:
        r0 = 1;
    L_0x001f:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00ba }
        if (r1 == 0) goto L_0x00bc;
    L_0x0024:
        r0 = 1;
    L_0x0025:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00bf }
        if (r13 == 0) goto L_0x00c1;
    L_0x002a:
        r0 = 1;
    L_0x002b:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00c4 }
        r0 = r13.a();	 Catch:{ JSONException -> 0x00c4 }
        if (r0 == 0) goto L_0x00c6;
    L_0x0034:
        r0 = 1;
    L_0x0035:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00c9 }
        r0 = r13.b();	 Catch:{ JSONException -> 0x00c9 }
        if (r0 == 0) goto L_0x00cb;
    L_0x003e:
        r0 = 1;
    L_0x003f:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00ce }
        if (r14 == 0) goto L_0x00d0;
    L_0x0044:
        r0 = 1;
    L_0x0045:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00d3 }
        r0 = r14.a();	 Catch:{ JSONException -> 0x00d3 }
        if (r0 == 0) goto L_0x00d5;
    L_0x004e:
        r0 = 1;
    L_0x004f:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00d8 }
        r0 = r14.b();	 Catch:{ JSONException -> 0x00d8 }
        if (r0 == 0) goto L_0x00da;
    L_0x0058:
        r0 = 1;
    L_0x0059:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00dd }
        r0 = z;	 Catch:{ JSONException -> 0x00dd }
        r4 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r0 = r0[r4];	 Catch:{ JSONException -> 0x00dd }
        r0 = r15.equals(r0);	 Catch:{ JSONException -> 0x00dd }
        if (r0 != 0) goto L_0x00e1;
    L_0x0068:
        r0 = z;	 Catch:{ JSONException -> 0x00dd }
        r4 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r0 = r0[r4];	 Catch:{ JSONException -> 0x00dd }
        r0 = r15.equals(r0);	 Catch:{ JSONException -> 0x00dd }
        if (r0 != 0) goto L_0x00e1;
    L_0x0074:
        r0 = z;	 Catch:{ JSONException -> 0x00df }
        r4 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r0 = r0[r4];	 Catch:{ JSONException -> 0x00df }
        r0 = r15.equals(r0);	 Catch:{ JSONException -> 0x00df }
        if (r0 != 0) goto L_0x00e1;
    L_0x0080:
        r0 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x00a6 }
        r0.<init>();	 Catch:{ JSONException -> 0x00a6 }
        r1 = z;	 Catch:{ JSONException -> 0x00a6 }
        r2 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r1 = r1[r2];	 Catch:{ JSONException -> 0x00a6 }
        r0 = r0.append(r1);	 Catch:{ JSONException -> 0x00a6 }
        r0 = r0.append(r15);	 Catch:{ JSONException -> 0x00a6 }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x00a6 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x00a6 }
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ JSONException -> 0x00a6 }
        r1 = z;	 Catch:{ JSONException -> 0x00a6 }
        r2 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        r1 = r1[r2];	 Catch:{ JSONException -> 0x00a6 }
        r0.<init>(r1);	 Catch:{ JSONException -> 0x00a6 }
        throw r0;	 Catch:{ JSONException -> 0x00a6 }
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r0 = 0;
        goto L_0x000d;
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r0 = 0;
        goto L_0x0013;
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r0 = 0;
        goto L_0x0019;
    L_0x00b5:
        r0 = move-exception;
        throw r0;
    L_0x00b7:
        r0 = 0;
        goto L_0x001f;
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r0 = 0;
        goto L_0x0025;
    L_0x00bf:
        r0 = move-exception;
        throw r0;
    L_0x00c1:
        r0 = 0;
        goto L_0x002b;
    L_0x00c4:
        r0 = move-exception;
        throw r0;
    L_0x00c6:
        r0 = 0;
        goto L_0x0035;
    L_0x00c9:
        r0 = move-exception;
        throw r0;
    L_0x00cb:
        r0 = 0;
        goto L_0x003f;
    L_0x00ce:
        r0 = move-exception;
        throw r0;
    L_0x00d0:
        r0 = 0;
        goto L_0x0045;
    L_0x00d3:
        r0 = move-exception;
        throw r0;
    L_0x00d5:
        r0 = 0;
        goto L_0x004f;
    L_0x00d8:
        r0 = move-exception;
        throw r0;
    L_0x00da:
        r0 = 0;
        goto L_0x0059;
    L_0x00dd:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x00df }
    L_0x00df:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x00a6 }
    L_0x00e1:
        if (r17 == 0) goto L_0x0232;
    L_0x00e3:
        r0 = 1;
    L_0x00e4:
        com.whatsapp.util.Log.b(r0);
        r4 = com.whatsapp.App.k(r11);
        r0 = com.whatsapp.a54.f(r4);
        if (r0 != 0) goto L_0x00f8;
    L_0x00f1:
        r0 = com.whatsapp.a54.e();
        com.whatsapp.a54.c(r0, r4);
    L_0x00f8:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = z;	 Catch:{ JSONException -> 0x0235 }
        r6 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r5 = r5[r6];	 Catch:{ JSONException -> 0x0235 }
        r6 = r10.getBytes();	 Catch:{ JSONException -> 0x0235 }
        r5 = android.util.Pair.create(r5, r6);	 Catch:{ JSONException -> 0x0235 }
        r4.add(r5);	 Catch:{ JSONException -> 0x0235 }
        r5 = z;	 Catch:{ JSONException -> 0x0235 }
        r6 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r5 = r5[r6];	 Catch:{ JSONException -> 0x0235 }
        r6 = r12.getBytes();	 Catch:{ JSONException -> 0x0235 }
        r5 = android.util.Pair.create(r5, r6);	 Catch:{ JSONException -> 0x0235 }
        r4.add(r5);	 Catch:{ JSONException -> 0x0235 }
        r5 = z;	 Catch:{ JSONException -> 0x0235 }
        r6 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r5 = r5[r6];	 Catch:{ JSONException -> 0x0235 }
        r0 = android.util.Pair.create(r5, r0);	 Catch:{ JSONException -> 0x0235 }
        r4.add(r0);	 Catch:{ JSONException -> 0x0235 }
        r0 = z;	 Catch:{ JSONException -> 0x0235 }
        r5 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0235 }
        r3 = r3.getBytes();	 Catch:{ JSONException -> 0x0235 }
        r0 = android.util.Pair.create(r0, r3);	 Catch:{ JSONException -> 0x0235 }
        r4.add(r0);	 Catch:{ JSONException -> 0x0235 }
        r0 = z;	 Catch:{ JSONException -> 0x0235 }
        r3 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x0235 }
        r1 = r1.getBytes();	 Catch:{ JSONException -> 0x0235 }
        r0 = android.util.Pair.create(r0, r1);	 Catch:{ JSONException -> 0x0235 }
        r4.add(r0);	 Catch:{ JSONException -> 0x0235 }
        r0 = z;	 Catch:{ JSONException -> 0x0235 }
        r1 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        r0 = r0[r1];	 Catch:{ JSONException -> 0x0235 }
        r1 = r13.a();	 Catch:{ JSONException -> 0x0235 }
        r1 = r1.getBytes();	 Catch:{ JSONException -> 0x0235 }
        r0 = android.util.Pair.create(r0, r1);	 Catch:{ JSONException -> 0x0235 }
        r4.add(r0);	 Catch:{ JSONException -> 0x0235 }
        r0 = z;	 Catch:{ JSONException -> 0x0235 }
        r1 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r0 = r0[r1];	 Catch:{ JSONException -> 0x0235 }
        r1 = r13.b();	 Catch:{ JSONException -> 0x0235 }
        r1 = r1.getBytes();	 Catch:{ JSONException -> 0x0235 }
        r0 = android.util.Pair.create(r0, r1);	 Catch:{ JSONException -> 0x0235 }
        r4.add(r0);	 Catch:{ JSONException -> 0x0235 }
        r0 = z;	 Catch:{ JSONException -> 0x0235 }
        r1 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r0 = r0[r1];	 Catch:{ JSONException -> 0x0235 }
        r1 = r14.a();	 Catch:{ JSONException -> 0x0235 }
        r1 = r1.getBytes();	 Catch:{ JSONException -> 0x0235 }
        r0 = android.util.Pair.create(r0, r1);	 Catch:{ JSONException -> 0x0235 }
        r4.add(r0);	 Catch:{ JSONException -> 0x0235 }
        r0 = z;	 Catch:{ JSONException -> 0x0235 }
        r1 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r0 = r0[r1];	 Catch:{ JSONException -> 0x0235 }
        r1 = r14.b();	 Catch:{ JSONException -> 0x0235 }
        r1 = r1.getBytes();	 Catch:{ JSONException -> 0x0235 }
        r0 = android.util.Pair.create(r0, r1);	 Catch:{ JSONException -> 0x0235 }
        r4.add(r0);	 Catch:{ JSONException -> 0x0235 }
        r0 = z;	 Catch:{ JSONException -> 0x0235 }
        r1 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r0 = r0[r1];	 Catch:{ JSONException -> 0x0235 }
        r1 = r15.getBytes();	 Catch:{ JSONException -> 0x0235 }
        r0 = android.util.Pair.create(r0, r1);	 Catch:{ JSONException -> 0x0235 }
        r4.add(r0);	 Catch:{ JSONException -> 0x0235 }
        r0 = z;	 Catch:{ JSONException -> 0x0235 }
        r1 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r0 = r0[r1];	 Catch:{ JSONException -> 0x0235 }
        r1 = r16.getBytes();	 Catch:{ JSONException -> 0x0235 }
        r0 = android.util.Pair.create(r0, r1);	 Catch:{ JSONException -> 0x0235 }
        r4.add(r0);	 Catch:{ JSONException -> 0x0235 }
        r0 = z;	 Catch:{ JSONException -> 0x0235 }
        r1 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r0 = r0[r1];	 Catch:{ JSONException -> 0x0235 }
        r1 = r17.getBytes();	 Catch:{ JSONException -> 0x0235 }
        r0 = android.util.Pair.create(r0, r1);	 Catch:{ JSONException -> 0x0235 }
        r4.add(r0);	 Catch:{ JSONException -> 0x0235 }
        r0 = z;	 Catch:{ JSONException -> 0x0235 }
        r1 = 175; // 0xaf float:2.45E-43 double:8.65E-322;
        r0 = r0[r1];	 Catch:{ JSONException -> 0x0235 }
        r1 = com.whatsapp.ak4.c();	 Catch:{ JSONException -> 0x0235 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ JSONException -> 0x0235 }
        r1 = r1.getBytes();	 Catch:{ JSONException -> 0x0235 }
        r0 = android.util.Pair.create(r0, r1);	 Catch:{ JSONException -> 0x0235 }
        r4.add(r0);	 Catch:{ JSONException -> 0x0235 }
        r0 = z;	 Catch:{ JSONException -> 0x0235 }
        r1 = 173; // 0xad float:2.42E-43 double:8.55E-322;
        r1 = r0[r1];	 Catch:{ JSONException -> 0x0235 }
        r0 = b();	 Catch:{ JSONException -> 0x0235 }
        if (r0 == 0) goto L_0x0237;
    L_0x01fa:
        r0 = "1";
    L_0x01fc:
        r0 = r0.getBytes();
        r0 = android.util.Pair.create(r1, r0);
        r4.add(r0);
        r0 = a(r4);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = com.whatsapp.ce.l;
        r1 = r1.append(r3);
        r0 = r1.append(r0);
        r0 = r0.toString();
        r0 = com.whatsapp.ama.a(r0);
        if (r0 != 0) goto L_0x023a;
    L_0x0224:
        r0 = new java.io.IOException;	 Catch:{ JSONException -> 0x0230 }
        r1 = z;	 Catch:{ JSONException -> 0x0230 }
        r2 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r1 = r1[r2];	 Catch:{ JSONException -> 0x0230 }
        r0.<init>(r1);	 Catch:{ JSONException -> 0x0230 }
        throw r0;	 Catch:{ JSONException -> 0x0230 }
    L_0x0230:
        r0 = move-exception;
        throw r0;
    L_0x0232:
        r0 = 0;
        goto L_0x00e4;
    L_0x0235:
        r0 = move-exception;
        throw r0;
    L_0x0237:
        r0 = "0";
        goto L_0x01fc;
    L_0x023a:
        r1 = r0.getStatusLine();
        r1 = r1.getStatusCode();
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r1 == r3) goto L_0x026a;
    L_0x0246:
        r0 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0268 }
        r0.<init>();	 Catch:{ JSONException -> 0x0268 }
        r2 = z;	 Catch:{ JSONException -> 0x0268 }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r2 = r2[r3];	 Catch:{ JSONException -> 0x0268 }
        r0 = r0.append(r2);	 Catch:{ JSONException -> 0x0268 }
        r0 = r0.append(r1);	 Catch:{ JSONException -> 0x0268 }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x0268 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x0268 }
        r0 = new com.whatsapp.de;	 Catch:{ JSONException -> 0x0268 }
        r1 = com.whatsapp.avc.ERROR_UNSPECIFIED;	 Catch:{ JSONException -> 0x0268 }
        r0.<init>(r1);	 Catch:{ JSONException -> 0x0268 }
    L_0x0267:
        return r0;
    L_0x0268:
        r0 = move-exception;
        throw r0;
    L_0x026a:
        r0 = r0.getEntity();
        r0 = r0.getContent();
        r3 = a(r0);
        if (r3 != 0) goto L_0x0286;
    L_0x0278:
        r0 = new org.json.JSONException;	 Catch:{ JSONException -> 0x0284 }
        r1 = z;	 Catch:{ JSONException -> 0x0284 }
        r2 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r1 = r1[r2];	 Catch:{ JSONException -> 0x0284 }
        r0.<init>(r1);	 Catch:{ JSONException -> 0x0284 }
        throw r0;	 Catch:{ JSONException -> 0x0284 }
    L_0x0284:
        r0 = move-exception;
        throw r0;
    L_0x0286:
        r1 = new com.whatsapp.de;
        r0 = com.whatsapp.avc.ERROR_UNSPECIFIED;
        r1.<init>(r0);
        r0 = z;
        r4 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        r0 = r0[r4];
        r4 = r3.getString(r0);
        if (r4 != 0) goto L_0x02a4;
    L_0x0299:
        r0 = z;	 Catch:{ JSONException -> 0x02ef }
        r5 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x02ef }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x02ef }
        if (r2 == 0) goto L_0x0375;
    L_0x02a4:
        r0 = z;	 Catch:{ JSONException -> 0x02f1 }
        r5 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x02f1 }
        r0 = r4.equals(r0);	 Catch:{ JSONException -> 0x02f1 }
        if (r0 == 0) goto L_0x0304;
    L_0x02b0:
        r0 = z;
        r5 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r0 = r0[r5];
        r0 = r3.getString(r0);
        r5 = z;
        r6 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r5 = r5[r6];
        r5 = r3.getString(r5);
        r6 = z;
        r7 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r6 = r6[r7];
        r6 = r3.getLong(r6);
        if (r0 == 0) goto L_0x02d8;
    L_0x02d0:
        if (r5 == 0) goto L_0x02d8;
    L_0x02d2:
        r8 = 0;
        r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r8 != 0) goto L_0x02f3;
    L_0x02d8:
        r0 = z;	 Catch:{ JSONException -> 0x02ed }
        r1 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r0 = r0[r1];	 Catch:{ JSONException -> 0x02ed }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x02ed }
        r0 = new java.io.IOException;	 Catch:{ JSONException -> 0x02ed }
        r1 = z;	 Catch:{ JSONException -> 0x02ed }
        r2 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r1 = r1[r2];	 Catch:{ JSONException -> 0x02ed }
        r0.<init>(r1);	 Catch:{ JSONException -> 0x02ed }
        throw r0;	 Catch:{ JSONException -> 0x02ed }
    L_0x02ed:
        r0 = move-exception;
        throw r0;
    L_0x02ef:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x02f1 }
    L_0x02f1:
        r0 = move-exception;
        throw r0;
    L_0x02f3:
        r8 = com.whatsapp.avc.OK;	 Catch:{ JSONException -> 0x0337 }
        r1.f = r8;	 Catch:{ JSONException -> 0x0337 }
        r1.g = r0;	 Catch:{ JSONException -> 0x0337 }
        r0 = 0;
        r0 = android.backport.util.Base64.decode(r5, r0);	 Catch:{ JSONException -> 0x0337 }
        r1.e = r0;	 Catch:{ JSONException -> 0x0337 }
        r1.b = r6;	 Catch:{ JSONException -> 0x0337 }
        if (r2 == 0) goto L_0x0375;
    L_0x0304:
        r0 = z;	 Catch:{ JSONException -> 0x0337 }
        r5 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0337 }
        r0 = r4.equals(r0);	 Catch:{ JSONException -> 0x0337 }
        if (r0 == 0) goto L_0x0341;
    L_0x0310:
        r0 = z;
        r5 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r0 = r0[r5];
        r6 = r3.getLong(r0);
        r8 = 0;
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 != 0) goto L_0x0339;
    L_0x0320:
        r0 = z;	 Catch:{ JSONException -> 0x0335 }
        r1 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r0 = r0[r1];	 Catch:{ JSONException -> 0x0335 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x0335 }
        r0 = new java.io.IOException;	 Catch:{ JSONException -> 0x0335 }
        r1 = z;	 Catch:{ JSONException -> 0x0335 }
        r2 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        r1 = r1[r2];	 Catch:{ JSONException -> 0x0335 }
        r0.<init>(r1);	 Catch:{ JSONException -> 0x0335 }
        throw r0;	 Catch:{ JSONException -> 0x0335 }
    L_0x0335:
        r0 = move-exception;
        throw r0;
    L_0x0337:
        r0 = move-exception;
        throw r0;
    L_0x0339:
        r0 = com.whatsapp.avc.EXPIRED;	 Catch:{ JSONException -> 0x0378 }
        r1.f = r0;	 Catch:{ JSONException -> 0x0378 }
        r1.b = r6;	 Catch:{ JSONException -> 0x0378 }
        if (r2 == 0) goto L_0x0375;
    L_0x0341:
        r0 = z;	 Catch:{ JSONException -> 0x0378 }
        r5 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0378 }
        r0 = r4.equals(r0);	 Catch:{ JSONException -> 0x0378 }
        if (r0 == 0) goto L_0x038c;
    L_0x034d:
        r0 = z;	 Catch:{ JSONException -> 0x037a }
        r5 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x037a }
        r0 = r3.getInt(r0);	 Catch:{ JSONException -> 0x037a }
        r1.d = r0;	 Catch:{ JSONException -> 0x037a }
        r0 = z;	 Catch:{ JSONException -> 0x037a }
        r5 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x037a }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x037a }
        if (r0 == 0) goto L_0x0574;
    L_0x0365:
        r0 = z;	 Catch:{ JSONException -> 0x037a }
        r5 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x037a }
        r0 = r3.getString(r0);	 Catch:{ JSONException -> 0x037a }
    L_0x036f:
        r1.c = r0;	 Catch:{ JSONException -> 0x037c }
        r0 = com.whatsapp.avc.YES;	 Catch:{ JSONException -> 0x037c }
        r1.f = r0;	 Catch:{ JSONException -> 0x037c }
    L_0x0375:
        r0 = r1;
        goto L_0x0267;
    L_0x0378:
        r0 = move-exception;
        throw r0;
    L_0x037a:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x037c }
    L_0x037c:
        r0 = move-exception;
        r0 = z;	 Catch:{ JSONException -> 0x0577 }
        r5 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0577 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ JSONException -> 0x0577 }
        r0 = com.whatsapp.avc.ERROR_UNSPECIFIED;	 Catch:{ JSONException -> 0x0577 }
        r1.f = r0;	 Catch:{ JSONException -> 0x0577 }
        if (r2 == 0) goto L_0x0375;
    L_0x038c:
        r0 = z;	 Catch:{ JSONException -> 0x0577 }
        r5 = 171; // 0xab float:2.4E-43 double:8.45E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0577 }
        r0 = r4.equals(r0);	 Catch:{ JSONException -> 0x0577 }
        if (r0 == 0) goto L_0x03d3;
    L_0x0398:
        r0 = z;
        r5 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r0 = r0[r5];
        r0 = r3.getString(r0);
        if (r0 != 0) goto L_0x03b3;
    L_0x03a4:
        r5 = z;	 Catch:{ JSONException -> 0x0579 }
        r6 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r5 = r5[r6];	 Catch:{ JSONException -> 0x0579 }
        com.whatsapp.util.Log.w(r5);	 Catch:{ JSONException -> 0x0579 }
        r5 = com.whatsapp.avc.ERROR_UNSPECIFIED;	 Catch:{ JSONException -> 0x0579 }
        r1.f = r5;	 Catch:{ JSONException -> 0x0579 }
        if (r2 == 0) goto L_0x03d1;
    L_0x03b3:
        r5 = com.whatsapp.avc.YES_WITH_CODE;	 Catch:{ JSONException -> 0x057b }
        r1.f = r5;	 Catch:{ JSONException -> 0x057b }
        r1.a = r0;	 Catch:{ JSONException -> 0x057b }
        r0 = z;	 Catch:{ JSONException -> 0x057b }
        r5 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x057b }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x057b }
        if (r0 == 0) goto L_0x057d;
    L_0x03c5:
        r0 = z;	 Catch:{ JSONException -> 0x057b }
        r5 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x057b }
        r0 = r3.getString(r0);	 Catch:{ JSONException -> 0x057b }
    L_0x03cf:
        r1.c = r0;
    L_0x03d1:
        if (r2 == 0) goto L_0x0375;
    L_0x03d3:
        r0 = z;	 Catch:{ JSONException -> 0x0580 }
        r5 = 172; // 0xac float:2.41E-43 double:8.5E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0580 }
        r0 = r4.equals(r0);	 Catch:{ JSONException -> 0x0580 }
        if (r0 == 0) goto L_0x0556;
    L_0x03df:
        r0 = z;
        r5 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r0 = r0[r5];
        r5 = r3.getString(r0);
        r0 = z;	 Catch:{ JSONException -> 0x0582 }
        r6 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        r0 = r0[r6];	 Catch:{ JSONException -> 0x0582 }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x0582 }
        if (r0 == 0) goto L_0x0584;
    L_0x03f5:
        r0 = z;	 Catch:{ JSONException -> 0x0582 }
        r6 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        r0 = r0[r6];	 Catch:{ JSONException -> 0x0582 }
        r0 = r3.getString(r0);	 Catch:{ JSONException -> 0x0582 }
    L_0x03ff:
        r1.c = r0;	 Catch:{ JSONException -> 0x0587 }
        if (r5 != 0) goto L_0x0412;
    L_0x0403:
        r0 = z;	 Catch:{ JSONException -> 0x0589 }
        r3 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x0589 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ JSONException -> 0x0589 }
        r0 = com.whatsapp.avc.ERROR_UNSPECIFIED;	 Catch:{ JSONException -> 0x0589 }
        r1.f = r0;	 Catch:{ JSONException -> 0x0589 }
        if (r2 == 0) goto L_0x0554;
    L_0x0412:
        r0 = z;	 Catch:{ JSONException -> 0x058b }
        r3 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x058b }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x058b }
        if (r0 == 0) goto L_0x0424;
    L_0x041e:
        r0 = com.whatsapp.avc.ERROR_TOO_RECENT;	 Catch:{ JSONException -> 0x058d }
        r1.f = r0;	 Catch:{ JSONException -> 0x058d }
        if (r2 == 0) goto L_0x0554;
    L_0x0424:
        r0 = z;	 Catch:{ JSONException -> 0x058f }
        r3 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x058f }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x058f }
        if (r0 == 0) goto L_0x0436;
    L_0x0430:
        r0 = com.whatsapp.avc.ERROR_TOO_MANY;	 Catch:{ JSONException -> 0x0591 }
        r1.f = r0;	 Catch:{ JSONException -> 0x0591 }
        if (r2 == 0) goto L_0x0554;
    L_0x0436:
        r0 = z;	 Catch:{ JSONException -> 0x0593 }
        r3 = 178; // 0xb2 float:2.5E-43 double:8.8E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x0593 }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x0593 }
        if (r0 == 0) goto L_0x0448;
    L_0x0442:
        r0 = com.whatsapp.avc.ERROR_OLD_VERSION;	 Catch:{ JSONException -> 0x0595 }
        r1.f = r0;	 Catch:{ JSONException -> 0x0595 }
        if (r2 == 0) goto L_0x0554;
    L_0x0448:
        r0 = z;	 Catch:{ JSONException -> 0x0597 }
        r3 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x0597 }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x0597 }
        if (r0 == 0) goto L_0x045a;
    L_0x0454:
        r0 = com.whatsapp.avc.ERROR_TEMPORARILY_UNAVAILABLE;	 Catch:{ JSONException -> 0x0599 }
        r1.f = r0;	 Catch:{ JSONException -> 0x0599 }
        if (r2 == 0) goto L_0x0554;
    L_0x045a:
        r0 = z;	 Catch:{ JSONException -> 0x059b }
        r3 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x059b }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x059b }
        if (r0 == 0) goto L_0x046c;
    L_0x0466:
        r0 = com.whatsapp.avc.ERROR_NEXT_METHOD;	 Catch:{ JSONException -> 0x059d }
        r1.f = r0;	 Catch:{ JSONException -> 0x059d }
        if (r2 == 0) goto L_0x0554;
    L_0x046c:
        r0 = z;	 Catch:{ JSONException -> 0x059f }
        r3 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x059f }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x059f }
        if (r0 == 0) goto L_0x047e;
    L_0x0478:
        r0 = com.whatsapp.avc.ERROR_TOO_MANY_GUESSES;	 Catch:{ JSONException -> 0x05a1 }
        r1.f = r0;	 Catch:{ JSONException -> 0x05a1 }
        if (r2 == 0) goto L_0x0554;
    L_0x047e:
        r0 = z;	 Catch:{ JSONException -> 0x05a3 }
        r3 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x05a3 }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x05a3 }
        if (r0 == 0) goto L_0x0499;
    L_0x048a:
        r0 = z;	 Catch:{ JSONException -> 0x05a5 }
        r3 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x05a5 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x05a5 }
        r0 = com.whatsapp.avc.ERROR_BLOCKED;	 Catch:{ JSONException -> 0x05a5 }
        r1.f = r0;	 Catch:{ JSONException -> 0x05a5 }
        if (r2 == 0) goto L_0x0554;
    L_0x0499:
        r0 = z;	 Catch:{ JSONException -> 0x05a7 }
        r3 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x05a7 }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x05a7 }
        if (r0 == 0) goto L_0x04b4;
    L_0x04a5:
        r0 = z;	 Catch:{ JSONException -> 0x05a9 }
        r3 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x05a9 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x05a9 }
        r0 = com.whatsapp.avc.ERROR_BAD_PARAMETER;	 Catch:{ JSONException -> 0x05a9 }
        r1.f = r0;	 Catch:{ JSONException -> 0x05a9 }
        if (r2 == 0) goto L_0x0554;
    L_0x04b4:
        r0 = z;	 Catch:{ JSONException -> 0x05ab }
        r3 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x05ab }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x05ab }
        if (r0 == 0) goto L_0x04cf;
    L_0x04c0:
        r0 = z;	 Catch:{ JSONException -> 0x05ad }
        r3 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x05ad }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x05ad }
        r0 = com.whatsapp.avc.ERROR_MISSING_PARAMETER;	 Catch:{ JSONException -> 0x05ad }
        r1.f = r0;	 Catch:{ JSONException -> 0x05ad }
        if (r2 == 0) goto L_0x0554;
    L_0x04cf:
        r0 = z;	 Catch:{ JSONException -> 0x05af }
        r3 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x05af }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x05af }
        if (r0 == 0) goto L_0x04ea;
    L_0x04db:
        r0 = z;	 Catch:{ JSONException -> 0x05b1 }
        r3 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x05b1 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x05b1 }
        r0 = com.whatsapp.avc.ERROR_PROVIDER_TIMEOUT;	 Catch:{ JSONException -> 0x05b1 }
        r1.f = r0;	 Catch:{ JSONException -> 0x05b1 }
        if (r2 == 0) goto L_0x0554;
    L_0x04ea:
        r0 = z;	 Catch:{ JSONException -> 0x05b3 }
        r3 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x05b3 }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x05b3 }
        if (r0 == 0) goto L_0x0505;
    L_0x04f6:
        r0 = z;	 Catch:{ JSONException -> 0x05b5 }
        r3 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x05b5 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x05b5 }
        r0 = com.whatsapp.avc.ERROR_PROVIDER_UNROUTABLE;	 Catch:{ JSONException -> 0x05b5 }
        r1.f = r0;	 Catch:{ JSONException -> 0x05b5 }
        if (r2 == 0) goto L_0x0554;
    L_0x0505:
        r0 = z;	 Catch:{ JSONException -> 0x05b7 }
        r3 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x05b7 }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x05b7 }
        if (r0 == 0) goto L_0x0520;
    L_0x0511:
        r0 = z;	 Catch:{ JSONException -> 0x05b9 }
        r3 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x05b9 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x05b9 }
        r0 = com.whatsapp.avc.ERROR_BAD_TOKEN;	 Catch:{ JSONException -> 0x05b9 }
        r1.f = r0;	 Catch:{ JSONException -> 0x05b9 }
        if (r2 == 0) goto L_0x0554;
    L_0x0520:
        r0 = z;	 Catch:{ JSONException -> 0x05bb }
        r3 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x05bb }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x05bb }
        if (r0 == 0) goto L_0x053b;
    L_0x052c:
        r0 = z;	 Catch:{ JSONException -> 0x05bd }
        r3 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x05bd }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x05bd }
        r0 = com.whatsapp.avc.ERROR_TOO_MANY_ALL_METHODS;	 Catch:{ JSONException -> 0x05bd }
        r1.f = r0;	 Catch:{ JSONException -> 0x05bd }
        if (r2 == 0) goto L_0x0554;
    L_0x053b:
        r0 = z;	 Catch:{ JSONException -> 0x05bf }
        r3 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x05bf }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x05bf }
        if (r0 == 0) goto L_0x0554;
    L_0x0547:
        r0 = z;	 Catch:{ JSONException -> 0x05bf }
        r3 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x05bf }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x05bf }
        r0 = com.whatsapp.avc.ERROR_NO_ROUTES;	 Catch:{ JSONException -> 0x05bf }
        r1.f = r0;	 Catch:{ JSONException -> 0x05bf }
    L_0x0554:
        if (r2 == 0) goto L_0x0375;
    L_0x0556:
        r0 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0572 }
        r0.<init>();	 Catch:{ JSONException -> 0x0572 }
        r2 = z;	 Catch:{ JSONException -> 0x0572 }
        r3 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r2 = r2[r3];	 Catch:{ JSONException -> 0x0572 }
        r0 = r0.append(r2);	 Catch:{ JSONException -> 0x0572 }
        r0 = r0.append(r4);	 Catch:{ JSONException -> 0x0572 }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x0572 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x0572 }
        goto L_0x0375;
    L_0x0572:
        r0 = move-exception;
        throw r0;
    L_0x0574:
        r0 = 0;
        goto L_0x036f;
    L_0x0577:
        r0 = move-exception;
        throw r0;
    L_0x0579:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x057b }
    L_0x057b:
        r0 = move-exception;
        throw r0;
    L_0x057d:
        r0 = 0;
        goto L_0x03cf;
    L_0x0580:
        r0 = move-exception;
        throw r0;
    L_0x0582:
        r0 = move-exception;
        throw r0;
    L_0x0584:
        r0 = 0;
        goto L_0x03ff;
    L_0x0587:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0589 }
    L_0x0589:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x058b }
    L_0x058b:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x058d }
    L_0x058d:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x058f }
    L_0x058f:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0591 }
    L_0x0591:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0593 }
    L_0x0593:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0595 }
    L_0x0595:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0597 }
    L_0x0597:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0599 }
    L_0x0599:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x059b }
    L_0x059b:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x059d }
    L_0x059d:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x059f }
    L_0x059f:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x05a1 }
    L_0x05a1:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x05a3 }
    L_0x05a3:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x05a5 }
    L_0x05a5:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x05a7 }
    L_0x05a7:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x05a9 }
    L_0x05a9:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x05ab }
    L_0x05ab:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x05ad }
    L_0x05ad:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x05af }
    L_0x05af:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x05b1 }
    L_0x05b1:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x05b3 }
    L_0x05b3:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x05b5 }
    L_0x05b5:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x05b7 }
    L_0x05b7:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x05b9 }
    L_0x05b9:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x05bb }
    L_0x05bb:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x05bd }
    L_0x05bd:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x05bf }
    L_0x05bf:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fm.a(java.lang.String, java.lang.String, java.lang.String, com.whatsapp.util.a0, com.whatsapp.util.a0, java.lang.String, java.lang.String, java.lang.String):com.whatsapp.de");
    }

    private static int a(ui uiVar) {
        try {
            switch (aml.a[uiVar.ordinal()]) {
                case ay.f /*1*/:
                    return 1;
                case ay.n /*2*/:
                    return 2;
                case ay.p /*3*/:
                    return 3;
                case aj.i /*4*/:
                    return 4;
                default:
                    Log.w(z[179]);
                    return 0;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.zp a(byte[] r16, byte[] r17, byte[] r18, java.lang.String r19) {
        /*
        r12 = com.whatsapp.m3.d;
        r3 = com.whatsapp.azl.a();
        r4 = com.whatsapp.azl.b();
        if (r17 == 0) goto L_0x0023;
    L_0x000c:
        r0 = r17;
        r2 = r0.length;	 Catch:{ IllegalArgumentException -> 0x0021 }
        if (r2 <= 0) goto L_0x0023;
    L_0x0011:
        r2 = 1;
    L_0x0012:
        com.whatsapp.util.Log.b(r2);	 Catch:{ IllegalArgumentException -> 0x0025 }
        if (r18 != 0) goto L_0x0027;
    L_0x0017:
        r2 = new com.whatsapp.zp;	 Catch:{ IllegalArgumentException -> 0x0025 }
        r3 = com.whatsapp.y2.FAIL;	 Catch:{ IllegalArgumentException -> 0x0025 }
        r4 = com.whatsapp.ak7.INCORRECT;	 Catch:{ IllegalArgumentException -> 0x0025 }
        r2.<init>(r3, r4);	 Catch:{ IllegalArgumentException -> 0x0025 }
    L_0x0020:
        return r2;
    L_0x0021:
        r2 = move-exception;
        throw r2;
    L_0x0023:
        r2 = 0;
        goto L_0x0012;
    L_0x0025:
        r2 = move-exception;
        throw r2;
    L_0x0027:
        r5 = new java.util.ArrayList;
        r5.<init>();
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r6 = 65;
        r2 = r2[r6];	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r0 = r16;
        r2 = android.util.Pair.create(r2, r0);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r5.add(r2);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r6 = 90;
        r2 = r2[r6];	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r0 = r17;
        r2 = android.util.Pair.create(r2, r0);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r5.add(r2);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r6 = 73;
        r2 = r2[r6];	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r3 = r3.getBytes();	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r2 = android.util.Pair.create(r2, r3);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r5.add(r2);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r3 = 77;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r3 = r4.getBytes();	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r2 = android.util.Pair.create(r2, r3);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r5.add(r2);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r3 = 93;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r0 = r18;
        r2 = android.util.Pair.create(r2, r0);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r5.add(r2);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r3 = 60;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r3 = r19.getBytes();	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r2 = android.util.Pair.create(r2, r3);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r5.add(r2);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r3 = 95;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r3 = com.whatsapp.ak4.c();	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r3 = r3.getBytes();	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r2 = android.util.Pair.create(r2, r3);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r5.add(r2);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r3 = 67;
        r3 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r2 = b();	 Catch:{ IllegalArgumentException -> 0x00e9 }
        if (r2 == 0) goto L_0x00eb;
    L_0x00b1:
        r2 = "1";
    L_0x00b3:
        r2 = r2.getBytes();
        r2 = android.util.Pair.create(r3, r2);
        r5.add(r2);
        r2 = a(r5);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = com.whatsapp.ce.f;
        r3 = r3.append(r4);
        r2 = r3.append(r2);
        r2 = r2.toString();
        r2 = com.whatsapp.ama.a(r2);
        if (r2 != 0) goto L_0x00ee;
    L_0x00db:
        r2 = new java.io.IOException;	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r4 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r2.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00e7 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00e7 }
    L_0x00e7:
        r2 = move-exception;
        throw r2;
    L_0x00e9:
        r2 = move-exception;
        throw r2;
    L_0x00eb:
        r2 = "0";
        goto L_0x00b3;
    L_0x00ee:
        r3 = r2.getStatusLine();
        r3 = r3.getStatusCode();
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r3 == r4) goto L_0x0133;
    L_0x00fa:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0131 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0131 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0131 }
        r5 = 84;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0131 }
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0131 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0131 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0131 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalArgumentException -> 0x0131 }
        r2 = new java.io.IOException;	 Catch:{ IllegalArgumentException -> 0x0131 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0131 }
        r4.<init>();	 Catch:{ IllegalArgumentException -> 0x0131 }
        r5 = z;	 Catch:{ IllegalArgumentException -> 0x0131 }
        r6 = 68;
        r5 = r5[r6];	 Catch:{ IllegalArgumentException -> 0x0131 }
        r4 = r4.append(r5);	 Catch:{ IllegalArgumentException -> 0x0131 }
        r3 = r4.append(r3);	 Catch:{ IllegalArgumentException -> 0x0131 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0131 }
        r2.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0131 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0131 }
    L_0x0131:
        r2 = move-exception;
        throw r2;
    L_0x0133:
        r2 = r2.getEntity();
        r2 = r2.getContent();
        r13 = a(r2);
        if (r13 != 0) goto L_0x014f;
    L_0x0141:
        r2 = new org.json.JSONException;	 Catch:{ IllegalArgumentException -> 0x014d }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x014d }
        r4 = 59;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x014d }
        r2.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x014d }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x014d }
    L_0x014d:
        r2 = move-exception;
        throw r2;
    L_0x014f:
        r2 = z;
        r3 = 92;
        r2 = r2[r3];
        r14 = r13.getString(r2);
        if (r14 != 0) goto L_0x0172;
    L_0x015b:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0170 }
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0170 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalArgumentException -> 0x0170 }
        r2 = new java.io.IOException;	 Catch:{ IllegalArgumentException -> 0x0170 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0170 }
        r4 = 75;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0170 }
        r2.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0170 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0170 }
    L_0x0170:
        r2 = move-exception;
        throw r2;
    L_0x0172:
        r2 = z;
        r3 = 62;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x020c;
    L_0x017e:
        r2 = z;
        r3 = 63;
        r2 = r2[r3];
        r4 = r13.getString(r2);
        r2 = z;
        r3 = 52;
        r2 = r2[r3];
        r5 = r13.getString(r2);
        r2 = z;
        r3 = 100;
        r2 = r2[r3];
        r6 = r13.getLong(r2);
        r2 = z;
        r3 = 86;
        r2 = r2[r3];
        r8 = r13.getString(r2);
        r2 = z;
        r3 = 78;
        r2 = r2[r3];
        r9 = r13.getString(r2);
        r2 = z;
        r3 = 91;
        r2 = r2[r3];
        r10 = r13.getString(r2);
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x01fa }
        r3 = 76;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x01fa }
        r2 = r13.has(r2);	 Catch:{ IllegalArgumentException -> 0x01fa }
        if (r2 == 0) goto L_0x01fc;
    L_0x01c6:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x01fa }
        r3 = 58;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x01fa }
        r11 = r13.getInt(r2);	 Catch:{ IllegalArgumentException -> 0x01fa }
    L_0x01d0:
        if (r4 == 0) goto L_0x01e3;
    L_0x01d2:
        if (r5 == 0) goto L_0x01e3;
    L_0x01d4:
        r2 = 0;
        r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x01e3;
    L_0x01da:
        if (r8 == 0) goto L_0x01e3;
    L_0x01dc:
        if (r9 == 0) goto L_0x01e3;
    L_0x01de:
        if (r10 == 0) goto L_0x01e3;
    L_0x01e0:
        r2 = -1;
        if (r11 != r2) goto L_0x01fe;
    L_0x01e3:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x01f8 }
        r3 = 81;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x01f8 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalArgumentException -> 0x01f8 }
        r2 = new java.io.IOException;	 Catch:{ IllegalArgumentException -> 0x01f8 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x01f8 }
        r4 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x01f8 }
        r2.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x01f8 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01f8 }
    L_0x01f8:
        r2 = move-exception;
        throw r2;
    L_0x01fa:
        r2 = move-exception;
        throw r2;
    L_0x01fc:
        r11 = -1;
        goto L_0x01d0;
    L_0x01fe:
        r2 = new com.whatsapp.zp;
        r3 = com.whatsapp.y2.OK;
        r15 = 0;
        r5 = android.backport.util.Base64.decode(r5, r15);
        r2.<init>(r3, r4, r5, r6, r8, r9, r10, r11);
        if (r12 == 0) goto L_0x0020;
    L_0x020c:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0294 }
        r3 = 88;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0294 }
        r2 = r2.equals(r14);	 Catch:{ IllegalArgumentException -> 0x0294 }
        if (r2 == 0) goto L_0x02a8;
    L_0x0218:
        r2 = z;
        r3 = 56;
        r2 = r2[r3];
        r4 = r13.getString(r2);
        r2 = z;
        r3 = 98;
        r2 = r2[r3];
        r5 = r13.getString(r2);
        r2 = z;
        r3 = 70;
        r2 = r2[r3];
        r6 = r13.getLong(r2);
        r2 = z;
        r3 = 89;
        r2 = r2[r3];
        r8 = r13.getString(r2);
        r2 = z;
        r3 = 66;
        r2 = r2[r3];
        r9 = r13.getString(r2);
        r2 = z;
        r3 = 55;
        r2 = r2[r3];
        r10 = r13.getString(r2);
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0296 }
        r3 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0296 }
        r2 = r13.has(r2);	 Catch:{ IllegalArgumentException -> 0x0296 }
        if (r2 == 0) goto L_0x0298;
    L_0x0260:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0296 }
        r3 = 82;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0296 }
        r11 = r13.getInt(r2);	 Catch:{ IllegalArgumentException -> 0x0296 }
    L_0x026a:
        if (r4 == 0) goto L_0x027d;
    L_0x026c:
        if (r5 == 0) goto L_0x027d;
    L_0x026e:
        r2 = 0;
        r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x027d;
    L_0x0274:
        if (r8 == 0) goto L_0x027d;
    L_0x0276:
        if (r9 == 0) goto L_0x027d;
    L_0x0278:
        if (r10 == 0) goto L_0x027d;
    L_0x027a:
        r2 = -1;
        if (r11 != r2) goto L_0x029a;
    L_0x027d:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0292 }
        r3 = 64;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0292 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalArgumentException -> 0x0292 }
        r2 = new java.io.IOException;	 Catch:{ IllegalArgumentException -> 0x0292 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0292 }
        r4 = 54;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0292 }
        r2.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0292 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0292 }
    L_0x0292:
        r2 = move-exception;
        throw r2;
    L_0x0294:
        r2 = move-exception;
        throw r2;
    L_0x0296:
        r2 = move-exception;
        throw r2;
    L_0x0298:
        r11 = -1;
        goto L_0x026a;
    L_0x029a:
        r2 = new com.whatsapp.zp;
        r3 = com.whatsapp.y2.EXPIRED;
        r15 = 0;
        r5 = android.backport.util.Base64.decode(r5, r15);
        r2.<init>(r3, r4, r5, r6, r8, r9, r10, r11);
        if (r12 == 0) goto L_0x0020;
    L_0x02a8:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x03b6 }
        r3 = 87;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x03b6 }
        r2 = r2.equals(r14);	 Catch:{ IllegalArgumentException -> 0x03b6 }
        if (r2 == 0) goto L_0x03e2;
    L_0x02b4:
        r2 = z;
        r3 = 57;
        r2 = r2[r3];
        r3 = r13.getString(r2);
        r2 = z;
        r4 = 96;
        r2 = r2[r4];
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x02d5;
    L_0x02ca:
        r2 = new com.whatsapp.zp;
        r4 = com.whatsapp.y2.FAIL;
        r5 = com.whatsapp.ak7.BLOCKED;
        r2.<init>(r4, r5);
        if (r12 == 0) goto L_0x03c8;
    L_0x02d5:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x03b8 }
        r4 = 69;
        r2 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x03b8 }
        r2 = r2.equals(r3);	 Catch:{ IllegalArgumentException -> 0x03b8 }
        if (r2 == 0) goto L_0x02ec;
    L_0x02e1:
        r2 = new com.whatsapp.zp;
        r4 = com.whatsapp.y2.FAIL;
        r5 = com.whatsapp.ak7.INCORRECT;
        r2.<init>(r4, r5);
        if (r12 == 0) goto L_0x03c8;
    L_0x02ec:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x03ba }
        r4 = 83;
        r2 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x03ba }
        r2 = r2.equals(r3);	 Catch:{ IllegalArgumentException -> 0x03ba }
        if (r2 == 0) goto L_0x0303;
    L_0x02f8:
        r2 = new com.whatsapp.zp;
        r4 = com.whatsapp.y2.FAIL;
        r5 = com.whatsapp.ak7.LENGTH_LONG;
        r2.<init>(r4, r5);
        if (r12 == 0) goto L_0x03c8;
    L_0x0303:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x03bc }
        r4 = 74;
        r2 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x03bc }
        r2 = r2.equals(r3);	 Catch:{ IllegalArgumentException -> 0x03bc }
        if (r2 == 0) goto L_0x031a;
    L_0x030f:
        r2 = new com.whatsapp.zp;
        r4 = com.whatsapp.y2.FAIL;
        r5 = com.whatsapp.ak7.LENGTH_SHORT;
        r2.<init>(r4, r5);
        if (r12 == 0) goto L_0x03c8;
    L_0x031a:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x03be }
        r4 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r2 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x03be }
        r2 = r2.equals(r3);	 Catch:{ IllegalArgumentException -> 0x03be }
        if (r2 == 0) goto L_0x0331;
    L_0x0326:
        r2 = new com.whatsapp.zp;
        r4 = com.whatsapp.y2.FAIL;
        r5 = com.whatsapp.ak7.FORMAT_WRONG;
        r2.<init>(r4, r5);
        if (r12 == 0) goto L_0x03c8;
    L_0x0331:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x03c0 }
        r4 = 80;
        r2 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x03c0 }
        r2 = r2.equals(r3);	 Catch:{ IllegalArgumentException -> 0x03c0 }
        if (r2 == 0) goto L_0x0360;
    L_0x033d:
        r2 = new com.whatsapp.zp;
        r4 = com.whatsapp.y2.FAIL;
        r5 = com.whatsapp.ak7.TEMPORARILY_UNAVAILABLE;
        r2.<init>(r4, r5);
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x03c2 }
        r5 = 94;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x03c2 }
        r4 = r13.has(r4);	 Catch:{ IllegalArgumentException -> 0x03c2 }
        if (r4 == 0) goto L_0x03c8;
    L_0x0352:
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x03c4 }
        r5 = 53;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x03c4 }
        r4 = r13.getString(r4);	 Catch:{ IllegalArgumentException -> 0x03c4 }
        r2.l = r4;	 Catch:{ IllegalArgumentException -> 0x03c4 }
        if (r12 == 0) goto L_0x03c8;
    L_0x0360:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x03c4 }
        r4 = 99;
        r2 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x03c4 }
        r2 = r2.equals(r3);	 Catch:{ IllegalArgumentException -> 0x03c4 }
        if (r2 == 0) goto L_0x0377;
    L_0x036c:
        r2 = new com.whatsapp.zp;
        r4 = com.whatsapp.y2.FAIL;
        r5 = com.whatsapp.ak7.OLD_VERSION;
        r2.<init>(r4, r5);
        if (r12 == 0) goto L_0x03c8;
    L_0x0377:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x03c6 }
        r4 = 79;
        r2 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x03c6 }
        r2 = r3.equals(r2);	 Catch:{ IllegalArgumentException -> 0x03c6 }
        if (r2 == 0) goto L_0x038e;
    L_0x0383:
        r2 = new com.whatsapp.zp;
        r4 = com.whatsapp.y2.FAIL;
        r5 = com.whatsapp.ak7.ERROR_BAD_TOKEN;
        r2.<init>(r4, r5);
        if (r12 == 0) goto L_0x03c8;
    L_0x038e:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x03b4 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x03b4 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x03b4 }
        r5 = 71;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x03b4 }
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x03b4 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x03b4 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x03b4 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalArgumentException -> 0x03b4 }
        r2 = new java.io.IOException;	 Catch:{ IllegalArgumentException -> 0x03b4 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x03b4 }
        r4 = 72;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x03b4 }
        r2.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x03b4 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x03b4 }
    L_0x03b4:
        r2 = move-exception;
        throw r2;
    L_0x03b6:
        r2 = move-exception;
        throw r2;
    L_0x03b8:
        r2 = move-exception;
        throw r2;
    L_0x03ba:
        r2 = move-exception;
        throw r2;
    L_0x03bc:
        r2 = move-exception;
        throw r2;
    L_0x03be:
        r2 = move-exception;
        throw r2;
    L_0x03c0:
        r2 = move-exception;
        throw r2;
    L_0x03c2:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x03c4 }
    L_0x03c4:
        r2 = move-exception;
        throw r2;
    L_0x03c6:
        r2 = move-exception;
        throw r2;
    L_0x03c8:
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0408 }
        r4 = 61;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0408 }
        r3 = r13.optInt(r3);	 Catch:{ IllegalArgumentException -> 0x0408 }
        r2.g = r3;	 Catch:{ IllegalArgumentException -> 0x0408 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0408 }
        r4 = 85;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0408 }
        r3 = r13.optInt(r3);	 Catch:{ IllegalArgumentException -> 0x0408 }
        r2.i = r3;	 Catch:{ IllegalArgumentException -> 0x0408 }
        if (r12 == 0) goto L_0x0020;
    L_0x03e2:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0408 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0408 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0408 }
        r4 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0408 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0408 }
        r2 = r2.append(r14);	 Catch:{ IllegalArgumentException -> 0x0408 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0408 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalArgumentException -> 0x0408 }
        r2 = new java.io.IOException;	 Catch:{ IllegalArgumentException -> 0x0408 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0408 }
        r4 = 97;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0408 }
        r2.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0408 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0408 }
    L_0x0408:
        r2 = move-exception;
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fm.a(byte[], byte[], byte[], java.lang.String):com.whatsapp.zp");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.s a(java.lang.String r12, java.lang.String r13, java.lang.String r14, com.whatsapp.ui r15) {
        /*
        r10 = 0;
        r0 = 1;
        r1 = 0;
        r3 = com.whatsapp.m3.d;
        r4 = com.whatsapp.azl.b();
        r5 = com.whatsapp.azl.a();
        if (r12 == 0) goto L_0x012d;
    L_0x0010:
        r2 = r0;
    L_0x0011:
        com.whatsapp.util.Log.b(r2);	 Catch:{ HttpException -> 0x0130 }
        if (r13 == 0) goto L_0x0132;
    L_0x0016:
        r2 = r0;
    L_0x0017:
        com.whatsapp.util.Log.b(r2);	 Catch:{ HttpException -> 0x0135 }
        if (r14 == 0) goto L_0x0137;
    L_0x001c:
        com.whatsapp.util.Log.b(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0 = r0.append(r12);
        r0 = r0.append(r13);
        r0 = r0.toString();
        r1 = com.whatsapp.App.k(r0);
        r0 = com.whatsapp.a54.f(r1);
        if (r0 != 0) goto L_0x0041;
    L_0x003a:
        r0 = com.whatsapp.a54.e();
        com.whatsapp.a54.c(r0, r1);
    L_0x0041:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = z;	 Catch:{ HttpException -> 0x013a }
        r6 = 41;
        r2 = r2[r6];	 Catch:{ HttpException -> 0x013a }
        r6 = r12.getBytes();	 Catch:{ HttpException -> 0x013a }
        r2 = android.util.Pair.create(r2, r6);	 Catch:{ HttpException -> 0x013a }
        r1.add(r2);	 Catch:{ HttpException -> 0x013a }
        r2 = z;	 Catch:{ HttpException -> 0x013a }
        r6 = 2;
        r2 = r2[r6];	 Catch:{ HttpException -> 0x013a }
        r6 = r13.getBytes();	 Catch:{ HttpException -> 0x013a }
        r2 = android.util.Pair.create(r2, r6);	 Catch:{ HttpException -> 0x013a }
        r1.add(r2);	 Catch:{ HttpException -> 0x013a }
        r2 = z;	 Catch:{ HttpException -> 0x013a }
        r6 = 7;
        r2 = r2[r6];	 Catch:{ HttpException -> 0x013a }
        r5 = r5.getBytes();	 Catch:{ HttpException -> 0x013a }
        r2 = android.util.Pair.create(r2, r5);	 Catch:{ HttpException -> 0x013a }
        r1.add(r2);	 Catch:{ HttpException -> 0x013a }
        r2 = z;	 Catch:{ HttpException -> 0x013a }
        r5 = 3;
        r2 = r2[r5];	 Catch:{ HttpException -> 0x013a }
        r4 = r4.getBytes();	 Catch:{ HttpException -> 0x013a }
        r2 = android.util.Pair.create(r2, r4);	 Catch:{ HttpException -> 0x013a }
        r1.add(r2);	 Catch:{ HttpException -> 0x013a }
        r2 = z;	 Catch:{ HttpException -> 0x013a }
        r4 = 11;
        r2 = r2[r4];	 Catch:{ HttpException -> 0x013a }
        r0 = android.util.Pair.create(r2, r0);	 Catch:{ HttpException -> 0x013a }
        r1.add(r0);	 Catch:{ HttpException -> 0x013a }
        r0 = z;	 Catch:{ HttpException -> 0x013a }
        r2 = 14;
        r0 = r0[r2];	 Catch:{ HttpException -> 0x013a }
        r2 = r14.getBytes();	 Catch:{ HttpException -> 0x013a }
        r0 = android.util.Pair.create(r0, r2);	 Catch:{ HttpException -> 0x013a }
        r1.add(r0);	 Catch:{ HttpException -> 0x013a }
        r0 = z;	 Catch:{ HttpException -> 0x013a }
        r2 = 32;
        r0 = r0[r2];	 Catch:{ HttpException -> 0x013a }
        r2 = com.whatsapp.ak4.c();	 Catch:{ HttpException -> 0x013a }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ HttpException -> 0x013a }
        r2 = r2.getBytes();	 Catch:{ HttpException -> 0x013a }
        r0 = android.util.Pair.create(r0, r2);	 Catch:{ HttpException -> 0x013a }
        r1.add(r0);	 Catch:{ HttpException -> 0x013a }
        r0 = z;	 Catch:{ HttpException -> 0x013a }
        r2 = 16;
        r0 = r0[r2];	 Catch:{ HttpException -> 0x013a }
        r2 = a(r15);	 Catch:{ HttpException -> 0x013a }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ HttpException -> 0x013a }
        r2 = r2.getBytes();	 Catch:{ HttpException -> 0x013a }
        r0 = android.util.Pair.create(r0, r2);	 Catch:{ HttpException -> 0x013a }
        r1.add(r0);	 Catch:{ HttpException -> 0x013a }
        r0 = z;	 Catch:{ HttpException -> 0x013a }
        r2 = 29;
        r2 = r0[r2];	 Catch:{ HttpException -> 0x013a }
        r0 = b();	 Catch:{ HttpException -> 0x013a }
        if (r0 == 0) goto L_0x013c;
    L_0x00e3:
        r0 = "1";
    L_0x00e5:
        r0 = r0.getBytes();
        r0 = android.util.Pair.create(r2, r0);
        r1.add(r0);
        r0 = a(r1);
        r1 = new java.lang.StringBuilder;	 Catch:{ HttpException -> 0x011b }
        r1.<init>();	 Catch:{ HttpException -> 0x011b }
        r2 = com.whatsapp.ce.n;	 Catch:{ HttpException -> 0x011b }
        r1 = r1.append(r2);	 Catch:{ HttpException -> 0x011b }
        r0 = r1.append(r0);	 Catch:{ HttpException -> 0x011b }
        r0 = r0.toString();	 Catch:{ HttpException -> 0x011b }
        r0 = com.whatsapp.ama.a(r0);	 Catch:{ HttpException -> 0x011b }
        if (r0 != 0) goto L_0x013f;
    L_0x010d:
        r0 = new java.io.IOException;	 Catch:{ HttpException -> 0x0119 }
        r1 = z;	 Catch:{ HttpException -> 0x0119 }
        r2 = 10;
        r1 = r1[r2];	 Catch:{ HttpException -> 0x0119 }
        r0.<init>(r1);	 Catch:{ HttpException -> 0x0119 }
        throw r0;	 Catch:{ HttpException -> 0x0119 }
    L_0x0119:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x011b }
    L_0x011b:
        r0 = move-exception;
        r0 = z;
        r1 = 40;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        r0 = new com.whatsapp.s;
        r1 = com.whatsapp.x0.ERROR_UNSPECIFIED;
        r0.<init>(r1);
    L_0x012c:
        return r0;
    L_0x012d:
        r2 = r1;
        goto L_0x0011;
    L_0x0130:
        r0 = move-exception;
        throw r0;
    L_0x0132:
        r2 = r1;
        goto L_0x0017;
    L_0x0135:
        r0 = move-exception;
        throw r0;
    L_0x0137:
        r0 = r1;
        goto L_0x001c;
    L_0x013a:
        r0 = move-exception;
        throw r0;
    L_0x013c:
        r0 = "0";
        goto L_0x00e5;
    L_0x013f:
        r1 = r0.getStatusLine();	 Catch:{ HttpException -> 0x011b }
        r1 = r1.getStatusCode();	 Catch:{ HttpException -> 0x011b }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r1 == r2) goto L_0x016d;
    L_0x014b:
        r0 = new java.lang.StringBuilder;	 Catch:{ HttpException -> 0x011b }
        r0.<init>();	 Catch:{ HttpException -> 0x011b }
        r2 = z;	 Catch:{ HttpException -> 0x011b }
        r3 = 38;
        r2 = r2[r3];	 Catch:{ HttpException -> 0x011b }
        r0 = r0.append(r2);	 Catch:{ HttpException -> 0x011b }
        r0 = r0.append(r1);	 Catch:{ HttpException -> 0x011b }
        r0 = r0.toString();	 Catch:{ HttpException -> 0x011b }
        com.whatsapp.util.Log.e(r0);	 Catch:{ HttpException -> 0x011b }
        r0 = new com.whatsapp.s;	 Catch:{ HttpException -> 0x011b }
        r1 = com.whatsapp.x0.ERROR_UNSPECIFIED;	 Catch:{ HttpException -> 0x011b }
        r0.<init>(r1);	 Catch:{ HttpException -> 0x011b }
        goto L_0x012c;
    L_0x016d:
        r0 = r0.getEntity();	 Catch:{ HttpException -> 0x011b }
        r0 = r0.getContent();	 Catch:{ HttpException -> 0x011b }
        r2 = a(r0);	 Catch:{ HttpException -> 0x011b }
        if (r2 != 0) goto L_0x0189;
    L_0x017b:
        r0 = new org.json.JSONException;	 Catch:{ HttpException -> 0x0187 }
        r1 = z;	 Catch:{ HttpException -> 0x0187 }
        r2 = 28;
        r1 = r1[r2];	 Catch:{ HttpException -> 0x0187 }
        r0.<init>(r1);	 Catch:{ HttpException -> 0x0187 }
        throw r0;	 Catch:{ HttpException -> 0x0187 }
    L_0x0187:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x011b }
    L_0x0189:
        r1 = new com.whatsapp.s;	 Catch:{ HttpException -> 0x011b }
        r0 = com.whatsapp.x0.ERROR_UNSPECIFIED;	 Catch:{ HttpException -> 0x011b }
        r1.<init>(r0);	 Catch:{ HttpException -> 0x011b }
        r0 = z;	 Catch:{ HttpException -> 0x011b }
        r4 = 8;
        r0 = r0[r4];	 Catch:{ HttpException -> 0x011b }
        r4 = r2.getString(r0);	 Catch:{ HttpException -> 0x011b }
        if (r4 != 0) goto L_0x01a7;
    L_0x019c:
        r0 = z;	 Catch:{ HttpException -> 0x01ef }
        r5 = 26;
        r0 = r0[r5];	 Catch:{ HttpException -> 0x01ef }
        com.whatsapp.util.Log.e(r0);	 Catch:{ HttpException -> 0x01ef }
        if (r3 == 0) goto L_0x0330;
    L_0x01a7:
        r0 = z;	 Catch:{ HttpException -> 0x01f1 }
        r5 = 15;
        r0 = r0[r5];	 Catch:{ HttpException -> 0x01f1 }
        r0 = r4.equals(r0);	 Catch:{ HttpException -> 0x01f1 }
        if (r0 == 0) goto L_0x0204;
    L_0x01b3:
        r0 = z;	 Catch:{ HttpException -> 0x011b }
        r5 = 20;
        r0 = r0[r5];	 Catch:{ HttpException -> 0x011b }
        r0 = r2.getString(r0);	 Catch:{ HttpException -> 0x011b }
        r5 = z;	 Catch:{ HttpException -> 0x011b }
        r6 = 36;
        r5 = r5[r6];	 Catch:{ HttpException -> 0x011b }
        r5 = r2.getString(r5);	 Catch:{ HttpException -> 0x011b }
        r6 = z;	 Catch:{ HttpException -> 0x011b }
        r7 = 34;
        r6 = r6[r7];	 Catch:{ HttpException -> 0x011b }
        r6 = r2.getLong(r6);	 Catch:{ HttpException -> 0x011b }
        if (r0 == 0) goto L_0x01d9;
    L_0x01d3:
        if (r5 == 0) goto L_0x01d9;
    L_0x01d5:
        r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r8 != 0) goto L_0x01f3;
    L_0x01d9:
        r0 = z;	 Catch:{ HttpException -> 0x01ed }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ HttpException -> 0x01ed }
        com.whatsapp.util.Log.e(r0);	 Catch:{ HttpException -> 0x01ed }
        r0 = new java.io.IOException;	 Catch:{ HttpException -> 0x01ed }
        r1 = z;	 Catch:{ HttpException -> 0x01ed }
        r2 = 9;
        r1 = r1[r2];	 Catch:{ HttpException -> 0x01ed }
        r0.<init>(r1);	 Catch:{ HttpException -> 0x01ed }
        throw r0;	 Catch:{ HttpException -> 0x01ed }
    L_0x01ed:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x011b }
    L_0x01ef:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x01f1 }
    L_0x01f1:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x011b }
    L_0x01f3:
        r8 = com.whatsapp.x0.YES;	 Catch:{ HttpException -> 0x024c }
        r1.f = r8;	 Catch:{ HttpException -> 0x024c }
        r1.b = r0;	 Catch:{ HttpException -> 0x024c }
        r0 = 0;
        r0 = android.backport.util.Base64.decode(r5, r0);	 Catch:{ HttpException -> 0x024c }
        r1.d = r0;	 Catch:{ HttpException -> 0x024c }
        r1.e = r6;	 Catch:{ HttpException -> 0x024c }
        if (r3 == 0) goto L_0x0330;
    L_0x0204:
        r0 = z;	 Catch:{ HttpException -> 0x024c }
        r5 = 19;
        r0 = r0[r5];	 Catch:{ HttpException -> 0x024c }
        r0 = r4.equals(r0);	 Catch:{ HttpException -> 0x024c }
        if (r0 == 0) goto L_0x025f;
    L_0x0210:
        r0 = z;	 Catch:{ HttpException -> 0x011b }
        r5 = 22;
        r0 = r0[r5];	 Catch:{ HttpException -> 0x011b }
        r0 = r2.getString(r0);	 Catch:{ HttpException -> 0x011b }
        r5 = z;	 Catch:{ HttpException -> 0x011b }
        r6 = 12;
        r5 = r5[r6];	 Catch:{ HttpException -> 0x011b }
        r5 = r2.getString(r5);	 Catch:{ HttpException -> 0x011b }
        r6 = z;	 Catch:{ HttpException -> 0x011b }
        r7 = 0;
        r6 = r6[r7];	 Catch:{ HttpException -> 0x011b }
        r6 = r2.getLong(r6);	 Catch:{ HttpException -> 0x011b }
        if (r0 == 0) goto L_0x0235;
    L_0x022f:
        if (r5 == 0) goto L_0x0235;
    L_0x0231:
        r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r8 != 0) goto L_0x024e;
    L_0x0235:
        r0 = z;	 Catch:{ HttpException -> 0x024a }
        r1 = 27;
        r0 = r0[r1];	 Catch:{ HttpException -> 0x024a }
        com.whatsapp.util.Log.e(r0);	 Catch:{ HttpException -> 0x024a }
        r0 = new java.io.IOException;	 Catch:{ HttpException -> 0x024a }
        r1 = z;	 Catch:{ HttpException -> 0x024a }
        r2 = 17;
        r1 = r1[r2];	 Catch:{ HttpException -> 0x024a }
        r0.<init>(r1);	 Catch:{ HttpException -> 0x024a }
        throw r0;	 Catch:{ HttpException -> 0x024a }
    L_0x024a:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x011b }
    L_0x024c:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x011b }
    L_0x024e:
        r8 = com.whatsapp.x0.EXPIRED;	 Catch:{ HttpException -> 0x036f }
        r1.f = r8;	 Catch:{ HttpException -> 0x036f }
        r1.b = r0;	 Catch:{ HttpException -> 0x036f }
        r0 = 0;
        r0 = android.backport.util.Base64.decode(r5, r0);	 Catch:{ HttpException -> 0x036f }
        r1.d = r0;	 Catch:{ HttpException -> 0x036f }
        r1.e = r6;	 Catch:{ HttpException -> 0x036f }
        if (r3 == 0) goto L_0x0330;
    L_0x025f:
        r0 = z;	 Catch:{ HttpException -> 0x036f }
        r5 = 13;
        r0 = r0[r5];	 Catch:{ HttpException -> 0x036f }
        r0 = r4.equals(r0);	 Catch:{ HttpException -> 0x036f }
        if (r0 == 0) goto L_0x0316;
    L_0x026b:
        r0 = z;	 Catch:{ HttpException -> 0x011b }
        r5 = 37;
        r0 = r0[r5];	 Catch:{ HttpException -> 0x011b }
        r5 = r2.getString(r0);	 Catch:{ HttpException -> 0x011b }
        r0 = z;	 Catch:{ HttpException -> 0x0371 }
        r6 = 4;
        r0 = r0[r6];	 Catch:{ HttpException -> 0x0371 }
        r0 = r2.has(r0);	 Catch:{ HttpException -> 0x0371 }
        if (r0 == 0) goto L_0x0373;
    L_0x0280:
        r0 = z;	 Catch:{ HttpException -> 0x0371 }
        r6 = 30;
        r0 = r0[r6];	 Catch:{ HttpException -> 0x0371 }
        r0 = r2.getString(r0);	 Catch:{ HttpException -> 0x0371 }
    L_0x028a:
        r6 = z;	 Catch:{ HttpException -> 0x0376 }
        r7 = 33;
        r6 = r6[r7];	 Catch:{ HttpException -> 0x0376 }
        r6 = r6.equals(r5);	 Catch:{ HttpException -> 0x0376 }
        if (r6 == 0) goto L_0x029c;
    L_0x0296:
        r6 = com.whatsapp.x0.FAIL_BLOCKED;	 Catch:{ HttpException -> 0x0376 }
        r1.f = r6;	 Catch:{ HttpException -> 0x0376 }
        if (r3 == 0) goto L_0x0314;
    L_0x029c:
        r6 = z;	 Catch:{ HttpException -> 0x0378 }
        r7 = 23;
        r6 = r6[r7];	 Catch:{ HttpException -> 0x0378 }
        r6 = r6.equals(r5);	 Catch:{ HttpException -> 0x0378 }
        if (r6 == 0) goto L_0x02b8;
    L_0x02a8:
        if (r0 != 0) goto L_0x02b0;
    L_0x02aa:
        r6 = com.whatsapp.x0.FAIL_TOO_MANY_GUESSES;	 Catch:{ HttpException -> 0x037c }
        r1.f = r6;	 Catch:{ HttpException -> 0x037c }
        if (r3 == 0) goto L_0x02b4;
    L_0x02b0:
        r6 = com.whatsapp.x0.FAIL_MISMATCH;	 Catch:{ HttpException -> 0x037e }
        r1.f = r6;	 Catch:{ HttpException -> 0x037e }
    L_0x02b4:
        r1.a = r0;	 Catch:{ HttpException -> 0x0380 }
        if (r3 == 0) goto L_0x0314;
    L_0x02b8:
        r6 = z;	 Catch:{ HttpException -> 0x0380 }
        r7 = 39;
        r6 = r6[r7];	 Catch:{ HttpException -> 0x0380 }
        r6 = r6.equals(r5);	 Catch:{ HttpException -> 0x0380 }
        if (r6 == 0) goto L_0x02ca;
    L_0x02c4:
        r6 = com.whatsapp.x0.FAIL_MISSING;	 Catch:{ HttpException -> 0x0382 }
        r1.f = r6;	 Catch:{ HttpException -> 0x0382 }
        if (r3 == 0) goto L_0x0314;
    L_0x02ca:
        r6 = z;	 Catch:{ HttpException -> 0x0384 }
        r7 = 25;
        r6 = r6[r7];	 Catch:{ HttpException -> 0x0384 }
        r6 = r6.equals(r5);	 Catch:{ HttpException -> 0x0384 }
        if (r6 == 0) goto L_0x02de;
    L_0x02d6:
        r6 = com.whatsapp.x0.FAIL_TOO_MANY_GUESSES;	 Catch:{ HttpException -> 0x0386 }
        r1.f = r6;	 Catch:{ HttpException -> 0x0386 }
        r1.a = r0;	 Catch:{ HttpException -> 0x0386 }
        if (r3 == 0) goto L_0x0314;
    L_0x02de:
        r6 = z;	 Catch:{ HttpException -> 0x0388 }
        r7 = 6;
        r6 = r6[r7];	 Catch:{ HttpException -> 0x0388 }
        r6 = r6.equals(r5);	 Catch:{ HttpException -> 0x0388 }
        if (r6 == 0) goto L_0x02f1;
    L_0x02e9:
        r6 = com.whatsapp.x0.FAIL_GUESSED_TOO_FAST;	 Catch:{ HttpException -> 0x038a }
        r1.f = r6;	 Catch:{ HttpException -> 0x038a }
        r1.a = r0;	 Catch:{ HttpException -> 0x038a }
        if (r3 == 0) goto L_0x0314;
    L_0x02f1:
        r6 = z;	 Catch:{ HttpException -> 0x038c }
        r7 = 5;
        r6 = r6[r7];	 Catch:{ HttpException -> 0x038c }
        r6 = r6.equals(r5);	 Catch:{ HttpException -> 0x038c }
        if (r6 == 0) goto L_0x0302;
    L_0x02fc:
        r6 = com.whatsapp.x0.FAIL_STALE;	 Catch:{ HttpException -> 0x038e }
        r1.f = r6;	 Catch:{ HttpException -> 0x038e }
        if (r3 == 0) goto L_0x0314;
    L_0x0302:
        r6 = z;	 Catch:{ HttpException -> 0x0390 }
        r7 = 43;
        r6 = r6[r7];	 Catch:{ HttpException -> 0x0390 }
        r5 = r6.equals(r5);	 Catch:{ HttpException -> 0x0390 }
        if (r5 == 0) goto L_0x0314;
    L_0x030e:
        r5 = com.whatsapp.x0.FAIL_TEMPORARILY_UNAVAILABLE;	 Catch:{ HttpException -> 0x0392 }
        r1.f = r5;	 Catch:{ HttpException -> 0x0392 }
        r1.a = r0;	 Catch:{ HttpException -> 0x0392 }
    L_0x0314:
        if (r3 == 0) goto L_0x0330;
    L_0x0316:
        r0 = new java.lang.StringBuilder;	 Catch:{ HttpException -> 0x0394 }
        r0.<init>();	 Catch:{ HttpException -> 0x0394 }
        r3 = z;	 Catch:{ HttpException -> 0x0394 }
        r5 = 24;
        r3 = r3[r5];	 Catch:{ HttpException -> 0x0394 }
        r0 = r0.append(r3);	 Catch:{ HttpException -> 0x0394 }
        r0 = r0.append(r4);	 Catch:{ HttpException -> 0x0394 }
        r0 = r0.toString();	 Catch:{ HttpException -> 0x0394 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ HttpException -> 0x0394 }
    L_0x0330:
        r0 = z;	 Catch:{ HttpException -> 0x0396 }
        r3 = 21;
        r0 = r0[r3];	 Catch:{ HttpException -> 0x0396 }
        r0 = r2.optString(r0);	 Catch:{ HttpException -> 0x0396 }
        r1.g = r0;	 Catch:{ HttpException -> 0x0396 }
        r0 = z;	 Catch:{ HttpException -> 0x0396 }
        r3 = 42;
        r0 = r0[r3];	 Catch:{ HttpException -> 0x0396 }
        r0 = r2.optString(r0);	 Catch:{ HttpException -> 0x0396 }
        r1.i = r0;	 Catch:{ HttpException -> 0x0396 }
        r0 = z;	 Catch:{ HttpException -> 0x0396 }
        r3 = 31;
        r0 = r0[r3];	 Catch:{ HttpException -> 0x0396 }
        r0 = r2.optString(r0);	 Catch:{ HttpException -> 0x0396 }
        r1.h = r0;	 Catch:{ HttpException -> 0x0396 }
        r0 = z;	 Catch:{ HttpException -> 0x0396 }
        r3 = 35;
        r0 = r0[r3];	 Catch:{ HttpException -> 0x0396 }
        r0 = r2.has(r0);	 Catch:{ HttpException -> 0x0396 }
        if (r0 == 0) goto L_0x0398;
    L_0x0360:
        r0 = z;	 Catch:{ HttpException -> 0x0396 }
        r3 = 18;
        r0 = r0[r3];	 Catch:{ HttpException -> 0x0396 }
        r0 = r2.getInt(r0);	 Catch:{ HttpException -> 0x0396 }
    L_0x036a:
        r1.c = r0;	 Catch:{ HttpException -> 0x011b }
        r0 = r1;
        goto L_0x012c;
    L_0x036f:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x011b }
    L_0x0371:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x011b }
    L_0x0373:
        r0 = 0;
        goto L_0x028a;
    L_0x0376:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x0378 }
    L_0x0378:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x037a }
    L_0x037a:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x037c }
    L_0x037c:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x037e }
    L_0x037e:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x011b }
    L_0x0380:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x0382 }
    L_0x0382:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x0384 }
    L_0x0384:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x0386 }
    L_0x0386:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x0388 }
    L_0x0388:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x038a }
    L_0x038a:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x038c }
    L_0x038c:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x038e }
    L_0x038e:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x0390 }
    L_0x0390:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x0392 }
    L_0x0392:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x011b }
    L_0x0394:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x011b }
    L_0x0396:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x011b }
    L_0x0398:
        r0 = -1;
        goto L_0x036a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fm.a(java.lang.String, java.lang.String, java.lang.String, com.whatsapp.ui):com.whatsapp.s");
    }

    private static boolean b() {
        String line1Number = App.a3.getLine1Number();
        if (line1Number != null) {
            try {
                if (line1Number.length() >= 6) {
                    return true;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return false;
    }
}
