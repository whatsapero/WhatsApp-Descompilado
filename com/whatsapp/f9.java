package com.whatsapp;

import com.whatsapp.DialogToastFragmentActivity.ProgressDialogFragment;
import com.whatsapp.util.Log;

class f9 implements Runnable {
    final ProgressDialogFragment a;
    final xn b;

    f9(xn xnVar, ProgressDialogFragment progressDialogFragment) {
        this.b = xnVar;
        this.a = progressDialogFragment;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        App.aJ.E();
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis < 3000) {
            try {
                Thread.sleep(3000 - currentTimeMillis);
            } catch (Throwable e) {
                Log.c(e);
            }
        }
        App.p.U().post(new x8(this));
    }
}
