package com.whatsapp;

import android.text.TextWatcher;
import android.widget.TextView;

class uh implements TextWatcher {
    final VideoPreviewActivity a;
    private int b;
    final TextView c;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r7) {
        /*
        r6_this = this;
        r5 = 0;
        r0 = com.whatsapp.App.az;
        r1 = r7.toString();
        r2 = r6.a;
        r2 = com.whatsapp.VideoPreviewActivity.l(r2);
        r2 = r2.getContext();
        com.whatsapp.util.a5.a(r7, r2);
        r2 = r1.length();
        r2 = r1.codePointCount(r5, r2);
        r3 = 160 - r2;
        r4 = 30;
        if (r3 >= r4) goto L_0x0034;
    L_0x0022:
        r3 = r6.c;
        r3.setVisibility(r5);
        r3 = r6.c;
        r4 = 160 - r2;
        r4 = java.lang.Integer.toString(r4);
        r3.setText(r4);
        if (r0 == 0) goto L_0x003b;
    L_0x0034:
        r3 = r6.c;
        r4 = 8;
        r3.setVisibility(r4);
    L_0x003b:
        r3 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        if (r2 < r3) goto L_0x0079;
    L_0x003f:
        r2 = r6.b;
        if (r2 != 0) goto L_0x0079;
    L_0x0043:
        r2 = r6.a;
        r2 = com.whatsapp.VideoPreviewActivity.l(r2);
        r2 = r2.getInputType();
        r6.b = r2;
        r2 = r6.b;
        if (r2 == 0) goto L_0x008a;
    L_0x0053:
        r2 = r6.a;
        r2 = com.whatsapp.VideoPreviewActivity.l(r2);
        r3 = r6.b;
        r4 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r3 = r3 | r4;
        r2.setInputType(r3);
        r2 = r6.a;
        r2 = com.whatsapp.VideoPreviewActivity.l(r2);
        r2.setText(r1);
        r2 = r6.a;
        r2 = com.whatsapp.VideoPreviewActivity.l(r2);
        r1 = r1.length();
        r2.setSelection(r1);
        if (r0 == 0) goto L_0x008a;
    L_0x0079:
        r0 = r6.b;
        if (r0 == 0) goto L_0x008a;
    L_0x007d:
        r0 = r6.a;
        r0 = com.whatsapp.VideoPreviewActivity.l(r0);
        r1 = r6.b;
        r0.setInputType(r1);
        r6.b = r5;
    L_0x008a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.uh.afterTextChanged(android.text.Editable):void");
    }

    uh(VideoPreviewActivity videoPreviewActivity, TextView textView) {
        this.a = videoPreviewActivity;
        this.c = textView;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        b7.a(VideoPreviewActivity.l(this.a), charSequence);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
