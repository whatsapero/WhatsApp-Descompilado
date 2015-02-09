package com.whatsapp;

import android.app.Activity;

class dq extends dz {
    final Conversation w;

    dq(Conversation conversation, Activity activity, ho hoVar) {
        this.w = conversation;
        super(activity, hoVar);
    }

    public void a() {
        Conversation.Z(this.w);
    }
}
