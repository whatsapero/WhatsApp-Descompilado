package com.whatsapp;

class a_p implements Runnable {
    final m8 a;
    final MultipleContactPicker b;

    a_p(MultipleContactPicker multipleContactPicker, m8 m8Var) {
        this.b = multipleContactPicker;
        this.a = m8Var;
    }

    public void run() {
        try {
            Thread.sleep(300);
            App.a(this.b, false, this.a.e);
        } catch (InterruptedException e) {
        }
    }
}
