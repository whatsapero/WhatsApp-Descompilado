package com.whatsapp.qrcode;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.actionbarsherlock.R;

class k implements OnClickListener {
    final QrCodeActivity a;

    public void onClick(View view) {
        this.a.findViewById(R.id.education).setVisibility(8);
        this.a.findViewById(R.id.shade).setVisibility(8);
        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration((long) this.a.getResources().getInteger(17694721));
        this.a.findViewById(R.id.education).startAnimation(alphaAnimation);
        this.a.findViewById(R.id.shade).startAnimation(alphaAnimation);
        this.a.findViewById(R.id.overlay).setVisibility(0);
        QrCodeActivity.b(this.a, false);
        if (QrCodeActivity.d(this.a)) {
            QrCodeActivity.a(this.a).a().setOneShotPreviewCallback(QrCodeActivity.e(this.a));
        }
    }

    k(QrCodeActivity qrCodeActivity) {
        this.a = qrCodeActivity;
    }
}
