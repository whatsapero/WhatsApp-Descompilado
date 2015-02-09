package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

class b7 implements bn {
    final y a;
    final ImageView b;
    final aw c;
    final b_ d;

    public void a(Bitmap bitmap, boolean z) {
        int i = ImagePreview.y;
        if (this.b.getTag() == this.a) {
            if (bitmap == ImageGallery.a(this.c, this.d.b.getBaseContext())) {
                this.b.setScaleType(ScaleType.CENTER);
                this.b.setBackgroundColor(GalleryPicker.b(this.d.b));
                this.b.setImageBitmap(bitmap);
                if (i == 0) {
                    return;
                }
            }
            this.b.setScaleType(ScaleType.CENTER_CROP);
            this.b.setBackgroundResource(0);
            if (!z) {
                Drawable transitionDrawable = new TransitionDrawable(new Drawable[]{GalleryPicker.i(this.d.b), new BitmapDrawable(this.d.b.getResources(), bitmap)});
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

    public void a() {
        this.b.setBackgroundColor(GalleryPicker.b(this.d.b));
        this.b.setImageDrawable(null);
    }

    b7(b_ b_Var, ImageView imageView, y yVar, aw awVar) {
        this.d = b_Var;
        this.b = imageView;
        this.a = yVar;
        this.c = awVar;
    }
}
