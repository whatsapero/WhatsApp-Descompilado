package com.whatsapp;

import android.content.Context;
import android.location.Location;
import com.google.android.maps.MapView;

class el extends e5 {
    final GroupChatLiveLocationsActivity h;

    public void onLocationChanged(Location location) {
        super.onLocationChanged(location);
    }

    el(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, Context context, MapView mapView) {
        this.h = groupChatLiveLocationsActivity;
        super(context, mapView);
    }
}
