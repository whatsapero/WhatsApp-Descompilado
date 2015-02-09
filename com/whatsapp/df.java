package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class df implements OnClickListener {
    private static final String z;
    final ash a;
    final ContactInfo b;

    static {
        char[] toCharArray = "\u0018CJ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 42;
                    break;
                case ay.n /*2*/:
                    i2 = 46;
                    break;
                case ay.p /*3*/:
                    i2 = 107;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        this.b.startActivity(new Intent(App.p.getApplicationContext(), Conversation.class).putExtra(z, ash.d(this.a)).addFlags(335544320));
    }

    df(ContactInfo contactInfo, ash com_whatsapp_ash) {
        this.b = contactInfo;
        this.a = com_whatsapp_ash;
    }
}
