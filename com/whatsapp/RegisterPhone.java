package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.widget.EditText;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class RegisterPhone extends EnterPhoneNumber {
    private static final String[] G;
    private Runnable A;
    private boolean B;
    private boolean C;
    private String D;
    private boolean E;
    private Dialog F;

    static {
        String[] strArr = new String[81];
        String str = "}\u001b";
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
                        i3 = 33;
                        break;
                    case ay.f /*1*/:
                        i3 = 95;
                        break;
                    case ay.n /*2*/:
                        i3 = 72;
                        break;
                    case ay.p /*3*/:
                        i3 = 31;
                        break;
                    default:
                        i3 = 34;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "}\u001b";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "S:/vQU::2RI0&z\u0002S<u";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "}\u001b";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq>zPH9!|CU6'q}R+)kG";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "S:/vQU::oJN1-0Q@)-lV@+-0AN2%vV\u00019)vND;";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "B<";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq!qRT+\u0017|MT1<m[~<'{G";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "B0=qVS&\u0017qCL:";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq8wMO:\u0017qWL=-m}Q0;vVH0&";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq+pWO+:f}B0,z}Q0;vVH0&";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq+pWO+:f}B0,z";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq8wMO:\u0017qWL=-m}Q0;vVH0&";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "S:/vQU::oJN1-0CB+:zQT3<0AN2%vV\u00019)vND;";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "S:/vQU::0RI0&z\rS:;zV\f,<~VD";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq+pWO+:f}B0,z";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "S:/vQU::0RI0&z\rS:;jOD\u007f";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq8wMO:\u0017qWL=-m";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq!qRT+\u0017oJN1-@LT2*zP";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq8wMO:\u0017qWL=-m}Q0;vVH0&";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq+pWO+:f}B0,z}Q0;vVH0&";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq>zPH9!|CU6'q}R+)kG";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq!qRT+\u0017|MT1<m[~<'{G";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq&p}R:$y}R:&{";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "S:/vQU::0RI0&z\rS:;zV\f,<~VD";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq!qRT+\u0017oJN1-@LT2*zP";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq8wMO:\u0017qWL=-m";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq+pWO+:f}B0,z}Q0;vVH0&";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq+pWO+:f}B0,z";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq8wMO:\u0017qWL=-m}Q0;vVH0&";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq>zPH9!|CU6'q}R+)kG";
                    obj = 30;
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    strArr2 = strArr3;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq!qRT+\u0017|MT1<m[~<'{G";
                    obj = 31;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    str = "S:/vQU::0RI0&z\rQ>=lG\u0001";
                    obj = 32;
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    str = "S:/vQU::0RI0&z\rQ>=lG\u000e<'rOH+hyCH3-{";
                    i = 34;
                    strArr2 = strArr3;
                    obj = 33;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    strArr2 = strArr3;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq&p}R:$y}R:&{";
                    obj = 34;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq<~RQ:,@QL,\u0017sKO4";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq+sG@-\u0017oJN1-@LT2*zP";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq!qRT+\u0017|MT1<m[~<'{G";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq!qRT+\u0017|MT1<m[~<'{G";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "S:/vQU::0RI0&z\rH,'%\u0002";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "S:/vQU::0RI0&z\rM6&t\rH1;kPT<<vMO,g{K@3'x";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "S:/vQU::0RI0&z\rB--~VD";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u00019)vND;hkM\u00013'pIT/\u000b~NM6&xaN;-?DS0%?aN*&kPX\u000f pLD\u0016&yM";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq:zQD+;kCU:";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "S:/vQU::0RI0&z\rB3'|I\f(:pLF";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "S:/vQU::0RI0&z\rH18jV~<+0AN2%vV\u00019)vND;";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "S:/vQU::0RI0&z\rB--~VDp?mMO8elV@+-?@N*&|G\u0001+'?O@6&";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "S:/vQU::0RI0&z\rR(ezZQ6:zF";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\t1=sN\b";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u0004ozG";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq8mGW\u0000+pWO+:f}B0,z";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "S:/vQU::oJN1-0Q@)-oPD)8wMO:&jO\u000e<'rOH+hyCH3-{";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq8mGW\u00008wMO:\u0017qWL=-m";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "S:/vQU::0RI0&z\rE:;kPN&";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "b--~VD\u007f\u001azAN)-m[";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "e:$zVD\u007f\u001azAN)-m[";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "m0/?pD<'iGS&";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "s:;zV";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq<~RQ:,@QL,\u0017sKO4";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "S:/vQU::0RI0&z\rO:?vLU:&k\rM6&t\rH1;kPT<<vMO,g{K@3'x";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "S:/vQU::0RI0&z\rE6)sMFp*~L";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "S:/vQU::2RI0&z\u0010";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "S:/vQU::0RI0&z\rE6)sMFp&jO~<'qDH-%";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "\u0010j}*\u0017\u0013np.\u0011\u0014";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "\u0012nx&\u001b\u0014ox/\u0012\u0011ox/\u0012";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "+U";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "S:/vQU::2RI0&z\u0011";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "S:/vQU::0RI0&z\rT1:zAN)-mCC3-0RN,;v@M:ekCC3-k";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i] = str;
                    i = 69;
                    str = "S:/vQU::0RI0&z\rE6)sMFp=qPD<'iGS>*sG\f::mMS";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i] = str;
                    i = 70;
                    str = "S:/vQU::0RI0&z\rB0=qVS&r";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i] = str;
                    i = 71;
                    str = "S:/vQU::0RI0&z\rG0:rCU+-m\u000fD'+zRU6'q";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i] = str;
                    str = "S:/vQU::0RI0&z\rG0:rCU+-m\u000fD'+zRU6'q";
                    obj = 71;
                    i = 72;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i] = str;
                    i = 73;
                    strArr2 = strArr3;
                    str = "\u00019)vND;hkM\u00013'pIT/\u000bpWO+:fcC=:][o>%z\u0002G-'r\u0002b0=qVS&\u0018wMO:\u0001qDN";
                    obj = 72;
                    break;
                case 72:
                    strArr2[i] = str;
                    i = 74;
                    str = "S:/vQU::0RI0&z\rB0=qVS&r";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i] = str;
                    i = 75;
                    str = "\u0001#h";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case 74:
                    strArr2[i] = str;
                    i = 76;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq8mGW\u00008wMO:\u0017qWL=-m";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case 75:
                    strArr2[i] = str;
                    i = 77;
                    str = "S:/vQU::2RI0&z";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case 76:
                    strArr2[i] = str;
                    i = 78;
                    str = "S:/vQU::2RI0&z\u0016";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case 77:
                    strArr2[i] = str;
                    i = 79;
                    str = "S:/vQU::oJN1-0Q@)-oPD)+|\rB0%rKU\u007f.~KM:,";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case 78:
                    strArr2[i] = str;
                    i = 80;
                    str = "B0%1UI><lCQ/fMGF6;kGS\u000f pLDq8mGW\u0000+pWO+:f}B0,z";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case 79:
                    strArr2[i] = str;
                    G = strArr3;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "}\u001b";
                    obj = null;
                    break;
            }
        }
    }

    private void e() {
        Editor edit = getPreferences(0).edit();
        try {
            edit.putString(G[80], u);
            if (!edit.commit()) {
                Log.w(G[79]);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static boolean i(RegisterPhone registerPhone) {
        return registerPhone.B;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r10) {
        /*
        r9_this = this;
        r8 = 3;
        r1 = 0;
        r7 = 1;
        r6 = 0;
        r2 = com.whatsapp.App.az;
        r0 = G;
        r3 = 42;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r10);
        r0 = r9.getLayoutInflater();
        r3 = 2130903196; // 0x7f03009c float:1.7413203E38 double:1.052806064E-314;
        r4 = new int[r7];
        r5 = 2131427580; // 0x7f0b00fc float:1.847678E38 double:1.053065144E-314;
        r4[r6] = r5;
        r0 = com.whatsapp.b7.a(r0, r3, r1, r6, r4);
        r9.setContentView(r0);
        r0 = com.whatsapp.App.e(r9);
        if (r0 == r7) goto L_0x0044;
    L_0x002d:
        r0 = G;
        r1 = 47;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r9, r1);
        r9.startActivity(r0);
        r9.finish();
    L_0x0043:
        return;
    L_0x0044:
        r0 = r9.getIntent();	 Catch:{ IOException -> 0x022e }
        r0 = r0.getExtras();	 Catch:{ IOException -> 0x022e }
        if (r0 == 0) goto L_0x00ae;
    L_0x004e:
        r0 = r9.getIntent();	 Catch:{ IOException -> 0x022e }
        r3 = G;	 Catch:{ IOException -> 0x022e }
        r4 = 44;
        r3 = r3[r4];	 Catch:{ IOException -> 0x022e }
        r4 = 0;
        r0 = r0.getBooleanExtra(r3, r4);	 Catch:{ IOException -> 0x022e }
        if (r0 == 0) goto L_0x0062;
    L_0x005f:
        r9.h();	 Catch:{ IOException -> 0x0230 }
    L_0x0062:
        r0 = r9.getIntent();	 Catch:{ IOException -> 0x0232 }
        r3 = G;	 Catch:{ IOException -> 0x0232 }
        r4 = 37;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0232 }
        r4 = 0;
        r0 = r0.getBooleanExtra(r3, r4);	 Catch:{ IOException -> 0x0232 }
        if (r0 == 0) goto L_0x0078;
    L_0x0073:
        r0 = 1;
        r9.C = r0;	 Catch:{ IOException -> 0x0232 }
        if (r2 == 0) goto L_0x007b;
    L_0x0078:
        r0 = 0;
        r9.C = r0;	 Catch:{ IOException -> 0x0234 }
    L_0x007b:
        r0 = r9.getIntent();	 Catch:{ IOException -> 0x0236 }
        r3 = G;	 Catch:{ IOException -> 0x0236 }
        r4 = 36;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0236 }
        r4 = 0;
        r0 = r0.getBooleanExtra(r3, r4);	 Catch:{ IOException -> 0x0236 }
        if (r0 == 0) goto L_0x00b1;
    L_0x008c:
        r0 = G;	 Catch:{ IOException -> 0x0236 }
        r3 = 41;
        r0 = r0[r3];	 Catch:{ IOException -> 0x0236 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0236 }
        r0 = 2131624759; // 0x7f0e0337 float:1.8876707E38 double:1.053162563E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IOException -> 0x0236 }
        r4 = 0;
        r5 = 2131624632; // 0x7f0e02b8 float:1.887645E38 double:1.0531625005E-314;
        r5 = r9.getString(r5);	 Catch:{ IOException -> 0x0236 }
        r3[r4] = r5;	 Catch:{ IOException -> 0x0236 }
        r0 = r9.getString(r0, r3);	 Catch:{ IOException -> 0x0236 }
        r9.f(r0);	 Catch:{ IOException -> 0x0236 }
        if (r2 == 0) goto L_0x00b1;
    L_0x00ae:
        r0 = 0;
        r9.C = r0;	 Catch:{ IOException -> 0x0238 }
    L_0x00b1:
        r0 = com.whatsapp.App.a3;
        r3 = r9.o;
        r4 = 1535; // 0x5ff float:2.151E-42 double:7.584E-321;
        r0.listen(r3, r4);
        r0 = new com.whatsapp.afi;
        r0.<init>();
        r9.r = r0;
        r3 = r9.r;
        r0 = 2131427581; // 0x7f0b00fd float:1.8476782E38 double:1.0530651444E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.EditText) r0;
        r3.e = r0;
        r3 = r9.r;
        r0 = 2131427762; // 0x7f0b01b2 float:1.847715E38 double:1.053065234E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r3.f = r0;
        r3 = r9.r;
        r0 = 2131427582; // 0x7f0b00fe float:1.8476784E38 double:1.053065145E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.EditText) r0;
        r3.c = r0;
        r0 = 2131427761; // 0x7f0b01b1 float:1.8477147E38 double:1.0530652333E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r3 = 2131624740; // 0x7f0e0324 float:1.8876668E38 double:1.053162554E-314;
        r3 = r9.getString(r3);
        r3 = r3.toUpperCase();
        r0.setText(r3);
        r0 = 2131427763; // 0x7f0b01b3 float:1.8477151E38 double:1.0530652343E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r3 = 2131624741; // 0x7f0e0325 float:1.887667E38 double:1.0531625544E-314;
        r3 = r9.getString(r3);
        r3 = r3.toUpperCase();
        r0.setText(r3);
        r0 = new android.text.InputFilter[r7];
        r3 = new android.text.InputFilter$LengthFilter;
        r3.<init>(r8);
        r0[r6] = r3;
        r3 = r9.r;
        r3 = r3.e;
        r3.setFilters(r0);
        r0 = 17;
        r3 = new android.text.InputFilter[r7];
        r4 = new android.text.InputFilter$LengthFilter;
        r4.<init>(r0);
        r3[r6] = r4;
        r0 = r9.r;
        r0 = r0.c;
        r0.setFilters(r3);
        r0 = r9.getPreferences(r6);
        r3 = G;
        r4 = 38;
        r3 = r3[r4];
        r0 = r0.getString(r3, r1);
        if (r0 != 0) goto L_0x0176;
    L_0x0148:
        r0 = com.whatsapp.App.a3;
        r0 = r0.getNetworkCountryIso();
        if (r0 == 0) goto L_0x0176;
    L_0x0150:
        r0 = com.whatsapp.ats.e(r0);	 Catch:{ IOException -> 0x023a }
    L_0x0154:
        if (r0 == 0) goto L_0x0176;
    L_0x0156:
        r1 = r9.getPreferences(r6);
        r1 = r1.edit();
        r3 = G;	 Catch:{ IOException -> 0x0262 }
        r4 = 39;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0262 }
        r1.putString(r3, r0);	 Catch:{ IOException -> 0x0262 }
        r0 = r1.commit();	 Catch:{ IOException -> 0x0262 }
        if (r0 != 0) goto L_0x0176;
    L_0x016d:
        r0 = G;	 Catch:{ IOException -> 0x0262 }
        r1 = 46;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0262 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x0262 }
    L_0x0176:
        r0 = r9.r;
        r1 = new com.whatsapp.a5k;
        r1.<init>(r9);
        r0.g = r1;
        r0 = r9.r;
        r0 = r0.e;
        r1 = r9.r;
        r1 = r1.g;
        r0.addTextChangedListener(r1);
        r0 = new com.whatsapp.qb;
        r0.<init>(r9);
        r1 = r9.r;
        r1 = r1.f;
        r1.setOnClickListener(r0);
        r0 = r9.r;
        r0 = r0.c;
        r0.requestFocus();
        r0 = r9.r;
        r0 = r0.c;
        r0.setCursorVisible(r7);
        r0 = new com.whatsapp.w;
        r0.<init>(r9);
        r9.A = r0;
        r0 = 2131427764; // 0x7f0b01b4 float:1.8477153E38 double:1.053065235E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = new com.whatsapp.q9;	 Catch:{ IOException -> 0x0264 }
        r1.<init>(r9);	 Catch:{ IOException -> 0x0264 }
        r0.setOnClickListener(r1);	 Catch:{ IOException -> 0x0264 }
        r0 = u;	 Catch:{ IOException -> 0x0264 }
        if (r0 == 0) goto L_0x01c9;
    L_0x01c0:
        r0 = r9.r;	 Catch:{ IOException -> 0x0264 }
        r0 = r0.e;	 Catch:{ IOException -> 0x0264 }
        r1 = u;	 Catch:{ IOException -> 0x0264 }
        r0.setText(r1);	 Catch:{ IOException -> 0x0264 }
    L_0x01c9:
        r0 = r9.r;
        r0 = r0.f;
        r0 = r0.getText();
        r0 = r0.toString();
        if (r0 == 0) goto L_0x01e0;
    L_0x01d7:
        r1 = r0.length();	 Catch:{ IOException -> 0x0266 }
        if (r1 <= 0) goto L_0x01e0;
    L_0x01dd:
        r9.a(r0);	 Catch:{ IOException -> 0x0266 }
    L_0x01e0:
        r0 = r9.c();	 Catch:{ IOException -> 0x0268 }
        r9.v = r0;	 Catch:{ IOException -> 0x0268 }
        r0 = r9.getWindowManager();	 Catch:{ IOException -> 0x0268 }
        r0 = r0.getDefaultDisplay();	 Catch:{ IOException -> 0x0268 }
        r0 = r0.getHeight();	 Catch:{ IOException -> 0x0268 }
        r1 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        if (r0 > r1) goto L_0x01fe;
    L_0x01f6:
        r0 = r9.getWindow();	 Catch:{ IOException -> 0x0268 }
        r1 = 3;
        r0.setSoftInputMode(r1);	 Catch:{ IOException -> 0x0268 }
    L_0x01fe:
        r0 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x026a }
        r0 = r0.x();	 Catch:{ IOException -> 0x026a }
        if (r0 == 0) goto L_0x0216;
    L_0x0206:
        r0 = G;	 Catch:{ IOException -> 0x026c }
        r1 = 45;
        r0 = r0[r1];	 Catch:{ IOException -> 0x026c }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x026c }
        r0 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        com.whatsapp.Conversations.a(r9, r0);	 Catch:{ IOException -> 0x026c }
        if (r2 == 0) goto L_0x0043;
    L_0x0216:
        r0 = com.whatsapp.App.ax();	 Catch:{ IOException -> 0x022c }
        if (r0 == 0) goto L_0x0043;
    L_0x021c:
        r0 = G;	 Catch:{ IOException -> 0x022c }
        r1 = 48;
        r0 = r0[r1];	 Catch:{ IOException -> 0x022c }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x022c }
        r0 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        com.whatsapp.Conversations.a(r9, r0);	 Catch:{ IOException -> 0x022c }
        goto L_0x0043;
    L_0x022c:
        r0 = move-exception;
        throw r0;
    L_0x022e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0230 }
    L_0x0230:
        r0 = move-exception;
        throw r0;
    L_0x0232:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0234 }
    L_0x0234:
        r0 = move-exception;
        throw r0;
    L_0x0236:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0238 }
    L_0x0238:
        r0 = move-exception;
        throw r0;
    L_0x023a:
        r3 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = G;
        r5 = 40;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r0 = r3.append(r0);
        r3 = G;
        r4 = 43;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r1;
        goto L_0x0154;
    L_0x0262:
        r0 = move-exception;
        throw r0;
    L_0x0264:
        r0 = move-exception;
        throw r0;
    L_0x0266:
        r0 = move-exception;
        throw r0;
    L_0x0268:
        r0 = move-exception;
        throw r0;
    L_0x026a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x026c }
    L_0x026c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x022c }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterPhone.onCreate(android.os.Bundle):void");
    }

    private static String a(byte[] bArr) {
        int i = App.az;
        if (bArr == null) {
            try {
                return G[49];
            } catch (NullPointerException e) {
                throw e;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b = bArr[i2];
            stringBuilder.append(String.format(G[50], new Object[]{Byte.valueOf(b)}));
            i2++;
            if (i != 0) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    private String a() {
        return getPreferences(0).getString(G[51], "");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
        r6_this = this;
        r5 = 1;
        r1 = 0;
        r0 = com.whatsapp.App.az;
        super.onResume();
        r1 = r6.getPreferences(r1);
        r2 = G;	 Catch:{ NullPointerException -> 0x00d4 }
        r3 = 16;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00d4 }
        r3 = 0;
        r2 = r1.getString(r2, r3);	 Catch:{ NullPointerException -> 0x00d4 }
        u = r2;	 Catch:{ NullPointerException -> 0x00d4 }
        r2 = G;	 Catch:{ NullPointerException -> 0x00d4 }
        r3 = 18;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00d4 }
        r3 = 0;
        r2 = r1.getString(r2, r3);	 Catch:{ NullPointerException -> 0x00d4 }
        x = r2;	 Catch:{ NullPointerException -> 0x00d4 }
        r2 = G;	 Catch:{ NullPointerException -> 0x00d4 }
        r3 = 22;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00d4 }
        r3 = 7;
        r2 = r1.getInt(r2, r3);	 Catch:{ NullPointerException -> 0x00d4 }
        w = r2;	 Catch:{ NullPointerException -> 0x00d4 }
        r2 = com.whatsapp.App.p;	 Catch:{ NullPointerException -> 0x00d4 }
        r2 = com.whatsapp.App.b(r2);	 Catch:{ NullPointerException -> 0x00d4 }
        r2 = a(r2);	 Catch:{ NullPointerException -> 0x00d4 }
        t = r2;	 Catch:{ NullPointerException -> 0x00d4 }
        r2 = G;	 Catch:{ NullPointerException -> 0x00d4 }
        r3 = 24;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00d4 }
        r3 = 0;
        r2 = r1.getBoolean(r2, r3);	 Catch:{ NullPointerException -> 0x00d4 }
        r6.v = r2;	 Catch:{ NullPointerException -> 0x00d4 }
        r2 = r6.C;	 Catch:{ NullPointerException -> 0x00d4 }
        if (r2 == 0) goto L_0x005d;
    L_0x004f:
        r2 = 0;
        r6.C = r2;	 Catch:{ NullPointerException -> 0x00d6 }
        r2 = r6.r;	 Catch:{ NullPointerException -> 0x00d6 }
        r2 = r2.c;	 Catch:{ NullPointerException -> 0x00d6 }
        r3 = "";
        r2.setText(r3);	 Catch:{ NullPointerException -> 0x00d6 }
        if (r0 == 0) goto L_0x006f;
    L_0x005d:
        r2 = r6.r;	 Catch:{ NullPointerException -> 0x00d6 }
        r2 = r2.c;	 Catch:{ NullPointerException -> 0x00d6 }
        r3 = G;	 Catch:{ NullPointerException -> 0x00d6 }
        r4 = 19;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x00d6 }
        r4 = 0;
        r3 = r1.getString(r3, r4);	 Catch:{ NullPointerException -> 0x00d6 }
        r2.setText(r3);	 Catch:{ NullPointerException -> 0x00d6 }
    L_0x006f:
        r2 = r6.r;	 Catch:{ NullPointerException -> 0x00f9 }
        r2 = r2.e;	 Catch:{ NullPointerException -> 0x00f9 }
        r3 = G;	 Catch:{ NullPointerException -> 0x00f9 }
        r4 = 23;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x00f9 }
        r4 = 0;
        r3 = r1.getString(r3, r4);	 Catch:{ NullPointerException -> 0x00f9 }
        r2.setText(r3);	 Catch:{ NullPointerException -> 0x00f9 }
        r2 = r6.r;	 Catch:{ NullPointerException -> 0x00f9 }
        r2 = r2.c;	 Catch:{ NullPointerException -> 0x00f9 }
        r3 = G;	 Catch:{ NullPointerException -> 0x00f9 }
        r4 = 20;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x00f9 }
        r4 = -1;
        r3 = r1.getInt(r3, r4);	 Catch:{ NullPointerException -> 0x00f9 }
        b(r2, r3);	 Catch:{ NullPointerException -> 0x00f9 }
        r2 = r6.r;	 Catch:{ NullPointerException -> 0x00f9 }
        r2 = r2.e;	 Catch:{ NullPointerException -> 0x00f9 }
        r3 = G;	 Catch:{ NullPointerException -> 0x00f9 }
        r4 = 21;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x00f9 }
        r4 = -1;
        r1 = r1.getInt(r3, r4);	 Catch:{ NullPointerException -> 0x00f9 }
        b(r2, r1);	 Catch:{ NullPointerException -> 0x00f9 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00f9 }
        r1.<init>();	 Catch:{ NullPointerException -> 0x00f9 }
        r2 = G;	 Catch:{ NullPointerException -> 0x00f9 }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00f9 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00f9 }
        r2 = w;	 Catch:{ NullPointerException -> 0x00f9 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00f9 }
        r1 = r1.toString();	 Catch:{ NullPointerException -> 0x00f9 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x00f9 }
        r1 = w;	 Catch:{ NullPointerException -> 0x00f9 }
        switch(r1) {
            case 15: goto L_0x00d8;
            default: goto L_0x00c6;
        };
    L_0x00c6:
        r0 = android.support.v4.app.NotificationManagerCompat.from(r6);
        r0.cancel(r5);
        com.whatsapp.App.d(r6, r5);
        com.whatsapp.v.h();
        return;
    L_0x00d4:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00d6 }
    L_0x00d6:
        r0 = move-exception;
        throw r0;
    L_0x00d8:
        r1 = u;	 Catch:{ NullPointerException -> 0x00fb }
        if (r1 == 0) goto L_0x00e0;
    L_0x00dc:
        r1 = x;	 Catch:{ NullPointerException -> 0x00fd }
        if (r1 != 0) goto L_0x00f1;
    L_0x00e0:
        r1 = G;	 Catch:{ NullPointerException -> 0x00f7 }
        r2 = 25;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x00f7 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x00f7 }
        r1 = 7;
        w = r1;	 Catch:{ NullPointerException -> 0x00f7 }
        r6.b();	 Catch:{ NullPointerException -> 0x00f7 }
        if (r0 == 0) goto L_0x00c6;
    L_0x00f1:
        r0 = 21;
        r6.showDialog(r0);	 Catch:{ NullPointerException -> 0x00f7 }
        goto L_0x00c6;
    L_0x00f7:
        r0 = move-exception;
        throw r0;
    L_0x00f9:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00fb }
    L_0x00fb:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00fd }
    L_0x00fd:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00f7 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterPhone.onResume():void");
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            if (i2 == -1) {
                u = intent.getStringExtra(G[7]);
                this.D = intent.getStringExtra(G[9]);
                this.r.e.setText(u);
                this.r.f.setText(this.D);
                a(this.D);
                SharedPreferences preferences = getPreferences(0);
                Editor edit = preferences.edit();
                try {
                    edit.putString(G[8], u);
                    edit.putString(G[12], u);
                    if (preferences.getInt(G[10], -1) == -1) {
                        edit.putInt(G[13], Integer.MAX_VALUE);
                    }
                    try {
                        edit.putInt(G[11], -1);
                        if (!edit.commit()) {
                            Log.w(G[14]);
                        }
                    } catch (NullPointerException e) {
                        throw e;
                    }
                } catch (NullPointerException e2) {
                    throw e2;
                }
            }
            this.B = false;
        }
        this.r.e.addTextChangedListener(this.r.g);
    }

    static String d(RegisterPhone registerPhone) {
        return registerPhone.a();
    }

    static String c(RegisterPhone registerPhone) {
        return registerPhone.D;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void b(boolean r3) {
        /*
        r2_this = this;
        r0 = u;	 Catch:{ NullPointerException -> 0x002c }
        r1 = x;	 Catch:{ NullPointerException -> 0x002c }
        com.whatsapp.App.a(r2, r0, r1);	 Catch:{ NullPointerException -> 0x002c }
        r0 = 7;
        w = r0;	 Catch:{ NullPointerException -> 0x002c }
        r2.b();	 Catch:{ NullPointerException -> 0x002c }
        if (r3 == 0) goto L_0x001a;
    L_0x000f:
        r0 = r2.m;	 Catch:{ NullPointerException -> 0x002e }
        if (r0 == 0) goto L_0x001a;
    L_0x0013:
        r2.g();	 Catch:{ NullPointerException -> 0x0030 }
        r0 = com.whatsapp.App.az;	 Catch:{ NullPointerException -> 0x0030 }
        if (r0 == 0) goto L_0x0028;
    L_0x001a:
        r0 = 2;
        com.whatsapp.App.d(r2, r0);	 Catch:{ NullPointerException -> 0x0030 }
        r0 = new android.content.Intent;	 Catch:{ NullPointerException -> 0x0030 }
        r1 = com.whatsapp.RegisterName.class;
        r0.<init>(r2, r1);	 Catch:{ NullPointerException -> 0x0030 }
        r2.startActivity(r0);	 Catch:{ NullPointerException -> 0x0030 }
    L_0x0028:
        r2.finish();
        return;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterPhone.b(boolean):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, (int) R.string.register_contact_support).setIcon((int) R.drawable.ic_menu_help);
        if (App.aa == 3) {
            menu.add(0, 1, 0, G[58]);
            menu.add(0, 2, 0, G[55]);
            menu.add(0, 3, 0, G[56]);
            menu.add(0, 4, 0, G[57]);
        }
        return super.onCreateOptionsMenu(menu);
    }

    private void i() {
        Editor edit = getPreferences(0).edit();
        try {
            edit.putString(G[53], x);
            if (!edit.commit()) {
                Log.w(G[52]);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static void b(EditText editText, int i) {
        int i2 = App.az;
        int length = editText.getText().length();
        try {
            if (i > -1 && i <= length) {
                try {
                    editText.requestFocus();
                    a(editText, i);
                    if (i2 == 0) {
                        return;
                    }
                } catch (NullPointerException e) {
                    throw e;
                } catch (NullPointerException e2) {
                    throw e2;
                }
            }
            if (i > length) {
                editText.requestFocus();
                editText.setSelection(length);
                if (i2 == 0) {
                    return;
                }
            }
            editText.setSelection(length);
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    private static void a(EditText editText, int i) {
        int i2 = 0;
        int i3 = App.az;
        String toString = editText.getText().toString();
        int i4 = 0;
        while (i2 < toString.length() && i > 0) {
            try {
                if (toString.charAt(i2) <= '9') {
                    if (toString.charAt(i2) >= '0') {
                        i--;
                    }
                }
                i4++;
                i2++;
                if (i3 != 0) {
                    break;
                }
            } catch (NullPointerException e) {
                throw e;
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        editText.setSelection(i4);
    }

    static String e(RegisterPhone registerPhone) {
        return registerPhone.j();
    }

    private String j() {
        return getPreferences(0).getString(G[76], "");
    }

    private void h() {
        Log.i(G[15]);
        w = 7;
        b();
        b("");
        t = null;
        s = 0;
        a(false);
        App.a(App.p, d(t));
        App.f(App.p, null);
    }

    public RegisterPhone() {
        this.E = false;
        this.C = false;
    }

    static Dialog h(RegisterPhone registerPhone) {
        return registerPhone.F;
    }

    protected Dialog onCreateDialog(int i) {
        CharSequence spannableStringBuilder;
        switch (i) {
            case vk.SherlockTheme_selectableItemBackground /*21*/:
                Log.i(G[63]);
                Object string = getString(R.string.register_phone_phone_number_confirmation_message, new Object[]{b7.a(a(u, x))});
                spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, string.length(), 33);
                CharSequence spannableStringBuilder2 = new SpannableStringBuilder(getString(R.string.ok));
                spannableStringBuilder2.setSpan(new StyleSpan(1), 0, spannableStringBuilder2.length(), 33);
                this.F = new Builder(this).setMessage(spannableStringBuilder).setCancelable(false).setPositiveButton(spannableStringBuilder2, new kw(this)).setNeutralButton(R.string.register_edit_button, new x4(this)).create();
                this.F.setOnDismissListener(new ake(this));
                return this.F;
            case vk.SherlockTheme_windowContentOverlay /*22*/:
                Log.w(G[69]);
                spannableStringBuilder = getString(R.string.register_unrecoverable_error);
                String str = G[62];
                try {
                    if (G[64].equals(VerifyNumber.c()) && G[65].equals(App.a3.getSubscriberId())) {
                        spannableStringBuilder = spannableStringBuilder + G[66] + getString(R.string.eula_tablets_not_supported);
                        Log.i(G[68]);
                        str = G[67];
                    }
                    return new Builder(this).setMessage(spannableStringBuilder).setPositiveButton(R.string.register_contact_support, new ur(this, str)).setNeutralButton(R.string.cancel, new ch(this)).create();
                } catch (NullPointerException e) {
                    throw e;
                }
            case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                Log.w(G[61]);
                return new Builder(this).setMessage(getString(R.string.register_user_is_banned_top) + "\n" + b7.a(VerifyNumber.a(u, x)) + "\n" + getString(R.string.register_user_is_banned_bottom)).setNeutralButton(R.string.ok, new db(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    static void g(RegisterPhone registerPhone) {
        registerPhone.e();
    }

    static void a(RegisterPhone registerPhone, String str) {
        registerPhone.a(str);
    }

    public void onPause() {
        super.onPause();
        Log.i(G[33] + w);
        Editor edit = getPreferences(0).edit();
        try {
            edit.putString(G[29], u);
            edit.putString(G[27], x);
            edit.putInt(G[31], w);
            edit.putString(G[26], this.r.c.getText().toString());
            edit.putString(G[32], this.r.e.getText().toString());
            edit.putBoolean(G[35], this.v);
            edit.putInt(G[28], a(this.r.e));
            edit.putInt(G[30], a(this.r.c));
            if (!edit.commit()) {
                Log.w(G[34]);
            }
            App.a(App.p, d(t));
        } catch (NullPointerException e) {
            throw e;
        }
    }

    protected void onNewIntent(Intent intent) {
        try {
            super.onNewIntent(intent);
            if (intent.getBooleanExtra(G[59], false)) {
                Log.i(G[60]);
                f(getString(R.string.register_tapped_link_no_phone_number, new Object[]{getString(R.string.ok)}));
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static Runnable a(RegisterPhone registerPhone) {
        return registerPhone.A;
    }

    protected void onDestroy() {
        Log.i(G[54]);
        App.a3.listen(this.o, 0);
        this.E = true;
        super.onDestroy();
    }

    private void f() {
        try {
            if (this.z) {
                super.c(G[78]);
                try {
                    if (App.az == 0) {
                        return;
                    }
                }
            }
            super.c(G[77]);
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.widget.EditText r6) {
        /*
        r0 = 0;
        r2 = com.whatsapp.App.az;
        r1 = r6.isFocused();	 Catch:{ NullPointerException -> 0x000b }
        if (r1 != 0) goto L_0x000d;
    L_0x0009:
        r1 = -1;
    L_0x000a:
        return r1;
    L_0x000b:
        r0 = move-exception;
        throw r0;
    L_0x000d:
        r1 = r6.getText();
        r3 = r1.toString();
        r1 = r0;
    L_0x0016:
        r4 = r6.getSelectionEnd();
        if (r0 >= r4) goto L_0x000a;
    L_0x001c:
        r4 = r3.length();	 Catch:{ NullPointerException -> 0x003b }
        if (r0 <= r4) goto L_0x0024;
    L_0x0022:
        if (r2 == 0) goto L_0x000a;
    L_0x0024:
        r4 = r3.charAt(r0);	 Catch:{ NullPointerException -> 0x003f }
        r5 = 57;
        if (r4 > r5) goto L_0x0036;
    L_0x002c:
        r4 = r3.charAt(r0);	 Catch:{ NullPointerException -> 0x0041 }
        r5 = 48;
        if (r4 < r5) goto L_0x0036;
    L_0x0034:
        r1 = r1 + 1;
    L_0x0036:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0016;
    L_0x003a:
        goto L_0x000a;
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterPhone.a(android.widget.EditText):int");
    }

    protected void b() {
        Editor edit = getPreferences(0).edit();
        try {
            edit.putInt(G[5], w);
            if (!edit.commit()) {
                Log.w(G[6]);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void a(String str) {
        try {
            Log.i(G[74] + str + G[75] + ats.b(str));
        } catch (Throwable e) {
            Log.b(G[70] + str + G[73], e);
        }
        try {
            if (this.r.b != null) {
                this.r.c.removeTextChangedListener(this.r.b);
            }
            this.r.b = new a5_(ats.b(str));
            this.r.c.addTextChangedListener(this.r.b);
        } catch (IOException e2) {
            throw e2;
        } catch (Throwable e3) {
            Log.b(G[71], e3);
        } catch (Throwable e32) {
            Log.b(G[72], e32);
        }
    }

    static void f(RegisterPhone registerPhone) {
        registerPhone.h();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            String replaceAll;
            switch (menuItem.getItemId()) {
                case PBE.MD5 /*0*/:
                    f();
                    return true;
                case ay.f /*1*/:
                    App.i((Context) this);
                    finish();
                    return true;
                case ay.n /*2*/:
                    replaceAll = this.r.e.getText().toString().replaceAll(G[0], "");
                    a54.c(a54.e(), App.k(replaceAll + this.r.c.getText().toString().replaceAll(G[1], "")));
                    return true;
                case ay.p /*3*/:
                    a54.C();
                    return true;
                case aj.i /*4*/:
                    replaceAll = this.r.e.getText().toString().replaceAll(G[4], "");
                    Log.i(G[3] + a(a54.g(App.k(replaceAll + this.r.c.getText().toString().replaceAll(G[2], "")))));
                    return true;
                default:
                    return false;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static boolean a(RegisterPhone registerPhone, boolean z) {
        registerPhone.B = z;
        return z;
    }

    static Dialog a(RegisterPhone registerPhone, Dialog dialog) {
        registerPhone.F = dialog;
        return dialog;
    }

    static void b(RegisterPhone registerPhone) {
        registerPhone.i();
    }
}
