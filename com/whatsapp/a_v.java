package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import com.actionbarsherlock.R;

class a_v implements OnPreparedListener {
    final VideoPreviewActivity a;

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.a.findViewById(R.id.loading).setVisibility(8);
    }

    a_v(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }
}
