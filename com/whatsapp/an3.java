package com.whatsapp;

import com.whatsapp.util.OpusRecorder;
import java.io.File;

class an3 extends ant {
    private OpusRecorder d;

    public void a() {
        this.d.close();
    }

    public an3(String str) {
        this.c = new File(str);
        this.b = 16000;
        this.d = new OpusRecorder(str);
    }

    public void d() {
        this.d.prepare();
    }

    public void e() {
        this.d.start();
    }

    public void f() {
        this.d.stop();
    }
}
