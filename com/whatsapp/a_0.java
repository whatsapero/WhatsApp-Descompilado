package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import java.util.HashMap;

class a_0 implements OnItemLongClickListener {
    final ContactsFragment a;
    final ListView b;

    public boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        vf vfVar = (vf) this.b.getAdapter();
        if (!(vf.b(vfVar, i) || vf.c(vfVar, i) || vf.a(vfVar, i))) {
            m8 a = vfVar.a(i);
            if (a.q) {
                if (App.c(a.e)) {
                    return false;
                }
                ContactsFragment.a(this.a, new HashMap());
                ContactsFragment.k(this.a).put(a.e, a);
                this.a.g();
                ContactsFragment.j(this.a);
            }
        }
        return true;
    }

    a_0(ContactsFragment contactsFragment, ListView listView) {
        this.a = contactsFragment;
        this.b = listView;
    }
}
