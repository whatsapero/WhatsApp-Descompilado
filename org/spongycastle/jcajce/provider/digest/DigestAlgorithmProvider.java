package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import org.whispersystems.libaxolotl.ay;

abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    private static final String[] z;

    static {
        int i;
        String[] strArr = new String[7];
        char[] toCharArray = "\r{E>".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 69;
                    break;
                case ay.f /*1*/:
                    i2 = 54;
                    break;
                case ay.n /*2*/:
                    i2 = 4;
                    break;
                case ay.p /*3*/:
                    i2 = 125;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0004ZcSi)_e\u000e\u0006\u000eS}:M+Sv\u001c\\*D*5e\u0004u+".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 69;
                    break;
                case ay.f /*1*/:
                    i2 = 54;
                    break;
                case ay.n /*2*/:
                    i2 = 4;
                    break;
                case ay.p /*3*/:
                    i2 = 125;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u0004ZcSi)_e\u000e\u0006\bWgS`\bwGR".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 69;
                    break;
                case ay.f /*1*/:
                    i2 = 54;
                    break;
                case ay.n /*2*/:
                    i2 = 4;
                    break;
                case ay.p /*3*/:
                    i2 = 125;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\u0004ZcSi)_e\u000e\u0006\u000eS}:M+Sv\u001c\\*D*5e\u0004u)".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 69;
                    break;
                case ay.f /*1*/:
                    i2 = 54;
                    break;
                case ay.n /*2*/:
                    i2 = 4;
                    break;
                case ay.p /*3*/:
                    i2 = 125;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u0004ZcSi)_e\u000e\u0006\bWgS`\bwGP".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 69;
                    break;
                case ay.f /*1*/:
                    i2 = 54;
                    break;
                case ay.n /*2*/:
                    i2 = 4;
                    break;
                case ay.p /*3*/:
                    i2 = 125;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "\bWgS".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 69;
                    break;
                case ay.f /*1*/:
                    i2 = 54;
                    break;
                case ay.n /*2*/:
                    i2 = 4;
                    break;
                case ay.p /*3*/:
                    i2 = 125;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "\u000eS}:M+Sv\u001c\\*D*".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 69;
                    break;
                case ay.f /*1*/:
                    i2 = 54;
                    break;
                case ay.n /*2*/:
                    i2 = 4;
                    break;
                case ay.p /*3*/:
                    i2 = 125;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[6] = new String(cArr).intern();
        z = strArr;
    }

    DigestAlgorithmProvider() {
    }

    protected void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        int i = BCMessageDigest.a;
        String str4 = z[0] + str;
        configurableProvider.addAlgorithm(z[5] + str4, str2);
        configurableProvider.addAlgorithm(z[4] + str, str4);
        configurableProvider.addAlgorithm(z[2] + str, str4);
        configurableProvider.addAlgorithm(z[6] + str4, str3);
        configurableProvider.addAlgorithm(z[3] + str, str4);
        configurableProvider.addAlgorithm(z[1] + str, str4);
        if (BaseKeyGenerator.a) {
            BCMessageDigest.a = i + 1;
        }
    }
}
