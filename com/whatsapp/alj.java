package com.whatsapp;

import android.view.KeyEvent;
import com.whatsapp.util.a5;

class alj implements tf {
    final Conversation a;

    public void a() {
        Conversation.A(this.a).dispatchKeyEvent(new KeyEvent(0, 67));
    }

    alj(Conversation conversation) {
        this.a = conversation;
    }

    public void a(int i) {
        int selectionStart = Conversation.A(this.a).getSelectionStart();
        int selectionEnd = Conversation.A(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            int i2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i2;
        }
        CharSequence stringBuilder = new StringBuilder(Conversation.A(this.a).getText().toString());
        stringBuilder.replace(selectionEnd, selectionStart, a5.f(i));
        Conversation.A(this.a).setText(stringBuilder);
        Conversation.A(this.a).setSelection(selectionEnd + a5.h(i));
    }
}
