package com.whatsapp;

import android.app.Activity;
import android.view.View;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import com.whatsapp.util.ar;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class qw extends ar {
    private static final String z;
    final ConversationRowMedia b;

    static {
        char[] toCharArray = "$Q8wj3\u00102vr)\\9xag]3}l&\u0010;|v4Q1|%0Y\"q%)_vt`#Y79d3D7zm\"T".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 71;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 86;
                    break;
                case ay.p /*3*/:
                    i2 = 25;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(View view) {
        if (this.b.w.t != null) {
            App.a((Activity) this.b.getContext(), this.b.w);
            if (App.az == 0) {
                return;
            }
        }
        Log.e(z);
        App.b(this.b.getContext(), (int) R.string.invalid_media_message_download, 0);
    }

    qw(ConversationRowMedia conversationRowMedia) {
        this.b = conversationRowMedia;
    }
}
