package com.whatsapp;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.model.Marker;
import com.whatsapp.protocol.cn;
import java.util.ArrayList;

class y5 implements OnMarkerClickListener {
    final GroupChatLiveLocationsActivity2 a;

    y5(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.a = groupChatLiveLocationsActivity2;
    }

    public boolean onMarkerClick(Marker marker) {
        ArrayList arrayList = (ArrayList) GroupChatLiveLocationsActivity2.i(this.a).get(marker);
        GroupChatLiveLocationsActivity2.a(this.a).a(arrayList);
        if (arrayList.size() == 1) {
            GroupChatLiveLocationsActivity2.a(this.a, (cn) arrayList.get(0));
        }
        GroupChatLiveLocationsActivity2.g(this.a);
        GroupChatLiveLocationsActivity2.b(this.a, true);
        GroupChatLiveLocationsActivity2.e(this.a).animateCamera(CameraUpdateFactory.newLatLng(marker.getPosition()));
        return true;
    }
}
