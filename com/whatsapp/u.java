package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import com.whatsapp.util.a5;

class u implements TextWatcher {
    private int a;
    final NewGroup b;

    u(NewGroup newGroup) {
        this.b = newGroup;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        Object toString = editable.toString();
        a5.a(editable, this.b);
        int codePointCount = toString.codePointCount(0, toString.length());
        NewGroup.c(this.b).setText(Integer.toString(ge.s - codePointCount));
        if (codePointCount >= ge.s && this.a == 0) {
            this.a = NewGroup.b(this.b).getInputType();
            if (this.a != 0) {
                NewGroup.b(this.b).setInputType(this.a | 524288);
                NewGroup.b(this.b).setText(toString);
                NewGroup.b(this.b).setSelection(toString.length());
                if (App.az == 0) {
                    return;
                }
            }
            return;
        }
        if (this.a != 0) {
            NewGroup.b(this.b).setInputType(this.a);
            this.a = 0;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        b7.a(NewGroup.b(this.b), charSequence);
    }
}
