package com.whatsapp;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.protocol.b;
import com.whatsapp.util.b0;
import com.whatsapp.util.bf;

final class os implements bf {
    public int a() {
        return (int) (88.0f * am1.a().g);
    }

    public void a(ImageView imageView, Bitmap bitmap, b bVar) {
        if (bitmap != null) {
            imageView.setImageDrawable(new ex(imageView.getContext(), bitmap, bVar.e.b));
            if (App.az == 0) {
                return;
            }
        }
        imageView.setImageDrawable(new ex(imageView.getContext(), b0.a(imageView.getContext()), bVar.e.b));
    }

    os() {
    }
}
