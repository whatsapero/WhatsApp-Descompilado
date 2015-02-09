package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.SharedPreferences.Editor;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class EnterPhoneNumber extends VerifyNumber {
    private static final String[] A;
    protected static long s;
    protected static String t;
    protected static String u;
    protected static int w;
    protected static String x;
    protected afi r;
    protected boolean v;
    protected ProgressDialog y;
    protected boolean z;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r7, java.lang.String r8) {
        /*
        r6 = 15;
        r5 = 8;
        r2 = 7;
        r0 = 3;
        r1 = 1;
        r3 = r7.length();	 Catch:{ IOException -> 0x002f }
        if (r3 < r1) goto L_0x0013;
    L_0x000d:
        r3 = r7.length();	 Catch:{ IOException -> 0x002f }
        if (r3 <= r0) goto L_0x004e;
    L_0x0013:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0031 }
        r0.<init>();	 Catch:{ IOException -> 0x0031 }
        r1 = A;	 Catch:{ IOException -> 0x0031 }
        r3 = 18;
        r1 = r1[r3];	 Catch:{ IOException -> 0x0031 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0031 }
        r0 = r0.append(r7);	 Catch:{ IOException -> 0x0031 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0031 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x0031 }
        r0 = 2;
    L_0x002e:
        return r0;
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0031 }
    L_0x0031:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = A;
        r4 = 17;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r2;
        goto L_0x002e;
    L_0x004e:
        r3 = com.whatsapp.ats.f(r7);	 Catch:{ IOException -> 0x0031 }
        if (r3 != 0) goto L_0x006f;
    L_0x0054:
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0031 }
        r1.<init>();	 Catch:{ IOException -> 0x0031 }
        r3 = A;	 Catch:{ IOException -> 0x0031 }
        r4 = 8;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0031 }
        r1 = r1.append(r3);	 Catch:{ IOException -> 0x0031 }
        r1 = r1.append(r7);	 Catch:{ IOException -> 0x0031 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0031 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IOException -> 0x0031 }
        goto L_0x002e;
    L_0x006f:
        if (r8 == 0) goto L_0x0089;
    L_0x0071:
        r0 = r8.length();	 Catch:{ IOException -> 0x00a5 }
        if (r0 == 0) goto L_0x0089;
    L_0x0077:
        r0 = A;	 Catch:{ IOException -> 0x00a7 }
        r3 = 12;
        r0 = r0[r3];	 Catch:{ IOException -> 0x00a7 }
        r3 = "";
        r0 = r8.replaceAll(r0, r3);	 Catch:{ IOException -> 0x00a7 }
        r0 = r0.length();	 Catch:{ IOException -> 0x00a7 }
        if (r0 != 0) goto L_0x00a9;
    L_0x0089:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0031 }
        r0.<init>();	 Catch:{ IOException -> 0x0031 }
        r1 = A;	 Catch:{ IOException -> 0x0031 }
        r3 = 14;
        r1 = r1[r3];	 Catch:{ IOException -> 0x0031 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0031 }
        r0 = r0.append(r7);	 Catch:{ IOException -> 0x0031 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0031 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x0031 }
        r0 = 4;
        goto L_0x002e;
    L_0x00a5:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00a7 }
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0031 }
    L_0x00a9:
        r0 = java.lang.Integer.parseInt(r7);	 Catch:{ IOException -> 0x0031 }
        r3 = A;	 Catch:{ IOException -> 0x0031 }
        r4 = 9;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0031 }
        r4 = "";
        r3 = r8.replaceAll(r3, r4);	 Catch:{ IOException -> 0x0031 }
        r3 = com.whatsapp.ats.a(r0, r3);	 Catch:{ IOException -> 0x0031 }
        r4 = r3.length();	 Catch:{ IOException -> 0x0031 }
        r4 = com.whatsapp.ats.a(r0, r4);	 Catch:{ IOException -> 0x0031 }
        if (r4 == 0) goto L_0x0109;
    L_0x00c7:
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0102 }
        r1.<init>();	 Catch:{ IOException -> 0x0102 }
        r5 = A;	 Catch:{ IOException -> 0x0102 }
        r6 = 10;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0102 }
        r1 = r1.append(r5);	 Catch:{ IOException -> 0x0102 }
        r0 = r1.append(r0);	 Catch:{ IOException -> 0x0102 }
        r1 = A;	 Catch:{ IOException -> 0x0102 }
        r5 = 11;
        r1 = r1[r5];	 Catch:{ IOException -> 0x0102 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0102 }
        r0 = r0.append(r3);	 Catch:{ IOException -> 0x0102 }
        r1 = A;	 Catch:{ IOException -> 0x0102 }
        r3 = 13;
        r1 = r1[r3];	 Catch:{ IOException -> 0x0102 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0102 }
        r0 = r0.append(r4);	 Catch:{ IOException -> 0x0102 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0102 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x0102 }
        if (r4 >= 0) goto L_0x0106;
    L_0x00ff:
        r0 = 5;
        goto L_0x002e;
    L_0x0102:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0104 }
    L_0x0104:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0031 }
    L_0x0106:
        r0 = 6;
        goto L_0x002e;
    L_0x0109:
        r0 = r7.length();	 Catch:{ IOException -> 0x014a }
        r4 = r3.length();	 Catch:{ IOException -> 0x014a }
        r0 = r0 + r4;
        if (r0 > r6) goto L_0x011f;
    L_0x0114:
        r0 = r7.length();	 Catch:{ IOException -> 0x014a }
        r4 = r3.length();	 Catch:{ IOException -> 0x014a }
        r0 = r0 + r4;
        if (r0 >= r5) goto L_0x014c;
    L_0x011f:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0031 }
        r0.<init>();	 Catch:{ IOException -> 0x0031 }
        r1 = A;	 Catch:{ IOException -> 0x0031 }
        r4 = 15;
        r1 = r1[r4];	 Catch:{ IOException -> 0x0031 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0031 }
        r0 = r0.append(r7);	 Catch:{ IOException -> 0x0031 }
        r1 = A;	 Catch:{ IOException -> 0x0031 }
        r4 = 16;
        r1 = r1[r4];	 Catch:{ IOException -> 0x0031 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0031 }
        r0 = r0.append(r3);	 Catch:{ IOException -> 0x0031 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0031 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x0031 }
        r0 = r2;
        goto L_0x002e;
    L_0x014a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0031 }
    L_0x014c:
        r0 = r1;
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.EnterPhoneNumber.a(java.lang.String, java.lang.String):int");
    }

    protected boolean c() {
        return getPreferences(0).getBoolean(A[21], false);
    }

    protected void b() {
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case a6.D /*9*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.register_connecting));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                this.y = progressDialog;
                return progressDialog;
            case vk.SherlockTheme_windowContentOverlay /*22*/:
                Log.w(A[3]);
                CharSequence string = getString(R.string.register_unrecoverable_error);
                String str = A[5];
                if (A[0].equals(VerifyNumber.c()) && A[6].equals(App.a3.getSubscriberId())) {
                    string = string + A[1] + getString(R.string.eula_tablets_not_supported);
                    Log.i(A[4]);
                    str = A[2];
                }
                return new Builder(this).setMessage(string).setPositiveButton(R.string.register_contact_support, new ys(this, str)).setNeutralButton(R.string.cancel, new bc(this)).create();
            case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                Log.w(A[7]);
                return new Builder(this).setMessage(getString(R.string.register_user_is_banned_top) + "\n" + b7.a(VerifyNumber.a(u, x)) + "\n" + getString(R.string.register_user_is_banned_bottom)).setNeutralButton(R.string.ok, new rv(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    protected void b(boolean z) {
    }

    protected void a(boolean z) {
        this.v = z;
        Editor edit = getPreferences(0).edit();
        edit.putBoolean(A[19], this.v);
        if (!edit.commit()) {
            Log.w(A[20]);
        }
    }

    static {
        String[] strArr = new String[22];
        String str = "#\u001cyZ\u0013 \u0018t^\u0015'";
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
                        i4 = 18;
                        break;
                    case ay.f /*1*/:
                        i4 = 41;
                        break;
                    case ay.n /*2*/:
                        i4 = 76;
                        break;
                    case ay.p /*3*/:
                        i4 = 111;
                        break;
                    default:
                        i4 = 38;
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
                    str = "`L+\u0006UfL>BVzF\"\n\u0015";
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    str = "wG8\nTbA#\u0001C=M%\u000eJ}Nc\u001aH`L/\u0000Pw[-\rJw\u0004)\u001dT}[";
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "wG8\nTbA#\u0001C=\\\"\u001dCqF:\nTsK \n\tbF?\u001cOpE)BRsK \nR";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "`L+\u0006UfL>BVzF\"\n\u0014";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "!\u0018|V\u001f'\u0019|_\u0016\"\u0019|_\u0016";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    str = "wG8\nTbA#\u0001C=M%\u000eJ}Nc\rG|";
                    i = 6;
                    i2 = 7;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    strArr2 = strArr3;
                    str = "wG8\nTbA#\u0001C=J/@DsMa\u0001G\u007fLl";
                    i = 7;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "Nm";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "wG8\nTbA#\u0001C=G9\u0002\tw[>\u0000T=@\"\u0019G~@(OEq\u0014";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "2Y$\u0000Hw\u0014";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "Nm";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "2[)\u001c\u001b";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "wG8\nTbA#\u0001C=G9\u0002\tw[>\u0000T=L!\u001fRk\t/\f\u001b";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "wG8\nTbA#\u0001C=G9\u0002\tw[>\u0000T=E)\u0001AfAl\fE/";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "2Y$R";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "wG8\nTbA#\u0001C=L>\u001dI`\t8\u001dO\u007fe)\u000eB{G+5C`Fl\u0000T2E#\u0000MgY\u000f\u0000S|]>\u0016hsD)O@`F!Oe}\\\"\u001bTky$\u0000Hw`\"\tI2`\u0003*^qL<\u001bO}G";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    str = "wG8\nTbA#\u0001C=J/@DsMa\u0003C|N8\u0007\u0006qJq";
                    i = 17;
                    i2 = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    strArr2 = strArr3;
                    str = "qF!AQzH8\u001cGbYb=Cu@?\u001bC`y$\u0000Hw\u0007\"\u0000yaL \tyaL\"\u000b";
                    i = 18;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "wG8\nTbA#\u0001C=Z-\u0019CaL>\u0019C`Y)\u001dK{Z?\u0006I|\u0006/\u0000K\u007f@8O@s@ \nB";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "qF!AQzH8\u001cGbYb=Cu@?\u001bC`y$\u0000Hw\u0007\"\u0000yaL \tyaL\"\u000b";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    A = strArr3;
                    u = null;
                    x = null;
                    w = 7;
                    t = null;
                default:
                    strArr2[i2] = str;
                    str = "\u0018#";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public EnterPhoneNumber() {
        this.v = false;
        this.z = false;
    }

    protected void d() {
        removeDialog(9);
        this.y = null;
    }
}
