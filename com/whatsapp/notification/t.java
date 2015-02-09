package com.whatsapp.notification;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.whatsapp.App;
import com.whatsapp.bd;
import com.whatsapp.util.Log;
import com.whatsapp.vk;
import java.util.HashMap;
import java.util.Map.Entry;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class t {
    public static HashMap a;
    public static HashMap b;
    private static final String[] z;

    private static String c(String str) {
        return str.subSequence(0, 1020) + "\u2026";
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r5, java.lang.String r6, boolean r7) {
        /*
        r0 = b;
        if (r0 != 0) goto L_0x0007;
    L_0x0004:
        a(r5);
    L_0x0007:
        r0 = b;
        r0 = r0.remove(r6);
        r0 = (com.whatsapp.notification.e) r0;
        if (r0 != 0) goto L_0x0012;
    L_0x0011:
        return;
    L_0x0012:
        r0 = z;
        r1 = 32;
        r0 = r0[r1];
        r1 = 0;
        r0 = r5.getSharedPreferences(r0, r1);
        r0 = r0.edit();
        r1 = a();
        r2 = b;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x003a;
    L_0x002d:
        r2 = z;
        r3 = 34;
        r2 = r2[r3];
        r0.remove(r2);
        r2 = com.whatsapp.notification.PopupNotification.H;
        if (r2 == 0) goto L_0x0043;
    L_0x003a:
        r2 = z;
        r3 = 31;
        r2 = r2[r3];
        r0.putString(r2, r1);
    L_0x0043:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 33;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r0 = r0.commit();
        if (r0 != 0) goto L_0x006c;
    L_0x0063:
        r0 = z;
        r1 = 35;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
    L_0x006c:
        r0 = new android.os.Handler;
        r1 = r5.getMainLooper();
        r0.<init>(r1);
        r1 = new com.whatsapp.notification.as;
        r1.<init>(r6);
        r0.post(r1);
        if (r7 == 0) goto L_0x0011;
    L_0x007f:
        r0 = 6;
        com.whatsapp.App.a(r0, r6);
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.t.a(android.content.Context, java.lang.String, boolean):void");
    }

    static {
        String[] strArr = new String[36];
        String str = "Cz\u0011";
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
                        i3 = 99;
                        break;
                    case ay.f /*1*/:
                        i3 = 58;
                        break;
                    case ay.n /*2*/:
                        i3 = 49;
                        break;
                    case ay.p /*3*/:
                        i3 = 10;
                        break;
                    default:
                        i3 = 95;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u000eOEo\u0000\nTWe";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0016^Ak+\u0006\u001aXd9\f\u0000";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "&hcE\rCOAn>\u0017_U*+\u000b_\u0011g>\u0013\u001aSo9\fHT";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0000U\\$(\u000b[Ey>\u0013Jnz-\u0006\\Tx:\rYTy";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\rUEc9\nYP~6\fT\u001ec1\nNng*\u0017_nc1\u0005U\u000b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\rUEc9\nYP~6\fT\u001e\u007f/\u0007[Eo\u0000\u000eOEo\u0000\nTWep\u0005[Xf:\u0007";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u000eOEo\u0000\nTWe";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u000eOEo\u0000\nTWe";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    str = "Cz\u0011";
                    obj = 9;
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    strArr2 = strArr3;
                    str = "Cz\u0011";
                    obj = 10;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0004_ED0\u0017SWc<\u0002NXe17SRa:\u0011\u0015\\c,\u0010S_m\u0000\u0011WEU,\u0011Y\u000b";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\rUEc9\nYP~6\fT\u001eg:\u0010IPm:\u0013HT|6\u0006M\u001em:\u0017TPg:CHTg0\u0017_nx:\u0010UDx<\u0006\u001a_\u007f3\u000f";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0000U\\$(\u000b[Ey>\u0013Jnz-\u0006\\Tx:\rYTy";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u000eOEo\u0000\nTWe";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\rUEc9\nYP~6\fT\u001ey:\u0017e\\\u007f+\u0006eXd9\f\u0015Wk6\u000f_U";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "Y\u001a\r%=]";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "Y\u001a";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "Cz\u0011";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "Cz\u0011";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "Y\u001a";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "Y\u001a";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "Y\u001a";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "_X\u000f";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "Y\u001a";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "_X\u000f";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "Y\u001a\r%=]";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "Y\u001a";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u000e_By>\u0004_ax:\u0015ST}p\u000eSBy6\r]nx2\u0017eBx<Y";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "Y\u001a";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u000eOEo\u0000\nTWe";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0000U\\$(\u000b[Ey>\u0013Jnz-\u0006\\Tx:\rYTy";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\rUEc9\nYP~6\fT\u001ex:\u0010_EU2\u0016NTU6\r\\^0";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u000eOEo\u0000\nTWe";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\rUEc9\nYP~6\fT\u001e\u007f/\u0007[Eo\u0000\u000eOEo\u0000\nTWep\u0005[Xf:\u0007";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new HashMap();
                default:
                    strArr2[i] = str;
                    str = "Cz\u0011";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.Context r13) {
        /*
        r2 = com.whatsapp.notification.PopupNotification.H;
        r0 = new java.util.HashMap;
        r0.<init>();
        b = r0;
        r0 = z;
        r1 = 5;
        r0 = r0[r1];
        r1 = 0;
        r3 = r13.getSharedPreferences(r0, r1);
        r0 = z;
        r1 = 8;
        r0 = r0[r1];
        r1 = "";
        r0 = r3.getString(r0, r1);
        r1 = 0;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 6;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r0);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r4 = r0.length();
        if (r4 <= 0) goto L_0x0106;
    L_0x003f:
        r4 = ",";
        r4 = r0.split(r4);
        r0 = r4.length;
        r0 = r0 + -1;
        r12 = r0;
        r0 = r1;
        r1 = r12;
    L_0x004b:
        if (r1 < 0) goto L_0x00ba;
    L_0x004d:
        r5 = r4[r1];
        r6 = r5.length();
        r7 = 1;
        if (r6 <= r7) goto L_0x00b6;
    L_0x0056:
        r6 = "#";
        r5 = r5.split(r6);
        r6 = com.whatsapp.App.P;
        r7 = 0;
        r7 = r5[r7];
        r6 = r6.f(r7);
        if (r6 == 0) goto L_0x00b5;
    L_0x0067:
        r6 = b;
        r7 = 0;
        r7 = r5[r7];
        r6 = r6.containsKey(r7);
        if (r6 == 0) goto L_0x007d;
    L_0x0072:
        r0 = z;
        r6 = 4;
        r0 = r0[r6];
        com.whatsapp.util.Log.e(r0);
        r0 = 1;
        if (r2 == 0) goto L_0x00b6;
    L_0x007d:
        r6 = r5.length;
        r7 = 3;
        if (r6 < r7) goto L_0x009e;
    L_0x0081:
        r6 = b;
        r7 = 0;
        r7 = r5[r7];
        r8 = new com.whatsapp.notification.e;
        r9 = 1;
        r9 = r5[r9];
        r10 = java.lang.Long.parseLong(r9);
        r9 = 2;
        r9 = r5[r9];
        r9 = java.lang.Boolean.parseBoolean(r9);
        r8.<init>(r10, r9);
        r6.put(r7, r8);
        if (r2 == 0) goto L_0x00b6;
    L_0x009e:
        r6 = b;
        r7 = 0;
        r7 = r5[r7];
        r8 = new com.whatsapp.notification.e;
        r9 = 1;
        r5 = r5[r9];
        r10 = java.lang.Long.parseLong(r5);
        r5 = 1;
        r8.<init>(r10, r5);
        r6.put(r7, r8);
        if (r2 == 0) goto L_0x00b6;
    L_0x00b5:
        r0 = 1;
    L_0x00b6:
        r1 = r1 + -1;
        if (r2 == 0) goto L_0x004b;
    L_0x00ba:
        if (r0 == 0) goto L_0x0106;
    L_0x00bc:
        r0 = r3.edit();
        r1 = a();
        r3 = b;
        r3 = r3.isEmpty();
        if (r3 == 0) goto L_0x00d6;
    L_0x00cc:
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r0.remove(r3);
        if (r2 == 0) goto L_0x00df;
    L_0x00d6:
        r2 = z;
        r3 = 9;
        r2 = r2[r3];
        r0.putString(r2, r1);
    L_0x00df:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        r0 = r0.commit();
        if (r0 != 0) goto L_0x0106;
    L_0x00fe:
        r0 = z;
        r1 = 7;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
    L_0x0106:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.t.a(android.content.Context):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence a(android.content.Context r10, com.whatsapp.protocol.b r11, com.whatsapp.m8 r12, boolean r13, boolean r14) {
        /*
        r9 = 2131625135; // 0x7f0e04af float:1.887747E38 double:1.053162749E-314;
        r8 = 0;
        r7 = 2;
        r6 = 1;
        r1 = com.whatsapp.notification.PopupNotification.H;
        if (r11 != 0) goto L_0x000d;
    L_0x000a:
        r0 = "";
    L_0x000c:
        return r0;
    L_0x000d:
        r2 = r11.j;
        if (r2 != 0) goto L_0x01f5;
    L_0x0011:
        r0 = r11.f();
        if (r0 == 0) goto L_0x0026;
    L_0x0017:
        r1 = r0.length();
        r2 = (long) r1;
        r4 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x0026;
    L_0x0022:
        r0 = c(r0);
    L_0x0026:
        r1 = r12.w();
        if (r1 == 0) goto L_0x0170;
    L_0x002c:
        r1 = r11.a;
        r2 = 6;
        if (r1 != r2) goto L_0x0036;
    L_0x0031:
        r0 = com.whatsapp.ConversationRowDivider.c(r11);
        goto L_0x000c;
    L_0x0036:
        if (r13 == 0) goto L_0x0093;
    L_0x0038:
        r1 = r11.e;
        r1 = r1.b;
        if (r1 != 0) goto L_0x0072;
    L_0x003e:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r11.F;
        r2 = a(r2, r10);
        r1 = r1.append(r2);
        r2 = z;
        r3 = 19;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r12.a(r10);
        r1 = r1.append(r2);
        r2 = z;
        r3 = 21;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        goto L_0x000c;
    L_0x0072:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r12.a(r10);
        r1 = r1.append(r2);
        r2 = z;
        r3 = 23;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        goto L_0x000c;
    L_0x0093:
        if (r14 == 0) goto L_0x00f7;
    L_0x0095:
        r1 = r11.e;
        r1 = r1.b;
        if (r1 != 0) goto L_0x00cc;
    L_0x009b:
        r1 = new java.lang.CharSequence[r7];
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r11.F;
        r3 = a(r3, r10);
        r2 = r2.append(r3);
        r3 = " ";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r2 = com.whatsapp.util.a5.a(r2);
        r2 = d(r2);
        r1[r8] = r2;
        r0 = com.whatsapp.util.a5.a(r0);
        r1[r6] = r0;
        r0 = android.text.TextUtils.concat(r1);
        goto L_0x000c;
    L_0x00cc:
        r1 = new java.lang.CharSequence[r7];
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r10.getString(r9);
        r2 = r2.append(r3);
        r3 = " ";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r2 = d(r2);
        r1[r8] = r2;
        r0 = com.whatsapp.util.a5.a(r0);
        r1[r6] = r0;
        r0 = android.text.TextUtils.concat(r1);
        goto L_0x000c;
    L_0x00f7:
        r1 = r11.e;
        r1 = r1.b;
        if (r1 != 0) goto L_0x012e;
    L_0x00fd:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 26;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r11.F;
        r2 = a(r2, r10);
        r1 = r1.append(r2);
        r2 = z;
        r3 = 27;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        r0 = android.text.Html.fromHtml(r0);
        goto L_0x000c;
    L_0x012e:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 29;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = com.whatsapp.util.Log.a(r11);
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = 2131624133; // 0x7f0e00c5 float:1.8875437E38 double:1.053162254E-314;
        r2 = r10.getString(r2);
        r1 = r1.append(r2);
        r2 = z;
        r3 = 28;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        goto L_0x000c;
    L_0x0170:
        if (r13 == 0) goto L_0x0193;
    L_0x0172:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r12.a(r10);
        r1 = r1.append(r2);
        r2 = z;
        r3 = 25;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        goto L_0x000c;
    L_0x0193:
        if (r14 == 0) goto L_0x000c;
    L_0x0195:
        r1 = r11.e;
        r1 = r1.b;
        if (r1 != 0) goto L_0x01ca;
    L_0x019b:
        r1 = new java.lang.CharSequence[r7];
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r12.a(r10);
        r3 = com.whatsapp.util.a5.a(r3);
        r2 = r2.append(r3);
        r3 = " ";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r2 = d(r2);
        r1[r8] = r2;
        r0 = com.whatsapp.util.a5.a(r0);
        r1[r6] = r0;
        r0 = android.text.TextUtils.concat(r1);
        goto L_0x000c;
    L_0x01ca:
        r1 = new java.lang.CharSequence[r7];
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r10.getString(r9);
        r2 = r2.append(r3);
        r3 = " ";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r2 = d(r2);
        r1[r8] = r2;
        r0 = com.whatsapp.util.a5.a(r0);
        r1[r6] = r0;
        r0 = android.text.TextUtils.concat(r1);
        goto L_0x000c;
    L_0x01f5:
        if (r2 != r6) goto L_0x01fc;
    L_0x01f7:
        r0 = 2131624187; // 0x7f0e00fb float:1.8875547E38 double:1.0531622806E-314;
        if (r1 == 0) goto L_0x0230;
    L_0x01fc:
        if (r2 != r7) goto L_0x020c;
    L_0x01fe:
        r0 = r11.w;
        if (r0 != r6) goto L_0x0207;
    L_0x0202:
        r0 = 2131624191; // 0x7f0e00ff float:1.8875555E38 double:1.0531622826E-314;
        if (r1 == 0) goto L_0x0230;
    L_0x0207:
        r0 = 2131624181; // 0x7f0e00f5 float:1.8875534E38 double:1.0531622777E-314;
        if (r1 == 0) goto L_0x0230;
    L_0x020c:
        r0 = 3;
        if (r2 != r0) goto L_0x0214;
    L_0x020f:
        r0 = 2131624190; // 0x7f0e00fe float:1.8875553E38 double:1.053162282E-314;
        if (r1 == 0) goto L_0x0230;
    L_0x0214:
        r0 = 4;
        if (r2 != r0) goto L_0x021c;
    L_0x0217:
        r0 = 2131624186; // 0x7f0e00fa float:1.8875545E38 double:1.05316228E-314;
        if (r1 == 0) goto L_0x0230;
    L_0x021c:
        r0 = 5;
        if (r2 != r0) goto L_0x0224;
    L_0x021f:
        r0 = 2131624188; // 0x7f0e00fc float:1.8875549E38 double:1.053162281E-314;
        if (r1 == 0) goto L_0x0230;
    L_0x0224:
        r0 = 8;
        if (r2 != r0) goto L_0x022d;
    L_0x0228:
        r0 = 2131624182; // 0x7f0e00f6 float:1.8875536E38 double:1.053162278E-314;
        if (r1 == 0) goto L_0x0230;
    L_0x022d:
        r0 = 2131624189; // 0x7f0e00fd float:1.887555E38 double:1.0531622816E-314;
    L_0x0230:
        r1 = r12.w();
        if (r1 == 0) goto L_0x033d;
    L_0x0236:
        if (r13 == 0) goto L_0x029c;
    L_0x0238:
        r1 = r11.e;
        r1 = r1.b;
        if (r1 != 0) goto L_0x0277;
    L_0x023e:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r11.F;
        r2 = a(r2, r10);
        r1 = r1.append(r2);
        r2 = z;
        r3 = 20;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r12.a(r10);
        r1 = r1.append(r2);
        r2 = z;
        r3 = 18;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r10.getString(r0);
        r0 = r1.append(r0);
        r0 = r0.toString();
        goto L_0x000c;
    L_0x0277:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r12.a(r10);
        r1 = r1.append(r2);
        r2 = z;
        r3 = 30;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r10.getString(r0);
        r0 = r1.append(r0);
        r0 = r0.toString();
        goto L_0x000c;
    L_0x029c:
        if (r14 == 0) goto L_0x0308;
    L_0x029e:
        r1 = r11.e;
        r1 = r1.b;
        if (r1 != 0) goto L_0x02d9;
    L_0x02a4:
        r1 = new java.lang.CharSequence[r7];
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r11.F;
        r3 = a(r3, r10);
        r2 = r2.append(r3);
        r3 = " ";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r2 = com.whatsapp.util.a5.a(r2);
        r2 = d(r2);
        r1[r8] = r2;
        r0 = r10.getString(r0);
        r0 = com.whatsapp.util.a5.a(r0);
        r1[r6] = r0;
        r0 = android.text.TextUtils.concat(r1);
        goto L_0x000c;
    L_0x02d9:
        r1 = new java.lang.CharSequence[r7];
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r10.getString(r9);
        r2 = r2.append(r3);
        r3 = " ";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r2 = d(r2);
        r1[r8] = r2;
        r0 = r10.getString(r0);
        r0 = com.whatsapp.util.a5.a(r0);
        r1[r6] = r0;
        r0 = android.text.TextUtils.concat(r1);
        goto L_0x000c;
    L_0x0308:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 24;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r11.F;
        r2 = a(r2, r10);
        r1 = r1.append(r2);
        r2 = z;
        r3 = 17;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r10.getString(r0);
        r0 = r1.append(r0);
        r0 = r0.toString();
        r0 = android.text.Html.fromHtml(r0);
        goto L_0x000c;
    L_0x033d:
        if (r13 == 0) goto L_0x0364;
    L_0x033f:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r12.a(r10);
        r1 = r1.append(r2);
        r2 = z;
        r3 = 22;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r10.getString(r0);
        r0 = r1.append(r0);
        r0 = r0.toString();
        goto L_0x000c;
    L_0x0364:
        if (r14 == 0) goto L_0x03ce;
    L_0x0366:
        r1 = r11.e;
        r1 = r1.b;
        if (r1 != 0) goto L_0x039f;
    L_0x036c:
        r1 = new java.lang.CharSequence[r7];
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r12.a(r10);
        r2 = r2.append(r3);
        r3 = " ";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r2 = com.whatsapp.util.a5.a(r2);
        r2 = d(r2);
        r1[r8] = r2;
        r0 = r10.getString(r0);
        r0 = com.whatsapp.util.a5.a(r0);
        r1[r6] = r0;
        r0 = android.text.TextUtils.concat(r1);
        goto L_0x000c;
    L_0x039f:
        r1 = new java.lang.CharSequence[r7];
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r10.getString(r9);
        r2 = r2.append(r3);
        r3 = " ";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r2 = d(r2);
        r1[r8] = r2;
        r0 = r10.getString(r0);
        r0 = com.whatsapp.util.a5.a(r0);
        r1[r6] = r0;
        r0 = android.text.TextUtils.concat(r1);
        goto L_0x000c;
    L_0x03ce:
        r0 = r10.getString(r0);
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.t.a(android.content.Context, com.whatsapp.protocol.b, com.whatsapp.m8, boolean, boolean):java.lang.CharSequence");
    }

    public static void d(Context context, String str) {
        a(context, str, true);
    }

    public static boolean a(Context context, String str) {
        return e(context, str) || b(str);
    }

    public static void b() {
        a.clear();
    }

    public static long c(Context context, String str) {
        if (b == null) {
            a(context);
        }
        if (b.containsKey(str)) {
            long j = ((e) b.get(str)).b;
            if (j > System.currentTimeMillis()) {
                return j;
            }
            d(context, str);
        }
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(android.content.Context r7, com.whatsapp.protocol.b r8, com.whatsapp.m8 r9) {
        /*
        r6 = 2131624631; // 0x7f0e02b7 float:1.8876447E38 double:1.0531625E-314;
        r5 = 1;
        r4 = 0;
        r1 = com.whatsapp.notification.PopupNotification.H;
        r0 = r9.w();
        if (r0 != 0) goto L_0x001b;
    L_0x000d:
        r0 = new java.lang.Object[r5];
        r2 = r9.a(r7);
        r0[r4] = r2;
        r0 = r7.getString(r6, r0);
        if (r1 == 0) goto L_0x00a3;
    L_0x001b:
        r0 = r8.a;
        r2 = 6;
        if (r0 != r2) goto L_0x0026;
    L_0x0020:
        r0 = com.whatsapp.ConversationRowDivider.c(r8);
        if (r1 == 0) goto L_0x00a3;
    L_0x0026:
        r0 = r8.F;
        if (r0 == 0) goto L_0x0057;
    L_0x002a:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = com.whatsapp.App.P;
        r3 = r8.F;
        r2 = r2.a(r3);
        r2 = r2.a(r7);
        r0 = r0.append(r2);
        r2 = z;
        r3 = 10;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r9.a(r7);
        r0 = r0.append(r2);
        r0 = r0.toString();
        if (r1 == 0) goto L_0x009b;
    L_0x0057:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 12;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = com.whatsapp.util.Log.a(r8);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = 2131624133; // 0x7f0e00c5 float:1.8875437E38 double:1.053162254E-314;
        r1 = r7.getString(r1);
        r0 = r0.append(r1);
        r1 = z;
        r2 = 11;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r9.a(r7);
        r0 = r0.append(r1);
        r0 = r0.toString();
    L_0x009b:
        r1 = new java.lang.Object[r5];
        r1[r4] = r0;
        r0 = r7.getString(r6, r1);
    L_0x00a3:
        r0 = com.whatsapp.util.a5.a(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.t.b(android.content.Context, com.whatsapp.protocol.b, com.whatsapp.m8):java.lang.String");
    }

    public static void a(Context context, String str, long j, boolean z, boolean z2) {
        if (b == null) {
            a(context);
        }
        b.put(str, new e(j, z));
        Editor edit = context.getSharedPreferences(z[14], 0).edit();
        edit.putString(z[15], a());
        if (!edit.commit()) {
            Log.e(z[16]);
        }
        App.p(str);
        if (z2) {
            App.a(5, str, j);
        }
    }

    public static boolean e(Context context, String str) {
        return c(context, str) != 0;
    }

    public static void a(Context context, String str, long j, boolean z) {
        a(context, str, j, z, true);
    }

    public static void a(String str) {
        a.put(str, Long.valueOf(System.currentTimeMillis() + Math.min((30000 + (5000 * ((long) bd.i(str).h()))) - 1, 120000)));
    }

    private static CharSequence d(String str) {
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(str);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, str.length(), 0);
        return spannableStringBuilder;
    }

    private static String a(String str, Context context) {
        if (str != null) {
            return App.P.a(str).a(context);
        }
        Log.w(z[13]);
        return "";
    }

    public static boolean b(String str) {
        Long l = (Long) a.get(str);
        if (l == null) {
            return false;
        }
        if (l.longValue() > System.currentTimeMillis()) {
            return true;
        }
        a.remove(str);
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.notification.av a(android.content.Context r6, com.whatsapp.protocol.b r7, com.whatsapp.m8 r8) {
        /*
        r3 = 1;
        r1 = com.whatsapp.notification.PopupNotification.H;
        if (r7 != 0) goto L_0x000f;
    L_0x0005:
        r0 = new com.whatsapp.notification.av;
        r1 = "";
        r2 = "";
        r0.<init>(r1, r2);
    L_0x000e:
        return r0;
    L_0x000f:
        r0 = r7.j;
        if (r0 != 0) goto L_0x008c;
    L_0x0013:
        r0 = r7.f();
        if (r0 == 0) goto L_0x0028;
    L_0x0019:
        r1 = r0.length();
        r2 = (long) r1;
        r4 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x0028;
    L_0x0024:
        r0 = c(r0);
    L_0x0028:
        r1 = r8.w();
        if (r1 != 0) goto L_0x0039;
    L_0x002e:
        r1 = new com.whatsapp.notification.av;
        r2 = r8.a(r6);
        r1.<init>(r2, r0);
        r0 = r1;
        goto L_0x000e;
    L_0x0039:
        r1 = r7.a;
        r2 = 6;
        if (r1 != r2) goto L_0x004c;
    L_0x003e:
        r0 = new com.whatsapp.notification.av;
        r1 = r8.a(r6);
        r2 = com.whatsapp.ConversationRowDivider.c(r7);
        r0.<init>(r1, r2);
        goto L_0x000e;
    L_0x004c:
        r1 = r7.F;
        if (r1 == 0) goto L_0x0081;
    L_0x0050:
        r1 = com.whatsapp.App.P;
        r2 = r7.F;
        r1 = r1.a(r2);
        r1 = r1.a(r6);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r1 = r2.append(r1);
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r8.a(r6);
        r1 = r1.append(r2);
        r2 = r1.toString();
        r1 = new com.whatsapp.notification.av;
        r1.<init>(r2, r0);
        r0 = r1;
        goto L_0x000e;
    L_0x0081:
        r1 = new com.whatsapp.notification.av;
        r2 = r8.a(r6);
        r1.<init>(r2, r0);
        r0 = r1;
        goto L_0x000e;
    L_0x008c:
        r0 = r7.j;
        switch(r0) {
            case 1: goto L_0x00ad;
            case 2: goto L_0x00b2;
            case 3: goto L_0x00bb;
            case 4: goto L_0x00c0;
            case 5: goto L_0x00c5;
            case 6: goto L_0x0091;
            case 7: goto L_0x0091;
            case 8: goto L_0x00ca;
            default: goto L_0x0091;
        };
    L_0x0091:
        r0 = 2131624189; // 0x7f0e00fd float:1.887555E38 double:1.0531622816E-314;
    L_0x0094:
        r1 = r6.getString(r0);
        r0 = r8.w();
        if (r0 == 0) goto L_0x00a2;
    L_0x009e:
        r0 = r7.F;
        if (r0 != 0) goto L_0x00d4;
    L_0x00a2:
        r0 = new com.whatsapp.notification.av;
        r2 = r8.a(r6);
        r0.<init>(r2, r1);
        goto L_0x000e;
    L_0x00ad:
        r0 = 2131624187; // 0x7f0e00fb float:1.8875547E38 double:1.0531622806E-314;
        if (r1 == 0) goto L_0x0094;
    L_0x00b2:
        r0 = r7.w;
        if (r0 != r3) goto L_0x00d0;
    L_0x00b6:
        r0 = 2131624191; // 0x7f0e00ff float:1.8875555E38 double:1.0531622826E-314;
    L_0x00b9:
        if (r1 == 0) goto L_0x0094;
    L_0x00bb:
        r0 = 2131624190; // 0x7f0e00fe float:1.8875553E38 double:1.053162282E-314;
        if (r1 == 0) goto L_0x0094;
    L_0x00c0:
        r0 = 2131624186; // 0x7f0e00fa float:1.8875545E38 double:1.05316228E-314;
        if (r1 == 0) goto L_0x0094;
    L_0x00c5:
        r0 = 2131624188; // 0x7f0e00fc float:1.8875549E38 double:1.053162281E-314;
        if (r1 == 0) goto L_0x0094;
    L_0x00ca:
        r0 = 2131624182; // 0x7f0e00f6 float:1.8875536E38 double:1.053162278E-314;
        if (r1 == 0) goto L_0x0094;
    L_0x00cf:
        goto L_0x0091;
    L_0x00d0:
        r0 = 2131624181; // 0x7f0e00f5 float:1.8875534E38 double:1.0531622777E-314;
        goto L_0x00b9;
    L_0x00d4:
        r0 = com.whatsapp.App.P;
        r2 = r7.F;
        r0 = r0.a(r2);
        r0 = r0.a(r6);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r2.append(r0);
        r2 = z;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r8.a(r6);
        r0 = r0.append(r2);
        r2 = r0.toString();
        r0 = new com.whatsapp.notification.av;
        r0.<init>(r2, r1);
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.t.a(android.content.Context, com.whatsapp.protocol.b, com.whatsapp.m8):com.whatsapp.notification.av");
    }

    public static boolean b(Context context, String str) {
        if (b == null) {
            a(context);
        }
        if (b.containsKey(str)) {
            if (((e) b.get(str)).b > System.currentTimeMillis()) {
                return ((e) b.get(str)).a;
            }
            d(context, str);
        }
        return true;
    }

    private static String a() {
        boolean z = PopupNotification.H;
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : b.entrySet()) {
            String str = (String) entry.getKey();
            e eVar = (e) entry.getValue();
            if (stringBuilder.length() != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(str).append('#').append(eVar.b);
            if (!eVar.a) {
                stringBuilder.append('#').append(Boolean.toString(false));
                continue;
            }
            if (z) {
                break;
            }
        }
        return stringBuilder.toString();
    }
}
