package com.whatsapp.fieldstats;

import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum bl {
    ;
    public static final bl ADDRESSBOOK_SYNC;
    public static final bl BACKUP;
    public static final bl BBX_BBID_CALL;
    public static final bl BBX_HUB_UPDATE_INBOX;
    public static final bl BROADCAST_FANOUT;
    public static final bl CALL;
    public static final bl CALL_OFFER;
    public static final bl CDB_GET;
    public static final bl CDB_REGENERATION;
    public static final bl CHAT_CONNECTION;
    public static final bl CONTACT_US_SESSION;
    public static final bl CRASH_LOG;
    public static final bl DATABASE_ERROR;
    public static final bl E2E_MESSAGE_RECV;
    public static final bl E2E_MESSAGE_SEND;
    public static final bl GROUP_MUTE;
    public static final bl IPHONE_BACKGROUND_FETCH;
    public static final bl IPHONE_FAILED_TO_LAUNCH;
    public static final bl I_CLOUD_AUTO_BACKUP_ERROR;
    public static final bl I_CLOUD_BACKUP;
    public static final bl I_CLOUD_RESTORE;
    public static final bl LOCATION_PICKER;
    public static final bl LOGIN;
    public static final bl MEDIA_DOWNLOAD;
    public static final bl MEDIA_UPLOAD;
    public static final bl MESSAGE_RECEIVE;
    public static final bl MESSAGE_SEND;
    public static final bl MMD_DOWNLOAD;
    public static final bl OFFLINE_MESSAGES;
    public static final bl PAY_CHURN;
    public static final bl PAY_FREE_EXTENSION;
    public static final bl PAY_PAYMENT;
    public static final bl PROFILE_PIC_UPLOAD;
    public static final bl PTT;
    public static final bl RECEIPTS_RECV;
    public static final bl RECEIPTS_SEND;
    public static final bl REG_CODE;
    public static final bl REG_EXIST;
    public static final bl REG_REGISTER;
    public static final bl RESTORE;
    public static final bl SUPPORT_EMAIL;
    public static final bl UI_ACTION;
    public static final bl UI_USAGE;
    private static final bl[] a;
    private static final String[] z;
    private final int b;

    private bl(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[43];
        String str = "\u00029)PI\u0000##CB\u000e0";
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
                        i4 = 79;
                        break;
                    case ay.f /*1*/:
                        i4 = 116;
                        break;
                    case ay.n /*2*/:
                        i4 = 109;
                        break;
                    case ay.p /*3*/:
                        i4 = 15;
                        break;
                    default:
                        i4 = 13;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\f5!C";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = "\u001d1>[B\u001d1";
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "\nF(P@\n'>NJ\n+?JN\u0019";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "\u00021)FL\u0010!=CB\u000e0";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\f0/PJ\n ";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\nF(P@\n'>NJ\n+>JC\u000b";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u0006+.CB\u001a02]H\u001c \"]H";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u001c!=_B\u001d 2J@\u000e=!";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\f;#[L\f 2Z^\u0010'(\\^\u0006;#";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u00021>\\L\b12]H\f1$YH";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "\u001a=2Z^\u000e3(";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    str = "\u0003;*FC";
                    i = 12;
                    i2 = 13;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    strArr2 = strArr3;
                    str = "\u001d1*PN\u00000(";
                    i = 13;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    str = "\u001d1*PH\u0017=>[";
                    i = 14;
                    i2 = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    strArr2 = strArr3;
                    str = "\u001f54PN\u0007!?A";
                    i = 15;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "\u000e0)]H\u001c'/@B\u0004+>VC\f";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "\u0006$%@C\n+/NN\u00043?@X\u000102IH\u001b7%";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "\r&\"NI\f5>[R\t5#@X\u001b";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "\u001f&\"ID\u000312_D\f+8_A\u00005)";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "\u0006+.CB\u001a02NX\u001b;2ML\f?8_R\n&?@_";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "\u0003;.NY\u0006;#P]\u00067&J_";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "\f5!CR\u00002+J_";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "\u000b59NO\u000e'(PH\u001d&\"]";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "\u00021>\\L\b12\\H\u00010";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "\u001d1.JD\u001f >P^\n:)";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "\u001d1*P_\n3$\\Y\n&";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "\f0/P_\n3(AH\u001d59FB\u0001";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "\u00021)FL\u00100\"XC\u0003;,K";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "\u001a=2NN\u001b=\"A";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "\f<,[R\f;#AH\f $@C";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "\b&\"Z]\u001098[H";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "\u0006$%@C\n++ND\u00031)PY\u0000+!NX\u00017%";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "\u0006+.CB\u001a02ML\f?8_";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "\u001f54P]\u000e- JC\u001b";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "\r65PE\u001a62Z]\u000b59JR\u0006:/@U";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "\r5.DX\u001f";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "\u001d1.JD\u001f >P_\n7;";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "\f&,\\E\u00108\"H";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "\u00002+CD\u000112BH\u001c',HH\u001c";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "\u001f54PK\u001d1(PH\u0017 (A^\u0006;#";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "\r65PO\r=)PN\u000e8!";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    MESSAGE_SEND = new bl(z[25], 0, 9);
                    MESSAGE_RECEIVE = new bl(z[11], 1, 10);
                    OFFLINE_MESSAGES = new bl(z[40], 2, 30);
                    MEDIA_UPLOAD = new bl(z[5], 3, 11);
                    MEDIA_DOWNLOAD = new bl(z[29], 4, 12);
                    PTT = new bl(z[1], 5, 13);
                    LOGIN = new bl(z[13], 6, 14);
                    CALL = new bl(z[2], 7, 15);
                    CALL_OFFER = new bl(z[23], 8, 16);
                    GROUP_MUTE = new bl(z[32], 9, 17);
                    PROFILE_PIC_UPLOAD = new bl(z[20], 10, 18);
                    CONTACT_US_SESSION = new bl(z[10], 11, 25);
                    BBX_HUB_UPDATE_INBOX = new bl(z[36], 12, 19);
                    BBX_BBID_CALL = new bl(z[42], 13, 20);
                    I_CLOUD_BACKUP = new bl(z[34], 14, 21);
                    I_CLOUD_RESTORE = new bl(z[8], 15, 35);
                    I_CLOUD_AUTO_BACKUP_ERROR = new bl(z[21], 16, 36);
                    IPHONE_BACKGROUND_FETCH = new bl(z[18], 17, 38);
                    IPHONE_FAILED_TO_LAUNCH = new bl(z[33], 18, 39);
                    UI_ACTION = new bl(z[30], 19, 22);
                    UI_USAGE = new bl(z[12], 20, 29);
                    E2E_MESSAGE_SEND = new bl(z[7], 21, 23);
                    E2E_MESSAGE_RECV = new bl(z[4], 22, 24);
                    ADDRESSBOOK_SYNC = new bl(z[17], 23, 31);
                    LOCATION_PICKER = new bl(z[22], 24, 43);
                    BACKUP = new bl(z[37], 25, 41);
                    RESTORE = new bl(z[3], 26, 42);
                    REG_EXIST = new bl(z[15], 27, 1);
                    REG_CODE = new bl(z[14], 28, 2);
                    REG_REGISTER = new bl(z[27], 29, 3);
                    PAY_PAYMENT = new bl(z[35], 30, 4);
                    PAY_FREE_EXTENSION = new bl(z[41], 31, 5);
                    PAY_CHURN = new bl(z[16], 32, 6);
                    SUPPORT_EMAIL = new bl(z[9], 33, 7);
                    MMD_DOWNLOAD = new bl(z[0], 34, 8);
                    RECEIPTS_RECV = new bl(z[38], 35, 33);
                    RECEIPTS_SEND = new bl(z[26], 36, 34);
                    CDB_REGENERATION = new bl(z[28], 37, 26);
                    CDB_GET = new bl(z[6], 38, 27);
                    BROADCAST_FANOUT = new bl(z[19], 39, 28);
                    CRASH_LOG = new bl(z[39], 40, 32);
                    CHAT_CONNECTION = new bl(z[31], 41, 40);
                    DATABASE_ERROR = new bl(z[24], 42, 37);
                    a = new bl[]{MESSAGE_SEND, MESSAGE_RECEIVE, OFFLINE_MESSAGES, MEDIA_UPLOAD, MEDIA_DOWNLOAD, PTT, LOGIN, CALL, CALL_OFFER, GROUP_MUTE, PROFILE_PIC_UPLOAD, CONTACT_US_SESSION, BBX_HUB_UPDATE_INBOX, BBX_BBID_CALL, I_CLOUD_BACKUP, I_CLOUD_RESTORE, I_CLOUD_AUTO_BACKUP_ERROR, IPHONE_BACKGROUND_FETCH, IPHONE_FAILED_TO_LAUNCH, UI_ACTION, UI_USAGE, E2E_MESSAGE_SEND, E2E_MESSAGE_RECV, ADDRESSBOOK_SYNC, LOCATION_PICKER, BACKUP, RESTORE, REG_EXIST, REG_CODE, REG_REGISTER, PAY_PAYMENT, PAY_FREE_EXTENSION, PAY_CHURN, SUPPORT_EMAIL, MMD_DOWNLOAD, RECEIPTS_RECV, RECEIPTS_SEND, CDB_REGENERATION, CDB_GET, BROADCAST_FANOUT, CRASH_LOG, CHAT_CONNECTION, DATABASE_ERROR};
                default:
                    strArr2[i2] = str;
                    str = "\u001f 9";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
