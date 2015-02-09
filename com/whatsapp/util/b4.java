package com.whatsapp.util;

import android.os.Build.VERSION;
import java.io.File;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class b4 {
    private static final String[] z;
    private final File a;

    static {
        String[] strArr = new String[11];
        String str = "|hH`\u001a#yYl\u0011s";
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
                        i3 = 83;
                        break;
                    case ay.f /*1*/:
                        i3 = 13;
                        break;
                    case ay.n /*2*/:
                        i3 = 48;
                        break;
                    case ay.p /*3*/:
                        i3 = 3;
                        break;
                    default:
                        i3 = 127;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "|aC#R";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "|aC#\u001b";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "6`@w\u0006skYo\u001asaYp\u000bskBl\u0012siYq\u001a0y_q\u0006s";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "sy_w\u001e?-";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "|kBf\u001a\f~@b\u001c6-";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "|y_w\u001e?RCs\u001e0h\u0010";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "|xCb\u001d?hop\u000f2nU#";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "!b_w_>xCw_1h\u0010b_7dBf\u001c'bBz";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "!b_w_>xCw_=bD#\u001d6-^v\u0013?";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "|aC#\u001b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void a(int i, String str, File file) {
        try {
            new b4(file).a(i, str);
        } catch (Exception e) {
            Log.w(str + z[0] + e);
        }
    }

    private static String a(File file) {
        char[] cArr = new char[]{'-', '-'};
        try {
            if (file.canRead()) {
                cArr[0] = 'r';
            }
            try {
                if (file.canWrite()) {
                    cArr[1] = 'w';
                }
                return new String(cArr);
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    private static long b(int i, String str, File file) {
        int i2 = Log.e;
        String a = a(file);
        if (file.isDirectory()) {
            Log.d(i, str + z[1] + a + ' ' + file.getAbsolutePath());
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                try {
                    throw new IllegalStateException(z[4] + file);
                } catch (NullPointerException e) {
                    throw e;
                }
            }
            int length = listFiles.length;
            long j = 0;
            int i3 = 0;
            while (i3 < length) {
                j += b(i, str, listFiles[i3]);
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
            Log.d(i, str + z[3] + a + ' ' + file.getAbsolutePath() + z[5] + j);
            return j;
        }
        Log.d(i, str + z[2] + a + ' ' + file.getAbsolutePath() + ' ' + file.length());
        return file.length();
    }

    public b4(File file) {
        if (file == null) {
            throw new NullPointerException(z[10]);
        }
        try {
            if (file.isDirectory()) {
                this.a = file;
                return;
            }
            throw new IllegalArgumentException(z[9]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void a(int i, String str) {
        try {
            if (VERSION.SDK_INT >= 9) {
                Log.d(i, str + z[7] + this.a.getTotalSpace());
                Log.d(i, str + z[8] + this.a.getUsableSpace());
                Log.d(i, str + z[6] + this.a.getFreeSpace());
            }
            b(i, str, this.a);
        } catch (NullPointerException e) {
            throw e;
        }
    }
}
