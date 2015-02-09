package com.whatsapp.util;

import android.content.Context;
import com.whatsapp.vk;
import java.util.Arrays;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class WhatsAppLibLoader {
    private static Boolean a;
    private static final String[] z;

    private static native void testLibraryUsable(byte[] bArr);

    static void a(Context context, String[] strArr) {
        b(context, strArr);
    }

    private static void b(Context context, String[] strArr) {
        int i = Log.e;
        try {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                System.loadLibrary(strArr[i2]);
                i2++;
                if (i != 0) {
                    return;
                }
            }
        } catch (Throwable e) {
            Log.c(z[29], e);
            a(context, e, strArr);
        }
    }

    private static boolean a() {
        byte[] bArr = new byte[3];
        try {
            testLibraryUsable(bArr);
            return Arrays.equals(new byte[]{(byte) 31, (byte) 41, (byte) 59}, bArr);
        } catch (Throwable e) {
            Log.c(z[12], e);
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.Context r11, java.lang.UnsatisfiedLinkError r12, java.lang.String[] r13) {
        /*
        r3 = 0;
        r4 = com.whatsapp.util.Log.e;
        r0 = android.os.Build.CPU_ABI;
        r1 = z;
        r2 = 25;
        r1 = r1[r2];
        r0 = r0.startsWith(r1);
        if (r0 == 0) goto L_0x0019;
    L_0x0011:
        r0 = z;
        r1 = 27;
        r0 = r0[r1];
        if (r4 == 0) goto L_0x0064;
    L_0x0019:
        r0 = android.os.Build.CPU_ABI;	 Catch:{ IOException -> 0x005e }
        r1 = z;	 Catch:{ IOException -> 0x005e }
        r2 = 22;
        r1 = r1[r2];	 Catch:{ IOException -> 0x005e }
        r0 = r0.startsWith(r1);	 Catch:{ IOException -> 0x005e }
        if (r0 == 0) goto L_0x002f;
    L_0x0027:
        r0 = z;
        r1 = 24;
        r0 = r0[r1];
        if (r4 == 0) goto L_0x0064;
    L_0x002f:
        r0 = android.os.Build.CPU_ABI;	 Catch:{ IOException -> 0x0060 }
        r1 = z;	 Catch:{ IOException -> 0x0060 }
        r2 = 20;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0060 }
        r0 = r0.startsWith(r1);	 Catch:{ IOException -> 0x0060 }
        if (r0 == 0) goto L_0x0045;
    L_0x003d:
        r0 = z;
        r1 = 28;
        r0 = r0[r1];
        if (r4 == 0) goto L_0x0064;
    L_0x0045:
        r0 = android.os.Build.CPU_ABI;	 Catch:{ IOException -> 0x0062 }
        r1 = z;	 Catch:{ IOException -> 0x0062 }
        r2 = 21;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0062 }
        r0 = r0.startsWith(r1);	 Catch:{ IOException -> 0x0062 }
        if (r0 == 0) goto L_0x005b;
    L_0x0053:
        r0 = z;
        r1 = 18;
        r0 = r0[r1];
        if (r4 == 0) goto L_0x0064;
    L_0x005b:
        throw r12;	 Catch:{ IOException -> 0x005c }
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r0 = move-exception;
        throw r0;
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        r2 = 0;
        r1 = new java.util.zip.ZipFile;	 Catch:{ IOException -> 0x014b, all -> 0x0148 }
        r5 = new android.content.ContextWrapper;	 Catch:{ IOException -> 0x014b, all -> 0x0148 }
        r5.<init>(r11);	 Catch:{ IOException -> 0x014b, all -> 0x0148 }
        r5 = r5.getPackageCodePath();	 Catch:{ IOException -> 0x014b, all -> 0x0148 }
        r1.<init>(r5);	 Catch:{ IOException -> 0x014b, all -> 0x0148 }
        r5 = r13.length;	 Catch:{ IOException -> 0x010e }
        r2 = r3;
    L_0x0075:
        if (r2 >= r5) goto L_0x0106;
    L_0x0077:
        r3 = r13[r2];	 Catch:{ IOException -> 0x010e }
        r6 = new java.io.File;	 Catch:{ IOException -> 0x010e }
        r7 = r11.getFilesDir();	 Catch:{ IOException -> 0x010e }
        r8 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x010e }
        r8.<init>();	 Catch:{ IOException -> 0x010e }
        r9 = z;	 Catch:{ IOException -> 0x010e }
        r10 = 15;
        r9 = r9[r10];	 Catch:{ IOException -> 0x010e }
        r8 = r8.append(r9);	 Catch:{ IOException -> 0x010e }
        r8 = r8.append(r3);	 Catch:{ IOException -> 0x010e }
        r9 = z;	 Catch:{ IOException -> 0x010e }
        r10 = 19;
        r9 = r9[r10];	 Catch:{ IOException -> 0x010e }
        r8 = r8.append(r9);	 Catch:{ IOException -> 0x010e }
        r8 = r8.toString();	 Catch:{ IOException -> 0x010e }
        r6.<init>(r7, r8);	 Catch:{ IOException -> 0x010e }
        r7 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x010e }
        r7.<init>();	 Catch:{ IOException -> 0x010e }
        r8 = z;	 Catch:{ IOException -> 0x010e }
        r9 = 16;
        r8 = r8[r9];	 Catch:{ IOException -> 0x010e }
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x010e }
        r7 = r7.append(r0);	 Catch:{ IOException -> 0x010e }
        r8 = z;	 Catch:{ IOException -> 0x010e }
        r9 = 13;
        r8 = r8[r9];	 Catch:{ IOException -> 0x010e }
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x010e }
        r3 = r7.append(r3);	 Catch:{ IOException -> 0x010e }
        r7 = z;	 Catch:{ IOException -> 0x010e }
        r8 = 26;
        r7 = r7[r8];	 Catch:{ IOException -> 0x010e }
        r3 = r3.append(r7);	 Catch:{ IOException -> 0x010e }
        r3 = r3.toString();	 Catch:{ IOException -> 0x010e }
        r3 = r1.getEntry(r3);	 Catch:{ IOException -> 0x010e }
        if (r3 != 0) goto L_0x00d8;
    L_0x00d8:
        r3 = r1.getInputStream(r3);	 Catch:{ IOException -> 0x010e }
        r7 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x010e }
        r7.<init>(r6);	 Catch:{ IOException -> 0x010e }
        r8 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r8 = new byte[r8];	 Catch:{ IOException -> 0x010e }
    L_0x00e5:
        r9 = r3.read(r8);	 Catch:{ all -> 0x0122 }
        if (r9 <= 0) goto L_0x00f1;
    L_0x00eb:
        r10 = 0;
        r7.write(r8, r10, r9);	 Catch:{ all -> 0x0122 }
        if (r4 == 0) goto L_0x00e5;
    L_0x00f1:
        if (r3 == 0) goto L_0x00f6;
    L_0x00f3:
        r3.close();	 Catch:{ IOException -> 0x010c }
    L_0x00f6:
        if (r7 == 0) goto L_0x00fb;
    L_0x00f8:
        r7.close();	 Catch:{ IOException -> 0x0120 }
    L_0x00fb:
        r3 = r6.getAbsolutePath();	 Catch:{ IOException -> 0x010e }
        java.lang.System.load(r3);	 Catch:{ IOException -> 0x010e }
        r2 = r2 + 1;
        if (r4 == 0) goto L_0x0075;
    L_0x0106:
        if (r1 == 0) goto L_0x010b;
    L_0x0108:
        r1.close();	 Catch:{ IOException -> 0x0132 }
    L_0x010b:
        return;
    L_0x010c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x010e }
    L_0x010e:
        r0 = move-exception;
    L_0x010f:
        r2 = z;	 Catch:{ all -> 0x0119 }
        r3 = 23;
        r2 = r2[r3];	 Catch:{ all -> 0x0119 }
        com.whatsapp.util.Log.b(r2, r0);	 Catch:{ all -> 0x0119 }
        throw r12;	 Catch:{ all -> 0x0119 }
    L_0x0119:
        r0 = move-exception;
    L_0x011a:
        if (r1 == 0) goto L_0x011f;
    L_0x011c:
        r1.close();	 Catch:{ IOException -> 0x013d }
    L_0x011f:
        throw r0;
    L_0x0120:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x010e }
    L_0x0122:
        r0 = move-exception;
        if (r3 == 0) goto L_0x0128;
    L_0x0125:
        r3.close();	 Catch:{ IOException -> 0x012e }
    L_0x0128:
        if (r7 == 0) goto L_0x012d;
    L_0x012a:
        r7.close();	 Catch:{ IOException -> 0x0130 }
    L_0x012d:
        throw r0;	 Catch:{ IOException -> 0x010e }
    L_0x012e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x010e }
    L_0x0130:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x010e }
    L_0x0132:
        r0 = move-exception;
        r1 = z;
        r2 = 17;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x010b;
    L_0x013d:
        r1 = move-exception;
        r2 = z;
        r3 = 14;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r1);
        goto L_0x011f;
    L_0x0148:
        r0 = move-exception;
        r1 = r2;
        goto L_0x011a;
    L_0x014b:
        r0 = move-exception;
        r1 = r2;
        goto L_0x010f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.WhatsAppLibLoader.a(android.content.Context, java.lang.UnsatisfiedLinkError, java.lang.String[]):void");
    }

    static {
        String[] strArr = new String[30];
        String str = "{40R9kz%_u{)4\u00109a;5U1.68R'o(8U&5z%B,g46\u0010<`)%Q9bz5Y'k9%\u00103|5<\u00104~1";
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
                        i3 = 14;
                        break;
                    case ay.f /*1*/:
                        i3 = 90;
                        break;
                    case ay.n /*2*/:
                        i3 = 81;
                        break;
                    case ay.p /*3*/:
                        i3 = 48;
                        break;
                    default:
                        i3 = 85;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "{40R9kz%_u{)4\u00109g8#Q'g?\"\u00101k)!Y!kz\"E6m?\"C3{6qY;}.0\\9.>8B0m.=Iuh(>]uo*:";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u007f9>]";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "{40R9kz%_u{)4\u0010!f?q\\<l(0B<k)qT0}*8D0.)$S6k)\"V bz=_4j";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "g4\"D4b6qT<|?2Duh(>]uo*:\u0010\"a(:U15z#U!k)%Y;iz=Y7|;#Iu{)0R<b3%I";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u007f9>]";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "m/#F0<od\u0001l";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "y20D&o*!";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "m/#F0<od\u0001l";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "g4\"D4b60D<a4qY&.9>B'{*%\u000bu`;%Y#kz=Y7|;#Y0}z0B0.78C&g46";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "y20D&o*!";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "k(#_'.-9Y9kz%U&z3?Wub33B4|#qE&o88\\<z#";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "!68R";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    str = "y20D&o*!\\<l6>Q1k(~S9a)4J3";
                    obj = 13;
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    strArr2 = strArr3;
                    str = "b33";
                    obj = 14;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "b33\u001f";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "y20D&o*!\\<l6>Q1k(~S9a)4J3";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "c3!C";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = " )>";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "vbg";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "c3!C";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "o(<U4l3";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "y20D&o*!\\<l6>Q1k(~Y:k(#_'";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "o(<U4l3";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "o(<U4l3|Fb";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = " )>";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "o(<U4l3|Fbo";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "vbg";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "y20D&o*!\\<l6>Q1k(~\\:o>4B'a(";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = null;
                default:
                    strArr2[i] = str;
                    str = "b33B4|#qE&o88\\<z#qC!g6=\u00107|5:U;5z%X'a-8^2..>\u00106a(#E%zz8^&z;=\\4z3>^uo9%Y#g.(";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(android.content.Context r8) {
        /*
        r0 = 1;
        r1 = 0;
        r2 = com.whatsapp.util.WhatsAppLibLoader.class;
        monitor-enter(r2);
        r3 = a;	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        if (r3 != 0) goto L_0x00b5;
    L_0x0009:
        r3 = java.lang.Boolean.FALSE;	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        a = r3;	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r3 = 3;
        r3 = new java.lang.String[r3];	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r4 = 0;
        r5 = z;	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r6 = 6;
        r5 = r5[r6];	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r3[r4] = r5;	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r4 = 1;
        r5 = z;	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r6 = 11;
        r5 = r5[r6];	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r3[r4] = r5;	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r4 = 2;
        r5 = z;	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r6 = 7;
        r5 = r5[r6];	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r3[r4] = r5;	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        b(r8, r3);	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r3 = java.lang.Boolean.TRUE;	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        a = r3;	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r3 = new com.whatsapp.util.ak;	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r3.<init>(r8);	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        org.whispersystems.libaxolotl.A.a = r3;	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r3 = a();	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        if (r3 != 0) goto L_0x00ac;
    L_0x003d:
        r3 = z;	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r3 = new java.lang.UnsatisfiedLinkError;	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r3.<init>(r4);	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r4 = 3;
        r4 = new java.lang.String[r4];	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r5 = 0;
        r6 = z;	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r7 = 3;
        r6 = r6[r7];	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r4[r5] = r6;	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r5 = 1;
        r6 = z;	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r7 = 8;
        r6 = r6[r7];	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r4[r5] = r6;	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r5 = 2;
        r6 = z;	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r7 = 9;
        r6 = r6[r7];	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r4[r5] = r6;	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        a(r8, r3, r4);	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r3 = z;	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r4 = 5;
        r3 = r3[r4];	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        r3 = a();	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
        if (r3 != 0) goto L_0x00ac;
    L_0x007d:
        r0 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0090 }
        r3 = 1;
        r0 = r0[r3];	 Catch:{ UnsatisfiedLinkError -> 0x0090 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ UnsatisfiedLinkError -> 0x0090 }
        r0 = new java.lang.UnsatisfiedLinkError;	 Catch:{ UnsatisfiedLinkError -> 0x0090 }
        r3 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0090 }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ UnsatisfiedLinkError -> 0x0090 }
        r0.<init>(r3);	 Catch:{ UnsatisfiedLinkError -> 0x0090 }
        throw r0;	 Catch:{ UnsatisfiedLinkError -> 0x0090 }
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsatisfiedLinkError -> 0x0092 }
    L_0x0092:
        r0 = move-exception;
        r3 = z;	 Catch:{ UnsatisfiedLinkError -> 0x00c5 }
        r4 = 10;
        r3 = r3[r4];	 Catch:{ UnsatisfiedLinkError -> 0x00c5 }
        com.whatsapp.util.Log.b(r3, r0);	 Catch:{ UnsatisfiedLinkError -> 0x00c5 }
        if (r8 == 0) goto L_0x00ab;
    L_0x009e:
        r0 = new android.os.Handler;	 Catch:{ UnsatisfiedLinkError -> 0x00c5 }
        r0.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x00c5 }
        r3 = new com.whatsapp.util.bg;	 Catch:{ UnsatisfiedLinkError -> 0x00c5 }
        r3.<init>(r8);	 Catch:{ UnsatisfiedLinkError -> 0x00c5 }
        r0.post(r3);	 Catch:{ UnsatisfiedLinkError -> 0x00c5 }
    L_0x00ab:
        r0 = r1;
    L_0x00ac:
        monitor-exit(r2);
        return r0;
    L_0x00ae:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsatisfiedLinkError -> 0x00b0 }
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsatisfiedLinkError -> 0x0090 }
    L_0x00b2:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x00b5:
        r3 = a;	 Catch:{ UnsatisfiedLinkError -> 0x00c3 }
        r3 = r3.booleanValue();	 Catch:{ UnsatisfiedLinkError -> 0x00c3 }
        if (r3 != 0) goto L_0x00ac;
    L_0x00bd:
        r0 = new java.lang.UnsatisfiedLinkError;	 Catch:{ UnsatisfiedLinkError -> 0x00c3 }
        r0.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x00c3 }
        throw r0;	 Catch:{ UnsatisfiedLinkError -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsatisfiedLinkError -> 0x0092 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00b2 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.WhatsAppLibLoader.a(android.content.Context):boolean");
    }
}
