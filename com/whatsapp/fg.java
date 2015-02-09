package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class fg implements OnGlobalLayoutListener {
    final ArchivedConversationsFragment a;
    final int b;

    public void onGlobalLayout() {
        this.a.getListView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.a.a(this.b);
    }

    fg(ArchivedConversationsFragment archivedConversationsFragment, int i) {
        this.a = archivedConversationsFragment;
        this.b = i;
    }
}
