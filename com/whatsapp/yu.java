package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class yu implements OnClickListener {
    final QuickContactActivity a;

    public void onClick(View view) {
        this.a.startActivity(Conversation.a(QuickContactActivity.b(this.a)));
        QuickContactActivity.a(this.a, false);
    }

    yu(QuickContactActivity quickContactActivity) {
        this.a = quickContactActivity;
    }
}
