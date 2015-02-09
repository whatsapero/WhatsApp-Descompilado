package com.whatsapp.gallerypicker;

import android.view.View;
import android.view.View.OnClickListener;

class ap implements OnClickListener {
    final ImagePreview a;
    final ThumbImageView b;

    ap(ThumbImageView thumbImageView, ImagePreview imagePreview) {
        this.b = thumbImageView;
        this.a = imagePreview;
    }

    public void onClick(View view) {
        ImagePreview.l(this.b.A).setCurrentItem(ImagePreview.q(this.b.A).indexOf(ThumbImageView.a(this.b)));
    }
}
