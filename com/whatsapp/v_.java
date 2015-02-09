package com.whatsapp;

import android.content.Context;
import android.text.TextUtils;
import android.widget.SectionIndexer;
import java.util.ArrayList;

class v_ extends vf implements SectionIndexer {
    final ContactsFragment e;
    private ArrayList f;
    private ArrayList g;

    public int getSectionForPosition(int i) {
        int i2 = App.az;
        if (i < 0) {
            return 0;
        }
        if (i >= this.a.size()) {
            return this.f.size() - 1;
        }
        int size = this.g.size() - 1;
        while (size >= 0) {
            if (((Integer) this.g.get(size)).intValue() > i) {
                size--;
                if (i2 != 0) {
                    break;
                }
            }
            return size;
        }
        return 0;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        a();
    }

    public Object[] getSections() {
        return this.f.toArray(new String[1]);
    }

    public v_(ContactsFragment contactsFragment, Context context, ArrayList arrayList) {
        this.e = contactsFragment;
        super(contactsFragment, context, arrayList);
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    public int getPositionForSection(int i) {
        return (this.g == null || i >= this.g.size() || i < 0) ? -1 : ((Integer) this.g.get(i)).intValue();
    }

    private void a() {
        int i = App.az;
        this.f = new ArrayList();
        this.g = new ArrayList();
        int size = this.a.size();
        int i2 = 0;
        String str = "";
        while (i2 < size) {
            Object a = ((m8) this.a.get(i2)).a(getContext());
            if (!TextUtils.isEmpty(a)) {
                String toUpperCase = a.substring(0, 1).toUpperCase();
                if (Character.isDigit(toUpperCase.charAt(0)) || toUpperCase.charAt(0) == '+') {
                    toUpperCase = "#";
                }
                if (!str.equals(toUpperCase)) {
                    this.f.add(toUpperCase);
                    this.g.add(Integer.valueOf(i2));
                    str = toUpperCase;
                }
            }
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }
}
