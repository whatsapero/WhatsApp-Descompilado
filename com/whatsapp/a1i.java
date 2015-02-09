package com.whatsapp;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;

class a1i implements TextWatcher {
    final EditText a;
    final ms b;

    a1i(ms msVar, EditText editText) {
        this.b = msVar;
        this.a = editText;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        b7.a(this.a, charSequence);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        Conversation.a8 = editable.toString();
        Conversation.b(this.b.a, Conversation.a8);
        if (TextUtils.isEmpty(Conversation.a8)) {
            Conversation.C(this.b.a);
        }
        this.b.a.aS.notifyDataSetChanged();
    }
}
