package com.whatsapp;

import com.whatsapp.protocol.b;
import java.util.Comparator;

class j4 implements Comparator {
    final GroupChatRecentLocationsActivity a;

    public int compare(Object obj, Object obj2) {
        return a((b) obj, (b) obj2);
    }

    j4(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
    }

    public int a(b bVar, b bVar2) {
        return (int) ((bVar2.K * 1000000.0d) - (bVar.K * 1000000.0d));
    }
}
