package com.whatsapp;

import android.preference.Preference;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class mt implements Runnable {
    private static final String z;
    final zk a;

    static {
        char[] toCharArray = "`h!HGbi#dR\u007fx.REhD'W_Rx.ZG~".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 13;
                    break;
                case ay.f /*1*/:
                    i2 = 27;
                    break;
                case ay.n /*2*/:
                    i2 = 70;
                    break;
                case ay.p /*3*/:
                    i2 = 59;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    mt(zk zkVar) {
        this.a = zkVar;
    }

    public void run() {
        this.a.a.b.removeDialog(6);
        Preference findPreference = this.a.a.b.findPreference(z);
        int i = (v.d() > 0 || v.a() == 0) ? R.string.archive_all_chats : R.string.unarchive_all_chats;
        findPreference.setTitle(i);
    }
}
