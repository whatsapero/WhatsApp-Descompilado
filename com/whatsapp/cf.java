package com.whatsapp;

class cf implements Runnable {
    final AccountInfoActivity a;

    public void run() {
        AccountInfoActivity.f(this.a);
    }

    cf(AccountInfoActivity accountInfoActivity) {
        this.a = accountInfoActivity;
    }
}
