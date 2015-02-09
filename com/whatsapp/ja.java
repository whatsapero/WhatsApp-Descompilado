package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;

class ja implements OnClickListener {
    final AccountInfoActivity a;

    ja(AccountInfoActivity accountInfoActivity) {
        this.a = accountInfoActivity;
    }

    public void onClick(View view) {
        this.a.findViewById(R.id.user_details_panel).setVisibility(8);
        this.a.findViewById(R.id.choose_friend_panel).setVisibility(0);
        AccountInfoActivity.a(this.a, null);
    }
}
