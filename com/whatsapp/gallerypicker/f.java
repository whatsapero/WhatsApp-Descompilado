package com.whatsapp.gallerypicker;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.whatsapp.ConversationTextEntry;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class f implements OnEditorActionListener {
    private static final String z;
    final ConversationTextEntry a;
    final s b;

    static {
        char[] toCharArray = "rve)^Dup(Bt|".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 27;
                    break;
                case ay.f /*1*/:
                    i2 = 24;
                    break;
                case ay.n /*2*/:
                    i2 = 21;
                    break;
                case ay.p /*3*/:
                    i2 = 92;
                    break;
                default:
                    i2 = 42;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    f(s sVar, ConversationTextEntry conversationTextEntry) {
        this.b = sVar;
        this.a = conversationTextEntry;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        }
        ((InputMethodManager) this.b.a.getSystemService(z)).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
        return true;
    }
}
