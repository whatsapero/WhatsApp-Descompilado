package com.whatsapp.camera;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.VideoView;

class as implements OnClickListener {
    final VideoView a;
    final Runnable b;
    final View c;
    final CameraActivity d;

    as(CameraActivity cameraActivity, VideoView videoView, View view, Runnable runnable) {
        this.d = cameraActivity;
        this.a = videoView;
        this.c = view;
        this.b = runnable;
    }

    public void onClick(View view) {
        if (this.a.isPlaying()) {
            this.a.pause();
            CameraActivity.a(this.d, true, this.c);
            if (CameraActivity.l == 0) {
                return;
            }
        }
        if (view == this.c) {
            CameraActivity.a(this.d, false, this.c);
            this.a.setBackgroundDrawable(null);
            this.a.start();
            this.a.postDelayed(this.b, 0);
        }
    }
}
