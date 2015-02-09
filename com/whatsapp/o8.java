package com.whatsapp;

import android.database.Observable;
import java.util.Iterator;

public class o8 extends Observable {
    public void b(String str) {
        int i = App.az;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((ase) it.next()).b(str);
            if (i != 0) {
                return;
            }
        }
    }

    public void c(String str) {
        int i = App.az;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((ase) it.next()).c(str);
            if (i != 0) {
                return;
            }
        }
    }

    public void a(String str) {
        int i = App.az;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((ase) it.next()).a(str);
            if (i != 0) {
                return;
            }
        }
    }

    public void a(String str, boolean z) {
        int i = App.az;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((ase) it.next()).a(str, z);
            if (i != 0) {
                return;
            }
        }
    }

    public void d(String str) {
        int i = App.az;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((ase) it.next()).d(str);
            if (i != 0) {
                return;
            }
        }
    }
}
