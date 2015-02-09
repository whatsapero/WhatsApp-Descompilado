package com.whatsapp.gallerypicker;

import android.net.Uri;
import android.text.TextWatcher;
import android.widget.TextView;
import com.whatsapp.ConversationTextEntry;
import com.whatsapp.b7;

class i implements TextWatcher {
    final s a;
    final ConversationTextEntry b;
    final Uri c;
    final TextView d;
    private int e;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r7) {
        /*
        r6_this = this;
        r5 = 0;
        r0 = com.whatsapp.gallerypicker.ImagePreview.y;
        r1 = r7.toString();
        r2 = r6.b;
        r2 = r2.getContext();
        com.whatsapp.util.a5.a(r7, r2);
        r2 = r1.length();
        r2 = r1.codePointCount(r5, r2);
        r3 = 160 - r2;
        r4 = 30;
        if (r3 >= r4) goto L_0x0030;
    L_0x001e:
        r3 = r6.d;
        r3.setVisibility(r5);
        r3 = r6.d;
        r4 = 160 - r2;
        r4 = java.lang.Integer.toString(r4);
        r3.setText(r4);
        if (r0 == 0) goto L_0x0037;
    L_0x0030:
        r3 = r6.d;
        r4 = 8;
        r3.setVisibility(r4);
    L_0x0037:
        r3 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        if (r2 < r3) goto L_0x0065;
    L_0x003b:
        r2 = r6.e;
        if (r2 != 0) goto L_0x0065;
    L_0x003f:
        r2 = r6.b;
        r2 = r2.getInputType();
        r6.e = r2;
        r2 = r6.e;
        if (r2 == 0) goto L_0x0072;
    L_0x004b:
        r2 = r6.b;
        r3 = r6.e;
        r4 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r3 = r3 | r4;
        r2.setInputType(r3);
        r2 = r6.b;
        r2.setText(r1);
        r2 = r6.b;
        r3 = r1.length();
        r2.setSelection(r3);
        if (r0 == 0) goto L_0x0072;
    L_0x0065:
        r2 = r6.e;
        if (r2 == 0) goto L_0x0072;
    L_0x0069:
        r2 = r6.b;
        r3 = r6.e;
        r2.setInputType(r3);
        r6.e = r5;
    L_0x0072:
        r2 = android.text.TextUtils.isEmpty(r1);
        if (r2 == 0) goto L_0x0087;
    L_0x0078:
        r2 = r6.a;
        r2 = r2.a;
        r2 = com.whatsapp.gallerypicker.ImagePreview.b(r2);
        r3 = r6.c;
        r2.remove(r3);
        if (r0 == 0) goto L_0x0098;
    L_0x0087:
        r0 = r6.a;
        r0 = r0.a;
        r0 = com.whatsapp.gallerypicker.ImagePreview.b(r0);
        r2 = r6.c;
        r1 = r1.toString();
        r0.put(r2, r1);
    L_0x0098:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.i.afterTextChanged(android.text.Editable):void");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        b7.a(this.b, charSequence);
    }

    i(s sVar, ConversationTextEntry conversationTextEntry, TextView textView, Uri uri) {
        this.a = sVar;
        this.b = conversationTextEntry;
        this.d = textView;
        this.c = uri;
    }
}
