package com.whatsapp;

import com.whatsapp.util.a5;

class g0 implements tf {
    final ProfilePhotoReminder a;

    public void a(int i) {
        ProfilePhotoReminder.c(this.a).dismiss();
        int selectionStart = ProfilePhotoReminder.d(this.a).getSelectionStart();
        int selectionEnd = ProfilePhotoReminder.d(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            int i2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i2;
        }
        CharSequence stringBuilder = new StringBuilder(ProfilePhotoReminder.d(this.a).getText().toString());
        stringBuilder.replace(selectionEnd, selectionStart, a5.f(i));
        if (stringBuilder.length() <= 25) {
            ProfilePhotoReminder.d(this.a).setText(stringBuilder);
            if (selectionEnd <= ProfilePhotoReminder.d(this.a).length() - a5.h(i)) {
                ProfilePhotoReminder.d(this.a).setSelection(selectionEnd + a5.h(i));
            }
        }
    }

    public void a() {
    }

    g0(ProfilePhotoReminder profilePhotoReminder) {
        this.a = profilePhotoReminder;
    }
}
