package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class at6 implements OnClickListener {
    private static final String[] z;
    final ao a;
    final q b;

    static {
        String[] strArr = new String[3];
        String str = "W7-^aZ,";
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
                        i3 = 52;
                        break;
                    case ay.f /*1*/:
                        i3 = 88;
                        break;
                    case ay.n /*2*/:
                        i3 = 67;
                        break;
                    case ay.p /*3*/:
                        i3 = 42;
                        break;
                    default:
                        i3 = 4;
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
                    str = "@17Fa";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "A*/";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    at6(ao aoVar, q qVar) {
        this.a = aoVar;
        this.b = qVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.a.a, FaqItemActivity.class);
        intent.putExtra(z[2], this.b.b);
        intent.putExtra(z[0], this.b.c);
        intent.putExtra(z[1], this.b.d);
        this.a.a.startActivityForResult(intent, 1);
        this.a.a.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        SearchFAQ.a(this.a.a, this.b.d.substring(this.b.d.lastIndexOf(47) + 1));
    }
}
