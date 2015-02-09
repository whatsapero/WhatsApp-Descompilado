package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

class a_9 implements OnCompletionListener {
    final VideoView a;

    a_9(VideoView videoView) {
        this.a = videoView;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        VideoView.c(this.a, 5);
        VideoView.a(this.a, 5);
        if (VideoView.i(this.a) != null) {
            VideoView.i(this.a).onCompletion(VideoView.e(this.a));
        }
    }
}
