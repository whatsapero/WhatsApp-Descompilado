package com.whatsapp;

import java.util.TimerTask;

public class al2 extends TimerTask {
    mz a;

    public al2(mz mzVar) {
        this.a = mzVar;
    }

    public void run() {
        if (!mz.b(this.a)) {
            mz.a(this.a);
        }
    }
}
