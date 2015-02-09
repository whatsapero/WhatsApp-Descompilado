package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ji extends AsyncTask {
    private static final String z;
    final GroupChatInfo a;

    static {
        char[] toCharArray = "dQ\u000e4'\\J\u000f'8,V\u0011%6wF\u0005".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 3;
                    break;
                case ay.f /*1*/:
                    i2 = 35;
                    break;
                case ay.n /*2*/:
                    i2 = 97;
                    break;
                case ay.p /*3*/:
                    i2 = 65;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(Void voidR) {
        this.a.setSupportProgressBarIndeterminateVisibility(false);
        Log.i(z);
    }

    public Void a(Void[] voidArr) {
        if (!isCancelled()) {
            b();
        }
        if (!(isCancelled() || App.az())) {
            a();
        }
        return null;
    }

    private void a(ArrayList arrayList) {
        if (!isCancelled()) {
            this.a.runOnUiThread(new io(this, arrayList));
        }
    }

    public void onPostExecute(Object obj) {
        a((Void) obj);
    }

    private void a() {
        ArrayList g = App.aJ.g(GroupChatInfo.b(this.a));
        if (!isCancelled()) {
            this.a.runOnUiThread(new jk(this, g));
        }
    }

    ji(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    static void a(ji jiVar, ArrayList arrayList) {
        jiVar.a(arrayList);
    }

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    private void b() {
        int a = ContactInfo.a(this.a, GroupChatInfo.b(this.a), new a_n(this));
        if (a != 0 && !isCancelled()) {
            this.a.runOnUiThread(new xe(this, a));
        }
    }
}
