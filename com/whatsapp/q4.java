package com.whatsapp;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.ArrayList;
import java.util.Iterator;

class q4 extends Filter {
    final a3s a;

    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
        a3s.a(this.a, (ArrayList) filterResults.values);
        this.a.notifyDataSetChanged();
    }

    public CharSequence convertResultToString(Object obj) {
        return (obj == null || !(obj instanceof m8)) ? super.convertResultToString(obj) : ((m8) obj).a(this.a.b);
    }

    protected FilterResults performFiltering(CharSequence charSequence) {
        int i = App.az;
        FilterResults filterResults = new FilterResults();
        if (charSequence != null && charSequence.length() > 0) {
            ArrayList arrayList = new ArrayList();
            String toLowerCase = charSequence.toString().toLowerCase();
            Iterator it = MultipleContactsSelector.a(this.a.b).iterator();
            while (it.hasNext()) {
                m8 m8Var = (m8) it.next();
                String toLowerCase2 = m8Var.a(this.a.b).toLowerCase();
                if ((toLowerCase2.startsWith(toLowerCase) || toLowerCase2.contains(" " + toLowerCase)) && !MultipleContactsSelector.a(this.a.b, m8Var.e)) {
                    arrayList.add(m8Var);
                    continue;
                }
                if (i != 0) {
                    break;
                }
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
        }
        return filterResults;
    }

    private q4(a3s com_whatsapp_a3s) {
        this.a = com_whatsapp_a3s;
    }

    q4(a3s com_whatsapp_a3s, ald com_whatsapp_ald) {
        this(com_whatsapp_a3s);
    }
}
