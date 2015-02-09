package com.whatsapp;

import android.view.inputmethod.InputMethodManager;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class bl implements Runnable {
    private static final String z;
    final WebImagePicker a;

    static {
        char[] toCharArray = "D]4Sfr^!RzBW".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 45;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 68;
                    break;
                case ay.p /*3*/:
                    i2 = 38;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    bl(WebImagePicker webImagePicker) {
        this.a = webImagePicker;
    }

    public void run() {
        ((InputMethodManager) this.a.getSystemService(z)).showSoftInput(WebImagePicker.a(this.a), 1);
    }
}
