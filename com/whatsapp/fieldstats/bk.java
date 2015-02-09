package com.whatsapp.fieldstats;

import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum bk {
    ;
    public static final bk ABORT;
    public static final bk AUTH;
    public static final bk BUSY;
    public static final bk CANTOPEN;
    public static final bk CONSTRAINT;
    public static final bk CORRUPT;
    public static final bk DONE;
    public static final bk EMPTY;
    public static final bk ERROR;
    public static final bk FORMAT;
    public static final bk FULL;
    public static final bk INTERNAL;
    public static final bk INTERRUPT;
    public static final bk IOERR;
    public static final bk LOCKED;
    public static final bk MISMATCH;
    public static final bk MISUSE;
    public static final bk NOLFS;
    public static final bk NOMEM;
    public static final bk NOTADB;
    public static final bk NOTFOUND;
    public static final bk NOTICE;
    public static final bk OK;
    public static final bk PERM;
    public static final bk PROTOCOL;
    public static final bk RANGE;
    public static final bk READONLY;
    public static final bk ROW;
    public static final bk SCHEMA;
    public static final bk TOOBIG;
    public static final bk WARNING;
    private static final bk[] a;
    private static final String[] z;
    private final int b;

    static {
        String[] strArr = new String[31];
        String str = "v\";su";
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
                        i4 = 55;
                        break;
                    case ay.f /*1*/:
                        i4 = 96;
                        break;
                    case ay.n /*2*/:
                        i4 = 116;
                        break;
                    case ay.p /*3*/:
                        i4 = 33;
                        break;
                    default:
                        i4 = 33;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "~. dsy!8";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "y/9dl";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "~/1ss";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "e%5eny,-";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "{/7jds";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "x+";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "y/ hbr";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "q58m";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "z)'l`c#<";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "e!:fd";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "u5'x";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "`!&ohy'";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "g%&l";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "t/&stg4";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "y/ `eu";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "y/8gr";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "y/ gnb.0";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "s/:d";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "g2;unt/8";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "r-$ux";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "z)'trr";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "v5 i";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "q/&l`c";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "t!:ung%:";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "t/:rue!=ou";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "e/#";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "r2&ns";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "c/;chp";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "~. dse5$u";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new bk(z[7], 0, 0);
                    ERROR = new bk(z[28], 1, 1);
                    INTERNAL = new bk(z[2], 2, 2);
                    PERM = new bk(z[14], 3, 3);
                    ABORT = new bk(z[0], 4, 4);
                    BUSY = new bk(z[12], 5, 5);
                    LOCKED = new bk(z[6], 6, 6);
                    NOMEM = new bk(z[3], 7, 7);
                    READONLY = new bk(z[5], 8, 8);
                    INTERRUPT = new bk(z[30], 9, 9);
                    IOERR = new bk(z[4], 10, 10);
                    CORRUPT = new bk(z[15], 11, 11);
                    NOTFOUND = new bk(z[18], 12, 12);
                    FULL = new bk(z[9], 13, 13);
                    CANTOPEN = new bk(z[25], 14, 14);
                    PROTOCOL = new bk(z[20], 15, 15);
                    EMPTY = new bk(z[21], 16, 16);
                    SCHEMA = new bk(z[1], 17, 17);
                    TOOBIG = new bk(z[29], 18, 18);
                    CONSTRAINT = new bk(z[26], 19, 19);
                    MISMATCH = new bk(z[10], 20, 20);
                    MISUSE = new bk(z[22], 21, 21);
                    NOLFS = new bk(z[17], 22, 22);
                    AUTH = new bk(z[23], 23, 23);
                    FORMAT = new bk(z[24], 24, 24);
                    RANGE = new bk(z[11], 25, 25);
                    NOTADB = new bk(z[16], 26, 26);
                    NOTICE = new bk(z[8], 27, 27);
                    WARNING = new bk(z[13], 28, 28);
                    ROW = new bk(z[27], 29, 100);
                    DONE = new bk(z[19], 30, 101);
                    a = new bk[]{OK, ERROR, INTERNAL, PERM, ABORT, BUSY, LOCKED, NOMEM, READONLY, INTERRUPT, IOERR, CORRUPT, NOTFOUND, FULL, CANTOPEN, PROTOCOL, EMPTY, SCHEMA, TOOBIG, CONSTRAINT, MISMATCH, MISUSE, NOLFS, AUTH, FORMAT, RANGE, NOTADB, NOTICE, WARNING, ROW, DONE};
                default:
                    strArr2[i2] = str;
                    str = "d#<dlv";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.b;
    }

    private bk(int i) {
        this.b = i;
    }
}
