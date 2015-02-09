package com.whatsapp;

import android.view.View;

class h5 implements Runnable {
    final Conversation a;

    public void run() {
        int i = App.az;
        int i2 = 0;
        while (i2 < this.a.bd.getChildCount()) {
            View childAt = this.a.bd.getChildAt(i2);
            if (childAt instanceof ConversationRow) {
                ((ConversationRow) childAt).n();
            }
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    h5(Conversation conversation) {
        this.a = conversation;
    }
}
