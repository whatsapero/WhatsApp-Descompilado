package com.whatsapp.notification;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.App;

class a implements OnClickListener {
    final PopupNotification a;

    public void onClick(View view) {
        App.T();
        if (PopupNotification.g(this.a) != null) {
            PopupNotification.f(this.a).add(PopupNotification.g(this.a).e);
        }
        if (PopupNotification.t(this.a) != null) {
            PopupNotification.b(this.a).add(PopupNotification.t(this.a).e);
        }
    }

    a(PopupNotification popupNotification) {
        this.a = popupNotification;
    }
}
