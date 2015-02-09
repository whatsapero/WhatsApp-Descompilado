package com.whatsapp;

import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.model.LatLng;

class a14 implements OnMapClickListener {
    final GroupChatLiveLocationsActivity2 a;

    public void onMapClick(LatLng latLng) {
        GroupChatLiveLocationsActivity2.a(this.a, null);
        GroupChatLiveLocationsActivity2.a(this.a).h();
        GroupChatLiveLocationsActivity2.g(this.a);
    }

    a14(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.a = groupChatLiveLocationsActivity2;
    }
}
