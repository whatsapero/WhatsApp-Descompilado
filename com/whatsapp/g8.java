package com.whatsapp;

import com.whatsapp.protocol.b;
import java.util.Collection;
import java.util.Map;

class g8 extends fc {
    final ListChatInfo a;

    public void a(Collection collection, Map map) {
        int i = App.az;
        for (b bVar : collection) {
            if (bVar.e.c.equals(ListChatInfo.d(this.a).e) && (bVar.j == 1 || bVar.j == 3 || bVar.j == 2)) {
                ListChatInfo.h(this.a);
                if (i == 0) {
                    return;
                }
            }
            if (i != 0) {
                return;
            }
        }
    }

    g8(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }
}
