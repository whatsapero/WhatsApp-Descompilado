package com.whatsapp.notification;

import android.view.View;
import android.view.View.OnClickListener;

class h implements OnClickListener {
    final PopupNotification a;

    public void onClick(View view) {
        PopupNotification.i(this.a);
    }

    h(PopupNotification popupNotification) {
        this.a = popupNotification;
    }
}
