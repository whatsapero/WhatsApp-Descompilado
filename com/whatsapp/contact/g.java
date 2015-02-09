package com.whatsapp.contact;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.a5w;
import com.whatsapp.util.Log;
import com.whatsapp.vk;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class g extends SQLiteOpenHelper {
    private static final String[] z;
    private final Context a;
    private boolean b;

    static {
        String[] strArr = new String[63];
        String str = "`!c?\u0012V/p8\u001bCnw>\u001bP/w%\u0006\u0004*u%\u0014F/g4UB<{<UR+f\"\u001cK 4t\u0011\u0004:{qP@";
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
                        i3 = 36;
                        break;
                    case ay.f /*1*/:
                        i3 = 78;
                        break;
                    case ay.n /*2*/:
                        i3 = 20;
                        break;
                    case ay.p /*3*/:
                        i3 = 81;
                        break;
                    default:
                        i3 = 117;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "g!z%\u0014G:gq\u0011E:u3\u0014W+48\u0006\u0004+z2\u0007]>`4\u0011\nnF4\u0018K8}?\u0012\n`:";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "g!z%\u0014G:gq\u0011E:u3\u0014W+48\u0006\u0004-{#\u0007Q>`\u007fUv+y>\u0003M s\u007f[\n";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "K W>\u0007V;d%\u001cK ";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "w:u2\u001ek8q#\u0013H!c\u0014\u0007V!fq\u0011Q<}?\u0012\u0004*vq\u001cJ'`q\u0016L+w:";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "B'x4UM=44\u001bG<m!\u0001A*";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "g!z%\u0014G:gq\u0011E:u3\u0014W+48\u0006\u0004-{#\u0007Q>`\u007fUb!a?\u0011\u00048}0Uw:u2\u001ek8q#\u0013H!c\u0014\u0007V!f\u007fUv+y>\u0003M s\u007f[\n";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "@+x4\u0001M sq\u0016K `0\u0016Pnp0\u0001E,u\"\u0010\n`:";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "@+x4\u0001A*42\u001aJ:u2\u0001\u0004*u%\u0014F/g4U\f<q\"\u0000H:)t\u0017\r";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\t${$\u0007J/x";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\t9u=";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "S/:5\u0017";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "g!z%\u0014G:gq\u0011E:u3\u0014W+48\u0006\u0004+z2\u0007]>`4\u0011\nnF4\u0018K8}?\u0012\n`:";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "g!z%\u0014G:gq\u0011E:u3\u0014W+48\u0006\u0004-{#\u0007Q>`\u007fUv+y>\u0003M s\u007f[\n";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "g\"}4\u001bPnu2\u0001Q/x=\f\u0004!d4\u001bA*45\u0014P/v0\u0006Anu\"UV+u5XK x(UE pq\u0016E 3%UQ>s#\u0014@+:q&S'`2\u001dM sq\u0001Knc#\u001cP/v=\u0010\n`:";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "K W>\u0007V;d%\u001cK ";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "Q>s#\u0014@+4#\u0010E*9>\u001bH745\u0014P/v0\u0006A";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "B'x4UM=44\u001bG<m!\u0001A*";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "w:u2\u001ek8q#\u0013H!c\u0014\u0007V!fq\u0011Q<}?\u0012\u0004*vq\u001cJ'`q\u0016L+w:";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    str = "g!z%\u0014G:gq\u0011E:u3\u0014W+48\u0006\u0004-{#\u0007Q>`\u007fUb!a?\u0011\u00048}0Uw:u2\u001ek8q#\u0013H!c\u0014\u0007V!f\u007fUv+y>\u0003M s\u007f[\n";
                    obj = 19;
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    strArr2 = strArr3;
                    str = "e\u0002@\u0014'\u0004\u001aU\u00139anc0*G!z%\u0014G:gq4`\n42\u0014H\"u3\u001cH'`(Up\u000bL\u0005";
                    obj = 20;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "a<f>\u0007\u0004*a#\u001cJ)4$\u0005C<u5\u0010\u0004!x5UW-|4\u0018Enr4\u0001G&.qPW";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "W!f%*J/y4Up\u000bL\u0005";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "C'b4\u001b{ u<\u0010\u0004\u001aQ\t!";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "T&{%\u001a{:gq<j\u001aQ\u00160v";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\bnc0*J/y4";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\bn`9\u0000I,K%\u0006";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\bns8\u0003A K?\u0014I+";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "m\u0000G\u0014'pn]\u001f!knc0*G!z%\u0014G:gy";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "e\u0002@\u0014'\u0004\u001aU\u00139anc0*G!z%\u0014G:gq4`\n4\"\u0001E:a\"*P'y4\u0006P/y!Um\u0000@\u00142a\u001c";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\bnd9\u001aP!K8\u0011{:}<\u0010W:u<\u0005";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "{'p}UN'p}UM=K&\u001dE:g0\u0005T\u0011a\"\u0010Vb4\"\u0001E:a\"Y\u0004 a<\u0017A<8q\u0007E9K2\u001aJ:u2\u0001{'p}U@'g!\u0019E7K?\u0014I+8q\u0005L!z4*P7d4Y\u0004>|>\u001bA\u0011x0\u0017A\"8q\u0000J=q4\u001b{#g6*G!a?\u0001";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\bnd9\u001aP!K%\u0006";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "e\u0002@\u0014'\u0004\u001aU\u00139anc0*G!z%\u0014G:gq4`\n42\u0014H\"u3\u001cH'`(Up\u000bL\u0005";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "T&{%\u001a{'p\u000e\u0001M#q\"\u0001E#dq<j\u001aQ\u00160v";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    str = "`\u001c[\u0001Up\u000fV\u001d0\u00049u\u000e\u0016K `0\u0016P=K>\u0019@";
                    obj = 35;
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    strArr2 = strArr3;
                    str = "S/K?\u0014I+4\u00050|\u001a";
                    obj = 36;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "W+x4\u0016Png \u0019\u0004(f>\u0018\u0004=e=\u001cP+K<\u0014W:q#US&q#\u0010\u0004:m!\u0010\u0019i`0\u0017H+3q\u0014J*4?\u0014I+)n";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "S/K2\u001aJ:u2\u0001W";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "B/y8\u0019]\u0011z0\u0018An@\u0014-p";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "e\u0002@\u0014'\u0004\u001aU\u00139anc0*G!z%\u0014G:gq'a\u0000U\u001c0\u0004\u001a[q\u0002E\u0011w>\u001bP/w%\u0006{!x5";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\bnr0\u0018M\"m\u000e\u001bE#q";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\rnG\u00149a\r@q";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "B/y8\u0019]\u0011z0\u0018An@\u0014-p";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0004\bF\u001e8\u00049u\u000e\u0016K `0\u0016P=K>\u0019@";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "P&a<\u0017{:gq<j\u001aQ\u00160v";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "q>s#\u0014@'z6UG!z%\u0014G:gq\u0011E:u3\u0014W+47\u0007K#4'\u0010V=}>\u001b\u0004kpq\u0001Kn15";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "S/K?\u0014I+4\u00050|\u001a";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "W!f%*J/y4Up\u000bL\u0005";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\bng>\u0007P\u0011z0\u0018A";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "`\u001c[\u0001Um\u0000P\u0014-\u0004'g\u000e\u0002E\u0011}?\u0011A6";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "q f4\u0016K)z8\u000fA*4>\u0019@np0\u0001E,u\"\u0010\u00048q#\u0006M!z";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "`\u001c[\u0001Um\u0000P\u0014-\u0004$}5*M p4\r";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "C'b4\u001b{ u<\u0010\u0004\u001aQ\t!";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "B'x4UJ!`q\u0013K;z5UB!fq\u0011E:u3\u0014W+42\u001aT7.qPW";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "M!44\rG+d%\u001cK 45\u0000V'z6U@/`0\u0017E=qq\u0016K>mkU\u0001=";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "`\u001c[\u0001Up\u000fV\u001d0\u0004\u0007Rq0|\u0007G\u0005&\u00049u\u000e\u0016K `0\u0016P=";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "g\u001cQ\u0010!an]\u001f1a\u00164;\u001c@\u0011}?\u0011A64\u001e;\u00049u\u000e\u0016K `0\u0016P=<;\u001c@g/";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "g\u001cQ\u0010!an]\u001f1a\u001648\u0006{9u\u000e\u001cJ*q)Uk\u00004&\u0014{-{?\u0001E-`\"]M=K&\u001dE:g0\u0005T\u0011a\"\u0010Vg/";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "g<q0\u0001M sq\u0016K `0\u0016P=45\u0014P/v0\u0006Anb4\u0007W'{?U\u0001*";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "g\u001cQ\u0010!an@\u00107h\u000b4&\u0014{-{?\u0001E-`\"U\f\u0011}5Um\u0000@\u00142a\u001c4\u0001'm\u0003U\u0003,\u0004\u0005Q\bUe\u001b@\u001e<j\rF\u00148a\u0000@}UN'pq!a\u0016@q;k\u001a4\u001f h\u00028q\u001cW\u0011c9\u0014P=u!\u0005{;g4\u0007\u0004\f[\u001e9a\u000fZq;k\u001a4\u001f h\u00028q\u0006P/`$\u0006\u0004\u001aQ\t!\bng%\u0014P;g\u000e\u0001M#q\"\u0001E#dq<j\u001aQ\u00160vb4?\u0000I,q#Up\u000bL\u0005Y\u0004<u&*G!z%\u0014G:K8\u0011\u0004\u0007Z\u00050c\u000bF}U@'g!\u0019E7K?\u0014I+4\u00050|\u001a8q\u0005L!z4*P7d4Um\u0000@\u00142a\u001c8q\u0005L!z4*H/v4\u0019\u0004\u001aQ\t!\bna?\u0006A+z\u000e\u0018W)K2\u001aQ `q<j\u001aQ\u00160vb4!\u001dK:{\u000e\u0001Wn]\u001f!a\tQ\u0003Y\u0004:|$\u0018F\u0011`\"Um\u0000@\u00142a\u001c8q\u0005L!`>*M*K%\u001cI+g%\u0014I>4\u0018;p\u000bS\u0014'\bns8\u0003A K?\u0014I+4\u00050|\u001a8q\u0013E#}=\f{ u<\u0010\u0004\u001aQ\t!\bnc0*J/y4Up\u000bL\u0005Y\u0004={#\u0001{ u<\u0010\u0004\u001aQ\t!\bnw0\u0019H/v8\u0019M:mq!a\u0016@x";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "S/:5\u0017";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "`\u001c[\u0001Up\u000fV\u001d0\u00049u\u000e\u0016K `0\u0016P=";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.c(z[0], null, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        sQLiteDatabase.execSQL(z[1]);
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r12, int r13, int r14) {
        /*
        r11_this = this;
        r6 = 0;
        r3 = 1;
        r2 = 0;
        r4 = com.whatsapp.contact.ContactProvider.d;
        r0 = z;
        r1 = 47;
        r0 = r0[r1];
        r1 = 2;
        r1 = new java.lang.Object[r1];
        r5 = java.lang.Integer.valueOf(r13);
        r1[r2] = r5;
        r5 = java.lang.Integer.valueOf(r14);
        r1[r3] = r5;
        com.whatsapp.util.Log.a(r0, r6, r1);
        switch(r13) {
            case 2: goto L_0x002d;
            case 3: goto L_0x0185;
            case 4: goto L_0x0199;
            default: goto L_0x0020;
        };
    L_0x0020:
        r0 = z;	 Catch:{ Exception -> 0x01df }
        r1 = 52;
        r0 = r0[r1];	 Catch:{ Exception -> 0x01df }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x01df }
        r11.onCreate(r12);	 Catch:{ Exception -> 0x01df }
    L_0x002c:
        return;
    L_0x002d:
        r5 = new java.lang.StringBuilder;
        r0 = z;
        r1 = 32;
        r0 = r0[r1];
        r5.<init>(r0);
        r0 = "";
        r1 = z;
        r6 = 38;
        r1 = r1[r6];
        r6 = new java.lang.String[r3];
        r7 = z;
        r8 = 39;
        r7 = r7[r8];
        r6[r2] = r7;
        r6 = r12.rawQuery(r1, r6);
        if (r6 == 0) goto L_0x01e1;
    L_0x0050:
        r1 = r6.moveToNext();	 Catch:{ Exception -> 0x01a6 }
        if (r1 == 0) goto L_0x005b;
    L_0x0056:
        r1 = 0;
        r0 = r6.getString(r1);	 Catch:{ Exception -> 0x01a6 }
    L_0x005b:
        r6.close();
        r1 = r0;
    L_0x005f:
        r0 = z;	 Catch:{ Exception -> 0x01c2 }
        r6 = 41;
        r0 = r0[r6];	 Catch:{ Exception -> 0x01c2 }
        r12.execSQL(r0);	 Catch:{ Exception -> 0x01c2 }
        r0 = z;	 Catch:{ Exception -> 0x01c2 }
        r6 = 51;
        r0 = r0[r6];	 Catch:{ Exception -> 0x01c2 }
        r12.execSQL(r0);	 Catch:{ Exception -> 0x01c2 }
        r0 = z;	 Catch:{ Exception -> 0x01c2 }
        r6 = 53;
        r0 = r0[r6];	 Catch:{ Exception -> 0x01c2 }
        r12.execSQL(r0);	 Catch:{ Exception -> 0x01c2 }
        r0 = z;	 Catch:{ Exception -> 0x01c2 }
        r6 = 54;
        r0 = r0[r6];	 Catch:{ Exception -> 0x01c2 }
        r0 = r1.contains(r0);	 Catch:{ Exception -> 0x01c2 }
        if (r0 == 0) goto L_0x00aa;
    L_0x0086:
        r0 = z;	 Catch:{ Exception -> 0x01c4 }
        r6 = 44;
        r0 = r0[r6];	 Catch:{ Exception -> 0x01c4 }
        r0 = r1.contains(r0);	 Catch:{ Exception -> 0x01c4 }
        if (r0 == 0) goto L_0x00aa;
    L_0x0092:
        r0 = z;	 Catch:{ Exception -> 0x01c6 }
        r6 = 48;
        r0 = r0[r6];	 Catch:{ Exception -> 0x01c6 }
        r0 = r1.contains(r0);	 Catch:{ Exception -> 0x01c6 }
        if (r0 == 0) goto L_0x00aa;
    L_0x009e:
        r0 = z;	 Catch:{ Exception -> 0x01c8 }
        r6 = 23;
        r0 = r0[r6];	 Catch:{ Exception -> 0x01c8 }
        r0 = r1.contains(r0);	 Catch:{ Exception -> 0x01c8 }
        if (r0 != 0) goto L_0x01ca;
    L_0x00aa:
        r0 = r3;
    L_0x00ab:
        r11.b = r0;	 Catch:{ Exception -> 0x01cd }
        r0 = z;	 Catch:{ Exception -> 0x01cd }
        r2 = 25;
        r0 = r0[r2];	 Catch:{ Exception -> 0x01cd }
        r0 = r1.contains(r0);	 Catch:{ Exception -> 0x01cd }
        if (r0 == 0) goto L_0x00c2;
    L_0x00b9:
        r0 = z;	 Catch:{ Exception -> 0x01cd }
        r2 = 33;
        r0 = r0[r2];	 Catch:{ Exception -> 0x01cd }
        r5.append(r0);	 Catch:{ Exception -> 0x01cd }
    L_0x00c2:
        r0 = z;	 Catch:{ Exception -> 0x01cf }
        r2 = 46;
        r0 = r0[r2];	 Catch:{ Exception -> 0x01cf }
        r0 = r1.contains(r0);	 Catch:{ Exception -> 0x01cf }
        if (r0 == 0) goto L_0x00d7;
    L_0x00ce:
        r0 = z;	 Catch:{ Exception -> 0x01cf }
        r2 = 27;
        r0 = r0[r2];	 Catch:{ Exception -> 0x01cf }
        r5.append(r0);	 Catch:{ Exception -> 0x01cf }
    L_0x00d7:
        r0 = z;	 Catch:{ Exception -> 0x01d1 }
        r2 = 35;
        r0 = r0[r2];	 Catch:{ Exception -> 0x01d1 }
        r0 = r1.contains(r0);	 Catch:{ Exception -> 0x01d1 }
        if (r0 == 0) goto L_0x00ec;
    L_0x00e3:
        r0 = z;	 Catch:{ Exception -> 0x01d1 }
        r2 = 31;
        r0 = r0[r2];	 Catch:{ Exception -> 0x01d1 }
        r5.append(r0);	 Catch:{ Exception -> 0x01d1 }
    L_0x00ec:
        r0 = z;	 Catch:{ Exception -> 0x01d3 }
        r2 = 24;
        r0 = r0[r2];	 Catch:{ Exception -> 0x01d3 }
        r0 = r1.contains(r0);	 Catch:{ Exception -> 0x01d3 }
        if (r0 == 0) goto L_0x0101;
    L_0x00f8:
        r0 = z;	 Catch:{ Exception -> 0x01d3 }
        r2 = 28;
        r0 = r0[r2];	 Catch:{ Exception -> 0x01d3 }
        r5.append(r0);	 Catch:{ Exception -> 0x01d3 }
    L_0x0101:
        r0 = z;	 Catch:{ Exception -> 0x01d5 }
        r2 = 40;
        r0 = r0[r2];	 Catch:{ Exception -> 0x01d5 }
        r0 = r1.contains(r0);	 Catch:{ Exception -> 0x01d5 }
        if (r0 == 0) goto L_0x0116;
    L_0x010d:
        r0 = z;	 Catch:{ Exception -> 0x01d5 }
        r2 = 42;
        r0 = r0[r2];	 Catch:{ Exception -> 0x01d5 }
        r5.append(r0);	 Catch:{ Exception -> 0x01d5 }
    L_0x0116:
        r0 = z;	 Catch:{ Exception -> 0x01d7 }
        r2 = 37;
        r0 = r0[r2];	 Catch:{ Exception -> 0x01d7 }
        r0 = r1.contains(r0);	 Catch:{ Exception -> 0x01d7 }
        if (r0 == 0) goto L_0x012b;
    L_0x0122:
        r0 = z;	 Catch:{ Exception -> 0x01d7 }
        r2 = 26;
        r0 = r0[r2];	 Catch:{ Exception -> 0x01d7 }
        r5.append(r0);	 Catch:{ Exception -> 0x01d7 }
    L_0x012b:
        r0 = z;	 Catch:{ Exception -> 0x01d9 }
        r2 = 49;
        r0 = r0[r2];	 Catch:{ Exception -> 0x01d9 }
        r0 = r1.contains(r0);	 Catch:{ Exception -> 0x01d9 }
        if (r0 == 0) goto L_0x0140;
    L_0x0137:
        r0 = z;	 Catch:{ Exception -> 0x01d9 }
        r1 = 50;
        r0 = r0[r1];	 Catch:{ Exception -> 0x01d9 }
        r5.append(r0);	 Catch:{ Exception -> 0x01d9 }
    L_0x0140:
        r11.onCreate(r12);	 Catch:{ Exception -> 0x01db }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01db }
        r0.<init>();	 Catch:{ Exception -> 0x01db }
        r1 = z;	 Catch:{ Exception -> 0x01db }
        r2 = 29;
        r1 = r1[r2];	 Catch:{ Exception -> 0x01db }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x01db }
        r0 = r0.append(r5);	 Catch:{ Exception -> 0x01db }
        r1 = z;	 Catch:{ Exception -> 0x01db }
        r2 = 43;
        r1 = r1[r2];	 Catch:{ Exception -> 0x01db }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x01db }
        r1 = 1;
        r1 = r5.substring(r1);	 Catch:{ Exception -> 0x01db }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x01db }
        r1 = z;	 Catch:{ Exception -> 0x01db }
        r2 = 45;
        r1 = r1[r2];	 Catch:{ Exception -> 0x01db }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x01db }
        r0 = r0.toString();	 Catch:{ Exception -> 0x01db }
        r12.execSQL(r0);	 Catch:{ Exception -> 0x01db }
        r0 = z;	 Catch:{ Exception -> 0x01db }
        r1 = 36;
        r0 = r0[r1];	 Catch:{ Exception -> 0x01db }
        r12.execSQL(r0);	 Catch:{ Exception -> 0x01db }
        if (r4 == 0) goto L_0x002c;
    L_0x0185:
        r0 = z;	 Catch:{ Exception -> 0x01dd }
        r1 = 30;
        r0 = r0[r1];	 Catch:{ Exception -> 0x01dd }
        r12.execSQL(r0);	 Catch:{ Exception -> 0x01dd }
        r0 = z;	 Catch:{ Exception -> 0x01dd }
        r1 = 21;
        r0 = r0[r1];	 Catch:{ Exception -> 0x01dd }
        r12.execSQL(r0);	 Catch:{ Exception -> 0x01dd }
        if (r4 == 0) goto L_0x002c;
    L_0x0199:
        r0 = z;	 Catch:{ Exception -> 0x01df }
        r1 = 34;
        r0 = r0[r1];	 Catch:{ Exception -> 0x01df }
        r12.execSQL(r0);	 Catch:{ Exception -> 0x01df }
        if (r4 == 0) goto L_0x002c;
    L_0x01a4:
        goto L_0x0020;
    L_0x01a6:
        r1 = move-exception;
        r7 = z;	 Catch:{ all -> 0x01bd }
        r8 = 22;
        r7 = r7[r8];	 Catch:{ all -> 0x01bd }
        r8 = 0;
        r9 = 1;
        r9 = new java.lang.Object[r9];	 Catch:{ all -> 0x01bd }
        r10 = 0;
        r9[r10] = r1;	 Catch:{ all -> 0x01bd }
        com.whatsapp.util.Log.b(r7, r8, r9);	 Catch:{ all -> 0x01bd }
        r6.close();
        r1 = r0;
        goto L_0x005f;
    L_0x01bd:
        r0 = move-exception;
        r6.close();
        throw r0;
    L_0x01c2:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01c4 }
    L_0x01c4:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01c6 }
    L_0x01c6:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01c8 }
    L_0x01c8:
        r0 = move-exception;
        throw r0;
    L_0x01ca:
        r0 = r2;
        goto L_0x00ab;
    L_0x01cd:
        r0 = move-exception;
        throw r0;
    L_0x01cf:
        r0 = move-exception;
        throw r0;
    L_0x01d1:
        r0 = move-exception;
        throw r0;
    L_0x01d3:
        r0 = move-exception;
        throw r0;
    L_0x01d5:
        r0 = move-exception;
        throw r0;
    L_0x01d7:
        r0 = move-exception;
        throw r0;
    L_0x01d9:
        r0 = move-exception;
        throw r0;
    L_0x01db:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01dd }
    L_0x01dd:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01df }
    L_0x01df:
        r0 = move-exception;
        throw r0;
    L_0x01e1:
        r1 = r0;
        goto L_0x005f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.g.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    void a(File file) {
        FileChannel channel;
        FileNotFoundException fileNotFoundException;
        Throwable th;
        IOException iOException;
        FileChannel fileChannel = null;
        synchronized (this) {
            try {
                close();
                try {
                    channel = new FileInputStream(a()).getChannel();
                    try {
                        if (!file.exists()) {
                            Log.b(file.createNewFile());
                        }
                        FileChannel channel2 = new FileOutputStream(file).getChannel();
                        try {
                            channel2.transferFrom(channel, 0, channel.size());
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (IOException e) {
                                }
                            }
                            if (channel2 != null) {
                                channel2.close();
                            }
                        } catch (FileNotFoundException e2) {
                            FileNotFoundException fileNotFoundException2 = e2;
                            fileChannel = channel;
                            channel = channel2;
                            fileNotFoundException = fileNotFoundException2;
                            try {
                                Log.b(z[55], null, new Object[]{fileNotFoundException});
                                if (fileChannel != null) {
                                    try {
                                        fileChannel.close();
                                    } catch (IOException e3) {
                                    }
                                }
                                if (channel != null) {
                                    channel.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                FileChannel fileChannel2 = channel;
                                channel = fileChannel;
                                fileChannel = fileChannel2;
                                if (channel != null) {
                                    channel.close();
                                }
                                if (fileChannel != null) {
                                    fileChannel.close();
                                }
                                throw th;
                            }
                        } catch (IOException e4) {
                            IOException iOException2 = e4;
                            fileChannel = channel2;
                            iOException = iOException2;
                            try {
                                Log.b(z[56], null, new Object[]{iOException});
                                if (channel != null) {
                                    try {
                                        channel.close();
                                    } catch (IOException e5) {
                                    }
                                }
                                if (fileChannel != null) {
                                    fileChannel.close();
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (channel != null) {
                                    channel.close();
                                }
                                if (fileChannel != null) {
                                    fileChannel.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            Throwable th5 = th4;
                            fileChannel = channel2;
                            th = th5;
                            if (channel != null) {
                                channel.close();
                            }
                            if (fileChannel != null) {
                                fileChannel.close();
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e6) {
                        fileNotFoundException = e6;
                        fileChannel = channel;
                        channel = null;
                        Log.b(z[55], null, new Object[]{fileNotFoundException});
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                        if (channel != null) {
                            channel.close();
                        }
                    } catch (IOException e7) {
                        iOException = e7;
                        Log.b(z[56], null, new Object[]{iOException});
                        if (channel != null) {
                            channel.close();
                        }
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                    }
                } catch (FileNotFoundException e8) {
                    fileNotFoundException = e8;
                    channel = null;
                    Log.b(z[55], null, new Object[]{fileNotFoundException});
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                } catch (IOException e9) {
                    iOException = e9;
                    channel = null;
                    Log.b(z[56], null, new Object[]{iOException});
                    if (channel != null) {
                        channel.close();
                    }
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                } catch (Throwable th6) {
                    th = th6;
                    channel = null;
                    if (channel != null) {
                        channel.close();
                    }
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    throw th;
                }
            } catch (IOException e10) {
            } catch (SQLiteDatabaseCorruptException e11) {
                throw e11;
            } catch (IOException e12) {
            } catch (SQLiteDatabaseCorruptException e112) {
                throw e112;
            } catch (IOException e13) {
            } catch (SQLiteDatabaseCorruptException e1122) {
                throw e1122;
            } catch (IOException e14) {
            } catch (SQLiteDatabaseCorruptException e11222) {
                throw e11222;
            } catch (IOException e15) {
            } catch (SQLiteDatabaseCorruptException e112222) {
                throw e112222;
            } catch (Throwable th7) {
            }
        }
    }

    private File a() {
        return this.a.getDatabasePath(z[12]);
    }

    public SQLiteDatabase getWritableDatabase() {
        int i = ContactProvider.d;
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w(z[3]);
            b();
            return super.getWritableDatabase();
        } catch (SQLiteException e2) {
            try {
                if (e2.toString().contains(z[6])) {
                    Log.w(z[2]);
                    b();
                    return super.getWritableDatabase();
                }
                throw e2;
            } catch (SQLiteDatabaseCorruptException e3) {
                throw e3;
            }
        } catch (StackOverflowError e4) {
            Log.w(z[5]);
            StackTraceElement[] stackTrace = e4.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (i2 < length) {
                try {
                    if (!stackTrace[i2].getMethodName().equals(z[4])) {
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    }
                    Log.w(z[7]);
                    b();
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseCorruptException e32) {
                    throw e32;
                }
            }
            throw e4;
        }
    }

    public g(Context context) {
        super(context, z[62], null, 5);
        this.a = context;
    }

    boolean b() {
        boolean delete;
        boolean z = false;
        int i = ContactProvider.d;
        synchronized (this) {
            close();
            Log.i(z[8]);
            delete = a().delete();
            d().delete();
            c().delete();
            Log.a(z[9], null, new Object[]{Boolean.valueOf(delete)});
        }
        if (i != 0) {
            try {
                if (!DialogToastActivity.i) {
                    z = true;
                }
                DialogToastActivity.i = z;
            } catch (SQLiteDatabaseCorruptException e) {
                throw e;
            }
        }
        return delete;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.a(z[60], null, new Object[]{Integer.valueOf(5)});
        sQLiteDatabase.execSQL(z[57]);
        sQLiteDatabase.execSQL(z[61]);
        sQLiteDatabase.execSQL(z[59]);
        sQLiteDatabase.execSQL(z[58]);
    }

    private File d() {
        File a = a();
        return new File(a.getPath(), a.getName() + z[10]);
    }

    public SQLiteDatabase getReadableDatabase() {
        int i = ContactProvider.d;
        try {
            return super.getReadableDatabase();
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w(z[14]);
            b();
            return super.getReadableDatabase();
        } catch (SQLiteException e2) {
            String toString = e2.toString();
            try {
                if (toString.contains(z[18])) {
                    Log.w(z[13]);
                    b();
                    return super.getReadableDatabase();
                }
                try {
                    if (toString.contains(z[17])) {
                        Log.w(z[15]);
                        return getWritableDatabase();
                    }
                    throw e2;
                } catch (SQLiteDatabaseCorruptException e3) {
                    throw e3;
                }
            } catch (SQLiteDatabaseCorruptException e32) {
                throw e32;
            }
        } catch (StackOverflowError e4) {
            Log.w(z[19]);
            StackTraceElement[] stackTrace = e4.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (i2 < length) {
                try {
                    if (!stackTrace[i2].getMethodName().equals(z[16])) {
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    }
                    Log.w(z[20]);
                    b();
                    return super.getReadableDatabase();
                } catch (SQLiteDatabaseCorruptException e322) {
                    throw e322;
                }
            }
            throw e4;
        }
    }

    private File c() {
        File a = a();
        return new File(a.getPath(), a.getName() + z[11]);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        a5w.a(new a(this, sQLiteDatabase), new Void[0]);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        try {
            super.onOpen(sQLiteDatabase);
            if (VERSION.SDK_INT >= 11) {
                sQLiteDatabase.enableWriteAheadLogging();
            }
            try {
                if (this.b) {
                    a(sQLiteDatabase);
                    this.b = false;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                throw e;
            }
        } catch (SQLiteDatabaseCorruptException e2) {
            throw e2;
        }
    }
}
