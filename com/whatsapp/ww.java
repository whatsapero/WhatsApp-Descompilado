package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ww extends AsyncTask {
    private static final String z;
    final Main a;

    static {
        char[] toCharArray = "J\u0019X\u000eI@\u0017E\u000f'D\fX\u0016\u000fS\u0001".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 120;
                    break;
                case ay.n /*2*/:
                    i2 = 49;
                    break;
                case ay.p /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void a(Void voidR) {
        this.a.removeDialog(104);
        Log.e(z);
        Main.a(this.a);
    }

    protected Void a(Void[] voidArr) {
        int i = App.az;
        int i2 = 0;
        while (bd.e && i2 < 45000) {
            try {
                i2 += 200;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    if (i != 0) {
                        break;
                    }
                }
            } catch (InterruptedException e2) {
                throw e2;
            }
        }
        if (i2 >= 45000) {
            try {
                if (bd.e) {
                    bd.d();
                }
            } catch (InterruptedException e22) {
                throw e22;
            }
        }
        return null;
    }

    public ww(Main main) {
        this.a = main;
    }

    protected void onPreExecute() {
        if (!this.a.isFinishing()) {
            this.a.showDialog(104);
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }
}
