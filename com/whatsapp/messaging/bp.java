package com.whatsapp.messaging;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class bp {
    private static boolean a;
    private static String b;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "E^F+\u001a~XL?\t~SK-\t";
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
                        i3 = 33;
                        break;
                    case ay.f /*1*/:
                        i3 = 59;
                        break;
                    case ay.n /*2*/:
                        i3 = 36;
                        break;
                    case ay.p /*3*/:
                        i3 = 94;
                        break;
                    default:
                        i3 = 125;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "e^F+\u001a\u0001SK-\t\u0001VE']C^\u0004\u0017-W\r\n~)IRW~\u0014R\u001bJ1\t\u0001^\\.\u0011HXM*\u0011X\u001bW+\rQTV*\u0018E\u001bE*]USM-]URI;S";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "tUE<\u0011D\u001bP1]S^W1\u0011W^\u0004:\u0018CNC~\u0015NHP";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static String a(Context context) {
        return a(c(context));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.net.InetSocketAddress b(android.content.Context r8) {
        /*
        r5 = 2;
        r7 = 1;
        r6 = 0;
        r4 = -1;
        r0 = 0;
        r1 = com.whatsapp.App.aa;	 Catch:{ NumberFormatException -> 0x000b }
        r2 = 3;
        if (r1 >= r2) goto L_0x000d;
    L_0x000a:
        return r0;
    L_0x000b:
        r0 = move-exception;
        throw r0;
    L_0x000d:
        r2 = 5222; // 0x1466 float:7.318E-42 double:2.58E-320;
        r1 = c(r8);
        r1 = a(r1);
        if (r1 == 0) goto L_0x000a;
    L_0x0019:
        r3 = 58;
        r3 = r1.indexOf(r3);
        if (r3 == r4) goto L_0x003f;
    L_0x0021:
        r3 = ":";
        r3 = r1.split(r3, r4);
        r4 = r3.length;	 Catch:{ NumberFormatException -> 0x0052 }
        if (r4 == r5) goto L_0x0036;
    L_0x002a:
        r4 = z;	 Catch:{ NumberFormatException -> 0x0052 }
        r5 = 2;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0052 }
        com.whatsapp.util.Log.w(r4);	 Catch:{ NumberFormatException -> 0x0052 }
        r4 = com.whatsapp.messaging.au.a;	 Catch:{ NumberFormatException -> 0x0052 }
        if (r4 == 0) goto L_0x003f;
    L_0x0036:
        r1 = r3[r6];
        r2 = 1;
        r2 = r3[r2];	 Catch:{ NumberFormatException -> 0x0054 }
        r2 = java.lang.Integer.parseInt(r2);	 Catch:{ NumberFormatException -> 0x0054 }
    L_0x003f:
        r3 = com.whatsapp.App.C;	 Catch:{ UnknownHostException -> 0x0059 }
        r0 = r3.b(r1);	 Catch:{ UnknownHostException -> 0x0059 }
        r0 = r0.get(r6);
        r0 = (java.net.InetAddress) r0;
        r1 = new java.net.InetSocketAddress;
        r1.<init>(r0, r2);
        r0 = r1;
        goto L_0x000a;
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r1 = move-exception;
        com.whatsapp.util.Log.b(r1);
        goto L_0x000a;
    L_0x0059:
        r1 = move-exception;
        r2 = z;
        r2 = r2[r7];
        com.whatsapp.util.Log.c(r2, r1);
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.bp.b(android.content.Context):java.net.InetSocketAddress");
    }

    private static File c(Context context) {
        return new File(context.getFilesDir(), z[0]);
    }

    private static synchronized String a(File file) {
        String str;
        synchronized (bp.class) {
            try {
                if (a) {
                    str = b;
                } else {
                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
                        Object readObject = objectInputStream.readObject();
                        objectInputStream.close();
                        b = (String) readObject;
                        a = true;
                        str = b;
                    } catch (FileNotFoundException e) {
                        str = null;
                        return str;
                    } catch (Throwable e2) {
                        Log.b(e2);
                        str = null;
                        return str;
                    } catch (Throwable e22) {
                        Log.b(e22);
                        str = null;
                        return str;
                    } catch (Throwable e222) {
                        Log.b(e222);
                        str = null;
                        return str;
                    }
                }
            } catch (FileNotFoundException e3) {
                throw e3;
            } catch (Throwable th) {
            }
        }
        return str;
    }
}
