package com.whatsapp.camera;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.actionbarsherlock.R;

class g implements OnLongClickListener {
    final CameraActivity a;

    public boolean onLongClick(View view) {
        CameraActivity.x(this.a).setImageResource(R.drawable.btn_shutter_video_pressed);
        CameraActivity.n(this.a);
        return true;
    }

    g(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }
}
