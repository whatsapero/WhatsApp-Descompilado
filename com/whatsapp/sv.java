package com.whatsapp;

class sv implements Runnable {
    final m8 a;
    final ContactPicker b;

    public void run() {
        try {
            Thread.sleep(300);
            App.a(this.b, false, this.a.e);
        } catch (InterruptedException e) {
        }
    }

    sv(ContactPicker contactPicker, m8 m8Var) {
        this.b = contactPicker;
        this.a = m8Var;
    }
}
