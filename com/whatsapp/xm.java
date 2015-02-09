package com.whatsapp;

class xm implements Runnable {
    final ProfileInfoActivity a;

    public void run() {
        if (ProfileInfoActivity.c(this.a).A == 0 && ProfileInfoActivity.c(this.a).M == 0) {
            ProfileInfoActivity.d(this.a).setVisibility(4);
        }
    }

    xm(ProfileInfoActivity profileInfoActivity) {
        this.a = profileInfoActivity;
    }
}
