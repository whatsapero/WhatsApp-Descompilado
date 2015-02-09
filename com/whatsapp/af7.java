package com.whatsapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class af7 implements Runnable {
    private static final String[] z;
    final String a;
    final l6 b;
    final l7 c;

    static {
        String[] strArr = new String[7];
        String str = "T\u001c\u0010J\u001c";
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
                        i3 = 53;
                        break;
                    case ay.f /*1*/:
                        i3 = 120;
                        break;
                    case ay.n /*2*/:
                        i3 = 125;
                        break;
                    case ay.p /*3*/:
                        i3 = 35;
                        break;
                    default:
                        i3 = 114;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "R\n\u0012V\u0002j\b\u001cQ\u0006\\\u001b\u0014S\u0013[\f\u000e";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "R\u0012\u0014G";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "E\u001d\u0013G\u001b[\u001f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "R\u0012\u0014GO\nX\u001cM\u0016\u0015\u0012\u0014GO\n";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "_\u0011\u0019";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "R\n\u0012V\u0002j\b\u001cQ\u0006\\\u001b\u0014S\u0013[\f\u000e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    af7(l7 l7Var, String str, l6 l6Var) {
        this.c = l7Var;
        this.a = str;
        this.b = l6Var;
    }

    public void run() {
        int i = 1;
        synchronized (l7.f(this.c)) {
            int i2;
            SQLiteDatabase writableDatabase = l7.f(this.c).getWritableDatabase();
            ContentValues contentValues = new ContentValues(4);
            contentValues.put(z[3], this.a);
            contentValues.put(z[6], this.b.a() ? "" : this.b.d);
            String str = z[0];
            if (this.b.c) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            contentValues.put(str, Integer.valueOf(i2));
            String str2 = z[4];
            if (!this.b.a) {
                i = 0;
            }
            contentValues.put(str2, Integer.valueOf(i));
            if (writableDatabase.update(z[1], contentValues, z[5], new String[]{this.a, this.b.d}) == 0) {
                writableDatabase.insert(z[2], null, contentValues);
            }
        }
    }
}
