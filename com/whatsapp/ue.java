package com.whatsapp;

import android.graphics.Bitmap;

class ue extends Thread {
    private long a;
    private Object b;
    final VideoPreviewActivity c;

    public void a(long j) {
        synchronized (this.b) {
            this.a = j;
            this.b.notifyAll();
        }
    }

    public void run() {
        long j = -1;
        while (true) {
            try {
                synchronized (this.b) {
                    if (this.a == j) {
                        this.b.wait();
                    }
                    j = this.a;
                }
                if (!VideoPreviewActivity.h(this.c).isPlaying()) {
                    Bitmap a = this.c.a(1000 * j);
                    if (a != null) {
                        this.c.runOnUiThread(new o5(this, a));
                    } else {
                        continue;
                    }
                }
            } catch (InterruptedException e) {
                throw e;
            } catch (InterruptedException e2) {
                return;
            }
        }
    }

    ue(VideoPreviewActivity videoPreviewActivity) {
        this.c = videoPreviewActivity;
        this.a = -1;
        this.b = new Object();
    }
}
