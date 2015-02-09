package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class g6 implements OnClickListener {
    private static final String z;
    final Conversation a;

    static {
        char[] toCharArray = "\u007fbQdAwh\u001beKjx\\xIm\"yYm_X|Y`A_zC|]IjEkJX|XiM".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 30;
                    break;
                case ay.f /*1*/:
                    i2 = 12;
                    break;
                case ay.n /*2*/:
                    i2 = 53;
                    break;
                case ay.p /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    g6(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.startActivity(new Intent(z));
        Conversation.T = false;
        this.a.removeDialog(2);
    }
}
