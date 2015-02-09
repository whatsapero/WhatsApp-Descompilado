package com.whatsapp;

class es implements Runnable {
    final String a;
    final HomeActivity b;

    public void run() {
        try {
            Thread.sleep(300);
            App.i(this.a);
        } catch (InterruptedException e) {
        }
    }

    es(HomeActivity homeActivity, String str) {
        this.b = homeActivity;
        this.a = str;
    }
}
