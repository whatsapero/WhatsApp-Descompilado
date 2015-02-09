package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import com.whatsapp.util.a5;

class a__ implements TextWatcher {
    final ProfilePhotoReminder a;
    int b;

    public void afterTextChanged(Editable editable) {
        Object toString = editable.toString();
        a5.a(editable, this.a);
        ProfilePhotoReminder.e(this.a).setText(Integer.toString(25 - toString.length()));
        if (toString.length() >= 25 && this.b == 0) {
            this.b = ProfilePhotoReminder.d(this.a).getInputType();
            if (this.b != 0) {
                ProfilePhotoReminder.d(this.a).setInputType(this.b | 524288);
                ProfilePhotoReminder.d(this.a).setText(toString);
                ProfilePhotoReminder.d(this.a).setSelection(toString.length());
                if (App.az == 0) {
                    return;
                }
            }
            return;
        }
        if (this.b != 0) {
            ProfilePhotoReminder.d(this.a).setInputType(this.b);
            this.b = 0;
        }
    }

    a__(ProfilePhotoReminder profilePhotoReminder) {
        this.a = profilePhotoReminder;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        b7.a(ProfilePhotoReminder.d(this.a), charSequence);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
