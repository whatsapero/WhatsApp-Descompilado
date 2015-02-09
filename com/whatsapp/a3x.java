package com.whatsapp;

import android.database.Observable;
import java.util.ArrayList;
import java.util.Iterator;

class a3x extends Observable {
    public void a(atf com_whatsapp_atf, long j, long j2) {
        int i = App.az;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((a3a) it.next()).a(com_whatsapp_atf, j, j2);
            if (i != 0) {
                return;
            }
        }
    }

    a3x(alx com_whatsapp_alx) {
        this();
    }

    private a3x() {
    }

    public void a(atf com_whatsapp_atf, long j, long j2, ArrayList arrayList) {
        int i = App.az;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((a3a) it.next()).a(com_whatsapp_atf, j, j2, arrayList);
            if (i != 0) {
                return;
            }
        }
    }
}
