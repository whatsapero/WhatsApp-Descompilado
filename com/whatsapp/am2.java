package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class am2 implements OnClickListener {
    final VideoPreviewActivity a;

    am2(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }

    public void onClick(View view) {
        this.a.setResult(2);
        this.a.finish();
    }
}
