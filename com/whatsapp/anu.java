package com.whatsapp;

import android.app.Dialog;
import android.os.Bundle;
import android.view.WindowManager.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.actionbarsherlock.R;

public class anu extends Dialog {
    private lb a;
    EditText b;
    private String c;
    private int d;
    final InputMethodManager e;
    private String f;

    private void a() {
        if (!this.e.isFullscreenMode()) {
            this.e.toggleSoftInput(2, 0);
        }
    }

    public void onStart() {
        super.onStart();
        a();
        this.b.setText(App.P.f(this.f).a(getContext()));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.edittext_dialog);
        ((TextView) findViewById(R.id.dialog_title)).setText(this.d);
        ((Button) findViewById(R.id.ok_btn)).setOnClickListener(new v3(this, null));
        ((Button) findViewById(R.id.cancel_btn)).setOnClickListener(new av7(this));
        this.b = (EditText) findViewById(R.id.saved_search_et);
        this.b.setText(this.c);
        b7.a(this.b);
        this.b.addTextChangedListener(new _w(this));
        LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.gravity = 48;
        getWindow().setAttributes(attributes);
    }

    static lb a(anu com_whatsapp_anu) {
        return com_whatsapp_anu.a;
    }

    static void b(anu com_whatsapp_anu) {
        com_whatsapp_anu.a();
    }
}
