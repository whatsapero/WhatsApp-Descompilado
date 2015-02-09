package com.whatsapp.protocol;

import com.whatsapp.vk;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class n implements c8, bc {
    private static final String[] z;
    boolean a;
    byte[] b;
    InputStream c;
    String[] d;
    bx e;
    long f;
    InputStream g;
    int h;
    String[] i;

    static {
        String[] strArr = new String[16];
        String str = "hhlbUckj.^*";
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
                        i3 = 10;
                        break;
                    case ay.f /*1*/:
                        i3 = 9;
                        break;
                    case ay.n /*2*/:
                        i3 = 8;
                        break;
                    case ay.p /*3*/:
                        i3 = 66;
                        break;
                    default:
                        i3 = 59;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "ghkbVcze#Oia";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "cg~#Wcm(6TalfmWogo6S*`fb^r}m,_om(%^~]g)^d";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "oqx'X~`f%\u001bY]Z\u0007zGV[\u0016zX](+U*z|0^kd[6Zx}";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "xli&h~{a,\\*jg7Wng/6\u001bgh|!S*}g)^d";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "xli&h~{a,\\*jg7Wng/6\u001bxlk-Uy}z7X~)b+_";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "'8(6TalfbRd)z'ZnZ|0Rdn";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    str = "_gi!Xoy|#Yfl(7Uogk0Bz}m&\u001bheg!P";
                    obj = 7;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    str = "ylz4^x){6Zdsib]xho/^d}i6Reg(,T~)a/Kfle'U~lll\u001bzhz1^n4";
                    i = 9;
                    strArr2 = strArr3;
                    obj = 8;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    str = "dlp6oxlmbHol{b\u000b*ea1O*fzbU\u007fedbOkn";
                    i = 10;
                    strArr2 = strArr3;
                    obj = 9;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    strArr2 = strArr3;
                    str = "&)";
                    obj = 10;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "d|d.";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "y`r'\u001b7)";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "cg~#Wcm(6TalfmWogo6S*`fb\\o}\\-Pog";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "cg~#Wcm(.Ry}(1Rpl(+U*{m#_F`{6hcsmx\u001b~fc'U*";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "Ogk0Bz}m&\u001bheg!P&)j7O*ggbXcy`'I*h~#Rfhj.^";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private bi[] e(int i) {
        boolean z = b.n;
        int d = d(i);
        bi[] biVarArr = new bi[d];
        int i2 = 0;
        while (i2 < d) {
            biVarArr[i2] = a();
            i2++;
            if (z) {
                break;
            }
        }
        return biVarArr;
    }

    private boolean c(int i) {
        return i == 248 || i == 0 || i == 249;
    }

    public n(InputStream inputStream, String[] strArr, String[] strArr2) {
        InputStream cvVar;
        this.b = new byte[255];
        this.h = 0;
        this.f = 0;
        this.a = true;
        if (inputStream != null) {
            cvVar = new cv(inputStream);
        } else {
            cvVar = null;
        }
        this.g = cvVar;
        this.d = strArr;
        this.i = strArr2;
        this.f = System.currentTimeMillis();
    }

    public void c() {
        a(i.a(i.a(this.g)));
        int d = d(this.c.read());
        if (this.c.read() != 1) {
            throw new l(z[4], a());
        }
        b(((d % 2) + (d - 2)) / 2);
    }

    private void h(int i) {
        boolean z = b.n;
        InputStream a = this.e.a(this.c);
        c0 c0Var = new c0();
        byte[] bArr = new byte[8192];
        do {
            int read = a.read(bArr, 0, bArr.length);
            if (read == -1) {
                break;
            }
            c0Var.write(bArr, 0, read);
        } while (!z);
        this.b = c0Var.a();
        this.c = new ByteArrayInputStream(this.b, 0, c0Var.b());
    }

    private static int b(InputStream inputStream) {
        return (((inputStream.read() & 15) << 16) + (inputStream.read() << 8)) + inputStream.read();
    }

    private void a(int i) {
        if (this.b.length < i) {
            this.b = new byte[Math.max((this.b.length * 3) / 2, i)];
        }
        this.h = i;
        a(this.b, i, this.g);
        this.c = new ByteArrayInputStream(this.b, 0, i);
    }

    public void d() {
        this.a = false;
    }

    public void a(bx bxVar) {
        this.e = bxVar;
    }

    private static int e(InputStream inputStream) {
        return inputStream.read();
    }

    private String f(int i) {
        if (i == -1) {
            throw new l(z[7], a());
        } else if (i > 2 && i < 236) {
            return i(i);
        } else {
            byte[] bArr;
            switch (i) {
                case PBE.MD5 /*0*/:
                    return null;
                case 236:
                case 237:
                case 238:
                case 239:
                    return a(i - 236, e(this.c));
                case 250:
                    String b = b();
                    String b2 = b();
                    if (b != null && b2 != null) {
                        return b + "@" + b2;
                    }
                    if (b2 != null) {
                        return b2;
                    }
                    throw new l(z[6], a());
                case 252:
                    bArr = new byte[e(this.c)];
                    a(bArr, this.c);
                    return f.a(bArr);
                case 253:
                    bArr = new byte[b(this.c)];
                    a(bArr, this.c);
                    return f.a(bArr);
                case 254:
                    bArr = new byte[a(this.c)];
                    a(bArr, this.c);
                    return f.a(bArr);
                case 255:
                    return f.a(d(this.c));
                default:
                    throw new l(z[5], a());
            }
        }
    }

    private String b() {
        return f(this.c.read());
    }

    public String a() {
        boolean z = b.n;
        if (this.b == null) {
            return z[12];
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(z[13]).append(Integer.toString(this.h)).append('<');
        int i = 0;
        while (i < this.h) {
            if (i > 0) {
                stringBuffer.append(z[11]);
            }
            stringBuffer.append(Integer.toString(this.b[i] & 255));
            i++;
            if (z) {
                break;
            }
        }
        stringBuffer.append('>');
        return stringBuffer.toString();
    }

    private static int c(InputStream inputStream) {
        return (inputStream.read() << 8) + inputStream.read();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(int r4, int r5) {
        /*
        r3_this = this;
        r0 = r4 * 256;
        r0 = r0 + r5;
        if (r0 < 0) goto L_0x0012;
    L_0x0005:
        r1 = r3.i;
        r1 = r1.length;
        if (r0 >= r1) goto L_0x0012;
    L_0x000a:
        r1 = r3.i;
        r0 = r1[r0];
        r1 = com.whatsapp.protocol.b.n;
        if (r1 == 0) goto L_0x0013;
    L_0x0012:
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x0024;
    L_0x0015:
        r0 = new com.whatsapp.protocol.l;
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        r2 = r3.a();
        r0.<init>(r1, r2);
        throw r0;
    L_0x0024:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.n.a(int, int):java.lang.String");
    }

    private bi a() {
        int d = d(this.c.read());
        int read = this.c.read();
        if (read == 2) {
            return null;
        }
        String f = f(read);
        if (d == 0 || f == null) {
            throw new l(z[10], a());
        }
        k[] b = b(((d - 2) + (d % 2)) / 2);
        if (d % 2 == 1) {
            return new bi(f, b);
        }
        int read2 = this.c.read();
        if (c(read2)) {
            return new bi(f, b, e(read2));
        }
        byte[] bArr;
        if (read2 == 252) {
            bArr = new byte[e(this.c)];
            a(bArr, this.c);
            return new bi(f, b, bArr);
        } else if (read2 == 253) {
            bArr = new byte[b(this.c)];
            a(bArr, this.c);
            return new bi(f, b, bArr);
        } else if (read2 != 254) {
            return read2 == 255 ? new bi(f, b, d(this.c)) : new bi(f, b, f(read2));
        } else {
            bArr = new byte[a(this.c)];
            a(bArr, this.c);
            return new bi(f, b, bArr);
        }
    }

    private k[] b(int i) {
        boolean z = b.n;
        k[] kVarArr = new k[i];
        int i2 = 0;
        while (i2 < i) {
            kVarArr[i2] = new k(b(), b());
            i2++;
            if (z) {
                break;
            }
        }
        return kVarArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int d(int r5) {
        /*
        r4_this = this;
        r1 = com.whatsapp.protocol.b.n;
        if (r5 != 0) goto L_0x0007;
    L_0x0004:
        r0 = 0;
        if (r1 == 0) goto L_0x0040;
    L_0x0007:
        r0 = 248; // 0xf8 float:3.48E-43 double:1.225E-321;
        if (r5 != r0) goto L_0x0013;
    L_0x000b:
        r0 = r4.c;
        r0 = e(r0);
        if (r1 == 0) goto L_0x0040;
    L_0x0013:
        r0 = 249; // 0xf9 float:3.49E-43 double:1.23E-321;
        if (r5 != r0) goto L_0x001f;
    L_0x0017:
        r0 = r4.c;
        r0 = c(r0);
        if (r1 == 0) goto L_0x0040;
    L_0x001f:
        r0 = new com.whatsapp.protocol.l;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 15;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r5);
        r1 = r1.toString();
        r2 = r4.a();
        r0.<init>(r1, r2);
        throw r0;
    L_0x0040:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.n.d(int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] d(java.io.InputStream r9) {
        /*
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.protocol.b.n;
        r4 = e(r9);
        r0 = r4 & 128;
        if (r0 == 0) goto L_0x004d;
    L_0x000c:
        r0 = r1;
    L_0x000d:
        r4 = r4 & 127;
        r5 = new byte[r4];
        a(r5, r9);
        r4 = r4 * 2;
        if (r0 == 0) goto L_0x004f;
    L_0x0018:
        r1 = r4 - r1;
        r4 = new byte[r1];
        r0 = r2;
    L_0x001d:
        if (r0 >= r1) goto L_0x0065;
    L_0x001f:
        r6 = r0 % 2;
        r6 = 1 - r6;
        r6 = r6 * 4;
        r7 = r0 / 2;
        r7 = r5[r7];
        r8 = 15;
        r8 = r8 << r6;
        r7 = r7 & r8;
        r6 = r7 >> r6;
        switch(r6) {
            case 0: goto L_0x0051;
            case 1: goto L_0x0051;
            case 2: goto L_0x0051;
            case 3: goto L_0x0051;
            case 4: goto L_0x0051;
            case 5: goto L_0x0051;
            case 6: goto L_0x0051;
            case 7: goto L_0x0051;
            case 8: goto L_0x0051;
            case 9: goto L_0x0051;
            case 10: goto L_0x0058;
            case 11: goto L_0x0058;
            default: goto L_0x0032;
        };
    L_0x0032:
        r0 = new com.whatsapp.protocol.l;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r2 = r3[r2];
        r1 = r1.append(r2);
        r1 = r1.append(r6);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x004d:
        r0 = r2;
        goto L_0x000d;
    L_0x004f:
        r1 = r2;
        goto L_0x0018;
    L_0x0051:
        r7 = r6 + 48;
        r7 = (byte) r7;
        r4[r0] = r7;
        if (r3 == 0) goto L_0x0061;
    L_0x0058:
        r7 = r6 + -10;
        r7 = r7 + 45;
        r7 = (byte) r7;
        r4[r0] = r7;
        if (r3 != 0) goto L_0x0032;
    L_0x0061:
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x001d;
    L_0x0065:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.n.d(java.io.InputStream):byte[]");
    }

    private void g(int i) {
        boolean z = b.n;
        if (this.e == null) {
            throw new l(z[1]);
        }
        int i2 = i - 4;
        Object obj = new Object[4];
        System.arraycopy(this.b, i - 4, obj, 0, 4);
        this.e.b(this.b, 0, i2);
        byte[] a = this.e.a();
        i2 = 0;
        while (i2 < 4) {
            if (obj[i2] == a[i2]) {
                i2++;
                if (z) {
                    break;
                }
            }
            throw new l(z[2]);
        }
        this.c.skip((long) null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.protocol.bi b() {
        /*
        r8_this = this;
        r0 = 0;
        r1 = r8.g;
        r1 = com.whatsapp.protocol.i.a(r1);
        r2 = com.whatsapp.protocol.i.c(r1);
        r3 = com.whatsapp.protocol.i.b(r1);
        r4 = com.whatsapp.protocol.i.d(r1);
        r1 = com.whatsapp.protocol.i.a(r1);
        r8.a(r1);	 Catch:{ IOException -> 0x003e }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x003e }
        r8.f = r6;	 Catch:{ IOException -> 0x003e }
        if (r2 == 0) goto L_0x002c;
    L_0x0022:
        r2 = 0;
        r8.a = r2;	 Catch:{ IOException -> 0x003e }
        r8.g(r1);	 Catch:{ IOException -> 0x003e }
        r2 = com.whatsapp.protocol.b.n;	 Catch:{ IOException -> 0x003e }
        if (r2 == 0) goto L_0x0042;
    L_0x002c:
        r2 = r8.a;	 Catch:{ IOException -> 0x0040 }
        if (r2 != 0) goto L_0x0042;
    L_0x0030:
        r0 = new com.whatsapp.protocol.l;	 Catch:{ IOException -> 0x003c }
        r1 = z;	 Catch:{ IOException -> 0x003c }
        r2 = 8;
        r1 = r1[r2];	 Catch:{ IOException -> 0x003c }
        r0.<init>(r1);	 Catch:{ IOException -> 0x003c }
        throw r0;	 Catch:{ IOException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x003c }
    L_0x0042:
        r2 = 0;
        if (r3 == 0) goto L_0x0048;
    L_0x0045:
        r8.h(r1);	 Catch:{ IOException -> 0x006e, l -> 0x0078 }
    L_0x0048:
        r1 = r8.a();	 Catch:{ IOException -> 0x0070, l -> 0x0078 }
    L_0x004c:
        if (r4 == 0) goto L_0x0080;
    L_0x004e:
        r2 = new com.whatsapp.protocol.l;	 Catch:{ IOException -> 0x007e }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x007e }
        r3.<init>();	 Catch:{ IOException -> 0x007e }
        r4 = z;	 Catch:{ IOException -> 0x007e }
        r5 = 9;
        r4 = r4[r5];	 Catch:{ IOException -> 0x007e }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x007e }
        if (r1 == 0) goto L_0x0062;
    L_0x0061:
        r0 = 1;
    L_0x0062:
        r0 = r3.append(r0);
        r0 = r0.toString();
        r2.<init>(r0);
        throw r2;
    L_0x006e:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0070, l -> 0x0078 }
    L_0x0070:
        r1 = move-exception;
        if (r4 != 0) goto L_0x0076;
    L_0x0073:
        throw r1;	 Catch:{ IOException -> 0x0074 }
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r1 = r2;
        goto L_0x004c;
    L_0x0078:
        r1 = move-exception;
        if (r4 != 0) goto L_0x0081;
    L_0x007b:
        throw r1;	 Catch:{ IOException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;
    L_0x007e:
        r0 = move-exception;
        throw r0;
    L_0x0080:
        return r1;
    L_0x0081:
        r1 = r2;
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.n.b():com.whatsapp.protocol.bi");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String i(int r4) {
        /*
        r3_this = this;
        if (r4 < 0) goto L_0x000f;
    L_0x0002:
        r0 = r3.d;
        r0 = r0.length;
        if (r4 >= r0) goto L_0x000f;
    L_0x0007:
        r0 = r3.d;
        r0 = r0[r4];
        r1 = com.whatsapp.protocol.b.n;
        if (r1 == 0) goto L_0x0010;
    L_0x000f:
        r0 = 0;
    L_0x0010:
        if (r0 != 0) goto L_0x0022;
    L_0x0012:
        r0 = new com.whatsapp.protocol.l;
        r1 = z;
        r2 = 14;
        r1 = r1[r2];
        r2 = r3.a();
        r0.<init>(r1, r2);
        throw r0;
    L_0x0022:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.n.i(int):java.lang.String");
    }

    public n(String[] strArr, String[] strArr2) {
        this(null, strArr, strArr2);
    }

    public static void a(byte[] bArr, InputStream inputStream) {
        a(bArr, bArr.length, inputStream);
    }

    private static int a(InputStream inputStream) {
        int read = inputStream.read() & 127;
        read = inputStream.read();
        int i = read << 24;
        return (((read << 16) | i) | (inputStream.read() << 8)) | inputStream.read();
    }

    public static void a(byte[] bArr, int i, InputStream inputStream) {
        boolean z = b.n;
        int i2 = 0;
        while (i2 < i) {
            i2 += inputStream.read(bArr, i2, i - i2);
            if (z) {
                return;
            }
        }
    }

    public bi a(byte[] bArr) {
        this.b = new byte[bArr.length];
        a(this.b, bArr.length, new ByteArrayInputStream(bArr, 0, bArr.length));
        this.c = new ByteArrayInputStream(bArr, 0, bArr.length);
        this.f = System.currentTimeMillis();
        return a();
    }
}
