package com.whatsapp;

import com.google.android.gms.maps.GoogleMap.OnCameraChangeListener;
import com.google.android.gms.maps.model.CameraPosition;

class bn implements OnCameraChangeListener {
    final GroupChatLiveLocationsActivity2 a;

    public void onCameraChange(CameraPosition cameraPosition) {
        if (((int) (GroupChatLiveLocationsActivity2.c(this.a) * 5.0f)) != ((int) (cameraPosition.zoom * 5.0f))) {
            GroupChatLiveLocationsActivity2.a(this.a, cameraPosition.zoom);
            GroupChatLiveLocationsActivity2.g(this.a);
        }
    }

    bn(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.a = groupChatLiveLocationsActivity2;
    }
}
