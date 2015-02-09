package com.whatsapp;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.actionbarsherlock.R;

class v5 implements OnSeekBarChangeListener {
    final MediaView a;

    public void onStopTrackingTouch(SeekBar seekBar) {
        int i = App.az;
        if (MediaView.q(this.a) != null) {
            if (MediaView.b(this.a) == 4) {
                MediaView.q(this.a).b((int) (((float) MediaView.q(this.a).e()) * (((float) seekBar.getProgress()) / ((float) seekBar.getMax()))));
                MediaView.q(this.a).d();
                MediaView.m(this.a).sendEmptyMessage(0);
                MediaView.p(this.a).setImageResource(R.drawable.mviewer_pause);
                if (i == 0) {
                    return;
                }
            }
            MediaView.h(this.a, (int) (((float) MediaView.q(this.a).e()) * (((float) seekBar.getProgress()) / ((float) seekBar.getMax()))));
            if (i == 0) {
                return;
            }
        }
        seekBar.setProgress(0);
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        try {
            seekBar.setProgress(i);
        } catch (StackOverflowError e) {
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        if (MediaView.q(this.a) != null && MediaView.q(this.a).c()) {
            MediaView.q(this.a).b();
        }
        MediaView.m(this.a).removeMessages(0);
    }

    private v5(MediaView mediaView) {
        this.a = mediaView;
    }

    v5(MediaView mediaView, a_c com_whatsapp_a_c) {
        this(mediaView);
    }
}
