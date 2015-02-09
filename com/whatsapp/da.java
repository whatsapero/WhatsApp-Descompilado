package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class da implements OnClickListener {
    private static final String z;
    final MultipleContactPicker a;

    static {
        char[] toCharArray = "V`\u000b1".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 60;
                    break;
                case ay.f /*1*/:
                    i2 = 9;
                    break;
                case ay.n /*2*/:
                    i2 = 111;
                    break;
                case ay.p /*3*/:
                    i2 = 66;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        int i = App.az;
        if (!MultipleContactPicker.f(this.a).isEmpty() || MultipleContactPicker.d(this.a)) {
            Intent intent = new Intent();
            StringBuilder stringBuilder = new StringBuilder();
            for (String str : MultipleContactPicker.f(this.a)) {
                if (stringBuilder.length() != 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(str);
                if (i != 0) {
                    break;
                }
            }
            intent.putExtra(z, stringBuilder.toString());
            this.a.setResult(-1, intent);
            this.a.finish();
            if (i == 0) {
                return;
            }
        }
        App.a(this.a.getBaseContext(), String.format(App.aX.a(R.plurals.n_contacts_must_be_selected, 1), new Object[]{Integer.valueOf(1)}), 0);
    }

    da(MultipleContactPicker multipleContactPicker) {
        this.a = multipleContactPicker;
    }
}
