package com.whatsapp;

import android.content.Intent;
import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.util.ar;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class qb extends ar {
    private static final String[] z;
    final RegisterPhone b;

    static {
        String[] strArr = new String[4];
        String str = "m\u0003y";
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
                        i3 = 77;
                        break;
                    case ay.f /*1*/:
                        i3 = 115;
                        break;
                    case ay.n /*2*/:
                        i3 = 68;
                        break;
                    case ay.p /*3*/:
                        i3 = 44;
                        break;
                    default:
                        i3 = 85;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "?\u0016#E&9\u00166\u0003%%\u001c*Iz.\u001c1B!?\n4E6&\u00166\u00036!\u001a'G0)S*\u0011";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "m\u0003y";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "?\u0016#E&9\u00166\u0003%%\u001c*Iz.\u001c1B!?\n4E6&\u00166\u00036!\u001a'G0)\\ E4!\u001c#\u0001#$\u0000-N9(\\7G<=S*\u0011";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(View view) {
        Log.i(z[2] + RegisterPhone.h(this.b) + z[0] + this.b.y);
        if (RegisterPhone.h(this.b) == null && this.b.y == null) {
            Intent intent = new Intent(this.b, CountryPicker.class);
            intent.putExtra(CountryPicker.f, this.b.r.f.getText().toString());
            this.b.startActivityForResult(intent, 0);
            this.b.r.e.removeTextChangedListener(this.b.r.g);
            RegisterPhone.a(this.b, true);
            if (App.az == 0) {
                return;
            }
        }
        Log.i(z[1] + RegisterPhone.h(this.b) + z[3] + this.b.y);
    }

    qb(RegisterPhone registerPhone) {
        this.b = registerPhone;
    }
}
