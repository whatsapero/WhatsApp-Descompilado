package com.whatsapp;

class t8 implements Runnable {
    final GroupChatInfo a;

    public void run() {
        this.a.c();
    }

    t8(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }
}
