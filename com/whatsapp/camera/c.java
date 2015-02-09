package com.whatsapp.camera;

import android.app.Activity;
import com.actionbarsherlock.R;
import com.whatsapp.ee;

class c extends ee {
    final CameraActivity i;

    public void dismiss() {
        super.dismiss();
        CameraActivity.p(this.i).setImageResource(R.drawable.emoji_btn_white);
    }

    c(CameraActivity cameraActivity, Activity activity) {
        this.i = cameraActivity;
        super(activity);
    }
}
