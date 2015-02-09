package com.whatsapp;

import android.net.Uri;
import android.os.Bundle;
import android.os.Messenger;
import android.util.Pair;
import com.whatsapp.adm.ADMMessageHandler;
import com.whatsapp.c2dm.C2DMRegistrar;
import com.whatsapp.contact.d;
import com.whatsapp.contact.i;
import com.whatsapp.messaging.a2;
import com.whatsapp.messaging.s;
import com.whatsapp.protocol.bj;
import com.whatsapp.protocol.k;
import com.whatsapp.protocol.m;
import com.whatsapp.util.Log;
import com.whatsapp.util.br;
import de.greenrobot.event.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class jg implements a2 {
    private static final String[] z;
    private final App a;

    static {
        String[] strArr = new String[65];
        String str = "v\tU\u001c\u001c|\u0004L\t\u00075\rW\u000f\u0011gHW\u0018\re\u0007K\u000e\u001b/H";
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
                        i3 = 21;
                        break;
                    case ay.f /*1*/:
                        i3 = 104;
                        break;
                    case ay.n /*2*/:
                        i3 = 37;
                        break;
                    case ay.p /*3*/:
                        i3 = 125;
                        break;
                    default:
                        i3 = 126;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "e\u0001F\t\u000bg\r";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "e\u0001F\t\u000bg\r";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "t\u0006A\u000f\u0011|\f\u000b\u000f\u001bf\u0007P\u000f\u001dpR\nR\u001dz\u0005\u000b\n\u0016t\u001cV\u001c\u000eeG\u0017LM$X\u001cDH Z";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0013p\u001bV\u001c\u0019pGV\u0018\fc\rW\u0018\fg\u0007W\u001b\u0011g\u001cD\u000f\u0019p\u001c\n\u0010\u001bf\u001bD\u001a\u001bx\u0001V\u000e\u0017{\u000f";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0013p\u001bV\u001c\u0019pGV\u0018\fc\rW\u0018\fg\u0007W\u001b\u0011g\u001cD\u000f\u0019p\u001c\n\u001b\u0017y\rW\u0018\u000ey\tF\u0018\u001a5";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "5\u0018I\u001c\u0007p\fz\u0017\u0017qR";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "w\u001aJ\u001c\u001av\tV\t";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0013p\u001bV\u001c\u0019pGV\u0018\fc\rW\u0018\fg\u0007W\u001b\u0011g\u001cD\u000f\u0019p\u001c\n\u001b\u0017y\rH\u0014\rf\u0001K\u001a";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "5\u0005@\u0019\u0017tR";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "5\u0005@\u0019\u0017t7V\u0014\u0004pR\u0005";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0013p\u001bV\u001c\u0019pGV\u0018\fc\rW\u0018\fg\u0007W\u001b\u0011g\u001cD\u000f\u0019p\u001c\n\n\fz\u0006B\t\u0007e\r";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "5\u0007W\u0014\u0019|\u0006\u001f";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0013p\u001bV\u001c\u0019pGV\u0018\fc\rW\u0018\fg\u0007W\u001b\u0011g\u001cD\u000f\u0019p\u001c\n\u000e\u0015|\u0018W\u0018\u000be\u0004J\u001c\u001a5\u0006@\t\tz\u001aNG";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0013p\u001bV\u001c\u0019pGV\u0018\fc\rW\u0018\fg\u0007W\u001b\u0011g\u001cD\u000f\u0019p\u001c\n\u001f\u001fq\u0005@\u0019\u0017t\fD\t\u001f5";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0013p\u001bV\u001c\u0019pGV\u0018\fc\rW\u0018\fg\u0007W\u001b\u0011g\u001cD\u000f\u0019p\u001c\u0005";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "t\u0010J\u0011\u0011a\u0004\u0005\u001a\u0011aHD]\rp\u001aS\u0018\f5\u001a@\u0017\u001bv\u001c\u0005\u001b\u0011gHW\u0018\ng\u0011\u0005\u000f\u001bd\u001d@\u000e\n5";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "5\u0007W\u0014\u0019|\u0006D\u0011\u0012lHV\u0018\u0010aHD\t^";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "5\u000eJ\u000f^";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "5\u001fL\t\u00165";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0011s\u000eI\u0014\u0010p7F\u0012\u0013e\u0004@\t\u001b:\f@\u001b\u001bg\u001a@\u0019Se\tL\u0019Ss\u0007WP\u0018g\u0001@\u0013\u001afH";
                    obj = 20;
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    strArr2 = strArr3;
                    str = "t\u0018UR\u0011{\u000bM\u001c\u0010r\rK\b\u0013w\rW\u001c\u001dv\u0007P\u0013\n|\u0006C\u0012Qf\u0003L\r";
                    obj = 21;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0016t\u0006A\u0011\u001bJ\u001dK\u000e\u000bw\u001bF\u000f\u0017w\r";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0019p\u001c\b\u001e\u0015:\u000eL\u0011\u001b5\u0001V]\u0010`\u0004I";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0016t\u0006A\u0011\u001bJ\tS\u001c\u0017y\tG\u0011\u001b5";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0016t\u0006A\u0011\u001bJ\u001dK\u001c\bt\u0001I\u001c\u001cy\r\u0005";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "5\u0004D\u000e\n/";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "c\u0007L\r";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "v\tU\u001c\u001c|\u0004L\t\u00075\u0006J\t\u0017s\u0001F\u001c\n|\u0007KG^";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0013p\u001bV\u001c\u0019p\rW\u000f\u0011gGU\u0015\u001ff\u0000H\u0014\rx\tQ\u001e\u00165\u001dK\u001c\u001cy\r\u0005\t\u00115\u000bJ\u0010\u000e`\u001c@]\u0019g\u0007P\r^e\tW\t\u0017v\u0001U\u001c\u0010a\u001b\u0005\u001b\u0011gH";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0013p\u001bV\u001c\u0019p\rW\u000f\u0011gGG\u0012\u000b{\u000b@]\u000b{\tG\u0011\u001b5\u001cJ]\u0018|\u0006A]\u0013p\u001bV\u001c\u0019pH";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0013p\u001bV\u001c\u0019p\rW\u000f\u0011gGU\u0015\u001ff\u0000H\u0014\rx\tQ\u001e\u00165\u001dK\u001c\u001cy\r\u0005\t\u00115\u000eL\u0013\u001a5\u0005@\u000e\rt\u000f@]";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "5\tQ]\u000e}\tV\u0015^";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0013p\u001bV\u001c\u0019p\rW\u000f\u0011gGU\u0015\u001ff\u0000H\u0014\rx\tQ\u001e\u00165\u000eJ\b\u0010qHH\u001c\nv\u0000\u0005\u001b\u0011gHB\u000f\u0011`\u0018\u0005\r\u001fg\u001cL\u001e\u0017e\tK\t\r5\u000eJ\u000f^";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "5\tQ]\u000e}\tV\u0015^";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "r\u001aJ\b\u000ef";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    str = "}\tK\u0019\u0012p'K9\u0017g\u001c\\Q^v\tI\u0011^z\u0006v\u0018\u0010q/@\t9g\u0007P\r\r";
                    obj = 36;
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    strArr2 = strArr3;
                    str = "t\u0018UR\u0011{\fL\u000f\nlGU\u000f\u001bc\rK\tSq\n\b\u001c\u001dv\rV\u000eQf\u0003L\r";
                    obj = 37;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "v\tU\u001c\u001c|\u0004L\t\u00075\u001a@\u001c\u001a5\rW\u000f\u0011gR\u0005";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u001dy\u0001@\u0013\nV\u0007K\u001b\u0017r-W\u000f\u0011gG";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0013p\u001bV\u001c\u0019pGH\u000e\u0019f\u001cJ\u000f\u001b:\u001bQ\u001c\u001d~H";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "x\rV\u000e\u001fr\r\u0005\u000f\u001ba\u001a\\@J";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0013p\u001bV\u001c\u0019pH";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0013p\u001bV\u001c\u0019pGW\u0018\ng\u0011\nI^";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0013p\u001bV\u001c\u0019pGH\u000e\u0019f\u001cJ\u000f\u001b:\u0001KP\u000e|\u0018@";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "$]\u0010HN%X\u0014OO'(VS\t}\tQ\u000e\u001fe\u0018\u000b\u0013\u001ba";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0016t\u0006A\u0011\u001bJ\u0018W\u0012\u0018|\u0004@\"\u000e}\u0007Q\u0012!y\u0007V\tQ\u007f\u0001A]";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = ":\u000eD\u0014\u0012p\f";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "e\u0001F\t\u000bg\r";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "v\u0007K\t\u001fv\u001cV";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "5\u001fL\t\u00165";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "t\u0010J\u0011\u0011a\u0004\u0005\u001e\f|\u001cL\u001e\u001fy\u0001Q\u0004^p\u001e@\u0013\n/HV\u0018\u0010q";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "t\u0010J\u0011\u0011a\u0004\u0005\u000e\u0015|\u0018U\u0014\u0010rHW\u0018\ng\u0011\u0005\u001b\u0011gH";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "5\u000eJ\u000f^";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "5\u0007W\u0014\u0019|\u0006D\u0011\u0012lHV\u0018\u0010aHD\t^";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "t\u0010J\u0011\u0011a\u0004\u0005\u001a\u0011aHW\u0018\ng\u0011\u0005\u000f\u001bd\u001d@\u000e\n5";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "r\u000bH";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "t\fH";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "5\r]\r\u0017g\tQ\u0014\u0011{7A\u001c\npU";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "t\u0018UR\u0011{ED\u001e\u001dz\u001dK\tSv\u0000D\u0013\u0019pHQ\u0004\u000epU";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0011{\u0018R\u000e\u001baHO\u001c\u001cw\rWG";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "t\u0018UR\u0006x\u0018UR\fp\u000bSR\u0011{\u0018R\u000e\u001baH@\u000f\fz\u001a";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "e\tV\u000e\tz\u001aA";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "x\u001bB\"\u0017q";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "t\u0010J\u0011\u0011a\u0004\u0005\u001a\u0011aHD]\rp\u001aS\u0018\f5\u0018I\u001c\u0017{\u001c@\u0005\n5\u001a@\u001e\u001b|\u0018Q";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        a54.a(str, bArr, bArr2, bArr3, bArr4, null);
    }

    public void a(boolean z) {
        if (z) {
            App.aJ.F();
        }
    }

    public void d(String str, String str2) {
        Log.i(z[25] + str + ' ' + str2);
        m8 b = v.b(str);
        boolean a = App.aT.a(str);
        App.aT.e(str);
        App.aT.a(str, true);
        if (!a) {
            App.ab.removeMessages(2, App.e(b.e));
        }
        App.u(str);
    }

    public void a(String str, int i, int i2, long j) {
        i.a(this.a, str, i, i2, j);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r7, byte[] r8, java.lang.String r9, byte[] r10, byte[] r11, java.lang.Runnable r12) {
        /*
        r6_this = this;
        if (r9 == 0) goto L_0x0012;
    L_0x0002:
        if (r10 == 0) goto L_0x0012;
    L_0x0004:
        r0 = com.whatsapp.App.aJ;
        r1 = r7;
        r2 = r8;
        r3 = r9;
        r4 = r10;
        r5 = r11;
        r0.a(r1, r2, r3, r4, r5);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x001b;
    L_0x0012:
        r0 = z;
        r1 = 24;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
    L_0x001b:
        if (r12 == 0) goto L_0x0020;
    L_0x001d:
        r12.run();
    L_0x0020:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jg.a(int, byte[], java.lang.String, byte[], byte[], java.lang.Runnable):void");
    }

    public void a(Integer num, String[] strArr, String[] strArr2) {
        i.a(num, strArr, strArr2);
    }

    public void b(Bundle bundle) {
    }

    public void a(String str, String str2, long j, String str3) {
        App.b(new d0(this, str2, j, str3, str));
    }

    public void b(bj bjVar) {
        App.a(this.a, false, true, false);
        App.a(bjVar);
    }

    public void b(String str) {
        i.b(str);
    }

    public void c() {
        App.a0();
    }

    public void a(String str, int i) {
        App.a(str, i);
    }

    public void c(String str) {
        i.a(str);
    }

    public void a(a8o com_whatsapp_a8o) {
        if (com_whatsapp_a8o.b == -1) {
            App.l(com_whatsapp_a8o.c);
            if (App.az == 0) {
                return;
            }
        }
        App.b(new iw(this, App.P.a(com_whatsapp_a8o.c), com_whatsapp_a8o));
    }

    public void a(String str, String str2, long j) {
        Log.i(z[26] + str + ' ' + str2 + z[27] + j);
        v.b(str);
        String a = App.aT.a(str, j);
        if (a != null) {
            App.u(a);
        }
        App.u(str);
    }

    public void b() {
        if (!App.at.isEmpty()) {
            App.a(App.at.values());
        }
    }

    public void a(Hashtable hashtable) {
        br.a(new akt(this, hashtable));
    }

    public void a(Integer num, String[] strArr) {
        App.k.a(num, strArr);
    }

    public void a(Bundle bundle) {
        boolean z;
        boolean z2 = true;
        String string = bundle.getString(z[64]);
        byte[] byteArray = bundle.getByteArray(z[63]);
        if (App.an != null) {
            z = true;
        } else {
            z = false;
        }
        Log.b(z);
        if (App.an.jabber_id == null) {
            z2 = false;
        }
        Log.b(z2);
        Log.i(z[61] + App.an.jabber_id);
        if (a54.a(byteArray, App.an.jabber_id)) {
            App.a(App.an.jabber_id, byteArray);
            App.A(string);
            if (App.az == 0) {
                return;
            }
        }
        Log.e(z[62]);
    }

    public void b(String str, String str2, String str3) {
        App.a(str, str2, str3, false);
    }

    private void c(String str, int i) {
        m8 a = App.P.a(str);
        if (a == null) {
            return;
        }
        if (a.M != i || a.A != i) {
            if (i == -1) {
                App.l(str);
                if (App.az == 0) {
                    return;
                }
            }
            App.b(new yh(this, a, i));
        }
    }

    public void a(String str, int i, d[] dVarArr) {
        i.a(str, i, dVarArr);
    }

    public void c(int i) {
        App.aJ.l();
        if (App.c(App.aY()) != 0) {
            s3 a = s3.a();
            a.a(false);
            a5w.a(new a_l(this, a), new Void[0]);
        }
        if (App.O) {
            atf com_whatsapp_atf;
            if (App.aR.size() > 0) {
                com_whatsapp_atf = atf.GIFT_RECEIVED;
            } else {
                com_whatsapp_atf = App.M;
            }
            App.a(com_whatsapp_atf, App.aD, App.ar);
        }
        if (App.aM.size() > 0) {
            Log.i(z[21] + App.aM.size());
            ac.a(App.aM);
            App.aM.clear();
        }
        App.L = true;
    }

    public void a(String str, String str2, int i, long j) {
        a(atf.GIFT_RECEIVED, i, j, str, str2);
    }

    public void c(String str, String str2) {
        Log.i(z[23] + str + ' ' + str2);
        App.aT.a(v.b(str).e, false);
        App.u(str);
    }

    public void a(s sVar) {
        if (sVar.b != null) {
            a(atf.EXTENSION_REQUESTED, sVar.b.a, sVar.b.b, null, null);
        }
    }

    public void e(String str, String str2) {
        int i = App.az;
        if (z[57].equals(str)) {
            C2DMRegistrar.a(this.a, str2);
            if (i == 0) {
                return;
            }
        }
        if (z[58].equals(str)) {
            if (App.aW()) {
                new ADMMessageHandler(this.a).b(str2);
                if (i == 0) {
                    return;
                }
            }
            return;
        }
        if (str == null) {
            C2DMRegistrar.a(this.a, str2);
            if (App.aW()) {
                new ADMMessageHandler(this.a).b(str2);
            }
        }
    }

    public void b(int i, long j) {
        long e = ChangeNumber.e(this.a);
        if (e > 0) {
            ac.a(atf.WHATSAPP_INITIATED, e, true);
            ac.a(atf.WHATSAPP_INITIATED, 1000 * j, false);
            ChangeNumber.a(this.a);
            ac.c(i);
            ac.a(i);
            if (App.az == 0) {
                return;
            }
        }
        Log.i(z[22]);
    }

    public void c(Hashtable hashtable) {
        if (App.S) {
            if (hashtable.containsKey(z[36])) {
                Log.i(z[37]);
                synchronized (App.Z) {
                    bd.c = true;
                    if (!bd.e) {
                        br.a(new afc(this));
                    }
                }
                if (App.az == 0) {
                    return;
                }
            }
            return;
        }
        Log.i(z[38]);
    }

    public void b(int i) {
        Log.e(z[40] + i);
    }

    public void a(m mVar, String str, int i, long j) {
        int i2 = 5;
        if (i == 5 || i == 13 || i == 8) {
            if (i != 13 || App.E(mVar.c)) {
                i2 = i;
            }
            App.aJ.a(mVar, str, i2, j);
            this.a.a(mVar);
            if (App.az != 0) {
                i = i2;
            } else {
                return;
            }
        }
        App.aJ.b(mVar, i);
    }

    public void a(m mVar, byte[] bArr, int i, long j) {
        int a = aE.a(bArr);
        Log.i(z[17] + i + z[19] + mVar + z[20] + a + z[18] + j);
        this.a.c(new a_(this, i, mVar, j, a));
    }

    public void a(bj bjVar) {
        App.a(bjVar);
    }

    public void b(String str, String str2) {
        App.aT.a(str, str2);
        App.u(str);
    }

    public void a(long j, long j2) {
        if (j2 > j && j > 0 && j2 > 0) {
            App.aI.sendEmptyMessageDelayed(0, j2 - j);
            if (App.az == 0) {
                return;
            }
        }
        App.aI.sendEmptyMessage(0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, int r13) {
        /*
        r8_this = this;
        r2 = com.whatsapp.App.az;
        r0 = com.whatsapp.App.P;
        r0 = r0.a(r10);
        if (r11 == 0) goto L_0x0014;
    L_0x000a:
        r1 = com.whatsapp.App.af();
        r1 = r11.startsWith(r1);
        if (r1 != 0) goto L_0x0017;
    L_0x0014:
        r8.c(r10, r12);
    L_0x0017:
        r0 = r0.w();
        if (r0 == 0) goto L_0x0083;
    L_0x001d:
        if (r9 == 0) goto L_0x002c;
    L_0x001f:
        r0 = new com.whatsapp.protocol.b;
        r1 = new com.whatsapp.protocol.m;
        r3 = 1;
        r1.<init>(r10, r3, r9);
        r0.<init>(r1);
        if (r2 == 0) goto L_0x0091;
    L_0x002c:
        r1 = new com.whatsapp.protocol.b;
        r0 = 0;
        r0 = (byte[]) r0;
        r3 = 0;
        r1.<init>(r10, r0, r3);
    L_0x0035:
        r0 = -1;
        if (r12 != r0) goto L_0x008c;
    L_0x0038:
        r0 = 0;
    L_0x0039:
        r1.b(r0);
        r0 = 6;
        r1.a = r0;
        r4 = 6;
        r1.k = r4;
        r1.F = r11;
        r4 = (long) r13;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        r1.D = r4;
        r0 = com.whatsapp.App.aJ;
        r0 = r0.B(r10);
        if (r0 == 0) goto L_0x0072;
    L_0x0053:
        r3 = r0.a;
        r4 = 6;
        if (r3 != r4) goto L_0x0072;
    L_0x0058:
        r4 = r0.k;
        r6 = 6;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x0072;
    L_0x0060:
        r3 = r0.F;
        r3 = r11.equals(r3);
        if (r3 == 0) goto L_0x0072;
    L_0x0068:
        r3 = r1.e();
        r0 = r0.e();
        if (r3 == r0) goto L_0x0079;
    L_0x0072:
        r0 = com.whatsapp.App.aJ;
        r0.f(r1);
        if (r2 == 0) goto L_0x0081;
    L_0x0079:
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        com.whatsapp.App.a(r9, r10, r0);
    L_0x0081:
        if (r2 == 0) goto L_0x008b;
    L_0x0083:
        r0 = z;
        r1 = 3;
        r0 = r0[r1];
        com.whatsapp.App.a(r9, r10, r0);
    L_0x008b:
        return;
    L_0x008c:
        r0 = java.lang.Integer.toString(r12);
        goto L_0x0039;
    L_0x0091:
        r1 = r0;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jg.a(java.lang.String, java.lang.String, java.lang.String, int, int):void");
    }

    public void b(String str, int i) {
        c(str, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.b r11) {
        /*
        r10_this = this;
        r9 = 2;
        r8 = 32;
        r7 = 0;
        r6 = 1;
        r0 = com.whatsapp.App.az;
        r1 = r11.e;
        r4 = r1.c;
        r5 = com.whatsapp.v.b(r4);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 43;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r11.e;
        r2 = r2.a;
        r1 = r1.append(r2);
        r1 = r1.append(r8);
        r2 = r11.D;
        r1 = r1.append(r2);
        r1 = r1.append(r8);
        r2 = java.lang.System.currentTimeMillis();
        r1 = r1.append(r2);
        r1 = r1.append(r8);
        r2 = r11.I;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = z;
        r2 = 46;
        r1 = r1[r2];
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x005f;
    L_0x0059:
        r2 = java.lang.System.currentTimeMillis();
        r11.D = r2;
    L_0x005f:
        com.whatsapp.App.a(r11);
        r1 = de.greenrobot.event.g.b();
        r2 = com.whatsapp.bz.class;
        r3 = r1.b(r2);
        r3 = (com.whatsapp.bz) r3;
        r1 = r11.j;
        if (r1 == r6) goto L_0x007b;
    L_0x0072:
        r1 = r11.j;
        if (r1 == r9) goto L_0x007b;
    L_0x0076:
        r1 = r11.j;
        r2 = 3;
        if (r1 != r2) goto L_0x0086;
    L_0x007b:
        r1 = r11.N;
        if (r1 == 0) goto L_0x0086;
    L_0x007f:
        r1 = com.whatsapp.App.aJ;
        r1.c(r11);
        if (r0 == 0) goto L_0x00cd;
    L_0x0086:
        r1 = r11.j;
        if (r1 != 0) goto L_0x009a;
    L_0x008a:
        r1 = r11.d();
        if (r1 == 0) goto L_0x009a;
    L_0x0090:
        r1 = r11.e;
        r1 = r1.c;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 == 0) goto L_0x00c1;
    L_0x009a:
        r1 = com.whatsapp.Conversation.r();
        if (r1 == 0) goto L_0x00ba;
    L_0x00a0:
        r1 = r3.a();
        if (r1 != 0) goto L_0x00ba;
    L_0x00a6:
        r1 = com.whatsapp.Conversation.t();
        r1 = r1.u;
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x00ba;
    L_0x00b2:
        r1 = r5.a;
        if (r1 != 0) goto L_0x00ba;
    L_0x00b6:
        r1 = 13;
        r11.a = r1;
    L_0x00ba:
        r1 = com.whatsapp.App.aJ;
        r1.f(r11);
        if (r0 == 0) goto L_0x00cd;
    L_0x00c1:
        r8 = r10.a;
        r0 = new com.whatsapp.a13;
        r1 = r10;
        r2 = r11;
        r0.<init>(r1, r2, r3, r4, r5);
        r8.c(r0);
    L_0x00cd:
        r1 = com.whatsapp.s3.a();
        r0 = r11.r;
        if (r0 == 0) goto L_0x0190;
    L_0x00d5:
        r0 = r6;
    L_0x00d6:
        r1.a(r0);
        r0 = r5.q;
        if (r0 != 0) goto L_0x00eb;
    L_0x00dd:
        r5.q = r6;
        r0 = new com.whatsapp.wc;
        r0.<init>(r10);
        r1 = new com.whatsapp.m8[r6];
        r1[r7] = r5;
        com.whatsapp.a5w.a(r0, r1);
    L_0x00eb:
        r0 = r5.w();
        if (r0 == 0) goto L_0x010b;
    L_0x00f1:
        r0 = r5.e;
        r0 = com.whatsapp.bd.f(r0);
        if (r0 != 0) goto L_0x010b;
    L_0x00f9:
        r0 = r5.e;
        r1 = com.whatsapp.App.P;
        r1 = r1.d();
        r1 = r1.e;
        com.whatsapp.bd.b(r0, r1);
        r0 = r5.e;
        com.whatsapp.App.a(r0, r7, r9);
    L_0x010b:
        r0 = r11.j;
        r1 = 5;
        if (r0 != r1) goto L_0x0126;
    L_0x0110:
        r0 = r11.e();
        if (r0 != 0) goto L_0x0126;
    L_0x0116:
        r0 = r11.A;
        r0 = (com.whatsapp.MediaData) r0;
        r0.transferring = r6;
        r0 = new com.whatsapp.akp;
        r0.<init>(r10, r11);
        r1 = new java.lang.Void[r7];
        com.whatsapp.a5w.a(r0, r1);
    L_0x0126:
        r0 = r11.r;
        if (r0 == 0) goto L_0x0189;
    L_0x012a:
        r0 = r11.r;
        r0 = r0.intValue();
        r1 = 4;
        if (r0 != r1) goto L_0x0189;
    L_0x0133:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 41;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = com.whatsapp.App.aJ;
        r1 = r1.t();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.aJ;
        r1 = z;
        r2 = 45;
        r1 = r1[r2];
        r0.c(r1);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 44;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r11.e;
        r1 = r1.a;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.G;
        if (r0 != r6) goto L_0x0189;
    L_0x0180:
        r0 = z;
        r1 = 42;
        r0 = r0[r1];
        com.whatsapp.App.o(r0);
    L_0x0189:
        com.whatsapp.ak4.b(r11);
        com.whatsapp.d7.a(r11);
        return;
    L_0x0190:
        r0 = r7;
        goto L_0x00d6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jg.a(com.whatsapp.protocol.b):void");
    }

    public void a(com.whatsapp.messaging.ay ayVar) {
        App.k.a(ayVar.b);
        if (ayVar.a != null) {
            a(atf.PAYMENT_COMPLETED, ayVar.a.a, ayVar.a.b, null, null);
        }
    }

    public void c(String str, String str2, String str3) {
        m8 d = App.P.d(str3);
        if (d != null) {
            App.b(new afw(this, d));
            if (!App.aT.a(str3)) {
                App.aT.a(str3, 0);
                App.u(str3);
            }
            if (Conversation.r() && App.aE != 3 && d.e.equals(Conversation.t().u)) {
                App.b(d);
            }
            App.a(d.e, d.c, new Messenger(App.n));
            App.b(new String[]{d.e});
        }
        App.a(str2, str, z[50]);
    }

    public void a(String[] strArr, String str) {
        if (App.L) {
            App.aM.add(Pair.create(strArr, str));
            ac.a(App.aM);
            App.aM.clear();
            if (App.az == 0) {
                return;
            }
        }
        App.aM.add(Pair.create(strArr, str));
    }

    private void a(atf com_whatsapp_atf, int i, long j, String str, String str2) {
        int i2 = App.az;
        if (!App.O) {
            if (App.L || 1000 * j < System.currentTimeMillis()) {
                if (atf.GIFT_RECEIVED == com_whatsapp_atf) {
                    App.aR.add(Pair.create(str, str2));
                }
                App.a(com_whatsapp_atf, i, j);
                if (i2 == 0) {
                    return;
                }
            }
            App.ar = j;
            App.aD = i;
            App.M = com_whatsapp_atf;
            App.O = true;
            if (atf.GIFT_RECEIVED == com_whatsapp_atf) {
                App.aR.add(Pair.create(str, str2));
                if (i2 == 0) {
                    return;
                }
            }
            return;
        }
        if (atf.GIFT_RECEIVED == com_whatsapp_atf) {
            App.aR.add(Pair.create(str, str2));
        }
    }

    public void b(Hashtable hashtable) {
        SettingsPrivacy.a(hashtable);
    }

    public void a(int i, long j) {
        int i2 = App.az;
        switch (i) {
            case PBE.MD5 /*0*/:
                break;
            case ay.f /*1*/:
                a(atf.PAYMENT_COMPLETED, i, j, null, null);
                if (i2 == 0) {
                    return;
                }
                break;
        }
        a(atf.WHATSAPP_INITIATED, i, j, null, null);
        if (i2 != 0) {
            Log.e(z[60] + i + z[59] + j);
        }
    }

    public void a(bj bjVar, Vector vector) {
        int i = App.az;
        Log.i(z[29] + bjVar);
        m8 d = App.P.d(bjVar.a);
        if (d != null) {
            Iterator it = vector.iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                if (z[28].equals(kVar.b)) {
                    d.C = ar.fromText(kVar.a);
                    continue;
                }
                if (i != 0) {
                    break;
                }
            }
            App.P.b(d);
            App.r(bjVar.a);
        }
        App.b(bjVar);
    }

    public void a(bj bjVar, m mVar, byte[] bArr, int i, long j) {
        int a = aE.a(bArr);
        Log.i(z[56] + i + z[54] + mVar + z[51] + a + z[55] + j);
        if (i > 4) {
            Log.w(z[53] + mVar);
            App.a(bjVar);
            return;
        }
        if (i == 4 && App.G == 1) {
            App.o(z[52]);
        }
        this.a.c(new pn(this, bjVar, mVar, i, a));
    }

    public void a(String str, String str2) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Throwable e;
        FileInputStream fileInputStream3 = null;
        int i = 0;
        int i2 = App.az;
        App.a(str, str2, z[49]);
        if (!a89.a(str2)) {
            m8 d = App.P.d();
            if (d != null) {
                try {
                    if (str2.equals(d.e)) {
                        File m = d.m();
                        File a = d.a();
                        try {
                            if (m.exists() && a.exists()) {
                                try {
                                    byte[] bArr;
                                    fileInputStream = new FileInputStream(a);
                                    try {
                                        bArr = new byte[((int) a.length())];
                                        int i3 = 0;
                                        while (i3 < bArr.length) {
                                            int read = fileInputStream.read(bArr, i3, bArr.length - i3);
                                            if (read != -1 || i2 != 0) {
                                                i3 += read;
                                                if (i2 != 0) {
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        fileInputStream2 = new FileInputStream(m);
                                    } catch (IOException e2) {
                                        e = e2;
                                        fileInputStream2 = fileInputStream;
                                        try {
                                            Log.b(z[47] + str2 + z[48], e);
                                            if (fileInputStream2 != null) {
                                                try {
                                                    fileInputStream2.close();
                                                } catch (IOException e3) {
                                                }
                                            }
                                            if (fileInputStream3 == null) {
                                                try {
                                                    fileInputStream3.close();
                                                } catch (IOException e4) {
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            e = th;
                                            fileInputStream = fileInputStream2;
                                            if (fileInputStream != null) {
                                                try {
                                                    fileInputStream.close();
                                                } catch (IOException e5) {
                                                }
                                            }
                                            if (fileInputStream3 != null) {
                                                try {
                                                    fileInputStream3.close();
                                                } catch (IOException e6) {
                                                }
                                            }
                                            throw e;
                                        }
                                    } catch (Throwable th2) {
                                        e = th2;
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                        if (fileInputStream3 != null) {
                                            fileInputStream3.close();
                                        }
                                        throw e;
                                    }
                                    try {
                                        byte[] bArr2 = new byte[((int) m.length())];
                                        while (i < bArr2.length) {
                                            int read2 = fileInputStream2.read(bArr2, i, bArr2.length - i);
                                            if (read2 != -1 || i2 != 0) {
                                                i += read2;
                                                if (i2 != 0) {
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        a89 com_whatsapp_a89 = new a89(str2, bArr2, bArr);
                                        com_whatsapp_a89.i = true;
                                        App.a(com_whatsapp_a89);
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException e7) {
                                            }
                                        }
                                        if (fileInputStream2 != null) {
                                            try {
                                                fileInputStream2.close();
                                            } catch (IOException e8) {
                                            }
                                        }
                                    } catch (IOException e9) {
                                        e = e9;
                                        fileInputStream3 = fileInputStream2;
                                        fileInputStream2 = fileInputStream;
                                        Log.b(z[47] + str2 + z[48], e);
                                        if (fileInputStream2 != null) {
                                            fileInputStream2.close();
                                        }
                                        if (fileInputStream3 == null) {
                                            fileInputStream3.close();
                                        }
                                    } catch (Throwable th3) {
                                        e = th3;
                                        fileInputStream3 = fileInputStream2;
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                        if (fileInputStream3 != null) {
                                            fileInputStream3.close();
                                        }
                                        throw e;
                                    }
                                } catch (IOException e10) {
                                    e = e10;
                                    fileInputStream2 = null;
                                    Log.b(z[47] + str2 + z[48], e);
                                    if (fileInputStream2 != null) {
                                        fileInputStream2.close();
                                    }
                                    if (fileInputStream3 == null) {
                                        fileInputStream3.close();
                                    }
                                } catch (Throwable th4) {
                                    e = th4;
                                    fileInputStream = null;
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    if (fileInputStream3 != null) {
                                        fileInputStream3.close();
                                    }
                                    throw e;
                                }
                            }
                        } catch (IOException e11) {
                            throw e11;
                        }
                    }
                } catch (IOException e112) {
                    throw e112;
                }
            }
        }
    }

    public void a(String str, String str2, int i) {
        App.aT.a(str, str2, i);
        App.u(str);
    }

    public jg(App app) {
        this.a = app;
    }

    public void a(String str, long j, String str2) {
        i.a(str, j, str2);
    }

    public void a(Exception exception) {
        Log.w(z[39] + exception);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.m r14, java.lang.String r15) {
        /*
        r13_this = this;
        r4 = 0;
        r12 = 3;
        r6 = 1;
        r7 = com.whatsapp.App.az;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 16;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r14.a;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 7;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r15);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r14.c;
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        r0 = r0.endsWith(r1);
        if (r0 == 0) goto L_0x0049;
    L_0x003d:
        if (r15 == 0) goto L_0x0049;
    L_0x003f:
        r0 = new com.whatsapp.protocol.m;
        r1 = r14.b;
        r2 = r14.a;
        r0.<init>(r15, r1, r2);
        r14 = r0;
    L_0x0049:
        r0 = r13.a;
        r0 = r0.Q;
        r0.remove(r14);
        r0 = com.whatsapp.App.aJ;
        r3 = r0.b(r14);
        if (r3 == 0) goto L_0x0162;
    L_0x0058:
        r0 = r3.j;
        if (r0 == r6) goto L_0x0065;
    L_0x005c:
        r0 = r3.j;
        if (r0 == r12) goto L_0x0065;
    L_0x0060:
        r0 = r3.j;
        r1 = 2;
        if (r0 != r1) goto L_0x0157;
    L_0x0065:
        r0 = 0;
        r1 = r3.A;
        if (r1 == 0) goto L_0x007a;
    L_0x006a:
        r1 = r3.A;
        r1 = r1 instanceof com.whatsapp.MediaData;
        if (r1 == 0) goto L_0x007a;
    L_0x0070:
        r1 = new com.whatsapp.MediaData;
        r0 = r3.A;
        r0 = (com.whatsapp.MediaData) r0;
        r1.<init>(r0);
        r0 = r1;
    L_0x007a:
        if (r0 == 0) goto L_0x013b;
    L_0x007c:
        r1 = r0.file;
        if (r1 == 0) goto L_0x013b;
    L_0x0080:
        r1 = r0.file;
        r1 = r1.exists();
        if (r1 == 0) goto L_0x0130;
    L_0x0088:
        r8 = r0.fileSize;
        r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r1 == 0) goto L_0x009a;
    L_0x008e:
        r8 = r0.fileSize;
        r1 = r0.file;
        r10 = r1.length();
        r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r1 != 0) goto L_0x0109;
    L_0x009a:
        r8 = com.whatsapp.App.aY();
        r1 = com.whatsapp.App.a(r8, r3);
        if (r1 != 0) goto L_0x00ac;
    L_0x00a4:
        r1 = r3.j;
        if (r1 != r6) goto L_0x00bd;
    L_0x00a8:
        if (r8 == 0) goto L_0x00bd;
    L_0x00aa:
        if (r8 == r12) goto L_0x00bd;
    L_0x00ac:
        r1 = new com.whatsapp.av6;
        r2 = r13;
        r1.<init>(r2, r3, r4, r6);
        r0.uploader = r1;
        r0.autodownloadRetryEnabled = r6;
        r1 = r0.uploader;
        r1.b();
        if (r7 == 0) goto L_0x0107;
    L_0x00bd:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r4 = 14;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r1 = r1.append(r8);
        r2 = z;
        r4 = 10;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r2 = r3.j;
        r1 = r1.append(r2);
        r2 = z;
        r4 = 13;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r2 = r3.w;
        r1 = r1.append(r2);
        r2 = z;
        r4 = 11;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r2 = r3.k;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
    L_0x0107:
        if (r7 == 0) goto L_0x0155;
    L_0x0109:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r0.fileSize;
        r1 = r1.append(r2);
        r2 = r0.file;
        r2 = r2.length();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        if (r7 == 0) goto L_0x0155;
    L_0x0130:
        r1 = z;
        r2 = 9;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        if (r7 == 0) goto L_0x0155;
    L_0x013b:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 15;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x0155:
        if (r7 == 0) goto L_0x016a;
    L_0x0157:
        r0 = z;
        r1 = 12;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        if (r7 == 0) goto L_0x016a;
    L_0x0162:
        r0 = z;
        r1 = 5;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
    L_0x016a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jg.a(com.whatsapp.protocol.m, java.lang.String):void");
    }

    public void a(m mVar, int i, long j) {
        this.a.Q.remove(mVar);
        boolean a = App.aJ.a(mVar, i, j);
        bz bzVar = (bz) g.b().b(bz.class);
        if (Conversation.r() && !bzVar.a() && Conversation.t().u.equals(mVar.c) && a && Conversation.k) {
            App.a(Uri.parse(z[4]));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.m r8, int r9, java.lang.String r10) {
        /*
        r7_this = this;
        r6 = 0;
        r1 = com.whatsapp.App.az;
        r0 = r7.a;
        r0 = r0.Q;
        r0.remove(r8);
        r0 = r8.c;
        r0 = com.whatsapp.bd.b(r0);
        if (r0 == 0) goto L_0x0069;
    L_0x0012:
        r2 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r9 != r2) goto L_0x0069;
    L_0x0016:
        r2 = com.whatsapp.App.aJ;
        r3 = r8.c;
        r3 = com.whatsapp.bd.d(r3);
        r2.f(r3);
        r2 = com.whatsapp.App.aJ;
        r2 = r2.b(r8);
        if (r2 == 0) goto L_0x0033;
    L_0x0029:
        r3 = 7;
        r2.a = r3;
        r3 = com.whatsapp.App.aJ;
        r3.a(r2);
        if (r1 == 0) goto L_0x004d;
    L_0x0033:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 31;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r8);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
    L_0x004d:
        r2 = r8.c;
        r2 = com.whatsapp.bd.f(r2);
        if (r2 != 0) goto L_0x0067;
    L_0x0055:
        r2 = r8.c;
        r3 = com.whatsapp.App.P;
        r3 = r3.d();
        r3 = r3.e;
        com.whatsapp.bd.a(r2, r3);
        r2 = com.whatsapp.App.aH;
        r2.sendEmptyMessage(r6);
    L_0x0067:
        if (r1 == 0) goto L_0x0118;
    L_0x0069:
        if (r0 == 0) goto L_0x0118;
    L_0x006b:
        r0 = 409; // 0x199 float:5.73E-43 double:2.02E-321;
        if (r9 != r0) goto L_0x0118;
    L_0x006f:
        r0 = r8.c;
        com.whatsapp.App.D(r0);
        r0 = com.whatsapp.App.aJ;
        r2 = r0.b(r8);
        if (r2 == 0) goto L_0x00fe;
    L_0x007c:
        r0 = com.whatsapp.App.aJ;
        r3 = r8.c;
        r4 = r2.m;
        r0 = r0.e(r3, r4);
        if (r0 == 0) goto L_0x00d2;
    L_0x0088:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 34;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.append(r8);
        r4 = z;
        r5 = 35;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r4 = r2.m;
        r3 = r3.append(r4);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r2.a = r6;
        r3 = r0.size();
        r3 = new java.lang.String[r3];
        r0 = com.whatsapp.util.au.a(r0, r3);
        r0 = (java.lang.String[]) r0;
        r2.C = r0;
        r0 = com.whatsapp.App.aJ;
        r0.h(r2);
        r0 = com.whatsapp.App.aJ;
        r3 = -1;
        r0.d(r2, r3);
        com.whatsapp.App.aF();
        if (r1 == 0) goto L_0x00fc;
    L_0x00d2:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = z;
        r4 = 30;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r0 = r0.append(r8);
        r3 = z;
        r4 = 33;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r2 = r2.m;
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
    L_0x00fc:
        if (r1 == 0) goto L_0x0118;
    L_0x00fe:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 32;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r8);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
    L_0x0118:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jg.a(com.whatsapp.protocol.m, int, java.lang.String):void");
    }

    public void f(String str, String str2) {
        App.b(new f1(this, str2, str));
    }

    public void a(int i) {
        Log.w(z[0] + i);
    }

    public void a(String str) {
        App.at.put(str, str);
    }

    public void a(m mVar) {
        av4.a(mVar);
    }

    public void a(bj bjVar, m mVar) {
        Log.i(z[1]);
        this.a.c(new a8e(this, mVar, bjVar));
    }

    public void a(String str, String str2, String str3) {
        App.a(str, str2, str3, true);
    }

    public void a() {
        DeleteAccountConfirmation.b();
    }

    static App a(jg jgVar) {
        return jgVar.a;
    }

    public void b(String str, String str2, long j) {
        i.a(this.a, str, str2, j);
    }
}
