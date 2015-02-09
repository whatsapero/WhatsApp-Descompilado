package com.whatsapp.notification;

import android.view.View;
import android.view.View.OnClickListener;

class a5 implements OnClickListener {
    final PopupNotification a;

    public void onClick(View view) {
        PopupNotification.a(this.a);
    }

    a5(PopupNotification popupNotification) {
        this.a = popupNotification;
    }
}
