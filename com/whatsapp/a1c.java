package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class a1c implements OnGlobalLayoutListener {
    final anj a;

    a1c(anj com_whatsapp_anj) {
        this.a = com_whatsapp_anj;
    }

    public void onGlobalLayout() {
        ConversationsFragment.c(this.a.a.a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.a.a.a.a(this.a.a.b);
    }
}
