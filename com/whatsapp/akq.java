package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class akq extends AsyncTask {
    private static final String z;

    static {
        char[] toCharArray = ":\f,\u0006\u000f5\u000f9G\u000e6\u0019/Z\u001b<\u0019/]\u001b/\t/L\tt\u001f3\\\u0014/\\".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 91;
                    break;
                case ay.f /*1*/:
                    i2 = 124;
                    break;
                case ay.n /*2*/:
                    i2 = 92;
                    break;
                case ay.p /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 122;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    akq() {
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected ArrayList a(Void[] voidArr) {
        ArrayList H = App.aJ.H();
        av4.a(App.aJ.G());
        Log.i(z + H.size());
        return H;
    }

    protected void onPostExecute(Object obj) {
        a((ArrayList) obj);
    }

    protected void a(ArrayList arrayList) {
        int i = App.az;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.a == 9) {
                App.l(bVar);
                if (i == 0) {
                    continue;
                    if (i != 0) {
                        break;
                    }
                }
            }
            if (bVar.a == 11) {
                App.i(bVar);
                continue;
            } else {
                continue;
            }
            if (i != 0) {
                break;
            }
        }
        App.R();
    }
}
