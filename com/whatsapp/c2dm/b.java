package com.whatsapp.c2dm;

import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class b {
    private static final String[] z;

    static {
        String[] strArr = new String[15];
        String str = "\u001cRjG\r\r\u0005mOK\t\u0005!DM\u000bMgZ\u000f\u001e\u0004jXG\f\u0013";
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
                        i3 = 127;
                        break;
                    case ay.f /*1*/:
                        i3 = 96;
                        break;
                    case ay.n /*2*/:
                        i3 = 14;
                        break;
                    case ay.p /*3*/:
                        i3 = 42;
                        break;
                    default:
                        i3 = 34;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "ON>\u0004\u0012QP";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "#\u001c";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0019\u0002gZQ";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "S\t~\u0017";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0012\r}ET";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001cRjG\r\r\u0005mOK\t\u0005!CFB";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0016\u0004";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001cRjG\r\u0012\r}uM\t\u0005|XK\u001b\u0005!CL\t\u0001bCF \u000e{G@\u001a\u0012}\u0010";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u001e\fbEU \u0005vZK\r\u0005j";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0016\u0010";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u000b\u0012{O";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "<,Kkp";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u001cRjG\r\u0012\r}uM\t\u0005|XK\u001b\u0005!CL\t\u0001bCF \u000fxOP\r\tjO\u0018";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "#\u0004%v\f#\u0004%v\f#\u0004%v\f#\u0004%";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static boolean a(String str) {
        try {
            if (str != null) {
                try {
                    if (str.matches(z[1])) {
                        return !str.equals(z[2]);
                    }
                } catch (NumberFormatException e) {
                    throw e;
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
            Log.w(z[0]);
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r11, android.content.Intent r12) {
        /*
        r5 = 0;
        r10 = 3;
        r0 = 0;
        r1 = 1;
        r2 = com.whatsapp.c2dm.C2DMRegistrar.c;
        com.whatsapp.App.c(r11, r0);
        r3 = z;
        r4 = 8;
        r3 = r3[r4];
        r3 = r12.getStringExtra(r3);
        r4 = z;
        r6 = 11;
        r4 = r4[r6];
        r4 = r12.getStringExtra(r4);
        r6 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00db }
        r6.<init>();	 Catch:{ NumberFormatException -> 0x00db }
        r7 = z;	 Catch:{ NumberFormatException -> 0x00db }
        r8 = 7;
        r7 = r7[r8];	 Catch:{ NumberFormatException -> 0x00db }
        r6 = r6.append(r7);	 Catch:{ NumberFormatException -> 0x00db }
        r6 = r6.append(r3);	 Catch:{ NumberFormatException -> 0x00db }
        r7 = z;	 Catch:{ NumberFormatException -> 0x00db }
        r8 = 5;
        r7 = r7[r8];	 Catch:{ NumberFormatException -> 0x00db }
        r6 = r6.append(r7);	 Catch:{ NumberFormatException -> 0x00db }
        r6 = r6.append(r4);	 Catch:{ NumberFormatException -> 0x00db }
        r6 = r6.toString();	 Catch:{ NumberFormatException -> 0x00db }
        com.whatsapp.util.Log.i(r6);	 Catch:{ NumberFormatException -> 0x00db }
        r6 = android.text.TextUtils.isEmpty(r4);	 Catch:{ NumberFormatException -> 0x00db }
        if (r6 == 0) goto L_0x0063;
    L_0x0049:
        r6 = android.text.TextUtils.isEmpty(r3);	 Catch:{ NumberFormatException -> 0x00db }
        if (r6 != 0) goto L_0x0063;
    L_0x004f:
        r6 = ",";
        r3 = r3.split(r6);
        r6 = r3.length;	 Catch:{ NumberFormatException -> 0x00dd }
        if (r6 <= r1) goto L_0x0063;
    L_0x0058:
        r6 = 1;
        r6 = r3[r6];	 Catch:{ NumberFormatException -> 0x00dd }
        r6 = a(r6);	 Catch:{ NumberFormatException -> 0x00dd }
        if (r6 == 0) goto L_0x0063;
    L_0x0061:
        r4 = r3[r1];
    L_0x0063:
        r3 = z;
        r6 = 6;
        r3 = r3[r6];
        r3 = r12.getStringExtra(r3);
        r6 = z;	 Catch:{ NumberFormatException -> 0x00df }
        r7 = 13;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x00df }
        r6 = r6.equalsIgnoreCase(r3);	 Catch:{ NumberFormatException -> 0x00df }
        if (r6 == 0) goto L_0x0086;
    L_0x0078:
        r6 = 0;
        r8 = 0;
        com.whatsapp.App.a(r11, r6, r8);	 Catch:{ NumberFormatException -> 0x00df }
        if (r2 == 0) goto L_0x00af;
    L_0x0080:
        r6 = com.whatsapp.DialogToastActivity.i;	 Catch:{ NumberFormatException -> 0x00e1 }
        if (r6 == 0) goto L_0x00e5;
    L_0x0084:
        com.whatsapp.DialogToastActivity.i = r0;
    L_0x0086:
        r0 = android.text.TextUtils.isEmpty(r3);
        if (r0 != 0) goto L_0x00af;
    L_0x008c:
        r0 = z;
        r0 = r0[r10];
        r0 = r3.split(r0, r10);
        r6 = r0.length;
        if (r6 != r10) goto L_0x0104;
    L_0x0097:
        r6 = 1;
        r6 = r0[r6];	 Catch:{ NumberFormatException -> 0x00e7 }
        r6 = java.lang.Long.parseLong(r6);	 Catch:{ NumberFormatException -> 0x00e7 }
        r8 = 2;
        r8 = r0[r8];	 Catch:{ NumberFormatException -> 0x00e7 }
        r8 = java.lang.Long.parseLong(r8);	 Catch:{ NumberFormatException -> 0x00e7 }
        r6 = r6 + r8;
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 * r8;
        r8 = 0;
        r0 = r0[r8];	 Catch:{ NumberFormatException -> 0x00e7 }
        com.whatsapp.App.a(r11, r0, r6);	 Catch:{ NumberFormatException -> 0x00e7 }
    L_0x00af:
        r0 = z;
        r2 = 12;
        r0 = r0[r2];
        r2 = z;
        r3 = 10;
        r2 = r2[r3];
        r2 = r12.getStringExtra(r2);
        r6 = r0.equals(r2);
        r0 = z;
        r2 = 4;
        r0 = r0[r2];
        r0 = r12.getStringExtra(r0);
        if (r0 == 0) goto L_0x00d4;
    L_0x00ce:
        r2 = ",";
        r5 = r0.split(r2);	 Catch:{ NumberFormatException -> 0x0121 }
    L_0x00d4:
        r0 = r11;
        r2 = r1;
        r3 = r1;
        com.whatsapp.messaging.MessageService.a(r0, r1, r2, r3, r4, r5, r6);
        return;
    L_0x00db:
        r0 = move-exception;
        throw r0;
    L_0x00dd:
        r0 = move-exception;
        throw r0;
    L_0x00df:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e1 }
    L_0x00e1:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e3 }
    L_0x00e3:
        r0 = move-exception;
        throw r0;
    L_0x00e5:
        r0 = r1;
        goto L_0x0084;
    L_0x00e7:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x011f }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x011f }
        r6 = z;	 Catch:{ NumberFormatException -> 0x011f }
        r7 = 9;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x011f }
        r0 = r0.append(r6);	 Catch:{ NumberFormatException -> 0x011f }
        r0 = r0.append(r3);	 Catch:{ NumberFormatException -> 0x011f }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x011f }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x011f }
        if (r2 == 0) goto L_0x00af;
    L_0x0104:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x011f }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x011f }
        r2 = z;	 Catch:{ NumberFormatException -> 0x011f }
        r6 = 14;
        r2 = r2[r6];	 Catch:{ NumberFormatException -> 0x011f }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x011f }
        r0 = r0.append(r3);	 Catch:{ NumberFormatException -> 0x011f }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x011f }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x011f }
        goto L_0x00af;
    L_0x011f:
        r0 = move-exception;
        throw r0;
    L_0x0121:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.c2dm.b.a(android.content.Context, android.content.Intent):void");
    }
}
