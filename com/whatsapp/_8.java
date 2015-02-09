package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;

class _8 implements OnClickListener {
    final VoipActivity a;

    _8(VoipActivity voipActivity) {
        this.a = voipActivity;
    }

    public void onClick(View view) {
        View findViewById = this.a.findViewById(R.id.call_debug_view);
        View findViewById2 = this.a.findViewById(R.id.call_profile_layout);
        if (findViewById != null) {
            if (findViewById.getVisibility() == 0) {
                findViewById.setVisibility(8);
                findViewById2.setVisibility(0);
                if (App.az == 0) {
                    return;
                }
            }
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
        }
    }
}
