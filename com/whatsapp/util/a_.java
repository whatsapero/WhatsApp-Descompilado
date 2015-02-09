package com.whatsapp.util;

import java.io.RandomAccessFile;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class a_ extends af {
    private static final String z;
    String d;
    String e;
    String f;
    String g;
    int h;

    static {
        char[] toCharArray = "c[\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 67;
                    break;
                case ay.f /*1*/:
                    i2 = 118;
                    break;
                case ay.n /*2*/:
                    i2 = 50;
                    break;
                case ay.p /*3*/:
                    i2 = 15;
                    break;
                default:
                    i2 = 7;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public a_(long j, String str, RandomAccessFile randomAccessFile) {
        super(j, str, randomAccessFile);
        this.h = r.b(randomAccessFile);
        r.e(randomAccessFile);
        this.e = r.a(randomAccessFile, 4);
        this.d = r.a(randomAccessFile, 4);
        this.f = r.a(randomAccessFile, 4);
        r.a(randomAccessFile);
        r.a(randomAccessFile);
        int b = r.b(randomAccessFile);
        if (((long) b) != j - 33) {
            b = ((int) j) - 33;
            randomAccessFile.seek(randomAccessFile.getFilePointer() - 1);
        }
        byte[] bArr = new byte[b];
        randomAccessFile.read(bArr, 0, b);
        this.g = new String(bArr);
    }

    public String toString() {
        return super.toString() + "[" + this.e + "/" + this.d + z + this.g + "]";
    }
}
