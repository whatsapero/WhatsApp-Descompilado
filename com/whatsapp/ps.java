package com.whatsapp;

import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;
import com.whatsapp.util.f;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ps implements OnClickListener {
    private static final String z;
    final Conversation a;

    static {
        char[] toCharArray = "o1\u0003(lg:".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 2;
                    break;
                case ay.f /*1*/:
                    i2 = 94;
                    break;
                case ay.n /*2*/:
                    i2 = 118;
                    break;
                case ay.p /*3*/:
                    i2 = 70;
                    break;
                default:
                    i2 = 24;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        if (Voip.f()) {
            App.b(this.a, (int) R.string.error_video_messages_disabled_during_call, 0);
            return;
        }
        Conversation.o(this.a).dismiss();
        if (!Environment.getExternalStorageState().equals(z)) {
            this.a.showDialog(15);
            if (App.az == 0) {
                return;
            }
        }
        f.a(4, this.a);
        Conversation.T = false;
    }

    ps(Conversation conversation) {
        this.a = conversation;
    }
}
