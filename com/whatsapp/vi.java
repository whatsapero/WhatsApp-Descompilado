package com.whatsapp;

import android.graphics.Canvas;
import com.actionbarsherlock.R;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapView;

class vi extends ItemizedOverlay {
    final GroupChatLiveLocationsActivity a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected com.google.android.maps.OverlayItem createItem(int r9) {
        /*
        r8_this = this;
        r6 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r0 = r8.a;
        r0 = com.whatsapp.GroupChatLiveLocationsActivity.g(r0);
        r0 = r0.i;
        r0 = r0.get(r9);
        r0 = (com.whatsapp.protocol.cn) r0;
        r1 = new com.google.android.maps.GeoPoint;
        r2 = r0.b;
        r2 = r2 * r6;
        r2 = (int) r2;
        r4 = r0.e;
        r4 = r4 * r6;
        r3 = (int) r4;
        r1.<init>(r2, r3);
        r2 = new com.google.android.maps.OverlayItem;
        r3 = "";
        r4 = "";
        r2.<init>(r1, r3, r4);
        r0 = r0.d;
        r4 = 1800000; // 0x1b7740 float:2.522337E-39 double:8.89318E-318;
        r0 = r0 + r4;
        r4 = java.lang.System.currentTimeMillis();
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x004f;
    L_0x0037:
        r0 = com.whatsapp.App.p;
        r0 = r0.getResources();
        r1 = 2130838932; // 0x7f020594 float:1.728286E38 double:1.052774313E-314;
        r0 = r0.getDrawable(r1);
        r0 = boundCenter(r0);
        r2.setMarker(r0);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0063;
    L_0x004f:
        r0 = com.whatsapp.App.p;
        r0 = r0.getResources();
        r1 = 2130838933; // 0x7f020595 float:1.7282862E38 double:1.0527743136E-314;
        r0 = r0.getDrawable(r1);
        r0 = boundCenter(r0);
        r2.setMarker(r0);
    L_0x0063:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.vi.createItem(int):com.google.android.maps.OverlayItem");
    }

    public int size() {
        return GroupChatLiveLocationsActivity.g(this.a).i.size();
    }

    public void draw(Canvas canvas, MapView mapView, boolean z) {
        if (!z) {
            super.draw(canvas, mapView, z);
        }
    }

    public void a() {
        populate();
    }

    public vi(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.a = groupChatLiveLocationsActivity;
        super(boundCenter(App.p.getResources().getDrawable(R.drawable.location_green)));
    }
}
