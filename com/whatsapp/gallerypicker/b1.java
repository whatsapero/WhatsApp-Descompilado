package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;

class b1 implements Runnable {
    final z a;

    public void run() {
        int i = ImagePreview.y;
        while (true) {
            synchronized (z.b(this.a)) {
                if (z.c(this.a)) {
                    if (i == 0) {
                        return;
                    }
                }
                if (z.b(this.a).isEmpty()) {
                    try {
                        z.b(this.a).wait();
                    } catch (InterruptedException e) {
                    }
                } else {
                    Bitmap a;
                    a_ a_Var = (a_) z.b(this.a).remove(0);
                    Bitmap bitmap = (Bitmap) z.c().get(a_Var.a.b());
                    if (bitmap == null) {
                        try {
                            a = a_Var.a.a();
                        } catch (InterruptedException e2) {
                            throw e2;
                        }
                    }
                    a = bitmap;
                    if (a != null) {
                        z.c().put(a_Var.a.b(), a);
                        z.a(this.a).post(new a9(this, a_Var.b, a, bitmap));
                    }
                }
            }
        }
    }

    private b1(z zVar) {
        this.a = zVar;
    }

    b1(z zVar, au auVar) {
        this(zVar);
    }
}
