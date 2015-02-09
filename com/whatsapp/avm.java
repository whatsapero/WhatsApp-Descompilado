package com.whatsapp;

class avm implements Runnable {
    final AccountInfoActivity a;

    public void run() {
        AccountInfoActivity.d(this.a);
    }

    avm(AccountInfoActivity accountInfoActivity) {
        this.a = accountInfoActivity;
    }
}
