package com.whatsapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class aka implements Runnable {
    private static final String[] z;
    final boolean a;
    final l7 b;
    final String c;

    static {
        String[] strArr = new String[4];
        String str = "\n\u001cBhv\u0004\u0014TCa>\u0013RS9^";
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
                        i3 = 97;
                        break;
                    case ay.f /*1*/:
                        i3 = 121;
                        break;
                    case ay.n /*2*/:
                        i3 = 59;
                        break;
                    case ay.p /*3*/:
                        i3 = 55;
                        break;
                    default:
                        i3 = 4;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0000\u000bX_m\u0017\u001c_";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0002\u0011ZC[\r\u0010HC";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\f\n\\Dp\u000e\u000b^\u0018e\u0013\u001aS^r\u0004V_^`A\u0017TC$\u0014\t_Vp\u0004Y";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    aka(l7 l7Var, boolean z, String str) {
        this.b = l7Var;
        this.a = z;
        this.c = str;
    }

    public void run() {
        Throwable e;
        synchronized (l7.f(this.b)) {
            try {
                SQLiteDatabase writableDatabase = l7.f(this.b).getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put(z[2], Boolean.valueOf(this.a));
                if (writableDatabase.update(z[3], contentValues, z[0], new String[]{this.c}) == 0) {
                    Log.e(z[1] + this.c);
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
                this.b.L();
                throw new AssertionError(e5);
            }
        }
    }
}
