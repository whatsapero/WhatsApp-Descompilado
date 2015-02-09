package com.whatsapp;

import android.backport.util.Base64;
import com.whatsapp.protocol.a;
import com.whatsapp.util.Log;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class a8g implements a {
    private static final String[] z;
    SecureRandom a;

    static {
        String[] strArr = new String[14];
        String str = "/\u0003xIA=\u0003!]P~\u00179DH~";
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
                        i3 = 94;
                        break;
                    case ay.f /*1*/:
                        i3 = 113;
                        break;
                    case ay.n /*2*/:
                        i3 = 88;
                        break;
                    case ay.p /*3*/:
                        i3 = 45;
                        break;
                    default:
                        i3 = 36;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u001f4\u000b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u001f4\u000b\u0002g\u001c2w}o\u001d\"o}E:\u00151CC";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "/\u0003xIA=\u0003!]P~\u00195LG~\u001c1^I?\u0005;E\u0004{\u0002x\bW";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "/\u0003xHJ=\u0003!]P~\u0010=^\u00048\u00101A";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "/\u0003xHJ=\u0003!]P~\u00179DH~";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "/\u0003xHJ=\u0003!]P~\u001c9N\u00048\u00101A";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0016\u001c9Nw\u00160j\u0018\u0012";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "/\u0003xEI?\u0012xKE7\u001dx";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0016\u001c9Nw\u00160j\u0018\u0012";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u001f4\u000b";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "/\u0003xLA-Q>LM2Q";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u001f4\u000b\u0002g\u001c2w}o\u001d\"o}E:\u00151CC";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "/\u0003xIA=\u0003!]P~\u001c9N\u00048\u00101A";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public a8g() {
        this.a = new SecureRandom();
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = null;
        if (bArr != null) {
            try {
                Key secretKeySpec = new SecretKeySpec(bArr, z[8]);
                Mac instance = Mac.getInstance(z[10]);
                instance.init(secretKeySpec);
                bArr3 = instance.doFinal(bArr2);
            } catch (Exception e) {
                Log.e(z[9] + e);
            }
        }
        return bArr3;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = null;
        if (!(bArr == null || bArr2 == null || bArr3 == null)) {
            try {
                Key secretKeySpec = new SecretKeySpec(bArr, z[11]);
                Cipher instance = Cipher.getInstance(z[13]);
                instance.init(1, secretKeySpec, new IvParameterSpec(bArr2));
                bArr4 = instance.doFinal(bArr3);
            } catch (Exception e) {
                Log.e(z[12] + e);
            }
        }
        return bArr4;
    }

    public byte[] a(byte[] bArr) {
        byte[] bArr2 = null;
        byte[] bArr3 = a12.a;
        byte[] bArr4 = a12.m;
        if (!(bArr3 == null || bArr4 == null || bArr == null)) {
            try {
                byte[] bArr5 = new byte[16];
                this.a.nextBytes(bArr5);
                bArr3 = a(bArr3, bArr5, bArr);
                if (bArr3 == null) {
                    Log.e(z[5]);
                } else {
                    bArr3 = b(bArr5, bArr3);
                    bArr4 = a(bArr4, bArr3);
                    if (bArr4 == null) {
                        Log.e(z[7]);
                    } else {
                        bArr2 = b(bArr4, bArr3);
                    }
                }
            } catch (Exception e) {
                Log.e(z[6] + e);
            }
        }
        return bArr2;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        Object obj = new Object[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, obj, 0, bArr.length);
        System.arraycopy(bArr2, 0, obj, bArr.length, bArr2.length);
        return obj;
    }

    public byte[] b(byte[] bArr) {
        byte[] bArr2 = null;
        byte[] bArr3 = a12.a;
        byte[] bArr4 = a12.m;
        if (!(bArr3 == null || bArr4 == null || bArr == null)) {
            try {
                Object obj = new Object[32];
                Object obj2 = new Object[(bArr.length - 32)];
                System.arraycopy(bArr, 0, obj, 0, obj.length);
                System.arraycopy(bArr, obj.length, obj2, 0, obj2.length);
                bArr4 = a(bArr4, obj2);
                if (bArr4 == null) {
                    Log.e(z[1]);
                } else if (Arrays.equals(obj, bArr4)) {
                    Object obj3 = new Object[16];
                    obj = new Object[(obj2.length - 16)];
                    System.arraycopy(obj2, 0, obj3, 0, obj3.length);
                    System.arraycopy(obj2, obj3.length, obj, 0, obj.length);
                    Key secretKeySpec = new SecretKeySpec(bArr3, z[2]);
                    Cipher instance = Cipher.getInstance(z[3]);
                    instance.init(2, secretKeySpec, new IvParameterSpec(obj3));
                    bArr2 = instance.doFinal(obj);
                } else {
                    Log.b(z[4], null, new Object[]{Base64.encodeToString(obj, 2), Base64.encodeToString(bArr4, 2)});
                }
            } catch (Exception e) {
                Log.e(z[0] + e);
            }
        }
        return bArr2;
    }
}
