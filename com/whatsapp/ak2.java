package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.contact.j;
import java.util.List;

class ak2 extends ArrayAdapter {
    private final List a;
    private final LayoutInflater b;

    public ak2(Context context, int i, List list) {
        super(context, i, list);
        this.b = LayoutInflater.from(context);
        this.a = list;
    }

    public boolean isEnabled(int i) {
        return false;
    }

    public int getCount() {
        return Math.max(1, super.getCount());
    }

    public int getViewTypeCount() {
        return 2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.a.isEmpty()) {
            view = this.b.inflate(R.layout.multiple_contact_picker_row_empty, viewGroup, false);
            ((TextView) view.findViewById(R.id.tv)).setText(R.string.contacts_help_no_invisible_contacts);
            view.setTag(Integer.valueOf(2));
            view.setClickable(false);
            return view;
        }
        if (view == null || ((Integer) view.getTag()).intValue() != 1) {
            View inflate = this.b.inflate(R.layout.contact_picker_help_row, viewGroup, false);
            if (App.az == 0) {
                view = inflate;
            }
        }
        TextView textView = (TextView) view.findViewById(R.id.number);
        j jVar = (j) getItem(i);
        ((TextView) view.findViewById(R.id.name)).setText(jVar.g());
        textView.setText(jVar.a());
        view.setTag(Integer.valueOf(2));
        view.setBackgroundColor(getContext().getResources().getColor(i % 2 == 0 ? R.color.row_1 : R.color.row_2));
        return view;
    }

    public boolean areAllItemsEnabled() {
        return false;
    }
}
