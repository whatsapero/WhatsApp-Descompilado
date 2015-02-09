package com.whatsapp;

import android.os.Process;

final class pu extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        Process.killProcess(Process.myPid());
    }

    pu(gg ggVar) {
        this();
    }

    private pu() {
    }
}
