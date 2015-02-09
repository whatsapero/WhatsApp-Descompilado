package com.whatsapp.camera;

import android.view.KeyEvent;
import com.whatsapp.tf;
import com.whatsapp.util.a5;

class ak implements tf {
    final CameraActivity a;

    ak(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public void a() {
        CameraActivity.a(this.a).dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void a(int i) {
        int selectionStart = CameraActivity.a(this.a).getSelectionStart();
        int selectionEnd = CameraActivity.a(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            int i2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i2;
        }
        CharSequence stringBuilder = new StringBuilder(CameraActivity.a(this.a).getText().toString());
        stringBuilder.replace(selectionEnd, selectionStart, a5.f(i));
        if (stringBuilder.codePointCount(0, stringBuilder.length()) <= 160) {
            CameraActivity.a(this.a).setText(stringBuilder);
            CameraActivity.a(this.a).setSelection(selectionEnd + a5.h(i));
            CameraActivity.k(this.a).dismiss();
        }
    }
}
