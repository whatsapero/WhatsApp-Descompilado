package com.whatsapp;

class i4 implements Runnable {
    final AccountInfoActivity a;

    public void run() {
        AccountInfoActivity.c(this.a);
    }

    i4(AccountInfoActivity accountInfoActivity) {
        this.a = accountInfoActivity;
    }
}
