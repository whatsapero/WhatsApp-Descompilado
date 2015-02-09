package com.whatsapp.fieldstats;

import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum b3 {
    ;
    public static final b3 AIRTEL;
    public static final b3 ALFA;
    public static final b3 BANGLALINK;
    public static final b3 BEELINE;
    public static final b3 CELLC;
    public static final b3 CLARO;
    public static final b3 CLICKATELL;
    public static final b3 COSMOTE;
    public static final b3 DIGI;
    public static final b3 DJEZZY;
    public static final b3 DONT_SEND_SMS;
    public static final b3 DONT_SEND_VOICE;
    public static final b3 EMAILONLY;
    public static final b3 ETB;
    public static final b3 HIGHSIDE;
    public static final b3 HTHK;
    public static final b3 IMESSAGE;
    public static final b3 INDOSAT;
    public static final b3 INFOBIP;
    public static final b3 INFOBIPSMS;
    public static final b3 JAWWAL;
    public static final b3 MACH;
    public static final b3 MIO;
    public static final b3 MOBILY;
    public static final b3 MOBME;
    public static final b3 MOVISTAR;
    public static final b3 MTN;
    public static final b3 NAWRAS;
    public static final b3 NEXMO;
    public static final b3 OMANTEL;
    public static final b3 PERSONAL;
    public static final b3 PLIVO;
    public static final b3 ROUTO;
    public static final b3 ROUTOSMS;
    public static final b3 SELF;
    public static final b3 SMSGATEWAY;
    public static final b3 SMSGATEWAY2;
    public static final b3 SUNRISE;
    public static final b3 SYBASE;
    public static final b3 TELENOR;
    public static final b3 TELESIGNSMS;
    public static final b3 TELESIGNVOICE;
    public static final b3 TIGO;
    public static final b3 TIM;
    public static final b3 TOUCH;
    public static final b3 TROPO;
    public static final b3 TWILIO;
    public static final b3 TWILIO2;
    public static final b3 TWILIOSMS;
    public static final b3 TWILIOSMS2;
    public static final b3 TYNTEC;
    public static final b3 UFONE;
    public static final b3 VEXX;
    public static final b3 VIETTEL;
    public static final b3 VOICEWORKS;
    public static final b3 WEBAROO;
    public static final b3 XL;
    private static final b3[] a;
    private static final String[] z;
    private final int b;

    private b3(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[57];
        String str = "Z\u000ebx\u001fM\u0004";
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
                        i4 = 25;
                        break;
                    case ay.f /*1*/:
                        i4 = 65;
                        break;
                    case ay.n /*2*/:
                        i4 = 49;
                        break;
                    case ay.p /*3*/:
                        i4 = 53;
                        break;
                    default:
                        i4 = 80;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    i2 = 2;
                    strArr2 = strArr3;
                    str = "\\\fp|\u001cV\u000f}l";
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    str = "O\u000exv\u0015N\u000ec~\u0003";
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "M\u0016xy\u0019Vs";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "M\u0013~e\u001f";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "M\u0016xy\u0019V\u0012|fb";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "Z\rpg\u001f";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "X\rwt";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "S\u0000fb\u0011U";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "]\u000e\u007fa\u000fJ\u0004\u007fq\u000fO\u000exv\u0015";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "J\u0018st\u0003\\";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "T\u0015\u007f";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "T\b~";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "K\u000eda\u001f";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "M\u0018\u007fa\u0015Z";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "O\u0004im";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "M\u0016xy\u0019V";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "Q\u0015y~";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "M\b|";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "P\u000fwz\u0012P\u0011bx\u0003";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "L\u0007~{\u0015";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "M\u0004}p\u0003P\u0006\u007fc\u001fP\u0002t";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "X\bca\u0015U";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "J\fbr\u0011M\u0004ft\t+";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    str = "J\fbr\u0011M\u0004ft\t";
                    i = 24;
                    i2 = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    strArr2 = strArr3;
                    str = "Q\bv}\u0003P\u0005t";
                    i = 25;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "A\r";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "V\fp{\u0004\\\r";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "K\u000eda\u001fJ\fb";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "T\u0000r}";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "M\u0016xy\u0019V\u0012|f";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "[\u0004ty\u0019W\u0004";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "W\u0000fg\u0011J";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "[\u0000\u007fr\u001cX\rx{\u001b";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "T\u000esx\u0015";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "]\u000e\u007fa\u000fJ\u0004\u007fq\u000fJ\fb";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "I\u0004cf\u001fW\u0000}";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "P\ftf\u0003X\u0006t";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "]\bv|";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "M\bvz";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "\\\u0015s";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "P\u000fwz\u0012P\u0011";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "P\u000fuz\u0003X\u0015";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "M\u000edv\u0018";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "N\u0004st\u0002V\u000e";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "J\u0014\u007fg\u0019J\u0004";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "O\bta\u0004\\\r";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "T\u000eg|\u0003M\u0000c";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i2] = str;
                    str = "Z\rxv\u001bX\u0015ty\u001c";
                    i = 48;
                    i2 = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    strArr2 = strArr3;
                    str = "M\u0004}p\u001eV\u0013";
                    i = 49;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "J\u0004}s";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "W\u0004ix\u001f";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i2] = str;
                    str = "T\u000es|\u001c@";
                    i = 52;
                    i2 = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    strArr2 = strArr3;
                    str = "Z\u0004}y\u0013";
                    i = 53;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "I\rxc\u001f";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "]\u000bto\n@";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SELF = new b3(z[51], 0, 0);
                    CLICKATELL = new b3(z[49], 1, 1);
                    SYBASE = new b3(z[11], 2, 2);
                    SMSGATEWAY = new b3(z[25], 3, 3);
                    TROPO = new b3(z[5], 4, 4);
                    ROUTO = new b3(z[14], 5, 5);
                    INFOBIP = new b3(z[42], 6, 6);
                    ROUTOSMS = new b3(z[29], 7, 7);
                    TWILIO = new b3(z[17], 8, 8);
                    INFOBIPSMS = new b3(z[20], 9, 9);
                    TWILIOSMS = new b3(z[31], 10, 10);
                    NEXMO = new b3(z[52], 11, 11);
                    EMAILONLY = new b3(z[2], 12, 12);
                    INDOSAT = new b3(z[43], 13, 13);
                    MIO = new b3(z[13], 14, 14);
                    UFONE = new b3(z[21], 15, 15);
                    NAWRAS = new b3(z[33], 16, 16);
                    VOICEWORKS = new b3(z[3], 17, 17);
                    HTHK = new b3(z[18], 18, 18);
                    DIGI = new b3(z[39], 19, 19);
                    AIRTEL = new b3(z[23], 20, 20);
                    SMSGATEWAY2 = new b3(z[24], 21, 21);
                    XL = new b3(z[27], 22, 22);
                    TELESIGNVOICE = new b3(z[22], 23, 23);
                    MOBILY = new b3(z[53], 24, 24);
                    OMANTEL = new b3(z[28], 25, 25);
                    PLIVO = new b3(z[55], 26, 26);
                    TYNTEC = new b3(z[15], 27, 27);
                    MACH = new b3(z[30], 28, 28);
                    TELESIGNSMS = new b3(z[1], 29, 29);
                    HIGHSIDE = new b3(z[26], 30, 30);
                    IMESSAGE = new b3(z[38], 31, 31);
                    TWILIO2 = new b3(z[4], 32, 32);
                    TELENOR = new b3(z[50], 33, 33);
                    CLARO = new b3(z[7], 34, 34);
                    ALFA = new b3(z[8], 35, 35);
                    BANGLALINK = new b3(z[34], 36, 36);
                    MTN = new b3(z[12], 37, 37);
                    MOBME = new b3(z[35], 38, 38);
                    COSMOTE = new b3(z[0], 39, 39);
                    SUNRISE = new b3(z[46], 40, 40);
                    VEXX = new b3(z[16], 41, 41);
                    TOUCH = new b3(z[44], 42, 42);
                    DJEZZY = new b3(z[56], 43, 43);
                    MOVISTAR = new b3(z[48], 44, 44);
                    JAWWAL = new b3(z[9], 45, 45);
                    TWILIOSMS2 = new b3(z[6], 46, 46);
                    VIETTEL = new b3(z[47], 47, 47);
                    PERSONAL = new b3(z[37], 48, 48);
                    BEELINE = new b3(z[32], 49, 49);
                    TIGO = new b3(z[40], 50, 50);
                    ETB = new b3(z[41], 51, 51);
                    CELLC = new b3(z[54], 52, 52);
                    WEBAROO = new b3(z[45], 53, 53);
                    TIM = new b3(z[19], 54, 54);
                    DONT_SEND_SMS = new b3(z[36], 55, 98);
                    DONT_SEND_VOICE = new b3(z[10], 56, 99);
                    a = new b3[]{SELF, CLICKATELL, SYBASE, SMSGATEWAY, TROPO, ROUTO, INFOBIP, ROUTOSMS, TWILIO, INFOBIPSMS, TWILIOSMS, NEXMO, EMAILONLY, INDOSAT, MIO, UFONE, NAWRAS, VOICEWORKS, HTHK, DIGI, AIRTEL, SMSGATEWAY2, XL, TELESIGNVOICE, MOBILY, OMANTEL, PLIVO, TYNTEC, MACH, TELESIGNSMS, HIGHSIDE, IMESSAGE, TWILIO2, TELENOR, CLARO, ALFA, BANGLALINK, MTN, MOBME, COSMOTE, SUNRISE, VEXX, TOUCH, DJEZZY, MOVISTAR, JAWWAL, TWILIOSMS2, VIETTEL, PERSONAL, BEELINE, TIGO, ETB, CELLC, WEBAROO, TIM, DONT_SEND_SMS, DONT_SEND_VOICE};
                default:
                    strArr2[i2] = str;
                    str = "M\u0004}p\u0003P\u0006\u007ff\u001dJ";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
