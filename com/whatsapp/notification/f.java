package com.whatsapp.notification;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

class f implements OnClickListener {
    final PopupNotification a;
    final ImageButton b;

    f(PopupNotification popupNotification, ImageButton imageButton) {
        this.a = popupNotification;
        this.b = imageButton;
    }

    public void onClick(View view) {
        PopupNotification.s(this.a).a(this.b);
    }
}
