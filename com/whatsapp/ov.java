package com.whatsapp;

import android.os.AsyncTask;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ov extends AsyncTask {
    private static final String[] z;
    de a;
    String b;
    final VerifySms c;
    s d;
    String e;

    static {
        String[] strArr = new String[76];
        String str = "\u0015\u0017zM)";
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
                        i3 = 99;
                        break;
                    case ay.f /*1*/:
                        i3 = 120;
                        break;
                    case ay.n /*2*/:
                        i3 = 19;
                        break;
                    case ay.p /*3*/:
                        i3 = 46;
                        break;
                    default:
                        i3 = 76;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "L\u0011|K>\u0011\u0017a\u000e";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "L\u000bgO8\u0016\u000b<K>\u0011\u0017a\u00015\u0006\u000b>Y%\u0017\u0010>M#\u0007\u001d";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "L\u001da\\#\u0011X";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0011\u001du[?\u0006\u001c";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "L\u0016vV8N\u0015vZ$\f\u001c";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0015\u0017zM)N\u001da\\#\u0011UgA#N\u0015r@5N\faG)\u0010";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "L\f|Aa\u0011\u001dpK\"\u0017WgG!\u0006U}A8N\u0011}Z";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "CWeK>\n\u001ezK(L\u0017x\u0001*\u0002\u0011\u007fK(N\f|\u00039\u0013\u001crZ)N\u001dk^%\u0011\u0019gG#\r";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "L\fvC<N\r}O:\u0002\u0011\u007f";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "L\f|Aa\u000e\u0019}Wa\u0017\nzK?";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    str = "L\f|Aa\u0011\u001dpK\"\u0017WgG!\u0006U}A8N\u0011}Z";
                    obj = 18;
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    strArr2 = strArr3;
                    str = "L\baA:\n\u001cv\\a\u0016\u0016aA9\u0017\u0019qB)";
                    obj = 19;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "L\u0015z]?\n\u0016t\u0003<\u0002\nrC)\u0017\u001da";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0015\u0017zM)N\u0015z]?\n\u0016t\u0003<\u0002\nrC";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0015\u0017zM)N\u001da\\#\u0011";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "L\u001a\u007fA/\b\u001dw";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0015\u0017zM)N\f|Aa\u000e\u0019}Wa\u0004\rv]?\u0006\u000b";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0015\u0017zM)N\u001a\u007fA/\b\u001dw";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "L\u0016|\u0003>\f\rgK?";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "L\fvC<\f\nr\\%\u000f\u0001>[\"\u0002\u000erG \u0002\u001a\u007fKc\u0016\u0016rL \u0006UgAa\u0013\u0019a])N\nvZ>\u001a9uZ)\u0011";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0015\u0017zM)N\u001arJa\u0017\u0017xK\"";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "L\baA:\n\u001cv\\a\u0017\u0011~K#\u0016\f";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "L\f|Aa\u000e\u0019}Wa\u0004\rv]?\u0006\u000b<Z%\u000e\u001d>@#\u0017Uz@8";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0001\u0019w\u000e<\u0002\nrC)\u0017\u001da";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "L\u001arJa\u0017\u0017xK\"";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0015\u0017zM)N\baA:\n\u001cv\\a\u0017\u0011~K#\u0016\f";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "L\faG)\u0007\f|A!\u0002\u0016jZ%\u000e\u001d`O \u000f\u0015vZ$\f\u001c`\u00018\n\u0015v\u0003\"\f\f>G\"\u0017";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0015\u0017zM)N\u001da\\#\u0011UgA#N\u0015r@5N\faG)\u0010UrB N\u0015vZ$\f\u001c`";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 45;
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    strArr2 = strArr3;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 46;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "L\r}]<\u0006\u001bzH%\u0006\u001c";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "\u0015\u0017zM)N\u000ev\\?\n\u0017}\u00038\f\u0017>A \u0007";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\u0015\u0017zM)N\u0016vV8N\u0015vZ$\f\u001c";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "L\f|Aa\u0011\u001dpK\"\u0017WgG!\u0006U}A8N\u0011}Z";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "L\faG)\u0007\f|A!\u0002\u0016jZ%\u000e\u001d`O \u000f\u0015vZ$\f\u001c`\u00018\n\u0015v\u0003\"\f\f>G\"\u0017";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "L\f|Aa\u0011\u001dpK\"\u0017WgG!\u0006U}A8N\u0011}Z";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u0015\u0017zM)N\fvC<N\r}O:\u0002\u0011\u007f";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "L\u001b|J)L\u0017x";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "L\f|Aa\u000e\u0019}Wa\u0004\rv]?\u0006\u000b";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\u0015\u0017zM)N\baA:\n\u001cv\\a\u0016\u0016aA9\u0017\u0019qB)";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "L\u001arJa\u0013\u0019aO!\u0006\fv\\";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "L\f|Aa\u0011\u001dpK\"\u0017X";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "\u000e\u0011`]%\r\u001f3^-\u0011\u0019~K8\u0006\n";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "L\u000ev\\?\n\u0017}\u00038\f\u0017>A \u0007";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\u0015\u0017zM)N\f|Aa\u0011\u001dpK\"\u0017";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "\u0015\u0017zM)N\u001arJa\u0013\u0019aO!";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i] = str;
                    i = 69;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i] = str;
                    i = 70;
                    str = "\u000b\fg^?YW<Y$\u0002\f`O<\u0013VpA!L\u0019}J>\f\u0011w";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i] = str;
                    i = 71;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i] = str;
                    i = 72;
                    str = "\u0015\u0017zM)N\u0016|\u0003>\f\rgK?";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i] = str;
                    i = 73;
                    str = "L\f|Aa\u000e\u0019}Wa\u0017\nzK?N\u0019\u007fBa\u000e\u001dgF#\u0007\u000b";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case 72:
                    strArr2[i] = str;
                    i = 74;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i] = str;
                    i = 75;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case 74:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0015\u001daG*\u001a\u000e|G/\u0006WaK=\u0016\u001d`Zc";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onPreExecute() {
        try {
            if (!this.c.isFinishing()) {
                this.c.showDialog(25);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    protected ov(VerifySms verifySms) {
        this.c = verifySms;
        this.e = z[0];
        this.b = "v";
        this.d = new s(x0.ERROR_UNSPECIFIED);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected com.whatsapp.avc a(java.lang.String[] r9) {
        /*
        r8_this = this;
        r2 = com.whatsapp.App.az;
        r1 = com.whatsapp.avc.ERROR_UNSPECIFIED;
        r0 = r8.c;	 Catch:{ IOException -> 0x0064, Exception -> 0x00a7 }
        r3 = r8.c;	 Catch:{ IOException -> 0x0064, Exception -> 0x00a7 }
        r3 = com.whatsapp.VerifySms.A(r3);	 Catch:{ IOException -> 0x0064, Exception -> 0x00a7 }
        r4 = r8.c;	 Catch:{ IOException -> 0x0064, Exception -> 0x00a7 }
        r4 = com.whatsapp.VerifySms.a(r4);	 Catch:{ IOException -> 0x0064, Exception -> 0x00a7 }
        r5 = r8.e;	 Catch:{ IOException -> 0x0064, Exception -> 0x00a7 }
        r6 = com.whatsapp.VerifyNumber.k;	 Catch:{ IOException -> 0x0064, Exception -> 0x00a7 }
        r0 = com.whatsapp.VerifyNumber.a(r0, r3, r4, r5, r6);	 Catch:{ IOException -> 0x0064, Exception -> 0x00a7 }
        r8.a = r0;	 Catch:{ IOException -> 0x0064, Exception -> 0x00a7 }
        r0 = r8.a;	 Catch:{ IOException -> 0x0064, Exception -> 0x00a7 }
        r0 = r0.f;	 Catch:{ IOException -> 0x0064, Exception -> 0x00a7 }
        r1 = com.whatsapp.avc.YES_WITH_CODE;	 Catch:{ IOException -> 0x005c, Exception -> 0x00d0 }
        if (r0 != r1) goto L_0x004a;
    L_0x0024:
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x005c, Exception -> 0x00d0 }
        r1.<init>();	 Catch:{ IOException -> 0x005c, Exception -> 0x00d0 }
        r3 = z;	 Catch:{ IOException -> 0x005c, Exception -> 0x00d0 }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ IOException -> 0x005c, Exception -> 0x00d0 }
        r1 = r1.append(r3);	 Catch:{ IOException -> 0x005c, Exception -> 0x00d0 }
        r3 = r8.b;	 Catch:{ IOException -> 0x005c, Exception -> 0x00d0 }
        r1 = r1.append(r3);	 Catch:{ IOException -> 0x005c, Exception -> 0x00d0 }
        r3 = z;	 Catch:{ IOException -> 0x005c, Exception -> 0x00d0 }
        r4 = 5;
        r3 = r3[r4];	 Catch:{ IOException -> 0x005c, Exception -> 0x00d0 }
        r1 = r1.append(r3);	 Catch:{ IOException -> 0x005c, Exception -> 0x00d0 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x005c, Exception -> 0x00d0 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IOException -> 0x005c, Exception -> 0x00d0 }
        if (r2 == 0) goto L_0x005b;
    L_0x004a:
        r1 = com.whatsapp.avc.YES;	 Catch:{ IOException -> 0x005e, Exception -> 0x00d0 }
        if (r0 != r1) goto L_0x005b;
    L_0x004e:
        r1 = r8.a;	 Catch:{ IOException -> 0x0060, Exception -> 0x00d0 }
        r1 = r1.d;	 Catch:{ IOException -> 0x0060, Exception -> 0x00d0 }
        if (r1 == 0) goto L_0x005b;
    L_0x0054:
        r1 = r8.a;	 Catch:{ IOException -> 0x0062, Exception -> 0x00d0 }
        r1 = r1.d;	 Catch:{ IOException -> 0x0062, Exception -> 0x00d0 }
        com.whatsapp.VerifySms.b(r1);	 Catch:{ IOException -> 0x0062, Exception -> 0x00d0 }
    L_0x005b:
        return r0;
    L_0x005c:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x005e, Exception -> 0x00d0 }
    L_0x005e:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0060, Exception -> 0x00d0 }
    L_0x0060:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0062, Exception -> 0x00d0 }
    L_0x0062:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0064, Exception -> 0x00d0 }
    L_0x0064:
        r0 = move-exception;
        r0 = r0.toString();
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00a5 }
        r1.<init>();	 Catch:{ IOException -> 0x00a5 }
        r3 = z;	 Catch:{ IOException -> 0x00a5 }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ IOException -> 0x00a5 }
        r1 = r1.append(r3);	 Catch:{ IOException -> 0x00a5 }
        r3 = r8.b;	 Catch:{ IOException -> 0x00a5 }
        r1 = r1.append(r3);	 Catch:{ IOException -> 0x00a5 }
        r3 = z;	 Catch:{ IOException -> 0x00a5 }
        r4 = 4;
        r3 = r3[r4];	 Catch:{ IOException -> 0x00a5 }
        r1 = r1.append(r3);	 Catch:{ IOException -> 0x00a5 }
        r1 = r1.append(r0);	 Catch:{ IOException -> 0x00a5 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x00a5 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IOException -> 0x00a5 }
        if (r0 == 0) goto L_0x00a2;
    L_0x0093:
        r1 = z;	 Catch:{ IOException -> 0x00a5 }
        r3 = 7;
        r1 = r1[r3];	 Catch:{ IOException -> 0x00a5 }
        r0 = r0.contains(r1);	 Catch:{ IOException -> 0x00a5 }
        if (r0 == 0) goto L_0x00a2;
    L_0x009e:
        r0 = com.whatsapp.avc.ERROR_UNSPECIFIED;
        if (r2 == 0) goto L_0x005b;
    L_0x00a2:
        r0 = com.whatsapp.avc.ERROR_CONNECTIVITY;
        goto L_0x005b;
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r0 = move-exception;
        r7 = r0;
        r0 = r1;
        r1 = r7;
    L_0x00ab:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r8.b;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.b(r2, r1);
        goto L_0x005b;
    L_0x00d0:
        r1 = move-exception;
        goto L_0x00ab;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ov.a(java.lang.String[]):com.whatsapp.avc");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(com.whatsapp.avc r15) {
        /*
        r14_this = this;
        r12 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r11 = 0;
        r10 = 1;
        r1 = com.whatsapp.App.az;
        r0 = "";
        com.whatsapp.VerifyNumber.k = r0;
        r0 = r14.c;
        r2 = 25;
        r0.removeDialog(r2);
        r0 = com.whatsapp.avc.OK;
        if (r15 != r0) goto L_0x0061;
    L_0x0015:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 41;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r14.b;
        r0 = r0.append(r2);
        r2 = z;
        r3 = 59;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.p;
        r2 = r14.a;
        r2 = r2.g;
        com.whatsapp.App.f(r0, r2);
        r0 = r14.a;
        r0 = r0.e;
        r2 = r14.a;
        r2 = r2.g;
        com.whatsapp.a54.a(r0, r2);
        r0 = com.whatsapp.atf.WHATSAPP_INITIATED;	 Catch:{ NumberFormatException -> 0x00e3 }
        r2 = r14.a;	 Catch:{ NumberFormatException -> 0x00e3 }
        r2 = r2.b;	 Catch:{ NumberFormatException -> 0x00e3 }
        r2 = r2 * r12;
        com.whatsapp.ac.a(r0, r2);	 Catch:{ NumberFormatException -> 0x00e3 }
    L_0x0059:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x010c }
        r2 = 1;
        com.whatsapp.VerifySms.a(r0, r2);	 Catch:{ NumberFormatException -> 0x010c }
        if (r1 == 0) goto L_0x00dd;
    L_0x0061:
        r0 = com.whatsapp.avc.YES;	 Catch:{ NumberFormatException -> 0x010c }
        if (r15 == r0) goto L_0x082a;
    L_0x0065:
        r0 = com.whatsapp.avc.ERROR_TEMPORARILY_UNAVAILABLE;	 Catch:{ NumberFormatException -> 0x010e }
        if (r15 != r0) goto L_0x014b;
    L_0x0069:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0110 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0110 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0110 }
        r3 = 33;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0110 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0110 }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x0110 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0110 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0110 }
        r3 = 16;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0110 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0110 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0110 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0110 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0110 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0110 }
        r3 = 58;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0110 }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x0110 }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x0110 }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x0110 }
        if (r0 != 0) goto L_0x00b0;
    L_0x00a0:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0112 }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x0112 }
        r3 = 2131624760; // 0x7f0e0338 float:1.8876709E38 double:1.0531625637E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x0112 }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x0112 }
        if (r1 == 0) goto L_0x00dd;
    L_0x00b0:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x0114 }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x0114 }
        r2 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0114 }
        r2 = r2 * r12;
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0114 }
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x0114 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0114 }
        r4 = r14.c;	 Catch:{ NumberFormatException -> 0x0114 }
        r5 = 2131624761; // 0x7f0e0339 float:1.887671E38 double:1.053162564E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x0114 }
        r7 = 0;
        r8 = r14.c;	 Catch:{ NumberFormatException -> 0x0114 }
        r8 = com.whatsapp.util.bm.g(r8, r2);	 Catch:{ NumberFormatException -> 0x0114 }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x0114 }
        r4 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x0114 }
        r0.g(r4);	 Catch:{ NumberFormatException -> 0x0114 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0114 }
        com.whatsapp.VerifySms.c(r0, r2);	 Catch:{ NumberFormatException -> 0x0114 }
    L_0x00dd:
        r0 = r14.c;
        com.whatsapp.VerifySms.o(r0);
        return;
    L_0x00e3:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 67;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r14.b;
        r0 = r0.append(r2);
        r2 = z;
        r3 = 13;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0059;
    L_0x010c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x010e }
    L_0x010e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0110 }
    L_0x0110:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0112 }
    L_0x0112:
        r0 = move-exception;
        throw r0;
    L_0x0114:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x084c }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x084c }
        r2 = z;	 Catch:{ NumberFormatException -> 0x084c }
        r3 = 47;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x084c }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x084c }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x084c }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x084c }
        r2 = z;	 Catch:{ NumberFormatException -> 0x084c }
        r3 = 30;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x084c }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x084c }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x084c }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x084c }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x084c }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x084c }
        r3 = 2131624760; // 0x7f0e0338 float:1.8876709E38 double:1.0531625637E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x084c }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x084c }
        if (r1 == 0) goto L_0x00dd;
    L_0x014b:
        r0 = com.whatsapp.avc.ERROR_UNSPECIFIED;	 Catch:{ NumberFormatException -> 0x084c }
        if (r15 != r0) goto L_0x0189;
    L_0x014f:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x084e }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x084e }
        r2 = z;	 Catch:{ NumberFormatException -> 0x084e }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x084e }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x084e }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x084e }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x084e }
        r2 = z;	 Catch:{ NumberFormatException -> 0x084e }
        r3 = 50;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x084e }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x084e }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x084e }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x084e }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x084e }
        r2 = z;	 Catch:{ NumberFormatException -> 0x084e }
        r3 = 25;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x084e }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x084e }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x084e }
        r2 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x084e }
        if (r1 == 0) goto L_0x00dd;
    L_0x0189:
        r0 = com.whatsapp.avc.ERROR_TOO_MANY;	 Catch:{ NumberFormatException -> 0x0850 }
        if (r15 != r0) goto L_0x0247;
    L_0x018d:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0852 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0852 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0852 }
        r3 = 18;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0852 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0852 }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x0852 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0852 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0852 }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0852 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0852 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0852 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0852 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0852 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0852 }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0852 }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x0852 }
        r0 = 1;
        com.whatsapp.VerifySms.b(r0);	 Catch:{ NumberFormatException -> 0x0852 }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x0852 }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x0852 }
        if (r0 != 0) goto L_0x01d1;
    L_0x01c8:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0854 }
        r2 = 29;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x0854 }
        if (r1 == 0) goto L_0x00dd;
    L_0x01d1:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0217 }
        r2 = r14.a;	 Catch:{ NumberFormatException -> 0x0217 }
        r2 = r2.c;	 Catch:{ NumberFormatException -> 0x0217 }
        r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x0217 }
        r2 = r2 * r12;
        com.whatsapp.VerifySms.d(r0, r2);	 Catch:{ NumberFormatException -> 0x0217 }
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0217 }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x0217 }
        r2 = com.whatsapp.VerifySms.p(r2);	 Catch:{ NumberFormatException -> 0x0217 }
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x0217 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0217 }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x0217 }
        r3 = 2131624773; // 0x7f0e0345 float:1.8876735E38 double:1.05316257E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ NumberFormatException -> 0x0217 }
        r5 = 0;
        r6 = r14.c;	 Catch:{ NumberFormatException -> 0x0217 }
        r7 = r14.c;	 Catch:{ NumberFormatException -> 0x0217 }
        r8 = com.whatsapp.VerifySms.p(r7);	 Catch:{ NumberFormatException -> 0x0217 }
        r6 = com.whatsapp.util.bm.g(r6, r8);	 Catch:{ NumberFormatException -> 0x0217 }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x0217 }
        r2 = r2.getString(r3, r4);	 Catch:{ NumberFormatException -> 0x0217 }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x0217 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0217 }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x0217 }
        r2 = com.whatsapp.VerifySms.p(r2);	 Catch:{ NumberFormatException -> 0x0217 }
        com.whatsapp.VerifySms.c(r0, r2);	 Catch:{ NumberFormatException -> 0x0217 }
        goto L_0x00dd;
    L_0x0217:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0856 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0856 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0856 }
        r3 = 39;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0856 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0856 }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x0856 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0856 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0856 }
        r3 = 55;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0856 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0856 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0856 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0856 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0856 }
        r2 = 29;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x0856 }
        if (r1 == 0) goto L_0x00dd;
    L_0x0247:
        r0 = com.whatsapp.avc.ERROR_TOO_MANY_ALL_METHODS;	 Catch:{ NumberFormatException -> 0x0856 }
        if (r15 != r0) goto L_0x02ec;
    L_0x024b:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0858 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0858 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0858 }
        r3 = 71;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0858 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0858 }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x0858 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0858 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0858 }
        r3 = 73;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0858 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0858 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0858 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0858 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0858 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0858 }
        r3 = 45;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0858 }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x0858 }
        r0 = 1;
        com.whatsapp.VerifySms.b(r0);	 Catch:{ NumberFormatException -> 0x0858 }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x0858 }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x0858 }
        if (r0 != 0) goto L_0x028f;
    L_0x0286:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x085a }
        r2 = 30;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x085a }
        if (r1 == 0) goto L_0x00dd;
    L_0x028f:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x02bc }
        r2 = r14.a;	 Catch:{ NumberFormatException -> 0x02bc }
        r2 = r2.c;	 Catch:{ NumberFormatException -> 0x02bc }
        r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x02bc }
        r2 = r2 * r12;
        com.whatsapp.VerifySms.d(r0, r2);	 Catch:{ NumberFormatException -> 0x02bc }
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x02bc }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x02bc }
        r2 = com.whatsapp.VerifySms.p(r2);	 Catch:{ NumberFormatException -> 0x02bc }
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x02bc }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x02bc }
        r2 = 35;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x02bc }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x02bc }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x02bc }
        r2 = com.whatsapp.VerifySms.p(r2);	 Catch:{ NumberFormatException -> 0x02bc }
        com.whatsapp.VerifySms.c(r0, r2);	 Catch:{ NumberFormatException -> 0x02bc }
        goto L_0x00dd;
    L_0x02bc:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x085c }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x085c }
        r2 = z;	 Catch:{ NumberFormatException -> 0x085c }
        r3 = 49;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x085c }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x085c }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x085c }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x085c }
        r2 = z;	 Catch:{ NumberFormatException -> 0x085c }
        r3 = 42;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x085c }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x085c }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x085c }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x085c }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x085c }
        r2 = 30;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x085c }
        if (r1 == 0) goto L_0x00dd;
    L_0x02ec:
        r0 = com.whatsapp.avc.ERROR_CONNECTIVITY;	 Catch:{ NumberFormatException -> 0x085c }
        if (r15 != r0) goto L_0x030f;
    L_0x02f0:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x085e }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x085e }
        r3 = 2131624725; // 0x7f0e0315 float:1.8876638E38 double:1.0531625464E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ NumberFormatException -> 0x085e }
        r5 = 0;
        r6 = r14.c;	 Catch:{ NumberFormatException -> 0x085e }
        r7 = 2131624132; // 0x7f0e00c4 float:1.8875435E38 double:1.0531622535E-314;
        r6 = r6.getString(r7);	 Catch:{ NumberFormatException -> 0x085e }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x085e }
        r2 = r2.getString(r3, r4);	 Catch:{ NumberFormatException -> 0x085e }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x085e }
        if (r1 == 0) goto L_0x00dd;
    L_0x030f:
        r0 = com.whatsapp.avc.ERROR_BAD_PARAMETER;	 Catch:{ NumberFormatException -> 0x0860 }
        if (r15 != r0) goto L_0x0356;
    L_0x0313:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0862 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0862 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0862 }
        r3 = 43;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0862 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0862 }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x0862 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0862 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0862 }
        r3 = 62;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0862 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0862 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0862 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0862 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x0862 }
        r2 = 35;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x0862 }
        com.whatsapp.App.v(r0);	 Catch:{ NumberFormatException -> 0x0862 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0862 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0862 }
        r3 = 68;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0862 }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x0862 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0862 }
        r2 = 27;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x0862 }
        if (r1 == 0) goto L_0x00dd;
    L_0x0356:
        r0 = com.whatsapp.avc.ERROR_MISSING_PARAMETER;	 Catch:{ NumberFormatException -> 0x0864 }
        if (r15 != r0) goto L_0x039d;
    L_0x035a:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0866 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0866 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0866 }
        r3 = 53;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0866 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0866 }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x0866 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0866 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0866 }
        r3 = 22;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0866 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0866 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0866 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0866 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x0866 }
        r2 = 64;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x0866 }
        com.whatsapp.App.v(r0);	 Catch:{ NumberFormatException -> 0x0866 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0866 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0866 }
        r3 = 24;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0866 }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x0866 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0866 }
        r2 = 28;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x0866 }
        if (r1 == 0) goto L_0x00dd;
    L_0x039d:
        r0 = com.whatsapp.avc.ERROR_OLD_VERSION;	 Catch:{ NumberFormatException -> 0x0868 }
        if (r15 != r0) goto L_0x03db;
    L_0x03a1:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x086a }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x086a }
        r2 = z;	 Catch:{ NumberFormatException -> 0x086a }
        r3 = 75;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x086a }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x086a }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x086a }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x086a }
        r2 = z;	 Catch:{ NumberFormatException -> 0x086a }
        r3 = 65;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x086a }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x086a }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x086a }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x086a }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x086a }
        r2 = z;	 Catch:{ NumberFormatException -> 0x086a }
        r3 = 51;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x086a }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x086a }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x086a }
        r2 = 23;
        r0.c(r2);	 Catch:{ NumberFormatException -> 0x086a }
        if (r1 == 0) goto L_0x00dd;
    L_0x03db:
        r0 = com.whatsapp.avc.ERROR_TOO_RECENT;	 Catch:{ NumberFormatException -> 0x086c }
        if (r15 != r0) goto L_0x0494;
    L_0x03df:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x086e }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x086e }
        r2 = z;	 Catch:{ NumberFormatException -> 0x086e }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x086e }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x086e }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x086e }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x086e }
        r2 = z;	 Catch:{ NumberFormatException -> 0x086e }
        r3 = 63;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x086e }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x086e }
        r2 = r14.a;	 Catch:{ NumberFormatException -> 0x086e }
        r2 = r2.c;	 Catch:{ NumberFormatException -> 0x086e }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x086e }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x086e }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x086e }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x086e }
        r2 = z;	 Catch:{ NumberFormatException -> 0x086e }
        r3 = 66;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x086e }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x086e }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x086e }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x086e }
        if (r0 != 0) goto L_0x042e;
    L_0x041e:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0870 }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x0870 }
        r3 = 2131624765; // 0x7f0e033d float:1.8876719E38 double:1.053162566E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x0870 }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x0870 }
        if (r1 == 0) goto L_0x00dd;
    L_0x042e:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x045d }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x045d }
        r2 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x045d }
        r2 = r2 * r12;
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x045d }
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x045d }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x045d }
        r4 = r14.c;	 Catch:{ NumberFormatException -> 0x045d }
        r5 = 2131624764; // 0x7f0e033c float:1.8876717E38 double:1.0531625657E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x045d }
        r7 = 0;
        r8 = r14.c;	 Catch:{ NumberFormatException -> 0x045d }
        r8 = com.whatsapp.util.bm.g(r8, r2);	 Catch:{ NumberFormatException -> 0x045d }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x045d }
        r4 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x045d }
        r0.g(r4);	 Catch:{ NumberFormatException -> 0x045d }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x045d }
        com.whatsapp.VerifySms.c(r0, r2);	 Catch:{ NumberFormatException -> 0x045d }
        goto L_0x00dd;
    L_0x045d:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0872 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0872 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0872 }
        r3 = 15;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0872 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0872 }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x0872 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0872 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0872 }
        r3 = 54;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0872 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0872 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0872 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0872 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0872 }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x0872 }
        r3 = 2131624765; // 0x7f0e033d float:1.8876719E38 double:1.053162566E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x0872 }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x0872 }
        if (r1 == 0) goto L_0x00dd;
    L_0x0494:
        r0 = com.whatsapp.avc.ERROR_BLOCKED;	 Catch:{ NumberFormatException -> 0x0872 }
        if (r15 != r0) goto L_0x04df;
    L_0x0498:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0874 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0874 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0874 }
        r3 = 74;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0874 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0874 }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x0874 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0874 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0874 }
        r3 = 26;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0874 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0874 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0874 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0874 }
        r0 = 12;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x0874 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0874 }
        com.whatsapp.VerifySms.t(r0);	 Catch:{ NumberFormatException -> 0x0874 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0874 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0874 }
        r3 = 28;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0874 }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x0874 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0874 }
        com.whatsapp.VerifySms.u(r0);	 Catch:{ NumberFormatException -> 0x0874 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0874 }
        com.whatsapp.VerifySms.o(r0);	 Catch:{ NumberFormatException -> 0x0874 }
        if (r1 == 0) goto L_0x00dd;
    L_0x04df:
        r0 = com.whatsapp.avc.ERROR_NEXT_METHOD;	 Catch:{ NumberFormatException -> 0x0876 }
        if (r15 != r0) goto L_0x051d;
    L_0x04e3:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0878 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0878 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0878 }
        r3 = 48;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0878 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0878 }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x0878 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0878 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0878 }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0878 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0878 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0878 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0878 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0878 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0878 }
        r3 = 52;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0878 }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x0878 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0878 }
        r2 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x0878 }
        if (r1 == 0) goto L_0x00dd;
    L_0x051d:
        r0 = com.whatsapp.avc.ERROR_TOO_MANY_GUESSES;	 Catch:{ NumberFormatException -> 0x087a }
        if (r15 != r0) goto L_0x05be;
    L_0x0521:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x087c }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x087c }
        r2 = z;	 Catch:{ NumberFormatException -> 0x087c }
        r3 = 46;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x087c }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x087c }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x087c }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x087c }
        r2 = z;	 Catch:{ NumberFormatException -> 0x087c }
        r3 = 60;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x087c }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x087c }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x087c }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x087c }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x087c }
        r2 = z;	 Catch:{ NumberFormatException -> 0x087c }
        r3 = 27;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x087c }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x087c }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x087c }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x087c }
        if (r0 != 0) goto L_0x0561;
    L_0x0558:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x087e }
        r2 = 31;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x087e }
        if (r1 == 0) goto L_0x00dd;
    L_0x0561:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x058e }
        r2 = r14.a;	 Catch:{ NumberFormatException -> 0x058e }
        r2 = r2.c;	 Catch:{ NumberFormatException -> 0x058e }
        r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x058e }
        r2 = r2 * r12;
        com.whatsapp.VerifySms.d(r0, r2);	 Catch:{ NumberFormatException -> 0x058e }
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x058e }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x058e }
        r2 = com.whatsapp.VerifySms.p(r2);	 Catch:{ NumberFormatException -> 0x058e }
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x058e }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x058e }
        r2 = 36;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x058e }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x058e }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x058e }
        r2 = com.whatsapp.VerifySms.p(r2);	 Catch:{ NumberFormatException -> 0x058e }
        com.whatsapp.VerifySms.c(r0, r2);	 Catch:{ NumberFormatException -> 0x058e }
        goto L_0x00dd;
    L_0x058e:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0880 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0880 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0880 }
        r3 = 21;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0880 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0880 }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x0880 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0880 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0880 }
        r3 = 34;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0880 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0880 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0880 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0880 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0880 }
        r2 = 31;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x0880 }
        if (r1 == 0) goto L_0x00dd;
    L_0x05be:
        r0 = com.whatsapp.avc.ERROR_PROVIDER_TIMEOUT;	 Catch:{ NumberFormatException -> 0x0880 }
        if (r15 != r0) goto L_0x066f;
    L_0x05c2:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0882 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0882 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0882 }
        r3 = 23;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0882 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0882 }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x0882 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0882 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0882 }
        r3 = 32;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0882 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0882 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0882 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0882 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0882 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0882 }
        r3 = 37;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0882 }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x0882 }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x0882 }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x0882 }
        if (r0 != 0) goto L_0x0609;
    L_0x05f9:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0884 }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x0884 }
        r3 = 2131624779; // 0x7f0e034b float:1.8876747E38 double:1.053162573E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x0884 }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x0884 }
        if (r1 == 0) goto L_0x00dd;
    L_0x0609:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x0638 }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x0638 }
        r2 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0638 }
        r2 = r2 * r12;
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0638 }
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x0638 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0638 }
        r4 = r14.c;	 Catch:{ NumberFormatException -> 0x0638 }
        r5 = 2131624778; // 0x7f0e034a float:1.8876745E38 double:1.0531625726E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x0638 }
        r7 = 0;
        r8 = r14.c;	 Catch:{ NumberFormatException -> 0x0638 }
        r8 = com.whatsapp.util.bm.g(r8, r2);	 Catch:{ NumberFormatException -> 0x0638 }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x0638 }
        r4 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x0638 }
        r0.g(r4);	 Catch:{ NumberFormatException -> 0x0638 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0638 }
        com.whatsapp.VerifySms.c(r0, r2);	 Catch:{ NumberFormatException -> 0x0638 }
        goto L_0x00dd;
    L_0x0638:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0886 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0886 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0886 }
        r3 = 56;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0886 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0886 }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x0886 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0886 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0886 }
        r3 = 19;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0886 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0886 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0886 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0886 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0886 }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x0886 }
        r3 = 2131624779; // 0x7f0e034b float:1.8876747E38 double:1.053162573E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x0886 }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x0886 }
        if (r1 == 0) goto L_0x00dd;
    L_0x066f:
        r0 = com.whatsapp.avc.ERROR_PROVIDER_UNROUTABLE;	 Catch:{ NumberFormatException -> 0x0886 }
        if (r15 != r0) goto L_0x0720;
    L_0x0673:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0888 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0888 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0888 }
        r3 = 38;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0888 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0888 }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x0888 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0888 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0888 }
        r3 = 20;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0888 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0888 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0888 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0888 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0888 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0888 }
        r3 = 61;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0888 }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x0888 }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x0888 }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x0888 }
        if (r0 != 0) goto L_0x06ba;
    L_0x06aa:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x088a }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x088a }
        r3 = 2131624781; // 0x7f0e034d float:1.8876751E38 double:1.053162574E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x088a }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x088a }
        if (r1 == 0) goto L_0x00dd;
    L_0x06ba:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x06e9 }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x06e9 }
        r2 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x06e9 }
        r2 = r2 * r12;
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x06e9 }
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x06e9 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x06e9 }
        r4 = r14.c;	 Catch:{ NumberFormatException -> 0x06e9 }
        r5 = 2131624780; // 0x7f0e034c float:1.887675E38 double:1.0531625736E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x06e9 }
        r7 = 0;
        r8 = r14.c;	 Catch:{ NumberFormatException -> 0x06e9 }
        r8 = com.whatsapp.util.bm.g(r8, r2);	 Catch:{ NumberFormatException -> 0x06e9 }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x06e9 }
        r4 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x06e9 }
        r0.g(r4);	 Catch:{ NumberFormatException -> 0x06e9 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x06e9 }
        com.whatsapp.VerifySms.c(r0, r2);	 Catch:{ NumberFormatException -> 0x06e9 }
        goto L_0x00dd;
    L_0x06e9:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x088c }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x088c }
        r2 = z;	 Catch:{ NumberFormatException -> 0x088c }
        r3 = 40;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x088c }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x088c }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x088c }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x088c }
        r2 = z;	 Catch:{ NumberFormatException -> 0x088c }
        r3 = 12;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x088c }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x088c }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x088c }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x088c }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x088c }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x088c }
        r3 = 2131624781; // 0x7f0e034d float:1.8876751E38 double:1.053162574E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x088c }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x088c }
        if (r1 == 0) goto L_0x00dd;
    L_0x0720:
        r0 = com.whatsapp.avc.ERROR_NO_ROUTES;	 Catch:{ NumberFormatException -> 0x088c }
        if (r15 != r0) goto L_0x07d1;
    L_0x0724:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x088e }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x088e }
        r2 = z;	 Catch:{ NumberFormatException -> 0x088e }
        r3 = 69;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x088e }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x088e }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x088e }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x088e }
        r2 = z;	 Catch:{ NumberFormatException -> 0x088e }
        r3 = 29;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x088e }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x088e }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x088e }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x088e }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x088e }
        r2 = z;	 Catch:{ NumberFormatException -> 0x088e }
        r3 = 72;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x088e }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x088e }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x088e }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x088e }
        if (r0 != 0) goto L_0x076b;
    L_0x075b:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0890 }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x0890 }
        r3 = 2131624781; // 0x7f0e034d float:1.8876751E38 double:1.053162574E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x0890 }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x0890 }
        if (r1 == 0) goto L_0x00dd;
    L_0x076b:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x079a }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x079a }
        r2 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x079a }
        r2 = r2 * r12;
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x079a }
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x079a }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x079a }
        r4 = r14.c;	 Catch:{ NumberFormatException -> 0x079a }
        r5 = 2131624780; // 0x7f0e034c float:1.887675E38 double:1.0531625736E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x079a }
        r7 = 0;
        r8 = r14.c;	 Catch:{ NumberFormatException -> 0x079a }
        r8 = com.whatsapp.util.bm.g(r8, r2);	 Catch:{ NumberFormatException -> 0x079a }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x079a }
        r4 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x079a }
        r0.g(r4);	 Catch:{ NumberFormatException -> 0x079a }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x079a }
        com.whatsapp.VerifySms.c(r0, r2);	 Catch:{ NumberFormatException -> 0x079a }
        goto L_0x00dd;
    L_0x079a:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0892 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0892 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0892 }
        r3 = 44;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0892 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0892 }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x0892 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0892 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0892 }
        r3 = 57;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0892 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0892 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0892 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0892 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0892 }
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x0892 }
        r3 = 2131624781; // 0x7f0e034d float:1.8876751E38 double:1.053162574E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x0892 }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x0892 }
        if (r1 == 0) goto L_0x00dd;
    L_0x07d1:
        r0 = com.whatsapp.avc.ERROR_BAD_TOKEN;	 Catch:{ NumberFormatException -> 0x0892 }
        if (r15 != r0) goto L_0x00dd;
    L_0x07d5:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 14;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r14.b;
        r0 = r0.append(r2);
        r2 = z;
        r3 = 36;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r14.c;
        r2 = z;
        r3 = 31;
        r2 = r2[r3];
        r0.b(r2);
        r0 = com.whatsapp.App.G;
        r2 = 2;
        if (r0 != r2) goto L_0x0894;
    L_0x080b:
        r0 = r14.c;
        r2 = 2131624748; // 0x7f0e032c float:1.8876684E38 double:1.053162558E-314;
        r0 = r0.getString(r2);
    L_0x0814:
        r2 = r14.c;	 Catch:{ NumberFormatException -> 0x08b8 }
        r3 = r14.c;	 Catch:{ NumberFormatException -> 0x08b8 }
        r4 = 2131624724; // 0x7f0e0314 float:1.8876636E38 double:1.053162546E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x08b8 }
        r6 = 0;
        r5[r6] = r0;	 Catch:{ NumberFormatException -> 0x08b8 }
        r0 = r3.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x08b8 }
        r2.g(r0);	 Catch:{ NumberFormatException -> 0x08b8 }
        if (r1 == 0) goto L_0x00dd;
    L_0x082a:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x08ba }
        r0 = r0.d;	 Catch:{ NumberFormatException -> 0x08ba }
        if (r0 == 0) goto L_0x0840;
    L_0x0830:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x08ba }
        r0 = r0.d;	 Catch:{ NumberFormatException -> 0x08ba }
        com.whatsapp.VerifySms.b(r0);	 Catch:{ NumberFormatException -> 0x08ba }
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x08ba }
        r1 = r14.a;	 Catch:{ NumberFormatException -> 0x08ba }
        r1 = r1.d;	 Catch:{ NumberFormatException -> 0x08ba }
        com.whatsapp.App.e(r0, r1);	 Catch:{ NumberFormatException -> 0x08ba }
    L_0x0840:
        r0 = 10;
        com.whatsapp.VerifySms.a(r0);
        r0 = r14.c;
        com.whatsapp.VerifySms.t(r0);
        goto L_0x00dd;
    L_0x084c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x084e }
    L_0x084e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0850 }
    L_0x0850:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0852 }
    L_0x0852:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0854 }
    L_0x0854:
        r0 = move-exception;
        throw r0;
    L_0x0856:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0858 }
    L_0x0858:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x085a }
    L_0x085a:
        r0 = move-exception;
        throw r0;
    L_0x085c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x085e }
    L_0x085e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0860 }
    L_0x0860:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0862 }
    L_0x0862:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0864 }
    L_0x0864:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0866 }
    L_0x0866:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0868 }
    L_0x0868:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x086a }
    L_0x086a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x086c }
    L_0x086c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x086e }
    L_0x086e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0870 }
    L_0x0870:
        r0 = move-exception;
        throw r0;
    L_0x0872:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0874 }
    L_0x0874:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0876 }
    L_0x0876:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0878 }
    L_0x0878:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x087a }
    L_0x087a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x087c }
    L_0x087c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x087e }
    L_0x087e:
        r0 = move-exception;
        throw r0;
    L_0x0880:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0882 }
    L_0x0882:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0884 }
    L_0x0884:
        r0 = move-exception;
        throw r0;
    L_0x0886:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0888 }
    L_0x0888:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x088a }
    L_0x088a:
        r0 = move-exception;
        throw r0;
    L_0x088c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x088e }
    L_0x088e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0890 }
    L_0x0890:
        r0 = move-exception;
        throw r0;
    L_0x0892:
        r0 = move-exception;
        throw r0;
    L_0x0894:
        r0 = com.whatsapp.App.G;
        if (r0 != 0) goto L_0x08a3;
    L_0x0898:
        r0 = r14.c;
        r2 = 2131624749; // 0x7f0e032d float:1.8876687E38 double:1.0531625583E-314;
        r0 = r0.getString(r2);
        goto L_0x0814;
    L_0x08a3:
        r0 = r14.c;
        r2 = 2131624750; // 0x7f0e032e float:1.8876689E38 double:1.053162559E-314;
        r3 = new java.lang.Object[r10];
        r4 = z;
        r5 = 70;
        r4 = r4[r5];
        r3[r11] = r4;
        r0 = r0.getString(r2, r3);
        goto L_0x0814;
    L_0x08b8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08ba }
    L_0x08ba:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ov.a(com.whatsapp.avc):void");
    }

    protected void onPostExecute(Object obj) {
        a((avc) obj);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((String[]) objArr);
    }
}
