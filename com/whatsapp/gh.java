package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.util.Collection;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class gh extends AsyncTask {
    private static final String z;

    static {
        char[] toCharArray = "e:7V${8yW\u007fp\u007f*W>f66\\mv0,\\9596@mg:*W#qey".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 21;
                    break;
                case ay.f /*1*/:
                    i2 = 95;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 50;
                    break;
                default:
                    i2 = 77;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void a(Collection collection) {
        if (!collection.isEmpty()) {
            App.a((String[]) collection.toArray(new String[collection.size()]));
        }
    }

    protected void onPostExecute(Object obj) {
        a((Collection) obj);
    }

    protected Collection a(Void[] voidArr) {
        Collection m = App.aJ.m();
        Log.i(z + m.size());
        return m;
    }

    gh() {
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
