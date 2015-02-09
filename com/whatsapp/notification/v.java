package com.whatsapp.notification;

import com.whatsapp.tf;
import com.whatsapp.util.a5;

class v implements tf {
    final PopupNotification a;

    v(PopupNotification popupNotification) {
        this.a = popupNotification;
    }

    public void a(int i) {
        PopupNotification.s(this.a).dismiss();
        int selectionStart = PopupNotification.j(this.a).getSelectionStart();
        int selectionEnd = PopupNotification.j(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            int i2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i2;
        }
        CharSequence stringBuilder = new StringBuilder(PopupNotification.j(this.a).getText().toString());
        stringBuilder.replace(selectionEnd, selectionStart, a5.f(i));
        PopupNotification.j(this.a).setText(stringBuilder);
        if (selectionEnd <= PopupNotification.j(this.a).length() - a5.h(i)) {
            PopupNotification.j(this.a).setSelection(selectionEnd + a5.h(i));
        }
    }

    public void a() {
    }
}
