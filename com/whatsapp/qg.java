package com.whatsapp;

import android.content.Intent;
import android.view.View;
import com.whatsapp.util.ar;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class qg extends ar {
    private static final String z;
    final ConversationRowContact b;

    static {
        char[] toCharArray = "fu:E2".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 16;
                    break;
                case ay.f /*1*/:
                    i2 = 22;
                    break;
                case ay.n /*2*/:
                    i2 = 91;
                    break;
                case ay.p /*3*/:
                    i2 = 55;
                    break;
                default:
                    i2 = 86;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(View view) {
        Intent intent = new Intent(this.b.getContext(), ViewSharedContactActivity.class);
        intent.putExtra(z, this.b.w.f());
        this.b.getContext().startActivity(intent);
    }

    private qg(ConversationRowContact conversationRowContact) {
        this.b = conversationRowContact;
    }

    qg(ConversationRowContact conversationRowContact, wt wtVar) {
        this(conversationRowContact);
    }
}
