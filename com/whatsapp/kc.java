package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.util.a5;

public class kc extends k4 {
    private final int c;
    private final Context d;
    private final int e;
    private final int f;
    private a11 g;
    private final int h;
    private final Activity i;
    private final asx j;
    private final String k;
    private boolean l;
    private EditText m;
    private TextView n;
    private String o;

    static Context c(kc kcVar) {
        return kcVar.d;
    }

    static TextView f(kc kcVar) {
        return kcVar.n;
    }

    static EditText e(kc kcVar) {
        return kcVar.m;
    }

    static int h(kc kcVar) {
        return kcVar.f;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((TextView) findViewById(R.id.dialog_title)).setText(this.c);
        setTitle(this.c);
        ((Button) findViewById(R.id.ok_btn)).setOnClickListener(new a51(this));
        ((Button) findViewById(R.id.cancel_btn)).setOnClickListener(new a1v(this));
        this.n = (TextView) findViewById(R.id.counter_tv);
        this.m = (EditText) findViewById(R.id.edit_text);
        if (this.f > 0) {
            this.n.setVisibility(0);
            this.m.setFilters(new InputFilter[]{new alk(this.f)});
        }
        this.m.addTextChangedListener(new a8_(this));
        b7.a(this.m);
        LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.gravity = 48;
        getWindow().setAttributes(attributes);
        this.g = new a11(this.i);
        this.g.a(new sw(this));
        ((ImageButton) findViewById(R.id.emoji_btn)).setOnClickListener(new r2(this));
        setOnCancelListener(new a2(this));
        getWindow().setSoftInputMode(5);
    }

    static String a(kc kcVar, String str) {
        kcVar.o = str;
        return str;
    }

    static asx g(kc kcVar) {
        return kcVar.j;
    }

    public void onStop() {
        super.onStop();
        if (this.l) {
            this.o = this.m.getText().toString();
        }
    }

    public void onStart() {
        String str;
        super.onStart();
        if (this.o != null) {
            str = this.o;
        } else {
            str = this.k;
        }
        if (this.e != 0) {
            this.m.setHint(this.e);
        }
        this.m.setText(a5.d(str, this.d));
        if (str != null) {
            this.m.selectAll();
        }
    }

    static Activity d(kc kcVar) {
        return kcVar.i;
    }

    static a11 a(kc kcVar) {
        return kcVar.g;
    }

    public kc(Activity activity, int i, String str, asx com_whatsapp_asx, int i2, int i3, int i4) {
        super(activity, R.layout.emoji_edittext_dialog);
        this.l = true;
        this.i = activity;
        this.d = activity.getBaseContext();
        this.j = com_whatsapp_asx;
        this.c = i;
        this.f = i2;
        this.e = i3;
        this.h = i4;
        this.k = str;
    }

    static boolean a(kc kcVar, boolean z) {
        kcVar.l = z;
        return z;
    }

    static int b(kc kcVar) {
        return kcVar.h;
    }
}
