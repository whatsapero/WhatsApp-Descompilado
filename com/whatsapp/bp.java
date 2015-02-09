package com.whatsapp;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.LayoutParams;

public class bp {
    public static View a(Activity activity, ActionBar actionBar, String str, OnClickListener onClickListener) {
        View a = b7.a(activity.getLayoutInflater(), R.layout.actionbar_text_button, null, false);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = App.as() ? 5 : 3;
        actionBar.setCustomView(a, layoutParams);
        ((TextView) a.findViewById(R.id.action_done_text)).setText(str.toUpperCase());
        a.findViewById(R.id.action_done).setOnClickListener(onClickListener);
        return a;
    }
}
