package com.whatsapp;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.actionbarsherlock.R;

class as2 implements OnGlobalLayoutListener {
    final VideoPreviewActivity a;

    as2(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }

    public void onGlobalLayout() {
        int i = 0;
        if (VideoPreviewActivity.p(this.a) != null) {
            int i2;
            Rect rect = new Rect();
            VideoPreviewActivity.p(this.a).getWindowVisibleDisplayFrame(rect);
            if (((float) (VideoPreviewActivity.p(this.a).getRootView().getHeight() - (rect.bottom - rect.top))) > am1.a().g * 128.0f) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            View findViewById = this.a.findViewById(R.id.emoji_btn_holder);
            if (i2 == 0) {
                i = 8;
            }
            findViewById.setVisibility(i);
            if (i2 == 0) {
                VideoPreviewActivity.f(this.a).dismiss();
            }
        }
    }
}
