package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

public class d extends BaseAdapter implements a {
    private ListAdapter a;
    private DataSetObserver b;

    public View a(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    public int getCount() {
        return this.a.getCount();
    }

    public Object getItem(int i) {
        return this.a.getItem(i);
    }

    public long getItemId(int i) {
        return this.a.getItemId(i);
    }

    public d(ListAdapter listAdapter) {
        this.b = new g(this);
        this.a = listAdapter;
        listAdapter.registerDataSetObserver(this.b);
    }

    public int a() {
        return 0;
    }

    public int a(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.a.getView(i, view, viewGroup);
    }
}
