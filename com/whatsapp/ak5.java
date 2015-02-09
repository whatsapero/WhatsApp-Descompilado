package com.whatsapp;

class ak5 extends Thread {
    final boolean a;
    final k5 b;

    public void run() {
        int i = App.az;
        int i2 = 0;
        while (!this.a && bd.e && i2 < 45000) {
            try {
                i2 += 200;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    if (i != 0) {
                        break;
                    }
                }
            } catch (InterruptedException e2) {
                throw e2;
            } catch (InterruptedException e22) {
                throw e22;
            }
        }
        try {
            if (i2 < 45000) {
                if (!this.a) {
                    return;
                }
            }
            if (bd.e) {
                bd.d();
            }
        } catch (InterruptedException e222) {
            throw e222;
        } catch (InterruptedException e2222) {
            throw e2222;
        }
    }

    ak5(k5 k5Var, boolean z) {
        this.b = k5Var;
        this.a = z;
    }
}
