package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;

class s8 implements OnBufferingUpdateListener {
    final VideoView a;

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        VideoView.b(this.a, i);
    }

    s8(VideoView videoView) {
        this.a = videoView;
    }
}
