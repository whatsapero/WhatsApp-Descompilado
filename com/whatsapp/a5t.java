package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.whatsapp.util.undobar.UndoBarController;

class a5t implements OnScrollListener {
    final ConversationsFragment a;

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i != 0) {
            UndoBarController.b(this.a.getActivity());
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    a5t(ConversationsFragment conversationsFragment) {
        this.a = conversationsFragment;
    }
}
