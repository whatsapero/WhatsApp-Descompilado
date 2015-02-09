package com.whatsapp;

import android.net.wifi.WifiManager;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class asq implements OnClickListener {
    private static final String z;
    final AccountInfoActivity a;

    static {
        char[] toCharArray = "qLc*".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 6;
                    break;
                case ay.f /*1*/:
                    i2 = 37;
                    break;
                case ay.n /*2*/:
                    i2 = 5;
                    break;
                case ay.p /*3*/:
                    i2 = 67;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    asq(AccountInfoActivity accountInfoActivity) {
        this.a = accountInfoActivity;
    }

    public void onClick(View view) {
        int i = App.az;
        if (!AccountInfoActivity.g(this.a)) {
            WifiManager wifiManager = (WifiManager) this.a.getSystemService(z);
            if (wifiManager == null || wifiManager.isWifiEnabled()) {
            }
            if (AccountInfoActivity.m(this.a)) {
                AccountInfoActivity.a(this.a, AccountInfoActivity.l(this.a), new zm(this));
                if (i == 0) {
                    return;
                }
            }
            if (AccountInfoActivity.i(this.a)) {
                AccountInfoActivity.d(this.a);
                if (i == 0) {
                    return;
                }
            }
            this.a.showDialog(8);
        }
    }
}
