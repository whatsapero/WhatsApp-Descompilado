package com.whatsapp.notification;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.cb;

class l implements OnClickListener {
    final PopupNotification a;
    final cb b;

    public void onClick(View view) {
        this.b.n();
    }

    l(PopupNotification popupNotification, cb cbVar) {
        this.a = popupNotification;
        this.b = cbVar;
    }
}
