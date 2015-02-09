package com.whatsapp;

import android.text.format.DateUtils;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.actionbarsherlock.R;

class a9 implements OnSeekBarChangeListener {
    final RecordAudio a;

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (RecordAudio.j(this.a) != null) {
            if (RecordAudio.a(this.a) == 3) {
                RecordAudio.j(this.a).b(seekBar.getProgress());
                RecordAudio.j(this.a).d();
                RecordAudio.d(this.a).sendEmptyMessage(0);
                RecordAudio.g(this.a).setImageResource(R.drawable.mviewer_pause);
                if (App.az == 0) {
                    return;
                }
            }
            return;
        }
        seekBar.setProgress(0);
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            RecordAudio.c(this.a).setText(DateUtils.formatElapsedTime((long) (i / 1000)));
        }
    }

    a9(RecordAudio recordAudio) {
        this.a = recordAudio;
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        if (RecordAudio.j(this.a) != null && RecordAudio.j(this.a).c()) {
            RecordAudio.j(this.a).b();
        }
        RecordAudio.d(this.a).removeMessages(0);
    }
}
