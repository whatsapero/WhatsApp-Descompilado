package com.whatsapp;

import android.text.TextUtils;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.ArrayList;
import java.util.ListIterator;

class cg extends Filter {
    final CallsFragment a;

    protected FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        int i = App.az;
        FilterResults filterResults = new FilterResults();
        if (!TextUtils.isEmpty(charSequence)) {
            ArrayList arrayList2;
            synchronized (CallsFragment.g(this.a)) {
                arrayList2 = new ArrayList(CallsFragment.g(this.a));
            }
            String toLowerCase = charSequence.toString().toLowerCase();
            ListIterator listIterator = arrayList2.listIterator();
            while (listIterator.hasNext()) {
                if (!((lz) listIterator.next()).d().c(toLowerCase)) {
                    listIterator.remove();
                    continue;
                }
                if (i != 0) {
                    break;
                }
            }
            if (i == 0) {
                arrayList = arrayList2;
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
                return filterResults;
            }
        }
        arrayList = CallsFragment.g(this.a);
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    cg(CallsFragment callsFragment, co coVar) {
        this(callsFragment);
    }

    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
        if (this.a.getView() != null) {
            CallsFragment.f(this.a);
        }
        CallsFragment.a(this.a, (ArrayList) filterResults.values);
        if (CallsFragment.h(this.a) == null) {
            CallsFragment.a(this.a, CallsFragment.g(this.a));
        }
        CallsFragment.a(this.a, charSequence);
        CallsFragment.c(this.a).notifyDataSetChanged();
    }

    private cg(CallsFragment callsFragment) {
        this.a = callsFragment;
    }
}
