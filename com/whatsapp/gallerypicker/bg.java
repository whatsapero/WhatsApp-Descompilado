package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

class bg implements bn {
    final y a;
    final ImageView b;
    final an c;
    final aw d;

    public void a(Bitmap bitmap, boolean z) {
        int i = ImagePreview.y;
        if (this.b.getTag() == this.a) {
            if (bitmap == ImageGallery.a(this.d, this.c.a.getBaseContext())) {
                this.b.setScaleType(ScaleType.CENTER);
                this.b.setBackgroundColor(ImageGallery.e(this.c.a));
                this.b.setImageBitmap(bitmap);
                if (i == 0) {
                    return;
                }
            }
            this.b.setScaleType(ScaleType.CENTER_CROP);
            this.b.setBackgroundResource(0);
            if (!z) {
                Drawable transitionDrawable = new TransitionDrawable(new Drawable[]{ImageGallery.g(this.c.a), new BitmapDrawable(this.c.a.getResources(), bitmap)});
                transitionDrawable.setCrossFadeEnabled(true);
                transitionDrawable.startTransition(150);
                this.b.setImageDrawable(transitionDrawable);
                if (i == 0) {
                    return;
                }
            }
            this.b.setImageBitmap(bitmap);
        }
    }

    bg(an anVar, ImageView imageView, y yVar, aw awVar) {
        this.c = anVar;
        this.b = imageView;
        this.a = yVar;
        this.d = awVar;
    }

    public void a() {
        this.b.setBackgroundColor(ImageGallery.e(this.c.a));
        this.b.setImageDrawable(null);
    }
}
