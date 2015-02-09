package org.whispersystems.libaxolotl;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ecc.a;
import org.whispersystems.libaxolotl.ecc.d;
import org.whispersystems.libaxolotl.ecc.f;

public class a1 {
    public static final Object b;
    private static final String[] z;
    private final bs a;
    private final long c;
    private final an d;
    private final bk e;
    private final int f;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] b(int r4, org.whispersystems.libaxolotl.aY r5, byte[] r6) {
        /*
        r3_this = this;
        r0 = 3;
        if (r4 < r0) goto L_0x0014;
    L_0x0003:
        r0 = 1;
        r1 = r5.b();	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r2 = r5.d();	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r0 = r3.a(r0, r1, r2);	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r1 = org.whispersystems.libaxolotl.Z.a;	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        if (r1 == 0) goto L_0x0021;
    L_0x0014:
        r0 = 1;
        r1 = r5.b();	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r2 = r5.c();	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r0 = r3.a(r0, r1, r2);	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
    L_0x0021:
        r0 = r0.doFinal(r6);	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        return r0;
    L_0x0026:
        r0 = move-exception;
    L_0x0027:
        r1 = new java.lang.AssertionError;
        r1.<init>(r0);
        throw r1;
    L_0x002d:
        r0 = move-exception;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.a1.b(int, org.whispersystems.libaxolotl.aY, byte[]):byte[]");
    }

    static {
        String[] strArr = new String[10];
        String str = "L\u0005 EcY\u0012\\$O]!\u0017\u000eIc'";
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
                        i3 = 13;
                        break;
                    case ay.f /*1*/:
                        i3 = 64;
                        break;
                    case ay.n /*2*/:
                        i3 = 115;
                        break;
                    case ay.p /*3*/:
                        i3 = 106;
                        break;
                    default:
                        i3 = 32;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "!`";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "C/S\u001cAa)\u0017JSh3\u0000\u0003Oc3]";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "@%\u0000\u0019Aj%S\u001cE\u007f3\u001a\u0005N-e\u0017F\u0000o5\u0007JSh3\u0000\u0003Oc`\u0005\u000fR~)\u001c\u0004\u0000($";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "X.\u001a\u0004Iy)\u0012\u0006Iw%\u0017JSh3\u0000\u0003Oca";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "L\u0005 EcO\u0003\\:kN\u0013F:Ai$\u001a\u0004G";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "-lS";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "_%\u0010\u000fI{%\u0017JMh3\u0000\u000bGh`\u0004\u0003Te`\u001c\u0006D-#\u001c\u001fNy%\u0001P\u0000";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "B6\u0016\u0018\u0000?pCZ\u0000`%\u0000\u0019Aj%\u0000JIc4\u001cJTe%S\fUy5\u0001\u000f\u0001";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = new Object();
                default:
                    strArr2[i] = str;
                    str = "C/S\u0019E~3\u001a\u0005N-&\u001c\u0018\u001a-";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] a(int r4, org.whispersystems.libaxolotl.aY r5, byte[] r6) {
        /*
        r3_this = this;
        r0 = 3;
        if (r4 < r0) goto L_0x0014;
    L_0x0003:
        r0 = 2;
        r1 = r5.b();	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r2 = r5.d();	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r0 = r3.a(r0, r1, r2);	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r1 = org.whispersystems.libaxolotl.Z.a;	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        if (r1 == 0) goto L_0x0021;
    L_0x0014:
        r0 = 2;
        r1 = r5.b();	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r2 = r5.c();	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r0 = r3.a(r0, r1, r2);	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
    L_0x0021:
        r0 = r0.doFinal(r6);	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        return r0;
    L_0x0026:
        r0 = move-exception;
    L_0x0027:
        r1 = new org.whispersystems.libaxolotl.aJ;
        r1.<init>(r0);
        throw r1;
    L_0x002d:
        r0 = move-exception;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.a1.a(int, org.whispersystems.libaxolotl.aY, byte[]):byte[]");
    }

    public a3 a(byte[] bArr) {
        a3 aAVar;
        int i = Z.a;
        synchronized (b) {
            ag a = this.a.a(this.c, this.f);
            bn a2 = a.a();
            z o = a2.o();
            aY d = o.d();
            f g = a2.g();
            int p = a2.p();
            int b = a2.b();
            aAVar = new aA(b, d.a(), g, o.b(), p, b(b, d, bArr), a2.i(), a2.d());
            if (a2.c()) {
                aL n = a2.n();
                aAVar = new av(b, a2.a(), n.c(), n.a(), n.b(), a2.i(), (aA) aAVar);
            }
            a2.a(o.c());
            this.a.a(this.c, this.f, a);
        }
        if (bD.m) {
            Z.a = i + 1;
        }
        return aAVar;
    }

    private aY a(bn bnVar, f fVar, z zVar, int i) {
        int i2 = Z.a;
        if (zVar.b() > i) {
            if (bnVar.a(fVar, i)) {
                return bnVar.b(fVar, i);
            }
            throw new a2(z[8] + zVar.b() + z[7] + i);
        } else if (zVar.b() - i > 2000) {
            throw new aJ(z[9]);
        } else {
            while (zVar.b() < i) {
                bnVar.a(fVar, zVar.d());
                zVar = zVar.c();
                if (i2 != 0) {
                    break;
                }
            }
            bnVar.b(fVar, zVar.c());
            return zVar.d();
        }
    }

    private byte[] a(bn bnVar, aA aAVar) {
        if (!bnVar.l()) {
            throw new aJ(z[5]);
        } else if (aAVar.e() != bnVar.b()) {
            throw new aJ(String.format(z[4], new Object[]{Integer.valueOf(aAVar.e()), Integer.valueOf(bnVar.b())}));
        } else {
            int e = aAVar.e();
            f c = aAVar.c();
            aY a = a(bnVar, c, a(bnVar, c), aAVar.d());
            aAVar.a(e, bnVar.d(), bnVar.i(), a.a());
            byte[] a2 = a(e, a, aAVar.b());
            bnVar.j();
            return a2;
        }
    }

    public byte[] a(av avVar, ax axVar) {
        byte[] a;
        synchronized (b) {
            ag a2 = this.a.a(this.c, this.f);
            aK c = this.d.c(a2, avVar);
            a = a(a2, avVar.b());
            axVar.a(a);
            this.a.a(this.c, this.f, a2);
            if (c.b()) {
                this.e.b(((Integer) c.c()).intValue());
            }
        }
        return a;
    }

    private z a(bn bnVar, f fVar) {
        try {
            if (bnVar.b(fVar)) {
                return bnVar.a(fVar);
            }
            am a = bnVar.m().a(fVar, bnVar.f());
            a a2 = d.a();
            am a3 = ((aX) a.a()).a(fVar, a2);
            bnVar.a((aX) a3.a());
            bnVar.a(fVar, (z) a.b());
            bnVar.b(Math.max(bnVar.o().b() - 1, 0));
            bnVar.a(a2, (z) a3.b());
            return (z) a.b();
        } catch (Throwable e) {
            throw new aJ(e);
        }
    }

    public byte[] a(aA aAVar, ax axVar) {
        byte[] a;
        synchronized (b) {
            if (this.a.b(this.c, this.f)) {
                ag a2 = this.a.a(this.c, this.f);
                a = a(a2, aAVar);
                axVar.a(a);
                this.a.a(this.c, this.f, a2);
            } else {
                throw new b3(z[1] + this.c + z[2] + this.f);
            }
        }
        return a;
    }

    public a1(bs bsVar, bk bkVar, u uVar, aB aBVar, long j, int i) {
        this.a = bsVar;
        this.c = j;
        this.f = i;
        this.e = bkVar;
        this.d = new an(bsVar, bkVar, uVar, aBVar, j, i);
    }

    private byte[] a(ag agVar, aA aAVar) {
        Iterator it;
        List linkedList;
        byte[] a;
        synchronized (b) {
            bn bnVar;
            try {
                it = agVar.d().iterator();
                linkedList = new LinkedList();
                bnVar = new bn(agVar.a());
                a = a(bnVar, aAVar);
                agVar.a(bnVar);
            } catch (aJ e) {
                linkedList.add(e);
                do {
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        bnVar = new bn((bn) it.next());
                        a = a(bnVar, aAVar);
                        it.remove();
                        agVar.b(bnVar);
                    } catch (aJ e2) {
                        linkedList.add(e2);
                        if (Z.a != 0) {
                            throw new aJ(z[3], linkedList);
                        }
                    }
                } while (Z.a != 0);
                throw new aJ(z[3], linkedList);
            } catch (Throwable th) {
            }
        }
        return a;
    }

    private Cipher a(int i, SecretKeySpec secretKeySpec, int i2) {
        Object e;
        try {
            Cipher instance = Cipher.getInstance(z[0]);
            byte[] bArr = new byte[16];
            aE.a(bArr, 0, i2);
            instance.init(i, secretKeySpec, new IvParameterSpec(bArr));
            return instance;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            throw new AssertionError(e);
        } catch (NoSuchPaddingException e3) {
            e = e3;
            throw new AssertionError(e);
        } catch (InvalidKeyException e4) {
            e = e4;
            throw new AssertionError(e);
        } catch (InvalidAlgorithmParameterException e5) {
            e = e5;
            throw new AssertionError(e);
        }
    }

    private Cipher a(int i, SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec) {
        Object e;
        try {
            Cipher instance = Cipher.getInstance(z[6]);
            instance.init(i, secretKeySpec, ivParameterSpec);
            return instance;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            throw new AssertionError(e);
        } catch (NoSuchPaddingException e3) {
            e = e3;
            throw new AssertionError(e);
        } catch (InvalidKeyException e4) {
            e = e4;
            throw new AssertionError(e);
        } catch (InvalidAlgorithmParameterException e5) {
            e = e5;
            throw new AssertionError(e);
        }
    }
}
