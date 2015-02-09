package com.whatsapp;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

class a3v implements OnKeyListener {
    final Conversation a;

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (!Conversation.a9 || keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 1) {
            return false;
        }
        Conversation.Z(this.a);
        return true;
    }

    a3v(Conversation conversation) {
        this.a = conversation;
    }
}
