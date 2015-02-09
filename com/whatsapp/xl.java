package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;

class xl implements OnClickListener {
    final ProfileInfoActivity a;

    xl(ProfileInfoActivity profileInfoActivity) {
        this.a = profileInfoActivity;
    }

    public void onClick(View view) {
        asx jtVar = new jt(this);
        new kc(this.a, R.string.settings_dialog_title, App.p(this.a), jtVar, 25, 0, R.string.no_empty_name).show();
    }
}
