package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ej implements OnClickListener {
    private static final String z;
    final ListChatInfo a;

    static {
        char[] toCharArray = "#^u".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 73;
                    break;
                case ay.f /*1*/:
                    i2 = 55;
                    break;
                case ay.n /*2*/:
                    i2 = 17;
                    break;
                case ay.p /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 110;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ej(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.a, MediaGallery.class);
        intent.putExtra(z, ListChatInfo.d(this.a).e);
        this.a.startActivity(intent);
    }
}
