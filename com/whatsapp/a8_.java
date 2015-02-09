package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import com.whatsapp.util.a5;

class a8_ implements TextWatcher {
    private int a;
    final kc b;

    public void afterTextChanged(Editable editable) {
        Object toString = editable.toString();
        a5.a(editable, kc.c(this.b));
        if (kc.h(this.b) > 0) {
            int codePointCount = toString.codePointCount(0, toString.length());
            kc.f(this.b).setText(Integer.toString(kc.h(this.b) - codePointCount));
            if (codePointCount >= kc.h(this.b) && this.a == 0) {
                this.a = kc.e(this.b).getInputType();
                if (this.a != 0) {
                    kc.e(this.b).setInputType(this.a | 524288);
                    kc.e(this.b).setText(toString);
                    kc.e(this.b).setSelection(toString.length());
                    if (App.az == 0) {
                        return;
                    }
                }
                return;
            }
            if (this.a != 0) {
                kc.e(this.b).setInputType(this.a);
                this.a = 0;
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        b7.a(kc.e(this.b), charSequence);
    }

    a8_(kc kcVar) {
        this.b = kcVar;
    }
}
