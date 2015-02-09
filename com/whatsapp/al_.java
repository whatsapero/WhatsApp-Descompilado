package com.whatsapp;

import android.app.PendingIntent;
import android.database.Observable;
import java.util.Iterator;

class al_ extends Observable {
    public void a(hs hsVar) {
        int i = App.az;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((xg) it.next()).a(hsVar);
            if (i != 0) {
                return;
            }
        }
    }

    public void a(int i) {
        int i2 = App.az;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((xg) it.next()).a(i);
            if (i2 != 0) {
                return;
            }
        }
    }

    al_(xz xzVar) {
        this();
    }

    public void a(PendingIntent pendingIntent) {
        int i = App.az;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((xg) it.next()).a(pendingIntent);
            if (i != 0) {
                return;
            }
        }
    }

    public void a() {
        int i = App.az;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((xg) it.next()).a();
            if (i != 0) {
                return;
            }
        }
    }

    private al_() {
    }

    public void a(Integer num, String[] strArr) {
        int i = App.az;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((xg) it.next()).a(num, strArr);
            if (i != 0) {
                return;
            }
        }
    }
}
