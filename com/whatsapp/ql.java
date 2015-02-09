package com.whatsapp;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import java.util.List;
import java.util.Locale;

class ql implements Runnable {
    private avu a;
    private Location b;

    public ql(avu com_whatsapp_avu, Location location) {
        this.a = com_whatsapp_avu;
        this.b = location;
        com_whatsapp_avu.h = location.getLatitude();
        com_whatsapp_avu.l = location.getLongitude();
        com_whatsapp_avu.k = (double) location.getAccuracy();
    }

    public void run() {
        try {
            List fromLocation = new Geocoder(App.p, Locale.getDefault()).getFromLocation(this.b.getLatitude(), this.b.getLongitude(), 1);
            if (fromLocation != null) {
                if (!fromLocation.isEmpty()) {
                    Address address = (Address) fromLocation.get(0);
                    this.a.a = address.getLocality();
                }
            }
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
        }
        a12.b().a(this.a.b, this.a.h, this.a.l, this.a.k, this.a.a);
        App.p.U().post(new ta(this));
    }
}
