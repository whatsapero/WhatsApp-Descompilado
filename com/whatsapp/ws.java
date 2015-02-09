package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ws extends AsyncTask {
    private static final String[] z;
    s a;
    String b;
    de c;
    String d;
    final VerifySms e;

    static {
        String[] strArr = new String[64];
        String str = ",*,";
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
                        i3 = 95;
                        break;
                    case ay.f /*1*/:
                        i3 = 71;
                        break;
                    case ay.n /*2*/:
                        i3 = 95;
                        break;
                    case ay.p /*3*/:
                        i3 = 69;
                        break;
                    default:
                        i3 = 125;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ",\"-3\u0018-j, \u0013;j- \f*\",1P:5-*\u000fr216\r:$6#\u0014:#";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = ",\"-3\u0018-j, \u0013;j- \f*\",1P/503\u0014;\"-h\t6*:*\b+";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "p3-,\u0018;30*\u0010>)&1\u00142\",$\u00113*:1\u00150#,j\t6*:h\u001303r,\u0013+";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ",\"-3\u0018-j, \u0013;j- \f*\",1P=&;h\r>5>(";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "=&;e\r>5>(\u0018+\"-";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0004*\r \f*\",1>0#:\u0017\u0018,231]64\u007f+\b3+\u0002e\u000e:$0+\u0019,";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = ",\"-3\u0018-j, \u0013;j- \f*\",1P+(0h\u0010>)&h\t-.:6P>+3h\u0010:37*\u0019,";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = ",\"-3\u0018-j, \u0013;j- \f*\",1P1\"'1P2\"+-\u0012;";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = ",\"-3\u0018-j, \u0013;j- \f*\",1P1(r7\u0012*3:6";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "p):=\tr*:1\u00150#";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = ",\"-3\u0018-j, \u0013;j- \f*\",1P+(0h\u0010>)&h\t-.:6";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "p30*P-\"< \u0013+g($\u0014+g";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "p30*P2&1<P82:6\u000e:4";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "p%>!P/&-$\u0010:3:7";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "p%3*\u001e4\";";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "p216\r:$6#\u0014:#";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = ",\"-3\u0018-j, \u0013;j- \f*\",1P/503\u0014;\"-h\b1500\t>%3 ";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "p)0h\u000f02+ \u000e";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "p%>!P/&-$\u0010:3:7";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "p30*P2&1<P82:6\u000e:4p1\u00142\"r+\u0012+j6+\t";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = ",\"-3\u0018-j, \u0013;j- \f*\",1P=&;h\t0,:+";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = ",\"-3\u0018-j, \u0013;j- \f*\",1P:5-*\u000fr$0+\u0013:$+,\u000b63&";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "p7-*\u000b6#:7P+.2 \u0012*3";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "p1:7\u000e6(1h\t0(r*\u0011;";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "p30*P2&1<P+56 \u000er&3)P2\"+-\u0012;4";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "p3:(\rr21$\u000b>.3";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = ",\"-3\u0018-j, \u0013;j- \f*\",1P*4:7P=+0&\u0016:#";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "p1:7\u00149.:!R0,";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u007fh) \u000f6!6 \u0019p(4j\u001b>.3 \u0019r30h\b/#>1\u0018r\"'5\u0014-&+,\u00121";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = ",\"-3\u0018-j, \u0013;j- \f*\",1P2.,6\u00141 r5\u001c-&2";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "2.,6\u00141 \u007f5\u001c-&2 \t:5";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "p30*P2&1<P+56 \u000e";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = ",\"-3\u0018-j, \u0013;j- \f*\",1P+(0h\u000f:$:+\t";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = ",\"-3\u0018-j, \u0013;j- \f*\",1P+\"25P*)>3\u001c6+>'\u0011:";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "p7-*\u000b6#:7P*)-*\b+&=)\u0018";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = ",\"-3\u0018-j, \u0013;j- \f*\",1P+(0h\u0010>)&h\u001a*\",6\u0018,";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "p*66\u000e6)8h\r>5>(\u0018+\"-";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "p4+$\t*4p \u000f-(-j\u0004:4r2\u0014+/r&\u0012;\"";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "p\"-7\u0012-g";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = ")\"-,\u001b&426R-\".0\u0018,3p";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "p.0 \u000f-(-e";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ")\"-,\u001b&426R-\".0\u0018,3\u007f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onPostExecute(Object obj) {
        a((avc) obj);
    }

    protected ws(VerifySms verifySms) {
        this.e = verifySms;
        this.b = z[0];
        this.d = "s";
        this.a = new s(x0.ERROR_UNSPECIFIED);
        Log.i(z[1] + this.d);
    }

    protected void onPreExecute() {
        VerifySms.a(2);
        VerifySms.t(this.e);
        VerifySms.s(this.e);
        VerifySms.b(this.e);
        App.p.m();
    }

    protected Object doInBackground(Object[] objArr) {
        return a((String[]) objArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(com.whatsapp.avc r11) {
        /*
        r10_this = this;
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = 31;
        r5 = 30;
        r4 = 3;
        r1 = com.whatsapp.App.az;
        r0 = "";
        com.whatsapp.VerifyNumber.k = r0;
        r0 = com.whatsapp.avc.OK;
        if (r11 != r0) goto L_0x005d;
    L_0x0011:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 46;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r10.d;
        r0 = r0.append(r2);
        r2 = z;
        r3 = 44;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.p;
        r2 = r10.c;
        r2 = r2.g;
        com.whatsapp.App.f(r0, r2);
        r0 = r10.c;
        r0 = r0.e;
        r2 = r10.c;
        r2 = r2.g;
        com.whatsapp.a54.a(r0, r2);
        r0 = com.whatsapp.atf.WHATSAPP_INITIATED;	 Catch:{ NumberFormatException -> 0x0648 }
        r2 = r10.c;	 Catch:{ NumberFormatException -> 0x0648 }
        r2 = r2.b;	 Catch:{ NumberFormatException -> 0x0648 }
        r2 = r2 * r8;
        com.whatsapp.ac.a(r0, r2);	 Catch:{ NumberFormatException -> 0x0648 }
    L_0x0055:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0671 }
        r2 = 1;
        com.whatsapp.VerifySms.a(r0, r2);	 Catch:{ NumberFormatException -> 0x0671 }
        if (r1 == 0) goto L_0x0647;
    L_0x005d:
        r0 = com.whatsapp.avc.YES;	 Catch:{ NumberFormatException -> 0x0671 }
        if (r11 == r0) goto L_0x0631;
    L_0x0061:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0673 }
        com.whatsapp.VerifySms.j(r0);	 Catch:{ NumberFormatException -> 0x0673 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0673 }
        com.whatsapp.VerifySms.q(r0);	 Catch:{ NumberFormatException -> 0x0673 }
        r0 = com.whatsapp.avc.ERROR_TEMPORARILY_UNAVAILABLE;	 Catch:{ NumberFormatException -> 0x0673 }
        if (r11 != r0) goto L_0x00c3;
    L_0x006f:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0675 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0675 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0675 }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0675 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0675 }
        r2 = r10.d;	 Catch:{ NumberFormatException -> 0x0675 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0675 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0675 }
        r3 = 41;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0675 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0675 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0675 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0675 }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x0675 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0675 }
        com.whatsapp.VerifySms.t(r0);	 Catch:{ NumberFormatException -> 0x0675 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0675 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0675 }
        r3 = 53;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0675 }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x0675 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0675 }
        com.whatsapp.VerifySms.l(r0);	 Catch:{ NumberFormatException -> 0x0675 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0675 }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x0675 }
        if (r0 != 0) goto L_0x00bc;
    L_0x00b4:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0677 }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x0677 }
        if (r0 == 0) goto L_0x0647;
    L_0x00bc:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0679 }
        r0.a();	 Catch:{ NumberFormatException -> 0x0679 }
        if (r1 == 0) goto L_0x0647;
    L_0x00c3:
        r0 = com.whatsapp.avc.ERROR_UNSPECIFIED;	 Catch:{ NumberFormatException -> 0x067b }
        if (r11 != r0) goto L_0x011a;
    L_0x00c7:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x067d }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x067d }
        r2 = z;	 Catch:{ NumberFormatException -> 0x067d }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x067d }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x067d }
        r2 = r10.d;	 Catch:{ NumberFormatException -> 0x067d }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x067d }
        r2 = z;	 Catch:{ NumberFormatException -> 0x067d }
        r3 = 25;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x067d }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x067d }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x067d }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x067d }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x067d }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x067d }
        com.whatsapp.VerifySms.t(r0);	 Catch:{ NumberFormatException -> 0x067d }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x067d }
        r2 = z;	 Catch:{ NumberFormatException -> 0x067d }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x067d }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x067d }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x067d }
        com.whatsapp.VerifySms.l(r0);	 Catch:{ NumberFormatException -> 0x067d }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x067d }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x067d }
        if (r0 != 0) goto L_0x0113;
    L_0x010b:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x067f }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x067f }
        if (r0 == 0) goto L_0x0647;
    L_0x0113:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0681 }
        r0.a();	 Catch:{ NumberFormatException -> 0x0681 }
        if (r1 == 0) goto L_0x0647;
    L_0x011a:
        r0 = com.whatsapp.avc.ERROR_TOO_MANY;	 Catch:{ NumberFormatException -> 0x0683 }
        if (r11 != r0) goto L_0x0172;
    L_0x011e:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0685 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0685 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0685 }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0685 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0685 }
        r2 = r10.d;	 Catch:{ NumberFormatException -> 0x0685 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0685 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0685 }
        r3 = 51;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0685 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0685 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0685 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0685 }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x0685 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0685 }
        com.whatsapp.VerifySms.t(r0);	 Catch:{ NumberFormatException -> 0x0685 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0685 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0685 }
        r3 = 18;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0685 }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x0685 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0685 }
        com.whatsapp.VerifySms.l(r0);	 Catch:{ NumberFormatException -> 0x0685 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0685 }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x0685 }
        if (r0 != 0) goto L_0x016b;
    L_0x0163:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0687 }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x0687 }
        if (r0 == 0) goto L_0x0647;
    L_0x016b:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0689 }
        r0.a();	 Catch:{ NumberFormatException -> 0x0689 }
        if (r1 == 0) goto L_0x0647;
    L_0x0172:
        r0 = com.whatsapp.avc.ERROR_TOO_MANY_ALL_METHODS;	 Catch:{ NumberFormatException -> 0x068b }
        if (r11 != r0) goto L_0x01fe;
    L_0x0176:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x068d }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x068d }
        r2 = z;	 Catch:{ NumberFormatException -> 0x068d }
        r3 = 31;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x068d }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x068d }
        r2 = r10.d;	 Catch:{ NumberFormatException -> 0x068d }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x068d }
        r2 = z;	 Catch:{ NumberFormatException -> 0x068d }
        r3 = 40;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x068d }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x068d }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x068d }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x068d }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x068d }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x068d }
        com.whatsapp.VerifySms.t(r0);	 Catch:{ NumberFormatException -> 0x068d }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x068d }
        r2 = z;	 Catch:{ NumberFormatException -> 0x068d }
        r3 = 14;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x068d }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x068d }
        r0 = 1;
        com.whatsapp.VerifySms.b(r0);	 Catch:{ NumberFormatException -> 0x068d }
        r0 = r10.c;	 Catch:{ NumberFormatException -> 0x068d }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x068d }
        if (r0 != 0) goto L_0x01c3;
    L_0x01ba:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x068f }
        r2 = 30;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x068f }
        if (r1 == 0) goto L_0x01e9;
    L_0x01c3:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0691 }
        r2 = r10.c;	 Catch:{ NumberFormatException -> 0x0691 }
        r2 = r2.c;	 Catch:{ NumberFormatException -> 0x0691 }
        r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x0691 }
        r2 = r2 * r8;
        com.whatsapp.VerifySms.d(r0, r2);	 Catch:{ NumberFormatException -> 0x0691 }
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0691 }
        r2 = r10.e;	 Catch:{ NumberFormatException -> 0x0691 }
        r2 = com.whatsapp.VerifySms.p(r2);	 Catch:{ NumberFormatException -> 0x0691 }
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x0691 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0691 }
        r2 = 1;
        com.whatsapp.VerifySms.b(r0, r2);	 Catch:{ NumberFormatException -> 0x0691 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0691 }
        r2 = 35;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x0691 }
    L_0x01e9:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06be }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x06be }
        if (r0 != 0) goto L_0x01f7;
    L_0x01ef:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06be }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x06be }
        if (r0 == 0) goto L_0x0647;
    L_0x01f7:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06c0 }
        r0.a();	 Catch:{ NumberFormatException -> 0x06c0 }
        if (r1 == 0) goto L_0x0647;
    L_0x01fe:
        r0 = com.whatsapp.avc.ERROR_CONNECTIVITY;	 Catch:{ NumberFormatException -> 0x06c2 }
        if (r11 != r0) goto L_0x0230;
    L_0x0202:
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x06c4 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06c4 }
        com.whatsapp.VerifySms.t(r0);	 Catch:{ NumberFormatException -> 0x06c4 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06c4 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06c4 }
        r3 = 37;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06c4 }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x06c4 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06c4 }
        com.whatsapp.VerifySms.l(r0);	 Catch:{ NumberFormatException -> 0x06c4 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06c4 }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x06c4 }
        if (r0 != 0) goto L_0x0229;
    L_0x0221:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06c6 }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x06c6 }
        if (r0 == 0) goto L_0x0647;
    L_0x0229:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06c8 }
        r0.a();	 Catch:{ NumberFormatException -> 0x06c8 }
        if (r1 == 0) goto L_0x0647;
    L_0x0230:
        r0 = com.whatsapp.avc.ERROR_BAD_PARAMETER;	 Catch:{ NumberFormatException -> 0x06ca }
        if (r11 != r0) goto L_0x0290;
    L_0x0234:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x06cc }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x06cc }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06cc }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06cc }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06cc }
        r2 = r10.d;	 Catch:{ NumberFormatException -> 0x06cc }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06cc }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06cc }
        r3 = 23;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06cc }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06cc }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x06cc }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x06cc }
        r0 = z;	 Catch:{ NumberFormatException -> 0x06cc }
        r2 = 11;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x06cc }
        com.whatsapp.App.v(r0);	 Catch:{ NumberFormatException -> 0x06cc }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x06cc }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06cc }
        com.whatsapp.VerifySms.t(r0);	 Catch:{ NumberFormatException -> 0x06cc }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06cc }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06cc }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06cc }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x06cc }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06cc }
        com.whatsapp.VerifySms.l(r0);	 Catch:{ NumberFormatException -> 0x06cc }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06cc }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x06cc }
        if (r0 != 0) goto L_0x0289;
    L_0x0281:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06ce }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x06ce }
        if (r0 == 0) goto L_0x0647;
    L_0x0289:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06d0 }
        r0.a();	 Catch:{ NumberFormatException -> 0x06d0 }
        if (r1 == 0) goto L_0x0647;
    L_0x0290:
        r0 = com.whatsapp.avc.ERROR_MISSING_PARAMETER;	 Catch:{ NumberFormatException -> 0x06d2 }
        if (r11 != r0) goto L_0x02f1;
    L_0x0294:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x06d4 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x06d4 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06d4 }
        r3 = 21;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06d4 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06d4 }
        r2 = r10.d;	 Catch:{ NumberFormatException -> 0x06d4 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06d4 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06d4 }
        r3 = 56;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06d4 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06d4 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x06d4 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x06d4 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x06d4 }
        r2 = 50;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x06d4 }
        com.whatsapp.App.v(r0);	 Catch:{ NumberFormatException -> 0x06d4 }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x06d4 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06d4 }
        com.whatsapp.VerifySms.t(r0);	 Catch:{ NumberFormatException -> 0x06d4 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06d4 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06d4 }
        r3 = 48;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06d4 }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x06d4 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06d4 }
        com.whatsapp.VerifySms.l(r0);	 Catch:{ NumberFormatException -> 0x06d4 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06d4 }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x06d4 }
        if (r0 != 0) goto L_0x02ea;
    L_0x02e2:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06d6 }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x06d6 }
        if (r0 == 0) goto L_0x0647;
    L_0x02ea:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06d8 }
        r0.a();	 Catch:{ NumberFormatException -> 0x06d8 }
        if (r1 == 0) goto L_0x0647;
    L_0x02f1:
        r0 = com.whatsapp.avc.ERROR_OLD_VERSION;	 Catch:{ NumberFormatException -> 0x06da }
        if (r11 != r0) goto L_0x0331;
    L_0x02f5:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x06dc }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x06dc }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06dc }
        r3 = 45;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06dc }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06dc }
        r2 = r10.d;	 Catch:{ NumberFormatException -> 0x06dc }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06dc }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06dc }
        r3 = 39;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06dc }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06dc }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x06dc }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x06dc }
        r0 = 1;
        com.whatsapp.App.T = r0;	 Catch:{ NumberFormatException -> 0x06dc }
        r0 = 8;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x06dc }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06dc }
        com.whatsapp.VerifySms.t(r0);	 Catch:{ NumberFormatException -> 0x06dc }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06dc }
        r2 = 23;
        r0.c(r2);	 Catch:{ NumberFormatException -> 0x06dc }
        if (r1 == 0) goto L_0x0647;
    L_0x0331:
        r0 = com.whatsapp.avc.ERROR_TOO_RECENT;	 Catch:{ NumberFormatException -> 0x06de }
        if (r11 != r0) goto L_0x0395;
    L_0x0335:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x06e0 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x06e0 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06e0 }
        r3 = 28;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06e0 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06e0 }
        r2 = r10.d;	 Catch:{ NumberFormatException -> 0x06e0 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06e0 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06e0 }
        r3 = 19;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06e0 }
        r2 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06e0 }
        r0 = r10.c;	 Catch:{ NumberFormatException -> 0x06e0 }
        if (r0 == 0) goto L_0x06e4;
    L_0x0358:
        r0 = r10.c;	 Catch:{ NumberFormatException -> 0x06e2 }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x06e2 }
    L_0x035c:
        r0 = r2.append(r0);	 Catch:{ NumberFormatException -> 0x06ec }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x06ec }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x06ec }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x06ec }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06ec }
        com.whatsapp.VerifySms.t(r0);	 Catch:{ NumberFormatException -> 0x06ec }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06ec }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06ec }
        r3 = 52;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06ec }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x06ec }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06ec }
        com.whatsapp.VerifySms.l(r0);	 Catch:{ NumberFormatException -> 0x06ec }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06ec }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x06ec }
        if (r0 != 0) goto L_0x038e;
    L_0x0386:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06ec }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x06ec }
        if (r0 == 0) goto L_0x0647;
    L_0x038e:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06ee }
        r0.a();	 Catch:{ NumberFormatException -> 0x06ee }
        if (r1 == 0) goto L_0x0647;
    L_0x0395:
        r0 = com.whatsapp.avc.ERROR_BLOCKED;	 Catch:{ NumberFormatException -> 0x06f0 }
        if (r11 != r0) goto L_0x03ee;
    L_0x0399:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x06f2 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x06f2 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06f2 }
        r3 = 26;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06f2 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06f2 }
        r2 = r10.d;	 Catch:{ NumberFormatException -> 0x06f2 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06f2 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06f2 }
        r3 = 24;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06f2 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06f2 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x06f2 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x06f2 }
        r0 = 12;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x06f2 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06f2 }
        com.whatsapp.VerifySms.t(r0);	 Catch:{ NumberFormatException -> 0x06f2 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06f2 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06f2 }
        r3 = 42;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06f2 }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x06f2 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06f2 }
        com.whatsapp.VerifySms.u(r0);	 Catch:{ NumberFormatException -> 0x06f2 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06f2 }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x06f2 }
        if (r0 != 0) goto L_0x03e7;
    L_0x03df:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06f4 }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x06f4 }
        if (r0 == 0) goto L_0x0647;
    L_0x03e7:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06f6 }
        r0.a();	 Catch:{ NumberFormatException -> 0x06f6 }
        if (r1 == 0) goto L_0x0647;
    L_0x03ee:
        r0 = com.whatsapp.avc.ERROR_NEXT_METHOD;	 Catch:{ NumberFormatException -> 0x06f8 }
        if (r11 != r0) goto L_0x0446;
    L_0x03f2:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x06fa }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x06fa }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06fa }
        r3 = 20;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06fa }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06fa }
        r2 = r10.d;	 Catch:{ NumberFormatException -> 0x06fa }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06fa }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06fa }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06fa }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x06fa }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x06fa }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x06fa }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x06fa }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06fa }
        com.whatsapp.VerifySms.t(r0);	 Catch:{ NumberFormatException -> 0x06fa }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06fa }
        r2 = z;	 Catch:{ NumberFormatException -> 0x06fa }
        r3 = 15;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x06fa }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x06fa }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06fa }
        com.whatsapp.VerifySms.l(r0);	 Catch:{ NumberFormatException -> 0x06fa }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06fa }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x06fa }
        if (r0 != 0) goto L_0x043f;
    L_0x0437:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06fc }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x06fc }
        if (r0 == 0) goto L_0x0647;
    L_0x043f:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x06fe }
        r0.a();	 Catch:{ NumberFormatException -> 0x06fe }
        if (r1 == 0) goto L_0x0647;
    L_0x0446:
        r0 = com.whatsapp.avc.ERROR_NO_ROUTES;	 Catch:{ NumberFormatException -> 0x0700 }
        if (r11 != r0) goto L_0x049e;
    L_0x044a:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0702 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0702 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0702 }
        r3 = 35;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0702 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0702 }
        r2 = r10.d;	 Catch:{ NumberFormatException -> 0x0702 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0702 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0702 }
        r3 = 29;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0702 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0702 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0702 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0702 }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x0702 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0702 }
        com.whatsapp.VerifySms.t(r0);	 Catch:{ NumberFormatException -> 0x0702 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0702 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0702 }
        r3 = 16;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0702 }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x0702 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0702 }
        com.whatsapp.VerifySms.l(r0);	 Catch:{ NumberFormatException -> 0x0702 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0702 }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x0702 }
        if (r0 != 0) goto L_0x0497;
    L_0x048f:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0704 }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x0704 }
        if (r0 == 0) goto L_0x0647;
    L_0x0497:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0706 }
        r0.a();	 Catch:{ NumberFormatException -> 0x0706 }
        if (r1 == 0) goto L_0x0647;
    L_0x049e:
        r0 = com.whatsapp.avc.ERROR_TOO_MANY_GUESSES;	 Catch:{ NumberFormatException -> 0x0708 }
        if (r11 != r0) goto L_0x052b;
    L_0x04a2:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x070a }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x070a }
        r2 = z;	 Catch:{ NumberFormatException -> 0x070a }
        r3 = 57;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x070a }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x070a }
        r2 = r10.d;	 Catch:{ NumberFormatException -> 0x070a }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x070a }
        r2 = z;	 Catch:{ NumberFormatException -> 0x070a }
        r3 = 22;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x070a }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x070a }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x070a }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x070a }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x070a }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x070a }
        com.whatsapp.VerifySms.t(r0);	 Catch:{ NumberFormatException -> 0x070a }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x070a }
        r2 = z;	 Catch:{ NumberFormatException -> 0x070a }
        r3 = 55;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x070a }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x070a }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x070a }
        com.whatsapp.VerifySms.l(r0);	 Catch:{ NumberFormatException -> 0x070a }
        r0 = r10.c;	 Catch:{ NumberFormatException -> 0x070a }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x070a }
        if (r0 != 0) goto L_0x04f0;
    L_0x04e7:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x070c }
        r2 = 31;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x070c }
        if (r1 == 0) goto L_0x0516;
    L_0x04f0:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x070e }
        r2 = r10.c;	 Catch:{ NumberFormatException -> 0x070e }
        r2 = r2.c;	 Catch:{ NumberFormatException -> 0x070e }
        r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x070e }
        r2 = r2 * r8;
        com.whatsapp.VerifySms.d(r0, r2);	 Catch:{ NumberFormatException -> 0x070e }
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x070e }
        r2 = r10.e;	 Catch:{ NumberFormatException -> 0x070e }
        r2 = com.whatsapp.VerifySms.p(r2);	 Catch:{ NumberFormatException -> 0x070e }
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x070e }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x070e }
        r2 = 1;
        com.whatsapp.VerifySms.b(r0, r2);	 Catch:{ NumberFormatException -> 0x070e }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x070e }
        r2 = 36;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x070e }
    L_0x0516:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x073a }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x073a }
        if (r0 != 0) goto L_0x0524;
    L_0x051c:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x073c }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x073c }
        if (r0 == 0) goto L_0x0647;
    L_0x0524:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x073e }
        r0.a();	 Catch:{ NumberFormatException -> 0x073e }
        if (r1 == 0) goto L_0x0647;
    L_0x052b:
        r0 = com.whatsapp.avc.ERROR_PROVIDER_TIMEOUT;	 Catch:{ NumberFormatException -> 0x0740 }
        if (r11 != r0) goto L_0x0582;
    L_0x052f:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0742 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0742 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0742 }
        r3 = 49;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0742 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0742 }
        r2 = r10.d;	 Catch:{ NumberFormatException -> 0x0742 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0742 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0742 }
        r3 = 38;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0742 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0742 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0742 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0742 }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x0742 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0742 }
        com.whatsapp.VerifySms.t(r0);	 Catch:{ NumberFormatException -> 0x0742 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0742 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0742 }
        r3 = 4;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0742 }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x0742 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0742 }
        com.whatsapp.VerifySms.l(r0);	 Catch:{ NumberFormatException -> 0x0742 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0742 }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x0742 }
        if (r0 != 0) goto L_0x057b;
    L_0x0573:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0744 }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x0744 }
        if (r0 == 0) goto L_0x0647;
    L_0x057b:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0746 }
        r0.a();	 Catch:{ NumberFormatException -> 0x0746 }
        if (r1 == 0) goto L_0x0647;
    L_0x0582:
        r0 = com.whatsapp.avc.ERROR_PROVIDER_UNROUTABLE;	 Catch:{ NumberFormatException -> 0x0748 }
        if (r11 != r0) goto L_0x05da;
    L_0x0586:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x074a }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x074a }
        r2 = z;	 Catch:{ NumberFormatException -> 0x074a }
        r3 = 33;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x074a }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x074a }
        r2 = r10.d;	 Catch:{ NumberFormatException -> 0x074a }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x074a }
        r2 = z;	 Catch:{ NumberFormatException -> 0x074a }
        r3 = 54;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x074a }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x074a }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x074a }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x074a }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x074a }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x074a }
        com.whatsapp.VerifySms.t(r0);	 Catch:{ NumberFormatException -> 0x074a }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x074a }
        r2 = z;	 Catch:{ NumberFormatException -> 0x074a }
        r3 = 27;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x074a }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x074a }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x074a }
        com.whatsapp.VerifySms.l(r0);	 Catch:{ NumberFormatException -> 0x074a }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x074a }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x074a }
        if (r0 != 0) goto L_0x05d3;
    L_0x05cb:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x074c }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x074c }
        if (r0 == 0) goto L_0x0647;
    L_0x05d3:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x074e }
        r0.a();	 Catch:{ NumberFormatException -> 0x074e }
        if (r1 == 0) goto L_0x0647;
    L_0x05da:
        r0 = com.whatsapp.avc.ERROR_BAD_TOKEN;	 Catch:{ NumberFormatException -> 0x0750 }
        if (r11 != r0) goto L_0x0647;
    L_0x05de:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0752 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0752 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0752 }
        r3 = 5;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0752 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0752 }
        r2 = r10.d;	 Catch:{ NumberFormatException -> 0x0752 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0752 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0752 }
        r3 = 30;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0752 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0752 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0752 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0752 }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x0752 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0752 }
        com.whatsapp.VerifySms.t(r0);	 Catch:{ NumberFormatException -> 0x0752 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0752 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0752 }
        r3 = 34;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0752 }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x0752 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0752 }
        com.whatsapp.VerifySms.l(r0);	 Catch:{ NumberFormatException -> 0x0752 }
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0752 }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x0752 }
        if (r0 != 0) goto L_0x062a;
    L_0x0622:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0754 }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x0754 }
        if (r0 == 0) goto L_0x0647;
    L_0x062a:
        r0 = r10.e;	 Catch:{ NumberFormatException -> 0x0756 }
        r0.a();	 Catch:{ NumberFormatException -> 0x0756 }
        if (r1 == 0) goto L_0x0647;
    L_0x0631:
        r0 = r10.c;	 Catch:{ NumberFormatException -> 0x0758 }
        r0 = r0.d;	 Catch:{ NumberFormatException -> 0x0758 }
        if (r0 == 0) goto L_0x0647;
    L_0x0637:
        r0 = r10.c;	 Catch:{ NumberFormatException -> 0x0758 }
        r0 = r0.d;	 Catch:{ NumberFormatException -> 0x0758 }
        com.whatsapp.VerifySms.c(r0);	 Catch:{ NumberFormatException -> 0x0758 }
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0758 }
        r1 = r10.c;	 Catch:{ NumberFormatException -> 0x0758 }
        r1 = r1.d;	 Catch:{ NumberFormatException -> 0x0758 }
        com.whatsapp.App.a(r0, r1);	 Catch:{ NumberFormatException -> 0x0758 }
    L_0x0647:
        return;
    L_0x0648:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 36;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r10.d;
        r0 = r0.append(r2);
        r2 = z;
        r3 = 47;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0055;
    L_0x0671:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0673 }
    L_0x0673:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0675 }
    L_0x0675:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0677 }
    L_0x0677:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0679 }
    L_0x0679:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x067b }
    L_0x067b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x067d }
    L_0x067d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x067f }
    L_0x067f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0681 }
    L_0x0681:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0683 }
    L_0x0683:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0685 }
    L_0x0685:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0687 }
    L_0x0687:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0689 }
    L_0x0689:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x068b }
    L_0x068b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x068d }
    L_0x068d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x068f }
    L_0x068f:
        r0 = move-exception;
        throw r0;
    L_0x0691:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 43;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r10.d;
        r0 = r0.append(r2);
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = r10.e;
        r0.e(r5);
        goto L_0x01e9;
    L_0x06be:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06c0 }
    L_0x06c0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06c2 }
    L_0x06c2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06c4 }
    L_0x06c4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06c6 }
    L_0x06c6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06c8 }
    L_0x06c8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06ca }
    L_0x06ca:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06cc }
    L_0x06cc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06ce }
    L_0x06ce:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06d0 }
    L_0x06d0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06d2 }
    L_0x06d2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06d4 }
    L_0x06d4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06d6 }
    L_0x06d6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06d8 }
    L_0x06d8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06da }
    L_0x06da:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06dc }
    L_0x06dc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06de }
    L_0x06de:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06e0 }
    L_0x06e0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06e2 }
    L_0x06e2:
        r0 = move-exception;
        throw r0;
    L_0x06e4:
        r0 = z;
        r3 = 12;
        r0 = r0[r3];
        goto L_0x035c;
    L_0x06ec:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06ee }
    L_0x06ee:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06f0 }
    L_0x06f0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06f2 }
    L_0x06f2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06f4 }
    L_0x06f4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06f6 }
    L_0x06f6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06f8 }
    L_0x06f8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06fa }
    L_0x06fa:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06fc }
    L_0x06fc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x06fe }
    L_0x06fe:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0700 }
    L_0x0700:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0702 }
    L_0x0702:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0704 }
    L_0x0704:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0706 }
    L_0x0706:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0708 }
    L_0x0708:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x070a }
    L_0x070a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x070c }
    L_0x070c:
        r0 = move-exception;
        throw r0;
    L_0x070e:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r2 = r2[r4];
        r0 = r0.append(r2);
        r2 = r10.d;
        r0 = r0.append(r2);
        r2 = z;
        r3 = 32;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = r10.e;
        r0.e(r6);
        goto L_0x0516;
    L_0x073a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x073c }
    L_0x073c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x073e }
    L_0x073e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0740 }
    L_0x0740:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0742 }
    L_0x0742:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0744 }
    L_0x0744:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0746 }
    L_0x0746:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0748 }
    L_0x0748:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x074a }
    L_0x074a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x074c }
    L_0x074c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x074e }
    L_0x074e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0750 }
    L_0x0750:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0752 }
    L_0x0752:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0754 }
    L_0x0754:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0756 }
    L_0x0756:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0758 }
    L_0x0758:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ws.a(com.whatsapp.avc):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected com.whatsapp.avc a(java.lang.String[] r8) {
        /*
        r7_this = this;
        r1 = com.whatsapp.avc.ERROR_UNSPECIFIED;
        r0 = r7.e;	 Catch:{ IOException -> 0x0066, Exception -> 0x0098 }
        r2 = r7.e;	 Catch:{ IOException -> 0x0066, Exception -> 0x0098 }
        r2 = com.whatsapp.VerifySms.A(r2);	 Catch:{ IOException -> 0x0066, Exception -> 0x0098 }
        r3 = r7.e;	 Catch:{ IOException -> 0x0066, Exception -> 0x0098 }
        r3 = com.whatsapp.VerifySms.a(r3);	 Catch:{ IOException -> 0x0066, Exception -> 0x0098 }
        r4 = r7.b;	 Catch:{ IOException -> 0x0066, Exception -> 0x0098 }
        r5 = com.whatsapp.VerifyNumber.k;	 Catch:{ IOException -> 0x0066, Exception -> 0x0098 }
        r0 = com.whatsapp.VerifyNumber.a(r0, r2, r3, r4, r5);	 Catch:{ IOException -> 0x0066, Exception -> 0x0098 }
        r7.c = r0;	 Catch:{ IOException -> 0x0066, Exception -> 0x0098 }
        r0 = r7.c;	 Catch:{ IOException -> 0x0066, Exception -> 0x0098 }
        r0 = r0.f;	 Catch:{ IOException -> 0x0066, Exception -> 0x0098 }
        r1 = com.whatsapp.avc.YES_WITH_CODE;	 Catch:{ IOException -> 0x005e, Exception -> 0x00c3 }
        if (r0 != r1) goto L_0x004c;
    L_0x0022:
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x005e, Exception -> 0x00c3 }
        r1.<init>();	 Catch:{ IOException -> 0x005e, Exception -> 0x00c3 }
        r2 = z;	 Catch:{ IOException -> 0x005e, Exception -> 0x00c3 }
        r3 = 60;
        r2 = r2[r3];	 Catch:{ IOException -> 0x005e, Exception -> 0x00c3 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x005e, Exception -> 0x00c3 }
        r2 = r7.d;	 Catch:{ IOException -> 0x005e, Exception -> 0x00c3 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x005e, Exception -> 0x00c3 }
        r2 = z;	 Catch:{ IOException -> 0x005e, Exception -> 0x00c3 }
        r3 = 58;
        r2 = r2[r3];	 Catch:{ IOException -> 0x005e, Exception -> 0x00c3 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x005e, Exception -> 0x00c3 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x005e, Exception -> 0x00c3 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IOException -> 0x005e, Exception -> 0x00c3 }
        r1 = com.whatsapp.App.az;	 Catch:{ IOException -> 0x005e, Exception -> 0x00c3 }
        if (r1 == 0) goto L_0x005d;
    L_0x004c:
        r1 = com.whatsapp.avc.YES;	 Catch:{ IOException -> 0x0060, Exception -> 0x00c3 }
        if (r0 != r1) goto L_0x005d;
    L_0x0050:
        r1 = r7.c;	 Catch:{ IOException -> 0x0062, Exception -> 0x00c3 }
        r1 = r1.d;	 Catch:{ IOException -> 0x0062, Exception -> 0x00c3 }
        if (r1 == 0) goto L_0x005d;
    L_0x0056:
        r1 = r7.c;	 Catch:{ IOException -> 0x0064, Exception -> 0x00c3 }
        r1 = r1.d;	 Catch:{ IOException -> 0x0064, Exception -> 0x00c3 }
        com.whatsapp.VerifySms.c(r1);	 Catch:{ IOException -> 0x0064, Exception -> 0x00c3 }
    L_0x005d:
        return r0;
    L_0x005e:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0060, Exception -> 0x00c3 }
    L_0x0060:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0062, Exception -> 0x00c3 }
    L_0x0062:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0064, Exception -> 0x00c3 }
    L_0x0064:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0066, Exception -> 0x00c3 }
    L_0x0066:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 62;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r7.d;
        r1 = r1.append(r2);
        r2 = z;
        r3 = 63;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = com.whatsapp.avc.ERROR_CONNECTIVITY;
        goto L_0x005d;
    L_0x0098:
        r0 = move-exception;
        r6 = r0;
        r0 = r1;
        r1 = r6;
    L_0x009c:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 59;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r7.d;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 61;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.b(r2, r1);
        goto L_0x005d;
    L_0x00c3:
        r1 = move-exception;
        goto L_0x009c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ws.a(java.lang.String[]):com.whatsapp.avc");
    }
}
