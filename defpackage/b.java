package defpackage;

import android.backport.util.Base64;
import android.content.Context;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.StructuredPostal;
import com.whatsapp.ats;
import com.whatsapp.util.Log;
import com.whatsapp.vk;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class b {
    private static final HashSet a;
    private static final HashSet b;
    private static final String[] z;
    private String c;
    private StringBuilder d;
    private int e;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.lang.String r6, int r7) {
        /*
        r5_this = this;
        r0 = 0;
        r4 = 0;
        r1 = defpackage.o.a;
        r2 = z;
        r3 = 23;
        r2 = r2[r3];
        r2 = r6.endsWith(r2);
        if (r2 == 0) goto L_0x001c;
    L_0x0010:
        r2 = r6.length();
        r2 = r2 + -2;
        r6 = r6.substring(r4, r2);
        if (r1 == 0) goto L_0x0031;
    L_0x001c:
        r2 = "\n";
        r2 = r6.endsWith(r2);
        if (r2 == 0) goto L_0x0030;
    L_0x0024:
        r2 = r6.length();
        r2 = r2 + -1;
        r6 = r6.substring(r4, r2);
        if (r1 == 0) goto L_0x0031;
    L_0x0030:
        return r0;
    L_0x0031:
        r1 = z;
        r2 = 21;
        r1 = r1[r2];
        r2 = "\n";
        r1 = r6.replaceAll(r1, r2);
        r2 = 1;
        if (r7 != r2) goto L_0x004d;
    L_0x0040:
        r0 = "\n";
        r2 = z;
        r3 = 24;
        r2 = r2[r3];
        r0 = r1.replaceAll(r0, r2);
        goto L_0x0030;
    L_0x004d:
        r2 = 2;
        if (r7 != r2) goto L_0x0030;
    L_0x0050:
        r0 = "\n";
        r2 = z;
        r3 = 22;
        r2 = r2[r3];
        r0 = r1.replaceAll(r0, r2);
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b.a(java.lang.String, int):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Context r6, defpackage.m r7, int r8) {
        /*
        r5_this = this;
        r0 = defpackage.o.a;
        r1 = z;
        r2 = 44;
        r1 = r1[r2];
        r1 = r7.d;
        r1 = r5.a(r1);
        if (r1 != 0) goto L_0x00c0;
    L_0x0010:
        r1 = r7.e;
        if (r1 != 0) goto L_0x0084;
    L_0x0014:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 48;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r7);
        r1 = r1.toString();
        com.whatsapp.util.Log.v(r1);
        r1 = r5.e;
        r1 = r1 + 1;
        r5.e = r1;
        r1 = r5.d;
        r2 = z;
        r3 = 46;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r5.e;
        r1 = r1.append(r2);
        r2 = z;
        r3 = 47;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r7.d;
        r1 = r1.append(r2);
        r2 = r5.c;
        r1.append(r2);
        r1 = r5.d;
        r2 = z;
        r3 = 49;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r5.e;
        r1 = r1.append(r2);
        r2 = z;
        r3 = 50;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r7.f;
        r1 = r1.append(r2);
        r2 = r5.c;
        r1.append(r2);
        if (r0 == 0) goto L_0x00c0;
    L_0x0084:
        r1 = r7.e;
        r1 = android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabelResource(r1);
        r1 = r6.getString(r1);
        r2 = 1;
        if (r8 != r2) goto L_0x009e;
    L_0x0091:
        r2 = r5.d;
        r3 = z;
        r4 = 45;
        r3 = r3[r4];
        r2.append(r3);
        if (r0 == 0) goto L_0x00a9;
    L_0x009e:
        r0 = r5.d;
        r2 = z;
        r3 = 51;
        r2 = r2[r3];
        r0.append(r2);
    L_0x00a9:
        r0 = r5.d;
        r0 = r0.append(r1);
        r1 = ":";
        r0 = r0.append(r1);
        r1 = r7.d;
        r0 = r0.append(r1);
        r1 = r5.c;
        r0.append(r1);
    L_0x00c0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b.a(android.content.Context, m, int):void");
    }

    private void a(Context context, List list, int i) {
        int i2 = o.a;
        for (m mVar : list) {
            if (mVar.a == Email.class) {
                a(context, mVar, i);
                if (i2 == 0) {
                    continue;
                    if (i2 != 0) {
                        return;
                    }
                }
            }
            if (mVar.a == StructuredPostal.class) {
                b(context, mVar, i);
                continue;
            } else {
                continue;
            }
            if (i2 != 0) {
                return;
            }
        }
    }

    private void b(Context context, m mVar, int i) {
        int i2 = o.a;
        try {
            this.e++;
            try {
                if (mVar.b != null) {
                    Log.v(z[8] + mVar);
                    if (mVar.e == 0) {
                        this.d.append(z[1]).append(this.e).append(z[12]).append(mVar.b.b()).append(this.c);
                        this.d.append(z[11]).append(this.e).append(z[4]);
                        if (mVar.b.e != null) {
                            try {
                                this.d.append(ats.b(mVar.b.e).toLowerCase());
                            } catch (Throwable e) {
                                Log.b(z[14], e);
                            }
                        }
                        this.d.append(this.c);
                        this.d.append(z[10]).append(this.e).append(z[7]).append(mVar.f).append(this.c);
                        if (i2 == 0) {
                            return;
                        }
                    }
                    this.d.append(z[9]).append(this.e).append(z[5]).append(context.getString(StructuredPostal.getTypeLabelResource(mVar.e))).append(z[3]).append(mVar.b.b()).append(this.c);
                    this.d.append(z[0]).append(this.e).append(z[2]);
                    if (mVar.b.e != null) {
                        try {
                            this.d.append(ats.b(mVar.b.e).toLowerCase());
                        } catch (Throwable e2) {
                            Log.b(z[6], e2);
                        }
                    }
                    this.d.append(this.c);
                    if (i2 == 0) {
                        return;
                    }
                }
                Log.e(z[13]);
            } catch (IOException e3) {
                throw e3;
            }
        } catch (IOException e32) {
            throw e32;
        } catch (IOException e322) {
            throw e322;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(defpackage.f r5) {
        /*
        r4_this = this;
        r0 = defpackage.o.a;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 42;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r5);
        r1 = r1.toString();
        com.whatsapp.util.Log.v(r1);
        r1 = r4.d;
        r2 = z;
        r3 = 43;
        r2 = r2[r3];
        r1.append(r2);
        r1 = r5.b;
        if (r1 == 0) goto L_0x003a;
    L_0x002b:
        r1 = r4.d;
        r2 = r5.b;
        r1 = r1.append(r2);
        r2 = ";";
        r1.append(r2);
        if (r0 == 0) goto L_0x0041;
    L_0x003a:
        r1 = r4.d;
        r2 = ";";
        r1.append(r2);
    L_0x0041:
        r1 = r5.g;
        if (r1 == 0) goto L_0x0054;
    L_0x0045:
        r1 = r4.d;
        r2 = r5.g;
        r1 = r1.append(r2);
        r2 = ";";
        r1.append(r2);
        if (r0 == 0) goto L_0x005b;
    L_0x0054:
        r1 = r4.d;
        r2 = ";";
        r1.append(r2);
    L_0x005b:
        r1 = r5.c;
        if (r1 == 0) goto L_0x006e;
    L_0x005f:
        r1 = r4.d;
        r2 = r5.c;
        r1 = r1.append(r2);
        r2 = ";";
        r1.append(r2);
        if (r0 == 0) goto L_0x0075;
    L_0x006e:
        r1 = r4.d;
        r2 = ";";
        r1.append(r2);
    L_0x0075:
        r1 = r5.e;
        if (r1 == 0) goto L_0x0088;
    L_0x0079:
        r1 = r4.d;
        r2 = r5.e;
        r1 = r1.append(r2);
        r2 = ";";
        r1.append(r2);
        if (r0 == 0) goto L_0x008f;
    L_0x0088:
        r0 = r4.d;
        r1 = ";";
        r0.append(r1);
    L_0x008f:
        r0 = r5.f;
        if (r0 == 0) goto L_0x009a;
    L_0x0093:
        r0 = r4.d;
        r1 = r5.f;
        r0.append(r1);
    L_0x009a:
        r0 = r4.d;
        r1 = r4.c;
        r0.append(r1);
        r0 = r4.d;
        r1 = z;
        r2 = 41;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r5.d;
        r0 = r0.append(r1);
        r1 = r4.c;
        r0.append(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b.a(f):void");
    }

    private void a(byte[] bArr, String str, int i) {
        this.d.append(z[54]).append(Base64.encodeToString(bArr, 2)).append(this.c);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(android.content.Context r8, defpackage.o r9, int r10) {
        /*
        r7_this = this;
        r4 = 1;
        r6 = 0;
        r1 = defpackage.o.a;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r7.d = r0;
        r0 = r9.e;
        if (r0 == 0) goto L_0x001b;
    L_0x000f:
        r0 = r9.e;
        r0 = r0.d;
        if (r0 != 0) goto L_0x001b;
    L_0x0015:
        r0 = r9.e;
        r2 = "";
        r0.d = r2;
    L_0x001b:
        if (r10 != r4) goto L_0x0023;
    L_0x001d:
        r0 = "\n";
        r7.c = r0;
        if (r1 == 0) goto L_0x0038;
    L_0x0023:
        r0 = 2;
        if (r10 != r0) goto L_0x002c;
    L_0x0026:
        r0 = "\n";
        r7.c = r0;
        if (r1 == 0) goto L_0x0038;
    L_0x002c:
        r0 = new g;
        r1 = z;
        r2 = 36;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x0038:
        r0 = r7.d;
        r2 = z;
        r3 = 32;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r7.c;
        r0.append(r2);
        if (r10 != r4) goto L_0x005e;
    L_0x004b:
        r0 = r7.d;
        r2 = z;
        r3 = 28;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r7.c;
        r0.append(r2);
        if (r1 == 0) goto L_0x006f;
    L_0x005e:
        r0 = r7.d;
        r2 = z;
        r3 = 34;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r7.c;
        r0.append(r2);
    L_0x006f:
        r0 = r9.e;
        if (r0 == 0) goto L_0x0078;
    L_0x0073:
        r0 = r9.e;
        r7.a(r0);
    L_0x0078:
        r0 = r9.j;
        if (r0 == 0) goto L_0x00b5;
    L_0x007c:
        r0 = r9.j;
        r2 = z;
        r3 = 33;
        r2 = r2[r3];
        r0 = r0.containsKey(r2);
        if (r0 == 0) goto L_0x00b5;
    L_0x008a:
        r0 = r7.d;
        r2 = z;
        r3 = 26;
        r2 = r2[r3];
        r2 = r0.append(r2);
        r0 = r9.j;
        r3 = z;
        r4 = 35;
        r3 = r3[r4];
        r0 = r0.get(r3);
        r0 = (java.util.List) r0;
        r0 = r0.get(r6);
        r0 = (defpackage.j) r0;
        r0 = r0.d;
        r0 = r2.append(r0);
        r2 = r7.c;
        r0.append(r2);
    L_0x00b5:
        r0 = r9.e;
        if (r0 == 0) goto L_0x00f7;
    L_0x00b9:
        r0 = r9.e;
        r0 = r0.h;
        if (r0 == 0) goto L_0x00d8;
    L_0x00bf:
        r0 = r7.d;
        r2 = z;
        r3 = 40;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r9.e;
        r2 = r2.h;
        r0 = r0.append(r2);
        r2 = r7.c;
        r0.append(r2);
    L_0x00d8:
        r0 = r9.e;
        r0 = r0.a;
        if (r0 == 0) goto L_0x00f7;
    L_0x00de:
        r0 = r7.d;
        r2 = z;
        r3 = 37;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r9.e;
        r2 = r2.a;
        r0 = r0.append(r2);
        r2 = r7.c;
        r0.append(r2);
    L_0x00f7:
        r0 = r9.c;
        if (r0 == 0) goto L_0x0145;
    L_0x00fb:
        r0 = r9.c;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x0145;
    L_0x0103:
        r0 = r9.c;
        r0 = r0.get(r6);
        r0 = (defpackage.l) r0;
        r2 = r0.d;
        r0 = r9.c;
        r0 = r0.get(r6);
        r0 = (defpackage.l) r0;
        r0 = r0.c;
        if (r2 == 0) goto L_0x012e;
    L_0x0119:
        r3 = r7.d;
        r4 = z;
        r5 = 30;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r2 = r3.append(r2);
        r3 = r7.c;
        r2.append(r3);
    L_0x012e:
        if (r0 == 0) goto L_0x0145;
    L_0x0130:
        r2 = r7.d;
        r3 = z;
        r4 = 25;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r2 = r7.c;
        r0.append(r2);
    L_0x0145:
        r0 = r9.l;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x017c;
    L_0x014d:
        r0 = r9.l;
        r0 = r0.get(r6);
        r0 = (java.lang.String) r0;
        r0 = r7.a(r0);
        if (r0 != 0) goto L_0x017c;
    L_0x015b:
        r0 = r7.d;
        r2 = z;
        r3 = 27;
        r2 = r2[r3];
        r2 = r0.append(r2);
        r0 = r9.l;
        r0 = r0.get(r6);
        r0 = (java.lang.String) r0;
        r0 = r7.a(r0, r10);
        r0 = r2.append(r0);
        r2 = r7.c;
        r0.append(r2);
    L_0x017c:
        r0 = r9.h;
        if (r0 == 0) goto L_0x0185;
    L_0x0180:
        r0 = r9.h;
        r7.b(r8, r0, r10);
    L_0x0185:
        r0 = r9.d;
        if (r0 == 0) goto L_0x018e;
    L_0x0189:
        r0 = r9.d;
        r7.a(r8, r0, r10);
    L_0x018e:
        r0 = r9.j;
        if (r0 == 0) goto L_0x01cb;
    L_0x0192:
        r0 = r9.j;
        r2 = z;
        r3 = 29;
        r2 = r2[r3];
        r0 = r0.containsKey(r2);
        if (r0 == 0) goto L_0x01cb;
    L_0x01a0:
        r0 = r7.d;
        r2 = z;
        r3 = 38;
        r2 = r2[r3];
        r2 = r0.append(r2);
        r0 = r9.j;
        r3 = z;
        r4 = 39;
        r3 = r3[r4];
        r0 = r0.get(r3);
        r0 = (java.util.List) r0;
        r0 = r0.get(r6);
        r0 = (defpackage.j) r0;
        r0 = r0.d;
        r0 = r2.append(r0);
        r2 = r7.c;
        r0.append(r2);
    L_0x01cb:
        r7.a(r9);
        r0 = r9.f;
        if (r0 == 0) goto L_0x01d9;
    L_0x01d2:
        r0 = r9.f;
        r2 = r9.b;
        r7.a(r0, r2, r10);
    L_0x01d9:
        r0 = r7.d;
        r2 = z;
        r3 = 31;
        r2 = r2[r3];
        r0.append(r2);
        r0 = r7.d;
        r0 = r0.toString();
        r2 = com.whatsapp.DialogToastActivity.i;
        if (r2 == 0) goto L_0x01f2;
    L_0x01ee:
        r1 = r1 + 1;
        defpackage.o.a = r1;
    L_0x01f2:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b.a(android.content.Context, o, int):java.lang.String");
    }

    public b() {
        this.e = 0;
    }

    static {
        String[] strArr = new String[81];
        String str = "8SWi";
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
                        i4 = 81;
                        break;
                    case ay.f /*1*/:
                        i4 = 39;
                        break;
                    case ay.n /*2*/:
                        i4 = 50;
                        break;
                    case ay.p /*3*/:
                        i4 = 4;
                        break;
                    default:
                        i4 = 85;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u007f\u007f\u001fE\u0017\u0010c`>";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "k\u001c\t";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\u007f\u007f\u001fE\u0017\u0010c`>";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u007ffvVn%^Bah";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "'DSv12H_t:\"B@+4!WWj1&FBk&%F^w!#\u0007Te<=BV$9>HYq%\u0012HGj!#^sf7#eKJ4<B";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u007f\u007f\u001fE\u0017\u001dFPa9k";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "0WBa;5psT:\"SSh\u0006%U\b";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "8SWi";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "8SWi";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "8SWi";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "\u007ffvVoj\u001c";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "0WBa;5psT:\"SSh\u0006%U\u0012e15Um`4%F\u0012m&qigH\u0019";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "'DSv12H_t:\"B@+4!WWj1&FBk&%F^w!#\u0007Te<=BV$9>HYq%\u0012HGj!#^sf7#eKJ4<B";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "\u0005b~?!(WW9";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "\u007fswHo";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "\u0005b~?";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "8SWi";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "8SWi";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "\u007f\u007f\u001fE\u0017\u001dFPa9k";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "\\-";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "[\u0007";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "\\-";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "\\-\u0012";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "\u0005nfH\u0010k";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "\u001fnqO\u001b\u0010jw>";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "\u001fhfAo";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "\u0007b`W\u001c\u001ei\b6{`";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "\u0013cs]";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "\u001euu>";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "\u0014iv>\u0003\u0012f`@";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "\u0013buM\u001bkqqE\u0007\u0015";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "\u001fnqO\u001b\u0010jw";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "\u0007b`W\u001c\u001ei\b7{a";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "\u001fnqO\u001b\u0010jw";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "qQWv&8H\\$;>S\u0012i4%DZ$\u0003\u0014uaM\u001a\u001fxdG\u0014\u0003c\u00005u>U\u0012R\u0010\u0003t{K\u001b\u000eqqE\u0007\u0015\u0014\u0002*";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "\t\nbL\u001a\u001fbfM\u0016|ksW\u0001|isI\u0010k";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "\u0013cs]n'F^q0lCSp0k";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "\u0013cs]";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "\t\nbL\u001a\u001fbfM\u0016|a{V\u0006\u0005\n|E\u0018\u0014\u001d";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "\u0017i\b";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "'DSv1~ISi0k";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "\u001f\u001d";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "\u0018ifA\u0007\u001fbf";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "\u0014jsM\u0019j";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "8SWi";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "\u007fb\u007fE\u001c\u001d\u001cF}%4\u001a{J\u0001\u0014u|A\u0001k";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "0WBa;5psA80N^W!#\u001d";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "8SWi";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "\u007f\u007f\u001fE\u0017\u001dFPa9k";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "\u0014jsM\u0019jskT\u0010l";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "%^Bah\u0019h\u007fA";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "%^Bah";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "\u0001o}P\u001ajesW\u0010g\u0013\b";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "\u0014p}V\u0019\u0015";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "\u001cd{I\u0014\u0018k";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    str = "\u0001heA\u0007\u0002osV\u0010";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "\u0018tvJ";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    str = "\u0017fj";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    str = "\u0006h`O";
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = "\u0012f`";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "\u0001fuA\u0007";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = "\u001chvA\u0018";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "\u0018ifA\u0007\u001fbf";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "\u0001uwB";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "\u0018e\u007fI\u0014\u0018k";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i2] = str;
                    i2 = 67;
                    str = "\u001ctu";
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i2] = str;
                    i2 = 68;
                    str = "\u0007nvA\u001a";
                    i = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i2] = str;
                    i2 = 69;
                    str = "\u0012b~H";
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i2] = str;
                    i2 = 70;
                    str = "\t\u0013\u00024";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i2] = str;
                    i2 = 71;
                    str = "\u0012b~H";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i2] = str;
                    i2 = 72;
                    str = "\u0019h\u007fA";
                    i = 71;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i2] = str;
                    i2 = 73;
                    str = "\u0010h~";
                    i = 72;
                    strArr2 = strArr3;
                    break;
                case 72:
                    strArr2[i2] = str;
                    i2 = 74;
                    str = "\u0013ea";
                    i = 73;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i2] = str;
                    i2 = 75;
                    str = "\u0010sfI\u0014\u0018k";
                    i = 74;
                    strArr2 = strArr3;
                    break;
                case 74:
                    strArr2[i2] = str;
                    i2 = 76;
                    str = "\u0005kj";
                    i = 75;
                    strArr2 = strArr3;
                    break;
                case 75:
                    strArr2[i2] = str;
                    i2 = 77;
                    str = "\u0001u}@\u001c\u0016~";
                    i = 76;
                    strArr2 = strArr3;
                    break;
                case 76:
                    strArr2[i2] = str;
                    i2 = 78;
                    str = "\u0012na";
                    i = 77;
                    strArr2 = strArr3;
                    break;
                case 77:
                    strArr2[i2] = str;
                    i2 = 79;
                    str = "\u0007h{G\u0010";
                    i = 78;
                    strArr2 = strArr3;
                    break;
                case 78:
                    strArr2[i2] = str;
                    i2 = 80;
                    str = "\u0010wbH\u0010\u001dn|O";
                    i = 79;
                    strArr2 = strArr3;
                    break;
                case 79:
                    strArr2[i2] = str;
                    z = strArr3;
                    a = new HashSet(Arrays.asList(new String[]{z[71], z[73], z[80], z[75], z[78], z[55], z[64], z[66], z[56], z[57], z[77], z[76], z[70]}));
                    b = new HashSet(Arrays.asList(new String[]{z[65], z[60], z[72], z[79], z[59], z[67], z[69], z[62], z[74], z[63], z[61], z[58], z[68]}));
                default:
                    strArr2[i2] = str;
                    str = "8SWi";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(defpackage.o r8) {
        /*
        r7_this = this;
        r6 = 0;
        r2 = defpackage.o.a;
        r0 = r8.j;
        if (r0 == 0) goto L_0x0089;
    L_0x0007:
        r0 = r8.j;
        r0 = r0.keySet();
        r3 = r0.iterator();
    L_0x0011:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0089;
    L_0x0017:
        r0 = r3.next();
        r0 = (java.lang.String) r0;
        r1 = defpackage.o.m;
        r1 = r1.containsKey(r0);
        if (r1 == 0) goto L_0x0087;
    L_0x0025:
        r1 = r8.j;
        r1 = r1.get(r0);
        r1 = (java.util.List) r1;
        r1 = r1.get(r6);
        r1 = (defpackage.j) r1;
        r4 = r7.d;
        r0 = r4.append(r0);
        r4 = ";";
        r0.append(r4);
        r0 = r1.g;
        if (r0 == 0) goto L_0x0069;
    L_0x0042:
        r0 = r1.g;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x0069;
    L_0x004a:
        r0 = r7.d;
        r4 = z;
        r5 = 53;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r1.g;
        r4 = r4.toArray();
        r4 = r4[r6];
        r0 = r0.append(r4);
        r4 = ":";
        r0.append(r4);
        if (r2 == 0) goto L_0x007a;
    L_0x0069:
        r0 = r7.d;
        r4 = z;
        r5 = 52;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = ":";
        r0.append(r4);
    L_0x007a:
        r0 = r7.d;
        r1 = r1.d;
        r0 = r0.append(r1);
        r1 = r7.c;
        r0.append(r1);
    L_0x0087:
        if (r2 == 0) goto L_0x0011;
    L_0x0089:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b.a(o):void");
    }

    private boolean a(String str) {
        return str == null || str.trim().equals("");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(android.content.Context r8, java.util.List r9, int r10) {
        /*
        r7_this = this;
        r2 = defpackage.o.a;
        r3 = r9.iterator();
    L_0x0006:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x00c6;
    L_0x000c:
        r0 = r3.next();
        r0 = (defpackage.k) r0;
        r1 = r0.d;
        r1 = r7.a(r1);
        if (r1 != 0) goto L_0x00c4;
    L_0x001a:
        r1 = r0.b;
        if (r1 != 0) goto L_0x0074;
    L_0x001e:
        r1 = r7.e;
        r1 = r1 + 1;
        r7.e = r1;
        r1 = r7.d;
        r4 = z;
        r5 = 18;
        r4 = r4[r5];
        r1 = r1.append(r4);
        r4 = r7.e;
        r1 = r1.append(r4);
        r4 = z;
        r5 = 16;
        r4 = r4[r5];
        r1 = r1.append(r4);
        r4 = r0.d;
        r1 = r1.append(r4);
        r4 = r7.c;
        r1.append(r4);
        r1 = r7.d;
        r4 = z;
        r5 = 19;
        r4 = r4[r5];
        r1 = r1.append(r4);
        r4 = r7.e;
        r1 = r1.append(r4);
        r4 = z;
        r5 = 20;
        r4 = r4[r5];
        r1 = r1.append(r4);
        r4 = r0.a;
        r1 = r1.append(r4);
        r4 = r7.c;
        r1.append(r4);
        if (r2 == 0) goto L_0x00c4;
    L_0x0074:
        r1 = r0.b;
        r1 = android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(r1);
        r1 = r8.getString(r1);
        r4 = 2;
        if (r10 != r4) goto L_0x0092;
    L_0x0081:
        r4 = ";";
        r4 = r1.indexOf(r4);
        r5 = -1;
        if (r4 == r5) goto L_0x0092;
    L_0x008a:
        r4 = ";";
        r5 = ",";
        r1 = r1.replace(r4, r5);
    L_0x0092:
        r4 = 1;
        if (r10 != r4) goto L_0x00a2;
    L_0x0095:
        r4 = r7.d;
        r5 = z;
        r6 = 17;
        r5 = r5[r6];
        r4.append(r5);
        if (r2 == 0) goto L_0x00ad;
    L_0x00a2:
        r4 = r7.d;
        r5 = z;
        r6 = 15;
        r5 = r5[r6];
        r4.append(r5);
    L_0x00ad:
        r4 = r7.d;
        r1 = r4.append(r1);
        r4 = ":";
        r1 = r1.append(r4);
        r0 = r0.d;
        r0 = r1.append(r0);
        r1 = r7.c;
        r0.append(r1);
    L_0x00c4:
        if (r2 == 0) goto L_0x0006;
    L_0x00c6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b.b(android.content.Context, java.util.List, int):void");
    }
}
