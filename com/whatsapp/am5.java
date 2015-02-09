package com.whatsapp;

import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow.OnDismissListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class am5 implements OnDismissListener {
    private static final String z;
    final a11 a;

    static {
        char[] toCharArray = "y!T\u00077O\"A\u0006+\u007f+".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 16;
                    break;
                case ay.f /*1*/:
                    i2 = 79;
                    break;
                case ay.n /*2*/:
                    i2 = 36;
                    break;
                case ay.p /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    am5(a11 com_whatsapp_a11) {
        this.a = com_whatsapp_a11;
    }

    public void onDismiss() {
        ((InputMethodManager) a11.b(this.a).getSystemService(z)).toggleSoftInput(1, 0);
    }
}
