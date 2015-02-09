package com.whatsapp;

import com.whatsapp.util.a5;

class xu implements tf {
    final RegisterName a;

    xu(RegisterName registerName) {
        this.a = registerName;
    }

    public void a(int i) {
        RegisterName.h(this.a).dismiss();
        int selectionStart = RegisterName.a(this.a).getSelectionStart();
        int selectionEnd = RegisterName.a(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            int i2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i2;
        }
        CharSequence stringBuilder = new StringBuilder(RegisterName.a(this.a).getText().toString());
        stringBuilder.replace(selectionEnd, selectionStart, a5.f(i));
        if (stringBuilder.length() <= 25) {
            RegisterName.a(this.a).setText(stringBuilder);
            if (selectionEnd <= RegisterName.a(this.a).length() - a5.h(i)) {
                RegisterName.a(this.a).setSelection(selectionEnd + a5.h(i));
            }
        }
    }

    public void a() {
    }
}
