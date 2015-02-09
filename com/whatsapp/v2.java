package com.whatsapp;

class v2 implements Runnable {
    final ConversationsFragment a;

    public void run() {
        ConversationsFragment.g(this.a);
    }

    v2(ConversationsFragment conversationsFragment) {
        this.a = conversationsFragment;
    }
}
