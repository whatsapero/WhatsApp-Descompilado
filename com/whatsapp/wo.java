package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;

class wo implements OnClickListener {
    final VideoPreviewActivity a;

    wo(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }

    public void onClick(View view) {
        if (VideoPreviewActivity.f(this.a).isShowing()) {
            VideoPreviewActivity.f(this.a).dismiss();
            if (App.az == 0) {
                return;
            }
        }
        VideoPreviewActivity.f(this.a).a(VideoPreviewActivity.j(this.a), VideoPreviewActivity.j(this.a), VideoPreviewActivity.j(this.a), true);
        VideoPreviewActivity.j(this.a).setImageResource(R.drawable.emoji_kbd_white);
    }
}
