package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class amd extends AsyncTask {
    private static final String z;
    final ListChatInfo a;

    static {
        char[] toCharArray = "\u00183lmH\u00172~mH\u001d4yv8\u0001*{xc\u0011>".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 116;
                    break;
                case ay.f /*1*/:
                    i2 = 90;
                    break;
                case ay.n /*2*/:
                    i2 = 31;
                    break;
                case ay.p /*3*/:
                    i2 = 25;
                    break;
                default:
                    i2 = 23;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Void a(Void[] voidArr) {
        if (!isCancelled()) {
            a();
        }
        return null;
    }

    public void a(Void voidR) {
        this.a.setSupportProgressBarIndeterminateVisibility(false);
        Log.i(z);
    }

    private void a() {
        int a = ContactInfo.a(this.a, ListChatInfo.d(this.a).e, new jo(this));
        if (a != 0 && !isCancelled()) {
            this.a.runOnUiThread(new zi(this, a));
        }
    }

    public void onPostExecute(Object obj) {
        a((Void) obj);
    }

    private amd(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    amd(ListChatInfo listChatInfo, a1_ com_whatsapp_a1_) {
        this(listChatInfo);
    }
}
