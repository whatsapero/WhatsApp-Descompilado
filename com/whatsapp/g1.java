package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

class g1 implements OnPreparedListener {
    final VideoView a;

    public void onPrepared(MediaPlayer mediaPlayer) {
        VideoView.c(this.a, 2);
        VideoView.a(this.a, VideoView.d(this.a, VideoView.b(this.a, true)));
        if (VideoView.g(this.a) != null) {
            VideoView.g(this.a).onPrepared(VideoView.e(this.a));
        }
        VideoView.d(this.a, mediaPlayer.getVideoWidth());
        VideoView.e(this.a, mediaPlayer.getVideoHeight());
        int f = VideoView.f(this.a);
        if (f != 0) {
            this.a.seekTo(f);
        }
        if (VideoView.d(this.a) != 0 && VideoView.h(this.a) != 0) {
            this.a.getHolder().setFixedSize(VideoView.d(this.a), VideoView.h(this.a));
            if (VideoView.k(this.a) == VideoView.d(this.a) && VideoView.a(this.a) == VideoView.h(this.a)) {
                if (VideoView.c(this.a) == 3) {
                    this.a.start();
                    if (App.az == 0) {
                        return;
                    }
                }
                if (!this.a.isPlaying() && f == 0 && this.a.getCurrentPosition() <= 0) {
                }
            }
        } else if (VideoView.c(this.a) == 3) {
            this.a.start();
        }
    }

    g1(VideoView videoView) {
        this.a = videoView;
    }
}
