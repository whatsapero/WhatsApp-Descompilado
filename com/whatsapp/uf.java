package com.whatsapp;

import com.whatsapp.util.a5;

class uf implements tf {
    final NewGroup a;

    uf(NewGroup newGroup) {
        this.a = newGroup;
    }

    public void a(int i) {
        NewGroup.d(this.a).dismiss();
        int selectionStart = NewGroup.b(this.a).getSelectionStart();
        int selectionEnd = NewGroup.b(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            int i2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i2;
        }
        CharSequence stringBuilder = new StringBuilder(NewGroup.b(this.a).getText().toString());
        stringBuilder.replace(selectionEnd, selectionStart, a5.f(i));
        if (stringBuilder.codePointCount(0, stringBuilder.length()) <= ge.s) {
            NewGroup.b(this.a).setText(stringBuilder);
            if (selectionEnd <= NewGroup.b(this.a).length() - a5.h(i)) {
                NewGroup.b(this.a).setSelection(selectionEnd + a5.h(i));
            }
        }
    }

    public void a() {
    }
}
