package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.actionbarsherlock.R;

class we implements OnItemClickListener {
    final WebSessionsActivity a;

    we(WebSessionsActivity webSessionsActivity) {
        this.a = webSessionsActivity;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        avu a = WebSessionsActivity.e(this.a).a(i - 1);
        if (a.h == 0.0d && a.l == 0.0d && a.k == 0.0d) {
            App.b(this.a, (int) R.string.location_not_available, 0);
            if (App.az == 0) {
                return;
            }
        }
        ConversationRowLocation.a(this.a, a.h, a.l, null);
    }
}
