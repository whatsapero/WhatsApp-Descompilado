package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class a_j extends AsyncTask {
    final CallsFragment a;

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    a_j(CallsFragment callsFragment, co coVar) {
        this(callsFragment);
    }

    protected void a(ArrayList[] arrayListArr) {
        Collection collection = arrayListArr[0];
        if (collection != null) {
            synchronized (CallsFragment.g(this.a)) {
                CallsFragment.g(this.a).clear();
                CallsFragment.g(this.a).addAll(collection);
            }
            CallsFragment.c(this.a).notifyDataSetChanged();
        }
    }

    private a_j(CallsFragment callsFragment) {
        this.a = callsFragment;
    }

    protected void onPostExecute(Object obj) {
        a((ArrayList) obj);
    }

    protected void onProgressUpdate(Object[] objArr) {
        a((ArrayList[]) objArr);
    }

    protected void a(ArrayList arrayList) {
        if (arrayList != null) {
            synchronized (CallsFragment.g(this.a)) {
                CallsFragment.g(this.a).clear();
                CallsFragment.g(this.a).addAll(arrayList);
            }
            CallsFragment.c(this.a).getFilter().filter(CallsFragment.b(this.a));
        }
        CallsFragment.f(this.a);
        CallsFragment.e(this.a);
    }

    protected ArrayList a(Void[] voidArr) {
        int i = App.az;
        c4 gbVar = new gb(this);
        ArrayList a = App.aJ.a(0, 100, gbVar);
        if (isCancelled()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        lz lzVar = new lz(this.a);
        m g = Voip.g();
        Iterator it = a.iterator();
        lz lzVar2 = lzVar;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.e.equals(g) || lzVar2.a(bVar)) {
                lzVar = lzVar2;
            } else {
                arrayList.add(lzVar2);
                lzVar = new lz(this.a, bVar);
            }
            if (i != 0) {
                break;
            }
            lzVar2 = lzVar;
        }
        lzVar = lzVar2;
        if (a.size() >= 100) {
            publishProgress(new ArrayList[]{arrayList});
            ArrayList a2 = App.aJ.a(100, 1000, gbVar);
            if (isCancelled()) {
                return null;
            }
            Iterator it2 = a2.iterator();
            lzVar2 = lzVar;
            while (it2.hasNext()) {
                bVar = (b) it2.next();
                if (lzVar2.a(bVar)) {
                    lzVar = lzVar2;
                } else {
                    arrayList.add(lzVar2);
                    lzVar = new lz(this.a, bVar);
                }
                if (i != 0) {
                    break;
                }
                lzVar2 = lzVar;
            }
            lzVar = lzVar2;
        }
        if (!lzVar.e()) {
            arrayList.add(lzVar);
        }
        return arrayList;
    }
}
