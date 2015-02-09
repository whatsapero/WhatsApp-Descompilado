package com.whatsapp;

class me implements Runnable {
    final HomeActivity a;

    public void run() {
        HomeActivity.d(this.a);
    }

    me(HomeActivity homeActivity) {
        this.a = homeActivity;
    }
}
