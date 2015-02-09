package com.whatsapp.protocol;

import java.io.Writer;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class cr implements cw {
    private static final String[] a;
    private static final String[] z;
    private final Writer b;

    void a(String str) {
        a(str.getBytes());
    }

    private static boolean b(String str) {
        boolean z = b.n;
        int i = 0;
        while (i < a.length) {
            if (a[i].equals(str)) {
                return true;
            }
            i++;
            if (z) {
                return false;
            }
        }
        return false;
    }

    public synchronized void a(String str, String str2) {
        this.b.write(z[1]);
        this.b.write(str);
        this.b.write(z[2]);
        this.b.write(str2);
        this.b.write(z[0]);
        this.b.flush();
    }

    private void b(bi biVar) {
        c(biVar);
    }

    static {
        String[] strArr = new String[8];
        String str = "e&";
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
                        i4 = 66;
                        break;
                    case ay.f /*1*/:
                        i4 = 24;
                        break;
                    case ay.n /*2*/:
                        i4 = 97;
                        break;
                    case ay.p /*3*/:
                        i4 = 17;
                        break;
                    default:
                        i4 = 68;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "e8\u0013t7-m\u0013r!\u007f?";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u007f?";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "m&";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "~7";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "|c\u001aR\u000b\fL$_\u0010\u00118$]\r\u0006]%l9~7";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "~7\u0012e6'y\f+76j\u0004p)|";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    strArr = new String[1];
                    str = " w\u0005h";
                    i = 7;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    a = strArr3;
                default:
                    strArr2[i2] = str;
                    str = "~k\u0015c!#u[b00}\u0000|d6w\\6";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private void c(bi biVar) {
        int i = 0;
        boolean z = b.n;
        this.b.write(60);
        this.b.write(biVar.f);
        if (biVar.c != null) {
            int i2 = 0;
            while (i2 < biVar.c.length) {
                this.b.write(32);
                this.b.write(biVar.c[i2].b);
                this.b.write(z[3]);
                a(biVar.c[i2].a);
                this.b.write(39);
                i2++;
                if (z) {
                    break;
                }
            }
        }
        if (biVar.b == null && biVar.e == null) {
            this.b.write(z[4]);
            if (!z) {
                return;
            }
        }
        if (b(biVar.f)) {
            this.b.write(z[6]);
            this.b.write(biVar.f);
            this.b.write(62);
            if (!z) {
                return;
            }
        }
        this.b.write(62);
        if (biVar.b != null) {
            a(biVar.b);
        }
        if (biVar.e != null) {
            while (i < biVar.e.length) {
                b(biVar.e[i]);
                i++;
                if (z) {
                    break;
                }
            }
        }
        this.b.write(z[5]);
        this.b.write(biVar.f);
        this.b.write(62);
    }

    public synchronized void a(bi biVar, boolean z) {
        a(biVar, z ? 1 : 0);
    }

    public void a(bx bxVar) {
    }

    public synchronized void a(bi biVar) {
        a(biVar, 1);
    }

    public cr(Writer writer) {
        this.b = writer;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(byte[] r10) {
        /*
        r9_this = this;
        r8 = 37;
        r1 = com.whatsapp.protocol.b.n;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r10.length;
        r0 = 0;
    L_0x000b:
        if (r0 >= r3) goto L_0x003b;
    L_0x000d:
        r4 = r10[r0];
        r5 = 33;
        if (r4 < r5) goto L_0x0019;
    L_0x0013:
        if (r4 == r8) goto L_0x0019;
    L_0x0015:
        r5 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r4 <= r5) goto L_0x0033;
    L_0x0019:
        r2.append(r8);
        r5 = r4 & 255;
        r5 = java.lang.Integer.toHexString(r5);
        r6 = r5.length();
        r7 = 1;
        if (r6 != r7) goto L_0x002e;
    L_0x0029:
        r6 = 48;
        r2.append(r6);
    L_0x002e:
        r2.append(r5);
        if (r1 == 0) goto L_0x0037;
    L_0x0033:
        r4 = (char) r4;
        r2.append(r4);
    L_0x0037:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x000b;
    L_0x003b:
        r0 = r9.b;
        r1 = r2.toString();
        r0.write(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.cr.a(byte[]):void");
    }

    public synchronized void a() {
        this.b.write(z[7]);
        this.b.flush();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(com.whatsapp.protocol.bi r3, int r4) {
        /*
        r2_this = this;
        monitor-enter(r2);
        if (r3 != 0) goto L_0x000e;
    L_0x0003:
        r0 = r2.b;	 Catch:{ all -> 0x001c }
        r1 = 32;
        r0.write(r1);	 Catch:{ all -> 0x001c }
        r0 = com.whatsapp.protocol.b.n;	 Catch:{ all -> 0x001c }
        if (r0 == 0) goto L_0x0011;
    L_0x000e:
        r2.b(r3);	 Catch:{ all -> 0x001c }
    L_0x0011:
        r0 = r4 & 1;
        if (r0 == 0) goto L_0x001a;
    L_0x0015:
        r0 = r2.b;	 Catch:{ all -> 0x001c }
        r0.flush();	 Catch:{ all -> 0x001c }
    L_0x001a:
        monitor-exit(r2);
        return;
    L_0x001c:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.cr.a(com.whatsapp.protocol.bi, int):void");
    }
}
