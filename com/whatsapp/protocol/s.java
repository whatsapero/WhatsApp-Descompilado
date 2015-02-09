package com.whatsapp.protocol;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class s implements cw, be {
    public static boolean i;
    private static final String[] z;
    int a;
    byte[][] b;
    int c;
    int d;
    boolean e;
    by f;
    Hashtable g;
    bx h;
    OutputStream j;
    int k;
    private boolean l;
    bo m;

    private synchronized void a(boolean z) {
        a(z, f());
    }

    private void d(int i) {
        b(this.m, i);
    }

    private void b(int i) {
        try {
            if (i < 245) {
                this.m.write((byte) i);
                if (!b.n) {
                    return;
                }
            }
            if (i <= 500) {
                throw new IOException(z[7]);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private static void b(OutputStream outputStream, int i) {
        outputStream.write((2130706432 & i) >> 24);
        outputStream.write((16711680 & i) >> 16);
        outputStream.write((65280 & i) >> 8);
        outputStream.write((i & 255) >> 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(com.whatsapp.protocol.bi r6, int r7) {
        /*
        r5_this = this;
        r1 = 1;
        r2 = 0;
        monitor-enter(r5);
        r3 = com.whatsapp.protocol.b.n;	 Catch:{ all -> 0x0025 }
        r0 = r7 & 1;
        if (r0 == 0) goto L_0x0028;
    L_0x0009:
        r0 = r1;
    L_0x000a:
        r4 = r7 & 2;
        if (r4 == 0) goto L_0x002a;
    L_0x000e:
        r2 = r5.l;	 Catch:{ IllegalArgumentException -> 0x002c }
        if (r2 == 0) goto L_0x002e;
    L_0x0012:
        r2 = r5.a(r6);	 Catch:{ IllegalArgumentException -> 0x0023 }
        if (r2 != 0) goto L_0x002e;
    L_0x0018:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0023 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0023 }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0023 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0023 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0023 }
    L_0x0023:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
    L_0x0028:
        r0 = r2;
        goto L_0x000a;
    L_0x002a:
        r1 = r2;
        goto L_0x000e;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0023 }
    L_0x002e:
        r5.c();	 Catch:{ IllegalArgumentException -> 0x0056 }
        if (r6 != 0) goto L_0x0039;
    L_0x0033:
        r2 = 0;
        r5.a(r0, r2);	 Catch:{ IllegalArgumentException -> 0x0058 }
        if (r3 == 0) goto L_0x0054;
    L_0x0039:
        r2 = i;	 Catch:{ IllegalArgumentException -> 0x005a }
        if (r2 != 0) goto L_0x003f;
    L_0x003d:
        if (r1 == 0) goto L_0x0044;
    L_0x003f:
        r1 = r5.m;	 Catch:{ IllegalArgumentException -> 0x005c }
        r1.e();	 Catch:{ IllegalArgumentException -> 0x005c }
    L_0x0044:
        r5.b(r6);	 Catch:{ IllegalArgumentException -> 0x005e }
        r1 = r5.e;	 Catch:{ IllegalArgumentException -> 0x005e }
        if (r1 == 0) goto L_0x0051;
    L_0x004b:
        r1 = 1;
        r5.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0060 }
        if (r3 == 0) goto L_0x0054;
    L_0x0051:
        r5.a(r0);	 Catch:{ IllegalArgumentException -> 0x0060 }
    L_0x0054:
        monitor-exit(r5);
        return;
    L_0x0056:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0058 }
    L_0x0058:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005c }
    L_0x005c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0025 }
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0025 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.s.a(com.whatsapp.protocol.bi, int):void");
    }

    public synchronized void a(bx bxVar) {
        try {
            this.h = bxVar;
            if (this.m != null) {
                this.m.a(this.h);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable th) {
        }
    }

    private void e(int i) {
        c(this.m, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r5) {
        /*
        r4_this = this;
        r0 = 1;
        r3 = -1;
        r1 = "@";
        r1 = r5.indexOf(r1);	 Catch:{ IllegalArgumentException -> 0x0023 }
        if (r1 == r3) goto L_0x0029;
    L_0x000a:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0025 }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0025 }
        r1 = r5.indexOf(r1);	 Catch:{ IllegalArgumentException -> 0x0025 }
        if (r1 != r3) goto L_0x004b;
    L_0x0016:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0027 }
        r2 = 10;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0027 }
        r1 = r5.indexOf(r1);	 Catch:{ IllegalArgumentException -> 0x0027 }
        if (r1 != r3) goto L_0x004b;
    L_0x0022:
        return r0;
    L_0x0023:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0027 }
    L_0x0027:
        r0 = move-exception;
        throw r0;
    L_0x0029:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x004d }
        r2 = 9;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x004d }
        r2 = 1;
        r1 = r1.substring(r2);	 Catch:{ IllegalArgumentException -> 0x004d }
        r1 = r5.indexOf(r1);	 Catch:{ IllegalArgumentException -> 0x004d }
        if (r1 != r3) goto L_0x004b;
    L_0x003a:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x004f }
        r2 = 8;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x004f }
        r2 = 1;
        r1 = r1.substring(r2);	 Catch:{ IllegalArgumentException -> 0x004f }
        r1 = r5.indexOf(r1);	 Catch:{ IllegalArgumentException -> 0x004f }
        if (r1 == r3) goto L_0x0022;
    L_0x004b:
        r0 = 0;
        goto L_0x0022;
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.s.a(java.lang.String):boolean");
    }

    private void a(int i) {
        boolean z = b.n;
        try {
            if (i == 0) {
                try {
                    this.m.write(0);
                    if (!z) {
                        return;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            if (i < 256) {
                this.m.write(248);
                f(i);
                if (!z) {
                    return;
                }
            }
            this.m.write(249);
            c(i);
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    private void e() {
        int f = this.m.f() - (this.d + this.c);
        int length = this.k % this.b.length;
        byte[] bArr = new byte[(f + 5)];
        i.a(bArr, 0, 2, f + 2);
        a(bArr, 3);
        System.arraycopy(this.m.a(), this.d + this.c, bArr, 5, f);
        this.b[length] = bArr;
    }

    public synchronized void a(bi biVar) {
        a(biVar, 1);
    }

    public s(OutputStream outputStream, String[] strArr, String[] strArr2) {
        int i = 0;
        boolean z = b.n;
        this.b = (byte[][]) null;
        this.j = outputStream;
        this.m = new bo(this.h);
        c();
        this.g = new Hashtable((((strArr.length + strArr2.length) * 4) / 3) + 1);
        int i2 = 0;
        while (i2 < strArr.length) {
            try {
                if (strArr[i2] != null) {
                    this.g.put(strArr[i2], new Integer(i2));
                }
                i2++;
                if (z) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (i < strArr2.length) {
            try {
                if (strArr2[i] != null) {
                    this.g.put(strArr2[i], new Integer(i + 256));
                }
                i++;
                if (z) {
                    return;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    public synchronized void a(String str, String str2) {
        b();
        this.m.write(new byte[]{(byte) 87, (byte) 65, (byte) 1, (byte) 5});
        c();
        k[] kVarArr = new k[]{new k(z[2], str), new k(z[1], str2)};
        a((kVarArr.length * 2) + 1);
        this.m.write(1);
        a(kVarArr);
        a(false);
    }

    public synchronized void d() {
        try {
            if (this.m.f() > 0) {
                this.j.write(this.m.a(), 0, this.m.f());
                this.j.flush();
                b();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable th) {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.whatsapp.protocol.bi r6) {
        /*
        r5_this = this;
        r1 = 1;
        r0 = 0;
        r3 = com.whatsapp.protocol.b.n;
        r2 = r6.c;	 Catch:{ IllegalArgumentException -> 0x0059 }
        if (r2 != 0) goto L_0x005b;
    L_0x0008:
        r2 = r0;
    L_0x0009:
        r4 = r2 + 1;
        r2 = r6.e;	 Catch:{ IllegalArgumentException -> 0x0061 }
        if (r2 != 0) goto L_0x0063;
    L_0x000f:
        r2 = r0;
    L_0x0010:
        r2 = r2 + r4;
        r4 = r6.b;	 Catch:{ IllegalArgumentException -> 0x0065 }
        if (r4 != 0) goto L_0x001a;
    L_0x0015:
        r4 = r6.a;	 Catch:{ IllegalArgumentException -> 0x0067 }
        if (r4 != 0) goto L_0x001a;
    L_0x0019:
        r1 = r0;
    L_0x001a:
        r1 = r1 + r2;
        r5.a(r1);	 Catch:{ IllegalArgumentException -> 0x0069 }
        r1 = r6.f;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r5.b(r1);	 Catch:{ IllegalArgumentException -> 0x0069 }
        r1 = r6.c;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r5.a(r1);	 Catch:{ IllegalArgumentException -> 0x0069 }
        r1 = r6.b;	 Catch:{ IllegalArgumentException -> 0x0069 }
        if (r1 == 0) goto L_0x0033;
    L_0x002c:
        r1 = r6.b;	 Catch:{ IllegalArgumentException -> 0x006b }
        r5.a(r1);	 Catch:{ IllegalArgumentException -> 0x006b }
        if (r3 == 0) goto L_0x003e;
    L_0x0033:
        r1 = r6.a;	 Catch:{ IllegalArgumentException -> 0x006d }
        if (r1 == 0) goto L_0x003e;
    L_0x0037:
        r1 = r6.a;	 Catch:{ IllegalArgumentException -> 0x006d }
        r2 = r6.d;	 Catch:{ IllegalArgumentException -> 0x006d }
        r5.a(r1, r2);	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x003e:
        r1 = r6.e;
        if (r1 == 0) goto L_0x0058;
    L_0x0042:
        r1 = r6.e;
        r1 = r1.length;
        r5.a(r1);
    L_0x0048:
        r1 = r6.e;
        r1 = r1.length;
        if (r0 >= r1) goto L_0x0058;
    L_0x004d:
        r1 = r6.e;
        r1 = r1[r0];
        r5.b(r1);
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0048;
    L_0x0058:
        return;
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r2 = r6.c;
        r2 = r2.length;
        r2 = r2 * 2;
        goto L_0x0009;
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r2 = r1;
        goto L_0x0010;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.s.b(com.whatsapp.protocol.bi):void");
    }

    static {
        String[] strArr = new String[13];
        String str = "~\t6zFN\\$sL\u001c\u00101nDYFp";
        boolean z = true;
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
                        i3 = 60;
                        break;
                    case ay.f /*1*/:
                        i3 = 124;
                        break;
                    case ay.n /*2*/:
                        i3 = 80;
                        break;
                    case ay.p /*3*/:
                        i3 = 28;
                        break;
                    default:
                        i3 = 35;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "H\u0013";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "V\u00154";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "H\u0013";
                    i = 4;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "}\b$yNL\b5x\u0003H\u0013pkQU\b5<B\u001c\u0012?xF\u001c\u000b9hK\u001c\u001d><JR\n1pJX\\\u001aUg";
                    z = true;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "I\u00125dSY\u001f$yG\u001c\u0019?z\u0003K\u000e9hJR\u001bpzQS\u0011poWN\u00191q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "U\u0012&}OU\u0018phLW\u0019>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "|\u0012?rF\u0012\t#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "|\u0015>jBP\u00154";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "|\u0012?rF\u0012\t#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "|\u0015>jBP\u00154";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "x\u0013%~OY\\2eWY\\4u@H\u0015?rBN\u0005phLW\u0019><LI\bpsE\u001c\u000e1rDY";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    i = false;
                default:
                    strArr2[i] = str;
                    str = "N\u0019#sVN\u001f5";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    private void f(int i) {
        this.m.write(i & 255);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.lang.String r3, java.lang.String r4) {
        /*
        r2_this = this;
        r0 = r2.m;	 Catch:{ IllegalArgumentException -> 0x0018 }
        r1 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r0.write(r1);	 Catch:{ IllegalArgumentException -> 0x0018 }
        if (r3 == 0) goto L_0x0010;
    L_0x0009:
        r2.b(r3);	 Catch:{ IllegalArgumentException -> 0x001a }
        r0 = com.whatsapp.protocol.b.n;	 Catch:{ IllegalArgumentException -> 0x001a }
        if (r0 == 0) goto L_0x0014;
    L_0x0010:
        r0 = 0;
        r2.b(r0);	 Catch:{ IllegalArgumentException -> 0x001a }
    L_0x0014:
        r2.b(r4);
        return;
    L_0x0018:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001a }
    L_0x001a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.s.b(java.lang.String, java.lang.String):void");
    }

    public void a(byte[] bArr, int i) {
        bArr[i] = (byte) ((this.k & 65280) >> 8);
        bArr[i + 1] = (byte) ((this.k & 255) >> 0);
    }

    public s(String[] strArr, String[] strArr2) {
        this(null, strArr, strArr2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(boolean r9, int r10) {
        /*
        r8_this = this;
        r1 = 1;
        r2 = 0;
        monitor-enter(r8);
        r0 = r8.k;	 Catch:{ IllegalArgumentException -> 0x005a }
        r0 = r0 + 1;
        r8.k = r0;	 Catch:{ IllegalArgumentException -> 0x005a }
        r0 = r8.b;	 Catch:{ IllegalArgumentException -> 0x005a }
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        r8.e();	 Catch:{ IllegalArgumentException -> 0x005a }
    L_0x0010:
        r0 = r8.m;	 Catch:{ all -> 0x0057 }
        r0.c();	 Catch:{ all -> 0x0057 }
        r0 = r8.m;	 Catch:{ all -> 0x0057 }
        r0 = r0.f();	 Catch:{ all -> 0x0057 }
        r3 = r8.d;	 Catch:{ all -> 0x0057 }
        r4 = r8.c;	 Catch:{ all -> 0x0057 }
        r3 = r3 + r4;
        r4 = r0 - r3;
        r0 = r10 & 8;
        r3 = 8;
        if (r0 != r3) goto L_0x005c;
    L_0x0028:
        r0 = r10 & 1;
        if (r0 == 0) goto L_0x002e;
    L_0x002c:
        if (r4 == 0) goto L_0x005c;
    L_0x002e:
        r0 = r1;
    L_0x002f:
        if (r0 == 0) goto L_0x00c2;
    L_0x0031:
        r3 = r4 + 4;
    L_0x0033:
        r5 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r5 = r5 & r3;
        if (r5 == r3) goto L_0x005e;
    L_0x0039:
        r0 = new com.whatsapp.protocol.bw;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0055 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r4 = 0;
        r2 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x0055 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0055 }
        r1 = r1.append(r3);	 Catch:{ IllegalArgumentException -> 0x0055 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0055 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0055 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0055 }
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0057 }
    L_0x005c:
        r0 = r2;
        goto L_0x002f;
    L_0x005e:
        if (r0 == 0) goto L_0x007d;
    L_0x0060:
        r0 = r8.h;	 Catch:{ all -> 0x0057 }
        r5 = r8.m;	 Catch:{ all -> 0x0057 }
        r5 = r5.a();	 Catch:{ all -> 0x0057 }
        r6 = r8.d;	 Catch:{ all -> 0x0057 }
        r7 = r8.c;	 Catch:{ all -> 0x0057 }
        r6 = r6 + r7;
        r0.a(r5, r6, r4);	 Catch:{ all -> 0x0057 }
        r0 = r8.h;	 Catch:{ all -> 0x0057 }
        r0 = r0.b();	 Catch:{ all -> 0x0057 }
        r4 = r8.m;	 Catch:{ all -> 0x0057 }
        r5 = 0;
        r6 = 4;
        r4.write(r0, r5, r6);	 Catch:{ all -> 0x0057 }
    L_0x007d:
        r0 = r8.m;	 Catch:{ all -> 0x0057 }
        r4 = r0.a();	 Catch:{ all -> 0x0057 }
        r0 = r8.b;	 Catch:{ all -> 0x0057 }
        if (r0 == 0) goto L_0x00c0;
    L_0x0087:
        r0 = r8.d;	 Catch:{ all -> 0x0057 }
        r5 = r8.c;	 Catch:{ all -> 0x0057 }
        r0 = r0 + r5;
        r0 = r0 + -2;
        r8.a(r4, r0);	 Catch:{ all -> 0x0057 }
        r0 = r3 + 2;
        r10 = r10 | 2;
    L_0x0095:
        r3 = r8.d;	 Catch:{ IllegalArgumentException -> 0x00b6 }
        com.whatsapp.protocol.i.a(r4, r3, r10, r0);	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r0 = r8.f;	 Catch:{ IllegalArgumentException -> 0x00b6 }
        if (r0 == 0) goto L_0x00be;
    L_0x009e:
        if (r9 != 0) goto L_0x00ae;
    L_0x00a0:
        r0 = r8.f;	 Catch:{ IllegalArgumentException -> 0x00ba }
        r3 = r8.m;	 Catch:{ IllegalArgumentException -> 0x00ba }
        r3 = r3.f();	 Catch:{ IllegalArgumentException -> 0x00ba }
        r0 = r0.a(r8, r3);	 Catch:{ IllegalArgumentException -> 0x00ba }
        if (r0 == 0) goto L_0x00af;
    L_0x00ae:
        r2 = r1;
    L_0x00af:
        if (r2 == 0) goto L_0x00b4;
    L_0x00b1:
        r8.d();	 Catch:{ IllegalArgumentException -> 0x00bc }
    L_0x00b4:
        monitor-exit(r8);
        return;
    L_0x00b6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b8 }
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ba }
    L_0x00ba:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0057 }
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0057 }
    L_0x00be:
        r2 = r9;
        goto L_0x00af;
    L_0x00c0:
        r0 = r3;
        goto L_0x0095;
    L_0x00c2:
        r3 = r4;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.s.a(boolean, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(byte[] r12) {
        /*
        r11_this = this;
        r3 = 0;
        r1 = 1;
        r2 = 0;
        r6 = com.whatsapp.protocol.b.n;
        r7 = r12.length;
        r0 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        if (r7 < r0) goto L_0x0016;
    L_0x000a:
        r0 = r11.m;	 Catch:{ IllegalArgumentException -> 0x0094 }
        r4 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r0.write(r4);	 Catch:{ IllegalArgumentException -> 0x0094 }
        r11.d(r7);	 Catch:{ IllegalArgumentException -> 0x0094 }
        if (r6 == 0) goto L_0x0066;
    L_0x0016:
        r0 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r7 < r0) goto L_0x0026;
    L_0x001a:
        r0 = r11.m;	 Catch:{ IllegalArgumentException -> 0x0096 }
        r4 = 253; // 0xfd float:3.55E-43 double:1.25E-321;
        r0.write(r4);	 Catch:{ IllegalArgumentException -> 0x0096 }
        r11.e(r7);	 Catch:{ IllegalArgumentException -> 0x0096 }
        if (r6 == 0) goto L_0x0066;
    L_0x0026:
        r0 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r7 >= r0) goto L_0x00cd;
    L_0x002a:
        r0 = r7 + 1;
        r0 = r0 / 2;
        r4 = new byte[r0];
        r5 = r2;
    L_0x0031:
        if (r5 >= r7) goto L_0x00b6;
    L_0x0033:
        r8 = r12[r5];
        switch(r8) {
            case 45: goto L_0x009c;
            case 46: goto L_0x009c;
            case 47: goto L_0x0038;
            case 48: goto L_0x0098;
            case 49: goto L_0x0098;
            case 50: goto L_0x0098;
            case 51: goto L_0x0098;
            case 52: goto L_0x0098;
            case 53: goto L_0x0098;
            case 54: goto L_0x0098;
            case 55: goto L_0x0098;
            case 56: goto L_0x0098;
            case 57: goto L_0x0098;
            default: goto L_0x0038;
        };
    L_0x0038:
        r0 = r3;
    L_0x0039:
        if (r0 == 0) goto L_0x005c;
    L_0x003b:
        r3 = r7 % 2;
        if (r3 != r1) goto L_0x0049;
    L_0x003f:
        r3 = r0.length;	 Catch:{ IllegalArgumentException -> 0x00b8 }
        r3 = r3 + -1;
        r4 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00b8 }
        r4 = r4 | 15;
        r4 = (byte) r4;	 Catch:{ IllegalArgumentException -> 0x00b8 }
        r0[r3] = r4;	 Catch:{ IllegalArgumentException -> 0x00b8 }
    L_0x0049:
        r3 = r11.m;
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r3.write(r4);
        r3 = r7 % 2;
        r3 = r3 << 7;
        r4 = r0.length;
        r3 = r3 | r4;
        r11.f(r3);	 Catch:{ IllegalArgumentException -> 0x00ba }
        if (r6 == 0) goto L_0x00c8;
    L_0x005b:
        r12 = r0;
    L_0x005c:
        r0 = r11.m;	 Catch:{ IllegalArgumentException -> 0x00ba }
        r3 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        r0.write(r3);	 Catch:{ IllegalArgumentException -> 0x00ba }
        r11.f(r7);	 Catch:{ IllegalArgumentException -> 0x00ba }
    L_0x0066:
        r0 = r11.a;	 Catch:{ IllegalArgumentException -> 0x00bc }
        if (r0 <= 0) goto L_0x00c0;
    L_0x006a:
        r0 = r11.m;	 Catch:{ IllegalArgumentException -> 0x00bc }
        r0 = r0.f();	 Catch:{ IllegalArgumentException -> 0x00bc }
        r3 = r11.d;	 Catch:{ IllegalArgumentException -> 0x00bc }
        r0 = r0 - r3;
        r0 = r0 + r7;
        r3 = r11.a;	 Catch:{ IllegalArgumentException -> 0x00bc }
        if (r0 < r3) goto L_0x00c0;
    L_0x0078:
        r3 = r2;
    L_0x0079:
        if (r3 >= r7) goto L_0x0093;
    L_0x007b:
        if (r3 == 0) goto L_0x00be;
    L_0x007d:
        r0 = r1;
    L_0x007e:
        r11.a(r0, r2);
        r0 = r11.m;
        r4 = r7 - r3;
        r5 = r11.a;
        r4 = java.lang.Math.min(r4, r5);
        r0.write(r12, r3, r4);
        r0 = r11.a;
        r0 = r0 + r3;
        if (r6 == 0) goto L_0x00c6;
    L_0x0093:
        return;
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        throw r0;
    L_0x0098:
        r0 = r8 + -48;
        if (r6 == 0) goto L_0x00a2;
    L_0x009c:
        r0 = r8 + -45;
        r0 = r0 + 10;
        if (r6 != 0) goto L_0x0038;
    L_0x00a2:
        r8 = r5 / 2;
        r9 = r4[r8];
        r10 = r5 % 2;
        r10 = 1 - r10;
        r10 = r10 * 4;
        r0 = r0 << r10;
        r0 = (byte) r0;
        r0 = r0 | r9;
        r0 = (byte) r0;
        r4[r8] = r0;
        r0 = r5 + 1;
        if (r6 == 0) goto L_0x00ca;
    L_0x00b6:
        r0 = r4;
        goto L_0x0039;
    L_0x00b8:
        r0 = move-exception;
        throw r0;
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r0 = move-exception;
        throw r0;
    L_0x00be:
        r0 = r2;
        goto L_0x007e;
    L_0x00c0:
        r0 = r11.m;
        r0.write(r12);
        goto L_0x0093;
    L_0x00c6:
        r3 = r0;
        goto L_0x0079;
    L_0x00c8:
        r12 = r0;
        goto L_0x0066;
    L_0x00ca:
        r5 = r0;
        goto L_0x0031;
    L_0x00cd:
        r0 = r3;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.s.a(byte[]):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.lang.String r6) {
        /*
        r5_this = this;
        r1 = com.whatsapp.protocol.b.n;
        r0 = r5.g;	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        r0 = r0.get(r6);	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        r0 = (java.lang.Integer) r0;	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        if (r0 != 0) goto L_0x002e;
    L_0x000c:
        r2 = 64;
        r2 = r6.indexOf(r2);	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        r3 = 1;
        if (r2 >= r3) goto L_0x001e;
    L_0x0015:
        r3 = com.whatsapp.protocol.f.a(r6);	 Catch:{ UnsupportedEncodingException -> 0x005d }
        r5.a(r3);	 Catch:{ UnsupportedEncodingException -> 0x005d }
        if (r1 == 0) goto L_0x002c;
    L_0x001e:
        r3 = r2 + 1;
        r3 = r6.substring(r3);	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        r4 = 0;
        r2 = r6.substring(r4, r2);	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        r5.b(r2, r3);	 Catch:{ UnsupportedEncodingException -> 0x0052 }
    L_0x002c:
        if (r1 == 0) goto L_0x0077;
    L_0x002e:
        r0 = r0.intValue();	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r0 >= r2) goto L_0x003b;
    L_0x0036:
        r5.b(r0);	 Catch:{ UnsupportedEncodingException -> 0x005f }
        if (r1 == 0) goto L_0x0077;
    L_0x003b:
        r0 = r0 + -256;
        r2 = r0 / 256;
        r3 = r0 % 256;
        switch(r2) {
            case 0: goto L_0x0061;
            case 1: goto L_0x0065;
            case 2: goto L_0x0069;
            case 3: goto L_0x006d;
            default: goto L_0x0044;
        };
    L_0x0044:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ UnsupportedEncodingException -> 0x0050 }
        r1 = z;	 Catch:{ UnsupportedEncodingException -> 0x0050 }
        r2 = 12;
        r1 = r1[r2];	 Catch:{ UnsupportedEncodingException -> 0x0050 }
        r0.<init>(r1);	 Catch:{ UnsupportedEncodingException -> 0x0050 }
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r0 = r0.getMessage();
        r1.<init>(r0);
        throw r1;
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0052 }
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0052 }
    L_0x0061:
        r0 = 236; // 0xec float:3.31E-43 double:1.166E-321;
        if (r1 == 0) goto L_0x0071;
    L_0x0065:
        r0 = 237; // 0xed float:3.32E-43 double:1.17E-321;
        if (r1 == 0) goto L_0x0071;
    L_0x0069:
        r0 = 238; // 0xee float:3.34E-43 double:1.176E-321;
        if (r1 == 0) goto L_0x0071;
    L_0x006d:
        r0 = 239; // 0xef float:3.35E-43 double:1.18E-321;
        if (r1 != 0) goto L_0x0044;
    L_0x0071:
        r5.b(r0);	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        r5.b(r3);	 Catch:{ UnsupportedEncodingException -> 0x0052 }
    L_0x0077:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.s.b(java.lang.String):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int f() {
        /*
        r2_this = this;
        monitor-enter(r2);
        r0 = r2.h;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x000b;
    L_0x0005:
        r0 = 8;
        r1 = com.whatsapp.protocol.b.n;	 Catch:{ all -> 0x0018 }
        if (r1 == 0) goto L_0x000c;
    L_0x000b:
        r0 = 0;
    L_0x000c:
        r1 = r2.m;	 Catch:{ all -> 0x0018 }
        r1 = r1.b();	 Catch:{ all -> 0x0018 }
        if (r1 == 0) goto L_0x0016;
    L_0x0014:
        r0 = r0 | 4;
    L_0x0016:
        monitor-exit(r2);
        return r0;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.s.f():int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(com.whatsapp.protocol.bi r9) {
        /*
        r8_this = this;
        r2 = 1;
        r1 = 0;
        r3 = com.whatsapp.protocol.b.n;
        if (r9 == 0) goto L_0x0063;
    L_0x0006:
        r0 = r9.c;	 Catch:{ IllegalArgumentException -> 0x0037 }
        if (r0 == 0) goto L_0x0043;
    L_0x000a:
        r0 = r1;
    L_0x000b:
        r4 = r9.c;
        r4 = r4.length;
        if (r0 >= r4) goto L_0x0043;
    L_0x0010:
        r4 = r9.c;
        r4 = r4[r0];
        r5 = r4.b;	 Catch:{ IllegalArgumentException -> 0x0039 }
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x0039 }
        r7 = 3;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x0039 }
        r5 = r5.equals(r6);	 Catch:{ IllegalArgumentException -> 0x0039 }
        if (r5 != 0) goto L_0x002e;
    L_0x0021:
        r5 = r4.b;	 Catch:{ IllegalArgumentException -> 0x003b }
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x003b }
        r7 = 4;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = r5.equals(r6);	 Catch:{ IllegalArgumentException -> 0x003b }
        if (r5 == 0) goto L_0x003f;
    L_0x002e:
        r4 = r4.a;	 Catch:{ IllegalArgumentException -> 0x003d }
        r4 = r8.a(r4);	 Catch:{ IllegalArgumentException -> 0x003d }
        if (r4 != 0) goto L_0x003f;
    L_0x0036:
        return r1;
    L_0x0037:
        r0 = move-exception;
        throw r0;
    L_0x0039:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x000b;
    L_0x0043:
        r0 = r9.e;	 Catch:{ IllegalArgumentException -> 0x0049 }
        if (r0 != 0) goto L_0x004b;
    L_0x0047:
        r1 = r2;
        goto L_0x0036;
    L_0x0049:
        r0 = move-exception;
        throw r0;
    L_0x004b:
        r0 = r1;
    L_0x004c:
        r4 = r9.e;
        r4 = r4.length;
        if (r0 >= r4) goto L_0x005f;
    L_0x0051:
        r4 = r9.e;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r4 = r4[r0];	 Catch:{ IllegalArgumentException -> 0x0061 }
        r4 = r8.a(r4);	 Catch:{ IllegalArgumentException -> 0x0061 }
        if (r4 == 0) goto L_0x0036;
    L_0x005b:
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x004c;
    L_0x005f:
        r1 = r2;
        goto L_0x0036;
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r1 = r2;
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.s.a(com.whatsapp.protocol.bi):boolean");
    }

    private synchronized void c() {
        int i = 0;
        synchronized (this) {
            try {
                int i2;
                boolean z = b.n;
                try {
                    this.m.c();
                    this.d = this.m.f();
                } catch (IOException e) {
                }
                if (this.b != null) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
                this.c = i2 + 3;
                while (i < this.c) {
                    try {
                        this.m.write(0);
                    } catch (IOException e2) {
                    }
                    i++;
                    if (z) {
                        break;
                    }
                }
            } catch (IOException e3) {
                throw e3;
            } catch (Throwable th) {
            }
        }
    }

    public synchronized void a() {
        c();
        a(1);
        this.m.write(2);
        a(true);
    }

    private void a(k[] kVarArr) {
        boolean z = b.n;
        if (kVarArr != null) {
            int i = 0;
            while (i < kVarArr.length) {
                b(kVarArr[i].b);
                b(kVarArr[i].a);
                i++;
                if (z) {
                    return;
                }
            }
        }
    }

    public synchronized void a(bi biVar, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        a(biVar, i);
    }

    private void c(int i) {
        a(this.m, i);
    }

    private synchronized void b() {
        this.m.d();
        this.c = 0;
        this.d = 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(boolean r6, boolean r7) {
        /*
        r5_this = this;
        r0 = 1;
        r1 = 0;
        monitor-enter(r5);
        r2 = r5.f();	 Catch:{ all -> 0x0045 }
        r2 = r2 | 1;
        r3 = r5.m;	 Catch:{ IllegalArgumentException -> 0x003f }
        r3 = r3.f();	 Catch:{ IllegalArgumentException -> 0x003f }
        r4 = r5.d;	 Catch:{ IllegalArgumentException -> 0x003f }
        r3 = r3 - r4;
        r4 = r5.c;	 Catch:{ IllegalArgumentException -> 0x003f }
        r3 = r3 - r4;
        if (r3 == 0) goto L_0x0024;
    L_0x0017:
        r3 = 1;
        r5.e = r3;	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r6 == 0) goto L_0x0048;
    L_0x001c:
        if (r7 != 0) goto L_0x0048;
    L_0x001e:
        r5.a(r0, r2);	 Catch:{ all -> 0x0045 }
        r5.c();	 Catch:{ all -> 0x0045 }
    L_0x0024:
        r0 = r5.e;	 Catch:{ IllegalArgumentException -> 0x004a }
        if (r0 == 0) goto L_0x003d;
    L_0x0028:
        if (r7 == 0) goto L_0x0034;
    L_0x002a:
        r5.a(r6, r2);	 Catch:{ IllegalArgumentException -> 0x004e }
        r0 = 0;
        r5.e = r0;	 Catch:{ IllegalArgumentException -> 0x004e }
        r0 = com.whatsapp.protocol.b.n;	 Catch:{ IllegalArgumentException -> 0x004e }
        if (r0 == 0) goto L_0x003d;
    L_0x0034:
        r0 = r2 & 4;
        if (r0 == 0) goto L_0x003d;
    L_0x0038:
        r0 = r5.m;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r0.e();	 Catch:{ IllegalArgumentException -> 0x0050 }
    L_0x003d:
        monitor-exit(r5);
        return;
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
    L_0x0048:
        r0 = r1;
        goto L_0x001e;
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0045 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.s.a(boolean, boolean):void");
    }

    private static void a(OutputStream outputStream, int i) {
        outputStream.write((65280 & i) >> 8);
        outputStream.write((i & 255) >> 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.io.InputStream r7, int r8) {
        /*
        r6_this = this;
        r2 = 1;
        r3 = 0;
        r4 = com.whatsapp.protocol.b.n;
        r0 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        if (r8 < r0) goto L_0x0014;
    L_0x0008:
        r0 = r6.m;	 Catch:{ IllegalArgumentException -> 0x005b }
        r1 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r0.write(r1);	 Catch:{ IllegalArgumentException -> 0x005b }
        r6.d(r8);	 Catch:{ IllegalArgumentException -> 0x005b }
        if (r4 == 0) goto L_0x002e;
    L_0x0014:
        r0 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r8 < r0) goto L_0x0024;
    L_0x0018:
        r0 = r6.m;	 Catch:{ IllegalArgumentException -> 0x005f }
        r1 = 253; // 0xfd float:3.55E-43 double:1.25E-321;
        r0.write(r1);	 Catch:{ IllegalArgumentException -> 0x005f }
        r6.e(r8);	 Catch:{ IllegalArgumentException -> 0x005f }
        if (r4 == 0) goto L_0x002e;
    L_0x0024:
        r0 = r6.m;	 Catch:{ IllegalArgumentException -> 0x005f }
        r1 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        r0.write(r1);	 Catch:{ IllegalArgumentException -> 0x005f }
        r6.f(r8);	 Catch:{ IllegalArgumentException -> 0x005f }
    L_0x002e:
        r0 = r6.a;	 Catch:{ IllegalArgumentException -> 0x0061 }
        if (r0 <= 0) goto L_0x0063;
    L_0x0032:
        r0 = r6.a;	 Catch:{ IllegalArgumentException -> 0x0061 }
    L_0x0034:
        r1 = r2;
    L_0x0035:
        if (r8 <= 0) goto L_0x006f;
    L_0x0037:
        r5 = r6.a;	 Catch:{ IllegalArgumentException -> 0x0066 }
        if (r5 <= 0) goto L_0x0041;
    L_0x003b:
        if (r1 != 0) goto L_0x006a;
    L_0x003d:
        r1 = r2;
    L_0x003e:
        r6.a(r1, r3);
    L_0x0041:
        r1 = r6.m;
        r5 = java.lang.Math.min(r8, r0);
        r1 = r1.a(r7, r5);
        r5 = -1;
        if (r1 != r5) goto L_0x006c;
    L_0x004e:
        r0 = new java.io.IOException;	 Catch:{ IllegalArgumentException -> 0x0059 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0059 }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0059 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0059 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0059 }
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r0 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        goto L_0x0034;
    L_0x0066:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0068 }
    L_0x0068:
        r0 = move-exception;
        throw r0;
    L_0x006a:
        r1 = r3;
        goto L_0x003e;
    L_0x006c:
        r8 = r8 - r1;
        if (r4 == 0) goto L_0x0070;
    L_0x006f:
        return;
    L_0x0070:
        r1 = r3;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.s.a(java.io.InputStream, int):void");
    }

    public synchronized byte[] a(bi biVar) {
        Object obj;
        b();
        b(biVar);
        int f = this.m.f();
        obj = new Object[f];
        System.arraycopy(this.m.a(), 0, obj, 0, f);
        return obj;
    }

    private static void c(OutputStream outputStream, int i) {
        outputStream.write((983040 & i) >> 16);
        outputStream.write((65280 & i) >> 8);
        outputStream.write((i & 255) >> 0);
    }
}
