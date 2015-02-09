package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum a7 {
    ;
    public static final a7 CONTACTPICKER_LIST;
    public static final a7 CONTACTPICKER_MENU;
    public static final a7 CONTACTS_LIST;
    public static final a7 CONTACTS_MENU;
    public static final a7 EMPTY_CALLS;
    public static final a7 EMPTY_CONTACTS;
    public static final a7 EMPTY_CONVERSATIONS;
    public static final a7 INVITE_NON_WA_CONTACT;
    public static final a7 SETTINGS_CONTACTS;
    private static final a7[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[9];
        String str = "\u001c\tx\n?\u001c\u0012f\u0017=\u0014\u0003d\u00012\u0016\u0015b";
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
                        i4 = 95;
                        break;
                    case ay.f /*1*/:
                        i4 = 70;
                        break;
                    case ay.n /*2*/:
                        i4 = 54;
                        break;
                    case ay.p /*3*/:
                        i4 = 94;
                        break;
                    default:
                        i4 = 126;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u001c\tx\n?\u001c\u0012f\u0017=\u0014\u0003d\u00013\u001a\bc";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u001a\u000bf\n'\u0000\u0005w\u00122\f";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\u0016\b`\u0017*\u001a\u0019x\u00110\u0000\u0011w\u0001=\u0010\bb\u001f=\u000b";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\f\u0003b\n7\u0011\u0001e\u0001=\u0010\bb\u001f=\u000b\u0015";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u001c\tx\n?\u001c\u0012e\u00013\u001a\bc";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u001a\u000bf\n'\u0000\u0005y\u0010(\u001a\u0014e\u001f*\u0016\tx\r";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u001a\u000bf\n'\u0000\u0005y\u0010*\u001e\u0005b\r";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SETTINGS_CONTACTS = new a7(z[5], 0, 1);
                    CONTACTS_LIST = new a7(z[1], 1, 2);
                    CONTACTS_MENU = new a7(z[6], 2, 3);
                    CONTACTPICKER_LIST = new a7(z[0], 3, 4);
                    CONTACTPICKER_MENU = new a7(z[2], 4, 5);
                    EMPTY_CONVERSATIONS = new a7(z[7], 5, 6);
                    EMPTY_CONTACTS = new a7(z[8], 6, 7);
                    INVITE_NON_WA_CONTACT = new a7(z[4], 7, 8);
                    EMPTY_CALLS = new a7(z[3], 8, 9);
                    b = new a7[]{SETTINGS_CONTACTS, CONTACTS_LIST, CONTACTS_MENU, CONTACTPICKER_LIST, CONTACTPICKER_MENU, EMPTY_CONVERSATIONS, EMPTY_CONTACTS, INVITE_NON_WA_CONTACT, EMPTY_CALLS};
                default:
                    strArr2[i2] = str;
                    str = "\u001c\tx\n?\u001c\u0012e\u00012\u0016\u0015b";
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

    private a7(int i) {
        this.a = i;
    }
}
