package com.whatsapp;

import com.whatsapp.protocol.b;
import java.util.Comparator;

class sq implements Comparator {
    final Conversation a;

    public int compare(Object obj, Object obj2) {
        return a((b) obj, (b) obj2);
    }

    sq(Conversation conversation) {
        this.a = conversation;
    }

    public int a(b bVar, b bVar2) {
        if (bVar.D == bVar2.D) {
            return 0;
        }
        return bVar.D < bVar2.D ? -1 : 1;
    }
}
