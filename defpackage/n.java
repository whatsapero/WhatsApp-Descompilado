package defpackage;

import com.whatsapp.DialogToastActivity;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class n implements e {
    public static String h;
    private static final String[] z;
    private q a;
    private String b;
    private String c;
    private j d;
    public List e;
    private int f;
    private String g;
    private boolean i;

    public void d() {
        ((q) this.e.get(this.f)).b = 0;
        while (this.f > 0) {
            this.f--;
            if (((q) this.e.get(this.f)).b == 1) {
                break;
            }
        }
        this.a = (q) this.e.get(this.f);
    }

    public n() {
        this(h, h, false);
    }

    public void e() {
    }

    public void d(String str) {
        this.b = str;
    }

    public void a(String str) {
        boolean z = j.f;
        q qVar = new q();
        qVar.b = 1;
        qVar.c = str;
        this.e.add(qVar);
        this.f = this.e.size() - 1;
        this.a = (q) this.e.get(this.f);
        if (DialogToastActivity.i) {
            j.f = !z;
        }
    }

    private String a(String str, String str2) {
        try {
            if (this.g.equalsIgnoreCase(str2)) {
                return str;
            }
            ByteBuffer encode = Charset.forName(this.g).encode(str);
            byte[] bArr = new byte[encode.remaining()];
            encode.get(bArr);
            try {
                return new String(bArr, str2);
            } catch (UnsupportedEncodingException e) {
                Log.e(z[2] + str2);
                return new String(bArr);
            }
        } catch (UnsupportedEncodingException e2) {
            throw e2;
        }
    }

    public void c() {
        this.d = new j();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(java.lang.String r4) {
        /*
        r3_this = this;
        r0 = r3.b;
        if (r0 == 0) goto L_0x0011;
    L_0x0004:
        r0 = r3.b;
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r0 = r0.equalsIgnoreCase(r1);
        if (r0 == 0) goto L_0x001c;
    L_0x0011:
        r0 = r3.d;
        r0 = r0.g;
        r0.add(r4);
        r0 = defpackage.j.f;
        if (r0 == 0) goto L_0x0035;
    L_0x001c:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
    L_0x0035:
        r0 = 0;
        r3.b = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n.c(java.lang.String):void");
    }

    public void b() {
        this.a.a.add(this.d);
    }

    public void a() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
        r2_this = this;
        r0 = defpackage.j.f;
        r2.<init>();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2.e = r1;
        r1 = 0;
        r2.f = r1;
        if (r3 == 0) goto L_0x0015;
    L_0x0011:
        r2.g = r3;
        if (r0 == 0) goto L_0x0019;
    L_0x0015:
        r1 = h;
        r2.g = r1;
    L_0x0019:
        if (r4 == 0) goto L_0x001f;
    L_0x001b:
        r2.c = r4;
        if (r0 == 0) goto L_0x0023;
    L_0x001f:
        r0 = h;
        r2.c = r0;
    L_0x0023:
        r2.i = r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n.<init>(java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
        r11_this = this;
        r9 = 10;
        r3 = 0;
        r4 = defpackage.j.f;
        if (r14 == 0) goto L_0x016e;
    L_0x0007:
        r0 = z;	 Catch:{ UnsupportedEncodingException -> 0x002f }
        r1 = 6;
        r0 = r0[r1];	 Catch:{ UnsupportedEncodingException -> 0x002f }
        r0 = r14.equals(r0);	 Catch:{ UnsupportedEncodingException -> 0x002f }
        if (r0 != 0) goto L_0x001a;
    L_0x0012:
        r0 = "B";
        r0 = r14.equals(r0);	 Catch:{ UnsupportedEncodingException -> 0x0031 }
        if (r0 == 0) goto L_0x0035;
    L_0x001a:
        r0 = z;	 Catch:{ UnsupportedEncodingException -> 0x0033 }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ UnsupportedEncodingException -> 0x0033 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ UnsupportedEncodingException -> 0x0033 }
        r0 = r11.d;	 Catch:{ UnsupportedEncodingException -> 0x0033 }
        r1 = r12.getBytes();	 Catch:{ UnsupportedEncodingException -> 0x0033 }
        r1 = org.j.b(r1);	 Catch:{ UnsupportedEncodingException -> 0x0033 }
        r0.c = r1;	 Catch:{ UnsupportedEncodingException -> 0x0033 }
    L_0x002e:
        return r12;
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0031 }
    L_0x0031:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0033 }
    L_0x0033:
        r0 = move-exception;
        throw r0;
    L_0x0035:
        r0 = z;
        r1 = 3;
        r0 = r0[r1];
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x016e;
    L_0x0040:
        r0 = z;
        r1 = 11;
        r0 = r0[r1];
        r1 = " ";
        r0 = r12.replaceAll(r0, r1);
        r1 = z;
        r2 = 9;
        r1 = r1[r2];
        r2 = "\t";
        r5 = r0.replaceAll(r1, r2);
        r0 = r11.i;
        if (r0 == 0) goto L_0x0067;
    L_0x005c:
        r0 = z;
        r1 = 7;
        r0 = r0[r1];
        r0 = r5.split(r0);
        if (r4 == 0) goto L_0x00cd;
    L_0x0067:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r6 = r5.length();
        r7 = new java.util.ArrayList;
        r7.<init>();
        r1 = r3;
    L_0x0076:
        if (r1 >= r6) goto L_0x00b8;
    L_0x0078:
        r8 = r5.charAt(r1);
        if (r8 != r9) goto L_0x0185;
    L_0x007e:
        r0 = r0.toString();
        r7.add(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        if (r4 == 0) goto L_0x00b4;
    L_0x008c:
        r2 = r0;
    L_0x008d:
        r0 = 13;
        if (r8 != r0) goto L_0x0181;
    L_0x0091:
        r0 = r2.toString();
        r7.add(r0);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r6 + -1;
        if (r1 >= r0) goto L_0x017e;
    L_0x00a1:
        r0 = r1 + 1;
        r0 = r5.charAt(r0);
        if (r0 != r9) goto L_0x017b;
    L_0x00a9:
        r0 = r1 + 1;
    L_0x00ab:
        if (r4 == 0) goto L_0x0177;
    L_0x00ad:
        r1 = r2;
    L_0x00ae:
        r1.append(r8);	 Catch:{ UnsupportedEncodingException -> 0x0127 }
        r10 = r0;
        r0 = r1;
        r1 = r10;
    L_0x00b4:
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x0076;
    L_0x00b8:
        r0 = r0.toString();
        r1 = r0.length();	 Catch:{ UnsupportedEncodingException -> 0x0129 }
        if (r1 <= 0) goto L_0x00c5;
    L_0x00c2:
        r7.add(r0);	 Catch:{ UnsupportedEncodingException -> 0x0129 }
    L_0x00c5:
        r0 = new java.lang.String[r3];
        r0 = r7.toArray(r0);
        r0 = (java.lang.String[]) r0;
    L_0x00cd:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = r0.length;
        r2 = r3;
    L_0x00d4:
        if (r2 >= r6) goto L_0x00f1;
    L_0x00d6:
        r1 = r0[r2];
        r7 = "=";
        r7 = r1.endsWith(r7);
        if (r7 == 0) goto L_0x00ea;
    L_0x00e0:
        r7 = r1.length();
        r7 = r7 + -1;
        r1 = r1.substring(r3, r7);
    L_0x00ea:
        r5.append(r1);
        r1 = r2 + 1;
        if (r4 == 0) goto L_0x0174;
    L_0x00f1:
        r0 = r5.toString();	 Catch:{ UnsupportedEncodingException -> 0x012b }
        r1 = r11.g;	 Catch:{ UnsupportedEncodingException -> 0x012b }
        r0 = r0.getBytes(r1);	 Catch:{ UnsupportedEncodingException -> 0x012b }
    L_0x00fb:
        r0 = org.c.a(r0);	 Catch:{ h -> 0x0151 }
        r12 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0106 }
        r12.<init>(r0, r13);	 Catch:{ UnsupportedEncodingException -> 0x0106 }
        goto L_0x002e;
    L_0x0106:
        r1 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r13);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        r12 = new java.lang.String;
        r12.<init>(r0);
        goto L_0x002e;
    L_0x0127:
        r0 = move-exception;
        throw r0;
    L_0x0129:
        r0 = move-exception;
        throw r0;
    L_0x012b:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r11.g;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r5.toString();
        r0 = r0.getBytes();
        goto L_0x00fb;
    L_0x0151:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r9];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r12 = "";
        goto L_0x002e;
    L_0x016e:
        r12 = r11.a(r12, r13);
        goto L_0x002e;
    L_0x0174:
        r2 = r1;
        goto L_0x00d4;
    L_0x0177:
        r1 = r0;
        r0 = r2;
        goto L_0x00b4;
    L_0x017b:
        r0 = r1;
        goto L_0x00ab;
    L_0x017e:
        r0 = r2;
        goto L_0x00b4;
    L_0x0181:
        r0 = r1;
        r1 = r2;
        goto L_0x00ae;
    L_0x0185:
        r2 = r0;
        goto L_0x008d;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n.a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public void a(List list) {
        boolean z = j.f;
        if (list == null || list.size() == 0) {
            this.d.c = null;
            this.d.a.clear();
            this.d.a.add("");
            this.d.d = "";
            return;
        }
        String str;
        String str2 = h;
        if (str2 == null || str2.length() == 0) {
            str = this.c;
        } else {
            str = str2;
        }
        for (String str22 : list) {
            this.d.a.add(a(str22, str, null));
            if (z) {
                break;
            }
        }
        this.d.d = a(this.d.a);
    }

    public void b(String str) {
        this.d.e = str;
    }

    public void e(String str) {
        this.d.b.add(str);
    }

    private String a(List list) {
        boolean z = j.f;
        int size = list.size();
        if (size <= 1) {
            return size == 1 ? (String) list.get(0) : "";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            for (String str : list) {
                stringBuilder.append(str).append(";");
                if (z) {
                    break;
                }
            }
            size = stringBuilder.length();
            return (size <= 0 || stringBuilder.charAt(size - 1) != ';') ? stringBuilder.toString() : stringBuilder.substring(0, size - 1);
        }
    }

    static {
        String[] strArr = new String[12];
        String str = "\u0011[=\u001a&\u0013]+:\"\u0013H?<\"\r\\7E-\u000e]\r\u00197\u000e[7P";
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
                        i3 = 97;
                        break;
                    case ay.f /*1*/:
                        i3 = 41;
                        break;
                    case ay.n /*2*/:
                        i3 = 82;
                        break;
                    case ay.p /*3*/:
                        i3 = 106;
                        break;
                    default:
                        i3 = 67;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "'H;\u0006&\u0005\t&\u0005c\u0004G1\u0005'\u0004\u0013r\t+\u0000[!\u000f7\\";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "0|\u001d>\u0006%\u0004\u00028\n/}\u0013(\u000f$";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0005L1\u0005'\u0004k3\u0019&W\u001dh:\u000b.}\u001d";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "'H;\u0006&\u0005\t&\u0005c\u0004G1\u0005'\u0004\u0013r\t+\u0000[!\u000f7\\";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "#h\u0001/uU";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "l#";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "'H;\u0006&\u0005\t&\u0005c\u0004G1\u0005'\u0004\u0013r\t+\u0000[!\u000f7\\";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\\ ";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "'H;\u0006&\u0005\t&\u0005c\u0005L1\u0005'\u0004\t#\u001f,\u0015L6G3\u0013@<\u001e\"\u0003E7Pc";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\\\t";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                    char[] toCharArray2 = "4}\u0014G{".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (int i4 = 0; length2 > i4; i4++) {
                        int i5;
                        char c2 = cArr2[i4];
                        switch (i4 % 5) {
                            case PBE.MD5 /*0*/:
                                i5 = 97;
                                break;
                            case ay.f /*1*/:
                                i5 = 41;
                                break;
                            case ay.n /*2*/:
                                i5 = 82;
                                break;
                            case ay.p /*3*/:
                                i5 = 106;
                                break;
                            default:
                                i5 = 67;
                                break;
                        }
                        cArr2[i4] = (char) (i5 ^ c2);
                    }
                    h = new String(cArr2).intern();
                default:
                    strArr2[i] = str;
                    str = "5p\u0002/";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }
}
