package com.whatsapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class c2 implements Runnable {
    private static final String[] z;
    final l7 a;
    final long b;
    final String c;

    static {
        String[] strArr = new String[5];
        String str = "`A/5@~E=%@aE/2~kE\u00035~nL9\u001evh";
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
                        i3 = 12;
                        break;
                    case ay.f /*1*/:
                        i3 = 32;
                        break;
                    case ay.n /*2*/:
                        i3 = 92;
                        break;
                    case ay.p /*3*/:
                        i3 = 65;
                        break;
                    default:
                        i3 = 31;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "oH=5@`I/5";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "gE%\u001emiM35zSJ5%\"3";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "oH=5@`I/5";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "gE%\u001emiM35zSJ5%";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    c2(l7 l7Var, String str, long j) {
        this.a = l7Var;
        this.c = str;
        this.b = j;
    }

    public void run() {
        Throwable e;
        synchronized (l7.f(this.a)) {
            try {
                sf sfVar = (sf) l7.e(this.a).get(this.c);
                if (sfVar != null) {
                    SQLiteDatabase writableDatabase = l7.f(this.a).getWritableDatabase();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(z[0], Long.valueOf(this.b));
                    if (writableDatabase.update(z[4], contentValues, z[3], new String[]{this.c}) == 0) {
                        contentValues.put(z[1], this.c);
                        writableDatabase.insert(z[2], null, contentValues);
                    }
                    sf.a(sfVar, this.b);
                }
            } catch (SQLiteDatabaseCorruptException e2) {
                throw e2;
            } catch (RuntimeException e3) {
                e = e3;
                Log.c(e);
                throw e;
            } catch (Error e4) {
                e = e4;
                Log.c(e);
                throw e;
            } catch (Throwable e5) {
                Log.c(e5);
                this.a.L();
                throw new AssertionError(e5);
            }
        }
        l7.j(this.a).b(this.c);
    }
}
