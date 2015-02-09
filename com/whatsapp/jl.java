package com.whatsapp;

import com.whatsapp.protocol.cz;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class jl implements Runnable {
    private static final String[] z;
    final byte[] a;
    final byte[] b;
    final mo c;
    final String d;
    final byte e;
    final cz f;
    final cz g;

    static {
        String[] strArr = new String[3];
        String str = "\u001a1\u001ay-\u001a;Lh3\u0016\u007f\u0007}8S-\tl4\u00011\t|a\u0015-\u0003ua\u0000:\u001en$\u0001\u007f\bm3\u001a1\u000b81\u0001:Ls$\n\u007f\n}5\u00107L~.\u0001\u007f";
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
                        i3 = 115;
                        break;
                    case ay.f /*1*/:
                        i3 = 95;
                        break;
                    case ay.n /*2*/:
                        i3 = 108;
                        break;
                    case ay.p /*3*/:
                        i3 = 24;
                        break;
                    default:
                        i3 = 65;
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
                    str = "\u001a1\u001ay-\u001a;Lk(\u00141\t|a\u0003-\t8*\u0016&Lj$\u0007*\u001ev$\u0017\u007f\nj.\u001e\u007f\u001f}3\u0005:\u001e8%\u0006-\u0005v&S/\u001e}a\u0018:\u00158'\u0016+\u000fpa\u00150\u001e8";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u001a1\u001ay-\u001a;Lq%\u00161\u0018q5\n\u007f\u0007}8S-\tl4\u00011\t|a\u0015-\u0003ua\u0000:\u001en$\u0001\u007f\bm3\u001a1\u000b81\u0001:Ls$\n\u007f\n}5\u00107L~.\u0001\u007f\u0006q%S";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r11_this = this;
        r0 = r11.d;
        r6 = com.whatsapp.f_.a(r0);
        r0 = r11.b;	 Catch:{ Z -> 0x00b4 }
        r0 = r0.length;	 Catch:{ Z -> 0x00b4 }
        r0 = r0 + 1;
        r0 = new byte[r0];	 Catch:{ Z -> 0x00b4 }
        r1 = 0;
        r2 = r11.e;	 Catch:{ Z -> 0x00b4 }
        r0[r1] = r2;	 Catch:{ Z -> 0x00b4 }
        r1 = r11.b;	 Catch:{ Z -> 0x00b4 }
        r2 = 0;
        r3 = 1;
        r4 = r11.b;	 Catch:{ Z -> 0x00b4 }
        r4 = r4.length;	 Catch:{ Z -> 0x00b4 }
        java.lang.System.arraycopy(r1, r2, r0, r3, r4);	 Catch:{ Z -> 0x00b4 }
        r10 = new org.whispersystems.libaxolotl.b2;	 Catch:{ Z -> 0x00b4 }
        r1 = 0;
        r10.<init>(r0, r1);	 Catch:{ Z -> 0x00b4 }
    L_0x0022:
        r1 = new org.whispersystems.libaxolotl.an;
        r0 = r11.c;
        r0 = com.whatsapp.mo.a(r0);
        r2 = r0.a6;
        r0 = r11.c;
        r0 = com.whatsapp.mo.a(r0);
        r3 = r0.a6;
        r0 = r11.c;
        r0 = com.whatsapp.mo.a(r0);
        r0 = r0.a6;
        r4 = r0.c();
        r0 = r11.c;
        r0 = com.whatsapp.mo.a(r0);
        r5 = r0.a6;
        r8 = 0;
        r1.<init>(r2, r3, r4, r5, r6, r8);
        r0 = r11.g;	 Catch:{ Z -> 0x00d3 }
        if (r0 == 0) goto L_0x0056;
    L_0x0050:
        r0 = r11.g;	 Catch:{ Z -> 0x00d3 }
        r0 = r0.a;	 Catch:{ Z -> 0x00d3 }
        if (r0 != 0) goto L_0x00d5;
    L_0x0056:
        r6 = 0;
    L_0x0057:
        r0 = r11.f;	 Catch:{ Z -> 0x0117 }
        r0 = r0.a;	 Catch:{ Z -> 0x0117 }
        r0 = r0.length;	 Catch:{ Z -> 0x0117 }
        r0 = r0 + 1;
        r0 = new byte[r0];	 Catch:{ Z -> 0x0117 }
        r2 = 0;
        r3 = r11.e;	 Catch:{ Z -> 0x0117 }
        r0[r2] = r3;	 Catch:{ Z -> 0x0117 }
        r2 = r11.f;	 Catch:{ Z -> 0x0117 }
        r2 = r2.a;	 Catch:{ Z -> 0x0117 }
        r3 = 0;
        r4 = 1;
        r5 = r11.f;	 Catch:{ Z -> 0x0117 }
        r5 = r5.a;	 Catch:{ Z -> 0x0117 }
        r5 = r5.length;	 Catch:{ Z -> 0x0117 }
        java.lang.System.arraycopy(r2, r3, r0, r4, r5);	 Catch:{ Z -> 0x0117 }
        r2 = 0;
        r8 = org.whispersystems.libaxolotl.ecc.d.a(r0, r2);	 Catch:{ Z -> 0x0117 }
    L_0x0078:
        r0 = r11.a;	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r3 = org.whispersystems.libaxolotl.aE.a(r0);	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r0 = r11.g;	 Catch:{ Z -> 0x0136, bA -> 0x015c }
        if (r0 != 0) goto L_0x0151;
    L_0x0082:
        r5 = -1;
    L_0x0083:
        r0 = r11.f;	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r0 = r0.c;	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r2 = 0;
        r7 = org.whispersystems.libaxolotl.aE.c(r0, r2);	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r2 = new org.whispersystems.libaxolotl.bO;	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r4 = 0;
        r0 = r11.f;	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r9 = r0.b;	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r1.a(r2);	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r0 = r11.c;	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r0 = com.whatsapp.mo.a(r0);	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r0 = r0.U();	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r1 = new com.whatsapp.avz;	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r2 = com.whatsapp.App.aJ;	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r3 = r11.d;	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r2 = r2.r(r3);	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r1.<init>(r11, r2);	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r0.post(r1);	 Catch:{ Z -> 0x0138, bA -> 0x015c }
    L_0x00b3:
        return;
    L_0x00b4:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r11.d;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.b(r1, r0);
        r10 = 0;
        goto L_0x0022;
    L_0x00d3:
        r0 = move-exception;
        throw r0;
    L_0x00d5:
        r0 = r11.g;	 Catch:{ Z -> 0x00f9 }
        r0 = r0.a;	 Catch:{ Z -> 0x00f9 }
        r0 = r0.length;	 Catch:{ Z -> 0x00f9 }
        r0 = r0 + 1;
        r0 = new byte[r0];	 Catch:{ Z -> 0x00f9 }
        r2 = 0;
        r3 = r11.e;	 Catch:{ Z -> 0x00f9 }
        r0[r2] = r3;	 Catch:{ Z -> 0x00f9 }
        r2 = r11.g;	 Catch:{ Z -> 0x00f9 }
        r2 = r2.a;	 Catch:{ Z -> 0x00f9 }
        r3 = 0;
        r4 = 1;
        r5 = r11.g;	 Catch:{ Z -> 0x00f9 }
        r5 = r5.a;	 Catch:{ Z -> 0x00f9 }
        r5 = r5.length;	 Catch:{ Z -> 0x00f9 }
        java.lang.System.arraycopy(r2, r3, r0, r4, r5);	 Catch:{ Z -> 0x00f9 }
        r2 = 0;
        r0 = org.whispersystems.libaxolotl.ecc.d.a(r0, r2);	 Catch:{ Z -> 0x00f9 }
    L_0x00f6:
        r6 = r0;
        goto L_0x0057;
    L_0x00f9:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 0;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r11.d;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.b(r2, r0);
        r0 = 0;
        goto L_0x00f6;
    L_0x0117:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r11.d;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.b(r2, r0);
        r8 = 0;
        goto L_0x0078;
    L_0x0136:
        r0 = move-exception;
        throw r0;	 Catch:{ Z -> 0x0138, bA -> 0x015c }
    L_0x0138:
        r0 = move-exception;
    L_0x0139:
        com.whatsapp.util.Log.c(r0);
        r0 = r11.c;
        r0 = com.whatsapp.mo.a(r0);
        r0 = r0.U();
        r1 = new com.whatsapp.avz;
        r2 = 0;
        r1.<init>(r11, r2);
        r0.post(r1);
        goto L_0x00b3;
    L_0x0151:
        r0 = r11.g;	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r0 = r0.c;	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        r2 = 0;
        r5 = org.whispersystems.libaxolotl.aE.c(r0, r2);	 Catch:{ Z -> 0x0138, bA -> 0x015c }
        goto L_0x0083;
    L_0x015c:
        r0 = move-exception;
        goto L_0x0139;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jl.run():void");
    }

    jl(mo moVar, String str, byte[] bArr, byte b, cz czVar, cz czVar2, byte[] bArr2) {
        this.c = moVar;
        this.d = str;
        this.b = bArr;
        this.e = b;
        this.g = czVar;
        this.f = czVar2;
        this.a = bArr2;
    }
}
