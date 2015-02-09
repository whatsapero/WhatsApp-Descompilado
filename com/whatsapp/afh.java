package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class afh implements OnClickListener {
    private static final String z;
    final Conversation a;

    static {
        char[] toCharArray = "V\u0018\\".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 60;
                    break;
                case ay.f /*1*/:
                    i2 = 113;
                    break;
                case ay.n /*2*/:
                    i2 = 56;
                    break;
                case ay.p /*3*/:
                    i2 = 56;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    afh(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        String peerJid = Voip.getPeerJid();
        if (peerJid != null) {
            Intent intent = new Intent(this.a, VoipActivity.class);
            intent.putExtra(z, peerJid);
            this.a.startActivity(intent);
        }
    }
}
