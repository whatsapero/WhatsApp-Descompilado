package com.whatsapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class et implements Runnable {
    private static final String[] z;
    final String a;
    final long b;
    final l7 c;
    final sf d;

    static {
        String[] strArr = new String[5];
        String str = "\u001a)\naD\u0015(\u0018a";
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
                        i3 = 121;
                        break;
                    case ay.f /*1*/:
                        i3 = 65;
                        break;
                    case ay.n /*2*/:
                        i3 = 107;
                        break;
                    case ay.p /*3*/:
                        i3 = 21;
                        break;
                    default:
                        i3 = 27;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0015 \u0018aD\u000b$\nqD\u000b$\bpr\t54f~\u001754x~\n2\nr~&5\nww\u001c\u001e\u0002q";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u001a)\naD\u0015(\u0018a";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0012$\u0012Ji\u001c,\u0004a~&+\u0002q&F";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0012$\u0012Ji\u001c,\u0004a~&+\u0002q";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        Throwable e;
        synchronized (l7.f(this.c)) {
            try {
                SQLiteDatabase writableDatabase = l7.f(this.c).getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put(z[2], Long.valueOf(this.b));
                if (writableDatabase.update(z[3], contentValues, z[4], new String[]{this.a}) == 0) {
                    contentValues.put(z[1], this.a);
                    writableDatabase.insert(z[0], null, contentValues);
                }
                sf.e(this.d, this.b);
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
                this.c.L();
                throw new AssertionError(e5);
            }
        }
    }

    et(l7 l7Var, long j, String str, sf sfVar) {
        this.c = l7Var;
        this.b = j;
        this.a = str;
        this.d = sfVar;
    }
}
