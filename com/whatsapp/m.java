package com.whatsapp;

import android.content.Intent;
import android.os.Parcelable;
import android.provider.MediaStore.Images.Media;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class m implements OnClickListener {
    private static final String[] z;
    final int a;
    final DescribeProblemActivity b;

    static {
        String[] strArr = new String[4];
        String str = "\u0019\u001dNG\u007f\u0012\u0013W\u001ai\n\u0002\r\u0000f\u000e\u0017M\u001d&\u001b\u0011W\u0000g\u0014\\q,E5$f6[9 f,F):l=";
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
                        i3 = 122;
                        break;
                    case ay.f /*1*/:
                        i3 = 114;
                        break;
                    case ay.n /*2*/:
                        i3 = 35;
                        break;
                    case ay.p /*3*/:
                        i3 = 105;
                        break;
                    default:
                        i3 = 8;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u001b\u001cG\u001bg\u0013\u0016\r\u0000f\u000e\u0017M\u001d&\u001f\nW\u001biT;m \\33o6A4&f'\\)";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u001b\u001cG\u001bg\u0013\u0016\r\u0000f\u000e\u0017M\u001d&\u001b\u0011W\u0000g\u0014\\s K1";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0013\u001fB\u000emUX";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        Intent intent = new Intent(z[3], Media.INTERNAL_CONTENT_URI);
        intent.setType(z[1]);
        intent = Intent.createChooser(intent, null);
        if (DescribeProblemActivity.e(this.b)[this.a] != null) {
            intent.putExtra(z[2], new Parcelable[]{new Intent(z[0], null)});
        }
        this.b.startActivityForResult(intent, this.a + 1);
    }

    m(DescribeProblemActivity describeProblemActivity, int i) {
        this.b = describeProblemActivity;
        this.a = i;
    }
}
