package com.whatsapp.util;

import android.widget.ImageView;
import com.whatsapp.protocol.b;
import java.util.Iterator;
import java.util.Stack;

class a8 {
    private Stack a;
    final bo b;

    static Stack a(a8 a8Var) {
        return a8Var.a;
    }

    a8(bo boVar) {
        this.b = boVar;
        this.a = new Stack();
    }

    public boolean a(b bVar) {
        int i = Log.e;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (!((av) it.next()).c.e.equals(bVar.e)) {
                if (i != 0) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public void a(ImageView imageView) {
        int i = Log.e;
        int i2 = 0;
        while (i2 < this.a.size()) {
            if (((av) this.a.get(i2)).d == imageView) {
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
}
