package android.support.v4.util;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class DebugUtils {
    private static final String z;

    static {
        char[] toCharArray = "'@1v".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 73;
                    break;
                case ay.f /*1*/:
                    i2 = 53;
                    break;
                case ay.n /*2*/:
                    i2 = 93;
                    break;
                case ay.p /*3*/:
                    i2 = 26;
                    break;
                default:
                    i2 = 37;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public static void buildShortClassTag(Object obj, StringBuilder stringBuilder) {
        if (obj == null) {
            stringBuilder.append(z);
            if (LruCache.a == 0) {
                return;
            }
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName == null || simpleName.length() <= 0) {
            simpleName = obj.getClass().getName();
            int lastIndexOf = simpleName.lastIndexOf(46);
            if (lastIndexOf > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
        }
        stringBuilder.append(simpleName);
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
