package com.whatsapp;

import android.widget.ImageView;
import java.util.Stack;

final class s7 {
    private final Stack a;

    private s7() {
        this.a = new Stack();
    }

    public void a(ImageView imageView) {
        int i = App.az;
        int i2 = 0;
        while (i2 < this.a.size()) {
            if (((t6) this.a.get(i2)).b == imageView) {
                this.a.remove(i2);
                if (i == 0) {
                    continue;
                }
            }
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    s7(xr xrVar) {
        this();
    }

    static Stack a(s7 s7Var) {
        return s7Var.a;
    }
}
