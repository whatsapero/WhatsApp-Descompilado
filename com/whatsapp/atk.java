package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnVideoSizeChangedListener;

class atk implements OnVideoSizeChangedListener {
    final VideoView a;

    atk(VideoView videoView) {
        this.a = videoView;
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        VideoView.d(this.a, mediaPlayer.getVideoWidth());
        VideoView.e(this.a, mediaPlayer.getVideoHeight());
        if (VideoView.d(this.a) != 0 && VideoView.h(this.a) != 0) {
            this.a.getHolder().setFixedSize(VideoView.d(this.a), VideoView.h(this.a));
            this.a.requestLayout();
        }
    }
}
