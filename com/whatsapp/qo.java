package com.whatsapp;

import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import com.whatsapp.util.ar;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class qo extends ar {
    private static final String z;
    final m8 b;
    final __ c;

    static {
        char[] toCharArray = "\u000bF\u0014".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 47;
                    break;
                case ay.n /*2*/:
                    i2 = 112;
                    break;
                case ay.p /*3*/:
                    i2 = 122;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(View view) {
        Intent intent = new Intent(this.c.c.getActivity(), QuickContactActivity.class);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        rect.left = (int) ((((float) iArr[0]) * 1.0f) + 0.5f);
        rect.top = (int) ((((float) iArr[1]) * 1.0f) + 0.5f);
        rect.right = (int) ((((float) (iArr[0] + view.getWidth())) * 1.0f) + 0.5f);
        rect.bottom = (int) ((((float) (iArr[1] + view.getHeight())) * 1.0f) + 0.5f);
        intent.setSourceBounds(rect);
        intent.putExtra(z, this.b.e);
        this.c.c.startActivity(intent);
    }

    qo(__ __, m8 m8Var) {
        this.c = __;
        this.b = m8Var;
    }
}
