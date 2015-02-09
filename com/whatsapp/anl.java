package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.actionbarsherlock.R;

class anl implements OnClickListener {
    final RegisterName a;

    anl(RegisterName registerName) {
        this.a = registerName;
    }

    public void onClick(View view) {
        ((CheckBox) this.a.findViewById(R.id.cbx_app_shortcut)).toggle();
    }
}
