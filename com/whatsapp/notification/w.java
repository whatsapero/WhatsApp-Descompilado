package com.whatsapp.notification;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.App;

class w implements OnClickListener {
    final PopupNotification a;

    w(PopupNotification popupNotification) {
        this.a = popupNotification;
    }

    public void onClick(View view) {
        App.V.stop();
        PopupNotification.e(this.a);
        this.a.finish();
    }
}
