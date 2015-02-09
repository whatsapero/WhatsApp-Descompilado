package com.whatsapp;

class zf implements Runnable {
    final MessageDetailsActivity a;

    public void run() {
        MessageDetailsActivity.e(this.a).notifyDataSetChanged();
        MessageDetailsActivity.g(this.a);
    }

    zf(MessageDetailsActivity messageDetailsActivity) {
        this.a = messageDetailsActivity;
    }
}
