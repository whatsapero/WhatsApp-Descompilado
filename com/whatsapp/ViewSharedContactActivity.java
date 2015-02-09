package com.whatsapp;

import android.graphics.Bitmap;
import android.provider.ContactsContract.CommonDataKinds.StructuredPostal;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import defpackage.m;
import defpackage.o;
import java.lang.reflect.Method;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ViewSharedContactActivity extends DialogToastActivity {
    private static final String[] z;
    private String j;
    private o k;
    private String l;
    private Bitmap m;
    private String n;
    private LinearLayout o;
    private boolean p;
    private boolean q;

    static {
        String[] strArr = new String[91];
        String str = "JX\u001c\u000f0Rf\f\u000e#JX\u0011\u00057";
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
                        i3 = 38;
                        break;
                    case ay.f /*1*/:
                        i3 = 57;
                        break;
                    case ay.n /*2*/:
                        i3 = 101;
                        break;
                    case ay.p /*3*/:
                        i3 = 96;
                        break;
                    default:
                        i3 = 69;
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
                    str = "JX\u001c\u000f0Rf\f\u000e#JX\u0011\u00057";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "HL\t\f";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "VQ\n\u000e \u001c";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "PP\u0000\u00176NX\u0017\u0005!EV\u000b\u0014$EM\u0004\u00031OO\f\u0014<\t\\\u001d\u0014 HJ\f\u000f+\u0006";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "SW\u0006\b ER\u0000\u0004\u007f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "CT\u0004\t)";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "VV\u0016\u0014$J";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "JX\u001c\u000f0Rf\f\u000e#JX\u0011\u00057";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "PZ\u0004\u0012!";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u000eQ\u0011\u00145ZQ\u0011\u00145U\u0010_Oj\u000eb9\u0017h{\u00129Nl\rb9\u0017h{\u0012MO\u001ezNH@k\t\u0006@F$KI^]\u0018\f\u0010Z";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "PP\u0000\u00176NX\u0017\u0005!EV\u000b\u0014$EMJ\u00037CX\u0011\u0005jPZ\u0004\u0012!\u0006P\u0016@+SU\tA";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "EV\u000b\u0014$EM:\t!";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "C]\f\u0014\u001aEV\u000b\u0014$EM:\t+@V";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "sk)";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "PP\u0000\u0017-GK\u0000\u0004&IW\u0011\u0001&R\u0016\t\u000f$Bf\u0006\u000f+RX\u0006\u0014\u001aVQ\n\u0014*y_\u0004\t)C]E";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "LP\u0001";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "A\\\u00114<V\\)\u0001'CU7\u00056IL\u0017\u0003 ";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "PW\u0001N$H]\u0017\u000f,B\u0017\u0006\u00157UV\u0017N,R\\\bO,K";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "GZ\u0006\u000f0HM:\u0014<V\\";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "PW\u0001N$H]\u0017\u000f,B\u0017\u0006\u00157UV\u0017N,R\\\bO+OZ\u000e\u000e$K\\";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "PP\u0000\u0017\u001aUQ\u0004\u0012 Bf\u0006\u000f+RX\u0006\u0014jH\\\u0012?+ST\u0007\u00057\tW\u0000\u0005!y]\u0000\f1Gf\u0016\u0019+E";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "BX\u0011\u0001w";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "BX\u0011\u0001|";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "BX\u0011\u0001v";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "d}$9";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "TX\u0012?&IW\u0011\u0001&Rf\f\u0004";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "BX\u0011\u0001p";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "KP\b\u00051_I\u0000";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "PW\u0001N$H]\u0017\u000f,B\u0017\u0006\u00157UV\u0017N,R\\\bO+GT\u0000";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "KP\b\u00051_I\u0000";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "BX\u0011\u0001w";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "BX\u0011\u0001p";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "BX\u0011\u0001s";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "PP\u0000\u00176NX\u0017\u0005!EV\u000b\u0014$EM\u0004\u00031OO\f\u0014<\tM\u001c\u0010 \tL\u000b\u000b+IN\u000b@";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "KP\b\u00051_I\u0000";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "KP\b\u00051_I\u0000";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    str = "BX\u0011\u0001t\u0016";
                    obj = 37;
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    strArr2 = strArr3;
                    str = "BX\u0011\u0001w";
                    obj = 38;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "BX\u0011\u0001}";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "KP\b\u00051_I\u0000";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "BX\u0011\u0001v";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "BX\u0011\u0001t";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "KP\b\u00051_I\u0000";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "BX\u0011\u0001w";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "TX\u0012?&IW\u0011\u0001&Rf\f\u0004";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "PP\u0000\u0017\u001aUQ\u0004\u0012 Bf\u0006\u000f+RX\u0006\u0014j@X\t\u0013 yT\u0004\u0014&N\u0003E";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "BX\u0011\u0001q";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "G]\u0001?6NX\u0017\u0005!yZ\n\u000e1GZ\u0011O";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u0006EE";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "PW\u0001N$H]\u0017\u000f,B\u0017\u0006\u00157UV\u0017N,R\\\bO KX\f\f\u001aP\u000b";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "TX\u0012?&IW\u0011\u0001&Rf\f\u0004";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "BX\u0011\u0001t\u0013";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "KP\b\u00051_I\u0000";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "PW\u0001N$H]\u0017\u000f,B\u0017\u0006\u00157UV\u0017N,R\\\bO5NV\u0011\u000f";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "EV\bN$H]\u0017\u000f,B\u0017\u0006\u000f+RX\u0006\u00146";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    str = "BX\u0011\u0001|";
                    obj = 56;
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    strArr2 = strArr3;
                    str = "BX\u0011\u0001r";
                    obj = 57;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "BX\u0011\u0001v";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "BX\u0011\u0001r";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "PW\u0001N$H]\u0017\u000f,B\u0017\u0006\u00157UV\u0017N,R\\\bO5IJ\u0011\u0001)\u000bX\u0001\u00047CJ\u0016?3\u0014";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "PP\u0000\u0017\u001aUQ\u0004\u0012 Bf\u0006\u000f+RX\u0006\u0014jEK\u0000\u00011Cf\u0006\u000f+RX\u0006\u0014\u007f\u0006";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "PP\u0000\u0017\u001aUQ\u0004\u0012 Bf\u0006\u000f+RX\u0006\u0014jSW\u000e\u000f2Hf\u0006\u000f+RX\u0006\u0014\u001aSI\u0001\u00011C\u0003";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "TX\u0012?&IW\u0011\u0001&Rf\f\u0004";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "TX\u0012?&IW\u0011\u0001&Rf\f\u0004";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "KP\b\u00051_I\u0000";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "BX\u0011\u0001p";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "BX\u0011\u0001w";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i] = str;
                    str = "BX\u0011\u0001w";
                    obj = 68;
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i] = str;
                    i = 70;
                    strArr2 = strArr3;
                    str = "PW\u0001N$H]\u0017\u000f,B\u0017\u0006\u00157UV\u0017N,R\\\bO5NV\u000b\u0005\u001aP\u000b";
                    obj = 69;
                    break;
                case 69:
                    strArr2[i] = str;
                    i = 71;
                    str = "TX\u0012?&IW\u0011\u0001&Rf\f\u0004";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i] = str;
                    i = 72;
                    str = "GZ\u0006\u000f0HM:\u000e$K\\";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i] = str;
                    i = 73;
                    str = "TX\u0012?&IW\u0011\u0001&Rf\f\u0004";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case 72:
                    strArr2[i] = str;
                    i = 74;
                    str = "TX\u0012?&IW\u0011\u0001&Rf\f\u0004";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i] = str;
                    i = 75;
                    str = "PW\u0001N$H]\u0017\u000f,B\u0017\u0006\u00157UV\u0017N,R\\\bO*T^\u0004\u000e,\\X\u0011\t*H";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case 74:
                    strArr2[i] = str;
                    i = 76;
                    str = "BX\u0011\u0001v";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case 75:
                    strArr2[i] = str;
                    i = 77;
                    str = "BX\u0011\u0001q";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case 76:
                    strArr2[i] = str;
                    i = 78;
                    str = "BX\u0011\u0001t";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case 77:
                    strArr2[i] = str;
                    i = 79;
                    str = "PW\u0001N$H]\u0017\u000f,B\u0017\u0006\u00157UV\u0017N,R\\\bO&IW\u0011\u0001&Rf\u0000\u0016 HM";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case 78:
                    strArr2[i] = str;
                    i = 80;
                    str = "PP\u0000\u0017\u001aUQ\u0004\u0012 Bf\u0006\u000f+RX\u0006\u0014jDX\u0001?/O]_@";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case 79:
                    strArr2[i] = str;
                    i = 81;
                    str = "PP\u0000\u00176NX\u0017\u0005!EV\u000b\u0014$EM\u0004\u00031OO\f\u0014<\u0006";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case 80:
                    strArr2[i] = str;
                    i = 82;
                    str = "hp&+\u000bgt ";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case 81:
                    strArr2[i] = str;
                    i = 83;
                    str = "BX\u0011\u0001q";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case 82:
                    strArr2[i] = str;
                    i = 84;
                    str = "BX\u0011\u0001t";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case 83:
                    strArr2[i] = str;
                    i = 85;
                    str = "BX\u0011\u0001t";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case 84:
                    strArr2[i] = str;
                    i = 86;
                    str = "BX\u0011\u0001t";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case 85:
                    strArr2[i] = str;
                    i = 87;
                    str = "TX\u0012?&IW\u0011\u0001&Rf\f\u0004";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case 86:
                    strArr2[i] = str;
                    i = 88;
                    str = "BX\u0011\u0001t";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case 87:
                    strArr2[i] = str;
                    i = 89;
                    str = "KP\b\u00051_I\u0000";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case 88:
                    strArr2[i] = str;
                    i = 90;
                    str = "BX\u0011\u0001t";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case 89:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "sk)";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r7_this = this;
        r2 = com.whatsapp.App.az;
        r0 = 0;
        r1 = r0;
    L_0x0004:
        r0 = r7.o;
        r0 = r0.getChildCount();
        if (r1 >= r0) goto L_0x0108;
    L_0x000c:
        r0 = r7.o;
        r3 = r0.getChildAt(r1);
        r0 = 2131428040; // 0x7f0b02c8 float:1.8477713E38 double:1.053065371E-314;
        r0 = r3.findViewById(r0);
        r0 = (android.widget.CheckBox) r0;
        r0 = r0.isChecked();	 Catch:{ g -> 0x0127 }
        if (r0 != 0) goto L_0x0104;
    L_0x0021:
        r0 = new java.lang.StringBuilder;	 Catch:{ g -> 0x0127 }
        r0.<init>();	 Catch:{ g -> 0x0127 }
        r4 = z;	 Catch:{ g -> 0x0127 }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ g -> 0x0127 }
        r0 = r0.append(r4);	 Catch:{ g -> 0x0127 }
        r0 = r0.append(r1);	 Catch:{ g -> 0x0127 }
        r0 = r0.toString();	 Catch:{ g -> 0x0127 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ g -> 0x0127 }
        r0 = r3.getTag();	 Catch:{ g -> 0x0127 }
        r0 = r0 instanceof java.lang.String;	 Catch:{ g -> 0x0127 }
        if (r0 == 0) goto L_0x0074;
    L_0x0042:
        r0 = new java.lang.StringBuilder;	 Catch:{ g -> 0x0129 }
        r0.<init>();	 Catch:{ g -> 0x0129 }
        r4 = z;	 Catch:{ g -> 0x0129 }
        r5 = 5;
        r4 = r4[r5];	 Catch:{ g -> 0x0129 }
        r0 = r0.append(r4);	 Catch:{ g -> 0x0129 }
        r4 = r3.getTag();	 Catch:{ g -> 0x0129 }
        r4 = r4.toString();	 Catch:{ g -> 0x0129 }
        r0 = r0.append(r4);	 Catch:{ g -> 0x0129 }
        r0 = r0.toString();	 Catch:{ g -> 0x0129 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ g -> 0x0129 }
        r0 = r7.k;	 Catch:{ g -> 0x0129 }
        r0 = r0.j;	 Catch:{ g -> 0x0129 }
        r4 = r3.getTag();	 Catch:{ g -> 0x0129 }
        r4 = r4.toString();	 Catch:{ g -> 0x0129 }
        r0.remove(r4);	 Catch:{ g -> 0x0129 }
        if (r2 == 0) goto L_0x0104;
    L_0x0074:
        r0 = r3.getTag();	 Catch:{ g -> 0x012b }
        r0 = r0 instanceof defpackage.m;	 Catch:{ g -> 0x012b }
        if (r0 == 0) goto L_0x00d4;
    L_0x007c:
        r0 = r3.getTag();
        r0 = (defpackage.m) r0;
        r4 = r7.k;	 Catch:{ g -> 0x012d }
        r4 = r4.d;	 Catch:{ g -> 0x012d }
        r4.remove(r0);	 Catch:{ g -> 0x012d }
        r4 = r0.a;	 Catch:{ g -> 0x012d }
        r5 = android.provider.ContactsContract.CommonDataKinds.Email.class;
        if (r4 != r5) goto L_0x00ae;
    L_0x008f:
        r4 = new java.lang.StringBuilder;	 Catch:{ g -> 0x012d }
        r4.<init>();	 Catch:{ g -> 0x012d }
        r5 = z;	 Catch:{ g -> 0x012d }
        r6 = 7;
        r5 = r5[r6];	 Catch:{ g -> 0x012d }
        r4 = r4.append(r5);	 Catch:{ g -> 0x012d }
        r5 = r3.getTag();	 Catch:{ g -> 0x012d }
        r4 = r4.append(r5);	 Catch:{ g -> 0x012d }
        r4 = r4.toString();	 Catch:{ g -> 0x012d }
        com.whatsapp.util.Log.e(r4);	 Catch:{ g -> 0x012d }
        if (r2 == 0) goto L_0x00d2;
    L_0x00ae:
        r0 = r0.a;	 Catch:{ g -> 0x012f }
        r4 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class;
        if (r0 != r4) goto L_0x00d2;
    L_0x00b4:
        r0 = new java.lang.StringBuilder;	 Catch:{ g -> 0x0131 }
        r0.<init>();	 Catch:{ g -> 0x0131 }
        r4 = z;	 Catch:{ g -> 0x0131 }
        r5 = 8;
        r4 = r4[r5];	 Catch:{ g -> 0x0131 }
        r0 = r0.append(r4);	 Catch:{ g -> 0x0131 }
        r4 = r3.getTag();	 Catch:{ g -> 0x0131 }
        r0 = r0.append(r4);	 Catch:{ g -> 0x0131 }
        r0 = r0.toString();	 Catch:{ g -> 0x0131 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ g -> 0x0131 }
    L_0x00d2:
        if (r2 == 0) goto L_0x0104;
    L_0x00d4:
        r0 = r3.getTag();	 Catch:{ g -> 0x0133 }
        r0 = r0 instanceof defpackage.k;	 Catch:{ g -> 0x0133 }
        if (r0 == 0) goto L_0x0104;
    L_0x00dc:
        r0 = r7.k;	 Catch:{ g -> 0x0135 }
        r0 = r0.h;	 Catch:{ g -> 0x0135 }
        r4 = r3.getTag();	 Catch:{ g -> 0x0135 }
        r0.remove(r4);	 Catch:{ g -> 0x0135 }
        r0 = new java.lang.StringBuilder;	 Catch:{ g -> 0x0135 }
        r0.<init>();	 Catch:{ g -> 0x0135 }
        r4 = z;	 Catch:{ g -> 0x0135 }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ g -> 0x0135 }
        r0 = r0.append(r4);	 Catch:{ g -> 0x0135 }
        r3 = r3.getTag();	 Catch:{ g -> 0x0135 }
        r0 = r0.append(r3);	 Catch:{ g -> 0x0135 }
        r0 = r0.toString();	 Catch:{ g -> 0x0135 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ g -> 0x0135 }
    L_0x0104:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x0142;
    L_0x0108:
        r0 = new b;
        r0.<init>();
        r1 = r7.k;	 Catch:{ g -> 0x0137 }
        r2 = 2;
        r0 = r0.a(r7, r1, r2);	 Catch:{ g -> 0x0137 }
        r1 = r7.n;	 Catch:{ g -> 0x0137 }
        r2 = r7.k;	 Catch:{ g -> 0x0137 }
        r2 = r2.e;	 Catch:{ g -> 0x0137 }
        r2 = r2.d;	 Catch:{ g -> 0x0137 }
        com.whatsapp.App.d(r1, r2, r0);	 Catch:{ g -> 0x0137 }
        r0 = -1;
        r7.setResult(r0);	 Catch:{ g -> 0x0137 }
        r7.finish();	 Catch:{ g -> 0x0137 }
    L_0x0126:
        return;
    L_0x0127:
        r0 = move-exception;
        throw r0;	 Catch:{ g -> 0x0129 }
    L_0x0129:
        r0 = move-exception;
        throw r0;	 Catch:{ g -> 0x012b }
    L_0x012b:
        r0 = move-exception;
        throw r0;
    L_0x012d:
        r0 = move-exception;
        throw r0;	 Catch:{ g -> 0x012f }
    L_0x012f:
        r0 = move-exception;
        throw r0;	 Catch:{ g -> 0x0131 }
    L_0x0131:
        r0 = move-exception;
        throw r0;
    L_0x0133:
        r0 = move-exception;
        throw r0;	 Catch:{ g -> 0x0135 }
    L_0x0135:
        r0 = move-exception;
        throw r0;
    L_0x0137:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        r0 = 2131624575; // 0x7f0e027f float:1.8876334E38 double:1.0531624723E-314;
        r7.a(r0);
        goto L_0x0126;
    L_0x0142:
        r1 = r0;
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ViewSharedContactActivity.b():void");
    }

    static void a(ViewSharedContactActivity viewSharedContactActivity, View view) {
        viewSharedContactActivity.a(view);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
        r9_this = this;
        r8 = 8;
        r2 = 0;
        r4 = 0;
        r7 = com.whatsapp.App.az;
        super.onCreate(r10);	 Catch:{ IllegalArgumentException -> 0x006d }
        r0 = r9.getSupportActionBar();	 Catch:{ IllegalArgumentException -> 0x006d }
        r1 = 1;
        r0.setDisplayHomeAsUpEnabled(r1);	 Catch:{ IllegalArgumentException -> 0x006d }
        r0 = 2130903214; // 0x7f0300ae float:1.741324E38 double:1.0528060727E-314;
        r9.setContentView(r0);	 Catch:{ IllegalArgumentException -> 0x006d }
        r0 = r9.getIntent();	 Catch:{ IllegalArgumentException -> 0x006d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x006d }
        r3 = 14;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x006d }
        r3 = 0;
        r0 = r0.getBooleanExtra(r1, r3);	 Catch:{ IllegalArgumentException -> 0x006d }
        r9.q = r0;	 Catch:{ IllegalArgumentException -> 0x006d }
        r0 = r9.getIntent();	 Catch:{ IllegalArgumentException -> 0x006d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x006d }
        r3 = 10;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x006d }
        r0 = r0.getStringExtra(r1);	 Catch:{ IllegalArgumentException -> 0x006d }
        r9.l = r0;	 Catch:{ IllegalArgumentException -> 0x006d }
        r0 = r9.getIntent();	 Catch:{ IllegalArgumentException -> 0x006d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x006d }
        r3 = 17;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x006d }
        r0 = r0.getStringExtra(r1);	 Catch:{ IllegalArgumentException -> 0x006d }
        r9.n = r0;	 Catch:{ IllegalArgumentException -> 0x006d }
        r0 = r9.getIntent();	 Catch:{ IllegalArgumentException -> 0x006d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x006d }
        r3 = 13;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x006d }
        r0 = r0.getStringExtra(r1);	 Catch:{ IllegalArgumentException -> 0x006d }
        r9.j = r0;	 Catch:{ IllegalArgumentException -> 0x006d }
        r0 = r9.l;	 Catch:{ IllegalArgumentException -> 0x006d }
        if (r0 != 0) goto L_0x006f;
    L_0x005c:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x006d }
        r1 = 12;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x006d }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x006d }
        r0 = 2131625029; // 0x7f0e0445 float:1.8877254E38 double:1.0531626966E-314;
        r1 = 0;
        com.whatsapp.App.b(r9, r0, r1);	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x006c:
        return;
    L_0x006d:
        r0 = move-exception;
        throw r0;
    L_0x006f:
        r0 = 2131428036; // 0x7f0b02c4 float:1.8477705E38 double:1.053065369E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x0323 }
        r0 = (android.widget.LinearLayout) r0;	 Catch:{ IllegalArgumentException -> 0x0323 }
        r9.o = r0;	 Catch:{ IllegalArgumentException -> 0x0323 }
        r0 = r9.l;	 Catch:{ IllegalArgumentException -> 0x0323 }
        r0 = r9.a(r0);	 Catch:{ IllegalArgumentException -> 0x0323 }
        r9.k = r0;	 Catch:{ IllegalArgumentException -> 0x0323 }
        r0 = r9.k;	 Catch:{ IllegalArgumentException -> 0x0323 }
        if (r0 != 0) goto L_0x0091;
    L_0x0086:
        r0 = 2131624290; // 0x7f0e0162 float:1.8875756E38 double:1.0531623315E-314;
        r1 = new com.whatsapp.og;	 Catch:{ IllegalArgumentException -> 0x0323 }
        r1.<init>(r9);	 Catch:{ IllegalArgumentException -> 0x0323 }
        r9.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0323 }
    L_0x0091:
        r0 = r9.q;	 Catch:{ IllegalArgumentException -> 0x0325 }
        if (r0 == 0) goto L_0x00ca;
    L_0x0095:
        r0 = 2131428037; // 0x7f0b02c5 float:1.8477707E38 double:1.0530653697E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x0325 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x0325 }
        r0 = 2131428038; // 0x7f0b02c6 float:1.847771E38 double:1.05306537E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x0325 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x0325 }
        r0 = r9.k;	 Catch:{ IllegalArgumentException -> 0x0325 }
        if (r0 == 0) goto L_0x00be;
    L_0x00b0:
        r0 = r9.k;	 Catch:{ IllegalArgumentException -> 0x0327 }
        r1 = r9.getBaseContext();	 Catch:{ IllegalArgumentException -> 0x0327 }
        r3 = r9.j;	 Catch:{ IllegalArgumentException -> 0x0327 }
        r1 = defpackage.o.a(r1, r3);	 Catch:{ IllegalArgumentException -> 0x0327 }
        r0.f = r1;	 Catch:{ IllegalArgumentException -> 0x0327 }
    L_0x00be:
        r0 = r9.getSupportActionBar();	 Catch:{ IllegalArgumentException -> 0x0333 }
        r1 = 2131624818; // 0x7f0e0372 float:1.8876826E38 double:1.0531625924E-314;
        r0.setTitle(r1);	 Catch:{ IllegalArgumentException -> 0x0333 }
        if (r7 == 0) goto L_0x00eb;
    L_0x00ca:
        r0 = 2131428037; // 0x7f0b02c5 float:1.8477707E38 double:1.0530653697E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x0333 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x0333 }
        r0 = 2131428038; // 0x7f0b02c6 float:1.847771E38 double:1.05306537E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x0333 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x0333 }
        r0 = r9.getSupportActionBar();	 Catch:{ IllegalArgumentException -> 0x0333 }
        r1 = 2131625074; // 0x7f0e0472 float:1.8877346E38 double:1.053162719E-314;
        r0.setTitle(r1);	 Catch:{ IllegalArgumentException -> 0x0333 }
    L_0x00eb:
        r0 = r9.k;	 Catch:{ IllegalArgumentException -> 0x0335 }
        if (r0 == 0) goto L_0x02ea;
    L_0x00ef:
        r0 = r9.k;	 Catch:{ IllegalArgumentException -> 0x0337 }
        r0 = r0.f;	 Catch:{ IllegalArgumentException -> 0x0337 }
        if (r0 == 0) goto L_0x0143;
    L_0x00f5:
        r0 = r9.k;	 Catch:{ IllegalArgumentException -> 0x0339 }
        r0 = r0.f;	 Catch:{ IllegalArgumentException -> 0x0339 }
        r0 = r0.length;	 Catch:{ IllegalArgumentException -> 0x0339 }
        if (r0 <= 0) goto L_0x0143;
    L_0x00fc:
        r0 = r9.q;	 Catch:{ IllegalArgumentException -> 0x0339 }
        if (r0 != 0) goto L_0x010a;
    L_0x0100:
        r0 = r9.k;
        r0 = r0.f;
        r6 = android.backport.util.Base64.decode(r0, r4);
        if (r7 == 0) goto L_0x010e;
    L_0x010a:
        r0 = r9.k;
        r6 = r0.f;
    L_0x010e:
        r0 = r6.length;
        r0 = android.graphics.BitmapFactory.decodeByteArray(r6, r4, r0);
        r9.m = r0;
        r0 = new com.whatsapp.mn;
        r1 = r9;
        r3 = r2;
        r5 = r2;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r1 = 2131427649; // 0x7f0b0141 float:1.847692E38 double:1.053065178E-314;
        r1 = r9.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r3 = r9.getResources();
        r5 = 2131361881; // 0x7f0a0059 float:1.8343527E38 double:1.0530326843E-314;
        r3 = r3.getDimensionPixelSize(r5);
        r5 = r9.getResources();
        r6 = 2131361880; // 0x7f0a0058 float:1.8343525E38 double:1.053032684E-314;
        r5 = r5.getDimension(r6);
        r0 = r0.a(r3, r5, r4);
        r1.setImageBitmap(r0);
    L_0x0143:
        r0 = r9.k;	 Catch:{ IllegalArgumentException -> 0x033b }
        r0 = r0.c;	 Catch:{ IllegalArgumentException -> 0x033b }
        if (r0 == 0) goto L_0x0359;
    L_0x0149:
        r0 = r9.k;	 Catch:{ IllegalArgumentException -> 0x033b }
        r0 = r0.c;	 Catch:{ IllegalArgumentException -> 0x033b }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x033b }
        if (r0 <= 0) goto L_0x0359;
    L_0x0153:
        r0 = r9.k;
        r0 = r0.c;
        r0 = r0.get(r4);
        r0 = (defpackage.l) r0;
        r1 = r0.d;
        r0 = r9.k;
        r0 = r0.c;
        r0 = r0.get(r4);
        r0 = (defpackage.l) r0;
        r2 = r0.c;
        r0 = r1;
    L_0x016c:
        r1 = r9.k;
        r1 = r1.e;
        r1 = r1.d;
        r9.a(r1, r0, r2);
        r0 = r9.k;
        r0 = r0.h;
        if (r0 == 0) goto L_0x01d4;
    L_0x017b:
        r0 = r9.k;
        r0 = r0.h;
        r2 = r0.iterator();
    L_0x0183:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x01d4;
    L_0x0189:
        r0 = r2.next();
        r0 = (defpackage.k) r0;
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x033d }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x033d }
        r3 = r9.getResources();	 Catch:{ IllegalArgumentException -> 0x033d }
        r4 = 2131624044; // 0x7f0e006c float:1.8875257E38 double:1.05316221E-314;
        r3 = r3.getString(r4);	 Catch:{ IllegalArgumentException -> 0x033d }
        r1 = r1.append(r3);	 Catch:{ IllegalArgumentException -> 0x033d }
        r3 = " ";
        r3 = r1.append(r3);	 Catch:{ IllegalArgumentException -> 0x033d }
        r1 = r0.b;	 Catch:{ IllegalArgumentException -> 0x033d }
        if (r1 != 0) goto L_0x033f;
    L_0x01ad:
        r1 = r0.a;	 Catch:{ IllegalArgumentException -> 0x033d }
    L_0x01af:
        r1 = r3.append(r1);
        r1 = r1.toString();
        r3 = r0.d;
        r4 = 2130837814; // 0x7f020136 float:1.7280593E38 double:1.052773761E-314;
        r5 = r0.d;
        r1 = r9.a(r1, r3, r4, r5);
        r3 = new com.whatsapp._q;
        r3.<init>(r9);
        r1.setOnClickListener(r3);
        r1.setTag(r0);
        r0 = r9.o;
        r0.addView(r1);
        if (r7 == 0) goto L_0x0183;
    L_0x01d4:
        r0 = r9.k;
        r0 = r0.d;
        if (r0 == 0) goto L_0x0258;
    L_0x01da:
        r0 = r9.k;
        r0 = r0.d;
        r2 = r0.iterator();
    L_0x01e2:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0258;
    L_0x01e8:
        r0 = r2.next();
        r0 = (defpackage.m) r0;
        r1 = r0.a;	 Catch:{ IllegalArgumentException -> 0x0349 }
        r3 = android.provider.ContactsContract.CommonDataKinds.Email.class;
        if (r1 != r3) goto L_0x0239;
    L_0x01f4:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x034b }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x034b }
        r3 = r9.getResources();	 Catch:{ IllegalArgumentException -> 0x034b }
        r4 = 2131624257; // 0x7f0e0141 float:1.8875689E38 double:1.053162315E-314;
        r3 = r3.getString(r4);	 Catch:{ IllegalArgumentException -> 0x034b }
        r1 = r1.append(r3);	 Catch:{ IllegalArgumentException -> 0x034b }
        r3 = " ";
        r3 = r1.append(r3);	 Catch:{ IllegalArgumentException -> 0x034b }
        r1 = r0.e;	 Catch:{ IllegalArgumentException -> 0x034b }
        if (r1 != 0) goto L_0x034d;
    L_0x0212:
        r1 = r0.f;	 Catch:{ IllegalArgumentException -> 0x034b }
    L_0x0214:
        r1 = r3.append(r1);
        r1 = r1.toString();
        r3 = r0.d;
        r4 = 2130837812; // 0x7f020134 float:1.7280589E38 double:1.05277376E-314;
        r5 = r0.d;
        r1 = r9.a(r1, r3, r4, r5);
        r3 = new com.whatsapp.a81;	 Catch:{ IllegalArgumentException -> 0x0357 }
        r3.<init>(r9);	 Catch:{ IllegalArgumentException -> 0x0357 }
        r1.setOnClickListener(r3);	 Catch:{ IllegalArgumentException -> 0x0357 }
        r1.setTag(r0);	 Catch:{ IllegalArgumentException -> 0x0357 }
        r3 = r9.o;	 Catch:{ IllegalArgumentException -> 0x0357 }
        r3.addView(r1);	 Catch:{ IllegalArgumentException -> 0x0357 }
        if (r7 == 0) goto L_0x0256;
    L_0x0239:
        r1 = r0.a;	 Catch:{ IllegalArgumentException -> 0x0357 }
        r3 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class;
        if (r1 != r3) goto L_0x0256;
    L_0x023f:
        r1 = 2130837813; // 0x7f020135 float:1.728059E38 double:1.0527737603E-314;
        r1 = r9.a(r0, r1);
        r3 = new com.whatsapp.oy;
        r3.<init>(r9);
        r1.setOnClickListener(r3);
        r1.setTag(r0);
        r0 = r9.o;
        r0.addView(r1);
    L_0x0256:
        if (r7 == 0) goto L_0x01e2;
    L_0x0258:
        r0 = r9.k;
        r0 = r0.j;
        if (r0 == 0) goto L_0x02ca;
    L_0x025e:
        r0 = r9.k;
        r0 = r0.j;
        r0 = r0.keySet();
        r1 = r0.iterator();
    L_0x026a:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x02ca;
    L_0x0270:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r2 = r9.k;
        r2 = r2.j;
        r0 = r2.get(r0);
        r0 = (java.util.List) r0;
        r2 = r0.iterator();
    L_0x0284:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x02c8;
    L_0x028a:
        r0 = r2.next();
        r0 = (defpackage.j) r0;
        r3 = r0.toString();
        com.whatsapp.util.Log.e(r3);
        r3 = r0.e;
        r4 = z;
        r5 = 15;
        r4 = r4[r5];
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x02bd;
    L_0x02a5:
        r3 = z;
        r4 = 11;
        r3 = r3[r4];
        r3 = java.util.regex.Pattern.compile(r3);
        r4 = r0.d;
        r3 = r3.matcher(r4);
        r3 = r3.matches();
        if (r3 != 0) goto L_0x02bd;
    L_0x02bb:
        if (r7 == 0) goto L_0x0284;
    L_0x02bd:
        r0 = r9.a(r0);
        r3 = r9.o;
        r3.addView(r0);
        if (r7 == 0) goto L_0x0284;
    L_0x02c8:
        if (r7 == 0) goto L_0x026a;
    L_0x02ca:
        r0 = r9.o;
        r0 = r0.getChildCount();
        if (r0 <= 0) goto L_0x02ea;
    L_0x02d2:
        r0 = r9.o;
        r1 = r9.o;
        r1 = r1.getChildCount();
        r1 = r1 + -1;
        r0 = r0.getChildAt(r1);
        r1 = 2131427543; // 0x7f0b00d7 float:1.8476705E38 double:1.0530651256E-314;
        r0 = r0.findViewById(r1);
        r0.setVisibility(r8);
    L_0x02ea:
        r0 = 2131427923; // 0x7f0b0253 float:1.8477476E38 double:1.0530653133E-314;
        r0 = r9.findViewById(r0);
        r1 = new com.whatsapp.mx;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r0 = 2131427774; // 0x7f0b01be float:1.8477174E38 double:1.0530652397E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = 2131624817; // 0x7f0e0371 float:1.8876824E38 double:1.053162592E-314;
        r0.setText(r1);
        r1 = new com.whatsapp.tn;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r0 = 2131427775; // 0x7f0b01bf float:1.8477176E38 double:1.05306524E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = new com.whatsapp.a8r;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        goto L_0x006c;
    L_0x0323:
        r0 = move-exception;
        throw r0;
    L_0x0325:
        r0 = move-exception;
        throw r0;
    L_0x0327:
        r0 = move-exception;
        r0 = z;
        r1 = 16;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        goto L_0x00be;
    L_0x0333:
        r0 = move-exception;
        throw r0;
    L_0x0335:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0337 }
    L_0x0337:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0339 }
    L_0x0339:
        r0 = move-exception;
        throw r0;
    L_0x033b:
        r0 = move-exception;
        throw r0;
    L_0x033d:
        r0 = move-exception;
        throw r0;
    L_0x033f:
        r1 = android.provider.ContactsContract.CommonDataKinds.Phone.class;
        r4 = r0.b;
        r1 = r9.a(r1, r4);
        goto L_0x01af;
    L_0x0349:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x034b }
    L_0x034b:
        r0 = move-exception;
        throw r0;
    L_0x034d:
        r1 = android.provider.ContactsContract.CommonDataKinds.Email.class;
        r4 = r0.e;
        r1 = r9.a(r1, r4);
        goto L_0x0214;
    L_0x0357:
        r0 = move-exception;
        throw r0;
    L_0x0359:
        r0 = r2;
        goto L_0x016c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ViewSharedContactActivity.onCreate(android.os.Bundle):void");
    }

    private o a(String str) {
        try {
            return o.a(str);
        } catch (Throwable e) {
            Log.b(e);
            return null;
        } catch (Throwable e2) {
            Log.c(e2);
            return null;
        } catch (Throwable e22) {
            Log.b(e22);
            return null;
        }
    }

    private String a(Class cls, int i) {
        try {
            Method method = cls.getMethod(z[18], new Class[]{Integer.TYPE});
            return App.p.getString(((Integer) method.invoke(null, new Object[]{Integer.valueOf(i)})).intValue());
        } catch (Throwable e) {
            Log.c(e);
            return null;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    public ViewSharedContactActivity() {
        this.k = null;
        this.p = false;
        this.m = null;
        this.q = false;
    }

    static void a(ViewSharedContactActivity viewSharedContactActivity) {
        viewSharedContactActivity.d();
    }

    private void a(String str, String str2, String str3) {
        ((TextView) findViewById(R.id.name)).setText(str);
        TextView textView = (TextView) findViewById(R.id.description);
        try {
            if (TextUtils.isEmpty(str2)) {
                textView.setVisibility(8);
                try {
                    if (App.az == 0) {
                        return;
                    }
                }
            }
            textView.setText(str2);
            textView.setVisibility(0);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static void c(ViewSharedContactActivity viewSharedContactActivity) {
        viewSharedContactActivity.b();
    }

    private void d() {
        try {
            if (this.p) {
                f(getString(R.string.contact_added_already, new Object[]{this.k.a()}));
                try {
                    if (App.az == 0) {
                        return;
                    }
                }
            }
            a();
            this.p = true;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a() {
        /*
        r15_this = this;
        r8 = 0;
        r11 = 64;
        r3 = 1;
        r5 = 0;
        r6 = com.whatsapp.App.az;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r1 = 0;
        r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI;
        r0 = android.content.ContentProviderOperation.newInsert(r0);
        r4 = z;
        r7 = 72;
        r4 = r4[r7];
        r0.withValue(r4, r8);
        r4 = z;
        r7 = 20;
        r4 = r4[r7];
        r0.withValue(r4, r8);
        r0 = r0.build();
        r2.add(r0);
        r0 = android.provider.ContactsContract.Data.CONTENT_URI;
        r0 = android.content.ContentProviderOperation.newInsert(r0);
        r4 = z;
        r7 = 71;
        r4 = r4[r7];
        r0.withValueBackReference(r4, r5);
        r4 = z;
        r7 = 36;
        r4 = r4[r7];
        r7 = z;
        r8 = 30;
        r7 = r7[r8];
        r0.withValue(r4, r7);
        r4 = z;
        r7 = 43;
        r4 = r4[r7];
        r7 = r15.k;
        r7 = r7.e;
        r7 = r7.d;
        r0.withValue(r4, r7);
        r4 = z;
        r7 = 25;
        r4 = r4[r7];
        r7 = r15.k;
        r7 = r7.e;
        r7 = r7.b;
        r0.withValue(r4, r7);
        r4 = z;
        r7 = 32;
        r4 = r4[r7];
        r7 = r15.k;
        r7 = r7.e;
        r7 = r7.g;
        r0.withValue(r4, r7);
        r4 = z;
        r7 = 33;
        r4 = r4[r7];
        r7 = r15.k;
        r7 = r7.e;
        r7 = r7.c;
        r0.withValue(r4, r7);
        r4 = z;
        r7 = 48;
        r4 = r4[r7];
        r7 = r15.k;
        r7 = r7.e;
        r7 = r7.e;
        r0.withValue(r4, r7);
        r4 = z;
        r7 = 34;
        r4 = r4[r7];
        r7 = r15.k;
        r7 = r7.e;
        r7 = r7.f;
        r0.withValue(r4, r7);
        r4 = z;
        r7 = 58;
        r4 = r4[r7];
        r7 = r15.k;
        r7 = r7.e;
        r7 = r7.h;
        r0.withValue(r4, r7);
        r4 = z;
        r7 = 57;
        r4 = r4[r7];
        r7 = r15.k;
        r7 = r7.e;
        r7 = r7.a;
        r0.withValue(r4, r7);
        r0 = r0.build();
        r2.add(r0);
        r0 = r15.k;
        r0 = r0.h;
        if (r0 == 0) goto L_0x0133;
    L_0x00cf:
        r0 = r15.k;
        r0 = r0.h;
        r4 = r0.iterator();
    L_0x00d7:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0133;
    L_0x00dd:
        r0 = r4.next();
        r0 = (defpackage.k) r0;
        r7 = android.provider.ContactsContract.Data.CONTENT_URI;
        r7 = android.content.ContentProviderOperation.newInsert(r7);
        r8 = z;	 Catch:{ Exception -> 0x05cd }
        r9 = 87;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05cd }
        r7.withValueBackReference(r8, r1);	 Catch:{ Exception -> 0x05cd }
        r8 = z;	 Catch:{ Exception -> 0x05cd }
        r9 = 41;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05cd }
        r9 = z;	 Catch:{ Exception -> 0x05cd }
        r10 = 70;
        r9 = r9[r10];	 Catch:{ Exception -> 0x05cd }
        r7.withValue(r8, r9);	 Catch:{ Exception -> 0x05cd }
        r8 = z;	 Catch:{ Exception -> 0x05cd }
        r9 = 78;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05cd }
        r9 = r0.d;	 Catch:{ Exception -> 0x05cd }
        r7.withValue(r8, r9);	 Catch:{ Exception -> 0x05cd }
        r8 = z;	 Catch:{ Exception -> 0x05cd }
        r9 = 39;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05cd }
        r9 = r0.b;	 Catch:{ Exception -> 0x05cd }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ Exception -> 0x05cd }
        r7.withValue(r8, r9);	 Catch:{ Exception -> 0x05cd }
        r8 = r0.b;	 Catch:{ Exception -> 0x05cd }
        if (r8 != 0) goto L_0x012a;
    L_0x011f:
        r8 = z;	 Catch:{ Exception -> 0x05cd }
        r9 = 76;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05cd }
        r0 = r0.a;	 Catch:{ Exception -> 0x05cd }
        r7.withValue(r8, r0);	 Catch:{ Exception -> 0x05cd }
    L_0x012a:
        r0 = r7.build();
        r2.add(r0);
        if (r6 == 0) goto L_0x00d7;
    L_0x0133:
        r0 = r15.k;
        r0 = r0.d;
        if (r0 == 0) goto L_0x0277;
    L_0x0139:
        r0 = r15.k;
        r0 = r0.d;
        r4 = r0.iterator();
    L_0x0141:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0277;
    L_0x0147:
        r0 = r4.next();
        r0 = (defpackage.m) r0;
        r7 = r0.a;
        r8 = android.provider.ContactsContract.CommonDataKinds.Email.class;
        if (r7 != r8) goto L_0x01a3;
    L_0x0153:
        r7 = android.provider.ContactsContract.Data.CONTENT_URI;
        r7 = android.content.ContentProviderOperation.newInsert(r7);
        r8 = z;	 Catch:{ Exception -> 0x05cf }
        r9 = 27;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05cf }
        r7.withValueBackReference(r8, r1);	 Catch:{ Exception -> 0x05cf }
        r8 = z;	 Catch:{ Exception -> 0x05cf }
        r9 = 54;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05cf }
        r9 = z;	 Catch:{ Exception -> 0x05cf }
        r10 = 51;
        r9 = r9[r10];	 Catch:{ Exception -> 0x05cf }
        r7.withValue(r8, r9);	 Catch:{ Exception -> 0x05cf }
        r8 = z;	 Catch:{ Exception -> 0x05cf }
        r9 = 85;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05cf }
        r9 = r0.d;	 Catch:{ Exception -> 0x05cf }
        r7.withValue(r8, r9);	 Catch:{ Exception -> 0x05cf }
        r8 = z;	 Catch:{ Exception -> 0x05cf }
        r9 = 23;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05cf }
        r9 = r0.e;	 Catch:{ Exception -> 0x05cf }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ Exception -> 0x05cf }
        r7.withValue(r8, r9);	 Catch:{ Exception -> 0x05cf }
        r8 = r0.e;	 Catch:{ Exception -> 0x05cf }
        if (r8 != 0) goto L_0x019a;
    L_0x018f:
        r8 = z;	 Catch:{ Exception -> 0x05cf }
        r9 = 42;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05cf }
        r9 = r0.f;	 Catch:{ Exception -> 0x05cf }
        r7.withValue(r8, r9);	 Catch:{ Exception -> 0x05cf }
    L_0x019a:
        r7 = r7.build();	 Catch:{ Exception -> 0x05d1 }
        r2.add(r7);	 Catch:{ Exception -> 0x05d1 }
        if (r6 == 0) goto L_0x0275;
    L_0x01a3:
        r7 = r0.a;	 Catch:{ Exception -> 0x05d1 }
        r8 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class;
        if (r7 != r8) goto L_0x0231;
    L_0x01a9:
        r7 = android.provider.ContactsContract.Data.CONTENT_URI;
        r7 = android.content.ContentProviderOperation.newInsert(r7);
        r8 = z;	 Catch:{ Exception -> 0x05d3 }
        r9 = 52;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05d3 }
        r7.withValueBackReference(r8, r1);	 Catch:{ Exception -> 0x05d3 }
        r8 = z;	 Catch:{ Exception -> 0x05d3 }
        r9 = 31;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05d3 }
        r9 = z;	 Catch:{ Exception -> 0x05d3 }
        r10 = 61;
        r9 = r9[r10];	 Catch:{ Exception -> 0x05d3 }
        r7.withValue(r8, r9);	 Catch:{ Exception -> 0x05d3 }
        r8 = z;	 Catch:{ Exception -> 0x05d3 }
        r9 = 77;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05d3 }
        r9 = r0.b;	 Catch:{ Exception -> 0x05d3 }
        r9 = r9.a();	 Catch:{ Exception -> 0x05d3 }
        r7.withValue(r8, r9);	 Catch:{ Exception -> 0x05d3 }
        r8 = z;	 Catch:{ Exception -> 0x05d3 }
        r9 = 60;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05d3 }
        r9 = r0.b;	 Catch:{ Exception -> 0x05d3 }
        r9 = r9.b;	 Catch:{ Exception -> 0x05d3 }
        r7.withValue(r8, r9);	 Catch:{ Exception -> 0x05d3 }
        r8 = z;	 Catch:{ Exception -> 0x05d3 }
        r9 = 40;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05d3 }
        r9 = r0.b;	 Catch:{ Exception -> 0x05d3 }
        r9 = r9.c;	 Catch:{ Exception -> 0x05d3 }
        r7.withValue(r8, r9);	 Catch:{ Exception -> 0x05d3 }
        r8 = z;	 Catch:{ Exception -> 0x05d3 }
        r9 = 24;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05d3 }
        r9 = r0.b;	 Catch:{ Exception -> 0x05d3 }
        r9 = r9.d;	 Catch:{ Exception -> 0x05d3 }
        r7.withValue(r8, r9);	 Catch:{ Exception -> 0x05d3 }
        r8 = z;	 Catch:{ Exception -> 0x05d3 }
        r9 = 38;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05d3 }
        r9 = r0.b;	 Catch:{ Exception -> 0x05d3 }
        r9 = r9.e;	 Catch:{ Exception -> 0x05d3 }
        r7.withValue(r8, r9);	 Catch:{ Exception -> 0x05d3 }
        r8 = z;	 Catch:{ Exception -> 0x05d3 }
        r9 = 69;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05d3 }
        r9 = r0.e;	 Catch:{ Exception -> 0x05d3 }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ Exception -> 0x05d3 }
        r7.withValue(r8, r9);	 Catch:{ Exception -> 0x05d3 }
        r8 = r0.e;	 Catch:{ Exception -> 0x05d3 }
        if (r8 != 0) goto L_0x0228;
    L_0x021d:
        r8 = z;	 Catch:{ Exception -> 0x05d3 }
        r9 = 59;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05d3 }
        r9 = r0.f;	 Catch:{ Exception -> 0x05d3 }
        r7.withValue(r8, r9);	 Catch:{ Exception -> 0x05d3 }
    L_0x0228:
        r7 = r7.build();	 Catch:{ Exception -> 0x05d5 }
        r2.add(r7);	 Catch:{ Exception -> 0x05d5 }
        if (r6 == 0) goto L_0x0275;
    L_0x0231:
        r7 = r0.a;	 Catch:{ Exception -> 0x05d5 }
        r8 = android.provider.ContactsContract.CommonDataKinds.Im.class;
        if (r7 != r8) goto L_0x0257;
    L_0x0237:
        r7 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x05d7 }
        r7.<init>();	 Catch:{ Exception -> 0x05d7 }
        r8 = z;	 Catch:{ Exception -> 0x05d7 }
        r9 = 81;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05d7 }
        r7 = r7.append(r8);	 Catch:{ Exception -> 0x05d7 }
        r8 = r0.toString();	 Catch:{ Exception -> 0x05d7 }
        r7 = r7.append(r8);	 Catch:{ Exception -> 0x05d7 }
        r7 = r7.toString();	 Catch:{ Exception -> 0x05d7 }
        com.whatsapp.util.Log.e(r7);	 Catch:{ Exception -> 0x05d7 }
        if (r6 == 0) goto L_0x0275;
    L_0x0257:
        r7 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x05d9 }
        r7.<init>();	 Catch:{ Exception -> 0x05d9 }
        r8 = z;	 Catch:{ Exception -> 0x05d9 }
        r9 = 35;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05d9 }
        r7 = r7.append(r8);	 Catch:{ Exception -> 0x05d9 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x05d9 }
        r0 = r7.append(r0);	 Catch:{ Exception -> 0x05d9 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x05d9 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x05d9 }
    L_0x0275:
        if (r6 == 0) goto L_0x0141;
    L_0x0277:
        r0 = r15.k;	 Catch:{ Exception -> 0x05db }
        r0 = r0.c;	 Catch:{ Exception -> 0x05db }
        if (r0 == 0) goto L_0x02ee;
    L_0x027d:
        r0 = r15.k;	 Catch:{ Exception -> 0x05db }
        r0 = r0.c;	 Catch:{ Exception -> 0x05db }
        r0 = r0.size();	 Catch:{ Exception -> 0x05db }
        if (r0 <= 0) goto L_0x02ee;
    L_0x0287:
        r0 = r15.k;
        r0 = r0.c;
        r0 = r0.get(r5);
        r0 = (defpackage.l) r0;
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;
        r4 = android.content.ContentProviderOperation.newInsert(r1);
        r1 = z;
        r7 = 73;
        r1 = r1[r7];
        r4.withValueBackReference(r1, r5);
        r1 = z;
        r7 = 37;
        r1 = r1[r7];
        r7 = z;
        r8 = 75;
        r7 = r7[r8];
        r4.withValue(r1, r7);
        r1 = r0.d;
        r7 = " ";
        r7 = r1.lastIndexOf(r7);
        if (r7 <= 0) goto L_0x05df;
    L_0x02b9:
        r1 = r0.d;	 Catch:{ Exception -> 0x05dd }
        r8 = 0;
        r1 = r1.substring(r8, r7);	 Catch:{ Exception -> 0x05dd }
    L_0x02c0:
        r8 = z;	 Catch:{ Exception -> 0x05e3 }
        r9 = 86;
        r8 = r8[r9];	 Catch:{ Exception -> 0x05e3 }
        r4.withValue(r8, r1);	 Catch:{ Exception -> 0x05e3 }
        if (r7 <= 0) goto L_0x02dc;
    L_0x02cb:
        r1 = z;	 Catch:{ Exception -> 0x05e3 }
        r8 = 28;
        r1 = r1[r8];	 Catch:{ Exception -> 0x05e3 }
        r8 = r0.d;	 Catch:{ Exception -> 0x05e3 }
        r7 = r7 + 1;
        r7 = r8.substring(r7);	 Catch:{ Exception -> 0x05e3 }
        r4.withValue(r1, r7);	 Catch:{ Exception -> 0x05e3 }
    L_0x02dc:
        r1 = z;
        r7 = 83;
        r1 = r1[r7];
        r0 = r0.c;
        r4.withValue(r1, r0);
        r0 = r4.build();
        r2.add(r0);
    L_0x02ee:
        r0 = r15.k;
        r0 = r0.j;
        if (r0 == 0) goto L_0x0442;
    L_0x02f4:
        r0 = r15.k;
        r0 = r0.j;
        r0 = r0.keySet();
        r4 = r0.iterator();
    L_0x0300:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0442;
    L_0x0306:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r1 = z;
        r7 = 82;
        r1 = r1[r7];
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x035b;
    L_0x0318:
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;
        r1 = android.content.ContentProviderOperation.newInsert(r1);
        r7 = z;
        r8 = 46;
        r7 = r7[r8];
        r1 = r1.withValueBackReference(r7, r5);
        r7 = z;
        r8 = 29;
        r7 = r7[r8];
        r8 = z;
        r9 = 21;
        r8 = r8[r9];
        r7 = r1.withValue(r7, r8);
        r1 = z;
        r8 = 88;
        r8 = r1[r8];
        r1 = r15.k;
        r1 = r1.j;
        r1 = r1.get(r0);
        r1 = (java.util.List) r1;
        r1 = r1.get(r5);
        r1 = (defpackage.j) r1;
        r1 = r1.d;
        r1 = r7.withValue(r8, r1);
        r1 = r1.build();
        r2.add(r1);
    L_0x035b:
        r1 = z;
        r7 = 26;
        r1 = r1[r7];
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x03b9;
    L_0x0367:
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;
        r1 = android.content.ContentProviderOperation.newInsert(r1);
        r7 = z;
        r8 = 74;
        r7 = r7[r8];
        r1 = r1.withValueBackReference(r7, r5);
        r7 = z;
        r8 = 66;
        r7 = r7[r8];
        r8 = z;
        r9 = 79;
        r8 = r8[r9];
        r1 = r1.withValue(r7, r8);
        r7 = z;
        r8 = 68;
        r7 = r7[r8];
        r8 = 3;
        r8 = java.lang.Integer.valueOf(r8);
        r7 = r1.withValue(r7, r8);
        r1 = z;
        r8 = 84;
        r8 = r1[r8];
        r1 = r15.k;
        r1 = r1.j;
        r1 = r1.get(r0);
        r1 = (java.util.List) r1;
        r1 = r1.get(r5);
        r1 = (defpackage.j) r1;
        r1 = r1.d;
        r1 = r7.withValue(r8, r1);
        r1 = r1.build();
        r2.add(r1);
    L_0x03b9:
        r1 = defpackage.o.m;
        r1 = r1.containsKey(r0);
        if (r1 == 0) goto L_0x0440;
    L_0x03c1:
        r1 = r15.k;
        r1 = r1.j;
        r1 = r1.get(r0);
        r1 = (java.util.List) r1;
        r1 = r1.get(r5);
        r1 = (defpackage.j) r1;
        r7 = android.provider.ContactsContract.Data.CONTENT_URI;
        r7 = android.content.ContentProviderOperation.newInsert(r7);
        r8 = z;
        r8 = r8[r11];
        r7 = r7.withValueBackReference(r8, r5);
        r8 = z;
        r9 = 44;
        r8 = r8[r9];
        r9 = z;
        r10 = 19;
        r9 = r9[r10];
        r7 = r7.withValue(r8, r9);
        r8 = z;
        r9 = 67;
        r8 = r8[r9];
        r9 = defpackage.o.m;
        r9 = r9.get(r0);
        r7 = r7.withValue(r8, r9);
        r8 = z;
        r9 = 90;
        r8 = r8[r9];
        r9 = r15.k;
        r9 = r9.j;
        r0 = r9.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.get(r5);
        r0 = (defpackage.j) r0;
        r0 = r0.d;
        r0 = r7.withValue(r8, r0);
        r7 = r1.g;	 Catch:{ Exception -> 0x05e5 }
        if (r7 == 0) goto L_0x0439;
    L_0x041f:
        r7 = r1.g;	 Catch:{ Exception -> 0x05e5 }
        r7 = r7.size();	 Catch:{ Exception -> 0x05e5 }
        if (r7 <= 0) goto L_0x0439;
    L_0x0427:
        r7 = z;	 Catch:{ Exception -> 0x05e7 }
        r8 = 45;
        r7 = r7[r8];	 Catch:{ Exception -> 0x05e7 }
        r1 = r1.g;	 Catch:{ Exception -> 0x05e7 }
        r1 = r1.toArray();	 Catch:{ Exception -> 0x05e7 }
        r8 = 0;
        r1 = r1[r8];	 Catch:{ Exception -> 0x05e7 }
        r0.withValue(r7, r1);	 Catch:{ Exception -> 0x05e7 }
    L_0x0439:
        r0 = r0.build();
        r2.add(r0);
    L_0x0440:
        if (r6 == 0) goto L_0x0300;
    L_0x0442:
        r0 = r15.m;
        if (r0 == 0) goto L_0x0489;
    L_0x0446:
        r0 = new java.io.ByteArrayOutputStream;
        r0.<init>();
        r1 = r15.m;
        r4 = android.graphics.Bitmap.CompressFormat.PNG;
        r7 = 100;
        r1.compress(r4, r7, r0);
        r0 = r0.toByteArray();
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;
        r1 = android.content.ContentProviderOperation.newInsert(r1);
        r4 = z;
        r7 = 65;
        r4 = r4[r7];
        r1 = r1.withValueBackReference(r4, r5);
        r4 = z;
        r7 = 89;
        r4 = r4[r7];
        r7 = z;
        r8 = 55;
        r7 = r7[r8];
        r1 = r1.withValue(r4, r7);
        r4 = z;
        r7 = 53;
        r4 = r4[r7];
        r0 = r1.withValue(r4, r0);
        r0 = r0.build();
        r2.add(r0);
    L_0x0489:
        r0 = com.whatsapp.App.e;	 Catch:{ Exception -> 0x05eb }
        r1 = z;	 Catch:{ Exception -> 0x05eb }
        r4 = 56;
        r1 = r1[r4];	 Catch:{ Exception -> 0x05eb }
        r0 = r0.applyBatch(r1, r2);	 Catch:{ Exception -> 0x05eb }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ Exception -> 0x05eb }
        r0 = r0.uri;	 Catch:{ Exception -> 0x05eb }
        r7 = r0.getLastPathSegment();	 Catch:{ Exception -> 0x05eb }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x05eb }
        r0.<init>();	 Catch:{ Exception -> 0x05eb }
        r1 = z;	 Catch:{ Exception -> 0x05eb }
        r2 = 62;
        r1 = r1[r2];	 Catch:{ Exception -> 0x05eb }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x05eb }
        r1 = r15.k;	 Catch:{ Exception -> 0x05eb }
        r1 = r1.e;	 Catch:{ Exception -> 0x05eb }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x05eb }
        r1 = z;	 Catch:{ Exception -> 0x05eb }
        r2 = 50;
        r1 = r1[r2];	 Catch:{ Exception -> 0x05eb }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x05eb }
        r0 = r0.append(r7);	 Catch:{ Exception -> 0x05eb }
        r0 = r0.toString();	 Catch:{ Exception -> 0x05eb }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x05eb }
        r0 = r15.k;	 Catch:{ Exception -> 0x05eb }
        r0 = r0.h;	 Catch:{ Exception -> 0x05eb }
        r8 = r0.iterator();	 Catch:{ Exception -> 0x05eb }
        r2 = r5;
    L_0x04d3:
        r0 = r8.hasNext();	 Catch:{ Exception -> 0x05eb }
        if (r0 == 0) goto L_0x061e;
    L_0x04d9:
        r0 = r8.next();	 Catch:{ Exception -> 0x05eb }
        r0 = (defpackage.k) r0;	 Catch:{ Exception -> 0x05eb }
        r1 = com.whatsapp.App.P;	 Catch:{ Exception -> 0x05eb }
        r4 = r0.d;	 Catch:{ Exception -> 0x05eb }
        r9 = r1.c(r4);	 Catch:{ Exception -> 0x05eb }
        r1 = r9.size();	 Catch:{ Exception -> 0x05eb }
        if (r1 <= 0) goto L_0x05a2;
    L_0x04ed:
        r10 = r9.iterator();	 Catch:{ Exception -> 0x05eb }
        r4 = r5;
    L_0x04f2:
        r1 = r10.hasNext();	 Catch:{ Exception -> 0x05eb }
        if (r1 == 0) goto L_0x061b;
    L_0x04f8:
        r1 = r10.next();	 Catch:{ Exception -> 0x05eb }
        r1 = (com.whatsapp.m8) r1;	 Catch:{ Exception -> 0x05eb }
        r11 = r1.e;	 Catch:{ Exception -> 0x05eb }
        if (r11 == 0) goto L_0x04f2;
    L_0x0502:
        r11 = r1.h;	 Catch:{ Exception -> 0x05e9 }
        if (r11 == 0) goto L_0x0508;
    L_0x0506:
        if (r6 == 0) goto L_0x04f2;
    L_0x0508:
        r11 = r1.e;	 Catch:{ Exception -> 0x05eb }
        r12 = 64;
        r11 = r11.indexOf(r12);	 Catch:{ Exception -> 0x05eb }
        r12 = -1;
        if (r11 != r12) goto L_0x0531;
    L_0x0513:
        r12 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x060b }
        r12.<init>();	 Catch:{ Exception -> 0x060b }
        r13 = z;	 Catch:{ Exception -> 0x060b }
        r14 = 80;
        r13 = r13[r14];	 Catch:{ Exception -> 0x060b }
        r12 = r12.append(r13);	 Catch:{ Exception -> 0x060b }
        r13 = r1.e;	 Catch:{ Exception -> 0x060b }
        r12 = r12.append(r13);	 Catch:{ Exception -> 0x060b }
        r12 = r12.toString();	 Catch:{ Exception -> 0x060b }
        com.whatsapp.util.Log.w(r12);	 Catch:{ Exception -> 0x060b }
        if (r6 == 0) goto L_0x04f2;
    L_0x0531:
        r12 = r1.e;	 Catch:{ Exception -> 0x05eb }
        r13 = 0;
        r11 = r12.substring(r13, r11);	 Catch:{ Exception -> 0x05eb }
        r12 = r0.d;	 Catch:{ Exception -> 0x060d }
        r11 = android.telephony.PhoneNumberUtils.compare(r12, r11);	 Catch:{ Exception -> 0x060d }
        if (r11 != 0) goto L_0x055e;
    L_0x0540:
        r11 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x060d }
        r11.<init>();	 Catch:{ Exception -> 0x060d }
        r12 = z;	 Catch:{ Exception -> 0x060d }
        r13 = 47;
        r12 = r12[r13];	 Catch:{ Exception -> 0x060d }
        r11 = r11.append(r12);	 Catch:{ Exception -> 0x060d }
        r12 = r1.e;	 Catch:{ Exception -> 0x060d }
        r11 = r11.append(r12);	 Catch:{ Exception -> 0x060d }
        r11 = r11.toString();	 Catch:{ Exception -> 0x060d }
        com.whatsapp.util.Log.w(r11);	 Catch:{ Exception -> 0x060d }
        if (r6 == 0) goto L_0x04f2;
    L_0x055e:
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x05eb }
        r4.<init>();	 Catch:{ Exception -> 0x05eb }
        r11 = z;	 Catch:{ Exception -> 0x05eb }
        r12 = 63;
        r11 = r11[r12];	 Catch:{ Exception -> 0x05eb }
        r4 = r4.append(r11);	 Catch:{ Exception -> 0x05eb }
        r4 = r4.append(r1);	 Catch:{ Exception -> 0x05eb }
        r4 = r4.toString();	 Catch:{ Exception -> 0x05eb }
        com.whatsapp.util.Log.i(r4);	 Catch:{ Exception -> 0x05eb }
        r4 = new com.whatsapp.g9;	 Catch:{ Exception -> 0x05eb }
        r12 = java.lang.Long.parseLong(r7);	 Catch:{ Exception -> 0x05eb }
        r11 = r0.d;	 Catch:{ Exception -> 0x05eb }
        r4.<init>(r12, r11);	 Catch:{ Exception -> 0x05eb }
        r1.h = r4;	 Catch:{ Exception -> 0x05eb }
        r4 = r15.k;	 Catch:{ Exception -> 0x05eb }
        r4 = r4.a();	 Catch:{ Exception -> 0x05eb }
        r1.N = r4;	 Catch:{ Exception -> 0x05eb }
        r4 = 1;
        r1.q = r4;	 Catch:{ Exception -> 0x05eb }
        if (r6 == 0) goto L_0x0618;
    L_0x0592:
        r0 = r3;
    L_0x0593:
        if (r0 == 0) goto L_0x05a0;
    L_0x0595:
        r0 = com.whatsapp.App.P;	 Catch:{ Exception -> 0x060f }
        r0.b(r9);	 Catch:{ Exception -> 0x060f }
        r0 = com.whatsapp.App.aH;	 Catch:{ Exception -> 0x060f }
        r1 = 1;
        r0.sendEmptyMessage(r1);	 Catch:{ Exception -> 0x060f }
    L_0x05a0:
        if (r6 == 0) goto L_0x0616;
    L_0x05a2:
        r0 = r3;
    L_0x05a3:
        if (r6 == 0) goto L_0x0613;
    L_0x05a5:
        if (r0 == 0) goto L_0x05b8;
    L_0x05a7:
        r0 = z;	 Catch:{ Exception -> 0x0611 }
        r1 = 22;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0611 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0611 }
        r0 = new com.whatsapp.a4;	 Catch:{ Exception -> 0x0611 }
        r0.<init>(r15);	 Catch:{ Exception -> 0x0611 }
        com.whatsapp.util.br.a(r0);	 Catch:{ Exception -> 0x0611 }
    L_0x05b8:
        r0 = 2131624136; // 0x7f0e00c8 float:1.8875443E38 double:1.0531622554E-314;
        r1 = new java.lang.Object[r3];
        r2 = r15.k;
        r2 = r2.a();
        r1[r5] = r2;
        r0 = r15.getString(r0, r1);
        r15.f(r0);
        return;
    L_0x05cd:
        r0 = move-exception;
        throw r0;
    L_0x05cf:
        r0 = move-exception;
        throw r0;
    L_0x05d1:
        r0 = move-exception;
        throw r0;
    L_0x05d3:
        r0 = move-exception;
        throw r0;
    L_0x05d5:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x05d7 }
    L_0x05d7:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x05d9 }
    L_0x05d9:
        r0 = move-exception;
        throw r0;
    L_0x05db:
        r0 = move-exception;
        throw r0;
    L_0x05dd:
        r0 = move-exception;
        throw r0;
    L_0x05df:
        r1 = r0.d;
        goto L_0x02c0;
    L_0x05e3:
        r0 = move-exception;
        throw r0;
    L_0x05e5:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x05e7 }
    L_0x05e7:
        r0 = move-exception;
        throw r0;
    L_0x05e9:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x05eb }
    L_0x05eb:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r4 = 49;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x05b8;
    L_0x060b:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x05eb }
    L_0x060d:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x05eb }
    L_0x060f:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x05eb }
    L_0x0611:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x05eb }
    L_0x0613:
        r2 = r0;
        goto L_0x04d3;
    L_0x0616:
        r0 = r2;
        goto L_0x05a3;
    L_0x0618:
        r4 = r3;
        goto L_0x04f2;
    L_0x061b:
        r0 = r4;
        goto L_0x0593;
    L_0x061e:
        r0 = r2;
        goto L_0x05a5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ViewSharedContactActivity.a():void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case PBE.MD5 /*0*/:
                    d();
                    return true;
                case ay.f /*1*/:
                    b();
                    return true;
                case 16908332:
                    finish();
                    return true;
                default:
                    return false;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static boolean b(ViewSharedContactActivity viewSharedContactActivity) {
        return viewSharedContactActivity.q;
    }

    private RelativeLayout a(m mVar, int i) {
        RelativeLayout relativeLayout = (RelativeLayout) b7.a((LayoutInflater) getSystemService(z[9]), R.layout.view_shared_contact_row, null, true);
        try {
            relativeLayout.setTag(mVar.d);
            relativeLayout.setClickable(true);
            relativeLayout.setFocusable(true);
            relativeLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.selector_orange_gradient));
            if (this.q) {
                relativeLayout.findViewById(R.id.cbx).setVisibility(0);
            }
            try {
                ((TextView) relativeLayout.findViewById(R.id.view_contact_info_title_tv)).setText(getResources().getString(R.string.view) + " " + (mVar.e == 0 ? mVar.f : a(StructuredPostal.class, mVar.e)) + " " + getResources().getString(R.string.address));
                TextView textView = (TextView) relativeLayout.findViewById(R.id.view_contact_info_body_tv);
                try {
                    textView.setWidth(300);
                    textView.setMaxLines(3);
                    if (mVar.b != null) {
                        textView.setText(mVar.b.c());
                    }
                    ((ImageView) relativeLayout.findViewById(R.id.view_contact_info_btn)).setBackgroundResource(i);
                    return relativeLayout;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    private RelativeLayout a(String str, String str2, int i, String str3) {
        RelativeLayout relativeLayout = (RelativeLayout) b7.a((LayoutInflater) getSystemService(z[2]), R.layout.view_shared_contact_row, null, true);
        try {
            relativeLayout.setTag(str3);
            relativeLayout.setClickable(true);
            relativeLayout.setFocusable(true);
            relativeLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.selector_orange_gradient));
            if (this.q) {
                relativeLayout.findViewById(R.id.cbx).setVisibility(0);
            }
            ((TextView) relativeLayout.findViewById(R.id.view_contact_info_title_tv)).setText(str);
            TextView textView = (TextView) relativeLayout.findViewById(R.id.view_contact_info_body_tv);
            try {
                textView.setWidth(300);
                textView.setMaxLines(2);
                if (!str2.equalsIgnoreCase(z[3])) {
                    textView.setText(str2);
                }
                ((ImageView) relativeLayout.findViewById(R.id.view_contact_info_btn)).setBackgroundResource(i);
                return relativeLayout;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.widget.RelativeLayout a(defpackage.j r9) {
        /*
        r8_this = this;
        r1 = 0;
        r4 = 1;
        r3 = com.whatsapp.App.az;
        r0 = z;
        r0 = r0[r1];
        r0 = r8.getSystemService(r0);
        r0 = (android.view.LayoutInflater) r0;
        r1 = 2130903215; // 0x7f0300af float:1.7413242E38 double:1.052806073E-314;
        r2 = 0;
        r0 = com.whatsapp.b7.a(r0, r1, r2, r4);
        r0 = (android.widget.RelativeLayout) r0;
        r1 = new com.whatsapp.wi;	 Catch:{ IllegalArgumentException -> 0x00e0 }
        r1.<init>(r8, r9);	 Catch:{ IllegalArgumentException -> 0x00e0 }
        r0.setOnClickListener(r1);	 Catch:{ IllegalArgumentException -> 0x00e0 }
        r1 = r9.d;	 Catch:{ IllegalArgumentException -> 0x00e0 }
        r0.setTag(r1);	 Catch:{ IllegalArgumentException -> 0x00e0 }
        r1 = 1;
        r0.setClickable(r1);	 Catch:{ IllegalArgumentException -> 0x00e0 }
        r1 = 1;
        r0.setFocusable(r1);	 Catch:{ IllegalArgumentException -> 0x00e0 }
        r1 = r8.getResources();	 Catch:{ IllegalArgumentException -> 0x00e0 }
        r2 = 2130839096; // 0x7f020638 float:1.7283193E38 double:1.052774394E-314;
        r1 = r1.getDrawable(r2);	 Catch:{ IllegalArgumentException -> 0x00e0 }
        r0.setBackgroundDrawable(r1);	 Catch:{ IllegalArgumentException -> 0x00e0 }
        r1 = r8.q;	 Catch:{ IllegalArgumentException -> 0x00e0 }
        if (r1 == 0) goto L_0x004a;
    L_0x003f:
        r1 = 2131428040; // 0x7f0b02c8 float:1.8477713E38 double:1.053065371E-314;
        r1 = r0.findViewById(r1);	 Catch:{ IllegalArgumentException -> 0x00e0 }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x00e0 }
    L_0x004a:
        r1 = 2131428041; // 0x7f0b02c9 float:1.8477715E38 double:1.0530653716E-314;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = defpackage.o.m;	 Catch:{ IllegalArgumentException -> 0x00e2 }
        r4 = r9.e;	 Catch:{ IllegalArgumentException -> 0x00e2 }
        r2 = r2.containsKey(r4);	 Catch:{ IllegalArgumentException -> 0x00e2 }
        if (r2 == 0) goto L_0x0077;
    L_0x005d:
        r2 = 2131624076; // 0x7f0e008c float:1.8875321E38 double:1.053162226E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r5 = 0;
        r6 = defpackage.o.i;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r7 = r9.e;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r6 = r6.get(r7);	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r4[r5] = r6;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r2 = r8.getString(r2, r4);	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x00e4 }
        if (r3 == 0) goto L_0x00bc;
    L_0x0077:
        r2 = r9.e;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r2 = r2.equals(r4);	 Catch:{ IllegalArgumentException -> 0x00e4 }
        if (r2 == 0) goto L_0x00af;
    L_0x0084:
        r2 = r9.g;
        r2 = r2.toArray();
        if (r2 == 0) goto L_0x009f;
    L_0x008c:
        r2 = r2.length;	 Catch:{ IllegalArgumentException -> 0x00e6 }
        if (r2 <= 0) goto L_0x009f;
    L_0x008f:
        r2 = r9.g;	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r2 = r2.toArray();	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r4 = 0;
        r2 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r2 = (java.lang.String) r2;	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x00e8 }
        if (r3 == 0) goto L_0x00ad;
    L_0x009f:
        r2 = r8.getResources();	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r4 = 2131625082; // 0x7f0e047a float:1.8877362E38 double:1.053162723E-314;
        r2 = r2.getString(r4);	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x00e8 }
    L_0x00ad:
        if (r3 == 0) goto L_0x00bc;
    L_0x00af:
        r2 = defpackage.o.i;	 Catch:{ IllegalArgumentException -> 0x00ea }
        r3 = r9.e;	 Catch:{ IllegalArgumentException -> 0x00ea }
        r2 = r2.get(r3);	 Catch:{ IllegalArgumentException -> 0x00ea }
        r2 = (java.lang.CharSequence) r2;	 Catch:{ IllegalArgumentException -> 0x00ea }
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x00ea }
    L_0x00bc:
        r1 = 2131428043; // 0x7f0b02cb float:1.847772E38 double:1.0530653726E-314;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r1.setWidth(r2);
        r2 = 2;
        r1.setMaxLines(r2);
        r2 = r9.d;
        r1.setText(r2);
        r1 = 2131428042; // 0x7f0b02ca float:1.8477717E38 double:1.053065372E-314;
        r1 = r0.findViewById(r1);
        r2 = 8;
        r1.setVisibility(r2);
        return r0;
    L_0x00e0:
        r0 = move-exception;
        throw r0;
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;
    L_0x00e6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e8 }
    L_0x00e8:
        r0 = move-exception;
        throw r0;
    L_0x00ea:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ViewSharedContactActivity.a(j):android.widget.RelativeLayout");
    }

    private void a(View view) {
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.cbx);
        try {
            if (checkBox.isChecked()) {
                checkBox.setChecked(false);
                try {
                    if (App.az == 0) {
                        return;
                    }
                }
            }
            checkBox.setChecked(true);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void onResume() {
        super.onResume();
    }
}
