package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class kp implements OnGlobalLayoutListener {
    final ContactInfo a;

    kp(ContactInfo contactInfo) {
        this.a = contactInfo;
    }

    public void onGlobalLayout() {
        ContactInfo.a(this.a);
    }
}
