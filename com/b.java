package com;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import com.whatsapp.vk;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class b {
    public static int a;
    private static final byte[] b;
    private static final String[] z;

    static {
        String[] strArr = new String[16];
        String str = "\b^m\u000fM\u0017";
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
                        i3 = 91;
                        break;
                    case ay.f /*1*/:
                        i3 = 27;
                        break;
                    case ay.n /*2*/:
                        i3 = 63;
                        break;
                    case ay.p /*3*/:
                        i3 = 70;
                        break;
                    default:
                        i3 = 12;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\bS~w\\\tUxfb4o\u001f'z:rS'n7~";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\b~\\3~>I^(h4v\u0011!i/RQ5x:u\\#$yHw\u0007=\u000bIq\u0001.r;]'o0~[fn\";H4c5|\u001f\u0016~4mV\"i)!\u001f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\b~\\3~>I^(h4v\u0011\u0015D\u001a*o\u0014B\u001c";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "5~Hf_>xJ4i\tzQ\"c63\u0016fn:xT#h{yFf{)tQ!,\u000biP0e?~M|,";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u000eOyk4{~Q%c?rQ!,5tKf\u007f.kO)~/~[";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u000eOyk4";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "4iXhm+z\\.ius^4a4uFht5~Kh|)tI/h>i\u0011,\u007f(~\u0011\bm/rI#O)bO2c";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "t\u007fZ0#.i^(h4v";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "4iXhm+z\\.ius^4a4uFht5~Kh|)tI/h>i\u0011,\u007f(~\u0011\bm/rI#O)bO2c";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u000euZ>|>xK#h{uJ+n>i\u001f)j{yF2i(;M#m?;Y4c6;s/b.c\u001f\u0016^\u0015\\\u0005f";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    str = "\tZq\u0002S(~Z\"";
                    obj = 11;
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    strArr2 = strArr3;
                    str = "\tZq\u0002S7t^\"S=rS#";
                    obj = 12;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u001dzV*i?;K),(~Z\",\u0014kZ(_\bW\u001f\u0016^\u0015\\";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u001dzV*i?;K),<~Q#~:oZf\u007f>~[";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = g();
                default:
                    strArr2[i] = str;
                    str = "\bS~w\\\tUx";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static String f() {
        try {
            return (String) Build.class.getField(z[0]).get(null);
        } catch (Exception e) {
            return null;
        }
    }

    public static void c() {
        d();
        b();
    }

    private static void d() {
        try {
            if (VERSION.SDK_INT >= 16 && VERSION.SDK_INT <= 18) {
                try {
                    Class.forName(z[10]).getMethod(z[12], new Class[]{byte[].class}).invoke(null, new Object[]{e()});
                    int intValue = ((Integer) Class.forName(z[8]).getMethod(z[13], new Class[]{String.class, Long.TYPE}).invoke(null, new Object[]{z[9], Integer.valueOf(1024)})).intValue();
                    if (intValue != 1024) {
                        throw new IOException(z[11] + intValue);
                    }
                } catch (Exception e) {
                    throw e;
                } catch (Throwable e2) {
                    throw new SecurityException(z[14], e2);
                }
            }
        } catch (Exception e3) {
            throw e3;
        } catch (Exception e32) {
            throw e32;
        }
    }

    private static byte[] g() {
        StringBuilder stringBuilder = new StringBuilder();
        String str = Build.FINGERPRINT;
        if (str != null) {
            try {
                stringBuilder.append(str);
            } catch (UnsupportedEncodingException e) {
                throw e;
            }
        }
        str = f();
        if (str != null) {
            try {
                stringBuilder.append(str);
            } catch (UnsupportedEncodingException e2) {
                throw e2;
            }
        }
        try {
            return stringBuilder.toString().getBytes(z[7]);
        } catch (UnsupportedEncodingException e3) {
            throw new RuntimeException(z[6]);
        }
    }

    static byte[] a() {
        return e();
    }

    private static byte[] e() {
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeLong(System.currentTimeMillis());
            dataOutputStream.writeLong(System.nanoTime());
            dataOutputStream.writeInt(Process.myPid());
            dataOutputStream.writeInt(Process.myUid());
            dataOutputStream.write(b);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable e) {
            throw new SecurityException(z[15], e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b() {
        /*
        r2 = 1;
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NoSuchAlgorithmException -> 0x0008 }
        r1 = 18;
        if (r0 <= r1) goto L_0x000a;
    L_0x0007:
        return;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        r0 = z;
        r1 = 4;
        r0 = r0[r1];
        r0 = java.security.Security.getProviders(r0);
        if (r0 == 0) goto L_0x0027;
    L_0x0015:
        r1 = r0.length;	 Catch:{ NoSuchAlgorithmException -> 0x006b }
        if (r1 < r2) goto L_0x0027;
    L_0x0018:
        r1 = com.a.class;
        r2 = 0;
        r0 = r0[r2];	 Catch:{ NoSuchAlgorithmException -> 0x006d }
        r0 = r0.getClass();	 Catch:{ NoSuchAlgorithmException -> 0x006d }
        r0 = r1.equals(r0);	 Catch:{ NoSuchAlgorithmException -> 0x006d }
        if (r0 != 0) goto L_0x0030;
    L_0x0027:
        r0 = new com.a;	 Catch:{ NoSuchAlgorithmException -> 0x006f }
        r0.<init>();	 Catch:{ NoSuchAlgorithmException -> 0x006f }
        r1 = 1;
        java.security.Security.insertProviderAt(r0, r1);	 Catch:{ NoSuchAlgorithmException -> 0x006f }
    L_0x0030:
        r0 = new java.security.SecureRandom;
        r0.<init>();
        r1 = com.a.class;
        r2 = r0.getProvider();	 Catch:{ NoSuchAlgorithmException -> 0x0069 }
        r2 = r2.getClass();	 Catch:{ NoSuchAlgorithmException -> 0x0069 }
        r1 = r1.equals(r2);	 Catch:{ NoSuchAlgorithmException -> 0x0069 }
        if (r1 != 0) goto L_0x0071;
    L_0x0045:
        r1 = new java.lang.SecurityException;	 Catch:{ NoSuchAlgorithmException -> 0x0069 }
        r2 = new java.lang.StringBuilder;	 Catch:{ NoSuchAlgorithmException -> 0x0069 }
        r2.<init>();	 Catch:{ NoSuchAlgorithmException -> 0x0069 }
        r3 = z;	 Catch:{ NoSuchAlgorithmException -> 0x0069 }
        r4 = 5;
        r3 = r3[r4];	 Catch:{ NoSuchAlgorithmException -> 0x0069 }
        r2 = r2.append(r3);	 Catch:{ NoSuchAlgorithmException -> 0x0069 }
        r0 = r0.getProvider();	 Catch:{ NoSuchAlgorithmException -> 0x0069 }
        r0 = r0.getClass();	 Catch:{ NoSuchAlgorithmException -> 0x0069 }
        r0 = r2.append(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0069 }
        r0 = r0.toString();	 Catch:{ NoSuchAlgorithmException -> 0x0069 }
        r1.<init>(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0069 }
        throw r1;	 Catch:{ NoSuchAlgorithmException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchAlgorithmException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchAlgorithmException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;
    L_0x0071:
        r0 = z;	 Catch:{ NoSuchAlgorithmException -> 0x00b0 }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ NoSuchAlgorithmException -> 0x00b0 }
        r0 = java.security.SecureRandom.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x00b0 }
        r1 = com.a.class;
        r2 = r0.getProvider();	 Catch:{ NoSuchAlgorithmException -> 0x00ae }
        r2 = r2.getClass();	 Catch:{ NoSuchAlgorithmException -> 0x00ae }
        r1 = r1.equals(r2);	 Catch:{ NoSuchAlgorithmException -> 0x00ae }
        if (r1 != 0) goto L_0x0007;
    L_0x008a:
        r1 = new java.lang.SecurityException;	 Catch:{ NoSuchAlgorithmException -> 0x00ae }
        r2 = new java.lang.StringBuilder;	 Catch:{ NoSuchAlgorithmException -> 0x00ae }
        r2.<init>();	 Catch:{ NoSuchAlgorithmException -> 0x00ae }
        r3 = z;	 Catch:{ NoSuchAlgorithmException -> 0x00ae }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ NoSuchAlgorithmException -> 0x00ae }
        r2 = r2.append(r3);	 Catch:{ NoSuchAlgorithmException -> 0x00ae }
        r0 = r0.getProvider();	 Catch:{ NoSuchAlgorithmException -> 0x00ae }
        r0 = r0.getClass();	 Catch:{ NoSuchAlgorithmException -> 0x00ae }
        r0 = r2.append(r0);	 Catch:{ NoSuchAlgorithmException -> 0x00ae }
        r0 = r0.toString();	 Catch:{ NoSuchAlgorithmException -> 0x00ae }
        r1.<init>(r0);	 Catch:{ NoSuchAlgorithmException -> 0x00ae }
        throw r1;	 Catch:{ NoSuchAlgorithmException -> 0x00ae }
    L_0x00ae:
        r0 = move-exception;
        throw r0;
    L_0x00b0:
        r0 = move-exception;
        r1 = new java.lang.SecurityException;
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.b():void");
    }
}
