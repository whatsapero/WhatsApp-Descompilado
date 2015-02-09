package com.whatsapp;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

class tc implements OnSeekBarChangeListener {
    final VideoPreviewActivity a;

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            VideoPreviewActivity.h(this.a).seekTo(i);
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    tc(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (!VideoPreviewActivity.h(this.a).isPlaying()) {
            VideoPreviewActivity.e(this.a).a((long) seekBar.getProgress());
        }
        VideoPreviewActivity.h(this.a).seekTo(seekBar.getProgress());
        VideoPreviewActivity.b(this.a, false);
    }
}
