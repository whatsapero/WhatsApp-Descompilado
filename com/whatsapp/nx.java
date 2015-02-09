package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import com.whatsapp.util.a5;

class nx implements TextWatcher {
    final RegisterName a;
    int b;

    public void afterTextChanged(Editable editable) {
        Object toString = editable.toString();
        a5.a(editable, this.a);
        RegisterName.d(this.a).setText(Integer.toString(25 - toString.length()));
        if (toString.length() >= 25 && this.b == 0) {
            this.b = RegisterName.a(this.a).getInputType();
            if (this.b != 0) {
                RegisterName.a(this.a).setInputType(this.b | 524288);
                RegisterName.a(this.a).setText(toString);
                RegisterName.a(this.a).setSelection(toString.length());
                if (App.az == 0) {
                    return;
                }
            }
            return;
        }
        if (this.b != 0) {
            RegisterName.a(this.a).setInputType(this.b);
            this.b = 0;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        b7.a(RegisterName.a(this.a), charSequence);
    }

    nx(RegisterName registerName) {
        this.a = registerName;
    }
}
