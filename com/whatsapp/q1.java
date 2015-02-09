package com.whatsapp;

import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import com.whatsapp.util.ar;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class q1 extends ar {
    private static final String z;
    final m8 b;
    final m2 c;

    static {
        char[] toCharArray = "=`^".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 87;
                    break;
                case ay.f /*1*/:
                    i2 = 9;
                    break;
                case ay.n /*2*/:
                    i2 = 58;
                    break;
                case ay.p /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(View view) {
        Intent intent = new Intent(this.c.a.getActivity(), QuickContactActivity.class);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        rect.left = (int) ((((float) iArr[0]) * 1.0f) + 0.5f);
        rect.top = (int) ((((float) iArr[1]) * 1.0f) + 0.5f);
        rect.right = (int) ((((float) (iArr[0] + view.getWidth())) * 1.0f) + 0.5f);
        rect.bottom = (int) ((((float) (iArr[1] + view.getHeight())) * 1.0f) + 0.5f);
        intent.setSourceBounds(rect);
        intent.putExtra(z, this.b.e);
        this.c.a.startActivity(intent);
    }

    q1(m2 m2Var, m8 m8Var) {
        this.c = m2Var;
        this.b = m8Var;
    }
}
