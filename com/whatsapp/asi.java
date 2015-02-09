package com.whatsapp;

class asi implements Runnable {
    final CallsFragment a;

    public void run() {
        CallsFragment.c(this.a).notifyDataSetChanged();
        CallsFragment.e(this.a);
    }

    asi(CallsFragment callsFragment) {
        this.a = callsFragment;
    }
}
