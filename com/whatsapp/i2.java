package com.whatsapp;

import android.app.Activity;
import android.graphics.Bitmap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class i2 extends Thread {
    private static final String z;
    final fk a;

    static {
        char[] toCharArray = " |7,0\u0000g\t0>\u0017|*\f9\u0011v8<".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 99;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 88;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    i2(fk fkVar) {
        this.a = fkVar;
        super(z);
    }

    public void run() {
        do {
            try {
                if (s7.a(fk.c(this.a)).size() == 0) {
                    synchronized (s7.a(fk.c(this.a))) {
                        s7.a(fk.c(this.a)).wait();
                    }
                }
                if (s7.a(fk.c(this.a)).size() != 0) {
                    t6 t6Var;
                    synchronized (s7.a(fk.c(this.a))) {
                        t6Var = (t6) s7.a(fk.c(this.a)).pop();
                    }
                    Bitmap a = t6Var.a.a(fk.b(this.a), fk.a(this.a), true);
                    if (t6Var.b.getTag().equals(t6Var.a.c(fk.b(this.a), fk.a(this.a)))) {
                        ((Activity) t6Var.b.getContext()).runOnUiThread(new aly(this.a, a, t6Var.b, t6Var.a));
                    }
                }
            } catch (InterruptedException e) {
                return;
            } catch (Throwable th) {
                while (true) {
                    break;
                }
            }
        } while (!Thread.interrupted());
    }
}
