package com.whatsapp.gallerypicker;

import android.net.Uri;
import android.view.KeyEvent;
import android.widget.EditText;
import com.whatsapp.tf;
import com.whatsapp.util.a5;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class x implements tf {
    private static final String z;
    final ImagePreview a;

    static {
        char[] toCharArray = "\u000e\u0005\u0011z".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 107;
                    break;
                case ay.f /*1*/:
                    i2 = 97;
                    break;
                case ay.n /*2*/:
                    i2 = 120;
                    break;
                case ay.p /*3*/:
                    i2 = 14;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a() {
        EditText a = a();
        if (a != null) {
            a.dispatchKeyEvent(new KeyEvent(0, 67));
        }
    }

    public void a(int i) {
        EditText a = a();
        if (a != null) {
            int selectionStart = a.getSelectionStart();
            int selectionEnd = a.getSelectionEnd();
            if (selectionStart <= selectionEnd) {
                int i2 = selectionEnd;
                selectionEnd = selectionStart;
                selectionStart = i2;
            }
            CharSequence stringBuilder = new StringBuilder(a.getText().toString());
            stringBuilder.replace(selectionEnd, selectionStart, a5.f(i));
            if (stringBuilder.codePointCount(0, stringBuilder.length()) <= 160) {
                a.setText(stringBuilder);
                a.setSelection(a5.h(i) + selectionEnd);
            } else {
                return;
            }
        }
        ImagePreview.u(this.a).dismiss();
    }

    private EditText a() {
        if (ImagePreview.a(this.a) < 0) {
            return null;
        }
        return (EditText) ImagePreview.l(this.a).findViewWithTag(((Uri) ImagePreview.q(this.a).get(ImagePreview.a(this.a))).toString() + z);
    }

    x(ImagePreview imagePreview) {
        this.a = imagePreview;
    }
}
