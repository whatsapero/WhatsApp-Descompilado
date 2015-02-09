package com.whatsapp;

import android.media.audiofx.Visualizer;
import android.media.audiofx.Visualizer.OnDataCaptureListener;

class akg implements OnDataCaptureListener {
    final cb a;

    public void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        if (cb.c(this.a) != null) {
            cb.c(this.a).a(bArr);
        }
    }

    akg(cb cbVar) {
        this.a = cbVar;
    }

    public void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i) {
    }
}
