package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.widget.EditText;

class am0 implements OnClickListener {
    final VerifySms a;
    final EditText b;

    public void onClick(DialogInterface dialogInterface, int i) {
        Object trim = this.b.getText().toString().trim();
        if (TextUtils.isEmpty(trim) || trim.length() != VerifySms.D()) {
            this.a.removeDialog(32);
            this.a.showDialog(33);
            if (App.az == 0) {
                return;
            }
        }
        this.a.removeDialog(32);
        a5w.a(new rn(this.a), new String[]{trim});
    }

    am0(VerifySms verifySms, EditText editText) {
        this.a = verifySms;
        this.b = editText;
    }
}
