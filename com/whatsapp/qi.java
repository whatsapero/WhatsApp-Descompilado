package com.whatsapp;

import android.content.Intent;
import android.os.AsyncTask;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class qi extends AsyncTask {
    private static final String z;

    static {
        char[] toCharArray = "8Xu]\u001b9\\z[\u001b?Rw^\u0006.P6\\\n0XmQ\u00002\u0010zW\u0002,Q|L\n".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 92;
                    break;
                case ay.f /*1*/:
                    i2 = 61;
                    break;
                case ay.n /*2*/:
                    i2 = 25;
                    break;
                case ay.p /*3*/:
                    i2 = 56;
                    break;
                default:
                    i2 = 111;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    protected Void a(Void[] voidArr) {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
        }
        return null;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(Void voidR) {
        App.ah();
        DeleteAccountConfirmation.c();
        App.aJ.g();
        App.b(App.p, (int) R.string.delete_account_done, 1);
        if (DeleteAccountConfirmation.e() != null) {
            DeleteAccountConfirmation.e().removeDialog(1);
            Intent intent = new Intent(DeleteAccountConfirmation.e(), EULA.class);
            intent.addFlags(32768);
            DeleteAccountConfirmation.e().startActivity(intent);
            DeleteAccountConfirmation.e().finish();
        }
        Log.i(z);
    }

    qi() {
    }
}
