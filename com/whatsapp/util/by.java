package com.whatsapp.util;

import java.io.Writer;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class by extends Writer {
    private static final String z;
    StringBuilder a;

    static {
        char[] toCharArray = "\fKxf\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 64;
                    break;
                case ay.f /*1*/:
                    i2 = 7;
                    break;
                case ay.n /*2*/:
                    i2 = 39;
                    break;
                case ay.p /*3*/:
                    i2 = 34;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void write(char[] cArr, int i, int i2) {
        if (Log.b() >= 4) {
            this.a.append(cArr, i, i2);
        }
    }

    public by() {
        this.a = new StringBuilder();
    }

    public void close() {
        this.a = null;
    }

    public void flush() {
        if (Log.b() >= 4) {
            Log.c(4, Log.a(z, this.a.toString()));
            this.a = new StringBuilder();
        }
    }

    public void write(int i) {
        if (Log.b() >= 4) {
            this.a.append((char) i);
        }
    }

    public void write(String str, int i, int i2) {
        if (Log.b() >= 4) {
            this.a.append(str, i, i2);
        }
    }
}
