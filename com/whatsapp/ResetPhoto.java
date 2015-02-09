package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ResetPhoto extends Activity {
    private static final String z;

    static {
        char[] toCharArray = "\u000b/u3R\u00119^".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 98;
                    break;
                case ay.f /*1*/:
                    i2 = 92;
                    break;
                case ay.n /*2*/:
                    i2 = 42;
                    break;
                case ay.p /*3*/:
                    i2 = 65;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent();
        intent.putExtra(z, true);
        setResult(-1, intent);
        finish();
    }
}
