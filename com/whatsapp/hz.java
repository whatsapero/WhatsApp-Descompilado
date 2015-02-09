package com.whatsapp;

import android.database.DataSetObserver;

class hz extends DataSetObserver {
    final Conversation a;

    hz(Conversation conversation) {
        this.a = conversation;
    }

    public void onChanged() {
        if (App.aa < 1) {
        }
    }

    public void onInvalidated() {
        Conversation.m(this.a, false);
    }
}
