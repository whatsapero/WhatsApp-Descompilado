package com.whatsapp;

import android.support.v4.text.BidiFormatter;
import android.support.v4.text.BidiFormatter.Builder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class b7 {
    public static final boolean a;
    private static final String[] b;
    public static final BidiFormatter c;
    private static final String[] z;

    public static View a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        return a(layoutInflater, i, viewGroup, z, null);
    }

    public static int a(int i) {
        if ((8388608 & i) != 0) {
            return i;
        }
        if ((i & 7) == 5) {
            return (i & -8) | 3;
        }
        return (i & 7) == 3 ? (i & -8) | 5 : i;
    }

    public static View a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, int[] iArr) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        a(inflate, iArr);
        return inflate;
    }

    public static boolean a(CharSequence charSequence) {
        boolean z = false;
        try {
            if (TextUtils.isEmpty(charSequence)) {
                Log.w(z[2]);
                return true;
            }
            int codePointAt = charSequence.toString().codePointAt(0);
            if (codePointAt < 1424 || codePointAt > 1791) {
                z = true;
            }
            return z;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.widget.TextView r3, java.lang.CharSequence r4) {
        /*
        r1 = com.whatsapp.App.az;
        r0 = a;	 Catch:{ IllegalArgumentException -> 0x0007 }
        if (r0 == 0) goto L_0x0009;
    L_0x0006:
        return;
    L_0x0007:
        r0 = move-exception;
        throw r0;
    L_0x0009:
        if (r3 == 0) goto L_0x0006;
    L_0x000b:
        r0 = r3.getGravity();
        r0 = r0 & -8;
        r2 = android.text.TextUtils.isEmpty(r4);	 Catch:{ IllegalArgumentException -> 0x0035 }
        if (r2 == 0) goto L_0x0025;
    L_0x0017:
        r2 = com.whatsapp.App.as();	 Catch:{ IllegalArgumentException -> 0x0035 }
        if (r2 == 0) goto L_0x0021;
    L_0x001d:
        r0 = r0 | 3;
        if (r1 == 0) goto L_0x0031;
    L_0x0021:
        r0 = r0 | 5;
        if (r1 == 0) goto L_0x0031;
    L_0x0025:
        r2 = a(r4);	 Catch:{ IllegalArgumentException -> 0x0037 }
        if (r2 == 0) goto L_0x002f;
    L_0x002b:
        r0 = r0 | 3;
        if (r1 == 0) goto L_0x0031;
    L_0x002f:
        r0 = r0 | 5;
    L_0x0031:
        r3.setGravity(r0);
        goto L_0x0006;
    L_0x0035:
        r0 = move-exception;
        throw r0;
    L_0x0037:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.b7.a(android.widget.TextView, java.lang.CharSequence):void");
    }

    public static void a(View view) {
        a(view, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.view.View r12, int[] r13) {
        /*
        r11 = 7;
        r10 = 5;
        r9 = 11;
        r8 = 1;
        r2 = 0;
        r4 = com.whatsapp.App.az;
        r0 = com.whatsapp.App.as();	 Catch:{ NoSuchFieldException -> 0x000f }
        if (r0 == 0) goto L_0x0011;
    L_0x000e:
        return;
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        if (r13 == 0) goto L_0x0023;
    L_0x0013:
        r1 = r12.getId();
        r3 = r13.length;
        r0 = r2;
    L_0x0019:
        if (r0 >= r3) goto L_0x0023;
    L_0x001b:
        r5 = r13[r0];
        if (r5 == r1) goto L_0x000e;
    L_0x001f:
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x0019;
    L_0x0023:
        r0 = r12.getPaddingRight();
        r1 = r12.getPaddingTop();
        r3 = r12.getPaddingLeft();
        r5 = r12.getPaddingBottom();
        r12.setPadding(r0, r1, r3, r5);
        r1 = r12.getLayoutParams();
        r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams;
        if (r0 == 0) goto L_0x004c;
    L_0x003e:
        r0 = r1;
        r0 = (android.view.ViewGroup.MarginLayoutParams) r0;
        r3 = r0.rightMargin;
        r5 = r0.topMargin;
        r6 = r0.leftMargin;
        r7 = r0.bottomMargin;
        r0.setMargins(r3, r5, r6, r7);
    L_0x004c:
        r0 = r1 instanceof android.widget.RelativeLayout.LayoutParams;
        if (r0 == 0) goto L_0x0075;
    L_0x0050:
        r0 = r1;
        r0 = (android.widget.RelativeLayout.LayoutParams) r0;
        r3 = r0.getRules();
        r5 = r3[r2];
        r6 = r3[r8];
        r3[r8] = r5;
        r3[r2] = r6;
        r5 = r3[r10];
        r6 = r3[r11];
        r0.addRule(r10, r6);
        r0.addRule(r11, r5);
        r0 = 9;
        r0 = r3[r0];
        r5 = r3[r9];
        r6 = 9;
        r3[r6] = r5;
        r3[r9] = r0;
    L_0x0075:
        r0 = r1 instanceof android.widget.FrameLayout.LayoutParams;
        if (r0 == 0) goto L_0x0084;
    L_0x0079:
        r0 = r1;
        r0 = (android.widget.FrameLayout.LayoutParams) r0;
        r3 = r0.gravity;
        r3 = a(r3);
        r0.gravity = r3;
    L_0x0084:
        r0 = r1 instanceof android.widget.LinearLayout.LayoutParams;
        if (r0 == 0) goto L_0x0092;
    L_0x0088:
        r1 = (android.widget.LinearLayout.LayoutParams) r1;
        r0 = r1.gravity;
        r0 = a(r0);
        r1.gravity = r0;
    L_0x0092:
        r0 = r12 instanceof android.widget.TextView;	 Catch:{ NoSuchFieldException -> 0x015d }
        if (r0 == 0) goto L_0x00b0;
    L_0x0096:
        r0 = r12 instanceof android.widget.EditText;	 Catch:{ NoSuchFieldException -> 0x015d }
        if (r0 != 0) goto L_0x00b0;
    L_0x009a:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NoSuchFieldException -> 0x015f }
        if (r0 >= r9) goto L_0x00a2;
    L_0x009e:
        r0 = a;	 Catch:{ NoSuchFieldException -> 0x0161 }
        if (r0 != 0) goto L_0x00b0;
    L_0x00a2:
        r0 = r12;
        r0 = (android.widget.TextView) r0;
        r1 = r0.getGravity();
        r1 = a(r1);
        r0.setGravity(r1);
    L_0x00b0:
        r0 = r12 instanceof android.widget.RelativeLayout;
        if (r0 == 0) goto L_0x00ea;
    L_0x00b4:
        r0 = r12;
        r0 = (android.widget.RelativeLayout) r0;
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NoSuchFieldException -> 0x0163 }
        r3 = 16;
        if (r1 < r3) goto L_0x00ca;
    L_0x00bd:
        r1 = r0.getGravity();	 Catch:{ NoSuchFieldException -> 0x0163 }
        r1 = a(r1);	 Catch:{ NoSuchFieldException -> 0x0163 }
        r0.setGravity(r1);	 Catch:{ NoSuchFieldException -> 0x0163 }
        if (r4 == 0) goto L_0x00ea;
    L_0x00ca:
        r1 = android.widget.RelativeLayout.class;
        r3 = z;	 Catch:{ NoSuchFieldException -> 0x0165, IllegalArgumentException -> 0x016a, IllegalAccessException -> 0x0170 }
        r5 = 1;
        r3 = r3[r5];	 Catch:{ NoSuchFieldException -> 0x0165, IllegalArgumentException -> 0x016a, IllegalAccessException -> 0x0170 }
        r1 = r1.getDeclaredField(r3);	 Catch:{ NoSuchFieldException -> 0x0165, IllegalArgumentException -> 0x016a, IllegalAccessException -> 0x0170 }
        r3 = 1;
        r1.setAccessible(r3);	 Catch:{ NoSuchFieldException -> 0x0165, IllegalArgumentException -> 0x016a, IllegalAccessException -> 0x0170 }
        r1 = r1.get(r0);	 Catch:{ NoSuchFieldException -> 0x0165, IllegalArgumentException -> 0x016a, IllegalAccessException -> 0x0170 }
        r1 = (java.lang.Integer) r1;	 Catch:{ NoSuchFieldException -> 0x0165, IllegalArgumentException -> 0x016a, IllegalAccessException -> 0x0170 }
        r1 = r1.intValue();	 Catch:{ NoSuchFieldException -> 0x0165, IllegalArgumentException -> 0x016a, IllegalAccessException -> 0x0170 }
        r1 = a(r1);	 Catch:{ NoSuchFieldException -> 0x0165, IllegalArgumentException -> 0x016a, IllegalAccessException -> 0x0170 }
        r0.setGravity(r1);	 Catch:{ NoSuchFieldException -> 0x0165, IllegalArgumentException -> 0x016a, IllegalAccessException -> 0x0170 }
    L_0x00ea:
        r0 = r12 instanceof android.widget.LinearLayout;
        if (r0 == 0) goto L_0x0143;
    L_0x00ee:
        r0 = r12;
        r0 = (android.widget.LinearLayout) r0;
        r1 = android.widget.LinearLayout.class;
        r3 = z;	 Catch:{ NoSuchFieldException -> 0x0176, IllegalArgumentException -> 0x017b, IllegalAccessException -> 0x0180 }
        r5 = 0;
        r3 = r3[r5];	 Catch:{ NoSuchFieldException -> 0x0176, IllegalArgumentException -> 0x017b, IllegalAccessException -> 0x0180 }
        r1 = r1.getDeclaredField(r3);	 Catch:{ NoSuchFieldException -> 0x0176, IllegalArgumentException -> 0x017b, IllegalAccessException -> 0x0180 }
        r3 = 1;
        r1.setAccessible(r3);	 Catch:{ NoSuchFieldException -> 0x0176, IllegalArgumentException -> 0x017b, IllegalAccessException -> 0x0180 }
        r1 = r1.get(r0);	 Catch:{ NoSuchFieldException -> 0x0176, IllegalArgumentException -> 0x017b, IllegalAccessException -> 0x0180 }
        r1 = (java.lang.Integer) r1;	 Catch:{ NoSuchFieldException -> 0x0176, IllegalArgumentException -> 0x017b, IllegalAccessException -> 0x0180 }
        r1 = r1.intValue();	 Catch:{ NoSuchFieldException -> 0x0176, IllegalArgumentException -> 0x017b, IllegalAccessException -> 0x0180 }
        r1 = a(r1);	 Catch:{ NoSuchFieldException -> 0x0176, IllegalArgumentException -> 0x017b, IllegalAccessException -> 0x0180 }
        r0.setGravity(r1);	 Catch:{ NoSuchFieldException -> 0x0176, IllegalArgumentException -> 0x017b, IllegalAccessException -> 0x0180 }
    L_0x0111:
        r1 = r0.getOrientation();
        if (r1 != 0) goto L_0x0143;
    L_0x0117:
        r3 = r0.getChildCount();
        r5 = new java.util.ArrayList;
        r5.<init>(r3);
        r1 = r2;
    L_0x0121:
        if (r1 >= r3) goto L_0x012e;
    L_0x0123:
        r6 = r0.getChildAt(r1);
        r5.add(r6);
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x0121;
    L_0x012e:
        r0.removeAllViews();
        r1 = r3 + -1;
        r3 = r1;
    L_0x0134:
        if (r3 < 0) goto L_0x0143;
    L_0x0136:
        r1 = r5.get(r3);
        r1 = (android.view.View) r1;
        r0.addView(r1);
        r1 = r3 + -1;
        if (r4 == 0) goto L_0x0185;
    L_0x0143:
        r0 = r12 instanceof android.view.ViewGroup;
        if (r0 == 0) goto L_0x000e;
    L_0x0147:
        r12 = (android.view.ViewGroup) r12;
        r1 = r12.getChildCount();
        r0 = r2;
    L_0x014e:
        if (r0 >= r1) goto L_0x000e;
    L_0x0150:
        r2 = r12.getChildAt(r0);
        a(r2, r13);
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x014e;
    L_0x015b:
        goto L_0x000e;
    L_0x015d:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchFieldException -> 0x015f }
    L_0x015f:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchFieldException -> 0x0161 }
    L_0x0161:
        r0 = move-exception;
        throw r0;
    L_0x0163:
        r0 = move-exception;
        throw r0;
    L_0x0165:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x00ea;
    L_0x016a:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x00ea;
    L_0x0170:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x00ea;
    L_0x0176:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x0111;
    L_0x017b:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x0111;
    L_0x0180:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x0111;
    L_0x0185:
        r3 = r1;
        goto L_0x0134;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.b7.a(android.view.View, int[]):void");
    }

    static {
        String[] strArr = new String[5];
        String str = "&P\f\u001f\n\"c\u0007";
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
                        i3 = 75;
                        break;
                    case ay.f /*1*/:
                        i3 = 23;
                        break;
                    case ay.n /*2*/:
                        i3 = 126;
                        break;
                    case ay.p /*3*/:
                        i3 = 126;
                        break;
                    default:
                        i3 = 124;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u001fr\u0006\n9&x\u0014\u00170*u\u001b\u0012S\"d*\u001b\u0004?[*,\\?r\u0006\n\\\"d^\u001b\u0011;c\u0007^\u001397\u0010\u000b\u0010'";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "(\u007f\u001b\u001d\u00179c\u0012";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u2044\u203d";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    String[] strArr4 = new String[48];
                    i = 0;
                    strArr2 = strArr4;
                    strArr3 = strArr4;
                    str = "\f^099\u0019U,;=\u000f96$0\b&";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    str = "\f^099\u0019U,;=\u000f9467\f%";
                    obj = 5;
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    str = "\f^099\u0019U,;=\u000f9467\u0001&";
                    obj = 6;
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    str = "\f^099\u0019U,;=\u000f9460\t%";
                    obj = 7;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    str = "\f^099\u0019U,;=\u000f9477\f$";
                    obj = 8;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\f^099\u0019U,;=\u000f9477\u0001&";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\f^099\u0019U,;=\u000f9447\f&";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\f^099\u0019U,;=\u000f9447\u0001&";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0002M?:3\u00199(PHeQ70=\u0007";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\r^,;:\u000fDP(MeP70;\u000eE<,9\nSP&5\u0007VL";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\f^099\u0019U,;=\u000f9460\u0006&";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0013@5*4e_;<.\u000e@";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\f^099\u0019U,;=\u000f9467\u000e#";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\rE9FO";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0005r\u0006\n.$z";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u007f9KPMf&MJ#\u000fQ.SNx&";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0018\\?,>\u0005^5^.\u0004Z^ORx9N";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\rE1'3e]64,\b";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\f^099\u0019U,;=\u000f9476\u001d/";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\f^099\u0019U,;=\u000f9466\u001dU";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\f^099\u0019U,;=\u000f9466\u001d.";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\f^099\u0019U,;=\u000f9466\u001dP";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "}9KPM\u0014 MS/\u001bSS7.\u000f:LO";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\f^099\u0019U,;=\u000f9446\u001dU";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\f^099\u0019U,;=\u000f9476\u001dP";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\f^099\u0019U,;=\u000f9&&7\u0002!";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0001E:09\u0006H+M#y9KGR{";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\rE1'3e]74,\b";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\f^099\u0019U,;=\u000f9467\u001a#";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\f^099\u0019U,;=\u000f9&&0\u0006!";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "}9KPMf&HIQ\u0018G:S5\u0019SSJL";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\rE1'3e]64,\u000f";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\f^099\u0019U,;=\u000f9&&7\u001b\\";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\f^099\u0019U,;=\u000f9477\u001a ";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\r^,;:\u000fDP(MeP70;\u000eE<,9\nSP&+\u0000[O";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0004[';1\u0014BJ!He/PN";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\f^099\u0019U,;=\u000f9447\u001a\"";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u007f9NPNeVPNR}%";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0003r\u001c35\u001e^^(J";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\f^099\u0019U,;=\u000f9470\t$";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\r^,;:\u000fDP(MeP70;\u000eE<,9\nSP&+\u0000]L";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\fE4GL";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u007f9NP=e%PMJs";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\f^099\u0019U,;=\u000f94.0\n%";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\f^099\u0019U,;=\u000f94.7\u001b%";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\f^099\u0019U,;=\u000f94.7\u001bR";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\f^099\u0019U,;=\u000f94.0\b&";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\f^099\u0019U,;=\u000f94.7\u0001%";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    b = strArr3;
                    a = a();
                    c = new Builder().setTextDirectionHeuristic(new vm()).build();
                default:
                    strArr2[i] = str;
                    str = "&P\f\u001f\n\"c\u0007";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static String a(String str) {
        try {
            return (App.as() || str == null) ? str : z[4] + str + "\u202c";
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static View a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        return a(layoutInflater, i, viewGroup, viewGroup != null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a() {
        /*
        r8 = 1;
        r10 = -1;
        r9 = 0;
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x000a }
        r1 = 11;
        if (r0 < r1) goto L_0x000c;
    L_0x0009:
        return r8;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r0 = android.os.Build.DISPLAY;	 Catch:{ Exception -> 0x00a5 }
        if (r0 == 0) goto L_0x001a;
    L_0x0010:
        r0 = b;	 Catch:{ Exception -> 0x00a5 }
        r1 = android.os.Build.DISPLAY;	 Catch:{ Exception -> 0x00a5 }
        r0 = com.whatsapp.util.au.a(r0, r1);	 Catch:{ Exception -> 0x00a5 }
        if (r0 != 0) goto L_0x0009;
    L_0x001a:
        r0 = com.whatsapp.App.ax;	 Catch:{ Exception -> 0x00a9 }
        if (r0 == 0) goto L_0x00b9;
    L_0x001e:
        r0 = com.whatsapp.App.p;	 Catch:{ Exception -> 0x00a9 }
        r1 = 2131625132; // 0x7f0e04ac float:1.8877463E38 double:1.0531627475E-314;
        r0 = r0.getText(r1);	 Catch:{ Exception -> 0x00a9 }
    L_0x0027:
        r1 = new android.widget.TextView;	 Catch:{ Exception -> 0x00ab }
        r2 = com.whatsapp.App.p;	 Catch:{ Exception -> 0x00ab }
        r1.<init>(r2);	 Catch:{ Exception -> 0x00ab }
        r2 = 5;
        r1.setGravity(r2);	 Catch:{ Exception -> 0x00ab }
        r1.setText(r0);	 Catch:{ Exception -> 0x00ab }
        r2 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r1.setTextColor(r2);	 Catch:{ Exception -> 0x00ab }
        r2 = -1;
        r1.setBackgroundColor(r2);	 Catch:{ Exception -> 0x00ab }
        r2 = r1.getPaint();	 Catch:{ Exception -> 0x00ab }
        r0 = r0.toString();	 Catch:{ Exception -> 0x00ab }
        r0 = r2.measureText(r0);	 Catch:{ Exception -> 0x00ab }
        r0 = (int) r0;	 Catch:{ Exception -> 0x00ab }
        r0 = r0 * 3;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2);	 Catch:{ Exception -> 0x00ab }
        r2 = 0;
        r3 = 0;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3);	 Catch:{ Exception -> 0x00ab }
        r1.measure(r0, r2);	 Catch:{ Exception -> 0x00ab }
        r0 = r1.getMeasuredWidth();	 Catch:{ Exception -> 0x00ab }
        r0 = r0 / 2;
        r2 = r1.getMeasuredHeight();	 Catch:{ Exception -> 0x00ab }
        r3 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ Exception -> 0x00ab }
        r0 = android.graphics.Bitmap.createBitmap(r0, r2, r3);	 Catch:{ Exception -> 0x00ab }
        r2 = new android.graphics.Canvas;	 Catch:{ Exception -> 0x00ab }
        r2.<init>(r0);	 Catch:{ Exception -> 0x00ab }
        r3 = -1;
        r2.drawColor(r3);	 Catch:{ Exception -> 0x00ab }
        r1 = r1.getLayout();	 Catch:{ Exception -> 0x00ab }
        r1.draw(r2);	 Catch:{ Exception -> 0x00ab }
        r1 = r0.getWidth();	 Catch:{ Exception -> 0x00ab }
        r2 = r0.getHeight();	 Catch:{ Exception -> 0x00ab }
        r1 = r1 * r2;
        r1 = new int[r1];	 Catch:{ Exception -> 0x00ab }
        r2 = 0;
        r3 = r0.getWidth();	 Catch:{ Exception -> 0x00ab }
        r4 = 0;
        r5 = 0;
        r6 = r0.getWidth();	 Catch:{ Exception -> 0x00ab }
        r7 = r0.getHeight();	 Catch:{ Exception -> 0x00ab }
        r0.getPixels(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ Exception -> 0x00ab }
        r2 = r1.length;	 Catch:{ Exception -> 0x00ab }
        r0 = r9;
    L_0x009b:
        if (r9 >= r2) goto L_0x00b6;
    L_0x009d:
        r3 = r1[r9];	 Catch:{ Exception -> 0x00bd }
        if (r3 == r10) goto L_0x00a2;
    L_0x00a1:
        r0 = r8;
    L_0x00a2:
        r9 = r9 + 1;
        goto L_0x009b;
    L_0x00a5:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00a7 }
    L_0x00a7:
        r0 = move-exception;
        throw r0;
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        r1 = r0;
        r0 = r9;
    L_0x00ae:
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r1);
    L_0x00b6:
        r8 = r0;
        goto L_0x0009;
    L_0x00b9:
        r0 = "\u0623";
        goto L_0x0027;
    L_0x00bd:
        r1 = move-exception;
        goto L_0x00ae;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.b7.a():boolean");
    }

    public static void a(TextView textView) {
        if (textView != null) {
            try {
                a(textView, textView.getText());
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }
}
