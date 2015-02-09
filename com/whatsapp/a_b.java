package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a_b implements OnClickListener {
    private static final String z;
    final ContactPicker a;

    static {
        char[] toCharArray = "Q,<J\rQ7".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 50;
                    break;
                case ay.f /*1*/:
                    i2 = 67;
                    break;
                case ay.n /*2*/:
                    i2 = 82;
                    break;
                case ay.p /*3*/:
                    i2 = 62;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.putExtra(z, ContactPicker.l(this.a).e);
        this.a.setResult(-1, intent);
        this.a.removeDialog(0);
        this.a.finish();
    }

    a_b(ContactPicker contactPicker) {
        this.a = contactPicker;
    }
}
