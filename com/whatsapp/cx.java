package com.whatsapp;

import com.whatsapp.protocol.b;
import java.util.ArrayList;
import java.util.Comparator;

class cx implements Comparator {
    final GroupChatRecentLocationsActivity a;

    public int a(ArrayList arrayList, ArrayList arrayList2) {
        return (int) ((((b) arrayList2.get(0)).K * 1000000.0d) - (((b) arrayList.get(0)).K * 1000000.0d));
    }

    cx(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
    }

    public int compare(Object obj, Object obj2) {
        return a((ArrayList) obj, (ArrayList) obj2);
    }
}
