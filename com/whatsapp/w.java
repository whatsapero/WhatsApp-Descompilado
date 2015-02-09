package com.whatsapp;

class w implements Runnable {
    final RegisterPhone a;

    w(RegisterPhone registerPhone) {
        this.a = registerPhone;
    }

    public void run() {
        if (!this.a.m && !this.a.isFinishing()) {
            this.a.showDialog(21);
        }
    }
}
