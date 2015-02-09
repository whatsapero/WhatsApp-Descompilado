package com.whatsapp.gallerypicker;

import android.view.View;
import android.view.View.OnClickListener;

class u implements OnClickListener {
    final ImagePreview a;

    u(ImagePreview imagePreview) {
        this.a = imagePreview;
    }

    public void onClick(View view) {
        this.a.setResult(2);
        this.a.finish();
    }
}
