package com.whatsapp.util;

import java.util.Map;
import java.util.Map.Entry;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class bp {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "/j1\u0016t{j";
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
                        i3 = 15;
                        break;
                    case ay.f /*1*/:
                        i3 = 74;
                        break;
                    case ay.n /*2*/:
                        i3 = 17;
                        break;
                    case ay.p /*3*/:
                        i3 = 54;
                        break;
                    default:
                        i3 = 21;
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
                    str = "/>xR(";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "|>pBp2";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static String a(Thread thread) {
        StringBuilder stringBuilder = new StringBuilder();
        a(thread, thread.getStackTrace(), stringBuilder);
        return stringBuilder.toString();
    }

    public static String a() {
        int i = Log.e;
        Map allStackTraces = Thread.getAllStackTraces();
        StringBuilder stringBuilder = new StringBuilder("\n");
        for (Entry entry : allStackTraces.entrySet()) {
            a((Thread) entry.getKey(), (StackTraceElement[]) entry.getValue(), stringBuilder);
            if (i != 0) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    private static void a(Thread thread, StackTraceElement[] stackTraceElementArr, StringBuilder stringBuilder) {
        int i = Log.e;
        stringBuilder.append(z[1]).append(thread.getState()).append(z[2]).append(thread.getId()).append('\n');
        stringBuilder.append(Log.f()).append('\n');
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (i2 < length) {
            stringBuilder.append(z[0]).append(stackTraceElementArr[i2].toString()).append('\n');
            i2++;
            if (i != 0) {
                break;
            }
        }
        stringBuilder.append(Log.a()).append('\n');
    }
}
