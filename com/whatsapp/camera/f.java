package com.whatsapp.camera;

import android.view.View;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;

class f implements OnClickListener {
    final CameraActivity a;

    f(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public void onClick(View view) {
        if (CameraActivity.k(this.a).isShowing()) {
            CameraActivity.k(this.a).dismiss();
            if (CameraActivity.l == 0) {
                return;
            }
        }
        CameraActivity.k(this.a).a(CameraActivity.p(this.a), CameraActivity.p(this.a), CameraActivity.p(this.a), true);
        CameraActivity.p(this.a).setImageResource(R.drawable.emoji_kbd_white);
    }
}
