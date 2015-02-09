package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

class fw implements Runnable {
    final File a;
    final wb b;

    fw(wb wbVar, File file) {
        this.b = wbVar;
        this.a = file;
    }

    public void run() {
        try {
            ank.a(this.b.a, new a33(this.a));
            OutputStream fileOutputStream = new FileOutputStream(this.b.a.b());
            ank.a(ank.a(this.b.a), fileOutputStream);
            ank.a(this.b.a).close();
            ank.a(this.b.a, null);
            fileOutputStream.close();
        } catch (Throwable e) {
            Log.c(e);
        }
        this.a.delete();
    }
}
