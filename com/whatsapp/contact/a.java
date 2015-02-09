package com.whatsapp.contact;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import com.whatsapp.App;
import com.whatsapp.m8;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a extends AsyncTask {
    private static final String z;
    final SQLiteDatabase a;
    final g b;

    static {
        char[] toCharArray = "[T\\8\u0012BAb8\t_".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 53;
                    break;
                case ay.n /*2*/:
                    i2 = 3;
                    break;
                case ay.p /*3*/:
                    i2 = 91;
                    break;
                default:
                    i2 = 125;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a(g gVar, SQLiteDatabase sQLiteDatabase) {
        this.b = gVar;
        this.a = sQLiteDatabase;
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    protected Void a(Void[] voidArr) {
        int i = ContactProvider.d;
        Cursor query = this.a.query(z, m8.K, null, null, null, null, null);
        if (query != null) {
            do {
                try {
                    if (!query.moveToNext()) {
                        break;
                    }
                    m8 b = m8.b(query);
                    if (!(b.w() || b.b() || b.h == null)) {
                        b.t();
                        App.P.m(b);
                        continue;
                    }
                } catch (Throwable th) {
                    query.close();
                }
            } while (i == 0);
            query.close();
        }
        return null;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(Void voidR) {
        App.a8();
    }
}
