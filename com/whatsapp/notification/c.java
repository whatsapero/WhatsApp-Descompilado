package com.whatsapp.notification;

import android.app.Activity;
import com.whatsapp.cb;
import com.whatsapp.dz;
import com.whatsapp.ho;

class c extends dz {
    final PopupNotification w;

    c(PopupNotification popupNotification, Activity activity, ho hoVar) {
        this.w = popupNotification;
        super(activity, hoVar);
    }

    public void a() {
        PopupNotification.d(this.w);
    }

    public void h() {
        cb.j();
        super.h();
    }
}
