package com.whatsapp;

import com.whatsapp.protocol.b;
import java.util.Comparator;

class ey implements Comparator {
    final aku a;

    public int compare(Object obj, Object obj2) {
        return a((b) obj, (b) obj2);
    }

    ey(aku com_whatsapp_aku) {
        this.a = com_whatsapp_aku;
    }

    public int a(b bVar, b bVar2) {
        if (bVar.D == bVar2.D) {
            return 0;
        }
        return bVar.D < bVar2.D ? 1 : -1;
    }
}
