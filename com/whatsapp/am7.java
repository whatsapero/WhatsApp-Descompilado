package com.whatsapp;

import android.backport.util.Base64;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class am7 {
    private static final String[] z;

    static {
        String[] strArr = new String[11];
        String str = "&&z8]*(9'Q':d=@=``1F-)o{R%&z";
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
                        i3 = 68;
                        break;
                    case ay.f /*1*/:
                        i3 = 79;
                        break;
                    case ay.n /*2*/:
                        i3 = 22;
                        break;
                    case ay.p /*3*/:
                        i3 = 84;
                        break;
                    default:
                        i3 = 52;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0017\u0007WeC-;~\u0006g\u0005";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "&&z8]*(9'Q':d=@=``1F-)o{Q<,s$@- x";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "&&z8]*(9'Q':d=@=``1F-)o{Q<,s$@- x";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "&&z8]*(9\"Q6&p-\u00194:d7\\%<s{P%;wtQ)?b-";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "&&z8]*(9\"Q6&p-\u00194:d7\\%<s{B!=\u007f2]!+6";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "&&z8]*(9\"Q6&p-\u00194:d7\\%<s{_!661Y4;o";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "&&z8]*(9\"Q6&p-\u00194:d7\\%<s{G-(x5@1=stQ)?b-";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "&&z8]*(9'Q':d=@=`q1Z!=w Qi?c6X-,;?Q=`\u007f:B%#\u007f0\u0019/*oyG4*u=R-,w ]+!";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0016\u001cW";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "&&z8]*(9'Q':d=@=``1F-)o{Q<,s$@- x";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static PublicKey a(String str) {
        try {
            return KeyFactory.getInstance(z[10]).generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes(), 0)));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            Log.e(z[9]);
            throw new IllegalArgumentException(e2);
        }
    }

    public static boolean a(String str, String str2, String str3) {
        try {
            if (TextUtils.isEmpty(str)) {
                Log.e(z[7]);
                return false;
            }
            try {
                if (TextUtils.isEmpty(str2)) {
                    Log.e(z[5]);
                    return false;
                }
                try {
                    if (TextUtils.isEmpty(str3)) {
                        Log.e(z[8]);
                        return false;
                    }
                    boolean a = a(a(str), str2, str3);
                    Log.i(z[6] + a);
                    return a;
                } catch (RuntimeException e) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    private static boolean a(PublicKey publicKey, String str, String str2) {
        try {
            Signature instance = Signature.getInstance(z[2]);
            instance.initVerify(publicKey);
            instance.update(str.getBytes());
            if (instance.verify(Base64.decode(str2, 0))) {
                return true;
            }
            Log.e(z[0]);
            return false;
        } catch (Throwable e) {
            Log.b(z[3], e);
            return false;
        } catch (Throwable e2) {
            Log.b(z[4], e2);
            return false;
        } catch (Throwable e3) {
            Log.b(z[1], e3);
            return false;
        }
    }
}
