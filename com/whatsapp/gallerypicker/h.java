package com.whatsapp.gallerypicker;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class h implements OnClickListener {
    private static final String[] z;
    final ImagePreview a;

    static {
        String[] strArr = new String[5];
        String str = "7IbAw?C(Zv\"BhG63_rAyxtRa]\u0017j";
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
                        i3 = 86;
                        break;
                    case ay.f /*1*/:
                        i3 = 39;
                        break;
                    case ay.n /*2*/:
                        i3 = 6;
                        break;
                    case ay.p /*3*/:
                        i3 = 51;
                        break;
                    default:
                        i3 = 24;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "$HrRl?Hh@";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "5UiCj3Dr@";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "5FvGq9Iu";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "5UiCm$Nu";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    h(ImagePreview imagePreview) {
        this.a = imagePreview;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra(z[0], ImagePreview.q(this.a));
        intent.putExtra(z[2], ImagePreview.j(this.a));
        intent.putExtra(z[1], ImagePreview.c(this.a));
        intent.putExtra(z[3], ImagePreview.w(this.a));
        intent.putExtra(z[4], ImagePreview.b(this.a));
        this.a.setResult(1, intent);
        this.a.finish();
    }
}
