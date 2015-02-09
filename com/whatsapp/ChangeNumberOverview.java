package com.whatsapp;

import android.os.Bundle;
import com.actionbarsherlock.R;
import com.whatsapp.fieldstats.au;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ChangeNumberOverview extends DialogToastActivity {
    private static final String z;

    static {
        char[] toCharArray = "Yn/\u00051_h;\u00064_t!\u001d3Hp'\u000e!\u0015e<\u000e7Nc".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 58;
                    break;
                case ay.f /*1*/:
                    i2 = 6;
                    break;
                case ay.n /*2*/:
                    i2 = 78;
                    break;
                case ay.p /*3*/:
                    i2 = 107;
                    break;
                default:
                    i2 = 86;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void onCreate(Bundle bundle) {
        Log.i(z);
        super.onCreate(bundle);
        ak4.a(au.CHANGE_NUMBER);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        setContentView(R.layout.change_number_overview);
        bp.a(this, getSupportActionBar(), getString(R.string.next).toUpperCase(), new np(this));
    }
}
