package com.whatsapp;

import android.widget.Filter;
import android.widget.Filter.FilterResults;

class kb extends Filter {
    final ts a;

    private kb(ts tsVar) {
        this.a = tsVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void publishResults(java.lang.CharSequence r3, android.widget.Filter.FilterResults r4) {
        /*
        r2_this = this;
        if (r3 == 0) goto L_0x0008;
    L_0x0002:
        r0 = r3.length();
        if (r0 != 0) goto L_0x0014;
    L_0x0008:
        r0 = r2.a;
        r0 = r0.a;
        r1 = 0;
        com.whatsapp.ContactPicker.b(r0, r1);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x001f;
    L_0x0014:
        r0 = r2.a;
        r0 = r0.a;
        r1 = r3.toString();
        com.whatsapp.ContactPicker.b(r0, r1);
    L_0x001f:
        r0 = r2.a;
        r0.notifyDataSetChanged();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kb.publishResults(java.lang.CharSequence, android.widget.Filter$FilterResults):void");
    }

    kb(ts tsVar, r9 r9Var) {
        this(tsVar);
    }

    protected FilterResults performFiltering(CharSequence charSequence) {
        return new FilterResults();
    }
}
