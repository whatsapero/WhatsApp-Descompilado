package com.whatsapp.fieldstats;

import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum ar {
    ;
    public static final ar ADDRESSBOOK_SYNC;
    public static final ar BACKUP;
    public static final ar BBX_BBID_CALL;
    public static final ar BBX_HUB_UPDATE_INBOX;
    public static final ar BROADCAST_FANOUT;
    public static final ar CALL;
    public static final ar CALL_OFFER;
    public static final ar CDB_GET;
    public static final ar CDB_REGENERATION;
    public static final ar CHAT_CONNECTION;
    public static final ar CONTACT_US_SESSION;
    public static final ar CRASH_LOG;
    public static final ar DATABASE_ERROR;
    public static final ar E2E_MESSAGE_RECV;
    public static final ar E2E_MESSAGE_SEND;
    public static final ar GROUP_MUTE;
    public static final ar IPHONE_BACKGROUND_FETCH;
    public static final ar IPHONE_FAILED_TO_LAUNCH;
    public static final ar I_CLOUD_AUTO_BACKUP_ERROR;
    public static final ar I_CLOUD_BACKUP;
    public static final ar I_CLOUD_RESTORE;
    public static final ar LOCATION_PICKER;
    public static final ar LOGIN;
    public static final ar MEDIA_DOWNLOAD;
    public static final ar MEDIA_UPLOAD;
    public static final ar MESSAGE_RECEIVE;
    public static final ar MESSAGE_SEND;
    public static final ar MMD_DOWNLOAD;
    public static final ar OFFLINE_MESSAGES;
    public static final ar PAY_CHURN;
    public static final ar PAY_FREE_EXTENSION;
    public static final ar PAY_PAYMENT;
    public static final ar PROFILE_PIC_UPLOAD;
    public static final ar PTT;
    public static final ar RECEIPTS_RECV;
    public static final ar RECEIPTS_SEND;
    public static final ar REG_CODE;
    public static final ar REG_EXIST;
    public static final ar REG_REGISTER;
    public static final ar RESTORE;
    public static final ar SUPPORT_EMAIL;
    public static final ar UI_ACTION;
    public static final ar UI_USAGE;
    private static final ar[] b;
    private static final String[] z;
    private final int a;

    private ar(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[43];
        String str = "=d*OX%{0NM";
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
                        i4 = 122;
                        break;
                    case ay.f /*1*/:
                        i4 = 54;
                        break;
                    case ay.n /*2*/:
                        i4 = 101;
                        break;
                    case ay.p /*3*/:
                        i4 = 26;
                        break;
                    default:
                        i4 = 8;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "6y&[\\3y+EX3u._Z";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = "?\u0004 EE?e6[O?i7_K,";
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "9~$NW9y+TM9b,UF";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "(s\"EK5r ";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = ";r!HM)e'UG1i6CF9";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "*w<EX;o(_F.";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    str = ")c5JG(b:_E;\u007f)";
                    i = 7;
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    strArr2 = strArr3;
                    str = "8d*[L9w6NW<w+U].";
                    i = 8;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "3i&VG/r:XI9}0J";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = ">w1[J;e EM(d*H";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "5p#VA4s:WM)e$]M)";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "8w&Q]*";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "8t=E@/t:OX>w1_W3x'UP";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "7{!EL5a+VG;r";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "(s\"EZ?q,I\\?d";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "(s&_A*b6EZ?u3";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "3f-UF?i#[A6s!E\\5i)[]4u-";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "?\u0004 EE?e6[O?i6_F>";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "9w)V";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "9d$I@%z*]";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "(s6NG(s";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "/\u007f:[K.\u007f*T";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "9r'EZ?q TM(w1SG4";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "8t=EJ8\u007f!EK;z)";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    str = "3i&VG/r:[].y:XI9}0JW?d7UZ";
                    i = 25;
                    i2 = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    strArr2 = strArr3;
                    str = "7s!SI%r*MF6y$^";
                    i = 26;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "9w)VW5p#_Z";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "*w<EN(s EM\"b T[3y+";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "7s6II=s:IM4r";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "/\u007f:O[;q ";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "9y+NI9b:O[%e I[3y+";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "3i&VG/r:HM)b*HM";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "3f-UF?i'[K1q7U]4r:\\M.u-";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "*b1";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "7s6II=s:HM9s,LM";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "7s!SI%c5VG;r";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "9r'EO?b";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "*d*\\A6s:JA9i0JD5w!";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "(s&_A*b6E[?x!";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "*w<EK2c7T";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "(s\"EM\"\u007f6N";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    MESSAGE_SEND = new ar(z[30], 0, 9);
                    MESSAGE_RECEIVE = new ar(z[36], 1, 10);
                    OFFLINE_MESSAGES = new ar(z[12], 2, 30);
                    MEDIA_UPLOAD = new ar(z[37], 3, 11);
                    MEDIA_DOWNLOAD = new ar(z[27], 4, 12);
                    PTT = new ar(z[35], 5, 13);
                    LOGIN = new ar(z[1], 6, 14);
                    CALL = new ar(z[20], 7, 15);
                    CALL_OFFER = new ar(z[28], 8, 16);
                    GROUP_MUTE = new ar(z[0], 9, 17);
                    PROFILE_PIC_UPLOAD = new ar(z[39], 10, 18);
                    CONTACT_US_SESSION = new ar(z[32], 11, 25);
                    BBX_HUB_UPDATE_INBOX = new ar(z[14], 12, 19);
                    BBX_BBID_CALL = new ar(z[25], 13, 20);
                    I_CLOUD_BACKUP = new ar(z[10], 14, 21);
                    I_CLOUD_RESTORE = new ar(z[33], 15, 35);
                    I_CLOUD_AUTO_BACKUP_ERROR = new ar(z[26], 16, 36);
                    IPHONE_BACKGROUND_FETCH = new ar(z[34], 17, 38);
                    IPHONE_FAILED_TO_LAUNCH = new ar(z[18], 18, 39);
                    UI_ACTION = new ar(z[23], 19, 22);
                    UI_USAGE = new ar(z[31], 20, 29);
                    E2E_MESSAGE_SEND = new ar(z[19], 21, 23);
                    E2E_MESSAGE_RECV = new ar(z[3], 22, 24);
                    ADDRESSBOOK_SYNC = new ar(z[6], 23, 31);
                    LOCATION_PICKER = new ar(z[2], 24, 43);
                    BACKUP = new ar(z[13], 25, 41);
                    RESTORE = new ar(z[22], 26, 42);
                    REG_EXIST = new ar(z[42], 27, 1);
                    REG_CODE = new ar(z[5], 28, 2);
                    REG_REGISTER = new ar(z[16], 29, 3);
                    PAY_PAYMENT = new ar(z[7], 30, 4);
                    PAY_FREE_EXTENSION = new ar(z[29], 31, 5);
                    PAY_CHURN = new ar(z[41], 32, 6);
                    SUPPORT_EMAIL = new ar(z[8], 33, 7);
                    MMD_DOWNLOAD = new ar(z[15], 34, 8);
                    RECEIPTS_RECV = new ar(z[17], 35, 33);
                    RECEIPTS_SEND = new ar(z[40], 36, 34);
                    CDB_REGENERATION = new ar(z[24], 37, 26);
                    CDB_GET = new ar(z[38], 38, 27);
                    BROADCAST_FANOUT = new ar(z[9], 39, 28);
                    CRASH_LOG = new ar(z[21], 40, 32);
                    CHAT_CONNECTION = new ar(z[4], 41, 40);
                    DATABASE_ERROR = new ar(z[11], 42, 37);
                    b = new ar[]{MESSAGE_SEND, MESSAGE_RECEIVE, OFFLINE_MESSAGES, MEDIA_UPLOAD, MEDIA_DOWNLOAD, PTT, LOGIN, CALL, CALL_OFFER, GROUP_MUTE, PROFILE_PIC_UPLOAD, CONTACT_US_SESSION, BBX_HUB_UPDATE_INBOX, BBX_BBID_CALL, I_CLOUD_BACKUP, I_CLOUD_RESTORE, I_CLOUD_AUTO_BACKUP_ERROR, IPHONE_BACKGROUND_FETCH, IPHONE_FAILED_TO_LAUNCH, UI_ACTION, UI_USAGE, E2E_MESSAGE_SEND, E2E_MESSAGE_RECV, ADDRESSBOOK_SYNC, LOCATION_PICKER, BACKUP, RESTORE, REG_EXIST, REG_CODE, REG_REGISTER, PAY_PAYMENT, PAY_FREE_EXTENSION, PAY_CHURN, SUPPORT_EMAIL, MMD_DOWNLOAD, RECEIPTS_RECV, RECEIPTS_SEND, CDB_REGENERATION, CDB_GET, BROADCAST_FANOUT, CRASH_LOG, CHAT_CONNECTION, DATABASE_ERROR};
                default:
                    strArr2[i2] = str;
                    str = "6y\"SF";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.a;
    }
}
