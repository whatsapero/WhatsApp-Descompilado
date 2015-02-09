package com.whatsapp;

import java.util.Vector;

class mq extends mz {
    final GroupChatInfo j;

    mq(GroupChatInfo groupChatInfo, String str, String str2, Vector vector, int i) {
        this.j = groupChatInfo;
        super(str, str2, vector, i);
    }

    public void a() {
        super.a();
        GroupChatInfo.m(this.j);
    }
}
