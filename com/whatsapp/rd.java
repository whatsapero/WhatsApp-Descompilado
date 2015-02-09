package com.whatsapp;

class rd implements Runnable {
    final ContactInfo a;

    rd(ContactInfo contactInfo) {
        this.a = contactInfo;
    }

    public void run() {
        ContactInfo.b(this.a);
        this.a.q.postDelayed(this, ContactInfo.d(this.a));
    }
}
