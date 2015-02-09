package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ann implements OnItemClickListener {
    private static final String[] z;
    final CountryPicker a;

    static {
        String[] strArr = new String[3];
        String str = "79K\u000fz&/a\u000fo93";
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
                        i3 = 84;
                        break;
                    case ay.f /*1*/:
                        i3 = 86;
                        break;
                    case ay.n /*2*/:
                        i3 = 62;
                        break;
                    case ay.p /*3*/:
                        i3 = 97;
                        break;
                    default:
                        i3 = 14;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "=%Q";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "75";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ann(CountryPicker countryPicker) {
        this.a = countryPicker;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        try {
            a5g com_whatsapp_a5g = (a5g) adapterView.getItemAtPosition(i);
            Intent intent = new Intent();
            intent.putExtra(z[0], com_whatsapp_a5g.c);
            intent.putExtra(z[1], com_whatsapp_a5g.b);
            intent.putExtra(z[2], com_whatsapp_a5g.d);
            this.a.setResult(-1, intent);
            this.a.finish();
        } catch (IndexOutOfBoundsException e) {
        }
    }
}
