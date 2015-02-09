package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class wn implements OnClickListener {
    final ConversationsFragment a;

    wn(ConversationsFragment conversationsFragment) {
        this.a = conversationsFragment;
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(this.a.getActivity(), ArchivedConversationsActivity.class));
    }
}
