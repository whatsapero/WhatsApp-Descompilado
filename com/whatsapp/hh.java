package com.whatsapp;

class hh extends h2 {
    final an0 e;

    hh(an0 com_whatsapp_an0, String str, long j) {
        this.e = com_whatsapp_an0;
        super(str, j);
    }

    public void a(int i) {
        super.a(i);
        GroupChatInfo.j(this.e.a);
    }

    public void run() {
        super.run();
        lh.b.a(GroupChatInfo.b(this.e.a), 0);
        GroupChatInfo.j(this.e.a);
    }

    public void a() {
        super.a();
        GroupChatInfo.j(this.e.a);
    }
}
