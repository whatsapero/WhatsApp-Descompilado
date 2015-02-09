package com.whatsapp;

import com.whatsapp.protocol.b;

class g3 extends fc {
    final GroupChatRecentLocationsActivity a;

    g3(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
    }

    public void a(b bVar, int i) {
        if (bVar != null && bVar.e.c.equals(GroupChatRecentLocationsActivity.g(this.a)) && !bVar.e.b && bVar.j == 5) {
            b a = GroupChatRecentLocationsActivity.a(this.a, bVar.F);
            if (a != null) {
                GroupChatRecentLocationsActivity.d(this.a).remove(a);
            }
            GroupChatRecentLocationsActivity.d(this.a).add(bVar);
            GroupChatRecentLocationsActivity.l(this.a);
            GroupChatRecentLocationsActivity.f(this.a).a();
        }
    }
}
