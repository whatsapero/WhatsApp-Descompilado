package com.tonicartos.widget.stickygridheaders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p extends BaseAdapter implements a {
    private List a;
    private q b;

    public p(q qVar) {
        this.b = qVar;
        qVar.registerDataSetObserver(new u(this, null));
        this.a = a(qVar);
    }

    public int a() {
        return this.a.size();
    }

    public View a(int i, View view, ViewGroup viewGroup) {
        return this.b.a(((f) this.a.get(i)).a(), view, viewGroup);
    }

    public int a(int i) {
        return ((f) this.a.get(i)).c();
    }

    public Object getItem(int i) {
        return this.b.getItem(i);
    }

    public long getItemId(int i) {
        return this.b.getItemId(i);
    }

    public int getCount() {
        return this.b.getCount();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.b.getView(i, view, viewGroup);
    }

    static List a(p pVar, List list) {
        pVar.a = list;
        return list;
    }

    static q a(p pVar) {
        return pVar.b;
    }

    protected List a(q qVar) {
        boolean z = StickyGridHeadersGridView.i;
        Map hashMap = new HashMap();
        List arrayList = new ArrayList();
        int i = 0;
        while (i < qVar.getCount()) {
            long a = qVar.a(i);
            f fVar = (f) hashMap.get(Long.valueOf(a));
            if (fVar == null) {
                fVar = new f(this, i);
                arrayList.add(fVar);
            }
            fVar.b();
            hashMap.put(Long.valueOf(a), fVar);
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return arrayList;
    }
}
