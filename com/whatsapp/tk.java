package com.whatsapp;

import android.content.Context;
import android.text.TextUtils;
import android.widget.SectionIndexer;
import java.util.ArrayList;

class tk extends ts implements SectionIndexer {
    private ArrayList e;
    private ArrayList f;
    final ContactPicker g;

    private void a() {
        int i = App.az;
        this.e = new ArrayList();
        this.f = new ArrayList();
        int size = this.d.size();
        int i2 = 0;
        String str = "";
        while (i2 < size) {
            Object a = ((m8) this.d.get(i2)).a(this.g);
            if (!TextUtils.isEmpty(a)) {
                String toUpperCase = a.substring(0, 1).toUpperCase();
                if (Character.isDigit(toUpperCase.charAt(0)) || toUpperCase.charAt(0) == '+') {
                    toUpperCase = "#";
                }
                if (!str.equals(toUpperCase)) {
                    this.e.add(toUpperCase);
                    this.f.add(Integer.valueOf(i2));
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

    public tk(ContactPicker contactPicker, Context context, ArrayList arrayList) {
        this.g = contactPicker;
        super(contactPicker, context, arrayList);
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    public int getSectionForPosition(int i) {
        int i2 = App.az;
        if (i < 0) {
            return 0;
        }
        if (i >= this.d.size()) {
            return this.e.size() - 1;
        }
        int size = this.f.size() - 1;
        while (size >= 0) {
            if (((Integer) this.f.get(size)).intValue() > i) {
                size--;
                if (i2 != 0) {
                    break;
                }
            }
            return size;
        }
        return 0;
    }

    public Object[] getSections() {
        return this.e.toArray(new String[1]);
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        a();
    }

    public int getPositionForSection(int i) {
        return (this.f == null || i >= this.f.size() || i < 0) ? -1 : ((Integer) this.f.get(i)).intValue();
    }
}
