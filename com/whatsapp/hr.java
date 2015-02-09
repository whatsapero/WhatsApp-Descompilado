package com.whatsapp;

class hr implements Runnable {
    final LocationSharingService a;

    public void run() {
        this.a.stopSelf();
    }

    hr(LocationSharingService locationSharingService) {
        this.a = locationSharingService;
    }
}
