package com.whatsapp;

import android.view.KeyEvent;
import com.whatsapp.util.a5;

class xo implements tf {
    final VideoPreviewActivity a;

    public void a(int i) {
        int selectionStart = VideoPreviewActivity.l(this.a).getSelectionStart();
        int selectionEnd = VideoPreviewActivity.l(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            int i2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i2;
        }
        CharSequence stringBuilder = new StringBuilder(VideoPreviewActivity.l(this.a).getText().toString());
        stringBuilder.replace(selectionEnd, selectionStart, a5.f(i));
        if (stringBuilder.codePointCount(0, stringBuilder.length()) <= 160) {
            VideoPreviewActivity.l(this.a).setText(stringBuilder);
            VideoPreviewActivity.l(this.a).setSelection(selectionEnd + a5.h(i));
            VideoPreviewActivity.f(this.a).dismiss();
        }
    }

    public void a() {
        VideoPreviewActivity.l(this.a).dispatchKeyEvent(new KeyEvent(0, 67));
    }

    xo(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }
}
