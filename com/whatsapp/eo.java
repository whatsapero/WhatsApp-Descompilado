package com.whatsapp;

import android.app.Activity;
import com.actionbarsherlock.R;

class eo extends ee {
    final VideoPreviewActivity i;

    public void dismiss() {
        super.dismiss();
        VideoPreviewActivity.j(this.i).setImageResource(R.drawable.emoji_btn_white);
    }

    eo(VideoPreviewActivity videoPreviewActivity, Activity activity) {
        this.i = videoPreviewActivity;
        super(activity);
    }
}
