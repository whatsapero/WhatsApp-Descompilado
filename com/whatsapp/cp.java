package com.whatsapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.KeyEvent;

public class cp extends ProgressDialog {
    public cp(Context context) {
        super(context);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return i == 84 ? true : super.onKeyDown(i, keyEvent);
    }
}
