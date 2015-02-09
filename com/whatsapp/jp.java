package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.actionbarsherlock.R;

class jp implements OnGlobalLayoutListener {
    final MessageDetailsActivity a;

    jp(MessageDetailsActivity messageDetailsActivity) {
        this.a = messageDetailsActivity;
    }

    public void onGlobalLayout() {
        MessageDetailsActivity.b(this.a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        MessageDetailsActivity.b(this.a).setSelectionFromTop(1, this.a.getResources().getDimensionPixelSize(R.dimen.abs__action_bar_default_height) * 3);
    }
}
