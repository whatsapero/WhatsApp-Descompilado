package com.whatsapp;

import android.graphics.Canvas;
import com.actionbarsherlock.R;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapView;
import com.google.android.maps.OverlayItem;

class as4 extends ItemizedOverlay {
    final LocationPicker a;

    public int size() {
        return LocationPicker.p(this.a) == null ? 0 : LocationPicker.p(this.a).size();
    }

    public void draw(Canvas canvas, MapView mapView, boolean z) {
        if (!z) {
            super.draw(canvas, mapView, z);
        }
    }

    protected OverlayItem createItem(int i) {
        PlaceInfo placeInfo = (PlaceInfo) LocationPicker.p(this.a).get(i);
        OverlayItem overlayItem = new OverlayItem(new GeoPoint((int) (placeInfo.lat * 1000000.0d), (int) (placeInfo.lon * 1000000.0d)), "", "");
        overlayItem.setMarker(boundCenter(App.p.getResources().getDrawable(R.drawable.selector_place_overlay)));
        return overlayItem;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected boolean onTap(int r3) {
        /*
        r2_this = this;
        r1 = r2.a;
        r0 = r2.a;
        r0 = com.whatsapp.LocationPicker.p(r0);
        r0 = r0.get(r3);
        r0 = (com.whatsapp.PlaceInfo) r0;
        com.whatsapp.LocationPicker.a(r1, r0);
        r0 = r2.a;
        r0 = com.whatsapp.LocationPicker.n(r0);
        r0.notifyDataSetChanged();
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 8;
        if (r0 < r1) goto L_0x002d;
    L_0x0020:
        r0 = r2.a;
        r0 = com.whatsapp.LocationPicker.o(r0);
        r0.smoothScrollToPosition(r3);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0036;
    L_0x002d:
        r0 = r2.a;
        r0 = com.whatsapp.LocationPicker.o(r0);
        r0.setSelection(r3);
    L_0x0036:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.as4.onTap(int):boolean");
    }

    public as4(LocationPicker locationPicker) {
        this.a = locationPicker;
        super(boundCenter(App.p.getResources().getDrawable(R.drawable.selector_place_overlay)));
        setOnFocusChangeListener(new ti(this, locationPicker));
    }

    public void a() {
        setLastFocusedIndex(-1);
        populate();
    }
}
