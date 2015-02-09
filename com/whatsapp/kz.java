package com.whatsapp;

class kz implements Runnable {
    final HomeActivity a;
    final String b;

    public void run() {
        try {
            Thread.sleep(300);
            App.a(this.b, null);
        } catch (InterruptedException e) {
        }
    }

    kz(HomeActivity homeActivity, String str) {
        this.a = homeActivity;
        this.b = str;
    }
}
