package com.whatsapp;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.ArrayList;

class mb extends Filter {
    final vf a;

    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
        if (!ContactsFragment.i(this.a.d).isEmpty()) {
            ContactsFragment.b(this.a.d, charSequence);
            ContactsFragment.d(this.a.d).clear();
            ContactsFragment.d(this.a.d).addAll((ArrayList) filterResults.values);
            if (ContactsFragment.d(this.a.d).size() == 0) {
                ContactsFragment.d(this.a.d).add(ContactsFragment.d());
            }
            ContactsFragment.d(this.a.d).add(ContactsFragment.a());
            ContactsFragment.d(this.a.d).add(ContactsFragment.c());
        }
        this.a.notifyDataSetChanged();
    }

    protected FilterResults performFiltering(CharSequence charSequence) {
        FilterResults filterResults = new FilterResults();
        ArrayList a = ContactsFragment.a(this.a.d, charSequence);
        filterResults.values = a;
        filterResults.count = a.size();
        return filterResults;
    }

    mb(vf vfVar, qq qqVar) {
        this(vfVar);
    }

    private mb(vf vfVar) {
        this.a = vfVar;
    }
}
