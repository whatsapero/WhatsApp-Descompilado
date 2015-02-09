package com.whatsapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.protocol.cz;
import com.whatsapp.protocol.m;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.Z;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a7;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aB;
import org.whispersystems.libaxolotl.aE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.ag;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;
import org.whispersystems.libaxolotl.az;
import org.whispersystems.libaxolotl.b2;
import org.whispersystems.libaxolotl.bk;
import org.whispersystems.libaxolotl.bo;
import org.whispersystems.libaxolotl.bs;
import org.whispersystems.libaxolotl.ecc.d;
import org.whispersystems.libaxolotl.ecc.e;

public class f_ implements aB, bk, bs {
    public static int c;
    private static final String[] z;
    private final Context a;
    private final te b;
    private final y7 d;
    private final u4 e;

    static {
        String[] strArr = new String[145];
        String str = "}hs2";
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
                        i3 = 55;
                        break;
                    case ay.f /*1*/:
                        i3 = 1;
                        break;
                    case ay.n /*2*/:
                        i3 = 23;
                        break;
                    case ay.p /*3*/:
                        i3 = 18;
                        break;
                    default:
                        i3 = 64;
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
                    str = "wr9e(Vuds0G/yw4";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "Vyx~/Cm7x)S!c}`Edt{0^dyf`^e-2";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "gsxd)Sds2*^e7\u007f5Du7|/C!uw`Yt{~";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "wr9e(Vuds0G/yw4";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0017hd2.Xu7t5[mn21B`{{&^ds)`Dixg,S!r|$\u0017v~f(\u0017";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "}hs2";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "wr9e(Vuds0G/yw4";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0017exw3\u0017oxf`Duv`4\u0017v~f(\u0017`7|5Zde{#\u0017wv~5R";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "Rse}2\u0017srs$^op20Ed|w9\u0017";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "Edt}2S";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "Gsry%N^~v`\n!(";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\f!sw,Ru~|'";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "Gsry%N^~v`\n!(";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "Gsry%Nr";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "Gsry%Nr";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "Vyx~/Cm7t/Bos2!\u0017qew`\\dn27^u\u007f2)S!";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    str = "yn7b2Rjrk`Qnb|$\u0017v~f(\u0017hs2";
                    obj = 17;
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    strArr2 = strArr3;
                    str = "ZrpM+RxH`%Zncw\u001f]hs";
                    obj = 18;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "ZrpM+RxH{$";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "[`df\u001fVm~q%hcva%hjrk";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "Zdda!PdHp!DdHy%N";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    str = "Vyx~/Cm7a!Ads2!\u0017lra3Vfr2\"Vrr2+Rx7t/E!";
                    obj = 22;
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    strArr2 = strArr3;
                    str = "\u0017v~f(\u0017sxe`^e7";
                    obj = 23;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "ZrpM+RxHt2XlH\u007f%";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "Chzw3C`zb";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "Vyx~/Cm7z!D!y}`D`aw$\u0017cva%\u0017jrk`Qne2";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "Z`cq(^op";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "Vyx~/Cm7z!D!";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "Vyx~/Cm7z!D!y}`Ddda)Xo7t/E!";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0017rvd%S!us3R!|w9\u0017`yv`Ddda)Xo7t/E!";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0017`yv`";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "Shqt%Edyf";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "^er|4^u~w3";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "Edt{0^dyf\u001f^e7/`\b";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0017hsw.^u~w3\u0017gx``";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "Vyx~/Cm7v%[dcw$\u0017";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "Vyx~/Cm7`%Gnef)Yf7p!Tj7";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "Ddyf\u001fCnHa%Ewr``\n!(";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0017qew+Rxd2&Xs7a%Ye~|'\u0017ux24_d7a%Ewr`";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "Edt}2S";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "Gsry%Nr";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "Rse}2\u0017srs$^op20Ed|w9\u0017";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "Gsry%N^~v";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "Vyx~/Cm7f2Brc{.P!";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u0017jrk`G`~`";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "Zdda!PdHp!DdHy%N";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "[`df\u001fVm~q%hcva%hjrk";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "Ddda)Xod";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "hhs";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "Edt{0^dyf\u001f^e7/`\b";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\u0017`c2";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "Ddda)Xod";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "Edt}2S";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    str = "Vyx~/[u7g0S`c{.P!dw3Dhx|`Qne2";
                    obj = 54;
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    strArr2 = strArr3;
                    str = "Edt{0^dyf\u001f^e";
                    obj = 55;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "Edt{0^dyf\u001f^e7/`\b";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "Vyx~/[u7{.Ddef)Yf7|%@!dw3Dhx|`Qne2";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "Ddda)Xod";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "Vyx~/Cm7a4Xsrv`Ddda)Xo7t/E!";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "Chzw3C`zb";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "zt{f)Gmr2$Rw~q%\u0017rbb0Xsc2.Xu7{-Gmr\u007f%Yurv";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "Gsry%Nr";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "Ddyf\u001fCnHa%Ewr`";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "Ddyf\u001fCnHa%Ewr``\u0016<7\"";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "Vyx~/Cm7`%Tnev%S!y}`Gsry%Nr7s3\u0017srq%^wrv`Ux7a%Ewr`";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "Gtu~)T^|w9";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "Gs~d!CdHy%N";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i] = str;
                    i = 69;
                    str = "zhda)Yf7w.Csn2&Xs7a%[g7{.\u0017hsw.Chc{%D!cs\"[d";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i] = str;
                    i = 70;
                    str = "^er|4^u~w3";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i] = str;
                    i = 71;
                    str = "Vyx~/Cm7~/Ve~|'\u0017hsw.Chck`\\dn20Vhe";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i] = str;
                    i = 72;
                    str = "~oas,^e7b5Um~q`\\dn23Cnew$\u0017hy2)Sdyf)Chra`C`u~%";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i] = str;
                    i = 73;
                    str = "Edt{0^dyf\u001f^e7/`\b";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case 72:
                    strArr2[i] = str;
                    i = 74;
                    str = "Vyx~/Cm7z!D!b|3Roc20Ed|w9D;7";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i] = str;
                    i = 75;
                    str = "dD[W\u0003c!T]\u0015yU?8i\u0017GE]\r\u0017qew+Rxd2\u0017\u007fDEW`Ddyf\u001fCnHa%Ewr``\n!'";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case 74:
                    strArr2[i] = str;
                    i = 76;
                    str = "bovp,R!c}`Tnb|4\u0017tya%Yu7w.Cs~w3\u0017hy20Ed|w9D!cs\"[d";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case 75:
                    strArr2[i] = str;
                    i = 77;
                    str = "zhda)Yf7w.Csn2&Xs7a%[g7{.\u0017hsw.Chc{%D!cs\"[d";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case 76:
                    strArr2[i] = str;
                    i = 78;
                    str = "Vyx~/Cm7t%Cb\u007fw$\u0017mxq![!ew'^rc`!Chx|`^e-2";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case 77:
                    strArr2[i] = str;
                    i = 79;
                    str = "Edp{3Csvf)XoH{$";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case 78:
                    strArr2[i] = str;
                    i = 80;
                    str = "^er|4^u~w3";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case 79:
                    strArr2[i] = str;
                    i = 81;
                    str = "Edt{0^dyf\u001f^e7/`\b";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case 80:
                    strArr2[i] = str;
                    i = 82;
                    str = "Edt{0^dyf\u001f^e";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case 81:
                    strArr2[i] = str;
                    i = 83;
                    str = "Gtu~)T^|w9";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case 82:
                    strArr2[i] = str;
                    i = 84;
                    str = "Gtu~)T^|w9";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case 83:
                    strArr2[i] = str;
                    i = 85;
                    str = "\u0017v~f(\u0017sra5[uv|4\u0017sxe`^e7";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case 84:
                    strArr2[i] = str;
                    i = 86;
                    str = "Chzw3C`zb";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case 85:
                    strArr2[i] = str;
                    i = 87;
                    str = "Vyx~/Cm7a!Ads2)Sdyf)Cx7t/E!";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case 86:
                    strArr2[i] = str;
                    i = 88;
                    str = "^er|4^u~w3";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case 87:
                    strArr2[i] = str;
                    i = 89;
                    str = "Gsry%N^~v`\n!(";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case 88:
                    strArr2[i] = str;
                    i = 90;
                    str = "\u0017qew`\\dna`@hcz`^e7";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case 89:
                    strArr2[i] = str;
                    i = 91;
                    str = "Vyx~/Cm7v%[dcw$\u0017";
                    obj = 90;
                    strArr2 = strArr3;
                    break;
                case 90:
                    strArr2[i] = str;
                    i = 92;
                    str = "Gsry%Nr";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case 91:
                    strArr2[i] = str;
                    i = 93;
                    str = "Vyx~/Cm7v%[dcw$\u0017";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case 92:
                    strArr2[i] = str;
                    i = 94;
                    str = "\u0017lra3Vfr2\"Vrr2+Rx7`/@r7t/E!";
                    obj = 93;
                    strArr2 = strArr3;
                    break;
                case 93:
                    strArr2[i] = str;
                    i = 95;
                    str = "Zdda!PdHp!DdHy%N";
                    obj = 94;
                    strArr2 = strArr3;
                    break;
                case 94:
                    strArr2[i] = str;
                    i = 96;
                    str = "zt{f)Gmr2$Rw~q%\u0017rbb0Xsc2.Xu7{-Gmr\u007f%Yurv";
                    obj = 95;
                    strArr2 = strArr3;
                    break;
                case 95:
                    strArr2[i] = str;
                    i = 97;
                    str = "Edt}2S";
                    obj = 96;
                    strArr2 = strArr3;
                    break;
                case 96:
                    strArr2[i] = str;
                    i = 98;
                    str = "Edt{0^dyf\u001f^e7/`\b";
                    obj = 97;
                    strArr2 = strArr3;
                    break;
                case 97:
                    strArr2[i] = str;
                    i = 99;
                    str = "Vyx~/Cm7z!D!v23Rrd{/Y!q}2\u0017";
                    obj = 98;
                    strArr2 = strArr3;
                    break;
                case 98:
                    strArr2[i] = str;
                    i = 100;
                    str = "Ddda)Xod";
                    obj = 99;
                    strArr2 = strArr3;
                    break;
                case 99:
                    strArr2[i] = str;
                    i = 101;
                    str = "\r!";
                    obj = 100;
                    strArr2 = strArr3;
                    break;
                case 100:
                    strArr2[i] = str;
                    i = 102;
                    str = "Ddyf\u001fCnHa%Ewr`";
                    obj = 101;
                    strArr2 = strArr3;
                    break;
                case 101:
                    strArr2[i] = str;
                    i = 103;
                    str = "Vyx~/Cm7`%Tnev%S!v~,\u0017qew+Rxd2!D!ew#Rhaw$\u0017cn23Rsaw2";
                    obj = 102;
                    strArr2 = strArr3;
                    break;
                case 102:
                    strArr2[i] = str;
                    i = 104;
                    str = "Gsry%Nr";
                    obj = 103;
                    strArr2 = strArr3;
                    break;
                case 103:
                    strArr2[i] = str;
                    i = 105;
                    str = "Ddyf\u001fCnHa%Ewr``\n!'";
                    obj = 104;
                    strArr2 = strArr3;
                    break;
                case 104:
                    strArr2[i] = str;
                    i = 106;
                    str = "Rse}2\u0017srs$^op23Rrd{/Y!ew#Xss2";
                    obj = 105;
                    strArr2 = strArr3;
                    break;
                case 105:
                    strArr2[i] = str;
                    i = 107;
                    str = "Vyx~/Cm7z!D!y}`Ddda)Xo7`%Tnev`Qne2";
                    obj = 106;
                    strArr2 = strArr3;
                    break;
                case 106:
                    strArr2[i] = str;
                    i = 108;
                    str = "Vyx~/Cm7t/Bos2!\u0017wv~)S!dw3Dhx|`Edt}2S!q}2\u0017";
                    obj = 107;
                    strArr2 = strArr3;
                    break;
                case 107:
                    strArr2[i] = str;
                    i = 109;
                    str = "Edt}2S";
                    obj = 108;
                    strArr2 = strArr3;
                    break;
                case 108:
                    strArr2[i] = str;
                    i = 110;
                    str = "Edt{0^dyf\u001f^e7/`\b";
                    obj = 109;
                    strArr2 = strArr3;
                    break;
                case 109:
                    strArr2[i] = str;
                    i = 111;
                    str = "Ddda)Xod";
                    obj = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i] = str;
                    i = 112;
                    str = "Edt{0^dyf\u001f^e7/`\b";
                    obj = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i] = str;
                    i = 113;
                    str = "Ddda)Xod";
                    obj = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i] = str;
                    i = 114;
                    str = "\f!sw,Ru~|'";
                    obj = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i] = str;
                    i = 115;
                    str = "Vyx~/Cm7t%Cb\u007fw$\u0017hsw.Chck`\\dn2&Xs7a%Ye~|'";
                    obj = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i] = str;
                    i = 116;
                    str = "Sd{w4Re7";
                    obj = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i] = str;
                    i = 117;
                    str = "Vyx~/Cm9v\"";
                    obj = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i] = str;
                    i = 118;
                    str = "Vyx~/Cm7v%[dcw$\u0017";
                    obj = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i] = str;
                    i = 119;
                    str = "Ddda)Xod";
                    obj = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i] = str;
                    i = 120;
                    str = "Edt{0^dyf\u001f^e7/`\b";
                    obj = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i] = str;
                    i = 121;
                    str = "\u0017rra3^nya`@hcz`";
                    obj = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i] = str;
                    i = 122;
                    str = "Vyx~/Cm7z!D!v20Ed7y%N!`{4_!~v`";
                    obj = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i] = str;
                    i = 123;
                    str = "Gsry%N^~v`\n!(";
                    obj = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i] = str;
                    i = 124;
                    str = "Edt}2S";
                    obj = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i] = str;
                    i = 125;
                    str = "\r!";
                    obj = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i] = str;
                    i = 126;
                    str = "Gsry%Nr";
                    obj = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i] = str;
                    i = 127;
                    str = "\u0017<7";
                    obj = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i] = str;
                    i = 128;
                    str = "\u0017<7-";
                    obj = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i] = str;
                    i = 129;
                    str = "ZrpM+RxH{$";
                    obj = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i] = str;
                    i = 130;
                    str = "\u0017 *2";
                    obj = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i] = str;
                    i = 131;
                    str = "\u0007!V\\\u0004\u0017";
                    obj = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i] = str;
                    i = 132;
                    str = "ZrpM+RxH`%Zncw\u001f]hs2}\u0017>7S\u000es!za'hjrk\u001fQsx\u007f\u001fZd";
                    obj = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i] = str;
                    i = 133;
                    str = "Vyx~/Cm7{$Roc{4N!|w9\u0017gx``";
                    obj = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i] = str;
                    i = 134;
                    str = "\u0017evf%S!";
                    obj = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i] = str;
                    i = 135;
                    str = "Vyx~/Cm7t/Bos2.X!~v%Yu~f9\u0017dyf2N!q}2\u0017";
                    obj = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i] = str;
                    i = 136;
                    str = "Edt{0^dyf\u001f^e7/`\b";
                    obj = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i] = str;
                    i = 137;
                    str = "^er|4^u~w3";
                    obj = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i] = str;
                    i = 138;
                    str = "^er|4^u~w3";
                    obj = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i] = str;
                    i = 139;
                    str = "\u0017erq/Sds2!D!~|6Vm~v{\u0017er~%Chyu";
                    obj = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i] = str;
                    i = 140;
                    str = "Edt{0^dyf\u001f^e7/`\b";
                    obj = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i] = str;
                    i = 141;
                    str = "Vyx~/Cm7t/Bos2!Y!~v%Yu~f9\u0017dyf2N!q}2\u0017";
                    obj = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i] = str;
                    i = 142;
                    str = "Gtu~)T^|w9";
                    obj = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i] = str;
                    i = 143;
                    str = "Chzw3C`zb";
                    obj = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i] = str;
                    i = 144;
                    str = "zt{f)Gmr2$Rw~q%\u0017rbb0Xsc2.Xu7{-Gmr\u007f%Yurv";
                    obj = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0017,)2";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void c(SQLiteDatabase sQLiteDatabase, long j) {
        Log.i(z[118] + ((long) sQLiteDatabase.delete(z[119], z[120], new String[]{String.valueOf(j)})) + z[121] + j);
    }

    public boolean a(long j, m mVar) {
        byte[] c = c(mVar);
        if (c == null) {
            try {
                Log.i(z[27] + mVar);
                return false;
            } catch (NullPointerException e) {
                throw e;
            }
        }
        ag d = d(j);
        if (d == null) {
            try {
                Log.i(z[30] + j);
                return false;
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        boolean equals = Arrays.equals(c, d.a().k());
        try {
            String str;
            StringBuilder append = new StringBuilder().append(z[29]);
            if (equals) {
                str = z[28];
            } else {
                str = z[33];
            }
            Log.i(append.append(str).append(z[31]).append(mVar).append(z[32]).append(j).toString());
            return equals;
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    private boolean d(SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[102], Boolean.valueOf(true));
        int update = sQLiteDatabase.update(z[104], contentValues, z[105], null);
        try {
            Log.i(z[103]);
            return update > 0;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void a(long j, int i, ag agVar) {
        if (i != 0) {
            try {
                throw new IllegalArgumentException(z[62]);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        a(j, agVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.database.sqlite.SQLiteDatabase r11, long r12, org.whispersystems.libaxolotl.ag r14) {
        /*
        r10_this = this;
        r11.beginTransaction();
        r8 = new android.content.ContentValues;	 Catch:{ all -> 0x00f8 }
        r8.<init>();	 Catch:{ all -> 0x00f8 }
        r0 = z;	 Catch:{ all -> 0x00f8 }
        r1 = 56;
        r0 = r0[r1];	 Catch:{ all -> 0x00f8 }
        r1 = java.lang.Long.valueOf(r12);	 Catch:{ all -> 0x00f8 }
        r8.put(r0, r1);	 Catch:{ all -> 0x00f8 }
        r0 = z;	 Catch:{ all -> 0x00f8 }
        r1 = 54;
        r0 = r0[r1];	 Catch:{ all -> 0x00f8 }
        r1 = r14.e();	 Catch:{ all -> 0x00f8 }
        r8.put(r0, r1);	 Catch:{ all -> 0x00f8 }
        r0 = z;	 Catch:{ all -> 0x00f8 }
        r1 = 49;
        r1 = r0[r1];	 Catch:{ all -> 0x00f8 }
        r0 = 1;
        r2 = new java.lang.String[r0];	 Catch:{ all -> 0x00f8 }
        r0 = 0;
        r3 = z;	 Catch:{ all -> 0x00f8 }
        r4 = 50;
        r3 = r3[r4];	 Catch:{ all -> 0x00f8 }
        r2[r0] = r3;	 Catch:{ all -> 0x00f8 }
        r0 = z;	 Catch:{ all -> 0x00f8 }
        r3 = 51;
        r3 = r0[r3];	 Catch:{ all -> 0x00f8 }
        r0 = 1;
        r4 = new java.lang.String[r0];	 Catch:{ all -> 0x00f8 }
        r0 = 0;
        r5 = java.lang.String.valueOf(r12);	 Catch:{ all -> 0x00f8 }
        r4[r0] = r5;	 Catch:{ all -> 0x00f8 }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r0 = r11;
        r0 = r0.query(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x00f8 }
        r1 = r0.moveToNext();	 Catch:{ NullPointerException -> 0x00f6 }
        if (r1 == 0) goto L_0x008c;
    L_0x0052:
        r0.close();	 Catch:{ NullPointerException -> 0x00f6 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00f6 }
        r1.<init>();	 Catch:{ NullPointerException -> 0x00f6 }
        r2 = z;	 Catch:{ NullPointerException -> 0x00f6 }
        r3 = 55;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00f6 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00f6 }
        r1 = r1.append(r12);	 Catch:{ NullPointerException -> 0x00f6 }
        r1 = r1.toString();	 Catch:{ NullPointerException -> 0x00f6 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x00f6 }
        r1 = z;	 Catch:{ NullPointerException -> 0x00f6 }
        r2 = 53;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x00f6 }
        r2 = z;	 Catch:{ NullPointerException -> 0x00f6 }
        r3 = 57;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00f6 }
        r3 = 1;
        r3 = new java.lang.String[r3];	 Catch:{ NullPointerException -> 0x00f6 }
        r4 = 0;
        r5 = java.lang.String.valueOf(r12);	 Catch:{ NullPointerException -> 0x00f6 }
        r3[r4] = r5;	 Catch:{ NullPointerException -> 0x00f6 }
        r11.update(r1, r8, r2, r3);	 Catch:{ NullPointerException -> 0x00f6 }
        r1 = c;	 Catch:{ NullPointerException -> 0x00f6 }
        if (r1 == 0) goto L_0x00d5;
    L_0x008c:
        r0.close();	 Catch:{ all -> 0x00f8 }
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x00f8 }
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0 / r2;
        r2 = z;	 Catch:{ all -> 0x00f8 }
        r3 = 61;
        r2 = r2[r3];	 Catch:{ all -> 0x00f8 }
        r3 = java.lang.Long.valueOf(r0);	 Catch:{ all -> 0x00f8 }
        r8.put(r2, r3);	 Catch:{ all -> 0x00f8 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f8 }
        r2.<init>();	 Catch:{ all -> 0x00f8 }
        r3 = z;	 Catch:{ all -> 0x00f8 }
        r4 = 58;
        r3 = r3[r4];	 Catch:{ all -> 0x00f8 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x00f8 }
        r2 = r2.append(r12);	 Catch:{ all -> 0x00f8 }
        r3 = z;	 Catch:{ all -> 0x00f8 }
        r4 = 52;
        r3 = r3[r4];	 Catch:{ all -> 0x00f8 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x00f8 }
        r0 = r2.append(r0);	 Catch:{ all -> 0x00f8 }
        r0 = r0.toString();	 Catch:{ all -> 0x00f8 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x00f8 }
        r0 = z;	 Catch:{ all -> 0x00f8 }
        r1 = 59;
        r0 = r0[r1];	 Catch:{ all -> 0x00f8 }
        r1 = 0;
        r11.insert(r0, r1, r8);	 Catch:{ all -> 0x00f8 }
    L_0x00d5:
        r11.setTransactionSuccessful();	 Catch:{ all -> 0x00f8 }
        r11.endTransaction();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 60;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r12);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        return;
    L_0x00f6:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00f8 }
    L_0x00f8:
        r0 = move-exception;
        r11.endTransaction();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.f_.a(android.database.sqlite.SQLiteDatabase, long, org.whispersystems.libaxolotl.ag):void");
    }

    public boolean g() {
        return a(this.b.getWritableDatabase());
    }

    public boolean b(long j, b2 b2Var) {
        return b(this.b.getWritableDatabase(), j, b2Var);
    }

    private void d(SQLiteDatabase sQLiteDatabase, long j) {
        Log.i(z[37] + ((long) sQLiteDatabase.delete(z[34], z[35], new String[]{String.valueOf(j)})) + z[36] + j);
    }

    public vu a(long j) {
        return b(this.b.getWritableDatabase(), j);
    }

    private ag a(SQLiteDatabase sQLiteDatabase, long j) {
        Cursor query = sQLiteDatabase.query(z[111], new String[]{z[109]}, z[110], new String[]{String.valueOf(j)}, null, null, null);
        try {
            if (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                query.close();
                try {
                    ag agVar = new ag(blob);
                    Log.i(z[108] + j);
                    return agVar;
                } catch (Throwable e) {
                    Log.b(z[106] + j + z[114], e);
                    sQLiteDatabase.delete(z[113], z[112], new String[]{String.valueOf(j)});
                    return new ag();
                }
            }
            query.close();
            Log.i(z[107] + j);
            return new ag();
        } catch (IOException e2) {
            throw e2;
        }
    }

    private int c(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query(z[80], new String[]{z[79]}, z[81], new String[]{String.valueOf(-1)}, null, null, null);
        try {
            if (query.moveToNext()) {
                int i = query.getInt(0);
                query.close();
                Log.i(z[78] + i);
                return i;
            }
            query.close();
            throw new SQLiteException(z[77]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public byte[] c(m mVar) {
        return b(this.b.getWritableDatabase(), mVar);
    }

    public void f(long j) {
        c(this.b.getWritableDatabase(), j);
    }

    private bo b(SQLiteDatabase sQLiteDatabase, int i) {
        Cursor query = sQLiteDatabase.query(z[16], new String[]{z[11]}, z[12], new String[]{String.valueOf(i)}, null, null, null);
        try {
            if (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                query.close();
                try {
                    Log.i(z[17] + i);
                    return new bo(blob);
                } catch (Throwable e) {
                    Log.b(z[10] + i + z[13], e);
                    sQLiteDatabase.delete(z[15], z[14], new String[]{String.valueOf(i)});
                    throw new a7(e);
                }
            }
            query.close();
            throw new a7(z[18] + i);
        } catch (IOException e2) {
            throw e2;
        }
    }

    private boolean a(SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[64], Boolean.valueOf(false));
        int update = sQLiteDatabase.update(z[63], contentValues, z[65], null);
        try {
            Log.i(z[66]);
            return update > 0;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase, m mVar, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[19], mVar.c);
        contentValues.put(z[25], Boolean.valueOf(mVar.b));
        contentValues.put(z[20], mVar.a);
        contentValues.put(z[21], bArr);
        contentValues.put(z[26], Long.valueOf(System.currentTimeMillis() / 1000));
        Log.i(z[23] + mVar + z[24] + sQLiteDatabase.replaceOrThrow(z[22], null, contentValues));
    }

    public boolean a(int i) {
        return c(this.b.getWritableDatabase(), i);
    }

    private String a(m mVar) {
        try {
            return z[132] + (mVar.b ? z[130] : z[127]) + z[131] + z[129] + z[128];
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void b(m mVar) {
        a(this.b.getWritableDatabase(), mVar);
    }

    public void b(long j) {
        d(this.b.getWritableDatabase(), j);
    }

    public f_(Context context) {
        this.a = context;
        this.b = new te(context);
        this.e = new u4(this.b);
        this.d = new y7(this.b);
    }

    public void b() {
        this.b.c(this.b.getWritableDatabase());
    }

    public void a(m mVar, byte[] bArr) {
        a(this.b.getWritableDatabase(), mVar, bArr);
    }

    public cz[] f() {
        return f(this.b.getWritableDatabase());
    }

    private void a(SQLiteDatabase sQLiteDatabase, int i) {
        Log.i(z[91] + ((long) sQLiteDatabase.delete(z[92], z[89], new String[]{String.valueOf(i)})) + z[90] + i);
    }

    public byte[] a() {
        Object b = a().b().b();
        Object obj = new Object[(b.length - 1)];
        System.arraycopy(b, 1, obj, 0, obj.length);
        Log.i(z[115]);
        return obj;
    }

    private void a(SQLiteDatabase sQLiteDatabase, m mVar) {
        String a = a(mVar);
        Log.i(z[93] + ((long) sQLiteDatabase.delete(z[95], a, new String[]{mVar.c, mVar.a})) + z[94] + mVar);
    }

    public boolean d() {
        return b(this.b.getWritableDatabase());
    }

    public void a(long j, ag agVar) {
        a(this.b.getWritableDatabase(), j, agVar);
    }

    public ag d(long j) {
        return a(this.b.getWritableDatabase(), j);
    }

    private vu b(SQLiteDatabase sQLiteDatabase, long j) {
        b2 b2Var = null;
        Cursor query = sQLiteDatabase.query(z[138], new String[]{z[142], z[143]}, z[136], new String[]{String.valueOf(j)}, null, null, null);
        try {
            if (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                Date date = new Date(query.getLong(1) * 1000);
                query.close();
                if (blob != null) {
                    try {
                        b2Var = new b2(blob, 0);
                    } catch (Throwable e) {
                        Log.b(z[133] + j + z[139], e);
                        sQLiteDatabase.delete(z[137], z[140], new String[]{String.valueOf(j)});
                        return new vu(null, null);
                    }
                }
                Log.i(z[141] + j + z[134] + date);
                return new vu(b2Var, date);
            }
            query.close();
            Log.i(z[135] + j);
            return new vu(null, null);
        } catch (Z e2) {
            throw e2;
        }
    }

    private az e(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query(z[70], new String[]{z[67], z[68]}, z[73], new String[]{String.valueOf(-1)}, null, null, null);
        try {
            if (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                byte[] blob2 = query.getBlob(1);
                query.close();
                try {
                    b2 b2Var = new b2(blob, 0);
                    e a = d.a(blob2);
                    Log.i(z[71]);
                    return new az(b2Var, a);
                } catch (Z e) {
                    throw new SQLiteException(z[72]);
                }
            }
            query.close();
            throw new SQLiteException(z[69]);
        } catch (Z e2) {
            throw e2;
        }
    }

    private cz[] f(SQLiteDatabase sQLiteDatabase) {
        int i = c;
        ArrayList arrayList = new ArrayList();
        Cursor query = sQLiteDatabase.query(z[42], new String[]{z[44], z[41]}, z[39], new String[]{String.valueOf(0)}, null, null, null);
        while (query.moveToNext()) {
            int i2 = query.getInt(0);
            try {
                Object b = new bo(query.getBlob(1)).b().b().b();
                Object obj = new Object[(b.length - 1)];
                System.arraycopy(b, 1, obj, 0, obj.length);
                arrayList.add(new cz(aE.b(i2), obj, null));
                continue;
            } catch (Throwable e) {
                Log.b(z[43] + i2, e);
                continue;
            }
            if (i != 0) {
                break;
            }
        }
        query.close();
        Log.i(z[38] + arrayList.size() + z[40]);
        return (cz[]) arrayList.toArray(new cz[arrayList.size()]);
    }

    public az a() {
        return e(this.b.getWritableDatabase());
    }

    public int b() {
        return c(this.b.getWritableDatabase());
    }

    public boolean b(long j, int i) {
        if (i == 0) {
            return e(j);
        }
        try {
            throw new IllegalArgumentException(z[96]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public ag a(long j, int i) {
        if (i == 0) {
            return d(j);
        }
        try {
            throw new IllegalArgumentException(z[144]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static long a(String str) {
        if (str == null) {
            try {
                throw new NullPointerException(z[4]);
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        try {
            if (str.endsWith(z[2])) {
                try {
                    long parseLong = Long.parseLong(str.substring(0, str.indexOf(z[5])));
                    Log.i(z[3] + str + z[1] + parseLong);
                    return parseLong;
                } catch (Throwable e2) {
                    throw new IllegalArgumentException(z[7] + str + z[9], e2);
                }
            }
            throw new IllegalArgumentException(z[0] + str + z[6] + z[8]);
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }

    public synchronized void h() {
        this.b.close();
        File databasePath = this.a.getDatabasePath(z[117]);
        databasePath.delete();
        Log.i(z[116] + databasePath);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.database.sqlite.SQLiteDatabase r7, long r8, org.whispersystems.libaxolotl.b2 r10) {
        /*
        r6_this = this;
        r0 = new android.content.ContentValues;
        r0.<init>();
        r1 = z;	 Catch:{ NullPointerException -> 0x007a }
        r2 = 82;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x007a }
        r2 = java.lang.Long.valueOf(r8);	 Catch:{ NullPointerException -> 0x007a }
        r0.put(r1, r2);	 Catch:{ NullPointerException -> 0x007a }
        if (r10 == 0) goto L_0x0029;
    L_0x0014:
        r1 = z;	 Catch:{ NullPointerException -> 0x007c }
        r2 = 83;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x007c }
        r2 = r10.a();	 Catch:{ NullPointerException -> 0x007c }
        r2 = r2.b();	 Catch:{ NullPointerException -> 0x007c }
        r0.put(r1, r2);	 Catch:{ NullPointerException -> 0x007c }
        r1 = c;	 Catch:{ NullPointerException -> 0x007c }
        if (r1 == 0) goto L_0x0032;
    L_0x0029:
        r1 = z;	 Catch:{ NullPointerException -> 0x007c }
        r2 = 84;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x007c }
        r0.putNull(r1);	 Catch:{ NullPointerException -> 0x007c }
    L_0x0032:
        r1 = z;
        r2 = 86;
        r1 = r1[r2];
        r2 = java.lang.System.currentTimeMillis();
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 / r4;
        r2 = java.lang.Long.valueOf(r2);
        r0.put(r1, r2);
        r1 = z;
        r2 = 88;
        r1 = r1[r2];
        r2 = 0;
        r0 = r7.replaceOrThrow(r1, r2, r0);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 87;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r8);
        r3 = z;
        r4 = 85;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        return;
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.f_.a(android.database.sqlite.SQLiteDatabase, long, org.whispersystems.libaxolotl.b2):void");
    }

    private boolean e(SQLiteDatabase sQLiteDatabase, long j) {
        Cursor query = sQLiteDatabase.query(z[100], new String[]{z[97]}, z[98], new String[]{String.valueOf(j)}, null, null, null);
        boolean moveToNext = query.moveToNext();
        query.close();
        Log.i(z[99] + j + z[101] + moveToNext);
        return moveToNext;
    }

    public void b(int i) {
        a(this.b.getWritableDatabase(), i);
    }

    public y7 c() {
        return this.d;
    }

    public boolean e() {
        return d(this.b.getWritableDatabase());
    }

    private byte[] b(SQLiteDatabase sQLiteDatabase, m mVar) {
        String a = a(mVar);
        Cursor query = sQLiteDatabase.query(z[47], new String[]{z[48]}, a, new String[]{mVar.c, mVar.a}, null, null, null);
        try {
            if (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                query.close();
                return blob;
            }
            query.close();
            return null;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public boolean e(long j) {
        return e(this.b.getWritableDatabase(), j);
    }

    public void a(long j, b2 b2Var) {
        a(this.b.getWritableDatabase(), j, b2Var);
    }

    private boolean b(SQLiteDatabase sQLiteDatabase, long j, b2 b2Var) {
        Log.i(z[45] + j + z[46]);
        return true;
    }

    private boolean c(SQLiteDatabase sQLiteDatabase, int i) {
        Cursor query = sQLiteDatabase.query(z[126], new String[]{z[124]}, z[123], new String[]{String.valueOf(i)}, null, null, null);
        boolean moveToNext = query.moveToNext();
        query.close();
        Log.i(z[122] + i + z[125] + moveToNext);
        return moveToNext;
    }

    private boolean b(SQLiteDatabase sQLiteDatabase) {
        boolean z = false;
        Cursor rawQuery = sQLiteDatabase.rawQuery(z[75], null);
        try {
            if (rawQuery.moveToNext()) {
                try {
                    if (rawQuery.getInt(0) != 0) {
                        z = true;
                    }
                    rawQuery.close();
                    Log.i(z[74] + z);
                    return z;
                } catch (NullPointerException e) {
                    throw e;
                }
            }
            rawQuery.close();
            throw new SQLiteException(z[76]);
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public bo c(int i) {
        return b(this.b.getWritableDatabase(), i);
    }

    public void c(long j) {
        f(j);
    }
}
