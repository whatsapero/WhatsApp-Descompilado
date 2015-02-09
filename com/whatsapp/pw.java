package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.wifi.WifiManager;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class pw implements OnClickListener {
    private static final String z;
    final AccountInfoActivity a;

    static {
        char[] toCharArray = "2\u007fbw".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 69;
                    break;
                case ay.f /*1*/:
                    i2 = 22;
                    break;
                case ay.n /*2*/:
                    i2 = 4;
                    break;
                case ay.p /*3*/:
                    i2 = 30;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    pw(AccountInfoActivity accountInfoActivity) {
        this.a = accountInfoActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(7);
        switch (i) {
            case -1:
                WifiManager wifiManager = (WifiManager) this.a.getSystemService(z);
                if (wifiManager != null) {
                    wifiManager.setWifiEnabled(false);
                    if (App.az != 0) {
                        break;
                    }
                }
                break;
        }
        AccountInfoActivity.d(this.a);
    }
}
