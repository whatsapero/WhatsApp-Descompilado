package com.whatsapp.fieldstats;

import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum ai {
    ;
    public static final ai ATTACHED;
    public static final ai CREATED;
    public static final ai EXPIRED;
    public static final ai FAIL_BAD_PARAM;
    public static final ai FAIL_BAD_TOKEN;
    public static final ai FAIL_BLOCKED;
    public static final ai FAIL_FORMAT_WRONG;
    public static final ai FAIL_GUESSED_TOO_FAST;
    public static final ai FAIL_INCORRECT;
    public static final ai FAIL_LENGTH_LONG;
    public static final ai FAIL_LENGTH_SHORT;
    public static final ai FAIL_MISMATCH;
    public static final ai FAIL_MISSING;
    public static final ai FAIL_MISSING_PARAM;
    public static final ai FAIL_NEXT_METHOD;
    public static final ai FAIL_NO_ROUTES;
    public static final ai FAIL_OLD_VERSION;
    public static final ai FAIL_PROVIDER_TIMEOUT;
    public static final ai FAIL_PROVIDER_UNROUTABLE;
    public static final ai FAIL_STALE;
    public static final ai FAIL_TEMPORARILY_UNAVAILABLE;
    public static final ai FAIL_TOO_MANY;
    public static final ai FAIL_TOO_MANY_ALL_METHODS;
    public static final ai FAIL_TOO_MANY_GUESSES;
    public static final ai FAIL_TOO_RECENT;
    public static final ai OK;
    public static final ai SENT;
    private static final ai[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    private ai(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[27];
        String str = "uL6jw|]&";
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
                        i4 = 52;
                        break;
                    case ay.f /*1*/:
                        i4 = 24;
                        break;
                    case ay.n /*2*/:
                        i4 = 98;
                        break;
                    case ay.p /*3*/:
                        i4 = 43;
                        break;
                    default:
                        i4 = 52;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "rY+gkvT-h\u007fq\\";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "rY+gk`W-tyuV;tsa]1xqg";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "rY+gk`W-tyuV;tuxT=fq`P-og";
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "rY+gkdJ-}}p]0tazJ-~`uZ.n";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "rY+gkyQ1x}z_";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "rY+gkx],l`|G1c{fL";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "rY+gkyQ1x}z_={ufY/";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "rY+gksM'xgq\\=\u007f{{G$jg`";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "rY+gkzW=y{aL'x";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "rY+gkrW0fu`G5y{z_";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "q@2bfq\\";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "rY+gk`]/{{fY0bxmG7eubY+guvT'";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "g],\u007f";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "rY+gkdJ-}}p]0t`}U'da`";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "wJ'j`q\\";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "rY+gk{T&tbqJ1b{z";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "rY+gkvY&t`{S'e";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "rY+gkgL#gq";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "rY+gk}V!dff]!\u007f";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "rY+gkyQ1fu`[*";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "rY+gk`W-tfq['e`";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "rY+gkvY&tduJ#f";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    str = "rY+gkx],l`|G.dzs";
                    i = 23;
                    i2 = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    strArr2 = strArr3;
                    str = "{S";
                    i = 24;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "rY+gk`W-tyuV;";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new ai(z[25], 0, 1);
                    FAIL_MISMATCH = new ai(z[21], 1, 2);
                    FAIL_TOO_MANY_GUESSES = new ai(z[3], 2, 3);
                    FAIL_GUESSED_TOO_FAST = new ai(z[9], 3, 4);
                    FAIL_MISSING = new ai(z[6], 4, 5);
                    FAIL_STALE = new ai(z[19], 5, 6);
                    FAIL_TEMPORARILY_UNAVAILABLE = new ai(z[13], 6, 7);
                    FAIL_BLOCKED = new ai(z[2], 7, 8);
                    SENT = new ai(z[14], 8, 9);
                    FAIL_NEXT_METHOD = new ai(z[1], 9, 10);
                    FAIL_TOO_MANY_ALL_METHODS = new ai(z[4], 10, 11);
                    FAIL_TOO_RECENT = new ai(z[22], 11, 12);
                    FAIL_TOO_MANY = new ai(z[26], 12, 13);
                    FAIL_OLD_VERSION = new ai(z[17], 13, 14);
                    FAIL_BAD_PARAM = new ai(z[23], 14, 15);
                    FAIL_PROVIDER_TIMEOUT = new ai(z[15], 15, 16);
                    FAIL_PROVIDER_UNROUTABLE = new ai(z[5], 16, 17);
                    FAIL_BAD_TOKEN = new ai(z[18], 17, 18);
                    FAIL_NO_ROUTES = new ai(z[10], 18, 19);
                    ATTACHED = new ai(z[0], 19, 20);
                    FAIL_INCORRECT = new ai(z[20], 20, 21);
                    FAIL_LENGTH_LONG = new ai(z[24], 21, 22);
                    FAIL_LENGTH_SHORT = new ai(z[7], 22, 23);
                    FAIL_FORMAT_WRONG = new ai(z[11], 23, 24);
                    EXPIRED = new ai(z[12], 24, 25);
                    CREATED = new ai(z[16], 25, 26);
                    FAIL_MISSING_PARAM = new ai(z[8], 26, 27);
                    b = new ai[]{OK, FAIL_MISMATCH, FAIL_TOO_MANY_GUESSES, FAIL_GUESSED_TOO_FAST, FAIL_MISSING, FAIL_STALE, FAIL_TEMPORARILY_UNAVAILABLE, FAIL_BLOCKED, SENT, FAIL_NEXT_METHOD, FAIL_TOO_MANY_ALL_METHODS, FAIL_TOO_RECENT, FAIL_TOO_MANY, FAIL_OLD_VERSION, FAIL_BAD_PARAM, FAIL_PROVIDER_TIMEOUT, FAIL_PROVIDER_UNROUTABLE, FAIL_BAD_TOKEN, FAIL_NO_ROUTES, ATTACHED, FAIL_INCORRECT, FAIL_LENGTH_LONG, FAIL_LENGTH_SHORT, FAIL_FORMAT_WRONG, EXPIRED, CREATED, FAIL_MISSING_PARAM};
                default:
                    strArr2[i2] = str;
                    str = "rY+gkz]:\u007fky]6c{p";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
