package com.whatsapp.camera;

import android.view.View;
import android.widget.SeekBar;
import com.whatsapp.VideoView;

class k implements Runnable {
    final VideoView a;
    final View b;
    final SeekBar c;
    final CameraActivity d;

    k(CameraActivity cameraActivity, VideoView videoView, SeekBar seekBar, View view) {
        this.d = cameraActivity;
        this.a = videoView;
        this.c = seekBar;
        this.b = view;
    }

    public void run() {
        if (this.a.isPlaying()) {
            this.c.setProgress(this.a.getCurrentPosition());
            this.a.postDelayed(this, 50);
            if (CameraActivity.l == 0) {
                return;
            }
        }
        CameraActivity.a(this.d, true, this.b);
    }
}
