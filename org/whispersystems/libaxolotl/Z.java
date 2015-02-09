package org.whispersystems.libaxolotl;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;

public class z {
    private static final byte[] a;
    private static final byte[] c;
    public static int e;
    private static final String[] z;
    private final byte[] b;
    private final aZ d;
    private final int f;

    public byte[] a() {
        return this.b;
    }

    public int b() {
        return this.f;
    }

    private byte[] a(byte[] bArr) {
        Object e;
        try {
            Mac instance = Mac.getInstance(z[1]);
            instance.init(new SecretKeySpec(this.b, z[0]));
            return instance.doFinal(bArr);
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            throw new AssertionError(e);
        } catch (InvalidKeyException e3) {
            e = e3;
            throw new AssertionError(e);
        }
    }

    public z(aZ aZVar, byte[] bArr, int i) {
        this.d = aZVar;
        this.b = bArr;
        this.f = i;
    }

    public z c() {
        return new z(this.d, a(a), this.f + 1);
    }

    static {
        String[] strArr = new String[3];
        String str = "F=\u0004\u001cvF\u0011WJ\u0013";
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
                        i4 = 14;
                        break;
                    case ay.f /*1*/:
                        i4 = 80;
                        break;
                    case ay.n /*2*/:
                        i4 = 101;
                        break;
                    case ay.p /*3*/:
                        i4 = 127;
                        break;
                    default:
                        i4 = 37;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "Y8\f\fUk\"(\u001aV}1\u0002\u001ank)\u0016";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = (byte) 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    c = new byte[]{(byte) 1};
                    a = new byte[]{(byte) 2};
                default:
                    strArr2[i2] = str;
                    str = "F=\u0004\u001cvF\u0011WJ\u0013";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public aY d() {
        be beVar = new be(this.d.a(a(c), z[2].getBytes(), 80));
        return new aY(beVar.b(), beVar.c(), beVar.a(), this.f);
    }
}
