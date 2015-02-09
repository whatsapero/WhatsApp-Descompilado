package com.whatsapp;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

class k3 implements OnEditorActionListener {
    final ms a;

    k3(ms msVar) {
        this.a = msVar;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
            return false;
        }
        Conversation.a(this.a.a, true);
        return true;
    }
}
