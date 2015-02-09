package com.whatsapp.notification;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.App;
import com.whatsapp.Conversation;
import com.whatsapp.v;

class al implements OnClickListener {
    final PopupNotification a;

    public void onClick(View view) {
        App.V.stop();
        Intent a = Conversation.a(v.b(PopupNotification.g(this.a).e.c));
        String trim = PopupNotification.j(this.a).getText().toString().trim();
        if (PopupNotification.t(this.a) != null && trim.length() > 0) {
            Conversation.a1.put(PopupNotification.t(this.a).e, trim);
        }
        this.a.startActivity(a);
        PopupNotification.e(this.a);
        this.a.finish();
    }

    al(PopupNotification popupNotification) {
        this.a = popupNotification;
    }
}
