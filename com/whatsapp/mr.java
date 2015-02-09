package com.whatsapp;

import java.util.Vector;

class mr extends mz {
    final GroupChatInfo j;

    mr(GroupChatInfo groupChatInfo, String str, String str2, Vector vector, int i) {
        this.j = groupChatInfo;
        super(str, str2, vector, i);
    }

    public void a() {
        GroupChatInfo.m(this.j);
    }
}
