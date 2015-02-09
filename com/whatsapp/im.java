package com.whatsapp;

import android.content.Intent;

class im extends Thread {
    final SpamWarningActivity a;

    public void run() {
        SpamWarningActivity.a().block();
        this.a.startActivity(new Intent(null, null, this.a, Main.b()));
        this.a.finish();
    }

    im(SpamWarningActivity spamWarningActivity) {
        this.a = spamWarningActivity;
    }
}
