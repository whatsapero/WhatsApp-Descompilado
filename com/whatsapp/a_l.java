package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.protocol.b;
import java.util.ArrayList;
import java.util.Iterator;

class a_l extends AsyncTask {
    final s3 a;
    final jg b;

    a_l(jg jgVar, s3 s3Var) {
        this.b = jgVar;
        this.a = s3Var;
    }

    protected void onPostExecute(Object obj) {
        a((ArrayList) obj);
    }

    protected ArrayList a(Void[] voidArr) {
        return App.aJ.a(System.currentTimeMillis() - 86400000, 32);
    }

    protected void a(ArrayList arrayList) {
        int i = App.az;
        int aY = App.aY();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (App.n(bVar) && App.a(aY, bVar)) {
                this.a.a(bVar);
                continue;
            }
            if (i != 0) {
                return;
            }
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
