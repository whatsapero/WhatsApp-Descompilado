package com.whatsapp;

class atj implements Runnable {
    final amp a;

    atj(amp com_whatsapp_amp) {
        this.a = com_whatsapp_amp;
    }

    public void run() {
        WebSessionsActivity.e(this.a.a).a(a12.g());
        if (WebSessionsActivity.e(this.a.a).getCount() > 0) {
            WebSessionsActivity.d(this.a.a).setVisibility(0);
            WebSessionsActivity.c(this.a.a).setVisibility(0);
            if (App.az == 0) {
                return;
            }
        }
        WebSessionsActivity.d(this.a.a).setVisibility(8);
        WebSessionsActivity.c(this.a.a).setVisibility(8);
    }
}
