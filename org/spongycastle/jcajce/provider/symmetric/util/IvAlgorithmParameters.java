package org.spongycastle.jcajce.provider.symmetric.util;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.util.Arrays;
import org.whispersystems.libaxolotl.ay;

public class IvAlgorithmParameters extends BaseAlgorithmParameters {
    private static final String[] z;
    private byte[] iv;

    static {
        int i;
        String[] strArr = new String[7];
        char[] toCharArray = "\u0013'\u0011N'\u0011'ZP)\u0014(\u0017E<\u0003;ZS8\u0003*ZP)\u0015:\u001fDh\u0012&Zi\u001eF9\u001bR)\u000b,\u000eE:\u0015i\u0015B\"\u0003*\u000e\u000e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 102;
                    break;
                case ay.f /*1*/:
                    i2 = 73;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "/\u001fZp)\u0014(\u0017E<\u0003;\t".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 102;
                    break;
                case ay.f /*1*/:
                    i2 = 73;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "/?*A:\u0007$\u001fT-\u0014\u001a\nE+F;\u001fQ=\u000f;\u001fDh\u0012&ZI&\u000f=\u0013A$\u000f:\u001f\u0000)F\u0000,\u00008\u0007;\u001bM-\u0012,\bSh\u0007%\u001dO:\u000f=\u0012Mh\u0016(\bA%\u0003=\u001fR;F&\u0018J-\u0005=".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 102;
                    break;
                case ay.f /*1*/:
                    i2 = 73;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "3'\u0011N'\u0011'ZP)\u0014(\u0017E<\u0003;\t\u0000.\t;\u0017A<F \u0014\u0000\u00010i\nA:\u0007$\u001fT-\u0014:ZO*\f,\u0019T".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 102;
                    break;
                case ay.f /*1*/:
                    i2 = 73;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "4\b-".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 102;
                    break;
                case ay.f /*1*/:
                    i2 = 73;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "4\b-".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 102;
                    break;
                case ay.f /*1*/:
                    i2 = 73;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "'\u001a4\u000ey".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 102;
                    break;
                case ay.f /*1*/:
                    i2 = 73;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[6] = new String(cArr).intern();
        z = strArr;
    }

    protected String engineToString() {
        return z[1];
    }

    protected void engineInit(byte[] bArr, String str) {
        if (str.equals(z[4])) {
            engineInit(bArr);
            return;
        }
        throw new IOException(z[3]);
    }

    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
        if (cls == IvParameterSpec.class) {
            return new IvParameterSpec(this.iv);
        }
        throw new InvalidParameterSpecException(z[0]);
    }

    protected byte[] engineGetEncoded(String str) {
        return str.equals(z[5]) ? Arrays.clone(this.iv) : null;
    }

    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            return;
        }
        throw new InvalidParameterSpecException(z[2]);
    }

    protected byte[] engineGetEncoded() {
        return engineGetEncoded(z[6]);
    }

    protected void engineInit(byte[] bArr) {
        this.iv = Arrays.clone(bArr);
    }
}
