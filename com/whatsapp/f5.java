package com.whatsapp;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class f5 implements OnEditorActionListener {
    private static final String z;
    final VideoPreviewActivity a;

    static {
        char[] toCharArray = "[P@TCmSUU_]Z".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 50;
                    break;
                case ay.f /*1*/:
                    i2 = 62;
                    break;
                case ay.n /*2*/:
                    i2 = 48;
                    break;
                case ay.p /*3*/:
                    i2 = 33;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    f5(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        }
        ((InputMethodManager) this.a.getSystemService(z)).hideSoftInputFromWindow(VideoPreviewActivity.l(this.a).getWindowToken(), 0);
        return true;
    }
}
