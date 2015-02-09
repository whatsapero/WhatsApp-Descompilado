package com.whatsapp;

import android.os.Bundle;
import android.widget.TextView;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class About extends DialogToastActivity {
    private static final String z;

    static {
        char[] toCharArray = "HGJv7OYN".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 122;
                    break;
                case ay.f /*1*/:
                    i2 = 105;
                    break;
                case ay.n /*2*/:
                    i2 = 123;
                    break;
                case ay.p /*3*/:
                    i2 = 71;
                    break;
                default:
                    i2 = 25;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.about);
        ((TextView) findViewById(R.id.version)).setText(getString(R.string.version_prefix) + " " + z);
    }
}
