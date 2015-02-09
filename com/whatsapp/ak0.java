package com.whatsapp;

class ak0 implements mi {
    final Conversation a;

    public void b() {
        if (Conversation.p(this.a) > 0) {
            Conversation.c(this.a, Conversation.p(this.a) + Conversation.e(this.a).size());
        }
        Conversation.e(this.a).clear();
        Conversation.y(this.a).clear();
        Conversation.m(this.a, true);
    }

    ak0(Conversation conversation) {
        this.a = conversation;
    }

    public void a() {
        this.a.aS.notifyDataSetChanged();
    }
}
