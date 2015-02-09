package org.spongycastle.jce.provider;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import org.whispersystems.libaxolotl.ay;

public final class BouncyCastleProvider extends Provider implements ConfigurableProvider {
    private static final String[] DIGESTS;
    private static final String DIGEST_PACKAGE;
    public static final String PROVIDER_NAME;
    private static final String[] SYMMETRIC_CIPHERS;
    private static final String SYMMETRIC_PACKAGE;
    public static int a;
    private static String info;
    private static final String[] z;

    public boolean hasAlgorithm(String str, String str2) {
        boolean z = false;
        int i = a;
        try {
            boolean z2;
            if (!containsKey(str + "." + str2)) {
                if (!containsKey(z[3] + str + "." + str2)) {
                    z2 = false;
                    if (i != 0) {
                        try {
                            if (!BaseKeyGenerator.a) {
                                z = true;
                            }
                            BaseKeyGenerator.a = z;
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                    return z2;
                }
            }
            z2 = true;
            if (i != 0) {
                if (BaseKeyGenerator.a) {
                    z = true;
                }
                BaseKeyGenerator.a = z;
            }
            return z2;
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private void loadAlgorithms(String str, String[] strArr) {
        int i = a;
        int i2 = 0;
        while (i2 != strArr.length) {
            Class cls = null;
            try {
                ClassLoader classLoader = getClass().getClassLoader();
                if (classLoader != null) {
                    cls = classLoader.loadClass(str + strArr[i2] + z[7]);
                } else {
                    cls = Class.forName(str + strArr[i2] + z[6]);
                }
            } catch (ClassNotFoundException e) {
            }
            if (cls != null) {
                try {
                    ((AlgorithmProvider) cls.newInstance()).configure(this);
                } catch (Exception e2) {
                    throw new InternalError(z[8] + str + strArr[i2] + z[9] + e2);
                }
            }
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public void addAlgorithm(String str, String str2) {
        int i = a;
        try {
            if (containsKey(str)) {
                throw new IllegalStateException(z[5] + str + z[4]);
            }
            try {
                put(str, str2);
                if (BaseKeyGenerator.a) {
                    a = i + 1;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void setup() {
        loadAlgorithms(z[1], DIGESTS);
        loadAlgorithms(z[2], SYMMETRIC_CIPHERS);
    }

    public BouncyCastleProvider() {
        super(z[0], 1.51d, info);
        AccessController.doPrivileged(new PrivilegedAction() {
            final BouncyCastleProvider this$0;

            public Object run() {
                BouncyCastleProvider.access$000(this.this$0);
                return null;
            }

            {
                this.this$0 = r1;
            }
        });
    }

    static void access$000(BouncyCastleProvider bouncyCastleProvider) {
        bouncyCastleProvider.setup();
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[10];
        char[] toCharArray = "H\u0017\u000fj]W\n\u0006#WD\u0004\u001b0BBK\u0002'OM\u0006\rj^U\n\u001e-JB\u0017F G@\u0000\u001b0\u0000".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        DIGEST_PACKAGE = new String(cArr).intern();
        toCharArray = "H\u0017\u000fj]W\n\u0006#WD\u0004\u001b0BBK\u0002'OM\u0006\rj^U\n\u001e-JB\u0017F7WJ\b\r0\\N\u0006F".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        SYMMETRIC_PACKAGE = new String(cArr).intern();
        toCharArray = "t&".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        PROVIDER_NAME = new String(cArr).intern();
        toCharArray = "t&".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "H\u0017\u000fj]W\n\u0006#WD\u0004\u001b0BBK\u0002'OM\u0006\rj^U\n\u001e-JB\u0017F G@\u0000\u001b0\u0000".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "H\u0017\u000fj]W\n\u0006#WD\u0004\u001b0BBK\u0002'OM\u0006\rj^U\n\u001e-JB\u0017F7WJ\b\r0\\N\u0006F".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "f\t\u000fjoK\f\t7\u0000".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u000eE\u000e+[I\u0001".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "C\u0010\u0018(GD\u0004\u001c!\u000eW\u0017\u00072GC\u0000\u001adEB\u001cHl".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "\u0003(\t4^N\u000b\u000f7".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "\u0003(\t4^N\u000b\u000f7".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "D\u0004\u0006*ASE\u000b6KF\u0011\rdGI\u0016\u001c%@D\u0000H+H\u0007".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "\u0003(\t4^N\u000b\u000f7\u000e\u001dE".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        z = strArr;
        toCharArray = "e\n\u001d*M^&\t7ZK\u0000H\u0017KD\u0010\u001a-Z^E86AQ\f\f!\\\u0007\u0013Yj\u001b\u0016".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c3 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c3);
        }
        info = new String(cArr).intern();
        strArr = new String[2];
        toCharArray = "f ;".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "f7+p".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        SYMMETRIC_CIPHERS = strArr;
        strArr = new String[4];
        toCharArray = "j!]".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "t-)u".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "t-)v\u001b\u0011".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "t-)q\u001f\u0015".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[3] = new String(cArr).intern();
        DIGESTS = strArr;
    }
}
