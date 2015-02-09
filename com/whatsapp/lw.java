package com.whatsapp;

import com.whatsapp.protocol.cn;
import java.util.ArrayList;
import java.util.Comparator;

class lw implements Comparator {
    final GroupChatLiveLocationsActivity a;

    public int a(ArrayList arrayList, ArrayList arrayList2) {
        return (int) ((((cn) arrayList2.get(0)).b * 1000000.0d) - (((cn) arrayList.get(0)).b * 1000000.0d));
    }

    public int compare(Object obj, Object obj2) {
        return a((ArrayList) obj, (ArrayList) obj2);
    }

    lw(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.a = groupChatLiveLocationsActivity;
    }
}
