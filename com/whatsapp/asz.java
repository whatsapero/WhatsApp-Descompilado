package com.whatsapp;

import android.text.TextWatcher;

class asz implements TextWatcher {
    final VerifySms a;
    private String b;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            this.b = charSequence.toString();
        }
    }

    asz(VerifySms verifySms) {
        this.a = verifySms;
        this.b = "";
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r10) {
        /*
        r9_this = this;
        r6 = 0;
        r8 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r7 = 45;
        r3 = com.whatsapp.App.az;
        r0 = r9.a;
        r0 = com.whatsapp.VerifySms.e(r0);
        r0.removeTextChangedListener(r9);
        r0 = r9.a;
        r0 = com.whatsapp.VerifySms.e(r0);
        r1 = r0.getSelectionStart();
        r0 = r10.toString();
        r2 = java.lang.Character.toString(r8);
        r4 = "";
        r0 = r0.replace(r2, r4);
        r2 = com.whatsapp.VerifySms.D();
        r4 = r2 / 2;
        r2 = r0.length();
        if (r2 <= 0) goto L_0x0058;
    L_0x0034:
        r2 = r9.b;
        r2 = r2.startsWith(r0);
        if (r2 == 0) goto L_0x0058;
    L_0x003c:
        r2 = r9.b;
        r2 = r2.indexOf(r7);
        if (r2 < 0) goto L_0x0058;
    L_0x0044:
        r2 = r0.indexOf(r7);
        if (r2 >= 0) goto L_0x0058;
    L_0x004a:
        r2 = r0.length();
        r2 = r2 + -1;
        r0 = r0.substring(r6, r2);
        r1 = r1 + -1;
        if (r3 == 0) goto L_0x006a;
    L_0x0058:
        r2 = r0.length();
        if (r2 <= r1) goto L_0x006a;
    L_0x005e:
        r2 = r0.indexOf(r7);
        if (r2 != r1) goto L_0x006a;
    L_0x0064:
        r2 = r4 + 1;
        if (r1 != r2) goto L_0x006a;
    L_0x0068:
        r1 = r1 + 1;
    L_0x006a:
        r2 = java.lang.Character.toString(r7);
        r5 = "";
        r2 = r0.replace(r2, r5);
        r0 = r2.length();
        if (r0 <= r4) goto L_0x007c;
    L_0x007a:
        r0 = r0 + 1;
    L_0x007c:
        r5 = r2.length();
        if (r5 >= r4) goto L_0x0095;
    L_0x0082:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r2 = r5.append(r2);
        r2 = r2.append(r8);
        r2 = r2.toString();
        if (r3 == 0) goto L_0x007c;
    L_0x0095:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = r2.substring(r6, r4);
        r5 = r5.append(r6);
        r5 = r5.append(r7);
        r6 = com.whatsapp.VerifySms.D();
        r7 = r2.length();
        r6 = java.lang.Math.min(r6, r7);
        r2 = r2.substring(r4, r6);
        r2 = r5.append(r2);
        r2 = r2.toString();
    L_0x00be:
        r4 = r2.length();
        r5 = com.whatsapp.VerifySms.D();
        r5 = r5 + 1;
        if (r4 >= r5) goto L_0x00dd;
    L_0x00ca:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r2 = r4.append(r2);
        r2 = r2.append(r8);
        r2 = r2.toString();
        if (r3 == 0) goto L_0x00be;
    L_0x00dd:
        r3 = r9.a;
        r3 = com.whatsapp.VerifySms.e(r3);
        r3.setText(r2);
        r2 = r2.length();
        r0 = java.lang.Math.min(r0, r2);
        r2 = r9.a;
        r2 = com.whatsapp.VerifySms.e(r2);
        r0 = java.lang.Math.min(r1, r0);
        r2.setSelection(r0);
        r0 = r9.a;
        r0 = com.whatsapp.VerifySms.e(r0);
        r0.addTextChangedListener(r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.asz.afterTextChanged(android.text.Editable):void");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            String replace = charSequence.toString().replace(Character.toString('\u00a0'), "").replace(Character.toString('-'), "");
            if (replace.length() == VerifySms.D()) {
                if (VerifySms.b(this.a, replace)) {
                    a5w.a(new rn(this.a), new String[]{replace});
                    if (App.az == 0) {
                        return;
                    }
                }
                if (!this.a.isFinishing()) {
                    this.a.showDialog(33);
                }
            }
        }
    }
}
