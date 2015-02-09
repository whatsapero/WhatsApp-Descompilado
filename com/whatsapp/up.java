package com.whatsapp;

final class up implements Runnable {
    final boolean a;
    final boolean b;
    final String c;
    final boolean d;

    public void run() {
        if (this.b) {
            synchronized (App.ay()) {
                App.a(this.c, this.d, this.a);
            }
            if (App.az == 0) {
                return;
            }
        }
        App.a(this.c, this.d, this.a);
    }

    up(boolean z, String str, boolean z2, boolean z3) {
        this.b = z;
        this.c = str;
        this.d = z2;
        this.a = z3;
    }
}
