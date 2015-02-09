package com.whatsapp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.ConversationRowImage.RowImageView;
import com.whatsapp.protocol.b;
import com.whatsapp.util.bf;

class lr implements bf {
    final ConversationRowImage a;

    public void a(ImageView imageView, Bitmap bitmap, b bVar) {
        if (bitmap != null) {
            RowImageView.a(ConversationRowImage.a(this.a), bitmap);
            ConversationRowImage.a(this.a).invalidate();
        }
    }

    lr(ConversationRowImage conversationRowImage) {
        this.a = conversationRowImage;
    }

    public int a() {
        View decorView = ((Activity) this.a.getContext()).getWindow().getDecorView();
        return (Math.min(decorView.getWidth(), decorView.getHeight()) * 70) / 100;
    }
}
