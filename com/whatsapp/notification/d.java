package com.whatsapp.notification;

import android.view.View;
import android.view.View.OnClickListener;

class d implements OnClickListener {
    final PopupNotification a;

    public void onClick(View view) {
        PopupNotification.d(this.a);
    }

    d(PopupNotification popupNotification) {
        this.a = popupNotification;
    }
}
