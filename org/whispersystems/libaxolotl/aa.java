package org.whispersystems.libaxolotl;

import com.google.g2;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ecc.f;

public class aA implements a3 {
    private static final String[] z;
    private final byte[] a;
    private final int b;
    private final f c;
    private final int d;
    private final int e;
    private final byte[] f;

    static {
        String[] strArr = new String[5];
        String str = "6Dt\u0011e\u0003\u0001~\u0015u\t@t\u0015<Z";
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
                        i3 = 122;
                        break;
                    case ay.f /*1*/:
                        i3 = 33;
                        break;
                    case ay.n /*2*/:
                        i3 = 19;
                        break;
                    case ay.p /*3*/:
                        i3 = 112;
                        break;
                    default:
                        i3 = 6;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "/Ox\u001ei\rO3\u0006c\bRz\u001fh@\u0001";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "2Lr\u0013U2`!E0";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "8@wPK\u001bB2";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "3Op\u001fk\nMv\u0004cZLv\u0003u\u001bFv^";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public byte[] b() {
        return this.f;
    }

    public int e() {
        return this.e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aA(byte[] r6) {
        /*
        r5_this = this;
        r4 = 1;
        r5.<init>();
        r0 = 1;
        r1 = r6.length;	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r1 = r1 + -1;
        r1 = r1 + -8;
        r2 = 8;
        r0 = org.whispersystems.libaxolotl.aE.a(r6, r0, r1, r2);	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r1 = 0;
        r1 = r0[r1];	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r2 = 1;
        r2 = r0[r2];	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r3 = 2;
        r0 = r0[r3];	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r0 = org.whispersystems.libaxolotl.aE.a(r1);	 Catch:{ gc -> 0x0042, Z -> 0x0074, ParseException -> 0x0099 }
        if (r0 > r4) goto L_0x004b;
    L_0x0022:
        r0 = new org.whispersystems.libaxolotl.ah;	 Catch:{ gc -> 0x0042, Z -> 0x0074, ParseException -> 0x0099 }
        r2 = new java.lang.StringBuilder;	 Catch:{ gc -> 0x0042, Z -> 0x0074, ParseException -> 0x0099 }
        r2.<init>();	 Catch:{ gc -> 0x0042, Z -> 0x0074, ParseException -> 0x0099 }
        r3 = z;	 Catch:{ gc -> 0x0042, Z -> 0x0074, ParseException -> 0x0099 }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ gc -> 0x0042, Z -> 0x0074, ParseException -> 0x0099 }
        r2 = r2.append(r3);	 Catch:{ gc -> 0x0042, Z -> 0x0074, ParseException -> 0x0099 }
        r1 = org.whispersystems.libaxolotl.aE.a(r1);	 Catch:{ gc -> 0x0042, Z -> 0x0074, ParseException -> 0x0099 }
        r1 = r2.append(r1);	 Catch:{ gc -> 0x0042, Z -> 0x0074, ParseException -> 0x0099 }
        r1 = r1.toString();	 Catch:{ gc -> 0x0042, Z -> 0x0074, ParseException -> 0x0099 }
        r0.<init>(r1);	 Catch:{ gc -> 0x0042, Z -> 0x0074, ParseException -> 0x0099 }
        throw r0;	 Catch:{ gc -> 0x0042, Z -> 0x0074, ParseException -> 0x0099 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
    L_0x0044:
        r0 = move-exception;
    L_0x0045:
        r1 = new org.whispersystems.libaxolotl.aJ;
        r1.<init>(r0);
        throw r1;
    L_0x004b:
        r0 = org.whispersystems.libaxolotl.aE.a(r1);	 Catch:{ gc -> 0x0072, Z -> 0x0074, ParseException -> 0x0099 }
        r3 = 3;
        if (r0 <= r3) goto L_0x0076;
    L_0x0052:
        r0 = new org.whispersystems.libaxolotl.aJ;	 Catch:{ gc -> 0x0072, Z -> 0x0074, ParseException -> 0x0099 }
        r2 = new java.lang.StringBuilder;	 Catch:{ gc -> 0x0072, Z -> 0x0074, ParseException -> 0x0099 }
        r2.<init>();	 Catch:{ gc -> 0x0072, Z -> 0x0074, ParseException -> 0x0099 }
        r3 = z;	 Catch:{ gc -> 0x0072, Z -> 0x0074, ParseException -> 0x0099 }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ gc -> 0x0072, Z -> 0x0074, ParseException -> 0x0099 }
        r2 = r2.append(r3);	 Catch:{ gc -> 0x0072, Z -> 0x0074, ParseException -> 0x0099 }
        r1 = org.whispersystems.libaxolotl.aE.a(r1);	 Catch:{ gc -> 0x0072, Z -> 0x0074, ParseException -> 0x0099 }
        r1 = r2.append(r1);	 Catch:{ gc -> 0x0072, Z -> 0x0074, ParseException -> 0x0099 }
        r1 = r1.toString();	 Catch:{ gc -> 0x0072, Z -> 0x0074, ParseException -> 0x0099 }
        r0.<init>(r1);	 Catch:{ gc -> 0x0072, Z -> 0x0074, ParseException -> 0x0099 }
        throw r0;	 Catch:{ gc -> 0x0072, Z -> 0x0074, ParseException -> 0x0099 }
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
    L_0x0074:
        r0 = move-exception;
        goto L_0x0045;
    L_0x0076:
        r0 = org.whispersystems.libaxolotl.af.a(r2);	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r2 = r0.k();	 Catch:{ gc -> 0x009b, Z -> 0x0074, ParseException -> 0x0099 }
        if (r2 == 0) goto L_0x008c;
    L_0x0080:
        r2 = r0.n();	 Catch:{ gc -> 0x009b, Z -> 0x0074, ParseException -> 0x0099 }
        if (r2 == 0) goto L_0x008c;
    L_0x0086:
        r2 = r0.e();	 Catch:{ gc -> 0x009d, Z -> 0x0074, ParseException -> 0x0099 }
        if (r2 != 0) goto L_0x009f;
    L_0x008c:
        r0 = new org.whispersystems.libaxolotl.aJ;	 Catch:{ gc -> 0x0097, Z -> 0x0074, ParseException -> 0x0099 }
        r1 = z;	 Catch:{ gc -> 0x0097, Z -> 0x0074, ParseException -> 0x0099 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ gc -> 0x0097, Z -> 0x0074, ParseException -> 0x0099 }
        r0.<init>(r1);	 Catch:{ gc -> 0x0097, Z -> 0x0074, ParseException -> 0x0099 }
        throw r0;	 Catch:{ gc -> 0x0097, Z -> 0x0074, ParseException -> 0x0099 }
    L_0x0097:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
    L_0x0099:
        r0 = move-exception;
        goto L_0x0045;
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x009d, Z -> 0x0074, ParseException -> 0x0099 }
    L_0x009d:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0097, Z -> 0x0074, ParseException -> 0x0099 }
    L_0x009f:
        r5.a = r6;	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r2 = r0.c();	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r2 = r2.b();	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r3 = 0;
        r2 = org.whispersystems.libaxolotl.ecc.d.a(r2, r3);	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r5.c = r2;	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r1 = org.whispersystems.libaxolotl.aE.a(r1);	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r5.e = r1;	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r1 = r0.h();	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r5.d = r1;	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r1 = r0.f();	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r5.b = r1;	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r0 = r0.i();	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r0 = r0.b();	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        r5.f = r0;	 Catch:{ gc -> 0x0044, Z -> 0x0074, ParseException -> 0x0099 }
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.aA.<init>(byte[]):void");
    }

    public void a(int i, b2 b2Var, b2 b2Var2, SecretKeySpec secretKeySpec) {
        byte[][] c = aE.c(this.a, this.a.length - 8, 8);
        if (!MessageDigest.isEqual(a(i, b2Var, b2Var2, secretKeySpec, c[0]), c[1])) {
            throw new aJ(z[4]);
        }
    }

    private byte[] a(int i, b2 b2Var, b2 b2Var2, SecretKeySpec secretKeySpec, byte[] bArr) {
        Object e;
        try {
            Mac instance = Mac.getInstance(z[3]);
            instance.init(secretKeySpec);
            if (i >= 3) {
                instance.update(b2Var.a().b());
                instance.update(b2Var2.a().b());
            }
            return aE.b(instance.doFinal(bArr), 8);
        } catch (NoSuchAlgorithmException e2) {
            throw e2;
        } catch (InvalidKeyException e3) {
            e = e3;
            throw new AssertionError(e);
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            throw new AssertionError(e);
        }
    }

    public int b() {
        return 2;
    }

    public int d() {
        return this.d;
    }

    public aA(int i, SecretKeySpec secretKeySpec, f fVar, int i2, int i3, byte[] bArr, b2 b2Var, b2 b2Var2) {
        byte[] bArr2 = new byte[]{aE.a(i, 3)};
        byte[] b = af.g().b(g2.a(fVar.b())).b(i2).a(i3).a(g2.a(bArr)).b().b();
        byte[] a = a(i, b2Var, b2Var2, secretKeySpec, aE.a(new byte[][]{bArr2, b}));
        this.a = aE.a(new byte[][]{bArr2, b, a});
        this.c = fVar;
        this.d = i2;
        this.b = i3;
        this.f = bArr;
        this.e = i;
    }

    public f c() {
        return this.c;
    }

    public byte[] a() {
        return this.a;
    }
}
