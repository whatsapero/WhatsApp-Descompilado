package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.maps.GeoPoint;
import com.whatsapp.protocol.cn;
import java.util.ArrayList;

class ask implements OnClickListener {
    final GroupChatLiveLocationsActivity a;
    final ArrayList b;
    final GeoPoint c;

    public void onClick(View view) {
        GroupChatLiveLocationsActivity.g(this.a).a(this.b);
        if (this.b.size() == 1) {
            GroupChatLiveLocationsActivity.a(this.a, (cn) this.b.get(0));
        }
        GroupChatLiveLocationsActivity.c(this.a).getController().animateTo(this.c);
        GroupChatLiveLocationsActivity.e(this.a);
    }

    ask(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, ArrayList arrayList, GeoPoint geoPoint) {
        this.a = groupChatLiveLocationsActivity;
        this.b = arrayList;
        this.c = geoPoint;
    }
}
