package com.whatsapp.messaging;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.backport.util.Base64;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Messenger;
import android.telephony.TelephonyManager;
import com.whatsapp.App;
import com.whatsapp.App.Me;
import com.whatsapp.ChangeNumber;
import com.whatsapp.Voip;
import com.whatsapp.a12;
import com.whatsapp.a54;
import com.whatsapp.a8g;
import com.whatsapp.lh;
import com.whatsapp.mh;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.c8;
import com.whatsapp.protocol.c_;
import com.whatsapp.protocol.cf;
import com.whatsapp.protocol.ck;
import com.whatsapp.protocol.cw;
import com.whatsapp.protocol.f;
import com.whatsapp.protocol.g;
import com.whatsapp.protocol.j;
import com.whatsapp.protocol.n;
import com.whatsapp.protocol.q;
import com.whatsapp.protocol.s;
import com.whatsapp.util.Log;
import com.whatsapp.util.a0;
import com.whatsapp.util.by;
import com.whatsapp.vk;
import com.whatsapp.yl;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.Socket;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class ak extends HandlerThread {
    private static final String[] z;
    private k a;
    private boolean b;
    private ag c;
    private final Handler d;
    private final ck e;
    private k f;
    private final Random g;
    private Messenger h;
    private boolean i;
    private an j;
    private af k;
    private final Messenger l;
    private k m;
    private Socket n;
    private a3 o;
    private final String p;
    private boolean q;
    private m r;
    private final Context s;
    private j t;

    static {
        String[] strArr = new String[69];
        String str = "\u0002\u007f\u0014C\u0004";
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
                        i3 = 47;
                        break;
                    case ay.f /*1*/:
                        i3 = 15;
                        break;
                    case ay.n /*2*/:
                        i3 = 125;
                        break;
                    case ay.p /*3*/:
                        i3 = 45;
                        break;
                    default:
                        i3 = 99;
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
                    str = "Nc\u001c_\u000e";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "L`\u0010\u0003\u0014Gn\t^\u0002_\u007f";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "L`\u0010\u0003\u0014Gn\t^\u0002_\u007fSL\u000fN}\u0010\u0003 cF8c7p_4c$p[4`&`Z)";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000\u007f\u0014C\u0004[f\u0010H\fZ{RL\u000f]j\u001cI\u001ap|\u0018Y";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000c\u0012J\nA \tD\u000eJ`\bY";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "na\u0019_\fFkP\u001fM\u001e>S\u0018S\u001a";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\\j\u000f[\nLj\u000e\r^\u00121]";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "l`\u0013C\u0006L{\u0014B\r{g\u000fH\u0002K";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "@}\u001a\u0003\u0002_n\u001eE\u0006\u0001g\u001c_\u000e@a\u0004\u0003\u0010Jl\b_\n[vSK\f]{\u000fH\u0010\\!.H\u0011Yf\u001eH\u0010";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "Za\u0018U\u0013Jl\tH\u0007\u000fj\u0005N\u0006_{\u0014B\r\u000fx\u0015D\u000fJ/\u001cY\u0017Jb\rY\nAh]Y\f\u000fk\b@\u0013\u000f|\u0018_\u0015Fl\u0018^";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "L`\u0013C\u0006L{\u0014B\rp{\u0015_\u0006NkRA\fHh\u0018I<Ic\u001cJL^z\u0014Y";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "bKH";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\\j\u000f[\nLj\u000e\r\u0000Cn\u000e^CA`\t\r\u0005@z\u0013I";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    str = "Ln\u0013\r\r@{]_\u0016A/\nD\u0017G`\bYCBkH";
                    obj = 14;
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    strArr2 = strArr3;
                    str = "If\u0018A\u0007\u000fa\u0012YCI`\bC\u0007";
                    obj = 15;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "L`\u0013C\u0006L{\u0014B\rp{\u0015_\u0006NkRA\fHh\u0018I<Ic\u001cJLL`\u0013C\u0006L{\u0018I";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\\j\u000f[\nLj\u000e";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "L`\u0013C\u0006L{\u0014B\rp{\u0015_\u0006NkRA\fHh\u0018I<Ic\u001cJLKf\u000eN\fAa\u0018N\u0017Fa\u001a";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000c\u0012J\fZ{RY\nBj\u0012X\u0017\u0000l\u0011B\u0010J\"\u000eB\u0000Dj\t";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000c\u0012J\fZ{RY\nBj\u0012X\u0017\u0000|\u0016D\u0013\u0002y\u0012D\u0013\u0002n\u001eY\nYj";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "_f\u0013JC[f\u0010H\fZ{";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000\u007f\u0014C\u0004[f\u0010H\fZ{RH\u001b_f\u000fH\u0007";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000\u007f\u0014C\u0004[f\u0010H\fZ{RH\u001b_f\u000fH\u0007\u0000f\u001aC\f]j";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "|J3iC";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "_g\u0012C\u0006";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "}J>{C";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000|\u0018C\u0007Lg\u001cC\u0004Ja\b@\u0001J}";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "L`\u0010\u0003\u0014Gn\t^\u0002_\u007fSL\u000fN}\u0010\u0003 cF8c7p_4c$p[4`&`Z)";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "Nc\u001c_\u000e";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "L`\u0010\u0003\u0014Gn\t^\u0002_\u007f";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000c\u0012J\nA \u001bL\nCz\u000fHLAj\u0005Y<Lg\"I\u0002[nRN\fBb\u0014Y";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "Aj\u0005Y<Lg\"I\u0002[n";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "L`\u0010\u0003\u0014Gn\t^\u0002_\u007f\"]\u0011Ji\u0018_\u0006Al\u0018^";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000~\bD\u0017";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000i\u0012_\u0000Jk\"I\n\\l\u0012C\rJl\t\u0002\u0011Jn\u0019H\u0011p{\u0015_\u0006NkR@\u0002]d\"K\nAf\u000eE\u0006K";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000~\bD\u0017\u000fk\b_\nAh]K\f]l\u0018ICKf\u000eN\fAa\u0018N\u0017";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\\!\nE\u0002[|\u001c]\u0013\u0001a\u0018Y";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000|\u0012N\bJ{RN\u000f@|\u0018";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000l\u0011B\u0010J\\\u0012N\bJ{]";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "Aj\u0005Y<Lg\"I\u0002[n";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "L`\u0010\u0003\u0014Gn\t^\u0002_\u007f\"]\u0011Ji\u0018_\u0006Al\u0018^";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000|\u0012N\bJ{RN\fAa\u0018N\u0017Jk";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000|\u0012N\bJ{RN\u000f@|\u0018I";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000l\u0012C\rJl\t";
                    obj = 44;
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    strArr2 = strArr3;
                    str = "\u000fl\u0012I\u0006\u0015";
                    obj = 45;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000|\u0012N\bJ{RI\n\\l\u0012C\rJl\t\r";
                    obj = 46;
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    strArr2 = strArr3;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000l\u0012C\rJl\t\u0002\r@{PL\u000fC`\nH\u0007\u0000c\u0012J\nA\"\u001bL\nCj\u0019";
                    obj = 47;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000c\u0012J\nA \u001bL\nCz\u000fHC[v\rHY";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000l\u0012C\rJl\t\u0002\u0010Xf\tN\u000bJkPY\f\u0002n\u0011A\fXj\u0019";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "Mn\u0019\r\r@a\u001eHCFa]N\u000bNc\u0011H\rHj";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "A`]C\fAl\u0018\r\nA/\u001eE\u0002Cc\u0018C\u0004J";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000c\u0012J\nA \tD\u000eJ`\bYL\\{\u0012]";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000|\u0012N\bJ{RN\u000f@|\u0018I";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000l\u0012C\rJl\t\u0002\r@{PL\u000fC`\nH\u0007\u0000j\u0005]\n]j\u0019\u0000\r@\"\u001eE\u0002Ah\u0018\u0000\u0013Ja\u0019D\rH";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000|\u0012N\bJ{RN\u000f@|\u0018I";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000c\u0012J\nA \tD\u000eJ`\bYL\\{\u001c_\u0017";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000x\u000fD\u0017J \u001fA\fLd\u0011D\u0010[ \u001aH\u0017";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000l\u0012C\rJl\t\u0002\r@{PL\u000fC`\nH\u0007\u0000l\u0011B\u0000D";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000l\u0012C\rJl\t\u0002\fYj\u000f_\nKjPH\u001b_f\u000fH\u0007";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000x\u000fD\u0017J \u001eA\nJa\tr\u0000@a\u001bD\u0004\u0000h\u0018Y";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000c\u0012J\nA";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000|\u0012N\bJ{RN\u000f@|\u0018I";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000c\u0012J\nA \tD\u000eJ`\bYL\\{\u0012]";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000|\u0012N\bJ{RC\u0006W{P]\f]{RN\f]}\b]\u0017\u0002|\t_\u0006NbPH\u001bLj\rY\n@a]";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000c\u0012J\nA \u0019L\rHc\u0014C\u0004\u0002b\u000eJ\u0010\u0000\u007f\u001c^\u0010Fy\u0018\u0000\u000f@h\u0014C";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000l\u0012C\rJl\t\u0002\r@{PL\u000fC`\nH\u0007\u0000|\u0012K\u0017Xn\u000fHNJw\rD\u0011Jk";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "Wb\r]LL`\u0013C\u0006L{\u0014B\r\u0000n\tY\u0006B\u007f\t\u0002FK";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0002\u007f\u0014C\u0004";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void a(Messenger messenger) {
        this.h = messenger;
        d.a(this.l, new Messenger(new ba(this)));
    }

    private void b(String str, byte[] bArr, String str2, boolean z, boolean z2, List list, boolean z3) {
        a(str, bArr, str2, z, z2, list, z3);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l() {
        /*
        r2_this = this;
        r0 = z;	 Catch:{ RuntimeException -> 0x002b }
        r1 = 23;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x002b }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x002b }
        r0 = r2.q;	 Catch:{ RuntimeException -> 0x002b }
        if (r0 == 0) goto L_0x001e;
    L_0x000d:
        r0 = z;	 Catch:{ RuntimeException -> 0x002d }
        r1 = 22;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x002d }
        com.whatsapp.App.v(r0);	 Catch:{ RuntimeException -> 0x002d }
        r0 = 1;
        r2.a(r0);	 Catch:{ RuntimeException -> 0x002d }
        r0 = com.whatsapp.messaging.au.a;	 Catch:{ RuntimeException -> 0x002d }
        if (r0 == 0) goto L_0x0027;
    L_0x001e:
        r0 = z;	 Catch:{ RuntimeException -> 0x002d }
        r1 = 24;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x002d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x002d }
    L_0x0027:
        r0 = 0;
        r2.q = r0;
        return;
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ak.l():void");
    }

    static void b(ak akVar) {
        akVar.b();
    }

    static void i(ak akVar) {
        akVar.m();
    }

    private void b(Message message) {
        try {
            bz.a(this.h, Message.obtain(message));
            switch (message.arg1) {
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    this.i = true;
                    if (!au.a) {
                        return;
                    }
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    break;
                default:
                    return;
            }
            this.j.a(32000);
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    static void f(ak akVar) {
        akVar.c();
    }

    private boolean e() {
        return this.c.b();
    }

    static void b(ak akVar, Message message) {
        akVar.a(message);
    }

    private void a() {
        this.f.a(true);
        c(false);
    }

    private void f() {
        n();
        b(true);
    }

    private void o() {
        n();
        b(false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(boolean r5) {
        /*
        r4_this = this;
        r0 = r4.r;	 Catch:{ RuntimeException -> 0x0079 }
        r0.a();	 Catch:{ RuntimeException -> 0x0079 }
        r0 = r4.j;	 Catch:{ RuntimeException -> 0x0079 }
        r0.a();	 Catch:{ RuntimeException -> 0x0079 }
        r0 = r4.m;	 Catch:{ RuntimeException -> 0x0079 }
        r0 = r0.a();	 Catch:{ RuntimeException -> 0x0079 }
        if (r0 == 0) goto L_0x0078;
    L_0x0012:
        r0 = r4.a;	 Catch:{ RuntimeException -> 0x007b }
        r0 = r0.a();	 Catch:{ RuntimeException -> 0x007b }
        if (r0 != 0) goto L_0x0078;
    L_0x001a:
        if (r5 == 0) goto L_0x0062;
    L_0x001c:
        r0 = z;	 Catch:{ RuntimeException -> 0x007f }
        r1 = 36;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x007f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x007f }
        r0 = r4.k;	 Catch:{ RuntimeException -> 0x007f }
        if (r0 == 0) goto L_0x002e;
    L_0x0029:
        r0 = r4.k;	 Catch:{ RuntimeException -> 0x007f }
        r0.a();	 Catch:{ RuntimeException -> 0x007f }
    L_0x002e:
        r4.n();	 Catch:{ RuntimeException -> 0x0081 }
        r0 = r4.h;	 Catch:{ RuntimeException -> 0x0081 }
        com.whatsapp.messaging.bz.a(r0);	 Catch:{ RuntimeException -> 0x0081 }
        r0 = r4.l;	 Catch:{ RuntimeException -> 0x0081 }
        r1 = 1;
        com.whatsapp.messaging.d.a(r0, r1);	 Catch:{ RuntimeException -> 0x0081 }
        r0 = r4.m;	 Catch:{ RuntimeException -> 0x0081 }
        r1 = 0;
        r0.a(r1);	 Catch:{ RuntimeException -> 0x0081 }
        r4.b();	 Catch:{ RuntimeException -> 0x0081 }
        r0 = r4.f;	 Catch:{ RuntimeException -> 0x0081 }
        r0 = r0.a();	 Catch:{ RuntimeException -> 0x0081 }
        if (r0 == 0) goto L_0x0078;
    L_0x004d:
        r0 = z;	 Catch:{ RuntimeException -> 0x0083 }
        r1 = 37;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0083 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x0083 }
        r0 = r4.o;	 Catch:{ RuntimeException -> 0x0083 }
        r0.quit();	 Catch:{ RuntimeException -> 0x0083 }
        r4.quit();	 Catch:{ RuntimeException -> 0x0083 }
        r0 = com.whatsapp.messaging.au.a;	 Catch:{ RuntimeException -> 0x0083 }
        if (r0 == 0) goto L_0x0078;
    L_0x0062:
        r0 = r4.c;	 Catch:{ RuntimeException -> 0x0083 }
        r2 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r0.a(r2);	 Catch:{ RuntimeException -> 0x0083 }
        r0 = r4.h;	 Catch:{ RuntimeException -> 0x0083 }
        r1 = com.whatsapp.messaging.au.g();	 Catch:{ RuntimeException -> 0x0083 }
        com.whatsapp.messaging.bz.a(r0, r1);	 Catch:{ RuntimeException -> 0x0083 }
        r0 = r4.a;	 Catch:{ RuntimeException -> 0x0083 }
        r1 = 1;
        r0.a(r1);	 Catch:{ RuntimeException -> 0x0083 }
    L_0x0078:
        return;
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        throw r0;
    L_0x0081:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ak.c(boolean):void");
    }

    private void j() {
        Log.i(z[28]);
        Me aq = App.aq();
        bz.a(this.h, au.a(aq.jabber_id, a54.g(App.k(aq.jabber_id)), ChangeNumber.B, ChangeNumber.C));
    }

    static void c(ak akVar) {
        akVar.f();
    }

    private void a(byte[] bArr) {
        String str;
        SharedPreferences sharedPreferences = this.s.getSharedPreferences(z[34], 0);
        if (bArr == null) {
            str = null;
        } else {
            str = Base64.encodeToString(bArr, 2);
        }
        Editor edit = sharedPreferences.edit();
        try {
            edit.putString(z[33], str);
            if (!edit.commit()) {
                Log.e(z[32]);
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private void a(b bVar) {
        this.r.a(bVar, 45000);
    }

    static void g(ak akVar) {
        akVar.a();
    }

    private void p() {
        g();
        bz.a(this.h, au.m());
    }

    static void h(ak akVar) {
        akVar.h();
    }

    private void b() {
        PendingIntent broadcast = PendingIntent.getBroadcast(App.p, 0, new Intent(z[29]).setPackage(z[31]), 536870912);
        if (broadcast != null) {
            ((AlarmManager) App.p.getSystemService(z[30])).cancel(broadcast);
            broadcast.cancel();
        }
        this.q = false;
    }

    static void a(ak akVar) {
        akVar.p();
    }

    private void h() {
        try {
            if (Voip.f()) {
                Log.i(z[21]);
                this.c.a(10000);
                p();
                try {
                    if (!au.a) {
                        return;
                    }
                }
            }
            Log.i(z[20]);
            n();
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    static void d(ak akVar) {
        akVar.k();
    }

    static boolean j(ak akVar) {
        return akVar.e();
    }

    static void a(ak akVar, Messenger messenger) {
        akVar.a(messenger);
    }

    private byte[] d() {
        String string = this.s.getSharedPreferences(z[42], 0).getString(z[41], null);
        return string == null ? null : Base64.decode(string, 0);
    }

    void i() {
        Log.e(z[6]);
        n();
    }

    private void a(boolean z) {
        c(z);
    }

    private void c() {
        try {
            bz.a(this.h, au.i());
            if (ChangeNumber.g()) {
                j();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static void a(ak akVar, boolean z) {
        akVar.a(z);
    }

    static void a(ak akVar, String str, byte[] bArr, String str2, boolean z, boolean z2, List list, boolean z3) {
        akVar.b(str, bArr, str2, z, z2, list, z3);
    }

    private void m() {
        l();
    }

    static void a(ak akVar, Message message) {
        akVar.b(message);
    }

    static void a(ak akVar, b bVar) {
        akVar.a(bVar);
    }

    private void a(j jVar) {
        try {
            if (jVar == this.t) {
                c(true);
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static void a(ak akVar, j jVar) {
        akVar.a(jVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(boolean r3) {
        /*
        r2_this = this;
        r0 = r2.m;	 Catch:{ RuntimeException -> 0x004b }
        r1 = 0;
        r0.a(r1);	 Catch:{ RuntimeException -> 0x004b }
        r0 = r2.a;	 Catch:{ RuntimeException -> 0x004b }
        r1 = 0;
        r0.a(r1);	 Catch:{ RuntimeException -> 0x004b }
        r0 = r2.f;	 Catch:{ RuntimeException -> 0x004b }
        r0 = r0.a();	 Catch:{ RuntimeException -> 0x004b }
        if (r0 != 0) goto L_0x002c;
    L_0x0014:
        r0 = r2.c;	 Catch:{ RuntimeException -> 0x004b }
        r0.a();	 Catch:{ RuntimeException -> 0x004b }
        r0 = r2.h;	 Catch:{ RuntimeException -> 0x004b }
        com.whatsapp.messaging.bz.a(r0);	 Catch:{ RuntimeException -> 0x004b }
        r0 = r2.q;	 Catch:{ RuntimeException -> 0x004b }
        if (r0 == 0) goto L_0x0023;
    L_0x0022:
        r3 = 1;
    L_0x0023:
        r0 = r2.l;	 Catch:{ RuntimeException -> 0x004d }
        com.whatsapp.messaging.d.a(r0, r3);	 Catch:{ RuntimeException -> 0x004d }
        r0 = com.whatsapp.messaging.au.a;	 Catch:{ RuntimeException -> 0x004d }
        if (r0 == 0) goto L_0x003d;
    L_0x002c:
        r0 = z;	 Catch:{ RuntimeException -> 0x004d }
        r1 = 35;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x004d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x004d }
        r0 = r2.o;	 Catch:{ RuntimeException -> 0x004d }
        r0.quit();	 Catch:{ RuntimeException -> 0x004d }
        r2.quit();	 Catch:{ RuntimeException -> 0x004d }
    L_0x003d:
        r2.b();
        r0 = r2.r;
        r0.a();
        r0 = r2.j;
        r0.a();
        return;
    L_0x004b:
        r0 = move-exception;
        throw r0;
    L_0x004d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ak.b(boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r19, byte[] r20, java.lang.String r21, boolean r22, boolean r23, java.util.List r24, boolean r25) {
        /*
        r18_this = this;
        r8 = com.whatsapp.messaging.au.a;
        if (r25 == 0) goto L_0x0012;
    L_0x0004:
        r4 = z;	 Catch:{ IOException -> 0x001d }
        r5 = 60;
        r4 = r4[r5];	 Catch:{ IOException -> 0x001d }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x001d }
        r4 = 0;
        r0 = r18;
        r0.b = r4;	 Catch:{ IOException -> 0x001d }
    L_0x0012:
        r0 = r18;
        r4 = r0.m;	 Catch:{ IOException -> 0x001f }
        r4 = r4.a();	 Catch:{ IOException -> 0x001f }
        if (r4 == 0) goto L_0x0021;
    L_0x001c:
        return;
    L_0x001d:
        r4 = move-exception;
        throw r4;
    L_0x001f:
        r4 = move-exception;
        throw r4;
    L_0x0021:
        r4 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x003a }
        r4 = r4.x();	 Catch:{ IOException -> 0x003a }
        if (r4 == 0) goto L_0x003c;
    L_0x0029:
        r4 = z;	 Catch:{ IOException -> 0x003a }
        r5 = 59;
        r4 = r4[r5];	 Catch:{ IOException -> 0x003a }
        com.whatsapp.util.Log.w(r4);	 Catch:{ IOException -> 0x003a }
        r0 = r18;
        r4 = r0.l;	 Catch:{ IOException -> 0x003a }
        com.whatsapp.messaging.d.a(r4);	 Catch:{ IOException -> 0x003a }
        goto L_0x001c;
    L_0x003a:
        r4 = move-exception;
        throw r4;
    L_0x003c:
        r4 = com.whatsapp.App.al();	 Catch:{ IOException -> 0x004c }
        if (r4 == 0) goto L_0x004e;
    L_0x0042:
        r4 = z;	 Catch:{ IOException -> 0x004c }
        r5 = 48;
        r4 = r4[r5];	 Catch:{ IOException -> 0x004c }
        com.whatsapp.util.Log.w(r4);	 Catch:{ IOException -> 0x004c }
        goto L_0x001c;
    L_0x004c:
        r4 = move-exception;
        throw r4;
    L_0x004e:
        r4 = com.whatsapp.App.ax();	 Catch:{ IOException -> 0x0065 }
        if (r4 == 0) goto L_0x0067;
    L_0x0054:
        r4 = z;	 Catch:{ IOException -> 0x0065 }
        r5 = 67;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0065 }
        com.whatsapp.util.Log.w(r4);	 Catch:{ IOException -> 0x0065 }
        r0 = r18;
        r4 = r0.l;	 Catch:{ IOException -> 0x0065 }
        com.whatsapp.messaging.d.d(r4);	 Catch:{ IOException -> 0x0065 }
        goto L_0x001c;
    L_0x0065:
        r4 = move-exception;
        throw r4;
    L_0x0067:
        r0 = r18;
        r4 = r0.b;	 Catch:{ IOException -> 0x00a4 }
        if (r4 == 0) goto L_0x00be;
    L_0x006d:
        r0 = r18;
        r4 = r0.t;	 Catch:{ IOException -> 0x00a4 }
        r4 = r4.q;	 Catch:{ IOException -> 0x00a4 }
        r5 = 1;
        if (r4 != r5) goto L_0x00a8;
    L_0x0076:
        r4 = 1;
    L_0x0077:
        r0 = r18;
        r0.b = r4;	 Catch:{ IOException -> 0x00aa }
        r0 = r18;
        r4 = r0.b;	 Catch:{ IOException -> 0x00aa }
        if (r4 == 0) goto L_0x00b5;
    L_0x0081:
        r0 = r18;
        r4 = r0.i;	 Catch:{ IOException -> 0x00aa }
        if (r4 != 0) goto L_0x00ae;
    L_0x0087:
        r4 = com.whatsapp.App.k;	 Catch:{ IOException -> 0x00ac }
        r4 = r4.f();	 Catch:{ IOException -> 0x00ac }
        if (r4 != 0) goto L_0x00ae;
    L_0x008f:
        r4 = z;	 Catch:{ IOException -> 0x00a2 }
        r5 = 55;
        r4 = r4[r5];	 Catch:{ IOException -> 0x00a2 }
        com.whatsapp.util.Log.w(r4);	 Catch:{ IOException -> 0x00a2 }
        r0 = r18;
        r4 = r0.l;	 Catch:{ IOException -> 0x00a2 }
        r5 = 0;
        com.whatsapp.messaging.d.a(r4, r5);	 Catch:{ IOException -> 0x00a2 }
        goto L_0x001c;
    L_0x00a2:
        r4 = move-exception;
        throw r4;
    L_0x00a4:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x00a6 }
    L_0x00a6:
        r4 = move-exception;
        throw r4;
    L_0x00a8:
        r4 = 0;
        goto L_0x0077;
    L_0x00aa:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x00ac }
    L_0x00ac:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x00a2 }
    L_0x00ae:
        r4 = 0;
        r0 = r18;
        r0.i = r4;	 Catch:{ IOException -> 0x0338 }
        if (r8 == 0) goto L_0x00be;
    L_0x00b5:
        r4 = z;	 Catch:{ IOException -> 0x0338 }
        r5 = 50;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0338 }
        com.whatsapp.util.Log.w(r4);	 Catch:{ IOException -> 0x0338 }
    L_0x00be:
        r4 = z;	 Catch:{ IOException -> 0x033a }
        r5 = 45;
        r4 = r4[r5];	 Catch:{ IOException -> 0x033a }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x033a }
        r0 = r18;
        r4 = r0.l;	 Catch:{ IOException -> 0x033a }
        com.whatsapp.messaging.d.b(r4);	 Catch:{ IOException -> 0x033a }
        r0 = r18;
        r4 = r0.n;	 Catch:{ IOException -> 0x033a }
        if (r4 == 0) goto L_0x00e1;
    L_0x00d4:
        r0 = r18;
        r4 = r0.n;	 Catch:{ IOException -> 0x033a }
        r4 = r4.isClosed();	 Catch:{ IOException -> 0x033a }
        if (r4 != 0) goto L_0x00e1;
    L_0x00de:
        r18.n();	 Catch:{ IOException -> 0x033c }
    L_0x00e1:
        r5 = 1;
        r10 = java.lang.System.currentTimeMillis();
        r9 = new com.whatsapp.messaging.as;	 Catch:{ c3 -> 0x05aa }
        r0 = r18;
        r4 = r0.s;	 Catch:{ c3 -> 0x05aa }
        r4 = com.whatsapp.messaging.bp.b(r4);	 Catch:{ c3 -> 0x05aa }
        r0 = r18;
        r6 = r0.g;	 Catch:{ c3 -> 0x05aa }
        r0 = r21;
        r1 = r24;
        r9.<init>(r4, r0, r1, r6);	 Catch:{ c3 -> 0x05aa }
    L_0x00fb:
        r4 = r9.c();	 Catch:{ c3 -> 0x05aa }
        if (r4 == 0) goto L_0x02e5;
    L_0x0101:
        r0 = r18;
        r4 = r0.m;	 Catch:{ c3 -> 0x05aa }
        r4 = r4.a();	 Catch:{ c3 -> 0x05aa }
        if (r4 != 0) goto L_0x02e5;
    L_0x010b:
        r4 = z;	 Catch:{ c3 -> 0x05aa }
        r6 = 68;
        r4 = r4[r6];	 Catch:{ c3 -> 0x05aa }
        r6 = 0;
        r7 = 1;
        r7 = new java.lang.Object[r7];	 Catch:{ c3 -> 0x05aa }
        r12 = 0;
        r13 = java.lang.Integer.valueOf(r5);	 Catch:{ c3 -> 0x05aa }
        r7[r12] = r13;	 Catch:{ c3 -> 0x05aa }
        com.whatsapp.util.Log.a(r4, r6, r7);	 Catch:{ c3 -> 0x05aa }
        r7 = r5 + 1;
        r6 = 0;
        r4 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r4 = r9.a(r4);	 Catch:{ IOException -> 0x05b5, l -> 0x05b1, all -> 0x05ad }
        r0 = r18;
        r0.n = r4;	 Catch:{ IOException -> 0x05b5, l -> 0x05b1, all -> 0x05ad }
        r0 = r18;
        r4 = r0.n;	 Catch:{ IOException -> 0x05b5, l -> 0x05b1, all -> 0x05ad }
        r5 = 1020000; // 0xf9060 float:1.429324E-39 double:5.03947E-318;
        r4.setSoTimeout(r5);	 Catch:{ IOException -> 0x05b5, l -> 0x05b1, all -> 0x05ad }
        r4 = z;	 Catch:{ IOException -> 0x05b5, l -> 0x05b1, all -> 0x05ad }
        r5 = 43;
        r4 = r4[r5];	 Catch:{ IOException -> 0x05b5, l -> 0x05b1, all -> 0x05ad }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x05b5, l -> 0x05b1, all -> 0x05ad }
        r5 = new com.whatsapp.messaging.af;	 Catch:{ IOException -> 0x05b5, l -> 0x05b1, all -> 0x05ad }
        r0 = r18;
        r5.<init>(r0);	 Catch:{ IOException -> 0x05b5, l -> 0x05b1, all -> 0x05ad }
        r4 = new com.whatsapp.messaging.ae;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r6 = new android.os.Messenger;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r6.<init>(r5);	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r4.<init>(r6);	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r6 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r0 = r18;
        r6 = r0.a(r6, r9);	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r0.a(r1, r2, r6, r4);	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r12 = z;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r13 = 62;
        r12 = r12[r13];	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        com.whatsapp.util.Log.i(r12);	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r12 = z;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r13 = 57;
        r12 = r12[r13];	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        com.whatsapp.util.Log.i(r12);	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r0 = r18;
        r12 = r0.d;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r13 = 0;
        r14 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r12.sendEmptyMessageDelayed(r13, r14);	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r12 = com.whatsapp.App.aJ;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r12 = r12.h();	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        if (r23 == 0) goto L_0x0196;
    L_0x0185:
        r13 = r12.size();	 Catch:{ IOException -> 0x033e }
        if (r13 != 0) goto L_0x0196;
    L_0x018b:
        r0 = r18;
        r13 = r0.t;	 Catch:{ IOException -> 0x0340 }
        r0 = r22;
        r13.b(r0);	 Catch:{ IOException -> 0x0340 }
        if (r8 == 0) goto L_0x01aa;
    L_0x0196:
        if (r23 == 0) goto L_0x01a1;
    L_0x0198:
        r13 = z;	 Catch:{ IOException -> 0x0344 }
        r14 = 66;
        r13 = r13[r14];	 Catch:{ IOException -> 0x0344 }
        com.whatsapp.util.Log.i(r13);	 Catch:{ IOException -> 0x0344 }
    L_0x01a1:
        r0 = r18;
        r13 = r0.t;	 Catch:{ all -> 0x0346 }
        r0 = r22;
        r13.g(r0);	 Catch:{ all -> 0x0346 }
    L_0x01aa:
        r6 = r6.l;	 Catch:{ all -> 0x0346 }
        r0 = r18;
        r0.a(r6);	 Catch:{ all -> 0x0346 }
        r6 = z;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r13 = 53;
        r6 = r6[r13];	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r0 = r18;
        r6 = r0.d;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r13 = 0;
        r6.removeMessages(r13);	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r6 = com.whatsapp.App.u();	 Catch:{ IOException -> 0x045c, l -> 0x045e }
        if (r6 == 0) goto L_0x01d8;
    L_0x01c8:
        r6 = z;	 Catch:{ IOException -> 0x045c, l -> 0x045e }
        r13 = 58;
        r6 = r6[r13];	 Catch:{ IOException -> 0x045c, l -> 0x045e }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IOException -> 0x045c, l -> 0x045e }
        r0 = r18;
        r6 = r0.t;	 Catch:{ IOException -> 0x045c, l -> 0x045e }
        r6.k();	 Catch:{ IOException -> 0x045c, l -> 0x045e }
    L_0x01d8:
        r6 = z;	 Catch:{ IOException -> 0x0513, l -> 0x045e }
        r13 = 61;
        r6 = r6[r13];	 Catch:{ IOException -> 0x0513, l -> 0x045e }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IOException -> 0x0513, l -> 0x045e }
        r0 = r18;
        r6 = r0.t;	 Catch:{ IOException -> 0x0513, l -> 0x045e }
        r6.n();	 Catch:{ IOException -> 0x0513, l -> 0x045e }
        r0 = r18;
        r6 = r0.t;	 Catch:{ IOException -> 0x0513, l -> 0x045e }
        r6 = r6.g();	 Catch:{ IOException -> 0x0513, l -> 0x045e }
        if (r6 == 0) goto L_0x0209;
    L_0x01f2:
        r0 = r18;
        r6 = r0.t;	 Catch:{ IOException -> 0x0513, l -> 0x045e }
        r6 = r6.g();	 Catch:{ IOException -> 0x0513, l -> 0x045e }
        r6 = r6.intValue();	 Catch:{ IOException -> 0x0513, l -> 0x045e }
        r13 = com.whatsapp.ge.d;	 Catch:{ IOException -> 0x0513, l -> 0x045e }
        if (r6 == r13) goto L_0x0209;
    L_0x0202:
        r0 = r18;
        r6 = r0.t;	 Catch:{ IOException -> 0x0515, l -> 0x045e }
        r6.i();	 Catch:{ IOException -> 0x0515, l -> 0x045e }
    L_0x0209:
        r6 = new com.whatsapp.messaging.w;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r0 = r18;
        r13 = r0.t;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r6.<init>(r13, r4);	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r6.start();	 Catch:{ IOException -> 0x054f, l -> 0x045e }
        r0 = r18;
        r4 = r0.m;	 Catch:{ IOException -> 0x054f, l -> 0x045e }
        r6 = 1;
        r4.a(r6);	 Catch:{ IOException -> 0x054f, l -> 0x045e }
        r9.d();	 Catch:{ IOException -> 0x054f, l -> 0x045e }
        r0 = r18;
        r0.k = r5;	 Catch:{ IOException -> 0x054f, l -> 0x045e }
        if (r23 == 0) goto L_0x024c;
    L_0x0226:
        r4 = r12.size();	 Catch:{ IOException -> 0x054f, l -> 0x045e }
        if (r4 <= 0) goto L_0x024c;
    L_0x022c:
        r0 = r18;
        r4 = r0.h;	 Catch:{ IOException -> 0x0551, l -> 0x045e }
        r6 = com.whatsapp.messaging.au.a(r12);	 Catch:{ IOException -> 0x0551, l -> 0x045e }
        com.whatsapp.messaging.bz.a(r4, r6);	 Catch:{ IOException -> 0x0551, l -> 0x045e }
        r0 = r18;
        r4 = r0.h;	 Catch:{ IOException -> 0x0551, l -> 0x045e }
        r6 = 1;
        r6 = com.whatsapp.messaging.au.c(r6);	 Catch:{ IOException -> 0x0551, l -> 0x045e }
        com.whatsapp.messaging.bz.a(r4, r6);	 Catch:{ IOException -> 0x0551, l -> 0x045e }
        r0 = r18;
        r4 = r0.j;	 Catch:{ IOException -> 0x0551, l -> 0x045e }
        r12 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        r4.a(r12);	 Catch:{ IOException -> 0x0551, l -> 0x045e }
    L_0x024c:
        r4 = com.whatsapp.bd.a();	 Catch:{ IOException -> 0x0553, l -> 0x045e }
        if (r4 == 0) goto L_0x0261;
    L_0x0252:
        r4 = com.whatsapp.App.S;	 Catch:{ IOException -> 0x0553, l -> 0x045e }
        if (r4 == 0) goto L_0x0261;
    L_0x0256:
        r0 = r18;
        r4 = r0.h;	 Catch:{ IOException -> 0x0555, l -> 0x045e }
        r6 = com.whatsapp.messaging.au.c();	 Catch:{ IOException -> 0x0555, l -> 0x045e }
        com.whatsapp.messaging.bz.a(r4, r6);	 Catch:{ IOException -> 0x0555, l -> 0x045e }
    L_0x0261:
        r4 = com.whatsapp.ChangeNumber.g();	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        if (r4 == 0) goto L_0x026c;
    L_0x0267:
        if (r22 == 0) goto L_0x026c;
    L_0x0269:
        r18.j();	 Catch:{ IOException -> 0x0557, l -> 0x045e }
    L_0x026c:
        if (r4 != 0) goto L_0x055d;
    L_0x026e:
        r0 = r18;
        r4 = r0.t;	 Catch:{ IOException -> 0x0559, l -> 0x045e }
        r4 = r4.q;	 Catch:{ IOException -> 0x0559, l -> 0x045e }
        r6 = 1;
        if (r4 != r6) goto L_0x055d;
    L_0x0277:
        r4 = 1;
    L_0x0278:
        r0 = r18;
        r0.b = r4;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r0 = r18;
        r4 = r0.l;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r0 = r18;
        r6 = r0.t;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r6 = r6.I;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r0 = r18;
        r12 = r0.t;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r12 = r12.m;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r6 = com.whatsapp.messaging.au.a(r6, r12);	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        com.whatsapp.messaging.d.a(r4, r6);	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r0 = r18;
        r4 = r0.t;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r12 = r4.a;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r14 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r12 = r12 * r14;
        r0 = r18;
        r4 = r0.t;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r14 = r4.j;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r16 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r14 = r14 * r16;
        com.whatsapp.App.a(r12, r14);	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r18.b();	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r0 = r18;
        r4 = r0.m;	 Catch:{ c3 -> 0x03d4, all -> 0x04b7 }
        r4 = r4.a();	 Catch:{ c3 -> 0x03d4, all -> 0x04b7 }
        if (r4 != 0) goto L_0x02e2;
    L_0x02b6:
        r9.f();	 Catch:{ IOException -> 0x0560 }
        r0 = r18;
        r4 = r0.n;	 Catch:{ IOException -> 0x0560 }
        if (r4 == 0) goto L_0x02ce;
    L_0x02bf:
        r0 = r18;
        r4 = r0.n;	 Catch:{ IOException -> 0x0560 }
        r4 = r4.isClosed();	 Catch:{ IOException -> 0x0560 }
        if (r4 != 0) goto L_0x02ce;
    L_0x02c9:
        r18.n();	 Catch:{ IOException -> 0x0562 }
        if (r8 == 0) goto L_0x02dd;
    L_0x02ce:
        r0 = r18;
        r4 = r0.n;	 Catch:{ IOException -> 0x0564 }
        if (r4 == 0) goto L_0x02dd;
    L_0x02d4:
        r4 = z;	 Catch:{ IOException -> 0x0566 }
        r6 = 56;
        r4 = r4[r6];	 Catch:{ IOException -> 0x0566 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x0566 }
    L_0x02dd:
        if (r5 == 0) goto L_0x02e2;
    L_0x02df:
        r5.a();	 Catch:{ IOException -> 0x0568 }
    L_0x02e2:
        if (r8 == 0) goto L_0x05b9;
    L_0x02e4:
        r5 = r7;
    L_0x02e5:
        r4 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x058a }
        r0 = r18;
        r6 = r0.m;	 Catch:{ IOException -> 0x058a }
        r6 = r6.a();	 Catch:{ IOException -> 0x058a }
        r5 = r5 + -1;
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x058a }
        r8 = r8 - r10;
        com.whatsapp.ak4.a(r4, r6, r5, r8);	 Catch:{ IOException -> 0x058a }
        r0 = r18;
        r4 = r0.m;	 Catch:{ IOException -> 0x058a }
        r4 = r4.a();	 Catch:{ IOException -> 0x058a }
        if (r4 == 0) goto L_0x058e;
    L_0x0303:
        r0 = r18;
        r4 = r0.l;	 Catch:{ IOException -> 0x058a }
        com.whatsapp.messaging.d.c(r4);	 Catch:{ IOException -> 0x058a }
        r0 = r18;
        r4 = r0.h;	 Catch:{ IOException -> 0x058a }
        r0 = r18;
        r5 = r0.t;	 Catch:{ IOException -> 0x058a }
        com.whatsapp.messaging.bz.a(r4, r5);	 Catch:{ IOException -> 0x058a }
        r4 = com.whatsapp.App.S;	 Catch:{ IOException -> 0x058a }
        if (r4 == 0) goto L_0x001c;
    L_0x0319:
        r4 = com.whatsapp.a54.s();	 Catch:{ IOException -> 0x058c }
        if (r4 == 0) goto L_0x001c;
    L_0x031f:
        r4 = com.whatsapp.a54.j();
        r5 = com.whatsapp.a54.b(r4);
        if (r5 == 0) goto L_0x001c;
    L_0x0329:
        r0 = r18;
        r6 = r0.h;	 Catch:{ IOException -> 0x0336 }
        r4 = com.whatsapp.messaging.au.b(r5, r4);	 Catch:{ IOException -> 0x0336 }
        com.whatsapp.messaging.bz.a(r6, r4);	 Catch:{ IOException -> 0x0336 }
        goto L_0x001c;
    L_0x0336:
        r4 = move-exception;
        throw r4;
    L_0x0338:
        r4 = move-exception;
        throw r4;
    L_0x033a:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x033c }
    L_0x033c:
        r4 = move-exception;
        throw r4;
    L_0x033e:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0340 }
    L_0x0340:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0342 }
    L_0x0342:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0344 }
    L_0x0344:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0346 }
    L_0x0346:
        r4 = move-exception;
        r6 = z;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r12 = 64;
        r6 = r6[r12];	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r0 = r18;
        r6 = r0.d;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        r12 = 0;
        r6.removeMessages(r12);	 Catch:{ IOException -> 0x0359, l -> 0x045e }
        throw r4;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
    L_0x0359:
        r4 = move-exception;
    L_0x035a:
        r6 = r4.getMessage();	 Catch:{ all -> 0x0517 }
        r12 = z;	 Catch:{ IOException -> 0x056a }
        r13 = 51;
        r12 = r12[r13];	 Catch:{ IOException -> 0x056a }
        r12 = r12.equals(r6);	 Catch:{ IOException -> 0x056a }
        if (r12 != 0) goto L_0x0376;
    L_0x036a:
        r12 = z;	 Catch:{ IOException -> 0x056a }
        r13 = 52;
        r12 = r12[r13];	 Catch:{ IOException -> 0x056a }
        r6 = r12.equals(r6);	 Catch:{ IOException -> 0x056a }
        if (r6 == 0) goto L_0x037c;
    L_0x0376:
        r6 = 0;
        r0 = r18;
        r0.a(r6);	 Catch:{ IOException -> 0x056c }
    L_0x037c:
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0517 }
        r6.<init>();	 Catch:{ all -> 0x0517 }
        r12 = z;	 Catch:{ all -> 0x0517 }
        r13 = 47;
        r12 = r12[r13];	 Catch:{ all -> 0x0517 }
        r6 = r6.append(r12);	 Catch:{ all -> 0x0517 }
        r4 = r4.toString();	 Catch:{ all -> 0x0517 }
        r4 = r6.append(r4);	 Catch:{ all -> 0x0517 }
        r4 = r4.toString();	 Catch:{ all -> 0x0517 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ all -> 0x0517 }
        r0 = r18;
        r4 = r0.m;	 Catch:{ c3 -> 0x03d4, all -> 0x04b7 }
        r4 = r4.a();	 Catch:{ c3 -> 0x03d4, all -> 0x04b7 }
        if (r4 != 0) goto L_0x02e2;
    L_0x03a4:
        r9.f();	 Catch:{ IOException -> 0x056e }
        r0 = r18;
        r4 = r0.n;	 Catch:{ IOException -> 0x056e }
        if (r4 == 0) goto L_0x03bc;
    L_0x03ad:
        r0 = r18;
        r4 = r0.n;	 Catch:{ IOException -> 0x056e }
        r4 = r4.isClosed();	 Catch:{ IOException -> 0x056e }
        if (r4 != 0) goto L_0x03bc;
    L_0x03b7:
        r18.n();	 Catch:{ IOException -> 0x0570 }
        if (r8 == 0) goto L_0x03cb;
    L_0x03bc:
        r0 = r18;
        r4 = r0.n;	 Catch:{ IOException -> 0x0572 }
        if (r4 == 0) goto L_0x03cb;
    L_0x03c2:
        r4 = z;	 Catch:{ IOException -> 0x0574 }
        r6 = 44;
        r4 = r4[r6];	 Catch:{ IOException -> 0x0574 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x0574 }
    L_0x03cb:
        if (r5 == 0) goto L_0x02e2;
    L_0x03cd:
        r5.a();	 Catch:{ IOException -> 0x03d2 }
        goto L_0x02e2;
    L_0x03d2:
        r4 = move-exception;
        throw r4;	 Catch:{ c3 -> 0x03d4, all -> 0x04b7 }
    L_0x03d4:
        r4 = move-exception;
        r5 = r7;
    L_0x03d6:
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x05a6 }
        r6.<init>();	 Catch:{ all -> 0x05a6 }
        r7 = z;	 Catch:{ all -> 0x05a6 }
        r9 = 49;
        r7 = r7[r9];	 Catch:{ all -> 0x05a6 }
        r6 = r6.append(r7);	 Catch:{ all -> 0x05a6 }
        r7 = r4.b;	 Catch:{ all -> 0x05a6 }
        r6 = r6.append(r7);	 Catch:{ all -> 0x05a6 }
        r7 = z;	 Catch:{ all -> 0x05a6 }
        r9 = 46;
        r7 = r7[r9];	 Catch:{ all -> 0x05a6 }
        r6 = r6.append(r7);	 Catch:{ all -> 0x05a6 }
        r7 = r4.g;	 Catch:{ all -> 0x05a6 }
        r6 = r6.append(r7);	 Catch:{ all -> 0x05a6 }
        r6 = r6.toString();	 Catch:{ all -> 0x05a6 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ all -> 0x05a6 }
        r0 = r18;
        r6 = r0.l;	 Catch:{ all -> 0x05a6 }
        com.whatsapp.messaging.d.a(r6, r4);	 Catch:{ all -> 0x05a6 }
        r4 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x059a }
        r0 = r18;
        r6 = r0.m;	 Catch:{ IOException -> 0x059a }
        r6 = r6.a();	 Catch:{ IOException -> 0x059a }
        r5 = r5 + -1;
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x059a }
        r8 = r8 - r10;
        com.whatsapp.ak4.a(r4, r6, r5, r8);	 Catch:{ IOException -> 0x059a }
        r0 = r18;
        r4 = r0.m;	 Catch:{ IOException -> 0x059a }
        r4 = r4.a();	 Catch:{ IOException -> 0x059a }
        if (r4 == 0) goto L_0x001c;
    L_0x0427:
        r0 = r18;
        r4 = r0.l;	 Catch:{ IOException -> 0x059a }
        com.whatsapp.messaging.d.c(r4);	 Catch:{ IOException -> 0x059a }
        r0 = r18;
        r4 = r0.h;	 Catch:{ IOException -> 0x059a }
        r0 = r18;
        r5 = r0.t;	 Catch:{ IOException -> 0x059a }
        com.whatsapp.messaging.bz.a(r4, r5);	 Catch:{ IOException -> 0x059a }
        r4 = com.whatsapp.App.S;	 Catch:{ IOException -> 0x059a }
        if (r4 == 0) goto L_0x001c;
    L_0x043d:
        r4 = com.whatsapp.a54.s();	 Catch:{ IOException -> 0x059c }
        if (r4 == 0) goto L_0x001c;
    L_0x0443:
        r4 = com.whatsapp.a54.j();
        r5 = com.whatsapp.a54.b(r4);
        if (r5 == 0) goto L_0x001c;
    L_0x044d:
        r0 = r18;
        r6 = r0.h;	 Catch:{ IOException -> 0x045a }
        r4 = com.whatsapp.messaging.au.b(r5, r4);	 Catch:{ IOException -> 0x045a }
        com.whatsapp.messaging.bz.a(r6, r4);	 Catch:{ IOException -> 0x045a }
        goto L_0x001c;
    L_0x045a:
        r4 = move-exception;
        throw r4;
    L_0x045c:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
    L_0x045e:
        r4 = move-exception;
    L_0x045f:
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0517 }
        r6.<init>();	 Catch:{ all -> 0x0517 }
        r12 = z;	 Catch:{ all -> 0x0517 }
        r13 = 65;
        r12 = r12[r13];	 Catch:{ all -> 0x0517 }
        r6 = r6.append(r12);	 Catch:{ all -> 0x0517 }
        r4 = r4.toString();	 Catch:{ all -> 0x0517 }
        r4 = r6.append(r4);	 Catch:{ all -> 0x0517 }
        r4 = r4.toString();	 Catch:{ all -> 0x0517 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ all -> 0x0517 }
        r0 = r18;
        r4 = r0.m;	 Catch:{ c3 -> 0x03d4, all -> 0x04b7 }
        r4 = r4.a();	 Catch:{ c3 -> 0x03d4, all -> 0x04b7 }
        if (r4 != 0) goto L_0x02e2;
    L_0x0487:
        r9.f();	 Catch:{ IOException -> 0x0576 }
        r0 = r18;
        r4 = r0.n;	 Catch:{ IOException -> 0x0576 }
        if (r4 == 0) goto L_0x049f;
    L_0x0490:
        r0 = r18;
        r4 = r0.n;	 Catch:{ IOException -> 0x0576 }
        r4 = r4.isClosed();	 Catch:{ IOException -> 0x0576 }
        if (r4 != 0) goto L_0x049f;
    L_0x049a:
        r18.n();	 Catch:{ IOException -> 0x0578 }
        if (r8 == 0) goto L_0x04ae;
    L_0x049f:
        r0 = r18;
        r4 = r0.n;	 Catch:{ IOException -> 0x057a }
        if (r4 == 0) goto L_0x04ae;
    L_0x04a5:
        r4 = z;	 Catch:{ IOException -> 0x057c }
        r6 = 63;
        r4 = r4[r6];	 Catch:{ IOException -> 0x057c }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x057c }
    L_0x04ae:
        if (r5 == 0) goto L_0x02e2;
    L_0x04b0:
        r5.a();	 Catch:{ IOException -> 0x04b5 }
        goto L_0x02e2;
    L_0x04b5:
        r4 = move-exception;
        throw r4;	 Catch:{ c3 -> 0x03d4, all -> 0x04b7 }
    L_0x04b7:
        r4 = move-exception;
    L_0x04b8:
        r5 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x059e }
        r0 = r18;
        r6 = r0.m;	 Catch:{ IOException -> 0x059e }
        r6 = r6.a();	 Catch:{ IOException -> 0x059e }
        r7 = r7 + -1;
        r12 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x059e }
        r10 = r12 - r10;
        com.whatsapp.ak4.a(r5, r6, r7, r10);	 Catch:{ IOException -> 0x059e }
        r0 = r18;
        r5 = r0.m;	 Catch:{ IOException -> 0x059e }
        r5 = r5.a();	 Catch:{ IOException -> 0x059e }
        if (r5 == 0) goto L_0x050a;
    L_0x04d7:
        r0 = r18;
        r5 = r0.l;	 Catch:{ IOException -> 0x05a0 }
        com.whatsapp.messaging.d.c(r5);	 Catch:{ IOException -> 0x05a0 }
        r0 = r18;
        r5 = r0.h;	 Catch:{ IOException -> 0x05a0 }
        r0 = r18;
        r6 = r0.t;	 Catch:{ IOException -> 0x05a0 }
        com.whatsapp.messaging.bz.a(r5, r6);	 Catch:{ IOException -> 0x05a0 }
        r5 = com.whatsapp.App.S;	 Catch:{ IOException -> 0x05a0 }
        if (r5 == 0) goto L_0x0512;
    L_0x04ed:
        r5 = com.whatsapp.a54.s();	 Catch:{ IOException -> 0x05a0 }
        if (r5 == 0) goto L_0x0512;
    L_0x04f3:
        r5 = com.whatsapp.a54.j();
        r6 = com.whatsapp.a54.b(r5);
        if (r6 == 0) goto L_0x0508;
    L_0x04fd:
        r0 = r18;
        r7 = r0.h;	 Catch:{ IOException -> 0x05a2 }
        r5 = com.whatsapp.messaging.au.b(r6, r5);	 Catch:{ IOException -> 0x05a2 }
        com.whatsapp.messaging.bz.a(r7, r5);	 Catch:{ IOException -> 0x05a2 }
    L_0x0508:
        if (r8 == 0) goto L_0x0512;
    L_0x050a:
        r0 = r18;
        r5 = r0.l;	 Catch:{ IOException -> 0x05a4 }
        r6 = 1;
        com.whatsapp.messaging.d.a(r5, r6);	 Catch:{ IOException -> 0x05a4 }
    L_0x0512:
        throw r4;
    L_0x0513:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0515, l -> 0x045e }
    L_0x0515:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
    L_0x0517:
        r4 = move-exception;
    L_0x0518:
        r0 = r18;
        r6 = r0.m;	 Catch:{ IOException -> 0x057e }
        r6 = r6.a();	 Catch:{ IOException -> 0x057e }
        if (r6 != 0) goto L_0x054e;
    L_0x0522:
        r9.f();	 Catch:{ IOException -> 0x057e }
        r0 = r18;
        r6 = r0.n;	 Catch:{ IOException -> 0x057e }
        if (r6 == 0) goto L_0x053a;
    L_0x052b:
        r0 = r18;
        r6 = r0.n;	 Catch:{ IOException -> 0x0580 }
        r6 = r6.isClosed();	 Catch:{ IOException -> 0x0580 }
        if (r6 != 0) goto L_0x053a;
    L_0x0535:
        r18.n();	 Catch:{ IOException -> 0x0582 }
        if (r8 == 0) goto L_0x0549;
    L_0x053a:
        r0 = r18;
        r6 = r0.n;	 Catch:{ IOException -> 0x0584 }
        if (r6 == 0) goto L_0x0549;
    L_0x0540:
        r6 = z;	 Catch:{ IOException -> 0x0586 }
        r9 = 54;
        r6 = r6[r9];	 Catch:{ IOException -> 0x0586 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IOException -> 0x0586 }
    L_0x0549:
        if (r5 == 0) goto L_0x054e;
    L_0x054b:
        r5.a();	 Catch:{ IOException -> 0x0588 }
    L_0x054e:
        throw r4;	 Catch:{ c3 -> 0x03d4, all -> 0x04b7 }
    L_0x054f:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0551, l -> 0x045e }
    L_0x0551:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
    L_0x0553:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0555, l -> 0x045e }
    L_0x0555:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
    L_0x0557:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
    L_0x0559:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x055b, l -> 0x045e }
    L_0x055b:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0359, l -> 0x045e }
    L_0x055d:
        r4 = 0;
        goto L_0x0278;
    L_0x0560:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0562 }
    L_0x0562:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0564 }
    L_0x0564:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0566 }
    L_0x0566:
        r4 = move-exception;
        throw r4;	 Catch:{ c3 -> 0x03d4, all -> 0x04b7 }
    L_0x0568:
        r4 = move-exception;
        throw r4;	 Catch:{ c3 -> 0x03d4, all -> 0x04b7 }
    L_0x056a:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x056c }
    L_0x056c:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0517 }
    L_0x056e:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0570 }
    L_0x0570:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0572 }
    L_0x0572:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0574 }
    L_0x0574:
        r4 = move-exception;
        throw r4;	 Catch:{ c3 -> 0x03d4, all -> 0x04b7 }
    L_0x0576:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0578 }
    L_0x0578:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x057a }
    L_0x057a:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x057c }
    L_0x057c:
        r4 = move-exception;
        throw r4;	 Catch:{ c3 -> 0x03d4, all -> 0x04b7 }
    L_0x057e:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0580 }
    L_0x0580:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0582 }
    L_0x0582:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0584 }
    L_0x0584:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0586 }
    L_0x0586:
        r4 = move-exception;
        throw r4;	 Catch:{ c3 -> 0x03d4, all -> 0x04b7 }
    L_0x0588:
        r4 = move-exception;
        throw r4;	 Catch:{ c3 -> 0x03d4, all -> 0x04b7 }
    L_0x058a:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x058c }
    L_0x058c:
        r4 = move-exception;
        throw r4;
    L_0x058e:
        r0 = r18;
        r4 = r0.l;	 Catch:{ IOException -> 0x0598 }
        r5 = 1;
        com.whatsapp.messaging.d.a(r4, r5);	 Catch:{ IOException -> 0x0598 }
        goto L_0x001c;
    L_0x0598:
        r4 = move-exception;
        throw r4;
    L_0x059a:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x059c }
    L_0x059c:
        r4 = move-exception;
        throw r4;
    L_0x059e:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x05a0 }
    L_0x05a0:
        r4 = move-exception;
        throw r4;
    L_0x05a2:
        r4 = move-exception;
        throw r4;
    L_0x05a4:
        r4 = move-exception;
        throw r4;
    L_0x05a6:
        r4 = move-exception;
        r7 = r5;
        goto L_0x04b8;
    L_0x05aa:
        r4 = move-exception;
        goto L_0x03d6;
    L_0x05ad:
        r4 = move-exception;
        r5 = r6;
        goto L_0x0518;
    L_0x05b1:
        r4 = move-exception;
        r5 = r6;
        goto L_0x045f;
    L_0x05b5:
        r4 = move-exception;
        r5 = r6;
        goto L_0x035a;
    L_0x05b9:
        r5 = r7;
        goto L_0x00fb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ak.a(java.lang.String, byte[], java.lang.String, boolean, boolean, java.util.List, boolean):void");
    }

    static void e(ak akVar) {
        akVar.o();
    }

    private void k() {
        bz.a(this.h, au.f());
    }

    private void a(String str, byte[] bArr, c_ c_Var, ae aeVar) {
        cf cfVar = c_Var;
        String str2 = str;
        byte[] bArr2 = bArr;
        ae aeVar2 = aeVar;
        ae aeVar3 = aeVar;
        ae aeVar4 = aeVar;
        ae aeVar5 = aeVar;
        this.t = new j(cfVar, z[38], this.p, str2, App.p(this.s), bArr2, aeVar2, App.Z, aeVar3, aeVar4, lh.b, aeVar5, new bg(this), new a8g());
        c_Var.a(this.t);
        this.t.g(a12.k);
        this.t.a(true);
        this.t.h(true);
        this.t.d(true);
        this.t.c(true);
    }

    private void n() {
        Log.i(z[39]);
        try {
            if (!this.n.isOutputShutdown()) {
                this.n.shutdownOutput();
            }
        } catch (Exception e) {
        }
        try {
            if (!this.n.isInputShutdown()) {
                this.n.shutdownInput();
            }
        } catch (Exception e2) {
        }
        try {
            if (!this.n.isClosed()) {
                this.n.close();
            }
        } catch (Exception e3) {
            Log.i(z[40] + e3.toString());
        }
    }

    public ak(Context context, Messenger messenger) {
        super(z[9]);
        this.d = new Handler(new b3(this));
        this.b = false;
        this.i = false;
        this.m = new k(3, z[17]);
        this.a = new k(3, z[19]);
        this.f = new k(3, z[12]);
        this.g = new Random();
        this.l = messenger;
        this.s = context;
        this.p = z[7];
        try {
            this.e = new ck(MessageDigest.getInstance(z[13]));
        } catch (Throwable e) {
            Throwable th = e;
            try {
                Field declaredField = Class.forName(z[10]).getDeclaredField(z[18]);
                declaredField.setAccessible(true);
                Log.w(z[8] + ((HashMap) declaredField.get(null)));
            } catch (Throwable e2) {
                Log.c(z[14], e2);
            } catch (Throwable e22) {
                Log.c(z[16], e22);
            } catch (Throwable e222) {
                Log.c(z[11], e222);
            }
            throw new RuntimeException(z[15], th);
        }
    }

    private c_ a(Context context, as asVar) {
        c8 qVar;
        cw gVar;
        OutputStream mhVar = new mh(asVar.a(this.n), 1);
        c8 nVar = new n(new yl(asVar.b(this.n), 1), f.b, f.a);
        if (App.aa >= 1) {
            qVar = new q(nVar, new by(), z[27]);
        } else {
            qVar = nVar;
        }
        cw sVar = new s(mhVar, f.b, f.a);
        if (App.aa >= 1) {
            gVar = new g(sVar, new by(), z[25]);
        } else {
            gVar = sVar;
        }
        c_ c_Var = new c_(qVar, gVar, this.e, d());
        c_Var.a(Build.DEVICE);
        c_Var.e(Build.MANUFACTURER);
        c_Var.b(Build.DISPLAY);
        c_Var.d(VERSION.RELEASE);
        if (((TelephonyManager) context.getSystemService(z[26])) != null) {
            a0 a = a0.a(App.a3.getNetworkOperator());
            c_Var.c(a.a());
            c_Var.f(a.b());
        }
        return c_Var;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.os.Message r11) {
        /*
        r10_this = this;
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.messaging.au.a;
        r0 = com.whatsapp.messaging.au.b(r11);
        switch(r0) {
            case 5: goto L_0x0064;
            case 8: goto L_0x004f;
            case 22: goto L_0x0033;
            case 23: goto L_0x0017;
            case 96: goto L_0x00a9;
            default: goto L_0x000d;
        };
    L_0x000d:
        r0 = r10.l;
        r1 = android.os.Message.obtain(r11);
        com.whatsapp.messaging.d.a(r0, r1);
    L_0x0016:
        return;
    L_0x0017:
        r0 = r11.obj;
        r0 = (com.whatsapp.messaging.ay) r0;
        if (r0 == 0) goto L_0x000d;
    L_0x001d:
        r4 = r0.a;	 Catch:{ RuntimeException -> 0x0097 }
        if (r4 == 0) goto L_0x000d;
    L_0x0021:
        r0 = r0.a;	 Catch:{ RuntimeException -> 0x0099 }
        r4 = r0.b;	 Catch:{ RuntimeException -> 0x0099 }
        r4 = r4 * r8;
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ RuntimeException -> 0x0099 }
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 >= 0) goto L_0x009b;
    L_0x002e:
        r0 = r1;
    L_0x002f:
        r10.b = r0;
        if (r3 == 0) goto L_0x000d;
    L_0x0033:
        r0 = r11.obj;
        r0 = (com.whatsapp.messaging.s) r0;
        if (r0 == 0) goto L_0x000d;
    L_0x0039:
        r4 = r0.b;	 Catch:{ RuntimeException -> 0x009d }
        if (r4 == 0) goto L_0x000d;
    L_0x003d:
        r0 = r0.b;	 Catch:{ RuntimeException -> 0x009f }
        r4 = r0.b;	 Catch:{ RuntimeException -> 0x009f }
        r4 = r4 * r8;
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ RuntimeException -> 0x009f }
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 >= 0) goto L_0x00a1;
    L_0x004a:
        r0 = r1;
    L_0x004b:
        r10.b = r0;
        if (r3 == 0) goto L_0x000d;
    L_0x004f:
        r0 = r11.obj;
        r0 = (java.lang.Long) r0;
        r4 = r0.longValue();	 Catch:{ RuntimeException -> 0x00a3 }
        r4 = r4 * r8;
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ RuntimeException -> 0x00a3 }
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 >= 0) goto L_0x00a5;
    L_0x0060:
        r10.b = r1;
        if (r3 == 0) goto L_0x000d;
    L_0x0064:
        r0 = r11.obj;
        r0 = (java.lang.String) r0;
        r1 = z;	 Catch:{ RuntimeException -> 0x00a7 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x00a7 }
        r1 = r0.indexOf(r1);	 Catch:{ RuntimeException -> 0x00a7 }
        if (r1 <= 0) goto L_0x008d;
    L_0x0073:
        r1 = 0;
        r2 = z;	 Catch:{ RuntimeException -> 0x00a7 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x00a7 }
        r2 = r0.indexOf(r2);	 Catch:{ RuntimeException -> 0x00a7 }
        r1 = r0.substring(r1, r2);	 Catch:{ RuntimeException -> 0x00a7 }
        r2 = java.lang.Long.parseLong(r1);	 Catch:{ RuntimeException -> 0x00a7 }
        r2 = r2 * r8;
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ RuntimeException -> 0x00a7 }
        com.whatsapp.App.a(r2, r4);	 Catch:{ RuntimeException -> 0x00a7 }
    L_0x008d:
        r1 = r10.h;
        r0 = com.whatsapp.messaging.au.b(r0);
        com.whatsapp.messaging.bz.a(r1, r0);
        goto L_0x0016;
    L_0x0097:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0099 }
    L_0x0099:
        r0 = move-exception;
        throw r0;
    L_0x009b:
        r0 = r2;
        goto L_0x002f;
    L_0x009d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x009f }
    L_0x009f:
        r0 = move-exception;
        throw r0;
    L_0x00a1:
        r0 = r2;
        goto L_0x004b;
    L_0x00a3:
        r0 = move-exception;
        throw r0;
    L_0x00a5:
        r1 = r2;
        goto L_0x0060;
    L_0x00a7:
        r0 = move-exception;
        throw r0;
    L_0x00a9:
        r0 = r10.j;
        r0.a();
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ak.a(android.os.Message):void");
    }

    protected void onLooperPrepared() {
        this.c = new ag(this, null);
        this.r = new m(this, null);
        this.j = new an(this, null);
        this.o = new a3(new Messenger(new ar(this)));
        this.o.start();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
        r8_this = this;
        r5 = 0;
        r4 = 2;
        r1 = com.whatsapp.messaging.au.a;
        r0 = new android.content.Intent;
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r0.<init>(r2);
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r0 = r0.setPackage(r2);
        r2 = com.whatsapp.App.p;
        r3 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r2 = android.app.PendingIntent.getBroadcast(r2, r5, r0, r3);
        if (r2 != 0) goto L_0x004e;
    L_0x0021:
        r2 = com.whatsapp.App.p;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = android.app.PendingIntent.getBroadcast(r2, r5, r0, r3);
        r0 = com.whatsapp.App.p;
        r3 = z;
        r3 = r3[r4];
        r0 = r0.getSystemService(r3);
        r0 = (android.app.AlarmManager) r0;
        r4 = android.os.SystemClock.elapsedRealtime();
        r6 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        r4 = r4 + r6;
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x005a }
        r6 = 19;
        if (r3 < r6) goto L_0x0048;
    L_0x0042:
        r3 = 2;
        r0.setExact(r3, r4, r2);	 Catch:{ RuntimeException -> 0x005c }
        if (r1 == 0) goto L_0x004c;
    L_0x0048:
        r3 = 2;
        r0.set(r3, r4, r2);	 Catch:{ RuntimeException -> 0x005c }
    L_0x004c:
        if (r1 == 0) goto L_0x0056;
    L_0x004e:
        r0 = z;	 Catch:{ RuntimeException -> 0x005e }
        r1 = 5;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x005e }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x005e }
    L_0x0056:
        r0 = 1;
        r8.q = r0;
        return;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x005c }
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ak.g():void");
    }
}
