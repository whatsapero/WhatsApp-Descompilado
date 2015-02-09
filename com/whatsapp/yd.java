package com.whatsapp;

import android.view.View;

class yd implements Runnable {
    final String a;
    final Conversation b;

    yd(Conversation conversation, String str) {
        this.b = conversation;
        this.a = str;
    }

    public void run() {
        int i = App.az;
        int i2 = 0;
        while (i2 < this.b.bd.getChildCount()) {
            View childAt = this.b.bd.getChildAt(i2);
            if (childAt instanceof ConversationRow) {
                ((ConversationRow) childAt).a(this.a);
            }
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }
}
