package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Iterator;

class avh implements OnClickListener {
    final WebImagePicker a;

    public void onClick(View view) {
        int i = App.az;
        String str = (String) view.getTag();
        if (str != null && WebImagePicker.g(this.a) != null) {
            Iterator it = WebImagePicker.c(this.a).iterator();
            while (it.hasNext()) {
                d6 d6Var = (d6) it.next();
                if (str.equals(d6Var.d)) {
                    WebImagePicker.a(this.a, d6Var);
                    if (i == 0) {
                        return;
                    }
                }
                if (i != 0) {
                    return;
                }
            }
        }
    }

    avh(WebImagePicker webImagePicker) {
        this.a = webImagePicker;
    }
}
