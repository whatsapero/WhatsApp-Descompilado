package com.whatsapp;

class a8h implements Runnable {
    final QuickContactActivity a;

    a8h(QuickContactActivity quickContactActivity) {
        this.a = quickContactActivity;
    }

    public void run() {
        QuickContactActivity.c(this.a).d();
        QuickContactActivity.c(this.a).b(new ak3(this));
    }
}
