package com.whatsapp;

class bj implements Runnable {
    final LocationPicker a;

    public void run() {
        LocationPicker.e(this.a).a(LocationPicker.l(this.a).getMyLocation());
    }

    bj(LocationPicker locationPicker) {
        this.a = locationPicker;
    }
}
