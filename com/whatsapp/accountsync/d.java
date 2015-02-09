package com.whatsapp.accountsync;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class d extends AsyncTask {
    private static final String[] z;
    final LoginActivity a;
    final ProgressDialog b;

    static {
        String[] strArr = new String[4];
        String str = "\b\n\u0016\u001e\u0019\n\u001c\r\u00036\u001d";
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
                        i3 = 105;
                        break;
                    case ay.f /*1*/:
                        i3 = 127;
                        break;
                    case ay.n /*2*/:
                        i3 = 98;
                        break;
                    case ay.p /*3*/:
                        i3 = 118;
                        break;
                    default:
                        i3 = 88;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\b\u001c\u0001\u0019-\u0007\u000b6\u000f(\f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\n\u0010\u000fX/\u0001\u001e\u0016\u00059\u0019\u000f";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0005\u0010\u0005\u001f6\b\u001c\u0016\u001f.\u0000\u000b\u001bY<\u00066\f49\n\u0014\u0005\u00047\u001c\u0011\u0006";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    public Boolean a(Void[] voidArr) {
        try {
            Thread.sleep(2000);
        } catch (Throwable e) {
            Log.b(z[1], e);
        }
        Account account = new Account(this.a.getString(R.string.app_name), z[3]);
        if (!AccountManager.get(this.a).addAccountExplicitly(account, null, null)) {
            return Boolean.valueOf(false);
        }
        Bundle bundle = new Bundle();
        bundle.putString(z[0], account.name);
        bundle.putString(z[2], account.type);
        this.a.setAccountAuthenticatorResult(bundle);
        return Boolean.valueOf(true);
    }

    public void a(Boolean bool) {
        this.b.dismiss();
        if (bool.booleanValue()) {
            this.a.finish();
        }
    }

    public void onPostExecute(Object obj) {
        a((Boolean) obj);
    }

    private d(LoginActivity loginActivity, Context context) {
        this.a = loginActivity;
        this.b = ProgressDialog.show(context, "", loginActivity.getString(R.string.account_sync_authenticating), true, false);
        this.b.setCancelable(true);
    }

    d(LoginActivity loginActivity, Context context, f fVar) {
        this(loginActivity, context);
    }
}
