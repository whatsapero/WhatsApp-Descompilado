package com.whatsapp;

import android.location.Location;
import com.google.android.maps.GeoPoint;
import com.whatsapp.protocol.cn;

class an extends am {
    final GroupChatLiveLocationsActivity p;
    boolean q;

    public void d() {
        GroupChatLiveLocationsActivity.e(this.p);
        GroupChatLiveLocationsActivity.d(this.p).a();
        if (!(this.q || GroupChatLiveLocationsActivity.g(this.p).i.isEmpty())) {
            this.q = true;
            GroupChatLiveLocationsActivity.h(this.p);
        }
        if (GroupChatLiveLocationsActivity.a(this.p) != null) {
            GroupChatLiveLocationsActivity.c(this.p).getController().animateTo(new GeoPoint((int) (GroupChatLiveLocationsActivity.a(this.p).b * 1000000.0d), (int) (GroupChatLiveLocationsActivity.a(this.p).e * 1000000.0d)));
        }
    }

    an(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.p = groupChatLiveLocationsActivity;
    }

    public Location f() {
        Location location = new Location("");
        GeoPoint myLocation = GroupChatLiveLocationsActivity.b(this.p).getMyLocation();
        if (myLocation != null) {
            location.setLatitude(((double) myLocation.getLatitudeE6()) / 1000000.0d);
            location.setLongitude(((double) myLocation.getLongitudeE6()) / 1000000.0d);
        }
        return location;
    }

    public void a(cn cnVar, boolean z) {
        GroupChatLiveLocationsActivity.a(this.p, cnVar);
        GroupChatLiveLocationsActivity.c(this.p).getController().animateTo(new GeoPoint((int) (cnVar.b * 1000000.0d), (int) (cnVar.e * 1000000.0d)));
        if (z && GroupChatLiveLocationsActivity.c(this.p).getZoomLevel() < 17) {
            GroupChatLiveLocationsActivity.c(this.p).getController().setZoom(17);
        }
        GroupChatLiveLocationsActivity.e(this.p);
    }
}
