package com.whatsapp;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.ArrayList;
import java.util.ListIterator;

class rm extends Filter {
    final __ a;

    protected FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        int i = App.az;
        FilterResults filterResults = new FilterResults();
        if (charSequence.length() > 0) {
            ArrayList b = v.b();
            String toLowerCase = charSequence.toString().toLowerCase();
            ListIterator listIterator = b.listIterator();
            while (listIterator.hasNext()) {
                m8 b2 = v.b((String) listIterator.next());
                if ((b2.h == null && !b2.w() && !b2.l()) || ((b2.w() && b2.b()) || !b2.c(toLowerCase))) {
                    listIterator.remove();
                    continue;
                }
                if (i != 0) {
                    break;
                }
            }
            if (i == 0) {
                arrayList = b;
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
                return filterResults;
            }
        }
        arrayList = this.a.c.a();
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    private rm(__ __) {
        this.a = __;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void publishResults(java.lang.CharSequence r7, android.widget.Filter.FilterResults r8) {
        /*
        r6_this = this;
        r5 = 2131427735; // 0x7f0b0197 float:1.8477095E38 double:1.0530652205E-314;
        r4 = 8;
        r0 = com.whatsapp.App.az;
        r1 = r6.a;
        r1 = r1.c;
        r1 = r1.getView();
        if (r1 == 0) goto L_0x005b;
    L_0x0011:
        r2 = r8.count;
        if (r2 != 0) goto L_0x0054;
    L_0x0015:
        r2 = r7.length();
        if (r2 <= 0) goto L_0x0044;
    L_0x001b:
        r2 = r1.findViewById(r5);
        r3 = 0;
        r2.setVisibility(r3);
        r3 = r6.a;
        r3 = r3.c;
        r3 = com.whatsapp.ConversationsFragment.c(r3);
        r3.setEmptyView(r2);
        r2 = 2131427739; // 0x7f0b019b float:1.8477103E38 double:1.0530652224E-314;
        r2 = r1.findViewById(r2);
        r2.setVisibility(r4);
        r2 = 2131427738; // 0x7f0b019a float:1.84771E38 double:1.053065222E-314;
        r2 = r1.findViewById(r2);
        r2.setVisibility(r4);
        if (r0 == 0) goto L_0x005b;
    L_0x0044:
        r2 = r1.findViewById(r5);
        r2.setVisibility(r4);
        r2 = r6.a;
        r2 = r2.c;
        com.whatsapp.ConversationsFragment.b(r2);
        if (r0 == 0) goto L_0x005b;
    L_0x0054:
        r0 = r1.findViewById(r5);
        r0.setVisibility(r4);
    L_0x005b:
        r0 = r6.a;
        r1 = r0.c;
        r0 = r8.values;
        r0 = (java.util.ArrayList) r0;
        com.whatsapp.ConversationsFragment.a(r1, r0);
        r0 = r6.a;
        r0 = r0.c;
        r0 = com.whatsapp.ConversationsFragment.i(r0);
        if (r0 != 0) goto L_0x007f;
    L_0x0070:
        r0 = r6.a;
        r0 = r0.c;
        r1 = r6.a;
        r1 = r1.c;
        r1 = r1.a();
        com.whatsapp.ConversationsFragment.a(r0, r1);
    L_0x007f:
        r0 = r6.a;
        r1 = r7.toString();
        com.whatsapp.__.a(r0, r1);
        r0 = r6.a;
        r0.notifyDataSetChanged();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.rm.publishResults(java.lang.CharSequence, android.widget.Filter$FilterResults):void");
    }

    rm(__ __, a5t com_whatsapp_a5t) {
        this(__);
    }
}
