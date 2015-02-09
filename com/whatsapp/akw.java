package com.whatsapp;

import android.content.Intent;
import android.os.Process;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class akw implements OnClickListener {
    private static final String z;
    final l5 a;

    static {
        char[] toCharArray = "\u000b\n\u0007\u0005\u0005\u0003\u0000M\u0004\u000f\u001e\u0010\n\u0019\r\u0019J'6>/;02>>--09".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 106;
                    break;
                case ay.f /*1*/:
                    i2 = 100;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 119;
                    break;
                default:
                    i2 = 106;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    akw(l5 l5Var) {
        this.a = l5Var;
    }

    public void onClick(View view) {
        this.a.c.startActivity(new Intent(z));
        this.a.c.finish();
        Process.killProcess(Process.myPid());
    }
}
