package com.whatsapp;

import com.whatsapp.protocol.b;
import java.util.Collection;
import java.util.Map;

class gv extends fc {
    final ContactInfo a;

    gv(ContactInfo contactInfo) {
        this.a = contactInfo;
    }

    public void a(Collection collection, Map map) {
        int i = App.az;
        for (b bVar : collection) {
            if (bVar.e.c.equals(ContactInfo.e(this.a).e) && (bVar.j == 1 || bVar.j == 3 || bVar.j == 2)) {
                ContactInfo.g(this.a);
                if (i == 0) {
                    return;
                }
            }
            if (i != 0) {
                return;
            }
        }
    }

    public void b(b bVar, int i) {
        if (bVar != null && bVar.e.c.equals(ContactInfo.e(this.a).e) && !bVar.e.b) {
            if ((bVar.j == 1 || bVar.j == (byte) 3 || bVar.j == 2) && i == 3) {
                ContactInfo.g(this.a);
            }
        }
    }
}
