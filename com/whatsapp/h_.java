package com.whatsapp;

import android.os.AsyncTask;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class h_ extends AsyncTask {
    private static final String[] z;
    final EnterPhoneNumber a;
    String b;
    de c;
    Runnable d;
    Runnable e;
    String f;

    static {
        String[] strArr = new String[61];
        String str = "FK";
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
                        i3 = 53;
                        break;
                    case ay.f /*1*/:
                        i3 = 45;
                        break;
                    case ay.n /*2*/:
                        i3 = 52;
                        break;
                    case ay.p /*3*/:
                        i3 = 27;
                        break;
                    default:
                        i3 = 5;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "GHRnvPI";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u001aHFijG\r";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    str = "\u001aD[~wGBF;";
                    obj = 4;
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    strArr2 = strArr3;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 5;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001aY[t(XLZb(A_]~v\u0018LXw(XH@sjQ^";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "FHX}(FHZ\u007f([B@6uP_YrqAHP";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u001aOU\u007f(AB_~k";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u001aY[t(XLZb(A_]~v";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "PC@~wEE[u`\u001a_QjpP^@6fZIQ6wPDZhqTAX";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "FHX}(FHZ\u007f([HLo(XH@sjQ";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u001a]Fts\\IQi(@CFtpALVw`";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u001aY[t(GHW~kA\u0002@rhP\u0000Ztq\u0018DZo";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u001a]Fts\\IQi(ADY~j@Y";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "PC@~wEE[u`\u001a_QjpP^@6fZIQ6wPDZhqTAX4cTDX~a";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u001aY[t(GHW~kA\u0002@rhP\u0000Ztq\u0018DZo";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "FHX}(FHZ\u007f(AB[6hTCM6b@HGh`F";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    str = "\u001aXZhuPN]}lPI";
                    obj = 26;
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    strArr2 = strArr3;
                    str = "\u001aY[t(XLZb(A_]~v";
                    obj = 27;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u001a@]hv\\CS6uT_Uv`AHF";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u001a[Qiv\\BZ6qZB\u0019tiQ";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u001aC[o(EHFvlAYQ\u007f";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "FHX}(FHZ\u007f(AB[6hTCM6qGDQh";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u001aOU\u007f(ELFzhPYQi";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u001a]Fts\\IQi(@CFtpALVw`\u001aC[6q\\@Q";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u001aC[6wZX@~v";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u001aOXtf^HP";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u001a]Fts\\IQi(ADY~j@Y\u001buj\u0018Y]v`";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "FHX}(FHZ\u007f([B\u0019ij@YQh";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 44;
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    strArr2 = strArr3;
                    str = "\u001aY[t(GHW~kA";
                    obj = 45;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "PC@~wEE[u`\u001aKUriPI\u0019oj\u0018XD\u007fdAH\u0019~}EDFzq\\BZ";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u001a]Fts\\IQi(@CFtpALVw`\u001aC[6q\\@Q";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u001aCQcq\u0018@QomZI";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u001a]Fts\\IQi(ADY~j@Y\u001buj\u0018Y]v`";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "]Y@kv\u000f\u0002\u001blmTYGzuE\u0003Wth\u001aLZ\u007fwZDP";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    str = "XDGhl[J\u0014kdGLY~qP_";
                    obj = 51;
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    strArr2 = strArr3;
                    str = "FHX}(FHZ\u007f(AB[6hTCM6qGDQh(TAX6hPY\\taF";
                    obj = 52;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "WLP;uT_Uv`AHF";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "PC@~wEE[u`\u001a_QjpP^@4";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "FHX}";
                    obj = null;
                    break;
            }
        }
    }

    protected avc a(String[] strArr) {
        avc com_whatsapp_avc = avc.ERROR_UNSPECIFIED;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            if (elapsedRealtime < EnterPhoneNumber.s) {
                this.c = new de(avc.ERROR_TOO_RECENT);
                this.c.c = ((EnterPhoneNumber.s - elapsedRealtime) / 1000) + "";
                return avc.ERROR_TOO_RECENT;
            }
            try {
                this.c = VerifyNumber.a(this.a, EnterPhoneNumber.u, EnterPhoneNumber.x, this.b, VerifyNumber.k);
                return this.c.f;
            } catch (IOException e) {
                String toString = e.toString();
                try {
                    Log.e(z[6] + this.f + z[5] + toString);
                    if (toString != null && toString.contains(z[2])) {
                        com_whatsapp_avc = avc.ERROR_UNSPECIFIED;
                        if (App.az == 0) {
                            return com_whatsapp_avc;
                        }
                    }
                    return avc.ERROR_CONNECTIVITY;
                } catch (IOException e2) {
                    throw e2;
                }
            } catch (Throwable e3) {
                Log.b(z[4] + this.f + z[3], e3);
                return com_whatsapp_avc;
            }
        } catch (IOException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(com.whatsapp.avc r15) {
        /*
        r14_this = this;
        r12 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = 0;
        r1 = 1;
        r3 = com.whatsapp.App.az;
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03a5 }
        r4 = "";
        r0.b(r4);	 Catch:{ NumberFormatException -> 0x03a5 }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03a5 }
        r0.d();	 Catch:{ NumberFormatException -> 0x03a5 }
        r0 = 14;
        com.whatsapp.EnterPhoneNumber.w = r0;	 Catch:{ NumberFormatException -> 0x03a5 }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03a5 }
        r0.b();	 Catch:{ NumberFormatException -> 0x03a5 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x03a5 }
        if (r0 != 0) goto L_0x0036;
    L_0x001f:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03a5 }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x03a5 }
        if (r0 != 0) goto L_0x03a4;
    L_0x0025:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03a7 }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x03a7 }
        if (r0 != 0) goto L_0x03a4;
    L_0x002d:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03a9 }
        r4 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r0.showDialog(r4);	 Catch:{ NumberFormatException -> 0x03a9 }
        if (r3 == 0) goto L_0x03a4;
    L_0x0036:
        r0 = com.whatsapp.avc.YES_WITH_CODE;	 Catch:{ NumberFormatException -> 0x03ab }
        if (r15 != r0) goto L_0x004f;
    L_0x003a:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x03ad }
        r0 = r0.a;	 Catch:{ NumberFormatException -> 0x03ad }
        if (r0 == 0) goto L_0x03b1;
    L_0x0040:
        r0 = r1;
    L_0x0041:
        com.whatsapp.util.Log.b(r0);	 Catch:{ NumberFormatException -> 0x03b4 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x03b4 }
        r0 = r0.a;	 Catch:{ NumberFormatException -> 0x03b4 }
        r4 = 0;
        r5 = 0;
        r14.a(r0, r4, r5);	 Catch:{ NumberFormatException -> 0x03b4 }
        if (r3 == 0) goto L_0x03a4;
    L_0x004f:
        r0 = com.whatsapp.avc.OK;	 Catch:{ NumberFormatException -> 0x03b4 }
        if (r15 != r0) goto L_0x00c1;
    L_0x0053:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x03b6 }
        r0 = r0.g;	 Catch:{ NumberFormatException -> 0x03b6 }
        if (r0 == 0) goto L_0x00a1;
    L_0x0059:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x03b8 }
        r0 = r0.e;	 Catch:{ NumberFormatException -> 0x03b8 }
        if (r0 == 0) goto L_0x00a1;
    L_0x005f:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x03ba }
        r4 = r0.b;	 Catch:{ NumberFormatException -> 0x03ba }
        r6 = 0;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 == 0) goto L_0x00a1;
    L_0x0069:
        r0 = z;	 Catch:{ NumberFormatException -> 0x03bc }
        r4 = 15;
        r0 = r0[r4];	 Catch:{ NumberFormatException -> 0x03bc }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x03bc }
        r0 = r14.d;	 Catch:{ NumberFormatException -> 0x03bc }
        if (r0 == 0) goto L_0x007b;
    L_0x0076:
        r0 = r14.d;	 Catch:{ NumberFormatException -> 0x03be }
        r0.run();	 Catch:{ NumberFormatException -> 0x03be }
    L_0x007b:
        r0 = com.whatsapp.App.p;
        r4 = r14.c;
        r4 = r4.g;
        com.whatsapp.App.f(r0, r4);
        r0 = r14.c;
        r0 = r0.e;
        r4 = r14.c;
        r4 = r4.g;
        com.whatsapp.a54.a(r0, r4);
        r0 = com.whatsapp.atf.WHATSAPP_INITIATED;	 Catch:{ NumberFormatException -> 0x03c0 }
        r4 = r14.c;	 Catch:{ NumberFormatException -> 0x03c0 }
        r4 = r4.b;	 Catch:{ NumberFormatException -> 0x03c0 }
        r4 = r4 * r12;
        com.whatsapp.ac.a(r0, r4);	 Catch:{ NumberFormatException -> 0x03c0 }
    L_0x0099:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03cc }
        r4 = 0;
        r0.b(r4);	 Catch:{ NumberFormatException -> 0x03cc }
        if (r3 == 0) goto L_0x03a4;
    L_0x00a1:
        r0 = z;	 Catch:{ NumberFormatException -> 0x03cc }
        r4 = 22;
        r0 = r0[r4];	 Catch:{ NumberFormatException -> 0x03cc }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x03cc }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03cc }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x03cc }
        if (r0 != 0) goto L_0x03a4;
    L_0x00b0:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03ce }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x03ce }
        if (r0 != 0) goto L_0x03a4;
    L_0x00b8:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03d0 }
        r4 = 22;
        r0.showDialog(r4);	 Catch:{ NumberFormatException -> 0x03d0 }
        if (r3 == 0) goto L_0x03a4;
    L_0x00c1:
        r0 = com.whatsapp.avc.YES;	 Catch:{ NumberFormatException -> 0x03d2 }
        if (r15 == r0) goto L_0x03a4;
    L_0x00c5:
        r0 = 14;
        com.whatsapp.EnterPhoneNumber.w = r0;	 Catch:{ NumberFormatException -> 0x03d4 }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03d4 }
        r0.b();	 Catch:{ NumberFormatException -> 0x03d4 }
        r0 = com.whatsapp.avc.ERROR_TEMPORARILY_UNAVAILABLE;	 Catch:{ NumberFormatException -> 0x03d4 }
        if (r15 != r0) goto L_0x0105;
    L_0x00d2:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x03d6 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x03d6 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x03d6 }
        r5 = 35;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x03d6 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03d6 }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x03d6 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03d6 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x03d6 }
        r5 = 33;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x03d6 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03d6 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x03d6 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x03d6 }
        r0 = 0;
        r4 = 1;
        r5 = z;	 Catch:{ NumberFormatException -> 0x03d6 }
        r6 = 8;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x03d6 }
        r14.a(r0, r4, r5);	 Catch:{ NumberFormatException -> 0x03d6 }
        if (r3 == 0) goto L_0x03a4;
    L_0x0105:
        r0 = com.whatsapp.avc.ERROR_NEXT_METHOD;	 Catch:{ NumberFormatException -> 0x03d8 }
        if (r15 != r0) goto L_0x013c;
    L_0x0109:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x03da }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x03da }
        r4 = z;	 Catch:{ NumberFormatException -> 0x03da }
        r5 = 9;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x03da }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03da }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x03da }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03da }
        r4 = z;	 Catch:{ NumberFormatException -> 0x03da }
        r5 = 49;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x03da }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03da }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x03da }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x03da }
        r0 = 0;
        r4 = 1;
        r5 = z;	 Catch:{ NumberFormatException -> 0x03da }
        r6 = 18;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x03da }
        r14.a(r0, r4, r5);	 Catch:{ NumberFormatException -> 0x03da }
        if (r3 == 0) goto L_0x03a4;
    L_0x013c:
        r0 = com.whatsapp.avc.ERROR_NO_ROUTES;	 Catch:{ NumberFormatException -> 0x03dc }
        if (r15 != r0) goto L_0x0173;
    L_0x0140:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x03de }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x03de }
        r4 = z;	 Catch:{ NumberFormatException -> 0x03de }
        r5 = 57;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x03de }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03de }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x03de }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03de }
        r4 = z;	 Catch:{ NumberFormatException -> 0x03de }
        r5 = 40;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x03de }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03de }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x03de }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x03de }
        r0 = 0;
        r4 = 1;
        r5 = z;	 Catch:{ NumberFormatException -> 0x03de }
        r6 = 44;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x03de }
        r14.a(r0, r4, r5);	 Catch:{ NumberFormatException -> 0x03de }
        if (r3 == 0) goto L_0x03a4;
    L_0x0173:
        r0 = com.whatsapp.avc.ERROR_UNSPECIFIED;	 Catch:{ NumberFormatException -> 0x03e0 }
        if (r15 != r0) goto L_0x01b4;
    L_0x0177:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x03e2 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x03e2 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x03e2 }
        r5 = 45;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x03e2 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03e2 }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x03e2 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03e2 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x03e2 }
        r5 = 27;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x03e2 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03e2 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x03e2 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x03e2 }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03e2 }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x03e2 }
        if (r0 != 0) goto L_0x03a4;
    L_0x01a3:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03e4 }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x03e4 }
        if (r0 != 0) goto L_0x03a4;
    L_0x01ab:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03e6 }
        r4 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r0.showDialog(r4);	 Catch:{ NumberFormatException -> 0x03e6 }
        if (r3 == 0) goto L_0x03a4;
    L_0x01b4:
        r0 = com.whatsapp.avc.ERROR_TOO_MANY;	 Catch:{ NumberFormatException -> 0x03e8 }
        if (r15 != r0) goto L_0x01eb;
    L_0x01b8:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x03ea }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x03ea }
        r4 = z;	 Catch:{ NumberFormatException -> 0x03ea }
        r5 = 54;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x03ea }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03ea }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x03ea }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03ea }
        r4 = z;	 Catch:{ NumberFormatException -> 0x03ea }
        r5 = 12;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x03ea }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03ea }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x03ea }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x03ea }
        r0 = 0;
        r4 = 1;
        r5 = z;	 Catch:{ NumberFormatException -> 0x03ea }
        r6 = 37;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x03ea }
        r14.a(r0, r4, r5);	 Catch:{ NumberFormatException -> 0x03ea }
        if (r3 == 0) goto L_0x03a4;
    L_0x01eb:
        r0 = com.whatsapp.avc.ERROR_TOO_MANY_ALL_METHODS;	 Catch:{ NumberFormatException -> 0x03ec }
        if (r15 != r0) goto L_0x0221;
    L_0x01ef:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x03ee }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x03ee }
        r4 = z;	 Catch:{ NumberFormatException -> 0x03ee }
        r5 = 30;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x03ee }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03ee }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x03ee }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03ee }
        r4 = z;	 Catch:{ NumberFormatException -> 0x03ee }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x03ee }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03ee }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x03ee }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x03ee }
        r0 = 0;
        r4 = 1;
        r5 = z;	 Catch:{ NumberFormatException -> 0x03ee }
        r6 = 53;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x03ee }
        r14.a(r0, r4, r5);	 Catch:{ NumberFormatException -> 0x03ee }
        if (r3 == 0) goto L_0x03a4;
    L_0x0221:
        r0 = com.whatsapp.avc.ERROR_TOO_MANY_GUESSES;	 Catch:{ NumberFormatException -> 0x03f0 }
        if (r15 != r0) goto L_0x0258;
    L_0x0225:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x03f2 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x03f2 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x03f2 }
        r5 = 58;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x03f2 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03f2 }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x03f2 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03f2 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x03f2 }
        r5 = 28;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x03f2 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03f2 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x03f2 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x03f2 }
        r0 = 0;
        r4 = 1;
        r5 = z;	 Catch:{ NumberFormatException -> 0x03f2 }
        r6 = 26;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x03f2 }
        r14.a(r0, r4, r5);	 Catch:{ NumberFormatException -> 0x03f2 }
        if (r3 == 0) goto L_0x03a4;
    L_0x0258:
        r0 = com.whatsapp.avc.ERROR_CONNECTIVITY;	 Catch:{ NumberFormatException -> 0x03f4 }
        if (r15 != r0) goto L_0x027b;
    L_0x025c:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03f6 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x03f6 }
        r5 = 2131624725; // 0x7f0e0315 float:1.8876638E38 double:1.0531625464E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x03f6 }
        r7 = 0;
        r8 = r14.a;	 Catch:{ NumberFormatException -> 0x03f6 }
        r9 = 2131624132; // 0x7f0e00c4 float:1.8875435E38 double:1.0531622535E-314;
        r8 = r8.getString(r9);	 Catch:{ NumberFormatException -> 0x03f6 }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x03f6 }
        r4 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x03f6 }
        r0.g(r4);	 Catch:{ NumberFormatException -> 0x03f6 }
        if (r3 == 0) goto L_0x03a4;
    L_0x027b:
        r0 = com.whatsapp.avc.ERROR_BAD_PARAMETER;	 Catch:{ NumberFormatException -> 0x03f8 }
        if (r15 != r0) goto L_0x02c5;
    L_0x027f:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x03fa }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x03fa }
        r4 = z;	 Catch:{ NumberFormatException -> 0x03fa }
        r5 = 23;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x03fa }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03fa }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x03fa }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03fa }
        r4 = z;	 Catch:{ NumberFormatException -> 0x03fa }
        r5 = 38;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x03fa }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x03fa }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x03fa }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x03fa }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03fa }
        r4 = 55;
        r0 = r0[r4];	 Catch:{ NumberFormatException -> 0x03fa }
        com.whatsapp.App.v(r0);	 Catch:{ NumberFormatException -> 0x03fa }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03fa }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x03fa }
        if (r0 != 0) goto L_0x03a4;
    L_0x02b4:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03fc }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x03fc }
        if (r0 != 0) goto L_0x03a4;
    L_0x02bc:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x03fe }
        r4 = 22;
        r0.showDialog(r4);	 Catch:{ NumberFormatException -> 0x03fe }
        if (r3 == 0) goto L_0x03a4;
    L_0x02c5:
        r0 = com.whatsapp.avc.ERROR_MISSING_PARAMETER;	 Catch:{ NumberFormatException -> 0x0400 }
        if (r15 != r0) goto L_0x030f;
    L_0x02c9:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0402 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0402 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0402 }
        r5 = 29;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0402 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0402 }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x0402 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0402 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0402 }
        r5 = 31;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0402 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0402 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0402 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0402 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x0402 }
        r4 = 52;
        r0 = r0[r4];	 Catch:{ NumberFormatException -> 0x0402 }
        com.whatsapp.App.v(r0);	 Catch:{ NumberFormatException -> 0x0402 }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x0402 }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x0402 }
        if (r0 != 0) goto L_0x03a4;
    L_0x02fe:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x0404 }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x0404 }
        if (r0 != 0) goto L_0x03a4;
    L_0x0306:
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x0406 }
        r4 = 22;
        r0.showDialog(r4);	 Catch:{ NumberFormatException -> 0x0406 }
        if (r3 == 0) goto L_0x03a4;
    L_0x030f:
        r0 = com.whatsapp.avc.ERROR_OLD_VERSION;	 Catch:{ NumberFormatException -> 0x0408 }
        if (r15 != r0) goto L_0x0345;
    L_0x0313:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x040a }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x040a }
        r4 = z;	 Catch:{ NumberFormatException -> 0x040a }
        r5 = 56;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x040a }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x040a }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x040a }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x040a }
        r4 = z;	 Catch:{ NumberFormatException -> 0x040a }
        r5 = 32;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x040a }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x040a }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x040a }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x040a }
        r0 = 1;
        com.whatsapp.App.T = r0;	 Catch:{ NumberFormatException -> 0x040a }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x040a }
        r4 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r0.e(r4);	 Catch:{ NumberFormatException -> 0x040a }
        if (r3 == 0) goto L_0x03a4;
    L_0x0345:
        r0 = com.whatsapp.avc.ERROR_TOO_RECENT;	 Catch:{ NumberFormatException -> 0x040c }
        if (r15 != r0) goto L_0x047d;
    L_0x0349:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x040e }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x040e }
        r4 = z;	 Catch:{ NumberFormatException -> 0x040e }
        r5 = 16;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x040e }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x040e }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x040e }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x040e }
        r4 = z;	 Catch:{ NumberFormatException -> 0x040e }
        r5 = 46;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x040e }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x040e }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x040e }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x040e }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x040e }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x040e }
        if (r0 == 0) goto L_0x0447;
    L_0x0375:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0410 }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x0410 }
        r4 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0410 }
        r4 = r4 * r12;
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ NumberFormatException -> 0x0410 }
        r6 = r6 + r4;
        com.whatsapp.EnterPhoneNumber.s = r6;	 Catch:{ NumberFormatException -> 0x0410 }
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0410 }
        r0.a(r4);	 Catch:{ NumberFormatException -> 0x0410 }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x0410 }
        r6 = r14.a;	 Catch:{ NumberFormatException -> 0x0410 }
        r7 = 2131624764; // 0x7f0e033c float:1.8876717E38 double:1.0531625657E-314;
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ NumberFormatException -> 0x0410 }
        r9 = 0;
        r10 = r14.a;	 Catch:{ NumberFormatException -> 0x0410 }
        r4 = com.whatsapp.util.bm.g(r10, r4);	 Catch:{ NumberFormatException -> 0x0410 }
        r8[r9] = r4;	 Catch:{ NumberFormatException -> 0x0410 }
        r4 = r6.getString(r7, r8);	 Catch:{ NumberFormatException -> 0x0410 }
        r0.g(r4);	 Catch:{ NumberFormatException -> 0x0410 }
    L_0x03a4:
        return;
    L_0x03a5:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03a7 }
    L_0x03a7:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03a9 }
    L_0x03a9:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03ab }
    L_0x03ab:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03ad }
    L_0x03ad:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03af }
    L_0x03af:
        r0 = move-exception;
        throw r0;
    L_0x03b1:
        r0 = r2;
        goto L_0x0041;
    L_0x03b4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03b6 }
    L_0x03b6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03b8 }
    L_0x03b8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03ba }
    L_0x03ba:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03bc }
    L_0x03bc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03be }
    L_0x03be:
        r0 = move-exception;
        throw r0;
    L_0x03c0:
        r0 = move-exception;
        r0 = z;
        r4 = 47;
        r0 = r0[r4];
        com.whatsapp.util.Log.e(r0);
        goto L_0x0099;
    L_0x03cc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03ce }
    L_0x03ce:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03d0 }
    L_0x03d0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03d2 }
    L_0x03d2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03d4 }
    L_0x03d4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03d6 }
    L_0x03d6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03d8 }
    L_0x03d8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03da }
    L_0x03da:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03dc }
    L_0x03dc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03de }
    L_0x03de:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03e0 }
    L_0x03e0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03e2 }
    L_0x03e2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03e4 }
    L_0x03e4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03e6 }
    L_0x03e6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03e8 }
    L_0x03e8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03ea }
    L_0x03ea:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03ec }
    L_0x03ec:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03ee }
    L_0x03ee:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03f0 }
    L_0x03f0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03f2 }
    L_0x03f2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03f4 }
    L_0x03f4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03f6 }
    L_0x03f6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03f8 }
    L_0x03f8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03fa }
    L_0x03fa:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03fc }
    L_0x03fc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03fe }
    L_0x03fe:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0400 }
    L_0x0400:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0402 }
    L_0x0402:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0404 }
    L_0x0404:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0406 }
    L_0x0406:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0408 }
    L_0x0408:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x040a }
    L_0x040a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x040c }
    L_0x040c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x040e }
    L_0x040e:
        r0 = move-exception;
        throw r0;
    L_0x0410:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x068b }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x068b }
        r4 = z;	 Catch:{ NumberFormatException -> 0x068b }
        r5 = 14;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x068b }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x068b }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x068b }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x068b }
        r4 = z;	 Catch:{ NumberFormatException -> 0x068b }
        r5 = 20;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x068b }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x068b }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x068b }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x068b }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x068b }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x068b }
        r5 = 2131624765; // 0x7f0e033d float:1.8876719E38 double:1.053162566E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x068b }
        r0.g(r4);	 Catch:{ NumberFormatException -> 0x068b }
        if (r3 == 0) goto L_0x03a4;
    L_0x0447:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x068b }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x068b }
        r4 = z;	 Catch:{ NumberFormatException -> 0x068b }
        r5 = 10;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x068b }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x068b }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x068b }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x068b }
        r4 = z;	 Catch:{ NumberFormatException -> 0x068b }
        r5 = 24;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x068b }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x068b }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x068b }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x068b }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x068b }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x068b }
        r5 = 2131624765; // 0x7f0e033d float:1.8876719E38 double:1.053162566E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x068b }
        r0.g(r4);	 Catch:{ NumberFormatException -> 0x068b }
        if (r3 == 0) goto L_0x03a4;
    L_0x047d:
        r0 = com.whatsapp.avc.ERROR_BLOCKED;	 Catch:{ NumberFormatException -> 0x068d }
        if (r15 != r0) goto L_0x04b0;
    L_0x0481:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x068f }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x068f }
        r4 = z;	 Catch:{ NumberFormatException -> 0x068f }
        r5 = 25;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x068f }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x068f }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x068f }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x068f }
        r4 = z;	 Catch:{ NumberFormatException -> 0x068f }
        r5 = 41;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x068f }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x068f }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x068f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x068f }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x068f }
        r4 = 23;
        r0.e(r4);	 Catch:{ NumberFormatException -> 0x068f }
        if (r3 == 0) goto L_0x03a4;
    L_0x04b0:
        r0 = com.whatsapp.avc.ERROR_PROVIDER_TIMEOUT;	 Catch:{ NumberFormatException -> 0x0691 }
        if (r15 != r0) goto L_0x057e;
    L_0x04b4:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0693 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0693 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0693 }
        r5 = 13;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0693 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0693 }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x0693 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0693 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0693 }
        r5 = 21;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0693 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0693 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0693 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0693 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0693 }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x0693 }
        if (r0 == 0) goto L_0x0548;
    L_0x04e0:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0511 }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x0511 }
        r4 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0511 }
        r4 = r4 * r12;
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ NumberFormatException -> 0x0511 }
        r6 = r6 + r4;
        com.whatsapp.EnterPhoneNumber.s = r6;	 Catch:{ NumberFormatException -> 0x0511 }
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0511 }
        r0.a(r4);	 Catch:{ NumberFormatException -> 0x0511 }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x0511 }
        r6 = r14.a;	 Catch:{ NumberFormatException -> 0x0511 }
        r7 = 2131624753; // 0x7f0e0331 float:1.8876695E38 double:1.0531625603E-314;
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ NumberFormatException -> 0x0511 }
        r9 = 0;
        r10 = r14.a;	 Catch:{ NumberFormatException -> 0x0511 }
        r4 = com.whatsapp.util.bm.g(r10, r4);	 Catch:{ NumberFormatException -> 0x0511 }
        r8[r9] = r4;	 Catch:{ NumberFormatException -> 0x0511 }
        r4 = r6.getString(r7, r8);	 Catch:{ NumberFormatException -> 0x0511 }
        r0.g(r4);	 Catch:{ NumberFormatException -> 0x0511 }
        goto L_0x03a4;
    L_0x0511:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0695 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0695 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0695 }
        r5 = 34;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0695 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0695 }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x0695 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0695 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0695 }
        r5 = 42;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0695 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0695 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0695 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0695 }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x0695 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x0695 }
        r5 = 2131624754; // 0x7f0e0332 float:1.8876697E38 double:1.053162561E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x0695 }
        r0.g(r4);	 Catch:{ NumberFormatException -> 0x0695 }
        if (r3 == 0) goto L_0x03a4;
    L_0x0548:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0695 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0695 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0695 }
        r5 = 17;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0695 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0695 }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x0695 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0695 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0695 }
        r5 = 50;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0695 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0695 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0695 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0695 }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x0695 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x0695 }
        r5 = 2131624754; // 0x7f0e0332 float:1.8876697E38 double:1.053162561E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x0695 }
        r0.g(r4);	 Catch:{ NumberFormatException -> 0x0695 }
        if (r3 == 0) goto L_0x03a4;
    L_0x057e:
        r0 = com.whatsapp.avc.ERROR_PROVIDER_UNROUTABLE;	 Catch:{ NumberFormatException -> 0x0697 }
        if (r15 != r0) goto L_0x064c;
    L_0x0582:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0699 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0699 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0699 }
        r5 = 59;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0699 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0699 }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x0699 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0699 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0699 }
        r5 = 19;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0699 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0699 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0699 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0699 }
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x0699 }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x0699 }
        if (r0 == 0) goto L_0x0616;
    L_0x05ae:
        r0 = r14.c;	 Catch:{ NumberFormatException -> 0x05df }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x05df }
        r4 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x05df }
        r4 = r4 * r12;
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ NumberFormatException -> 0x05df }
        r6 = r6 + r4;
        com.whatsapp.EnterPhoneNumber.s = r6;	 Catch:{ NumberFormatException -> 0x05df }
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x05df }
        r0.a(r4);	 Catch:{ NumberFormatException -> 0x05df }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x05df }
        r6 = r14.a;	 Catch:{ NumberFormatException -> 0x05df }
        r7 = 2131624755; // 0x7f0e0333 float:1.8876699E38 double:1.0531625613E-314;
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ NumberFormatException -> 0x05df }
        r9 = 0;
        r10 = r14.a;	 Catch:{ NumberFormatException -> 0x05df }
        r4 = com.whatsapp.util.bm.g(r10, r4);	 Catch:{ NumberFormatException -> 0x05df }
        r8[r9] = r4;	 Catch:{ NumberFormatException -> 0x05df }
        r4 = r6.getString(r7, r8);	 Catch:{ NumberFormatException -> 0x05df }
        r0.g(r4);	 Catch:{ NumberFormatException -> 0x05df }
        goto L_0x03a4;
    L_0x05df:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x069b }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x069b }
        r4 = z;	 Catch:{ NumberFormatException -> 0x069b }
        r5 = 60;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x069b }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x069b }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x069b }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x069b }
        r4 = z;	 Catch:{ NumberFormatException -> 0x069b }
        r5 = 48;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x069b }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x069b }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x069b }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x069b }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x069b }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x069b }
        r5 = 2131624756; // 0x7f0e0334 float:1.88767E38 double:1.053162562E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x069b }
        r0.g(r4);	 Catch:{ NumberFormatException -> 0x069b }
        if (r3 == 0) goto L_0x03a4;
    L_0x0616:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x069d }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x069d }
        r4 = z;	 Catch:{ NumberFormatException -> 0x069d }
        r5 = 36;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x069d }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x069d }
        r4 = r14.f;	 Catch:{ NumberFormatException -> 0x069d }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x069d }
        r4 = z;	 Catch:{ NumberFormatException -> 0x069d }
        r5 = 39;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x069d }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x069d }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x069d }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x069d }
        r0 = r14.a;	 Catch:{ NumberFormatException -> 0x069d }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x069d }
        r5 = 2131624756; // 0x7f0e0334 float:1.88767E38 double:1.053162562E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x069d }
        r0.g(r4);	 Catch:{ NumberFormatException -> 0x069d }
        if (r3 == 0) goto L_0x03a4;
    L_0x064c:
        r0 = com.whatsapp.avc.ERROR_BAD_TOKEN;	 Catch:{ NumberFormatException -> 0x069d }
        if (r15 != r0) goto L_0x03a4;
    L_0x0650:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = z;
        r4 = 43;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r3 = r14.f;
        r0 = r0.append(r3);
        r3 = z;
        r4 = 11;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = com.whatsapp.App.G;
        r3 = 2;
        if (r0 != r3) goto L_0x069f;
    L_0x067b:
        r0 = r14.a;
        r1 = 2131624748; // 0x7f0e032c float:1.8876684E38 double:1.053162558E-314;
        r0 = r0.getString(r1);
    L_0x0684:
        r1 = r14.a;
        r1.g(r0);
        goto L_0x03a4;
    L_0x068b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x068d }
    L_0x068d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x068f }
    L_0x068f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0691 }
    L_0x0691:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0693 }
    L_0x0693:
        r0 = move-exception;
        throw r0;
    L_0x0695:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0697 }
    L_0x0697:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0699 }
    L_0x0699:
        r0 = move-exception;
        throw r0;
    L_0x069b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x069d }
    L_0x069d:
        r0 = move-exception;
        throw r0;
    L_0x069f:
        r0 = com.whatsapp.App.G;
        if (r0 != 0) goto L_0x06ad;
    L_0x06a3:
        r0 = r14.a;
        r1 = 2131624749; // 0x7f0e032d float:1.8876687E38 double:1.0531625583E-314;
        r0 = r0.getString(r1);
        goto L_0x0684;
    L_0x06ad:
        r0 = r14.a;
        r3 = 2131624750; // 0x7f0e032e float:1.8876689E38 double:1.053162559E-314;
        r1 = new java.lang.Object[r1];
        r4 = z;
        r5 = 51;
        r4 = r4[r5];
        r1[r2] = r4;
        r0 = r0.getString(r3, r1);
        goto L_0x0684;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.h_.a(com.whatsapp.avc):void");
    }

    protected void onPreExecute() {
        try {
            EnterPhoneNumber.t = null;
            if (!this.a.isFinishing()) {
                this.a.showDialog(9);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private void a(String str, boolean z, String str2) {
        try {
            EnterPhoneNumber.t = str;
            App.a(App.p, VerifyNumber.d(EnterPhoneNumber.t));
            EnterPhoneNumber.w = 15;
            this.a.b();
            this.a.v = z;
            if (str2 != null) {
                VerifyNumber.k = str2;
            }
            try {
                this.a.a(this.a.v);
                if (this.d != null) {
                    this.d.run();
                }
                try {
                    if (this.e != null) {
                        this.e.run();
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    protected void onPostExecute(Object obj) {
        a((avc) obj);
    }

    protected h_(EnterPhoneNumber enterPhoneNumber, Runnable runnable, Runnable runnable2) {
        this.a = enterPhoneNumber;
        this.b = z[1];
        this.f = z[0];
        this.d = runnable;
        this.e = runnable2;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((String[]) objArr);
    }
}
