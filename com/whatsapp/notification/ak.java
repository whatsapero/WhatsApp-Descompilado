package com.whatsapp.notification;

import com.whatsapp.protocol.b;
import java.util.Comparator;

class ak implements Comparator {
    final PopupNotification a;

    ak(PopupNotification popupNotification) {
        this.a = popupNotification;
    }

    public int compare(Object obj, Object obj2) {
        return a((b) obj, (b) obj2);
    }

    public int a(b bVar, b bVar2) {
        if (bVar.D == bVar2.D) {
            return 0;
        }
        return bVar.D < bVar2.D ? 1 : -1;
    }
}
