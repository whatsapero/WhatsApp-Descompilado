package com.whatsapp;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.ItemizedOverlay.OnFocusChangeListener;
import com.google.android.maps.OverlayItem;

class ti implements OnFocusChangeListener {
    final LocationPicker a;
    final as4 b;

    public void onFocusChanged(ItemizedOverlay itemizedOverlay, OverlayItem overlayItem) {
        if (overlayItem == null) {
            LocationPicker.a(this.b.a, null);
            LocationPicker.n(this.b.a).notifyDataSetChanged();
        }
    }

    ti(as4 com_whatsapp_as4, LocationPicker locationPicker) {
        this.b = com_whatsapp_as4;
        this.a = locationPicker;
    }
}
