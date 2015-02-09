package com.whatsapp;

import com.whatsapp.util.a5;

class sw implements tf {
    final kc a;

    public void a() {
    }

    public void a(int i) {
        kc.a(this.a).dismiss();
        int selectionStart = kc.e(this.a).getSelectionStart();
        int selectionEnd = kc.e(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            int i2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i2;
        }
        CharSequence stringBuilder = new StringBuilder(kc.e(this.a).getText().toString());
        stringBuilder.replace(selectionEnd, selectionStart, a5.f(i));
        selectionStart = stringBuilder.codePointCount(0, stringBuilder.length());
        if (kc.h(this.a) <= 0 || selectionStart <= kc.h(this.a)) {
            kc.e(this.a).setText(stringBuilder);
            selectionStart = a5.h(i);
            if (selectionEnd <= kc.e(this.a).length() - selectionStart) {
                kc.e(this.a).setSelection(selectionStart + selectionEnd);
            }
        }
    }

    sw(kc kcVar) {
        this.a = kcVar;
    }
}
