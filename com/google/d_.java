package com.google;

import com.whatsapp.vk;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum d_ {
    ;
    public static final d_ ASCII;
    public static final d_ Big5;
    public static final d_ Cp1250;
    public static final d_ Cp1251;
    public static final d_ Cp1252;
    public static final d_ Cp1256;
    public static final d_ Cp437;
    public static final d_ EUC_KR;
    public static final d_ GB18030;
    public static final d_ ISO8859_1;
    public static final d_ ISO8859_10;
    public static final d_ ISO8859_11;
    public static final d_ ISO8859_13;
    public static final d_ ISO8859_14;
    public static final d_ ISO8859_15;
    public static final d_ ISO8859_16;
    public static final d_ ISO8859_2;
    public static final d_ ISO8859_3;
    public static final d_ ISO8859_4;
    public static final d_ ISO8859_5;
    public static final d_ ISO8859_6;
    public static final d_ ISO8859_7;
    public static final d_ ISO8859_8;
    public static final d_ ISO8859_9;
    public static final d_ SJIS;
    public static final d_ UTF8;
    public static final d_ UnicodeBigUnmarked;
    private static final Map c;
    private static final Map d;
    private static final String[] z;
    private final String[] a;
    private final int[] b;

    private d_(int i) {
        this(r3, r4, new int[]{i}, new String[0]);
    }

    public int getValue() {
        return this.b[0];
    }

    private d_(int[] iArr, String[] strArr) {
        this.b = iArr;
        this.a = strArr;
    }

    static {
        String[] strArr = new String[55];
        String str = "k1e\nD\u0017[u\u0005";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 34;
                        break;
                    case ay.f /*1*/:
                        i4 = 98;
                        break;
                    case ay.n /*2*/:
                        i4 = 42;
                        break;
                    case ay.p /*3*/:
                        i4 = 50;
                        break;
                    default:
                        i4 = 124;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "U\u000bDV\u0013U\u0011\u0007\u0003N\u0017P";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "k1e\u001fD\u001aW\u0013\u001fM\u0014";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "k1e\nD\u0017[u\u0003M";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "e \u0018\u0001M\u0010";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "k1e\u001fD\u001aW\u0013\u001fM\u0012";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "a\u0012\u001b\u0000I\u0013";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "U\u000bDV\u0013U\u0011\u0007\u0003N\u0017T";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "k1e\nD\u0017[u\u0001";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "g7im7p";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "w1\u0007s/a+c";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "k1e\u001fD\u001aW\u0013\u001fM";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "w6l\u001fM\u0014 o";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "k1e\u001fD\u001aW\u0013\u001fM\u0017";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "a\u0012\u001b\u0000I\u0014";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "q(ca";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "c1i{5";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "k1e\u001fD\u001aW\u0013\u001fN";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "k1e\nD\u0017[u\u0003J";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "`\u000bM\u0007";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "g7im?l";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "k1e\u001fD\u001aW\u0013\u001fD";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "w\fCQ\u0013F\u0007h[\u001bw\fGS\u000eI\u0007N";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "g7i\u001f7p";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "w\fCQ\u0013F\u0007h[\u001b";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "k1e\u001fD\u001aW\u0013\u001fK";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "k1e\nD\u0017[u\n";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "e a";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "k1e\u001fD\u001aW\u0013\u001fO";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "a\u0012\u001e\u0001K";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "k1e\nD\u0017[u\u0007";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "w6l\u001fD";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "k1e\u001fD\u001aW\u0013\u001fE";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "k1e\nD\u0017[u\u0003";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "a\u0012\u001b\u0000I\u0010";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "w6l\n";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "k1e\u001fD\u001aW\u0013\u001fJ";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "a\u0012\u001b\u0000I\u0012";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "k1e\nD\u0017[u\u0003I";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "k1e\u001fD\u001aW\u0013\u001fM\u0011";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "k1e\nD\u0017[u\u0004";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "k1e\u001fD\u001aW\u0013\u001fM\u0013";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "k1e\u001fD\u001aW\u0013\u001fI";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "q\nCT\b}(ca";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "k1e\nD\u0017[u\u000b";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "U\u000bDV\u0013U\u0011\u0007\u0003N\u0017S";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "e \u001b\nL\u0011R";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "k1e\nD\u0017[u\u0003L";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "k1e\nD\u0017[u\u0000";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "k1e\nD\u0017[u\u0006";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "U\u000bDV\u0013U\u0011\u0007\u0003N\u0017R";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "k1e\nD\u0017[u\u0003O";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "k1e\u001fD\u001aW\u0013\u001fM\u0016";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "k1e\u001fD\u001aW\u0013\u001fH";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    Cp437 = new d_(z[30], 0, new int[]{0, 2}, new String[0]);
                    ISO8859_1 = new d_(z[34], 1, new int[]{1, 3}, new String[]{z[12]});
                    ISO8859_2 = new d_(z[49], 2, 4, new String[]{z[18]});
                    ISO8859_3 = new d_(z[9], 3, 5, new String[]{z[29]});
                    ISO8859_4 = new d_(z[50], 4, 6, new String[]{z[54]});
                    ISO8859_5 = new d_(z[31], 5, 7, new String[]{z[43]});
                    ISO8859_6 = new d_(z[41], 6, 8, new String[]{z[37]});
                    ISO8859_7 = new d_(z[0], 7, 9, new String[]{z[26]});
                    ISO8859_8 = new d_(z[27], 8, 10, new String[]{z[22]});
                    ISO8859_9 = new d_(z[45], 9, 11, new String[]{z[33]});
                    ISO8859_10 = new d_(z[48], 10, 12, new String[]{z[6]});
                    ISO8859_11 = new d_(z[4], 11, 13, new String[]{z[42]});
                    ISO8859_13 = new d_(z[52], 12, 15, new String[]{z[40]});
                    ISO8859_14 = new d_(z[1], 13, 16, new String[]{z[53]});
                    ISO8859_15 = new d_(z[39], 14, 17, new String[]{z[14]});
                    ISO8859_16 = new d_(z[19], 15, 18, new String[]{z[3]});
                    SJIS = new d_(z[16], 16, 20, new String[]{z[44]});
                    Cp1250 = new d_(z[38], 17, 21, new String[]{z[51]});
                    Cp1251 = new d_(z[7], 18, 22, new String[]{z[46]});
                    Cp1252 = new d_(z[35], 19, 23, new String[]{z[2]});
                    Cp1256 = new d_(z[15], 20, 24, new String[]{z[8]});
                    UnicodeBigUnmarked = new d_(z[23], 21, 25, new String[]{z[13], z[25]});
                    UTF8 = new d_(z[36], 22, 26, new String[]{z[32]});
                    ASCII = new d_(z[17], 23, new int[]{27, 170}, new String[]{z[11]});
                    Big5 = new d_(z[20], 24, 28);
                    GB18030 = new d_(z[47], 25, 29, new String[]{z[5], z[21], z[28]});
                    EUC_KR = new d_(z[10], 26, 30, new String[]{z[24]});
                    e = new d_[]{Cp437, ISO8859_1, ISO8859_2, ISO8859_3, ISO8859_4, ISO8859_5, ISO8859_6, ISO8859_7, ISO8859_8, ISO8859_9, ISO8859_10, ISO8859_11, ISO8859_13, ISO8859_14, ISO8859_15, ISO8859_16, SJIS, Cp1250, Cp1251, Cp1252, Cp1256, UnicodeBigUnmarked, UTF8, ASCII, Big5, GB18030, EUC_KR};
                    c = new HashMap();
                    d = new HashMap();
                    for (d_ d_Var : values()) {
                        for (int i5 : d_Var.b) {
                            c.put(Integer.valueOf(i5), d_Var);
                        }
                        d.put(d_Var.name(), d_Var);
                        for (Object obj : d_Var.a) {
                            d.put(obj, d_Var);
                        }
                    }
                default:
                    strArr2[i2] = str;
                    str = "k1e\nD\u0017[u\u0003H";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static d_ getCharacterSetECIByValue(int i) {
        if (i >= 0 && i < 900) {
            return (d_) c.get(Integer.valueOf(i));
        }
        throw ga.a();
    }

    private d_(int i, String[] strArr) {
        this.b = new int[]{i};
        this.a = strArr;
    }

    public static d_ getCharacterSetECIByName(String str) {
        return (d_) d.get(str);
    }
}
