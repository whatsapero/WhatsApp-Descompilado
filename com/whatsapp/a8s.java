package com.whatsapp;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

class a8s implements OnEditorActionListener {
    final WebImagePicker a;

    a8s(WebImagePicker webImagePicker) {
        this.a = webImagePicker;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        WebImagePicker.l(this.a);
        return true;
    }
}
