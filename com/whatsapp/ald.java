package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ald implements OnClickListener {
    private static final String[] z;
    final MultipleContactsSelector a;

    static {
        String[] strArr = new String[4];
        String str = "\u0003\u0000gv5\u0004\u0000o";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 112;
                        break;
                    case ay.f /*1*/:
                        i3 = 101;
                        break;
                    case ay.n /*2*/:
                        i3 = 11;
                        break;
                    case ay.p /*3*/:
                        i3 = 19;
                        break;
                    default:
                        i3 = 86;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u001c\ffz\"/\u0012ja8\u0019\u000blL$\u0015\u0016df$\u0013\u0000T`\"\u0002";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0004\f\u007f\u007f3";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u001c\ffz\"";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ald(MultipleContactsSelector multipleContactsSelector) {
        this.a = multipleContactsSelector;
    }

    public void onClick(View view) {
        if (this.a.f() > 0 && this.a.k.size() >= this.a.f()) {
            this.a.f(String.format(this.a.getString(this.a.g()), new Object[]{Integer.valueOf(this.a.f())}));
            if (App.az == 0) {
                return;
            }
        }
        Intent intent = new Intent(this.a, MultipleContactPicker.class);
        intent.putExtra(z[1], this.a.f());
        intent.putExtra(z[2], this.a.g());
        intent.putExtra(z[0], this.a.k());
        intent.putExtra(z[3], this.a.b());
        this.a.startActivityForResult(intent, 1);
    }
}
