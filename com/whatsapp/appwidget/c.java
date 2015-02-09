package com.whatsapp.appwidget;

import com.whatsapp.App;
import com.whatsapp.m8;
import com.whatsapp.v;
import com.whatsapp.vk;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class c implements Runnable {
    private static long a;
    private static final String[] c;
    private static final String[] z;
    private final String b;

    public void run() {
        int i;
        boolean z = WidgetProvider.b;
        Iterator it = v.b().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            m8 a = App.P.a((String) it.next());
            if (a.a > 0) {
                i = a.a + i2;
            } else {
                i = i2;
            }
            if (z) {
                break;
            }
            i2 = i;
        }
        i = i2;
        a(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r13) {
        /*
        r12_this = this;
        r10 = -1;
        r8 = 1;
        r6 = com.whatsapp.appwidget.WidgetProvider.b;
        r0 = z;	 Catch:{ Exception -> 0x013b }
        r1 = 8;
        r0 = r0[r1];	 Catch:{ Exception -> 0x013b }
        r1 = android.net.Uri.parse(r0);	 Catch:{ Exception -> 0x013b }
        r2 = a;	 Catch:{ Exception -> 0x013b }
        r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r0 != 0) goto L_0x0092;
    L_0x0015:
        r0 = com.whatsapp.App.e;	 Catch:{ Exception -> 0x013b }
        r2 = c;	 Catch:{ Exception -> 0x013b }
        r3 = z;	 Catch:{ Exception -> 0x013b }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ Exception -> 0x013b }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ Exception -> 0x013b }
        r5 = 0;
        r7 = r12.b;	 Catch:{ Exception -> 0x013b }
        r4[r5] = r7;	 Catch:{ Exception -> 0x013b }
        r5 = 0;
        r2 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ Exception -> 0x013b }
        if (r2 != 0) goto L_0x002e;
    L_0x002d:
        return;
    L_0x002e:
        r0 = r2.getCount();	 Catch:{ Exception -> 0x0146 }
        if (r0 <= r8) goto L_0x0067;
    L_0x0034:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0146 }
        r0.<init>();	 Catch:{ Exception -> 0x0146 }
        r3 = z;	 Catch:{ Exception -> 0x0146 }
        r4 = 9;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0146 }
        r0 = r0.append(r3);	 Catch:{ Exception -> 0x0146 }
        r3 = r2.getCount();	 Catch:{ Exception -> 0x0146 }
        r0 = r0.append(r3);	 Catch:{ Exception -> 0x0146 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0146 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0146 }
        r0 = com.whatsapp.App.e;	 Catch:{ Exception -> 0x0146 }
        r3 = z;	 Catch:{ Exception -> 0x0146 }
        r4 = 13;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0146 }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ Exception -> 0x0146 }
        r5 = 0;
        r7 = r12.b;	 Catch:{ Exception -> 0x0146 }
        r4[r5] = r7;	 Catch:{ Exception -> 0x0146 }
        r0.delete(r1, r3, r4);	 Catch:{ Exception -> 0x0146 }
        if (r6 == 0) goto L_0x008f;
    L_0x0067:
        r0 = r2.moveToNext();	 Catch:{ Exception -> 0x0148 }
        if (r0 == 0) goto L_0x008f;
    L_0x006d:
        r0 = 0;
        r4 = r2.getLong(r0);	 Catch:{ Exception -> 0x014a }
        a = r4;	 Catch:{ Exception -> 0x014a }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x014a }
        r0.<init>();	 Catch:{ Exception -> 0x014a }
        r3 = z;	 Catch:{ Exception -> 0x014a }
        r4 = 7;
        r3 = r3[r4];	 Catch:{ Exception -> 0x014a }
        r0 = r0.append(r3);	 Catch:{ Exception -> 0x014a }
        r4 = a;	 Catch:{ Exception -> 0x014a }
        r0 = r0.append(r4);	 Catch:{ Exception -> 0x014a }
        r0 = r0.toString();	 Catch:{ Exception -> 0x014a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x014a }
    L_0x008f:
        r2.close();	 Catch:{ Exception -> 0x013b }
    L_0x0092:
        r2 = new android.content.ContentValues;	 Catch:{ Exception -> 0x013b }
        r2.<init>();	 Catch:{ Exception -> 0x013b }
        r0 = z;	 Catch:{ Exception -> 0x013b }
        r3 = 4;
        r0 = r0[r3];	 Catch:{ Exception -> 0x013b }
        r3 = r12.b;	 Catch:{ Exception -> 0x013b }
        r2.put(r0, r3);	 Catch:{ Exception -> 0x013b }
        r0 = z;	 Catch:{ Exception -> 0x013b }
        r3 = 10;
        r0 = r0[r3];	 Catch:{ Exception -> 0x013b }
        r3 = z;	 Catch:{ Exception -> 0x013b }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ Exception -> 0x013b }
        r2.put(r0, r3);	 Catch:{ Exception -> 0x013b }
        r0 = z;	 Catch:{ Exception -> 0x013b }
        r3 = 5;
        r0 = r0[r3];	 Catch:{ Exception -> 0x013b }
        r3 = java.lang.Integer.valueOf(r13);	 Catch:{ Exception -> 0x013b }
        r2.put(r0, r3);	 Catch:{ Exception -> 0x013b }
        r4 = a;	 Catch:{ Exception -> 0x013b }
        r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r0 != 0) goto L_0x0102;
    L_0x00c1:
        r0 = com.whatsapp.App.e;	 Catch:{ Exception -> 0x013b }
        r0 = r0.insert(r1, r2);	 Catch:{ Exception -> 0x013b }
        r0 = r0.getPathSegments();	 Catch:{ Exception -> 0x013b }
        r3 = 1;
        r0 = r0.get(r3);	 Catch:{ Exception -> 0x013b }
        r0 = (java.lang.String) r0;	 Catch:{ Exception -> 0x013b }
        r4 = java.lang.Long.parseLong(r0);	 Catch:{ Exception -> 0x013b }
        a = r4;	 Catch:{ Exception -> 0x013b }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x013b }
        r0.<init>();	 Catch:{ Exception -> 0x013b }
        r3 = z;	 Catch:{ Exception -> 0x013b }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ Exception -> 0x013b }
        r0 = r0.append(r3);	 Catch:{ Exception -> 0x013b }
        r4 = a;	 Catch:{ Exception -> 0x013b }
        r0 = r0.append(r4);	 Catch:{ Exception -> 0x013b }
        r3 = z;	 Catch:{ Exception -> 0x013b }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ Exception -> 0x013b }
        r0 = r0.append(r3);	 Catch:{ Exception -> 0x013b }
        r0 = r0.append(r13);	 Catch:{ Exception -> 0x013b }
        r0 = r0.toString();	 Catch:{ Exception -> 0x013b }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x013b }
        if (r6 == 0) goto L_0x002d;
    L_0x0102:
        r4 = a;	 Catch:{ Exception -> 0x013b }
        r0 = android.content.ContentUris.withAppendedId(r1, r4);	 Catch:{ Exception -> 0x013b }
        r1 = com.whatsapp.App.e;	 Catch:{ Exception -> 0x013b }
        r3 = 0;
        r4 = 0;
        r1.update(r0, r2, r3, r4);	 Catch:{ Exception -> 0x013b }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x013b }
        r0.<init>();	 Catch:{ Exception -> 0x013b }
        r1 = z;	 Catch:{ Exception -> 0x013b }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ Exception -> 0x013b }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x013b }
        r2 = a;	 Catch:{ Exception -> 0x013b }
        r0 = r0.append(r2);	 Catch:{ Exception -> 0x013b }
        r1 = z;	 Catch:{ Exception -> 0x013b }
        r2 = 12;
        r1 = r1[r2];	 Catch:{ Exception -> 0x013b }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x013b }
        r0 = r0.append(r13);	 Catch:{ Exception -> 0x013b }
        r0 = r0.toString();	 Catch:{ Exception -> 0x013b }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x013b }
        goto L_0x002d;
    L_0x013b:
        r0 = move-exception;
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x002d;
    L_0x0146:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0148 }
    L_0x0148:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x014a }
    L_0x014a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x014c }
    L_0x014c:
        r0 = move-exception;
        r2.close();	 Catch:{ Exception -> 0x013b }
        throw r0;	 Catch:{ Exception -> 0x013b }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.appwidget.c.a(int):void");
    }

    private c(String str) {
        this.b = str;
    }

    c(String str, h hVar) {
        this(str);
    }

    static {
        String[] strArr = new String[14];
        String str = "qG\u0000L<fC^\u0018";
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
                        i3 = 1;
                        break;
                    case ay.f /*1*/:
                        i3 = 38;
                        break;
                    case ay.n /*2*/:
                        i3 = 99;
                        break;
                    case ay.p /*3*/:
                        i3 = 39;
                        break;
                    default:
                        i3 = 93;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "bI\u000e\t*iG\u0017T<qVMj<hH";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "vO\u0007@8uV\u0011H+hB\u0006UrtV\u0007F)dD\u0002C:d\u0006\nI.dT\u0017B9!O\u0007\u001d";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "qG\u0000L<fC";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "cG\u0007@8bI\u0016I)";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "vO\u0007@8uV\u0011H+hB\u0006UrtV\u0007F)dD\u0002C:d";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "vO\u0007@8uV\u0011H+hB\u0006UrtV\u0007F)dD\u0002C:d\u0006\nCg";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "bI\rS8oRY\brbI\u000e\t.dEME<eA\u0006\b<qV\u0010";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "vO\u0007@8uV\u0011H+hB\u0006UruI\f\u00070`H\u001a\u0007?`B\u0004B.;\u0006";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "bJ\u0002T.";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "vO\u0007@8uV\u0011H+hB\u0006UrtV\u0007F)dD\u0002C:d\u0006\nCg";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "!E\fR3u\u001c";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "qG\u0000L<fC^\u0018";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = -1;
                    strArr = new String[5];
                    str = "^O\u0007";
                    obj = 13;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i = 0;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    str = "qG\u0000L<fC";
                    obj = 14;
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    str = "bJ\u0002T.";
                    obj = 15;
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    str = "cG\u0007@8bI\u0016I)";
                    obj = 16;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    str = "hE\fI";
                    obj = 17;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    c = strArr3;
                default:
                    strArr2[i] = str;
                    str = "!E\fR3u\u001c";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }
}
