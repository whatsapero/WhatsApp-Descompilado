package com.whatsapp;

import android.text.TextUtils;
import com.actionbarsherlock.R;
import com.whatsapp.util.a5;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class s9 implements Runnable {
    private static final String z;
    final SetStatus a;
    final String b;

    static {
        char[] toCharArray = "Ix3~kh\u007fnhsy%slw".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 9;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 29;
                    break;
                case ay.p /*3*/:
                    i2 = 9;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    s9(SetStatus setStatus, String str) {
        this.a = setStatus;
        this.b = str;
    }

    public void run() {
        if (TextUtils.equals(this.b, App.af() + z)) {
            this.a.o.setText(a5.d(App.as, this.a.getBaseContext()));
            this.a.s.notifyDataSetInvalidated();
            this.a.findViewById(R.id.progressbar_small).setVisibility(8);
            this.a.findViewById(R.id.round_more_btn).setVisibility(0);
            SetStatus.c(this.a).setOnClickListener(new w5(this));
        }
    }
}
