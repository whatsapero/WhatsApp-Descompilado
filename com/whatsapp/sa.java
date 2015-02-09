package com.whatsapp;

class sa implements Runnable {
    final ProfilePhotoReminder a;

    sa(ProfilePhotoReminder profilePhotoReminder) {
        this.a = profilePhotoReminder;
    }

    public void run() {
        if (ProfilePhotoReminder.a(this.a).A == 0 && ProfilePhotoReminder.a(this.a).M == 0) {
            ProfilePhotoReminder.b(this.a).setVisibility(4);
        }
    }
}
