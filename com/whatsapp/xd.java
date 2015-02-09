package com.whatsapp;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;

class xd implements Callback {
    final VideoView a;

    xd(VideoView videoView) {
        this.a = videoView;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Object obj = 1;
        VideoView.g(this.a, i2);
        VideoView.f(this.a, i3);
        Object obj2;
        if (VideoView.c(this.a) == 3) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        if (!(VideoView.d(this.a) == i2 && VideoView.h(this.a) == i3)) {
            obj = null;
        }
        if (VideoView.e(this.a) != null && r0 != null && r1 != null) {
            if (VideoView.f(this.a) != 0) {
                this.a.seekTo(VideoView.f(this.a));
            }
            this.a.start();
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        VideoView.a(this.a, surfaceHolder);
        VideoView.b(this.a);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        VideoView.a(this.a, null);
        VideoView.c(this.a, true);
    }
}
