package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Parcelable;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class or {
    private static final String[] z;

    static {
        String[] strArr = new String[129];
        String str = ">M";
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
                        i3 = 4;
                        break;
                    case ay.f /*1*/:
                        i3 = 109;
                        break;
                    case ay.n /*2*/:
                        i3 = 10;
                        break;
                    case ay.p /*3*/:
                        i3 = 63;
                        break;
                    default:
                        i3 = 124;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "e\u0003nM\u0013m\t$V\u0012p\bdKRa\u0015~M\u001d*>^m9E ";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "J\u0002*S\u0013cMlV\u0010aM~P\\e\u0019~^\u001flC\u0000";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "e\u0003nM\u0013m\t$V\u0012p\bdKRe\u000e~V\u0013jCYz2@";
                    obj = 3;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "e\u001dzS\u0015g\f~V\u0013jBpV\f";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "e\u0003nM\u0013m\t$V\u0012p\bdKRa\u0015~M\u001d*(G~5H";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "e\u0003nM\u0013m\t$V\u0012p\bdKRa\u0015~M\u001d*>^m9E ";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "e\u0003nM\u0013m\t$V\u0012p\bdKRe\u000e~V\u0013jCYz2@2Gj0P$Zs9";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "t\u0001kV\u0012+\u0019oG\b";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    str = "e\u0003nM\u0013m\t$V\u0012p\bdKRa\u0015~M\u001d*>_}6A.^";
                    obj = 9;
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    strArr2 = strArr3;
                    str = "@.'m(A)*";
                    obj = 10;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "@.'}=G?G\u001f";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "P&'y;)]*";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "J:'h=T@;\u001f";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "P&'q,)";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "P&'q/)";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "k\u001fm\u0011\u001dg\u001fk\u0011=G?K";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "@.'q:K#K\u001f";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "+\u001dxP\u001f+\u001esLSo\bxQ\u0019hBeL\u000ea\u0001o^\u000fa";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "$\u0018dT\u0012k\u001ad\u001f\na\u001fyV\u0013j";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "+\u001dxP\u001f+\u001esLSo\bxQ\u0019hBeL\u000ea\u0001o^\u000fa";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "+\u001dxP\u001f+\u001esLSo\bxQ\u0019hB|Z\u000ew\u0004eQ";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "+\u001dxP\u001f+\u001esLSo\bxQ\u0019hB|Z\u000ew\u0004eQ";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "Q\u0003aQ\u0013s\u0003*M\u0019h\bkL\u0019";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "G)G~\\)MOI8kMxZ\n*MH";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "G)G~\\)MOI8kMxZ\n*M:";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "L>_o=";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "H9O";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "G)G~\\)Mow.T)";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "L>Z~W";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "G)G~\\)MOI8kMxZ\n*MK";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "Q ^l";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "L>No=";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "m)Oq";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "Q#Aq3S#";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "A)Mz";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "C=Xl";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "G)G~";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "G)G~\\)M;G.P9";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "L>Z~";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "a\u0000kV\u0010)\u001eoQ\u0018a\u001f%^\ftM";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "a\u0000kV\u0010";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "}\fd[\u0019|Cg^\u0015h";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "$\u0011*";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "e\u0003nM\u0013m\t$V\u0012p\bdKRa\u0015~M\u001d*$Dv(M,F`5J9Oq(W";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "l\u0002~R\u001dm\u0001";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "e\u0003nM\u0013m\t$R\u001dm\u0001";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "b\u001eiTRoT";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "i\fcS\u0018v\u0002c[";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "g\u0002g\u0011\u001ee\u0014nV\u0012*\u000feP\u0011a\u001fkQ\u001b";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "c\u0000";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "J\"Dz";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "C>G";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "Q#Aq3S#";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "G)G~";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "W$Z";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "~\u0017";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "t\u0005eQ\u0019";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "6C;\u000eR1]?";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "G\fxM\u0015a\u001f";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "t\u0005";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "@\b|V\u001faMCl3<[:\u000e";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    str = "S\bh\u001f\u000fa\u001eyV\u0013j";
                    obj = 62;
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    strArr2 = strArr3;
                    str = "T\u0005eQ\u0019$9sO\u0019";
                    obj = 63;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "Q=";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "J\b~H\u0013v\u0006*k\u0005t\b";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "JBK\u001fTj\u0002*K\u0019h\bzW\u0013j\u0014*R\u001dj\fmZ\u000e-";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "W\u0004g";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i] = str;
                    i = 69;
                    str = "G\u0002dQ\u0019g\u0019cP\u0012";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i] = str;
                    i = 70;
                    str = "h\u0004lZ\bm\u0000o";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i] = str;
                    i = 71;
                    str = "v\bfZ\u001dw\b";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i] = str;
                    i = 72;
                    str = "a\u0015iZ\fp\u0004eQ\\`\u0018xV\u0012cMoR\u001dm\u0001*\\\u0013i\u001deL\u0015p\u0004eQ";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i] = str;
                    i = 73;
                    str = "@#";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case 72:
                    strArr2[i] = str;
                    i = 74;
                    str = "G\u0002dK\u0019|\u0019";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i] = str;
                    i = 75;
                    str = "Q#Aq3S#*\u0017\u0012kM~Z\u0010a\u001dbP\u0012}Mg^\u0012e\noMU";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case 74:
                    strArr2[i] = str;
                    i = 76;
                    str = "O\bxQ\u0019h";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case 75:
                    strArr2[i] = str;
                    i = 77;
                    str = "q\u0003xZ\u001bm\u001e~Z\u000ea\t";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case 76:
                    strArr2[i] = str;
                    i = 78;
                    str = "F\u0018cS\u0018";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case 77:
                    strArr2[i] = str;
                    i = 79;
                    str = "R\bxL\u0015k\u0003";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case 78:
                    strArr2[i] = str;
                    i = 80;
                    str = "T\u001fe[\tg\u0019";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case 79:
                    strArr2[i] = str;
                    i = 81;
                    str = "t\u0001kF";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case 80:
                    strArr2[i] = str;
                    i = 82;
                    str = "v\bfZ\u001dw\b";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case 81:
                    strArr2[i] = str;
                    i = 83;
                    str = "\u000eg\u00005";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case 82:
                    strArr2[i] = str;
                    i = 84;
                    str = "q\u0003aQ\u0013s\u0003";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case 83:
                    strArr2[i] = str;
                    i = 85;
                    str = "p\u0002aZ\u0012$\u001ekI\u0019`";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case 84:
                    strArr2[i] = str;
                    i = 86;
                    str = "H.";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case 85:
                    strArr2[i] = str;
                    i = 87;
                    str = "H*";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case 86:
                    strArr2[i] = str;
                    i = 88;
                    str = "@\b|V\u001fa";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case 87:
                    strArr2[i] = str;
                    i = 89;
                    str = "Q#Aq3S#*\u0017\u0012kM~Z\u0010a\u001dbP\u0012}Mg^\u0012e\noMU";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case 88:
                    strArr2[i] = str;
                    i = 90;
                    str = "a\u0015zV\u000ee\u0019cP\u0012[\tkK\u0019";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case 89:
                    strArr2[i] = str;
                    i = 91;
                    str = "\u000eg\u00005\u0007\u007f\bg^\u0015h2oG\u001fa\u001d~V\u0013j\u0010w5";
                    obj = 90;
                    strArr2 = strArr3;
                    break;
                case 90:
                    strArr2[i] = str;
                    i = 92;
                    str = "I\u0002nZ\u0010";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case 91:
                    strArr2[i] = str;
                    i = 93;
                    str = "t\u0001kF";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case 92:
                    strArr2[i] = str;
                    i = 94;
                    str = "V\fnV\u0013$ I|QI#I";
                    obj = 93;
                    strArr2 = strArr3;
                    break;
                case 93:
                    strArr2[i] = str;
                    i = 95;
                    str = "I\fdJ\u001ae\u000e~J\u000ea\u001f";
                    obj = 94;
                    strArr2 = strArr3;
                    break;
                case 94:
                    strArr2[i] = str;
                    i = 96;
                    str = "T:";
                    obj = 95;
                    strArr2 = strArr3;
                    break;
                case 95:
                    strArr2[i] = str;
                    i = 97;
                    str = "P\fxX\u0019p";
                    obj = 96;
                    strArr2 = strArr3;
                    break;
                case 96:
                    strArr2[i] = str;
                    i = 98;
                    str = "G.e[\u0019";
                    obj = 97;
                    strArr2 = strArr3;
                    break;
                case 97:
                    strArr2[i] = str;
                    i = 99;
                    str = "@\bhJ\u001b$\u0004dY\u0013";
                    obj = 98;
                    strArr2 = strArr3;
                    break;
                case 98:
                    strArr2[i] = str;
                    i = 100;
                    str = "~\u0017";
                    obj = 99;
                    strArr2 = strArr3;
                    break;
                case 99:
                    strArr2[i] = str;
                    i = 101;
                    str = "$E";
                    obj = 100;
                    strArr2 = strArr3;
                    break;
                case 100:
                    strArr2[i] = str;
                    i = 102;
                    str = "W\u0002iT\u0019pMIP\u0012j";
                    obj = 101;
                    strArr2 = strArr3;
                    break;
                case 101:
                    strArr2[i] = str;
                    i = 103;
                    str = "W\bxI\u0019v";
                    obj = 102;
                    strArr2 = strArr3;
                    break;
                case 102:
                    strArr2[i] = str;
                    i = 104;
                    str = "JBK";
                    obj = 103;
                    strArr2 = strArr3;
                    break;
                case 103:
                    strArr2[i] = str;
                    i = 105;
                    str = "@\u0004yK\u000em\u000f\u007fK\u0015k\u0003";
                    obj = 104;
                    strArr2 = strArr3;
                    break;
                case 104:
                    strArr2[i] = str;
                    i = 106;
                    str = ")@YJ\ft\u0002xK\\M\u0003lPQ)g";
                    obj = 105;
                    strArr2 = strArr3;
                    break;
                case 105:
                    strArr2[i] = str;
                    i = 107;
                    str = "S\bh\u001f\u000fa\u001eyV\u0013j";
                    obj = 106;
                    strArr2 = strArr3;
                    break;
                case 106:
                    strArr2[i] = str;
                    i = 108;
                    str = "A\u0015z";
                    obj = 107;
                    strArr2 = strArr3;
                    break;
                case 107:
                    strArr2[i] = str;
                    str = "W$G\u001f1G.'r2G";
                    obj = 108;
                    i = 109;
                    strArr2 = strArr3;
                    break;
                case 108:
                    strArr2[i] = str;
                    i = 110;
                    strArr2 = strArr3;
                    str = "e\u000e~V\na";
                    obj = 109;
                    break;
                case 109:
                    strArr2[i] = str;
                    i = 111;
                    str = "g\u0005dJ\u0011$";
                    obj = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i] = str;
                    i = 112;
                    str = "g\u0002g\u0011\u000bl\f~L\u001dt\u001dUO\u000ea\u000boM\u0019j\u000eoL";
                    obj = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i] = str;
                    i = 113;
                    str = "Q#Aq3S#*\u0017\u0012kM~Z\u0010a\u001dbP\u0012}Mg^\u0012e\noMU";
                    obj = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i] = str;
                    i = 114;
                    str = "I\u0004yK\u0005t\bn";
                    obj = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i] = str;
                    i = 115;
                    str = "a\u0000kV\u0010+\u0003\u007fR\u001ea\u001f%K\u000em\u0000%Z\u000ev\u0002x";
                    obj = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i] = str;
                    i = 116;
                    str = "}\u0014sFQI '[\u0018$%B\u0005\u0011iWyLRW>Ye";
                    obj = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i] = str;
                    i = 117;
                    str = "g\u000e";
                    obj = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i] = str;
                    i = 118;
                    str = "@\by\\\u000em\u001d~V\u0013j";
                    obj = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i] = str;
                    i = 119;
                    str = "q\u0003aQ\u0013s\u0003";
                    obj = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i] = str;
                    i = 120;
                    str = "W.%g?";
                    obj = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i] = str;
                    i = 121;
                    str = "6C;\u000eR1]?";
                    obj = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i] = str;
                    i = 122;
                    str = "JBK\u001fTj\u0002*K\u0019h\bzW\u0013j\u0014*R\u001dj\fmZ\u000e-";
                    obj = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i] = str;
                    i = 123;
                    str = "@\u0004kX\u0012k\u001e~V\u001f$.e[\u0019w";
                    obj = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i] = str;
                    i = 124;
                    str = "JBK";
                    obj = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i] = str;
                    i = 125;
                    str = "K>";
                    obj = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i] = str;
                    i = 126;
                    str = "J\"Dz";
                    obj = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i] = str;
                    i = 127;
                    str = "g\u0002dQ\u0019g\u0019cI\u0015p\u0014";
                    obj = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i] = str;
                    i = 128;
                    str = "$E";
                    obj = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "e\u0003nM\u0013m\t$V\u0012p\bdKRa\u0015~M\u001d*9Og(";
                    obj = null;
                    break;
            }
        }
    }

    private static int a(String str, String str2, int i) {
        int i2 = 0;
        int i3 = App.az;
        int i4 = -1;
        if (str != null && str2 != null && str.length() >= i && str2.length() >= i) {
            int length = str.length() - i;
            int length2 = str2.length() - i;
            i4 = 0;
            while (i2 < i) {
                if (str.charAt(length + i2) != str2.charAt(length2 + i2)) {
                    i4++;
                }
                i2++;
                if (i3 != 0) {
                    break;
                }
            }
        }
        return i4;
    }

    private static String a(int i) {
        switch (i) {
            case ay.f /*1*/:
                return z[37];
            case ay.n /*2*/:
                return z[36];
            case ay.p /*3*/:
                return z[32];
            case aj.i /*4*/:
                return z[38];
            case aV.r /*5*/:
                return z[26];
            case aV.i /*6*/:
                return z[31];
            case a8.s /*7*/:
                return z[39];
            case a8.n /*8*/:
                return z[33];
            case a6.D /*9*/:
                return z[27];
            case a6.h /*10*/:
                return z[40];
            case a6.e /*11*/:
                return z[34];
            case a6.s /*12*/:
                return z[25];
            case a6.z /*13*/:
                return z[28];
            case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                return z[29];
            case vk.SherlockTheme_actionModeBackground /*15*/:
                return z[30];
            default:
                return z[35];
        }
    }

    public static void a(DialogToastActivity dialogToastActivity, String str, String str2, ArrayList arrayList, String str3) {
        a(dialogToastActivity, dialogToastActivity, str, str2, arrayList, str3);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a() {
        /*
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = com.whatsapp.App.a;	 Catch:{ Exception -> 0x0096 }
        r2 = 0;
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ Exception -> 0x0096 }
        r0 = r0.a(r2, r4);	 Catch:{ Exception -> 0x0096 }
        r2 = r0.b;	 Catch:{ Exception -> 0x0094 }
        if (r2 == 0) goto L_0x002c;
    L_0x0013:
        r2 = z;	 Catch:{ Exception -> 0x0094 }
        r3 = 15;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0094 }
        r2 = r1.append(r2);	 Catch:{ Exception -> 0x0094 }
        r3 = r0.b;	 Catch:{ Exception -> 0x0094 }
        r3 = r3.size();	 Catch:{ Exception -> 0x0094 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0094 }
        r3 = 32;
        r2.append(r3);	 Catch:{ Exception -> 0x0094 }
    L_0x002c:
        r2 = r0.a;	 Catch:{ Exception -> 0x00a1 }
        if (r2 == 0) goto L_0x0049;
    L_0x0030:
        r2 = z;	 Catch:{ Exception -> 0x00a1 }
        r3 = 16;
        r2 = r2[r3];	 Catch:{ Exception -> 0x00a1 }
        r2 = r1.append(r2);	 Catch:{ Exception -> 0x00a1 }
        r0 = r0.a;	 Catch:{ Exception -> 0x00a1 }
        r0 = r0.size();	 Catch:{ Exception -> 0x00a1 }
        r0 = r2.append(r0);	 Catch:{ Exception -> 0x00a1 }
        r2 = 32;
        r0.append(r2);	 Catch:{ Exception -> 0x00a1 }
    L_0x0049:
        r0 = z;	 Catch:{ ClassNotFoundException -> 0x00b2 }
        r2 = 17;
        r0 = r0[r2];	 Catch:{ ClassNotFoundException -> 0x00b2 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x00b2 }
        r0 = z;	 Catch:{ ClassNotFoundException -> 0x00b2 }
        r2 = 14;
        r0 = r0[r2];	 Catch:{ ClassNotFoundException -> 0x00b2 }
        r1.append(r0);	 Catch:{ ClassNotFoundException -> 0x00b2 }
    L_0x005b:
        r0 = com.whatsapp.a54.A();	 Catch:{ Exception -> 0x00a3 }
        if (r0 == 0) goto L_0x0083;
    L_0x0061:
        r0 = com.whatsapp.a54.p();	 Catch:{ Exception -> 0x00a5 }
        if (r0 == 0) goto L_0x0070;
    L_0x0067:
        r0 = z;	 Catch:{ Exception -> 0x00a5 }
        r2 = 11;
        r0 = r0[r2];	 Catch:{ Exception -> 0x00a5 }
        r1.append(r0);	 Catch:{ Exception -> 0x00a5 }
    L_0x0070:
        r0 = com.whatsapp.a54.z();	 Catch:{ Exception -> 0x00a7 }
        if (r0 == 0) goto L_0x008c;
    L_0x0076:
        r0 = z;	 Catch:{ Exception -> 0x00a9 }
        r2 = 12;
        r0 = r0[r2];	 Catch:{ Exception -> 0x00a9 }
        r1.append(r0);	 Catch:{ Exception -> 0x00a9 }
        r0 = com.whatsapp.App.az;	 Catch:{ Exception -> 0x00a9 }
        if (r0 == 0) goto L_0x008c;
    L_0x0083:
        r0 = z;	 Catch:{ Exception -> 0x00a9 }
        r2 = 18;
        r0 = r0[r2];	 Catch:{ Exception -> 0x00a9 }
        r1.append(r0);	 Catch:{ Exception -> 0x00a9 }
    L_0x008c:
        r0 = r1.length();	 Catch:{ Exception -> 0x00ab }
        if (r0 != 0) goto L_0x00ad;
    L_0x0092:
        r0 = 0;
    L_0x0093:
        return r0;
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        r0 = z;
        r2 = 13;
        r0 = r0[r2];
        r1.append(r0);
        goto L_0x0049;
    L_0x00a1:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0096 }
    L_0x00a3:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00a5 }
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r0 = r1.toString();
        goto L_0x0093;
    L_0x00b2:
        r0 = move-exception;
        goto L_0x005b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.or.a():java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(android.content.Context r4) {
        /*
        r0 = z;
        r1 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r0 = r0[r1];
        r0 = r4.getSystemService(r0);
        r0 = (android.net.ConnectivityManager) r0;
        r0 = r0.getActiveNetworkInfo();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        if (r0 == 0) goto L_0x003d;
    L_0x0017:
        r2 = r0.getTypeName();
        a(r1, r2);
        r0 = r0.getSubtypeName();
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 != 0) goto L_0x0039;
    L_0x0028:
        r2 = z;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r2 = r2[r3];
        r1.append(r2);
        a(r1, r0);
        r0 = 41;
        r1.append(r0);
    L_0x0039:
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0046;
    L_0x003d:
        r0 = z;
        r2 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r0 = r0[r2];
        r1.append(r0);
    L_0x0046:
        r0 = r1.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.or.a(android.content.Context):java.lang.String");
    }

    public static void a(Intent intent, Activity activity, ho hoVar, String str) {
        int i = App.az;
        List arrayList = new ArrayList();
        List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities != null) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                String str2 = activityInfo.name;
                String str3 = activityInfo.applicationInfo.packageName;
                Log.i(z[41] + str3 + z[44] + str2);
                if (str3.contains(z[51]) || str3.contains(z[42]) || str3.contains(z[48]) || str3.contains(z[49]) || str3.contains(z[46]) || str3.contains(z[47]) || str3.contains(z[50]) || str3.contains(z[43])) {
                    Intent intent2 = (Intent) intent.clone();
                    intent2.setClassName(str3, str2);
                    intent2.setPackage(str3);
                    arrayList.add(intent2);
                    continue;
                }
                if (i != 0) {
                    break;
                }
            }
        }
        if (arrayList.size() == 0) {
            if (hoVar != null) {
                hoVar.a(R.string.error_no_email_client);
                if (i == 0) {
                    return;
                }
            }
            App.b((Context) activity, (int) R.string.error_no_email_client, 0);
            if (i == 0) {
                return;
            }
        }
        Intent createChooser = Intent.createChooser((Intent) arrayList.get(arrayList.size() - 1), str);
        if (arrayList.size() > 1) {
            arrayList.remove(arrayList.size() - 1);
            createChooser.putExtra(z[45], (Parcelable[]) arrayList.toArray(new Intent[arrayList.size()]));
        }
        activity.startActivity(createChooser);
    }

    private static void a(StringBuilder stringBuilder, String str) {
        int i = App.az;
        if (str != null) {
            int i2 = 0;
            while (i2 < str.length()) {
                stringBuilder.append(str.charAt(i2)).append('.');
                i2++;
                if (i != 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b() {
        /*
        r0 = z;
        r1 = 19;
        r0 = r0[r1];
        r0 = z;
        r1 = 22;
        r0 = r0[r1];
        r2 = 0;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r1 = new java.io.BufferedReader;	 Catch:{ all -> 0x0056 }
        r0 = new java.io.FileReader;	 Catch:{ all -> 0x0056 }
        r4 = z;	 Catch:{ all -> 0x0056 }
        r5 = 21;
        r4 = r4[r5];	 Catch:{ all -> 0x0056 }
        r0.<init>(r4);	 Catch:{ all -> 0x0056 }
        r1.<init>(r0);	 Catch:{ all -> 0x0056 }
        r0 = r1.readLine();	 Catch:{ all -> 0x0089 }
        r3.append(r0);	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x002e;
    L_0x002b:
        r1.close();	 Catch:{ IOException -> 0x005e }
    L_0x002e:
        r2 = r1;
    L_0x002f:
        r1 = new java.io.BufferedReader;	 Catch:{ all -> 0x006f }
        r0 = new java.io.FileReader;	 Catch:{ all -> 0x006f }
        r4 = z;	 Catch:{ all -> 0x006f }
        r5 = 23;
        r4 = r4[r5];	 Catch:{ all -> 0x006f }
        r0.<init>(r4);	 Catch:{ all -> 0x006f }
        r1.<init>(r0);	 Catch:{ all -> 0x006f }
        r0 = 32;
        r0 = r3.append(r0);	 Catch:{ all -> 0x0087 }
        r2 = r1.readLine();	 Catch:{ all -> 0x0087 }
        r0.append(r2);	 Catch:{ all -> 0x0087 }
        if (r1 == 0) goto L_0x0051;
    L_0x004e:
        r1.close();	 Catch:{ IOException -> 0x0077 }
    L_0x0051:
        r0 = r3.toString();
        return r0;
    L_0x0056:
        r0 = move-exception;
        r1 = r2;
    L_0x0058:
        if (r1 == 0) goto L_0x005d;
    L_0x005a:
        r1.close();	 Catch:{ IOException -> 0x006d }
    L_0x005d:
        throw r0;	 Catch:{ IOException -> 0x005e }
    L_0x005e:
        r0 = move-exception;
        r2 = z;
        r4 = 24;
        r2 = r2[r4];
        r3.append(r2);
        com.whatsapp.util.Log.c(r0);
        r2 = r1;
        goto L_0x002f;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x005e }
    L_0x006f:
        r0 = move-exception;
        r1 = r2;
    L_0x0071:
        if (r1 == 0) goto L_0x0076;
    L_0x0073:
        r1.close();	 Catch:{ IOException -> 0x0085 }
    L_0x0076:
        throw r0;	 Catch:{ IOException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        r1 = z;
        r2 = 20;
        r1 = r1[r2];
        r3.append(r1);
        com.whatsapp.util.Log.c(r0);
        goto L_0x0051;
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0077 }
    L_0x0087:
        r0 = move-exception;
        goto L_0x0071;
    L_0x0089:
        r0 = move-exception;
        goto L_0x0058;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.or.b():java.lang.String");
    }

    private static String a(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(str.length() * 2);
        a(stringBuilder, str);
        return stringBuilder.toString();
    }

    public static void a(DialogToastListActivity dialogToastListActivity, String str, String str2, ArrayList arrayList, String str3) {
        a(dialogToastListActivity, dialogToastListActivity, str, str2, arrayList, str3);
    }

    private static String a(String str, String str2) {
        return str + z[0] + str2 + "\n";
    }

    private static String b(int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
                return z[52];
            case ay.f /*1*/:
                return z[53];
            case ay.n /*2*/:
                return z[55];
            case ay.p /*3*/:
                return z[56];
            default:
                return z[54];
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(android.content.Context r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
        r11 = com.whatsapp.App.az;
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        if (r20 == 0) goto L_0x000e;
    L_0x0009:
        r0 = r20;
        r12.append(r0);	 Catch:{ IOException -> 0x044e }
    L_0x000e:
        r13 = new java.text.SimpleDateFormat;	 Catch:{ Exception -> 0x0454 }
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        r3 = java.util.Locale.US;	 Catch:{ Exception -> 0x0454 }
        r13.<init>(r2, r3);	 Catch:{ Exception -> 0x0454 }
        r2 = r18.getResources();	 Catch:{ Exception -> 0x0454 }
        r2 = r2.getConfiguration();	 Catch:{ Exception -> 0x0454 }
        r14 = r2.locale;	 Catch:{ Exception -> 0x0454 }
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        r3 = 0;
        r0 = r18;
        r2 = r0.getSharedPreferences(r2, r3);	 Catch:{ Exception -> 0x0454 }
        r3 = z;	 Catch:{ Exception -> 0x0454 }
        r4 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0454 }
        r4 = "";
        r15 = r2.getString(r3, r4);	 Catch:{ Exception -> 0x0454 }
        r3 = z;	 Catch:{ Exception -> 0x0454 }
        r4 = 61;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0454 }
        r4 = "";
        r16 = r2.getString(r3, r4);	 Catch:{ Exception -> 0x0454 }
        r2 = com.whatsapp.App.an;	 Catch:{ IOException -> 0x0450 }
        if (r2 == 0) goto L_0x046b;
    L_0x004e:
        r2 = com.whatsapp.App.an;	 Catch:{ IOException -> 0x0450 }
        r2 = r2.jabber_id;	 Catch:{ IOException -> 0x0450 }
        if (r2 == 0) goto L_0x046b;
    L_0x0054:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0452 }
        r2.<init>();	 Catch:{ IOException -> 0x0452 }
        r3 = "+";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0452 }
        r3 = com.whatsapp.App.an;	 Catch:{ IOException -> 0x0452 }
        r3 = r3.jabber_id;	 Catch:{ IOException -> 0x0452 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0452 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0452 }
    L_0x006b:
        r3 = com.whatsapp.ChangeNumber.g();	 Catch:{ Exception -> 0x0454 }
        if (r3 == 0) goto L_0x04c1;
    L_0x0071:
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0454 }
        r3.<init>();	 Catch:{ Exception -> 0x0454 }
        r4 = z;	 Catch:{ Exception -> 0x0454 }
        r5 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r4 = r4[r5];	 Catch:{ Exception -> 0x0454 }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x0454 }
        r2 = r3.append(r2);	 Catch:{ Exception -> 0x0454 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0454 }
        r3 = com.whatsapp.App.aq();	 Catch:{ Exception -> 0x0454 }
        if (r3 == 0) goto L_0x04c1;
    L_0x008e:
        r4 = r3.jabber_id;	 Catch:{ IOException -> 0x0473 }
        if (r4 == 0) goto L_0x04c1;
    L_0x0092:
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0454 }
        r4.<init>();	 Catch:{ Exception -> 0x0454 }
        r2 = r4.append(r2);	 Catch:{ Exception -> 0x0454 }
        r4 = z;	 Catch:{ Exception -> 0x0454 }
        r5 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r4 = r4[r5];	 Catch:{ Exception -> 0x0454 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0454 }
        r3 = r3.jabber_id;	 Catch:{ Exception -> 0x0454 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0454 }
        r3 = ")";
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0454 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0454 }
        r10 = r2;
    L_0x00b6:
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 90;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        r4 = com.whatsapp.ac.b(r2);	 Catch:{ Exception -> 0x0454 }
        r2 = 4444444444000; // 0x40acd884560 float:-2.85780992E8 double:2.1958473146304E-311;
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x00d1;
    L_0x00c9:
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 70;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        if (r11 == 0) goto L_0x04be;
    L_0x00d1:
        r2 = 0;
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x00e2;
    L_0x00d7:
        r2 = new java.util.Date;	 Catch:{ Exception -> 0x0454 }
        r2.<init>(r4);	 Catch:{ Exception -> 0x0454 }
        r2 = r13.format(r2);	 Catch:{ Exception -> 0x0454 }
        if (r11 == 0) goto L_0x04be;
    L_0x00e2:
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 84;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        r9 = r2;
    L_0x00e9:
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 82;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 93;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 58;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        r0 = r18;
        r2 = r0.getSystemService(r2);	 Catch:{ Exception -> 0x0454 }
        r2 = (android.telephony.TelephonyManager) r2;	 Catch:{ Exception -> 0x0454 }
        if (r2 == 0) goto L_0x0137;
    L_0x0105:
        r3 = r2.getPhoneType();	 Catch:{ Exception -> 0x0454 }
        r6 = b(r3);	 Catch:{ Exception -> 0x0454 }
        r3 = r2.getNetworkType();	 Catch:{ Exception -> 0x0454 }
        r5 = a(r3);	 Catch:{ Exception -> 0x0454 }
        r3 = r2.getNetworkOperator();	 Catch:{ Exception -> 0x0454 }
        r4 = z;	 Catch:{ Exception -> 0x0454 }
        r7 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r4 = r4[r7];	 Catch:{ Exception -> 0x0454 }
        r4 = com.whatsapp.util.a0.a(r3, r4);	 Catch:{ Exception -> 0x0454 }
        r3 = r2.getSimOperator();	 Catch:{ Exception -> 0x0454 }
        r7 = z;	 Catch:{ Exception -> 0x0454 }
        r8 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r7 = r7[r8];	 Catch:{ Exception -> 0x0454 }
        r3 = com.whatsapp.util.a0.a(r3, r7);	 Catch:{ Exception -> 0x0454 }
        r2 = r2.getNetworkOperatorName();	 Catch:{ Exception -> 0x0454 }
        if (r11 == 0) goto L_0x04b7;
    L_0x0137:
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r6 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 89;
        r5 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r4 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 67;
        r3 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r7 = 75;
        r2 = r2[r7];	 Catch:{ Exception -> 0x0454 }
        r7 = r5;
        r8 = r6;
        r6 = r4;
        r5 = r3;
        r4 = r2;
    L_0x015a:
        r2 = com.whatsapp.App.a1;	 Catch:{ Exception -> 0x0454 }
        if (r2 == 0) goto L_0x0166;
    L_0x015e:
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 65;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        if (r11 == 0) goto L_0x04b4;
    L_0x0166:
        r2 = com.whatsapp.App.aG;	 Catch:{ IOException -> 0x0475 }
        if (r2 == 0) goto L_0x0172;
    L_0x016a:
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        if (r11 == 0) goto L_0x04b4;
    L_0x0172:
        r2 = com.whatsapp.App.al();	 Catch:{ IOException -> 0x0477 }
        if (r2 == 0) goto L_0x0180;
    L_0x0178:
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 96;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        if (r11 == 0) goto L_0x04b4;
    L_0x0180:
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 73;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        r3 = r2;
    L_0x0187:
        r2 = z;	 Catch:{ IOException -> 0x0479 }
        r17 = 83;
        r2 = r2[r17];	 Catch:{ IOException -> 0x0479 }
        r12.append(r2);	 Catch:{ IOException -> 0x0479 }
        r2 = z;	 Catch:{ IOException -> 0x0479 }
        r17 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r2 = r2[r17];	 Catch:{ IOException -> 0x0479 }
        r12.append(r2);	 Catch:{ IOException -> 0x0479 }
        r2 = z;	 Catch:{ IOException -> 0x0479 }
        r17 = 99;
        r2 = r2[r17];	 Catch:{ IOException -> 0x0479 }
        r2 = a(r2, r10);	 Catch:{ IOException -> 0x0479 }
        r12.append(r2);	 Catch:{ IOException -> 0x0479 }
        r2 = z;	 Catch:{ IOException -> 0x0479 }
        r10 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r2 = r2[r10];	 Catch:{ IOException -> 0x0479 }
        r10 = z;	 Catch:{ IOException -> 0x0479 }
        r17 = 59;
        r10 = r10[r17];	 Catch:{ IOException -> 0x0479 }
        r2 = a(r2, r10);	 Catch:{ IOException -> 0x0479 }
        r12.append(r2);	 Catch:{ IOException -> 0x0479 }
        r2 = z;	 Catch:{ IOException -> 0x0479 }
        r10 = 79;
        r2 = r2[r10];	 Catch:{ IOException -> 0x0479 }
        r10 = z;	 Catch:{ IOException -> 0x0479 }
        r17 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r10 = r10[r17];	 Catch:{ IOException -> 0x0479 }
        r2 = a(r2, r10);	 Catch:{ IOException -> 0x0479 }
        r12.append(r2);	 Catch:{ IOException -> 0x0479 }
        r2 = z;	 Catch:{ IOException -> 0x0479 }
        r10 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r2 = r2[r10];	 Catch:{ IOException -> 0x0479 }
        r2 = a(r2, r9);	 Catch:{ IOException -> 0x0479 }
        r12.append(r2);	 Catch:{ IOException -> 0x0479 }
        r2 = z;	 Catch:{ IOException -> 0x0479 }
        r9 = 86;
        r9 = r2[r9];	 Catch:{ IOException -> 0x0479 }
        if (r14 == 0) goto L_0x047b;
    L_0x01e1:
        r2 = r14.getCountry();	 Catch:{ IOException -> 0x0479 }
    L_0x01e5:
        r2 = a(r9, r2);	 Catch:{ IOException -> 0x0483 }
        r12.append(r2);	 Catch:{ IOException -> 0x0483 }
        r2 = z;	 Catch:{ IOException -> 0x0483 }
        r9 = 87;
        r9 = r2[r9];	 Catch:{ IOException -> 0x0483 }
        if (r14 == 0) goto L_0x0485;
    L_0x01f4:
        r2 = r14.getLanguage();	 Catch:{ IOException -> 0x0483 }
    L_0x01f8:
        r2 = a(r9, r2);	 Catch:{ IOException -> 0x048d }
        r12.append(r2);	 Catch:{ IOException -> 0x048d }
        r2 = z;	 Catch:{ IOException -> 0x048d }
        r9 = 74;
        r2 = r2[r9];	 Catch:{ IOException -> 0x048d }
        r0 = r19;
        r2 = a(r2, r0);	 Catch:{ IOException -> 0x048d }
        r12.append(r2);	 Catch:{ IOException -> 0x048d }
        r2 = z;	 Catch:{ IOException -> 0x048d }
        r9 = 60;
        r2 = r2[r9];	 Catch:{ IOException -> 0x048d }
        r2 = a(r2, r4);	 Catch:{ IOException -> 0x048d }
        r12.append(r2);	 Catch:{ IOException -> 0x048d }
        r2 = z;	 Catch:{ IOException -> 0x048d }
        r4 = 95;
        r2 = r2[r4];	 Catch:{ IOException -> 0x048d }
        r4 = android.os.Build.MANUFACTURER;	 Catch:{ IOException -> 0x048d }
        r2 = a(r2, r4);	 Catch:{ IOException -> 0x048d }
        r12.append(r2);	 Catch:{ IOException -> 0x048d }
        r2 = z;	 Catch:{ IOException -> 0x048d }
        r4 = 92;
        r2 = r2[r4];	 Catch:{ IOException -> 0x048d }
        r4 = android.os.Build.MODEL;	 Catch:{ IOException -> 0x048d }
        r2 = a(r2, r4);	 Catch:{ IOException -> 0x048d }
        r12.append(r2);	 Catch:{ IOException -> 0x048d }
        r2 = z;	 Catch:{ IOException -> 0x048d }
        r4 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r2 = r2[r4];	 Catch:{ IOException -> 0x048d }
        r4 = android.os.Build.VERSION.RELEASE;	 Catch:{ IOException -> 0x048d }
        r2 = a(r2, r4);	 Catch:{ IOException -> 0x048d }
        r12.append(r2);	 Catch:{ IOException -> 0x048d }
        r2 = z;	 Catch:{ IOException -> 0x048d }
        r4 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r2 = r2[r4];	 Catch:{ IOException -> 0x048d }
        r2 = a(r2, r3);	 Catch:{ IOException -> 0x048d }
        r12.append(r2);	 Catch:{ IOException -> 0x048d }
        r2 = z;	 Catch:{ IOException -> 0x048d }
        r3 = 94;
        r2 = r2[r3];	 Catch:{ IOException -> 0x048d }
        r2 = a(r2, r6);	 Catch:{ IOException -> 0x048d }
        r12.append(r2);	 Catch:{ IOException -> 0x048d }
        r2 = z;	 Catch:{ IOException -> 0x048d }
        r3 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r2 = r2[r3];	 Catch:{ IOException -> 0x048d }
        r2 = a(r2, r5);	 Catch:{ IOException -> 0x048d }
        r12.append(r2);	 Catch:{ IOException -> 0x048d }
        r2 = com.whatsapp.App.N();	 Catch:{ IOException -> 0x048d }
        if (r2 == 0) goto L_0x02a9;
    L_0x0275:
        r2 = com.whatsapp.a12.a();	 Catch:{ IOException -> 0x048d }
        if (r2 == 0) goto L_0x0290;
    L_0x027b:
        r2 = z;	 Catch:{ IOException -> 0x048f }
        r3 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r2 = r2[r3];	 Catch:{ IOException -> 0x048f }
        r3 = z;	 Catch:{ IOException -> 0x048f }
        r4 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r3 = r3[r4];	 Catch:{ IOException -> 0x048f }
        r2 = a(r2, r3);	 Catch:{ IOException -> 0x048f }
        r12.append(r2);	 Catch:{ IOException -> 0x048f }
        if (r11 == 0) goto L_0x02a9;
    L_0x0290:
        r2 = com.whatsapp.a12.s();	 Catch:{ IOException -> 0x0491 }
        if (r2 == 0) goto L_0x02a9;
    L_0x0296:
        r2 = z;	 Catch:{ IOException -> 0x0493 }
        r3 = 63;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0493 }
        r3 = z;	 Catch:{ IOException -> 0x0493 }
        r4 = 85;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0493 }
        r2 = a(r2, r3);	 Catch:{ IOException -> 0x0493 }
        r12.append(r2);	 Catch:{ IOException -> 0x0493 }
    L_0x02a9:
        r2 = z;	 Catch:{ IOException -> 0x0495 }
        r3 = 98;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0495 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0495 }
        r3.<init>();	 Catch:{ IOException -> 0x0495 }
        r3 = r3.append(r15);	 Catch:{ IOException -> 0x0495 }
        r4 = " ";
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0495 }
        r0 = r16;
        r3 = r3.append(r0);	 Catch:{ IOException -> 0x0495 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0495 }
        r2 = a(r2, r3);	 Catch:{ IOException -> 0x0495 }
        r12.append(r2);	 Catch:{ IOException -> 0x0495 }
        r2 = z;	 Catch:{ IOException -> 0x0495 }
        r3 = 97;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0495 }
        r3 = z;	 Catch:{ IOException -> 0x0495 }
        r4 = 71;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0495 }
        r2 = a(r2, r3);	 Catch:{ IOException -> 0x0495 }
        r12.append(r2);	 Catch:{ IOException -> 0x0495 }
        r2 = z;	 Catch:{ IOException -> 0x0495 }
        r3 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0495 }
        r3 = z;	 Catch:{ IOException -> 0x0495 }
        r4 = 81;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0495 }
        r2 = a(r2, r3);	 Catch:{ IOException -> 0x0495 }
        r12.append(r2);	 Catch:{ IOException -> 0x0495 }
        r2 = z;	 Catch:{ IOException -> 0x0495 }
        r3 = 80;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0495 }
        r3 = android.os.Build.PRODUCT;	 Catch:{ IOException -> 0x0495 }
        r2 = a(r2, r3);	 Catch:{ IOException -> 0x0495 }
        r12.append(r2);	 Catch:{ IOException -> 0x0495 }
        r2 = z;	 Catch:{ IOException -> 0x0495 }
        r3 = 88;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0495 }
        r3 = android.os.Build.DEVICE;	 Catch:{ IOException -> 0x0495 }
        r2 = a(r2, r3);	 Catch:{ IOException -> 0x0495 }
        r12.append(r2);	 Catch:{ IOException -> 0x0495 }
        r2 = z;	 Catch:{ IOException -> 0x0495 }
        r3 = 78;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0495 }
        r3 = android.os.Build.DISPLAY;	 Catch:{ IOException -> 0x0495 }
        r2 = a(r2, r3);	 Catch:{ IOException -> 0x0495 }
        r12.append(r2);	 Catch:{ IOException -> 0x0495 }
        r2 = z;	 Catch:{ IOException -> 0x0495 }
        r3 = 76;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0495 }
        r3 = b();	 Catch:{ IOException -> 0x0495 }
        r2 = a(r2, r3);	 Catch:{ IOException -> 0x0495 }
        r12.append(r2);	 Catch:{ IOException -> 0x0495 }
        r2 = z;	 Catch:{ IOException -> 0x0495 }
        r3 = 69;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0495 }
        r3 = a(r18);	 Catch:{ IOException -> 0x0495 }
        r2 = a(r2, r3);	 Catch:{ IOException -> 0x0495 }
        r12.append(r2);	 Catch:{ IOException -> 0x0495 }
        if (r21 == 0) goto L_0x0355;
    L_0x0346:
        r2 = z;	 Catch:{ IOException -> 0x0495 }
        r3 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0495 }
        r0 = r21;
        r2 = a(r2, r0);	 Catch:{ IOException -> 0x0495 }
        r12.append(r2);	 Catch:{ IOException -> 0x0495 }
    L_0x0355:
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 62;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        r3 = new java.util.Date;	 Catch:{ Exception -> 0x0454 }
        r3.<init>();	 Catch:{ Exception -> 0x0454 }
        r3 = r13.format(r3);	 Catch:{ Exception -> 0x0454 }
        r2 = a(r2, r3);	 Catch:{ Exception -> 0x0454 }
        r12.append(r2);	 Catch:{ Exception -> 0x0454 }
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 64;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        r3 = a(r8);	 Catch:{ Exception -> 0x0454 }
        r2 = a(r2, r3);	 Catch:{ Exception -> 0x0454 }
        r12.append(r2);	 Catch:{ Exception -> 0x0454 }
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 66;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        r3 = a(r7);	 Catch:{ Exception -> 0x0454 }
        r2 = a(r2, r3);	 Catch:{ Exception -> 0x0454 }
        r12.append(r2);	 Catch:{ Exception -> 0x0454 }
        r2 = a();	 Catch:{ Exception -> 0x0454 }
        r3 = android.text.TextUtils.isEmpty(r2);	 Catch:{ IOException -> 0x0497 }
        if (r3 != 0) goto L_0x03a4;
    L_0x0397:
        r3 = z;	 Catch:{ IOException -> 0x0497 }
        r4 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0497 }
        r2 = a(r3, r2);	 Catch:{ IOException -> 0x0497 }
        r12.append(r2);	 Catch:{ IOException -> 0x0497 }
    L_0x03a4:
        r2 = com.whatsapp.App.an;	 Catch:{ Exception -> 0x0454 }
        if (r2 != 0) goto L_0x0449;
    L_0x03a8:
        r2 = com.whatsapp.App.a3;	 Catch:{ Exception -> 0x0454 }
        r4 = r2.getLine1Number();	 Catch:{ Exception -> 0x0454 }
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 68;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0454 }
        r3.<init>();	 Catch:{ Exception -> 0x0454 }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x0454 }
        r5 = " ";
        r3 = r3.append(r5);	 Catch:{ Exception -> 0x0454 }
        r5 = com.whatsapp.App.a3;	 Catch:{ Exception -> 0x0454 }
        r5 = r5.getSimState();	 Catch:{ Exception -> 0x0454 }
        r3 = r3.append(r5);	 Catch:{ Exception -> 0x0454 }
        r3 = r3.toString();	 Catch:{ Exception -> 0x0454 }
        r2 = a(r2, r3);	 Catch:{ Exception -> 0x0454 }
        r12.append(r2);	 Catch:{ Exception -> 0x0454 }
        r2 = 6;
        r0 = r16;
        r3 = a(r0, r4, r2);	 Catch:{ Exception -> 0x0454 }
        r2 = 1;
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ Exception -> 0x0454 }
        if (r3 == 0) goto L_0x03e9;
    L_0x03e6:
        r5 = 1;
        if (r3 != r5) goto L_0x0449;
    L_0x03e9:
        if (r3 != 0) goto L_0x0434;
    L_0x03eb:
        r3 = 0;
        r5 = java.lang.Integer.parseInt(r15);	 Catch:{ Exception -> 0x0454 }
        r3 = com.whatsapp.ats.a(r5, r4);	 Catch:{ IOException -> 0x0499 }
    L_0x03f4:
        r0 = r16;
        r5 = r4.equals(r0);	 Catch:{ IOException -> 0x04a5 }
        if (r5 != 0) goto L_0x041d;
    L_0x03fc:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x04a5 }
        r5.<init>();	 Catch:{ IOException -> 0x04a5 }
        r5 = r5.append(r15);	 Catch:{ IOException -> 0x04a5 }
        r0 = r16;
        r5 = r5.append(r0);	 Catch:{ IOException -> 0x04a5 }
        r5 = r5.toString();	 Catch:{ IOException -> 0x04a5 }
        r4 = r4.endsWith(r5);	 Catch:{ IOException -> 0x04a5 }
        if (r4 != 0) goto L_0x041d;
    L_0x0415:
        r0 = r16;
        r4 = r0.equals(r3);	 Catch:{ IOException -> 0x04a7 }
        if (r4 == 0) goto L_0x0424;
    L_0x041d:
        r2 = 0;
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ Exception -> 0x0454 }
        if (r11 == 0) goto L_0x0434;
    L_0x0424:
        r0 = r16;
        r4 = r0.endsWith(r3);	 Catch:{ IOException -> 0x04a9 }
        if (r4 == 0) goto L_0x0434;
    L_0x042c:
        r3 = com.whatsapp.EnterPhoneNumber.a(r15, r3);	 Catch:{ IOException -> 0x04ab }
        r4 = 5;
        if (r3 != r4) goto L_0x0434;
    L_0x0433:
        r2 = 0;
    L_0x0434:
        r3 = z;	 Catch:{ IOException -> 0x04ad }
        r4 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r3 = r3[r4];	 Catch:{ IOException -> 0x04ad }
        if (r2 != 0) goto L_0x04af;
    L_0x043c:
        r2 = z;	 Catch:{ IOException -> 0x04ad }
        r4 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r2 = r2[r4];	 Catch:{ IOException -> 0x04ad }
    L_0x0442:
        r2 = a(r3, r2);	 Catch:{ Exception -> 0x0454 }
        r12.append(r2);	 Catch:{ Exception -> 0x0454 }
    L_0x0449:
        r2 = r12.toString();
        return r2;
    L_0x044e:
        r2 = move-exception;
        throw r2;
    L_0x0450:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0452 }
    L_0x0452:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0454 }
    L_0x0454:
        r2 = move-exception;
        r3 = z;
        r4 = 72;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        r3 = z;
        r4 = 91;
        r3 = r3[r4];
        r12.append(r3);
        r12.append(r2);
        goto L_0x0449;
    L_0x046b:
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r3 = 77;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0454 }
        goto L_0x006b;
    L_0x0473:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0454 }
    L_0x0475:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0454 }
    L_0x0477:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0454 }
    L_0x0479:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0454 }
    L_0x047b:
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r10 = 57;
        r2 = r2[r10];	 Catch:{ Exception -> 0x0454 }
        goto L_0x01e5;
    L_0x0483:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0454 }
    L_0x0485:
        r2 = z;	 Catch:{ Exception -> 0x0454 }
        r10 = 100;
        r2 = r2[r10];	 Catch:{ Exception -> 0x0454 }
        goto L_0x01f8;
    L_0x048d:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x048f }
    L_0x048f:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0491 }
    L_0x0491:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0493 }
    L_0x0493:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0454 }
    L_0x0495:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0454 }
    L_0x0497:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0454 }
    L_0x0499:
        r5 = move-exception;
        r6 = z;	 Catch:{ Exception -> 0x0454 }
        r7 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r6 = r6[r7];	 Catch:{ Exception -> 0x0454 }
        com.whatsapp.util.Log.b(r6, r5);	 Catch:{ Exception -> 0x0454 }
        goto L_0x03f4;
    L_0x04a5:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x04a7 }
    L_0x04a7:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0454 }
    L_0x04a9:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x04ab }
    L_0x04ab:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0454 }
    L_0x04ad:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0454 }
    L_0x04af:
        r2 = java.lang.String.valueOf(r2);	 Catch:{ Exception -> 0x0454 }
        goto L_0x0442;
    L_0x04b4:
        r3 = r2;
        goto L_0x0187;
    L_0x04b7:
        r7 = r5;
        r8 = r6;
        r6 = r4;
        r5 = r3;
        r4 = r2;
        goto L_0x015a;
    L_0x04be:
        r9 = r2;
        goto L_0x00e9;
    L_0x04c1:
        r10 = r2;
        goto L_0x00b6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.or.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.app.Activity r8, com.whatsapp.ho r9, java.lang.String r10, java.lang.String r11, java.util.ArrayList r12, java.lang.String r13) {
        /*
        r3 = com.whatsapp.App.az;
        r0 = 2131624268; // 0x7f0e014c float:1.887571E38 double:1.0531623207E-314;
        r4 = r8.getString(r0);
        r2 = a(r8, r10, r11, r13);
        r0 = 3;
        r0 = com.whatsapp.util.Log.c(r0);
        r5 = com.whatsapp.util.ad.a(r0);
        if (r12 == 0) goto L_0x00a4;
    L_0x0018:
        r0 = r12.isEmpty();
        if (r0 != 0) goto L_0x00a4;
    L_0x001e:
        r0 = 1;
    L_0x001f:
        r6 = new android.content.Intent;
        if (r0 == 0) goto L_0x00a7;
    L_0x0023:
        r1 = z;
        r7 = 8;
        r1 = r1[r7];
    L_0x0029:
        r6.<init>(r1);
        if (r5 != 0) goto L_0x00ae;
    L_0x002e:
        r1 = z;
        r7 = 9;
        r1 = r1[r7];
        r6.setType(r1);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1 = r1.append(r2);
        r2 = z;
        r7 = 3;
        r2 = r2[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        if (r3 == 0) goto L_0x006e;
    L_0x004f:
        r2 = z;
        r7 = 5;
        r2 = r2[r7];
        r6.setType(r2);
        if (r0 == 0) goto L_0x0062;
    L_0x0059:
        r2 = android.net.Uri.fromFile(r5);
        r12.add(r2);
        if (r3 == 0) goto L_0x006e;
    L_0x0062:
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r3 = android.net.Uri.fromFile(r5);
        r6.putExtra(r2, r3);
    L_0x006e:
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r3 = 1;
        r3 = new java.lang.String[r3];
        r5 = 0;
        r7 = com.whatsapp.p8.a;
        r3[r5] = r7;
        r6.putExtra(r2, r3);
        r2 = z;
        r3 = 10;
        r2 = r2[r3];
        r6.putExtra(r2, r4);
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r6.putExtra(r2, r1);
        if (r0 == 0) goto L_0x0099;
    L_0x0091:
        r0 = z;
        r1 = 7;
        r0 = r0[r1];
        r6.putParcelableArrayListExtra(r0, r12);
    L_0x0099:
        r0 = 2131624150; // 0x7f0e00d6 float:1.8875472E38 double:1.0531622624E-314;
        r0 = r8.getString(r0);
        a(r6, r8, r9, r0);
        return;
    L_0x00a4:
        r0 = 0;
        goto L_0x001f;
    L_0x00a7:
        r1 = z;
        r7 = 4;
        r1 = r1[r7];
        goto L_0x0029;
    L_0x00ae:
        r1 = r2;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.or.a(android.app.Activity, com.whatsapp.ho, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String):void");
    }
}
