package com.whatsapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.R;

class f6 extends BaseAdapter {
    final MultipleContactsSelector a;

    public Object getItem(int i) {
        return this.a.k.get(i);
    }

    public int getCount() {
        return this.a.k.size();
    }

    f6(MultipleContactsSelector multipleContactsSelector, ald com_whatsapp_ald) {
        this(multipleContactsSelector);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    private f6(MultipleContactsSelector multipleContactsSelector) {
        this.a = multipleContactsSelector;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            View a = b7.a(this.a.getLayoutInflater(), R.layout.multiple_contact_selector_row, viewGroup, false);
            if (App.az == 0) {
                view = a;
            }
        }
        m8 m8Var = (m8) this.a.k.get(i);
        ((ImageView) view.findViewById(R.id.remove)).setOnClickListener(new kg(this, m8Var));
        TextView textView = (TextView) view.findViewById(R.id.participant_list_row_name);
        am1.a(textView);
        textView.setText(m8Var.a(this.a));
        MultipleContactsSelector.c(this.a).b(m8Var, (ImageView) view.findViewById(R.id.contact_photo));
        return view;
    }
}
