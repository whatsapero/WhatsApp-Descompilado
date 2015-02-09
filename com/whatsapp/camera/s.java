package com.whatsapp.camera;

import android.text.format.DateUtils;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.whatsapp.VideoView;

class s implements OnSeekBarChangeListener {
    final TextView a;
    final VideoView b;
    final CameraActivity c;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        this.b.seekTo(seekBar.getProgress());
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.b.seekTo(i);
        }
        this.a.setText(DateUtils.formatElapsedTime((long) (i / 1000)));
    }

    s(CameraActivity cameraActivity, VideoView videoView, TextView textView) {
        this.c = cameraActivity;
        this.b = videoView;
        this.a = textView;
    }
}
