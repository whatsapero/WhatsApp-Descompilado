package com.whatsapp;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class afn implements OnClickListener {
    private static final String z;
    final ConversationRowVoiceNote a;

    static {
        char[] toCharArray = "I^J:\u0003^\u001f@;\u001bDSK5\b\nRA0\u0005K\u001fI1\u001fY^C1L]VP<LDP\u00049\tNVEt\r^KE7\u0004O[".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 42;
                    break;
                case ay.f /*1*/:
                    i2 = 63;
                    break;
                case ay.n /*2*/:
                    i2 = 36;
                    break;
                case ay.p /*3*/:
                    i2 = 84;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    afn(ConversationRowVoiceNote conversationRowVoiceNote) {
        this.a = conversationRowVoiceNote;
    }

    public void onClick(View view) {
        if (this.a.w.t != null) {
            App.a((Activity) this.a.getContext(), this.a.w);
            if (App.az == 0) {
                return;
            }
        }
        Log.e(z);
        App.b(this.a.getContext(), (int) R.string.invalid_media_message_download, 0);
    }
}
