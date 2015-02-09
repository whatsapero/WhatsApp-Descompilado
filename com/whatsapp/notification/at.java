package com.whatsapp.notification;

class at implements Runnable {
    final PopupNotification a;

    at(PopupNotification popupNotification) {
        this.a = popupNotification;
    }

    public void run() {
        if (PopupNotification.n(this.a) != null && PopupNotification.n(this.a).isHeld()) {
            PopupNotification.n(this.a).release();
        }
    }
}
