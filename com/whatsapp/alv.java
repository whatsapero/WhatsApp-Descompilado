package com.whatsapp;

class alv implements Runnable {
    final WebSessionsActivity a;

    alv(WebSessionsActivity webSessionsActivity) {
        this.a = webSessionsActivity;
    }

    public void run() {
        WebSessionsActivity.e(this.a).notifyDataSetChanged();
        App.p.U().postDelayed(WebSessionsActivity.a(this.a), 30000);
    }
}
