package com.whatsapp.fieldstats;

import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum au {
    ;
    public static final au ABOUT;
    public static final au ACCOUNT;
    public static final au BACKUP_CONVERSATIONS;
    public static final au CHANGE_NUMBER;
    public static final au CHATS_ALL_ARCHIVE;
    public static final au CHATS_ALL_CLEAR;
    public static final au CHATS_ALL_DELETE;
    public static final au CHAT_ARCHIVE;
    public static final au CHAT_CLEAR;
    public static final au CHAT_DELETE;
    public static final au CONTACTS_VIEWS;
    public static final au CONTACT_US;
    public static final au DELETE_ACCOUNT;
    public static final au FAQ;
    public static final au FAVORITES_VIEWS;
    public static final au GROUP_INFO;
    public static final au NEW_BROADCAST_LIST;
    public static final au NEW_GROUP;
    public static final au PROFILE;
    public static final au SETTINGS;
    public static final au STATUS_VIEWS;
    @Deprecated
    public static final au TAF_VIA_CONTACTPICKER_MENU;
    @Deprecated
    public static final au TAF_VIA_CONTACTSFRAGMENT_MENU;
    @Deprecated
    public static final au TAF_VIA_CONTACTS_LIST;
    @Deprecated
    public static final au TAF_VIA_CONTACT_PICKER_LIST;
    @Deprecated
    public static final au TAF_VIA_EMPTY;
    @Deprecated
    public static final au TAF_VIA_INVITE_NON_WA_CONTACT;
    @Deprecated
    public static final au TAF_VIA_SETTINGS;
    public static final au TELL_A_FRIEND;
    private static final au[] a;
    private static final String[] z;
    private final int b;

    static {
        String[] strArr = new String[29];
        String str = "\u0018`\u0007\u0015,\u001az\u0005\t:\rm";
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
                        i4 = 91;
                        break;
                    case ay.f /*1*/:
                        i4 = 40;
                        break;
                    case ay.n /*2*/:
                        i4 = 70;
                        break;
                    case ay.p /*3*/:
                        i4 = 65;
                        break;
                    default:
                        i4 = 115;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u001fm\n\u0004'\u001ew\u0007\u00020\u0014}\b\u0015";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u000fi\u0000\u001e%\u0012i\u0019\u0002<\u0015|\u0007\u0002'\u000ba\u0005\n6\tw\u000b\u0004=\u000e";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\u000fi\u0000\u001e%\u0012i\u0019\u0002<\u0015|\u0007\u0002'\bn\u0014\u00004\u0016m\b\u0015,\u0016m\b\u0014";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u000fi\u0000\u001e%\u0012i\u0019\b=\ra\u0012\u0004,\u0015g\b\u001e$\u001aw\u0005\u000e=\u000fi\u0005\u0015";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u0018`\u0007\u000f4\u001ew\b\u0014>\u0019m\u0014";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u000fi\u0000\u001e%\u0012i\u0019\u0002<\u0015|\u0007\u0002'\u0004x\u000f\u00028\u001ez\u0019\r:\b|";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u0018g\b\u00152\u0018|\u0015\u001e%\u0012m\u0011\u0012";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u000bz\t\u0007:\u0017m";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\u0018`\u0007\u0015 \u0004i\n\r,\u0018d\u0003\u0000!";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u0015m\u0011\u001e1\tg\u0007\u00050\u001a{\u0012\u001e?\u0012{\u0012";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "\u000fi\u0000\u001e%\u0012i\u0019\u0002<\u0015|\u0007\u0002'\bw\n\b \u000f";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "\u0018g\b\u00152\u0018|\u0019\u0014 ";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "\u0018`\u0007\u0015 \u0004i\n\r,\u001fm\n\u0004'\u001e";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "\u0018`\u0007\u0015 \u0004i\n\r,\u001az\u0005\t:\rm";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "\u001ak\u0005\u000e&\u0015|";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "\u001cz\t\u0014#\u0004a\b\u0007<";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "\u000fi\u0000\u001e%\u0012i\u0019\u00126\u000f|\u000f\u000f4\b";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "\u001di\u0017";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "\u0018`\u0007\u0015,\u001fm\n\u0004'\u001e";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "\u0018`\u0007\u0015,\u0018d\u0003\u0000!";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "\u001aj\t\u0014'";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "\u001di\u0010\u000e!\u0012|\u0003\u0012,\ra\u0003\u0016 ";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "\bm\u0012\u0015:\u0015o\u0015";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "\b|\u0007\u0015&\bw\u0010\b6\f{";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "\u0019i\u0005\n&\u000bw\u0005\u000e=\rm\u0014\u00122\u000fa\t\u000f ";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "\u000fm\n\r,\u001aw\u0000\u0013:\u001ef\u0002";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "\u0015m\u0011\u001e4\tg\u0013\u0011";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NEW_GROUP = new au(z[28], 0, 1);
                    NEW_BROADCAST_LIST = new au(z[11], 1, 2);
                    SETTINGS = new au(z[24], 2, 3);
                    PROFILE = new au(z[9], 3, 4);
                    ACCOUNT = new au(z[16], 4, 5);
                    CHANGE_NUMBER = new au(z[6], 5, 6);
                    GROUP_INFO = new au(z[17], 6, 7);
                    BACKUP_CONVERSATIONS = new au(z[26], 7, 8);
                    ABOUT = new au(z[22], 8, 9);
                    FAQ = new au(z[19], 9, 10);
                    CONTACT_US = new au(z[13], 10, 11);
                    DELETE_ACCOUNT = new au(z[2], 11, 12);
                    CONTACTS_VIEWS = new au(z[8], 12, 13);
                    STATUS_VIEWS = new au(z[25], 13, 14);
                    TAF_VIA_SETTINGS = new au(z[18], 14, 15);
                    TAF_VIA_CONTACTS_LIST = new au(z[12], 15, 16);
                    TAF_VIA_CONTACTPICKER_MENU = new au(z[3], 16, 17);
                    TAF_VIA_EMPTY = new au(z[1], 17, 18);
                    TAF_VIA_INVITE_NON_WA_CONTACT = new au(z[5], 18, 19);
                    TAF_VIA_CONTACT_PICKER_LIST = new au(z[7], 19, 20);
                    TAF_VIA_CONTACTSFRAGMENT_MENU = new au(z[4], 20, 21);
                    TELL_A_FRIEND = new au(z[27], 21, 22);
                    FAVORITES_VIEWS = new au(z[23], 22, 23);
                    CHAT_DELETE = new au(z[20], 23, 24);
                    CHAT_CLEAR = new au(z[21], 24, 25);
                    CHAT_ARCHIVE = new au(z[0], 25, 26);
                    CHATS_ALL_DELETE = new au(z[14], 26, 27);
                    CHATS_ALL_CLEAR = new au(z[10], 27, 28);
                    CHATS_ALL_ARCHIVE = new au(z[15], 28, 29);
                    a = new au[]{NEW_GROUP, NEW_BROADCAST_LIST, SETTINGS, PROFILE, ACCOUNT, CHANGE_NUMBER, GROUP_INFO, BACKUP_CONVERSATIONS, ABOUT, FAQ, CONTACT_US, DELETE_ACCOUNT, CONTACTS_VIEWS, STATUS_VIEWS, TAF_VIA_SETTINGS, TAF_VIA_CONTACTS_LIST, TAF_VIA_CONTACTPICKER_MENU, TAF_VIA_EMPTY, TAF_VIA_INVITE_NON_WA_CONTACT, TAF_VIA_CONTACT_PICKER_LIST, TAF_VIA_CONTACTSFRAGMENT_MENU, TELL_A_FRIEND, FAVORITES_VIEWS, CHAT_DELETE, CHAT_CLEAR, CHAT_ARCHIVE, CHATS_ALL_DELETE, CHATS_ALL_CLEAR, CHATS_ALL_ARCHIVE};
                default:
                    strArr2[i2] = str;
                    str = "\u000fi\u0000\u001e%\u0012i\u0019\u0004>\u000b|\u001f";
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

    private au(int i) {
        this.b = i;
    }
}
