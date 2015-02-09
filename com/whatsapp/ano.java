package com.whatsapp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;
import com.whatsapp.util.bf;

class ano implements bf {
    final ConversationRowVideo a;

    public int a() {
        View decorView = ((Activity) this.a.getContext()).getWindow().getDecorView();
        return (Math.min(decorView.getWidth(), decorView.getHeight()) * 70) / 100;
    }

    ano(ConversationRowVideo conversationRowVideo) {
        this.a = conversationRowVideo;
    }

    public void a(ImageView imageView, Bitmap bitmap, b bVar) {
        if (bitmap != null) {
            ConversationRowVideo.a(this.a).setImageDrawable(new BitmapDrawable(this.a.getContext().getResources(), bitmap));
            if (App.az == 0) {
                return;
            }
        }
        ConversationRowVideo.a(this.a).setImageDrawable(new ColorDrawable(this.a.getResources().getColor(R.color.dark_gray)));
    }
}
