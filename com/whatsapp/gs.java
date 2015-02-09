package com.whatsapp;

import com.whatsapp.protocol.b;
import java.util.Collection;
import java.util.Map;

class gs extends fc {
    final GroupChatInfo a;

    public void a(b bVar, int i) {
        if (bVar != null && bVar.e.c.equals(GroupChatInfo.b(this.a)) && !bVar.e.b && bVar.j == 5) {
            GroupChatInfo.h(this.a);
        }
    }

    public void b(b bVar, int i) {
        if (bVar != null && bVar.e.c.equals(GroupChatInfo.b(this.a)) && !bVar.e.b) {
            if ((bVar.j == 1 || bVar.j == (byte) 3 || bVar.j == 2) && i == 3) {
                GroupChatInfo.h(this.a);
            }
        }
    }

    gs(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void a(Collection collection, Map map) {
        int i = App.az;
        for (b bVar : collection) {
            if (bVar.e.c.equals(GroupChatInfo.b(this.a)) && (bVar.j == 1 || bVar.j == 3 || bVar.j == 2)) {
                GroupChatInfo.h(this.a);
                if (i == 0) {
                    return;
                }
            }
            if (i != 0) {
                return;
            }
        }
    }
}
