package com.whatsapp;

import com.whatsapp.util.FloatingChildLayout;

class fq implements Runnable {
    final QuickContactActivity a;

    fq(QuickContactActivity quickContactActivity) {
        this.a = quickContactActivity;
    }

    public void run() {
        QuickContactActivity.c(this.a).invalidate();
        FloatingChildLayout.b(QuickContactActivity.c(this.a), new ak_(this));
    }
}
