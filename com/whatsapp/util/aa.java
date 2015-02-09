package com.whatsapp.util;

import android.widget.ImageView;
import java.util.Stack;

class aa {
    private Stack a;
    final bw b;

    public void a(ImageView imageView) {
        int i = Log.e;
        int i2 = 0;
        while (i2 < this.a.size()) {
            if (((i) this.a.get(i2)).a == imageView) {
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

    aa(bw bwVar) {
        this.b = bwVar;
        this.a = new Stack();
    }

    static Stack a(aa aaVar) {
        return aaVar.a;
    }
}
