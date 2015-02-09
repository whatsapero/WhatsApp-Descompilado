package com.whatsapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class nu implements OnClickListener {
    private static final String[] z;
    final ContactInfo a;
    final ash b;

    static {
        String[] strArr = new String[3];
        String str = "Fw;+";
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
                        i3 = 50;
                        break;
                    case ay.f /*1*/:
                        i3 = 18;
                        break;
                    case ay.n /*2*/:
                        i3 = 87;
                        break;
                    case ay.p /*3*/:
                        i3 = 17;
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
                    i = 2;
                    strArr2 = strArr3;
                    str = "S|3c:[vyx;Fw9e{Sq#x:\\<\u0013X\u0014~";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "Q}9e4Qf\bx;T}xu<S~wu<S~2cuSb'1;]fww:G|3";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        try {
            if (ash.a(this.b) != null) {
                App.b(ash.a(this.b), this.a);
                if (App.az == 0) {
                    return;
                }
            }
            try {
                this.a.startActivity(new Intent(z[2], Uri.parse(z[0] + ash.c(this.b))));
            } catch (ActivityNotFoundException e) {
                Log.w(z[1]);
                App.X();
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    nu(ContactInfo contactInfo, ash com_whatsapp_ash) {
        this.a = contactInfo;
        this.b = com_whatsapp_ash;
    }
}
