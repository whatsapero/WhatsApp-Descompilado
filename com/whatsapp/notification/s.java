package com.whatsapp.notification;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

class s implements OnEditorActionListener {
    final PopupNotification a;

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        PopupNotification.d(this.a);
        return true;
    }

    s(PopupNotification popupNotification) {
        this.a = popupNotification;
    }
}
