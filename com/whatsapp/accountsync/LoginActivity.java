package com.whatsapp.accountsync;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.actionbarsherlock.R;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.Main;
import com.whatsapp.a5w;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class LoginActivity extends AccountAuthenticatorActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "^JD\u007f\u0006_GLa*YPJ|0BLtn0_Q_W=AE";
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
                        i3 = 45;
                        break;
                    case ay.f /*1*/:
                        i3 = 34;
                        break;
                    case ay.n /*2*/:
                        i3 = 43;
                        break;
                    case ay.p /*3*/:
                        i3 = 8;
                        break;
                    default:
                        i3 = 89;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "NMF&.EC_{8]R";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "AMLa7LA_a/DVR':_GJ|<";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i = PerformSyncManager.a;
        super.onCreate(bundle);
        setContentView(R.layout.login);
        Log.i(z[1]);
        Account[] accounts = AccountManager.get(this).getAccounts();
        int length = accounts.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            boolean z2;
            if (z[2].contains(accounts[i2].type)) {
                z2 = true;
            } else {
                z2 = z;
            }
            int i3 = i2 + 1;
            if (i != 0) {
                if (DialogToastActivity.i) {
                    z = false;
                } else {
                    z = true;
                }
                DialogToastActivity.i = z;
                z = z2;
                if (z) {
                    Toast.makeText(getApplicationContext(), getString(R.string.account_sync_acct_added), 1).show();
                    finish();
                    if (i == 0) {
                        return;
                    }
                }
                if (App.af() != null) {
                    Intent intent = new Intent(this, Main.class);
                    intent.putExtra(z[0], true);
                    startActivity(intent);
                    finish();
                }
                a5w.a(new d(this, this, null), new Void[0]);
                return;
            }
            i2 = i3;
            z = z2;
        }
        if (z) {
            Toast.makeText(getApplicationContext(), getString(R.string.account_sync_acct_added), 1).show();
            finish();
            if (i == 0) {
                return;
            }
        }
        if (App.af() != null) {
            a5w.a(new d(this, this, null), new Void[0]);
            return;
        }
        Intent intent2 = new Intent(this, Main.class);
        intent2.putExtra(z[0], true);
        startActivity(intent2);
        finish();
    }
}
